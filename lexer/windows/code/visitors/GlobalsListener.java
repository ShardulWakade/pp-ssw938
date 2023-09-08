package visitors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import antlrgen.SimpleLangBaseListener;
import antlrgen.SimpleLangBaseVisitor;
import antlrgen.SimpleLangParser.BoolConstDeclContext;
import antlrgen.SimpleLangParser.CharConstDeclContext;
import antlrgen.SimpleLangParser.ClassdeclContext;
import antlrgen.SimpleLangParser.ClassextContext;
import antlrgen.SimpleLangParser.EnumdeclContext;
import antlrgen.SimpleLangParser.IntConstDeclContext;
import antlrgen.SimpleLangParser.InterfacedeclContext;
import antlrgen.SimpleLangParser.InterfaceimplContext;
import antlrgen.SimpleLangParser.InterfacemethoddeclContext;
import antlrgen.SimpleLangParser.MethoddeclContext;
import antlrgen.SimpleLangParser.NumdeclContext;
import antlrgen.SimpleLangParser.ProjectContext;
import antlrgen.SimpleLangParser.ProjectVarDeclContext;
import antlrgen.SimpleLangParser.SinglevardeclContext;
import antlrgen.SimpleLangParser.StatementContext;
import antlrgen.SimpleLangParser.VardeclContext;
import structure.ScopeTree;
import structure.SimpleClass;
import structure.SimpleClassMethod;
import structure.SimpleEnum;
import structure.SimpleInterface;
import structure.SimpleInterfaceMethod;
import structure.Types;

// Will visit all global variables in our program and add them to ScopeTree
// Will also create enums in the scope tree.
public class GlobalsListener extends SimpleLangBaseListener {

    public static boolean isUniqueName(String idStr, Types types, Collection<String> c){
        if(types.hasType(idStr)){
            System.out.println("NAME ERROR : " + idStr + " is already a type.");
            return false;
        } 
        else if(c.contains(idStr)){
            System.out.println("NAME ERROR : " + idStr + " is already a variable.");
            return false;
        }
        return true;
    }

    private Types types;
    private ScopeTree tree;

    public ScopeTree getTree(){
        return tree;
    }

    public GlobalsListener(Types types, ScopeTree tree){
        this.tree = tree;
        this.types = types;
    }

    private void tryAdd(String idStr){
        if(isUniqueName(idStr, types, tree.getGlobalVarNames())){
            tree.addGlobalVarName(idStr);
        }
    }

    private void tryAddTerminals(List<TerminalNode> ids){
        if(ids == null) return;

        for(TerminalNode id : ids){
            tryAdd(id.getText());
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

    private void processVarDecls(List<SinglevardeclContext> singleVardecls){
        if(singleVardecls == null){ return; }

        for(SinglevardeclContext context : singleVardecls){
            tryAdd(context.ID().getText());
        }
    }

    @Override
    public void enterProject(ProjectContext ctx) {
        
        List<MethoddeclContext> globalMethods = ctx.methoddecl();

        if(globalMethods != null){
            for(MethoddeclContext context : globalMethods){
                SimpleClassMethod method = SimpleClassMethod.createFromContext("", context, types);
                if(tree.hasGlobalMethod(method)){
                    System.out.println("ERROR : Duplicate method signature in same scope " + method.getSignature());
                } else {
                    tree.addGlobalMethod(method);
                }
            }
        }
    }

    @Override
    public void enterProjectVarDecl(ProjectVarDeclContext ctx) {
        VardeclContext vardecl = ctx.vardecl();
        if(vardecl != null){
            processVarDecls(vardecl.singlevardecl());
        }
    }

    @Override
    public void enterEnumdecl(EnumdeclContext ctx) {
        if(tree.hasType(ctx.ID().getText())){
            System.out.println("Ignoring enum " + ctx.ID().getText() + " as another type with same name was found");
            return;
        }

        ArrayList<String> enumNames = new ArrayList<>();

        List<NumdeclContext> context = ctx.numdecl();
        if(context != null) {
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

        SimpleEnum simpleEnum = new SimpleEnum(ctx.ID().getText(), enumNames);
        tree.addEnum(simpleEnum);
    }

    @Override
    public void enterInterfacedecl(InterfacedeclContext ctx) {
        String intName = ctx.ID().getText();
        if(tree.hasType(intName)){
            System.out.println("Ignoring interface " + intName + " as another type with same name was found");
        }

        List<InterfacemethoddeclContext> methods = ctx.interfacemethoddecl();
        ArrayList<SimpleInterfaceMethod> interfaceMethods = new ArrayList<>();
        if(methods != null){
            for(InterfacemethoddeclContext context : methods){
                SimpleInterfaceMethod siMethod = SimpleInterfaceMethod.createFromContext(intName, context, types);
                if(interfaceMethods.contains(siMethod)){
                    System.out.println("ERROR : Duplicate method signature in same scope " + siMethod.getSignature());
                } else {
                    interfaceMethods.add(siMethod);
                }
            }
        }

        SimpleInterface simpleInterface = new SimpleInterface(intName, interfaceMethods);
        tree.addInterface(simpleInterface);
    }

    @Override
    public void enterClassdecl(ClassdeclContext ctx) {
        // Classname
        String className = ctx.ID().getText();
        SimpleClass parentClass = null;
        ArrayList<SimpleInterface> parentInterfaces = new ArrayList<>();

        if(tree.hasType(className)){
            System.out.println("Ignoring class " + className + " as another type with same name was found");
            return;
        }
        
        // Parent Class
        ClassextContext extension = ctx.classext();
        if(extension != null){
            parentClass = tree.getClassFromName(extension.ID().getText()); // returns null if not found.
        }

        // Parent interfaces
        InterfaceimplContext impls = ctx.interfaceimpl();
        if(impls != null){
            List<TerminalNode> IDS = impls.ID();
            if(IDS != null){
                for(TerminalNode ID : IDS){
                    SimpleInterface i = tree.getInterfaceFromName(ID.getText());
                    if(i != null){
                        parentInterfaces.add(i);
                    }
                }
            }
        }
        
        // Instance Variables

        ArrayList<String> classVarNames = new ArrayList<>();
        List<VardeclContext> vardecls = ctx.vardecl();
        
        if(vardecls != null){
            for(VardeclContext lineDecl : vardecls){
                List<SinglevardeclContext> individualNames = lineDecl.singlevardecl();
                if(individualNames != null){
                    for(SinglevardeclContext id : individualNames){
                        if(isUniqueName(id.getText(), types, classVarNames)){
                            classVarNames.add(id.getText());
                        }
                        else {
                            System.out.println("NAME ERROR : " + className + "." + id.getText() + " already exists!");
                        }
                    }
                }
            }
        }

        // Instance methods

        ArrayList<SimpleClassMethod> instanceMethods = new ArrayList<>();

        List<MethoddeclContext> methods = ctx.methoddecl();
        if(methods != null){
            for(MethoddeclContext method : methods){
                SimpleClassMethod siMethod = SimpleClassMethod.createFromContext(className, method, types);
                if(instanceMethods.contains(siMethod)){
                    System.out.println("ERROR : Duplicate method signature in same scope " + siMethod.getSignature());
                } else {
                    instanceMethods.add(siMethod);
                }
            }
        }

        SimpleClass clazz = new SimpleClass(parentClass, className, classVarNames, instanceMethods);
        tree.addClass(clazz);
    }


}
