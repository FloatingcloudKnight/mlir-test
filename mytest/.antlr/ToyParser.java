// Generated from /mnt/d/llvm/mytoy/mytest/Toy.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ToyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ParentheseOpen=1, ParentheseClose=2, BracketOpen=3, BracketClose=4, SbracketOpen=5, 
		SbracketClose=6, Return=7, Semicolon=8, Var=9, Def=10, Struct=11, Identifier=12, 
		Number=13, Equal=14, AngleBracketsOpen=15, AngleBracketsClose=16, Comma=17, 
		Add=18, Mul=19, Dot=20, WS=21, Comment=22;
	public static final int
		RULE_module = 0, RULE_expression = 1, RULE_identifierExpr = 2, RULE_returnExpr = 3, 
		RULE_tensorLiteral = 4, RULE_varDecl = 5, RULE_type = 6, RULE_funDefine = 7, 
		RULE_prototype = 8, RULE_declList = 9, RULE_block = 10, RULE_blockExpr = 11, 
		RULE_literalList = 12, RULE_structLiteral = 13, RULE_structDefine = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "expression", "identifierExpr", "returnExpr", "tensorLiteral", 
			"varDecl", "type", "funDefine", "prototype", "declList", "block", "blockExpr", 
			"literalList", "structLiteral", "structDefine"
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

	@Override
	public String getGrammarFileName() { return "Toy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  std::vector<double> tensorDataBuffer;

	public ToyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public List<StructDefineContext> structDefine() {
			return getRuleContexts(StructDefineContext.class);
		}
		public StructDefineContext structDefine(int i) {
			return getRuleContext(StructDefineContext.class,i);
		}
		public List<FunDefineContext> funDefine() {
			return getRuleContexts(FunDefineContext.class);
		}
		public FunDefineContext funDefine(int i) {
			return getRuleContext(FunDefineContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Struct) {
				{
				{
				setState(30);
				structDefine();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				funDefine();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Def );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(ToyParser.Number, 0); }
		public TensorLiteralContext tensorLiteral() {
			return getRuleContext(TensorLiteralContext.class,0);
		}
		public IdentifierExprContext identifierExpr() {
			return getRuleContext(IdentifierExprContext.class,0);
		}
		public StructLiteralContext structLiteral() {
			return getRuleContext(StructLiteralContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Mul() { return getToken(ToyParser.Mul, 0); }
		public TerminalNode Add() { return getToken(ToyParser.Add, 0); }
		public TerminalNode Dot() { return getToken(ToyParser.Dot, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(42);
				match(Number);
				}
				break;
			case 2:
				{
				setState(43);
				tensorLiteral();

				        tensorDataBuffer.clear();
				      
				}
				break;
			case 3:
				{
				setState(46);
				identifierExpr();
				}
				break;
			case 4:
				{
				setState(47);
				structLiteral();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(50);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(51);
						match(Mul);
						setState(52);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(54);
						match(Add);
						setState(55);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(57);
						match(Dot);
						setState(58);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExprContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ToyParser.Identifier, 0); }
		public TerminalNode ParentheseOpen() { return getToken(ToyParser.ParentheseOpen, 0); }
		public TerminalNode ParentheseClose() { return getToken(ToyParser.ParentheseClose, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ToyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ToyParser.Comma, i);
		}
		public IdentifierExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitIdentifierExpr(this);
		}
	}

	public final IdentifierExprContext identifierExpr() throws RecognitionException {
		IdentifierExprContext _localctx = new IdentifierExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifierExpr);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(Identifier);
				setState(66);
				match(ParentheseOpen);
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(67);
					expression(0);
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(68);
						match(Comma);
						setState(69);
						expression(0);
						}
						}
						setState(74);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(77);
				match(ParentheseClose);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnExprContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ToyParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitReturnExpr(this);
		}
	}

	public final ReturnExprContext returnExpr() throws RecognitionException {
		ReturnExprContext _localctx = new ReturnExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnExpr);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(Return);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(Return);
				setState(82);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TensorLiteralContext extends ParserRuleContext {
		public std::vector<double> data;
		public Token SbracketClose;
		public Token Number;
		public TerminalNode SbracketOpen() { return getToken(ToyParser.SbracketOpen, 0); }
		public TerminalNode SbracketClose() { return getToken(ToyParser.SbracketClose, 0); }
		public List<TensorLiteralContext> tensorLiteral() {
			return getRuleContexts(TensorLiteralContext.class);
		}
		public TensorLiteralContext tensorLiteral(int i) {
			return getRuleContext(TensorLiteralContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ToyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ToyParser.Comma, i);
		}
		public TerminalNode Number() { return getToken(ToyParser.Number, 0); }
		public TensorLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensorLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterTensorLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitTensorLiteral(this);
		}
	}

	public final TensorLiteralContext tensorLiteral() throws RecognitionException {
		TensorLiteralContext _localctx = new TensorLiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tensorLiteral);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SbracketOpen:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(SbracketOpen);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SbracketOpen || _la==Number) {
					{
					setState(86);
					tensorLiteral();
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(87);
						match(Comma);
						setState(88);
						tensorLiteral();
						}
						}
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(96);
				((TensorLiteralContext)_localctx).SbracketClose = match(SbracketClose);

				        // When the `]` is detected, copy the elements of `tensorDataBuffer` to `data` member.
				        // Suppose we are handling the `[[1, 2], [3, 4]]` layout.
				        // - The `[1, 2]` will be insert to `tensorDataBuffer`.
				        // - The elements of `tensorDataBuffer` will be assign to `data` member (1, 2).
				        // - The `[3, 4]` will be insert to `tensorDataBuffer` (1, 2, 3, 4).
				        // - The elements of `tensorDataBuffer` will be assign to `data` member (1, 2, 3, 4).
				        if (((TensorLiteralContext)_localctx).SbracketClose) 
				          _localctx.data.assign(tensorDataBuffer.begin(), tensorDataBuffer.end());
				      
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				((TensorLiteralContext)_localctx).Number = match(Number);

				        // Insert current data into `tensorDataBuffer`.
				        tensorDataBuffer.push_back((double)(((TensorLiteralContext)_localctx).Number!=null?Integer.valueOf(((TensorLiteralContext)_localctx).Number.getText()):0)); 
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public std::string idName;
		public Token Identifier;
		public Token Equal;
		public TerminalNode Var() { return getToken(ToyParser.Var, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ToyParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ToyParser.Identifier, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Equal() { return getToken(ToyParser.Equal, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDecl);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(Var);
				setState(103);
				((VarDeclContext)_localctx).Identifier = match(Identifier);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AngleBracketsOpen) {
					{
					setState(104);
					type();
					}
				}

				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Equal) {
					{
					setState(107);
					((VarDeclContext)_localctx).Equal = match(Equal);
					setState(108);
					expression(0);
					}
				}


				        // Record the identifier string to `idName` member.
				        ((VarDeclContext)_localctx).idName =  (((VarDeclContext)_localctx).Identifier!=null?((VarDeclContext)_localctx).Identifier.getText():null);
				        // Clear the `tensorDataBuffer` before accessing `tensorLiteral`.
				        if (((VarDeclContext)_localctx).Equal)
				          tensorDataBuffer.clear();
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				((VarDeclContext)_localctx).Identifier = match(Identifier);
				setState(113);
				((VarDeclContext)_localctx).Identifier = match(Identifier);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Equal) {
					{
					setState(114);
					match(Equal);
					setState(115);
					expression(0);
					}
				}


				        ((VarDeclContext)_localctx).idName =  (((VarDeclContext)_localctx).Identifier!=null?((VarDeclContext)_localctx).Identifier.getText():null);
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				((VarDeclContext)_localctx).Identifier = match(Identifier);

				        ((VarDeclContext)_localctx).idName =  (((VarDeclContext)_localctx).Identifier!=null?((VarDeclContext)_localctx).Identifier.getText():null);
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode AngleBracketsOpen() { return getToken(ToyParser.AngleBracketsOpen, 0); }
		public List<TerminalNode> Number() { return getTokens(ToyParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(ToyParser.Number, i);
		}
		public TerminalNode AngleBracketsClose() { return getToken(ToyParser.AngleBracketsClose, 0); }
		public List<TerminalNode> Comma() { return getTokens(ToyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ToyParser.Comma, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(AngleBracketsOpen);
			setState(124);
			match(Number);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(125);
				match(Comma);
				setState(126);
				match(Number);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(AngleBracketsClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunDefineContext extends ParserRuleContext {
		public PrototypeContext prototype() {
			return getRuleContext(PrototypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterFunDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitFunDefine(this);
		}
	}

	public final FunDefineContext funDefine() throws RecognitionException {
		FunDefineContext _localctx = new FunDefineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			prototype();
			setState(135);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrototypeContext extends ParserRuleContext {
		public std::string idName;
		public Token Identifier;
		public TerminalNode Def() { return getToken(ToyParser.Def, 0); }
		public TerminalNode Identifier() { return getToken(ToyParser.Identifier, 0); }
		public TerminalNode ParentheseOpen() { return getToken(ToyParser.ParentheseOpen, 0); }
		public TerminalNode ParentheseClose() { return getToken(ToyParser.ParentheseClose, 0); }
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public PrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitPrototype(this);
		}
	}

	public final PrototypeContext prototype() throws RecognitionException {
		PrototypeContext _localctx = new PrototypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(Def);
			setState(138);
			((PrototypeContext)_localctx).Identifier = match(Identifier);
			setState(139);
			match(ParentheseOpen);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var || _la==Identifier) {
				{
				setState(140);
				declList();
				}
			}

			setState(143);
			match(ParentheseClose);

			        ((PrototypeContext)_localctx).idName =  (((PrototypeContext)_localctx).Identifier!=null?((PrototypeContext)_localctx).Identifier.getText():null);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclListContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ToyParser.Comma, 0); }
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public DeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitDeclList(this);
		}
	}

	public final DeclListContext declList() throws RecognitionException {
		DeclListContext _localctx = new DeclListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declList);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				varDecl();
				setState(148);
				match(Comma);
				setState(149);
				declList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BracketOpen() { return getToken(ToyParser.BracketOpen, 0); }
		public TerminalNode BracketClose() { return getToken(ToyParser.BracketClose, 0); }
		public List<BlockExprContext> blockExpr() {
			return getRuleContexts(BlockExprContext.class);
		}
		public BlockExprContext blockExpr(int i) {
			return getRuleContext(BlockExprContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(ToyParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(ToyParser.Semicolon, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(BracketOpen);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					blockExpr();
					setState(155);
					match(Semicolon);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(162);
			match(BracketClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockExprContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ReturnExprContext returnExpr() {
			return getRuleContext(ReturnExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterBlockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitBlockExpr(this);
		}
	}

	public final BlockExprContext blockExpr() throws RecognitionException {
		BlockExprContext _localctx = new BlockExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockExpr);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				returnExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralListContext extends ParserRuleContext {
		public TensorLiteralContext tensorLiteral() {
			return getRuleContext(TensorLiteralContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ToyParser.Comma, 0); }
		public LiteralListContext literalList() {
			return getRuleContext(LiteralListContext.class,0);
		}
		public LiteralListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterLiteralList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitLiteralList(this);
		}
	}

	public final LiteralListContext literalList() throws RecognitionException {
		LiteralListContext _localctx = new LiteralListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literalList);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				tensorLiteral();

				        tensorDataBuffer.clear();
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				tensorLiteral();
				setState(173);
				match(Comma);
				setState(174);
				literalList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructLiteralContext extends ParserRuleContext {
		public TerminalNode BracketOpen() { return getToken(ToyParser.BracketOpen, 0); }
		public TerminalNode BracketClose() { return getToken(ToyParser.BracketClose, 0); }
		public List<StructLiteralContext> structLiteral() {
			return getRuleContexts(StructLiteralContext.class);
		}
		public StructLiteralContext structLiteral(int i) {
			return getRuleContext(StructLiteralContext.class,i);
		}
		public List<LiteralListContext> literalList() {
			return getRuleContexts(LiteralListContext.class);
		}
		public LiteralListContext literalList(int i) {
			return getRuleContext(LiteralListContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ToyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ToyParser.Comma, i);
		}
		public StructLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterStructLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitStructLiteral(this);
		}
	}

	public final StructLiteralContext structLiteral() throws RecognitionException {
		StructLiteralContext _localctx = new StructLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_structLiteral);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(BracketOpen);
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BracketOpen:
				case BracketClose:
				case Comma:
					{
					setState(180);
					structLiteral();
					}
					break;
				case SbracketOpen:
				case Number:
					{
					setState(181);
					literalList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(184);
					match(Comma);
					setState(187);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BracketOpen:
					case BracketClose:
					case Comma:
						{
						setState(185);
						structLiteral();
						}
						break;
					case SbracketOpen:
					case Number:
						{
						setState(186);
						literalList();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				match(BracketClose);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDefineContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(ToyParser.Struct, 0); }
		public TerminalNode Identifier() { return getToken(ToyParser.Identifier, 0); }
		public TerminalNode BracketOpen() { return getToken(ToyParser.BracketOpen, 0); }
		public TerminalNode BracketClose() { return getToken(ToyParser.BracketClose, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(ToyParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(ToyParser.Semicolon, i);
		}
		public StructDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterStructDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitStructDefine(this);
		}
	}

	public final StructDefineContext structDefine() throws RecognitionException {
		StructDefineContext _localctx = new StructDefineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_structDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(Struct);
			setState(199);
			match(Identifier);
			setState(200);
			match(BracketOpen);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Var || _la==Identifier) {
				{
				{
				setState(201);
				varDecl();
				setState(202);
				match(Semicolon);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(BracketClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u00d4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005"+
		"\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0004\u0000&\b\u0000"+
		"\u000b\u0000\f\u0000\'\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001<\b\u0001\n\u0001\f\u0001?\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002G\b\u0002\n\u0002\f\u0002J\t\u0002\u0003\u0002L\b\u0002\u0001"+
		"\u0002\u0003\u0002O\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003T\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004Z\b\u0004\n\u0004\f\u0004]\t\u0004\u0003\u0004_\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004e\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005j\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005n\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005u\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005z\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0080\b\u0006\n\u0006\f\u0006\u0083\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u008e\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0098\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u009e"+
		"\b\n\n\n\f\n\u00a1\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00a8\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00b1\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b7"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u00bc\b\r\u0005\r\u00be\b\r\n\r\f"+
		"\r\u00c1\t\r\u0001\r\u0001\r\u0003\r\u00c5\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00cd\b\u000e"+
		"\n\u000e\f\u000e\u00d0\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0000"+
		"\u0001\u0002\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0000\u00e4\u0000!\u0001\u0000\u0000\u0000"+
		"\u00020\u0001\u0000\u0000\u0000\u0004N\u0001\u0000\u0000\u0000\u0006S"+
		"\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000\ny\u0001\u0000\u0000"+
		"\u0000\f{\u0001\u0000\u0000\u0000\u000e\u0086\u0001\u0000\u0000\u0000"+
		"\u0010\u0089\u0001\u0000\u0000\u0000\u0012\u0097\u0001\u0000\u0000\u0000"+
		"\u0014\u0099\u0001\u0000\u0000\u0000\u0016\u00a7\u0001\u0000\u0000\u0000"+
		"\u0018\u00b0\u0001\u0000\u0000\u0000\u001a\u00c4\u0001\u0000\u0000\u0000"+
		"\u001c\u00c6\u0001\u0000\u0000\u0000\u001e \u0003\u001c\u000e\u0000\u001f"+
		"\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000$&\u0003\u000e\u0007\u0000%$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(\u0001\u0001\u0000\u0000\u0000)*\u0006\u0001\uffff"+
		"\uffff\u0000*1\u0005\r\u0000\u0000+,\u0003\b\u0004\u0000,-\u0006\u0001"+
		"\uffff\uffff\u0000-1\u0001\u0000\u0000\u0000.1\u0003\u0004\u0002\u0000"+
		"/1\u0003\u001a\r\u00000)\u0001\u0000\u0000\u00000+\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u00001=\u0001\u0000\u0000"+
		"\u000023\n\u0004\u0000\u000034\u0005\u0013\u0000\u00004<\u0003\u0002\u0001"+
		"\u000556\n\u0003\u0000\u000067\u0005\u0012\u0000\u00007<\u0003\u0002\u0001"+
		"\u000489\n\u0002\u0000\u00009:\u0005\u0014\u0000\u0000:<\u0003\u0002\u0001"+
		"\u0003;2\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000;8\u0001\u0000"+
		"\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000@O\u0005\f\u0000\u0000AB\u0005\f\u0000\u0000BK\u0005\u0001\u0000"+
		"\u0000CH\u0003\u0002\u0001\u0000DE\u0005\u0011\u0000\u0000EG\u0003\u0002"+
		"\u0001\u0000FD\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KC\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MO\u0005\u0002\u0000\u0000N@\u0001\u0000"+
		"\u0000\u0000NA\u0001\u0000\u0000\u0000O\u0005\u0001\u0000\u0000\u0000"+
		"PT\u0005\u0007\u0000\u0000QR\u0005\u0007\u0000\u0000RT\u0003\u0002\u0001"+
		"\u0000SP\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000T\u0007\u0001"+
		"\u0000\u0000\u0000U^\u0005\u0005\u0000\u0000V[\u0003\b\u0004\u0000WX\u0005"+
		"\u0011\u0000\u0000XZ\u0003\b\u0004\u0000YW\u0001\u0000\u0000\u0000Z]\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^V\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005\u0006"+
		"\u0000\u0000ae\u0006\u0004\uffff\uffff\u0000bc\u0005\r\u0000\u0000ce\u0006"+
		"\u0004\uffff\uffff\u0000dU\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000e\t\u0001\u0000\u0000\u0000fg\u0005\t\u0000\u0000gi\u0005\f\u0000"+
		"\u0000hj\u0003\f\u0006\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jm\u0001\u0000\u0000\u0000kl\u0005\u000e\u0000\u0000ln\u0003\u0002"+
		"\u0001\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000oz\u0006\u0005\uffff\uffff\u0000pq\u0005\f\u0000\u0000"+
		"qt\u0005\f\u0000\u0000rs\u0005\u000e\u0000\u0000su\u0003\u0002\u0001\u0000"+
		"tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vz\u0006\u0005\uffff\uffff\u0000wx\u0005\f\u0000\u0000xz\u0006\u0005"+
		"\uffff\uffff\u0000yf\u0001\u0000\u0000\u0000yp\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z\u000b\u0001\u0000\u0000\u0000{|\u0005\u000f"+
		"\u0000\u0000|\u0081\u0005\r\u0000\u0000}~\u0005\u0011\u0000\u0000~\u0080"+
		"\u0005\r\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0083\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005\u0010\u0000\u0000\u0085\r\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0003\u0010\b\u0000\u0087\u0088\u0003\u0014\n"+
		"\u0000\u0088\u000f\u0001\u0000\u0000\u0000\u0089\u008a\u0005\n\u0000\u0000"+
		"\u008a\u008b\u0005\f\u0000\u0000\u008b\u008d\u0005\u0001\u0000\u0000\u008c"+
		"\u008e\u0003\u0012\t\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u0002\u0000\u0000\u0090\u0091\u0006\b\uffff\uffff\u0000\u0091\u0011"+
		"\u0001\u0000\u0000\u0000\u0092\u0098\u0003\n\u0005\u0000\u0093\u0094\u0003"+
		"\n\u0005\u0000\u0094\u0095\u0005\u0011\u0000\u0000\u0095\u0096\u0003\u0012"+
		"\t\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0092\u0001\u0000\u0000"+
		"\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0098\u0013\u0001\u0000\u0000"+
		"\u0000\u0099\u009f\u0005\u0003\u0000\u0000\u009a\u009b\u0003\u0016\u000b"+
		"\u0000\u009b\u009c\u0005\b\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000"+
		"\u009d\u009a\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0004\u0000\u0000\u00a3\u0015\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a8\u0003\n\u0005\u0000\u00a5\u00a8\u0003\u0006\u0003\u0000\u00a6"+
		"\u00a8\u0003\u0002\u0001\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u0017\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003\b\u0004\u0000\u00aa\u00ab"+
		"\u0006\f\uffff\uffff\u0000\u00ab\u00b1\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0003\b\u0004\u0000\u00ad\u00ae\u0005\u0011\u0000\u0000\u00ae\u00af\u0003"+
		"\u0018\f\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b1\u0019\u0001\u0000"+
		"\u0000\u0000\u00b2\u00c5\u0001\u0000\u0000\u0000\u00b3\u00b6\u0005\u0003"+
		"\u0000\u0000\u00b4\u00b7\u0003\u001a\r\u0000\u00b5\u00b7\u0003\u0018\f"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00bf\u0001\u0000\u0000\u0000\u00b8\u00bb\u0005\u0011\u0000"+
		"\u0000\u00b9\u00bc\u0003\u001a\r\u0000\u00ba\u00bc\u0003\u0018\f\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000"+
		"\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0004\u0000\u0000"+
		"\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00b3\u0001\u0000\u0000\u0000\u00c5\u001b\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0005\u000b\u0000\u0000\u00c7\u00c8\u0005\f\u0000\u0000\u00c8"+
		"\u00ce\u0005\u0003\u0000\u0000\u00c9\u00ca\u0003\n\u0005\u0000\u00ca\u00cb"+
		"\u0005\b\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\u0004\u0000\u0000\u00d2\u001d\u0001\u0000\u0000\u0000\u001b!\'0;=HKN"+
		"S[^dimty\u0081\u008d\u0097\u009f\u00a7\u00b0\u00b6\u00bb\u00bf\u00c4\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}