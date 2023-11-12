package main

import (
	"context"
	"fmt"

	"github.com/neo4j/neo4j-go-driver/v5/neo4j"
	"github.com/neo4j/neo4j-go-driver/v5/neo4j/dbtype"
)

type Graph struct {
	Nodes []dbtype.Node
	Edges []dbtype.Relationship
}

type QueryResponseValue struct {
	Field       string
	ValueType   string
	ValueString string
}

type QueryResponseRow struct {
	RowFields []QueryResponseValue
	RowValues []any
}

type CypherServer struct {
	ctx    context.Context
	driver neo4j.DriverWithContext
}

func NewCypherServer(dbUri string, dbUser string, dbPassword string) (CypherServer, error) {
	server := CypherServer{}
	server.ctx = context.Background()
	server.driver, _ = neo4j.NewDriverWithContext(dbUri, neo4j.BasicAuth(dbUser, dbPassword, ""))

	err := server.driver.VerifyConnectivity(server.ctx)
	return server, err
}

func (server *CypherServer) Exit() {
	server.driver.Close(server.ctx)
}

func (server *CypherServer) GetAllNodes() ([]dbtype.Node, error) {
	nodes := make([]dbtype.Node, 0)
	result, err := server.executeQuery("MATCH (node) RETURN node;")

	if err != nil {
		fmt.Println(err)
		return nil, err
	}

	for _, record := range result.Records {
		if val, prs := record.AsMap()["node"]; prs {
			nodes = append(nodes, val.(dbtype.Node))
		} else {
			fmt.Println("Bad Node")
		}
	}

	return nodes, nil
}

func (server *CypherServer) GetAllRelationships() ([]dbtype.Relationship, error) {
	rels := make([]dbtype.Relationship, 0)
	result, err := server.executeQuery("MATCH ()-[edge]->() RETURN edge;")

	if err != nil {
		fmt.Println(err)
		return nil, err
	}

	for _, record := range result.Records {
		if val, prs := record.AsMap()["edge"]; prs {
			rels = append(rels, val.(dbtype.Relationship))
		} else {
			fmt.Println("Bad edge")
		}
	}

	return rels, nil
}

func (server *CypherServer) TryQuery(query string) ([]QueryResponseRow, error) {
	result, err := server.executeQuery(query)

	if err != nil {
		return nil, err
	}

	rows := make([]QueryResponseRow, 0)

	for _, record := range result.Records {
		row := QueryResponseRow{RowFields: make([]QueryResponseValue, 0), RowValues: make([]any, 0)}

		m := record.AsMap()
		for field, value := range m {
			row.RowFields = append(row.RowFields, QueryResponseValue{Field: field, ValueType: fmt.Sprintf("%T", value), ValueString: fmt.Sprintf("%v", value)})
			row.RowValues = append(row.RowValues, value)
		}
		rows = append(rows, row)
	}

	fmt.Printf("The query `%v` returned %v records in %+v.\n", result.Summary.Query().Text(), len(result.Records), result.Summary.ResultAvailableAfter())

	return rows, nil
}

func (server *CypherServer) executeQuery(query string) (*neo4j.EagerResult, error) {
	return neo4j.ExecuteQuery(server.ctx, server.driver,
		query,
		map[string]any{},
		neo4j.EagerResultTransformer,
		neo4j.ExecuteQueryWithDatabase("neo4j"))
}

func (server *CypherServer) GetGraph() Graph {
	fmt.Println("Server state:", server)
	nodes, _ := server.GetAllNodes()
	edges, _ := server.GetAllRelationships()
	return Graph{nodes, edges}
}
