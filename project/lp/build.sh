#!/usr/bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
LIB_DIR=$SCRIPT_DIR"/lib"

echo -e "Starting Compilation\n"

make test/lptest

if [ $? -ne 0 ]; then 
    echo -e "\nBuild failed. Contact me at shardulwakade2003@gmail.com"
    exit 1
fi

echo -e "\nCompiling done. Now setting LD_LIBRARY_PATH"

if [ -z "$LD_LIBRARY_PATH" ]; then
    export LD_LIBRARY_PATH=$LIB_DIR
else
    export LD_LIBRARY_PATH=$LD_LIBRARY_PATH":"$LIB_DIR
fi

if [ $? -ne 0 ]; then
    echo -e "\nFailed to set LD_LIBRARY_PATH"
    exit 1
fi

echo -e "\nNow calling the test program to test my libsp.so (Contains lexer and parser)\n"

test/lptest

exit 0