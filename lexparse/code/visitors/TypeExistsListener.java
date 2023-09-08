package visitors;

import antlrgen.SimpleLangBaseListener;
import antlrgen.SimpleLangParser.FormalparamsContext;
import antlrgen.SimpleLangParser.NonVoidReturnContext;
import antlrgen.SimpleLangParser.TypeContext;
import antlrgen.SimpleLangParser.VardeclContext;
import structure.Types;

import java.util.*;

// Checks whether all types in a program used to declare a variable (e.g. int a = 10;)
// actually exist or whether the user is just bluffing a type (e.g. MyInTeGER a = 10;)  (MyInTeGER isn't actually a thing)
// doesn't return anything but just prints out error message on failure.
public class TypeExistsListener extends SimpleLangBaseListener {
    
    private Types types;

    public TypeExistsListener(Types types) {
        this.types = types;
    }

    @Override
    public void enterVardecl(VardeclContext ctx) {
        String typeStr = ctx.type().getText();
        if(!types.hasType(typeStr)){
            System.out.println("TYPE ERROR : Type " + typeStr + " does not exist");
        }
    }

    @Override
    public void enterNonVoidReturn(NonVoidReturnContext ctx) {
        String typeStr = ctx.type().getText();
        if(!types.hasType(typeStr)){
            System.out.println("TYPE ERROR : Type " + typeStr + " does not exist");
        }
    }

    @Override
    public void enterFormalparams(FormalparamsContext ctx) {
        List<TypeContext> typeContexts = ctx.type();
        if(typeContexts != null){
            for(TypeContext ty : typeContexts){
                String typeStr = ty.getText();
                if(!types.hasType(typeStr)){
                    System.out.println("TYPE ERROR : Type " + typeStr + " does not exist");
                }
            }
        }
    }
}
