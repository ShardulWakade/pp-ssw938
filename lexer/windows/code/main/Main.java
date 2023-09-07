package main;

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;

import antlrgen.*;
import error.*;
import structure.*;
import visitors.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("./lexer/tests/1.prog");

        SimpleLangLexer lexer = new SimpleLangLexer(new ANTLRInputStream(in));
        lexer.removeErrorListeners();
        lexer.addErrorListener(LexerErrorListener.INSTANCE);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimpleLangParser parser = new SimpleLangParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ParserErrorListener.INSTANCE);

        ParseTree tree = parser.project();
        EntryChecker checker = new EntryChecker();
        if(!checker.visit(tree)){
            System.out.println("ENTRY ERROR");
        }

        Types types = new Types();
        types.fillFromParseTree(tree);

        System.out.println(types);
    }
}
