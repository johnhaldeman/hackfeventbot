// Generated from HEQL.g4 by ANTLR 4.7
package org.hackf.discordeventbot.heql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HEQLParser}.
 */
public interface HEQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HEQLParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(HEQLParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(HEQLParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#heql_block}.
	 * @param ctx the parse tree
	 */
	void enterHeql_block(HEQLParser.Heql_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#heql_block}.
	 * @param ctx the parse tree
	 */
	void exitHeql_block(HEQLParser.Heql_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#selectBase}.
	 * @param ctx the parse tree
	 */
	void enterSelectBase(HEQLParser.SelectBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#selectBase}.
	 * @param ctx the parse tree
	 */
	void exitSelectBase(HEQLParser.SelectBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#selectNext}.
	 * @param ctx the parse tree
	 */
	void enterSelectNext(HEQLParser.SelectNextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#selectNext}.
	 * @param ctx the parse tree
	 */
	void exitSelectNext(HEQLParser.SelectNextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#selectDistinct}.
	 * @param ctx the parse tree
	 */
	void enterSelectDistinct(HEQLParser.SelectDistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#selectDistinct}.
	 * @param ctx the parse tree
	 */
	void exitSelectDistinct(HEQLParser.SelectDistinctContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condLogicalOr}
	 * labeled alternative in {@link HEQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondLogicalOr(HEQLParser.CondLogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condLogicalOr}
	 * labeled alternative in {@link HEQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondLogicalOr(HEQLParser.CondLogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condComparison}
	 * labeled alternative in {@link HEQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondComparison(HEQLParser.CondComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condComparison}
	 * labeled alternative in {@link HEQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondComparison(HEQLParser.CondComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condParen}
	 * labeled alternative in {@link HEQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondParen(HEQLParser.CondParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condParen}
	 * labeled alternative in {@link HEQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondParen(HEQLParser.CondParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condLogicalAnd}
	 * labeled alternative in {@link HEQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondLogicalAnd(HEQLParser.CondLogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condLogicalAnd}
	 * labeled alternative in {@link HEQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondLogicalAnd(HEQLParser.CondLogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(HEQLParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(HEQLParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(HEQLParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(HEQLParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#leftParen}.
	 * @param ctx the parse tree
	 */
	void enterLeftParen(HEQLParser.LeftParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#leftParen}.
	 * @param ctx the parse tree
	 */
	void exitLeftParen(HEQLParser.LeftParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#rightParen}.
	 * @param ctx the parse tree
	 */
	void enterRightParen(HEQLParser.RightParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#rightParen}.
	 * @param ctx the parse tree
	 */
	void exitRightParen(HEQLParser.RightParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#selField}.
	 * @param ctx the parse tree
	 */
	void enterSelField(HEQLParser.SelFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#selField}.
	 * @param ctx the parse tree
	 */
	void exitSelField(HEQLParser.SelFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#condField}.
	 * @param ctx the parse tree
	 */
	void enterCondField(HEQLParser.CondFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#condField}.
	 * @param ctx the parse tree
	 */
	void exitCondField(HEQLParser.CondFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(HEQLParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(HEQLParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(HEQLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(HEQLParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HEQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HEQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HEQLParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(HEQLParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HEQLParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(HEQLParser.FormatContext ctx);
}