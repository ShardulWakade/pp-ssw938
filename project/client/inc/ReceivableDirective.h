/*
*   A receivable directive is a directive that must talk to the server in order to accomplish its task.
*   For this, helper structures are provided
*/

#pragma once

#include <chrono>

#include "Directive.h"
#include "SharedState.h"

// Represents a Receiver that can recieve all types of messages.
class Receivable {
public:
    inline bool receiveAndProcessMessage() { return processMessage(shared::adapt->receiveMessage() ); }
    bool processMessage(const Message& message );

public:
    // The bool is interpretation specific but it specifies if there was no internal error (like connection lost).
    // So if server disconnects midway, then it should return false, but otherwise true.
    virtual bool onResponseMessage(const Message& messageReceived ) = 0;
    virtual bool onCachedMessage(const Message& messageReceived ) = 0;
    virtual bool onSuccessMessage(const Message& messageReceived ) = 0;
    virtual bool onErrorMessage(const Message& messageReceived ) = 0;
    virtual bool onLoginErrorMessage(const Message& messageReceived ) = 0;
    virtual bool onConnectionErrorMessage(const Message& messageReceived ) = 0;

    virtual bool onUnexpectedMessage(const Message& messageReceived ) = 0;

    virtual ~Receivable(){}
};

// Gives default functionality to all Receivables by printing apt error messages.
class ReceivableDirective : public Directive, public Receivable {
public:
    ReceivableDirective(const std::string& name) : Directive(name), Receivable() {}

    virtual bool onResponseMessage(const Message& messageReceived ) override    { return onUnexpectedMessage(messageReceived); }       
    virtual bool onCachedMessage(const Message& messageReceived ) override      { return onUnexpectedMessage(messageReceived); }       
    virtual bool onSuccessMessage(const Message& messageReceived ) override     { return onUnexpectedMessage(messageReceived); }       
    virtual bool onErrorMessage(const Message& messageReceived ) override       { return onUnexpectedMessage(messageReceived); }       

    virtual bool onLoginErrorMessage(const Message& messageReceived ) override;     // Says that user need to login
    virtual bool onConnectionErrorMessage(const Message& messageReceived ) override;// Displays connection error.

    virtual bool onUnexpectedMessage(const Message& messageReceived ) override;     // Unexpected response from child

 };

// A run directive will take the current set of lines, pass them to the parser, then if successful, will issue a SEND message to the child.
// In response, run should receive either CONNECTION_ERROR, RESPONSE, ERROR, or LOGIN_ERROR
// Anytime a connection error or unexpected error is recieved, run should not clear the user lines.
// In the case of a Login error, error, or response, the user lines should be cleared.
class RunDirective : public ReceivableDirective {
public:
    virtual bool onResponseMessage(const Message& messageReceived ) override final;
    virtual bool onCachedMessage(const Message& messageReceived ) override final;
    virtual bool onErrorMessage(const Message& messageReceived ) override final;

public:
    using ReceivableDirective::ReceivableDirective; // Inherits all constructors
    
    virtual void execute(content& lines) override final;
};

// This will only send to the server and not to the parser.
// Expected responses are same as RunDirective
class ForcesendDirective : public ReceivableDirective {
public:
    virtual bool onResponseMessage(const Message& messageReceived ) override final;
    virtual bool onCachedMessage(const Message& messageReceived ) override final;
    virtual bool onErrorMessage(const Message& messageReceived ) override final;

public:
    using ReceivableDirective::ReceivableDirective; // Inherits all constructors

    virtual void execute(content& lines) override final;
};

// This will send a CLEAR_CACHE command to the Child.
// Expected responses are SUCCESS only.
class ClearcacheDirective : public ReceivableDirective {
public:
    virtual bool onSuccessMessage(const Message& messageReceived ) override;

    // Both of these need to call unexpected as we don't expect these responses anymore.
    virtual bool onLoginErrorMessage(const Message& messageReceived ) override      { return onUnexpectedMessage(messageReceived); }   
    virtual bool onConnectionErrorMessage(const Message& messageReceived ) override { return onUnexpectedMessage(messageReceived); }
public:
    using ReceivableDirective::ReceivableDirective; // Inherits all constructors

    virtual void execute(content& lines) override final;
};

// This will send a PING to the server and then measure the amount of time it takes to reciving the response back.
// Expected responses are CONNECTION_ERROR, SUCCESS
class PingDirective : public ReceivableDirective {
private:
    decltype(std::chrono::high_resolution_clock::now()) sendTime;
public:
    virtual bool onSuccessMessage(const Message& messageReceived ) override;

    // Unexpected login error message.
    virtual bool onLoginErrorMessage(const Message& messageReceived ) override { return onUnexpectedMessage(messageReceived); }     
public:
    using ReceivableDirective::ReceivableDirective; // Inherits all constructors

    virtual void execute(content& lines) override final;
};

// This will send a SHUTDOWN to the server. Expected responses are Connection error or Response.
class ShutdownDirective : public ReceivableDirective {
public:
    virtual bool onResponseMessage(const Message& messageReceived ) override;

    // Unexpected login error message.
    virtual bool onLoginErrorMessage(const Message& messageReceived ) override { return onUnexpectedMessage(messageReceived); }     
public:
    using ReceivableDirective::ReceivableDirective; // Inherits all constructors

    virtual void execute(content& lines) override final;
};

// This will send a LOG_OFF directive to the server. Expected responses are Connection_error, response or Login error.
class LogoffDirective : public ReceivableDirective {
public:
    virtual bool onSuccessMessage(const Message& messageReceived ) override;
    virtual bool onLoginErrorMessage(const Message& messageReceived ) override ;    
public:
    using ReceivableDirective::ReceivableDirective; // Inherits all constructors

    virtual void execute(content& lines) override final;
};

// This will send a GET_LOGIN directive to the server. Expected responses are Connection_error, response or Login error.
class UserDirective : public ReceivableDirective {
public:
    virtual bool onResponseMessage(const Message& messageReceived) override;

    // On LoginError we must display that no user is currently logged in.
    virtual bool onLoginErrorMessage(const Message& messageReceived) override;
public:
    using ReceivableDirective::ReceivableDirective; // Inherits all constructors

    virtual void execute(content& lines) override final;
};

// This will ask the user for username and password and then send a LOGIN message to the server.
class LoginDirective : public ReceivableDirective {
public:
    virtual bool onSuccessMessage(const Message& messageReceived) override final;
    virtual bool onLoginErrorMessage(const Message& messageReceived) override final;
public:
    using ReceivableDirective::ReceivableDirective; // Inherits all constructors

    virtual void execute(content& lines) override final;
};

