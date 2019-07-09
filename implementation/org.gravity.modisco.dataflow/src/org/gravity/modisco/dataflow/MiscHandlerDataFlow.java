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
		expressionHandler.setMiscHandler(this);
	}
	
	public FlowNode handle(VariableDeclarationFragment fragment) {
		FlowNode member = statementHandler.getFlowNodeForElement(fragment);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		expressionHandler.handle(fragment.getInitializer());
		return member;
	}

	public FlowNode handle(AbstractTypeDeclaration declaration) {
		FlowNode member = statementHandler.getFlowNodeForElement(declaration);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (BodyDeclaration body : declaration.getBodyDeclarations()) {
			handle(body);
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
		expressionHandler.handle(singleVariableDeclaration.getInitializer());
		return member;
	}

	public StatementHandlerDataFlow getStatementHandler() {
		return statementHandler;
	}
	
	public ExpressionHandlerDataFlow getExpressionHandler() {
		return expressionHandler;
	}
}
