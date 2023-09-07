// Generated from .\SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLangParser}.
 */
public interface SimpleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#project}.
	 * @param ctx the parse tree
	 */
	void enterProject(SimpleLangParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#project}.
	 * @param ctx the parse tree
	 */
	void exitProject(SimpleLangParser.ProjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code projectConstDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterProjectConstDecl(SimpleLangParser.ProjectConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code projectConstDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitProjectConstDecl(SimpleLangParser.ProjectConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code projectVarDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterProjectVarDecl(SimpleLangParser.ProjectVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code projectVarDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitProjectVarDecl(SimpleLangParser.ProjectVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code projectClassDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterProjectClassDecl(SimpleLangParser.ProjectClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code projectClassDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitProjectClassDecl(SimpleLangParser.ProjectClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code projectEnumDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterProjectEnumDecl(SimpleLangParser.ProjectEnumDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code projectEnumDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitProjectEnumDecl(SimpleLangParser.ProjectEnumDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code projectInterfaceDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterProjectInterfaceDecl(SimpleLangParser.ProjectInterfaceDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code projectInterfaceDecl}
	 * labeled alternative in {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitProjectInterfaceDecl(SimpleLangParser.ProjectInterfaceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#constdecl}.
	 * @param ctx the parse tree
	 */
	void enterConstdecl(SimpleLangParser.ConstdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#constdecl}.
	 * @param ctx the parse tree
	 */
	void exitConstdecl(SimpleLangParser.ConstdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#constvalue}.
	 * @param ctx the parse tree
	 */
	void enterConstvalue(SimpleLangParser.ConstvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#constvalue}.
	 * @param ctx the parse tree
	 */
	void exitConstvalue(SimpleLangParser.ConstvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(SimpleLangParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(SimpleLangParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#singlevardecl}.
	 * @param ctx the parse tree
	 */
	void enterSinglevardecl(SimpleLangParser.SinglevardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#singlevardecl}.
	 * @param ctx the parse tree
	 */
	void exitSinglevardecl(SimpleLangParser.SinglevardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#enumdecl}.
	 * @param ctx the parse tree
	 */
	void enterEnumdecl(SimpleLangParser.EnumdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#enumdecl}.
	 * @param ctx the parse tree
	 */
	void exitEnumdecl(SimpleLangParser.EnumdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#numdecl}.
	 * @param ctx the parse tree
	 */
	void enterNumdecl(SimpleLangParser.NumdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#numdecl}.
	 * @param ctx the parse tree
	 */
	void exitNumdecl(SimpleLangParser.NumdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void enterClassdecl(SimpleLangParser.ClassdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void exitClassdecl(SimpleLangParser.ClassdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#interfacedecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfacedecl(SimpleLangParser.InterfacedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#interfacedecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfacedecl(SimpleLangParser.InterfacedeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#interfacemethoddecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfacemethoddecl(SimpleLangParser.InterfacemethoddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#interfacemethoddecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfacemethoddecl(SimpleLangParser.InterfacemethoddeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void enterMethoddecl(SimpleLangParser.MethoddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void exitMethoddecl(SimpleLangParser.MethoddeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonVoidReturn}
	 * labeled alternative in {@link SimpleLangParser#returntype}.
	 * @param ctx the parse tree
	 */
	void enterNonVoidReturn(SimpleLangParser.NonVoidReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonVoidReturn}
	 * labeled alternative in {@link SimpleLangParser#returntype}.
	 * @param ctx the parse tree
	 */
	void exitNonVoidReturn(SimpleLangParser.NonVoidReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidReturn}
	 * labeled alternative in {@link SimpleLangParser#returntype}.
	 * @param ctx the parse tree
	 */
	void enterVoidReturn(SimpleLangParser.VoidReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidReturn}
	 * labeled alternative in {@link SimpleLangParser#returntype}.
	 * @param ctx the parse tree
	 */
	void exitVoidReturn(SimpleLangParser.VoidReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#formalparams}.
	 * @param ctx the parse tree
	 */
	void enterFormalparams(SimpleLangParser.FormalparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#formalparams}.
	 * @param ctx the parse tree
	 */
	void exitFormalparams(SimpleLangParser.FormalparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDesignator}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDesignator(SimpleLangParser.StatementDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDesignator}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDesignator(SimpleLangParser.StatementDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIfElse}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIfElse(SimpleLangParser.StatementIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIfElse}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIfElse(SimpleLangParser.StatementIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementForLoop}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementForLoop(SimpleLangParser.StatementForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementForLoop}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementForLoop(SimpleLangParser.StatementForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreak(SimpleLangParser.StatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreak(SimpleLangParser.StatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementContinue(SimpleLangParser.StatementContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementContinue(SimpleLangParser.StatementContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(SimpleLangParser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(SimpleLangParser.StatementReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementRead}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementRead(SimpleLangParser.StatementReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementRead}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementRead(SimpleLangParser.StatementReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementPrint}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementPrint(SimpleLangParser.StatementPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementPrint}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementPrint(SimpleLangParser.StatementPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(SimpleLangParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(SimpleLangParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code designatorAssign}
	 * labeled alternative in {@link SimpleLangParser#designatorstatement}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorAssign(SimpleLangParser.DesignatorAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code designatorAssign}
	 * labeled alternative in {@link SimpleLangParser#designatorstatement}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorAssign(SimpleLangParser.DesignatorAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code designatorFunctionCall}
	 * labeled alternative in {@link SimpleLangParser#designatorstatement}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorFunctionCall(SimpleLangParser.DesignatorFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code designatorFunctionCall}
	 * labeled alternative in {@link SimpleLangParser#designatorstatement}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorFunctionCall(SimpleLangParser.DesignatorFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code designatorUnaryOp}
	 * labeled alternative in {@link SimpleLangParser#designatorstatement}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorUnaryOp(SimpleLangParser.DesignatorUnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code designatorUnaryOp}
	 * labeled alternative in {@link SimpleLangParser#designatorstatement}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorUnaryOp(SimpleLangParser.DesignatorUnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(SimpleLangParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(SimpleLangParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#unaryop}.
	 * @param ctx the parse tree
	 */
	void enterUnaryop(SimpleLangParser.UnaryopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#unaryop}.
	 * @param ctx the parse tree
	 */
	void exitUnaryop(SimpleLangParser.UnaryopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(SimpleLangParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(SimpleLangParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#actualpars}.
	 * @param ctx the parse tree
	 */
	void enterActualpars(SimpleLangParser.ActualparsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#actualpars}.
	 * @param ctx the parse tree
	 */
	void exitActualpars(SimpleLangParser.ActualparsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#ifelsestatement}.
	 * @param ctx the parse tree
	 */
	void enterIfelsestatement(SimpleLangParser.IfelsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#ifelsestatement}.
	 * @param ctx the parse tree
	 */
	void exitIfelsestatement(SimpleLangParser.IfelsestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#forloopstatement}.
	 * @param ctx the parse tree
	 */
	void enterForloopstatement(SimpleLangParser.ForloopstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#forloopstatement}.
	 * @param ctx the parse tree
	 */
	void exitForloopstatement(SimpleLangParser.ForloopstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SimpleLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SimpleLangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#condterm}.
	 * @param ctx the parse tree
	 */
	void enterCondterm(SimpleLangParser.CondtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#condterm}.
	 * @param ctx the parse tree
	 */
	void exitCondterm(SimpleLangParser.CondtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#condfact}.
	 * @param ctx the parse tree
	 */
	void enterCondfact(SimpleLangParser.CondfactContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#condfact}.
	 * @param ctx the parse tree
	 */
	void exitCondfact(SimpleLangParser.CondfactContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SimpleLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SimpleLangParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code designatorFactor}
	 * labeled alternative in {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorFactor(SimpleLangParser.DesignatorFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code designatorFactor}
	 * labeled alternative in {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorFactor(SimpleLangParser.DesignatorFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constFactor}
	 * labeled alternative in {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterConstFactor(SimpleLangParser.ConstFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constFactor}
	 * labeled alternative in {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitConstFactor(SimpleLangParser.ConstFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newFactor}
	 * labeled alternative in {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNewFactor(SimpleLangParser.NewFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newFactor}
	 * labeled alternative in {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNewFactor(SimpleLangParser.NewFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenFactor}
	 * labeled alternative in {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenFactor(SimpleLangParser.ParenFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenFactor}
	 * labeled alternative in {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenFactor(SimpleLangParser.ParenFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(SimpleLangParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(SimpleLangParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(SimpleLangParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(SimpleLangParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(SimpleLangParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(SimpleLangParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(SimpleLangParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(SimpleLangParser.MulopContext ctx);
}