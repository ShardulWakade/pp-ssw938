package main

import (
	"fmt"
	"strings"
)

type Message struct {
	MessageType    string
	MessageContent []string
}

func NewMessage() Message {
	return Message{MessageType: "", MessageContent: make([]string, 0)}
}

func NewMessageFromString(msgType string, contentLines string) Message {
	return Message{MessageType: msgType, MessageContent: strings.Split(strings.ReplaceAll(contentLines, "\r\n", "\n"), "\n")}
}

func NewErrorMessage(err any) Message {
	return NewMessageFromString("ERROR", fmt.Sprint(err))
}

func NewUnexpectedResponseMessage(err any) Message {
	return NewMessageFromString("UNEXPECTED", fmt.Sprint(err))
}

func NewConnectionErrorMessage(err any) Message {
	return NewMessageFromString("CONNECTION_ERROR", fmt.Sprint(err))
}

func NewLoginErrorMessage(msg any) Message {
	return NewMessageFromString("LOGIN_ERROR", fmt.Sprint(msg))
}

func NewSuccessMessage() Message {
	return Message{MessageType: "SUCCESS", MessageContent: make([]string, 0)}
}

func NewResponseMessage(rows []string) Message {
	return Message{MessageType: "RESPONSE", MessageContent: rows}
}

func NewCachedMessage(rows []string) Message {
	return Message{MessageType: "CACHED", MessageContent: rows}
}
