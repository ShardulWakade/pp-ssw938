package main

import (
	"net/http"

	"github.com/gin-gonic/gin"
)

type LoginAttempt struct {
	Username          string `json:"uname"`
	EncryptedPassword string `json:"passwd"`
}

type LoginAttemptResponse struct {
	Success      bool
	ErrorMessage string
}

func SendLoginError(c *gin.Context, message string) {
	response := LoginAttemptResponse{Success: false, ErrorMessage: message}
	c.IndentedJSON(http.StatusCreated, response)
}

func SendLoginSuccess(c *gin.Context, message string) {
	response := LoginAttemptResponse{Success: true, ErrorMessage: message}
	c.IndentedJSON(http.StatusCreated, response)
}

func AlreadyLoggedInError(c *gin.Context) {
	assert(user.LoggedIn, "User not logged in: Invalid state")
	SendLoginError(c, "User "+user.Username+" is already logged in")
}

func NotLoggedInError(c *gin.Context) {
	assert(!user.LoggedIn, "User is logged in")
	SendLoginError(c, "Please login")
}

func encryptName(name string) string {
	nameBytes := []byte(name)
	for i := 0; i < len(nameBytes); i++ {
		nameBytes[i] ^= 123
	}
	return string(nameBytes)
}

func decryptName(name string) string {
	nameBytes := []byte(name)
	for i := 0; i < len(nameBytes); i++ {
		nameBytes[i] ^= 123
	}
	return string(nameBytes)
}
