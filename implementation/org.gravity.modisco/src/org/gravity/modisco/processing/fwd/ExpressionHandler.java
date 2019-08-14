package org.gravity.modisco.processing.fwd;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.ArrayAccess;
import org.eclipse.gmt.modisco.java.ArrayCreation;
import org.eclipse.gmt.modisco.java.ArrayInitializer;
import org.eclipse.gmt.modisco.java.ArrayLengthAccess;
import org.eclipse.gmt.modisco.java.Assignment;
import org.eclipse.gmt.modisco.java.BooleanLiteral;
import org.eclipse.gmt.modisco.java.CastExpression;
import org.eclipse.gmt.modisco.java.CharacterLiteral;
import org.eclipse.gmt.modisco.java.ClassInstanceCreation;
import org.eclipse.gmt.modisco.java.ConditionalExpression;
import org.eclipse.gmt.modisco.java.ConstructorInvocation;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.FieldAccess;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.InfixExpression;
import org.eclipse.gmt.modisco.java.InstanceofExpression;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.NullLiteral;
import org.eclipse.gmt.modisco.java.NumberLiteral;
import org.eclipse.gmt.modisco.java.ParenthesizedExpression;
import org.eclipse.gmt.modisco.java.PostfixExpression;
import org.eclipse.gmt.modisco.java.PrefixExpression;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.StringLiteral;
import org.eclipse.gmt.modisco.java.SuperFieldAccess;
import org.eclipse.gmt.modisco.java.SuperMethodInvocation;
import org.eclipse.gmt.modisco.java.ThisExpression;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.TypeLiteral;
import org.eclipse.gmt.modisco.java.UnresolvedItemAccess;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationExpression;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MSingleVariableAccess;

public class ExpressionHandler {

	private static final Logger LOGGER = Logger.getLogger(ExpressionHandler.class.getName());
	
	public static boolean handle(Expression expression, MDefinition member) {
		if (expression == null) {
			return true; // assume nothing to do is success
		}
		if (expression instanceof ArrayLengthAccess) {
			ArrayLengthAccess arrayLengthAccess = (ArrayLengthAccess) expression;
			if (!handle(arrayLengthAccess.getArray(), member)) {
				return false;
			}
			return true;
		} else if (expression instanceof FieldAccess) {
			FieldAccess fieldAccess = (FieldAccess) expression;
			return handle(fieldAccess, member);
		} else if (expression instanceof MethodInvocation) {
			MethodInvocation methodInvocation = (MethodInvocation) expression;
			return handle(methodInvocation, member);

		} else if (expression instanceof ConstructorInvocation) {
			ConstructorInvocation constructorInvocation = (ConstructorInvocation) expression;
			return StatementHandler.handle(constructorInvocation, member);

		} else if (expression instanceof StringLiteral) {
			StringLiteral stringLiteral = (StringLiteral) expression;
			return true;

		} else if (expression instanceof NullLiteral) {
			NullLiteral nullLiteral = (NullLiteral) expression;
			return true;

		} else if (expression instanceof ArrayCreation) {
			ArrayCreation arrayCreation = (ArrayCreation) expression;
			return handle(arrayCreation, member);

		} else if (expression instanceof ArrayInitializer) {
			ArrayInitializer arrayInitializer = (ArrayInitializer) expression;
			return handle(arrayInitializer, member);
		} else if (expression instanceof NumberLiteral) {
			NumberLiteral numberLiteral = (NumberLiteral) expression;
			return true;

		} else if (expression instanceof SingleVariableAccess) {
			SingleVariableAccess singleVariableAccess = (SingleVariableAccess) expression;
			return handle(singleVariableAccess, member);

		} else if (expression instanceof TypeAccess) {
			TypeAccess typAccess = (TypeAccess) expression;
			return true;

		} else if (expression instanceof InfixExpression) {
			InfixExpression infixExpression = (InfixExpression) expression;
			return handle(infixExpression, member);
		} else if (expression instanceof ClassInstanceCreation) {
			ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) expression;
			return handle(classInstanceCreation, member);
		} else if (expression instanceof InstanceofExpression) {
			InstanceofExpression instanceofExpression = (InstanceofExpression) expression;
			return handle(instanceofExpression, member);
		} else if (expression instanceof Assignment) {
			Assignment assignment = (Assignment) expression;
			return handle(assignment, member);
		} else if (expression instanceof PrefixExpression) {
			PrefixExpression prefixExpression = (PrefixExpression) expression;
			return handle(prefixExpression, member);
		} else if (expression instanceof SuperMethodInvocation) {
			SuperMethodInvocation superMethodInvocation = (SuperMethodInvocation) expression;
			return handle(superMethodInvocation, member);
		} else if (expression instanceof ThisExpression) {
			ThisExpression thisExpression = (ThisExpression) expression;
			return true;

		} else if (expression instanceof CastExpression) {
			CastExpression castExpression = (CastExpression) expression;
			return handle(castExpression, member);
		} else if (expression instanceof ParenthesizedExpression) {
			ParenthesizedExpression parenthesizedExpression = (ParenthesizedExpression) expression;
			return handle(parenthesizedExpression, member);
		} else if (expression instanceof BooleanLiteral) {
			BooleanLiteral booleanLiteral = (BooleanLiteral) expression;
			return true;
		} else if (expression instanceof CharacterLiteral) {
			CharacterLiteral characterLiteral = (CharacterLiteral) expression;
			return true;
		} else if (expression instanceof ConditionalExpression) {
			ConditionalExpression conditionalExpression = (ConditionalExpression) expression;
			return handle(conditionalExpression, member);
		} else if (expression instanceof ArrayAccess) {
			ArrayAccess arrayAccess = (ArrayAccess) expression;
			return handle(arrayAccess, member);
		} else if (expression instanceof TypeLiteral) {
			TypeLiteral typeLiteral = (TypeLiteral) expression;
			return true;
		} else if (expression instanceof VariableDeclarationExpression) {
			VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression) expression;
			return handle(variableDeclarationExpression, member);
		} else if (expression instanceof PostfixExpression) {
			PostfixExpression postfixExpression = (PostfixExpression) expression;
			return handle(postfixExpression, member);

		} else if (expression instanceof SuperFieldAccess) {
			SuperFieldAccess superFieldAccess = (SuperFieldAccess) expression;
			return handle(superFieldAccess, member);
		} else if (expression instanceof UnresolvedItemAccess) {
			UnresolvedItemAccess itemAccess = (UnresolvedItemAccess) expression;
			return true;

		}
		LOGGER.log( Level.INFO, "ERROR: Unknown Expression: " + expression);
		return false;
	}

	private static boolean handle(SuperFieldAccess superFieldAccess, MDefinition member) {
		if (!handle(superFieldAccess.getField(), member)) {
			return false;
		}
		return true;
	}

	private static boolean handle(PostfixExpression postfixExpression, MDefinition member) {
		if (!handle(postfixExpression.getOperand(), member)) {
			return false;
		}
		return true;
	}

	private static boolean handle(VariableDeclarationExpression variableDeclarationExpression, MDefinition member) {
		if (variableDeclarationExpression == null) {
			return true; // assume nothing to do is success
		}
		for (VariableDeclarationFragment fragment : variableDeclarationExpression.getFragments()) {
			if (!MiscHandler.handle(fragment, member)) {
				return false;
			}
		}
		return true;
	}

	private static boolean handle(ArrayCreation arrayCreation, MDefinition member) {
		if (!handle(arrayCreation.getInitializer(), member)) {
			return false;
		}
		for (Expression dimension : arrayCreation.getDimensions()) {
			if (!handle(dimension, member)) {
				return false;
			}
		}
		return true;
	}

	private static boolean handle(ArrayInitializer arrayInitializer, MDefinition member) {
		if (arrayInitializer == null) {
			return true; // assume nothing to to is success
		}
		for (Expression initializerExpression : arrayInitializer.getExpressions()) {
			if (!handle(initializerExpression, member)) {
				return false;
			}
		}
		return true;
	}

	private static boolean handle(SingleVariableAccess singleVariableAccess, MDefinition member) {
		if (!handle(singleVariableAccess.getQualifier(), member)) {
			return false;
		}
		VariableDeclaration variable = singleVariableAccess.getVariable();
		if (variable instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment variableDeclarationFragment = (VariableDeclarationFragment) variable;
			AbstractVariablesContainer variablesContainer = variableDeclarationFragment.getVariablesContainer();
			if (variablesContainer instanceof FieldDeclaration) {
				// TODO: Check type of access here
				if(member.getMAbstractFieldAccess().contains(singleVariableAccess)){
					return true;
				}
				if (!member.getMAbstractFieldAccess().add((MSingleVariableAccess) singleVariableAccess)) {
					return false;
				}
			}
		}
		else if(variable instanceof SingleVariableDeclaration){
			SingleVariableDeclaration singleVariableDeclaration = (SingleVariableDeclaration) variable;
			
		}
		return true;
	}

	private static boolean handle(InfixExpression infixExpression, MDefinition member) {
		if (!handle(infixExpression.getLeftOperand(), member)) {
			return true;
		}
		if (!handle(infixExpression.getRightOperand(), member)) {
			return true;
		}
		for (Expression extendedOperand : infixExpression.getExtendedOperands()) {
			if (!handle(extendedOperand, member)) {
				return false;
			}
		}
		return true;
	}

	private static boolean handle(ClassInstanceCreation classInstanceCreation, MDefinition member) {
		if (!handle(classInstanceCreation.getExpression(), member)) {
			return false;
		}
		for (Expression argument : classInstanceCreation.getArguments()) {
			if (!handle(argument, member)) {
				return false;
			}
		}
		if (member.getMMethodInvocations().contains(classInstanceCreation)) {
			return true;
		}
		if (!member.getMMethodInvocations().add(classInstanceCreation)) {
			return false;
		}
		return true;
	}

	private static boolean handle(InstanceofExpression instanceofExpression, MDefinition member) {
		if (!handle(instanceofExpression.getLeftOperand(), member)) {
			return false;
		}
		return true;
	}

	private static boolean handle(Assignment assignment, MDefinition member) {
		if (!handle(assignment.getLeftHandSide(), member)) {
			return false;
		}
		if (!handle(assignment.getRightHandSide(), member)) {
			return false;
		}
		return true;
	}

	private static boolean handle(PrefixExpression prefixExpression, MDefinition member) {
		if (!handle(prefixExpression.getOperand(), member)) {
			return false;
		}
		return true;
	}

	private static boolean handle(SuperMethodInvocation superMethodInvocation, MDefinition member) {
		for (Expression argument : superMethodInvocation.getArguments()) {
			if (!ExpressionHandler.handle(argument, member)) {
				return false;
			}
		}
		if(member.getMMethodInvocations().contains(superMethodInvocation)){
			return true;
		}
		if (!member.getMMethodInvocations().add(superMethodInvocation)) {
			return false;
		}
		return true;
	}

	private static boolean handle(CastExpression castExpression, MDefinition member) {
		if (!handle(castExpression.getExpression(), member)) {
			return false;
		}
		return true;
	}

	private static boolean handle(ParenthesizedExpression parenthesizedExpression, MDefinition member) {
		if (!handle(parenthesizedExpression.getExpression(), member)) {
			return false;
		}
		return true;
	}

	private static boolean handle(ConditionalExpression conditionalExpression, MDefinition member) {
		if (conditionalExpression == null) {
			return true; // assume nothing to do is success
		}
		if (!handle(conditionalExpression.getExpression(), member)) {
			return false;
		}
		if (!handle(conditionalExpression.getThenExpression(), member)) {
			return false;
		}
		if (!handle(conditionalExpression.getElseExpression(), member)) {
			return false;
		}
		return true;
	}

	private static boolean handle(ArrayAccess arrayAccess, MDefinition member) {
		if (arrayAccess == null) {
			return true; // assume nothing to do is success;
		}
		if (!handle(arrayAccess.getArray(), member)) {
			return false;
		}
		if (!handle(arrayAccess.getIndex(), member)) {
			return false;
		}
		return true;
	}

	private static boolean handle(FieldAccess fieldAccess, MDefinition member) {
		if (fieldAccess == null) {
			return true; // assume nothing to do is success
		}
		if (!handle(fieldAccess.getExpression(), member)) {
			return false;
		}
		if (!handle(fieldAccess.getField(), member)) {
			return false;
		}
		return true;
	}

	private static boolean handle(MethodInvocation methodInvocation, MDefinition member) {
		if (!handle(methodInvocation.getExpression(), member)) {
			return false;
		}
		for (Expression argument : methodInvocation.getArguments()) {
			if (!ExpressionHandler.handle(argument, member)) {
				return false;
			}
		}
		if(member.getMMethodInvocations().contains(methodInvocation)){
			return true;
		}
		if (!member.getMMethodInvocations().add(methodInvocation)) {
			return false;
		}
		return true;
	}

}
