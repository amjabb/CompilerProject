// Generated from Business.g4 by ANTLR 4.7.1

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
public class BusinessParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, PROGRAM=26, VAR=27, BEGIN=28, RETURN=29, END=30, MAIN=31, CALL=32, 
		FUNCVAR=33, IDENTIFIER=34, INTEGER=35, FLOAT=36, MUL_OP=37, DIV_OP=38, 
		ADD_OP=39, SUB_OP=40, LineComment=41, NEWLINE=42, WS=43;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_mainBlock = 2, RULE_block = 3, 
		RULE_main = 4, RULE_declarations = 5, RULE_declList = 6, RULE_decl = 7, 
		RULE_varList = 8, RULE_varId = 9, RULE_funcId = 10, RULE_typeId = 11, 
		RULE_compoundStmt = 12, RULE_funcCompoundStmt = 13, RULE_stmt = 14, RULE_stmtList = 15, 
		RULE_funcStmtList = 16, RULE_funcStmt = 17, RULE_funcAssignmentStmt = 18, 
		RULE_funcExpr = 19, RULE_assignmentStmt = 20, RULE_variable = 21, RULE_expr = 22, 
		RULE_compareOp = 23, RULE_mulDivOp = 24, RULE_addSubOp = 25, RULE_signedNumber = 26, 
		RULE_sign = 27, RULE_number = 28, RULE_ifStatement = 29, RULE_forStatement = 30, 
		RULE_whileStatement = 31, RULE_functionDeclaration = 32, RULE_returnStmt = 33, 
		RULE_formalParameterList = 34, RULE_parameterGroup = 35, RULE_callStmt = 36, 
		RULE_functionDesignator = 37, RULE_parameterList = 38, RULE_actualParameter = 39, 
		RULE_funcVar = 40, RULE_printStmt = 41, RULE_printStringStmt = 42, RULE_printDoubleStmt = 43, 
		RULE_string = 44, RULE_functionAssignment = 45, RULE_funcMain = 46, RULE_function = 47;
	public static final String[] ruleNames = {
		"program", "header", "mainBlock", "block", "main", "declarations", "declList", 
		"decl", "varList", "varId", "funcId", "typeId", "compoundStmt", "funcCompoundStmt", 
		"stmt", "stmtList", "funcStmtList", "funcStmt", "funcAssignmentStmt", 
		"funcExpr", "assignmentStmt", "variable", "expr", "compareOp", "mulDivOp", 
		"addSubOp", "signedNumber", "sign", "number", "ifStatement", "forStatement", 
		"whileStatement", "functionDeclaration", "returnStmt", "formalParameterList", 
		"parameterGroup", "callStmt", "functionDesignator", "parameterList", "actualParameter", 
		"funcVar", "printStmt", "printStringStmt", "printDoubleStmt", "string", 
		"functionAssignment", "funcMain", "function"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "':'", "','", "'='", "'('", "')'", "'=='", "'!='", 
		"'<'", "'<='", "'>='", "'>'", "'IN'", "'IF'", "'THEN'", "'ELSE'", "'RANGE'", 
		"'WHILE'", "'PRINT'", "'PRINT_S'", "'PRINT_D'", "'\"'", "'_'", "'def'", 
		"'PROGRAM'", "'GLOBAL VARS:'", "'{'", "'RETURN'", "'}'", "'MAIN'", "'CALL'", 
		"'FUNCVAR'", null, null, null, "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "PROGRAM", "VAR", "BEGIN", "RETURN", "END", "MAIN", "CALL", 
		"FUNCVAR", "IDENTIFIER", "INTEGER", "FLOAT", "MUL_OP", "DIV_OP", "ADD_OP", 
		"SUB_OP", "LineComment", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Business.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BusinessParser(TokenStream input) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			header();
			setState(97);
			mainBlock();
			setState(98);
			match(T__0);
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
		public TerminalNode PROGRAM() { return getToken(BusinessParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BusinessParser.IDENTIFIER, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(PROGRAM);
			setState(101);
			match(IDENTIFIER);
			setState(102);
			match(T__1);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			declarations();
			setState(107);
			main();
			setState(108);
			compoundStmt();
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(BusinessParser.MAIN, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(MAIN);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			declList();
			setState(113);
			match(T__1);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclListContext declList() throws RecognitionException {
		DeclListContext _localctx = new DeclListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			decl();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					match(T__1);
					setState(117);
					decl();
					}
					} 
				}
				setState(122);
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
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				varList();
				setState(124);
				match(T__2);
				setState(125);
				typeId();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				functionDeclaration();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			varId();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(131);
				match(T__3);
				setState(132);
				varId();
				}
				}
				setState(137);
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
		public TerminalNode IDENTIFIER() { return getToken(BusinessParser.IDENTIFIER, 0); }
		public VarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitVarId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIdContext varId() throws RecognitionException {
		VarIdContext _localctx = new VarIdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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

	public static class FuncIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BusinessParser.IDENTIFIER, 0); }
		public FuncIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFuncId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncIdContext funcId() throws RecognitionException {
		FuncIdContext _localctx = new FuncIdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		public TerminalNode IDENTIFIER() { return getToken(BusinessParser.IDENTIFIER, 0); }
		public TypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdContext typeId() throws RecognitionException {
		TypeIdContext _localctx = new TypeIdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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

	public static class CompoundStmtContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(BusinessParser.BEGIN, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode END() { return getToken(BusinessParser.END, 0); }
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitCompoundStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compoundStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(BEGIN);
			setState(145);
			stmtList();
			setState(146);
			match(END);
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

	public static class FuncCompoundStmtContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(BusinessParser.BEGIN, 0); }
		public FuncStmtListContext funcStmtList() {
			return getRuleContext(FuncStmtListContext.class,0);
		}
		public TerminalNode END() { return getToken(BusinessParser.END, 0); }
		public FuncCompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCompoundStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFuncCompoundStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCompoundStmtContext funcCompoundStmt() throws RecognitionException {
		FuncCompoundStmtContext _localctx = new FuncCompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcCompoundStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(BEGIN);
			setState(149);
			funcStmtList();
			setState(150);
			match(END);
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
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public FunctionAssignmentContext functionAssignment() {
			return getRuleContext(FunctionAssignmentContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public PrintStringStmtContext printStringStmt() {
			return getRuleContext(PrintStringStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				compoundStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				assignmentStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				printStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				returnStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				callStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				functionAssignment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(160);
				whileStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(161);
				printStringStmt();
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitStmtList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stmtList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			stmt();
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					match(T__1);
					setState(166);
					stmt();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(172);
			match(T__1);
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

	public static class FuncStmtListContext extends ParserRuleContext {
		public List<FuncStmtContext> funcStmt() {
			return getRuleContexts(FuncStmtContext.class);
		}
		public FuncStmtContext funcStmt(int i) {
			return getRuleContext(FuncStmtContext.class,i);
		}
		public FuncStmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcStmtList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFuncStmtList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncStmtListContext funcStmtList() throws RecognitionException {
		FuncStmtListContext _localctx = new FuncStmtListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcStmtList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			funcStmt();
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					match(T__1);
					setState(176);
					funcStmt();
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(182);
			match(T__1);
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

	public static class FuncStmtContext extends ParserRuleContext {
		public FuncAssignmentStmtContext funcAssignmentStmt() {
			return getRuleContext(FuncAssignmentStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public FuncVarContext funcVar() {
			return getRuleContext(FuncVarContext.class,0);
		}
		public FuncStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFuncStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncStmtContext funcStmt() throws RecognitionException {
		FuncStmtContext _localctx = new FuncStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcStmt);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				funcAssignmentStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				printStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				returnStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				funcVar();
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

	public static class FuncAssignmentStmtContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FuncVarContext funcVar() {
			return getRuleContext(FuncVarContext.class,0);
		}
		public FuncExprContext funcExpr() {
			return getRuleContext(FuncExprContext.class,0);
		}
		public FuncAssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcAssignmentStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFuncAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncAssignmentStmtContext funcAssignmentStmt() throws RecognitionException {
		FuncAssignmentStmtContext _localctx = new FuncAssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcAssignmentStmt);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				variable();
				setState(191);
				match(T__4);
				setState(192);
				funcVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				funcExpr();
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

	public static class FuncExprContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public FuncExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncExprContext funcExpr() throws RecognitionException {
		FuncExprContext _localctx = new FuncExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcExpr);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				variable();
				}
				break;
			case INTEGER:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				number();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			variable();
			setState(202);
			match(T__4);
			setState(203);
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
		public TerminalNode IDENTIFIER() { return getToken(BusinessParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
	public static class StringExprContext extends ExprContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExprContext extends ExprContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitVariableExpr(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsignedNumberExprContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public UnsignedNumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitUnsignedNumberExpr(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignedNumberExprContext extends ExprContext {
		public SignedNumberContext signedNumber() {
			return getRuleContext(SignedNumberContext.class,0);
		}
		public SignedNumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitSignedNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public CompareExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitCompareExpr(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
				{
				_localctx = new UnsignedNumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(208);
				number();
				}
				break;
			case ADD_OP:
			case SUB_OP:
				{
				_localctx = new SignedNumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				signedNumber();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				variable();
				}
				break;
			case T__22:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				string();
				}
				break;
			case T__5:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(T__5);
				setState(213);
				expr(0);
				setState(214);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(219);
						mulDivOp();
						setState(220);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(223);
						addSubOp();
						setState(224);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(227);
						compareOp();
						setState(228);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class CompareOpContext extends ParserRuleContext {
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitCompareOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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

	public static class MulDivOpContext extends ParserRuleContext {
		public TerminalNode MUL_OP() { return getToken(BusinessParser.MUL_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(BusinessParser.DIV_OP, 0); }
		public MulDivOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitMulDivOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivOpContext mulDivOp() throws RecognitionException {
		MulDivOpContext _localctx = new MulDivOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		public TerminalNode ADD_OP() { return getToken(BusinessParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(BusinessParser.SUB_OP, 0); }
		public AddSubOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitAddSubOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubOpContext addSubOp() throws RecognitionException {
		AddSubOpContext _localctx = new AddSubOpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitSignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedNumberContext signedNumber() throws RecognitionException {
		SignedNumberContext _localctx = new SignedNumberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_signedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			sign();
			setState(242);
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
		public TerminalNode ADD_OP() { return getToken(BusinessParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(BusinessParser.SUB_OP, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		public TerminalNode FLOAT() { return getToken(BusinessParser.FLOAT, 0); }
		public FloatConstContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFloatConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerConstContext extends NumberContext {
		public TerminalNode INTEGER() { return getToken(BusinessParser.INTEGER, 0); }
		public IntegerConstContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitIntegerConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_number);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__14);
			setState(251);
			expr(0);
			setState(252);
			match(T__15);
			setState(253);
			stmt();
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(254);
				match(T__16);
				setState(255);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BusinessParser.INTEGER, 0); }
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__17);
			setState(259);
			match(T__5);
			setState(260);
			match(INTEGER);
			setState(261);
			match(T__6);
			setState(262);
			compoundStmt();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__18);
			setState(265);
			match(T__5);
			setState(266);
			expr(0);
			setState(267);
			match(T__6);
			setState(268);
			compoundStmt();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FuncIdContext funcId() {
			return getRuleContext(FuncIdContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(BusinessParser.IDENTIFIER, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public FuncMainContext funcMain() {
			return getRuleContext(FuncMainContext.class,0);
		}
		public FuncCompoundStmtContext funcCompoundStmt() {
			return getRuleContext(FuncCompoundStmtContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			function();
			setState(271);
			funcId();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(272);
				formalParameterList();
				}
			}

			setState(275);
			match(T__2);
			setState(276);
			match(IDENTIFIER);
			setState(277);
			match(T__1);
			setState(278);
			decl();
			setState(279);
			match(T__1);
			setState(280);
			funcMain();
			setState(281);
			funcCompoundStmt();
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BusinessParser.RETURN, 0); }
		public FuncVarContext funcVar() {
			return getRuleContext(FuncVarContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(RETURN);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCVAR || _la==IDENTIFIER) {
				{
				setState(284);
				funcVar();
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<ParameterGroupContext> parameterGroup() {
			return getRuleContexts(ParameterGroupContext.class);
		}
		public ParameterGroupContext parameterGroup(int i) {
			return getRuleContext(ParameterGroupContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__5);
			setState(288);
			parameterGroup();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(289);
				match(T__1);
				setState(290);
				parameterGroup();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
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

	public static class ParameterGroupContext extends ParserRuleContext {
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitParameterGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			varList();
			setState(299);
			match(T__2);
			setState(300);
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

	public static class CallStmtContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(BusinessParser.CALL, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_callStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(CALL);
			setState(303);
			functionDesignator();
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

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BusinessParser.IDENTIFIER, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFunctionDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(IDENTIFIER);
			setState(306);
			match(T__5);
			setState(307);
			parameterList();
			setState(308);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			actualParameter();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(311);
				match(T__3);
				setState(312);
				actualParameter();
				}
				}
				setState(317);
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

	public static class ActualParameterContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitActualParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_actualParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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

	public static class FuncVarContext extends ParserRuleContext {
		public TerminalNode FUNCVAR() { return getToken(BusinessParser.FUNCVAR, 0); }
		public TerminalNode INTEGER() { return getToken(BusinessParser.INTEGER, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FuncVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFuncVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncVarContext funcVar() throws RecognitionException {
		FuncVarContext _localctx = new FuncVarContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_funcVar);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(FUNCVAR);
				setState(321);
				match(INTEGER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				variable();
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

	public static class PrintStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__19);
			setState(326);
			match(T__5);
			setState(327);
			expr(0);
			setState(328);
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

	public static class PrintStringStmtContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PrintStringStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStringStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitPrintStringStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStringStmtContext printStringStmt() throws RecognitionException {
		PrintStringStmtContext _localctx = new PrintStringStmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_printStringStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__20);
			setState(331);
			match(T__5);
			setState(332);
			string();
			setState(333);
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

	public static class PrintDoubleStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintDoubleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printDoubleStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitPrintDoubleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintDoubleStmtContext printDoubleStmt() throws RecognitionException {
		PrintDoubleStmtContext _localctx = new PrintDoubleStmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_printDoubleStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__21);
			setState(336);
			match(T__5);
			setState(337);
			expr(0);
			setState(338);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(BusinessParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BusinessParser.IDENTIFIER, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__22);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23 || _la==IDENTIFIER) {
				{
				{
				setState(341);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			match(T__22);
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

	public static class FunctionAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BusinessParser.IDENTIFIER, 0); }
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public FunctionAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFunctionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionAssignmentContext functionAssignment() throws RecognitionException {
		FunctionAssignmentContext _localctx = new FunctionAssignmentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(IDENTIFIER);
			setState(350);
			match(T__10);
			setState(351);
			callStmt();
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

	public static class FuncMainContext extends ParserRuleContext {
		public FuncMainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcMain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFuncMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncMainContext funcMain() throws RecognitionException {
		FuncMainContext _localctx = new FuncMainContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_funcMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(MAIN);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessVisitor ) return ((BusinessVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__24);
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
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0168\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\7\by\n\b"+
		"\f\b\16\b|\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t\3\n\3\n\3\n\7\n\u0088"+
		"\n\n\f\n\16\n\u008b\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00a5\n\20\3\21\3\21\3\21\7\21\u00aa\n\21\f\21\16\21\u00ad\13\21"+
		"\3\21\3\21\3\22\3\22\3\22\7\22\u00b4\n\22\f\22\16\22\u00b7\13\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\5\23\u00bf\n\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00c6\n\24\3\25\3\25\5\25\u00ca\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00db\n\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00e9\n\30\f\30"+
		"\16\30\u00ec\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\5\36\u00fb\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0103"+
		"\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\5\"\u0114\n\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\5#\u0120\n#\3$\3$\3$\3$\7$\u0126"+
		"\n$\f$\16$\u0129\13$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\7(\u013c\n(\f(\16(\u013f\13(\3)\3)\3*\3*\3*\5*\u0146\n*\3+\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\7.\u0159\n.\f.\16.\u015c"+
		"\13.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\2\3.\62\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2"+
		"\6\3\2\n\20\3\2\'(\3\2)*\4\2\32\32$$\2\u0159\2b\3\2\2\2\4f\3\2\2\2\6j"+
		"\3\2\2\2\bl\3\2\2\2\np\3\2\2\2\fr\3\2\2\2\16u\3\2\2\2\20\u0082\3\2\2\2"+
		"\22\u0084\3\2\2\2\24\u008c\3\2\2\2\26\u008e\3\2\2\2\30\u0090\3\2\2\2\32"+
		"\u0092\3\2\2\2\34\u0096\3\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2\2\2\"\u00b0"+
		"\3\2\2\2$\u00be\3\2\2\2&\u00c5\3\2\2\2(\u00c9\3\2\2\2*\u00cb\3\2\2\2,"+
		"\u00cf\3\2\2\2.\u00da\3\2\2\2\60\u00ed\3\2\2\2\62\u00ef\3\2\2\2\64\u00f1"+
		"\3\2\2\2\66\u00f3\3\2\2\28\u00f6\3\2\2\2:\u00fa\3\2\2\2<\u00fc\3\2\2\2"+
		">\u0104\3\2\2\2@\u010a\3\2\2\2B\u0110\3\2\2\2D\u011d\3\2\2\2F\u0121\3"+
		"\2\2\2H\u012c\3\2\2\2J\u0130\3\2\2\2L\u0133\3\2\2\2N\u0138\3\2\2\2P\u0140"+
		"\3\2\2\2R\u0145\3\2\2\2T\u0147\3\2\2\2V\u014c\3\2\2\2X\u0151\3\2\2\2Z"+
		"\u0156\3\2\2\2\\\u015f\3\2\2\2^\u0163\3\2\2\2`\u0165\3\2\2\2bc\5\4\3\2"+
		"cd\5\6\4\2de\7\3\2\2e\3\3\2\2\2fg\7\34\2\2gh\7$\2\2hi\7\4\2\2i\5\3\2\2"+
		"\2jk\5\b\5\2k\7\3\2\2\2lm\5\f\7\2mn\5\n\6\2no\5\32\16\2o\t\3\2\2\2pq\7"+
		"!\2\2q\13\3\2\2\2rs\5\16\b\2st\7\4\2\2t\r\3\2\2\2uz\5\20\t\2vw\7\4\2\2"+
		"wy\5\20\t\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2\2\2|z\3\2"+
		"\2\2}~\5\22\n\2~\177\7\5\2\2\177\u0080\5\30\r\2\u0080\u0083\3\2\2\2\u0081"+
		"\u0083\5B\"\2\u0082}\3\2\2\2\u0082\u0081\3\2\2\2\u0083\21\3\2\2\2\u0084"+
		"\u0089\5\24\13\2\u0085\u0086\7\6\2\2\u0086\u0088\5\24\13\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\23\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7$\2\2\u008d\25\3\2\2\2\u008e"+
		"\u008f\7$\2\2\u008f\27\3\2\2\2\u0090\u0091\7$\2\2\u0091\31\3\2\2\2\u0092"+
		"\u0093\7\36\2\2\u0093\u0094\5 \21\2\u0094\u0095\7 \2\2\u0095\33\3\2\2"+
		"\2\u0096\u0097\7\36\2\2\u0097\u0098\5\"\22\2\u0098\u0099\7 \2\2\u0099"+
		"\35\3\2\2\2\u009a\u00a5\5\32\16\2\u009b\u00a5\5*\26\2\u009c\u00a5\5<\37"+
		"\2\u009d\u00a5\5> \2\u009e\u00a5\5T+\2\u009f\u00a5\5D#\2\u00a0\u00a5\5"+
		"J&\2\u00a1\u00a5\5\\/\2\u00a2\u00a5\5@!\2\u00a3\u00a5\5V,\2\u00a4\u009a"+
		"\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u009c\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4"+
		"\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00ab"+
		"\5\36\20\2\u00a7\u00a8\7\4\2\2\u00a8\u00aa\5\36\20\2\u00a9\u00a7\3\2\2"+
		"\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\4\2\2\u00af!\3\2\2\2\u00b0"+
		"\u00b5\5$\23\2\u00b1\u00b2\7\4\2\2\u00b2\u00b4\5$\23\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\4\2\2\u00b9#\3\2\2\2"+
		"\u00ba\u00bf\5&\24\2\u00bb\u00bf\5T+\2\u00bc\u00bf\5D#\2\u00bd\u00bf\5"+
		"R*\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf%\3\2\2\2\u00c0\u00c1\5,\27\2\u00c1\u00c2\7\7\2\2"+
		"\u00c2\u00c3\5R*\2\u00c3\u00c6\3\2\2\2\u00c4\u00c6\5(\25\2\u00c5\u00c0"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\'\3\2\2\2\u00c7\u00ca\5,\27\2\u00c8"+
		"\u00ca\5:\36\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca)\3\2\2\2"+
		"\u00cb\u00cc\5,\27\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce\5.\30\2\u00ce+\3"+
		"\2\2\2\u00cf\u00d0\7$\2\2\u00d0-\3\2\2\2\u00d1\u00d2\b\30\1\2\u00d2\u00db"+
		"\5:\36\2\u00d3\u00db\5\66\34\2\u00d4\u00db\5,\27\2\u00d5\u00db\5Z.\2\u00d6"+
		"\u00d7\7\b\2\2\u00d7\u00d8\5.\30\2\u00d8\u00d9\7\t\2\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d1\3\2\2\2\u00da\u00d3\3\2\2\2\u00da\u00d4\3\2\2\2\u00da"+
		"\u00d5\3\2\2\2\u00da\u00d6\3\2\2\2\u00db\u00ea\3\2\2\2\u00dc\u00dd\f\n"+
		"\2\2\u00dd\u00de\5\62\32\2\u00de\u00df\5.\30\13\u00df\u00e9\3\2\2\2\u00e0"+
		"\u00e1\f\t\2\2\u00e1\u00e2\5\64\33\2\u00e2\u00e3\5.\30\n\u00e3\u00e9\3"+
		"\2\2\2\u00e4\u00e5\f\4\2\2\u00e5\u00e6\5\60\31\2\u00e6\u00e7\5.\30\5\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00dc\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e4\3\2"+
		"\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"/\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\t\2\2\2\u00ee\61\3\2\2\2\u00ef"+
		"\u00f0\t\3\2\2\u00f0\63\3\2\2\2\u00f1\u00f2\t\4\2\2\u00f2\65\3\2\2\2\u00f3"+
		"\u00f4\58\35\2\u00f4\u00f5\5:\36\2\u00f5\67\3\2\2\2\u00f6\u00f7\t\4\2"+
		"\2\u00f79\3\2\2\2\u00f8\u00fb\7%\2\2\u00f9\u00fb\7&\2\2\u00fa\u00f8\3"+
		"\2\2\2\u00fa\u00f9\3\2\2\2\u00fb;\3\2\2\2\u00fc\u00fd\7\21\2\2\u00fd\u00fe"+
		"\5.\30\2\u00fe\u00ff\7\22\2\2\u00ff\u0102\5\36\20\2\u0100\u0101\7\23\2"+
		"\2\u0101\u0103\5\36\20\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"=\3\2\2\2\u0104\u0105\7\24\2\2\u0105\u0106\7\b\2\2\u0106\u0107\7%\2\2"+
		"\u0107\u0108\7\t\2\2\u0108\u0109\5\32\16\2\u0109?\3\2\2\2\u010a\u010b"+
		"\7\25\2\2\u010b\u010c\7\b\2\2\u010c\u010d\5.\30\2\u010d\u010e\7\t\2\2"+
		"\u010e\u010f\5\32\16\2\u010fA\3\2\2\2\u0110\u0111\5`\61\2\u0111\u0113"+
		"\5\26\f\2\u0112\u0114\5F$\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\7\5\2\2\u0116\u0117\7$\2\2\u0117\u0118\7\4"+
		"\2\2\u0118\u0119\5\20\t\2\u0119\u011a\7\4\2\2\u011a\u011b\5^\60\2\u011b"+
		"\u011c\5\34\17\2\u011cC\3\2\2\2\u011d\u011f\7\37\2\2\u011e\u0120\5R*\2"+
		"\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120E\3\2\2\2\u0121\u0122\7"+
		"\b\2\2\u0122\u0127\5H%\2\u0123\u0124\7\4\2\2\u0124\u0126\5H%\2\u0125\u0123"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\t\2\2\u012bG\3\2\2\2"+
		"\u012c\u012d\5\22\n\2\u012d\u012e\7\5\2\2\u012e\u012f\5\30\r\2\u012fI"+
		"\3\2\2\2\u0130\u0131\7\"\2\2\u0131\u0132\5L\'\2\u0132K\3\2\2\2\u0133\u0134"+
		"\7$\2\2\u0134\u0135\7\b\2\2\u0135\u0136\5N(\2\u0136\u0137\7\t\2\2\u0137"+
		"M\3\2\2\2\u0138\u013d\5P)\2\u0139\u013a\7\6\2\2\u013a\u013c\5P)\2\u013b"+
		"\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013eO\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\5.\30\2\u0141Q\3\2"+
		"\2\2\u0142\u0143\7#\2\2\u0143\u0146\7%\2\2\u0144\u0146\5,\27\2\u0145\u0142"+
		"\3\2\2\2\u0145\u0144\3\2\2\2\u0146S\3\2\2\2\u0147\u0148\7\26\2\2\u0148"+
		"\u0149\7\b\2\2\u0149\u014a\5.\30\2\u014a\u014b\7\t\2\2\u014bU\3\2\2\2"+
		"\u014c\u014d\7\27\2\2\u014d\u014e\7\b\2\2\u014e\u014f\5Z.\2\u014f\u0150"+
		"\7\t\2\2\u0150W\3\2\2\2\u0151\u0152\7\30\2\2\u0152\u0153\7\b\2\2\u0153"+
		"\u0154\5.\30\2\u0154\u0155\7\t\2\2\u0155Y\3\2\2\2\u0156\u015a\7\31\2\2"+
		"\u0157\u0159\t\5\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u015e\7\31\2\2\u015e[\3\2\2\2\u015f\u0160\7$\2\2\u0160\u0161\7\r\2\2"+
		"\u0161\u0162\5J&\2\u0162]\3\2\2\2\u0163\u0164\7!\2\2\u0164_\3\2\2\2\u0165"+
		"\u0166\7\33\2\2\u0166a\3\2\2\2\26z\u0082\u0089\u00a4\u00ab\u00b5\u00be"+
		"\u00c5\u00c9\u00da\u00e8\u00ea\u00fa\u0102\u0113\u011f\u0127\u013d\u0145"+
		"\u015a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}