package structure;

import java.util.ArrayList;
import java.util.List;

import antlrgen.SimpleLangParser.FormalparamsContext;
import antlrgen.SimpleLangParser.InterfacemethoddeclContext;
import antlrgen.SimpleLangParser.MethoddeclContext;
import antlrgen.SimpleLangParser.SinglevardeclContext;
import antlrgen.SimpleLangParser.TypeContext;
import antlrgen.SimpleLangParser.VardeclContext;
import visitors.GlobalsListener;

public class SimpleClassMethod extends SimpleInterfaceMethod {
    private ArrayList<String> localVarNames;
    
    public static SimpleClassMethod createFromContextNoErrors(String enclosingScope, MethoddeclContext context, Types types){
        String returnType = context.returntype().getText();
        String methodName = context.ID().getText();

        ArrayList<String> localVarNames = new ArrayList<>();
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
                if(!types.hasType(currentId) && !localVarNames.contains(currentId)){
                    localVarNames.add(currentId);
                }
            }
        }

        // Local variables

        List<VardeclContext> localVars = context.vardecl();
        if(localVars != null){
            for(VardeclContext localVarLine : localVars){
                List<SinglevardeclContext> singles = localVarLine.singlevardecl();
                if(singles != null){
                    for(SinglevardeclContext single : singles){
                        String idString = single.ID().getText();
                        if(!types.hasType(idString) && !localVarNames.contains(idString)){
                            localVarNames.add(idString);
                        }
                    }
                }
            }
        }

        SimpleClassMethod classMethod = new SimpleClassMethod(enclosingScope, returnType, methodName, argTypes, localVarNames);
        return classMethod;
    }

    public static SimpleClassMethod createFromContext(String enclosingScope, MethoddeclContext context, Types types){
        String returnType = context.returntype().getText();
        String methodName = context.ID().getText();

        ArrayList<String> localVarNames = new ArrayList<>();
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
                if(GlobalsListener.isUniqueName(currentId, types, localVarNames)){
                    localVarNames.add(currentId);
                }
            }
        }

        // Local variables

        List<VardeclContext> localVars = context.vardecl();
        if(localVars != null){
            for(VardeclContext localVarLine : localVars){
                List<SinglevardeclContext> singles = localVarLine.singlevardecl();
                if(singles != null){
                    for(SinglevardeclContext single : singles){
                        String idString = single.ID().getText();
                        if(GlobalsListener.isUniqueName(idString, types, localVarNames)){
                            localVarNames.add(idString);
                        }
                    }
                }
            }
        }

        SimpleClassMethod classMethod = new SimpleClassMethod(enclosingScope, returnType, methodName, argTypes, localVarNames);
        return classMethod;
    }

    public SimpleClassMethod(String returnType, String methodName, ArrayList<String> args, ArrayList<String> localVars ){
        this("", returnType, methodName, args, localVars);
    }

    public SimpleClassMethod(String enclosingScope, String returnType, String methodName, ArrayList<String> args, ArrayList<String> localVars){
        super(enclosingScope, returnType, methodName, args);
        this.localVarNames = localVars;
    }

    public ArrayList<String> getLocalVarNames() {
        return localVarNames;
    }

    public boolean hasVarName(String name){
        return localVarNames.contains(name);
    }

    @Override
    public String toString() {
        return "SimpleClassMethod [localVarNames=" + localVarNames + "\n\t\t\t" + super.toString() + "]\n\t\t\t";
    }

    // equals inherited implicitly
}
