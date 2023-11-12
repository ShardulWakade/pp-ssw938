#include "SpawnChild.h"

void onAbruptChildExit(int){
	std::cerr << "ERROR : Child process ended unexpectedly. Exiting now" << std::endl;
	exit(1);
}

DoublePipe createChild(){
	int fdParentIn[2];
	int fdParentOut[2];
	
	pipe(fdParentIn);
	pipe(fdParentOut);
	
	pid_t pid = fork();
	
	if(pid == 0){	// In child
		dup2(fdParentIn[1], 1);	// The input of parent is output of child
		close(fdParentIn[0]);
		
		dup2(fdParentOut[0], 0); // The output of parent is the input of child
		close(fdParentOut[1]);
	
		execl("./Adapt", "./Adapt", NULL);
		
		// Here means error
		std::cout << "ERROR FROM CHILD" << std::endl;
		exit(1);
	}

	close(fdParentIn[1]);
	close(fdParentOut[0]);

	return DoublePipe{fdParentIn[0], fdParentOut[1], pid};
	
}

void killChild(DoublePipe toClose)
{
    kill(toClose.childPid, SIGTERM);
    close(toClose.fdParentIn);
    close(toClose.fdParentOut);
}
