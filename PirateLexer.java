// Generated from Pirate.g4 by ANTLR 4.7.1

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
public class PirateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BEGIN=10, END=11, IDENTIFIER=12, INTEGER=13, FLOAT=14, WS=15, MUL_OP=16, 
		DIV_OP=17, ADD_OP=18, SUB_OP=19, ADD=20, SUB=21, READ=22, OP_COMPARE=23, 
		OP_LT=24, OP_GT=25, OP_GTEQ=26, OP_LTEQ=27, COMMA=28, IF_TOKEN=29, ELSE_TOKEN=30, 
		WHILE_TOKEN=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"BEGIN", "END", "IDENTIFIER", "INTEGER", "FLOAT", "WS", "MUL_OP", "DIV_OP", 
		"ADD_OP", "SUB_OP", "ADD", "SUB", "READ", "OP_COMPARE", "OP_LT", "OP_GT", 
		"OP_GTEQ", "OP_LTEQ", "COMMA", "IF_TOKEN", "ELSE_TOKEN", "WHILE_TOKEN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'duffle'", "'('", "')'", "'feedTheFish'", 
		"'''", "''''", "'avast'", "'blackspot'", null, null, null, null, "'*'", 
		"'/'", "'+'", "'-'", "'booty'", "'pillage'", "'YoHoHo'", "'=='", "'<'", 
		"'>'", "'>='", "'<='", "','", "'ahoy'", "'ahoyMatey'", "'swabTheDeck'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "BEGIN", "END", 
		"IDENTIFIER", "INTEGER", "FLOAT", "WS", "MUL_OP", "DIV_OP", "ADD_OP", 
		"SUB_OP", "ADD", "SUB", "READ", "OP_COMPARE", "OP_LT", "OP_GT", "OP_GTEQ", 
		"OP_LTEQ", "COMMA", "IF_TOKEN", "ELSE_TOKEN", "WHILE_TOKEN"
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


	public PirateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pirate.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00d5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\7\rv\n\r\f\r\16\ry\13\r\3\16\6\16|\n\16\r\16\16\16}\3\17\6\17\u0081"+
		"\n\17\r\17\16\17\u0082\3\17\3\17\6\17\u0087\n\17\r\17\16\17\u0088\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \2\2"+
		"!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00d8\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2"+
		"\13N\3\2\2\2\rP\3\2\2\2\17R\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25c\3\2\2"+
		"\2\27i\3\2\2\2\31s\3\2\2\2\33{\3\2\2\2\35\u0080\3\2\2\2\37\u008a\3\2\2"+
		"\2!\u008e\3\2\2\2#\u0090\3\2\2\2%\u0092\3\2\2\2\'\u0094\3\2\2\2)\u0096"+
		"\3\2\2\2+\u009c\3\2\2\2-\u00a4\3\2\2\2/\u00ab\3\2\2\2\61\u00ae\3\2\2\2"+
		"\63\u00b0\3\2\2\2\65\u00b2\3\2\2\2\67\u00b5\3\2\2\29\u00b8\3\2\2\2;\u00ba"+
		"\3\2\2\2=\u00bf\3\2\2\2?\u00c9\3\2\2\2AB\7}\2\2B\4\3\2\2\2CD\7\177\2\2"+
		"D\6\3\2\2\2EF\7=\2\2F\b\3\2\2\2GH\7f\2\2HI\7w\2\2IJ\7h\2\2JK\7h\2\2KL"+
		"\7n\2\2LM\7g\2\2M\n\3\2\2\2NO\7*\2\2O\f\3\2\2\2PQ\7+\2\2Q\16\3\2\2\2R"+
		"S\7h\2\2ST\7g\2\2TU\7g\2\2UV\7f\2\2VW\7V\2\2WX\7j\2\2XY\7g\2\2YZ\7H\2"+
		"\2Z[\7k\2\2[\\\7u\2\2\\]\7j\2\2]\20\3\2\2\2^_\7)\2\2_\22\3\2\2\2`a\7)"+
		"\2\2ab\7)\2\2b\24\3\2\2\2cd\7c\2\2de\7x\2\2ef\7c\2\2fg\7u\2\2gh\7v\2\2"+
		"h\26\3\2\2\2ij\7d\2\2jk\7n\2\2kl\7c\2\2lm\7e\2\2mn\7m\2\2no\7u\2\2op\7"+
		"r\2\2pq\7q\2\2qr\7v\2\2r\30\3\2\2\2sw\t\2\2\2tv\t\3\2\2ut\3\2\2\2vy\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2x\32\3\2\2\2yw\3\2\2\2z|\t\4\2\2{z\3\2\2\2|"+
		"}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\34\3\2\2\2\177\u0081\t\4\2\2\u0080\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0086\7\60\2\2\u0085\u0087\t\4\2\2\u0086\u0085\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\36\3\2\2\2\u008a\u008b\t\5\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\20\2"+
		"\2\u008d \3\2\2\2\u008e\u008f\7,\2\2\u008f\"\3\2\2\2\u0090\u0091\7\61"+
		"\2\2\u0091$\3\2\2\2\u0092\u0093\7-\2\2\u0093&\3\2\2\2\u0094\u0095\7/\2"+
		"\2\u0095(\3\2\2\2\u0096\u0097\7d\2\2\u0097\u0098\7q\2\2\u0098\u0099\7"+
		"q\2\2\u0099\u009a\7v\2\2\u009a\u009b\7{\2\2\u009b*\3\2\2\2\u009c\u009d"+
		"\7r\2\2\u009d\u009e\7k\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7n\2\2\u00a0"+
		"\u00a1\7c\2\2\u00a1\u00a2\7i\2\2\u00a2\u00a3\7g\2\2\u00a3,\3\2\2\2\u00a4"+
		"\u00a5\7[\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7J\2\2\u00a7\u00a8\7q\2\2"+
		"\u00a8\u00a9\7J\2\2\u00a9\u00aa\7q\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7?\2"+
		"\2\u00ac\u00ad\7?\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7>\2\2\u00af\62\3\2"+
		"\2\2\u00b0\u00b1\7@\2\2\u00b1\64\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4\66\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6\u00b7\7?\2\2\u00b78"+
		"\3\2\2\2\u00b8\u00b9\7.\2\2\u00b9:\3\2\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc"+
		"\7j\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7{\2\2\u00be<\3\2\2\2\u00bf\u00c0"+
		"\7c\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7{\2\2\u00c3"+
		"\u00c4\7O\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7g\2\2"+
		"\u00c7\u00c8\7{\2\2\u00c8>\3\2\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7y\2"+
		"\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce\7V\2\2\u00ce\u00cf"+
		"\7j\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7F\2\2\u00d1\u00d2\7g\2\2\u00d2"+
		"\u00d3\7e\2\2\u00d3\u00d4\7m\2\2\u00d4@\3\2\2\2\7\2w}\u0082\u0088\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}