#!/usr/bin/bash

## This will download neo4j from the internet and will run some sample queries for it from an Input file

## I am assigned neo4j 4.4.x

FIRST_TIME=false

# Set up neo4j locally

if ! test -d neo4j-community-4.4.0; then
    # Our first time.
    FIRST_TIME=true
    if ! test -f neo4j4_4_0.tar.gz; then
        echo "Did not find neo4j4_4_0.tar.gz, Downloading from the web."
        wget https://neo4j.com/artifact.php?name=neo4j-community-4.4.0-unix.tar.gz -O neo4j4_4_0.tar.gz
    fi

    echo "neo4j-community-4.4.0 not found, extracting from neo4j4_4_0.tar.gz"
    
    tar xfz neo4j4_4_0.tar.gz
fi

## By this point we should have neo4j setup. Now we need to check if we have the username and password

if [ "$FIRST_TIME" = true ]; then
    ./neo4j-community-4.4.0/bin/neo4j-admin set-initial-password shardul
fi

echo "neo4j has been setup(off)!"

make Connector




