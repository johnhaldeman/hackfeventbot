// Generated from HEQL.g4 by ANTLR 4.7
package org.hackf.discordeventbot.heql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HEQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, FORMAT=9, 
		HEQL=10, AND=11, OR=12, OPERATOR=13, DISTINCT=14, FROM=15, WHERE=16, EVENTS=17, 
		NEXT=18, SELECT=19, OBJECT=20, LITERAL=21, WS=22, UNEXPECTED_CHAR=23;
	public static final int
		RULE_message = 0, RULE_heql_block = 1, RULE_selectBase = 2, RULE_selectNext = 3, 
		RULE_selectDistinct = 4, RULE_condition = 5, RULE_logicalOr = 6, RULE_logicalAnd = 7, 
		RULE_leftParen = 8, RULE_rightParen = 9, RULE_selField = 10, RULE_condField = 11, 
		RULE_fieldList = 12, RULE_operator = 13, RULE_literal = 14, RULE_format = 15;
	public static final String[] ruleNames = {
		"message", "heql_block", "selectBase", "selectNext", "selectDistinct", 
		"condition", "logicalOr", "logicalAnd", "leftParen", "rightParen", "selField", 
		"condField", "fieldList", "operator", "literal", "format"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<?'", "'?>'", "'|'", "';'", "'('", "')'", "','", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "FORMAT", "HEQL", 
		"AND", "OR", "OPERATOR", "DISTINCT", "FROM", "WHERE", "EVENTS", "NEXT", 
		"SELECT", "OBJECT", "LITERAL", "WS", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "HEQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HEQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MessageContext extends ParserRuleContext {
		public Heql_blockContext heql_block() {
			return getRuleContext(Heql_blockContext.class,0);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_message);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(32);
					matchWildcard();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(38);
			heql_block();
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(39);
					matchWildcard();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class Heql_blockContext extends ParserRuleContext {
		public TerminalNode HEQL() { return getToken(HEQLParser.HEQL, 0); }
		public SelectNextContext selectNext() {
			return getRuleContext(SelectNextContext.class,0);
		}
		public SelectDistinctContext selectDistinct() {
			return getRuleContext(SelectDistinctContext.class,0);
		}
		public SelectBaseContext selectBase() {
			return getRuleContext(SelectBaseContext.class,0);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public Heql_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heql_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterHeql_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitHeql_block(this);
		}
	}

	public final Heql_blockContext heql_block() throws RecognitionException {
		Heql_blockContext _localctx = new Heql_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_heql_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(HEQL);
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(47);
				selectNext();
				}
				break;
			case 2:
				{
				setState(48);
				selectDistinct();
				}
				break;
			case 3:
				{
				setState(49);
				selectBase();
				}
				break;
			}
			setState(52);
			match(T__1);
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(53);
				match(T__2);
				setState(54);
				format();
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

	public static class SelectBaseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(HEQLParser.SELECT, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(HEQLParser.FROM, 0); }
		public TerminalNode EVENTS() { return getToken(HEQLParser.EVENTS, 0); }
		public TerminalNode WHERE() { return getToken(HEQLParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SelectBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterSelectBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitSelectBase(this);
		}
	}

	public final SelectBaseContext selectBase() throws RecognitionException {
		SelectBaseContext _localctx = new SelectBaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(SELECT);
			setState(58);
			fieldList();
			setState(59);
			match(FROM);
			setState(60);
			match(EVENTS);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(61);
				match(WHERE);
				setState(62);
				condition(0);
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(65);
				match(T__3);
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

	public static class SelectNextContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(HEQLParser.SELECT, 0); }
		public TerminalNode NEXT() { return getToken(HEQLParser.NEXT, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(HEQLParser.FROM, 0); }
		public TerminalNode EVENTS() { return getToken(HEQLParser.EVENTS, 0); }
		public TerminalNode WHERE() { return getToken(HEQLParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SelectNextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectNext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterSelectNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitSelectNext(this);
		}
	}

	public final SelectNextContext selectNext() throws RecognitionException {
		SelectNextContext _localctx = new SelectNextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectNext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(SELECT);
			setState(69);
			match(NEXT);
			setState(70);
			fieldList();
			setState(71);
			match(FROM);
			setState(72);
			match(EVENTS);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(73);
				match(WHERE);
				setState(74);
				condition(0);
				}
			}

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(77);
				match(T__3);
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

	public static class SelectDistinctContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(HEQLParser.SELECT, 0); }
		public TerminalNode DISTINCT() { return getToken(HEQLParser.DISTINCT, 0); }
		public SelFieldContext selField() {
			return getRuleContext(SelFieldContext.class,0);
		}
		public TerminalNode FROM() { return getToken(HEQLParser.FROM, 0); }
		public TerminalNode EVENTS() { return getToken(HEQLParser.EVENTS, 0); }
		public TerminalNode WHERE() { return getToken(HEQLParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SelectDistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectDistinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterSelectDistinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitSelectDistinct(this);
		}
	}

	public final SelectDistinctContext selectDistinct() throws RecognitionException {
		SelectDistinctContext _localctx = new SelectDistinctContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectDistinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(SELECT);
			setState(81);
			match(DISTINCT);
			setState(82);
			selField();
			setState(83);
			match(FROM);
			setState(84);
			match(EVENTS);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(85);
				match(WHERE);
				setState(86);
				condition(0);
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(89);
				match(T__3);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondLogicalOrContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public LogicalOrContext logicalOr() {
			return getRuleContext(LogicalOrContext.class,0);
		}
		public CondLogicalOrContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterCondLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitCondLogicalOr(this);
		}
	}
	public static class CondComparisonContext extends ConditionContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<CondFieldContext> condField() {
			return getRuleContexts(CondFieldContext.class);
		}
		public CondFieldContext condField(int i) {
			return getRuleContext(CondFieldContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public CondComparisonContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterCondComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitCondComparison(this);
		}
	}
	public static class CondParenContext extends ConditionContext {
		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class,0);
		}
		public CondParenContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterCondParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitCondParen(this);
		}
	}
	public static class CondLogicalAndContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public LogicalAndContext logicalAnd() {
			return getRuleContext(LogicalAndContext.class,0);
		}
		public CondLogicalAndContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterCondLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitCondLogicalAnd(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECT:
			case LITERAL:
				{
				_localctx = new CondComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OBJECT:
					{
					setState(93);
					condField();
					}
					break;
				case LITERAL:
					{
					setState(94);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97);
				operator();
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OBJECT:
					{
					setState(98);
					condField();
					}
					break;
				case LITERAL:
					{
					setState(99);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__4:
				{
				_localctx = new CondParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				leftParen();
				setState(103);
				condition(0);
				setState(104);
				rightParen();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new CondLogicalAndContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(108);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(109);
						logicalAnd();
						setState(110);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new CondLogicalOrContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(112);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(113);
						logicalOr();
						setState(114);
						condition(2);
						}
						break;
					}
					} 
				}
				setState(120);
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

	public static class LogicalOrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(HEQLParser.OR, 0); }
		public LogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitLogicalOr(this);
		}
	}

	public final LogicalOrContext logicalOr() throws RecognitionException {
		LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_logicalOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(OR);
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

	public static class LogicalAndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(HEQLParser.AND, 0); }
		public LogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitLogicalAnd(this);
		}
	}

	public final LogicalAndContext logicalAnd() throws RecognitionException {
		LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logicalAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(AND);
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

	public static class LeftParenContext extends ParserRuleContext {
		public LeftParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterLeftParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitLeftParen(this);
		}
	}

	public final LeftParenContext leftParen() throws RecognitionException {
		LeftParenContext _localctx = new LeftParenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_leftParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__4);
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

	public static class RightParenContext extends ParserRuleContext {
		public RightParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterRightParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitRightParen(this);
		}
	}

	public final RightParenContext rightParen() throws RecognitionException {
		RightParenContext _localctx = new RightParenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rightParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__5);
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

	public static class SelFieldContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(HEQLParser.OBJECT, 0); }
		public SelFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterSelField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitSelField(this);
		}
	}

	public final SelFieldContext selField() throws RecognitionException {
		SelFieldContext _localctx = new SelFieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(OBJECT);
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

	public static class CondFieldContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(HEQLParser.OBJECT, 0); }
		public CondFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterCondField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitCondField(this);
		}
	}

	public final CondFieldContext condField() throws RecognitionException {
		CondFieldContext _localctx = new CondFieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(OBJECT);
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

	public static class FieldListContext extends ParserRuleContext {
		public List<SelFieldContext> selField() {
			return getRuleContexts(SelFieldContext.class);
		}
		public SelFieldContext selField(int i) {
			return getRuleContext(SelFieldContext.class,i);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitFieldList(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fieldList);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(133);
				selField();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(134);
					match(T__6);
					setState(135);
					selField();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__7);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(HEQLParser.OPERATOR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(OPERATOR);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(HEQLParser.LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(LITERAL);
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

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(HEQLParser.FORMAT, 0); }
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HEQLListener ) ((HEQLListener)listener).exitFormat(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(FORMAT);
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
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0099\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4"+
		"\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\5\5\5Q\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\6\5\6]\n\6\3\7\3\7\3\7\5\7b\n\7\3\7"+
		"\3\7\3\7\5\7g\n\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7w\n\7\f\7\16\7z\13\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\7\16\u008b\n\16\f\16\16\16\u008e\13\16\3\16\5"+
		"\16\u0091\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\4%,\3\f\22\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \2\2\2\u009a\2%\3\2\2\2\4/\3\2\2\2\6;\3"+
		"\2\2\2\bF\3\2\2\2\nR\3\2\2\2\fl\3\2\2\2\16{\3\2\2\2\20}\3\2\2\2\22\177"+
		"\3\2\2\2\24\u0081\3\2\2\2\26\u0083\3\2\2\2\30\u0085\3\2\2\2\32\u0090\3"+
		"\2\2\2\34\u0092\3\2\2\2\36\u0094\3\2\2\2 \u0096\3\2\2\2\"$\13\2\2\2#\""+
		"\3\2\2\2$\'\3\2\2\2%&\3\2\2\2%#\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(,\5\4\3\2"+
		")+\13\2\2\2*)\3\2\2\2+.\3\2\2\2,-\3\2\2\2,*\3\2\2\2-\3\3\2\2\2.,\3\2\2"+
		"\2/\60\7\3\2\2\60\64\7\f\2\2\61\65\5\b\5\2\62\65\5\n\6\2\63\65\5\6\4\2"+
		"\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\669\7\4\2\2\67"+
		"8\7\5\2\28:\5 \21\29\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2;<\7\25\2\2<=\5\32"+
		"\16\2=>\7\21\2\2>A\7\23\2\2?@\7\22\2\2@B\5\f\7\2A?\3\2\2\2AB\3\2\2\2B"+
		"D\3\2\2\2CE\7\6\2\2DC\3\2\2\2DE\3\2\2\2E\7\3\2\2\2FG\7\25\2\2GH\7\24\2"+
		"\2HI\5\32\16\2IJ\7\21\2\2JM\7\23\2\2KL\7\22\2\2LN\5\f\7\2MK\3\2\2\2MN"+
		"\3\2\2\2NP\3\2\2\2OQ\7\6\2\2PO\3\2\2\2PQ\3\2\2\2Q\t\3\2\2\2RS\7\25\2\2"+
		"ST\7\20\2\2TU\5\26\f\2UV\7\21\2\2VY\7\23\2\2WX\7\22\2\2XZ\5\f\7\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[]\7\6\2\2\\[\3\2\2\2\\]\3\2\2\2]\13\3\2\2"+
		"\2^a\b\7\1\2_b\5\30\r\2`b\5\36\20\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2cf\5"+
		"\34\17\2dg\5\30\r\2eg\5\36\20\2fd\3\2\2\2fe\3\2\2\2gm\3\2\2\2hi\5\22\n"+
		"\2ij\5\f\7\2jk\5\24\13\2km\3\2\2\2l^\3\2\2\2lh\3\2\2\2mx\3\2\2\2no\f\5"+
		"\2\2op\5\20\t\2pq\5\f\7\6qw\3\2\2\2rs\f\3\2\2st\5\16\b\2tu\5\f\7\4uw\3"+
		"\2\2\2vn\3\2\2\2vr\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\r\3\2\2\2zx"+
		"\3\2\2\2{|\7\16\2\2|\17\3\2\2\2}~\7\r\2\2~\21\3\2\2\2\177\u0080\7\7\2"+
		"\2\u0080\23\3\2\2\2\u0081\u0082\7\b\2\2\u0082\25\3\2\2\2\u0083\u0084\7"+
		"\26\2\2\u0084\27\3\2\2\2\u0085\u0086\7\26\2\2\u0086\31\3\2\2\2\u0087\u008c"+
		"\5\26\f\2\u0088\u0089\7\t\2\2\u0089\u008b\5\26\f\2\u008a\u0088\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0091"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\7\n\2\2\u0090\u0087\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\33\3\2\2\2\u0092\u0093\7\17\2\2\u0093\35\3\2\2\2"+
		"\u0094\u0095\7\27\2\2\u0095\37\3\2\2\2\u0096\u0097\7\13\2\2\u0097!\3\2"+
		"\2\2\23%,\649ADMPY\\aflvx\u008c\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}