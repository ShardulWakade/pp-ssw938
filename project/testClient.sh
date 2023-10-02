#!/usr/bin/bash

# Assuming that Client already is compiled

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
LIB_DIR=$SCRIPT_DIR"/client/lib"

cd $SCRIPT_DIR"/client"
./Client

cd $SCRIPT_DIR
