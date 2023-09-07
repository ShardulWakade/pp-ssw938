package structure;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTree;

import visitors.ClassTypeVisitor;
import visitors.EnumInterfaceTypeVisitor;

public class Types {
    public static final List<String> BUILT_IN_TYPES = new ArrayList<>(){{ add("int"); add("char"); add("boolean"); }};

    private Set<String> enums = new HashSet<>();
    private Set<String> interfaces = new HashSet<>();
    private Set<String> classes = new HashSet<>();

    public Types(){
    }

    public boolean addEnum(String name){
        return enums.add(name);
    }

    public boolean addInterface(String name){
        return interfaces.add(name);
    }

    public boolean addClass(String name){
        return classes.add(name);
    }

    public void fillFromParseTree(ParseTree parseTree){
        EnumInterfaceTypeVisitor enumAndInterfaceVisitor = new EnumInterfaceTypeVisitor(this);
        enumAndInterfaceVisitor.visit(parseTree);

        // also checks for inheritance issues
        ClassTypeVisitor classVisitor = new ClassTypeVisitor(this);
        classVisitor.visit(parseTree);
    }

    public boolean hasClass(String name){
        return classes.contains(name);
    }

    public boolean hasInterface(String name){
        return interfaces.contains(name);
    }

    public boolean hasEnum(String name){
        return enums.contains(name);
    }

    public boolean hasType(String name){
        return hasClass(name) || hasEnum(name) || hasInterface(name) || isBuiltIn(name);
    }

    public static boolean isBuiltIn(String type){
        return BUILT_IN_TYPES.contains(type);
    }

    @Override
    public String toString() {
        return "Types [enums=" + enums + ", interfaces=" + interfaces + ", classes=" + classes + "]";
    }

    
}
