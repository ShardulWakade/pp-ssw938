package structure;

import java.util.ArrayList;

public class SimpleClass implements Named {
    private SimpleClass parent;
    private String className;
    private ArrayList<String> varNames;
    private ArrayList<SimpleMethod> methods;

    public SimpleClass(String className, ArrayList<String> varNames, ArrayList<SimpleMethod> methods){
        this(null, className, varNames, methods);
    }

    public SimpleClass(SimpleClass parent, String className, ArrayList<String> varNames, ArrayList<SimpleMethod> methods) {
        this.parent = parent;
        this.className = className;
        this.varNames = varNames;
        this.methods = methods;
    }

    public boolean hasVarName(String name){
        return varNames.contains(name);
    }

    // Checks across the whole inheritance heirarchy
    public boolean hasVarNameDeep(String name){
        if(hasVarName(name)){
            return true;
        }

        return parent != null && parent.hasVarNameDeep(name);
    }

    public boolean hasMethod(SimpleMethod method){
        return methods.contains(method);
    }

    // Does not search interfaces as interfaces do not contain implementation. So cant use that function anyways.
    public boolean hasMethodDeep(SimpleMethod method){
        if(hasMethod(method)){
            return true;
        }

        return parent != null && parent.hasMethodDeep(method);
    }

    public String getName() {
        return className;
    }

    public ArrayList<SimpleMethod> getMethods() {
        return methods;
    }
    
    public ArrayList<String> getVarNames() {
        return varNames;
    }

    public SimpleClass getParent() {
        return parent;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((className == null) ? 0 : className.hashCode());
        return result;
    }

    // Only based on class name since nesting is not allowed
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SimpleClass other = (SimpleClass) obj;
        if (className == null) {
            if (other.className != null)
                return false;
        } else if (!className.equals(other.className))
            return false;
        return true;
    }
}