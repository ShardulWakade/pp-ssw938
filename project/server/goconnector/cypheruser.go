/*
*	This go file will represent a single instance of a user talking to a graph database.
*	It will support logging in, logging out, checking status of isUserlogged in and will store the username of the user.
*
*	Once logging in is done successfully, it will return a CypherServer object. This will be used to send queries to the database.
 */

package main

type CypherUser struct {
	Username string
	Server   *CypherServer
	LoggedIn bool
}

func NewCypherUser(uname string) CypherUser {
	return CypherUser{Username: uname, LoggedIn: false}
}

func (user *CypherUser) Login(password string) error {
	server, err := NewCypherServer(user.Username, password)
	if err != nil {
		server.Exit()
		return err
	}

	user.LoggedIn = true
	user.Server = &server
	return nil
}

func (user *CypherUser) Logoff() {
	user.Server.Exit()
	user.LoggedIn = false
}
