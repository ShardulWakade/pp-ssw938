package main

import (
	"bufio"
	"fmt"
	"os"
)

func check(e error) {
	if e != nil {
		panic(e)
	}
}

func fillCompleteGraphFile(jsonString string) {
	err := os.WriteFile("../common/CompleteGraph.json", []byte(jsonString), 0644)
	check(err)
}

func fillRecentResponseFile(jsonResponse string) {
	err := os.WriteFile("../common/RecentResponse.json", []byte(jsonResponse), 0644)
	check(err)
}

func main() {
	// 1) Init
	// 2) accept query from stdin
	// 3) send request to server
	// 4) accept response from server
	// 5) form response and write to stdout
	// 6) repeat step 2.

	cache := make(map[string]string, 0)

	completeGraph := GetFromServer()
	fillCompleteGraphFile(completeGraph)
	fillRecentResponseFile("")

	scanner := bufio.NewScanner(os.Stdin)

	for scanner.Scan() {
		if scanner.Text() != "COMMAND" {
			continue
		}
		if !scanner.Scan() {
			break
		}
		command := scanner.Text()

		var responseRows []string
		var responseType string

		var jsonResponse string

		if cachedResponse, prs := cache[command]; prs {
			jsonResponse = cachedResponse
			_, responseRows = parseResponse(jsonResponse)
			responseType = "CACHED"
			fillRecentResponseFile(jsonResponse)
		} else { // if not in cache, we must ask the server for it.
			jsonResponse = PostToServer(command)
			responseType, responseRows = parseResponse(jsonResponse)

			newCompleteGraph := GetFromServer()
			if newCompleteGraph != completeGraph {
				completeGraph = newCompleteGraph
				fillCompleteGraphFile(completeGraph)
				cache = make(map[string]string) // Invalidate cache
			}

			if responseType != "ERROR" {
				cache[command] = jsonResponse
				fillRecentResponseFile(jsonResponse)
			}

		}
		fmt.Println(responseType)
		fmt.Println(len(responseRows))
		for _, row := range responseRows {
			fmt.Println(row)
		}
	}

}
