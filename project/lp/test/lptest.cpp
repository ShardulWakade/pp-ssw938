#include <iostream>

#include "../src/main/lp.h"

int main(){
    const char* tester = "Hello World ; ";
    
    std::cout << "Testing with Hello World" << std::endl;
    std::vector<LexParseError> errors = checkLexParse(tester);
    std::cout << "Number of errors detected = " << errors.size() << std::endl ;
    
    for(auto error : errors){
        std::cout << "ERROR on line " << error.line << ":" << error.charPositionInLine << "\n\t" << error.msg << std::endl;
    }
}

