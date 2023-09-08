package structure;

import java.util.*;

public class SimpleEnum implements Named{
    private String enumName;
    private ArrayList<String> varNames;

    public SimpleEnum(String enumName, ArrayList<String> varNames){
        this.enumName = enumName;
        this.varNames = varNames;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((enumName == null) ? 0 : enumName.hashCode());
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
        SimpleEnum other = (SimpleEnum) obj;
        if (enumName == null) {
            if (other.enumName != null)
                return false;
        } else if (!enumName.equals(other.enumName))
            return false;
        return true;
    }

    @Override
    public String getName() {
        return enumName;
    }

    public ArrayList<String> getVarNames() {
        return varNames;
    }

    public boolean hasVarName(String name){
        return varNames.contains(name);
    }

    @Override
    public String toString() {
        return "SimpleEnum [enumName=" + enumName + ", varNames=" + varNames + "]";
    }
}
