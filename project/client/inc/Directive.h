/*
*   A Directive represents an instruction to the Client itself like @help or @run
*   A directive will take in the current typed instructions and will be able to modify it.
*   A directive may pass messages to Adapt and receive messages in order to talk with the server
*  
*/

#pragma once

#include <vector>
#include <string>
#include <unordered_map>
#include "Messages.h"
#include "Types.h"

class Directive {
private:
    const std::string directiveName;    // For debugging purposes

protected:
    const std::string& name() const { return directiveName; } // For debugging purposes

public:
    Directive(const std::string& dirName) : directiveName(dirName) {}

    virtual void execute(content&) = 0;
    virtual ~Directive(){}

};

// This will simply empty out our lines
class ClearDirective : public Directive {
public:
    using Directive::Directive; // Inherits all constructors

    virtual void execute(content& lines) override final;
};

// This will simple mark the program as done by updating a shared state.
class QuitDirective : public Directive {
public:
    using Directive::Directive; // Inherits all constructors

    virtual void execute(content& lines) override final;
};

// A Parse directive will only send the query to the parser and not to the child. Therefore this is not a recivable directive
class ParseDirective : public Directive {
public:
    using Directive::Directive; // Inherits all constructors

    virtual void execute(content& lines) override final;
};