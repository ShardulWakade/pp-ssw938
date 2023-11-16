
#include "Messages.h"
#include <cassert>
#include <iostream>

const Message Message::ping("PING", {});
const Message Message::getLogin("GET_LOGIN", {});
const Message Message::shutdown("SHUTDOWN", {});
const Message Message::clearCache("CLEAR_CACHE", {});

std::ostream& operator<<(std::ostream& out, const Message& msg){
    out << msg.type << std::endl;
    out << msg.msgContent.size() << std::endl;
    for(const auto& str : msg.msgContent){
        out << str << std::endl;
    }    
    return out;
}

Message Message::ConstructFromInputStream(std::istream& in){
    std::string type;
    if(!std::getline(in, type)){ assert(false); }
    
    int len;
    assert(in >> len);
    std::string throwaway;
    if(!std::getline(in, throwaway)){ assert(false); }

    content c;
    c.reserve(len);

    std::string line;
    for(size_t i = 0; i < len; i++){
        if(!std::getline(in, line)) { assert(false); }
        c.push_back(line);
    }

    return Message(std::move(type), std::move(c));
}

AdaptConnection::AdaptConnection(DoublePipe pipe)
    :   inbuf(pipe.fdParentIn, std::ios::in), fromChild(&inbuf),
        outbuf(pipe.fdParentOut, std::ios::out), toChild(&outbuf)
{
}


void AdaptConnection::sendMessage(const Message& msg){
    toChild << msg;
}

Message AdaptConnection::receiveMessage() {
    return Message::ConstructFromInputStream(fromChild);
}

void AdaptConnection::exit() {
    toChild << "EXIT" << std::endl;
}

