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
	 * Visit a parse tree produced by {@link SimpleLangParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SimpleLangParser.DeclarationsContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleLangParser#returntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturntype(SimpleLangParser.ReturntypeContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#designatorstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorstatement(SimpleLangParser.DesignatorstatementContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SimpleLangParser.FactorContext ctx);
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