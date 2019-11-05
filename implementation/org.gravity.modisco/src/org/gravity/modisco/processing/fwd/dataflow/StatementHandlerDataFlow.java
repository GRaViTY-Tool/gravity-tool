package org.gravity.modisco.processing.fwd.dataflow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
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

	private static final Logger LOGGER = Logger.getLogger(StatementHandlerDataFlow.class);

	/**
	 * The accesses observed in the member corresponding to this handler.
	 */
	private final Set<FlowNode> memberRef = new HashSet<>();

	/**
	 * The statements and expressions, which have already been processed, associated with their FlowNode representations.
	 */
	private final Map<EObject, FlowNode> alreadySeen = new HashMap<>();

	/**
	 * The member definition corresponding to this handler.
	 */
	private final EObject memberDef;

	/**
	 * The expression handler associated with this statement handler.
	 */
	private final ExpressionHandlerDataFlow expressionHandler;

	/**
	 * The misc handler associated with this statement handler.
	 */
	private final MiscHandlerDataFlow miscHandler;

	public StatementHandlerDataFlow(MDefinition correspondingMember) {
		this.memberDef = correspondingMember;
		this.expressionHandler = new ExpressionHandlerDataFlow(this);
		this.miscHandler = new MiscHandlerDataFlow(this);
	}

	public StatementHandlerDataFlow(VariableDeclarationFragment correspondingMember) {
		this.memberDef = correspondingMember;
		this.expressionHandler = new ExpressionHandlerDataFlow(this);
		this.miscHandler = new MiscHandlerDataFlow(this);
	}

	public FlowNode handle(Statement statement) {
		if (statement instanceof AssertStatement) {
			final AssertStatement assertStatement = (AssertStatement) statement;
			return handle(assertStatement);

		} else if (statement instanceof Block) {
			final Block block = (Block) statement;
			return handle(block);

		} else if (statement instanceof BreakStatement) {
			final BreakStatement breakStatement = (BreakStatement) statement;
			return handle(breakStatement);

		} else if (statement instanceof CatchClause) {
			final CatchClause catchClause = (CatchClause) statement;
			return handle(catchClause);

		} else if (statement instanceof ConstructorInvocation) {
			final ConstructorInvocation constructorInvocation = (ConstructorInvocation) statement;
			return handle(constructorInvocation);

		} else if (statement instanceof ContinueStatement) {
			final ContinueStatement continueStatement = (ContinueStatement) statement;
			return handle(continueStatement);

		} else if (statement instanceof DoStatement) {
			final DoStatement doStatement = (DoStatement) statement;
			return handle(doStatement);

		} else if (statement instanceof EmptyStatement) {
			return null;
		} else if (statement instanceof EnhancedForStatement) {
			final EnhancedForStatement enhancedForStetement = (EnhancedForStatement) statement;
			return handle(enhancedForStetement);

		} else if (statement instanceof ExpressionStatement) {
			final ExpressionStatement expressionStatement = (ExpressionStatement) statement;
			return handle(expressionStatement);

		} else if (statement instanceof ForStatement) {
			final ForStatement forStatement = (ForStatement) statement;
			return handle(forStatement);

		} else if (statement instanceof IfStatement) {
			final IfStatement ifStatement = (IfStatement) statement;
			return handle(ifStatement);

		} else if (statement instanceof LabeledStatement) {
			final LabeledStatement labeledStatement = (LabeledStatement) statement;
			return handle(labeledStatement);

		} else if (statement instanceof ReturnStatement) {
			final ReturnStatement returnStatement = (ReturnStatement) statement;
			return handle(returnStatement);

		} else if (statement instanceof SuperConstructorInvocation) {
			final SuperConstructorInvocation superConstructorInvocation = (SuperConstructorInvocation) statement;
			return handle(superConstructorInvocation);

		} else if (statement instanceof SwitchCase) {
			final SwitchCase switchCase = (SwitchCase) statement;
			return handle(switchCase);

		} else if (statement instanceof SwitchStatement) {
			final SwitchStatement switchStatement = (SwitchStatement) statement;
			return handle(switchStatement);

		} else if (statement instanceof SynchronizedStatement) {
			final SynchronizedStatement synchronizedStatement = (SynchronizedStatement) statement;
			return handle(synchronizedStatement);

		} else if (statement instanceof ThrowStatement) {
			final ThrowStatement throwStatement = (ThrowStatement) statement;
			return handle(throwStatement);

		} else if (statement instanceof TryStatement) {
			final TryStatement tryStatement = (TryStatement) statement;
			return handle(tryStatement);

		} else if (statement instanceof TypeDeclarationStatement) {
			final TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) statement;
			return handle(typeDeclarationStatement);

		} else if (statement instanceof UnresolvedLabeledStatement) {
			final UnresolvedLabeledStatement unresolvedLabeledStatement = (UnresolvedLabeledStatement) statement;
			return handle(unresolvedLabeledStatement);

		} else if (statement instanceof VariableDeclarationStatement) {
			final VariableDeclarationStatement variableDeclarationStatement = (VariableDeclarationStatement) statement;
			return handle(variableDeclarationStatement);

		} else if (statement instanceof WhileStatement) {
			final WhileStatement whileStatement = (WhileStatement) statement;
			return handle(whileStatement);

		} else {
			return null;
		}
	}

	private FlowNode handle(WhileStatement whileStatement) {
		final FlowNode member = getFlowNodeForElement(whileStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(whileStatement.getBody());
		member.addInRef(this.expressionHandler.handle(whileStatement.getExpression()));
		return member;
	}

	private FlowNode handle(VariableDeclarationStatement variableDeclarationStatement) {
		final FlowNode member = getFlowNodeForElement(variableDeclarationStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (final VariableDeclarationFragment fragment : variableDeclarationStatement.getFragments()) {
			this.miscHandler.handle(fragment);
		}
		return member;
	}

	private FlowNode handle(TypeDeclarationStatement typeDeclarationStatement) {
		final FlowNode member = getFlowNodeForElement(typeDeclarationStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		this.miscHandler.handle(typeDeclarationStatement.getDeclaration());
		return member;
	}

	private FlowNode handle(TryStatement tryStatement) {
		final FlowNode member = getFlowNodeForElement(tryStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(tryStatement.getBody());
		final Block finallyBlock = tryStatement.getFinally();
		if (finallyBlock != null) {
			handle(finallyBlock);
		}
		for (final CatchClause clause : tryStatement.getCatchClauses()) {
			handle(clause);
		}
		return member;
	}

	private FlowNode handle(ThrowStatement throwStatement) {
		final FlowNode member = getFlowNodeForElement(throwStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		this.expressionHandler.handle(throwStatement.getExpression());
		return member;
	}

	private FlowNode handle(SynchronizedStatement synchronizedStatement) {
		final FlowNode member = getFlowNodeForElement(synchronizedStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(synchronizedStatement.getBody());
		this.expressionHandler.handle(synchronizedStatement.getExpression());
		return member;
	}

	private FlowNode handle(SwitchStatement switchStatement) {
		final FlowNode member = getFlowNodeForElement(switchStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (final Statement statement : switchStatement.getStatements()) {
			handle(statement);
		}
		member.addInRef(this.expressionHandler.handle(switchStatement.getExpression()));
		return member;
	}

	private FlowNode handle(SwitchCase switchCase) {
		final FlowNode member = getFlowNodeForElement(switchCase);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		member.addInRef(this.expressionHandler.handle(switchCase.getExpression()));
		return member;
	}

	private FlowNode handle(SuperConstructorInvocation superConstructorInvocation) {
		final FlowNode member = getFlowNodeForElement(superConstructorInvocation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		this.expressionHandler.handle(superConstructorInvocation.getExpression());
		for (final Expression argument : superConstructorInvocation.getArguments()) {
			this.expressionHandler.handle(argument);
		}
		return member;
	}

	private FlowNode handle(ReturnStatement returnStatement) {
		final FlowNode member = getFlowNodeForElement(returnStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		this.expressionHandler.handle(returnStatement.getExpression());
		return member;
	}

	private FlowNode handle(LabeledStatement labeledStatement) {
		final FlowNode member = getFlowNodeForElement(labeledStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		if (labeledStatement != null) {
			handle(labeledStatement.getBody());
		}
		return member;
	}

	private FlowNode handle(IfStatement ifStatement) {
		final FlowNode member = getFlowNodeForElement(ifStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(ifStatement.getElseStatement());
		handle(ifStatement.getThenStatement());
		member.addInRef(this.expressionHandler.handle(ifStatement.getExpression()));
		return member;
	}

	private FlowNode handle(ForStatement forStatement) {
		final FlowNode member = getFlowNodeForElement(forStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(forStatement.getBody());
		member.addInRef(this.expressionHandler.handle(forStatement.getExpression()));
		for (final Expression initializer : forStatement.getInitializers()) {
			this.expressionHandler.handle(initializer);
		}
		for (final Expression updater : forStatement.getUpdaters()) {
			this.expressionHandler.handle(updater);
		}
		return member;
	}

	private FlowNode handle(ExpressionStatement expressionStatement) {
		final FlowNode member = getFlowNodeForElement(expressionStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		this.expressionHandler.handle(expressionStatement.getExpression());
		return member;
	}

	private FlowNode handle(EnhancedForStatement enhancedForStatement) {
		final FlowNode member = getFlowNodeForElement(enhancedForStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(enhancedForStatement.getBody());
		member.addInRef(this.expressionHandler.handle(enhancedForStatement.getExpression()));
		return member;
	}

	private FlowNode handle(DoStatement doStatement) {
		final FlowNode member = getFlowNodeForElement(doStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(doStatement.getBody());
		member.addInRef(this.expressionHandler.handle(doStatement.getExpression()));
		return member;
	}

	private FlowNode handle(ContinueStatement continueStatement) {
		return handle(continueStatement.getLabel());
	}

	private FlowNode handle(ConstructorInvocation constructorInvocation) {
		final FlowNode member = getFlowNodeForElement(constructorInvocation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		final AbstractMethodDeclaration calledMethod = constructorInvocation.getMethod();
		getFlowNodeForElement(calledMethod); // Creating just a FlowNode for the called method; no handling needed
		final EList<Expression> arguments = constructorInvocation.getArguments();
		if (!arguments.isEmpty()) {
			for (final Expression argument : arguments) {
				final FlowNode argumentNode = this.expressionHandler.handle(argument);
				final FlowNode paramNode = this.miscHandler.handle(calledMethod.getParameters().get(arguments.indexOf(argument)));
				argumentNode.addOutRef(paramNode);
			}
			getMemberRef().add(member);
		}
		getMemberRef().add(member);
		final EObject container = constructorInvocation.eContainer();
		if (container instanceof Expression) {
			this.expressionHandler.handle((Expression) container).addInRef(member);
		} else if (container instanceof Statement) {
			handle((Statement) container).addInRef(member);
		} else {
			LOGGER.log(Level.INFO, "ERROR: Unknown element type " + container.getClass().getName() + " found in ConstructorInvocation handling.");
		}
		return member;
	}

	private FlowNode handle(BreakStatement breakStatement) {
		return handle(breakStatement.getLabel());
	}

	private FlowNode handle(CatchClause catchClause) {
		final FlowNode member = getFlowNodeForElement(catchClause);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(catchClause.getBody());
		this.miscHandler.handle(catchClause.getException());
		return member;
	}

	private FlowNode handle(AssertStatement assertStatement) {
		final FlowNode member = getFlowNodeForElement(assertStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		member.addInRef(this.expressionHandler.handle(assertStatement.getExpression()));
		this.expressionHandler.handle(assertStatement.getMessage());
		return member;
	}

	private FlowNode handle(Block block) {
		final FlowNode member = getFlowNodeForElement(block);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (final Statement statement : block.getStatements()) {
			handle(statement);
		}
		return member;
	}

	public Set<FlowNode> getMemberRef() {
		return this.memberRef;
	}

	public Map<EObject, FlowNode> getAlreadySeen() {
		return this.alreadySeen;
	}

	public EObject getMemberDef() {
		return this.memberDef;
	}

	public ExpressionHandlerDataFlow getExpressionHandler() {
		return this.expressionHandler;
	}

	public MiscHandlerDataFlow getMiscHandler() {
		return this.miscHandler;
	}

	/**
	 * Checks, if a (non-null) FlowNode has already been created for the given element and returns it.
	 * Otherwise a new FlowNode is created, inserted into alreadySeen and returned.
	 *
	 * @param element The element, for which the check is performed.
	 * @return If already present, the FlowNode for the given element. A new FlowNode for the element otherwise.
	 */
	FlowNode getFlowNodeForElement(EObject element) {
		final FlowNode seenNode = this.alreadySeen.get(element);
		if (seenNode != null) { // making sure, that null references lead to creation of new nodes
			seenNode.setFromAlreadySeen();
			return seenNode;
		}
		final FlowNode member = new FlowNode(element);
		this.alreadySeen.put(element, member);
		return member;
	}
}
