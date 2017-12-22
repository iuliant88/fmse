// Generated from ro/tirzuman/iulian/fmse/bonust1/antlr/Bonus.g4 by ANTLR 4.3
package ro.tirzuman.iulian.fmse.bonust1.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BonusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Int=2, Bool=3, PLUS=4, MINUS=5, TIMES=6, DIV=7, GT=8, LT=9, EQ=10, 
		NOT=11, AND=12, OR=13, ANY=14, EXISTS=15, DOT=16, IMPL=17, WORD=18, WHITESPACE=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'"
	};
	public static final String[] ruleNames = {
		"T__0", "Int", "Bool", "PLUS", "MINUS", "TIMES", "DIV", "GT", "LT", "EQ", 
		"NOT", "AND", "OR", "ANY", "EXISTS", "DOT", "IMPL", "A", "S", "Y", "H", 
		"O", "U", "T", "LOWERCASE", "UPPERCASE", "WORD", "WHITESPACE"
	};


	public BonusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bonus.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\34\6\34\u0084\n\34\r\34\16\34\u0085\3\35\3\35"+
		"\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\249\25\3\2\f"+
		"\4\2CCcc\4\2UUuu\4\2[[{{\4\2JJjj\4\2QQqq\4\2WWww\4\2VVvv\3\2c|\3\2C\\"+
		"\4\2\13\13\"\"\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2"+
		"\7A\3\2\2\2\tF\3\2\2\2\13H\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2"+
		"\23P\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2\33Y\3\2\2\2\35\\\3\2"+
		"\2\2\37`\3\2\2\2!g\3\2\2\2#i\3\2\2\2%n\3\2\2\2\'p\3\2\2\2)r\3\2\2\2+t"+
		"\3\2\2\2-v\3\2\2\2/x\3\2\2\2\61z\3\2\2\2\63|\3\2\2\2\65~\3\2\2\2\67\u0083"+
		"\3\2\2\29\u0087\3\2\2\2;<\7=\2\2<\4\3\2\2\2=>\7k\2\2>?\7p\2\2?@\7v\2\2"+
		"@\6\3\2\2\2AB\7d\2\2BC\7q\2\2CD\7q\2\2DE\7n\2\2E\b\3\2\2\2FG\7-\2\2G\n"+
		"\3\2\2\2HI\7/\2\2I\f\3\2\2\2JK\7,\2\2K\16\3\2\2\2LM\7\61\2\2M\20\3\2\2"+
		"\2NO\7@\2\2O\22\3\2\2\2PQ\7>\2\2Q\24\3\2\2\2RS\7?\2\2S\26\3\2\2\2TU\7"+
		"#\2\2U\30\3\2\2\2VW\7(\2\2WX\7(\2\2X\32\3\2\2\2YZ\7~\2\2Z[\7~\2\2[\34"+
		"\3\2\2\2\\]\7C\2\2]^\7P\2\2^_\7[\2\2_\36\3\2\2\2`a\7G\2\2ab\7Z\2\2bc\7"+
		"K\2\2cd\7U\2\2de\7V\2\2ef\7U\2\2f \3\2\2\2gh\7\60\2\2h\"\3\2\2\2ij\7K"+
		"\2\2jk\7O\2\2kl\7R\2\2lm\7N\2\2m$\3\2\2\2no\t\2\2\2o&\3\2\2\2pq\t\3\2"+
		"\2q(\3\2\2\2rs\t\4\2\2s*\3\2\2\2tu\t\5\2\2u,\3\2\2\2vw\t\6\2\2w.\3\2\2"+
		"\2xy\t\7\2\2y\60\3\2\2\2z{\t\b\2\2{\62\3\2\2\2|}\t\t\2\2}\64\3\2\2\2~"+
		"\177\t\n\2\2\177\66\3\2\2\2\u0080\u0084\5\63\32\2\u0081\u0084\5\65\33"+
		"\2\u0082\u0084\7a\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"8\3\2\2\2\u0087\u0088\t\13\2\2\u0088:\3\2\2\2\5\2\u0083\u0085\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}