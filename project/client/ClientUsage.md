This file will describe how to use the Client and what the client will do based on commands.

Firstly when the client opens up, it will ask Adapt to get the current user that is logged in.
This will either result in a connection error, login error or return a user string.

In the case of a CONNECTION_ERROR, it will halt the program until the user types @connect or @quit
In the case of a LOGIN_ERROR, it will ask the user to login into the server.
In the case of a RESPONSE, it will display the current user that is logged in and the program will start.

Once the program starts, it will display to use @quit to quit and @run to run a query and @help to get help for any query.

After that the user can either type queries or directives. A query is a cypher query which the user can enter across multiple lines.
The queries will be stored by our program.

At any point, the user can use directives to send special instructions to our Client itself. We now describe these directives and what they will do:

1) @run : This will send the query to the parser. If successful, then will send to the server. It will then display the response on the screen.

2) @parse : This will only send the query to the parser and will show if it parses successfully. It will not consume the query but rather leave it unmodified.

3) @forcesend : This will forcefully send the query to the server regardless of whether it parses or not.

4) @clearcache : This will clear out the cache

5) @ping : This will try to ping the server and see if connection is ok.

6) @clear : This will clear the lines and let us start fresh

7) @history : This will display the history of our commands since we logged in

8) @retrylast : This will retry the last command

9) @quit : This will quit the program

10) @shutdown : This will shutdown the server and quit the program

11) @runFromFile : Opens up a "Menu" that will let the user change the current 
 
12) @lines : Opens up a "Menu" that will let the user modify the contents of the current lines he is working with.

13) @logoff : lets the user logoff so he can log into another account. Takes the user back to the main menu to log in.
