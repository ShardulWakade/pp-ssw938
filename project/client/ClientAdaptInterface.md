This file describes the interface and requirements between Client and Adapt.

Client's responsibility is to send commands to Adapt.
Adapt's responsibility is to send commands to the server, write data output to local files and also to send server responses back to the Client.
Adapt will also take care of caching the server responses into a local SQL database.

General Protocol between processes : 
Client and server will send messages of the form

MESSAGE TYPE
number of lines
message line 1
message line 2
...

Message from Client to Adapt : 

0)  PING
    0

1)  SEND
    1
    (actual command as a single line)

2)  LOGOFF
    1
    username

3)  LOGIN
    2
    username
    password

4)  GET_LOGIN
    0

5)  SHUTDOWN
    0

6)  CLEAR_CACHE
    0

Message from Adapt to Client : 

0)  Possible responses to PING: 
    ->  CONNECTION_ERROR
        number of lines in error message
        line 1
        line 2
        ...

    ->  SUCCESS
        0

    ->  ERROR
        number of lines in error message
        line 1
        line 2 
        ...

1) Possible responses to SEND: (internally this is POST on /cypher)
    ->  CONNECTION_ERROR
        number of lines in error message
        line 1
        line 2
        ...

    ->  RESPONSE
        number of response rows (n)
        row 1
        row 2
        ...
        row n

    ->  ERROR
        number of lines in error message
        line 1
        line 2 
        ...

    ->  LOGIN_ERROR
        number of lines in error message
        error message line 1
        ...

2) Possible Responses to LOGOFF: (internally this is POST on /logoff)
    ->  CONNECTION_ERROR
        number of lines in error message
        line 1
        line 2
        ...

    ->  SUCCESS
        0

    ->  LOGIN_ERROR
        number of lines in error message
        error message line 1
        ...

    ->  ERROR
        number of lines in error message
        line 1
        line 2 
        ...

3) Possible Responses to LOGIN: (internally this is POST on /login)
    ->  CONNECTION_ERROR
        number of lines in error message
        line 1
        line 2
        ...

    ->  SUCCESS
        0

    ->  LOGIN_ERROR
        number of lines in error message
        error message line 1
        ...

4) Possible Responses to GET_LOGIN: (internally this is GET on /login)
    ->  CONNECTION_ERROR
        number of lines in error message
        line 1
        line 2
        ...

    ->  RESPONSE
        1
        username

    ->  LOGIN_ERROR
        number of lines in error message
        error message line 1
        ...


5) Possible Responses to SHUTDOWN : (this is GET on /shutdown)
    ->  CONNECTION_ERROR
        number of lines in error message
        line 1
        line 2
        ...

    ->  RESPONSE
        number of lines
        line 1
        line 2 
        ...

6) Possible Responses to CLEAR_CACHE : 
    ->  SUCCESS
        0
    