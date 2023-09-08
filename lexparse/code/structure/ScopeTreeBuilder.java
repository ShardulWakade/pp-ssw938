package structure;

import org.antlr.v4.runtime.tree.*;

import antlrgen.*;
import visitors.GlobalsListener;
import visitors.TypeExistsListener;

// This class will build a scope tree
// I am using builder pattern for now as I don't know ahead of time what all I will need to build the tree
public class ScopeTreeBuilder {
    
    ParseTree tree;
    Types types;

    public ScopeTreeBuilder(ParseTree tree, Types types){
        this.tree = tree;
        this.types = types;
    }

    public ScopeTree build(){
        ParseTreeWalker walker = new ParseTreeWalker();
        TypeExistsListener typeCheck = new TypeExistsListener(types);
    
        walker.walk(typeCheck, tree); walker = new ParseTreeWalker();

        ScopeTree scopeTree = new ScopeTree();
        GlobalsListener globalListener = new GlobalsListener(types, scopeTree);
        
        walker.walk(globalListener, tree);

        return scopeTree;
    }
}
