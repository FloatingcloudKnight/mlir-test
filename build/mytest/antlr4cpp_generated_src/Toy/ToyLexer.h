
// Generated from Toy.g4 by ANTLR 4.10.1

#pragma once


#include "antlr4-runtime.h"




class  ToyLexer : public antlr4::Lexer {
public:
  enum {
    ParentheseOpen = 1, ParentheseClose = 2, BracketOpen = 3, BracketClose = 4, 
    SbracketOpen = 5, SbracketClose = 6, Return = 7, Semicolon = 8, Var = 9, 
    Def = 10, Struct = 11, Identifier = 12, Number = 13, Equal = 14, AngleBracketsOpen = 15, 
    AngleBracketsClose = 16, Comma = 17, Add = 18, Mul = 19, Dot = 20, WS = 21, 
    Comment = 22
  };

  explicit ToyLexer(antlr4::CharStream *input);

  ~ToyLexer() override;


  std::string getGrammarFileName() const override;

  const std::vector<std::string>& getRuleNames() const override;

  const std::vector<std::string>& getChannelNames() const override;

  const std::vector<std::string>& getModeNames() const override;

  const antlr4::dfa::Vocabulary& getVocabulary() const override;

  antlr4::atn::SerializedATNView getSerializedATN() const override;

  const antlr4::atn::ATN& getATN() const override;

  // By default the static state used to implement the lexer is lazily initialized during the first
  // call to the constructor. You can call this function if you wish to initialize the static state
  // ahead of time.
  static void initialize();

private:

  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

};

