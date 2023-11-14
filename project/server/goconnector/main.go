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

var EndMain chan int

func main() {
	fmt.Println("Start")

	EndMain = make(chan int, 2)

	InitUser()
	StartRestAPI()
	go waitForQuit()

	<-EndMain

	if user.LoggedIn {
		user.Logoff()
	}

	fmt.Println("End")
}

func waitForQuit() {
	scanner := bufio.NewScanner(os.Stdin)
	for scanner.Scan() {
		if scanner.Text() == "quit" {
			break
		}
	}
	EndMain <- 0
}
