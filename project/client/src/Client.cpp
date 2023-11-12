#include "lp.h"
#include <iostream>
#include <vector>
#include <string>
#include "PrintHelper.h"
#include "SpawnChild.h"
#include <cassert>

// true means not EOF. false means EOF
bool addLinesInto(std::vector<std::string>& lines, std::istream& in){
    std::string line;
    while(std::getline(in, line)){
        if(line.empty()){
            // Discard and move to next line
            continue;    
        }
        
        lines.push_back(line); 
        if(line[0] == '@'){  // This means it is a command, so lets return back to our caller.
            return true;
        }

        std::cout << "... ";
    }
    return false;
}

std::string joinWith(const std::vector<std::string>& lines, char join){
    std::string command;
    for(const auto& str : lines){
        command += str;
        command += join;
    }
    return command;
}

bool runCommand(const std::vector<std::string>& lines, std::ostream& toChild){
    // Append all lines into a single string. Then send to parser

    std::string command = joinWith(lines, '\n');

    auto errors = checkLexParse(command.c_str());

    if(errors.empty()){
        std::string singleLinedCommand = joinWith(lines, ' ');
        std::cout << "Sending to server" << std::endl;
        toChild << "COMMAND" << std::endl;
        toChild << singleLinedCommand << std::endl;
        return true;
    } 
    else {
        printAptErrorMessage(lines, errors);
        return false;
    }
}

struct ChildResponse {
    std::string responseType;
    size_t responseLength;
    std::vector<std::string> responseLines;

    friend std::ostream& operator<<(std::ostream& out, const ChildResponse& resp){
        out << "ChildResponse[responseType=" << resp.responseType << ", responseLength=" << resp.responseLength << ", responseLines={";
        for(const auto& line : resp.responseLines){
            out << "\n\t" << line;
        }        
        return out << "\n}";
    }
};

ChildResponse expectResponse(std::istream& fromChild){
    ChildResponse resp;
    
    if(!std::getline(fromChild, resp.responseType)){assert(false);}
    
    assert(fromChild >> resp.responseLength);
    std::string throwaway;
    if(!std::getline(fromChild, throwaway)){assert(false);}
    
    resp.responseLines.reserve(resp.responseLength);

    std::string childLine;
    for(size_t i = 0; i < resp.responseLength; i++){
        std::getline(fromChild, childLine);
        resp.responseLines.push_back(childLine);
    }

    return resp;
}

int main(){

    // Spawn child process
    auto parentChildPipes = createChild();
	
	__gnu_cxx::stdio_filebuf<char> inbuf(parentChildPipes.fdParentIn, std::ios::in);
	std::istream fromChild(&inbuf);
	
	__gnu_cxx::stdio_filebuf<char> outbuf(parentChildPipes.fdParentOut, std::ios::out);
	std::ostream toChild(&outbuf);
	
	signal(SIGCHLD, onAbruptChildExit);

    // Begin accepting queries
    printFancyHeader();
    printInstructions();

    std::vector<std::string> lines;
    
    std::cout << ">>> ";

    while(addLinesInto(lines, std::cin)){
        // If we are here then this means either @run or @quit was called
        std::string lastCommand = lines.back(); lines.pop_back();

        if(lastCommand == "@quit"){
            break;
        } 
        else if (lastCommand == "@run"){
            if(lines.empty()){
                std::cout << "Empty command : nothing to send." << std::endl;
            }
            else {
                if(runCommand(lines, toChild)){ // If command was succesful, expect a response
                    ChildResponse resp = expectResponse(fromChild);
                    std::cout << "Received Response : " << resp << std::endl;
                }
            }
        }

        lines.clear();
        std::cout << ">>> ";
    }

    killChild(parentChildPipes);
    printFancyExit();

}