package org.gravity.modisco.dataflow;

import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
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
	
	public FlowNode handle(VariableDeclarationFragment fragment) {
		FlowNode member = statementHandler.getFlowNodeForElement(fragment);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		statementHandler.propagateBack(expressionHandler.handle(fragment.getInitializer()), member);
		return member;
	}

	public FlowNode handle(AbstractTypeDeclaration declaration) {
		FlowNode member = statementHandler.getFlowNodeForElement(declaration);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (BodyDeclaration body : declaration.getBodyDeclarations()) {
			statementHandler.propagateBack(handle(body), member);
		}
		return member;
	}

	private FlowNode handle(BodyDeclaration body) {
		FlowNode member = statementHandler.getFlowNodeForElement(body);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		return member;
	}

	public FlowNode handle(SingleVariableDeclaration singleVariableDeclaration) {
		FlowNode member = statementHandler.getFlowNodeForElement(singleVariableDeclaration);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		statementHandler.propagateBack(expressionHandler.handle(singleVariableDeclaration.getInitializer()), member);
		return member;
	}

	public StatementHandlerDataFlow getStatementHandler() {
		return statementHandler;
	}
	
	public ExpressionHandlerDataFlow getExpressionHandler() {
		return expressionHandler;
	}
}
