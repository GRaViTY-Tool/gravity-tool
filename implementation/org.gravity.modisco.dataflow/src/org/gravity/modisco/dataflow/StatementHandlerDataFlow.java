package org.gravity.modisco.dataflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.AssertStatement;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.BreakStatement;
import org.eclipse.gmt.modisco.java.CatchClause;
import org.eclipse.gmt.modisco.java.ConstructorInvocation;
import org.eclipse.gmt.modisco.java.ContinueStatement;
import org.eclipse.gmt.modisco.java.DoStatement;
import org.eclipse.gmt.modisco.java.EmptyStatement;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.ExpressionStatement;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.LabeledStatement;
import org.eclipse.gmt.modisco.java.ReturnStatement;
import org.eclipse.gmt.modisco.java.Statement;
import org.eclipse.gmt.modisco.java.SuperConstructorInvocation;
import org.eclipse.gmt.modisco.java.SwitchCase;
import org.eclipse.gmt.modisco.java.SwitchStatement;
import org.eclipse.gmt.modisco.java.SynchronizedStatement;
import org.eclipse.gmt.modisco.java.ThrowStatement;
import org.eclipse.gmt.modisco.java.TryStatement;
import org.eclipse.gmt.modisco.java.TypeDeclarationStatement;
import org.eclipse.gmt.modisco.java.UnresolvedLabeledStatement;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.VariableDeclarationStatement;
import org.eclipse.gmt.modisco.java.WhileStatement;
import org.gravity.modisco.MDefinition;

/**
 * A statement handler for all kinds of java statements, which determines the data flow between statements.
 * The inter-statement flow is used to derive inter-member flow, which is stored in the corresponding fields of each handler.
 * 
 * @author dmebus
 *
 */
public class StatementHandlerDataFlow {
	
	/**
	 * The incoming flow of the member corresponding to this handler.
	 */
	private final List<FlowNode> memberIn = new ArrayList<>();
	
	/**
	 * The outgoing flow of the member corresponding to this handler.
	 */
	private final List<FlowNode> memberOut = new ArrayList<>();
	
	/**
	 * The statements and expressions, which have already been processed, associated with their FlowNode representations.
	 */
	private final HashMap<Object, FlowNode> alreadySeen = new HashMap<>();
	
	/**
	 * The member definition corresponding to this handler.
	 */
	private MDefinition memberDef;
	
	/**
	 * The expression handler associated with this statement handler.
	 */
	private ExpressionHandlerDataFlow expressionHandler;
	
	/**
	 * The misc handler associated with this statement handler.
	 */
	private MiscHandlerDataFlow miscHandler;

	public StatementHandlerDataFlow(MDefinition correspondingMember) {
		memberDef = correspondingMember;
		expressionHandler = new ExpressionHandlerDataFlow(this);
		miscHandler = new MiscHandlerDataFlow(this);
	}
	
	public FlowNode handle(Statement statement, FlowNode member) {
		if (statement == null) {
			return member; // assume nothing to do is success
		}
		if (statement instanceof AssertStatement) {
			AssertStatement assertStatement = (AssertStatement) statement;
			return handle(assertStatement, member);

		} else if (statement instanceof Block) {
			Block block = (Block) statement;
			return handle(block, member);

		} else if (statement instanceof BreakStatement) {
			BreakStatement breakStatement = (BreakStatement) statement;
			return handle(breakStatement, member);

		} else if (statement instanceof CatchClause) {
			CatchClause catchClause = (CatchClause) statement;
			return handle(catchClause, member);

		} else if (statement instanceof ConstructorInvocation) {
			ConstructorInvocation constructorInvocation = (ConstructorInvocation) statement;
			return handle(constructorInvocation, member);

		} else if (statement instanceof ContinueStatement) {
			ContinueStatement continueStatement = (ContinueStatement) statement;
			return handle(continueStatement, member);

		} else if (statement instanceof DoStatement) {
			DoStatement doStatement = (DoStatement) statement;
			return handle(doStatement, member);

		} else if (statement instanceof EmptyStatement) {
			EmptyStatement emptyStatement = (EmptyStatement) statement;
			return handle(emptyStatement, member);

		} else if (statement instanceof EnhancedForStatement) {
			EnhancedForStatement enhancedForStetement = (EnhancedForStatement) statement;
			return handle(enhancedForStetement, member);

		} else if (statement instanceof ExpressionStatement) {
			ExpressionStatement expressionStatement = (ExpressionStatement) statement;
			return handle(expressionStatement, member);

		} else if (statement instanceof ForStatement) {
			ForStatement forStatement = (ForStatement) statement;
			return handle(forStatement, member);

		} else if (statement instanceof IfStatement) {
			IfStatement ifStatement = (IfStatement) statement;
			return handle(ifStatement, member);

		} else if (statement instanceof LabeledStatement) {
			LabeledStatement labeledStatement = (LabeledStatement) statement;
			return handle(labeledStatement, member);

		} else if (statement instanceof ReturnStatement) {
			ReturnStatement returnStatement = (ReturnStatement) statement;
			return handle(returnStatement, member);

		} else if (statement instanceof SuperConstructorInvocation) {
			SuperConstructorInvocation superConstructorInvocation = (SuperConstructorInvocation) statement;
			return handle(superConstructorInvocation, member);

		} else if (statement instanceof SwitchCase) {
			SwitchCase switchCase = (SwitchCase) statement;
			return handle(switchCase, member);

		} else if (statement instanceof SwitchStatement) {
			SwitchStatement switchStatement = (SwitchStatement) statement;
			return handle(switchStatement, member);

		} else if (statement instanceof SynchronizedStatement) {
			SynchronizedStatement synchronizedStatement = (SynchronizedStatement) statement;
			return handle(synchronizedStatement, member);

		} else if (statement instanceof ThrowStatement) {
			ThrowStatement throwStatement = (ThrowStatement) statement;
			return handle(throwStatement, member);

		} else if (statement instanceof TryStatement) {
			TryStatement tryStatement = (TryStatement) statement;
			return handle(tryStatement, member);

		} else if (statement instanceof TypeDeclarationStatement) {
			TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) statement;
			return handle(typeDeclarationStatement, member);

		} else if (statement instanceof UnresolvedLabeledStatement) {
			UnresolvedLabeledStatement unresolvedLabeledStatement = (UnresolvedLabeledStatement) statement;
			return handle(unresolvedLabeledStatement, member);

		} else if (statement instanceof VariableDeclarationStatement) {
			VariableDeclarationStatement variableDeclarationStatement = (VariableDeclarationStatement) statement;
			return handle(variableDeclarationStatement, member);

		} else if (statement instanceof WhileStatement) {
			WhileStatement whileStatement = (WhileStatement) statement;
			return handle(whileStatement, member);

		} else {
			return member;
		}
	}

	private FlowNode handle(WhileStatement whileStatement, FlowNode member) {
		if (whileStatement == null) {
			return member; // assume nothing to do is success
		}
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		Statement body = whileStatement.getBody();
		handle(body, new FlowNode(body));
		Expression expression = whileStatement.getExpression();
		expressionHandler.handle(expression, new FlowNode(expression));
		alreadySeen.put(whileStatement, member);
		return member;
	}

	private FlowNode handle(VariableDeclarationStatement variableDeclarationStatement, FlowNode member) {
		if (variableDeclarationStatement == null) {
			return member; // assume nothing to do is success
		}
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		for (VariableDeclarationFragment fragment : variableDeclarationStatement.getFragments()) {
			miscHandler.handle(fragment, new FlowNode(fragment));
		}
		alreadySeen.put(variableDeclarationStatement, member);
		return member;
	}

	private FlowNode handle(TypeDeclarationStatement typeDeclarationStatement, FlowNode member) {
		if (typeDeclarationStatement == null) {
			return member; // assume nothing to do is success
		}
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		AbstractTypeDeclaration declaration = typeDeclarationStatement.getDeclaration();
		miscHandler.handle(declaration, new FlowNode(declaration));
		alreadySeen.put(typeDeclarationStatement, member);
		return member;
	}

	private FlowNode handle(TryStatement tryStatement, FlowNode member) {
		if (tryStatement == null) {
			return member; // assume nothing to do is success
		}
		handle(tryStatement.getBody(), member);
		handle(tryStatement.getFinally(), member);
		for (CatchClause clause : tryStatement.getCatchClauses()) {
			handle(clause, member);
		}
		return member;
	}

	private FlowNode handle(ThrowStatement throwStatement, FlowNode member) {
		if (throwStatement == null) {
			return member; // assume nothing to do is success
		}
		expressionHandler.handle(throwStatement.getExpression(), member);
		return member;
	}

	private FlowNode handle(SynchronizedStatement synchronizedStatement, FlowNode member) {
		if (synchronizedStatement == null) {
			return member; // assume nothing to do is success
		}
		handle(synchronizedStatement.getBody(), member);
		expressionHandler.handle(synchronizedStatement.getExpression(), member);
		return member;
	}

	private FlowNode handle(SwitchStatement switchStatement, FlowNode member) {
		if (switchStatement == null) {
			return member; // assume nothing to do is success
		}
		for (Statement statement : switchStatement.getStatements()) {
			handle(statement, member);
		}
		expressionHandler.handle(switchStatement.getExpression(), member);
		return member;
	}

	private FlowNode handle(SwitchCase switchCase, FlowNode member) {
		if (switchCase == null) {
			return member; // assume nothing to do is success
		}
		return expressionHandler.handle(switchCase.getExpression(), member);
	}

	private FlowNode handle(SuperConstructorInvocation superConstructorInvocation, FlowNode member) {
		if (superConstructorInvocation == null) {
			return member; // assume nothing to do is success
		}
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		Expression expression = superConstructorInvocation.getExpression();
		expressionHandler.handle(expression, new FlowNode(expression));
		for (Expression argument : superConstructorInvocation.getArguments()) {
			expressionHandler.handle(argument, new FlowNode(argument));
		}
		alreadySeen.put(superConstructorInvocation, member);
		return member;
	}

	private FlowNode handle(ReturnStatement returnStatement, FlowNode member) {
		if (returnStatement == null) {
			return member; // assume nothing to do is success
		}
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		Expression expression = returnStatement.getExpression();
		expressionHandler.handle(expression, new FlowNode(expression));
		alreadySeen.put(returnStatement, member);
		return member;
	}

	private FlowNode handle(LabeledStatement labeledStatement, FlowNode member) {
		if (labeledStatement == null) {
			return member; // assume nothing to do is success
		}
		return handle(labeledStatement.getBody(), member);
	}

	private FlowNode handle(IfStatement ifStatement, FlowNode member) {
		if (ifStatement == null) {
			return member; // assume nothing to do is success
		}
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		Statement elseStatement = ifStatement.getElseStatement();
		handle(elseStatement, new FlowNode(elseStatement));
		Statement thenStatement = ifStatement.getThenStatement();
		handle(thenStatement, new FlowNode(thenStatement));
		Expression expression = ifStatement.getExpression();
		expressionHandler.handle(expression, new FlowNode(expression));
		alreadySeen.put(ifStatement, member);
		return member;
	}

	private FlowNode handle(ForStatement forStatement, FlowNode member) {
		if (forStatement == null) {
			return member; // assume nothing to do is success
		}
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		Statement body = forStatement.getBody();
		handle(body, new FlowNode(body));
		Expression expression = forStatement.getExpression();
		expressionHandler.handle(expression, new FlowNode(expression));
		for (Expression initializer : forStatement.getInitializers()) {
			expressionHandler.handle(initializer, new FlowNode(initializer));
		}
		for (Expression updater : forStatement.getUpdaters()) {
			expressionHandler.handle(updater, new FlowNode(updater));
		}
		alreadySeen.put(forStatement, member);
		return member;
	}

	private FlowNode handle(ExpressionStatement expressionStatement, FlowNode member) {
		if (expressionStatement == null) {
			return member; // assume nothing to do is success
		}
		return expressionHandler.handle(expressionStatement.getExpression(), member);
	}

	private FlowNode handle(EnhancedForStatement enhancedForStatement, FlowNode member) {
		if (enhancedForStatement == null) {
			return member; // assume nothing to do is success
		}
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		Statement body = enhancedForStatement.getBody();
		handle(body, new FlowNode(body));
		Expression expression = enhancedForStatement.getExpression();
		expressionHandler.handle(expression, new FlowNode(expression));
		alreadySeen.put(enhancedForStatement, member);
		return member;
	}

	private FlowNode handle(EmptyStatement emptyStatement, FlowNode member) {
		return member;
	}

	private FlowNode handle(DoStatement doStatement, FlowNode member) {
		if (doStatement == null) {
			return member; // assume nothing to do is success
		}
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		Statement body = doStatement.getBody();
		handle(body, new FlowNode(body));
		Expression expression = doStatement.getExpression();
		expressionHandler.handle(expression, new FlowNode(expression));
		alreadySeen.put(doStatement, member);
		return member;
	}

	private FlowNode handle(ContinueStatement continueStatement, FlowNode member) {
		if (continueStatement == null) {
			return member; // assume nothing to do is success
		}
		return handle(continueStatement.getLabel(), member);
	}

	private FlowNode handle(ConstructorInvocation constructorInvocation, FlowNode member) {
		if (constructorInvocation == null) {
			return member; // assume nothing to do is success
		}
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		EList<Expression> arguments = constructorInvocation.getArguments();
		if (!arguments.isEmpty()) {
			for (Expression argument : arguments) {
				expressionHandler.handle(argument, new FlowNode(argument));
			}
			memberOut.add(member);
		}
		memberIn.add(member);
		alreadySeen.put(constructorInvocation, member);
		/*
		if(member.getAbstractMethodInvocations().contains(constructorInvocation)){
			return true;
		}
		if (!member.getAbstractMethodInvocations().add(constructorInvocation)) {
			return false;
		}
		*/
		return member;
	}

	private FlowNode handle(BreakStatement breakStatement, FlowNode member) {
		if (breakStatement == null) {
			return member; // assume nothing to do is success
		}
		return handle(breakStatement.getLabel(), member);
	}

	private FlowNode handle(CatchClause catchClause, FlowNode member) {
		if (catchClause == null) {
			return member; // assume nothing to do is success
		}
		handle(catchClause.getBody(), member);
		miscHandler.handle(catchClause.getException(), member);
		return member;
	}
	
	private FlowNode handle(AssertStatement assertStatement, FlowNode member) {
		if (assertStatement == null) {
			return member; // assume nothing to do is success
		}
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		Expression expression = assertStatement.getExpression();
		Expression message = assertStatement.getMessage();
		expressionHandler.handle(expression, new FlowNode(expression));
		expressionHandler.handle(message, new FlowNode(message));
		alreadySeen.put(assertStatement, member);
		return member;
	}

	private FlowNode handle(Block block, FlowNode member) {
		if (block == null) {
			return member; // assume nothing to do is success
		}
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		for (Statement statement : block.getStatements()) {
			handle(statement, new FlowNode(statement));
		}
		alreadySeen.put(block, member);
		return member;
	}

	public List<FlowNode> getMemberIn() {
		return memberIn;
	}

	public List<FlowNode> getMemberOut() {
		return memberOut;
	}
	
	public HashMap<Object, FlowNode> getAlreadySeen() {
		return alreadySeen;
	}
	
	public MDefinition getMemberDef() {
		return memberDef;
	}

	public ExpressionHandlerDataFlow getExpressionHandler() {
		return expressionHandler;
	}

	public MiscHandlerDataFlow getMiscHandler() {
		return miscHandler;
	}

}
