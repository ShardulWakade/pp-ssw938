#!/usr/bin/bash

## This file will first set the current directory to its directory. Then cd into lp and call its ./build.sh
## Then cd ../client and call its ./build.sh
## Then cd ..
## Then print exit message and how to test

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
cd $SCRIPT_DIR

set -e

echo "Building parsing library (language = C/C++)"

cd lp
./build.sh
cd ..

echo "Building Client Program (language = C/C++ for now, though might change to java)"

cd client
./build.sh
cd ..

echo -e "\nBuild finished successfully."
echo -e "\nTo test out the Client program, use testClient.sh\n\n" 

echo "Now Setting up neo4j and testing it"
cd neoSetup
./build.sh
cd ..

