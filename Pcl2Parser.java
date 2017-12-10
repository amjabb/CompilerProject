// Generated from Pcl2.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pcl2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PROGRAM=4, END=5, IDENTIFIER=6, INTEGER=7, FLOAT=8, 
		MUL_OP=9, DIV_OP=10, ADD_OP=11, SUB_OP=12, WRITE=13, READ=14, OP_COMPARE=15, 
		OP_LT=16, OP_GT=17, OP_GTEQ=18, OP_LTEQ=19, COMMA=20, DASH=21, LPAREN=22, 
		RPAREN=23, IF_TOKEN=24, ELSE_TOKEN=25, WHILE_TOKEN=26, NEWLINE=27, WS=28;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_mainBlock = 2, RULE_block = 3, 
		RULE_declarations = 4, RULE_declList = 5, RULE_decl = 6, RULE_varList = 7, 
		RULE_varId = 8, RULE_typeId = 9, RULE_stmt = 10, RULE_stmtList = 11, RULE_assignmentStmt = 12, 
		RULE_variable = 13, RULE_expr = 14, RULE_mulDivOp = 15, RULE_addSubOp = 16, 
		RULE_signedNumber = 17, RULE_sign = 18, RULE_number = 19, RULE_compareOp = 20, 
		RULE_factor = 21, RULE_string = 22, RULE_writeStmt = 23, RULE_compareStmt = 24, 
		RULE_ifStmt = 25, RULE_whileStmt = 26;
	public static final String[] ruleNames = {
		"program", "header", "mainBlock", "block", "declarations", "declList", 
		"decl", "varList", "varId", "typeId", "stmt", "stmtList", "assignmentStmt", 
		"variable", "expr", "mulDivOp", "addSubOp", "signedNumber", "sign", "number", 
		"compareOp", "factor", "string", "writeStmt", "compareStmt", "ifStmt", 
		"whileStmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'duffle'", "'''", "'avast'", "'blackspot'", null, null, 
		null, "'loot'", "'boot'", "'pillage'", "'robbed'", "'feedTheFish'", "'YoHoHo'", 
		"'=='", "'<'", "'>'", "'>='", "'<='", "','", "'-'", "'('", "')'", "'ahoy'", 
		"'ahoyMatey'", "'swabTheDeck'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "PROGRAM", "END", "IDENTIFIER", "INTEGER", "FLOAT", 
		"MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "WRITE", "READ", "OP_COMPARE", 
		"OP_LT", "OP_GT", "OP_GTEQ", "OP_LTEQ", "COMMA", "DASH", "LPAREN", "RPAREN", 
		"IF_TOKEN", "ELSE_TOKEN", "WHILE_TOKEN", "NEWLINE", "WS"
	};
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
	public String getGrammarFileName() { return "Pcl2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Pcl2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			header();
			setState(55);
			mainBlock();
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(Pcl2Parser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Pcl2Parser.IDENTIFIER, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(PROGRAM);
			setState(58);
			match(IDENTIFIER);
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

	public static class MainBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitMainBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			declarations();
			setState(63);
			stmtList();
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
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			declList();
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

	public static class DeclListContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitDeclList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclListContext declList() throws RecognitionException {
		DeclListContext _localctx = new DeclListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			decl();
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					decl();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			varList();
			setState(75);
			match(T__0);
			setState(76);
			typeId();
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

	public static class VarListContext extends ParserRuleContext {
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			varId();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79);
				match(COMMA);
				setState(80);
				varId();
				}
				}
				setState(85);
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

	public static class VarIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Pcl2Parser.IDENTIFIER, 0); }
		public VarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitVarId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitVarId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIdContext varId() throws RecognitionException {
		VarIdContext _localctx = new VarIdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IDENTIFIER);
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

	public static class TypeIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Pcl2Parser.IDENTIFIER, 0); }
		public TypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdContext typeId() throws RecognitionException {
		TypeIdContext _localctx = new TypeIdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IDENTIFIER);
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

	public static class StmtContext extends ParserRuleContext {
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public CompareStmtContext compareStmt() {
			return getRuleContext(CompareStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				assignmentStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				writeStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				whileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				compareStmt();
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

	public static class StmtListContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitStmtList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitStmtList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmtList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			stmt();
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

	public static class AssignmentStmtContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			variable();
			setState(100);
			match(T__1);
			setState(101);
			expr(0);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Pcl2Parser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IDENTIFIER);
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
		public TypeSpec type = null;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class VariableExprContext extends ExprContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitVariableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubOpContext addSubOp() {
			return getRuleContext(AddSubOpContext.class,0);
		}
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsignedNumberExprContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public UnsignedNumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterUnsignedNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitUnsignedNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitUnsignedNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivOpContext mulDivOp() {
			return getRuleContext(MulDivOpContext.class,0);
		}
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignedNumberExprContext extends ExprContext {
		public SignedNumberContext signedNumber() {
			return getRuleContext(SignedNumberContext.class,0);
		}
		public SignedNumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterSignedNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitSignedNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitSignedNumberExpr(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
				{
				_localctx = new UnsignedNumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(106);
				number();
				}
				break;
			case ADD_OP:
			case SUB_OP:
				{
				_localctx = new SignedNumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				signedNumber();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				variable();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(LPAREN);
				setState(110);
				expr(0);
				setState(111);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(116);
						mulDivOp();
						setState(117);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(120);
						addSubOp();
						setState(121);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new BooleanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124);
						compareOp();
						setState(125);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class MulDivOpContext extends ParserRuleContext {
		public TerminalNode MUL_OP() { return getToken(Pcl2Parser.MUL_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(Pcl2Parser.DIV_OP, 0); }
		public MulDivOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterMulDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitMulDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitMulDivOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivOpContext mulDivOp() throws RecognitionException {
		MulDivOpContext _localctx = new MulDivOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==MUL_OP || _la==DIV_OP) ) {
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

	public static class AddSubOpContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(Pcl2Parser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(Pcl2Parser.SUB_OP, 0); }
		public AddSubOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterAddSubOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitAddSubOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitAddSubOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubOpContext addSubOp() throws RecognitionException {
		AddSubOpContext _localctx = new AddSubOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUB_OP) ) {
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

	public static class SignedNumberContext extends ParserRuleContext {
		public TypeSpec type = null;
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterSignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitSignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitSignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedNumberContext signedNumber() throws RecognitionException {
		SignedNumberContext _localctx = new SignedNumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_signedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			sign();
			setState(137);
			number();
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(Pcl2Parser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(Pcl2Parser.SUB_OP, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUB_OP) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public TypeSpec type = null;
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class FloatConstContext extends NumberContext {
		public TerminalNode FLOAT() { return getToken(Pcl2Parser.FLOAT, 0); }
		public FloatConstContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterFloatConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitFloatConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitFloatConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerConstContext extends NumberContext {
		public TerminalNode INTEGER() { return getToken(Pcl2Parser.INTEGER, 0); }
		public IntegerConstContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterIntegerConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitIntegerConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitIntegerConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(FLOAT);
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

	public static class CompareOpContext extends ParserRuleContext {
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitCompareOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitCompareOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_COMPARE) | (1L << OP_LT) | (1L << OP_GT) | (1L << OP_GTEQ) | (1L << OP_LTEQ))) != 0)) ) {
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Pcl2Parser.IDENTIFIER, 0); }
		public TerminalNode INTEGER() { return getToken(Pcl2Parser.INTEGER, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==INTEGER) ) {
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

	public static class StringContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__2);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER || _la==INTEGER) {
				{
				{
				setState(150);
				factor();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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

	public static class WriteStmtContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Pcl2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Pcl2Parser.IDENTIFIER, i);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_writeStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(WRITE);
			setState(159);
			match(LPAREN);
			{
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(160);
						string();
						}
						break;
					case IDENTIFIER:
						{
						setState(161);
						match(IDENTIFIER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(164);
					match(COMMA);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(170);
				string();
				}
				break;
			case IDENTIFIER:
				{
				setState(171);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(174);
			match(RPAREN);
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

	public static class CompareStmtContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public CompareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterCompareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitCompareStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitCompareStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareStmtContext compareStmt() throws RecognitionException {
		CompareStmtContext _localctx = new CompareStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_compareStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			expr(0);
			setState(177);
			compareOp();
			setState(178);
			expr(0);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF_TOKEN() { return getToken(Pcl2Parser.IF_TOKEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IF_TOKEN);
			setState(181);
			match(LPAREN);
			setState(182);
			expr(0);
			setState(183);
			match(RPAREN);
			setState(184);
			stmt();
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(185);
				match(ELSE_TOKEN);
				setState(186);
				stmt();
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

	public static class WhileStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pcl2Listener ) ((Pcl2Listener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl2Visitor ) return ((Pcl2Visitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(WHILE_TOKEN);
			setState(190);
			match(LPAREN);
			setState(191);
			expr(0);
			setState(192);
			match(RPAREN);
			setState(193);
			stmt();
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
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00c6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\7\7H\n\7\f\7\16\7K\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\7\tT\n\t\f\t\16\tW\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\fb"+
		"\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20t\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u0082\n\20\f\20\16\20\u0085\13\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u0092\n\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\7\30\u009a\n\30\f\30\16\30\u009d\13\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\5\31\u00a5\n\31\3\31\7\31\u00a8\n\31\f\31\16\31\u00ab"+
		"\13\31\3\31\3\31\5\31\u00af\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u00be\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\2\3\36\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\66\2\6\3\2\13\f\3\2\r\16\3\2\21\25\3\2\b\t\2\u00bc\28\3\2\2\2\4"+
		";\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16L\3\2\2\2\20P"+
		"\3\2\2\2\22X\3\2\2\2\24Z\3\2\2\2\26a\3\2\2\2\30c\3\2\2\2\32e\3\2\2\2\34"+
		"i\3\2\2\2\36s\3\2\2\2 \u0086\3\2\2\2\"\u0088\3\2\2\2$\u008a\3\2\2\2&\u008d"+
		"\3\2\2\2(\u0091\3\2\2\2*\u0093\3\2\2\2,\u0095\3\2\2\2.\u0097\3\2\2\2\60"+
		"\u00a0\3\2\2\2\62\u00b2\3\2\2\2\64\u00b6\3\2\2\2\66\u00bf\3\2\2\289\5"+
		"\4\3\29:\5\6\4\2:\3\3\2\2\2;<\7\6\2\2<=\7\b\2\2=\5\3\2\2\2>?\5\b\5\2?"+
		"\7\3\2\2\2@A\5\n\6\2AB\5\30\r\2B\t\3\2\2\2CD\5\f\7\2D\13\3\2\2\2EI\5\16"+
		"\b\2FH\5\16\b\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\r\3\2\2\2KI\3"+
		"\2\2\2LM\5\20\t\2MN\7\3\2\2NO\5\24\13\2O\17\3\2\2\2PU\5\22\n\2QR\7\26"+
		"\2\2RT\5\22\n\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\21\3\2\2\2WU"+
		"\3\2\2\2XY\7\b\2\2Y\23\3\2\2\2Z[\7\b\2\2[\25\3\2\2\2\\b\5\32\16\2]b\5"+
		"\60\31\2^b\5\64\33\2_b\5\66\34\2`b\5\62\32\2a\\\3\2\2\2a]\3\2\2\2a^\3"+
		"\2\2\2a_\3\2\2\2a`\3\2\2\2b\27\3\2\2\2cd\5\26\f\2d\31\3\2\2\2ef\5\34\17"+
		"\2fg\7\4\2\2gh\5\36\20\2h\33\3\2\2\2ij\7\b\2\2j\35\3\2\2\2kl\b\20\1\2"+
		"lt\5(\25\2mt\5$\23\2nt\5\34\17\2op\7\30\2\2pq\5\36\20\2qr\7\31\2\2rt\3"+
		"\2\2\2sk\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2t\u0083\3\2\2\2uv\f\t\2"+
		"\2vw\5 \21\2wx\5\36\20\nx\u0082\3\2\2\2yz\f\b\2\2z{\5\"\22\2{|\5\36\20"+
		"\t|\u0082\3\2\2\2}~\f\7\2\2~\177\5*\26\2\177\u0080\5\36\20\b\u0080\u0082"+
		"\3\2\2\2\u0081u\3\2\2\2\u0081y\3\2\2\2\u0081}\3\2\2\2\u0082\u0085\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\37\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0087\t\2\2\2\u0087!\3\2\2\2\u0088\u0089\t\3\2\2\u0089"+
		"#\3\2\2\2\u008a\u008b\5&\24\2\u008b\u008c\5(\25\2\u008c%\3\2\2\2\u008d"+
		"\u008e\t\3\2\2\u008e\'\3\2\2\2\u008f\u0092\7\t\2\2\u0090\u0092\7\n\2\2"+
		"\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092)\3\2\2\2\u0093\u0094\t"+
		"\4\2\2\u0094+\3\2\2\2\u0095\u0096\t\5\2\2\u0096-\3\2\2\2\u0097\u009b\7"+
		"\5\2\2\u0098\u009a\5,\27\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u009f\7\5\2\2\u009f/\3\2\2\2\u00a0\u00a1\7\17\2\2\u00a1\u00a9"+
		"\7\30\2\2\u00a2\u00a5\5.\30\2\u00a3\u00a5\7\b\2\2\u00a4\u00a2\3\2\2\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\7\26\2\2\u00a7\u00a4"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ae\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\5.\30\2\u00ad\u00af\7\b"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\7\31\2\2\u00b1\61\3\2\2\2\u00b2\u00b3\5\36\20\2\u00b3\u00b4\5*"+
		"\26\2\u00b4\u00b5\5\36\20\2\u00b5\63\3\2\2\2\u00b6\u00b7\7\32\2\2\u00b7"+
		"\u00b8\7\30\2\2\u00b8\u00b9\5\36\20\2\u00b9\u00ba\7\31\2\2\u00ba\u00bd"+
		"\5\26\f\2\u00bb\u00bc\7\33\2\2\u00bc\u00be\5\26\f\2\u00bd\u00bb\3\2\2"+
		"\2\u00bd\u00be\3\2\2\2\u00be\65\3\2\2\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1"+
		"\7\30\2\2\u00c1\u00c2\5\36\20\2\u00c2\u00c3\7\31\2\2\u00c3\u00c4\5\26"+
		"\f\2\u00c4\67\3\2\2\2\16IUas\u0081\u0083\u0091\u009b\u00a4\u00a9\u00ae"+
		"\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}