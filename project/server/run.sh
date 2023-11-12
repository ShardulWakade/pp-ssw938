neo4j start

# Assuming username "neo4j" and password "shardul"

cypher-shell -u neo4j -p shardul <<< ":quit"

while [ $? -ne 0 ]; 
do
    echo "Trying again..."
    cypher-shell -u neo4j -p shardul <<< ":quit"
done

echo "Neo4j has started. Running Connector"

./Connector



