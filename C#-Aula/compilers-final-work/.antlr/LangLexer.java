// Generated from /home/geovanerigonato/Área de Trabalho/MariaLuisa/Compiladores-main/compilers-final-work-main/Lang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, OE=3, CE=4, OB=5, CB=6, AT=7, SEP=8, PLUS=9, MINUS=10, 
		MULT=11, DIV=12, AND=13, OR=14, NOT=15, EQ=16, LT=17, GT=18, LE=19, GE=20, 
		NE=21, BOOL_TRUE=22, BOL_FALSE=23, IF=24, WHILE=25, DO=26, FOR=27, FUNCTION=28, 
		RETURN=29, THEN=30, ELSE=31, WRITE=32, READ=33, STR=34, EOL=35, NUM=36, 
		VAR=37, COMMENT=38, WS=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "OE", "CE", "OB", "CB", "AT", "SEP", "PLUS", "MINUS", 
			"MULT", "DIV", "AND", "OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", 
			"BOOL_TRUE", "BOL_FALSE", "IF", "WHILE", "DO", "FOR", "FUNCTION", "RETURN", 
			"THEN", "ELSE", "WRITE", "READ", "STR", "EOL", "NUM", "VAR", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'numero'", "'texto'", "'('", "')'", "'{'", "'}'", "'='", "','", 
			"'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'!'", "'=='", "'<'", "'>'", 
			"'<='", "'>='", "'!='", "'true'", "'false'", null, null, null, null, 
			null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "OE", "CE", "OB", "CB", "AT", "SEP", "PLUS", "MINUS", 
			"MULT", "DIV", "AND", "OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", 
			"BOOL_TRUE", "BOL_FALSE", "IF", "WHILE", "DO", "FOR", "FUNCTION", "RETURN", 
			"THEN", "ELSE", "WRITE", "READ", "STR", "EOL", "NUM", "VAR", "COMMENT", 
			"WS"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u00fb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\7#\u00cd\n#\f#\16#\u00d0"+
		"\13#\3#\3#\3$\3$\3%\6%\u00d7\n%\r%\16%\u00d8\3%\3%\6%\u00dd\n%\r%\16%"+
		"\u00de\5%\u00e1\n%\3&\3&\7&\u00e5\n&\f&\16&\u00e8\13&\3\'\3\'\3\'\3\'"+
		"\7\'\u00ee\n\'\f\'\16\'\u00f1\13\'\3\'\3\'\3(\6(\u00f6\n(\r(\16(\u00f7"+
		"\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\27\4\2KKkk\4\2HHhh\4\2YYyy\4\2J"+
		"Jjj\4\2NNnn\4\2GGgg\4\2FFff\4\2QQqq\4\2TTtt\4\2WWww\4\2PPpp\4\2EEee\4"+
		"\2VVvv\4\2UUuu\4\2CCcc\3\2$$\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\2\u0101\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\3Q\3\2\2\2\5X\3\2\2\2\7^\3\2\2\2\t`\3\2\2\2\13b\3\2\2\2\rd\3"+
		"\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25l\3\2\2\2\27n\3\2\2\2\31"+
		"p\3\2\2\2\33r\3\2\2\2\35u\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#}\3\2\2\2%\177"+
		"\3\2\2\2\'\u0081\3\2\2\2)\u0084\3\2\2\2+\u0087\3\2\2\2-\u008a\3\2\2\2"+
		"/\u008f\3\2\2\2\61\u0095\3\2\2\2\63\u0098\3\2\2\2\65\u009e\3\2\2\2\67"+
		"\u00a1\3\2\2\29\u00a5\3\2\2\2;\u00ae\3\2\2\2=\u00b5\3\2\2\2?\u00ba\3\2"+
		"\2\2A\u00bf\3\2\2\2C\u00c5\3\2\2\2E\u00ca\3\2\2\2G\u00d3\3\2\2\2I\u00d6"+
		"\3\2\2\2K\u00e2\3\2\2\2M\u00e9\3\2\2\2O\u00f5\3\2\2\2QR\7p\2\2RS\7w\2"+
		"\2ST\7o\2\2TU\7g\2\2UV\7t\2\2VW\7q\2\2W\4\3\2\2\2XY\7v\2\2YZ\7g\2\2Z["+
		"\7z\2\2[\\\7v\2\2\\]\7q\2\2]\6\3\2\2\2^_\7*\2\2_\b\3\2\2\2`a\7+\2\2a\n"+
		"\3\2\2\2bc\7}\2\2c\f\3\2\2\2de\7\177\2\2e\16\3\2\2\2fg\7?\2\2g\20\3\2"+
		"\2\2hi\7.\2\2i\22\3\2\2\2jk\7-\2\2k\24\3\2\2\2lm\7/\2\2m\26\3\2\2\2no"+
		"\7,\2\2o\30\3\2\2\2pq\7\61\2\2q\32\3\2\2\2rs\7(\2\2st\7(\2\2t\34\3\2\2"+
		"\2uv\7~\2\2vw\7~\2\2w\36\3\2\2\2xy\7#\2\2y \3\2\2\2z{\7?\2\2{|\7?\2\2"+
		"|\"\3\2\2\2}~\7>\2\2~$\3\2\2\2\177\u0080\7@\2\2\u0080&\3\2\2\2\u0081\u0082"+
		"\7>\2\2\u0082\u0083\7?\2\2\u0083(\3\2\2\2\u0084\u0085\7@\2\2\u0085\u0086"+
		"\7?\2\2\u0086*\3\2\2\2\u0087\u0088\7#\2\2\u0088\u0089\7?\2\2\u0089,\3"+
		"\2\2\2\u008a\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d\7w\2\2\u008d"+
		"\u008e\7g\2\2\u008e.\3\2\2\2\u008f\u0090\7h\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7n\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\60\3\2\2\2\u0095"+
		"\u0096\t\2\2\2\u0096\u0097\t\3\2\2\u0097\62\3\2\2\2\u0098\u0099\t\4\2"+
		"\2\u0099\u009a\t\5\2\2\u009a\u009b\t\2\2\2\u009b\u009c\t\6\2\2\u009c\u009d"+
		"\t\7\2\2\u009d\64\3\2\2\2\u009e\u009f\t\b\2\2\u009f\u00a0\t\t\2\2\u00a0"+
		"\66\3\2\2\2\u00a1\u00a2\t\3\2\2\u00a2\u00a3\t\t\2\2\u00a3\u00a4\t\n\2"+
		"\2\u00a48\3\2\2\2\u00a5\u00a6\t\3\2\2\u00a6\u00a7\t\13\2\2\u00a7\u00a8"+
		"\t\f\2\2\u00a8\u00a9\t\r\2\2\u00a9\u00aa\t\16\2\2\u00aa\u00ab\t\2\2\2"+
		"\u00ab\u00ac\t\t\2\2\u00ac\u00ad\t\f\2\2\u00ad:\3\2\2\2\u00ae\u00af\t"+
		"\n\2\2\u00af\u00b0\t\7\2\2\u00b0\u00b1\t\16\2\2\u00b1\u00b2\t\13\2\2\u00b2"+
		"\u00b3\t\n\2\2\u00b3\u00b4\t\f\2\2\u00b4<\3\2\2\2\u00b5\u00b6\t\16\2\2"+
		"\u00b6\u00b7\t\5\2\2\u00b7\u00b8\t\7\2\2\u00b8\u00b9\t\f\2\2\u00b9>\3"+
		"\2\2\2\u00ba\u00bb\t\7\2\2\u00bb\u00bc\t\6\2\2\u00bc\u00bd\t\17\2\2\u00bd"+
		"\u00be\t\7\2\2\u00be@\3\2\2\2\u00bf\u00c0\t\4\2\2\u00c0\u00c1\t\n\2\2"+
		"\u00c1\u00c2\t\2\2\2\u00c2\u00c3\t\16\2\2\u00c3\u00c4\t\7\2\2\u00c4B\3"+
		"\2\2\2\u00c5\u00c6\t\n\2\2\u00c6\u00c7\t\7\2\2\u00c7\u00c8\t\20\2\2\u00c8"+
		"\u00c9\t\b\2\2\u00c9D\3\2\2\2\u00ca\u00ce\7$\2\2\u00cb\u00cd\n\21\2\2"+
		"\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2"+
		"F\3\2\2\2\u00d3\u00d4\7=\2\2\u00d4H\3\2\2\2\u00d5\u00d7\t\22\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00e0\3\2\2\2\u00da\u00dc\13\2\2\2\u00db\u00dd\t\22\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e1\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"J\3\2\2\2\u00e2\u00e6\t\23\2\2\u00e3\u00e5\t\24\2\2\u00e4\u00e3\3\2\2"+
		"\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7L"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\61\2\2\u00ea\u00eb\7\61\2\2"+
		"\u00eb\u00ef\3\2\2\2\u00ec\u00ee\n\25\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f3\b\'\2\2\u00f3N\3\2\2\2\u00f4\u00f6\t\26\2\2"+
		"\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b(\2\2\u00faP\3\2\2\2\n\2\u00ce"+
		"\u00d8\u00de\u00e0\u00e6\u00ef\u00f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}