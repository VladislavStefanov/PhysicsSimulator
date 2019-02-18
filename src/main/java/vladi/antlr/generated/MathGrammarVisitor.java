// Generated from MathGrammar.g4 by ANTLR 4.7.2
package vladi.antlr.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MathGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MathGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MathGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tan}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTan(MathGrammarParser.TanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ln}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLn(MathGrammarParser.LnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code log}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(MathGrammarParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cos}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(MathGrammarParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(MathGrammarParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code acos}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcos(MathGrammarParser.AcosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(MathGrammarParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atan}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtan(MathGrammarParser.AtanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(MathGrammarParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MathGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reverseSign}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverseSign(MathGrammarParser.ReverseSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MathGrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sin}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(MathGrammarParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asin}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsin(MathGrammarParser.AsinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lg}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLg(MathGrammarParser.LgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code power}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(MathGrammarParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(MathGrammarParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code log2}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog2(MathGrammarParser.Log2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(MathGrammarParser.AdditionContext ctx);
}