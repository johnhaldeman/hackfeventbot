// Generated from HEQL.g4 by ANTLR 4.7
package org.hackf.discordeventbot.heql;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HEQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, FORMAT=9, 
		HEQL=10, AND=11, OR=12, OPERATOR=13, DISTINCT=14, FROM=15, WHERE=16, EVENTS=17, 
		NEXT=18, SELECT=19, OBJECT=20, LITERAL=21, WS=22, UNEXPECTED_CHAR=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "FORMAT", 
		"HEQL", "AND", "OR", "OPERATOR", "DISTINCT", "FROM", "WHERE", "EVENTS", 
		"NEXT", "SELECT", "OBJECT", "LITERAL", "WS", "UNEXPECTED_CHAR", "A", "B", 
		"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
		"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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


	public HEQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HEQL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0114\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008b"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u009f\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\6\25\u00c9\n\25\r\25\16\25\u00ca\3\26\3\26\3"+
		"\26\3\26\7\26\u00d1\n\26\f\26\16\26\u00d4\13\26\3\26\3\26\3\27\6\27\u00d9"+
		"\n\27\r\27\16\27\u00da\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2"+
		"S\2U\2W\2Y\2[\2]\2_\2a\2c\2\3\2\37\5\2C\\aac|\3\2))\5\2\13\f\17\17\"\""+
		"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2K"+
		"Kkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\2\u0100\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\3e\3\2\2\2\5h\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\r"+
		"q\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2\23\u008a\3\2\2\2\25\u008c\3\2\2\2\27"+
		"\u0091\3\2\2\2\31\u0095\3\2\2\2\33\u009e\3\2\2\2\35\u00a0\3\2\2\2\37\u00a9"+
		"\3\2\2\2!\u00ae\3\2\2\2#\u00b4\3\2\2\2%\u00bb\3\2\2\2\'\u00c0\3\2\2\2"+
		")\u00c8\3\2\2\2+\u00cc\3\2\2\2-\u00d8\3\2\2\2/\u00de\3\2\2\2\61\u00e0"+
		"\3\2\2\2\63\u00e2\3\2\2\2\65\u00e4\3\2\2\2\67\u00e6\3\2\2\29\u00e8\3\2"+
		"\2\2;\u00ea\3\2\2\2=\u00ec\3\2\2\2?\u00ee\3\2\2\2A\u00f0\3\2\2\2C\u00f2"+
		"\3\2\2\2E\u00f4\3\2\2\2G\u00f6\3\2\2\2I\u00f8\3\2\2\2K\u00fa\3\2\2\2M"+
		"\u00fc\3\2\2\2O\u00fe\3\2\2\2Q\u0100\3\2\2\2S\u0102\3\2\2\2U\u0104\3\2"+
		"\2\2W\u0106\3\2\2\2Y\u0108\3\2\2\2[\u010a\3\2\2\2]\u010c\3\2\2\2_\u010e"+
		"\3\2\2\2a\u0110\3\2\2\2c\u0112\3\2\2\2ef\7>\2\2fg\7A\2\2g\4\3\2\2\2hi"+
		"\7A\2\2ij\7@\2\2j\6\3\2\2\2kl\7~\2\2l\b\3\2\2\2mn\7=\2\2n\n\3\2\2\2op"+
		"\7*\2\2p\f\3\2\2\2qr\7+\2\2r\16\3\2\2\2st\7.\2\2t\20\3\2\2\2uv\7,\2\2"+
		"v\22\3\2\2\2wx\7r\2\2xy\7t\2\2yz\7g\2\2z{\7v\2\2{|\7v\2\2|\u008b\7{\2"+
		"\2}~\7l\2\2~\177\7u\2\2\177\u0080\7q\2\2\u0080\u008b\7p\2\2\u0081\u0082"+
		"\7j\2\2\u0082\u0083\7c\2\2\u0083\u0084\7o\2\2\u0084\u0085\7o\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7t\2\2\u0087\u0088\7u\2\2\u0088\u0089\7c\2\2"+
		"\u0089\u008b\7{\2\2\u008aw\3\2\2\2\u008a}\3\2\2\2\u008a\u0081\3\2\2\2"+
		"\u008b\24\3\2\2\2\u008c\u008d\5? \2\u008d\u008e\59\35\2\u008e\u008f\5"+
		"Q)\2\u008f\u0090\5G$\2\u0090\26\3\2\2\2\u0091\u0092\5\61\31\2\u0092\u0093"+
		"\5K&\2\u0093\u0094\5\67\34\2\u0094\30\3\2\2\2\u0095\u0096\5M\'\2\u0096"+
		"\u0097\5S*\2\u0097\32\3\2\2\2\u0098\u0099\5G$\2\u0099\u009a\5A!\2\u009a"+
		"\u009b\5E#\2\u009b\u009c\59\35\2\u009c\u009f\3\2\2\2\u009d\u009f\7?\2"+
		"\2\u009e\u0098\3\2\2\2\u009e\u009d\3\2\2\2\u009f\34\3\2\2\2\u00a0\u00a1"+
		"\5\67\34\2\u00a1\u00a2\5A!\2\u00a2\u00a3\5U+\2\u00a3\u00a4\5W,\2\u00a4"+
		"\u00a5\5A!\2\u00a5\u00a6\5K&\2\u00a6\u00a7\5\65\33\2\u00a7\u00a8\5W,\2"+
		"\u00a8\36\3\2\2\2\u00a9\u00aa\5;\36\2\u00aa\u00ab\5S*\2\u00ab\u00ac\5"+
		"M\'\2\u00ac\u00ad\5I%\2\u00ad \3\2\2\2\u00ae\u00af\5]/\2\u00af\u00b0\5"+
		"? \2\u00b0\u00b1\59\35\2\u00b1\u00b2\5S*\2\u00b2\u00b3\59\35\2\u00b3\""+
		"\3\2\2\2\u00b4\u00b5\59\35\2\u00b5\u00b6\5[.\2\u00b6\u00b7\59\35\2\u00b7"+
		"\u00b8\5K&\2\u00b8\u00b9\5W,\2\u00b9\u00ba\5U+\2\u00ba$\3\2\2\2\u00bb"+
		"\u00bc\5K&\2\u00bc\u00bd\59\35\2\u00bd\u00be\5_\60\2\u00be\u00bf\5W,\2"+
		"\u00bf&\3\2\2\2\u00c0\u00c1\5U+\2\u00c1\u00c2\59\35\2\u00c2\u00c3\5G$"+
		"\2\u00c3\u00c4\59\35\2\u00c4\u00c5\5\65\33\2\u00c5\u00c6\5W,\2\u00c6("+
		"\3\2\2\2\u00c7\u00c9\t\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb*\3\2\2\2\u00cc\u00d2\7)\2\2\u00cd"+
		"\u00d1\n\3\2\2\u00ce\u00cf\7^\2\2\u00cf\u00d1\7)\2\2\u00d0\u00cd\3\2\2"+
		"\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7)\2\2\u00d6"+
		",\3\2\2\2\u00d7\u00d9\t\4\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd"+
		"\b\27\2\2\u00dd.\3\2\2\2\u00de\u00df\13\2\2\2\u00df\60\3\2\2\2\u00e0\u00e1"+
		"\t\5\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\t\6\2\2\u00e3\64\3\2\2\2\u00e4\u00e5"+
		"\t\7\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\t\b\2\2\u00e78\3\2\2\2\u00e8\u00e9"+
		"\t\t\2\2\u00e9:\3\2\2\2\u00ea\u00eb\t\n\2\2\u00eb<\3\2\2\2\u00ec\u00ed"+
		"\t\13\2\2\u00ed>\3\2\2\2\u00ee\u00ef\t\f\2\2\u00ef@\3\2\2\2\u00f0\u00f1"+
		"\t\r\2\2\u00f1B\3\2\2\2\u00f2\u00f3\t\16\2\2\u00f3D\3\2\2\2\u00f4\u00f5"+
		"\t\17\2\2\u00f5F\3\2\2\2\u00f6\u00f7\t\20\2\2\u00f7H\3\2\2\2\u00f8\u00f9"+
		"\t\21\2\2\u00f9J\3\2\2\2\u00fa\u00fb\t\22\2\2\u00fbL\3\2\2\2\u00fc\u00fd"+
		"\t\23\2\2\u00fdN\3\2\2\2\u00fe\u00ff\t\24\2\2\u00ffP\3\2\2\2\u0100\u0101"+
		"\t\25\2\2\u0101R\3\2\2\2\u0102\u0103\t\26\2\2\u0103T\3\2\2\2\u0104\u0105"+
		"\t\27\2\2\u0105V\3\2\2\2\u0106\u0107\t\30\2\2\u0107X\3\2\2\2\u0108\u0109"+
		"\t\31\2\2\u0109Z\3\2\2\2\u010a\u010b\t\32\2\2\u010b\\\3\2\2\2\u010c\u010d"+
		"\t\33\2\2\u010d^\3\2\2\2\u010e\u010f\t\34\2\2\u010f`\3\2\2\2\u0110\u0111"+
		"\t\35\2\2\u0111b\3\2\2\2\u0112\u0113\t\36\2\2\u0113d\3\2\2\2\t\2\u008a"+
		"\u009e\u00ca\u00d0\u00d2\u00da\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}