#include "Directive.h"
#include "lp.h"
#include "PrintHelper.h"
#include "SharedState.h"
#include "Messages.h"

void ClearDirective::execute(content& lines) {
    std::cout << "Clearing previous commands..." << std::endl;
    lines.clear();
}

void QuitDirective::execute(content& lines) {
    shared::isRunning = false;
}

void ParseDirective::execute(content& lines) {

    std::string command = joinWith(lines, '\n');
    auto errors = checkLexParse(command.c_str());

    if(errors.empty()) {
        std::cout << "No parsing errors were found!" << std::endl;
    } else {
        print::AptErrorMessage(lines, errors);
    }
}

