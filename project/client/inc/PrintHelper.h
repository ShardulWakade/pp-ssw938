/*
*   Contains utilities to help out in printing
*/

#pragma once

#include <iostream>
#include <vector>
#include <string>

#include "lp.h"
#include "Types.h"

static inline std::string joinWith(const std::vector<std::string>& lines, char join){
    std::string command;
    for(const auto& str : lines){
        command += str;
        command += join;
    }
    return command;
}

namespace print {
    void FancyHeader();
    void FancyExit();
    void Instructions();
    void AptErrorMessage(const std::vector<std::string>& lines, const std::vector<LexParseError>& errors);
    void Tabbed(const content& msgContent);
}