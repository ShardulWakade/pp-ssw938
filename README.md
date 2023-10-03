## README FOR THE GRADER
### Checkpoint 1

Do the following to grade checkpoint 1 after downloading this repo: 

Firstly, cd into project and then run the buildAll.sh script. 

<code>cd project</code><br />
<code>./buildAll.sh</code>

This will build the lexer/parser, the client program, and will call the neo4j setup script.
This will also call the test programs for all of the above builds.

Note that the compilation time for the libantlr4-runtime.so library is a little slow but it does happen successfully.

<b>Running each part individually</b>

buildAll.sh runs all tests in one go. However we can test or run each program individually.

NOTE : ONLY DO THIS AFTER YOU HAVE RAN THE SCRIPT MENTIONED ABOVE.

<i>Lexer/Parser</i> : There exists a very basic test for the lexer/parser. It simply passes "Hello World" to the Lexer and Parser.
To execute this program, first cd into project/lp and then call build.sh - It is important that this script be called as it sets necessary environment variables for the .so libraries.

<code>cd project/lp</code> <br />
<code>./build.sh</code>

<i>Client Program</i>: To test this program, cd into the project directory and call testClient.sh -It is again important that this script be called as it sets necessary environment variables for the .so libraries.

<code>cd project</code> <br />
<code>./testClient.sh</code>

<i>Neo4j</i>: The test for this is to run a simple cypher query (neoSetup/Queries.txt). cd into project/neoSetup and run the build.sh script

<code>cd project/neoSetup</code> <br />
<code>./build.sh</code>

This will start the database, try to run cypher-shell until a connection is established, and then pass a simple query to the shell. After this it will stop the database.

