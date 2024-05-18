// Generated from /mnt/d/llvm/mytoy/mytest/Toy.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ToyParser}.
 */
public interface ToyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ToyParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(ToyParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(ToyParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ToyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ToyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#identifierExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(ToyParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#identifierExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(ToyParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(ToyParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(ToyParser.ReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#tensorLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTensorLiteral(ToyParser.TensorLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#tensorLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTensorLiteral(ToyParser.TensorLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(ToyParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(ToyParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ToyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ToyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#funDefine}.
	 * @param ctx the parse tree
	 */
	void enterFunDefine(ToyParser.FunDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#funDefine}.
	 * @param ctx the parse tree
	 */
	void exitFunDefine(ToyParser.FunDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#prototype}.
	 * @param ctx the parse tree
	 */
	void enterPrototype(ToyParser.PrototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#prototype}.
	 * @param ctx the parse tree
	 */
	void exitPrototype(ToyParser.PrototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#declList}.
	 * @param ctx the parse tree
	 */
	void enterDeclList(ToyParser.DeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#declList}.
	 * @param ctx the parse tree
	 */
	void exitDeclList(ToyParser.DeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ToyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ToyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#blockExpr}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr(ToyParser.BlockExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#blockExpr}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr(ToyParser.BlockExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#literalList}.
	 * @param ctx the parse tree
	 */
	void enterLiteralList(ToyParser.LiteralListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#literalList}.
	 * @param ctx the parse tree
	 */
	void exitLiteralList(ToyParser.LiteralListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#structLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStructLiteral(ToyParser.StructLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#structLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStructLiteral(ToyParser.StructLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#structDefine}.
	 * @param ctx the parse tree
	 */
	void enterStructDefine(ToyParser.StructDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#structDefine}.
	 * @param ctx the parse tree
	 */
	void exitStructDefine(ToyParser.StructDefineContext ctx);
}