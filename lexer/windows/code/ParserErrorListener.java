import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ParserErrorListener extends BaseErrorListener {
    public static final ParserErrorListener INSTANCE = new ParserErrorListener();

    private ParserErrorListener(){}

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {
        System.out.println("PARSER ERROR");
        System.exit(2);
    }
}
