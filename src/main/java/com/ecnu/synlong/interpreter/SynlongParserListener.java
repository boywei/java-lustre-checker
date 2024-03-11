// Generated from C:/ECNU/synTools/synlong/src/main/resources/SynlongParser.g4 by ANTLR 4.13.1
package com.ecnu.synlong.interpreter;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SynlongParser}.
 */
public interface SynlongParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SynlongParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SynlongParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SynlongParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SynlongParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SynlongParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#typeBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypeBlock(SynlongParser.TypeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#typeBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypeBlock(SynlongParser.TypeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecl(SynlongParser.TypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecl(SynlongParser.TypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(SynlongParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(SynlongParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpr(SynlongParser.TypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpr(SynlongParser.TypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(SynlongParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(SynlongParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#typevar}.
	 * @param ctx the parse tree
	 */
	void enterTypevar(SynlongParser.TypevarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#typevar}.
	 * @param ctx the parse tree
	 */
	void exitTypevar(SynlongParser.TypevarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#constBlock}.
	 * @param ctx the parse tree
	 */
	void enterConstBlock(SynlongParser.ConstBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#constBlock}.
	 * @param ctx the parse tree
	 */
	void exitConstBlock(SynlongParser.ConstBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(SynlongParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(SynlongParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#constExpr}.
	 * @param ctx the parse tree
	 */
	void enterConstExpr(SynlongParser.ConstExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#constExpr}.
	 * @param ctx the parse tree
	 */
	void exitConstExpr(SynlongParser.ConstExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(SynlongParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(SynlongParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#constLabelExpr}.
	 * @param ctx the parse tree
	 */
	void enterConstLabelExpr(SynlongParser.ConstLabelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#constLabelExpr}.
	 * @param ctx the parse tree
	 */
	void exitConstLabelExpr(SynlongParser.ConstLabelExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#varDecls}.
	 * @param ctx the parse tree
	 */
	void enterVarDecls(SynlongParser.VarDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#varDecls}.
	 * @param ctx the parse tree
	 */
	void exitVarDecls(SynlongParser.VarDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#varId}.
	 * @param ctx the parse tree
	 */
	void enterVarId(SynlongParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#varId}.
	 * @param ctx the parse tree
	 */
	void exitVarId(SynlongParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#whenDecl}.
	 * @param ctx the parse tree
	 */
	void enterWhenDecl(SynlongParser.WhenDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#whenDecl}.
	 * @param ctx the parse tree
	 */
	void exitWhenDecl(SynlongParser.WhenDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#clockExpr}.
	 * @param ctx the parse tree
	 */
	void enterClockExpr(SynlongParser.ClockExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#clockExpr}.
	 * @param ctx the parse tree
	 */
	void exitClockExpr(SynlongParser.ClockExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#lastDecl}.
	 * @param ctx the parse tree
	 */
	void enterLastDecl(SynlongParser.LastDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#lastDecl}.
	 * @param ctx the parse tree
	 */
	void exitLastDecl(SynlongParser.LastDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#userOpDecl}.
	 * @param ctx the parse tree
	 */
	void enterUserOpDecl(SynlongParser.UserOpDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#userOpDecl}.
	 * @param ctx the parse tree
	 */
	void exitUserOpDecl(SynlongParser.UserOpDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#opKind}.
	 * @param ctx the parse tree
	 */
	void enterOpKind(SynlongParser.OpKindContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#opKind}.
	 * @param ctx the parse tree
	 */
	void exitOpKind(SynlongParser.OpKindContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(SynlongParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(SynlongParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(SynlongParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(SynlongParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#opBody}.
	 * @param ctx the parse tree
	 */
	void enterOpBody(SynlongParser.OpBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#opBody}.
	 * @param ctx the parse tree
	 */
	void exitOpBody(SynlongParser.OpBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#localBlock}.
	 * @param ctx the parse tree
	 */
	void enterLocalBlock(SynlongParser.LocalBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#localBlock}.
	 * @param ctx the parse tree
	 */
	void exitLocalBlock(SynlongParser.LocalBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(SynlongParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(SynlongParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(SynlongParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(SynlongParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#lhsId}.
	 * @param ctx the parse tree
	 */
	void enterLhsId(SynlongParser.LhsIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#lhsId}.
	 * @param ctx the parse tree
	 */
	void exitLhsId(SynlongParser.LhsIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(SynlongParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(SynlongParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#returnsVar}.
	 * @param ctx the parse tree
	 */
	void enterReturnsVar(SynlongParser.ReturnsVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#returnsVar}.
	 * @param ctx the parse tree
	 */
	void exitReturnsVar(SynlongParser.ReturnsVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#stateMachine}.
	 * @param ctx the parse tree
	 */
	void enterStateMachine(SynlongParser.StateMachineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#stateMachine}.
	 * @param ctx the parse tree
	 */
	void exitStateMachine(SynlongParser.StateMachineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#stateDecl}.
	 * @param ctx the parse tree
	 */
	void enterStateDecl(SynlongParser.StateDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#stateDecl}.
	 * @param ctx the parse tree
	 */
	void exitStateDecl(SynlongParser.StateDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#dataDef}.
	 * @param ctx the parse tree
	 */
	void enterDataDef(SynlongParser.DataDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#dataDef}.
	 * @param ctx the parse tree
	 */
	void exitDataDef(SynlongParser.DataDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(SynlongParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(SynlongParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#clockedBlock}.
	 * @param ctx the parse tree
	 */
	void enterClockedBlock(SynlongParser.ClockedBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#clockedBlock}.
	 * @param ctx the parse tree
	 */
	void exitClockedBlock(SynlongParser.ClockedBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(SynlongParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(SynlongParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#matchBlock}.
	 * @param ctx the parse tree
	 */
	void enterMatchBlock(SynlongParser.MatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#matchBlock}.
	 * @param ctx the parse tree
	 */
	void exitMatchBlock(SynlongParser.MatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SynlongParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SynlongParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(SynlongParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(SynlongParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#tempoExpr}.
	 * @param ctx the parse tree
	 */
	void enterTempoExpr(SynlongParser.TempoExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#tempoExpr}.
	 * @param ctx the parse tree
	 */
	void exitTempoExpr(SynlongParser.TempoExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(SynlongParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(SynlongParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(SynlongParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(SynlongParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#structExpr}.
	 * @param ctx the parse tree
	 */
	void enterStructExpr(SynlongParser.StructExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#structExpr}.
	 * @param ctx the parse tree
	 */
	void exitStructExpr(SynlongParser.StructExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#mixedConstructor}.
	 * @param ctx the parse tree
	 */
	void enterMixedConstructor(SynlongParser.MixedConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#mixedConstructor}.
	 * @param ctx the parse tree
	 */
	void exitMixedConstructor(SynlongParser.MixedConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#labelExpr}.
	 * @param ctx the parse tree
	 */
	void enterLabelExpr(SynlongParser.LabelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#labelExpr}.
	 * @param ctx the parse tree
	 */
	void exitLabelExpr(SynlongParser.LabelExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(SynlongParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(SynlongParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#labelOrIndex}.
	 * @param ctx the parse tree
	 */
	void enterLabelOrIndex(SynlongParser.LabelOrIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#labelOrIndex}.
	 * @param ctx the parse tree
	 */
	void exitLabelOrIndex(SynlongParser.LabelOrIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#switchExpr}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpr(SynlongParser.SwitchExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#switchExpr}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpr(SynlongParser.SwitchExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpr(SynlongParser.CaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpr(SynlongParser.CaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(SynlongParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(SynlongParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#applyExpr}.
	 * @param ctx the parse tree
	 */
	void enterApplyExpr(SynlongParser.ApplyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#applyExpr}.
	 * @param ctx the parse tree
	 */
	void exitApplyExpr(SynlongParser.ApplyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOp(SynlongParser.PrefixOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOp(SynlongParser.PrefixOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#prefixUnaryOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOp(SynlongParser.PrefixUnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#prefixUnaryOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOp(SynlongParser.PrefixUnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#prefixBinaryOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixBinaryOp(SynlongParser.PrefixBinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#prefixBinaryOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixBinaryOp(SynlongParser.PrefixBinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void enterIterator(SynlongParser.IteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void exitIterator(SynlongParser.IteratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(SynlongParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(SynlongParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#unaryArithOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryArithOp(SynlongParser.UnaryArithOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#unaryArithOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryArithOp(SynlongParser.UnaryArithOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#binArithOp}.
	 * @param ctx the parse tree
	 */
	void enterBinArithOp(SynlongParser.BinArithOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#binArithOp}.
	 * @param ctx the parse tree
	 */
	void exitBinArithOp(SynlongParser.BinArithOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#binRelationOp}.
	 * @param ctx the parse tree
	 */
	void enterBinRelationOp(SynlongParser.BinRelationOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#binRelationOp}.
	 * @param ctx the parse tree
	 */
	void exitBinRelationOp(SynlongParser.BinRelationOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#binBoolOp}.
	 * @param ctx the parse tree
	 */
	void enterBinBoolOp(SynlongParser.BinBoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#binBoolOp}.
	 * @param ctx the parse tree
	 */
	void exitBinBoolOp(SynlongParser.BinBoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(SynlongParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(SynlongParser.AtomContext ctx);
}