package main

import (
	"bufio"
	"fmt"
	"os"
)

func assert(b bool, msg string) {
	if !b {
		panic("ASSERTION FAILURE: " + msg)
	}
}

func main() {
	fmt.Println("Start")

	InitUser()
	StartRestAPI()
	waitForQuit()

	fmt.Println("End")
}

func waitForQuit() {
	scanner := bufio.NewScanner(os.Stdin)
	for scanner.Scan() {
		if scanner.Text() == "quit" {
			break
		}
	}
}
