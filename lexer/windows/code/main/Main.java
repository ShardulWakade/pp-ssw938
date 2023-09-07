package main;

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;

import antlrgen.*;
import error.*;
import visitors.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("./lexer/tests/5.prog");

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
    }
}
