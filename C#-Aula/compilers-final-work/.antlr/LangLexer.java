// Generated from /media/felipe/HD/Programação/Compiladores/C#-Aula/compilers-final-work/Lang.g4 by ANTLR 4.9.2
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
		SEP=1, OE=2, CE=3, OB=4, CB=5, AT=6, PLUS=7, MINUS=8, MULT=9, DIV=10, 
		AND=11, OR=12, NOT=13, EQ=14, LT=15, GT=16, LE=17, GE=18, NE=19, BOOL_TRUE=20, 
		BOL_FALSE=21, FUNCTION=22, RETURN=23, IF=24, WHILE=25, DO=26, THEN=27, 
		ELSE=28, WRITE=29, READ=30, STR=31, EOL=32, NUM=33, VAR=34, COMMENT=35, 
		WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEP", "OE", "CE", "OB", "CB", "AT", "PLUS", "MINUS", "MULT", "DIV", 
			"AND", "OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", 
			"BOL_FALSE", "FUNCTION", "RETURN", "IF", "WHILE", "DO", "THEN", "ELSE", 
			"WRITE", "READ", "STR", "EOL", "NUM", "VAR", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'{'", "'}'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'&&'", "'||'", "'!'", "'=='", "'<'", "'>'", "'<='", "'>='", "'!='", 
			"'true'", "'false'", null, null, null, null, null, null, null, null, 
			null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEP", "OE", "CE", "OB", "CB", "AT", "PLUS", "MINUS", "MULT", "DIV", 
			"AND", "OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", 
			"BOL_FALSE", "FUNCTION", "RETURN", "IF", "WHILE", "DO", "THEN", "ELSE", 
			"WRITE", "READ", "STR", "EOL", "NUM", "VAR", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00e2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \7 \u00b6\n \f \16 \u00b9\13"+
		" \3 \3 \3!\3!\3\"\6\"\u00c0\n\"\r\"\16\"\u00c1\3\"\3\"\6\"\u00c6\n\"\r"+
		"\"\16\"\u00c7\5\"\u00ca\n\"\3#\6#\u00cd\n#\r#\16#\u00ce\3$\3$\3$\3$\7"+
		"$\u00d5\n$\f$\16$\u00d8\13$\3$\3$\3%\6%\u00dd\n%\r%\16%\u00de\3%\3%\2"+
		"\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&\3\2\26\4\2HHhh\4\2WWww\4\2PPpp\4\2EEee\4\2VVvv\4\2"+
		"KKkk\4\2QQqq\4\2TTtt\4\2GGgg\4\2YYyy\4\2JJjj\4\2NNnn\4\2FFff\4\2UUuu\4"+
		"\2CCcc\3\2$$\3\2\62;\4\2C\\c|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00e8"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2"+
		"\rU\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2\23[\3\2\2\2\25]\3\2\2\2\27_\3\2\2"+
		"\2\31b\3\2\2\2\33e\3\2\2\2\35g\3\2\2\2\37j\3\2\2\2!l\3\2\2\2#n\3\2\2\2"+
		"%q\3\2\2\2\'t\3\2\2\2)w\3\2\2\2+|\3\2\2\2-\u0082\3\2\2\2/\u008b\3\2\2"+
		"\2\61\u0092\3\2\2\2\63\u0095\3\2\2\2\65\u009b\3\2\2\2\67\u009e\3\2\2\2"+
		"9\u00a3\3\2\2\2;\u00a8\3\2\2\2=\u00ae\3\2\2\2?\u00b3\3\2\2\2A\u00bc\3"+
		"\2\2\2C\u00bf\3\2\2\2E\u00cc\3\2\2\2G\u00d0\3\2\2\2I\u00dc\3\2\2\2KL\7"+
		".\2\2L\4\3\2\2\2MN\7*\2\2N\6\3\2\2\2OP\7+\2\2P\b\3\2\2\2QR\7}\2\2R\n\3"+
		"\2\2\2ST\7\177\2\2T\f\3\2\2\2UV\7?\2\2V\16\3\2\2\2WX\7-\2\2X\20\3\2\2"+
		"\2YZ\7/\2\2Z\22\3\2\2\2[\\\7,\2\2\\\24\3\2\2\2]^\7\61\2\2^\26\3\2\2\2"+
		"_`\7(\2\2`a\7(\2\2a\30\3\2\2\2bc\7~\2\2cd\7~\2\2d\32\3\2\2\2ef\7#\2\2"+
		"f\34\3\2\2\2gh\7?\2\2hi\7?\2\2i\36\3\2\2\2jk\7>\2\2k \3\2\2\2lm\7@\2\2"+
		"m\"\3\2\2\2no\7>\2\2op\7?\2\2p$\3\2\2\2qr\7@\2\2rs\7?\2\2s&\3\2\2\2tu"+
		"\7#\2\2uv\7?\2\2v(\3\2\2\2wx\7v\2\2xy\7t\2\2yz\7w\2\2z{\7g\2\2{*\3\2\2"+
		"\2|}\7h\2\2}~\7c\2\2~\177\7n\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081"+
		",\3\2\2\2\u0082\u0083\t\2\2\2\u0083\u0084\t\3\2\2\u0084\u0085\t\4\2\2"+
		"\u0085\u0086\t\5\2\2\u0086\u0087\t\6\2\2\u0087\u0088\t\7\2\2\u0088\u0089"+
		"\t\b\2\2\u0089\u008a\t\4\2\2\u008a.\3\2\2\2\u008b\u008c\t\t\2\2\u008c"+
		"\u008d\t\n\2\2\u008d\u008e\t\6\2\2\u008e\u008f\t\3\2\2\u008f\u0090\t\t"+
		"\2\2\u0090\u0091\t\4\2\2\u0091\60\3\2\2\2\u0092\u0093\t\7\2\2\u0093\u0094"+
		"\t\2\2\2\u0094\62\3\2\2\2\u0095\u0096\t\13\2\2\u0096\u0097\t\f\2\2\u0097"+
		"\u0098\t\7\2\2\u0098\u0099\t\r\2\2\u0099\u009a\t\n\2\2\u009a\64\3\2\2"+
		"\2\u009b\u009c\t\16\2\2\u009c\u009d\t\b\2\2\u009d\66\3\2\2\2\u009e\u009f"+
		"\t\6\2\2\u009f\u00a0\t\f\2\2\u00a0\u00a1\t\n\2\2\u00a1\u00a2\t\4\2\2\u00a2"+
		"8\3\2\2\2\u00a3\u00a4\t\n\2\2\u00a4\u00a5\t\r\2\2\u00a5\u00a6\t\17\2\2"+
		"\u00a6\u00a7\t\n\2\2\u00a7:\3\2\2\2\u00a8\u00a9\t\13\2\2\u00a9\u00aa\t"+
		"\t\2\2\u00aa\u00ab\t\7\2\2\u00ab\u00ac\t\6\2\2\u00ac\u00ad\t\n\2\2\u00ad"+
		"<\3\2\2\2\u00ae\u00af\t\t\2\2\u00af\u00b0\t\n\2\2\u00b0\u00b1\t\20\2\2"+
		"\u00b1\u00b2\t\16\2\2\u00b2>\3\2\2\2\u00b3\u00b7\7$\2\2\u00b4\u00b6\n"+
		"\21\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7$"+
		"\2\2\u00bb@\3\2\2\2\u00bc\u00bd\7=\2\2\u00bdB\3\2\2\2\u00be\u00c0\t\22"+
		"\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c9\3\2\2\2\u00c3\u00c5\13\2\2\2\u00c4\u00c6\t"+
		"\22\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00caD\3\2\2\2\u00cb\u00cd\t\23\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cfF\3\2\2\2\u00d0"+
		"\u00d1\7\61\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\n"+
		"\24\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\b$"+
		"\2\2\u00daH\3\2\2\2\u00db\u00dd\t\25\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\b%\2\2\u00e1J\3\2\2\2\n\2\u00b7\u00c1\u00c7\u00c9\u00ce\u00d6\u00de"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}