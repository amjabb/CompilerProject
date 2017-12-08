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
	 * Visit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HelloParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(HelloParser.FactorContext ctx);
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
	 * Visit a parse tree produced by {@link HelloParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(HelloParser.OperatorContext ctx);
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