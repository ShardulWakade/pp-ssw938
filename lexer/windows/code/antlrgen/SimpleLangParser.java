// Generated from .\SimpleLang.g4 by ANTLR 4.9.2

package antlrgen;

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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INCR=37, DECR=38, RELEQ=39, 
		RELNE=40, RELGT=41, RELGE=42, RELLT=43, RELLE=44, ADD=45, SUB=46, MUL=47, 
		DIV=48, MOD=49, NUMCONST=50, CHARCONST=51, BOOLCONST=52, ID=53, SLCOMMENT=54, 
		WS=55;
	public static final int
		RULE_project = 0, RULE_declarations = 1, RULE_constdecl = 2, RULE_constvalue = 3, 
		RULE_vardecl = 4, RULE_singlevardecl = 5, RULE_enumdecl = 6, RULE_numdecl = 7, 
		RULE_classdecl = 8, RULE_interfacedecl = 9, RULE_interfacemethoddecl = 10, 
		RULE_methoddecl = 11, RULE_returntype = 12, RULE_formalparams = 13, RULE_classext = 14, 
		RULE_interfaceimpl = 15, RULE_type = 16, RULE_statement = 17, RULE_designatorstatement = 18, 
		RULE_assignExpr = 19, RULE_unaryop = 20, RULE_functioncall = 21, RULE_actualpars = 22, 
		RULE_ifelsestatement = 23, RULE_forloopstatement = 24, RULE_condition = 25, 
		RULE_condterm = 26, RULE_condfact = 27, RULE_expr = 28, RULE_term = 29, 
		RULE_factor = 30, RULE_designator = 31, RULE_relop = 32, RULE_addop = 33, 
		RULE_mulop = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"project", "declarations", "constdecl", "constvalue", "vardecl", "singlevardecl", 
			"enumdecl", "numdecl", "classdecl", "interfacedecl", "interfacemethoddecl", 
			"methoddecl", "returntype", "formalparams", "classext", "interfaceimpl", 
			"type", "statement", "designatorstatement", "assignExpr", "unaryop", 
			"functioncall", "actualpars", "ifelsestatement", "forloopstatement", 
			"condition", "condterm", "condfact", "expr", "term", "factor", "designator", 
			"relop", "addop", "mulop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'project'", "'{'", "'}'", "'const'", "'int'", "'='", "','", "';'", 
			"'char'", "'boolean'", "'[]'", "'enum'", "'class'", "'interface'", "'('", 
			"')'", "'void'", "'extends'", "'implements'", "'break'", "'continue'", 
			"'return'", "'read'", "'print'", "'if'", "'else'", "'for'", "'||'", "'&&'", 
			"'ord'", "'chr'", "'len'", "'new'", "'['", "']'", "'.'", "'++'", "'--'", 
			"'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", 
			"'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INCR", "DECR", "RELEQ", "RELNE", "RELGT", "RELGE", "RELLT", "RELLE", 
			"ADD", "SUB", "MUL", "DIV", "MOD", "NUMCONST", "CHARCONST", "BOOLCONST", 
			"ID", "SLCOMMENT", "WS"
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
			setState(70);
			match(T__0);
			setState(71);
			match(ID);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << ID))) != 0)) {
				{
				{
				setState(72);
				declarations();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(T__1);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				{
				setState(79);
				methoddecl();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new ProjectConstDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				constdecl();
				}
				break;
			case T__4:
			case T__8:
			case T__9:
			case ID:
				_localctx = new ProjectVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				vardecl();
				}
				break;
			case T__12:
				_localctx = new ProjectClassDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				classdecl();
				}
				break;
			case T__11:
				_localctx = new ProjectEnumDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				enumdecl();
				}
				break;
			case T__13:
				_localctx = new ProjectInterfaceDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
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
		public ConstdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdecl; }
	 
		public ConstdeclContext() { }
		public void copyFrom(ConstdeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharConstDeclContext extends ConstdeclContext {
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public List<TerminalNode> CHARCONST() { return getTokens(SimpleLangParser.CHARCONST); }
		public TerminalNode CHARCONST(int i) {
			return getToken(SimpleLangParser.CHARCONST, i);
		}
		public CharConstDeclContext(ConstdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCharConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCharConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCharConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntConstDeclContext extends ConstdeclContext {
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public List<TerminalNode> NUMCONST() { return getTokens(SimpleLangParser.NUMCONST); }
		public TerminalNode NUMCONST(int i) {
			return getToken(SimpleLangParser.NUMCONST, i);
		}
		public IntConstDeclContext(ConstdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIntConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIntConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIntConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolConstDeclContext extends ConstdeclContext {
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public List<TerminalNode> BOOLCONST() { return getTokens(SimpleLangParser.BOOLCONST); }
		public TerminalNode BOOLCONST(int i) {
			return getToken(SimpleLangParser.BOOLCONST, i);
		}
		public BoolConstDeclContext(ConstdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBoolConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBoolConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBoolConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstdeclContext constdecl() throws RecognitionException {
		ConstdeclContext _localctx = new ConstdeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constdecl);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IntConstDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__3);
				setState(95);
				match(T__4);
				setState(96);
				match(ID);
				setState(97);
				match(T__5);
				setState(98);
				match(NUMCONST);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(99);
					match(T__6);
					setState(100);
					match(ID);
					setState(101);
					match(T__5);
					setState(102);
					match(NUMCONST);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new CharConstDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__3);
				setState(110);
				match(T__8);
				setState(111);
				match(ID);
				setState(112);
				match(T__5);
				setState(113);
				match(CHARCONST);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(114);
					match(T__6);
					setState(115);
					match(ID);
					setState(116);
					match(T__5);
					setState(117);
					match(CHARCONST);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new BoolConstDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(T__3);
				setState(125);
				match(T__9);
				setState(126);
				match(ID);
				setState(127);
				match(T__5);
				setState(128);
				match(BOOLCONST);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(129);
					match(T__6);
					setState(130);
					match(ID);
					setState(131);
					match(T__5);
					setState(132);
					match(BOOLCONST);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(T__7);
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
			setState(141);
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
			setState(143);
			type();
			setState(144);
			singlevardecl();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(145);
				match(T__6);
				setState(146);
				singlevardecl();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(T__7);
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
			setState(154);
			match(ID);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(155);
				match(T__10);
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
			setState(158);
			match(T__11);
			setState(159);
			match(ID);
			setState(160);
			match(T__1);
			setState(161);
			numdecl();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(162);
				match(T__6);
				setState(163);
				numdecl();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
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
			setState(171);
			match(ID);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(172);
				match(T__5);
				setState(173);
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
		public ClassextContext classext() {
			return getRuleContext(ClassextContext.class,0);
		}
		public InterfaceimplContext interfaceimpl() {
			return getRuleContext(InterfaceimplContext.class,0);
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
			setState(176);
			match(T__12);
			setState(177);
			match(ID);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(178);
				classext();
				}
			}

			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(181);
				interfaceimpl();
				}
			}

			setState(184);
			match(T__1);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0)) {
				{
				{
				setState(185);
				vardecl();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(191);
				match(T__1);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					{
					setState(192);
					methoddecl();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(T__2);
				}
			}

			setState(201);
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
			setState(203);
			match(T__13);
			setState(204);
			match(ID);
			setState(205);
			match(T__1);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				{
				setState(206);
				interfacemethoddecl();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
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
			setState(214);
			returntype();
			setState(215);
			match(ID);
			setState(216);
			match(T__14);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0)) {
				{
				setState(217);
				formalparams();
				}
			}

			setState(220);
			match(T__15);
			setState(221);
			match(T__7);
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
			setState(223);
			returntype();
			setState(224);
			match(ID);
			setState(225);
			match(T__14);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0)) {
				{
				setState(226);
				formalparams();
				}
			}

			setState(229);
			match(T__15);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0)) {
				{
				{
				setState(230);
				vardecl();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(T__1);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << ID))) != 0)) {
				{
				{
				setState(237);
				statement();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
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
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__8:
			case T__9:
			case ID:
				_localctx = new NonVoidReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				type();
				}
				break;
			case T__16:
				_localctx = new VoidReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__16);
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
			setState(249);
			type();
			setState(250);
			singlevardecl();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(251);
				match(T__6);
				setState(252);
				type();
				setState(253);
				singlevardecl();
				}
				}
				setState(259);
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

	public static class ClassextContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public ClassextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterClassext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitClassext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitClassext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassextContext classext() throws RecognitionException {
		ClassextContext _localctx = new ClassextContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(260);
			match(T__17);
			setState(261);
			match(ID);
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

	public static class InterfaceimplContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public InterfaceimplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceimpl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInterfaceimpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInterfaceimpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInterfaceimpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceimplContext interfaceimpl() throws RecognitionException {
		InterfaceimplContext _localctx = new InterfaceimplContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceimpl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(263);
			match(T__18);
			setState(264);
			match(ID);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(265);
				match(T__6);
				setState(266);
				match(ID);
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypeContext extends ParserRuleContext {
		public Token t;
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
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			((TypeContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0)) ) {
				((TypeContext)_localctx).t = (Token)_errHandler.recoverInline(this);
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
		enterRule(_localctx, 34, RULE_statement);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StatementDesignatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				designatorstatement();
				setState(275);
				match(T__7);
				}
				break;
			case T__24:
				_localctx = new StatementIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				ifelsestatement();
				}
				break;
			case T__26:
				_localctx = new StatementForLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				forloopstatement();
				}
				break;
			case T__19:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(T__19);
				setState(280);
				match(T__7);
				}
				break;
			case T__20:
				_localctx = new StatementContinueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				match(T__20);
				setState(282);
				match(T__7);
				}
				break;
			case T__21:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				match(T__21);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << SUB) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLCONST) | (1L << ID))) != 0)) {
					{
					setState(284);
					expr();
					}
				}

				setState(287);
				match(T__7);
				}
				break;
			case T__22:
				_localctx = new StatementReadContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				match(T__22);
				setState(289);
				match(T__14);
				setState(290);
				designator();
				setState(291);
				match(T__15);
				setState(292);
				match(T__7);
				}
				break;
			case T__23:
				_localctx = new StatementPrintContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(294);
				match(T__23);
				setState(295);
				match(T__14);
				setState(296);
				actualpars();
				setState(297);
				match(T__15);
				setState(298);
				match(T__7);
				}
				break;
			case T__1:
				_localctx = new StatementBlockContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(300);
				match(T__1);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << ID))) != 0)) {
					{
					{
					setState(301);
					statement();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307);
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
		enterRule(_localctx, 36, RULE_designatorstatement);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new DesignatorAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				designator();
				setState(311);
				assignExpr();
				}
				break;
			case 2:
				_localctx = new DesignatorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				designator();
				setState(314);
				functioncall();
				}
				break;
			case 3:
				_localctx = new DesignatorUnaryOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				designator();
				setState(317);
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
		enterRule(_localctx, 38, RULE_assignExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__5);
			setState(322);
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
		enterRule(_localctx, 40, RULE_unaryop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
		enterRule(_localctx, 42, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__14);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << SUB) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLCONST) | (1L << ID))) != 0)) {
				{
				setState(327);
				actualpars();
				}
			}

			setState(330);
			match(T__15);
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
		enterRule(_localctx, 44, RULE_actualpars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			expr();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(333);
				match(T__6);
				setState(334);
				expr();
				}
				}
				setState(339);
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
		enterRule(_localctx, 46, RULE_ifelsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__24);
			setState(341);
			match(T__14);
			setState(342);
			condition();
			setState(343);
			match(T__15);
			setState(344);
			statement();
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(345);
				match(T__25);
				setState(346);
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
		enterRule(_localctx, 48, RULE_forloopstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__26);
			setState(350);
			match(T__14);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(351);
				designatorstatement();
				}
			}

			setState(354);
			match(T__7);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << SUB) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLCONST) | (1L << ID))) != 0)) {
				{
				setState(355);
				condition();
				}
			}

			setState(358);
			match(T__7);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(359);
				designatorstatement();
				}
			}

			setState(362);
			match(T__15);
			setState(363);
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
		enterRule(_localctx, 50, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			condterm();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(366);
				match(T__27);
				setState(367);
				condterm();
				}
				}
				setState(372);
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
		enterRule(_localctx, 52, RULE_condterm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			condfact();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(374);
				match(T__28);
				setState(375);
				condfact();
				}
				}
				setState(380);
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
		enterRule(_localctx, 54, RULE_condfact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			expr();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELEQ) | (1L << RELNE) | (1L << RELGT) | (1L << RELGE) | (1L << RELLT) | (1L << RELLE))) != 0)) {
				{
				setState(382);
				relop();
				setState(383);
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
		enterRule(_localctx, 56, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(387);
				match(SUB);
				}
			}

			setState(390);
			term();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(391);
				addop();
				setState(392);
				term();
				}
				}
				setState(398);
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
		enterRule(_localctx, 58, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			factor();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(400);
				mulop();
				setState(401);
				factor();
				}
				}
				setState(407);
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
	public static class OrdFunctionContext extends FactorContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public OrdFunctionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterOrdFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitOrdFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitOrdFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LenFunctionContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LenFunctionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterLenFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitLenFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitLenFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChrFunctionContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ChrFunctionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterChrFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitChrFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitChrFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_factor);
		int _la;
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				_localctx = new OrdFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(T__29);
				setState(409);
				match(T__14);
				setState(410);
				designator();
				setState(411);
				match(T__15);
				}
				break;
			case T__30:
				_localctx = new ChrFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(T__30);
				setState(414);
				match(T__14);
				setState(415);
				expr();
				setState(416);
				match(T__15);
				}
				break;
			case T__31:
				_localctx = new LenFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				match(T__31);
				setState(419);
				match(T__14);
				setState(420);
				expr();
				setState(421);
				match(T__15);
				}
				break;
			case ID:
				_localctx = new DesignatorFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				designator();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(424);
					functioncall();
					}
				}

				}
				break;
			case NUMCONST:
			case CHARCONST:
			case BOOLCONST:
				_localctx = new ConstFactorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(427);
				constvalue();
				}
				break;
			case T__32:
				_localctx = new NewFactorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(428);
				match(T__32);
				setState(429);
				type();
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(430);
					match(T__33);
					setState(431);
					expr();
					setState(432);
					match(T__34);
					}
				}

				}
				break;
			case T__14:
				_localctx = new ParenFactorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(436);
				match(T__14);
				setState(437);
				expr();
				setState(438);
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
		enterRule(_localctx, 62, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(ID);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33 || _la==T__35) {
				{
				setState(449);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(443);
					match(T__35);
					setState(444);
					match(ID);
					}
					break;
				case T__33:
					{
					setState(445);
					match(T__33);
					setState(446);
					expr();
					setState(447);
					match(T__34);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(453);
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
		enterRule(_localctx, 64, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
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
		enterRule(_localctx, 66, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
		enterRule(_localctx, 68, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u01cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\7"+
		"\2S\n\2\f\2\16\2V\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4y\n\4\f\4\16\4|\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4\u0088\n\4\f\4\16\4\u008b\13\4\3\4\5\4\u008e\n\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\7\6\u0096\n\6\f\6\16\6\u0099\13\6\3\6\3\6\3\7\3\7"+
		"\5\7\u009f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\5\t\u00b1\n\t\3\n\3\n\3\n\5\n\u00b6\n\n\3\n\5\n"+
		"\u00b9\n\n\3\n\3\n\7\n\u00bd\n\n\f\n\16\n\u00c0\13\n\3\n\3\n\7\n\u00c4"+
		"\n\n\f\n\16\n\u00c7\13\n\3\n\5\n\u00ca\n\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\7\13\u00d2\n\13\f\13\16\13\u00d5\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f"+
		"\u00dd\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00e6\n\r\3\r\3\r\7\r\u00ea"+
		"\n\r\f\r\16\r\u00ed\13\r\3\r\3\r\7\r\u00f1\n\r\f\r\16\r\u00f4\13\r\3\r"+
		"\3\r\3\16\3\16\5\16\u00fa\n\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0102"+
		"\n\17\f\17\16\17\u0105\13\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u010e"+
		"\n\21\f\21\16\21\u0111\13\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u0120\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0131\n\23\f\23\16"+
		"\23\u0134\13\23\3\23\5\23\u0137\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0142\n\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\5\27\u014b"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u0152\n\30\f\30\16\30\u0155\13\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u015e\n\31\3\32\3\32\3\32\5\32"+
		"\u0163\n\32\3\32\3\32\5\32\u0167\n\32\3\32\3\32\5\32\u016b\n\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\7\33\u0173\n\33\f\33\16\33\u0176\13\33\3\34\3"+
		"\34\3\34\7\34\u017b\n\34\f\34\16\34\u017e\13\34\3\35\3\35\3\35\3\35\5"+
		"\35\u0184\n\35\3\36\5\36\u0187\n\36\3\36\3\36\3\36\3\36\7\36\u018d\n\36"+
		"\f\36\16\36\u0190\13\36\3\37\3\37\3\37\3\37\7\37\u0196\n\37\f\37\16\37"+
		"\u0199\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01ac"+
		"\n \3 \3 \3 \3 \3 \3 \3 \5 \u01b5\n \3 \3 \3 \3 \5 \u01bb\n \3!\3!\3!"+
		"\3!\3!\3!\3!\7!\u01c4\n!\f!\16!\u01c7\13!\3\"\3\"\3#\3#\3$\3$\3$\2\2%"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2"+
		"\b\3\2\64\66\5\2\7\7\13\f\67\67\3\2\'(\3\2).\3\2/\60\3\2\61\63\2\u01e9"+
		"\2H\3\2\2\2\4^\3\2\2\2\6\u008d\3\2\2\2\b\u008f\3\2\2\2\n\u0091\3\2\2\2"+
		"\f\u009c\3\2\2\2\16\u00a0\3\2\2\2\20\u00ad\3\2\2\2\22\u00b2\3\2\2\2\24"+
		"\u00cd\3\2\2\2\26\u00d8\3\2\2\2\30\u00e1\3\2\2\2\32\u00f9\3\2\2\2\34\u00fb"+
		"\3\2\2\2\36\u0106\3\2\2\2 \u0109\3\2\2\2\"\u0112\3\2\2\2$\u0136\3\2\2"+
		"\2&\u0141\3\2\2\2(\u0143\3\2\2\2*\u0146\3\2\2\2,\u0148\3\2\2\2.\u014e"+
		"\3\2\2\2\60\u0156\3\2\2\2\62\u015f\3\2\2\2\64\u016f\3\2\2\2\66\u0177\3"+
		"\2\2\28\u017f\3\2\2\2:\u0186\3\2\2\2<\u0191\3\2\2\2>\u01ba\3\2\2\2@\u01bc"+
		"\3\2\2\2B\u01c8\3\2\2\2D\u01ca\3\2\2\2F\u01cc\3\2\2\2HI\7\3\2\2IM\7\67"+
		"\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2"+
		"\2\2PT\7\4\2\2QS\5\30\r\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3"+
		"\2\2\2VT\3\2\2\2WX\7\5\2\2X\3\3\2\2\2Y_\5\6\4\2Z_\5\n\6\2[_\5\22\n\2\\"+
		"_\5\16\b\2]_\5\24\13\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2"+
		"\2\2_\5\3\2\2\2`a\7\6\2\2ab\7\7\2\2bc\7\67\2\2cd\7\b\2\2dk\7\64\2\2ef"+
		"\7\t\2\2fg\7\67\2\2gh\7\b\2\2hj\7\64\2\2ie\3\2\2\2jm\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2n\u008e\7\n\2\2op\7\6\2\2pq\7\13\2\2qr\7"+
		"\67\2\2rs\7\b\2\2sz\7\65\2\2tu\7\t\2\2uv\7\67\2\2vw\7\b\2\2wy\7\65\2\2"+
		"xt\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\u008e\7"+
		"\n\2\2~\177\7\6\2\2\177\u0080\7\f\2\2\u0080\u0081\7\67\2\2\u0081\u0082"+
		"\7\b\2\2\u0082\u0089\7\66\2\2\u0083\u0084\7\t\2\2\u0084\u0085\7\67\2\2"+
		"\u0085\u0086\7\b\2\2\u0086\u0088\7\66\2\2\u0087\u0083\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008e\7\n\2\2\u008d`\3\2\2\2\u008do\3\2\2\2\u008d"+
		"~\3\2\2\2\u008e\7\3\2\2\2\u008f\u0090\t\2\2\2\u0090\t\3\2\2\2\u0091\u0092"+
		"\5\"\22\2\u0092\u0097\5\f\7\2\u0093\u0094\7\t\2\2\u0094\u0096\5\f\7\2"+
		"\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\n\2\2\u009b"+
		"\13\3\2\2\2\u009c\u009e\7\67\2\2\u009d\u009f\7\r\2\2\u009e\u009d\3\2\2"+
		"\2\u009e\u009f\3\2\2\2\u009f\r\3\2\2\2\u00a0\u00a1\7\16\2\2\u00a1\u00a2"+
		"\7\67\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a8\5\20\t\2\u00a4\u00a5\7\t\2\2"+
		"\u00a5\u00a7\5\20\t\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ac\7\5\2\2\u00ac\17\3\2\2\2\u00ad\u00b0\7\67\2\2\u00ae\u00af\7\b\2"+
		"\2\u00af\u00b1\7\64\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\21\3\2\2\2\u00b2\u00b3\7\17\2\2\u00b3\u00b5\7\67\2\2\u00b4\u00b6\5\36"+
		"\20\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b9\5 \21\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00be\7\4\2\2\u00bb\u00bd\5\n\6\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c9\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c5\7\4\2\2\u00c2\u00c4\5\30\r\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\7\5\2\2\u00c9"+
		"\u00c1\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\5"+
		"\2\2\u00cc\23\3\2\2\2\u00cd\u00ce\7\20\2\2\u00ce\u00cf\7\67\2\2\u00cf"+
		"\u00d3\7\4\2\2\u00d0\u00d2\5\26\f\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d7\7\5\2\2\u00d7\25\3\2\2\2\u00d8\u00d9\5\32\16"+
		"\2\u00d9\u00da\7\67\2\2\u00da\u00dc\7\21\2\2\u00db\u00dd\5\34\17\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\22"+
		"\2\2\u00df\u00e0\7\n\2\2\u00e0\27\3\2\2\2\u00e1\u00e2\5\32\16\2\u00e2"+
		"\u00e3\7\67\2\2\u00e3\u00e5\7\21\2\2\u00e4\u00e6\5\34\17\2\u00e5\u00e4"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00eb\7\22\2\2"+
		"\u00e8\u00ea\5\n\6\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f2\7\4\2\2\u00ef\u00f1\5$\23\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f6\7\5\2\2\u00f6\31\3\2\2\2\u00f7\u00fa\5\"\22"+
		"\2\u00f8\u00fa\7\23\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\33\3\2\2\2\u00fb\u00fc\5\"\22\2\u00fc\u0103\5\f\7\2\u00fd\u00fe\7\t\2"+
		"\2\u00fe\u00ff\5\"\22\2\u00ff\u0100\5\f\7\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00fd\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\35\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\24\2\2\u0107\u0108"+
		"\7\67\2\2\u0108\37\3\2\2\2\u0109\u010a\7\25\2\2\u010a\u010f\7\67\2\2\u010b"+
		"\u010c\7\t\2\2\u010c\u010e\7\67\2\2\u010d\u010b\3\2\2\2\u010e\u0111\3"+
		"\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110!\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0112\u0113\t\3\2\2\u0113#\3\2\2\2\u0114\u0115\5&\24\2\u0115"+
		"\u0116\7\n\2\2\u0116\u0137\3\2\2\2\u0117\u0137\5\60\31\2\u0118\u0137\5"+
		"\62\32\2\u0119\u011a\7\26\2\2\u011a\u0137\7\n\2\2\u011b\u011c\7\27\2\2"+
		"\u011c\u0137\7\n\2\2\u011d\u011f\7\30\2\2\u011e\u0120\5:\36\2\u011f\u011e"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0137\7\n\2\2\u0122"+
		"\u0123\7\31\2\2\u0123\u0124\7\21\2\2\u0124\u0125\5@!\2\u0125\u0126\7\22"+
		"\2\2\u0126\u0127\7\n\2\2\u0127\u0137\3\2\2\2\u0128\u0129\7\32\2\2\u0129"+
		"\u012a\7\21\2\2\u012a\u012b\5.\30\2\u012b\u012c\7\22\2\2\u012c\u012d\7"+
		"\n\2\2\u012d\u0137\3\2\2\2\u012e\u0132\7\4\2\2\u012f\u0131\5$\23\2\u0130"+
		"\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137\7\5\2\2\u0136"+
		"\u0114\3\2\2\2\u0136\u0117\3\2\2\2\u0136\u0118\3\2\2\2\u0136\u0119\3\2"+
		"\2\2\u0136\u011b\3\2\2\2\u0136\u011d\3\2\2\2\u0136\u0122\3\2\2\2\u0136"+
		"\u0128\3\2\2\2\u0136\u012e\3\2\2\2\u0137%\3\2\2\2\u0138\u0139\5@!\2\u0139"+
		"\u013a\5(\25\2\u013a\u0142\3\2\2\2\u013b\u013c\5@!\2\u013c\u013d\5,\27"+
		"\2\u013d\u0142\3\2\2\2\u013e\u013f\5@!\2\u013f\u0140\5*\26\2\u0140\u0142"+
		"\3\2\2\2\u0141\u0138\3\2\2\2\u0141\u013b\3\2\2\2\u0141\u013e\3\2\2\2\u0142"+
		"\'\3\2\2\2\u0143\u0144\7\b\2\2\u0144\u0145\5:\36\2\u0145)\3\2\2\2\u0146"+
		"\u0147\t\4\2\2\u0147+\3\2\2\2\u0148\u014a\7\21\2\2\u0149\u014b\5.\30\2"+
		"\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d"+
		"\7\22\2\2\u014d-\3\2\2\2\u014e\u0153\5:\36\2\u014f\u0150\7\t\2\2\u0150"+
		"\u0152\5:\36\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154/\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157"+
		"\7\33\2\2\u0157\u0158\7\21\2\2\u0158\u0159\5\64\33\2\u0159\u015a\7\22"+
		"\2\2\u015a\u015d\5$\23\2\u015b\u015c\7\34\2\2\u015c\u015e\5$\23\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\61\3\2\2\2\u015f\u0160\7\35\2"+
		"\2\u0160\u0162\7\21\2\2\u0161\u0163\5&\24\2\u0162\u0161\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\7\n\2\2\u0165\u0167\5\64"+
		"\33\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\7\n\2\2\u0169\u016b\5&\24\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7\22\2\2\u016d\u016e\5$\23\2\u016e"+
		"\63\3\2\2\2\u016f\u0174\5\66\34\2\u0170\u0171\7\36\2\2\u0171\u0173\5\66"+
		"\34\2\u0172\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\65\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u017c\58\35"+
		"\2\u0178\u0179\7\37\2\2\u0179\u017b\58\35\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\67\3\2\2"+
		"\2\u017e\u017c\3\2\2\2\u017f\u0183\5:\36\2\u0180\u0181\5B\"\2\u0181\u0182"+
		"\5:\36\2\u0182\u0184\3\2\2\2\u0183\u0180\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"9\3\2\2\2\u0185\u0187\7\60\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2"+
		"\u0187\u0188\3\2\2\2\u0188\u018e\5<\37\2\u0189\u018a\5D#\2\u018a\u018b"+
		"\5<\37\2\u018b\u018d\3\2\2\2\u018c\u0189\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f;\3\2\2\2\u0190\u018e\3\2\2\2"+
		"\u0191\u0197\5> \2\u0192\u0193\5F$\2\u0193\u0194\5> \2\u0194\u0196\3\2"+
		"\2\2\u0195\u0192\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198=\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7 \2\2\u019b"+
		"\u019c\7\21\2\2\u019c\u019d\5@!\2\u019d\u019e\7\22\2\2\u019e\u01bb\3\2"+
		"\2\2\u019f\u01a0\7!\2\2\u01a0\u01a1\7\21\2\2\u01a1\u01a2\5:\36\2\u01a2"+
		"\u01a3\7\22\2\2\u01a3\u01bb\3\2\2\2\u01a4\u01a5\7\"\2\2\u01a5\u01a6\7"+
		"\21\2\2\u01a6\u01a7\5:\36\2\u01a7\u01a8\7\22\2\2\u01a8\u01bb\3\2\2\2\u01a9"+
		"\u01ab\5@!\2\u01aa\u01ac\5,\27\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2"+
		"\2\u01ac\u01bb\3\2\2\2\u01ad\u01bb\5\b\5\2\u01ae\u01af\7#\2\2\u01af\u01b4"+
		"\5\"\22\2\u01b0\u01b1\7$\2\2\u01b1\u01b2\5:\36\2\u01b2\u01b3\7%\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01bb\3\2"+
		"\2\2\u01b6\u01b7\7\21\2\2\u01b7\u01b8\5:\36\2\u01b8\u01b9\7\22\2\2\u01b9"+
		"\u01bb\3\2\2\2\u01ba\u019a\3\2\2\2\u01ba\u019f\3\2\2\2\u01ba\u01a4\3\2"+
		"\2\2\u01ba\u01a9\3\2\2\2\u01ba\u01ad\3\2\2\2\u01ba\u01ae\3\2\2\2\u01ba"+
		"\u01b6\3\2\2\2\u01bb?\3\2\2\2\u01bc\u01c5\7\67\2\2\u01bd\u01be\7&\2\2"+
		"\u01be\u01c4\7\67\2\2\u01bf\u01c0\7$\2\2\u01c0\u01c1\5:\36\2\u01c1\u01c2"+
		"\7%\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01bd\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c4"+
		"\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6A\3\2\2\2"+
		"\u01c7\u01c5\3\2\2\2\u01c8\u01c9\t\5\2\2\u01c9C\3\2\2\2\u01ca\u01cb\t"+
		"\6\2\2\u01cbE\3\2\2\2\u01cc\u01cd\t\7\2\2\u01cdG\3\2\2\2/MT^kz\u0089\u008d"+
		"\u0097\u009e\u00a8\u00b0\u00b5\u00b8\u00be\u00c5\u00c9\u00d3\u00dc\u00e5"+
		"\u00eb\u00f2\u00f9\u0103\u010f\u011f\u0132\u0136\u0141\u014a\u0153\u015d"+
		"\u0162\u0166\u016a\u0174\u017c\u0183\u0186\u018e\u0197\u01ab\u01b4\u01ba"+
		"\u01c3\u01c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}