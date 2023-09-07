package visitors;

import java.sql.Array;
import java.util.*;

import org.antlr.v4.runtime.tree.TerminalNode;

import antlrgen.*;
import antlrgen.SimpleLangParser.BoolConstDeclContext;
import antlrgen.SimpleLangParser.CharConstDeclContext;
import antlrgen.SimpleLangParser.ClassdeclContext;
import antlrgen.SimpleLangParser.EnumdeclContext;
import antlrgen.SimpleLangParser.FormalparamsContext;
import antlrgen.SimpleLangParser.IntConstDeclContext;
import antlrgen.SimpleLangParser.InterfacemethoddeclContext;
import antlrgen.SimpleLangParser.MethoddeclContext;
import antlrgen.SimpleLangParser.NumdeclContext;
import antlrgen.SimpleLangParser.ProjectConstDeclContext;
import antlrgen.SimpleLangParser.ProjectVarDeclContext;
import antlrgen.SimpleLangParser.SinglevardeclContext;
import antlrgen.SimpleLangParser.VardeclContext;
import structure.Types;

// Assuming that variable shadowing does exist.
public class VarNameClashListener extends SimpleLangBaseListener {
    
    private HashSet<String> globalVarNames = new HashSet<>();
    private Types types;

    public VarNameClashListener(Types types){
        this.types = types;
    }

    public HashSet<String> retrieveGlobalVarNames(){
        return globalVarNames;
    }

    private void tryAdd(String idStr, Collection<String> c){
        if(types.hasType(idStr)){
            System.out.println("NAME ERROR : " + idStr + " is already a type.");
        } 
        else if(c.contains(idStr)){
            System.out.println("NAME ERROR : " + idStr + " is already a variable.");
        }
        else {
            c.add(idStr);
        }
    }

    private void tryAddTerminals(List<TerminalNode> ids){
        if(ids == null) return;

        for(TerminalNode id : ids){
            tryAdd(id.getText(), globalVarNames);
        }
    }

    @Override
    public void enterIntConstDecl(IntConstDeclContext ctx) {
        tryAddTerminals(ctx.ID());
    }

    @Override
    public void enterCharConstDecl(CharConstDeclContext ctx) {
        tryAddTerminals(ctx.ID());
    }

    @Override
    public void enterBoolConstDecl(BoolConstDeclContext ctx) {
        tryAddTerminals(ctx.ID());
    }

    @Override
    public void enterProjectVarDecl(ProjectVarDeclContext ctx) {
        VardeclContext vardecl = ctx.vardecl();
        if(vardecl != null){
            processVarDecls(vardecl.singlevardecl(), globalVarNames);
        }
    }

    @Override
    public void enterEnumdecl(EnumdeclContext ctx) {
        ArrayList<String> enumNames = new ArrayList<>();

        List<NumdeclContext> context = ctx.numdecl();
        if(context == null) return;

        for(NumdeclContext c : context){
            String idStr = c.ID().getText();
            if(enumNames.contains(idStr)){
                System.out.println("NAME ERROR : Redefinition in enum : " + idStr);
            } 
            else {
                enumNames.add(idStr);
            }
        }
    }

    private void processVarDecls(List<SinglevardeclContext> singleVardecls, Collection<String> existingNames){
        if(singleVardecls == null){ return; }

        for(SinglevardeclContext context : singleVardecls){
            tryAdd(context.ID().getText(), existingNames);
        }
    }

    @Override
    public void enterClassdecl(ClassdeclContext ctx) {
        List<VardeclContext> vardecls = ctx.vardecl();
        ArrayList<String> existingVariables = new ArrayList<>();

        for(VardeclContext vdc : vardecls){
            processVarDecls(vdc.singlevardecl(), existingVariables);
        }
    }

    @Override
    public void enterMethoddecl(MethoddeclContext ctx) {
        // first add formal params to existing names.
        // Then add vardecls to the existing names.

        ArrayList<String> existingNames = new ArrayList<>();
        
        FormalparamsContext context = ctx.formalparams();
        if(context != null){
            processVarDecls(context.singlevardecl(), existingNames);
        }

        List<VardeclContext> vardeclContexts = ctx.vardecl();
        if(vardeclContexts != null){
            for(VardeclContext var : vardeclContexts){
                processVarDecls(var.singlevardecl(), existingNames);
            }
        }
    }

    @Override
    public void enterInterfacemethoddecl(InterfacemethoddeclContext ctx) {
        ArrayList<String> existingNames = new ArrayList<>();
        FormalparamsContext context = ctx.formalparams();
        if(context != null){
            processVarDecls(context.singlevardecl(), existingNames);
        }
    }

}
