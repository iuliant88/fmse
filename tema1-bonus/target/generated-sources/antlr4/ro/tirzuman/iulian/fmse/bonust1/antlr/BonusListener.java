// Generated from ro/tirzuman/iulian/fmse/bonust1/antlr/Bonus.g4 by ANTLR 4.3
package ro.tirzuman.iulian.fmse.bonust1.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BonusParser}.
 */
public interface BonusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BonusParser#assertt}.
	 * @param ctx the parse tree
	 */
	void enterAssertt(@NotNull BonusParser.AsserttContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#assertt}.
	 * @param ctx the parse tree
	 */
	void exitAssertt(@NotNull BonusParser.AsserttContext ctx);

	/**
	 * Enter a parse tree produced by {@link BonusParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterBexp(@NotNull BonusParser.BexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitBexp(@NotNull BonusParser.BexpContext ctx);

	/**
	 * Enter a parse tree produced by {@link BonusParser#boolRelOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolRelOp(@NotNull BonusParser.BoolRelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#boolRelOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolRelOp(@NotNull BonusParser.BoolRelOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link BonusParser#aritRelOp}.
	 * @param ctx the parse tree
	 */
	void enterAritRelOp(@NotNull BonusParser.AritRelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#aritRelOp}.
	 * @param ctx the parse tree
	 */
	void exitAritRelOp(@NotNull BonusParser.AritRelOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link BonusParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull BonusParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull BonusParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link BonusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull BonusParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull BonusParser.ExpContext ctx);
}