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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import dbtype.CorruptJSONException;
import dbtype.ResponseRow;
import dbtype.RowField;

class Main {

    private static Map<String, Integer> levels = new HashMap<>();
    public static void main(String[] args) {

        levels.put("visualize-brief", FancyString.BRIEF);
        levels.put("visualize", FancyString.DEFAULT);
        levels.put("visualize-verbose", FancyString.VERBOSE);

        JSONParser parser = new JSONParser();
        File recentResponsesJSONFile = new File("../common/RecentResponse.json");

        System.out.println(System.getProperty("user.dir"));

        Scanner sc = new Scanner(System.in);
        String line;

        printIntroduction();
        System.out.print("\n> ");

        while(!(line = sc.nextLine()).equals("quit")) {
            if (line.equals("help")) {
                printHelp();
            } 
            else if (!levels.containsKey(line)) {
                System.out.println("Did not understand command : " + line + "\nType \"help\" for help.");
            } 
            else {
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
                        List<RowField> idealOrder = rows.get(0).getRowFields();
                        for (int i = 1; i < rows.size(); i++) {
                            rows.get(i).enforceOrder(idealOrder);
                        }
                    }

                    printResponseRows(rows, levels.get(line));
                    printAverageForIntCoulmns(rows);

                } catch (ClassCastException | ParseException | CorruptJSONException e) {
                    System.err.println("Corrupted json file.");
                    e.printStackTrace();
                } catch (IOException e) {
                    System.err.println("File error occured while reading " + recentResponsesJSONFile);
                } catch (Exception e) {
                    System.err.println("Internal Error : ");
                    e.printStackTrace();
                }
            }
            System.out.print("\n> ");
        }

        sc.close();
        printExit();
    }

    private static void printAverageForIntCoulmns(List<ResponseRow> rows) {
        if(rows.isEmpty()){
            return;
        }
        
        Set<Integer> intColumns = new TreeSet<>();
        for(ResponseRow row : rows){
            List<RowField> fields = row.getRowFields();
            for(int i = 0; i < fields.size(); i++){
                RowField field = fields.get(i);
                if(field.getValueType().equals("int64")){
                    intColumns.add(i);
                }
            }
        }

        List<RowField> fields = rows.get(0).getRowFields();

        for(int intColumnIndex : intColumns){
            
            long sum = 0;
            int valueCount = 0;     // Not all entries in this so called "int" column may be integers.

            for(ResponseRow row : rows){
                Object val = row.getRowValues().get(intColumnIndex);
                if(val instanceof Long){
                    sum += (Long)val;
                    valueCount++;
                }
            }

            System.out.println("Average of all " + fields.get(intColumnIndex).getField() + "s = " + (sum/(double)valueCount));
        }
    }

    private static void printHelp() {
        System.out.println("visualize:          Gives a visualization of the most recent response.");
        System.out.println("visualize-brief:    Gives a very short description of each entity.");
        System.out.println("visualize-verbose:  Gives a detailed description of each entry.");
        System.out.println("quit:               Quits the program.");
        System.out.println("help:               Displays the help menu.");
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

    private static String toFancyString(Object obj, int level){
        if(obj instanceof FancyString){
            return ((FancyString)obj).fancy(level);
        }
        return obj.toString();
    }

    private static String createUniform(char repeat, int times) {
        assert(times >= 0);
        char[] ch = new char[times];
        for(int i = 0; i < times; i++){
            ch[i] = repeat;
        }
        return new String(ch);
    }

    private static void printRow(List<String> row, int[] maxLengths){
        for(int i = 0; i < maxLengths.length; i++){
            int currentMaxLength = maxLengths[i];
            int currentLength = row.get(i).length();
            int spacesBefore = (currentMaxLength - currentLength) / 2;
            int spacesAfter = (currentMaxLength - currentLength + 1) / 2;

            System.out.print("| " + createUniform(' ', spacesBefore) + row.get(i) + createUniform(' ', spacesAfter) + " ");
        }
        System.out.println("|");
    }

    private static void printResponseRows(List<ResponseRow> rows, final int level) {
        if(rows.isEmpty()){
            System.out.println("Empty response... nothing to visualize.");
            return;
        }
        
        ArrayList<List<String>> stringsToPrint = new ArrayList<>();
        List<RowField> fields = rows.get(0).getRowFields();

        // Rows header
        stringsToPrint.add(fields.stream().map(RowField::getField).collect(Collectors.toList()));
        
        for(ResponseRow row : rows){
            stringsToPrint.add(row.getRowValues().stream().map(val -> toFancyString(val, level)).collect(Collectors.toList()));
        }

        // Now we have a matrix of strings to print.
        // For now, lets just print each of them seperately for testing.

        // Now calculate the max lengths of each column and use that to come up with a grid.
        int[] maxLengths = new int[fields.size()];
        int totalWidth = 1;

        for(int i = 0; i < maxLengths.length; i++){
            final int i_copy = i;
            maxLengths[i] = stringsToPrint.stream().mapToInt(list -> list.get(i_copy).length()).max().orElse(0);
            totalWidth += maxLengths[i] + 3;
        }

        String seperator = createUniform('-', totalWidth);
        List<String> headers = stringsToPrint.get(0);
        System.out.println(seperator);
        printRow(headers, maxLengths);
        System.out.println(seperator);

        for(int i = 1; i < stringsToPrint.size(); i++){
            printRow(stringsToPrint.get(i), maxLengths);
        }

        System.out.println(seperator);
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
