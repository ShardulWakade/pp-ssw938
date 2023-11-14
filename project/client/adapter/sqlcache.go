package main

import (
	"log"
)

type SQLCache struct {
	responses    map[string][]string
	currentGraph string
}

// Will establish connection to SQL database
func NewSQLCache() *SQLCache {
	return &SQLCache{responses: make(map[string][]string), currentGraph: ""}
}

// This should try to access the database to see if it contains the query
func (cache *SQLCache) Fetch(query string) ([]string, bool) {

	if resp, prs := cache.responses[query]; prs {
		return resp, true
	}
	return nil, false
}

// This should try to clear the cache if the new graph from the server is different than the graph we have in mind.
func (cache *SQLCache) CheckIfInvalid() {

	// If any transmission error, just clear the cache. Don't change the graph
	if graph, success := GETCypher(); !success {
		cache.Clear()
	} else if cache.currentGraph != graph { // This means we need to renew the graph and clear cache
		cache.SetNewGraph(graph)
		cache.Clear()
	}
}

// This will clear out the sql cache
func (cache *SQLCache) Clear() {
	cache.responses = make(map[string][]string)
}

// Modify in memory and in file graph
func (cache *SQLCache) SetNewGraph(graph string) {
	cache.currentGraph = graph
	log.Println("Writing to graph file:", graph)
}

// This will clear graph in memory and file
func (cache *SQLCache) ClearGraph() {
	cache.SetNewGraph("")
}

// This will store the current command-response into the database
func (cache *SQLCache) Store(command string, response []string) {
	cache.responses[command] = response
}
