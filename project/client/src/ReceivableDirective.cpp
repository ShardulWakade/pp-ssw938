#include <functional>
#include <chrono>

#include "ReceivableDirective.h"
#include "PrintHelper.h"

// Similar to double dispatch design pattern, though not quite the exact same

static bool callResponse        (Receivable* r, const Message& message)  { return r->onResponseMessage(message); }
static bool callCached          (Receivable* r, const Message& message)  { return r->onCachedMessage(message); }
static bool callConnectionError (Receivable* r, const Message& message)  { return r->onConnectionErrorMessage(message); }
static bool callError           (Receivable* r, const Message& message)  { return r->onErrorMessage(message); }
static bool callLoginError      (Receivable* r, const Message& message)  { return r->onLoginErrorMessage(message); }
static bool callSuccess         (Receivable* r, const Message& message)  { return r->onSuccessMessage(message); }

using dispatcher = std::function<bool(Receivable*, const Message&)>;
static std::unordered_map<std::string, dispatcher> doubleDisptacher = {
    {"RESPONSE",            callResponse},
    {"CACHED",              callCached},
    {"CONNECTION_ERROR",    callConnectionError},
    {"ERROR",               callError},
    {"LOGIN_ERROR",         callLoginError},
    {"SUCCESS",             callSuccess}
};

static bool clearOnSuccess(bool success, content& commands){
   if(success){ // If message was successful
        commands.clear();
        std::cout << "Your commands have been cleared." << std::endl;
    } else {
        std::cout << "Your commands have been preserved." << std::endl;
    }
    return success;
}

bool Receivable::processMessage(const Message& message) {
    auto itr = doubleDisptacher.find(message.type);
    if(itr != doubleDisptacher.end()){
        return (itr->second)(this, message);
    } 
    else {
        return this->onUnexpectedMessage(message);
    }
}

// Receivable Directive

bool ReceivableDirective::onLoginErrorMessage(const Message& messageReceived) {
    std::cout << "You arent logged in. Please login with @login." << std::endl;
    return false;
}

bool ReceivableDirective::onConnectionErrorMessage(const Message& messageReceived) {
    std::cout << "Unable to connect to the server. Please try again at later time." << std::endl;
    return false;
}

bool ReceivableDirective::onUnexpectedMessage(const Message& messageReceived) {
    std::cout << this->name() << " produced an unexpected response from the server. Please try again" << std::endl;
    std::cerr << "UNEXPECTED MESSAGE : ----------" << std::endl;
    std::cerr << messageReceived << std::endl;
    std::cerr << "------------------" << std::endl;
    return false;
}

// Run directive

// This will first send the query to the parser and then to the server if successful
void RunDirective::execute(content& lines){
    std::string command = joinWith(lines, '\n');
    auto errors = checkLexParse(command.c_str());

    if(errors.empty()) {
        std::cout << "Parse Succesful. Sending to server..." << std::endl;
        shared::adapt->sendMessage(Message::ConstructSend(joinWith(lines, ' ')));
        clearOnSuccess(receiveAndProcessMessage(), lines);
    } else {
        print::AptErrorMessage(lines, errors);
        lines.clear();
        std::cout << "Your command has been cleared." << std::endl;
    }
}

bool RunDirective::onResponseMessage(const Message& messageReceived) {
    std::cout << "Received " << messageReceived.msgContent.size() << " rows in response:" << std::endl;
    print::Tabbed(messageReceived.msgContent);
    std::cout << std::endl;
    return true;
}

bool RunDirective::onCachedMessage(const Message& messageReceived) {
    std::cout << "Extracting from cache" << std::endl;
    this->onResponseMessage(messageReceived);
    return true;
}

bool RunDirective::onErrorMessage(const Message& messageReceived) {
    std::cout << "Unfortunately an error occured : " << std::endl;
    print::Tabbed(messageReceived.msgContent);
    std::cout << std::endl;
    return true;
}

// Force Send directive : Same as Run really

// This will first send the query to the server.
void ForcesendDirective::execute(content& lines){
    std::cout << "Sending to the server..." << std::endl;
    shared::adapt->sendMessage(Message::ConstructSend(joinWith(lines, ' ')));
    clearOnSuccess(receiveAndProcessMessage(), lines);
}

bool ForcesendDirective::onResponseMessage(const Message& messageReceived) {
    std::cout << "Received " << messageReceived.msgContent.size() << " rows in response:" << std::endl;
    print::Tabbed(messageReceived.msgContent);
    std::cout << std::endl;
    return true;
}

bool ForcesendDirective::onCachedMessage(const Message& messageReceived) {
    std::cout << "Extracting from cache" << std::endl;
    this->onResponseMessage(messageReceived );
    return true;
}

bool ForcesendDirective::onErrorMessage(const Message& messageReceived) {
    std::cout << "Unfortunately an error occured : " << std::endl;
    print::Tabbed(messageReceived.msgContent);
    std::cout << std::endl;
    return true;
}

// Clear Cache

void ClearcacheDirective::execute(content& lines) {
    shared::adapt->sendMessage(Message::ConstructClearCache());
    receiveAndProcessMessage();
}

bool ClearcacheDirective::onSuccessMessage(const Message& messageReceived) {
    std::cout << "Cache cleared." << std::endl;
    return true;
}

// Ping

void PingDirective::execute(content& lines) {
    this->sendTime = std::chrono::high_resolution_clock::now();
    shared::adapt->sendMessage(Message::ConstructPing());
    receiveAndProcessMessage();
}

// Assuming execute has already started the timer
bool PingDirective::onSuccessMessage(const Message& messageReceived) {
    auto receiveTime = std::chrono::high_resolution_clock::now();
    auto pingTime = std::chrono::duration_cast<std::chrono::microseconds>(receiveTime - sendTime).count();
    std::cout << "Received a response in " << (pingTime / 1000.0) << " milliseconds" << std::endl;
    return true;
}

// Shutdown

void ShutdownDirective::execute(content& lines) {
    shared::adapt->sendMessage(Message::ConstructShutdown());
    receiveAndProcessMessage();
}

bool ShutdownDirective::onResponseMessage(const Message& messageReceived) {
    std::cout << "Shutdown successful. Logging off..." << std::endl;
    return true;
}

// Logoff

void LogoffDirective::execute(content& lines) {
    std::string line;
    std::cout << "Confirm username to logoff: ";
    if(!std::getline(std::cin, line)){
        std::cout << "Unable to read input..." << std::endl;
    } else {
        shared::adapt->sendMessage(Message::ConstructLogoff(line));
        clearOnSuccess(receiveAndProcessMessage(), lines);
    }
}

bool LogoffDirective::onSuccessMessage(const Message& messageReceived) {
    std::cout << "Logged off from the server." << std::endl;
    return true;
}

bool LogoffDirective::onLoginErrorMessage(const Message &messageReceived)
{
    std::cout << "Error while logging off: \n";
    print::Tabbed(messageReceived.msgContent);
    return false;
}

// User Directive

void UserDirective::execute(content& lines) {
    shared::adapt->sendMessage(Message::ConstructGetLogin());
    receiveAndProcessMessage();
}

bool UserDirective::onResponseMessage(const Message& messageReceived) {
    std::cout << "Logged in as user " << messageReceived.msgContent[0] << std::endl;
    return true;
}

bool UserDirective::onLoginErrorMessage(const Message &messageReceived) {
    std::cout << "Not currently logged in. Log in with @login" << std::endl;
    return true;
}

// Login Directive

void LoginDirective::execute(content& lines) {
    std::cout << "username: ";
    std::string username;
    if(!std::getline(std::cin, username)){
        std::cout << "Unable to read input..." << std::endl;
        return;
    }

    std::string password;
    std::cout << "password: ";
    if(!std::getline(std::cin, password)){
        std::cout << "Unable to read input..." << std::endl;
        return;
    }

    shared::adapt->sendMessage(Message::ConstructLogin(username, password));
    receiveAndProcessMessage();
}

bool LoginDirective::onSuccessMessage(const Message& messageReceived) {
    std::cout << "Logged in succesfuly." << std::endl;
    return true;
}

bool LoginDirective::onLoginErrorMessage(const Message& messageReceived) {
    std::cout << "Couldn't Login due to the following reason : " << std::endl;
    print::Tabbed(messageReceived.msgContent);
    std::cout << std::endl;
    return true;
}
