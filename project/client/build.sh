#!/usr/bin/bash

## This file will simple call make, then set the appropriate environment variables and then call ./Client with 2 test inputs
## Note that we expect project/lp/build.sh to run before this so that 

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
LIB_DIR=$SCRIPT_DIR"/lib"

if ! test -f ../lp/lib/libantlr4-runtime.so; then 
    echo -e "Could not find lp/lib/libantlr4-runtime.so\nPlease run project/lp/build.sh before running this."
    exit 1
elif ! test -f ../lp/lib/liblp.so; then
    echo -e "Could not find lp/lib/liblp.so\nPlease run project/lp/build.sh before running this."
    exit 1
fi

echo "Starting Compilation of Client"

make 

if [ $? -ne 0 ]; then
    echo "Unable to compile Client program. Please contact me at shardulwakade2003@gmail.com"
    exit 1
fi

./createAdapt.sh

if [ $? -ne 0 ]; then
    echo "Unable to compile Client program. Please contact me at shardulwakade2003@gmail.com"
    exit 1
fi

echo "Compilation Successful. Now setting environment variables"

if [ -z "$LD_LIBRARY_PATH" ]; then
    export LD_LIBRARY_PATH=$LIB_DIR
else
    export LD_LIBRARY_PATH=$LD_LIBRARY_PATH":"$LIB_DIR
fi

if [ $? -ne 0 ]; then
    echo -e "\nFailed to set LD_LIBRARY_PATH"
    exit 1
fi

# echo -e "Running Client Program with 2 sample tests: TestInput1.txt and TestInput2.txt"
# echo -e "Please note that output will not look that pretty as Inputted text isnt displayed on the Console\n"

# echo -e "\nTesting TestInput1\n"
# ./Client < TestInput1.txt

# echo -e "\nTesting TestInput2\n"
# ./Client < TestInput2.txt

exit 0
