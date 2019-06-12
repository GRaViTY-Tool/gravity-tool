package org.gravity.modisco.dataflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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
	private final HashMap<EObject, FlowNode> alreadySeen = new HashMap<>();
	
	/**
	 * The member definition corresponding to this handler.
	 */
	private EObject memberDef;
	
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
	
	public StatementHandlerDataFlow(VariableDeclarationFragment correspondingMember) {
		memberDef = correspondingMember;
		expressionHandler = new ExpressionHandlerDataFlow(this);
		miscHandler = new MiscHandlerDataFlow(this);
	}
	
	public FlowNode handle(Statement statement) {
		if (statement == null) {
			return null; // assume nothing to do is success
		}
		if (statement instanceof AssertStatement) {
			AssertStatement assertStatement = (AssertStatement) statement;
			return handle(assertStatement);

		} else if (statement instanceof Block) {
			Block block = (Block) statement;
			return handle(block);

		} else if (statement instanceof BreakStatement) {
			BreakStatement breakStatement = (BreakStatement) statement;
			return handle(breakStatement);

		} else if (statement instanceof CatchClause) {
			CatchClause catchClause = (CatchClause) statement;
			return handle(catchClause);

		} else if (statement instanceof ConstructorInvocation) {
			ConstructorInvocation constructorInvocation = (ConstructorInvocation) statement;
			return handle(constructorInvocation);

		} else if (statement instanceof ContinueStatement) {
			ContinueStatement continueStatement = (ContinueStatement) statement;
			return handle(continueStatement);

		} else if (statement instanceof DoStatement) {
			DoStatement doStatement = (DoStatement) statement;
			return handle(doStatement);

		} else if (statement instanceof EmptyStatement) {
			EmptyStatement emptyStatement = (EmptyStatement) statement;
			return handle(emptyStatement);

		} else if (statement instanceof EnhancedForStatement) {
			EnhancedForStatement enhancedForStetement = (EnhancedForStatement) statement;
			return handle(enhancedForStetement);

		} else if (statement instanceof ExpressionStatement) {
			ExpressionStatement expressionStatement = (ExpressionStatement) statement;
			return handle(expressionStatement);

		} else if (statement instanceof ForStatement) {
			ForStatement forStatement = (ForStatement) statement;
			return handle(forStatement);

		} else if (statement instanceof IfStatement) {
			IfStatement ifStatement = (IfStatement) statement;
			return handle(ifStatement);

		} else if (statement instanceof LabeledStatement) {
			LabeledStatement labeledStatement = (LabeledStatement) statement;
			return handle(labeledStatement);

		} else if (statement instanceof ReturnStatement) {
			ReturnStatement returnStatement = (ReturnStatement) statement;
			return handle(returnStatement);

		} else if (statement instanceof SuperConstructorInvocation) {
			SuperConstructorInvocation superConstructorInvocation = (SuperConstructorInvocation) statement;
			return handle(superConstructorInvocation);

		} else if (statement instanceof SwitchCase) {
			SwitchCase switchCase = (SwitchCase) statement;
			return handle(switchCase);

		} else if (statement instanceof SwitchStatement) {
			SwitchStatement switchStatement = (SwitchStatement) statement;
			return handle(switchStatement);

		} else if (statement instanceof SynchronizedStatement) {
			SynchronizedStatement synchronizedStatement = (SynchronizedStatement) statement;
			return handle(synchronizedStatement);

		} else if (statement instanceof ThrowStatement) {
			ThrowStatement throwStatement = (ThrowStatement) statement;
			return handle(throwStatement);

		} else if (statement instanceof TryStatement) {
			TryStatement tryStatement = (TryStatement) statement;
			return handle(tryStatement);

		} else if (statement instanceof TypeDeclarationStatement) {
			TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) statement;
			return handle(typeDeclarationStatement);

		} else if (statement instanceof UnresolvedLabeledStatement) {
			UnresolvedLabeledStatement unresolvedLabeledStatement = (UnresolvedLabeledStatement) statement;
			return handle(unresolvedLabeledStatement);

		} else if (statement instanceof VariableDeclarationStatement) {
			VariableDeclarationStatement variableDeclarationStatement = (VariableDeclarationStatement) statement;
			return handle(variableDeclarationStatement);

		} else if (statement instanceof WhileStatement) {
			WhileStatement whileStatement = (WhileStatement) statement;
			return handle(whileStatement);

		} else {
			return null;
		}
	}
	
	private FlowNode handle(WhileStatement whileStatement) {
		if (whileStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(whileStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(whileStatement.getBody());
		expressionHandler.handle(whileStatement.getExpression());
		return member;
	}

	private FlowNode handle(VariableDeclarationStatement variableDeclarationStatement) {
		if (variableDeclarationStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(variableDeclarationStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (VariableDeclarationFragment fragment : variableDeclarationStatement.getFragments()) {
			miscHandler.handle(fragment);
		}
		return member;
	}

	private FlowNode handle(TypeDeclarationStatement typeDeclarationStatement) {
		if (typeDeclarationStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(typeDeclarationStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		miscHandler.handle(typeDeclarationStatement.getDeclaration());
		return member;
	}

	private FlowNode handle(TryStatement tryStatement) {
		if (tryStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(tryStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(tryStatement.getBody());
		handle(tryStatement.getFinally());
		for (CatchClause clause : tryStatement.getCatchClauses()) {
			handle(clause);
		}
		return member;
	}

	private FlowNode handle(ThrowStatement throwStatement) {
		if (throwStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(throwStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		expressionHandler.handle(throwStatement.getExpression());
		return member;
	}

	private FlowNode handle(SynchronizedStatement synchronizedStatement) {
		if (synchronizedStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(synchronizedStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(synchronizedStatement.getBody());
		expressionHandler.handle(synchronizedStatement.getExpression());
		return member;
	}

	private FlowNode handle(SwitchStatement switchStatement) {
		if (switchStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(switchStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (Statement statement : switchStatement.getStatements()) {
			handle(statement);
		}
		expressionHandler.handle(switchStatement.getExpression());
		return member;
	}

	private FlowNode handle(SwitchCase switchCase) {
		if (switchCase == null) {
			return null; // assume nothing to do is success
		}
		return expressionHandler.handle(switchCase.getExpression());
	}

	private FlowNode handle(SuperConstructorInvocation superConstructorInvocation) {
		if (superConstructorInvocation == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(superConstructorInvocation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		expressionHandler.handle(superConstructorInvocation.getExpression());
		for (Expression argument : superConstructorInvocation.getArguments()) {
			expressionHandler.handle(argument);
		}
		return member;
	}

	// TODO Safe reference to every created FlowNode in StatementHandler
	private FlowNode handle(ReturnStatement returnStatement) {
		if (returnStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(returnStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		expressionHandler.handle(returnStatement.getExpression());
		return member;
	}

	private FlowNode handle(LabeledStatement labeledStatement) {
		if (labeledStatement == null) {
			return null; // assume nothing to do is success
		}
		return handle(labeledStatement.getBody());
	}

	private FlowNode handle(IfStatement ifStatement) {
		if (ifStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(ifStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(ifStatement.getElseStatement());
		handle(ifStatement.getThenStatement());
		expressionHandler.handle(ifStatement.getExpression());
		return member;
	}

	private FlowNode handle(ForStatement forStatement) {
		if (forStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(forStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(forStatement.getBody());
		expressionHandler.handle(forStatement.getExpression());
		for (Expression initializer : forStatement.getInitializers()) {
			expressionHandler.handle(initializer);
		}
		for (Expression updater : forStatement.getUpdaters()) {
			expressionHandler.handle(updater);
		}
		return member;
	}

	private FlowNode handle(ExpressionStatement expressionStatement) {
		if (expressionStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(expressionStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		expressionHandler.handle(expressionStatement.getExpression());
		return member;
	}

	private FlowNode handle(EnhancedForStatement enhancedForStatement) {
		if (enhancedForStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(enhancedForStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(enhancedForStatement.getBody());
		expressionHandler.handle(enhancedForStatement.getExpression());
		return member;
	}

	private FlowNode handle(EmptyStatement emptyStatement) {
		return null;
	}

	private FlowNode handle(DoStatement doStatement) {
		if (doStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(doStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(doStatement.getBody());
		expressionHandler.handle(doStatement.getExpression());
		return member;
	}

	private FlowNode handle(ContinueStatement continueStatement) {
		if (continueStatement == null) {
			return null; // assume nothing to do is success
		}
		return handle(continueStatement.getLabel());
	}

	private FlowNode handle(ConstructorInvocation constructorInvocation) {
		if (constructorInvocation == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(constructorInvocation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		EList<Expression> arguments = constructorInvocation.getArguments();
		if (!arguments.isEmpty()) {
			for (Expression argument : arguments) {
				expressionHandler.handle(argument);
			}
			memberOut.add(member);
		}
		memberIn.add(member);
		return member;
	}

	private FlowNode handle(BreakStatement breakStatement) {
		if (breakStatement == null) {
			return null; // assume nothing to do is success
		}
		return handle(breakStatement.getLabel());
	}

	private FlowNode handle(CatchClause catchClause) {
		if (catchClause == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(catchClause);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(catchClause.getBody());
		miscHandler.handle(catchClause.getException());
		return member;
	}
	
	private FlowNode handle(AssertStatement assertStatement) {
		if (assertStatement == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(assertStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		expressionHandler.handle(assertStatement.getExpression());
		expressionHandler.handle(assertStatement.getMessage());
		return member;
	}

	private FlowNode handle(Block block) {
		if (block == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = getFlowNodeForElement(block);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (Statement statement : block.getStatements()) {
			handle(statement);
		}
		return member;
	}

	public List<FlowNode> getMemberIn() {
		return memberIn;
	}

	public List<FlowNode> getMemberOut() {
		return memberOut;
	}
	
	public HashMap<EObject, FlowNode> getAlreadySeen() {
		return alreadySeen;
	}
	
	public EObject getMemberDef() {
		return memberDef;
	}

	public ExpressionHandlerDataFlow getExpressionHandler() {
		return expressionHandler;
	}

	public MiscHandlerDataFlow getMiscHandler() {
		return miscHandler;
	}
	
	/**
	 * Checks, if a (non-null) FlowNode has already been created for the given element and returns it.
	 * Otherwise a new FlowNode is created, inserted into alreadySeen and returned.
	 * 
	 * @param element The element, for which the check is performed.
	 * @return If already present, the FlowNode for the given element. A new FlowNode for the element otherwise.
	 */
	FlowNode getFlowNodeForElement(EObject element) {
		FlowNode seenNode = alreadySeen.get(element);
		if (seenNode != null) { // making sure, that null references lead to creation of new nodes
			seenNode.setFromAlreadySeen();
			return seenNode;
		}
		FlowNode member = new FlowNode(element);
		alreadySeen.put(element, member);
		return member;
	}
}
