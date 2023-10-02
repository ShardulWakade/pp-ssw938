
#ifndef LP_H
#define LP_H

#include <vector>
#include <string>

struct LexParseError {
    size_t line;
    size_t charPositionInLine;
    std::string msg;

    LexParseError(size_t l_line, size_t l_charPositionInLine, const std::string& l_msg) 
        : line(l_line), charPositionInLine(l_charPositionInLine), msg(l_msg){}
};

std::vector<LexParseError> checkLexParse(const char* message);

#endif // LP_H
