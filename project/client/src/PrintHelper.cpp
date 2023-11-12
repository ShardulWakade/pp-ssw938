#include "PrintHelper.h"

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

void printAptErrorMessage(const std::vector<std::string>& lines, const std::vector<LexParseError>& errors){
    std::cout << "\nThe following errors were found\n" << std::endl;
    for(const auto& err : errors){
        std::cout << "Error on line " << err.line << "\n\t" << lines[err.line-1] << "\n\t";
        
        std::string spaces(err.charPositionInLine, ' ');

        std::cout << spaces << '^' << std::endl;
        std::cout << spaces << err.msg << std::endl;
    }
}
