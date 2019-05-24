package org.gravity.modisco.dataflow;

import java.util.HashMap;

import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;

public class MiscHandlerDataFlow {

	/**
	 * The statement handler associated with this misc handler.
	 */
	private StatementHandlerDataFlow statementHandler;
	
	/**
	 * The expression handler associated with this misc handler.
	 */
	private ExpressionHandlerDataFlow expressionHandler;
	
	public MiscHandlerDataFlow(StatementHandlerDataFlow parentHandler) {
		statementHandler = parentHandler;
		expressionHandler = parentHandler.getExpressionHandler();
	}
	
	public FlowNode handle(VariableDeclarationFragment fragment, FlowNode member) {
		HashMap<Object, FlowNode> alreadySeen = statementHandler.getAlreadySeen();
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		Expression initializer = fragment.getInitializer();
		expressionHandler.handle(initializer, new FlowNode(initializer));
		alreadySeen.put(fragment, member);
		return member;
	}

	public FlowNode handle(AbstractTypeDeclaration declaration, FlowNode member) {
		HashMap<Object, FlowNode> alreadySeen = statementHandler.getAlreadySeen();
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		for (BodyDeclaration body : declaration.getBodyDeclarations()) {
			handle(body, new FlowNode(body));
		}
		alreadySeen.put(declaration, member);
		return member;
	}

	// TODO?
	private FlowNode handle(BodyDeclaration body, FlowNode member) {
		return member;
	}

	public FlowNode handle(SingleVariableDeclaration singleVariableDeclaration, FlowNode member) {
		HashMap<Object, FlowNode> alreadySeen = statementHandler.getAlreadySeen();
		if (alreadySeen.containsValue(member)) {
			return member;
		}
		Expression initializer = singleVariableDeclaration.getInitializer();
		expressionHandler.handle(initializer, new FlowNode(initializer));
		alreadySeen.put(singleVariableDeclaration, member);
		return member;
	}

	public StatementHandlerDataFlow getStatementHandler() {
		return statementHandler;
	}
	
	public ExpressionHandlerDataFlow getExpressionHandler() {
		return expressionHandler;
	}
}
