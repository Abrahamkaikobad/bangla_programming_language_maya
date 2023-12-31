// Generated from E:/ANTRL4_PROJECTS/CSE425_Report\BanglaGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BanglaGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, TOKEN_PurnoShongkha=22, TOKEN_Ashol=23, 
		TOKEN_Jodi=24, TOKEN_Operator=25, TOKEN_Symbol=26, RESERVED_Or=27, RESERVED_Ashol=28, 
		RESERVED_Evong=29, RESERVED_Jokhon=30, RESERVED_Jodi=31, RESERVED_Input=32, 
		RESERVED_Chapao=33, RESERVED_Function=34, RESERVED_TYPE=35, Identifier=36, 
		INTEGER=37, DECIMAL=38, STRING=39, WS=40, LINE_COMMENT=41, MULTILINE_COMMENT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "TOKEN_PurnoShongkha", "TOKEN_Ashol", 
			"TOKEN_Jodi", "TOKEN_Operator", "TOKEN_Symbol", "RESERVED_Or", "RESERVED_Ashol", 
			"RESERVED_Evong", "RESERVED_Jokhon", "RESERVED_Jodi", "RESERVED_Input", 
			"RESERVED_Chapao", "RESERVED_Function", "RESERVED_TYPE", "Letter", "Digit", 
			"IdentifierStart", "IdentifierPart", "Identifier", "INTEGER", "DECIMAL", 
			"STRING", "WS", "LINE_COMMENT", "MULTILINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'('", "')'", "','", "'{'", "'}'", "'!'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'\\u09AA\\u09C2\\u09B0\\u09CD\\u09A3\\u09B8\\u0982\\u0996\\u09CD\\u09AF\\u09BE'", 
			null, null, "'operator'", "'symbols'", "'\\u0985\\u09A5\\u09AC\\u09BE'", 
			null, "'\\u098F\\u09AC\\u0982'", "'\\u09AF\\u0996\\u09A8'", null, "'\\u0987\\u09A8\\u09AA\\u09C1\\u099F'", 
			"'\\u099B\\u09BE\\u09AA\\u09BE\\u0993'", "'\\u09AB\\u09BE\\u0999\\u09CD\\u0995\\u09B6\\u09A8'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "TOKEN_PurnoShongkha", 
			"TOKEN_Ashol", "TOKEN_Jodi", "TOKEN_Operator", "TOKEN_Symbol", "RESERVED_Or", 
			"RESERVED_Ashol", "RESERVED_Evong", "RESERVED_Jokhon", "RESERVED_Jodi", 
			"RESERVED_Input", "RESERVED_Chapao", "RESERVED_Function", "RESERVED_TYPE", 
			"Identifier", "INTEGER", "DECIMAL", "STRING", "WS", "LINE_COMMENT", "MULTILINE_COMMENT"
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


	public BanglaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BanglaGrammar.g4"; }

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
		"\u0004\u0000*\u0132\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u00ec\b\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001%\u0001%\u0003%\u00f4\b%\u0001&\u0001&\u0001"+
		"&\u0003&\u00f9\b&\u0001\'\u0001\'\u0005\'\u00fd\b\'\n\'\f\'\u0100\t\'"+
		"\u0001(\u0004(\u0103\b(\u000b(\f(\u0104\u0001)\u0004)\u0108\b)\u000b)"+
		"\f)\u0109\u0001)\u0001)\u0004)\u010e\b)\u000b)\f)\u010f\u0001*\u0001*"+
		"\u0005*\u0114\b*\n*\f*\u0117\t*\u0001*\u0001*\u0001+\u0004+\u011c\b+\u000b"+
		"+\f+\u011d\u0001+\u0001+\u0001,\u0001,\u0005,\u0124\b,\n,\f,\u0127\t,"+
		"\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0000\u0000.\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#G\u0000I\u0000K\u0000M\u0000O$Q%S&U\'W(Y)[*\u0001\u0000\u0004"+
		"\u0003\u0000\u0995\u09c5\u09cb\u09ce\u09dc\u09e1\u0002\u0000\n\n\r\r\u0003"+
		"\u0000\t\n\r\r  \u0001\u0000##\u0138\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000"+
		"Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001"+
		"\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000"+
		"\u0000\u0000[\u0001\u0000\u0000\u0000\u0001]\u0001\u0000\u0000\u0000\u0003"+
		"_\u0001\u0000\u0000\u0000\u0005a\u0001\u0000\u0000\u0000\u0007c\u0001"+
		"\u0000\u0000\u0000\te\u0001\u0000\u0000\u0000\u000bg\u0001\u0000\u0000"+
		"\u0000\ri\u0001\u0000\u0000\u0000\u000fk\u0001\u0000\u0000\u0000\u0011"+
		"m\u0001\u0000\u0000\u0000\u0013o\u0001\u0000\u0000\u0000\u0015q\u0001"+
		"\u0000\u0000\u0000\u0017s\u0001\u0000\u0000\u0000\u0019u\u0001\u0000\u0000"+
		"\u0000\u001bw\u0001\u0000\u0000\u0000\u001dz\u0001\u0000\u0000\u0000\u001f"+
		"}\u0001\u0000\u0000\u0000!\u0080\u0001\u0000\u0000\u0000#\u0083\u0001"+
		"\u0000\u0000\u0000%\u0085\u0001\u0000\u0000\u0000\'\u0087\u0001\u0000"+
		"\u0000\u0000)\u008a\u0001\u0000\u0000\u0000+\u008d\u0001\u0000\u0000\u0000"+
		"-\u0099\u0001\u0000\u0000\u0000/\u009d\u0001\u0000\u0000\u00001\u00a1"+
		"\u0001\u0000\u0000\u00003\u00aa\u0001\u0000\u0000\u00005\u00b2\u0001\u0000"+
		"\u0000\u00007\u00b7\u0001\u0000\u0000\u00009\u00bb\u0001\u0000\u0000\u0000"+
		";\u00bf\u0001\u0000\u0000\u0000=\u00c3\u0001\u0000\u0000\u0000?\u00c7"+
		"\u0001\u0000\u0000\u0000A\u00cd\u0001\u0000\u0000\u0000C\u00d3\u0001\u0000"+
		"\u0000\u0000E\u00eb\u0001\u0000\u0000\u0000G\u00ed\u0001\u0000\u0000\u0000"+
		"I\u00ef\u0001\u0000\u0000\u0000K\u00f3\u0001\u0000\u0000\u0000M\u00f8"+
		"\u0001\u0000\u0000\u0000O\u00fa\u0001\u0000\u0000\u0000Q\u0102\u0001\u0000"+
		"\u0000\u0000S\u0107\u0001\u0000\u0000\u0000U\u0111\u0001\u0000\u0000\u0000"+
		"W\u011b\u0001\u0000\u0000\u0000Y\u0121\u0001\u0000\u0000\u0000[\u012a"+
		"\u0001\u0000\u0000\u0000]^\u0005=\u0000\u0000^\u0002\u0001\u0000\u0000"+
		"\u0000_`\u0005;\u0000\u0000`\u0004\u0001\u0000\u0000\u0000ab\u0005(\u0000"+
		"\u0000b\u0006\u0001\u0000\u0000\u0000cd\u0005)\u0000\u0000d\b\u0001\u0000"+
		"\u0000\u0000ef\u0005,\u0000\u0000f\n\u0001\u0000\u0000\u0000gh\u0005{"+
		"\u0000\u0000h\f\u0001\u0000\u0000\u0000ij\u0005}\u0000\u0000j\u000e\u0001"+
		"\u0000\u0000\u0000kl\u0005!\u0000\u0000l\u0010\u0001\u0000\u0000\u0000"+
		"mn\u0005+\u0000\u0000n\u0012\u0001\u0000\u0000\u0000op\u0005-\u0000\u0000"+
		"p\u0014\u0001\u0000\u0000\u0000qr\u0005*\u0000\u0000r\u0016\u0001\u0000"+
		"\u0000\u0000st\u0005/\u0000\u0000t\u0018\u0001\u0000\u0000\u0000uv\u0005"+
		"%\u0000\u0000v\u001a\u0001\u0000\u0000\u0000wx\u0005+\u0000\u0000xy\u0005"+
		"+\u0000\u0000y\u001c\u0001\u0000\u0000\u0000z{\u0005-\u0000\u0000{|\u0005"+
		"-\u0000\u0000|\u001e\u0001\u0000\u0000\u0000}~\u0005=\u0000\u0000~\u007f"+
		"\u0005=\u0000\u0000\u007f \u0001\u0000\u0000\u0000\u0080\u0081\u0005!"+
		"\u0000\u0000\u0081\u0082\u0005=\u0000\u0000\u0082\"\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005>\u0000\u0000\u0084$\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005<\u0000\u0000\u0086&\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		">\u0000\u0000\u0088\u0089\u0005=\u0000\u0000\u0089(\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005<\u0000\u0000\u008b\u008c\u0005=\u0000\u0000\u008c"+
		"*\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u09aa\u0000\u0000\u008e\u008f"+
		"\u0005\u09c2\u0000\u0000\u008f\u0090\u0005\u09b0\u0000\u0000\u0090\u0091"+
		"\u0005\u09cd\u0000\u0000\u0091\u0092\u0005\u09a3\u0000\u0000\u0092\u0093"+
		"\u0005\u09b8\u0000\u0000\u0093\u0094\u0005\u0982\u0000\u0000\u0094\u0095"+
		"\u0005\u0996\u0000\u0000\u0095\u0096\u0005\u09cd\u0000\u0000\u0096\u0097"+
		"\u0005\u09af\u0000\u0000\u0097\u0098\u0005\u09be\u0000\u0000\u0098,\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\u0986\u0000\u0000\u009a\u009b\u0005"+
		"\u09b8\u0000\u0000\u009b\u009c\u0005\u09b2\u0000\u0000\u009c.\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005\u09af\u0000\u0000\u009e\u009f\u0005\u09a6"+
		"\u0000\u0000\u009f\u00a0\u0005\u09bf\u0000\u0000\u00a00\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005o\u0000\u0000\u00a2\u00a3\u0005p\u0000\u0000\u00a3"+
		"\u00a4\u0005e\u0000\u0000\u00a4\u00a5\u0005r\u0000\u0000\u00a5\u00a6\u0005"+
		"a\u0000\u0000\u00a6\u00a7\u0005t\u0000\u0000\u00a7\u00a8\u0005o\u0000"+
		"\u0000\u00a8\u00a9\u0005r\u0000\u0000\u00a92\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0005s\u0000\u0000\u00ab\u00ac\u0005y\u0000\u0000\u00ac\u00ad\u0005"+
		"m\u0000\u0000\u00ad\u00ae\u0005b\u0000\u0000\u00ae\u00af\u0005o\u0000"+
		"\u0000\u00af\u00b0\u0005l\u0000\u0000\u00b0\u00b1\u0005s\u0000\u0000\u00b1"+
		"4\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0985\u0000\u0000\u00b3\u00b4"+
		"\u0005\u09a5\u0000\u0000\u00b4\u00b5\u0005\u09ac\u0000\u0000\u00b5\u00b6"+
		"\u0005\u09be\u0000\u0000\u00b66\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"\u0986\u0000\u0000\u00b8\u00b9\u0005\u09b8\u0000\u0000\u00b9\u00ba\u0005"+
		"\u09b2\u0000\u0000\u00ba8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u098f"+
		"\u0000\u0000\u00bc\u00bd\u0005\u09ac\u0000\u0000\u00bd\u00be\u0005\u0982"+
		"\u0000\u0000\u00be:\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u09af\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0996\u0000\u0000\u00c1\u00c2\u0005\u09a8\u0000"+
		"\u0000\u00c2<\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u09af\u0000\u0000"+
		"\u00c4\u00c5\u0005\u09a6\u0000\u0000\u00c5\u00c6\u0005\u09bf\u0000\u0000"+
		"\u00c6>\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0987\u0000\u0000\u00c8"+
		"\u00c9\u0005\u09a8\u0000\u0000\u00c9\u00ca\u0005\u09aa\u0000\u0000\u00ca"+
		"\u00cb\u0005\u09c1\u0000\u0000\u00cb\u00cc\u0005\u099f\u0000\u0000\u00cc"+
		"@\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u099b\u0000\u0000\u00ce\u00cf"+
		"\u0005\u09be\u0000\u0000\u00cf\u00d0\u0005\u09aa\u0000\u0000\u00d0\u00d1"+
		"\u0005\u09be\u0000\u0000\u00d1\u00d2\u0005\u0993\u0000\u0000\u00d2B\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005\u09ab\u0000\u0000\u00d4\u00d5\u0005"+
		"\u09be\u0000\u0000\u00d5\u00d6\u0005\u0999\u0000\u0000\u00d6\u00d7\u0005"+
		"\u09cd\u0000\u0000\u00d7\u00d8\u0005\u0995\u0000\u0000\u00d8\u00d9\u0005"+
		"\u09b6\u0000\u0000\u00d9\u00da\u0005\u09a8\u0000\u0000\u00daD\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005\u09aa\u0000\u0000\u00dc\u00dd\u0005\u09c2"+
		"\u0000\u0000\u00dd\u00de\u0005\u09b0\u0000\u0000\u00de\u00df\u0005\u09cd"+
		"\u0000\u0000\u00df\u00e0\u0005\u09a3\u0000\u0000\u00e0\u00e1\u0005\u09b8"+
		"\u0000\u0000\u00e1\u00e2\u0005\u0982\u0000\u0000\u00e2\u00e3\u0005\u0996"+
		"\u0000\u0000\u00e3\u00e4\u0005\u09cd\u0000\u0000\u00e4\u00e5\u0005\u09af"+
		"\u0000\u0000\u00e5\u00ec\u0005\u09be\u0000\u0000\u00e6\u00e7\u0005\u09a6"+
		"\u0000\u0000\u00e7\u00e8\u0005\u09b6\u0000\u0000\u00e8\u00e9\u0005\u09ae"+
		"\u0000\u0000\u00e9\u00ea\u0005\u09bf\u0000\u0000\u00ea\u00ec\u0005\u0995"+
		"\u0000\u0000\u00eb\u00db\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000"+
		"\u0000\u0000\u00ecF\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0000\u0000"+
		"\u0000\u00eeH\u0001\u0000\u0000\u0000\u00ef\u00f0\u0002\u09e6\u09ef\u0000"+
		"\u00f0J\u0001\u0000\u0000\u0000\u00f1\u00f4\u0003G#\u0000\u00f2\u00f4"+
		"\u0005_\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4L\u0001\u0000\u0000\u0000\u00f5\u00f9\u0003G#"+
		"\u0000\u00f6\u00f9\u0003I$\u0000\u00f7\u00f9\u0005_\u0000\u0000\u00f8"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9N\u0001\u0000\u0000\u0000\u00fa\u00fe"+
		"\u0003K%\u0000\u00fb\u00fd\u0003M&\u0000\u00fc\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ffP\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0103\u0003I$\u0000\u0102\u0101"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105R\u0001"+
		"\u0000\u0000\u0000\u0106\u0108\u0003I$\u0000\u0107\u0106\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u010d\u0005.\u0000\u0000\u010c\u010e\u0003I$\u0000\u010d"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"T\u0001\u0000\u0000\u0000\u0111\u0115\u0005\"\u0000\u0000\u0112\u0114"+
		"\b\u0001\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001"+
		"\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0005\"\u0000\u0000\u0119V\u0001\u0000"+
		"\u0000\u0000\u011a\u011c\u0007\u0002\u0000\u0000\u011b\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0006+\u0000\u0000\u0120X\u0001\u0000\u0000\u0000"+
		"\u0121\u0125\u0005#\u0000\u0000\u0122\u0124\b\u0001\u0000\u0000\u0123"+
		"\u0122\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"\u0128\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0006,\u0000\u0000\u0129Z\u0001\u0000\u0000\u0000\u012a\u012b\u0005"+
		"#\u0000\u0000\u012b\u012c\u0005.\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\b\u0003\u0000\u0000\u012e\u012f\u0005#\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0006-\u0000\u0000\u0131"+
		"\\\u0001\u0000\u0000\u0000\u000b\u0000\u00eb\u00f3\u00f8\u00fe\u0104\u0109"+
		"\u010f\u0115\u011d\u0125\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}