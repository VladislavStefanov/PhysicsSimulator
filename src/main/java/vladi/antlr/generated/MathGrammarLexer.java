// Generated from MathGrammar.g4 by ANTLR 4.7.2
package vladi.antlr.generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, PLUS=2, MINUS=3, SLASH=4, ASTERIKS=5, POWER=6, SIN=7, COS=8, 
		TAN=9, ASIN=10, ACOS=11, ATAN=12, LOG=13, LG=14, LOG2=15, LN=16, VARIABLE=17, 
		COMA=18, LEFT_BRACKET=19, RIGHT_BRACKET=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "WHITESPACE", "NUMBER", "PLUS", "MINUS", "SLASH", "ASTERIKS", 
			"POWER", "SIN", "COS", "TAN", "ASIN", "ACOS", "ATAN", "LOG", "LG", "LOG2", 
			"LN", "VARIABLE", "COMA", "LEFT_BRACKET", "RIGHT_BRACKET"
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


	public MathGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MathGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0106\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\6"+
		"\3\63\n\3\r\3\16\3\64\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\6\4>\n\4\r\4\16"+
		"\4?\3\4\3\4\6\4D\n\4\r\4\16\4E\5\4H\n\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3"+
		"\5\7\5Q\n\5\f\5\16\5T\13\5\3\5\3\5\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3"+
		"\6\3\7\7\7a\n\7\f\7\16\7d\13\7\3\7\3\7\3\b\7\bi\n\b\f\b\16\bl\13\b\3\b"+
		"\3\b\3\t\7\tq\n\t\f\t\16\tt\13\t\3\t\3\t\3\n\7\ny\n\n\f\n\16\n|\13\n\3"+
		"\n\3\n\3\n\3\n\3\13\7\13\u0083\n\13\f\13\16\13\u0086\13\13\3\13\3\13\3"+
		"\13\3\13\3\f\7\f\u008d\n\f\f\f\16\f\u0090\13\f\3\f\3\f\3\f\3\f\3\r\7\r"+
		"\u0097\n\r\f\r\16\r\u009a\13\r\3\r\3\r\3\r\3\r\3\r\3\16\7\16\u00a2\n\16"+
		"\f\16\16\16\u00a5\13\16\3\16\3\16\3\16\3\16\3\16\3\17\7\17\u00ad\n\17"+
		"\f\17\16\17\u00b0\13\17\3\17\3\17\3\17\3\17\3\17\3\20\7\20\u00b8\n\20"+
		"\f\20\16\20\u00bb\13\20\3\20\3\20\3\20\3\20\3\21\7\21\u00c2\n\21\f\21"+
		"\16\21\u00c5\13\21\3\21\3\21\3\21\3\22\7\22\u00cb\n\22\f\22\16\22\u00ce"+
		"\13\22\3\22\3\22\3\22\3\22\3\23\7\23\u00d5\n\23\f\23\16\23\u00d8\13\23"+
		"\3\23\3\23\3\23\3\24\7\24\u00de\n\24\f\24\16\24\u00e1\13\24\3\24\3\24"+
		"\7\24\u00e5\n\24\f\24\16\24\u00e8\13\24\3\25\7\25\u00eb\n\25\f\25\16\25"+
		"\u00ee\13\25\3\25\3\25\3\26\7\26\u00f3\n\26\f\26\16\26\u00f6\13\26\3\26"+
		"\3\26\3\27\7\27\u00fb\n\27\f\27\16\27\u00fe\13\27\3\27\3\27\7\27\u0102"+
		"\n\27\f\27\16\27\u0105\13\27\2\2\30\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b"+
		"\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26\3"+
		"\2\5\3\2\62;\4\2\13\13\"\"\3\2z{\2\u011e\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\3/\3\2\2\2\5\62\3\2\2\2\79\3\2\2\2\tR\3\2\2\2\13Z\3\2\2\2\rb\3"+
		"\2\2\2\17j\3\2\2\2\21r\3\2\2\2\23z\3\2\2\2\25\u0084\3\2\2\2\27\u008e\3"+
		"\2\2\2\31\u0098\3\2\2\2\33\u00a3\3\2\2\2\35\u00ae\3\2\2\2\37\u00b9\3\2"+
		"\2\2!\u00c3\3\2\2\2#\u00cc\3\2\2\2%\u00d6\3\2\2\2\'\u00df\3\2\2\2)\u00ec"+
		"\3\2\2\2+\u00f4\3\2\2\2-\u00fc\3\2\2\2/\60\t\2\2\2\60\4\3\2\2\2\61\63"+
		"\t\3\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\6"+
		"\3\2\2\2\668\5\5\3\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3"+
		"\2\2\2;9\3\2\2\2<>\5\3\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@G\3"+
		"\2\2\2AC\7\60\2\2BD\5\3\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH"+
		"\3\2\2\2GA\3\2\2\2GH\3\2\2\2HL\3\2\2\2IK\5\5\3\2JI\3\2\2\2KN\3\2\2\2L"+
		"J\3\2\2\2LM\3\2\2\2M\b\3\2\2\2NL\3\2\2\2OQ\5\5\3\2PO\3\2\2\2QT\3\2\2\2"+
		"RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7-\2\2V\n\3\2\2\2WY\5\5\3\2"+
		"XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7/\2"+
		"\2^\f\3\2\2\2_a\5\5\3\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2"+
		"\2\2db\3\2\2\2ef\7\61\2\2f\16\3\2\2\2gi\5\5\3\2hg\3\2\2\2il\3\2\2\2jh"+
		"\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7,\2\2n\20\3\2\2\2oq\5\5\3\2"+
		"po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7`\2\2"+
		"v\22\3\2\2\2wy\5\5\3\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2"+
		"\2|z\3\2\2\2}~\7u\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080\24\3\2\2\2\u0081"+
		"\u0083\5\5\3\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0088\7e\2\2\u0088\u0089\7q\2\2\u0089\u008a\7u\2\2\u008a\26\3\2\2\2\u008b"+
		"\u008d\5\5\3\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\7v\2\2\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094\30\3\2\2\2\u0095"+
		"\u0097\5\5\3\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009c\7c\2\2\u009c\u009d\7u\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2"+
		"\u009f\32\3\2\2\2\u00a0\u00a2\5\5\3\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7q\2"+
		"\2\u00a9\u00aa\7u\2\2\u00aa\34\3\2\2\2\u00ab\u00ad\5\5\3\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7v\2"+
		"\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7p\2\2\u00b5\36\3\2\2\2\u00b6\u00b8"+
		"\5\5\3\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7n"+
		"\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7i\2\2\u00bf \3\2\2\2\u00c0\u00c2"+
		"\5\5\3\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7n"+
		"\2\2\u00c7\u00c8\7i\2\2\u00c8\"\3\2\2\2\u00c9\u00cb\5\5\3\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7i\2"+
		"\2\u00d1\u00d2\7\64\2\2\u00d2$\3\2\2\2\u00d3\u00d5\5\5\3\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7p\2"+
		"\2\u00db&\3\2\2\2\u00dc\u00de\5\5\3\2\u00dd\u00dc\3\2\2\2\u00de\u00e1"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e6\t\4\2\2\u00e3\u00e5\5\5\3\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"(\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\5\5\3\2\u00ea\u00e9\3\2\2\2"+
		"\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7.\2\2\u00f0*\3\2\2\2\u00f1\u00f3"+
		"\5\5\3\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7*"+
		"\2\2\u00f8,\3\2\2\2\u00f9\u00fb\5\5\3\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0103\7+\2\2\u0100\u0102\5\5\3\2\u0101\u0100\3\2"+
		"\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		".\3\2\2\2\u0105\u0103\3\2\2\2\36\2\649?EGLRZbjrz\u0084\u008e\u0098\u00a3"+
		"\u00ae\u00b9\u00c3\u00cc\u00d6\u00df\u00e6\u00ec\u00f4\u00fc\u0103\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}