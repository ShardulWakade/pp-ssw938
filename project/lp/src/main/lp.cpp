
#include "lp.h"

#include <iostream>

#include "antlr4-runtime.h"
#include "CypherLexer.h"
#include "CypherParser.h"
 
using namespace antlr4;

extern "C" int checkLexParse(const char* message){
    ANTLRInputStream instream(message);
    
    CypherLexer lexer(&instream);
    lexer.removeErrorListeners();

    CommonTokenStream tokens(&lexer);
    
    tokens.fill();

    CypherParser parser(&tokens);
    parser.removeErrorListeners();

    tree::ParseTree* tree = parser.oC_Cypher();

    return 0;
}

