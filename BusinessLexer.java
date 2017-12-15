// Generated from Business.g4 by ANTLR 4.7.1

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
public class BusinessLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		PROGRAM=25, VAR=26, BEGIN=27, END=28, IDENTIFIER=29, INTEGER=30, FLOAT=31, 
		MUL_OP=32, DIV_OP=33, ADD_OP=34, SUB_OP=35, LineComment=36, NEWLINE=37, 
		WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "PROGRAM", 
		"VAR", "BEGIN", "END", "IDENTIFIER", "INTEGER", "FLOAT", "MUL_OP", "DIV_OP", 
		"ADD_OP", "SUB_OP", "LineComment", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "':'", "','", "':='", "'('", "')'", "'=='", "'!='", 
		"'<'", "'<='", "'>='", "'>'", "'IN'", "'IF'", "'THEN'", "'ELSE'", "'WHILE'", 
		"'DO'", "'FUNCTION'", "'PROCEDURE'", "'PRINT'", "'''", "''''", "'PROGRAM'", 
		"'VAR'", "'BEGIN'", "'END'", null, null, null, "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "PROGRAM", "VAR", "BEGIN", "END", "IDENTIFIER", "INTEGER", "FLOAT", 
		"MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "LineComment", "NEWLINE", "WS"
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


	public BusinessLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Business.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00f3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\7\36\u00be\n\36\f\36\16\36\u00c1\13\36\3\37\6\37\u00c4\n\37\r"+
		"\37\16\37\u00c5\3 \6 \u00c9\n \r \16 \u00ca\3 \3 \6 \u00cf\n \r \16 \u00d0"+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\7%\u00df\n%\f%\16%\u00e2\13%\3"+
		"%\3%\3&\5&\u00e7\n&\3&\3&\3&\3&\3\'\6\'\u00ee\n\'\r\'\16\'\u00ef\3\'\3"+
		"\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\7\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\f"+
		"\f\17\17\4\2\13\13\"\"\2\u00f9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3"+
		"\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rZ\3\2\2\2\17\\\3"+
		"\2\2\2\21^\3\2\2\2\23a\3\2\2\2\25d\3\2\2\2\27f\3\2\2\2\31i\3\2\2\2\33"+
		"l\3\2\2\2\35n\3\2\2\2\37q\3\2\2\2!t\3\2\2\2#y\3\2\2\2%~\3\2\2\2\'\u0084"+
		"\3\2\2\2)\u0087\3\2\2\2+\u0090\3\2\2\2-\u009a\3\2\2\2/\u00a0\3\2\2\2\61"+
		"\u00a2\3\2\2\2\63\u00a5\3\2\2\2\65\u00ad\3\2\2\2\67\u00b1\3\2\2\29\u00b7"+
		"\3\2\2\2;\u00bb\3\2\2\2=\u00c3\3\2\2\2?\u00c8\3\2\2\2A\u00d2\3\2\2\2C"+
		"\u00d4\3\2\2\2E\u00d6\3\2\2\2G\u00d8\3\2\2\2I\u00da\3\2\2\2K\u00e6\3\2"+
		"\2\2M\u00ed\3\2\2\2OP\7\60\2\2P\4\3\2\2\2QR\7=\2\2R\6\3\2\2\2ST\7<\2\2"+
		"T\b\3\2\2\2UV\7.\2\2V\n\3\2\2\2WX\7<\2\2XY\7?\2\2Y\f\3\2\2\2Z[\7*\2\2"+
		"[\16\3\2\2\2\\]\7+\2\2]\20\3\2\2\2^_\7?\2\2_`\7?\2\2`\22\3\2\2\2ab\7#"+
		"\2\2bc\7?\2\2c\24\3\2\2\2de\7>\2\2e\26\3\2\2\2fg\7>\2\2gh\7?\2\2h\30\3"+
		"\2\2\2ij\7@\2\2jk\7?\2\2k\32\3\2\2\2lm\7@\2\2m\34\3\2\2\2no\7K\2\2op\7"+
		"P\2\2p\36\3\2\2\2qr\7K\2\2rs\7H\2\2s \3\2\2\2tu\7V\2\2uv\7J\2\2vw\7G\2"+
		"\2wx\7P\2\2x\"\3\2\2\2yz\7G\2\2z{\7N\2\2{|\7U\2\2|}\7G\2\2}$\3\2\2\2~"+
		"\177\7Y\2\2\177\u0080\7J\2\2\u0080\u0081\7K\2\2\u0081\u0082\7N\2\2\u0082"+
		"\u0083\7G\2\2\u0083&\3\2\2\2\u0084\u0085\7F\2\2\u0085\u0086\7Q\2\2\u0086"+
		"(\3\2\2\2\u0087\u0088\7H\2\2\u0088\u0089\7W\2\2\u0089\u008a\7P\2\2\u008a"+
		"\u008b\7E\2\2\u008b\u008c\7V\2\2\u008c\u008d\7K\2\2\u008d\u008e\7Q\2\2"+
		"\u008e\u008f\7P\2\2\u008f*\3\2\2\2\u0090\u0091\7R\2\2\u0091\u0092\7T\2"+
		"\2\u0092\u0093\7Q\2\2\u0093\u0094\7E\2\2\u0094\u0095\7G\2\2\u0095\u0096"+
		"\7F\2\2\u0096\u0097\7W\2\2\u0097\u0098\7T\2\2\u0098\u0099\7G\2\2\u0099"+
		",\3\2\2\2\u009a\u009b\7R\2\2\u009b\u009c\7T\2\2\u009c\u009d\7K\2\2\u009d"+
		"\u009e\7P\2\2\u009e\u009f\7V\2\2\u009f.\3\2\2\2\u00a0\u00a1\7)\2\2\u00a1"+
		"\60\3\2\2\2\u00a2\u00a3\7)\2\2\u00a3\u00a4\7)\2\2\u00a4\62\3\2\2\2\u00a5"+
		"\u00a6\7R\2\2\u00a6\u00a7\7T\2\2\u00a7\u00a8\7Q\2\2\u00a8\u00a9\7I\2\2"+
		"\u00a9\u00aa\7T\2\2\u00aa\u00ab\7C\2\2\u00ab\u00ac\7O\2\2\u00ac\64\3\2"+
		"\2\2\u00ad\u00ae\7X\2\2\u00ae\u00af\7C\2\2\u00af\u00b0\7T\2\2\u00b0\66"+
		"\3\2\2\2\u00b1\u00b2\7D\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4\7I\2\2\u00b4"+
		"\u00b5\7K\2\2\u00b5\u00b6\7P\2\2\u00b68\3\2\2\2\u00b7\u00b8\7G\2\2\u00b8"+
		"\u00b9\7P\2\2\u00b9\u00ba\7F\2\2\u00ba:\3\2\2\2\u00bb\u00bf\t\2\2\2\u00bc"+
		"\u00be\t\3\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0<\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4"+
		"\t\4\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6>\3\2\2\2\u00c7\u00c9\t\4\2\2\u00c8\u00c7\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00ce\7\60\2\2\u00cd\u00cf\t\4\2\2\u00ce\u00cd\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1@\3"+
		"\2\2\2\u00d2\u00d3\7,\2\2\u00d3B\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5D\3"+
		"\2\2\2\u00d6\u00d7\7-\2\2\u00d7F\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9H\3\2"+
		"\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\7\61\2\2\u00dc\u00e0\3\2\2\2\u00dd"+
		"\u00df\n\5\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\b%\2\2\u00e4J\3\2\2\2\u00e5\u00e7\7\17\2\2\u00e6\u00e5\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\f\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\b&\2\2\u00ebL\3\2\2\2\u00ec\u00ee\t\6\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\b\'\2\2\u00f2N\3\2\2\2\n\2\u00bf\u00c5\u00ca"+
		"\u00d0\u00e0\u00e6\u00ef\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}