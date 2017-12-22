// Generated from ro/tirzuman/iulian/fmse/bonust1/antlr/Bonus.g4 by ANTLR 4.3
package ro.tirzuman.iulian.fmse.bonust1.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BonusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Int=2, Bool=3, PLUS=4, MINUS=5, TIMES=6, DIV=7, GT=8, LT=9, EQ=10, 
		NOT=11, AND=12, OR=13, ANY=14, EXISTS=15, DOT=16, IMPL=17, WORD=18, WHITESPACE=19;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "'int'", "'bool'", "'+'", "'-'", "'*'", "'/'", "'>'", 
		"'<'", "'='", "'!'", "'&&'", "'||'", "'ANY'", "'EXISTS'", "'.'", "'IMPL'", 
		"WORD", "WHITESPACE"
	};
	public static final int
		RULE_exp = 0, RULE_bexp = 1, RULE_assertt = 2, RULE_id = 3, RULE_boolRelOp = 4, 
		RULE_aritRelOp = 5;
	public static final String[] ruleNames = {
		"exp", "bexp", "assertt", "id", "boolRelOp", "aritRelOp"
	};

	@Override
	public String getGrammarFileName() { return "Bonus.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BonusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public AritRelOpContext aritRelOp() {
			return getRuleContext(AritRelOpContext.class,0);
		}
		public TerminalNode Bool() { return getToken(BonusParser.Bool, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Int() { return getToken(BonusParser.Int, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode WHITESPACE() { return getToken(BonusParser.WHITESPACE, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(13);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Bool) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(14); match(WHITESPACE);
			setState(15); id();
			setState(16); match(T__0);
			}
			_ctx.stop = _input.LT(-1);
			setState(24);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(18);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(19); aritRelOp();
					setState(20); exp(2);
					}
					} 
				}
				setState(26);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode NOT() { return getToken(BonusParser.NOT, 0); }
		public BoolRelOpContext boolRelOp() {
			return getRuleContext(BoolRelOpContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterBexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitBexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitBexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexpContext bexp() throws RecognitionException {
		BexpContext _localctx = new BexpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bexp);
		try {
			setState(33);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(27); exp(0);
				setState(28); boolRelOp();
				setState(29); exp(0);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); match(NOT);
				setState(32); exp(0);
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

	public static class AsserttContext extends ParserRuleContext {
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode IMPL() { return getToken(BonusParser.IMPL, 0); }
		public TerminalNode EXISTS() { return getToken(BonusParser.EXISTS, 0); }
		public TerminalNode DOT() { return getToken(BonusParser.DOT, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ANY() { return getToken(BonusParser.ANY, 0); }
		public AsserttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterAssertt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitAssertt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitAssertt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsserttContext assertt() throws RecognitionException {
		AsserttContext _localctx = new AsserttContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assertt);
		try {
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35); bexp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); exp(0);
				setState(37); match(IMPL);
				setState(38); exp(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40); match(ANY);
				setState(41); match(DOT);
				setState(42); exp(0);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43); match(EXISTS);
				setState(44); match(DOT);
				setState(45); exp(0);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(BonusParser.WORD, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(WORD);
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

	public static class BoolRelOpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(BonusParser.LT, 0); }
		public TerminalNode GT() { return getToken(BonusParser.GT, 0); }
		public TerminalNode AND() { return getToken(BonusParser.AND, 0); }
		public TerminalNode EQ() { return getToken(BonusParser.EQ, 0); }
		public TerminalNode OR() { return getToken(BonusParser.OR, 0); }
		public BoolRelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolRelOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterBoolRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitBoolRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitBoolRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolRelOpContext boolRelOp() throws RecognitionException {
		BoolRelOpContext _localctx = new BoolRelOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_boolRelOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ) | (1L << AND) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AritRelOpContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(BonusParser.TIMES, 0); }
		public TerminalNode PLUS() { return getToken(BonusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BonusParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(BonusParser.DIV, 0); }
		public AritRelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritRelOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterAritRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitAritRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitAritRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritRelOpContext aritRelOp() throws RecognitionException {
		AritRelOpContext _localctx = new AritRelOpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_aritRelOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 0: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\259\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\2\3\2\b\2\4\6\b\n\f\2\5\3\2\4\5\4\2\n\f\16\17\3\2\6\t\67\2"+
		"\16\3\2\2\2\4#\3\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f\66\3\2"+
		"\2\2\16\17\b\2\1\2\17\20\t\2\2\2\20\21\7\25\2\2\21\22\5\b\5\2\22\23\7"+
		"\3\2\2\23\32\3\2\2\2\24\25\f\3\2\2\25\26\5\f\7\2\26\27\5\2\2\4\27\31\3"+
		"\2\2\2\30\24\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\3\3"+
		"\2\2\2\34\32\3\2\2\2\35\36\5\2\2\2\36\37\5\n\6\2\37 \5\2\2\2 $\3\2\2\2"+
		"!\"\7\r\2\2\"$\5\2\2\2#\35\3\2\2\2#!\3\2\2\2$\5\3\2\2\2%\61\5\4\3\2&\'"+
		"\5\2\2\2\'(\7\23\2\2()\5\2\2\2)\61\3\2\2\2*+\7\20\2\2+,\7\22\2\2,\61\5"+
		"\2\2\2-.\7\21\2\2./\7\22\2\2/\61\5\2\2\2\60%\3\2\2\2\60&\3\2\2\2\60*\3"+
		"\2\2\2\60-\3\2\2\2\61\7\3\2\2\2\62\63\7\24\2\2\63\t\3\2\2\2\64\65\t\3"+
		"\2\2\65\13\3\2\2\2\66\67\t\4\2\2\67\r\3\2\2\2\5\32#\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}