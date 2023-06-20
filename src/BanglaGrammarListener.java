// Generated from E:/ANTRL4_PROJECTS/CSE425_Report\BanglaGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BanglaGrammarParser}.
 */
public interface BanglaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BanglaGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BanglaGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BanglaGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BanglaGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(BanglaGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(BanglaGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#calculationStatement}.
	 * @param ctx the parse tree
	 */
	void enterCalculationStatement(BanglaGrammarParser.CalculationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#calculationStatement}.
	 * @param ctx the parse tree
	 */
	void exitCalculationStatement(BanglaGrammarParser.CalculationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(BanglaGrammarParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(BanglaGrammarParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(BanglaGrammarParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(BanglaGrammarParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(BanglaGrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(BanglaGrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BanglaGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BanglaGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BanglaGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BanglaGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(BanglaGrammarParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(BanglaGrammarParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(BanglaGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(BanglaGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(BanglaGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(BanglaGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(BanglaGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(BanglaGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(BanglaGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(BanglaGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(BanglaGrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(BanglaGrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(BanglaGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(BanglaGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(BanglaGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(BanglaGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(BanglaGrammarParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(BanglaGrammarParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaGrammarParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(BanglaGrammarParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaGrammarParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(BanglaGrammarParser.ArithmeticExpressionContext ctx);
}