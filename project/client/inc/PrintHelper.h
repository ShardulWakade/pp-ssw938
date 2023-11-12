/*
*   Contains utilities to help out in printing
*/

#pragma once

#include "lp.h"
#include <iostream>
#include <vector>
#include <string>


void printFancyHeader();
void printFancyExit();
void printInstructions();
void printAptErrorMessage(const std::vector<std::string>& lines, const std::vector<LexParseError>& errors);
