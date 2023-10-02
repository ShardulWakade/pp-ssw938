#include <iostream>

#include "../src/main/lp.h"

int main(){
    const char* tester = "Hello World";
    std::cout << "Testing with String " << tester << std::endl;
    int ret = checkLexParse("Hello World");
    std::cout << "Done test " << ret << std::endl;
}

