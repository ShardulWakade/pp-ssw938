#!/usr/bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
LIB_DIR=$SCRIPT_DIR"/lib"

echo -e "Starting Compilation\n"

if ! test -f lib/libantlr4-runtime.so; then
    echo "Since libantlr4-runtime.so wasn't found, we will now compile it manually"
    echo "Starting Compilation for libantlr4-runtime.so (This takes about 4 minutes to build.)"
    
    cd inc
    ./build.sh
    cd ..

    echo "Linking all compiled files into lib/libantlr4-runtime.so"

    c++ -shared inc/atn/*.o inc/dfa/*.o inc/internal/*.o inc/misc/*.o inc/support/*.o inc/tree/*.o inc/tree/pattern/*.o inc/tree/xpath/*.o inc/*.o  -o lib/libantlr4-runtime.so
    
    if [ $? -ne 0 ]; then
        echo "Unable to compile libantlr4-runtime.so, Please contact me at shardulwakade2003@gmail.com"
        exit 1
    fi
fi

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
echo "-----------------------------------------------------"
test/lptest
echo "-----------------------------------------------------"
exit 0