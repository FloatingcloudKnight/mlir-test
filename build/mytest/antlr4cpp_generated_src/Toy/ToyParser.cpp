
// Generated from Toy.g4 by ANTLR 4.10.1


#include "ToyVisitor.h"

#include "ToyParser.h"


using namespace antlrcpp;

using namespace antlr4;

namespace {

struct ToyParserStaticData final {
  ToyParserStaticData(std::vector<std::string> ruleNames,
                        std::vector<std::string> literalNames,
                        std::vector<std::string> symbolicNames)
      : ruleNames(std::move(ruleNames)), literalNames(std::move(literalNames)),
        symbolicNames(std::move(symbolicNames)),
        vocabulary(this->literalNames, this->symbolicNames) {}

  ToyParserStaticData(const ToyParserStaticData&) = delete;
  ToyParserStaticData(ToyParserStaticData&&) = delete;
  ToyParserStaticData& operator=(const ToyParserStaticData&) = delete;
  ToyParserStaticData& operator=(ToyParserStaticData&&) = delete;

  std::vector<antlr4::dfa::DFA> decisionToDFA;
  antlr4::atn::PredictionContextCache sharedContextCache;
  const std::vector<std::string> ruleNames;
  const std::vector<std::string> literalNames;
  const std::vector<std::string> symbolicNames;
  const antlr4::dfa::Vocabulary vocabulary;
  antlr4::atn::SerializedATNView serializedATN;
  std::unique_ptr<antlr4::atn::ATN> atn;
};

std::once_flag toyParserOnceFlag;
ToyParserStaticData *toyParserStaticData = nullptr;

void toyParserInitialize() {
  assert(toyParserStaticData == nullptr);
  auto staticData = std::make_unique<ToyParserStaticData>(
    std::vector<std::string>{
      "module", "expression", "identifierExpr", "returnExpr", "tensorLiteral", 
      "varDecl", "type", "funDefine", "prototype", "declList", "block", 
      "blockExpr", "literalList", "structLiteral", "structDefine"
    },
    std::vector<std::string>{
      "", "'('", "')'", "'{'", "'}'", "'['", "']'", "'return'", "';'", "'var'", 
      "'def'", "'struct'", "", "", "'='", "'<'", "'>'", "','", "'+'", "'*'", 
      "'.'"
    },
    std::vector<std::string>{
      "", "ParentheseOpen", "ParentheseClose", "BracketOpen", "BracketClose", 
      "SbracketOpen", "SbracketClose", "Return", "Semicolon", "Var", "Def", 
      "Struct", "Identifier", "Number", "Equal", "AngleBracketsOpen", "AngleBracketsClose", 
      "Comma", "Add", "Mul", "Dot", "WS", "Comment"
    }
  );
  static const int32_t serializedATNSegment[] = {
  	4,1,22,212,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,
  	7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,7,
  	14,1,0,5,0,32,8,0,10,0,12,0,35,9,0,1,0,4,0,38,8,0,11,0,12,0,39,1,1,1,
  	1,1,1,1,1,1,1,1,1,1,1,3,1,49,8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
  	5,1,60,8,1,10,1,12,1,63,9,1,1,2,1,2,1,2,1,2,1,2,1,2,5,2,71,8,2,10,2,12,
  	2,74,9,2,3,2,76,8,2,1,2,3,2,79,8,2,1,3,1,3,1,3,3,3,84,8,3,1,4,1,4,1,4,
  	1,4,5,4,90,8,4,10,4,12,4,93,9,4,3,4,95,8,4,1,4,1,4,1,4,1,4,3,4,101,8,
  	4,1,5,1,5,1,5,3,5,106,8,5,1,5,1,5,3,5,110,8,5,1,5,1,5,1,5,1,5,1,5,3,5,
  	117,8,5,1,5,1,5,1,5,3,5,122,8,5,1,6,1,6,1,6,1,6,5,6,128,8,6,10,6,12,6,
  	131,9,6,1,6,1,6,1,7,1,7,1,7,1,8,1,8,1,8,1,8,3,8,142,8,8,1,8,1,8,1,8,1,
  	9,1,9,1,9,1,9,1,9,3,9,152,8,9,1,10,1,10,1,10,1,10,5,10,158,8,10,10,10,
  	12,10,161,9,10,1,10,1,10,1,11,1,11,1,11,3,11,168,8,11,1,12,1,12,1,12,
  	1,12,1,12,1,12,1,12,3,12,177,8,12,1,13,1,13,1,13,1,13,3,13,183,8,13,1,
  	13,1,13,1,13,3,13,188,8,13,5,13,190,8,13,10,13,12,13,193,9,13,1,13,1,
  	13,3,13,197,8,13,1,14,1,14,1,14,1,14,1,14,1,14,5,14,205,8,14,10,14,12,
  	14,208,9,14,1,14,1,14,1,14,0,1,2,15,0,2,4,6,8,10,12,14,16,18,20,22,24,
  	26,28,0,0,228,0,33,1,0,0,0,2,48,1,0,0,0,4,78,1,0,0,0,6,83,1,0,0,0,8,100,
  	1,0,0,0,10,121,1,0,0,0,12,123,1,0,0,0,14,134,1,0,0,0,16,137,1,0,0,0,18,
  	151,1,0,0,0,20,153,1,0,0,0,22,167,1,0,0,0,24,176,1,0,0,0,26,196,1,0,0,
  	0,28,198,1,0,0,0,30,32,3,28,14,0,31,30,1,0,0,0,32,35,1,0,0,0,33,31,1,
  	0,0,0,33,34,1,0,0,0,34,37,1,0,0,0,35,33,1,0,0,0,36,38,3,14,7,0,37,36,
  	1,0,0,0,38,39,1,0,0,0,39,37,1,0,0,0,39,40,1,0,0,0,40,1,1,0,0,0,41,42,
  	6,1,-1,0,42,49,5,13,0,0,43,44,3,8,4,0,44,45,6,1,-1,0,45,49,1,0,0,0,46,
  	49,3,4,2,0,47,49,3,26,13,0,48,41,1,0,0,0,48,43,1,0,0,0,48,46,1,0,0,0,
  	48,47,1,0,0,0,49,61,1,0,0,0,50,51,10,4,0,0,51,52,5,19,0,0,52,60,3,2,1,
  	5,53,54,10,3,0,0,54,55,5,18,0,0,55,60,3,2,1,4,56,57,10,2,0,0,57,58,5,
  	20,0,0,58,60,3,2,1,3,59,50,1,0,0,0,59,53,1,0,0,0,59,56,1,0,0,0,60,63,
  	1,0,0,0,61,59,1,0,0,0,61,62,1,0,0,0,62,3,1,0,0,0,63,61,1,0,0,0,64,79,
  	5,12,0,0,65,66,5,12,0,0,66,75,5,1,0,0,67,72,3,2,1,0,68,69,5,17,0,0,69,
  	71,3,2,1,0,70,68,1,0,0,0,71,74,1,0,0,0,72,70,1,0,0,0,72,73,1,0,0,0,73,
  	76,1,0,0,0,74,72,1,0,0,0,75,67,1,0,0,0,75,76,1,0,0,0,76,77,1,0,0,0,77,
  	79,5,2,0,0,78,64,1,0,0,0,78,65,1,0,0,0,79,5,1,0,0,0,80,84,5,7,0,0,81,
  	82,5,7,0,0,82,84,3,2,1,0,83,80,1,0,0,0,83,81,1,0,0,0,84,7,1,0,0,0,85,
  	94,5,5,0,0,86,91,3,8,4,0,87,88,5,17,0,0,88,90,3,8,4,0,89,87,1,0,0,0,90,
  	93,1,0,0,0,91,89,1,0,0,0,91,92,1,0,0,0,92,95,1,0,0,0,93,91,1,0,0,0,94,
  	86,1,0,0,0,94,95,1,0,0,0,95,96,1,0,0,0,96,97,5,6,0,0,97,101,6,4,-1,0,
  	98,99,5,13,0,0,99,101,6,4,-1,0,100,85,1,0,0,0,100,98,1,0,0,0,101,9,1,
  	0,0,0,102,103,5,9,0,0,103,105,5,12,0,0,104,106,3,12,6,0,105,104,1,0,0,
  	0,105,106,1,0,0,0,106,109,1,0,0,0,107,108,5,14,0,0,108,110,3,2,1,0,109,
  	107,1,0,0,0,109,110,1,0,0,0,110,111,1,0,0,0,111,122,6,5,-1,0,112,113,
  	5,12,0,0,113,116,5,12,0,0,114,115,5,14,0,0,115,117,3,2,1,0,116,114,1,
  	0,0,0,116,117,1,0,0,0,117,118,1,0,0,0,118,122,6,5,-1,0,119,120,5,12,0,
  	0,120,122,6,5,-1,0,121,102,1,0,0,0,121,112,1,0,0,0,121,119,1,0,0,0,122,
  	11,1,0,0,0,123,124,5,15,0,0,124,129,5,13,0,0,125,126,5,17,0,0,126,128,
  	5,13,0,0,127,125,1,0,0,0,128,131,1,0,0,0,129,127,1,0,0,0,129,130,1,0,
  	0,0,130,132,1,0,0,0,131,129,1,0,0,0,132,133,5,16,0,0,133,13,1,0,0,0,134,
  	135,3,16,8,0,135,136,3,20,10,0,136,15,1,0,0,0,137,138,5,10,0,0,138,139,
  	5,12,0,0,139,141,5,1,0,0,140,142,3,18,9,0,141,140,1,0,0,0,141,142,1,0,
  	0,0,142,143,1,0,0,0,143,144,5,2,0,0,144,145,6,8,-1,0,145,17,1,0,0,0,146,
  	152,3,10,5,0,147,148,3,10,5,0,148,149,5,17,0,0,149,150,3,18,9,0,150,152,
  	1,0,0,0,151,146,1,0,0,0,151,147,1,0,0,0,152,19,1,0,0,0,153,159,5,3,0,
  	0,154,155,3,22,11,0,155,156,5,8,0,0,156,158,1,0,0,0,157,154,1,0,0,0,158,
  	161,1,0,0,0,159,157,1,0,0,0,159,160,1,0,0,0,160,162,1,0,0,0,161,159,1,
  	0,0,0,162,163,5,4,0,0,163,21,1,0,0,0,164,168,3,10,5,0,165,168,3,6,3,0,
  	166,168,3,2,1,0,167,164,1,0,0,0,167,165,1,0,0,0,167,166,1,0,0,0,168,23,
  	1,0,0,0,169,170,3,8,4,0,170,171,6,12,-1,0,171,177,1,0,0,0,172,173,3,8,
  	4,0,173,174,5,17,0,0,174,175,3,24,12,0,175,177,1,0,0,0,176,169,1,0,0,
  	0,176,172,1,0,0,0,177,25,1,0,0,0,178,197,1,0,0,0,179,182,5,3,0,0,180,
  	183,3,26,13,0,181,183,3,24,12,0,182,180,1,0,0,0,182,181,1,0,0,0,183,191,
  	1,0,0,0,184,187,5,17,0,0,185,188,3,26,13,0,186,188,3,24,12,0,187,185,
  	1,0,0,0,187,186,1,0,0,0,188,190,1,0,0,0,189,184,1,0,0,0,190,193,1,0,0,
  	0,191,189,1,0,0,0,191,192,1,0,0,0,192,194,1,0,0,0,193,191,1,0,0,0,194,
  	195,5,4,0,0,195,197,1,0,0,0,196,178,1,0,0,0,196,179,1,0,0,0,197,27,1,
  	0,0,0,198,199,5,11,0,0,199,200,5,12,0,0,200,206,5,3,0,0,201,202,3,10,
  	5,0,202,203,5,8,0,0,203,205,1,0,0,0,204,201,1,0,0,0,205,208,1,0,0,0,206,
  	204,1,0,0,0,206,207,1,0,0,0,207,209,1,0,0,0,208,206,1,0,0,0,209,210,5,
  	4,0,0,210,29,1,0,0,0,27,33,39,48,59,61,72,75,78,83,91,94,100,105,109,
  	116,121,129,141,151,159,167,176,182,187,191,196,206
  };
  staticData->serializedATN = antlr4::atn::SerializedATNView(serializedATNSegment, sizeof(serializedATNSegment) / sizeof(serializedATNSegment[0]));

  antlr4::atn::ATNDeserializer deserializer;
  staticData->atn = deserializer.deserialize(staticData->serializedATN);

  const size_t count = staticData->atn->getNumberOfDecisions();
  staticData->decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    staticData->decisionToDFA.emplace_back(staticData->atn->getDecisionState(i), i);
  }
  toyParserStaticData = staticData.release();
}

}

ToyParser::ToyParser(TokenStream *input) : ToyParser(input, antlr4::atn::ParserATNSimulatorOptions()) {}

ToyParser::ToyParser(TokenStream *input, const antlr4::atn::ParserATNSimulatorOptions &options) : Parser(input) {
  ToyParser::initialize();
  _interpreter = new atn::ParserATNSimulator(this, *toyParserStaticData->atn, toyParserStaticData->decisionToDFA, toyParserStaticData->sharedContextCache, options);
}

ToyParser::~ToyParser() {
  delete _interpreter;
}

const atn::ATN& ToyParser::getATN() const {
  return *toyParserStaticData->atn;
}

std::string ToyParser::getGrammarFileName() const {
  return "Toy.g4";
}

const std::vector<std::string>& ToyParser::getRuleNames() const {
  return toyParserStaticData->ruleNames;
}

const dfa::Vocabulary& ToyParser::getVocabulary() const {
  return toyParserStaticData->vocabulary;
}

antlr4::atn::SerializedATNView ToyParser::getSerializedATN() const {
  return toyParserStaticData->serializedATN;
}


//----------------- ModuleContext ------------------------------------------------------------------

ToyParser::ModuleContext::ModuleContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<ToyParser::StructDefineContext *> ToyParser::ModuleContext::structDefine() {
  return getRuleContexts<ToyParser::StructDefineContext>();
}

ToyParser::StructDefineContext* ToyParser::ModuleContext::structDefine(size_t i) {
  return getRuleContext<ToyParser::StructDefineContext>(i);
}

std::vector<ToyParser::FunDefineContext *> ToyParser::ModuleContext::funDefine() {
  return getRuleContexts<ToyParser::FunDefineContext>();
}

ToyParser::FunDefineContext* ToyParser::ModuleContext::funDefine(size_t i) {
  return getRuleContext<ToyParser::FunDefineContext>(i);
}


size_t ToyParser::ModuleContext::getRuleIndex() const {
  return ToyParser::RuleModule;
}


std::any ToyParser::ModuleContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitModule(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::ModuleContext* ToyParser::module() {
  ModuleContext *_localctx = _tracker.createInstance<ModuleContext>(_ctx, getState());
  enterRule(_localctx, 0, ToyParser::RuleModule);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(33);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == ToyParser::Struct) {
      setState(30);
      structDefine();
      setState(35);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(37); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(36);
      funDefine();
      setState(39); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == ToyParser::Def);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionContext ------------------------------------------------------------------

ToyParser::ExpressionContext::ExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ToyParser::ExpressionContext::Number() {
  return getToken(ToyParser::Number, 0);
}

ToyParser::TensorLiteralContext* ToyParser::ExpressionContext::tensorLiteral() {
  return getRuleContext<ToyParser::TensorLiteralContext>(0);
}

ToyParser::IdentifierExprContext* ToyParser::ExpressionContext::identifierExpr() {
  return getRuleContext<ToyParser::IdentifierExprContext>(0);
}

ToyParser::StructLiteralContext* ToyParser::ExpressionContext::structLiteral() {
  return getRuleContext<ToyParser::StructLiteralContext>(0);
}

std::vector<ToyParser::ExpressionContext *> ToyParser::ExpressionContext::expression() {
  return getRuleContexts<ToyParser::ExpressionContext>();
}

ToyParser::ExpressionContext* ToyParser::ExpressionContext::expression(size_t i) {
  return getRuleContext<ToyParser::ExpressionContext>(i);
}

tree::TerminalNode* ToyParser::ExpressionContext::Mul() {
  return getToken(ToyParser::Mul, 0);
}

tree::TerminalNode* ToyParser::ExpressionContext::Add() {
  return getToken(ToyParser::Add, 0);
}

tree::TerminalNode* ToyParser::ExpressionContext::Dot() {
  return getToken(ToyParser::Dot, 0);
}


size_t ToyParser::ExpressionContext::getRuleIndex() const {
  return ToyParser::RuleExpression;
}


std::any ToyParser::ExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitExpression(this);
  else
    return visitor->visitChildren(this);
}


ToyParser::ExpressionContext* ToyParser::expression() {
   return expression(0);
}

ToyParser::ExpressionContext* ToyParser::expression(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  ToyParser::ExpressionContext *_localctx = _tracker.createInstance<ExpressionContext>(_ctx, parentState);
  ToyParser::ExpressionContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 2;
  enterRecursionRule(_localctx, 2, ToyParser::RuleExpression, precedence);

    

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(48);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      setState(42);
      match(ToyParser::Number);
      break;
    }

    case 2: {
      setState(43);
      tensorLiteral();

              tensorDataBuffer.clear();
            
      break;
    }

    case 3: {
      setState(46);
      identifierExpr();
      break;
    }

    case 4: {
      setState(47);
      structLiteral();
      break;
    }

    default:
      break;
    }
    _ctx->stop = _input->LT(-1);
    setState(61);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(59);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(50);

          if (!(precpred(_ctx, 4))) throw FailedPredicateException(this, "precpred(_ctx, 4)");
          setState(51);
          match(ToyParser::Mul);
          setState(52);
          expression(5);
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(53);

          if (!(precpred(_ctx, 3))) throw FailedPredicateException(this, "precpred(_ctx, 3)");
          setState(54);
          match(ToyParser::Add);
          setState(55);
          expression(4);
          break;
        }

        case 3: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(56);

          if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
          setState(57);
          match(ToyParser::Dot);
          setState(58);
          expression(3);
          break;
        }

        default:
          break;
        } 
      }
      setState(63);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- IdentifierExprContext ------------------------------------------------------------------

ToyParser::IdentifierExprContext::IdentifierExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ToyParser::IdentifierExprContext::Identifier() {
  return getToken(ToyParser::Identifier, 0);
}

tree::TerminalNode* ToyParser::IdentifierExprContext::ParentheseOpen() {
  return getToken(ToyParser::ParentheseOpen, 0);
}

tree::TerminalNode* ToyParser::IdentifierExprContext::ParentheseClose() {
  return getToken(ToyParser::ParentheseClose, 0);
}

std::vector<ToyParser::ExpressionContext *> ToyParser::IdentifierExprContext::expression() {
  return getRuleContexts<ToyParser::ExpressionContext>();
}

ToyParser::ExpressionContext* ToyParser::IdentifierExprContext::expression(size_t i) {
  return getRuleContext<ToyParser::ExpressionContext>(i);
}

std::vector<tree::TerminalNode *> ToyParser::IdentifierExprContext::Comma() {
  return getTokens(ToyParser::Comma);
}

tree::TerminalNode* ToyParser::IdentifierExprContext::Comma(size_t i) {
  return getToken(ToyParser::Comma, i);
}


size_t ToyParser::IdentifierExprContext::getRuleIndex() const {
  return ToyParser::RuleIdentifierExpr;
}


std::any ToyParser::IdentifierExprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitIdentifierExpr(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::IdentifierExprContext* ToyParser::identifierExpr() {
  IdentifierExprContext *_localctx = _tracker.createInstance<IdentifierExprContext>(_ctx, getState());
  enterRule(_localctx, 4, ToyParser::RuleIdentifierExpr);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(78);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(64);
      match(ToyParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(65);
      match(ToyParser::Identifier);
      setState(66);
      match(ToyParser::ParentheseOpen);
      setState(75);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
      case 1: {
        setState(67);
        expression(0);
        setState(72);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while (_la == ToyParser::Comma) {
          setState(68);
          match(ToyParser::Comma);
          setState(69);
          expression(0);
          setState(74);
          _errHandler->sync(this);
          _la = _input->LA(1);
        }
        break;
      }

      default:
        break;
      }
      setState(77);
      match(ToyParser::ParentheseClose);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ReturnExprContext ------------------------------------------------------------------

ToyParser::ReturnExprContext::ReturnExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ToyParser::ReturnExprContext::Return() {
  return getToken(ToyParser::Return, 0);
}

ToyParser::ExpressionContext* ToyParser::ReturnExprContext::expression() {
  return getRuleContext<ToyParser::ExpressionContext>(0);
}


size_t ToyParser::ReturnExprContext::getRuleIndex() const {
  return ToyParser::RuleReturnExpr;
}


std::any ToyParser::ReturnExprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitReturnExpr(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::ReturnExprContext* ToyParser::returnExpr() {
  ReturnExprContext *_localctx = _tracker.createInstance<ReturnExprContext>(_ctx, getState());
  enterRule(_localctx, 6, ToyParser::RuleReturnExpr);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(83);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(80);
      match(ToyParser::Return);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(81);
      match(ToyParser::Return);
      setState(82);
      expression(0);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TensorLiteralContext ------------------------------------------------------------------

ToyParser::TensorLiteralContext::TensorLiteralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ToyParser::TensorLiteralContext::SbracketOpen() {
  return getToken(ToyParser::SbracketOpen, 0);
}

tree::TerminalNode* ToyParser::TensorLiteralContext::SbracketClose() {
  return getToken(ToyParser::SbracketClose, 0);
}

std::vector<ToyParser::TensorLiteralContext *> ToyParser::TensorLiteralContext::tensorLiteral() {
  return getRuleContexts<ToyParser::TensorLiteralContext>();
}

ToyParser::TensorLiteralContext* ToyParser::TensorLiteralContext::tensorLiteral(size_t i) {
  return getRuleContext<ToyParser::TensorLiteralContext>(i);
}

std::vector<tree::TerminalNode *> ToyParser::TensorLiteralContext::Comma() {
  return getTokens(ToyParser::Comma);
}

tree::TerminalNode* ToyParser::TensorLiteralContext::Comma(size_t i) {
  return getToken(ToyParser::Comma, i);
}

tree::TerminalNode* ToyParser::TensorLiteralContext::Number() {
  return getToken(ToyParser::Number, 0);
}


size_t ToyParser::TensorLiteralContext::getRuleIndex() const {
  return ToyParser::RuleTensorLiteral;
}


std::any ToyParser::TensorLiteralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitTensorLiteral(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::TensorLiteralContext* ToyParser::tensorLiteral() {
  TensorLiteralContext *_localctx = _tracker.createInstance<TensorLiteralContext>(_ctx, getState());
  enterRule(_localctx, 8, ToyParser::RuleTensorLiteral);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(100);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case ToyParser::SbracketOpen: {
        enterOuterAlt(_localctx, 1);
        setState(85);
        match(ToyParser::SbracketOpen);
        setState(94);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == ToyParser::SbracketOpen

        || _la == ToyParser::Number) {
          setState(86);
          tensorLiteral();
          setState(91);
          _errHandler->sync(this);
          _la = _input->LA(1);
          while (_la == ToyParser::Comma) {
            setState(87);
            match(ToyParser::Comma);
            setState(88);
            tensorLiteral();
            setState(93);
            _errHandler->sync(this);
            _la = _input->LA(1);
          }
        }
        setState(96);
        antlrcpp::downCast<TensorLiteralContext *>(_localctx)->sbracketcloseToken = match(ToyParser::SbracketClose);

                // When the `]` is detected, copy the elements of `tensorDataBuffer` to `data` member.
                // Suppose we are handling the `[[1, 2], [3, 4]]` layout.
                // - The `[1, 2]` will be insert to `tensorDataBuffer`.
                // - The elements of `tensorDataBuffer` will be assign to `data` member (1, 2).
                // - The `[3, 4]` will be insert to `tensorDataBuffer` (1, 2, 3, 4).
                // - The elements of `tensorDataBuffer` will be assign to `data` member (1, 2, 3, 4).
                if (antlrcpp::downCast<TensorLiteralContext *>(_localctx)->sbracketcloseToken) 
                  _localctx->data.assign(tensorDataBuffer.begin(), tensorDataBuffer.end());
              
        break;
      }

      case ToyParser::Number: {
        enterOuterAlt(_localctx, 2);
        setState(98);
        antlrcpp::downCast<TensorLiteralContext *>(_localctx)->numberToken = match(ToyParser::Number);

                // Insert current data into `tensorDataBuffer`.
                tensorDataBuffer.push_back((double)(antlrcpp::downCast<TensorLiteralContext *>(_localctx)->numberToken != nullptr ? std::stoi(antlrcpp::downCast<TensorLiteralContext *>(_localctx)->numberToken->getText()) : 0)); 
              
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VarDeclContext ------------------------------------------------------------------

ToyParser::VarDeclContext::VarDeclContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ToyParser::VarDeclContext::Var() {
  return getToken(ToyParser::Var, 0);
}

std::vector<tree::TerminalNode *> ToyParser::VarDeclContext::Identifier() {
  return getTokens(ToyParser::Identifier);
}

tree::TerminalNode* ToyParser::VarDeclContext::Identifier(size_t i) {
  return getToken(ToyParser::Identifier, i);
}

ToyParser::TypeContext* ToyParser::VarDeclContext::type() {
  return getRuleContext<ToyParser::TypeContext>(0);
}

tree::TerminalNode* ToyParser::VarDeclContext::Equal() {
  return getToken(ToyParser::Equal, 0);
}

ToyParser::ExpressionContext* ToyParser::VarDeclContext::expression() {
  return getRuleContext<ToyParser::ExpressionContext>(0);
}


size_t ToyParser::VarDeclContext::getRuleIndex() const {
  return ToyParser::RuleVarDecl;
}


std::any ToyParser::VarDeclContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitVarDecl(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::VarDeclContext* ToyParser::varDecl() {
  VarDeclContext *_localctx = _tracker.createInstance<VarDeclContext>(_ctx, getState());
  enterRule(_localctx, 10, ToyParser::RuleVarDecl);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(121);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(102);
      match(ToyParser::Var);
      setState(103);
      antlrcpp::downCast<VarDeclContext *>(_localctx)->identifierToken = match(ToyParser::Identifier);
      setState(105);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == ToyParser::AngleBracketsOpen) {
        setState(104);
        type();
      }
      setState(109);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == ToyParser::Equal) {
        setState(107);
        antlrcpp::downCast<VarDeclContext *>(_localctx)->equalToken = match(ToyParser::Equal);
        setState(108);
        expression(0);
      }

              // Record the identifier string to `idName` member.
              antlrcpp::downCast<VarDeclContext *>(_localctx)->idName =  (antlrcpp::downCast<VarDeclContext *>(_localctx)->identifierToken != nullptr ? antlrcpp::downCast<VarDeclContext *>(_localctx)->identifierToken->getText() : "");
              // Clear the `tensorDataBuffer` before accessing `tensorLiteral`.
              if (antlrcpp::downCast<VarDeclContext *>(_localctx)->equalToken)
                tensorDataBuffer.clear();
            
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(112);
      antlrcpp::downCast<VarDeclContext *>(_localctx)->identifierToken = match(ToyParser::Identifier);
      setState(113);
      antlrcpp::downCast<VarDeclContext *>(_localctx)->identifierToken = match(ToyParser::Identifier);
      setState(116);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == ToyParser::Equal) {
        setState(114);
        match(ToyParser::Equal);
        setState(115);
        expression(0);
      }

              antlrcpp::downCast<VarDeclContext *>(_localctx)->idName =  (antlrcpp::downCast<VarDeclContext *>(_localctx)->identifierToken != nullptr ? antlrcpp::downCast<VarDeclContext *>(_localctx)->identifierToken->getText() : "");
            
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(119);
      antlrcpp::downCast<VarDeclContext *>(_localctx)->identifierToken = match(ToyParser::Identifier);

              antlrcpp::downCast<VarDeclContext *>(_localctx)->idName =  (antlrcpp::downCast<VarDeclContext *>(_localctx)->identifierToken != nullptr ? antlrcpp::downCast<VarDeclContext *>(_localctx)->identifierToken->getText() : "");
            
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeContext ------------------------------------------------------------------

ToyParser::TypeContext::TypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ToyParser::TypeContext::AngleBracketsOpen() {
  return getToken(ToyParser::AngleBracketsOpen, 0);
}

std::vector<tree::TerminalNode *> ToyParser::TypeContext::Number() {
  return getTokens(ToyParser::Number);
}

tree::TerminalNode* ToyParser::TypeContext::Number(size_t i) {
  return getToken(ToyParser::Number, i);
}

tree::TerminalNode* ToyParser::TypeContext::AngleBracketsClose() {
  return getToken(ToyParser::AngleBracketsClose, 0);
}

std::vector<tree::TerminalNode *> ToyParser::TypeContext::Comma() {
  return getTokens(ToyParser::Comma);
}

tree::TerminalNode* ToyParser::TypeContext::Comma(size_t i) {
  return getToken(ToyParser::Comma, i);
}


size_t ToyParser::TypeContext::getRuleIndex() const {
  return ToyParser::RuleType;
}


std::any ToyParser::TypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitType(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::TypeContext* ToyParser::type() {
  TypeContext *_localctx = _tracker.createInstance<TypeContext>(_ctx, getState());
  enterRule(_localctx, 12, ToyParser::RuleType);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(123);
    match(ToyParser::AngleBracketsOpen);
    setState(124);
    match(ToyParser::Number);
    setState(129);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == ToyParser::Comma) {
      setState(125);
      match(ToyParser::Comma);
      setState(126);
      match(ToyParser::Number);
      setState(131);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(132);
    match(ToyParser::AngleBracketsClose);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunDefineContext ------------------------------------------------------------------

ToyParser::FunDefineContext::FunDefineContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

ToyParser::PrototypeContext* ToyParser::FunDefineContext::prototype() {
  return getRuleContext<ToyParser::PrototypeContext>(0);
}

ToyParser::BlockContext* ToyParser::FunDefineContext::block() {
  return getRuleContext<ToyParser::BlockContext>(0);
}


size_t ToyParser::FunDefineContext::getRuleIndex() const {
  return ToyParser::RuleFunDefine;
}


std::any ToyParser::FunDefineContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitFunDefine(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::FunDefineContext* ToyParser::funDefine() {
  FunDefineContext *_localctx = _tracker.createInstance<FunDefineContext>(_ctx, getState());
  enterRule(_localctx, 14, ToyParser::RuleFunDefine);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(134);
    prototype();
    setState(135);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PrototypeContext ------------------------------------------------------------------

ToyParser::PrototypeContext::PrototypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ToyParser::PrototypeContext::Def() {
  return getToken(ToyParser::Def, 0);
}

tree::TerminalNode* ToyParser::PrototypeContext::Identifier() {
  return getToken(ToyParser::Identifier, 0);
}

tree::TerminalNode* ToyParser::PrototypeContext::ParentheseOpen() {
  return getToken(ToyParser::ParentheseOpen, 0);
}

tree::TerminalNode* ToyParser::PrototypeContext::ParentheseClose() {
  return getToken(ToyParser::ParentheseClose, 0);
}

ToyParser::DeclListContext* ToyParser::PrototypeContext::declList() {
  return getRuleContext<ToyParser::DeclListContext>(0);
}


size_t ToyParser::PrototypeContext::getRuleIndex() const {
  return ToyParser::RulePrototype;
}


std::any ToyParser::PrototypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitPrototype(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::PrototypeContext* ToyParser::prototype() {
  PrototypeContext *_localctx = _tracker.createInstance<PrototypeContext>(_ctx, getState());
  enterRule(_localctx, 16, ToyParser::RulePrototype);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(137);
    match(ToyParser::Def);
    setState(138);
    antlrcpp::downCast<PrototypeContext *>(_localctx)->identifierToken = match(ToyParser::Identifier);
    setState(139);
    match(ToyParser::ParentheseOpen);
    setState(141);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == ToyParser::Var

    || _la == ToyParser::Identifier) {
      setState(140);
      declList();
    }
    setState(143);
    match(ToyParser::ParentheseClose);

            antlrcpp::downCast<PrototypeContext *>(_localctx)->idName =  (antlrcpp::downCast<PrototypeContext *>(_localctx)->identifierToken != nullptr ? antlrcpp::downCast<PrototypeContext *>(_localctx)->identifierToken->getText() : "");
          
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- DeclListContext ------------------------------------------------------------------

ToyParser::DeclListContext::DeclListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

ToyParser::VarDeclContext* ToyParser::DeclListContext::varDecl() {
  return getRuleContext<ToyParser::VarDeclContext>(0);
}

tree::TerminalNode* ToyParser::DeclListContext::Comma() {
  return getToken(ToyParser::Comma, 0);
}

ToyParser::DeclListContext* ToyParser::DeclListContext::declList() {
  return getRuleContext<ToyParser::DeclListContext>(0);
}


size_t ToyParser::DeclListContext::getRuleIndex() const {
  return ToyParser::RuleDeclList;
}


std::any ToyParser::DeclListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitDeclList(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::DeclListContext* ToyParser::declList() {
  DeclListContext *_localctx = _tracker.createInstance<DeclListContext>(_ctx, getState());
  enterRule(_localctx, 18, ToyParser::RuleDeclList);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(151);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(146);
      varDecl();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(147);
      varDecl();
      setState(148);
      match(ToyParser::Comma);
      setState(149);
      declList();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockContext ------------------------------------------------------------------

ToyParser::BlockContext::BlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ToyParser::BlockContext::BracketOpen() {
  return getToken(ToyParser::BracketOpen, 0);
}

tree::TerminalNode* ToyParser::BlockContext::BracketClose() {
  return getToken(ToyParser::BracketClose, 0);
}

std::vector<ToyParser::BlockExprContext *> ToyParser::BlockContext::blockExpr() {
  return getRuleContexts<ToyParser::BlockExprContext>();
}

ToyParser::BlockExprContext* ToyParser::BlockContext::blockExpr(size_t i) {
  return getRuleContext<ToyParser::BlockExprContext>(i);
}

std::vector<tree::TerminalNode *> ToyParser::BlockContext::Semicolon() {
  return getTokens(ToyParser::Semicolon);
}

tree::TerminalNode* ToyParser::BlockContext::Semicolon(size_t i) {
  return getToken(ToyParser::Semicolon, i);
}


size_t ToyParser::BlockContext::getRuleIndex() const {
  return ToyParser::RuleBlock;
}


std::any ToyParser::BlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitBlock(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::BlockContext* ToyParser::block() {
  BlockContext *_localctx = _tracker.createInstance<BlockContext>(_ctx, getState());
  enterRule(_localctx, 20, ToyParser::RuleBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(153);
    match(ToyParser::BracketOpen);
    setState(159);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(154);
        blockExpr();
        setState(155);
        match(ToyParser::Semicolon); 
      }
      setState(161);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx);
    }
    setState(162);
    match(ToyParser::BracketClose);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockExprContext ------------------------------------------------------------------

ToyParser::BlockExprContext::BlockExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

ToyParser::VarDeclContext* ToyParser::BlockExprContext::varDecl() {
  return getRuleContext<ToyParser::VarDeclContext>(0);
}

ToyParser::ReturnExprContext* ToyParser::BlockExprContext::returnExpr() {
  return getRuleContext<ToyParser::ReturnExprContext>(0);
}

ToyParser::ExpressionContext* ToyParser::BlockExprContext::expression() {
  return getRuleContext<ToyParser::ExpressionContext>(0);
}


size_t ToyParser::BlockExprContext::getRuleIndex() const {
  return ToyParser::RuleBlockExpr;
}


std::any ToyParser::BlockExprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitBlockExpr(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::BlockExprContext* ToyParser::blockExpr() {
  BlockExprContext *_localctx = _tracker.createInstance<BlockExprContext>(_ctx, getState());
  enterRule(_localctx, 22, ToyParser::RuleBlockExpr);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(167);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(164);
      varDecl();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(165);
      returnExpr();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(166);
      expression(0);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LiteralListContext ------------------------------------------------------------------

ToyParser::LiteralListContext::LiteralListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

ToyParser::TensorLiteralContext* ToyParser::LiteralListContext::tensorLiteral() {
  return getRuleContext<ToyParser::TensorLiteralContext>(0);
}

tree::TerminalNode* ToyParser::LiteralListContext::Comma() {
  return getToken(ToyParser::Comma, 0);
}

ToyParser::LiteralListContext* ToyParser::LiteralListContext::literalList() {
  return getRuleContext<ToyParser::LiteralListContext>(0);
}


size_t ToyParser::LiteralListContext::getRuleIndex() const {
  return ToyParser::RuleLiteralList;
}


std::any ToyParser::LiteralListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitLiteralList(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::LiteralListContext* ToyParser::literalList() {
  LiteralListContext *_localctx = _tracker.createInstance<LiteralListContext>(_ctx, getState());
  enterRule(_localctx, 24, ToyParser::RuleLiteralList);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(176);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(169);
      tensorLiteral();

              tensorDataBuffer.clear();
            
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(172);
      tensorLiteral();
      setState(173);
      match(ToyParser::Comma);
      setState(174);
      literalList();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StructLiteralContext ------------------------------------------------------------------

ToyParser::StructLiteralContext::StructLiteralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ToyParser::StructLiteralContext::BracketOpen() {
  return getToken(ToyParser::BracketOpen, 0);
}

tree::TerminalNode* ToyParser::StructLiteralContext::BracketClose() {
  return getToken(ToyParser::BracketClose, 0);
}

std::vector<ToyParser::StructLiteralContext *> ToyParser::StructLiteralContext::structLiteral() {
  return getRuleContexts<ToyParser::StructLiteralContext>();
}

ToyParser::StructLiteralContext* ToyParser::StructLiteralContext::structLiteral(size_t i) {
  return getRuleContext<ToyParser::StructLiteralContext>(i);
}

std::vector<ToyParser::LiteralListContext *> ToyParser::StructLiteralContext::literalList() {
  return getRuleContexts<ToyParser::LiteralListContext>();
}

ToyParser::LiteralListContext* ToyParser::StructLiteralContext::literalList(size_t i) {
  return getRuleContext<ToyParser::LiteralListContext>(i);
}

std::vector<tree::TerminalNode *> ToyParser::StructLiteralContext::Comma() {
  return getTokens(ToyParser::Comma);
}

tree::TerminalNode* ToyParser::StructLiteralContext::Comma(size_t i) {
  return getToken(ToyParser::Comma, i);
}


size_t ToyParser::StructLiteralContext::getRuleIndex() const {
  return ToyParser::RuleStructLiteral;
}


std::any ToyParser::StructLiteralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitStructLiteral(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::StructLiteralContext* ToyParser::structLiteral() {
  StructLiteralContext *_localctx = _tracker.createInstance<StructLiteralContext>(_ctx, getState());
  enterRule(_localctx, 26, ToyParser::RuleStructLiteral);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(196);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 25, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);

      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(179);
      match(ToyParser::BracketOpen);
      setState(182);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case ToyParser::BracketOpen:
        case ToyParser::BracketClose:
        case ToyParser::Comma: {
          setState(180);
          structLiteral();
          break;
        }

        case ToyParser::SbracketOpen:
        case ToyParser::Number: {
          setState(181);
          literalList();
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      setState(191);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == ToyParser::Comma) {
        setState(184);
        match(ToyParser::Comma);
        setState(187);
        _errHandler->sync(this);
        switch (_input->LA(1)) {
          case ToyParser::BracketOpen:
          case ToyParser::BracketClose:
          case ToyParser::Comma: {
            setState(185);
            structLiteral();
            break;
          }

          case ToyParser::SbracketOpen:
          case ToyParser::Number: {
            setState(186);
            literalList();
            break;
          }

        default:
          throw NoViableAltException(this);
        }
        setState(193);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      setState(194);
      match(ToyParser::BracketClose);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StructDefineContext ------------------------------------------------------------------

ToyParser::StructDefineContext::StructDefineContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ToyParser::StructDefineContext::Struct() {
  return getToken(ToyParser::Struct, 0);
}

tree::TerminalNode* ToyParser::StructDefineContext::Identifier() {
  return getToken(ToyParser::Identifier, 0);
}

tree::TerminalNode* ToyParser::StructDefineContext::BracketOpen() {
  return getToken(ToyParser::BracketOpen, 0);
}

tree::TerminalNode* ToyParser::StructDefineContext::BracketClose() {
  return getToken(ToyParser::BracketClose, 0);
}

std::vector<ToyParser::VarDeclContext *> ToyParser::StructDefineContext::varDecl() {
  return getRuleContexts<ToyParser::VarDeclContext>();
}

ToyParser::VarDeclContext* ToyParser::StructDefineContext::varDecl(size_t i) {
  return getRuleContext<ToyParser::VarDeclContext>(i);
}

std::vector<tree::TerminalNode *> ToyParser::StructDefineContext::Semicolon() {
  return getTokens(ToyParser::Semicolon);
}

tree::TerminalNode* ToyParser::StructDefineContext::Semicolon(size_t i) {
  return getToken(ToyParser::Semicolon, i);
}


size_t ToyParser::StructDefineContext::getRuleIndex() const {
  return ToyParser::RuleStructDefine;
}


std::any ToyParser::StructDefineContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ToyVisitor*>(visitor))
    return parserVisitor->visitStructDefine(this);
  else
    return visitor->visitChildren(this);
}

ToyParser::StructDefineContext* ToyParser::structDefine() {
  StructDefineContext *_localctx = _tracker.createInstance<StructDefineContext>(_ctx, getState());
  enterRule(_localctx, 28, ToyParser::RuleStructDefine);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(198);
    match(ToyParser::Struct);
    setState(199);
    match(ToyParser::Identifier);
    setState(200);
    match(ToyParser::BracketOpen);
    setState(206);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == ToyParser::Var

    || _la == ToyParser::Identifier) {
      setState(201);
      varDecl();
      setState(202);
      match(ToyParser::Semicolon);
      setState(208);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(209);
    match(ToyParser::BracketClose);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool ToyParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 1: return expressionSempred(antlrcpp::downCast<ExpressionContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool ToyParser::expressionSempred(ExpressionContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 4);
    case 1: return precpred(_ctx, 3);
    case 2: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

void ToyParser::initialize() {
  std::call_once(toyParserOnceFlag, toyParserInitialize);
}
