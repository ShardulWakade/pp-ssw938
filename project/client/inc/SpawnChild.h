
#pragma once

#include <cstdlib>
#include <iostream>
#include <fstream>
#include <unistd.h>
#include <ext/stdio_filebuf.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <signal.h>

struct DoublePipe {
	int fdParentIn;
	int fdParentOut;
	pid_t childPid;
};

void onAbruptChildExit(int);

DoublePipe createChild();

void killChild(DoublePipe toClose);

void waitForChildDeath(DoublePipe child);
