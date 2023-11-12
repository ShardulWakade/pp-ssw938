package main

import (
	"fmt"
	"net/http"

	"github.com/gin-gonic/gin"
)

var server CypherServer

func getCompleteGraph(c *gin.Context) {
	c.IndentedJSON(http.StatusOK, server.GetGraph())
}

func postQuery(c *gin.Context) {
	var query string

	if err := c.BindJSON(&query); err != nil {
		fmt.Println(err)
		return
	}

	response, err := server.TryQuery(query)

	if err != nil {
		c.IndentedJSON(http.StatusCreated, fmt.Sprint(err))
	} else {
		c.IndentedJSON(http.StatusCreated, response)
	}
}

func main() {
	fmt.Println("Start")

	var err error

	server, err = NewCypherServer("neo4j://localhost", "neo4j", "shardul")
	fmt.Println("Server at start:", server)
	defer server.Exit()

	if err != nil {
		panic(err)
	}

	router := gin.Default()
	router.GET("/cypher", getCompleteGraph)
	router.POST("/cypher", postQuery)

	router.Run("localhost:8080")

}
