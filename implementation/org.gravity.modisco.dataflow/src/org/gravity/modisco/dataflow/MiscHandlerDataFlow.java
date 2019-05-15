package org.gravity.modisco.dataflow;

import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;

public class MiscHandlerDataFlow {

	public static FlowNode handle(VariableDeclarationFragment fragment, FlowNode member) {
		return ExpressionHandlerDataFlow.handle(fragment.getInitializer(), member);
	}

	public static FlowNode handle(AbstractTypeDeclaration declaration, FlowNode member) {
		for (BodyDeclaration body : declaration.getBodyDeclarations()) {
			handle(body, member);
		}
		return member;
	}

	private static FlowNode handle(BodyDeclaration body, FlowNode member) {
		return member;
	}

	public static FlowNode handle(SingleVariableDeclaration singleVariableDeclaration, FlowNode member) {
		return ExpressionHandlerDataFlow.handle(singleVariableDeclaration.getInitializer(), member);
	}

}
