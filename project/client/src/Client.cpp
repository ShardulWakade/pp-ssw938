#include "lp.h"
#include <iostream>
#include <vector>
#include <string>

void printFancyHeader(){
    std::cout << "+-----------------------+" << std::endl;
    std::cout << "|      CLIENT PROG      |" << std::endl;
    std::cout << "+-----------------------+\n" << std::endl;
}

void printFancyExit(){
    std::cout << "\n+-----------------------+" << std::endl;
    std::cout <<   "|       THANK YOU       |" << std::endl;
    std::cout <<   "+-----------------------+" << std::endl;
}

void printInstructions(){
    std::cout << "Enter a command and then type @run to send commands to the lexer/parser" << std::endl;
    std::cout << "Enter @quit to quit the program." << std::endl;
}

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

std::vector<LexParseError> runCommand(const std::vector<std::string>& lines){
    // Append all lines into a single string. Then send to parser

    std::string command;
    for(const auto& str : lines){
        command += str;
        command += '\n';
    }

    std::cout << "\nSending this command to the parser\n";
    return checkLexParse(command.c_str());
}

void printAptErrorMessage(const std::vector<std::string>& lines, const std::vector<LexParseError>& errors){
    std::cout << "\nThe following errors were found\n" << std::endl;
    for(const auto& err : errors){
        std::cout << "Error on line " << err.line << "\n\t" << lines[err.line-1] << "\n\t";
        
        std::string spaces(err.charPositionInLine, ' ');

        std::cout << spaces << '^' << std::endl;
        std::cout << spaces << err.msg << std::endl;
    }
}

int main(){
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
                std::vector<LexParseError> errors = runCommand(lines);
                if(errors.empty()){
                    std::cout << "No errors were found in the message!" << std::endl;
                } 
                else {
                    printAptErrorMessage(lines, errors);
                }
            }
        }

        lines.clear();
        std::cout << ">>> ";
    }

    printFancyExit();

}