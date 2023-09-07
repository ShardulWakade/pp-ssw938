package visitors;

import org.antlr.v4.runtime.tree.TerminalNode;

import antlrgen.*;
import antlrgen.SimpleLangParser.ClassdeclContext;
import antlrgen.SimpleLangParser.ClassextContext;
import antlrgen.SimpleLangParser.InterfaceimplContext;
import structure.*;

import java.util.*;

public class ClassTypeVisitor extends SimpleLangBaseVisitor<Void>{

    private Types types;

    public ClassTypeVisitor(Types types){
        this.types = types;
    }

    @Override
    public Void visitClassdecl(ClassdeclContext ctx) {
        String id = ctx.ID().getText();

        if(types.hasType(id)){
            System.out.println("\"TYPE ERROR (class) : \" + id + \" type already exists!\"");
        }
        else {
            // Check for inheritance issues here
            ClassextContext extension = ctx.classext();
            if(extension != null){
                String parent = extension.ID().getText();
                if(!types.hasClass(parent)){
                    System.out.println("TYPE ERROR: No class " + parent + " for class " + id + " to extend from.");
                }
            }

            InterfaceimplContext impls = ctx.interfaceimpl();
            List<TerminalNode> IDS = impls.ID();
            if(IDS != null){
                for(TerminalNode ID : IDS){
                    if(!types.hasInterface(ID.getText())){
                        System.out.println("TYPE ERROR: class " + id + " is trying to implement a non-existing interface (" + ID + ")");
                    }
                }
            }
        }

        // add class to classes anyways, regardless of inheritance issues
        types.addClass(id);

        return null;
    }

}
