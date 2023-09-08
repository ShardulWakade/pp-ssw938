package main;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ANTLRInputStream;

import antlrgen.*;
import error.*;
import structure.*;
import visitors.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("./lexer/tests/declareCheck/1.prog");

        SimpleLangLexer lexer = new SimpleLangLexer(new ANTLRInputStream(in));
        lexer.removeErrorListeners();
        lexer.addErrorListener(LexerErrorListener.INSTANCE);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimpleLangParser parser = new SimpleLangParser(tokens);
     //   parser.removeErrorListeners();
      //  parser.addErrorListener(ParserErrorListener.INSTANCE);

        ParseTree tree = parser.project();
        
        EntryChecker entryChecker = new EntryChecker();
        if(!entryChecker.visit(tree)){
            System.out.println("ERROR : No appropriate entry function found!");
        }

        Types types = new Types();
        types.fillFromParseTree(tree);

        ScopeTreeBuilder builder = new ScopeTreeBuilder(tree, types);
        ScopeTree scopeTree = builder.build();

        DeclareCheckVisitor declareCheck = new DeclareCheckVisitor(scopeTree, types);
        declareCheck.visit(tree);

        System.out.println("\n\n--------------------------------------------\n\n");

        System.out.println(scopeTree);
    }
}
