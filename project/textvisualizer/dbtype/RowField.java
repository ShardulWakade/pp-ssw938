package dbtype;

import java.util.Map;

/*
*   Reprsents the keys in a Row like C or C.name
*   The corresponding values will be present.
*/
public class RowField {
    private final String field;
    private final String valueType;
    private final String valueString;

    public RowField(String field, String valueType, String valueString) {
        this.field = field;
        this.valueType = valueType;
        this.valueString = valueString;
    }

    public String getField() {
        return field;
    }

    public String getValueType() {
        return valueType;
    }

    public String getValueString() {
        return valueString;
    }

    public static RowField fromMap(Map map){
        ParseUtils.ensureMapContainsKeys(map, "Field", "ValueType", "ValueString");

        String field = (String)map.get("Field");
        String valueType = (String)map.get("ValueType");
        String valueString = (String)map.get("ValueString");

        return new RowField(field, valueType, valueString);
    }

    @Override
    public String toString() {
        return "RowField [field=" + field + ", valueType=" + valueType + ", valueString=" + valueString + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((field == null) ? 0 : field.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RowField other = (RowField) obj;
        if (field == null) {
            if (other.field != null)
                return false;
        } else if (!field.equals(other.field))
            return false;
        return true;
    }
    
    
}
