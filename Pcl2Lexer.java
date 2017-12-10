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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PROGRAM=6, END=7, IDENTIFIER=8, 
		INTEGER=9, FLOAT=10, MUL_OP=11, DIV_OP=12, ADD_OP=13, SUB_OP=14, NEWLINE=15, 
		WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "PROGRAM", "END", "IDENTIFIER", 
		"INTEGER", "FLOAT", "MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "NEWLINE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "','", "'duffle'", "'('", "')'", "'avast'", "'blackspot'", 
		null, null, null, "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "PROGRAM", "END", "IDENTIFIER", "INTEGER", 
		"FLOAT", "MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\tE\n\t\f\t\16\t"+
		"H\13\t\3\n\6\nK\n\n\r\n\16\nL\3\13\6\13P\n\13\r\13\16\13Q\3\13\3\13\6"+
		"\13V\n\13\r\13\16\13W\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\5\20c\n"+
		"\20\3\20\3\20\3\20\3\20\3\21\6\21j\n\21\r\21\16\21k\3\21\3\21\2\2\22\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\13\13\"\"\2t\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2"+
		"\2\2\7\'\3\2\2\2\t.\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\178\3\2\2\2\21"+
		"B\3\2\2\2\23J\3\2\2\2\25O\3\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33]\3\2\2\2"+
		"\35_\3\2\2\2\37b\3\2\2\2!i\3\2\2\2#$\7<\2\2$\4\3\2\2\2%&\7.\2\2&\6\3\2"+
		"\2\2\'(\7f\2\2()\7w\2\2)*\7h\2\2*+\7h\2\2+,\7n\2\2,-\7g\2\2-\b\3\2\2\2"+
		"./\7*\2\2/\n\3\2\2\2\60\61\7+\2\2\61\f\3\2\2\2\62\63\7c\2\2\63\64\7x\2"+
		"\2\64\65\7c\2\2\65\66\7u\2\2\66\67\7v\2\2\67\16\3\2\2\289\7d\2\29:\7n"+
		"\2\2:;\7c\2\2;<\7e\2\2<=\7m\2\2=>\7u\2\2>?\7r\2\2?@\7q\2\2@A\7v\2\2A\20"+
		"\3\2\2\2BF\t\2\2\2CE\t\3\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G"+
		"\22\3\2\2\2HF\3\2\2\2IK\t\4\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2"+
		"\2M\24\3\2\2\2NP\t\4\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2"+
		"\2\2SU\7\60\2\2TV\t\4\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\26"+
		"\3\2\2\2YZ\7,\2\2Z\30\3\2\2\2[\\\7\61\2\2\\\32\3\2\2\2]^\7-\2\2^\34\3"+
		"\2\2\2_`\7/\2\2`\36\3\2\2\2ac\7\17\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2d"+
		"e\7\f\2\2ef\3\2\2\2fg\b\20\2\2g \3\2\2\2hj\t\5\2\2ih\3\2\2\2jk\3\2\2\2"+
		"ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\21\2\2n\"\3\2\2\2\t\2FLQWbk\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}