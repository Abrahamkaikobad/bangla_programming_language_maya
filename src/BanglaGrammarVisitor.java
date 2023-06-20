// Generated from E:/ANTRL4_PROJECTS/CSE425_Report\BanglaGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BanglaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BanglaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BanglaGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BanglaGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(BanglaGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#calculationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculationStatement(BanglaGrammarParser.CalculationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(BanglaGrammarParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(BanglaGrammarParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(BanglaGrammarParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BanglaGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BanglaGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(BanglaGrammarParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(BanglaGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(BanglaGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(BanglaGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(BanglaGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(BanglaGrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(BanglaGrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(BanglaGrammarParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(BanglaGrammarParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BanglaGrammarParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(BanglaGrammarParser.ArithmeticExpressionContext ctx);
}