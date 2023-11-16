#include <assert.h>
#include <unordered_map>
#include <iostream>
#include <vector>
#include <string>

#include "lp.h"
#include "PrintHelper.h"
#include "SpawnChild.h"
#include "SharedState.h"
#include "ReceivableDirective.h"

static const std::unordered_map<std::string, Directive*> directives = {
    {"@run",            new RunDirective("@run")},
    {"@parse",          new ParseDirective("@parse")},
    {"@forcesend",      new ForcesendDirective("@forcesend")},
    {"@clearcache",     new ClearcacheDirective("@clearcache")},
    {"@ping",           new PingDirective("@ping")},
    {"@clear",          new ClearDirective("@clear")},
    {"@quit",           new QuitDirective("@quit")},
    {"@shutdown",       new ShutdownDirective("@shutdown")},
    {"@logoff",         new LogoffDirective("@logoff")},
    {"@user",           new UserDirective("@user")},
    {"@login",          new LoginDirective("@login")}
};

// returns when a directive/EOF is encountered.
// true means directive. false means EOF
bool addLinesInto(std::vector<std::string>& lines, std::istream& in);
void executeInitialUser(void);
void freeDirectives(void);
void helpCommand(void); // Displays help for all commands

int main(){

    // Spawn child process
    auto parentChildPipes = createChild();
    AdaptConnection connection(parentChildPipes);   // The name of the child program is Adapt.exe . I regret this naming but its too late
    shared::adapt = &connection;    
   	signal(SIGCHLD, onAbruptChildExit);

    print::FancyHeader();
    print::Instructions();

    shared::isRunning = true;

    executeInitialUser();

    std::cout << ">>> ";

    std::vector<std::string> lines;
    while(addLinesInto(lines, std::cin)){
        // If we are here then this means that a directive was called
        std::string lastCommand = lines.back(); lines.pop_back();
        
        if(lastCommand == "@help"){
            helpCommand();
        }
        else {
            const auto& d_itr = directives.find(lastCommand);
            if (d_itr == directives.end()) {
                std::cout << "No such directive : " << lastCommand << std::endl;
                std::cout << "Previous command has been maintained" << std::endl;
            }
            else {
                Directive& directive = *(d_itr->second);
                directive.execute(lines);

                if(!shared::isRunning){
                    break;
                }
            }
        }

        if(!lines.empty()){
            std::cout << "\nYour command look currently like this:" << std::endl;
            for(int i = 0; i < lines.size(); i++) {
                std::cout << "line " << (i+1) << ") " << lines[i] << std::endl;
            }
            std::cout << "Use @clear to clear" << std::endl;
        }
        std::cout << "\n>>> ";
    }

    signal(SIGCHLD, SIG_DFL);
    shared::adapt->exit();
    waitForChildDeath(parentChildPipes);
    print::FancyExit();

    freeDirectives();
}

void executeInitialUser(){
    const auto& d_itr = directives.find("@user");
    assert(d_itr != directives.end());
    
    content temp;
    d_itr->second->execute(temp);
}

// returns when a directive/EOF is encountered.
// true means directive. false means EOF
bool addLinesInto(std::vector<std::string>& lines, std::istream& in){
    std::string line;
    while(std::getline(in, line)){
        if(line.empty()){
            // Discard and move to next line
            continue;    
        }
        
        lines.push_back(line); 
        if(line[0] == '@'){  // This means it is a command, so lets return back to our caller.
            return true;
        }

        std::cout << "... ";
    }
    return false;
}

void freeDirectives(void){
    for(const auto& dirPair : directives){
        delete dirPair.second;
    }
}

void helpCommand(){
    std::cout << "These are all the directives you can use : " << std::endl;
    for(const auto& pr : directives){
        std::cout << pr.first << "\n";
    }
    std::cout << std::endl;
}
