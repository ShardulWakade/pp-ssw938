package visitors;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import antlrgen.SimpleLangBaseVisitor;
import antlrgen.SimpleLangParser.ClassdeclContext;
import antlrgen.SimpleLangParser.DesignatorContext;
import antlrgen.SimpleLangParser.DesignatorFactorContext;
import antlrgen.SimpleLangParser.DesignatorFunctionCallContext;
import antlrgen.SimpleLangParser.ExprContext;
import antlrgen.SimpleLangParser.MethoddeclContext;
import antlrgen.SimpleLangParser.StatementContext;
import structure.ScopeTree;
import structure.SimpleClass;
import structure.SimpleClassMethod;
import structure.Types;

public class DeclareCheckVisitor extends SimpleLangBaseVisitor<Void> {
    
    private ScopeTree scopeTree;
    private Types types;

    private SimpleClass currentClass = null;
    private SimpleClassMethod currentLocals = null;

    public DeclareCheckVisitor(ScopeTree scopeTree, Types types){
        this.scopeTree = scopeTree;
        this.types = types;
    }

    @Override
    public Void visitClassdecl(ClassdeclContext ctx) {
        currentClass = scopeTree.getClassFromName(ctx.ID().getText());
        currentClass.getVarNames().add("this");
        visitChildren(ctx);
        currentClass = null;
    
        return null;
    }

    @Override
    public Void visitMethoddecl(MethoddeclContext ctx) {
        
        currentLocals = SimpleClassMethod.createFromContextNoErrors("", ctx, types);
        visitChildren(ctx);
        currentLocals = null;

        return null;
    }

    @Override
    public Void visitDesignatorFactor(DesignatorFactorContext ctx) {

        if(isTooComplex(ctx.designator())){ // If designator is too complicated, don't bother
            visitChildren(ctx);
            return null;
        }

        // if it is a function call
        if(ctx.functioncall() != null){
            searchForFunctionCall(ctx.designator().ID(0).getText());

            // Be sure to NOT treat designator as a variable since it is a function
            visit(ctx.functioncall());
            visitExpressionList(ctx.designator().expr());
        } 
        else {
            visit(ctx.designator());
        }
        return null;
    }

    @Override
    public Void visitDesignatorFunctionCall(DesignatorFunctionCallContext ctx) {

        // Confirm that everything in the designator itself has meaning
        if(isTooComplex(ctx.designator())){
            visitChildren(ctx);
            return null;
        }

        searchForFunctionCall(ctx.designator().ID(0).getText());
        
        // Be sure to NOT treat designator as a variable since it is a function. so we dont visit the designator.
        visit(ctx.functioncall());
        visitExpressionList(ctx.designator().expr());        

        return null;
    }

    private void visitExpressionList(List<ExprContext> exprs){
        if(exprs != null){
            for(ExprContext c : exprs){
                visit(c);
            }
        }
    }

    // This will simply check if the first ID in the designator has been declared before
    @Override
    public Void visitDesignator(DesignatorContext ctx) {
        if(isTooComplex(ctx)){
            if(!types.hasType(ctx.ID(0).getText())){
                confirmVariableExists(ctx.ID(0).getText()); // Only worry about the first one. Rest is too complex without proper type system.
            }
        } else {
            confirmVariableExists(ctx.ID(0).getText());
        }

        visitExpressionList(ctx.expr());
        return null;
    }

    private void searchForFunctionCall(String methodName){
        // see if in clas scope
        if(currentClass != null){
            if(currentClass.hasMethodDeepName(methodName)){
                return;
            }
        }

        // search globals o.w.
        for(SimpleClassMethod method : scopeTree.getGlobalMethods()){
            if(method.getMethodName().equals(methodName)){
                return;
            }
        }

        System.out.println("NAME USE ERROR : No function call found for " + methodName);
    }

    private static boolean isTooComplex(DesignatorContext context){
        return context.ID().size() > 1 || (context.expr() != null && !context.expr().isEmpty());
    }
    
    private void confirmVariableExists(String id){
        if(types.hasType(id)){
            return;
        }
        if(currentLocals.getLocalVarNames().contains(id)){
            return;
        }

        if(currentClass != null && currentClass.hasVarNameDeep(id)){
            return;
        }

        if(scopeTree.getGlobalVarNames().contains(id)){
            return;
        }

        // Otherwise error: 
        System.out.println("VAR ERROR : Variable not previously declared : " + id);
    }

}
