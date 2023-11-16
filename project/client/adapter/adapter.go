package main

import (
	"bufio"
	"bytes"
	"encoding/json"
	"fmt"
	"io"
	"log"
	"net/http"
	"os"
	"strconv"
)

func check(e error) {
	if e != nil {
		panic(e)
	}
}

func assert(b bool, message string) {
	if !b {
		log.Fatal("ADAPT : " + message)
	}
}

func SetLogOutputToFile() {
	file, err := os.OpenFile("AdaptLogs.log", os.O_APPEND|os.O_CREATE|os.O_WRONLY, 0666)
	if err != nil {
		log.Fatal(err)
	}

	log.SetOutput(file)
}

var cache *SQLCache

func main() {

	SetLogOutputToFile()

	cache = NewSQLCache()
	cache.Clear()
	cache.ClearGraph()

	messageParser := make(map[string]func(Message) Message)

	messageParser["SEND"] = onSEND
	messageParser["LOGOFF"] = onLOGOFF
	messageParser["LOGIN"] = onLOGIN
	messageParser["GET_LOGIN"] = onGET_LOGIN
	messageParser["PING"] = onPING
	messageParser["SHUTDOWN"] = onSHUTDOWN
	messageParser["CLEAR_CACHE"] = onCLEAR_CACHE

	scanner := bufio.NewScanner(os.Stdin)
	for scanner.Scan() {
		message := Message{}

		message.MessageType = scanner.Text()
		if message.MessageType == "EXIT" {
			os.Exit(0)
		}

		assert(scanner.Scan(), "Incomplete information from parent : Missing number of lines")

		number, err := strconv.ParseInt(scanner.Text(), 10, 32)
		assert(err == nil, "Expecting an integer: "+scanner.Text())

		message.MessageContent = make([]string, 0)

		for i := 0; i < int(number); i++ {
			assert(scanner.Scan(), "Expecting a line...")
			message.MessageContent = append(message.MessageContent, scanner.Text())
		}

		if command, prs := messageParser[message.MessageType]; prs {
			log.Println("------------------")
			printMessageToStdOut(command(message))
			log.Println("------------------")
		} else {
			log.Println("No such message type :", message.MessageType)
		}
	}
}

func printMessageToStdOut(message Message) {
	fmt.Println(message.MessageType)
	fmt.Println(len(message.MessageContent))
	for _, row := range message.MessageContent {
		fmt.Println(row)
	}
}

func PostOn(suffix string, content any) (*http.Response, error) {
	postBody, _ := json.Marshal(content)
	responseBody := bytes.NewBuffer(postBody)
	return http.Post("http://localhost:8080/"+suffix, "application/json", responseBody)
}

func GetOn(suffix string) (*http.Response, error) {
	return http.Get("http://localhost:8080/" + suffix)
}

func GetJSONBytes(resp *http.Response) []byte {
	body, err := io.ReadAll(resp.Body)
	assert(err == nil, "Unexpected error during reading return body")
	return body
}

func onCLEAR_CACHE(parentMessage Message) Message {
	assert(len(parentMessage.MessageContent) == 0, "CLEAR_CACHE takes 0 lines")
	cache.Clear()
	return NewSuccessMessage()
}

func onSHUTDOWN(parentMessage Message) Message {
	assert(len(parentMessage.MessageContent) == 0, "SHUTDOWN takes 0 lines")

	resp, err := GetOn("shutdown")

	if err != nil {
		return NewConnectionErrorMessage(err)
	}
	defer resp.Body.Close()
	jsonBytes := GetJSONBytes(resp)

	var sh string
	if json.Unmarshal(jsonBytes, &sh) == nil { // This is a string
		return NewMessageFromString("RESPONSE", sh)
	}

	return NewUnexpectedResponseMessage("Unexpected response")
}

func onPING(parentMessage Message) Message {
	assert(len(parentMessage.MessageContent) == 0, "PING takes 0 lines")

	resp, err := GetOn("ping")

	if err != nil {
		return NewConnectionErrorMessage(err)
	}
	defer resp.Body.Close()
	jsonBytes := GetJSONBytes(resp)

	var pong string
	if json.Unmarshal(jsonBytes, &pong) == nil { // This is a string
		return NewSuccessMessage()
	}

	return NewUnexpectedResponseMessage("Unexpected response")
}

func onGET_LOGIN(parentMessage Message) Message {
	assert(len(parentMessage.MessageContent) == 0, "GET_LOGIN takes 0 lines")

	resp, err := GetOn("login")
	if err != nil {
		return NewConnectionErrorMessage(err)
	}
	defer resp.Body.Close()

	jsonBytes := GetJSONBytes(resp)

	var userLogin string
	if json.Unmarshal(jsonBytes, &userLogin) == nil {
		return NewMessageFromString("RESPONSE", userLogin)
	}

	var failedLogin LoginAttemptResponse
	if json.Unmarshal(jsonBytes, &failedLogin) == nil {
		if !failedLogin.Success {
			return NewLoginErrorMessage(failedLogin.ErrorMessage)
		}
	}

	return NewUnexpectedResponseMessage("Unexpected response")
}

// This function will try to send it POST to /cypher.
// It may return the valid responses or errors
func onSEND(parentMessage Message) Message {
	assert(len(parentMessage.MessageContent) == 1, "SEND takes 1 line.")

	command := parentMessage.MessageContent[0]

	// first check if cache contains the message
	if response, prs := cache.Fetch(command); prs {
		return NewCachedMessage(response)
	}

	// Otherwise we have to send it to the server and then update our cache
	resp, err := PostOn("cypher", command)

	if err != nil {
		return NewConnectionErrorMessage(err)
	}
	defer resp.Body.Close()

	serverMessage := ParsePostCypherResponse(GetJSONBytes(resp))

	if serverMessage.MessageType == "RESPONSE" {
		cache.CheckIfInvalid()
		cache.Store(command, serverMessage.MessageContent)
	}

	return serverMessage
}

func onLOGOFF(parentMessage Message) Message {
	assert(len(parentMessage.MessageContent) == 1, "LOGOFF takes 1 line")

	resp, err := PostOn("logoff", parentMessage.MessageContent[0])

	if err != nil {
		return NewConnectionErrorMessage(err)
	}
	defer resp.Body.Close()

	returnMessage := ParsePostLogoffResponse(GetJSONBytes(resp))
	if returnMessage.MessageType == "SUCCESS" {
		cache.Clear()
		cache.ClearGraph()
	}
	return returnMessage
}

func onLOGIN(parentMessage Message) Message {
	assert(len(parentMessage.MessageContent) == 2, "LOGIN takes 2 lines")

	username := parentMessage.MessageContent[0]
	password := encryptName(parentMessage.MessageContent[1])

	resp, err := PostOn("login", LoginAttempt{Username: username, EncryptedPassword: password})

	if err != nil {
		return NewConnectionErrorMessage(err)
	}
	defer resp.Body.Close()

	return ParsePostLoginResponse(GetJSONBytes(resp))
}

// string is the receieved string, bool is success or not
func GETCypher() (string, bool) {
	resp, err := GetOn("cypher")

	if err != nil {
		return "", false
	}
	defer resp.Body.Close()

	jsonBytes := GetJSONBytes(resp)
	var errMessage string
	if json.Unmarshal(jsonBytes, &errMessage) == nil { // We recieved a string in response
		log.Println("Received a string in response")
		return "", false
	}

	var graph Graph
	if json.Unmarshal(jsonBytes, &graph) == nil { // We received a graph as a response
		log.Println("Received a Graph in response")
		return string(jsonBytes), true
	}

	var failedLogin LoginAttemptResponse
	if json.Unmarshal(jsonBytes, &failedLogin) == nil { // We recieved a LoginAttemptResponse
		log.Println("Received a LoginAttemptResponse in response : ", string(jsonBytes), failedLogin)
		if !failedLogin.Success {
			return "", false
		}
	}

	log.Println("Received Invalid response")
	return "", false
}
