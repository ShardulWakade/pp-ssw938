package visitors;

import java.util.*;

import antlrgen.*;
import antlrgen.SimpleLangParser.ProjectContext;

public class EntryChecker extends SimpleLangBaseVisitor<Boolean>{
    
    /*
     * Will return true if there is a valid entry function in this project.
     * Returns false otherwise.
     */
    @Override
    public Boolean visitProject(ProjectContext ctx) {
        List<SimpleLangParser.MethoddeclContext> methods = ctx.methoddecl();

        if(methods == null || methods.size() == 0){
            return false;
        }

        for(SimpleLangParser.MethoddeclContext method : methods){
            if(method != null && method.ID().getText().equals("entry") && 
                    method.returntype().getText().equals("void") && method.formalparams() == null){
                return true;
            }
        }

        return false;
    }
}
