/*
*	Contains callbacks for rest api.
*
*	/login POST :
*
*		Expected Input : type LoginAttempt struct {
*							EncryptedUsername string
*							EncryptedPassword string }	in JSON format
*
*		if successful : 			LoginAttemptResponse{ true, "Login Successful" }
*		if invalid JSON input:		LoginAttemptResponse{ false, "JSON Login Transmission Error"}
*		if authentication fail:		LoginAttemptResponse{ false, "Authentication Error for "+usrname}
*		if already logged in : 		LoginAttemptResponse{ false, "User "+user.Username+" is already logged in"}
*
*	/login GET :
*
*		Expected Input : None
*
*		if successful :				string(username of user logged in)
*		if loggedOff  :				LoginAttemptResponse{ false, "Please login" }
*
*	/logoff POST
*
*		Expected Input : string (username of logged in user)
*
*		if successful :				LoginAttemptResponse{true, "Logged off "+user.Username}
*		if wrong input:				string(error)
*		if not logged in :			LoginAttemptResponse{false, "Please login"}
*
*	/cypher GET
*
*		Expected Input : None
*
*		if successful   :			Graph
*		if not loggedIn :			LoginAttemptResponse{false, "Please login"}
*		if error talking to db:		string(error)
*
*	/cypher POST
*
*		Expected Input : string(query)
*
*		if successful   :			[]QueryResponseRow
*		if wrong input	:			string("Internal Error: Invalid format for /cypher : POST")
*		if not loggedIn :			LoginAttemptResponse{false, "Please login"}
*		if error		:			string(error)
*
*	/ping GET
*
*		Expected Input : None
*
*		always			: 			"pong"
 */

package main

import (
	"fmt"
	"log"
	"net/http"

	"github.com/gin-gonic/gin"
)

var user CypherUser
var router *gin.Engine

func InitUser() {
	user = CypherUser{LoggedIn: false}
}

func StartRestAPI() {
	router = gin.Default()

	router.GET("/ping", onPing)

	router.POST("/login", onLoginPOST)
	router.GET("/login", onLoginGET)

	router.POST("/cypher", onCypherPOST)
	router.GET("/cypher", onCypherGET)

	router.POST("/logoff", onLogoffPOST)

	router.GET("/shutdown", onShutdownGET)

	go router.Run("localhost:8080")
}

func onLoginPOST(c *gin.Context) {

	if user.LoggedIn {
		AlreadyLoggedInError(c)
		return
	}

	var attempt LoginAttempt
	if err := c.BindJSON(&attempt); err != nil {
		SendLoginError(c, "JSON Login Transmission Error")
		return
	}

	usrname := attempt.Username
	passwd := decryptName(attempt.EncryptedPassword)

	newuser := NewCypherUser(usrname)
	if err := newuser.Login(passwd); err != nil {
		SendLoginError(c, fmt.Sprint(err))
		return
	}

	// This means successful login with current user.
	user = newuser
	log.Println(user)
	SendLoginSuccess(c, "Login Successful")
}

func onPing(c *gin.Context) {
	c.IndentedJSON(http.StatusOK, "pong")
}

func onLoginGET(c *gin.Context) {

	if !user.LoggedIn {
		NotLoggedInError(c)
		return
	}

	c.IndentedJSON(http.StatusOK, user.Username)
}

func onCypherGET(c *gin.Context) {

	if !user.LoggedIn {
		NotLoggedInError(c)
		return
	}

	nodes, err := user.Server.GetAllNodes()
	if err != nil {
		c.IndentedJSON(http.StatusOK, fmt.Sprint(err))
		return
	}

	edges, err := user.Server.GetAllRelationships()
	if err != nil {
		c.IndentedJSON(http.StatusOK, fmt.Sprint(err))
		return
	}

	c.IndentedJSON(http.StatusOK, Graph{Nodes: nodes, Edges: edges})
}

func onCypherPOST(c *gin.Context) {

	if !user.LoggedIn {
		NotLoggedInError(c)
		return
	}

	var query string

	if err := c.BindJSON(&query); err != nil {
		c.IndentedJSON(http.StatusCreated, "Internal Error: Invalid format for /cypher : POST")
		return
	}

	response, err := user.Server.TryQuery(query)
	if err != nil {
		c.IndentedJSON(http.StatusCreated, fmt.Sprint(err))
	} else {
		c.IndentedJSON(http.StatusCreated, response)
	}
}

func onLogoffPOST(c *gin.Context) {

	if !user.LoggedIn {
		NotLoggedInError(c)
		return
	}

	var uname string

	if err := c.BindJSON(&uname); err != nil {
		c.IndentedJSON(http.StatusCreated, "Internal Error: Invalid format for /logoff : POST")
		return
	}

	if uname != user.Username {
		SendLoginError(c, "User "+user.Username+" is currently logged in and not "+uname)
		return
	}

	user.Logoff()
	SendLoginSuccess(c, "Logged off "+user.Username)
}

func onShutdownGET(c *gin.Context) {
	c.IndentedJSON(http.StatusOK, "Server shutting down...")
	EndMain <- 0
}
