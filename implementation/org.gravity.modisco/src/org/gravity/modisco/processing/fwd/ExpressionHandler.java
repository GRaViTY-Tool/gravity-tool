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
			return handle(((ArrayLengthAccess) expression).getArray(), member);
		} else if (expression instanceof FieldAccess) {
			FieldAccess fieldAccess = (FieldAccess) expression;
			return handle(fieldAccess, member);
		} else if (expression instanceof MethodInvocation) {
			MethodInvocation methodInvocation = (MethodInvocation) expression;
			return handle(methodInvocation, member);
		} else if (expression instanceof ConstructorInvocation) {
			return StatementHandler.handle((ConstructorInvocation) expression, member);
		} else if (expression instanceof StringLiteral) {
			return true;
		} else if (expression instanceof NullLiteral) {
			return true;
		} else if (expression instanceof ArrayCreation) {
			return handle((ArrayCreation) expression, member);
		} else if (expression instanceof ArrayInitializer) {
			return handle((ArrayInitializer) expression, member);
		} else if (expression instanceof NumberLiteral) {
			return true;
		} else if (expression instanceof SingleVariableAccess) {
			return handle((SingleVariableAccess) expression, member);
		} else if (expression instanceof TypeAccess) {
			return true;
		} else if (expression instanceof InfixExpression) {
			return handle((InfixExpression) expression, member);
		} else if (expression instanceof ClassInstanceCreation) {
			return handle((ClassInstanceCreation) expression, member);
		} else if (expression instanceof InstanceofExpression) {
			return handle(((InstanceofExpression) expression).getLeftOperand(), member);
		} else if (expression instanceof Assignment) {
			return handle((Assignment) expression, member);
		} else if (expression instanceof PrefixExpression) {
			return handle(((PrefixExpression) expression).getOperand(), member);
		} else if (expression instanceof SuperMethodInvocation) {
			return handle((SuperMethodInvocation) expression, member);
		} else if (expression instanceof ThisExpression) {
			return true;
		} else if (expression instanceof CastExpression) {
			return handle(((CastExpression) expression).getExpression(), member);
		} else if (expression instanceof ParenthesizedExpression) {
			return handle(((ParenthesizedExpression) expression).getExpression(), member);
		} else if (expression instanceof BooleanLiteral) {
			return true;
		} else if (expression instanceof CharacterLiteral) {
			return true;
		} else if (expression instanceof ConditionalExpression) {
			return handle((ConditionalExpression) expression, member);
		} else if (expression instanceof ArrayAccess) {
			ArrayAccess arrayAccess = (ArrayAccess) expression;
			return handle(arrayAccess, member);
		} else if (expression instanceof TypeLiteral) {
			return true;
		} else if (expression instanceof VariableDeclarationExpression) {
			return handle((VariableDeclarationExpression) expression, member);
		} else if (expression instanceof PostfixExpression) {
			return handle(((PostfixExpression) expression).getOperand(), member);
		} else if (expression instanceof SuperFieldAccess) {
			return handle(((SuperFieldAccess) expression).getField(), member);
		} else if (expression instanceof UnresolvedItemAccess) {
			return true;
		}
		LOGGER.log( Level.INFO, "ERROR: Unknown Expression: " + expression);
		return false;
	}

	private static boolean handle(VariableDeclarationExpression variableDeclarationExpression, MDefinition member) {
		if (variableDeclarationExpression == null) {
			return true; // assume nothing to do is success
		}
		for (VariableDeclarationFragment fragment : variableDeclarationExpression.getFragments()) {
			if (!ExpressionHandler.handle(fragment.getInitializer(), member)) {
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
			//TODO: Check what is to do here?
		}
		return true;
	}

	private static boolean handle(InfixExpression infixExpression, MDefinition member) {
		if (!handle(infixExpression.getLeftOperand(), member)) {
			return false;
		}
		if (!handle(infixExpression.getRightOperand(), member)) {
			return false;
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

	private static boolean handle(Assignment assignment, MDefinition member) {
		if (!handle(assignment.getLeftHandSide(), member)) {
			return false;
		}
		if (!handle(assignment.getRightHandSide(), member)) {
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
		return member.getMMethodInvocations().add(superMethodInvocation);
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
