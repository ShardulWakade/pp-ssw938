package main

import (
	"encoding/json"
	"fmt"
	"os"

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

func convertToStringSlice(labels []any) []string {
	strs := make([]string, 0)
	for _, label := range labels {
		strs = append(strs, label.(string))
	}
	return strs
}

func constructNodeFromMap(mp map[string]any) dbtype.Node {
	var node dbtype.Node
	node.Id = int64(mp["Id"].(float64))
	node.ElementId = mp["ElementId"].(string)

	node.Labels = convertToStringSlice(mp["Labels"].([]any))
	node.Props = mp["Props"].(map[string]any)

	return node
}

func constructRelFromMap(mp map[string]any) dbtype.Relationship {
	var edge dbtype.Relationship
	edge.Id = int64(mp["Id"].(float64))
	edge.StartId = int64(mp["StartId"].(float64))
	edge.EndId = int64(mp["EndId"].(float64))

	edge.ElementId = mp["ElementId"].(string)
	edge.StartElementId = mp["StartElementId"].(string)
	edge.EndElementId = mp["EndElementId"].(string)

	edge.Type = mp["Type"].(string)
	edge.Props = mp["Props"].(map[string]any)

	return edge
}

func purifyType(valType string, value any) any {
	switch valType {
	case "dbtype.Node":
		return constructNodeFromMap(value.(map[string]any))
	case "dbtype.Relationship":
		return constructRelFromMap(value.(map[string]any))
	default:
		return nil
	}
}

func Purify(row *QueryResponseRow) {
	for i := 0; i < len(row.RowFields); i++ {
		valType := row.RowFields[i].ValueType
		purifedType := purifyType(valType, row.RowValues[i])
		if purifedType != nil {
			row.RowValues[i] = purifedType
		}
	}
}

// Post /cypher responses can be string, LoginAttemptResponse, or []QueryResponseRows
func ParsePostCypherResponse(jsonBytes []byte) Message {
	var errResp string
	if json.Unmarshal(jsonBytes, &errResp) == nil { // This means we recieved a error string
		return NewErrorMessage(errResp)
	}

	var loginResponse LoginAttemptResponse
	if json.Unmarshal(jsonBytes, &loginResponse) == nil { // This means we recieved a LoginAttemptResponse in return
		if loginResponse.Success {
			return NewUnexpectedResponseMessage("Unexpected response from the server") // We shouldnt be receiving a login success message
		} else {
			return NewLoginErrorMessage(loginResponse.ErrorMessage)
		}
	}

	// Else this must be a []QueryResponseRow
	rows := make([]QueryResponseRow, 0)
	if json.Unmarshal(jsonBytes, &rows) == nil { // We received a []QueryResponseRow

		for i := 0; i < len(rows); i++ {
			Purify(&rows[i])
		}

		allRows := make([]string, 0)

		for _, row := range rows {
			singleRow := make([]string, 0)
			for i := 0; i < len(row.RowFields); i++ {

				s := ""
				s += fmt.Sprintf("%v=", row.RowFields[i].Field)

				switch row.RowFields[i].ValueType {
				case "dbtype.Node":
					s += fmt.Sprintf("Node(Labels:%v)", row.RowValues[i].(dbtype.Node).Labels)
				case "dbtype.Relationship":
					s += fmt.Sprintf("Edge[Type:%v]", row.RowValues[i].(dbtype.Relationship).Type)
				case "string":
					s += fmt.Sprintf("\"%v\"", row.RowValues[i])
				case "int64":
					s += fmt.Sprint(int64(row.RowValues[i].(float64)))
				default:
					s += fmt.Sprint(row.RowValues[i])
				}
				singleRow = append(singleRow, s)
			}
			//		slices.Sort(singleRow)
			allRows = append(allRows, fmt.Sprint(singleRow))
			os.WriteFile("log.txt", []byte(fmt.Sprint(singleRow)), 0644)
		}

		return NewResponseMessage(allRows)
	}

	return NewMessageFromString("ERROR", "Received JSON response is corrupted :(")
}

// Post /login reponses can only be of type LoginAttemptResponse
func ParsePostLoginResponse(jsonBytes []byte) Message {
	var loginResponse LoginAttemptResponse
	if json.Unmarshal(jsonBytes, &loginResponse) == nil { // This means we recieved a LoginAttemptResponse in return
		if loginResponse.Success {
			return NewSuccessMessage()
		} else {
			return NewLoginErrorMessage(loginResponse.ErrorMessage)
		}
	}

	return NewMessageFromString("ERROR", "Received JSON response is corrupted :(")
}

func ParsePostLogoffResponse(jsonBytes []byte) Message {

	var loginResponse LoginAttemptResponse
	if json.Unmarshal(jsonBytes, &loginResponse) == nil { // This means we recieved a LoginAttemptResponse in return
		if loginResponse.Success {
			return NewSuccessMessage()
		} else {
			return NewLoginErrorMessage(loginResponse.ErrorMessage)
		}
	}

	var msg string
	if json.Unmarshal(jsonBytes, &msg) == nil { // If we received a string
		return NewMessageFromString("ERROR", "Sent an invalid request to server")
	}

	return NewMessageFromString("ERROR", "Received JSON response is corrupted :(")
}
