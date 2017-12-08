// Generated from Hello.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(HelloParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(HelloParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(HelloParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(HelloParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(HelloParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(HelloParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(HelloParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(HelloParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(HelloParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(HelloParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(HelloParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(HelloParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(HelloParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(HelloParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(HelloParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(HelloParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(HelloParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(HelloParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterCompare_op(HelloParser.Compare_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitCompare_op(HelloParser.Compare_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompare_stmt(HelloParser.Compare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompare_stmt(HelloParser.Compare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(HelloParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(HelloParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(HelloParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(HelloParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(HelloParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(HelloParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(HelloParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(HelloParser.While_stmtContext ctx);
}