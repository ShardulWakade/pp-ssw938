package main

import (
	"database/sql"
	"log"
	"os"
	"strings"

	_ "github.com/mattn/go-sqlite3"
)

type Cache interface {
	Fetch(string) ([]string, string, bool)
	Clear()
	Store(string, []string, string)
}

type InMemoryCache struct {
	Responses     map[string][]string
	JsonResponses map[string]string
	CurrentGraph  string
}

type SQLCache struct {
	Database *sql.DB
}

var currentGraph string

func checkPrint(premsg string, err error) {
	if err != nil {
		log.Println(premsg, err)
	}
}

// Will establish connection to SQL database if possible, otherwise will return an in memory cache.
func NewCache() Cache {
	database, err := sql.Open("sqlite3", "./graphcache.db")
	if err != nil {
		return &InMemoryCache{Responses: make(map[string][]string), JsonResponses: make(map[string]string), CurrentGraph: ""}
	}

	statement, err :=
		database.Prepare("CREATE TABLE IF NOT EXISTS responses (id INTEGER PRIMARY KEY, query TEXT, responseMerged TEXT, jsonResponse TEXT)")

	if err != nil {
		return &InMemoryCache{Responses: make(map[string][]string), JsonResponses: make(map[string]string), CurrentGraph: ""}
	}

	statement.Exec()

	return &SQLCache{Database: database}
}

// This should try to access the database to see if it contains the query
func (cache *InMemoryCache) Fetch(query string) ([]string, string, bool) {

	if resp, prs := cache.Responses[query]; prs {
		jsonResp, p := cache.JsonResponses[query]
		assert(p, "Only responses found without json.")
		return resp, jsonResp, true
	}
	return nil, "", false
}

// This will clear out the sql cache
func (cache *InMemoryCache) Clear() {
	cache.Responses = make(map[string][]string)
	cache.JsonResponses = make(map[string]string)
}

// This will store the current command-response into the database
func (cache *InMemoryCache) Store(command string, response []string, jsonResp string) {
	cache.Responses[command] = response
	cache.JsonResponses[command] = jsonResp
}

func (cache *SQLCache) Fetch(query string) ([]string, string, bool) {
	log.Println("Inside SQLCache Fetch")

	row := cache.Database.QueryRow("SELECT responseMerged, jsonResponse FROM responses WHERE query = ?", query)
	var responses string
	var jsonResponse string
	err := row.Scan(&responses, &jsonResponse)
	if err != nil {
		log.Println(err)
		return nil, "", false
	}

	return strings.Split(responses, "\n"), jsonResponse, true
}

func (cache *SQLCache) Clear() {
	log.Println("Inside SQLCache Clear")

	statement, err := cache.Database.Prepare("DROP TABLE IF EXISTS responses")
	checkPrint("Drop table prepare failed", err)

	_, err = statement.Exec()
	checkPrint("Drop table exec failed", err)

	statement, err = cache.Database.Prepare("CREATE TABLE IF NOT EXISTS responses (id INTEGER PRIMARY KEY, query TEXT, responseMerged TEXT, jsonResponse TEXT)")
	checkPrint("create table prepare failed", err)

	_, err = statement.Exec()
	checkPrint("create table exec failed", err)
}

func (cache *SQLCache) Store(command string, response []string, jsonResp string) {
	log.Println("Inside SQLCache Store")

	statement, err := cache.Database.Prepare("INSERT INTO responses (query, responseMerged, jsonResponse) VALUES (?, ?, ?)")
	checkPrint("insert into table failed", err)

	_, err = statement.Exec(command, strings.Join(response, "\n"), jsonResp)
	checkPrint("exec insert into table failed", err)
}

// This should try to clear the cache if the new graph from the server is different than the graph we have in mind.
func CheckIfInvalid(cache Cache) {

	// If any transmission error, just clear the cache. Don't change the graph
	if graph, success := GETCypher(); !success {
		cache.Clear()
	} else if currentGraph != graph { // This means we need to renew the graph and clear cache
		SetNewGraph(graph)
		cache.Clear()
	}
}

// Modify in memory and in file graph
func SetNewGraph(graph string) {
	currentGraph = graph
	os.WriteFile("../common/CompleteGraph.json", []byte(graph), 0644)
}

// This will clear graph in memory and file
func ClearGraph() {
	SetNewGraph("")
}

func WriteResponseToFile(jsonResponse string) {
	os.WriteFile("../common/RecentResponse.json", []byte(jsonResponse), 0644)
}
