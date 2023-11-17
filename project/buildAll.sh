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

echo "Building Client Program"

cd client
./build.sh
cd ..

echo "Building server"
cd server
./build.sh
cd ..

echo "Building text visualizer"
cd textvisualizer
./build.sh
cd ..

echo "Build successful."
echo "In order to use any of the programs, cd into its directory and do ./run.sh"
echo "cd client && ./run.sh"
echo "cd server && ./run.sh"
echo "cd textvisualizer && ./run.sh"

