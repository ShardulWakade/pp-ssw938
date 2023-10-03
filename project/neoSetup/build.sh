#!/usr/bin/bash

## This will download neo4j from the internet and will run some sample queries for it from an Input file

## I am assigned neo4j 4.4.x

if ! test -d neo4j-community-4.4.0; then
    # Our first time.
    if ! test -f neo4j4_4_0.tar.gz; then
        echo "Did not find neo4j4_4_0.tar.gz, Downloading from the web."
        wget https://neo4j.com/artifact.php?name=neo4j-community-4.4.0-unix.tar.gz -O neo4j4_4_0.tar.gz
    fi

    echo "neo4j-community-4.4.0 not found, extracting from neo4j4_4_0.tar.gz"
    
    tar xfz neo4j4_4_0.tar.gz

    ./neo4j-community-4.4.0/bin/neo4j start

    echo "Sleeping for 6 seconds for neo4j to set up"
    sleep 6
    echo "Now trying to run Cypher Shell"

    ./neo4j-community-4.4.0/bin/neo4j status

    ./neo4j-community-4.4.0/bin/cypher-shell -u neo4j -p neo4j <<< "shardul\nshardul\n:quit"

else
    ./neo4j-community-4.4.0/bin/neo4j start

    echo "Sleeping for 6 seconds for neo4j to set up"
    sleep 6
    echo "Now trying to run Cypher Shell"

    ./neo4j-community-4.4.0/bin/neo4j status
fi

echo "Cypher setup with username neo4j and password shardul"

./neo4j-community-4.4.0/bin/cypher-shell -u neo4j -p shardul < Queries.txt

echo "Test finished!"

./neo4j-community-4.4.0/bin/neo4j stop
