
#include "lp.h"

#include <iostream>

#include "antlr4-runtime.h"
#include "CypherLexer.h"
#include "CypherParser.h"
 
using namespace antlr4;

class MyErrorListener : public BaseErrorListener {
private:
    std::vector<LexParseError>& m_toFill;
public:

    MyErrorListener(std::vector<LexParseError>& l_toFill) : m_toFill(l_toFill) {}

    virtual void syntaxError(Recognizer *recognizer, Token * offendingSymbol, size_t line, size_t charPositionInLine,
        const std::string &msg, std::exception_ptr e) override {
        m_toFill.emplace_back(line, charPositionInLine, msg);
    }
};

std::vector<LexParseError> checkLexParse(const char* message){
    std::vector<LexParseError> errors;
    MyErrorListener mel(errors);

    ANTLRInputStream instream(message);
    
    CypherLexer lexer(&instream);
    lexer.removeErrorListeners();
    lexer.addErrorListener(&mel);

    CommonTokenStream tokens(&lexer);
    
    tokens.fill();

    CypherParser parser(&tokens);
    parser.removeErrorListeners();
    parser.addErrorListener(&mel);

    tree::ParseTree* tree = parser.oC_Cypher();

    return errors;
}

