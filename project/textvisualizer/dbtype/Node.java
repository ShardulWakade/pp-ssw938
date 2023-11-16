package dbtype;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*
 * // Node represents a node in the neo4j graph database
 *  type Node struct {
 *	    // Deprecated: Id is deprecated and will be removed in 6.0. Use ElementId instead.
 *	    Id        int64          // Id of this Node.
 *	    ElementId string         // ElementId of this Node.
 *	    Labels    []string       // Labels attached to this Node.
 *	    Props     map[string]any // Properties of this Node.
 *  }
 */

/*
*   A node is a graph node with attributes as given in db.types from golang.
*/
public class Node {

    public static Node FromMap(Map map) {
        ParseUtils.ensureMapContainsKeys(map, "Id", "ElementId", "Labels", "Props");

        Long id = (Long)map.get("Id");
        String ElementId = (String)map.get("ElementId");
        List<String> labels = ParseUtils.JSONArrayToList((JSONArray)map.get("Labels"));
        Map<String, Object> props = ParseUtils.JSONObjectToMap((JSONObject)map.get("Props"));

        return new Node(id, ElementId, labels, props);
    }

    private final Long Id;
    private final String ElementId;
    private final List<String> Labels;
    private final Map<String, Object> Props;

    public Node(Long id, String elementId, List<String> labels, Map<String, Object> props) {
        Id = id;
        ElementId = elementId;
        Labels = labels;
        Props = props;
    }

    public Long getId() {
        return Id;
    }

    public String getElementId() {
        return ElementId;
    }

    public List<String> getLabels() {
        return Labels;
    }

    public Map<String, Object> getProps() {
        return Props;
    }

}
