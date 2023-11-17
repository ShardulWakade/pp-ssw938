package dbtype;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*
*   This represents a Row in a response.
*/
public class ResponseRow {

    // This function will take a Map (a JSONObject) and convert it to a Response row
    public static ResponseRow fromJSONObject(JSONObject rowArray) {
        ParseUtils.ensureMapContainsKeys(rowArray, "RowFields", "RowValues");

        JSONArray rowFields = (JSONArray) rowArray.get("RowFields");
        JSONArray rowValues = (JSONArray) rowArray.get("RowValues");

        List<RowField> rowFieldsConverted = new ArrayList<>();
        List<Object> rowValuesConverted = new ArrayList<>();

        for (int i = 0; i < rowFields.size(); i++) {
            RowField currentRowField = RowField.fromMap((JSONObject) rowFields.get(i));
            Object currentFieldValue = rowValues.get(i); // Hopefully this is the corresponding "value" for the map
                                                         // above

            Object value;
            switch (currentRowField.getValueType()) {
                case "dbtype.Node": {
                    value = Node.FromMap((JSONObject) currentFieldValue);
                    break;
                }
                case "dbtype.Relationship": {
                    value = Relationship.FromMap((JSONObject) currentFieldValue);
                    break;
                }
                case "int64": {
                    value = (Long) currentFieldValue;
                    break;
                }
                default: {
                    value = currentRowField.getValueString();
                    break;
                }
            }

            rowFieldsConverted.add(currentRowField);
            rowValuesConverted.add(value);
        }

        return new ResponseRow(rowFieldsConverted, rowValuesConverted);
    }

    private List<RowField> rowFields;
    private List<Object> rowValues; // We will have to figure this out at runtime based on what keys we get

    public ResponseRow(List<RowField> rowKeys, List<Object> rowValues) {
        assert (rowKeys.size() == rowValues.size());
        this.rowFields = rowKeys;
        this.rowValues = rowValues;
    }

    public List<RowField> getRowFields() {
        return rowFields;
    }

    public void setRowFields(List<RowField> rowKeys) {
        this.rowFields = rowKeys;
    }

    public List<Object> getRowValues() {
        return rowValues;
    }

    public void setRowValues(List<Object> rowValues) {
        this.rowValues = rowValues;
    }

    @Override
    public String toString() {
        return "ResponseRow [rowKeys=" + rowFields + ", rowValues=" + rowValues + "]";
    }

    // This will basically "Sort" our object internally based on the ordering in
    // fields.
    public void enforceOrder(List<RowField> fields) {
        CorruptJSONException.throwIf(this.rowFields.size() != fields.size());

        for (int i = 0; i < fields.size(); i++) {
            int j = this.rowFields.indexOf(fields.get(i));
            CorruptJSONException.throwIf(j == -1);

            // Swap contents of indices i and j
            if (i != j) {
                rowFields.set(i, rowFields.set(j, rowFields.get(i)));
                rowValues.set(i, rowValues.set(j, rowValues.get(i)));
            }
        }
    }

}
