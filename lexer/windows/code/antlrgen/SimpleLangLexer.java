package antlrgen;

// Generated from .\SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, INCR=31, DECR=32, 
		RELEQ=33, RELNE=34, RELGT=35, RELGE=36, RELLT=37, RELLE=38, ADD=39, SUB=40, 
		MUL=41, DIV=42, MOD=43, NUMCONST=44, CHARCONST=45, BOOLCONST=46, ID=47, 
		SLCOMMENT=48, WS=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "INCR", "DECR", "RELEQ", 
			"RELNE", "RELGT", "RELGE", "RELLT", "RELLE", "ADD", "SUB", "MUL", "DIV", 
			"MOD", "NUMCONST", "CHARCONST", "BOOLCONST", "ID", "SLCOMMENT", "WS", 
			"LETTER", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'project'", "'{'", "'}'", "'const'", "'='", "','", "';'", "'[]'", 
			"'enum'", "'class'", "'extends'", "'implements'", "'interface'", "'('", 
			"')'", "'void'", "'break'", "'continue'", "'return'", "'read'", "'print'", 
			"'if'", "'else'", "'for'", "'||'", "'&&'", "'new'", "'['", "']'", "'.'", 
			"'++'", "'--'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INCR", "DECR", "RELEQ", "RELNE", 
			"RELGT", "RELGE", "RELLT", "RELLE", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"NUMCONST", "CHARCONST", "BOOLCONST", "ID", "SLCOMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SimpleLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u014a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3"+
		"&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\6-\u0114\n-\r-\16-\u0115"+
		"\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0125\n/\3\60\3\60\3\60\3\60"+
		"\7\60\u012b\n\60\f\60\16\60\u012e\13\60\3\61\3\61\3\61\3\61\7\61\u0134"+
		"\n\61\f\61\16\61\u0137\13\61\3\61\5\61\u013a\n\61\3\61\3\61\3\61\3\61"+
		"\3\62\6\62\u0141\n\62\r\62\16\62\u0142\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\u0135\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2\3"+
		"\2\5\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\62;\2\u014f\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3i\3"+
		"\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13{\3\2\2\2\r}\3\2\2\2\17\177"+
		"\3\2\2\2\21\u0081\3\2\2\2\23\u0084\3\2\2\2\25\u0089\3\2\2\2\27\u008f\3"+
		"\2\2\2\31\u0097\3\2\2\2\33\u00a2\3\2\2\2\35\u00ac\3\2\2\2\37\u00ae\3\2"+
		"\2\2!\u00b0\3\2\2\2#\u00b5\3\2\2\2%\u00bb\3\2\2\2\'\u00c4\3\2\2\2)\u00cb"+
		"\3\2\2\2+\u00d0\3\2\2\2-\u00d6\3\2\2\2/\u00d9\3\2\2\2\61\u00de\3\2\2\2"+
		"\63\u00e2\3\2\2\2\65\u00e5\3\2\2\2\67\u00e8\3\2\2\29\u00ec\3\2\2\2;\u00ee"+
		"\3\2\2\2=\u00f0\3\2\2\2?\u00f2\3\2\2\2A\u00f5\3\2\2\2C\u00f8\3\2\2\2E"+
		"\u00fb\3\2\2\2G\u00fe\3\2\2\2I\u0100\3\2\2\2K\u0103\3\2\2\2M\u0105\3\2"+
		"\2\2O\u0108\3\2\2\2Q\u010a\3\2\2\2S\u010c\3\2\2\2U\u010e\3\2\2\2W\u0110"+
		"\3\2\2\2Y\u0113\3\2\2\2[\u0117\3\2\2\2]\u0124\3\2\2\2_\u0126\3\2\2\2a"+
		"\u012f\3\2\2\2c\u0140\3\2\2\2e\u0146\3\2\2\2g\u0148\3\2\2\2ij\7r\2\2j"+
		"k\7t\2\2kl\7q\2\2lm\7l\2\2mn\7g\2\2no\7e\2\2op\7v\2\2p\4\3\2\2\2qr\7}"+
		"\2\2r\6\3\2\2\2st\7\177\2\2t\b\3\2\2\2uv\7e\2\2vw\7q\2\2wx\7p\2\2xy\7"+
		"u\2\2yz\7v\2\2z\n\3\2\2\2{|\7?\2\2|\f\3\2\2\2}~\7.\2\2~\16\3\2\2\2\177"+
		"\u0080\7=\2\2\u0080\20\3\2\2\2\u0081\u0082\7]\2\2\u0082\u0083\7_\2\2\u0083"+
		"\22\3\2\2\2\u0084\u0085\7g\2\2\u0085\u0086\7p\2\2\u0086\u0087\7w\2\2\u0087"+
		"\u0088\7o\2\2\u0088\24\3\2\2\2\u0089\u008a\7e\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7u\2\2\u008d\u008e\7u\2\2\u008e\26\3\2\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7z\2\2\u0091\u0092\7v\2\2\u0092\u0093\7g\2\2"+
		"\u0093\u0094\7p\2\2\u0094\u0095\7f\2\2\u0095\u0096\7u\2\2\u0096\30\3\2"+
		"\2\2\u0097\u0098\7k\2\2\u0098\u0099\7o\2\2\u0099\u009a\7r\2\2\u009a\u009b"+
		"\7n\2\2\u009b\u009c\7g\2\2\u009c\u009d\7o\2\2\u009d\u009e\7g\2\2\u009e"+
		"\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7u\2\2\u00a1\32\3\2\2\2\u00a2"+
		"\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6\u00a7\7t\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa"+
		"\7e\2\2\u00aa\u00ab\7g\2\2\u00ab\34\3\2\2\2\u00ac\u00ad\7*\2\2\u00ad\36"+
		"\3\2\2\2\u00ae\u00af\7+\2\2\u00af \3\2\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2"+
		"\7q\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7f\2\2\u00b4\"\3\2\2\2\u00b5\u00b6"+
		"\7d\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7c\2\2\u00b9"+
		"\u00ba\7m\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7q\2\2\u00bd"+
		"\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2"+
		"\u00c1\u00c2\7w\2\2\u00c2\u00c3\7g\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7t\2"+
		"\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9"+
		"\7t\2\2\u00c9\u00ca\7p\2\2\u00ca(\3\2\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7f\2\2\u00cf*\3\2\2\2\u00d0\u00d1"+
		"\7r\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4"+
		"\u00d5\7v\2\2\u00d5,\3\2\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7h\2\2\u00d8"+
		".\3\2\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7u\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\60\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7q\2\2\u00e0"+
		"\u00e1\7t\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\7~\2\2\u00e3\u00e4\7~\2\2\u00e4"+
		"\64\3\2\2\2\u00e5\u00e6\7(\2\2\u00e6\u00e7\7(\2\2\u00e7\66\3\2\2\2\u00e8"+
		"\u00e9\7p\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7y\2\2\u00eb8\3\2\2\2\u00ec"+
		"\u00ed\7]\2\2\u00ed:\3\2\2\2\u00ee\u00ef\7_\2\2\u00ef<\3\2\2\2\u00f0\u00f1"+
		"\7\60\2\2\u00f1>\3\2\2\2\u00f2\u00f3\7-\2\2\u00f3\u00f4\7-\2\2\u00f4@"+
		"\3\2\2\2\u00f5\u00f6\7/\2\2\u00f6\u00f7\7/\2\2\u00f7B\3\2\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9\u00fa\7?\2\2\u00faD\3\2\2\2\u00fb\u00fc\7#\2\2\u00fc\u00fd"+
		"\7?\2\2\u00fdF\3\2\2\2\u00fe\u00ff\7@\2\2\u00ffH\3\2\2\2\u0100\u0101\7"+
		"@\2\2\u0101\u0102\7?\2\2\u0102J\3\2\2\2\u0103\u0104\7>\2\2\u0104L\3\2"+
		"\2\2\u0105\u0106\7>\2\2\u0106\u0107\7?\2\2\u0107N\3\2\2\2\u0108\u0109"+
		"\7-\2\2\u0109P\3\2\2\2\u010a\u010b\7/\2\2\u010bR\3\2\2\2\u010c\u010d\7"+
		",\2\2\u010dT\3\2\2\2\u010e\u010f\7\61\2\2\u010fV\3\2\2\2\u0110\u0111\7"+
		"\'\2\2\u0111X\3\2\2\2\u0112\u0114\5g\64\2\u0113\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116Z\3\2\2\2\u0117"+
		"\u0118\7)\2\2\u0118\u0119\13\2\2\2\u0119\u011a\7)\2\2\u011a\\\3\2\2\2"+
		"\u011b\u011c\7v\2\2\u011c\u011d\7t\2\2\u011d\u011e\7w\2\2\u011e\u0125"+
		"\7g\2\2\u011f\u0120\7h\2\2\u0120\u0121\7c\2\2\u0121\u0122\7n\2\2\u0122"+
		"\u0123\7u\2\2\u0123\u0125\7g\2\2\u0124\u011b\3\2\2\2\u0124\u011f\3\2\2"+
		"\2\u0125^\3\2\2\2\u0126\u012c\5e\63\2\u0127\u012b\5e\63\2\u0128\u012b"+
		"\5g\64\2\u0129\u012b\7a\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d`\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\61\2\2\u0130\u0131"+
		"\7\61\2\2\u0131\u0135\3\2\2\2\u0132\u0134\13\2\2\2\u0133\u0132\3\2\2\2"+
		"\u0134\u0137\3\2\2\2\u0135\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0139"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\7\17\2\2\u0139\u0138\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\f\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013e\b\61\2\2\u013eb\3\2\2\2\u013f\u0141\t\2\2\2\u0140"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b\62\2\2\u0145d\3\2\2\2\u0146\u0147"+
		"\t\3\2\2\u0147f\3\2\2\2\u0148\u0149\t\4\2\2\u0149h\3\2\2\2\n\2\u0115\u0124"+
		"\u012a\u012c\u0135\u0139\u0142\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}