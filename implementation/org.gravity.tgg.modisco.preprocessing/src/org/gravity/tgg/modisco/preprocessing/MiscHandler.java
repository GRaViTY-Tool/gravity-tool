package org.gravity.tgg.modisco.preprocessing;

import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.gravity.modisco.MDefinition;

public class MiscHandler {

	public static boolean handle(VariableDeclarationFragment fragment, MDefinition member) {
		if (!ExpressionHandler.handle(fragment.getInitializer(), member)) {
			return false;
		}
		return true;
	}

	public static boolean handle(AbstractTypeDeclaration declaration, MDefinition member) {
		for (BodyDeclaration body : declaration.getBodyDeclarations()) {
			if (!handle(body, member)) {
				return false;
			}
		}
		return true;
	}

	private static boolean handle(BodyDeclaration body, MDefinition member) {
		// TODO Auto-generated method stub
		return true;
	}

	public static boolean handle(SingleVariableDeclaration singleVariableDeclaration, MDefinition member) {
		if (!ExpressionHandler.handle(singleVariableDeclaration.getInitializer(), member)) {
			return false;
		}
		return true;
	}

}
