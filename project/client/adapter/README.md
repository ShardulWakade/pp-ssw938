This program acts as an adapter for our main C++ client

It will do the following:

Accept commands from stdin like 

<code>
COMMAND
(actual command)
</code>

'\n' is the deliemeter for pretty much everything

It will then send the command to the server as a http/rest request.

Once it receives the response from the server, it will send back the response in one of the following ways:
<code>
RESPONSE
(number of rows)
row1
row2
row3 ...
</code>
or
<code>
ERROR
(number of lines)
error message
</code>


