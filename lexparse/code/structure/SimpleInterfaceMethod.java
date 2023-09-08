package structure;

import java.util.*;

import antlrgen.SimpleLangParser.FormalparamsContext;
import antlrgen.SimpleLangParser.InterfacedeclContext;
import antlrgen.SimpleLangParser.InterfacemethoddeclContext;
import antlrgen.SimpleLangParser.SinglevardeclContext;
import antlrgen.SimpleLangParser.TypeContext;
import visitors.GlobalsListener;

public class SimpleInterfaceMethod {
    private String enclosingScopeName;
    private String methodName;
    private String returnType;
    private ArrayList<String> args;

    // Takes the enclopsingScope, context and types(for error checking), to create a SimpleInterfaceMethod.
    public static SimpleInterfaceMethod createFromContext(String enclosingScope, InterfacemethoddeclContext context, Types types){
        String returnType = context.returntype().getText();
        String methodName = context.ID().getText();
        
        ArrayList<String> args = new ArrayList<>();
        ArrayList<String> argTypes = new ArrayList<>();

        FormalparamsContext formalParams = context.formalparams();
        if(formalParams != null){
            List<TypeContext> typeContext = formalParams.type();
            List<SinglevardeclContext> varName = formalParams.singlevardecl();

            for(int i = 0; i < typeContext.size(); i++){
                String currentType = typeContext.get(i).getText();
                String currentId = varName.get(i).ID().getText();

                if(varName.get(i).getText().trim().endsWith("]")){
                    currentType += "[]";
                }
                argTypes.add(currentType);        
                if(GlobalsListener.isUniqueName(currentId, types, args)){
                    args.add(currentId);
                }
            }
        }

        return new SimpleInterfaceMethod(enclosingScope, returnType, methodName, argTypes);
    }

    public SimpleInterfaceMethod(String returnType, String methodName, ArrayList<String> args){
        this("", returnType,  methodName, args);
    }

    public SimpleInterfaceMethod(String enclosingScopeName, String returnType, String methodName, ArrayList<String> args){
        this.enclosingScopeName = enclosingScopeName;
        this.methodName = methodName;
        this.returnType = returnType;
        this.args = args;
    }

    public String getEnclosingScopeName() {
        return enclosingScopeName;
    }

    public ArrayList<String> getArgs() {
        return args;
    }

    public String getMethodName() {
        return methodName;
    }

    public boolean isGlobal(){
        return this.enclosingScopeName.equals("");
    }

    public String getReturnType() {
        return returnType;
    }

    // Auto Generated by VS Code
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((enclosingScopeName == null) ? 0 : enclosingScopeName.hashCode());
        result = prime * result + ((methodName == null) ? 0 : methodName.hashCode());
        result = prime * result + ((args == null) ? 0 : args.hashCode());
        return result;
    }

    // Auto Generated by VS Code
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SimpleInterfaceMethod other = (SimpleInterfaceMethod) obj;
        if (enclosingScopeName == null) {
            if (other.enclosingScopeName != null)
                return false;
        } else if (!enclosingScopeName.equals(other.enclosingScopeName))
            return false;
        if (methodName == null) {
            if (other.methodName != null)
                return false;
        } else if (!methodName.equals(other.methodName))
            return false;
        if (args == null) {
            if (other.args != null)
                return false;
        } else if (!args.equals(other.args))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SimpleInterfaceMethod [enclosingScopeName=" + enclosingScopeName + ", methodName=" + methodName
                + ", returnType=" + returnType + "\n\t\t\t, args=" + args + "]";
    }

    public String getSignature(){
        return returnType + " " + enclosingScopeName + "::" + methodName + args;
    }

}
