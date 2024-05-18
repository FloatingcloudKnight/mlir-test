// Generated from /mnt/d/llvm/mytoy/mytest/Toy.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ToyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ParentheseOpen=1, ParentheseClose=2, BracketOpen=3, BracketClose=4, SbracketOpen=5, 
		SbracketClose=6, Return=7, Semicolon=8, Var=9, Def=10, Struct=11, Identifier=12, 
		Number=13, Equal=14, AngleBracketsOpen=15, AngleBracketsClose=16, Comma=17, 
		Add=18, Mul=19, Dot=20, WS=21, Comment=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ParentheseOpen", "ParentheseClose", "BracketOpen", "BracketClose", "SbracketOpen", 
			"SbracketClose", "Return", "Semicolon", "Var", "Def", "Struct", "Identifier", 
			"Number", "Equal", "AngleBracketsOpen", "AngleBracketsClose", "Comma", 
			"Add", "Mul", "Dot", "WS", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'return'", "';'", "'var'", 
			"'def'", "'struct'", null, null, "'='", "'<'", "'>'", "','", "'+'", "'*'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ParentheseOpen", "ParentheseClose", "BracketOpen", "BracketClose", 
			"SbracketOpen", "SbracketClose", "Return", "Semicolon", "Var", "Def", 
			"Struct", "Identifier", "Number", "Equal", "AngleBracketsOpen", "AngleBracketsClose", 
			"Comma", "Add", "Mul", "Dot", "WS", "Comment"
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


	public ToyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Toy.g4"; }

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
		"\u0004\u0000\u0016z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"T\b\u000b\n\u000b\f\u000bW\t\u000b\u0001\f\u0004\fZ\b\f\u000b\f\f\f[\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0005\u0015r\b\u0015\n\u0015\f\u0015u\t\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001s\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0004\u0002\u0000"+
		"AZaz\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  |\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000"+
		"\u0000\u00051\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t"+
		"5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000"+
		"\u0000\u0000\u000f@\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000"+
		"\u0013F\u0001\u0000\u0000\u0000\u0015J\u0001\u0000\u0000\u0000\u0017Q"+
		"\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000\u0000\u001b]\u0001\u0000"+
		"\u0000\u0000\u001d_\u0001\u0000\u0000\u0000\u001fa\u0001\u0000\u0000\u0000"+
		"!c\u0001\u0000\u0000\u0000#e\u0001\u0000\u0000\u0000%g\u0001\u0000\u0000"+
		"\u0000\'i\u0001\u0000\u0000\u0000)k\u0001\u0000\u0000\u0000+o\u0001\u0000"+
		"\u0000\u0000-.\u0005(\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005"+
		")\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005{\u0000\u00002\u0006"+
		"\u0001\u0000\u0000\u000034\u0005}\u0000\u00004\b\u0001\u0000\u0000\u0000"+
		"56\u0005[\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005]\u0000\u0000"+
		"8\f\u0001\u0000\u0000\u00009:\u0005r\u0000\u0000:;\u0005e\u0000\u0000"+
		";<\u0005t\u0000\u0000<=\u0005u\u0000\u0000=>\u0005r\u0000\u0000>?\u0005"+
		"n\u0000\u0000?\u000e\u0001\u0000\u0000\u0000@A\u0005;\u0000\u0000A\u0010"+
		"\u0001\u0000\u0000\u0000BC\u0005v\u0000\u0000CD\u0005a\u0000\u0000DE\u0005"+
		"r\u0000\u0000E\u0012\u0001\u0000\u0000\u0000FG\u0005d\u0000\u0000GH\u0005"+
		"e\u0000\u0000HI\u0005f\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JK\u0005"+
		"s\u0000\u0000KL\u0005t\u0000\u0000LM\u0005r\u0000\u0000MN\u0005u\u0000"+
		"\u0000NO\u0005c\u0000\u0000OP\u0005t\u0000\u0000P\u0016\u0001\u0000\u0000"+
		"\u0000QU\u0007\u0000\u0000\u0000RT\u0007\u0001\u0000\u0000SR\u0001\u0000"+
		"\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000V\u0018\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000XZ\u0007\u0002\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u001a"+
		"\u0001\u0000\u0000\u0000]^\u0005=\u0000\u0000^\u001c\u0001\u0000\u0000"+
		"\u0000_`\u0005<\u0000\u0000`\u001e\u0001\u0000\u0000\u0000ab\u0005>\u0000"+
		"\u0000b \u0001\u0000\u0000\u0000cd\u0005,\u0000\u0000d\"\u0001\u0000\u0000"+
		"\u0000ef\u0005+\u0000\u0000f$\u0001\u0000\u0000\u0000gh\u0005*\u0000\u0000"+
		"h&\u0001\u0000\u0000\u0000ij\u0005.\u0000\u0000j(\u0001\u0000\u0000\u0000"+
		"kl\u0007\u0003\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0006\u0014\u0000"+
		"\u0000n*\u0001\u0000\u0000\u0000os\u0005#\u0000\u0000pr\t\u0000\u0000"+
		"\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vw\u0005\n\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0006"+
		"\u0015\u0000\u0000y,\u0001\u0000\u0000\u0000\u0004\u0000U[s\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}