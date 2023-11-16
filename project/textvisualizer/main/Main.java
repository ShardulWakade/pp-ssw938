/*
*   This program will read from the common/RecentResponse.json file and use that to come up with a text based visualization.
*
*/

package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import dbtype.CorruptJSONException;
import dbtype.OrderEnforcer;
import dbtype.ResponseRow;

class Main {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        File recentResponsesJSONFile = new File("project/common/RecentResponse.json");

        System.out.println(System.getProperty("user.dir"));

        Scanner sc = new Scanner(System.in);
        String line;

        printIntroduction();
        System.out.print("\n> ");

        while(!(line = sc.nextLine()).equalsIgnoreCase("quit")) {
            if (line.equalsIgnoreCase("help")) {
                System.out.println("Enter \n\"quit\" to exit the program. \n\"visualize\" "
                        + "to get a text based visualization of the most recent response.");
            } else if (!line.equalsIgnoreCase("visualize")) {
                System.out.println("Did not understand command : " + line + "\nType \"help\" for help.");
            } else {
                try {
                    Object parsedJSONArray;
                    try (BufferedReader reader = new BufferedReader(new FileReader(recentResponsesJSONFile))) {
                        parsedJSONArray = parser.parse(reader);
                    }

                    List<ResponseRow> rows = new ArrayList<>();
                    JSONArray arr = (JSONArray) parsedJSONArray;
                    for (int i = 0; i < arr.size(); i++) { // Apparently the range-for loop messed up the order of input
                                                           // somehow ¯\_(ツ)_/¯
                        JSONObject rowKeyValueMap = (JSONObject) arr.get(i);
                        ResponseRow row = ResponseRow.fromJSONObject(rowKeyValueMap);
                        rows.add(row);
                    }

                    // Sometimes for second row onwards, neo4j returns key-value pairs in random
                    // order.
                    // So we structure from the second element upto the last and use the first
                    // element as a guide
                    if (!rows.isEmpty()) {
                        OrderEnforcer enforcer = new OrderEnforcer(rows.get(0).getRowFields());
                        for (int i = 1; i < rows.size(); i++) {
                            rows.get(i).enforceOrder(enforcer);
                        }
                    }

                    printResponseRows(rows);

                } catch (ClassCastException | ParseException | CorruptJSONException e) {
                    System.err.println("Corrupted json file.");
                    e.printStackTrace();
                } catch (IOException e) {
                    System.err.println("File error occured while reading " + recentResponsesJSONFile);
                }
            }
            System.out.print("\n> ");
        }

        sc.close();
        printExit();
    }

    private static void printExit() {
        System.out.println("THANK YOU!");
    }

    private static void printIntroduction() {
        System.out.println("Welcome to Cypher Text Visualizer.");
        System.out.println();
        System.out.println(
                "Use \"quit\" to quit the program, \"visualize\" to visualize the latest response, and \"help\" for more info.");
    }

    private static void printResponseRows(List<ResponseRow> rows) {
        System.out.println(rows); // TODO.
    }

    // For debugging purposes.

    private static void printTabs(int tabs) {
        for (int i = 0; i < tabs; i++) {
            System.out.print("   ");
        }
    }

    private static void printObjWithClass(Object obj) {
        if (obj == null) {
            System.out.println("NULL");
        } else {
            System.out.println(obj.getClass() + " : " + obj);
        }
    }

    private static void printInDepthMap(JSONObject map, int depth) {
        System.out.println(map.getClass().getSimpleName() + " {");
        Set<Map.Entry> set = map.entrySet();
        for (var entry : set) {
            printTabs(depth + 1);
            System.out.print(entry.getKey().getClass().getSimpleName() + "(" + entry.getKey() + ") -> ");

            Object obj = entry.getValue();
            printJSON(obj, depth + 2);
        }
        printTabs(depth);
        System.out.println("}");
    }

    private static void printInDepthArray(JSONArray array, int depth) {
        System.out.println(array.getClass().getSimpleName() + " : {");
        for (Object obj : array) {
            printTabs(depth + 1);
            printJSON(obj, depth + 1);
        }
        printTabs(depth);
        System.out.println("}");
    }

    private static void printJSON(Object jsonObj, int depth) {
        if (jsonObj instanceof JSONArray) {
            printInDepthArray((JSONArray) jsonObj, depth);
        } else if (jsonObj instanceof JSONObject) {
            printInDepthMap((JSONObject) jsonObj, depth);
        } else {
            printObjWithClass(jsonObj);
        }
    }

}
