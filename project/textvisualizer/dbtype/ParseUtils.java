package dbtype;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

// utility class for parsing stuff
// Doesn't really need to be visible outside this package
class ParseUtils {

    public static String labelsString(List<String> Labels){
        final StringBuilder sb = new StringBuilder();
        Labels.stream().forEach(s -> sb.append(":" + s));
        return sb.toString();
    }

   public static String propsString(Map<String, Object> Props){
        if(Props.isEmpty()){
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        
        Iterator<Map.Entry<String, Object>> iter = Props.entrySet().iterator();
        Map.Entry<String, Object> elem = iter.next();   // We know props can't be empty here
        sb.append(elem.getKey() + ": " + elem.getValue());

        while(iter.hasNext()){
            elem = iter.next();
            sb.append(", " + elem.getKey() + ": " + elem.getValue());
        }

        return sb.toString();
    }

    public static void ensureMapContainsKeys(Map map, String... keys) {
        for(String key : keys){
            CorruptJSONException.throwIf(!map.containsKey(key), "Map doesn't contain " + key + " : Map -> " + map);
        }
    }

    // The idea of these functions is to do type checking and only then send back the actual list.
    // For now, just sending it back as raw.
    public static <T> List<T> JSONArrayToList(JSONArray arr) {
        return arr;
    }

    public static <T, U> Map<T, U> JSONObjectToMap(JSONObject jsonObject) {
        return jsonObject;
    }
    
}
