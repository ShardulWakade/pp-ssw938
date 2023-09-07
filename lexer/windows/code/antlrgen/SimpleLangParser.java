package antlrgen;

// Generated from .\SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLangParser extends Parser {
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
	public static final int
		RULE_project = 0, RULE_declarations = 1, RULE_constdecl = 2, RULE_constvalue = 3, 
		RULE_vardecl = 4, RULE_singlevardecl = 5, RULE_enumdecl = 6, RULE_numdecl = 7, 
		RULE_classdecl = 8, RULE_interfacedecl = 9, RULE_interfacemethoddecl = 10, 
		RULE_methoddecl = 11, RULE_returntype = 12, RULE_formalparams = 13, RULE_type = 14, 
		RULE_statement = 15, RULE_designatorstatement = 16, RULE_assignExpr = 17, 
		RULE_unaryop = 18, RULE_functioncall = 19, RULE_actualpars = 20, RULE_ifelsestatement = 21, 
		RULE_forloopstatement = 22, RULE_condition = 23, RULE_condterm = 24, RULE_condfact = 25, 
		RULE_expr = 26, RULE_term = 27, RULE_factor = 28, RULE_designator = 29, 
		RULE_relop = 30, RULE_addop = 31, RULE_mulop = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"project", "declarations", "constdecl", "constvalue", "vardecl", "singlevardecl", 
			"enumdecl", "numdecl", "classdecl", "interfacedecl", "interfacemethoddecl", 
			"methoddecl", "returntype", "formalparams", "type", "statement", "designatorstatement", 
			"assignExpr", "unaryop", "functioncall", "actualpars", "ifelsestatement", 
			"forloopstatement", "condition", "condterm", "condfact", "expr", "term", 
			"factor", "designator", "relop", "addop", "mulop"
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

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProjectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<MethoddeclContext> methoddecl() {
			return getRuleContexts(MethoddeclContext.class);
		}
		public MethoddeclContext methoddecl(int i) {
			return getRuleContext(MethoddeclContext.class,i);
		}
		public ProjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectContext project() throws RecognitionException {
		ProjectContext _localctx = new ProjectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_project);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			match(ID);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << ID))) != 0)) {
				{
				{
				setState(68);
				declarations();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__1);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==ID) {
				{
				{
				setState(75);
				methoddecl();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	 
		public DeclarationsContext() { }
		public void copyFrom(DeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProjectConstDeclContext extends DeclarationsContext {
		public ConstdeclContext constdecl() {
			return getRuleContext(ConstdeclContext.class,0);
		}
		public ProjectConstDeclContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProjectConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProjectConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProjectConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProjectEnumDeclContext extends DeclarationsContext {
		public EnumdeclContext enumdecl() {
			return getRuleContext(EnumdeclContext.class,0);
		}
		public ProjectEnumDeclContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProjectEnumDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProjectEnumDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProjectEnumDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProjectInterfaceDeclContext extends DeclarationsContext {
		public InterfacedeclContext interfacedecl() {
			return getRuleContext(InterfacedeclContext.class,0);
		}
		public ProjectInterfaceDeclContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProjectInterfaceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProjectInterfaceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProjectInterfaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProjectVarDeclContext extends DeclarationsContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public ProjectVarDeclContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProjectVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProjectVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProjectVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProjectClassDeclContext extends DeclarationsContext {
		public ClassdeclContext classdecl() {
			return getRuleContext(ClassdeclContext.class,0);
		}
		public ProjectClassDeclContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProjectClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProjectClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProjectClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new ProjectConstDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				constdecl();
				}
				break;
			case ID:
				_localctx = new ProjectVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				vardecl();
				}
				break;
			case T__9:
				_localctx = new ProjectClassDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				classdecl();
				}
				break;
			case T__8:
				_localctx = new ProjectEnumDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				enumdecl();
				}
				break;
			case T__12:
				_localctx = new ProjectInterfaceDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				interfacedecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstdeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public List<ConstvalueContext> constvalue() {
			return getRuleContexts(ConstvalueContext.class);
		}
		public ConstvalueContext constvalue(int i) {
			return getRuleContext(ConstvalueContext.class,i);
		}
		public ConstdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterConstdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitConstdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitConstdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstdeclContext constdecl() throws RecognitionException {
		ConstdeclContext _localctx = new ConstdeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__3);
			setState(91);
			type();
			setState(92);
			match(ID);
			setState(93);
			match(T__4);
			setState(94);
			constvalue();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(95);
				match(T__5);
				setState(96);
				match(ID);
				setState(97);
				match(T__4);
				setState(98);
				constvalue();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstvalueContext extends ParserRuleContext {
		public Token val;
		public TerminalNode NUMCONST() { return getToken(SimpleLangParser.NUMCONST, 0); }
		public TerminalNode CHARCONST() { return getToken(SimpleLangParser.CHARCONST, 0); }
		public TerminalNode BOOLCONST() { return getToken(SimpleLangParser.BOOLCONST, 0); }
		public ConstvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterConstvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitConstvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitConstvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstvalueContext constvalue() throws RecognitionException {
		ConstvalueContext _localctx = new ConstvalueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((ConstvalueContext)_localctx).val = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLCONST))) != 0)) ) {
				((ConstvalueContext)_localctx).val = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<SinglevardeclContext> singlevardecl() {
			return getRuleContexts(SinglevardeclContext.class);
		}
		public SinglevardeclContext singlevardecl(int i) {
			return getRuleContext(SinglevardeclContext.class,i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			type();
			setState(109);
			singlevardecl();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(110);
				match(T__5);
				setState(111);
				singlevardecl();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinglevardeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public SinglevardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlevardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSinglevardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSinglevardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSinglevardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglevardeclContext singlevardecl() throws RecognitionException {
		SinglevardeclContext _localctx = new SinglevardeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singlevardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(120);
				match(T__7);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumdeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public List<NumdeclContext> numdecl() {
			return getRuleContexts(NumdeclContext.class);
		}
		public NumdeclContext numdecl(int i) {
			return getRuleContext(NumdeclContext.class,i);
		}
		public EnumdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterEnumdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitEnumdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitEnumdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumdeclContext enumdecl() throws RecognitionException {
		EnumdeclContext _localctx = new EnumdeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enumdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__8);
			setState(124);
			match(ID);
			setState(125);
			match(T__1);
			setState(126);
			numdecl();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(127);
				match(T__5);
				setState(128);
				numdecl();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumdeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TerminalNode NUMCONST() { return getToken(SimpleLangParser.NUMCONST, 0); }
		public NumdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterNumdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitNumdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitNumdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumdeclContext numdecl() throws RecognitionException {
		NumdeclContext _localctx = new NumdeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(137);
				match(T__4);
				setState(138);
				match(NUMCONST);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassdeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<MethoddeclContext> methoddecl() {
			return getRuleContexts(MethoddeclContext.class);
		}
		public MethoddeclContext methoddecl(int i) {
			return getRuleContext(MethoddeclContext.class,i);
		}
		public ClassdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterClassdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitClassdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitClassdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdeclContext classdecl() throws RecognitionException {
		ClassdeclContext _localctx = new ClassdeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__9);
			setState(142);
			match(ID);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(143);
				match(T__10);
				setState(144);
				type();
				}
			}

			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(147);
				match(T__11);
				setState(148);
				type();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(149);
					match(T__5);
					setState(150);
					type();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(158);
			match(T__1);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(159);
				vardecl();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(165);
				match(T__1);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15 || _la==ID) {
					{
					{
					setState(166);
					methoddecl();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				match(T__2);
				}
			}

			setState(175);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfacedeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public List<InterfacemethoddeclContext> interfacemethoddecl() {
			return getRuleContexts(InterfacemethoddeclContext.class);
		}
		public InterfacemethoddeclContext interfacemethoddecl(int i) {
			return getRuleContext(InterfacemethoddeclContext.class,i);
		}
		public InterfacedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacedecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInterfacedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInterfacedecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInterfacedecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacedeclContext interfacedecl() throws RecognitionException {
		InterfacedeclContext _localctx = new InterfacedeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interfacedecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__12);
			setState(178);
			match(ID);
			setState(179);
			match(T__1);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==ID) {
				{
				{
				setState(180);
				interfacemethoddecl();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfacemethoddeclContext extends ParserRuleContext {
		public ReturntypeContext returntype() {
			return getRuleContext(ReturntypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public FormalparamsContext formalparams() {
			return getRuleContext(FormalparamsContext.class,0);
		}
		public InterfacemethoddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacemethoddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInterfacemethoddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInterfacemethoddecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInterfacemethoddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacemethoddeclContext interfacemethoddecl() throws RecognitionException {
		InterfacemethoddeclContext _localctx = new InterfacemethoddeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfacemethoddecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			returntype();
			setState(189);
			match(ID);
			setState(190);
			match(T__13);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(191);
				formalparams();
				}
			}

			setState(194);
			match(T__14);
			setState(195);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethoddeclContext extends ParserRuleContext {
		public ReturntypeContext returntype() {
			return getRuleContext(ReturntypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public FormalparamsContext formalparams() {
			return getRuleContext(FormalparamsContext.class,0);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethoddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methoddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterMethoddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitMethoddecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitMethoddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethoddeclContext methoddecl() throws RecognitionException {
		MethoddeclContext _localctx = new MethoddeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methoddecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			returntype();
			setState(198);
			match(ID);
			setState(199);
			match(T__13);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(200);
				formalparams();
				}
			}

			setState(203);
			match(T__14);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(204);
				vardecl();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(T__1);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(211);
				statement();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturntypeContext extends ParserRuleContext {
		public ReturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returntype; }
	 
		public ReturntypeContext() { }
		public void copyFrom(ReturntypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VoidReturnContext extends ReturntypeContext {
		public VoidReturnContext(ReturntypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterVoidReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitVoidReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitVoidReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonVoidReturnContext extends ReturntypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NonVoidReturnContext(ReturntypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterNonVoidReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitNonVoidReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitNonVoidReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturntypeContext returntype() throws RecognitionException {
		ReturntypeContext _localctx = new ReturntypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returntype);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new NonVoidReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				type();
				}
				break;
			case T__15:
				_localctx = new VoidReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalparamsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<SinglevardeclContext> singlevardecl() {
			return getRuleContexts(SinglevardeclContext.class);
		}
		public SinglevardeclContext singlevardecl(int i) {
			return getRuleContext(SinglevardeclContext.class,i);
		}
		public FormalparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterFormalparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitFormalparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitFormalparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalparamsContext formalparams() throws RecognitionException {
		FormalparamsContext _localctx = new FormalparamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formalparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			type();
			setState(224);
			singlevardecl();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(225);
				match(T__5);
				setState(226);
				type();
				setState(227);
				singlevardecl();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementContinueContext extends StatementContext {
		public StatementContinueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatementContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatementContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatementContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDesignatorContext extends StatementContext {
		public DesignatorstatementContext designatorstatement() {
			return getRuleContext(DesignatorstatementContext.class,0);
		}
		public StatementDesignatorContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatementDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatementDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatementDesignator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementReturnContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementBlockContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementReadContext extends StatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public StatementReadContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatementRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatementRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatementRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementBreakContext extends StatementContext {
		public StatementBreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatementBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatementBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementIfElseContext extends StatementContext {
		public IfelsestatementContext ifelsestatement() {
			return getRuleContext(IfelsestatementContext.class,0);
		}
		public StatementIfElseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatementIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatementIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatementIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementForLoopContext extends StatementContext {
		public ForloopstatementContext forloopstatement() {
			return getRuleContext(ForloopstatementContext.class,0);
		}
		public StatementForLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatementForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatementForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatementForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementPrintContext extends StatementContext {
		public ActualparsContext actualpars() {
			return getRuleContext(ActualparsContext.class,0);
		}
		public StatementPrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatementPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatementPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatementPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StatementDesignatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				designatorstatement();
				setState(237);
				match(T__6);
				}
				break;
			case T__21:
				_localctx = new StatementIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				ifelsestatement();
				}
				break;
			case T__23:
				_localctx = new StatementForLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				forloopstatement();
				}
				break;
			case T__16:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(T__16);
				setState(242);
				match(T__6);
				}
				break;
			case T__17:
				_localctx = new StatementContinueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(T__17);
				setState(244);
				match(T__6);
				}
				break;
			case T__18:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				match(T__18);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__26) | (1L << SUB) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLCONST) | (1L << ID))) != 0)) {
					{
					setState(246);
					expr();
					}
				}

				setState(249);
				match(T__6);
				}
				break;
			case T__19:
				_localctx = new StatementReadContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(250);
				match(T__19);
				setState(251);
				match(T__13);
				setState(252);
				designator();
				setState(253);
				match(T__14);
				setState(254);
				match(T__6);
				}
				break;
			case T__20:
				_localctx = new StatementPrintContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				match(T__20);
				setState(257);
				match(T__13);
				setState(258);
				actualpars();
				setState(259);
				match(T__14);
				setState(260);
				match(T__6);
				}
				break;
			case T__1:
				_localctx = new StatementBlockContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(262);
				match(T__1);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << ID))) != 0)) {
					{
					{
					setState(263);
					statement();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorstatementContext extends ParserRuleContext {
		public DesignatorstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorstatement; }
	 
		public DesignatorstatementContext() { }
		public void copyFrom(DesignatorstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DesignatorFunctionCallContext extends DesignatorstatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public DesignatorFunctionCallContext(DesignatorstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignatorFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignatorFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignatorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DesignatorUnaryOpContext extends DesignatorstatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public UnaryopContext unaryop() {
			return getRuleContext(UnaryopContext.class,0);
		}
		public DesignatorUnaryOpContext(DesignatorstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignatorUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignatorUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignatorUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DesignatorAssignContext extends DesignatorstatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public DesignatorAssignContext(DesignatorstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignatorAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignatorAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignatorAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorstatementContext designatorstatement() throws RecognitionException {
		DesignatorstatementContext _localctx = new DesignatorstatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_designatorstatement);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new DesignatorAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				designator();
				setState(273);
				assignExpr();
				}
				break;
			case 2:
				_localctx = new DesignatorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				designator();
				setState(276);
				functioncall();
				}
				break;
			case 3:
				_localctx = new DesignatorUnaryOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				designator();
				setState(279);
				unaryop();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExprContext assignExpr() throws RecognitionException {
		AssignExprContext _localctx = new AssignExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__4);
			setState(284);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryopContext extends ParserRuleContext {
		public Token op;
		public TerminalNode INCR() { return getToken(SimpleLangParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(SimpleLangParser.DECR, 0); }
		public UnaryopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterUnaryop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitUnaryop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitUnaryop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryopContext unaryop() throws RecognitionException {
		UnaryopContext _localctx = new UnaryopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unaryop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			((UnaryopContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
				((UnaryopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioncallContext extends ParserRuleContext {
		public ActualparsContext actualpars() {
			return getRuleContext(ActualparsContext.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__13);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__26) | (1L << SUB) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLCONST) | (1L << ID))) != 0)) {
				{
				setState(289);
				actualpars();
				}
			}

			setState(292);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualparsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ActualparsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualpars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterActualpars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitActualpars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitActualpars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualparsContext actualpars() throws RecognitionException {
		ActualparsContext _localctx = new ActualparsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_actualpars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			expr();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(295);
				match(T__5);
				setState(296);
				expr();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfelsestatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfelsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIfelsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIfelsestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIfelsestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelsestatementContext ifelsestatement() throws RecognitionException {
		IfelsestatementContext _localctx = new IfelsestatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifelsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__21);
			setState(303);
			match(T__13);
			setState(304);
			condition();
			setState(305);
			match(T__14);
			setState(306);
			statement();
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(307);
				match(T__22);
				setState(308);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForloopstatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<DesignatorstatementContext> designatorstatement() {
			return getRuleContexts(DesignatorstatementContext.class);
		}
		public DesignatorstatementContext designatorstatement(int i) {
			return getRuleContext(DesignatorstatementContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForloopstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloopstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForloopstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForloopstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForloopstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopstatementContext forloopstatement() throws RecognitionException {
		ForloopstatementContext _localctx = new ForloopstatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forloopstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__23);
			setState(312);
			match(T__13);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(313);
				designatorstatement();
				}
			}

			setState(316);
			match(T__6);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__26) | (1L << SUB) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLCONST) | (1L << ID))) != 0)) {
				{
				setState(317);
				condition();
				}
			}

			setState(320);
			match(T__6);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(321);
				designatorstatement();
				}
			}

			setState(324);
			match(T__14);
			setState(325);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<CondtermContext> condterm() {
			return getRuleContexts(CondtermContext.class);
		}
		public CondtermContext condterm(int i) {
			return getRuleContext(CondtermContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			condterm();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(328);
				match(T__24);
				setState(329);
				condterm();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondtermContext extends ParserRuleContext {
		public List<CondfactContext> condfact() {
			return getRuleContexts(CondfactContext.class);
		}
		public CondfactContext condfact(int i) {
			return getRuleContext(CondfactContext.class,i);
		}
		public CondtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCondterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCondterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCondterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondtermContext condterm() throws RecognitionException {
		CondtermContext _localctx = new CondtermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condterm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			condfact();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(336);
				match(T__25);
				setState(337);
				condfact();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondfactContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CondfactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condfact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCondfact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCondfact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCondfact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondfactContext condfact() throws RecognitionException {
		CondfactContext _localctx = new CondfactContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condfact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			expr();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELEQ) | (1L << RELNE) | (1L << RELGT) | (1L << RELGE) | (1L << RELLT) | (1L << RELLE))) != 0)) {
				{
				setState(344);
				relop();
				setState(345);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode SUB() { return getToken(SimpleLangParser.SUB, 0); }
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(349);
				match(SUB);
				}
			}

			setState(352);
			term();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(353);
				addop();
				setState(354);
				term();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			factor();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(362);
				mulop();
				setState(363);
				factor();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstFactorContext extends FactorContext {
		public ConstvalueContext constvalue() {
			return getRuleContext(ConstvalueContext.class,0);
		}
		public ConstFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterConstFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitConstFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitConstFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenFactorContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterParenFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitParenFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitParenFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DesignatorFactorContext extends FactorContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public DesignatorFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignatorFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignatorFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignatorFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewFactorContext extends FactorContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NewFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterNewFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitNewFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitNewFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_factor);
		int _la;
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new DesignatorFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				designator();
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(371);
					functioncall();
					}
				}

				}
				break;
			case NUMCONST:
			case CHARCONST:
			case BOOLCONST:
				_localctx = new ConstFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				constvalue();
				}
				break;
			case T__26:
				_localctx = new NewFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(T__26);
				setState(376);
				type();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(377);
					match(T__27);
					setState(378);
					expr();
					setState(379);
					match(T__28);
					}
				}

				}
				break;
			case T__13:
				_localctx = new ParenFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				match(T__13);
				setState(384);
				expr();
				setState(385);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(ID);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==T__29) {
				{
				setState(396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(390);
					match(T__29);
					setState(391);
					match(ID);
					}
					break;
				case T__27:
					{
					setState(392);
					match(T__27);
					setState(393);
					expr();
					setState(394);
					match(T__28);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public Token op;
		public TerminalNode RELEQ() { return getToken(SimpleLangParser.RELEQ, 0); }
		public TerminalNode RELNE() { return getToken(SimpleLangParser.RELNE, 0); }
		public TerminalNode RELGT() { return getToken(SimpleLangParser.RELGT, 0); }
		public TerminalNode RELGE() { return getToken(SimpleLangParser.RELGE, 0); }
		public TerminalNode RELLT() { return getToken(SimpleLangParser.RELLT, 0); }
		public TerminalNode RELLE() { return getToken(SimpleLangParser.RELLE, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			((RelopContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELEQ) | (1L << RELNE) | (1L << RELGT) | (1L << RELGE) | (1L << RELLT) | (1L << RELLE))) != 0)) ) {
				((RelopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddopContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ADD() { return getToken(SimpleLangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SimpleLangParser.SUB, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAddop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAddop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			((AddopContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
				((AddopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulopContext extends ParserRuleContext {
		public Token op;
		public TerminalNode MUL() { return getToken(SimpleLangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SimpleLangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SimpleLangParser.MOD, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitMulop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitMulop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			((MulopContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				((MulopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u019a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\7\2O\n\2\f\2\16"+
		"\2R\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4f\n\4\f\4\16\4i\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6s\n\6\f\6\16\6v\13\6\3\6\3\6\3\7\3\7\5\7|\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u008e\n\t"+
		"\3\n\3\n\3\n\3\n\5\n\u0094\n\n\3\n\3\n\3\n\3\n\7\n\u009a\n\n\f\n\16\n"+
		"\u009d\13\n\5\n\u009f\n\n\3\n\3\n\7\n\u00a3\n\n\f\n\16\n\u00a6\13\n\3"+
		"\n\3\n\7\n\u00aa\n\n\f\n\16\n\u00ad\13\n\3\n\5\n\u00b0\n\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\7\13\u00b8\n\13\f\13\16\13\u00bb\13\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\5\f\u00c3\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00cc\n\r\3\r"+
		"\3\r\7\r\u00d0\n\r\f\r\16\r\u00d3\13\r\3\r\3\r\7\r\u00d7\n\r\f\r\16\r"+
		"\u00da\13\r\3\r\3\r\3\16\3\16\5\16\u00e0\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00e8\n\17\f\17\16\17\u00eb\13\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00fa\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u010b"+
		"\n\21\f\21\16\21\u010e\13\21\3\21\5\21\u0111\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u011c\n\22\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\5\25\u0125\n\25\3\25\3\25\3\26\3\26\3\26\7\26\u012c\n\26\f\26\16"+
		"\26\u012f\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0138\n\27\3\30"+
		"\3\30\3\30\5\30\u013d\n\30\3\30\3\30\5\30\u0141\n\30\3\30\3\30\5\30\u0145"+
		"\n\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u014d\n\31\f\31\16\31\u0150\13"+
		"\31\3\32\3\32\3\32\7\32\u0155\n\32\f\32\16\32\u0158\13\32\3\33\3\33\3"+
		"\33\3\33\5\33\u015e\n\33\3\34\5\34\u0161\n\34\3\34\3\34\3\34\3\34\7\34"+
		"\u0167\n\34\f\34\16\34\u016a\13\34\3\35\3\35\3\35\3\35\7\35\u0170\n\35"+
		"\f\35\16\35\u0173\13\35\3\36\3\36\5\36\u0177\n\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0180\n\36\3\36\3\36\3\36\3\36\5\36\u0186\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u018f\n\37\f\37\16\37\u0192\13"+
		"\37\3 \3 \3!\3!\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@B\2\7\3\2.\60\3\2!\"\3\2#(\3\2)*\3\2+-\2\u01af"+
		"\2D\3\2\2\2\4Z\3\2\2\2\6\\\3\2\2\2\bl\3\2\2\2\nn\3\2\2\2\fy\3\2\2\2\16"+
		"}\3\2\2\2\20\u008a\3\2\2\2\22\u008f\3\2\2\2\24\u00b3\3\2\2\2\26\u00be"+
		"\3\2\2\2\30\u00c7\3\2\2\2\32\u00df\3\2\2\2\34\u00e1\3\2\2\2\36\u00ec\3"+
		"\2\2\2 \u0110\3\2\2\2\"\u011b\3\2\2\2$\u011d\3\2\2\2&\u0120\3\2\2\2(\u0122"+
		"\3\2\2\2*\u0128\3\2\2\2,\u0130\3\2\2\2.\u0139\3\2\2\2\60\u0149\3\2\2\2"+
		"\62\u0151\3\2\2\2\64\u0159\3\2\2\2\66\u0160\3\2\2\28\u016b\3\2\2\2:\u0185"+
		"\3\2\2\2<\u0187\3\2\2\2>\u0193\3\2\2\2@\u0195\3\2\2\2B\u0197\3\2\2\2D"+
		"E\7\3\2\2EI\7\61\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2"+
		"JL\3\2\2\2KI\3\2\2\2LP\7\4\2\2MO\5\30\r\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2"+
		"\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\5\2\2T\3\3\2\2\2U[\5\6\4\2V[\5\n"+
		"\6\2W[\5\22\n\2X[\5\16\b\2Y[\5\24\13\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2Z"+
		"X\3\2\2\2ZY\3\2\2\2[\5\3\2\2\2\\]\7\6\2\2]^\5\36\20\2^_\7\61\2\2_`\7\7"+
		"\2\2`g\5\b\5\2ab\7\b\2\2bc\7\61\2\2cd\7\7\2\2df\5\b\5\2ea\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\t\2\2k\7\3\2\2\2lm"+
		"\t\2\2\2m\t\3\2\2\2no\5\36\20\2ot\5\f\7\2pq\7\b\2\2qs\5\f\7\2rp\3\2\2"+
		"\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\t\2\2x\13\3\2"+
		"\2\2y{\7\61\2\2z|\7\n\2\2{z\3\2\2\2{|\3\2\2\2|\r\3\2\2\2}~\7\13\2\2~\177"+
		"\7\61\2\2\177\u0080\7\4\2\2\u0080\u0085\5\20\t\2\u0081\u0082\7\b\2\2\u0082"+
		"\u0084\5\20\t\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7\5\2\2\u0089\17\3\2\2\2\u008a\u008d\7\61\2\2\u008b\u008c\7\7\2"+
		"\2\u008c\u008e\7.\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\21"+
		"\3\2\2\2\u008f\u0090\7\f\2\2\u0090\u0093\7\61\2\2\u0091\u0092\7\r\2\2"+
		"\u0092\u0094\5\36\20\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009e"+
		"\3\2\2\2\u0095\u0096\7\16\2\2\u0096\u009b\5\36\20\2\u0097\u0098\7\b\2"+
		"\2\u0098\u009a\5\36\20\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u0095\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a4\7\4\2\2\u00a1\u00a3\5\n\6\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00af\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00ab\7\4\2\2\u00a8\u00aa\5\30\r\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\7\5\2\2\u00af\u00a7\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\5\2\2\u00b2"+
		"\23\3\2\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5\7\61\2\2\u00b5\u00b9\7\4"+
		"\2\2\u00b6\u00b8\5\26\f\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00bd\7\5\2\2\u00bd\25\3\2\2\2\u00be\u00bf\5\32\16\2\u00bf"+
		"\u00c0\7\61\2\2\u00c0\u00c2\7\20\2\2\u00c1\u00c3\5\34\17\2\u00c2\u00c1"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\21\2\2"+
		"\u00c5\u00c6\7\t\2\2\u00c6\27\3\2\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9"+
		"\7\61\2\2\u00c9\u00cb\7\20\2\2\u00ca\u00cc\5\34\17\2\u00cb\u00ca\3\2\2"+
		"\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d1\7\21\2\2\u00ce"+
		"\u00d0\5\n\6\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d8\7\4\2\2\u00d5\u00d7\5 \21\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dc\7\5\2\2\u00dc\31\3\2\2\2\u00dd\u00e0\5\36\20"+
		"\2\u00de\u00e0\7\22\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\33\3\2\2\2\u00e1\u00e2\5\36\20\2\u00e2\u00e9\5\f\7\2\u00e3\u00e4\7\b"+
		"\2\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6\5\f\7\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e3\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\35\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7\61\2\2\u00ed\37"+
		"\3\2\2\2\u00ee\u00ef\5\"\22\2\u00ef\u00f0\7\t\2\2\u00f0\u0111\3\2\2\2"+
		"\u00f1\u0111\5,\27\2\u00f2\u0111\5.\30\2\u00f3\u00f4\7\23\2\2\u00f4\u0111"+
		"\7\t\2\2\u00f5\u00f6\7\24\2\2\u00f6\u0111\7\t\2\2\u00f7\u00f9\7\25\2\2"+
		"\u00f8\u00fa\5\66\34\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u0111\7\t\2\2\u00fc\u00fd\7\26\2\2\u00fd\u00fe\7\20\2\2"+
		"\u00fe\u00ff\5<\37\2\u00ff\u0100\7\21\2\2\u0100\u0101\7\t\2\2\u0101\u0111"+
		"\3\2\2\2\u0102\u0103\7\27\2\2\u0103\u0104\7\20\2\2\u0104\u0105\5*\26\2"+
		"\u0105\u0106\7\21\2\2\u0106\u0107\7\t\2\2\u0107\u0111\3\2\2\2\u0108\u010c"+
		"\7\4\2\2\u0109\u010b\5 \21\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0111\7\5\2\2\u0110\u00ee\3\2\2\2\u0110\u00f1\3\2\2\2\u0110"+
		"\u00f2\3\2\2\2\u0110\u00f3\3\2\2\2\u0110\u00f5\3\2\2\2\u0110\u00f7\3\2"+
		"\2\2\u0110\u00fc\3\2\2\2\u0110\u0102\3\2\2\2\u0110\u0108\3\2\2\2\u0111"+
		"!\3\2\2\2\u0112\u0113\5<\37\2\u0113\u0114\5$\23\2\u0114\u011c\3\2\2\2"+
		"\u0115\u0116\5<\37\2\u0116\u0117\5(\25\2\u0117\u011c\3\2\2\2\u0118\u0119"+
		"\5<\37\2\u0119\u011a\5&\24\2\u011a\u011c\3\2\2\2\u011b\u0112\3\2\2\2\u011b"+
		"\u0115\3\2\2\2\u011b\u0118\3\2\2\2\u011c#\3\2\2\2\u011d\u011e\7\7\2\2"+
		"\u011e\u011f\5\66\34\2\u011f%\3\2\2\2\u0120\u0121\t\3\2\2\u0121\'\3\2"+
		"\2\2\u0122\u0124\7\20\2\2\u0123\u0125\5*\26\2\u0124\u0123\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\21\2\2\u0127)\3\2\2\2"+
		"\u0128\u012d\5\66\34\2\u0129\u012a\7\b\2\2\u012a\u012c\5\66\34\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e+\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\30\2\2\u0131\u0132"+
		"\7\20\2\2\u0132\u0133\5\60\31\2\u0133\u0134\7\21\2\2\u0134\u0137\5 \21"+
		"\2\u0135\u0136\7\31\2\2\u0136\u0138\5 \21\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138-\3\2\2\2\u0139\u013a\7\32\2\2\u013a\u013c\7\20\2"+
		"\2\u013b\u013d\5\"\22\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0140\7\t\2\2\u013f\u0141\5\60\31\2\u0140\u013f\3"+
		"\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\7\t\2\2\u0143"+
		"\u0145\5\"\22\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3"+
		"\2\2\2\u0146\u0147\7\21\2\2\u0147\u0148\5 \21\2\u0148/\3\2\2\2\u0149\u014e"+
		"\5\62\32\2\u014a\u014b\7\33\2\2\u014b\u014d\5\62\32\2\u014c\u014a\3\2"+
		"\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\61\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0156\5\64\33\2\u0152\u0153\7\34"+
		"\2\2\u0153\u0155\5\64\33\2\u0154\u0152\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\63\3\2\2\2\u0158\u0156\3\2\2"+
		"\2\u0159\u015d\5\66\34\2\u015a\u015b\5> \2\u015b\u015c\5\66\34\2\u015c"+
		"\u015e\3\2\2\2\u015d\u015a\3\2\2\2\u015d\u015e\3\2\2\2\u015e\65\3\2\2"+
		"\2\u015f\u0161\7*\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0168\58\35\2\u0163\u0164\5@!\2\u0164\u0165\58\35\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0163\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0168\u0169\3\2\2\2\u0169\67\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u0171"+
		"\5:\36\2\u016c\u016d\5B\"\2\u016d\u016e\5:\36\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016c\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u01729\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0176\5<\37\2\u0175\u0177"+
		"\5(\25\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0186\3\2\2\2\u0178"+
		"\u0186\5\b\5\2\u0179\u017a\7\35\2\2\u017a\u017f\5\36\20\2\u017b\u017c"+
		"\7\36\2\2\u017c\u017d\5\66\34\2\u017d\u017e\7\37\2\2\u017e\u0180\3\2\2"+
		"\2\u017f\u017b\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0186\3\2\2\2\u0181\u0182"+
		"\7\20\2\2\u0182\u0183\5\66\34\2\u0183\u0184\7\21\2\2\u0184\u0186\3\2\2"+
		"\2\u0185\u0174\3\2\2\2\u0185\u0178\3\2\2\2\u0185\u0179\3\2\2\2\u0185\u0181"+
		"\3\2\2\2\u0186;\3\2\2\2\u0187\u0190\7\61\2\2\u0188\u0189\7 \2\2\u0189"+
		"\u018f\7\61\2\2\u018a\u018b\7\36\2\2\u018b\u018c\5\66\34\2\u018c\u018d"+
		"\7\37\2\2\u018d\u018f\3\2\2\2\u018e\u0188\3\2\2\2\u018e\u018a\3\2\2\2"+
		"\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191=\3"+
		"\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\t\4\2\2\u0194?\3\2\2\2\u0195\u0196"+
		"\t\5\2\2\u0196A\3\2\2\2\u0197\u0198\t\6\2\2\u0198C\3\2\2\2,IPZgt{\u0085"+
		"\u008d\u0093\u009b\u009e\u00a4\u00ab\u00af\u00b9\u00c2\u00cb\u00d1\u00d8"+
		"\u00df\u00e9\u00f9\u010c\u0110\u011b\u0124\u012d\u0137\u013c\u0140\u0144"+
		"\u014e\u0156\u015d\u0160\u0168\u0171\u0176\u017f\u0185\u018e\u0190";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}