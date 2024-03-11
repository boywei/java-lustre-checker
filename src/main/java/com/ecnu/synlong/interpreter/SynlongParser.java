// Generated from C:/ECNU/synTools/synlong/src/main/resources/SynlongParser.g4 by ANTLR 4.13.1
package com.ecnu.synlong.interpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SynlongParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, CHAR=2, BYTE=3, UBYTE=4, SHORT=5, USHORT=6, INT=7, UINT=8, LONG=9, 
		ULONG=10, FLOAT=11, REAL=12, CARET=13, COMMA=14, COLON=15, SEMI=16, ADD=17, 
		MINUS=18, MULTIPLY=19, DIVIDE=20, EQ=21, NEQ=22, LT=23, LTE=24, GT=25, 
		GTE=26, ARROW=27, PATHSEG=28, ELLIPSE=29, DIESE=30, DPATTEN=31, SEGREGATION=32, 
		DOT=33, NOT=34, DIV=35, MOD=36, AND=37, OR=38, XOR=39, LSHIFT=40, RSHIFT=41, 
		LP=42, RP=43, LB=44, RB=45, LBB=46, RBB=47, CONCAT=48, TYPE=49, CONST=50, 
		FUNC=51, NODE=52, IMPORTED=53, ENUM=54, RETURNS=55, AUTOMATON=56, MATCH=57, 
		INITIAL=58, FINAL=59, STATE=60, UNLESS=61, UNTIL=62, DO=63, RESUME=64, 
		RESTART=65, LAST=66, PRE=67, FBY=68, IF=69, THEN=70, ELSE=71, WHEN=72, 
		CASE=73, OF=74, DEFAULT=75, FLATTEN=76, MAKE=77, WITH=78, NOR=79, MAP=80, 
		MAPI=81, FOLD=82, FOLDI=83, MAPW=84, MAPWI=85, FOLDW=86, FOLDWI=87, MAPFOLD=88, 
		MERGE=89, ACTIVATE=90, VAR=91, LET=92, TEL=93, ASSIGN=94, UPLUS=95, UMINUS=96, 
		UNOT=97, UNARYSHORT=98, UNARYFLOAT=99, UNARYINT=100, UNARYREAL=101, BPLUS=102, 
		BMINUS=103, BMULTI=104, BDIVIDE=105, BMOD=106, BDIV=107, BEQ=108, BNEQ=109, 
		BLT=110, BLE=111, BGT=112, BGE=113, BAND=114, BOR=115, BXOR=116, BoolLiteral=117, 
		CharacterLiteral=118, IntegerLiteral=119, UnsignedIntegerLiteral=120, 
		FloatLiteral=121, RealLiteral=122, UnsignedShortLiteral=123, ShortLiteral=124, 
		ID=125, COMMENT=126, LINE_COMMENT=127, WS=128;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_typeBlock = 2, RULE_typeDecl = 3, 
		RULE_typeDef = 4, RULE_typeExpr = 5, RULE_fieldDecl = 6, RULE_typevar = 7, 
		RULE_constBlock = 8, RULE_constDecl = 9, RULE_constExpr = 10, RULE_constList = 11, 
		RULE_constLabelExpr = 12, RULE_varDecls = 13, RULE_varId = 14, RULE_whenDecl = 15, 
		RULE_clockExpr = 16, RULE_lastDecl = 17, RULE_userOpDecl = 18, RULE_opKind = 19, 
		RULE_params = 20, RULE_args = 21, RULE_opBody = 22, RULE_localBlock = 23, 
		RULE_equation = 24, RULE_lhs = 25, RULE_lhsId = 26, RULE_return = 27, 
		RULE_returnsVar = 28, RULE_stateMachine = 29, RULE_stateDecl = 30, RULE_dataDef = 31, 
		RULE_transition = 32, RULE_clockedBlock = 33, RULE_ifBlock = 34, RULE_matchBlock = 35, 
		RULE_expr = 36, RULE_list = 37, RULE_tempoExpr = 38, RULE_boolExpr = 39, 
		RULE_arrayExpr = 40, RULE_structExpr = 41, RULE_mixedConstructor = 42, 
		RULE_labelExpr = 43, RULE_index = 44, RULE_labelOrIndex = 45, RULE_switchExpr = 46, 
		RULE_caseExpr = 47, RULE_pattern = 48, RULE_applyExpr = 49, RULE_prefixOp = 50, 
		RULE_prefixUnaryOp = 51, RULE_prefixBinaryOp = 52, RULE_iterator = 53, 
		RULE_simpleExpr = 54, RULE_unaryArithOp = 55, RULE_binArithOp = 56, RULE_binRelationOp = 57, 
		RULE_binBoolOp = 58, RULE_atom = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "typeBlock", "typeDecl", "typeDef", "typeExpr", 
			"fieldDecl", "typevar", "constBlock", "constDecl", "constExpr", "constList", 
			"constLabelExpr", "varDecls", "varId", "whenDecl", "clockExpr", "lastDecl", 
			"userOpDecl", "opKind", "params", "args", "opBody", "localBlock", "equation", 
			"lhs", "lhsId", "return", "returnsVar", "stateMachine", "stateDecl", 
			"dataDef", "transition", "clockedBlock", "ifBlock", "matchBlock", "expr", 
			"list", "tempoExpr", "boolExpr", "arrayExpr", "structExpr", "mixedConstructor", 
			"labelExpr", "index", "labelOrIndex", "switchExpr", "caseExpr", "pattern", 
			"applyExpr", "prefixOp", "prefixUnaryOp", "prefixBinaryOp", "iterator", 
			"simpleExpr", "unaryArithOp", "binArithOp", "binRelationOp", "binBoolOp", 
			"atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'char'", "'byte'", "'ubyte'", "'short'", "'ushort'", 
			"'int'", "'uint'", "'long'", "'ulong'", "'float'", "'real'", "'^'", "','", 
			"':'", "';'", "'+'", "'-'", "'*'", "'/'", "'=='", "'<>'", "'<'", "'<='", 
			"'>'", "'>='", "'->'", "'::'", "'..'", "'#'", "'_'", "'\\u9225\\u65BA??'", 
			"'.'", "'not'", "'div'", "'mod'", "'and'", "'or'", "'xor'", "'<<'", "'>>'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'@'", "'type'", "'const'", 
			"'function'", "'node'", "'imported'", "'enum'", "'returns'", "'automaton'", 
			"'match'", "'initial'", "'final'", "'state'", "'unless'", "'until'", 
			"'do'", "'resume'", "'restart'", "'last'", "'pre'", "'fby'", "'if'", 
			"'then'", "'else'", "'when'", "'case'", "'of'", "'default'", "'flatten'", 
			"'make'", "'with'", "'nor'", "'map'", "'mapi'", "'fold'", "'foldi'", 
			"'mapw'", "'mapwi'", "'foldw'", "'foldwi'", "'mapfold'", "'merge'", "'activate'", 
			"'var'", "'let'", "'tel'", "'='", "'+$'", "'-$'", "'not$'", "'short$'", 
			"'float$'", "'int$'", "'real$'", "'$+$'", "'$-$'", "'$*$'", "'$/$'", 
			"'$mod$'", "'$div$'", "'$=$'", "'$<>$'", "'$<$'", "'$<=$'", "'$>$'", 
			"'$>=$'", "'$and$'", "'$or$'", "'$xor$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL", "CHAR", "BYTE", "UBYTE", "SHORT", "USHORT", "INT", "UINT", 
			"LONG", "ULONG", "FLOAT", "REAL", "CARET", "COMMA", "COLON", "SEMI", 
			"ADD", "MINUS", "MULTIPLY", "DIVIDE", "EQ", "NEQ", "LT", "LTE", "GT", 
			"GTE", "ARROW", "PATHSEG", "ELLIPSE", "DIESE", "DPATTEN", "SEGREGATION", 
			"DOT", "NOT", "DIV", "MOD", "AND", "OR", "XOR", "LSHIFT", "RSHIFT", "LP", 
			"RP", "LB", "RB", "LBB", "RBB", "CONCAT", "TYPE", "CONST", "FUNC", "NODE", 
			"IMPORTED", "ENUM", "RETURNS", "AUTOMATON", "MATCH", "INITIAL", "FINAL", 
			"STATE", "UNLESS", "UNTIL", "DO", "RESUME", "RESTART", "LAST", "PRE", 
			"FBY", "IF", "THEN", "ELSE", "WHEN", "CASE", "OF", "DEFAULT", "FLATTEN", 
			"MAKE", "WITH", "NOR", "MAP", "MAPI", "FOLD", "FOLDI", "MAPW", "MAPWI", 
			"FOLDW", "FOLDWI", "MAPFOLD", "MERGE", "ACTIVATE", "VAR", "LET", "TEL", 
			"ASSIGN", "UPLUS", "UMINUS", "UNOT", "UNARYSHORT", "UNARYFLOAT", "UNARYINT", 
			"UNARYREAL", "BPLUS", "BMINUS", "BMULTI", "BDIVIDE", "BMOD", "BDIV", 
			"BEQ", "BNEQ", "BLT", "BLE", "BGT", "BGE", "BAND", "BOR", "BXOR", "BoolLiteral", 
			"CharacterLiteral", "IntegerLiteral", "UnsignedIntegerLiteral", "FloatLiteral", 
			"RealLiteral", "UnsignedShortLiteral", "ShortLiteral", "ID", "COMMENT", 
			"LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "SynlongParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SynlongParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SynlongParser.EOF, 0); }
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8444249301319680L) != 0)) {
				{
				{
				setState(120);
				declarations();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsContext extends ParserRuleContext {
		public TypeBlockContext typeBlock() {
			return getRuleContext(TypeBlockContext.class,0);
		}
		public ConstBlockContext constBlock() {
			return getRuleContext(ConstBlockContext.class,0);
		}
		public UserOpDeclContext userOpDecl() {
			return getRuleContext(UserOpDeclContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				typeBlock();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				constBlock();
				}
				break;
			case FUNC:
			case NODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				userOpDecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeBlockContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(SynlongParser.TYPE, 0); }
		public List<TypeDeclContext> typeDecl() {
			return getRuleContexts(TypeDeclContext.class);
		}
		public TypeDeclContext typeDecl(int i) {
			return getRuleContext(TypeDeclContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SynlongParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SynlongParser.SEMI, i);
		}
		public TypeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterTypeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitTypeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitTypeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBlockContext typeBlock() throws RecognitionException {
		TypeBlockContext _localctx = new TypeBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(TYPE);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(134);
				typeDecl();
				setState(135);
				match(SEMI);
				}
				}
				setState(141);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SynlongParser.ASSIGN, 0); }
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitTypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ID);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(143);
				match(ASSIGN);
				setState(144);
				typeDef();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefContext extends ParserRuleContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(SynlongParser.ENUM, 0); }
		public TerminalNode LBB() { return getToken(SynlongParser.LBB, 0); }
		public List<TerminalNode> ID() { return getTokens(SynlongParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SynlongParser.ID, i);
		}
		public TerminalNode RBB() { return getToken(SynlongParser.RBB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SynlongParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SynlongParser.COMMA, i);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDef);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case BYTE:
			case SHORT:
			case USHORT:
			case INT:
			case UINT:
			case LONG:
			case ULONG:
			case FLOAT:
			case REAL:
			case LBB:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				typeExpr(0);
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(ENUM);
				setState(149);
				match(LBB);
				setState(150);
				match(ID);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					match(COMMA);
					setState(152);
					match(ID);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(RBB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeExprContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(SynlongParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(SynlongParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(SynlongParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(SynlongParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(SynlongParser.INT, 0); }
		public TerminalNode UINT() { return getToken(SynlongParser.UINT, 0); }
		public TerminalNode LONG() { return getToken(SynlongParser.LONG, 0); }
		public TerminalNode ULONG() { return getToken(SynlongParser.ULONG, 0); }
		public TerminalNode FLOAT() { return getToken(SynlongParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(SynlongParser.REAL, 0); }
		public TerminalNode USHORT() { return getToken(SynlongParser.USHORT, 0); }
		public TypevarContext typevar() {
			return getRuleContext(TypevarContext.class,0);
		}
		public TerminalNode LBB() { return getToken(SynlongParser.LBB, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public TerminalNode RBB() { return getToken(SynlongParser.RBB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SynlongParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SynlongParser.COMMA, i);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode CARET() { return getToken(SynlongParser.CARET, 0); }
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public TypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExprContext typeExpr() throws RecognitionException {
		return typeExpr(0);
	}

	private TypeExprContext typeExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeExprContext _localctx = new TypeExprContext(_ctx, _parentState);
		TypeExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_typeExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				{
				setState(162);
				match(BOOL);
				}
				break;
			case CHAR:
				{
				setState(163);
				match(CHAR);
				}
				break;
			case BYTE:
				{
				setState(164);
				match(BYTE);
				}
				break;
			case SHORT:
				{
				setState(165);
				match(SHORT);
				}
				break;
			case INT:
				{
				setState(166);
				match(INT);
				}
				break;
			case UINT:
				{
				setState(167);
				match(UINT);
				}
				break;
			case LONG:
				{
				setState(168);
				match(LONG);
				}
				break;
			case ULONG:
				{
				setState(169);
				match(ULONG);
				}
				break;
			case FLOAT:
				{
				setState(170);
				match(FLOAT);
				}
				break;
			case REAL:
				{
				setState(171);
				match(REAL);
				}
				break;
			case USHORT:
				{
				setState(172);
				match(USHORT);
				}
				break;
			case ID:
				{
				setState(173);
				typevar();
				}
				break;
			case LBB:
				{
				setState(174);
				match(LBB);
				setState(175);
				fieldDecl();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(176);
					match(COMMA);
					setState(177);
					fieldDecl();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(RBB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeExpr);
					setState(187);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(188);
					match(CARET);
					setState(189);
					constExpr(0);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TerminalNode COLON() { return getToken(SynlongParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
			setState(196);
			match(COLON);
			setState(197);
			typeExpr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypevarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TypevarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typevar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterTypevar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitTypevar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitTypevar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypevarContext typevar() throws RecognitionException {
		TypevarContext _localctx = new TypevarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typevar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstBlockContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SynlongParser.CONST, 0); }
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SynlongParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SynlongParser.SEMI, i);
		}
		public ConstBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterConstBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitConstBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitConstBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstBlockContext constBlock() throws RecognitionException {
		ConstBlockContext _localctx = new ConstBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(CONST);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(202);
				constDecl();
				setState(203);
				match(SEMI);
				}
				}
				setState(209);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TerminalNode COLON() { return getToken(SynlongParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SynlongParser.ASSIGN, 0); }
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ID);
			setState(211);
			match(COLON);
			setState(212);
			typeExpr(0);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(213);
				match(ASSIGN);
				setState(214);
				constExpr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public UnaryArithOpContext unaryArithOp() {
			return getRuleContext(UnaryArithOpContext.class,0);
		}
		public List<ConstExprContext> constExpr() {
			return getRuleContexts(ConstExprContext.class);
		}
		public ConstExprContext constExpr(int i) {
			return getRuleContext(ConstExprContext.class,i);
		}
		public TerminalNode LB() { return getToken(SynlongParser.LB, 0); }
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode RB() { return getToken(SynlongParser.RB, 0); }
		public TerminalNode LBB() { return getToken(SynlongParser.LBB, 0); }
		public List<ConstLabelExprContext> constLabelExpr() {
			return getRuleContexts(ConstLabelExprContext.class);
		}
		public ConstLabelExprContext constLabelExpr(int i) {
			return getRuleContext(ConstLabelExprContext.class,i);
		}
		public TerminalNode RBB() { return getToken(SynlongParser.RBB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SynlongParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SynlongParser.COMMA, i);
		}
		public BinArithOpContext binArithOp() {
			return getRuleContext(BinArithOpContext.class,0);
		}
		public BinBoolOpContext binBoolOp() {
			return getRuleContext(BinBoolOpContext.class,0);
		}
		public BinRelationOpContext binRelationOp() {
			return getRuleContext(BinRelationOpContext.class,0);
		}
		public ConstExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstExprContext constExpr() throws RecognitionException {
		return constExpr(0);
	}

	private ConstExprContext constExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstExprContext _localctx = new ConstExprContext(_ctx, _parentState);
		ConstExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_constExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(218);
				match(ID);
				}
				break;
			case BoolLiteral:
			case CharacterLiteral:
			case IntegerLiteral:
			case UnsignedIntegerLiteral:
			case FloatLiteral:
			case RealLiteral:
			case UnsignedShortLiteral:
			case ShortLiteral:
				{
				setState(219);
				atom();
				}
				break;
			case ADD:
			case MINUS:
			case NOT:
				{
				setState(220);
				unaryArithOp();
				setState(221);
				constExpr(6);
				}
				break;
			case LB:
				{
				setState(223);
				match(LB);
				setState(224);
				constList();
				setState(225);
				match(RB);
				}
				break;
			case LBB:
				{
				setState(227);
				match(LBB);
				setState(228);
				constLabelExpr();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(229);
					match(COMMA);
					setState(230);
					constLabelExpr();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(RBB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ConstExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constExpr);
						setState(240);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(241);
						binArithOp();
						setState(242);
						constExpr(6);
						}
						break;
					case 2:
						{
						_localctx = new ConstExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constExpr);
						setState(244);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(245);
						binBoolOp();
						setState(246);
						constExpr(5);
						}
						break;
					case 3:
						{
						_localctx = new ConstExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constExpr);
						setState(248);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(249);
						binRelationOp();
						setState(250);
						constExpr(4);
						}
						break;
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstListContext extends ParserRuleContext {
		public List<ConstExprContext> constExpr() {
			return getRuleContexts(ConstExprContext.class);
		}
		public ConstExprContext constExpr(int i) {
			return getRuleContext(ConstExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SynlongParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SynlongParser.COMMA, i);
		}
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterConstList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitConstList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitConstList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 87978110484480L) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 511L) != 0)) {
				{
				setState(257);
				constExpr(0);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(258);
					match(COMMA);
					setState(259);
					constExpr(0);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstLabelExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TerminalNode COLON() { return getToken(SynlongParser.COLON, 0); }
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public ConstLabelExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constLabelExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterConstLabelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitConstLabelExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitConstLabelExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstLabelExprContext constLabelExpr() throws RecognitionException {
		ConstLabelExprContext _localctx = new ConstLabelExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constLabelExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ID);
			setState(268);
			match(COLON);
			setState(269);
			constExpr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclsContext extends ParserRuleContext {
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public TerminalNode COLON() { return getToken(SynlongParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SynlongParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SynlongParser.COMMA, i);
		}
		public WhenDeclContext whenDecl() {
			return getRuleContext(WhenDeclContext.class,0);
		}
		public LastDeclContext lastDecl() {
			return getRuleContext(LastDeclContext.class,0);
		}
		public VarDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterVarDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitVarDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitVarDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclsContext varDecls() throws RecognitionException {
		VarDeclsContext _localctx = new VarDeclsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varDecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			varId();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(272);
				match(COMMA);
				setState(273);
				varId();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(COLON);
			setState(280);
			typeExpr(0);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(281);
				whenDecl();
				}
			}

			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LAST) {
				{
				setState(284);
				lastDecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public VarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitVarId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitVarId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIdContext varId() throws RecognitionException {
		VarIdContext _localctx = new VarIdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhenDeclContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(SynlongParser.WHEN, 0); }
		public ClockExprContext clockExpr() {
			return getRuleContext(ClockExprContext.class,0);
		}
		public WhenDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterWhenDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitWhenDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitWhenDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenDeclContext whenDecl() throws RecognitionException {
		WhenDeclContext _localctx = new WhenDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whenDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(WHEN);
			setState(290);
			clockExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClockExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TerminalNode NOT() { return getToken(SynlongParser.NOT, 0); }
		public ClockExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clockExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterClockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitClockExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitClockExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClockExprContext clockExpr() throws RecognitionException {
		ClockExprContext _localctx = new ClockExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_clockExpr);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(ID);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(NOT);
				setState(294);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LastDeclContext extends ParserRuleContext {
		public TerminalNode LAST() { return getToken(SynlongParser.LAST, 0); }
		public TerminalNode ASSIGN() { return getToken(SynlongParser.ASSIGN, 0); }
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public LastDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterLastDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitLastDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitLastDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastDeclContext lastDecl() throws RecognitionException {
		LastDeclContext _localctx = new LastDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lastDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(LAST);
			setState(298);
			match(ASSIGN);
			setState(299);
			constExpr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UserOpDeclContext extends ParserRuleContext {
		public OpKindContext opKind() {
			return getRuleContext(OpKindContext.class,0);
		}
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public TerminalNode RETURNS() { return getToken(SynlongParser.RETURNS, 0); }
		public TerminalNode SEMI() { return getToken(SynlongParser.SEMI, 0); }
		public OpBodyContext opBody() {
			return getRuleContext(OpBodyContext.class,0);
		}
		public TerminalNode FUNC() { return getToken(SynlongParser.FUNC, 0); }
		public TerminalNode IMPORTED() { return getToken(SynlongParser.IMPORTED, 0); }
		public UserOpDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userOpDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterUserOpDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitUserOpDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitUserOpDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserOpDeclContext userOpDecl() throws RecognitionException {
		UserOpDeclContext _localctx = new UserOpDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_userOpDecl);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				opKind();
				setState(302);
				match(ID);
				setState(303);
				params();
				setState(304);
				match(RETURNS);
				setState(305);
				params();
				setState(306);
				match(SEMI);
				setState(307);
				opBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(FUNC);
				setState(310);
				match(IMPORTED);
				setState(311);
				match(ID);
				setState(312);
				params();
				setState(313);
				match(RETURNS);
				setState(314);
				params();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpKindContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(SynlongParser.FUNC, 0); }
		public TerminalNode NODE() { return getToken(SynlongParser.NODE, 0); }
		public OpKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opKind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterOpKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitOpKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitOpKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpKindContext opKind() throws RecognitionException {
		OpKindContext _localctx = new OpKindContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_opKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==FUNC || _la==NODE) ) {
			_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(SynlongParser.LP, 0); }
		public TerminalNode RP() { return getToken(SynlongParser.RP, 0); }
		public List<VarDeclsContext> varDecls() {
			return getRuleContexts(VarDeclsContext.class);
		}
		public VarDeclsContext varDecls(int i) {
			return getRuleContext(VarDeclsContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SynlongParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SynlongParser.SEMI, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(LP);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(321);
				varDecls();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(322);
					match(SEMI);
					setState(323);
					varDecls();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(331);
			match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(SynlongParser.LP, 0); }
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TerminalNode RP() { return getToken(SynlongParser.RP, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_args);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(LP);
				setState(334);
				match(ID);
				setState(335);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(LP);
				setState(337);
				simpleExpr(0);
				setState(338);
				match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpBodyContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(SynlongParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SynlongParser.SEMI, i);
		}
		public TerminalNode LET() { return getToken(SynlongParser.LET, 0); }
		public TerminalNode TEL() { return getToken(SynlongParser.TEL, 0); }
		public LocalBlockContext localBlock() {
			return getRuleContext(LocalBlockContext.class,0);
		}
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public OpBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterOpBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitOpBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitOpBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpBodyContext opBody() throws RecognitionException {
		OpBodyContext _localctx = new OpBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opBody);
		int _la;
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(SEMI);
				}
				break;
			case VAR:
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(343);
					localBlock();
					}
				}

				setState(346);
				match(LET);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LP || _la==AUTOMATON || _la==ID) {
					{
					{
					setState(347);
					equation();
					setState(348);
					match(SEMI);
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(355);
				match(TEL);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(356);
					match(SEMI);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalBlockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SynlongParser.VAR, 0); }
		public List<VarDeclsContext> varDecls() {
			return getRuleContexts(VarDeclsContext.class);
		}
		public VarDeclsContext varDecls(int i) {
			return getRuleContext(VarDeclsContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SynlongParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SynlongParser.SEMI, i);
		}
		public LocalBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterLocalBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitLocalBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitLocalBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalBlockContext localBlock() throws RecognitionException {
		LocalBlockContext _localctx = new LocalBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_localBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(VAR);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					varDecls();
					setState(363);
					match(SEMI);
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EquationContext extends ParserRuleContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SynlongParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StateMachineContext stateMachine() {
			return getRuleContext(StateMachineContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_equation);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				lhs();
				setState(371);
				match(ASSIGN);
				setState(372);
				expr(0);
				}
				break;
			case AUTOMATON:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				stateMachine();
				setState(375);
				return_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LhsContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(SynlongParser.LP, 0); }
		public TerminalNode RP() { return getToken(SynlongParser.RP, 0); }
		public List<LhsIdContext> lhsId() {
			return getRuleContexts(LhsIdContext.class);
		}
		public LhsIdContext lhsId(int i) {
			return getRuleContext(LhsIdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SynlongParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SynlongParser.COMMA, i);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitLhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lhs);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(LP);
				setState(380);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(381);
					match(LP);
					}
				}

				setState(384);
				lhsId();
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RP) {
					{
					setState(385);
					match(RP);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(LP);
				setState(389);
				lhsId();
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(390);
					match(COMMA);
					setState(391);
					lhsId();
					}
					}
					setState(394); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(396);
				match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LhsIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public LhsIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhsId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterLhsId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitLhsId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitLhsId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsIdContext lhsId() throws RecognitionException {
		LhsIdContext _localctx = new LhsIdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lhsId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(SynlongParser.RETURNS, 0); }
		public ReturnsVarContext returnsVar() {
			return getRuleContext(ReturnsVarContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(RETURNS);
			setState(403);
			returnsVar();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnsVarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SynlongParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SynlongParser.ID, i);
		}
		public TerminalNode ELLIPSE() { return getToken(SynlongParser.ELLIPSE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(SynlongParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SynlongParser.SEMI, i);
		}
		public ReturnsVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnsVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterReturnsVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitReturnsVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitReturnsVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnsVarContext returnsVar() throws RecognitionException {
		ReturnsVarContext _localctx = new ReturnsVarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnsVar);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(405);
					match(ID);
					setState(406);
					match(SEMI);
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(412);
			_la = _input.LA(1);
			if ( !(_la==ELLIPSE || _la==ID) ) {
			_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateMachineContext extends ParserRuleContext {
		public TerminalNode AUTOMATON() { return getToken(SynlongParser.AUTOMATON, 0); }
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public List<StateDeclContext> stateDecl() {
			return getRuleContexts(StateDeclContext.class);
		}
		public StateDeclContext stateDecl(int i) {
			return getRuleContext(StateDeclContext.class,i);
		}
		public StateMachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMachine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterStateMachine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitStateMachine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitStateMachine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateMachineContext stateMachine() throws RecognitionException {
		StateMachineContext _localctx = new StateMachineContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_stateMachine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(AUTOMATON);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(415);
				match(ID);
				}
			}

			setState(419); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(418);
				stateDecl();
				}
				}
				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2017612633061982208L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateDeclContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(SynlongParser.STATE, 0); }
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public DataDefContext dataDef() {
			return getRuleContext(DataDefContext.class,0);
		}
		public TerminalNode INITIAL() { return getToken(SynlongParser.INITIAL, 0); }
		public TerminalNode FINAL() { return getToken(SynlongParser.FINAL, 0); }
		public TerminalNode UNLESS() { return getToken(SynlongParser.UNLESS, 0); }
		public TerminalNode UNTIL() { return getToken(SynlongParser.UNTIL, 0); }
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SynlongParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SynlongParser.SEMI, i);
		}
		public StateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterStateDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitStateDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitStateDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateDeclContext stateDecl() throws RecognitionException {
		StateDeclContext _localctx = new StateDeclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stateDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL) {
				{
				setState(423);
				match(INITIAL);
				}
			}

			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(426);
				match(FINAL);
				}
			}

			setState(429);
			match(STATE);
			setState(430);
			match(ID);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNLESS) {
				{
				setState(431);
				match(UNLESS);
				setState(435); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(432);
					transition();
					setState(433);
					match(SEMI);
					}
					}
					setState(437); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IF );
				}
			}

			setState(441);
			dataDef();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNTIL) {
				{
				setState(442);
				match(UNTIL);
				setState(446); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(443);
					transition();
					setState(444);
					match(SEMI);
					}
					}
					setState(448); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IF );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataDefContext extends ParserRuleContext {
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SynlongParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SynlongParser.SEMI, i);
		}
		public LocalBlockContext localBlock() {
			return getRuleContext(LocalBlockContext.class,0);
		}
		public TerminalNode LET() { return getToken(SynlongParser.LET, 0); }
		public TerminalNode TEL() { return getToken(SynlongParser.TEL, 0); }
		public DataDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterDataDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitDataDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitDataDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDefContext dataDef() throws RecognitionException {
		DataDefContext _localctx = new DataDefContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dataDef);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				equation();
				setState(453);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(455);
					localBlock();
					}
				}

				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(458);
					match(LET);
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LP || _la==AUTOMATON || _la==ID) {
						{
						{
						setState(459);
						equation();
						setState(460);
						match(SEMI);
						}
						}
						setState(466);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(467);
					match(TEL);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RESUME() { return getToken(SynlongParser.RESUME, 0); }
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TerminalNode RESTART() { return getToken(SynlongParser.RESTART, 0); }
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_transition);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(IF);
				setState(473);
				expr(0);
				setState(474);
				match(RESUME);
				setState(475);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				match(IF);
				setState(478);
				expr(0);
				setState(479);
				match(RESTART);
				setState(480);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClockedBlockContext extends ParserRuleContext {
		public TerminalNode ACTIVATE() { return getToken(SynlongParser.ACTIVATE, 0); }
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public MatchBlockContext matchBlock() {
			return getRuleContext(MatchBlockContext.class,0);
		}
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public ClockedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clockedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterClockedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitClockedBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitClockedBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClockedBlockContext clockedBlock() throws RecognitionException {
		ClockedBlockContext _localctx = new ClockedBlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_clockedBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(ACTIVATE);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(485);
				match(ID);
				}
			}

			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(488);
				ifBlock();
				}
				break;
			case WHEN:
				{
				setState(489);
				matchBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SynlongParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(SynlongParser.ELSE, 0); }
		public List<DataDefContext> dataDef() {
			return getRuleContexts(DataDefContext.class);
		}
		public DataDefContext dataDef(int i) {
			return getRuleContext(DataDefContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(IF);
			setState(493);
			expr(0);
			setState(494);
			match(THEN);
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
			case AUTOMATON:
			case ELSE:
			case VAR:
			case LET:
			case ID:
				{
				setState(495);
				dataDef();
				}
				break;
			case IF:
				{
				setState(496);
				ifBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(499);
			match(ELSE);
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case LP:
			case AUTOMATON:
			case ELSE:
			case VAR:
			case LET:
			case ID:
				{
				setState(500);
				dataDef();
				}
				break;
			case IF:
				{
				setState(501);
				ifBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatchBlockContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(SynlongParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(SynlongParser.MATCH, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(SynlongParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SynlongParser.COLON, i);
		}
		public List<DataDefContext> dataDef() {
			return getRuleContexts(DataDefContext.class);
		}
		public DataDefContext dataDef(int i) {
			return getRuleContext(DataDefContext.class,i);
		}
		public MatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterMatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitMatchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitMatchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchBlockContext matchBlock() throws RecognitionException {
		MatchBlockContext _localctx = new MatchBlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_matchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(WHEN);
			setState(505);
			expr(0);
			setState(506);
			match(MATCH);
			setState(511); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(507);
				pattern();
				setState(508);
				match(COLON);
				setState(509);
				dataDef();
				}
				}
				setState(513); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MINUS || _la==DPATTEN || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 263L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode LAST() { return getToken(SynlongParser.LAST, 0); }
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TempoExprContext tempoExpr() {
			return getRuleContext(TempoExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ArrayExprContext arrayExpr() {
			return getRuleContext(ArrayExprContext.class,0);
		}
		public StructExprContext structExpr() {
			return getRuleContext(StructExprContext.class,0);
		}
		public MixedConstructorContext mixedConstructor() {
			return getRuleContext(MixedConstructorContext.class,0);
		}
		public SwitchExprContext switchExpr() {
			return getRuleContext(SwitchExprContext.class,0);
		}
		public ApplyExprContext applyExpr() {
			return getRuleContext(ApplyExprContext.class,0);
		}
		public TerminalNode LP() { return getToken(SynlongParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(SynlongParser.RP, 0); }
		public UnaryArithOpContext unaryArithOp() {
			return getRuleContext(UnaryArithOpContext.class,0);
		}
		public BinBoolOpContext binBoolOp() {
			return getRuleContext(BinBoolOpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(516);
				simpleExpr(0);
				}
				break;
			case 2:
				{
				setState(517);
				match(LAST);
				setState(518);
				match(ID);
				}
				break;
			case 3:
				{
				setState(519);
				tempoExpr();
				}
				break;
			case 4:
				{
				setState(520);
				boolExpr();
				}
				break;
			case 5:
				{
				setState(521);
				arrayExpr();
				}
				break;
			case 6:
				{
				setState(522);
				structExpr();
				}
				break;
			case 7:
				{
				setState(523);
				mixedConstructor();
				}
				break;
			case 8:
				{
				setState(524);
				switchExpr();
				}
				break;
			case 9:
				{
				setState(525);
				applyExpr();
				}
				break;
			case 10:
				{
				setState(526);
				match(LP);
				setState(527);
				expr(0);
				setState(528);
				match(RP);
				}
				break;
			case 11:
				{
				setState(530);
				unaryArithOp();
				setState(531);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(535);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(536);
					binBoolOp();
					setState(537);
					expr(3);
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SynlongParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SynlongParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4415226773504L) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 511L) != 0)) {
				{
				setState(544);
				simpleExpr(0);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(545);
					match(COMMA);
					setState(546);
					simpleExpr(0);
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TempoExprContext extends ParserRuleContext {
		public TerminalNode PRE() { return getToken(SynlongParser.PRE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(SynlongParser.ARROW, 0); }
		public TerminalNode FBY() { return getToken(SynlongParser.FBY, 0); }
		public List<TerminalNode> LP() { return getTokens(SynlongParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(SynlongParser.LP, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SynlongParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SynlongParser.SEMI, i);
		}
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public List<TerminalNode> RP() { return getTokens(SynlongParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(SynlongParser.RP, i);
		}
		public TerminalNode WHEN() { return getToken(SynlongParser.WHEN, 0); }
		public TerminalNode MERGE() { return getToken(SynlongParser.MERGE, 0); }
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TempoExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempoExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterTempoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitTempoExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitTempoExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempoExprContext tempoExpr() throws RecognitionException {
		TempoExprContext _localctx = new TempoExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tempoExpr);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				match(PRE);
				setState(555);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				simpleExpr(0);
				setState(557);
				match(ARROW);
				setState(558);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				match(FBY);
				setState(561);
				match(LP);
				setState(562);
				simpleExpr(0);
				setState(563);
				match(SEMI);
				setState(564);
				constExpr(0);
				setState(565);
				match(SEMI);
				setState(566);
				simpleExpr(0);
				setState(567);
				match(RP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(569);
				simpleExpr(0);
				setState(570);
				match(FBY);
				setState(571);
				simpleExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(573);
				simpleExpr(0);
				setState(574);
				match(WHEN);
				setState(575);
				simpleExpr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(577);
				match(MERGE);
				setState(578);
				match(ID);
				setState(579);
				match(LP);
				setState(580);
				simpleExpr(0);
				setState(581);
				match(RP);
				setState(582);
				match(LP);
				setState(583);
				simpleExpr(0);
				setState(584);
				match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprContext extends ParserRuleContext {
		public TerminalNode DIESE() { return getToken(SynlongParser.DIESE, 0); }
		public TerminalNode LP() { return getToken(SynlongParser.LP, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode RP() { return getToken(SynlongParser.RP, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_boolExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(DIESE);
			setState(589);
			match(LP);
			setState(590);
			list();
			setState(591);
			match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends ParserRuleContext {
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode LB() { return getToken(SynlongParser.LB, 0); }
		public List<TerminalNode> IntegerLiteral() { return getTokens(SynlongParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(SynlongParser.IntegerLiteral, i);
		}
		public TerminalNode ELLIPSE() { return getToken(SynlongParser.ELLIPSE, 0); }
		public TerminalNode RB() { return getToken(SynlongParser.RB, 0); }
		public TerminalNode LP() { return getToken(SynlongParser.LP, 0); }
		public TerminalNode DOT() { return getToken(SynlongParser.DOT, 0); }
		public TerminalNode DEFAULT() { return getToken(SynlongParser.DEFAULT, 0); }
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public TerminalNode CARET() { return getToken(SynlongParser.CARET, 0); }
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ArrayExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExprContext arrayExpr() throws RecognitionException {
		ArrayExprContext _localctx = new ArrayExprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayExpr);
		int _la;
		try {
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				simpleExpr(0);
				setState(594);
				match(LB);
				setState(595);
				match(IntegerLiteral);
				setState(596);
				match(ELLIPSE);
				setState(597);
				match(IntegerLiteral);
				setState(598);
				match(RB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(LP);
				setState(601);
				simpleExpr(0);
				setState(602);
				match(DOT);
				setState(604); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(603);
					index();
					}
					}
					setState(606); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LB );
				setState(608);
				match(DEFAULT);
				setState(609);
				simpleExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				simpleExpr(0);
				setState(612);
				match(CARET);
				setState(613);
				constExpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(615);
				match(LB);
				setState(616);
				list();
				setState(617);
				match(RB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructExprContext extends ParserRuleContext {
		public TerminalNode LBB() { return getToken(SynlongParser.LBB, 0); }
		public List<LabelExprContext> labelExpr() {
			return getRuleContexts(LabelExprContext.class);
		}
		public LabelExprContext labelExpr(int i) {
			return getRuleContext(LabelExprContext.class,i);
		}
		public TerminalNode RBB() { return getToken(SynlongParser.RBB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SynlongParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SynlongParser.COMMA, i);
		}
		public StructExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterStructExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitStructExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitStructExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprContext structExpr() throws RecognitionException {
		StructExprContext _localctx = new StructExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_structExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(LBB);
			setState(622);
			labelExpr();
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(623);
				match(COMMA);
				setState(624);
				labelExpr();
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(630);
			match(RBB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MixedConstructorContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(SynlongParser.LP, 0); }
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TerminalNode WITH() { return getToken(SynlongParser.WITH, 0); }
		public TerminalNode ASSIGN() { return getToken(SynlongParser.ASSIGN, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<LabelOrIndexContext> labelOrIndex() {
			return getRuleContexts(LabelOrIndexContext.class);
		}
		public LabelOrIndexContext labelOrIndex(int i) {
			return getRuleContext(LabelOrIndexContext.class,i);
		}
		public MixedConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixedConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterMixedConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitMixedConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitMixedConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixedConstructorContext mixedConstructor() throws RecognitionException {
		MixedConstructorContext _localctx = new MixedConstructorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mixedConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(LP);
			setState(633);
			match(ID);
			setState(634);
			match(WITH);
			setState(636); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(635);
				labelOrIndex();
				}
				}
				setState(638); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LB || _la==ID );
			setState(640);
			match(ASSIGN);
			setState(641);
			simpleExpr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TerminalNode COLON() { return getToken(SynlongParser.COLON, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public LabelExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterLabelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitLabelExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitLabelExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelExprContext labelExpr() throws RecognitionException {
		LabelExprContext _localctx = new LabelExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_labelExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(ID);
			setState(644);
			match(COLON);
			setState(645);
			simpleExpr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IndexContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(SynlongParser.LB, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode RB() { return getToken(SynlongParser.RB, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(LB);
			setState(648);
			simpleExpr(0);
			setState(649);
			match(RB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelOrIndexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public LabelOrIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelOrIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterLabelOrIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitLabelOrIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitLabelOrIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelOrIndexContext labelOrIndex() throws RecognitionException {
		LabelOrIndexContext _localctx = new LabelOrIndexContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_labelOrIndex);
		try {
			setState(653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(ID);
				}
				break;
			case LB:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				index();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchExprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(SynlongParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(SynlongParser.ELSE, 0); }
		public TerminalNode LP() { return getToken(SynlongParser.LP, 0); }
		public TerminalNode CASE() { return getToken(SynlongParser.CASE, 0); }
		public TerminalNode OF() { return getToken(SynlongParser.OF, 0); }
		public TerminalNode RP() { return getToken(SynlongParser.RP, 0); }
		public List<CaseExprContext> caseExpr() {
			return getRuleContexts(CaseExprContext.class);
		}
		public CaseExprContext caseExpr(int i) {
			return getRuleContext(CaseExprContext.class,i);
		}
		public SwitchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterSwitchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitSwitchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitSwitchExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchExprContext switchExpr() throws RecognitionException {
		SwitchExprContext _localctx = new SwitchExprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_switchExpr);
		int _la;
		try {
			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				match(IF);
				setState(656);
				simpleExpr(0);
				setState(657);
				match(THEN);
				setState(658);
				simpleExpr(0);
				setState(659);
				match(ELSE);
				setState(660);
				simpleExpr(0);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				match(LP);
				setState(663);
				match(CASE);
				setState(664);
				simpleExpr(0);
				setState(665);
				match(OF);
				setState(667); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(666);
					caseExpr();
					}
					}
					setState(669); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS || _la==DPATTEN || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 263L) != 0) );
				setState(671);
				match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseExprContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SynlongParser.COLON, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitCaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_caseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			pattern();
			setState(676);
			match(COLON);
			setState(677);
			simpleExpr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TerminalNode CharacterLiteral() { return getToken(SynlongParser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(SynlongParser.IntegerLiteral, 0); }
		public TerminalNode MINUS() { return getToken(SynlongParser.MINUS, 0); }
		public TerminalNode BoolLiteral() { return getToken(SynlongParser.BoolLiteral, 0); }
		public TerminalNode DPATTEN() { return getToken(SynlongParser.DPATTEN, 0); }
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pattern);
		int _la;
		try {
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				match(ID);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				match(CharacterLiteral);
				}
				break;
			case MINUS:
			case IntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(681);
					match(MINUS);
					}
				}

				setState(684);
				match(IntegerLiteral);
				}
				break;
			case BoolLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(685);
				match(BoolLiteral);
				}
				break;
			case DPATTEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(686);
				match(DPATTEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ApplyExprContext extends ParserRuleContext {
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public List<TerminalNode> LP() { return getTokens(SynlongParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(SynlongParser.LP, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(SynlongParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(SynlongParser.RP, i);
		}
		public IteratorContext iterator() {
			return getRuleContext(IteratorContext.class,0);
		}
		public TerminalNode LSHIFT() { return getToken(SynlongParser.LSHIFT, 0); }
		public TerminalNode SEMI() { return getToken(SynlongParser.SEMI, 0); }
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public TerminalNode RSHIFT() { return getToken(SynlongParser.RSHIFT, 0); }
		public TerminalNode MAPW() { return getToken(SynlongParser.MAPW, 0); }
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SynlongParser.DEFAULT, 0); }
		public TerminalNode MAPWI() { return getToken(SynlongParser.MAPWI, 0); }
		public TerminalNode FOLDW() { return getToken(SynlongParser.FOLDW, 0); }
		public TerminalNode FOLDWI() { return getToken(SynlongParser.FOLDWI, 0); }
		public ApplyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterApplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitApplyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitApplyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplyExprContext applyExpr() throws RecognitionException {
		ApplyExprContext _localctx = new ApplyExprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_applyExpr);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				prefixOp();
				setState(690);
				match(LP);
				setState(691);
				list();
				setState(692);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				match(LP);
				setState(695);
				iterator();
				setState(696);
				match(LSHIFT);
				setState(697);
				prefixOp();
				setState(698);
				match(SEMI);
				setState(699);
				constExpr(0);
				setState(700);
				match(RSHIFT);
				setState(701);
				match(RP);
				setState(702);
				match(LP);
				setState(703);
				list();
				setState(704);
				match(RP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				match(LP);
				setState(707);
				match(MAPW);
				setState(708);
				match(LSHIFT);
				setState(709);
				prefixOp();
				setState(710);
				match(SEMI);
				setState(711);
				constExpr(0);
				setState(712);
				match(RSHIFT);
				setState(713);
				match(IF);
				setState(714);
				simpleExpr(0);
				setState(715);
				match(DEFAULT);
				setState(716);
				match(LP);
				setState(717);
				list();
				setState(718);
				match(RP);
				setState(719);
				match(RP);
				setState(720);
				match(LP);
				setState(721);
				list();
				setState(722);
				match(RP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(724);
				match(LP);
				setState(725);
				match(MAPWI);
				setState(726);
				match(LSHIFT);
				setState(727);
				prefixOp();
				setState(728);
				match(SEMI);
				setState(729);
				constExpr(0);
				setState(730);
				match(RSHIFT);
				setState(731);
				match(IF);
				setState(732);
				simpleExpr(0);
				setState(733);
				match(DEFAULT);
				setState(734);
				match(LP);
				setState(735);
				list();
				setState(736);
				match(RP);
				setState(737);
				match(RP);
				setState(738);
				match(LP);
				setState(739);
				list();
				setState(740);
				match(RP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(742);
				match(LP);
				setState(743);
				match(FOLDW);
				setState(744);
				match(LSHIFT);
				setState(745);
				prefixOp();
				setState(746);
				match(SEMI);
				setState(747);
				constExpr(0);
				setState(748);
				match(RSHIFT);
				setState(749);
				match(IF);
				setState(750);
				simpleExpr(0);
				setState(751);
				match(RP);
				setState(752);
				match(LP);
				setState(753);
				list();
				setState(754);
				match(RP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(756);
				match(LP);
				setState(757);
				match(FOLDWI);
				setState(758);
				match(LSHIFT);
				setState(759);
				prefixOp();
				setState(760);
				match(SEMI);
				setState(761);
				constExpr(0);
				setState(762);
				match(RSHIFT);
				setState(763);
				match(IF);
				setState(764);
				simpleExpr(0);
				setState(765);
				match(RP);
				setState(766);
				match(LP);
				setState(767);
				list();
				setState(768);
				match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public PrefixUnaryOpContext prefixUnaryOp() {
			return getRuleContext(PrefixUnaryOpContext.class,0);
		}
		public PrefixBinaryOpContext prefixBinaryOp() {
			return getRuleContext(PrefixBinaryOpContext.class,0);
		}
		public TerminalNode LP() { return getToken(SynlongParser.LP, 0); }
		public TerminalNode MAKE() { return getToken(SynlongParser.MAKE, 0); }
		public TerminalNode RP() { return getToken(SynlongParser.RP, 0); }
		public TerminalNode FLATTEN() { return getToken(SynlongParser.FLATTEN, 0); }
		public PrefixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterPrefixOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitPrefixOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitPrefixOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixOpContext prefixOp() throws RecognitionException {
		PrefixOpContext _localctx = new PrefixOpContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_prefixOp);
		try {
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				prefixUnaryOp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				prefixBinaryOp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(775);
				match(LP);
				setState(776);
				match(MAKE);
				setState(777);
				match(ID);
				setState(778);
				match(RP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(779);
				match(LP);
				setState(780);
				match(FLATTEN);
				setState(781);
				match(ID);
				setState(782);
				match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixUnaryOpContext extends ParserRuleContext {
		public TerminalNode UPLUS() { return getToken(SynlongParser.UPLUS, 0); }
		public TerminalNode UMINUS() { return getToken(SynlongParser.UMINUS, 0); }
		public TerminalNode UNOT() { return getToken(SynlongParser.UNOT, 0); }
		public TerminalNode UNARYSHORT() { return getToken(SynlongParser.UNARYSHORT, 0); }
		public TerminalNode UNARYINT() { return getToken(SynlongParser.UNARYINT, 0); }
		public TerminalNode UNARYFLOAT() { return getToken(SynlongParser.UNARYFLOAT, 0); }
		public TerminalNode UNARYREAL() { return getToken(SynlongParser.UNARYREAL, 0); }
		public PrefixUnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterPrefixUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitPrefixUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitPrefixUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnaryOpContext prefixUnaryOp() throws RecognitionException {
		PrefixUnaryOpContext _localctx = new PrefixUnaryOpContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_prefixUnaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 127L) != 0)) ) {
			_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixBinaryOpContext extends ParserRuleContext {
		public TerminalNode BPLUS() { return getToken(SynlongParser.BPLUS, 0); }
		public TerminalNode BMINUS() { return getToken(SynlongParser.BMINUS, 0); }
		public TerminalNode BMULTI() { return getToken(SynlongParser.BMULTI, 0); }
		public TerminalNode BDIVIDE() { return getToken(SynlongParser.BDIVIDE, 0); }
		public TerminalNode BMOD() { return getToken(SynlongParser.BMOD, 0); }
		public TerminalNode BDIV() { return getToken(SynlongParser.BDIV, 0); }
		public TerminalNode BEQ() { return getToken(SynlongParser.BEQ, 0); }
		public TerminalNode BNEQ() { return getToken(SynlongParser.BNEQ, 0); }
		public TerminalNode BLT() { return getToken(SynlongParser.BLT, 0); }
		public TerminalNode BGT() { return getToken(SynlongParser.BGT, 0); }
		public TerminalNode BLE() { return getToken(SynlongParser.BLE, 0); }
		public TerminalNode BGE() { return getToken(SynlongParser.BGE, 0); }
		public TerminalNode BAND() { return getToken(SynlongParser.BAND, 0); }
		public TerminalNode BOR() { return getToken(SynlongParser.BOR, 0); }
		public TerminalNode BXOR() { return getToken(SynlongParser.BXOR, 0); }
		public PrefixBinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixBinaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterPrefixBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitPrefixBinaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitPrefixBinaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixBinaryOpContext prefixBinaryOp() throws RecognitionException {
		PrefixBinaryOpContext _localctx = new PrefixBinaryOpContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_prefixBinaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 32767L) != 0)) ) {
			_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IteratorContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(SynlongParser.MAP, 0); }
		public TerminalNode FOLD() { return getToken(SynlongParser.FOLD, 0); }
		public TerminalNode MAPI() { return getToken(SynlongParser.MAPI, 0); }
		public TerminalNode FOLDI() { return getToken(SynlongParser.FOLDI, 0); }
		public TerminalNode MAPFOLD() { return getToken(SynlongParser.MAPFOLD, 0); }
		public IteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterIterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitIterator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitIterator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratorContext iterator() throws RecognitionException {
		IteratorContext _localctx = new IteratorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_iterator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 271L) != 0)) ) {
			_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode LP() { return getToken(SynlongParser.LP, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(SynlongParser.RP, 0); }
		public UnaryArithOpContext unaryArithOp() {
			return getRuleContext(UnaryArithOpContext.class,0);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public BinArithOpContext binArithOp() {
			return getRuleContext(BinArithOpContext.class,0);
		}
		public BinBoolOpContext binBoolOp() {
			return getRuleContext(BinBoolOpContext.class,0);
		}
		public BinRelationOpContext binRelationOp() {
			return getRuleContext(BinRelationOpContext.class,0);
		}
		public TerminalNode LB() { return getToken(SynlongParser.LB, 0); }
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public TerminalNode RB() { return getToken(SynlongParser.RB, 0); }
		public TerminalNode DOT() { return getToken(SynlongParser.DOT, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(792);
				match(ID);
				}
				break;
			case 2:
				{
				setState(793);
				atom();
				}
				break;
			case 3:
				{
				setState(794);
				match(ID);
				setState(795);
				args();
				}
				break;
			case 4:
				{
				setState(796);
				match(LP);
				setState(797);
				simpleExpr(0);
				setState(798);
				match(RP);
				}
				break;
			case 5:
				{
				setState(800);
				unaryArithOp();
				setState(801);
				simpleExpr(5);
				}
				break;
			case 6:
				{
				setState(803);
				match(LP);
				setState(804);
				typeExpr(0);
				setState(805);
				simpleExpr(0);
				setState(806);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(832);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(830);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(810);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(811);
						binArithOp();
						setState(812);
						simpleExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(814);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(815);
						binBoolOp();
						setState(816);
						simpleExpr(4);
						}
						break;
					case 3:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(818);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(819);
						binRelationOp();
						setState(820);
						simpleExpr(3);
						}
						break;
					case 4:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(822);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(823);
						match(LB);
						setState(824);
						constExpr(0);
						setState(825);
						match(RB);
						}
						break;
					case 5:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(827);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(828);
						match(DOT);
						setState(829);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryArithOpContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SynlongParser.MINUS, 0); }
		public TerminalNode ADD() { return getToken(SynlongParser.ADD, 0); }
		public TerminalNode NOT() { return getToken(SynlongParser.NOT, 0); }
		public UnaryArithOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryArithOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterUnaryArithOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitUnaryArithOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitUnaryArithOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryArithOpContext unaryArithOp() throws RecognitionException {
		UnaryArithOpContext _localctx = new UnaryArithOpContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unaryArithOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180262400L) != 0)) ) {
			_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinArithOpContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SynlongParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(SynlongParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(SynlongParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(SynlongParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(SynlongParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(SynlongParser.DIV, 0); }
		public BinArithOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binArithOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterBinArithOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitBinArithOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitBinArithOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinArithOpContext binArithOp() throws RecognitionException {
		BinArithOpContext _localctx = new BinArithOpContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_binArithOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 103081181184L) != 0)) ) {
			_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinRelationOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SynlongParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SynlongParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(SynlongParser.GT, 0); }
		public TerminalNode LT() { return getToken(SynlongParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SynlongParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(SynlongParser.GTE, 0); }
		public BinRelationOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binRelationOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterBinRelationOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitBinRelationOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitBinRelationOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinRelationOpContext binRelationOp() throws RecognitionException {
		BinRelationOpContext _localctx = new BinRelationOpContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_binRelationOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) ) {
			_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinBoolOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SynlongParser.AND, 0); }
		public TerminalNode OR() { return getToken(SynlongParser.OR, 0); }
		public TerminalNode XOR() { return getToken(SynlongParser.XOR, 0); }
		public BinBoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binBoolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterBinBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitBinBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitBinBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinBoolOpContext binBoolOp() throws RecognitionException {
		BinBoolOpContext _localctx = new BinBoolOpContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_binBoolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
			_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode BoolLiteral() { return getToken(SynlongParser.BoolLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(SynlongParser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(SynlongParser.IntegerLiteral, 0); }
		public TerminalNode UnsignedIntegerLiteral() { return getToken(SynlongParser.UnsignedIntegerLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(SynlongParser.FloatLiteral, 0); }
		public TerminalNode RealLiteral() { return getToken(SynlongParser.RealLiteral, 0); }
		public TerminalNode UnsignedShortLiteral() { return getToken(SynlongParser.UnsignedShortLiteral, 0); }
		public TerminalNode ShortLiteral() { return getToken(SynlongParser.ShortLiteral, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongParserListener ) ((SynlongParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongParserVisitor ) return ((SynlongParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return typeExpr_sempred((TypeExprContext)_localctx, predIndex);
		case 10:
			return constExpr_sempred((ConstExprContext)_localctx, predIndex);
		case 36:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 54:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeExpr_sempred(TypeExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean constExpr_sempred(ConstExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0080\u034e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0001\u0000\u0005\u0000z\b\u0000\n\u0000\f\u0000}\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0084\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u008a\b\u0002"+
		"\n\u0002\f\u0002\u008d\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0092\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u009a\b\u0004\n\u0004\f\u0004\u009d\t\u0004"+
		"\u0001\u0004\u0003\u0004\u00a0\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00b3\b\u0005\n\u0005\f\u0005\u00b6"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ba\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00bf\b\u0005\n\u0005\f\u0005\u00c2"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ce\b\b\n\b\f\b\u00d1"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d8\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00e8\b\n\n\n\f\n\u00eb\t\n"+
		"\u0001\n\u0001\n\u0003\n\u00ef\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00fd"+
		"\b\n\n\n\f\n\u0100\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0105\b\u000b\n\u000b\f\u000b\u0108\t\u000b\u0003\u000b\u010a\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u0113"+
		"\b\r\n\r\f\r\u0116\t\r\u0001\r\u0001\r\u0001\r\u0003\r\u011b\b\r\u0001"+
		"\r\u0003\r\u011e\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0128\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u013d\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0145\b\u0014\n\u0014\f\u0014"+
		"\u0148\t\u0014\u0003\u0014\u014a\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0155\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0159"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u015f"+
		"\b\u0016\n\u0016\f\u0016\u0162\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0166\b\u0016\u0003\u0016\u0168\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u016e\b\u0017\n\u0017\f\u0017\u0171\t\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u017a\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u017f\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0183\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u0189"+
		"\b\u0019\u000b\u0019\f\u0019\u018a\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u018f\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u0198\b\u001c\n\u001c\f\u001c\u019b"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u01a1"+
		"\b\u001d\u0001\u001d\u0004\u001d\u01a4\b\u001d\u000b\u001d\f\u001d\u01a5"+
		"\u0001\u001e\u0003\u001e\u01a9\b\u001e\u0001\u001e\u0003\u001e\u01ac\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0004\u001e\u01b4\b\u001e\u000b\u001e\f\u001e\u01b5\u0003\u001e"+
		"\u01b8\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0004\u001e\u01bf\b\u001e\u000b\u001e\f\u001e\u01c0\u0003\u001e\u01c3"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01c9"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01cf"+
		"\b\u001f\n\u001f\f\u001f\u01d2\t\u001f\u0001\u001f\u0003\u001f\u01d5\b"+
		"\u001f\u0003\u001f\u01d7\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u01e3\b \u0001!\u0001!\u0003!\u01e7"+
		"\b!\u0001!\u0001!\u0003!\u01eb\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01f2\b\"\u0001\"\u0001\"\u0001\"\u0003\"\u01f7\b\"\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0004#\u0200\b#\u000b#\f#\u0201"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0216"+
		"\b$\u0001$\u0001$\u0001$\u0001$\u0005$\u021c\b$\n$\f$\u021f\t$\u0001%"+
		"\u0001%\u0001%\u0005%\u0224\b%\n%\f%\u0227\t%\u0003%\u0229\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u024b\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0004"+
		"(\u025d\b(\u000b(\f(\u025e\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u026c\b(\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u0272\b)\n)\f)\u0275\t)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0004*\u027d\b*\u000b*\f*\u027e\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0003-\u028e\b-\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0004.\u029c\b.\u000b.\f.\u029d\u0001.\u0001.\u0003.\u02a2\b"+
		".\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00030\u02ab\b0\u0001"+
		"0\u00010\u00010\u00030\u02b0\b0\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00031\u0303\b1\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u0310"+
		"\b2\u00013\u00013\u00014\u00014\u00015\u00015\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u0329\b6\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00056\u033f\b6\n6\f6\u0342\t6\u0001"+
		"7\u00017\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0000\u0004\n\u0014Hl<\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtv\u0000\n\u0001\u000034\u0002\u0000\u001d\u001d}}\u0001\u0000"+
		"_e\u0001\u0000ft\u0002\u0000PSXX\u0002\u0000\u0011\u0012\"\"\u0002\u0000"+
		"\u0011\u0014#$\u0001\u0000\u0015\u001a\u0001\u0000%\'\u0001\u0000u|\u038b"+
		"\u0000{\u0001\u0000\u0000\u0000\u0002\u0083\u0001\u0000\u0000\u0000\u0004"+
		"\u0085\u0001\u0000\u0000\u0000\u0006\u008e\u0001\u0000\u0000\u0000\b\u009f"+
		"\u0001\u0000\u0000\u0000\n\u00b9\u0001\u0000\u0000\u0000\f\u00c3\u0001"+
		"\u0000\u0000\u0000\u000e\u00c7\u0001\u0000\u0000\u0000\u0010\u00c9\u0001"+
		"\u0000\u0000\u0000\u0012\u00d2\u0001\u0000\u0000\u0000\u0014\u00ee\u0001"+
		"\u0000\u0000\u0000\u0016\u0109\u0001\u0000\u0000\u0000\u0018\u010b\u0001"+
		"\u0000\u0000\u0000\u001a\u010f\u0001\u0000\u0000\u0000\u001c\u011f\u0001"+
		"\u0000\u0000\u0000\u001e\u0121\u0001\u0000\u0000\u0000 \u0127\u0001\u0000"+
		"\u0000\u0000\"\u0129\u0001\u0000\u0000\u0000$\u013c\u0001\u0000\u0000"+
		"\u0000&\u013e\u0001\u0000\u0000\u0000(\u0140\u0001\u0000\u0000\u0000*"+
		"\u0154\u0001\u0000\u0000\u0000,\u0167\u0001\u0000\u0000\u0000.\u0169\u0001"+
		"\u0000\u0000\u00000\u0179\u0001\u0000\u0000\u00002\u018e\u0001\u0000\u0000"+
		"\u00004\u0190\u0001\u0000\u0000\u00006\u0192\u0001\u0000\u0000\u00008"+
		"\u0199\u0001\u0000\u0000\u0000:\u019e\u0001\u0000\u0000\u0000<\u01a8\u0001"+
		"\u0000\u0000\u0000>\u01d6\u0001\u0000\u0000\u0000@\u01e2\u0001\u0000\u0000"+
		"\u0000B\u01e4\u0001\u0000\u0000\u0000D\u01ec\u0001\u0000\u0000\u0000F"+
		"\u01f8\u0001\u0000\u0000\u0000H\u0215\u0001\u0000\u0000\u0000J\u0228\u0001"+
		"\u0000\u0000\u0000L\u024a\u0001\u0000\u0000\u0000N\u024c\u0001\u0000\u0000"+
		"\u0000P\u026b\u0001\u0000\u0000\u0000R\u026d\u0001\u0000\u0000\u0000T"+
		"\u0278\u0001\u0000\u0000\u0000V\u0283\u0001\u0000\u0000\u0000X\u0287\u0001"+
		"\u0000\u0000\u0000Z\u028d\u0001\u0000\u0000\u0000\\\u02a1\u0001\u0000"+
		"\u0000\u0000^\u02a3\u0001\u0000\u0000\u0000`\u02af\u0001\u0000\u0000\u0000"+
		"b\u0302\u0001\u0000\u0000\u0000d\u030f\u0001\u0000\u0000\u0000f\u0311"+
		"\u0001\u0000\u0000\u0000h\u0313\u0001\u0000\u0000\u0000j\u0315\u0001\u0000"+
		"\u0000\u0000l\u0328\u0001\u0000\u0000\u0000n\u0343\u0001\u0000\u0000\u0000"+
		"p\u0345\u0001\u0000\u0000\u0000r\u0347\u0001\u0000\u0000\u0000t\u0349"+
		"\u0001\u0000\u0000\u0000v\u034b\u0001\u0000\u0000\u0000xz\u0003\u0002"+
		"\u0001\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000~\u007f\u0005\u0000\u0000\u0001\u007f\u0001"+
		"\u0001\u0000\u0000\u0000\u0080\u0084\u0003\u0004\u0002\u0000\u0081\u0084"+
		"\u0003\u0010\b\u0000\u0082\u0084\u0003$\u0012\u0000\u0083\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0003\u0001\u0000\u0000\u0000\u0085\u008b\u0005"+
		"1\u0000\u0000\u0086\u0087\u0003\u0006\u0003\u0000\u0087\u0088\u0005\u0010"+
		"\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000"+
		"\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0005\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0005}\u0000"+
		"\u0000\u008f\u0090\u0005^\u0000\u0000\u0090\u0092\u0003\b\u0004\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0007\u0001\u0000\u0000\u0000\u0093\u00a0\u0003\n\u0005\u0000\u0094"+
		"\u0095\u00056\u0000\u0000\u0095\u0096\u0005.\u0000\u0000\u0096\u009b\u0005"+
		"}\u0000\u0000\u0097\u0098\u0005\u000e\u0000\u0000\u0098\u009a\u0005}\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009e\u00a0\u0005/\u0000\u0000\u009f\u0093\u0001\u0000\u0000\u0000"+
		"\u009f\u0094\u0001\u0000\u0000\u0000\u00a0\t\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0006\u0005\uffff\uffff\u0000\u00a2\u00ba\u0005\u0001\u0000\u0000"+
		"\u00a3\u00ba\u0005\u0002\u0000\u0000\u00a4\u00ba\u0005\u0003\u0000\u0000"+
		"\u00a5\u00ba\u0005\u0005\u0000\u0000\u00a6\u00ba\u0005\u0007\u0000\u0000"+
		"\u00a7\u00ba\u0005\b\u0000\u0000\u00a8\u00ba\u0005\t\u0000\u0000\u00a9"+
		"\u00ba\u0005\n\u0000\u0000\u00aa\u00ba\u0005\u000b\u0000\u0000\u00ab\u00ba"+
		"\u0005\f\u0000\u0000\u00ac\u00ba\u0005\u0006\u0000\u0000\u00ad\u00ba\u0003"+
		"\u000e\u0007\u0000\u00ae\u00af\u0005.\u0000\u0000\u00af\u00b4\u0003\f"+
		"\u0006\u0000\u00b0\u00b1\u0005\u000e\u0000\u0000\u00b1\u00b3\u0003\f\u0006"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005/\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000"+
		"\u00b9\u00a1\u0001\u0000\u0000\u0000\u00b9\u00a3\u0001\u0000\u0000\u0000"+
		"\u00b9\u00a4\u0001\u0000\u0000\u0000\u00b9\u00a5\u0001\u0000\u0000\u0000"+
		"\u00b9\u00a6\u0001\u0000\u0000\u0000\u00b9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00a8\u0001\u0000\u0000\u0000\u00b9\u00a9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00aa\u0001\u0000\u0000\u0000\u00b9\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ac\u0001\u0000\u0000\u0000\u00b9\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ae\u0001\u0000\u0000\u0000\u00ba\u00c0\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\n\u0001\u0000\u0000\u00bc\u00bd\u0005\r\u0000\u0000\u00bd"+
		"\u00bf\u0003\u0014\n\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u000b\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005}\u0000\u0000\u00c4\u00c5\u0005"+
		"\u000f\u0000\u0000\u00c5\u00c6\u0003\n\u0005\u0000\u00c6\r\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0005}\u0000\u0000\u00c8\u000f\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cf\u00052\u0000\u0000\u00ca\u00cb\u0003\u0012\t\u0000"+
		"\u00cb\u00cc\u0005\u0010\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ca\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d0\u0011\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005}\u0000\u0000\u00d3\u00d4\u0005\u000f\u0000\u0000\u00d4"+
		"\u00d7\u0003\n\u0005\u0000\u00d5\u00d6\u0005^\u0000\u0000\u00d6\u00d8"+
		"\u0003\u0014\n\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u0013\u0001\u0000\u0000\u0000\u00d9\u00da\u0006"+
		"\n\uffff\uffff\u0000\u00da\u00ef\u0005}\u0000\u0000\u00db\u00ef\u0003"+
		"v;\u0000\u00dc\u00dd\u0003n7\u0000\u00dd\u00de\u0003\u0014\n\u0006\u00de"+
		"\u00ef\u0001\u0000\u0000\u0000\u00df\u00e0\u0005,\u0000\u0000\u00e0\u00e1"+
		"\u0003\u0016\u000b\u0000\u00e1\u00e2\u0005-\u0000\u0000\u00e2\u00ef\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0005.\u0000\u0000\u00e4\u00e9\u0003\u0018"+
		"\f\u0000\u00e5\u00e6\u0005\u000e\u0000\u0000\u00e6\u00e8\u0003\u0018\f"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0005/\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ee\u00d9\u0001\u0000\u0000\u0000\u00ee\u00db\u0001\u0000\u0000\u0000"+
		"\u00ee\u00dc\u0001\u0000\u0000\u0000\u00ee\u00df\u0001\u0000\u0000\u0000"+
		"\u00ee\u00e3\u0001\u0000\u0000\u0000\u00ef\u00fe\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\n\u0005\u0000\u0000\u00f1\u00f2\u0003p8\u0000\u00f2\u00f3"+
		"\u0003\u0014\n\u0006\u00f3\u00fd\u0001\u0000\u0000\u0000\u00f4\u00f5\n"+
		"\u0004\u0000\u0000\u00f5\u00f6\u0003t:\u0000\u00f6\u00f7\u0003\u0014\n"+
		"\u0005\u00f7\u00fd\u0001\u0000\u0000\u0000\u00f8\u00f9\n\u0003\u0000\u0000"+
		"\u00f9\u00fa\u0003r9\u0000\u00fa\u00fb\u0003\u0014\n\u0004\u00fb\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fc\u00f0\u0001\u0000\u0000\u0000\u00fc\u00f4"+
		"\u0001\u0000\u0000\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000\u00fd\u0100"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0001\u0000\u0000\u0000\u00ff\u0015\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0101\u0106\u0003\u0014\n\u0000\u0102\u0103\u0005"+
		"\u000e\u0000\u0000\u0103\u0105\u0003\u0014\n\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u0101\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u0017\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0005}\u0000\u0000\u010c\u010d\u0005\u000f\u0000"+
		"\u0000\u010d\u010e\u0003\u0014\n\u0000\u010e\u0019\u0001\u0000\u0000\u0000"+
		"\u010f\u0114\u0003\u001c\u000e\u0000\u0110\u0111\u0005\u000e\u0000\u0000"+
		"\u0111\u0113\u0003\u001c\u000e\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000"+
		"\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u000f\u0000\u0000"+
		"\u0118\u011a\u0003\n\u0005\u0000\u0119\u011b\u0003\u001e\u000f\u0000\u011a"+
		"\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u011d\u0001\u0000\u0000\u0000\u011c\u011e\u0003\"\u0011\u0000\u011d\u011c"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u001b"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0005}\u0000\u0000\u0120\u001d\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0005H\u0000\u0000\u0122\u0123\u0003 \u0010"+
		"\u0000\u0123\u001f\u0001\u0000\u0000\u0000\u0124\u0128\u0005}\u0000\u0000"+
		"\u0125\u0126\u0005\"\u0000\u0000\u0126\u0128\u0005}\u0000\u0000\u0127"+
		"\u0124\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128"+
		"!\u0001\u0000\u0000\u0000\u0129\u012a\u0005B\u0000\u0000\u012a\u012b\u0005"+
		"^\u0000\u0000\u012b\u012c\u0003\u0014\n\u0000\u012c#\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0003&\u0013\u0000\u012e\u012f\u0005}\u0000\u0000\u012f"+
		"\u0130\u0003(\u0014\u0000\u0130\u0131\u00057\u0000\u0000\u0131\u0132\u0003"+
		"(\u0014\u0000\u0132\u0133\u0005\u0010\u0000\u0000\u0133\u0134\u0003,\u0016"+
		"\u0000\u0134\u013d\u0001\u0000\u0000\u0000\u0135\u0136\u00053\u0000\u0000"+
		"\u0136\u0137\u00055\u0000\u0000\u0137\u0138\u0005}\u0000\u0000\u0138\u0139"+
		"\u0003(\u0014\u0000\u0139\u013a\u00057\u0000\u0000\u013a\u013b\u0003("+
		"\u0014\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u012d\u0001\u0000"+
		"\u0000\u0000\u013c\u0135\u0001\u0000\u0000\u0000\u013d%\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0007\u0000\u0000\u0000\u013f\'\u0001\u0000\u0000\u0000"+
		"\u0140\u0149\u0005*\u0000\u0000\u0141\u0146\u0003\u001a\r\u0000\u0142"+
		"\u0143\u0005\u0010\u0000\u0000\u0143\u0145\u0003\u001a\r\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u014a"+
		"\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u0141"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0005+\u0000\u0000\u014c)\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005*\u0000\u0000\u014e\u014f\u0005}\u0000\u0000"+
		"\u014f\u0155\u0005+\u0000\u0000\u0150\u0151\u0005*\u0000\u0000\u0151\u0152"+
		"\u0003l6\u0000\u0152\u0153\u0005+\u0000\u0000\u0153\u0155\u0001\u0000"+
		"\u0000\u0000\u0154\u014d\u0001\u0000\u0000\u0000\u0154\u0150\u0001\u0000"+
		"\u0000\u0000\u0155+\u0001\u0000\u0000\u0000\u0156\u0168\u0005\u0010\u0000"+
		"\u0000\u0157\u0159\u0003.\u0017\u0000\u0158\u0157\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000"+
		"\u015a\u0160\u0005\\\u0000\u0000\u015b\u015c\u00030\u0018\u0000\u015c"+
		"\u015d\u0005\u0010\u0000\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e"+
		"\u015b\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160"+
		"\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161"+
		"\u0163\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163"+
		"\u0165\u0005]\u0000\u0000\u0164\u0166\u0005\u0010\u0000\u0000\u0165\u0164"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168"+
		"\u0001\u0000\u0000\u0000\u0167\u0156\u0001\u0000\u0000\u0000\u0167\u0158"+
		"\u0001\u0000\u0000\u0000\u0168-\u0001\u0000\u0000\u0000\u0169\u016f\u0005"+
		"[\u0000\u0000\u016a\u016b\u0003\u001a\r\u0000\u016b\u016c\u0005\u0010"+
		"\u0000\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u016a\u0001\u0000"+
		"\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170/\u0001\u0000\u0000"+
		"\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0173\u00032\u0019\u0000"+
		"\u0173\u0174\u0005^\u0000\u0000\u0174\u0175\u0003H$\u0000\u0175\u017a"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0003:\u001d\u0000\u0177\u0178\u0003"+
		"6\u001b\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0172\u0001\u0000"+
		"\u0000\u0000\u0179\u0176\u0001\u0000\u0000\u0000\u017a1\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0005*\u0000\u0000\u017c\u018f\u0005+\u0000\u0000\u017d"+
		"\u017f\u0005*\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0182"+
		"\u00034\u001a\u0000\u0181\u0183\u0005+\u0000\u0000\u0182\u0181\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u018f\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0005*\u0000\u0000\u0185\u0188\u00034\u001a\u0000"+
		"\u0186\u0187\u0005\u000e\u0000\u0000\u0187\u0189\u00034\u001a\u0000\u0188"+
		"\u0186\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0005+\u0000\u0000\u018d\u018f"+
		"\u0001\u0000\u0000\u0000\u018e\u017b\u0001\u0000\u0000\u0000\u018e\u017e"+
		"\u0001\u0000\u0000\u0000\u018e\u0184\u0001\u0000\u0000\u0000\u018f3\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0005}\u0000\u0000\u01915\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u00057\u0000\u0000\u0193\u0194\u00038\u001c\u0000\u0194"+
		"7\u0001\u0000\u0000\u0000\u0195\u0196\u0005}\u0000\u0000\u0196\u0198\u0005"+
		"\u0010\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u019b\u0001"+
		"\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001"+
		"\u0000\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0199\u0001"+
		"\u0000\u0000\u0000\u019c\u019d\u0007\u0001\u0000\u0000\u019d9\u0001\u0000"+
		"\u0000\u0000\u019e\u01a0\u00058\u0000\u0000\u019f\u01a1\u0005}\u0000\u0000"+
		"\u01a0\u019f\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2\u01a4\u0003<\u001e\u0000\u01a3"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6"+
		";\u0001\u0000\u0000\u0000\u01a7\u01a9\u0005:\u0000\u0000\u01a8\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ac\u0005;\u0000\u0000\u01ab\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0005<\u0000\u0000\u01ae\u01b7\u0005}\u0000\u0000"+
		"\u01af\u01b3\u0005=\u0000\u0000\u01b0\u01b1\u0003@ \u0000\u01b1\u01b2"+
		"\u0005\u0010\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b7\u01af\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01c2"+
		"\u0003>\u001f\u0000\u01ba\u01be\u0005>\u0000\u0000\u01bb\u01bc\u0003@"+
		" \u0000\u01bc\u01bd\u0005\u0010\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000"+
		"\u0000\u01be\u01bb\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01ba\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3=\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c5\u00030\u0018\u0000\u01c5\u01c6\u0005\u0010\u0000\u0000\u01c6"+
		"\u01d7\u0001\u0000\u0000\u0000\u01c7\u01c9\u0003.\u0017\u0000\u01c8\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01d4"+
		"\u0001\u0000\u0000\u0000\u01ca\u01d0\u0005\\\u0000\u0000\u01cb\u01cc\u0003"+
		"0\u0018\u0000\u01cc\u01cd\u0005\u0010\u0000\u0000\u01cd\u01cf\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cb\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d5\u0005]\u0000\u0000\u01d4\u01ca\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d6\u01c4\u0001\u0000\u0000\u0000\u01d6\u01c8\u0001\u0000\u0000"+
		"\u0000\u01d7?\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005E\u0000\u0000\u01d9"+
		"\u01da\u0003H$\u0000\u01da\u01db\u0005@\u0000\u0000\u01db\u01dc\u0005"+
		"}\u0000\u0000\u01dc\u01e3\u0001\u0000\u0000\u0000\u01dd\u01de\u0005E\u0000"+
		"\u0000\u01de\u01df\u0003H$\u0000\u01df\u01e0\u0005A\u0000\u0000\u01e0"+
		"\u01e1\u0005}\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u01d8"+
		"\u0001\u0000\u0000\u0000\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e3A\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e6\u0005Z\u0000\u0000\u01e5\u01e7\u0005}\u0000"+
		"\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000"+
		"\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01eb\u0003D\"\u0000"+
		"\u01e9\u01eb\u0003F#\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01e9"+
		"\u0001\u0000\u0000\u0000\u01ebC\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005"+
		"E\u0000\u0000\u01ed\u01ee\u0003H$\u0000\u01ee\u01f1\u0005F\u0000\u0000"+
		"\u01ef\u01f2\u0003>\u001f\u0000\u01f0\u01f2\u0003D\"\u0000\u01f1\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f6\u0005G\u0000\u0000\u01f4\u01f7\u0003"+
		">\u001f\u0000\u01f5\u01f7\u0003D\"\u0000\u01f6\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f7E\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f9\u0005H\u0000\u0000\u01f9\u01fa\u0003H$\u0000\u01fa\u01ff"+
		"\u00059\u0000\u0000\u01fb\u01fc\u0003`0\u0000\u01fc\u01fd\u0005\u000f"+
		"\u0000\u0000\u01fd\u01fe\u0003>\u001f\u0000\u01fe\u0200\u0001\u0000\u0000"+
		"\u0000\u01ff\u01fb\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000"+
		"\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000"+
		"\u0000\u0202G\u0001\u0000\u0000\u0000\u0203\u0204\u0006$\uffff\uffff\u0000"+
		"\u0204\u0216\u0003l6\u0000\u0205\u0206\u0005B\u0000\u0000\u0206\u0216"+
		"\u0005}\u0000\u0000\u0207\u0216\u0003L&\u0000\u0208\u0216\u0003N\'\u0000"+
		"\u0209\u0216\u0003P(\u0000\u020a\u0216\u0003R)\u0000\u020b\u0216\u0003"+
		"T*\u0000\u020c\u0216\u0003\\.\u0000\u020d\u0216\u0003b1\u0000\u020e\u020f"+
		"\u0005*\u0000\u0000\u020f\u0210\u0003H$\u0000\u0210\u0211\u0005+\u0000"+
		"\u0000\u0211\u0216\u0001\u0000\u0000\u0000\u0212\u0213\u0003n7\u0000\u0213"+
		"\u0214\u0003H$\u0001\u0214\u0216\u0001\u0000\u0000\u0000\u0215\u0203\u0001"+
		"\u0000\u0000\u0000\u0215\u0205\u0001\u0000\u0000\u0000\u0215\u0207\u0001"+
		"\u0000\u0000\u0000\u0215\u0208\u0001\u0000\u0000\u0000\u0215\u0209\u0001"+
		"\u0000\u0000\u0000\u0215\u020a\u0001\u0000\u0000\u0000\u0215\u020b\u0001"+
		"\u0000\u0000\u0000\u0215\u020c\u0001\u0000\u0000\u0000\u0215\u020d\u0001"+
		"\u0000\u0000\u0000\u0215\u020e\u0001\u0000\u0000\u0000\u0215\u0212\u0001"+
		"\u0000\u0000\u0000\u0216\u021d\u0001\u0000\u0000\u0000\u0217\u0218\n\u0002"+
		"\u0000\u0000\u0218\u0219\u0003t:\u0000\u0219\u021a\u0003H$\u0003\u021a"+
		"\u021c\u0001\u0000\u0000\u0000\u021b\u0217\u0001\u0000\u0000\u0000\u021c"+
		"\u021f\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0001\u0000\u0000\u0000\u021eI\u0001\u0000\u0000\u0000\u021f\u021d"+
		"\u0001\u0000\u0000\u0000\u0220\u0225\u0003l6\u0000\u0221\u0222\u0005\u000e"+
		"\u0000\u0000\u0222\u0224\u0003l6\u0000\u0223\u0221\u0001\u0000\u0000\u0000"+
		"\u0224\u0227\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000"+
		"\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0229\u0001\u0000\u0000\u0000"+
		"\u0227\u0225\u0001\u0000\u0000\u0000\u0228\u0220\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0001\u0000\u0000\u0000\u0229K\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0005C\u0000\u0000\u022b\u024b\u0003H$\u0000\u022c\u022d\u0003"+
		"l6\u0000\u022d\u022e\u0005\u001b\u0000\u0000\u022e\u022f\u0003H$\u0000"+
		"\u022f\u024b\u0001\u0000\u0000\u0000\u0230\u0231\u0005D\u0000\u0000\u0231"+
		"\u0232\u0005*\u0000\u0000\u0232\u0233\u0003l6\u0000\u0233\u0234\u0005"+
		"\u0010\u0000\u0000\u0234\u0235\u0003\u0014\n\u0000\u0235\u0236\u0005\u0010"+
		"\u0000\u0000\u0236\u0237\u0003l6\u0000\u0237\u0238\u0005+\u0000\u0000"+
		"\u0238\u024b\u0001\u0000\u0000\u0000\u0239\u023a\u0003l6\u0000\u023a\u023b"+
		"\u0005D\u0000\u0000\u023b\u023c\u0003l6\u0000\u023c\u024b\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0003l6\u0000\u023e\u023f\u0005H\u0000\u0000"+
		"\u023f\u0240\u0003l6\u0000\u0240\u024b\u0001\u0000\u0000\u0000\u0241\u0242"+
		"\u0005Y\u0000\u0000\u0242\u0243\u0005}\u0000\u0000\u0243\u0244\u0005*"+
		"\u0000\u0000\u0244\u0245\u0003l6\u0000\u0245\u0246\u0005+\u0000\u0000"+
		"\u0246\u0247\u0005*\u0000\u0000\u0247\u0248\u0003l6\u0000\u0248\u0249"+
		"\u0005+\u0000\u0000\u0249\u024b\u0001\u0000\u0000\u0000\u024a\u022a\u0001"+
		"\u0000\u0000\u0000\u024a\u022c\u0001\u0000\u0000\u0000\u024a\u0230\u0001"+
		"\u0000\u0000\u0000\u024a\u0239\u0001\u0000\u0000\u0000\u024a\u023d\u0001"+
		"\u0000\u0000\u0000\u024a\u0241\u0001\u0000\u0000\u0000\u024bM\u0001\u0000"+
		"\u0000\u0000\u024c\u024d\u0005\u001e\u0000\u0000\u024d\u024e\u0005*\u0000"+
		"\u0000\u024e\u024f\u0003J%\u0000\u024f\u0250\u0005+\u0000\u0000\u0250"+
		"O\u0001\u0000\u0000\u0000\u0251\u0252\u0003l6\u0000\u0252\u0253\u0005"+
		",\u0000\u0000\u0253\u0254\u0005w\u0000\u0000\u0254\u0255\u0005\u001d\u0000"+
		"\u0000\u0255\u0256\u0005w\u0000\u0000\u0256\u0257\u0005-\u0000\u0000\u0257"+
		"\u026c\u0001\u0000\u0000\u0000\u0258\u0259\u0005*\u0000\u0000\u0259\u025a"+
		"\u0003l6\u0000\u025a\u025c\u0005!\u0000\u0000\u025b\u025d\u0003X,\u0000"+
		"\u025c\u025b\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000"+
		"\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0005K\u0000\u0000\u0261"+
		"\u0262\u0003l6\u0000\u0262\u026c\u0001\u0000\u0000\u0000\u0263\u0264\u0003"+
		"l6\u0000\u0264\u0265\u0005\r\u0000\u0000\u0265\u0266\u0003\u0014\n\u0000"+
		"\u0266\u026c\u0001\u0000\u0000\u0000\u0267\u0268\u0005,\u0000\u0000\u0268"+
		"\u0269\u0003J%\u0000\u0269\u026a\u0005-\u0000\u0000\u026a\u026c\u0001"+
		"\u0000\u0000\u0000\u026b\u0251\u0001\u0000\u0000\u0000\u026b\u0258\u0001"+
		"\u0000\u0000\u0000\u026b\u0263\u0001\u0000\u0000\u0000\u026b\u0267\u0001"+
		"\u0000\u0000\u0000\u026cQ\u0001\u0000\u0000\u0000\u026d\u026e\u0005.\u0000"+
		"\u0000\u026e\u0273\u0003V+\u0000\u026f\u0270\u0005\u000e\u0000\u0000\u0270"+
		"\u0272\u0003V+\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0272\u0275\u0001"+
		"\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0274\u0001"+
		"\u0000\u0000\u0000\u0274\u0276\u0001\u0000\u0000\u0000\u0275\u0273\u0001"+
		"\u0000\u0000\u0000\u0276\u0277\u0005/\u0000\u0000\u0277S\u0001\u0000\u0000"+
		"\u0000\u0278\u0279\u0005*\u0000\u0000\u0279\u027a\u0005}\u0000\u0000\u027a"+
		"\u027c\u0005N\u0000\u0000\u027b\u027d\u0003Z-\u0000\u027c\u027b\u0001"+
		"\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u027c\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001"+
		"\u0000\u0000\u0000\u0280\u0281\u0005^\u0000\u0000\u0281\u0282\u0003l6"+
		"\u0000\u0282U\u0001\u0000\u0000\u0000\u0283\u0284\u0005}\u0000\u0000\u0284"+
		"\u0285\u0005\u000f\u0000\u0000\u0285\u0286\u0003l6\u0000\u0286W\u0001"+
		"\u0000\u0000\u0000\u0287\u0288\u0005,\u0000\u0000\u0288\u0289\u0003l6"+
		"\u0000\u0289\u028a\u0005-\u0000\u0000\u028aY\u0001\u0000\u0000\u0000\u028b"+
		"\u028e\u0005}\u0000\u0000\u028c\u028e\u0003X,\u0000\u028d\u028b\u0001"+
		"\u0000\u0000\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028e[\u0001\u0000"+
		"\u0000\u0000\u028f\u0290\u0005E\u0000\u0000\u0290\u0291\u0003l6\u0000"+
		"\u0291\u0292\u0005F\u0000\u0000\u0292\u0293\u0003l6\u0000\u0293\u0294"+
		"\u0005G\u0000\u0000\u0294\u0295\u0003l6\u0000\u0295\u02a2\u0001\u0000"+
		"\u0000\u0000\u0296\u0297\u0005*\u0000\u0000\u0297\u0298\u0005I\u0000\u0000"+
		"\u0298\u0299\u0003l6\u0000\u0299\u029b\u0005J\u0000\u0000\u029a\u029c"+
		"\u0003^/\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000"+
		"\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000"+
		"\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a0\u0005+\u0000"+
		"\u0000\u02a0\u02a2\u0001\u0000\u0000\u0000\u02a1\u028f\u0001\u0000\u0000"+
		"\u0000\u02a1\u0296\u0001\u0000\u0000\u0000\u02a2]\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a4\u0003`0\u0000\u02a4\u02a5\u0005\u000f\u0000\u0000\u02a5\u02a6"+
		"\u0003l6\u0000\u02a6_\u0001\u0000\u0000\u0000\u02a7\u02b0\u0005}\u0000"+
		"\u0000\u02a8\u02b0\u0005v\u0000\u0000\u02a9\u02ab\u0005\u0012\u0000\u0000"+
		"\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000"+
		"\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02b0\u0005w\u0000\u0000\u02ad"+
		"\u02b0\u0005u\u0000\u0000\u02ae\u02b0\u0005\u001f\u0000\u0000\u02af\u02a7"+
		"\u0001\u0000\u0000\u0000\u02af\u02a8\u0001\u0000\u0000\u0000\u02af\u02aa"+
		"\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02af\u02ae"+
		"\u0001\u0000\u0000\u0000\u02b0a\u0001\u0000\u0000\u0000\u02b1\u02b2\u0003"+
		"d2\u0000\u02b2\u02b3\u0005*\u0000\u0000\u02b3\u02b4\u0003J%\u0000\u02b4"+
		"\u02b5\u0005+\u0000\u0000\u02b5\u0303\u0001\u0000\u0000\u0000\u02b6\u02b7"+
		"\u0005*\u0000\u0000\u02b7\u02b8\u0003j5\u0000\u02b8\u02b9\u0005(\u0000"+
		"\u0000\u02b9\u02ba\u0003d2\u0000\u02ba\u02bb\u0005\u0010\u0000\u0000\u02bb"+
		"\u02bc\u0003\u0014\n\u0000\u02bc\u02bd\u0005)\u0000\u0000\u02bd\u02be"+
		"\u0005+\u0000\u0000\u02be\u02bf\u0005*\u0000\u0000\u02bf\u02c0\u0003J"+
		"%\u0000\u02c0\u02c1\u0005+\u0000\u0000\u02c1\u0303\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c3\u0005*\u0000\u0000\u02c3\u02c4\u0005T\u0000\u0000\u02c4\u02c5"+
		"\u0005(\u0000\u0000\u02c5\u02c6\u0003d2\u0000\u02c6\u02c7\u0005\u0010"+
		"\u0000\u0000\u02c7\u02c8\u0003\u0014\n\u0000\u02c8\u02c9\u0005)\u0000"+
		"\u0000\u02c9\u02ca\u0005E\u0000\u0000\u02ca\u02cb\u0003l6\u0000\u02cb"+
		"\u02cc\u0005K\u0000\u0000\u02cc\u02cd\u0005*\u0000\u0000\u02cd\u02ce\u0003"+
		"J%\u0000\u02ce\u02cf\u0005+\u0000\u0000\u02cf\u02d0\u0005+\u0000\u0000"+
		"\u02d0\u02d1\u0005*\u0000\u0000\u02d1\u02d2\u0003J%\u0000\u02d2\u02d3"+
		"\u0005+\u0000\u0000\u02d3\u0303\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005"+
		"*\u0000\u0000\u02d5\u02d6\u0005U\u0000\u0000\u02d6\u02d7\u0005(\u0000"+
		"\u0000\u02d7\u02d8\u0003d2\u0000\u02d8\u02d9\u0005\u0010\u0000\u0000\u02d9"+
		"\u02da\u0003\u0014\n\u0000\u02da\u02db\u0005)\u0000\u0000\u02db\u02dc"+
		"\u0005E\u0000\u0000\u02dc\u02dd\u0003l6\u0000\u02dd\u02de\u0005K\u0000"+
		"\u0000\u02de\u02df\u0005*\u0000\u0000\u02df\u02e0\u0003J%\u0000\u02e0"+
		"\u02e1\u0005+\u0000\u0000\u02e1\u02e2\u0005+\u0000\u0000\u02e2\u02e3\u0005"+
		"*\u0000\u0000\u02e3\u02e4\u0003J%\u0000\u02e4\u02e5\u0005+\u0000\u0000"+
		"\u02e5\u0303\u0001\u0000\u0000\u0000\u02e6\u02e7\u0005*\u0000\u0000\u02e7"+
		"\u02e8\u0005V\u0000\u0000\u02e8\u02e9\u0005(\u0000\u0000\u02e9\u02ea\u0003"+
		"d2\u0000\u02ea\u02eb\u0005\u0010\u0000\u0000\u02eb\u02ec\u0003\u0014\n"+
		"\u0000\u02ec\u02ed\u0005)\u0000\u0000\u02ed\u02ee\u0005E\u0000\u0000\u02ee"+
		"\u02ef\u0003l6\u0000\u02ef\u02f0\u0005+\u0000\u0000\u02f0\u02f1\u0005"+
		"*\u0000\u0000\u02f1\u02f2\u0003J%\u0000\u02f2\u02f3\u0005+\u0000\u0000"+
		"\u02f3\u0303\u0001\u0000\u0000\u0000\u02f4\u02f5\u0005*\u0000\u0000\u02f5"+
		"\u02f6\u0005W\u0000\u0000\u02f6\u02f7\u0005(\u0000\u0000\u02f7\u02f8\u0003"+
		"d2\u0000\u02f8\u02f9\u0005\u0010\u0000\u0000\u02f9\u02fa\u0003\u0014\n"+
		"\u0000\u02fa\u02fb\u0005)\u0000\u0000\u02fb\u02fc\u0005E\u0000\u0000\u02fc"+
		"\u02fd\u0003l6\u0000\u02fd\u02fe\u0005+\u0000\u0000\u02fe\u02ff\u0005"+
		"*\u0000\u0000\u02ff\u0300\u0003J%\u0000\u0300\u0301\u0005+\u0000\u0000"+
		"\u0301\u0303\u0001\u0000\u0000\u0000\u0302\u02b1\u0001\u0000\u0000\u0000"+
		"\u0302\u02b6\u0001\u0000\u0000\u0000\u0302\u02c2\u0001\u0000\u0000\u0000"+
		"\u0302\u02d4\u0001\u0000\u0000\u0000\u0302\u02e6\u0001\u0000\u0000\u0000"+
		"\u0302\u02f4\u0001\u0000\u0000\u0000\u0303c\u0001\u0000\u0000\u0000\u0304"+
		"\u0310\u0005}\u0000\u0000\u0305\u0310\u0003f3\u0000\u0306\u0310\u0003"+
		"h4\u0000\u0307\u0308\u0005*\u0000\u0000\u0308\u0309\u0005M\u0000\u0000"+
		"\u0309\u030a\u0005}\u0000\u0000\u030a\u0310\u0005+\u0000\u0000\u030b\u030c"+
		"\u0005*\u0000\u0000\u030c\u030d\u0005L\u0000\u0000\u030d\u030e\u0005}"+
		"\u0000\u0000\u030e\u0310\u0005+\u0000\u0000\u030f\u0304\u0001\u0000\u0000"+
		"\u0000\u030f\u0305\u0001\u0000\u0000\u0000\u030f\u0306\u0001\u0000\u0000"+
		"\u0000\u030f\u0307\u0001\u0000\u0000\u0000\u030f\u030b\u0001\u0000\u0000"+
		"\u0000\u0310e\u0001\u0000\u0000\u0000\u0311\u0312\u0007\u0002\u0000\u0000"+
		"\u0312g\u0001\u0000\u0000\u0000\u0313\u0314\u0007\u0003\u0000\u0000\u0314"+
		"i\u0001\u0000\u0000\u0000\u0315\u0316\u0007\u0004\u0000\u0000\u0316k\u0001"+
		"\u0000\u0000\u0000\u0317\u0318\u00066\uffff\uffff\u0000\u0318\u0329\u0005"+
		"}\u0000\u0000\u0319\u0329\u0003v;\u0000\u031a\u031b\u0005}\u0000\u0000"+
		"\u031b\u0329\u0003*\u0015\u0000\u031c\u031d\u0005*\u0000\u0000\u031d\u031e"+
		"\u0003l6\u0000\u031e\u031f\u0005+\u0000\u0000\u031f\u0329\u0001\u0000"+
		"\u0000\u0000\u0320\u0321\u0003n7\u0000\u0321\u0322\u0003l6\u0005\u0322"+
		"\u0329\u0001\u0000\u0000\u0000\u0323\u0324\u0005*\u0000\u0000\u0324\u0325"+
		"\u0003\n\u0005\u0000\u0325\u0326\u0003l6\u0000\u0326\u0327\u0005+\u0000"+
		"\u0000\u0327\u0329\u0001\u0000\u0000\u0000\u0328\u0317\u0001\u0000\u0000"+
		"\u0000\u0328\u0319\u0001\u0000\u0000\u0000\u0328\u031a\u0001\u0000\u0000"+
		"\u0000\u0328\u031c\u0001\u0000\u0000\u0000\u0328\u0320\u0001\u0000\u0000"+
		"\u0000\u0328\u0323\u0001\u0000\u0000\u0000\u0329\u0340\u0001\u0000\u0000"+
		"\u0000\u032a\u032b\n\u0004\u0000\u0000\u032b\u032c\u0003p8\u0000\u032c"+
		"\u032d\u0003l6\u0005\u032d\u033f\u0001\u0000\u0000\u0000\u032e\u032f\n"+
		"\u0003\u0000\u0000\u032f\u0330\u0003t:\u0000\u0330\u0331\u0003l6\u0004"+
		"\u0331\u033f\u0001\u0000\u0000\u0000\u0332\u0333\n\u0002\u0000\u0000\u0333"+
		"\u0334\u0003r9\u0000\u0334\u0335\u0003l6\u0003\u0335\u033f\u0001\u0000"+
		"\u0000\u0000\u0336\u0337\n\u0007\u0000\u0000\u0337\u0338\u0005,\u0000"+
		"\u0000\u0338\u0339\u0003\u0014\n\u0000\u0339\u033a\u0005-\u0000\u0000"+
		"\u033a\u033f\u0001\u0000\u0000\u0000\u033b\u033c\n\u0006\u0000\u0000\u033c"+
		"\u033d\u0005!\u0000\u0000\u033d\u033f\u0005}\u0000\u0000\u033e\u032a\u0001"+
		"\u0000\u0000\u0000\u033e\u032e\u0001\u0000\u0000\u0000\u033e\u0332\u0001"+
		"\u0000\u0000\u0000\u033e\u0336\u0001\u0000\u0000\u0000\u033e\u033b\u0001"+
		"\u0000\u0000\u0000\u033f\u0342\u0001\u0000\u0000\u0000\u0340\u033e\u0001"+
		"\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341m\u0001\u0000"+
		"\u0000\u0000\u0342\u0340\u0001\u0000\u0000\u0000\u0343\u0344\u0007\u0005"+
		"\u0000\u0000\u0344o\u0001\u0000\u0000\u0000\u0345\u0346\u0007\u0006\u0000"+
		"\u0000\u0346q\u0001\u0000\u0000\u0000\u0347\u0348\u0007\u0007\u0000\u0000"+
		"\u0348s\u0001\u0000\u0000\u0000\u0349\u034a\u0007\b\u0000\u0000\u034a"+
		"u\u0001\u0000\u0000\u0000\u034b\u034c\u0007\t\u0000\u0000\u034cw\u0001"+
		"\u0000\u0000\u0000I{\u0083\u008b\u0091\u009b\u009f\u00b4\u00b9\u00c0\u00cf"+
		"\u00d7\u00e9\u00ee\u00fc\u00fe\u0106\u0109\u0114\u011a\u011d\u0127\u013c"+
		"\u0146\u0149\u0154\u0158\u0160\u0165\u0167\u016f\u0179\u017e\u0182\u018a"+
		"\u018e\u0199\u01a0\u01a5\u01a8\u01ab\u01b5\u01b7\u01c0\u01c2\u01c8\u01d0"+
		"\u01d4\u01d6\u01e2\u01e6\u01ea\u01f1\u01f6\u0201\u0215\u021d\u0225\u0228"+
		"\u024a\u025e\u026b\u0273\u027e\u028d\u029d\u02a1\u02aa\u02af\u0302\u030f"+
		"\u0328\u033e\u0340";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}