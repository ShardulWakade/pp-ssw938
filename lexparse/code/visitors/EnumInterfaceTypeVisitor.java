package visitors;

import antlrgen.*;
import antlrgen.SimpleLangParser.EnumdeclContext;
import antlrgen.SimpleLangParser.InterfacedeclContext;
import structure.Types;

public class EnumInterfaceTypeVisitor extends SimpleLangBaseVisitor<Void> {
    
    private Types types;
    
    public EnumInterfaceTypeVisitor(Types types){
        this.types = types;
    }

    @Override
    public Void visitEnumdecl(EnumdeclContext ctx) {
        String id = ctx.ID().getText();
        
        if(types.hasType(id)){
            System.out.println("TYPE ERROR (enum) : " + id + " type already exists!");
        } 
        else {
            types.addEnum(id);
        }

        return null;
    }

    @Override
    public Void visitInterfacedecl(InterfacedeclContext ctx) {
        String id = ctx.ID().getText();

        if(types.hasType(id)){
            System.out.println("TYPE ERROR (interface) : " + id + " type already exists!");
        } 
        else {
            types.addInterface(id);
        }

        return null;
    }
}
