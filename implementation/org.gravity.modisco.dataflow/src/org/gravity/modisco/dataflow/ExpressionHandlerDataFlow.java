package org.gravity.modisco.dataflow;

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

public class ExpressionHandlerDataFlow {

	private static final Logger LOGGER = Logger.getLogger(ExpressionHandlerDataFlow.class.getName());
	
	/**
	 * The statement handler associated with this expression handler.
	 */
	private StatementHandlerDataFlow statementHandler;
	
	/**
	 * The misc handler associated with this expression handler.
	 */
	private MiscHandlerDataFlow miscHandler;
	
	public ExpressionHandlerDataFlow(StatementHandlerDataFlow parentHandler) {
		statementHandler = parentHandler;
		miscHandler = parentHandler.getMiscHandler();
	}
	
	public FlowNode handle(Expression expression, FlowNode member) {
		if (expression == null) {
			return member; // assume nothing to do is success
		}
		if (expression instanceof ArrayLengthAccess) {
			ArrayLengthAccess arrayLengthAccess = (ArrayLengthAccess) expression;
			handle(arrayLengthAccess.getArray(), member);
			return member;
		} else if (expression instanceof FieldAccess) {
			FieldAccess fieldAccess = (FieldAccess) expression;
			handle(fieldAccess, member);
		} else if (expression instanceof MethodInvocation) {
			MethodInvocation methodInvocation = (MethodInvocation) expression;
			return handle(methodInvocation, member);

		} else if (expression instanceof ConstructorInvocation) {
			ConstructorInvocation constructorInvocation = (ConstructorInvocation) expression;
			return statementHandler.handle(constructorInvocation, member);

		} else if (expression instanceof StringLiteral) {
			StringLiteral stringLiteral = (StringLiteral) expression;
			return member;

		} else if (expression instanceof NullLiteral) {
			NullLiteral nullLiteral = (NullLiteral) expression;
			return member;

		} else if (expression instanceof ArrayCreation) {
			ArrayCreation arrayCreation = (ArrayCreation) expression;
			return handle(arrayCreation, member);

		} else if (expression instanceof ArrayInitializer) {
			ArrayInitializer arrayInitializer = (ArrayInitializer) expression;
			return handle(arrayInitializer, member);
		} else if (expression instanceof NumberLiteral) {
			NumberLiteral numberLiteral = (NumberLiteral) expression;
			return member;

		} else if (expression instanceof SingleVariableAccess) {
			SingleVariableAccess singleVariableAccess = (SingleVariableAccess) expression;
			return handle(singleVariableAccess, member);

		} else if (expression instanceof TypeAccess) {
			TypeAccess typAccess = (TypeAccess) expression;
			return member;

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
			return member;

		} else if (expression instanceof CastExpression) {
			CastExpression castExpression = (CastExpression) expression;
			return handle(castExpression, member);
		} else if (expression instanceof ParenthesizedExpression) {
			ParenthesizedExpression parenthesizedExpression = (ParenthesizedExpression) expression;
			return handle(parenthesizedExpression, member);
		} else if (expression instanceof BooleanLiteral) {
			BooleanLiteral booleanLiteral = (BooleanLiteral) expression;
			return member;
		} else if (expression instanceof CharacterLiteral) {
			CharacterLiteral characterLiteral = (CharacterLiteral) expression;
			return member;
		} else if (expression instanceof ConditionalExpression) {
			ConditionalExpression conditionalExpression = (ConditionalExpression) expression;
			return handle(conditionalExpression, member);
		} else if (expression instanceof ArrayAccess) {
			ArrayAccess arrayAccess = (ArrayAccess) expression;
			handle(arrayAccess, member);
		} else if (expression instanceof TypeLiteral) {
			TypeLiteral typeLiteral = (TypeLiteral) expression;
			return member;
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
			return member;

		}
		LOGGER.log( Level.INFO, "ERROR: Unknown Expression: " + expression);
		return member;
	}

	private FlowNode handle(SuperFieldAccess superFieldAccess, FlowNode member) {
		return handle(superFieldAccess.getField(), member);
	}

	private FlowNode handle(PostfixExpression postfixExpression, FlowNode member) {
		return handle(postfixExpression.getOperand(), member);
	}

	private FlowNode handle(VariableDeclarationExpression variableDeclarationExpression, FlowNode member) {
		if (variableDeclarationExpression == null) {
			return member; // assume nothing to do is success
		}
		for (VariableDeclarationFragment fragment : variableDeclarationExpression.getFragments()) {
			miscHandler.handle(fragment, member);
		}
		return member;
	}

	private FlowNode handle(ArrayCreation arrayCreation, FlowNode member) {
		handle(arrayCreation.getInitializer(), member);
		for (Expression dimension : arrayCreation.getDimensions()) {
			handle(dimension, member);
		}
		return member;
	}

	private FlowNode handle(ArrayInitializer arrayInitializer, FlowNode member) {
		if (arrayInitializer == null) {
			return member; // assume nothing to to is success
		}
		for (Expression initializerExpression : arrayInitializer.getExpressions()) {
			handle(initializerExpression, member);
		}
		return member;
	}

	// TODO
	private FlowNode handle(SingleVariableAccess singleVariableAccess, FlowNode member) {
		handle(singleVariableAccess.getQualifier(), member);
		VariableDeclaration variable = singleVariableAccess.getVariable();
		// TODO: Check if accessed var is a parameter
		if (statementHandler.getLocals().containsKey(variable)) {
			member.getInRef().add(statementHandler.getLocals().get(variable));
		}
		if (variable instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment variableDeclarationFragment = (VariableDeclarationFragment) variable;
			AbstractVariablesContainer variablesContainer = variableDeclarationFragment.getVariablesContainer();
			if (variablesContainer instanceof FieldDeclaration) {
				// TODO: Check type of access here
				/*
				if(member.getMAbstractFieldAccess().contains(singleVariableAccess)){
					return member;
				}
				if (!member.getMAbstractFieldAccess().add(singleVariableAccess)) {
					return member;
				}
				*/
			}
		} else if (variable instanceof SingleVariableDeclaration) {
			SingleVariableDeclaration singleVariableDeclaration = (SingleVariableDeclaration) variable;
		}
		return member;
	}

	// TODO ?
	private FlowNode handle(InfixExpression infixExpression, FlowNode member) {
		handle(infixExpression.getLeftOperand(), member);
		handle(infixExpression.getRightOperand(), member);
		for (Expression extendedOperand : infixExpression.getExtendedOperands()) {
			handle(extendedOperand, member);
		}
		return member;
	}

	private FlowNode handle(ClassInstanceCreation classInstanceCreation, FlowNode member) {
		handle(classInstanceCreation.getExpression(), member);
		for (Expression argument : classInstanceCreation.getArguments()) {
			handle(argument, member);
		}
		return member;
	}

	private FlowNode handle(InstanceofExpression instanceofExpression, FlowNode member) {
		return handle(instanceofExpression.getLeftOperand(), member);
	}

	private FlowNode handle(Assignment assignment, FlowNode member) {
		statementHandler.getMemberOut().add(member);
		// TODO: Store access type
		handle(assignment.getRightHandSide(), member); // Determine ref of member
		return member;
	}

	private FlowNode handle(PrefixExpression prefixExpression, FlowNode member) {
		return handle(prefixExpression.getOperand(), member);
	}

	private FlowNode handle(SuperMethodInvocation superMethodInvocation, FlowNode member) {
		for (Expression argument : superMethodInvocation.getArguments()) {
			handle(argument, member);
		}
		/*
		if(member.getAbstractMethodInvocations().contains(superMethodInvocation)){
			return member;
		}
		if (!member.getAbstractMethodInvocations().add(superMethodInvocation)) {
			return member;
		}
		*/
		return member;
	}

	private FlowNode handle(CastExpression castExpression, FlowNode member) {
		return handle(castExpression.getExpression(), member);
	}

	private FlowNode handle(ParenthesizedExpression parenthesizedExpression, FlowNode member) {
		return handle(parenthesizedExpression.getExpression(), member);
	}

	private FlowNode handle(ConditionalExpression conditionalExpression, FlowNode member) {
		if (conditionalExpression == null) {
			return member; // assume nothing to do is success
		}
		handle(conditionalExpression.getExpression(), member);
		handle(conditionalExpression.getThenExpression(), member);
		handle(conditionalExpression.getElseExpression(), member);
		return member;
	}

	private FlowNode handle(ArrayAccess arrayAccess, FlowNode member) {
		if (arrayAccess == null) {
			return member; // assume nothing to do is success;
		}
		handle(arrayAccess.getArray(), member);
		handle(arrayAccess.getIndex(), member);
		return member;
	}
	
	// TODO: Never called?
	private FlowNode handle(FieldAccess fieldAccess, FlowNode member) {
		if (fieldAccess == null) {
			return member; // assume nothing to do is success
		}
		handle(fieldAccess.getExpression(), member);
		handle(fieldAccess.getField(), member);
		statementHandler.getMemberIn().add(member);
		return member;
	}

	private FlowNode handle(MethodInvocation methodInvocation, FlowNode member) {
		handle(methodInvocation.getExpression(), member);
		for (Expression argument : methodInvocation.getArguments()) {
			handle(argument, member);
		}
		if (!methodInvocation.getArguments().isEmpty()) {
			statementHandler.getMemberOut().add(member);
		}
		// TODO: Check, if the method's return type is != void; if so, add member to memberIn
		/*
		if (member.getAbstractMethodInvocations().contains(methodInvocation)){
			return member;
		}
		if (!member.getAbstractMethodInvocations().add(methodInvocation)) {
			return member;
		}
		*/
		return member;
	}

	public StatementHandlerDataFlow getStatementHandler() {
		return statementHandler;
	}
	
	public MiscHandlerDataFlow getMiscHandler() {
		return miscHandler;
	}

}
