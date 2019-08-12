package org.gravity.modisco.dataflow;

import java.util.LinkedList;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
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
import org.eclipse.gmt.modisco.java.Statement;
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
import org.gravity.modisco.AccessKind;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MSingleVariableAccess;

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
	}
	
	public FlowNode handle(Expression expression) {
		if (expression instanceof ArrayLengthAccess) {
			ArrayLengthAccess arrayLengthAccess = (ArrayLengthAccess) expression;
			return handle(arrayLengthAccess.getArray());
		} else if (expression instanceof FieldAccess) {
			FieldAccess fieldAccess = (FieldAccess) expression;
			return handle(fieldAccess);
		} else if (expression instanceof MethodInvocation) {
			MethodInvocation methodInvocation = (MethodInvocation) expression;
			return handle(methodInvocation);

		} else if (expression instanceof ConstructorInvocation) {
			ConstructorInvocation constructorInvocation = (ConstructorInvocation) expression;
			return statementHandler.handle(constructorInvocation);

		} else if (expression instanceof StringLiteral) {
			StringLiteral stringLiteral = (StringLiteral) expression;
			return handle(stringLiteral);

		} else if (expression instanceof NullLiteral) {
			NullLiteral nullLiteral = (NullLiteral) expression;
			return handle(nullLiteral);

		} else if (expression instanceof ArrayCreation) {
			ArrayCreation arrayCreation = (ArrayCreation) expression;
			return handle(arrayCreation);

		} else if (expression instanceof ArrayInitializer) {
			ArrayInitializer arrayInitializer = (ArrayInitializer) expression;
			return handle(arrayInitializer);
		} else if (expression instanceof NumberLiteral) {
			NumberLiteral numberLiteral = (NumberLiteral) expression;
			return handle(numberLiteral);

		} else if (expression instanceof SingleVariableAccess) {
			SingleVariableAccess singleVariableAccess = (SingleVariableAccess) expression;
			return handle(singleVariableAccess);

		} else if (expression instanceof TypeAccess) {
			TypeAccess typeAccess = (TypeAccess) expression;
			return handle(typeAccess);

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
			return handle(thisExpression);

		} else if (expression instanceof CastExpression) {
			CastExpression castExpression = (CastExpression) expression;
			return handle(castExpression);
		} else if (expression instanceof ParenthesizedExpression) {
			ParenthesizedExpression parenthesizedExpression = (ParenthesizedExpression) expression;
			return handle(parenthesizedExpression);
		} else if (expression instanceof BooleanLiteral) {
			BooleanLiteral booleanLiteral = (BooleanLiteral) expression;
			return handle(booleanLiteral);
		} else if (expression instanceof CharacterLiteral) {
			CharacterLiteral characterLiteral = (CharacterLiteral) expression;
			return handle(characterLiteral);
		} else if (expression instanceof ConditionalExpression) {
			ConditionalExpression conditionalExpression = (ConditionalExpression) expression;
			return handle(conditionalExpression);
		} else if (expression instanceof ArrayAccess) {
			ArrayAccess arrayAccess = (ArrayAccess) expression;
			return handle(arrayAccess);
		} else if (expression instanceof TypeLiteral) {
			TypeLiteral typeLiteral = (TypeLiteral) expression;
			return handle(typeLiteral);
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
			return handle(itemAccess);

		}
		LOGGER.log( Level.INFO, "ERROR: Unknown Expression: " + expression);
		return null;
	}

	private FlowNode handle(SuperFieldAccess superFieldAccess) {
		FlowNode member = statementHandler.getFlowNodeForElement(superFieldAccess);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(superFieldAccess.getField());
		return member;
	}

	private FlowNode handle(PostfixExpression postfixExpression) {
		return handle(postfixExpression.getOperand());
	}

	private FlowNode handle(VariableDeclarationExpression variableDeclarationExpression) {
		FlowNode member = statementHandler.getFlowNodeForElement(variableDeclarationExpression);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (VariableDeclarationFragment fragment : variableDeclarationExpression.getFragments()) {
			miscHandler.handle(fragment);
		}
		return member;
	}

	private FlowNode handle(ArrayCreation arrayCreation) {
		FlowNode member = statementHandler.getFlowNodeForElement(arrayCreation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		ArrayInitializer initializer = arrayCreation.getInitializer();
		if (initializer != null) {
			handle(initializer);
		}
		for (Expression dimension : arrayCreation.getDimensions()) {
			handle(dimension);
		}
		return member;
	}

	private FlowNode handle(ArrayInitializer arrayInitializer) {
		FlowNode member = statementHandler.getFlowNodeForElement(arrayInitializer);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (Expression initializerExpression : arrayInitializer.getExpressions()) {
			handle(initializerExpression);
		}
		return member;
	}
	
	private FlowNode handle(NumberLiteral numberLiteral) {
		FlowNode member = statementHandler.getFlowNodeForElement(numberLiteral);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		addFlowToContainer(numberLiteral, member);
		return member;
	}

	private FlowNode handle(SingleVariableAccess singleVariableAccess) {
		FlowNode member = statementHandler.getFlowNodeForElement(singleVariableAccess);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(singleVariableAccess.getQualifier());
		VariableDeclaration variable = singleVariableAccess.getVariable();
		FlowNode varDeclNode = statementHandler.getFlowNodeForElement(variable); // No handling desired, as it's easier to use this SingleVariableAccess handling instead
		
		// Assignment flows
		EObject container = singleVariableAccess.eContainer();
		EObject currentContainer = container;
		LinkedList<EObject> seenContainers = new LinkedList<>();
		seenContainers.add(currentContainer);
		while (!(currentContainer instanceof Statement) && (currentContainer != null)) {
			if (currentContainer instanceof Assignment) {
				Assignment assignment = (Assignment) currentContainer;
				EStructuralFeature assignmentSide;
				int queueSize = seenContainers.size();
				if (queueSize > 1) {
					assignmentSide = seenContainers.get(queueSize - 2).eContainingFeature();	
				} else {
					assignmentSide = singleVariableAccess.eContainingFeature();
				}
				MSingleVariableAccess mSVA = ((MSingleVariableAccess) singleVariableAccess);
				EObject variableContainer = variable.eContainer();
				if (assignmentSide.equals(assignment.getLeftHandSide().eContainingFeature())) {
					switch (assignment.getOperator()) {
					case ASSIGN:
						member.addOutRef(varDeclNode);
						mSVA.setAccessKind(AccessKind.WRITE);
						if (variableContainer instanceof MFieldDefinition || variableContainer instanceof SingleVariableDeclaration) {
							statementHandler.getMemberRef().add(member);
						}
						propagateBackWriteAccess(new LinkedList<>(seenContainers), member);
						break;
					case BIT_AND_ASSIGN:
					case BIT_OR_ASSIGN:
					case BIT_XOR_ASSIGN:
					case DIVIDE_ASSIGN:
					case LEFT_SHIFT_ASSIGN:
					case MINUS_ASSIGN:
					case PLUS_ASSIGN:
					case REMAINDER_ASSIGN:
					case RIGHT_SHIFT_SIGNED_ASSIGN:
					case RIGHT_SHIFT_UNSIGNED_ASSIGN:
					case TIMES_ASSIGN:
						member.addInRef(varDeclNode); 
						member.addOutRef(varDeclNode);
						mSVA.setAccessKind(AccessKind.READWRITE);
						propagateBackReadAccess(new LinkedList<>(seenContainers), member);
						propagateBackWriteAccess(new LinkedList<>(seenContainers), member);
						if (variableContainer instanceof MFieldDefinition || variableContainer instanceof SingleVariableDeclaration) {
							statementHandler.getMemberRef().add(member);
						}
						break;
					default:
						LOGGER.log(Level.INFO, "Unknown operator used in assignment");
						break;
					}
				} else if (assignmentSide.equals(assignment.getRightHandSide().eContainingFeature())) {
					member.addInRef(varDeclNode);
					mSVA.setAccessKind(AccessKind.READ);
					if (variableContainer instanceof MFieldDefinition) {
						statementHandler.getMemberRef().add(member);
					} else if (variableContainer instanceof AbstractMethodDeclaration) {
						statementHandler.getMemberRef().add(member);
					}
					propagateBackReadAccess(new LinkedList<>(seenContainers), member);
				} else {
					LOGGER.log(Level.INFO, "Unknown assignment side");
				}
				return member;
			}
			currentContainer = currentContainer.eContainer();
			seenContainers.add(currentContainer);
		}
		
		// Non-assignment flows
		// An access always flows back to its container
		if (container instanceof Expression) {
			handle((Expression) container).addInRef(member);
		} else if (container instanceof Statement) {
			statementHandler.handle((Statement) container).addInRef(member);
		} else {
			statementHandler.getFlowNodeForElement(container).addInRef(member); // No handling; should be fine though, as container is handled first anyway 
		}
		// Field and (non-param) local flows
		if (variable instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment variableDeclarationFragment = (VariableDeclarationFragment) variable;
			AbstractVariablesContainer variablesContainer = variableDeclarationFragment.getVariablesContainer();
			member.addInRef(varDeclNode);
			if (variablesContainer instanceof MFieldDefinition) { // Read access of a field also causes inter-procedural flow
				statementHandler.getFlowNodeForElement(variablesContainer); // No handling needed; only for visualization
				statementHandler.getMemberRef().add(member);
			}
		// Parameter flows
		} else if (variable instanceof SingleVariableDeclaration) { 
			SingleVariableDeclaration singleVariableDeclaration = (SingleVariableDeclaration) variable;
			if (singleVariableDeclaration.eContainer() instanceof AbstractMethodDeclaration) { // Read access of a parameter
				member.addInRef(varDeclNode); // Add edge from decl to access
				statementHandler.getMemberRef().add(member);
			} else {
				LOGGER.log(Level.INFO, "Unhandled container type " + singleVariableDeclaration.eContainer().getClass().getName() + " for SingleVariableDeclaration");
			}
		} else {
			LOGGER.log(Level.INFO, "Unknown VariableDeclaration of type " + variable.getClass().getName());
		}
		return member;
	}
	
	private FlowNode handle(TypeAccess typeAccess) {
		FlowNode member = statementHandler.getFlowNodeForElement(typeAccess);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		return member;
	}

	private FlowNode handle(InfixExpression infixExpression) {
		FlowNode member = statementHandler.getFlowNodeForElement(infixExpression);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(infixExpression.getLeftOperand());
		handle(infixExpression.getRightOperand());
		for (Expression extendedOperand : infixExpression.getExtendedOperands()) {
			handle(extendedOperand);
		}
		// An infixExpression evaluates to a value, which should always flow back into the expression's container
		EObject container = infixExpression.eContainer();
		if (container instanceof Expression) {
			handle((Expression) container).addInRef(member);
		} else if (container instanceof Statement) {
			statementHandler.handle((Statement) container).addInRef(member);
		} else {
			statementHandler.getFlowNodeForElement(container).addInRef(member); // No handling; should be fine though, as container is handled first anyway
		}
		return member;
	}

	private FlowNode handle(ClassInstanceCreation classInstanceCreation) {
		FlowNode member = statementHandler.getFlowNodeForElement(classInstanceCreation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handleArguments(classInstanceCreation, member);
		statementHandler.getMemberRef().add(member);
		addFlowToContainer(classInstanceCreation, member);
		return member;
	}

	private FlowNode handle(InstanceofExpression instanceofExpression) {
		return handle(instanceofExpression.getLeftOperand());
	}

	private FlowNode handle(Assignment assignment) {
		FlowNode member = statementHandler.getFlowNodeForElement(assignment);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(assignment.getLeftHandSide());
		handle(assignment.getRightHandSide());
		addFlowToContainer(assignment, member);
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
		handleArguments(superMethodInvocation, member);
		if (((MethodDeclaration) superMethodInvocation.getMethod()).getReturnType().getType().getName() != "void") {
			statementHandler.getMemberRef().add(member);
			addFlowToContainer(superMethodInvocation, member);
		}
		return member;
	}

	private FlowNode handle(ThisExpression thisExpression) {
		FlowNode member = statementHandler.getFlowNodeForElement(thisExpression);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		return member;
	}
	
	private FlowNode handle(CastExpression castExpression) {
		return handle(castExpression.getExpression());
	}

	private FlowNode handle(ParenthesizedExpression parenthesizedExpression) {
		return handle(parenthesizedExpression.getExpression());
	}
	
	private FlowNode handle(BooleanLiteral booleanLiteral) {
		FlowNode member = statementHandler.getFlowNodeForElement(booleanLiteral);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		addFlowToContainer(booleanLiteral, member);
		return member;
	}
	
	private FlowNode handle(CharacterLiteral characterLiteral) {
		FlowNode member = statementHandler.getFlowNodeForElement(characterLiteral);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		addFlowToContainer(characterLiteral, member);
		return member;
	}

	private FlowNode handle(ConditionalExpression conditionalExpression) {
		FlowNode member = statementHandler.getFlowNodeForElement(conditionalExpression);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		member.addInRef(handle(conditionalExpression.getExpression()));
		member.addInRef(handle(conditionalExpression.getThenExpression()));
		member.addInRef(handle(conditionalExpression.getElseExpression()));
		return member;
	}
	
	private FlowNode handle(TypeLiteral typeLiteral) {
		FlowNode member = statementHandler.getFlowNodeForElement(typeLiteral);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		return member;
	}

	private FlowNode handle(ArrayAccess arrayAccess) {
		FlowNode member = statementHandler.getFlowNodeForElement(arrayAccess);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(arrayAccess.getArray());
		handle(arrayAccess.getIndex());
		addFlowToContainer(arrayAccess, member);
		return member;
	}
	
	private FlowNode handle(FieldAccess fieldAccess) {
		FlowNode member = statementHandler.getFlowNodeForElement(fieldAccess);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(fieldAccess.getExpression());
		handle(fieldAccess.getField());
		return member;
	}

	private FlowNode handle(MethodInvocation methodInvocation) {
		FlowNode member = statementHandler.getFlowNodeForElement(methodInvocation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handleArguments(methodInvocation, member);
		if (((MethodDeclaration) methodInvocation.getMethod()).getReturnType().getType().getName() != "void") {
			statementHandler.getMemberRef().add(member);
			addFlowToContainer(methodInvocation, member);
		}
		return member;
	}

	/**
	 * Handling the arguments (if present) of a method invocation and adding their flows 
	 * 
	 * @param methodInvocation
	 * @param member
	 */
	private void handleArguments(AbstractMethodInvocation methodInvocation, FlowNode member) {
		AbstractMethodDeclaration calledMethod = methodInvocation.getMethod();
		statementHandler.getFlowNodeForElement(calledMethod); // Creating just a FlowNode for the called method; no handling needed
		if (methodInvocation instanceof MethodInvocation) {
			handle(((MethodInvocation) methodInvocation).getExpression());
		}
		EList<Expression> arguments = methodInvocation.getArguments();
		if (!arguments.isEmpty()) {
			for (Expression argument : arguments) {
				FlowNode argumentNode = handle(argument);
				EList<SingleVariableDeclaration> parameters = calledMethod.getParameters();
				int indexOf = arguments.indexOf(argument);
				if (indexOf < parameters.size()) {
					FlowNode paramNode = miscHandler.handle(parameters.get(indexOf));
					argumentNode.addOutRef(paramNode);
				} else if (parameters.isEmpty()) {
					LOGGER.log(Level.INFO, "Parameter list is empty, but argument list of called method is not in method " + calledMethod.getClass().getSimpleName());
				} else {
					FlowNode paramNode = miscHandler.handle(parameters.get(parameters.size() -1));
					argumentNode.addOutRef(paramNode);
				}
			}
			statementHandler.getMemberRef().add(member);
		}
	}
	
	private FlowNode handle(NullLiteral nullLiteral) {
		FlowNode member = statementHandler.getFlowNodeForElement(nullLiteral);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		addFlowToContainer(nullLiteral, member);
		return member;
	}
	
	private FlowNode handle(StringLiteral stringLiteral) {
		FlowNode member = statementHandler.getFlowNodeForElement(stringLiteral);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		addFlowToContainer(stringLiteral, member);
		return member;
	}
	
	private FlowNode handle(UnresolvedItemAccess itemAccess) {
		FlowNode member = statementHandler.getFlowNodeForElement(itemAccess);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		return member;
	}

	private void addFlowToContainer(Expression expression, FlowNode member) {
		EObject container = expression.eContainer();
		if (container instanceof Expression) {
			handle((Expression) container).addInRef(member);
		} else if (container instanceof Statement) {
			statementHandler.handle((Statement) container).addInRef(member);
		} else {
			LOGGER.log(Level.INFO, "ERROR: Unknown element type " + container.getClass().getName() + " found in " + expression.getClass().getSimpleName() + " handling.");
		}
	}
	
	private void propagateBackReadAccess(LinkedList<EObject> seenContainers, FlowNode currentNode) {
		if (!seenContainers.isEmpty()) {
			EObject currentObj = seenContainers.poll();
			FlowNode newNode = statementHandler.getFlowNodeForElement(currentObj);
			currentNode.addOutRef(newNode);
			propagateBackReadAccess(seenContainers, newNode);
		}
	}
	
	private void propagateBackWriteAccess(LinkedList<EObject> seenContainers, FlowNode currentNode) {
		if (!seenContainers.isEmpty()) {
			EObject currentObj = seenContainers.poll();
			FlowNode newNode = statementHandler.getFlowNodeForElement(currentObj);
			currentNode.addInRef(newNode);
			propagateBackWriteAccess(seenContainers, newNode);
		}
	}
	
	public StatementHandlerDataFlow getStatementHandler() {
		return statementHandler;
	}
	
	public MiscHandlerDataFlow getMiscHandler() {
		return miscHandler;
	}

	public void setMiscHandler(MiscHandlerDataFlow handler) {
		miscHandler = handler;
	}

}
