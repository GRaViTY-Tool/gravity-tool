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
	
	public FlowNode handle(VariableDeclarationFragment fragment, FlowNode member) {
		statementHandler.getLocals().put(fragment, member);
		return expressionHandler.handle(fragment.getInitializer(), member);
	}

	public FlowNode handle(AbstractTypeDeclaration declaration, FlowNode member) {
		for (BodyDeclaration body : declaration.getBodyDeclarations()) {
			handle(body, member);
		}
		return member;
	}

	private FlowNode handle(BodyDeclaration body, FlowNode member) {
		return member;
	}

	public FlowNode handle(SingleVariableDeclaration singleVariableDeclaration, FlowNode member) {
		return expressionHandler.handle(singleVariableDeclaration.getInitializer(), member);
	}

	public StatementHandlerDataFlow getStatementHandler() {
		return statementHandler;
	}
	
	public ExpressionHandlerDataFlow getExpressionHandler() {
		return expressionHandler;
	}
}
