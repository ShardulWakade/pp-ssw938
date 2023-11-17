package dbtype;

import java.util.Map;

import org.json.simple.JSONObject;

import main.FancyString;

/*
 // Relationship represents a relationship in the neo4j graph database
    type Relationship struct {
        // Deprecated: Id is deprecated and will be removed in 6.0. Use ElementId instead.
        Id        int64  // Id of this Relationship.
        ElementId string // ElementId of this Relationship.
        // Deprecated: StartId is deprecated and will be removed in 6.0. Use StartElementId instead.
        StartId        int64  // Id of the start Node of this Relationship.
        StartElementId string // ElementId of the start Node of this Relationship.
        // Deprecated: EndId is deprecated and will be removed in 6.0. Use EndElementId instead.
        EndId        int64          // Id of the end Node of this Relationship.
        EndElementId string         // ElementId of the end Node of this Relationship.
        Type         string         // Type of this Relationship.
        Props        map[string]any // Properties of this Relationship.
    } 
 */

public class Relationship implements FancyString {

    public static Relationship FromMap(Map map) {
        ParseUtils.ensureMapContainsKeys(map, "Id", "ElementId", "StartId", "StartElementId", "EndId", "EndElementId", "Type", "Props");

        Long Id = (Long)map.get("Id");
        String ElementId = (String)map.get("ElementId");
        Long StartId = (Long)map.get("StartId");
        String StartElementId = (String)map.get("StartElementId");
        Long EndId = (Long)map.get("EndId");
        String EndElementId = (String)map.get("EndElementId");
        String Type = (String)map.get("Type");
        Map<String, Object> Props = ParseUtils.JSONObjectToMap((JSONObject)map.get("Props"));

        return new Relationship(Id, ElementId, StartId, StartElementId, EndId, EndElementId, Type, Props);
    }
    
    private final Long Id;
    private final String ElementId;
    private final Long StartId;
    private final String StartElementId;
    private final Long EndId;
    private final String EndElementId;
    private final String Type;
    private final Map<String, Object> Props;

    public Relationship(Long id, String elementId, Long startId, String startElementId, Long endId, String endElementId,
            String type, Map<String, Object> props) {
        Id = id;
        ElementId = elementId;
        StartId = startId;
        StartElementId = startElementId;
        EndId = endId;
        EndElementId = endElementId;
        Type = type;
        Props = props;
    }

    public Long getId() {
        return Id;
    }
    public String getElementId() {
        return ElementId;
    }
    public Long getStartId() {
        return StartId;
    }
    public String getStartElementId() {
        return StartElementId;
    }
    public Long getEndId() {
        return EndId;
    }
    public String getEndElementId() {
        return EndElementId;
    }
    public String getType() {
        return Type;
    }
    public Map<String, Object> getProps() {
        return Props;
    }

    @Override
    public String toString() {
        return "Relationship [Id=" + Id + ", ElementId=" + ElementId + ", StartId=" + StartId + ", StartElementId="
                + StartElementId + ", EndId=" + EndId + ", EndElementId=" + EndElementId + ", Type=" + Type + ", Props="
                + Props + "]";
    }

    @Override
    public String fancy(int level) {
        if(level <= FancyString.BRIEF){
            return "Edge";
        }
        if(level <= FancyString.DEFAULT){
            return "Edge[:" + Type + "]";
        }
        // This means highest level i.e most detail.
        return "Edge[:" + Type + " {" + ParseUtils.propsString(Props) + "}]";
    }

}
