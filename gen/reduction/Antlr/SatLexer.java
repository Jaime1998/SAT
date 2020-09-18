// Generated from C:/Users/57310/Documents/Github/SAT/src/reduction/Antlr\SatLexer.g4 by ANTLR 4.8
package reduction.Antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, START=2, P=3, CNF=4, NUMBER=5, BREAK=6, WS=7;
	public static final int
		HEADER=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "HEADER"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "START", "P", "CNF", "DIGIT", "NUMBER", "BREAK", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'p'", "'cnf'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "START", "P", "CNF", "NUMBER", "BREAK", "WS"
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


	public SatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SatLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t>\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2"+
		"\27\n\2\f\2\16\2\32\13\2\3\3\5\3\35\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\5\7,\n\7\3\7\6\7/\n\7\r\7\16\7\60\3\b\5\b\64\n"+
		"\b\3\b\3\b\3\t\6\t9\n\t\r\t\16\t:\3\t\3\t\2\2\n\4\3\6\4\b\5\n\6\f\2\16"+
		"\7\20\b\22\t\4\2\3\5\4\2\f\f\17\17\3\2\62;\4\2\13\13\"\"\2A\2\4\3\2\2"+
		"\2\2\6\3\2\2\2\2\b\3\2\2\2\3\n\3\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22"+
		"\3\2\2\2\4\24\3\2\2\2\6\34\3\2\2\2\b \3\2\2\2\n$\3\2\2\2\f(\3\2\2\2\16"+
		"+\3\2\2\2\20\63\3\2\2\2\228\3\2\2\2\24\30\7e\2\2\25\27\n\2\2\2\26\25\3"+
		"\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\32\30\3"+
		"\2\2\2\33\35\7\17\2\2\34\33\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37"+
		"\7\f\2\2\37\7\3\2\2\2 !\7r\2\2!\"\3\2\2\2\"#\b\4\2\2#\t\3\2\2\2$%\7e\2"+
		"\2%&\7p\2\2&\'\7h\2\2\'\13\3\2\2\2()\t\3\2\2)\r\3\2\2\2*,\7/\2\2+*\3\2"+
		"\2\2+,\3\2\2\2,.\3\2\2\2-/\5\f\6\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60"+
		"\61\3\2\2\2\61\17\3\2\2\2\62\64\7\17\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\7\f\2\2\66\21\3\2\2\2\679\t\4\2\28\67\3\2\2\29:\3\2"+
		"\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\b\t\3\2=\23\3\2\2\2\n\2\3\30\34+"+
		"\60\63:\4\7\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}