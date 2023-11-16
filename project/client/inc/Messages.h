/*
*   The primary interface to send messages between Client and Adapt.
*/

#pragma once

#include <string>
#include <vector>
#include <unordered_map>
#include <functional>

#include "Types.h"
#include "SpawnChild.h"

class Message {
public:
    std::string type;
    content msgContent;

    // Only constructible as a copy. To construct new, must use factory pattern.
    Message() = delete;
    
public:
    static const Message& ConstructPing() { return ping; }
    static const Message& ConstructGetLogin() { return getLogin; }
    static const Message& ConstructShutdown() { return shutdown; }
    static const Message& ConstructClearCache() { return clearCache; }
    
    static Message ConstructSend(const std::string& command) { return Message("SEND", {command}); }
    static Message ConstructLogoff(const std::string& username) { return Message("LOGOFF", {username}); }
    static Message ConstructLogin(const std::string& username, const std::string& password) { return Message("LOGIN", {username, password}); }

    // Helper functions
    friend std::ostream& operator<<(std::ostream& out, const Message& msg);
    static Message ConstructFromInputStream(std::istream& in);

private:
    Message(const std::string&& l_type, const content&& l_content)
        : type(std::move(l_type)), msgContent(std::move(l_content)) {
    }

private:
    // Since these messages have 0 content, we can reuse the same object.
    static const Message ping;
    static const Message getLogin;
    static const Message shutdown;
    static const Message clearCache;
};

using messageProcessor = std::function<void(const Message&, std::vector<std::string>&)>;

/*
*   An object of this class represents a connection to Adapt.exe - This class will provide functionality for sending messages between the two processes.
*/
class AdaptConnection {
private:
    __gnu_cxx::stdio_filebuf<char> inbuf;
    std::istream fromChild;

    __gnu_cxx::stdio_filebuf<char> outbuf;
    std::ostream toChild;
public:
    AdaptConnection(DoublePipe pipe);
    void sendMessage(const Message& msg);
    Message receiveMessage();
    void exit();
};


