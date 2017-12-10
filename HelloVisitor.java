// Generated from Hello.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(HelloParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HelloParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(HelloParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(HelloParser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(HelloParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(HelloParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(HelloParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(HelloParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_compare}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_compare(HelloParser.Expr_compareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_factor}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_factor(HelloParser.Expr_factorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_math}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_math(HelloParser.Expr_mathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(HelloParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(HelloParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(HelloParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_op(HelloParser.Compare_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_stmt(HelloParser.Compare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#mathOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOp(HelloParser.MathOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(HelloParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(HelloParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(HelloParser.While_stmtContext ctx);
}