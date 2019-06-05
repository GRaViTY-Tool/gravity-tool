package org.gravity.modisco.dataflow;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
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
import org.eclipse.gmt.modisco.java.MethodDeclaration;
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
import org.eclipse.gmt.modisco.java.VariableDeclarationStatement;

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
	
	public FlowNode handle(Expression expression) {
		if (expression == null) {
			return null; // assume nothing to do is success
		}
		if (expression instanceof ArrayLengthAccess) {
			ArrayLengthAccess arrayLengthAccess = (ArrayLengthAccess) expression;
			return handle(arrayLengthAccess.getArray());
		} else if (expression instanceof FieldAccess) {
			FieldAccess fieldAccess = (FieldAccess) expression;
			handle(fieldAccess);
		} else if (expression instanceof MethodInvocation) {
			MethodInvocation methodInvocation = (MethodInvocation) expression;
			return handle(methodInvocation);

		} else if (expression instanceof ConstructorInvocation) {
			ConstructorInvocation constructorInvocation = (ConstructorInvocation) expression;
			return statementHandler.handle(constructorInvocation);

		} else if (expression instanceof StringLiteral) {
			StringLiteral stringLiteral = (StringLiteral) expression;
			return null;

		} else if (expression instanceof NullLiteral) {
			NullLiteral nullLiteral = (NullLiteral) expression;
			return null;

		} else if (expression instanceof ArrayCreation) {
			ArrayCreation arrayCreation = (ArrayCreation) expression;
			return handle(arrayCreation);

		} else if (expression instanceof ArrayInitializer) {
			ArrayInitializer arrayInitializer = (ArrayInitializer) expression;
			return handle(arrayInitializer);
		} else if (expression instanceof NumberLiteral) {
			NumberLiteral numberLiteral = (NumberLiteral) expression;
			return null;

		} else if (expression instanceof SingleVariableAccess) {
			SingleVariableAccess singleVariableAccess = (SingleVariableAccess) expression;
			return handle(singleVariableAccess);

		} else if (expression instanceof TypeAccess) {
			TypeAccess typAccess = (TypeAccess) expression;
			return null;

		} else if (expression instanceof InfixExpression) {
			InfixExpression infixExpression = (InfixExpression) expression;
			return handle(infixExpression);
		} else if (expression instanceof ClassInstanceCreation) {
			ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) expression;
			return handle(classInstanceCreation);
		} else if (expression instanceof InstanceofExpression) {
			InstanceofExpression instanceofExpression = (InstanceofExpression) expression;
			return handle(instanceofExpression);
		} else if (expression instanceof Assignment) {
			Assignment assignment = (Assignment) expression;
			return handle(assignment);
		} else if (expression instanceof PrefixExpression) {
			PrefixExpression prefixExpression = (PrefixExpression) expression;
			return handle(prefixExpression);
		} else if (expression instanceof SuperMethodInvocation) {
			SuperMethodInvocation superMethodInvocation = (SuperMethodInvocation) expression;
			return handle(superMethodInvocation);
		} else if (expression instanceof ThisExpression) {
			ThisExpression thisExpression = (ThisExpression) expression;
			return null;

		} else if (expression instanceof CastExpression) {
			CastExpression castExpression = (CastExpression) expression;
			return handle(castExpression);
		} else if (expression instanceof ParenthesizedExpression) {
			ParenthesizedExpression parenthesizedExpression = (ParenthesizedExpression) expression;
			return handle(parenthesizedExpression);
		} else if (expression instanceof BooleanLiteral) {
			BooleanLiteral booleanLiteral = (BooleanLiteral) expression;
			return null;
		} else if (expression instanceof CharacterLiteral) {
			CharacterLiteral characterLiteral = (CharacterLiteral) expression;
			return null;
		} else if (expression instanceof ConditionalExpression) {
			ConditionalExpression conditionalExpression = (ConditionalExpression) expression;
			return handle(conditionalExpression);
		} else if (expression instanceof ArrayAccess) {
			ArrayAccess arrayAccess = (ArrayAccess) expression;
			handle(arrayAccess);
		} else if (expression instanceof TypeLiteral) {
			TypeLiteral typeLiteral = (TypeLiteral) expression;
			return null;
		} else if (expression instanceof VariableDeclarationExpression) {
			VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression) expression;
			return handle(variableDeclarationExpression);
		} else if (expression instanceof PostfixExpression) {
			PostfixExpression postfixExpression = (PostfixExpression) expression;
			return handle(postfixExpression);

		} else if (expression instanceof SuperFieldAccess) {
			SuperFieldAccess superFieldAccess = (SuperFieldAccess) expression;
			return handle(superFieldAccess);
		} else if (expression instanceof UnresolvedItemAccess) {
			UnresolvedItemAccess itemAccess = (UnresolvedItemAccess) expression;
			return null;

		}
		LOGGER.log( Level.INFO, "ERROR: Unknown Expression: " + expression);
		return null;
	}

	private FlowNode handle(SuperFieldAccess superFieldAccess) {
		return handle(superFieldAccess.getField());
	}

	private FlowNode handle(PostfixExpression postfixExpression) {
		return handle(postfixExpression.getOperand());
	}

	private FlowNode handle(VariableDeclarationExpression variableDeclarationExpression) {
		if (variableDeclarationExpression == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = statementHandler.getFlowNodeForElement(variableDeclarationExpression);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (VariableDeclarationFragment fragment : variableDeclarationExpression.getFragments()) {
			statementHandler.propagateBack(miscHandler.handle(fragment), member);
		}
		return member;
	}

	private FlowNode handle(ArrayCreation arrayCreation) {
		FlowNode member = statementHandler.getFlowNodeForElement(arrayCreation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		statementHandler.propagateBack(handle(arrayCreation.getInitializer()), member);
		for (Expression dimension : arrayCreation.getDimensions()) {
			statementHandler.propagateBack(handle(dimension), member);
		}
		return member;
	}

	private FlowNode handle(ArrayInitializer arrayInitializer) {
		if (arrayInitializer == null) {
			return null; // assume nothing to to is success
		}
		FlowNode member = statementHandler.getFlowNodeForElement(arrayInitializer);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (Expression initializerExpression : arrayInitializer.getExpressions()) {
			statementHandler.propagateBack(handle(initializerExpression), member);
		}
		return member;
	}

	private FlowNode handle(SingleVariableAccess singleVariableAccess) {
		FlowNode member = statementHandler.getFlowNodeForElement(singleVariableAccess);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		statementHandler.propagateBack(handle(singleVariableAccess.getQualifier()), member);
		VariableDeclaration variable = singleVariableAccess.getVariable();
		/*if (alreadySeen.containsKey(variable)) {
			member.getInRef().add(alreadySeen.get(variable));
		}*/
		System.out.println("Called on local " + variable.getName() + " of type " + variable.getClass().getTypeName());
		if (variable instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment variableDeclarationFragment = (VariableDeclarationFragment) variable;
			AbstractVariablesContainer variablesContainer = variableDeclarationFragment.getVariablesContainer();
			// Todo else handle unknown
			if (variablesContainer instanceof FieldDeclaration) {
				// TODO: Create read access edge
				// TODO Add FlowNode for variablesContainer + add to MemberIn
				statementHandler.getMemberIn().add(member);
				/*
				if(member.getMAbstractFieldAccess().contains(singleVariableAccess)){
					return member;
				}
				if (!member.getMAbstractFieldAccess().add(singleVariableAccess)) {
					return member;
				}
				*/
			} else if (variablesContainer instanceof VariableDeclarationStatement) {
				// Read access of a local
				System.out.println("Var Decl! " + variablesContainer.getFragments().get(0).getName());
				member.addInRef(statementHandler.getAlreadySeen().get(variableDeclarationFragment));
			} else if (variablesContainer instanceof VariableDeclarationExpression) {
				System.out.println("This happens as well...");
			}
		} else if (variable instanceof SingleVariableDeclaration) {
			// Read access of a parameter
			SingleVariableDeclaration singleVariableDeclaration = (SingleVariableDeclaration) variable;
			
			if (singleVariableDeclaration.eContainer() instanceof AbstractMethodDeclaration) {
				// TODO: What kind of processing is needed?
				System.out.println("Called on parameter " + variable.getName());
			} else {
				System.out.println("Called on local " + variable.getName());
			}
		}
		return member;
	}

	private FlowNode handle(InfixExpression infixExpression) {
		FlowNode member = statementHandler.getFlowNodeForElement(infixExpression);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		statementHandler.propagateBack(handle(infixExpression.getLeftOperand()), member);
		statementHandler.propagateBack(handle(infixExpression.getRightOperand()), member);
		for (Expression extendedOperand : infixExpression.getExtendedOperands()) {
			statementHandler.propagateBack(handle(extendedOperand), member);
		}
		return member;
	}

	private FlowNode handle(ClassInstanceCreation classInstanceCreation) {
		FlowNode member = statementHandler.getFlowNodeForElement(classInstanceCreation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		statementHandler.propagateBack(handle(classInstanceCreation.getExpression()), member);
		for (Expression argument : classInstanceCreation.getArguments()) {
			statementHandler.propagateBack(handle(argument), member);
		}
		return member;
	}

	private FlowNode handle(InstanceofExpression instanceofExpression) {
		return handle(instanceofExpression.getLeftOperand());
	}

	// TODO
	private FlowNode handle(Assignment assignment) {
		FlowNode member = statementHandler.getFlowNodeForElement(assignment);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		// TODO: Store access type
		Expression leftHandSide = assignment.getLeftHandSide();
		FlowNode leftHandFlow = handle(leftHandSide);
		if (leftHandFlow.getModelElement() instanceof FieldDeclaration) {
			statementHandler.getMemberOut().add(member); // TODO FieldDeclaration correct type to check against?
		}
		Expression rightHandSide = assignment.getRightHandSide();
		FlowNode rightHandFlow = handle(rightHandSide);
		if (rightHandFlow != null) {
			for (FlowNode in : handle(rightHandSide).getInRef()) {
				member.getInRef().add(in);
			}
		}
		return member;
	}

	private FlowNode handle(PrefixExpression prefixExpression) {
		return handle(prefixExpression.getOperand());
	}

	private FlowNode handle(SuperMethodInvocation superMethodInvocation) {
		FlowNode member = statementHandler.getFlowNodeForElement(superMethodInvocation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (Expression argument : superMethodInvocation.getArguments()) {
			statementHandler.propagateBack(handle(argument), member);
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

	private FlowNode handle(CastExpression castExpression) {
		return handle(castExpression.getExpression());
	}

	private FlowNode handle(ParenthesizedExpression parenthesizedExpression) {
		return handle(parenthesizedExpression.getExpression());
	}

	private FlowNode handle(ConditionalExpression conditionalExpression) {
		if (conditionalExpression == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = statementHandler.getFlowNodeForElement(conditionalExpression);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		statementHandler.propagateBack(handle(conditionalExpression.getExpression()), member);
		statementHandler.propagateBack(handle(conditionalExpression.getThenExpression()), member);
		statementHandler.propagateBack(handle(conditionalExpression.getElseExpression()), member);
		return member;
	}

	private FlowNode handle(ArrayAccess arrayAccess) {
		if (arrayAccess == null) {
			return null; // assume nothing to do is success;
		}
		FlowNode member = statementHandler.getFlowNodeForElement(arrayAccess);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		statementHandler.propagateBack(handle(arrayAccess.getArray()), member);
		statementHandler.propagateBack(handle(arrayAccess.getIndex()), member);
		return member;
	}
	
	// TODO: Never called?
	private FlowNode handle(FieldAccess fieldAccess) {
		if (fieldAccess == null) {
			return null; // assume nothing to do is success
		}
		FlowNode member = statementHandler.getFlowNodeForElement(fieldAccess);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		statementHandler.propagateBack(handle(fieldAccess.getExpression()), member);
		statementHandler.propagateBack(handle(fieldAccess.getField()), member);
		statementHandler.getMemberIn().add(member);
		return member;
	}

	private FlowNode handle(MethodInvocation methodInvocation) {
		FlowNode member = statementHandler.getFlowNodeForElement(methodInvocation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		statementHandler.propagateBack(handle(methodInvocation.getExpression()), member);
		EList<Expression> arguments = methodInvocation.getArguments();
		if (!arguments.isEmpty()) {
			for (Expression argument : arguments) {
				statementHandler.propagateBack(handle(argument), member);
				System.out.println("Argument type: " + argument.getClass().getTypeName());
			}
			statementHandler.getMemberOut().add(member);
		}
		// TODO FlowNode for method + for each argument
		statementHandler.getFlowNodeForElement(methodInvocation.getMethod());
		for (SingleVariableDeclaration param :methodInvocation.getMethod().getParameters()) {
			FlowNode paramNode = statementHandler.getFlowNodeForElement(param);
			for (SingleVariableAccess access : param.getUsageInVariableAccess()) {
				paramNode.addOutRef(statementHandler.getFlowNodeForElement(access));
			}
		}
		if (((MethodDeclaration) methodInvocation.getMethod()).getReturnType().getType().getName() != "void") {
			statementHandler.getMemberIn().add(member);
		}
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
