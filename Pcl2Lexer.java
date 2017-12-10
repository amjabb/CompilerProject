// Generated from Pcl2.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pcl2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PROGRAM=4, END=5, IDENTIFIER=6, INTEGER=7, FLOAT=8, 
		MUL_OP=9, DIV_OP=10, ADD_OP=11, SUB_OP=12, WRITE=13, READ=14, OP_COMPARE=15, 
		OP_LT=16, OP_GT=17, OP_GTEQ=18, OP_LTEQ=19, COMMA=20, DASH=21, LPAREN=22, 
		RPAREN=23, IF_TOKEN=24, ELSE_TOKEN=25, WHILE_TOKEN=26, NEWLINE=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "PROGRAM", "END", "IDENTIFIER", "INTEGER", "FLOAT", 
		"MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "WRITE", "READ", "OP_COMPARE", 
		"OP_LT", "OP_GT", "OP_GTEQ", "OP_LTEQ", "COMMA", "DASH", "LPAREN", "RPAREN", 
		"IF_TOKEN", "ELSE_TOKEN", "WHILE_TOKEN", "NEWLINE", "WS"
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


	public Pcl2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pcl2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\b\6\b_\n\b\r\b\16\b"+
		"`\3\t\6\td\n\t\r\t\16\te\3\t\3\t\6\tj\n\t\r\t\16\tk\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\5\34\u00cb\n\34\3\34\3\34\3\34\3\34\3\35\6\35\u00d2\n\35\r\35"+
		"\16\35\u00d3\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\13\13"+
		"\"\"\2\u00dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7D\3\2\2\2\tF\3\2\2\2\13L\3\2\2\2\rV\3\2"+
		"\2\2\17^\3\2\2\2\21c\3\2\2\2\23m\3\2\2\2\25r\3\2\2\2\27w\3\2\2\2\31\177"+
		"\3\2\2\2\33\u0086\3\2\2\2\35\u0092\3\2\2\2\37\u0099\3\2\2\2!\u009c\3\2"+
		"\2\2#\u009e\3\2\2\2%\u00a0\3\2\2\2\'\u00a3\3\2\2\2)\u00a6\3\2\2\2+\u00a8"+
		"\3\2\2\2-\u00aa\3\2\2\2/\u00ac\3\2\2\2\61\u00ae\3\2\2\2\63\u00b3\3\2\2"+
		"\2\65\u00bd\3\2\2\2\67\u00ca\3\2\2\29\u00d1\3\2\2\2;<\7<\2\2<\4\3\2\2"+
		"\2=>\7f\2\2>?\7w\2\2?@\7h\2\2@A\7h\2\2AB\7n\2\2BC\7g\2\2C\6\3\2\2\2DE"+
		"\7)\2\2E\b\3\2\2\2FG\7c\2\2GH\7x\2\2HI\7c\2\2IJ\7u\2\2JK\7v\2\2K\n\3\2"+
		"\2\2LM\7d\2\2MN\7n\2\2NO\7c\2\2OP\7e\2\2PQ\7m\2\2QR\7u\2\2RS\7r\2\2ST"+
		"\7q\2\2TU\7v\2\2U\f\3\2\2\2VZ\t\2\2\2WY\t\3\2\2XW\3\2\2\2Y\\\3\2\2\2Z"+
		"X\3\2\2\2Z[\3\2\2\2[\16\3\2\2\2\\Z\3\2\2\2]_\t\4\2\2^]\3\2\2\2_`\3\2\2"+
		"\2`^\3\2\2\2`a\3\2\2\2a\20\3\2\2\2bd\t\4\2\2cb\3\2\2\2de\3\2\2\2ec\3\2"+
		"\2\2ef\3\2\2\2fg\3\2\2\2gi\7\60\2\2hj\t\4\2\2ih\3\2\2\2jk\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2l\22\3\2\2\2mn\7n\2\2no\7q\2\2op\7q\2\2pq\7v\2\2q\24\3"+
		"\2\2\2rs\7d\2\2st\7q\2\2tu\7q\2\2uv\7v\2\2v\26\3\2\2\2wx\7r\2\2xy\7k\2"+
		"\2yz\7n\2\2z{\7n\2\2{|\7c\2\2|}\7i\2\2}~\7g\2\2~\30\3\2\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7q\2\2\u0081\u0082\7d\2\2\u0082\u0083\7d\2\2\u0083"+
		"\u0084\7g\2\2\u0084\u0085\7f\2\2\u0085\32\3\2\2\2\u0086\u0087\7h\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u0089\7g\2\2\u0089\u008a\7f\2\2\u008a\u008b\7V\2\2"+
		"\u008b\u008c\7j\2\2\u008c\u008d\7g\2\2\u008d\u008e\7H\2\2\u008e\u008f"+
		"\7k\2\2\u008f\u0090\7u\2\2\u0090\u0091\7j\2\2\u0091\34\3\2\2\2\u0092\u0093"+
		"\7[\2\2\u0093\u0094\7q\2\2\u0094\u0095\7J\2\2\u0095\u0096\7q\2\2\u0096"+
		"\u0097\7J\2\2\u0097\u0098\7q\2\2\u0098\36\3\2\2\2\u0099\u009a\7?\2\2\u009a"+
		"\u009b\7?\2\2\u009b \3\2\2\2\u009c\u009d\7>\2\2\u009d\"\3\2\2\2\u009e"+
		"\u009f\7@\2\2\u009f$\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1\u00a2\7?\2\2\u00a2"+
		"&\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\u00a5\7?\2\2\u00a5(\3\2\2\2\u00a6\u00a7"+
		"\7.\2\2\u00a7*\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7"+
		"*\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7"+
		"c\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7{\2\2\u00b2\62"+
		"\3\2\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7q\2\2\u00b6"+
		"\u00b7\7{\2\2\u00b7\u00b8\7O\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7v\2\2"+
		"\u00ba\u00bb\7g\2\2\u00bb\u00bc\7{\2\2\u00bc\64\3\2\2\2\u00bd\u00be\7"+
		"u\2\2\u00be\u00bf\7y\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2"+
		"\7V\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7F\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7m\2\2\u00c8\66\3\2\2\2\u00c9"+
		"\u00cb\7\17\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3"+
		"\2\2\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\34\2\2\u00cf"+
		"8\3\2\2\2\u00d0\u00d2\t\5\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6"+
		"\b\35\2\2\u00d6:\3\2\2\2\t\2Z`ek\u00ca\u00d3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}