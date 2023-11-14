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

func SendLoginError(c *gin.Context, message string) {
	response := LoginAttemptResponse{Success: false, ErrorMessage: message}
	c.IndentedJSON(http.StatusCreated, response)
}

func SendLogicSuccess(c *gin.Context, message string) {
	response := LoginAttemptResponse{Success: true, ErrorMessage: message}
	c.IndentedJSON(http.StatusCreated, response)
}
