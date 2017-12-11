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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PROGRAM=11, VAR=12, BEGIN=13, END=14, IDENTIFIER=15, INTEGER=16, 
		FLOAT=17, MUL_OP=18, DIV_OP=19, ADD_OP=20, SUB_OP=21, NEWLINE=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "PROGRAM", "VAR", "BEGIN", "END", "IDENTIFIER", "INTEGER", "FLOAT", 
		"MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "':'", "','", "':='", "'('", "')'", "'feedTheFish'", 
		"'''", "''''", "'PROGRAM'", "'VAR'", "'BEGIN'", "'END'", null, null, null, 
		"'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "PROGRAM", 
		"VAR", "BEGIN", "END", "IDENTIFIER", "INTEGER", "FLOAT", "MUL_OP", "DIV_OP", 
		"ADD_OP", "SUB_OP", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\7\20j\n\20\f\20\16\20m\13\20\3\21\6\21p\n\21"+
		"\r\21\16\21q\3\22\6\22u\n\22\r\22\16\22v\3\22\3\22\6\22{\n\22\r\22\16"+
		"\22|\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\5\27\u0088\n\27\3\27"+
		"\3\27\3\27\3\27\3\30\6\30\u008f\n\30\r\30\16\30\u0090\3\30\3\30\2\2\31"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\6\4\2C\\c|\5\2\62;C\\c|\3"+
		"\2\62;\4\2\13\13\"\"\2\u0099\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t"+
		"\67\3\2\2\2\139\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23L\3\2\2\2"+
		"\25N\3\2\2\2\27Q\3\2\2\2\31Y\3\2\2\2\33]\3\2\2\2\35c\3\2\2\2\37g\3\2\2"+
		"\2!o\3\2\2\2#t\3\2\2\2%~\3\2\2\2\'\u0080\3\2\2\2)\u0082\3\2\2\2+\u0084"+
		"\3\2\2\2-\u0087\3\2\2\2/\u008e\3\2\2\2\61\62\7\60\2\2\62\4\3\2\2\2\63"+
		"\64\7=\2\2\64\6\3\2\2\2\65\66\7<\2\2\66\b\3\2\2\2\678\7.\2\28\n\3\2\2"+
		"\29:\7<\2\2:;\7?\2\2;\f\3\2\2\2<=\7*\2\2=\16\3\2\2\2>?\7+\2\2?\20\3\2"+
		"\2\2@A\7h\2\2AB\7g\2\2BC\7g\2\2CD\7f\2\2DE\7V\2\2EF\7j\2\2FG\7g\2\2GH"+
		"\7H\2\2HI\7k\2\2IJ\7u\2\2JK\7j\2\2K\22\3\2\2\2LM\7)\2\2M\24\3\2\2\2NO"+
		"\7)\2\2OP\7)\2\2P\26\3\2\2\2QR\7R\2\2RS\7T\2\2ST\7Q\2\2TU\7I\2\2UV\7T"+
		"\2\2VW\7C\2\2WX\7O\2\2X\30\3\2\2\2YZ\7X\2\2Z[\7C\2\2[\\\7T\2\2\\\32\3"+
		"\2\2\2]^\7D\2\2^_\7G\2\2_`\7I\2\2`a\7K\2\2ab\7P\2\2b\34\3\2\2\2cd\7G\2"+
		"\2de\7P\2\2ef\7F\2\2f\36\3\2\2\2gk\t\2\2\2hj\t\3\2\2ih\3\2\2\2jm\3\2\2"+
		"\2ki\3\2\2\2kl\3\2\2\2l \3\2\2\2mk\3\2\2\2np\t\4\2\2on\3\2\2\2pq\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2r\"\3\2\2\2su\t\4\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2"+
		"\2\2vw\3\2\2\2wx\3\2\2\2xz\7\60\2\2y{\t\4\2\2zy\3\2\2\2{|\3\2\2\2|z\3"+
		"\2\2\2|}\3\2\2\2}$\3\2\2\2~\177\7,\2\2\177&\3\2\2\2\u0080\u0081\7\61\2"+
		"\2\u0081(\3\2\2\2\u0082\u0083\7-\2\2\u0083*\3\2\2\2\u0084\u0085\7/\2\2"+
		"\u0085,\3\2\2\2\u0086\u0088\7\17\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\f\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\b\27\2\2\u008c.\3\2\2\2\u008d\u008f\t\5\2\2\u008e\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\b\30\2\2\u0093\60\3\2\2\2\t\2kqv|\u0087\u0090\3\b"+
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