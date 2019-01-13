// Generated from MathGrammar.g4 by ANTLR 4.7.2
package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, PLUS=2, MINUS=3, SLASH=4, ASTERIKS=5, POWER=6, SIN=7, COS=8, 
		TAN=9, ASIN=10, ACOS=11, ATAN=12, LOG=13, LG=14, LOG2=15, LN=16, VARIABLE=17, 
		COMA=18, LEFT_BRACKET=19, RIGHT_BRACKET=20;
	public static final int
		RULE_start = 0, RULE_expression = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "PLUS", "MINUS", "SLASH", "ASTERIKS", "POWER", "SIN", 
			"COS", "TAN", "ASIN", "ACOS", "ATAN", "LOG", "LG", "LOG2", "LN", "VARIABLE", 
			"COMA", "LEFT_BRACKET", "RIGHT_BRACKET"
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
	public String getGrammarFileName() { return "MathGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MathGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MathGrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expression(0);
			setState(5);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TanContext extends ExpressionContext {
		public TerminalNode TAN() { return getToken(MathGrammarParser.TAN, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MathGrammarParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MathGrammarParser.RIGHT_BRACKET, 0); }
		public TanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitTan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LnContext extends ExpressionContext {
		public TerminalNode LN() { return getToken(MathGrammarParser.LN, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MathGrammarParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MathGrammarParser.RIGHT_BRACKET, 0); }
		public LnContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitLn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogContext extends ExpressionContext {
		public TerminalNode LOG() { return getToken(MathGrammarParser.LOG, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MathGrammarParser.LEFT_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMA() { return getToken(MathGrammarParser.COMA, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MathGrammarParser.RIGHT_BRACKET, 0); }
		public LogContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosContext extends ExpressionContext {
		public TerminalNode COS() { return getToken(MathGrammarParser.COS, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MathGrammarParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MathGrammarParser.RIGHT_BRACKET, 0); }
		public CosContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(MathGrammarParser.MINUS, 0); }
		public SubtractionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AcosContext extends ExpressionContext {
		public TerminalNode ACOS() { return getToken(MathGrammarParser.ACOS, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MathGrammarParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MathGrammarParser.RIGHT_BRACKET, 0); }
		public AcosContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitAcos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketExpressionContext extends ExpressionContext {
		public TerminalNode LEFT_BRACKET() { return getToken(MathGrammarParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MathGrammarParser.RIGHT_BRACKET, 0); }
		public BracketExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtanContext extends ExpressionContext {
		public TerminalNode ATAN() { return getToken(MathGrammarParser.ATAN, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MathGrammarParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MathGrammarParser.RIGHT_BRACKET, 0); }
		public AtanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitAtan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(MathGrammarParser.SLASH, 0); }
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(MathGrammarParser.NUMBER, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReverseSignContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(MathGrammarParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReverseSignContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitReverseSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public TerminalNode VARIABLE() { return getToken(MathGrammarParser.VARIABLE, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinContext extends ExpressionContext {
		public TerminalNode SIN() { return getToken(MathGrammarParser.SIN, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MathGrammarParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MathGrammarParser.RIGHT_BRACKET, 0); }
		public SinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsinContext extends ExpressionContext {
		public TerminalNode ASIN() { return getToken(MathGrammarParser.ASIN, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MathGrammarParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MathGrammarParser.RIGHT_BRACKET, 0); }
		public AsinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitAsin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LgContext extends ExpressionContext {
		public TerminalNode LG() { return getToken(MathGrammarParser.LG, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MathGrammarParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MathGrammarParser.RIGHT_BRACKET, 0); }
		public LgContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitLg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(MathGrammarParser.POWER, 0); }
		public PowerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASTERIKS() { return getToken(MathGrammarParser.ASTERIKS, 0); }
		public MultiplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Log2Context extends ExpressionContext {
		public TerminalNode LOG2() { return getToken(MathGrammarParser.LOG2, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MathGrammarParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MathGrammarParser.RIGHT_BRACKET, 0); }
		public Log2Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitLog2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MathGrammarParser.PLUS, 0); }
		public AdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
				{
				_localctx = new SinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(8);
				match(SIN);
				setState(9);
				match(LEFT_BRACKET);
				setState(10);
				expression(0);
				setState(11);
				match(RIGHT_BRACKET);
				}
				break;
			case COS:
				{
				_localctx = new CosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				match(COS);
				setState(14);
				match(LEFT_BRACKET);
				setState(15);
				expression(0);
				setState(16);
				match(RIGHT_BRACKET);
				}
				break;
			case TAN:
				{
				_localctx = new TanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				match(TAN);
				setState(19);
				match(LEFT_BRACKET);
				setState(20);
				expression(0);
				setState(21);
				match(RIGHT_BRACKET);
				}
				break;
			case ASIN:
				{
				_localctx = new AsinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				match(ASIN);
				setState(24);
				match(LEFT_BRACKET);
				setState(25);
				expression(0);
				setState(26);
				match(RIGHT_BRACKET);
				}
				break;
			case ACOS:
				{
				_localctx = new AcosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(ACOS);
				setState(29);
				match(LEFT_BRACKET);
				setState(30);
				expression(0);
				setState(31);
				match(RIGHT_BRACKET);
				}
				break;
			case ATAN:
				{
				_localctx = new AtanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(ATAN);
				setState(34);
				match(LEFT_BRACKET);
				setState(35);
				expression(0);
				setState(36);
				match(RIGHT_BRACKET);
				}
				break;
			case LOG:
				{
				_localctx = new LogContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(LOG);
				setState(39);
				match(LEFT_BRACKET);
				setState(40);
				expression(0);
				setState(41);
				match(COMA);
				setState(42);
				expression(0);
				setState(43);
				match(RIGHT_BRACKET);
				}
				break;
			case LG:
				{
				_localctx = new LgContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(LG);
				setState(46);
				match(LEFT_BRACKET);
				setState(47);
				expression(0);
				setState(48);
				match(RIGHT_BRACKET);
				}
				break;
			case LOG2:
				{
				_localctx = new Log2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(LOG2);
				setState(51);
				match(LEFT_BRACKET);
				setState(52);
				expression(0);
				setState(53);
				match(RIGHT_BRACKET);
				}
				break;
			case LN:
				{
				_localctx = new LnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(LN);
				setState(56);
				match(LEFT_BRACKET);
				setState(57);
				expression(0);
				setState(58);
				match(RIGHT_BRACKET);
				}
				break;
			case LEFT_BRACKET:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(LEFT_BRACKET);
				setState(61);
				expression(0);
				setState(62);
				match(RIGHT_BRACKET);
				}
				break;
			case MINUS:
				{
				_localctx = new ReverseSignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(MINUS);
				setState(65);
				expression(3);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(70);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(71);
						match(POWER);
						setState(72);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(73);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(74);
						match(ASTERIKS);
						setState(75);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(76);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(77);
						match(SLASH);
						setState(78);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(80);
						match(PLUS);
						setState(81);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(82);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(83);
						match(MINUS);
						setState(84);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26]\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13"+
		"\3\3\3\2\3\4\4\2\4\2\2\2l\2\6\3\2\2\2\4F\3\2\2\2\6\7\5\4\3\2\7\b\7\2\2"+
		"\3\b\3\3\2\2\2\t\n\b\3\1\2\n\13\7\t\2\2\13\f\7\25\2\2\f\r\5\4\3\2\r\16"+
		"\7\26\2\2\16G\3\2\2\2\17\20\7\n\2\2\20\21\7\25\2\2\21\22\5\4\3\2\22\23"+
		"\7\26\2\2\23G\3\2\2\2\24\25\7\13\2\2\25\26\7\25\2\2\26\27\5\4\3\2\27\30"+
		"\7\26\2\2\30G\3\2\2\2\31\32\7\f\2\2\32\33\7\25\2\2\33\34\5\4\3\2\34\35"+
		"\7\26\2\2\35G\3\2\2\2\36\37\7\r\2\2\37 \7\25\2\2 !\5\4\3\2!\"\7\26\2\2"+
		"\"G\3\2\2\2#$\7\16\2\2$%\7\25\2\2%&\5\4\3\2&\'\7\26\2\2\'G\3\2\2\2()\7"+
		"\17\2\2)*\7\25\2\2*+\5\4\3\2+,\7\24\2\2,-\5\4\3\2-.\7\26\2\2.G\3\2\2\2"+
		"/\60\7\20\2\2\60\61\7\25\2\2\61\62\5\4\3\2\62\63\7\26\2\2\63G\3\2\2\2"+
		"\64\65\7\21\2\2\65\66\7\25\2\2\66\67\5\4\3\2\678\7\26\2\28G\3\2\2\29:"+
		"\7\22\2\2:;\7\25\2\2;<\5\4\3\2<=\7\26\2\2=G\3\2\2\2>?\7\25\2\2?@\5\4\3"+
		"\2@A\7\26\2\2AG\3\2\2\2BC\7\5\2\2CG\5\4\3\5DG\7\3\2\2EG\7\23\2\2F\t\3"+
		"\2\2\2F\17\3\2\2\2F\24\3\2\2\2F\31\3\2\2\2F\36\3\2\2\2F#\3\2\2\2F(\3\2"+
		"\2\2F/\3\2\2\2F\64\3\2\2\2F9\3\2\2\2F>\3\2\2\2FB\3\2\2\2FD\3\2\2\2FE\3"+
		"\2\2\2GY\3\2\2\2HI\f\n\2\2IJ\7\b\2\2JX\5\4\3\nKL\f\t\2\2LM\7\7\2\2MX\5"+
		"\4\3\nNO\f\b\2\2OP\7\6\2\2PX\5\4\3\tQR\f\7\2\2RS\7\4\2\2SX\5\4\3\bTU\f"+
		"\6\2\2UV\7\5\2\2VX\5\4\3\7WH\3\2\2\2WK\3\2\2\2WN\3\2\2\2WQ\3\2\2\2WT\3"+
		"\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\5\3\2\2\2[Y\3\2\2\2\5FWY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}