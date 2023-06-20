// Generated from E:/ANTRL4_PROJECTS/CSE425_Report\BanglaGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BanglaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, TOKEN_PurnoShongkha=22, TOKEN_Ashol=23, 
		TOKEN_Jodi=24, TOKEN_Operator=25, TOKEN_Symbol=26, RESERVED_Or=27, RESERVED_Ashol=28, 
		RESERVED_Evong=29, RESERVED_Jokhon=30, RESERVED_Jodi=31, RESERVED_Input=32, 
		RESERVED_Chapao=33, RESERVED_Function=34, RESERVED_TYPE=35, Identifier=36, 
		INTEGER=37, DECIMAL=38, STRING=39, WS=40, LINE_COMMENT=41, MULTILINE_COMMENT=42;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignmentStatement = 2, RULE_calculationStatement = 3, 
		RULE_conditionalStatement = 4, RULE_functionCallStatement = 5, RULE_arguments = 6, 
		RULE_block = 7, RULE_expression = 8, RULE_logicalExpression = 9, RULE_relationalExpression = 10, 
		RULE_additiveExpression = 11, RULE_multiplicativeExpression = 12, RULE_unaryExpression = 13, 
		RULE_primaryExpression = 14, RULE_literal = 15, RULE_identifier = 16, 
		RULE_comparisonOperator = 17, RULE_arithmeticExpression = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignmentStatement", "calculationStatement", 
			"conditionalStatement", "functionCallStatement", "arguments", "block", 
			"expression", "logicalExpression", "relationalExpression", "additiveExpression", 
			"multiplicativeExpression", "unaryExpression", "primaryExpression", "literal", 
			"identifier", "comparisonOperator", "arithmeticExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'('", "')'", "','", "'{'", "'}'", "'!'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'\\u09AA\\u09C2\\u09B0\\u09CD\\u09A3\\u09B8\\u0982\\u0996\\u09CD\\u09AF\\u09BE'", 
			null, null, "'operator'", "'symbols'", "'\\u0985\\u09A5\\u09AC\\u09BE'", 
			null, "'\\u098F\\u09AC\\u0982'", "'\\u09AF\\u0996\\u09A8'", null, "'\\u0987\\u09A8\\u09AA\\u09C1\\u099F'", 
			"'\\u099B\\u09BE\\u09AA\\u09BE\\u0993'", "'\\u09AB\\u09BE\\u0999\\u09CD\\u0995\\u09B6\\u09A8'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "TOKEN_PurnoShongkha", 
			"TOKEN_Ashol", "TOKEN_Jodi", "TOKEN_Operator", "TOKEN_Symbol", "RESERVED_Or", 
			"RESERVED_Ashol", "RESERVED_Evong", "RESERVED_Jokhon", "RESERVED_Jodi", 
			"RESERVED_Input", "RESERVED_Chapao", "RESERVED_Function", "RESERVED_TYPE", 
			"Identifier", "INTEGER", "DECIMAL", "STRING", "WS", "LINE_COMMENT", "MULTILINE_COMMENT"
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
	public String getGrammarFileName() { return "BanglaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BanglaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 53687091200L) != 0) );
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
	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public CalculationStatementContext calculationStatement() {
			return getRuleContext(CalculationStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				calculationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				conditionalStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				functionCallStatement();
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode RESERVED_TYPE() { return getToken(BanglaGrammarParser.RESERVED_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(RESERVED_TYPE);
			setState(50);
			identifier();
			setState(51);
			match(T__0);
			setState(52);
			expression();
			setState(53);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CalculationStatementContext extends ParserRuleContext {
		public TerminalNode RESERVED_TYPE() { return getToken(BanglaGrammarParser.RESERVED_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public CalculationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterCalculationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitCalculationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitCalculationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculationStatementContext calculationStatement() throws RecognitionException {
		CalculationStatementContext _localctx = new CalculationStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_calculationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(RESERVED_TYPE);
			setState(56);
			identifier();
			setState(57);
			match(T__0);
			setState(58);
			arithmeticExpression();
			setState(59);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalStatementContext extends ParserRuleContext {
		public TerminalNode RESERVED_Jodi() { return getToken(BanglaGrammarParser.RESERVED_Jodi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode RESERVED_Or() { return getToken(BanglaGrammarParser.RESERVED_Or, 0); }
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(RESERVED_Jodi);
			setState(62);
			match(T__2);
			setState(63);
			expression();
			setState(64);
			match(T__3);
			setState(65);
			block();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESERVED_Or) {
				{
				setState(66);
				match(RESERVED_Or);
				setState(67);
				block();
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
	public static class FunctionCallStatementContext extends ParserRuleContext {
		public TerminalNode RESERVED_Function() { return getToken(BanglaGrammarParser.RESERVED_Function, 0); }
		public TerminalNode Identifier() { return getToken(BanglaGrammarParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCallStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(RESERVED_Function);
			setState(71);
			match(Identifier);
			setState(72);
			match(T__2);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792200456L) != 0)) {
				{
				setState(73);
				arguments();
				}
			}

			setState(76);
			match(T__3);
			setState(77);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			expression();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(80);
				match(T__4);
				setState(81);
				expression();
				}
				}
				setState(86);
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__5);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53687091200L) != 0)) {
				{
				{
				setState(88);
				statement();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			logicalExpression(0);
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
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode RESERVED_Evong() { return getToken(BanglaGrammarParser.RESERVED_Evong, 0); }
		public TerminalNode RESERVED_Or() { return getToken(BanglaGrammarParser.RESERVED_Or, 0); }
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_logicalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(99);
				match(T__2);
				setState(100);
				logicalExpression(0);
				setState(101);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(103);
				match(T__7);
				setState(104);
				logicalExpression(2);
				}
				break;
			case 3:
				{
				setState(105);
				relationalExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
					setState(108);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(109);
					_la = _input.LA(1);
					if ( !(_la==RESERVED_Or || _la==RESERVED_Evong) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(110);
					logicalExpression(5);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relationalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			additiveExpression(0);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(117);
				comparisonOperator();
				setState(118);
				additiveExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_additiveExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(123);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(125);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(126);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==T__9) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(127);
					multiplicativeExpression(0);
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_multiplicativeExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(134);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(136);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(137);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(138);
					unaryExpression();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryExpression);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case Identifier:
			case INTEGER:
			case DECIMAL:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				primaryExpression();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__13);
				setState(146);
				primaryExpression();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(T__14);
				setState(148);
				primaryExpression();
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primaryExpression);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DECIMAL:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				identifier();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(T__2);
				setState(154);
				expression();
				setState(155);
				match(T__3);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BanglaGrammarParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(BanglaGrammarParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(BanglaGrammarParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BanglaGrammarParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(Identifier);
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
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
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
	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BanglaGrammarListener ) ((BanglaGrammarListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BanglaGrammarVisitor ) return ((BanglaGrammarVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arithmeticExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			additiveExpression(0);
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
		case 9:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		case 11:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 12:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u00a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004E\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005K\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006S\b\u0006\n\u0006\f\u0006V\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0005\u0007Z\b\u0007\n\u0007\f\u0007]\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tk\b\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\tp\b\t\n\t\f\ts\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\ny\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0081\b\u000b\n\u000b\f\u000b\u0084\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u008c\b\f\n\f\f\f\u008f\t\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0096\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009e\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0003\u0012\u0016\u0018\u0013"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$\u0000\u0005\u0002\u0000\u001b\u001b\u001d\u001d\u0001"+
		"\u0000\t\n\u0001\u0000\u000b\r\u0001\u0000%\'\u0001\u0000\u0010\u0015"+
		"\u00a6\u0000\'\u0001\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000"+
		"\u00041\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b=\u0001"+
		"\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000\fO\u0001\u0000\u0000\u0000"+
		"\u000eW\u0001\u0000\u0000\u0000\u0010`\u0001\u0000\u0000\u0000\u0012j"+
		"\u0001\u0000\u0000\u0000\u0014t\u0001\u0000\u0000\u0000\u0016z\u0001\u0000"+
		"\u0000\u0000\u0018\u0085\u0001\u0000\u0000\u0000\u001a\u0095\u0001\u0000"+
		"\u0000\u0000\u001c\u009d\u0001\u0000\u0000\u0000\u001e\u009f\u0001\u0000"+
		"\u0000\u0000 \u00a1\u0001\u0000\u0000\u0000\"\u00a3\u0001\u0000\u0000"+
		"\u0000$\u00a5\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000\'&\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*\u0001\u0001\u0000\u0000\u0000+0\u0003\u0004"+
		"\u0002\u0000,0\u0003\u0006\u0003\u0000-0\u0003\b\u0004\u0000.0\u0003\n"+
		"\u0005\u0000/+\u0001\u0000\u0000\u0000/,\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\u0003\u0001\u0000\u0000"+
		"\u000012\u0005#\u0000\u000023\u0003 \u0010\u000034\u0005\u0001\u0000\u0000"+
		"45\u0003\u0010\b\u000056\u0005\u0002\u0000\u00006\u0005\u0001\u0000\u0000"+
		"\u000078\u0005#\u0000\u000089\u0003 \u0010\u00009:\u0005\u0001\u0000\u0000"+
		":;\u0003$\u0012\u0000;<\u0005\u0002\u0000\u0000<\u0007\u0001\u0000\u0000"+
		"\u0000=>\u0005\u001f\u0000\u0000>?\u0005\u0003\u0000\u0000?@\u0003\u0010"+
		"\b\u0000@A\u0005\u0004\u0000\u0000AD\u0003\u000e\u0007\u0000BC\u0005\u001b"+
		"\u0000\u0000CE\u0003\u000e\u0007\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000E\t\u0001\u0000\u0000\u0000FG\u0005\"\u0000\u0000GH"+
		"\u0005$\u0000\u0000HJ\u0005\u0003\u0000\u0000IK\u0003\f\u0006\u0000JI"+
		"\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0005\u0004\u0000\u0000MN\u0003\u000e\u0007\u0000N\u000b\u0001"+
		"\u0000\u0000\u0000OT\u0003\u0010\b\u0000PQ\u0005\u0005\u0000\u0000QS\u0003"+
		"\u0010\b\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\r\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000W[\u0005\u0006\u0000\u0000XZ\u0003\u0002\u0001"+
		"\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000^_\u0005\u0007\u0000\u0000_\u000f\u0001\u0000\u0000"+
		"\u0000`a\u0003\u0012\t\u0000a\u0011\u0001\u0000\u0000\u0000bc\u0006\t"+
		"\uffff\uffff\u0000cd\u0005\u0003\u0000\u0000de\u0003\u0012\t\u0000ef\u0005"+
		"\u0004\u0000\u0000fk\u0001\u0000\u0000\u0000gh\u0005\b\u0000\u0000hk\u0003"+
		"\u0012\t\u0002ik\u0003\u0014\n\u0000jb\u0001\u0000\u0000\u0000jg\u0001"+
		"\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000kq\u0001\u0000\u0000\u0000"+
		"lm\n\u0004\u0000\u0000mn\u0007\u0000\u0000\u0000np\u0003\u0012\t\u0005"+
		"ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000r\u0013\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000tx\u0003\u0016\u000b\u0000uv\u0003\"\u0011\u0000vw\u0003"+
		"\u0016\u000b\u0000wy\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y\u0015\u0001\u0000\u0000\u0000z{\u0006\u000b"+
		"\uffff\uffff\u0000{|\u0003\u0018\f\u0000|\u0082\u0001\u0000\u0000\u0000"+
		"}~\n\u0002\u0000\u0000~\u007f\u0007\u0001\u0000\u0000\u007f\u0081\u0003"+
		"\u0018\f\u0000\u0080}\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0017\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0006\f\uffff\uffff\u0000\u0086\u0087\u0003\u001a"+
		"\r\u0000\u0087\u008d\u0001\u0000\u0000\u0000\u0088\u0089\n\u0002\u0000"+
		"\u0000\u0089\u008a\u0007\u0002\u0000\u0000\u008a\u008c\u0003\u001a\r\u0000"+
		"\u008b\u0088\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0019\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u0090\u0096\u0003\u001c\u000e\u0000\u0091\u0092\u0005\u000e\u0000\u0000"+
		"\u0092\u0096\u0003\u001c\u000e\u0000\u0093\u0094\u0005\u000f\u0000\u0000"+
		"\u0094\u0096\u0003\u001c\u000e\u0000\u0095\u0090\u0001\u0000\u0000\u0000"+
		"\u0095\u0091\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u001b\u0001\u0000\u0000\u0000\u0097\u009e\u0003\u001e\u000f\u0000"+
		"\u0098\u009e\u0003 \u0010\u0000\u0099\u009a\u0005\u0003\u0000\u0000\u009a"+
		"\u009b\u0003\u0010\b\u0000\u009b\u009c\u0005\u0004\u0000\u0000\u009c\u009e"+
		"\u0001\u0000\u0000\u0000\u009d\u0097\u0001\u0000\u0000\u0000\u009d\u0098"+
		"\u0001\u0000\u0000\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009e\u001d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0007\u0003\u0000\u0000\u00a0\u001f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005$\u0000\u0000\u00a2!\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0007\u0004\u0000\u0000\u00a4#\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0003\u0016\u000b\u0000\u00a6%\u0001\u0000\u0000\u0000"+
		"\r)/DJT[jqx\u0082\u008d\u0095\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}