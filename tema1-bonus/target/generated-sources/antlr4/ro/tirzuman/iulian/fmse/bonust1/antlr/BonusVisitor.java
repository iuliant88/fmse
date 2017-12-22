// Generated from ro/tirzuman/iulian/fmse/bonust1/antlr/Bonus.g4 by ANTLR 4.3
package ro.tirzuman.iulian.fmse.bonust1.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BonusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BonusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BonusParser#assertt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertt(@NotNull BonusParser.AsserttContext ctx);

	/**
	 * Visit a parse tree produced by {@link BonusParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexp(@NotNull BonusParser.BexpContext ctx);

	/**
	 * Visit a parse tree produced by {@link BonusParser#boolRelOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolRelOp(@NotNull BonusParser.BoolRelOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link BonusParser#aritRelOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritRelOp(@NotNull BonusParser.AritRelOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link BonusParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull BonusParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link BonusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull BonusParser.ExpContext ctx);
}