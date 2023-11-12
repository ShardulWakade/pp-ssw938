package main

import (
	"bytes"
	"encoding/json"
	"io"
	"net/http"
)

func PostToServer(command string) string {
	postBody, _ := json.Marshal(command)
	responseBody := bytes.NewBuffer(postBody)
	resp, err := http.Post("http://localhost:8080/cypher", "application/json", responseBody)

	if err != nil {
		panic(err)
	}
	defer resp.Body.Close()
	body, err := io.ReadAll(resp.Body)
	if err != nil {
		panic(err)
	}

	return string(body)
}

func GetFromServer() string {
	resp, err := http.Get("http://localhost:8080/cypher")
	if err != nil {
		panic(err)
	}
	defer resp.Body.Close()
	body, err := io.ReadAll(resp.Body)
	if err != nil {
		panic(err)
	}

	return string(body)
}
