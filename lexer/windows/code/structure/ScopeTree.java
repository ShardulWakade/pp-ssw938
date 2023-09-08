package structure;

import java.util.ArrayList;

public class ScopeTree {
    public ArrayList<SimpleClassMethod> globalMethods = new ArrayList<>();
    public ArrayList<String> globalVarNames = new ArrayList<>();
    public ArrayList<SimpleClass> classes = new ArrayList<>();
    public ArrayList<SimpleEnum> enums = new ArrayList<>();
    public ArrayList<SimpleInterface> interfaces = new ArrayList<>();

    public ArrayList<SimpleClassMethod> getGlobalMethods() {
        return globalMethods;
    }

    public ArrayList<String> getGlobalVarNames() {
        return globalVarNames;
    }

    public boolean addGlobalMethod(SimpleClassMethod method){
        return globalMethods.add(method);
    }

    public boolean hasGlobalMethod(SimpleClassMethod method){
        return globalMethods.contains(method);
    }

    public boolean addGlobalVarName(String varName){
        return globalVarNames.add(varName);
    }

    public boolean hasGlobalVarName(String varName){
        return globalVarNames.add(varName);
    }

    public boolean addClass(SimpleClass clazz){
        return classes.add(clazz);
    }

    public boolean addInterface(SimpleInterface inter){
        return interfaces.add(inter);
    }

    public boolean addEnum(SimpleEnum en){
        return enums.add(en);
    }

    public ArrayList<SimpleClass> getClasses() {
        return classes;
    }

    public ArrayList<SimpleEnum> getEnums() {
        return enums;
    }

    public ArrayList<SimpleInterface> getInterfaces() {
        return interfaces;
    }

    private <T extends Named> T getFromName(String name, ArrayList<T> stuff){
        for(T t : stuff){
            if(t.getName().equals(name)){
                return t;
            }
        }
        return null;
    }

    public SimpleClass getClassFromName(String name){
        return getFromName(name, classes);
    }

    public SimpleEnum getEnumFromName(String name){
        return getFromName(name, enums);
    }

    public SimpleInterface getInterfaceFromName(String name){
        return getFromName(name, interfaces);
    }

    public boolean hasClass(String name){
        return getClassFromName(name) != null;
    }

    public boolean hasEnum(String name){
        return getEnumFromName(name) != null;
    }

    public boolean hasInterface(String name){
        return getInterfaceFromName(name) != null;
    }

    public boolean hasType(String name){
        return hasClass(name) || hasEnum(name) || hasInterface(name);
    }

    @Override
    public String toString() {
        return "ScopeTree [\nglobalMethods=" + globalMethods + "\n\n\nglobalVarNames=" + globalVarNames + "\n\n\nclasses="
                + classes + "\n\n\nenums=" + enums + "\n\n\ninterfaces=" + interfaces + "\n]";
    }

}
