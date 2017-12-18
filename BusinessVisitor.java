// Generated from Business.g4 by ANTLR 4.7.1

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BusinessParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BusinessVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BusinessParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BusinessParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(BusinessParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#mainBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainBlock(BusinessParser.MainBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BusinessParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(BusinessParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(BusinessParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#declList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclList(BusinessParser.DeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(BusinessParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(BusinessParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#varId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarId(BusinessParser.VarIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#funcId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncId(BusinessParser.FuncIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#typeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeId(BusinessParser.TypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmt(BusinessParser.CompoundStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#funcCompoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCompoundStmt(BusinessParser.FuncCompoundStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(BusinessParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(BusinessParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#funcStmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncStmtList(BusinessParser.FuncStmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#funcStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncStmt(BusinessParser.FuncStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#funcAssignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAssignmentStmt(BusinessParser.FuncAssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#funcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(BusinessParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(BusinessParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(BusinessParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link BusinessParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(BusinessParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link BusinessParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(BusinessParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link BusinessParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(BusinessParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsignedNumberExpr}
	 * labeled alternative in {@link BusinessParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumberExpr(BusinessParser.UnsignedNumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link BusinessParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(BusinessParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link BusinessParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(BusinessParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signedNumberExpr}
	 * labeled alternative in {@link BusinessParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumberExpr(BusinessParser.SignedNumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link BusinessParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(BusinessParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#compareOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOp(BusinessParser.CompareOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#mulDivOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOp(BusinessParser.MulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#addSubOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(BusinessParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#signedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumber(BusinessParser.SignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(BusinessParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link BusinessParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConst(BusinessParser.IntegerConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link BusinessParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatConst(BusinessParser.FloatConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(BusinessParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(BusinessParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(BusinessParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(BusinessParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(BusinessParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(BusinessParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(BusinessParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#callStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(BusinessParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#functionDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDesignator(BusinessParser.FunctionDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(BusinessParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(BusinessParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#funcVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncVar(BusinessParser.FuncVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(BusinessParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#printStringStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStringStmt(BusinessParser.PrintStringStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#printDoubleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintDoubleStmt(BusinessParser.PrintDoubleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(BusinessParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#functionAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAssignment(BusinessParser.FunctionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#funcMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncMain(BusinessParser.FuncMainContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(BusinessParser.FunctionContext ctx);
}