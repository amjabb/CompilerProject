// Generated from Pirate.g4 by ANTLR 4.7.1

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PirateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PirateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PirateParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PirateParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(PirateParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#mainBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainBlock(PirateParser.MainBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#footer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooter(PirateParser.FooterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(PirateParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PirateParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(PirateParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link PirateParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(PirateParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link PirateParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(PirateParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsignedNumberExpr}
	 * labeled alternative in {@link PirateParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumberExpr(PirateParser.UnsignedNumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link PirateParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(PirateParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link PirateParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(PirateParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#mul_div_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div_op(PirateParser.Mul_div_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#add_sub_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_sub_op(PirateParser.Add_sub_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#compare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_stmt(PirateParser.Compare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PirateParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(PirateParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PirateParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link PirateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConst(PirateParser.IntegerConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link PirateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatConst(PirateParser.FloatConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(PirateParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(PirateParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PirateParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PirateParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_op(PirateParser.Compare_opContext ctx);
}