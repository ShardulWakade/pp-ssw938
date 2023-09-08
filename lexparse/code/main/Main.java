package main;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;

import antlrgen.*;
import error.*;
import structure.*;
import visitors.*;

public class Main {
    public static void main(String[] args) throws Exception {

        if(args.length == 0){
            System.out.println("Please enter File to read program from.");
            return;
        }

        Path path = FileSystems.getDefault().getPath(args[0]);
        SimpleLangLexer lexer = new SimpleLangLexer(CharStreams.fromPath(path));
    //  lexer.removeErrorListeners();
    //  lexer.addErrorListener(LexerErrorListener.INSTANCE);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimpleLangParser parser = new SimpleLangParser(tokens);
     // parser.removeErrorListeners();
     // parser.addErrorListener(ParserErrorListener.INSTANCE);

        System.out.println("\n--------------------------------------------\n");
        System.out.println("LEXER/PARSER ERRORS : ");

        ParseTree tree = parser.project();

        System.out.println("\n--------------------------------------------\n");
        System.out.println("SEMANTIC ERRORS : ");
        
        EntryChecker entryChecker = new EntryChecker();
        if(!entryChecker.visit(tree)){
            System.out.println("ENTRY ERROR : No appropriate entry function found!");
        }

        Types types = new Types();
        types.fillFromParseTree(tree);

        ScopeTreeBuilder builder = new ScopeTreeBuilder(tree, types);
        ScopeTree scopeTree = builder.build();

        DeclareCheckVisitor declareCheck = new DeclareCheckVisitor(scopeTree, types);
        declareCheck.visit(tree);

        System.out.println("\n--------------------------------------------\n");
        System.out.println("INTERNAL REPRESENTATION BY SEMANTIC ANALYSIS (only for debugging/developement)");
        System.out.println("\n--------------------------------------------\n");
        System.out.println(scopeTree);
    }
}
