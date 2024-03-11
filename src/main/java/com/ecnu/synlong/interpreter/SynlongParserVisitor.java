// Generated from C:/ECNU/synTools/synlong/src/main/resources/SynlongParser.g4 by ANTLR 4.13.1
package com.ecnu.synlong.interpreter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SynlongParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SynlongParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SynlongParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SynlongParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SynlongParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#typeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBlock(SynlongParser.TypeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#typeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecl(SynlongParser.TypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(SynlongParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpr(SynlongParser.TypeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(SynlongParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#typevar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypevar(SynlongParser.TypevarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#constBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstBlock(SynlongParser.ConstBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(SynlongParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#constExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpr(SynlongParser.ConstExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstList(SynlongParser.ConstListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#constLabelExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstLabelExpr(SynlongParser.ConstLabelExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#varDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecls(SynlongParser.VarDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#varId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarId(SynlongParser.VarIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#whenDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenDecl(SynlongParser.WhenDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#clockExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockExpr(SynlongParser.ClockExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#lastDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastDecl(SynlongParser.LastDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#userOpDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOpDecl(SynlongParser.UserOpDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#opKind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpKind(SynlongParser.OpKindContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(SynlongParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(SynlongParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#opBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBody(SynlongParser.OpBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#localBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalBlock(SynlongParser.LocalBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(SynlongParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(SynlongParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#lhsId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsId(SynlongParser.LhsIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(SynlongParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#returnsVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsVar(SynlongParser.ReturnsVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#stateMachine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMachine(SynlongParser.StateMachineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#stateDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateDecl(SynlongParser.StateDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#dataDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDef(SynlongParser.DataDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(SynlongParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#clockedBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockedBlock(SynlongParser.ClockedBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(SynlongParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#matchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchBlock(SynlongParser.MatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SynlongParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(SynlongParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#tempoExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempoExpr(SynlongParser.TempoExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(SynlongParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(SynlongParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#structExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructExpr(SynlongParser.StructExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#mixedConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixedConstructor(SynlongParser.MixedConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#labelExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelExpr(SynlongParser.LabelExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(SynlongParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#labelOrIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelOrIndex(SynlongParser.LabelOrIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#switchExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpr(SynlongParser.SwitchExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#caseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpr(SynlongParser.CaseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(SynlongParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#applyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyExpr(SynlongParser.ApplyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOp(SynlongParser.PrefixOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#prefixUnaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryOp(SynlongParser.PrefixUnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#prefixBinaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixBinaryOp(SynlongParser.PrefixBinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterator(SynlongParser.IteratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(SynlongParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#unaryArithOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryArithOp(SynlongParser.UnaryArithOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#binArithOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinArithOp(SynlongParser.BinArithOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#binRelationOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinRelationOp(SynlongParser.BinRelationOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#binBoolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinBoolOp(SynlongParser.BinBoolOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(SynlongParser.AtomContext ctx);
}