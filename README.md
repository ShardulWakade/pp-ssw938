### READ ME FOR THE PROJECT

For now I have uploaded a project folder which contains the lp directory. 
This contains the lexer and parser. To build and test this out:

<code>
cd project/lp
./build.sh
</code>

TODO for next time:

Already done:
1) Basic Lexer/Parser Build setup.
2) Build script to construct the .so file and a simple test application of it that passes "Hello World" to our lexer/parser.

PART 1:
1) Modify shared object library to have a different error handler
2) Implement a Client program in C++ that will use the 
shared object file to accept user input and validate it.
3) Write a script that will call the Client with test input

PART 2:
1) Test out neo4j
2) Write a script that will test out neo4j

PART 3:
1) Write a script that will call all three scripts
