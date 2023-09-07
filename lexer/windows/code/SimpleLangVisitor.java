// Generated from .\SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#project}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject(SimpleLangParser.ProjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code projectConstDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectConstDecl(SimpleLangParser.ProjectConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code projectVarDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectVarDecl(SimpleLangParser.ProjectVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code projectClassDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectClassDecl(SimpleLangParser.ProjectClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code projectEnumDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectEnumDecl(SimpleLangParser.ProjectEnumDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code projectInterfaceDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectInterfaceDecl(SimpleLangParser.ProjectInterfaceDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#constdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstdecl(SimpleLangParser.ConstdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#constvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstvalue(SimpleLangParser.ConstvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(SimpleLangParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#singlevardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglevardecl(SimpleLangParser.SinglevardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#enumdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumdecl(SimpleLangParser.EnumdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#numdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumdecl(SimpleLangParser.NumdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#classdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdecl(SimpleLangParser.ClassdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#interfacedecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfacedecl(SimpleLangParser.InterfacedeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#interfacemethoddecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfacemethoddecl(SimpleLangParser.InterfacemethoddeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#methoddecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddecl(SimpleLangParser.MethoddeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonVoidReturn}
	 * labeled alternative in {@link SimpleLangParser#returntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidReturn(SimpleLangParser.NonVoidReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidReturn}
	 * labeled alternative in {@link SimpleLangParser#returntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidReturn(SimpleLangParser.VoidReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#formalparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalparams(SimpleLangParser.FormalparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDesignator}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDesignator(SimpleLangParser.StatementDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIfElse}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIfElse(SimpleLangParser.StatementIfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementForLoop}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementForLoop(SimpleLangParser.StatementForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(SimpleLangParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementContinue(SimpleLangParser.StatementContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(SimpleLangParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementRead}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementRead(SimpleLangParser.StatementReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementPrint}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPrint(SimpleLangParser.StatementPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(SimpleLangParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code designatorAssign}
	 * labeled alternative in {@link SimpleLangParser#designatorstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorAssign(SimpleLangParser.DesignatorAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code designatorFunctionCall}
	 * labeled alternative in {@link SimpleLangParser#designatorstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorFunctionCall(SimpleLangParser.DesignatorFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code designatorUnaryOp}
	 * labeled alternative in {@link SimpleLangParser#designatorstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorUnaryOp(SimpleLangParser.DesignatorUnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#assignExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(SimpleLangParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#unaryop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryop(SimpleLangParser.UnaryopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(SimpleLangParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#actualpars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualpars(SimpleLangParser.ActualparsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#ifelsestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelsestatement(SimpleLangParser.IfelsestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#forloopstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloopstatement(SimpleLangParser.ForloopstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SimpleLangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#condterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondterm(SimpleLangParser.CondtermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#condfact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondfact(SimpleLangParser.CondfactContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SimpleLangParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code designatorFactor}
	 * labeled alternative in {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorFactor(SimpleLangParser.DesignatorFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constFactor}
	 * labeled alternative in {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstFactor(SimpleLangParser.ConstFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newFactor}
	 * labeled alternative in {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewFactor(SimpleLangParser.NewFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenFactor}
	 * labeled alternative in {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenFactor(SimpleLangParser.ParenFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(SimpleLangParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(SimpleLangParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(SimpleLangParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(SimpleLangParser.MulopContext ctx);
}