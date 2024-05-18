
// Generated from Toy.g4 by ANTLR 4.10.1

#pragma once


#include "antlr4-runtime.h"




class  ToyParser : public antlr4::Parser {
public:
  enum {
    ParentheseOpen = 1, ParentheseClose = 2, BracketOpen = 3, BracketClose = 4, 
    SbracketOpen = 5, SbracketClose = 6, Return = 7, Semicolon = 8, Var = 9, 
    Def = 10, Struct = 11, Identifier = 12, Number = 13, Equal = 14, AngleBracketsOpen = 15, 
    AngleBracketsClose = 16, Comma = 17, Add = 18, Mul = 19, Dot = 20, WS = 21, 
    Comment = 22
  };

  enum {
    RuleModule = 0, RuleExpression = 1, RuleIdentifierExpr = 2, RuleReturnExpr = 3, 
    RuleTensorLiteral = 4, RuleVarDecl = 5, RuleType = 6, RuleFunDefine = 7, 
    RulePrototype = 8, RuleDeclList = 9, RuleBlock = 10, RuleBlockExpr = 11, 
    RuleLiteralList = 12, RuleStructLiteral = 13, RuleStructDefine = 14
  };

  explicit ToyParser(antlr4::TokenStream *input);

  ToyParser(antlr4::TokenStream *input, const antlr4::atn::ParserATNSimulatorOptions &options);

  ~ToyParser() override;

  std::string getGrammarFileName() const override;

  const antlr4::atn::ATN& getATN() const override;

  const std::vector<std::string>& getRuleNames() const override;

  const antlr4::dfa::Vocabulary& getVocabulary() const override;

  antlr4::atn::SerializedATNView getSerializedATN() const override;


    std::vector<double> tensorDataBuffer;


  class ModuleContext;
  class ExpressionContext;
  class IdentifierExprContext;
  class ReturnExprContext;
  class TensorLiteralContext;
  class VarDeclContext;
  class TypeContext;
  class FunDefineContext;
  class PrototypeContext;
  class DeclListContext;
  class BlockContext;
  class BlockExprContext;
  class LiteralListContext;
  class StructLiteralContext;
  class StructDefineContext; 

  class  ModuleContext : public antlr4::ParserRuleContext {
  public:
    ModuleContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<StructDefineContext *> structDefine();
    StructDefineContext* structDefine(size_t i);
    std::vector<FunDefineContext *> funDefine();
    FunDefineContext* funDefine(size_t i);


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ModuleContext* module();

  class  ExpressionContext : public antlr4::ParserRuleContext {
  public:
    ExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Number();
    TensorLiteralContext *tensorLiteral();
    IdentifierExprContext *identifierExpr();
    StructLiteralContext *structLiteral();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *Mul();
    antlr4::tree::TerminalNode *Add();
    antlr4::tree::TerminalNode *Dot();


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpressionContext* expression();
  ExpressionContext* expression(int precedence);
  class  IdentifierExprContext : public antlr4::ParserRuleContext {
  public:
    IdentifierExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *ParentheseOpen();
    antlr4::tree::TerminalNode *ParentheseClose();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IdentifierExprContext* identifierExpr();

  class  ReturnExprContext : public antlr4::ParserRuleContext {
  public:
    ReturnExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Return();
    ExpressionContext *expression();


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ReturnExprContext* returnExpr();

  class  TensorLiteralContext : public antlr4::ParserRuleContext {
  public:
    std::vector<double> data;
    antlr4::Token *sbracketcloseToken = nullptr;
    antlr4::Token *numberToken = nullptr;
    TensorLiteralContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *SbracketOpen();
    antlr4::tree::TerminalNode *SbracketClose();
    std::vector<TensorLiteralContext *> tensorLiteral();
    TensorLiteralContext* tensorLiteral(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);
    antlr4::tree::TerminalNode *Number();


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TensorLiteralContext* tensorLiteral();

  class  VarDeclContext : public antlr4::ParserRuleContext {
  public:
    std::string idName;
    antlr4::Token *identifierToken = nullptr;
    antlr4::Token *equalToken = nullptr;
    VarDeclContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Var();
    std::vector<antlr4::tree::TerminalNode *> Identifier();
    antlr4::tree::TerminalNode* Identifier(size_t i);
    TypeContext *type();
    antlr4::tree::TerminalNode *Equal();
    ExpressionContext *expression();


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VarDeclContext* varDecl();

  class  TypeContext : public antlr4::ParserRuleContext {
  public:
    TypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *AngleBracketsOpen();
    std::vector<antlr4::tree::TerminalNode *> Number();
    antlr4::tree::TerminalNode* Number(size_t i);
    antlr4::tree::TerminalNode *AngleBracketsClose();
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeContext* type();

  class  FunDefineContext : public antlr4::ParserRuleContext {
  public:
    FunDefineContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PrototypeContext *prototype();
    BlockContext *block();


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunDefineContext* funDefine();

  class  PrototypeContext : public antlr4::ParserRuleContext {
  public:
    std::string idName;
    antlr4::Token *identifierToken = nullptr;
    PrototypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Def();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *ParentheseOpen();
    antlr4::tree::TerminalNode *ParentheseClose();
    DeclListContext *declList();


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrototypeContext* prototype();

  class  DeclListContext : public antlr4::ParserRuleContext {
  public:
    DeclListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VarDeclContext *varDecl();
    antlr4::tree::TerminalNode *Comma();
    DeclListContext *declList();


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  DeclListContext* declList();

  class  BlockContext : public antlr4::ParserRuleContext {
  public:
    BlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BracketOpen();
    antlr4::tree::TerminalNode *BracketClose();
    std::vector<BlockExprContext *> blockExpr();
    BlockExprContext* blockExpr(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Semicolon();
    antlr4::tree::TerminalNode* Semicolon(size_t i);


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockContext* block();

  class  BlockExprContext : public antlr4::ParserRuleContext {
  public:
    BlockExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VarDeclContext *varDecl();
    ReturnExprContext *returnExpr();
    ExpressionContext *expression();


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockExprContext* blockExpr();

  class  LiteralListContext : public antlr4::ParserRuleContext {
  public:
    LiteralListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TensorLiteralContext *tensorLiteral();
    antlr4::tree::TerminalNode *Comma();
    LiteralListContext *literalList();


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LiteralListContext* literalList();

  class  StructLiteralContext : public antlr4::ParserRuleContext {
  public:
    StructLiteralContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BracketOpen();
    antlr4::tree::TerminalNode *BracketClose();
    std::vector<StructLiteralContext *> structLiteral();
    StructLiteralContext* structLiteral(size_t i);
    std::vector<LiteralListContext *> literalList();
    LiteralListContext* literalList(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StructLiteralContext* structLiteral();

  class  StructDefineContext : public antlr4::ParserRuleContext {
  public:
    StructDefineContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Struct();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *BracketOpen();
    antlr4::tree::TerminalNode *BracketClose();
    std::vector<VarDeclContext *> varDecl();
    VarDeclContext* varDecl(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Semicolon();
    antlr4::tree::TerminalNode* Semicolon(size_t i);


    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StructDefineContext* structDefine();


  bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;

  bool expressionSempred(ExpressionContext *_localctx, size_t predicateIndex);

  // By default the static state used to implement the parser is lazily initialized during the first
  // call to the constructor. You can call this function if you wish to initialize the static state
  // ahead of time.
  static void initialize();

private:
};

