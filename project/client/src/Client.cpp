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
    std::cout << "Enter a command and then enter a blank newline to send that command to parser" << std::endl;
}

int main(){
    printFancyHeader();
    printInstructions();

    std::vector<std::string> lines;
    std::string line;
    
    std::cout << "> ";

    while(std::getline(std::cin, line)){
        if(line.empty()){
            break; // Send to the parser!
        }
        
        lines.push_back(line);
        std::cout << "...\t";
    }

    if(lines.empty()){
        std::cout << "Nothing to send to the parser!" << std::endl;
    } 
    else {
        std::string command;
        for(const auto& str : lines){
            command += str;
            command += "\n\t";
        }
        std::cout << "Sending the following command to the parser : \n" << command << std::endl;
        
        std::vector<LexParseError> errors = checkLexParse(command.c_str());
        if(errors.empty()){
            std::cout << "No errors!" << std::endl;
        }
        else {
            std::cout << "Errors found : " << std::endl;
            for(const auto& err : errors){
                std::cout << err.line << ":" << err.charPositionInLine << "\t\n" << err.msg << std::endl;
            }
        }
    }

    printFancyExit();

}