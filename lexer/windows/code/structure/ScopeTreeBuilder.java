package structure;

import org.antlr.runtime.tree.ParseTree;

import antlrgen.*;

// This class will build a scope tree
// I am using builder pattern for now as I don't know ahead of time what all I will need to build the tree
public class ScopeTreeBuilder {
    
    ParseTree tree;
    Types types;

    public ScopeTreeBuilder(ParseTree tree, Types types){
        this.tree = tree;
        this.types = types;
    }

    ScopeTree build(){
        return null;
    }
}
