package org.gravity.modisco.processing.fwd.dataflow;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.ArrayAccess;
import org.eclipse.gmt.modisco.java.ArrayCreation;
import org.eclipse.gmt.modisco.java.ArrayInitializer;
import org.eclipse.gmt.modisco.java.ArrayLengthAccess;
import org.eclipse.gmt.modisco.java.AssertStatement;
import org.eclipse.gmt.modisco.java.Assignment;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.BooleanLiteral;
import org.eclipse.gmt.modisco.java.BreakStatement;
import org.eclipse.gmt.modisco.java.CastExpression;
import org.eclipse.gmt.modisco.java.CatchClause;
import org.eclipse.gmt.modisco.java.CharacterLiteral;
import org.eclipse.gmt.modisco.java.ClassInstanceCreation;
import org.eclipse.gmt.modisco.java.ConditionalExpression;
import org.eclipse.gmt.modisco.java.ConstructorInvocation;
import org.eclipse.gmt.modisco.java.ContinueStatement;
import org.eclipse.gmt.modisco.java.DoStatement;
import org.eclipse.gmt.modisco.java.EmptyStatement;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.ExpressionStatement;
import org.eclipse.gmt.modisco.java.FieldAccess;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.InfixExpression;
import org.eclipse.gmt.modisco.java.InstanceofExpression;
import org.eclipse.gmt.modisco.java.LabeledStatement;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.NullLiteral;
import org.eclipse.gmt.modisco.java.NumberLiteral;
import org.eclipse.gmt.modisco.java.ParenthesizedExpression;
import org.eclipse.gmt.modisco.java.PostfixExpression;
import org.eclipse.gmt.modisco.java.PrefixExpression;
import org.eclipse.gmt.modisco.java.ReturnStatement;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.Statement;
import org.eclipse.gmt.modisco.java.StringLiteral;
import org.eclipse.gmt.modisco.java.SuperConstructorInvocation;
import org.eclipse.gmt.modisco.java.SuperFieldAccess;
import org.eclipse.gmt.modisco.java.SuperMethodInvocation;
import org.eclipse.gmt.modisco.java.SwitchCase;
import org.eclipse.gmt.modisco.java.SwitchStatement;
import org.eclipse.gmt.modisco.java.SynchronizedStatement;
import org.eclipse.gmt.modisco.java.ThisExpression;
import org.eclipse.gmt.modisco.java.ThrowStatement;
import org.eclipse.gmt.modisco.java.TryStatement;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.TypeDeclarationStatement;
import org.eclipse.gmt.modisco.java.TypeLiteral;
import org.eclipse.gmt.modisco.java.UnresolvedItemAccess;
import org.eclipse.gmt.modisco.java.UnresolvedLabeledStatement;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationExpression;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.VariableDeclarationStatement;
import org.eclipse.gmt.modisco.java.WhileStatement;
import org.gravity.modisco.AccessKind;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MSingleVariableAccess;

public class DataFlowVisitor {

	private static final Logger LOGGER = Logger.getLogger(DataFlowVisitor.class.getName());

	/**
	 * The statement handler associated with this expression handler.
	 */
	private final MemberHandler handler;

	DataFlowVisitor(MemberHandler handler) {
		this.handler = handler;
	}

	public void handle(MDefinition definition) {
		if (definition instanceof MAbstractMethodDefinition) {
			final Block body = ((MAbstractMethodDefinition) definition).getBody();
			if (body != null) {
				handle(body);
			}
		} else if (definition instanceof MFieldDefinition) {
			for (final VariableDeclarationFragment fragment : ((MFieldDefinition) definition).getFragments()) {
				handle(fragment);
			}
		} else {
			LOGGER.error("Unkown member type: " + definition);
		}
	}

	private FlowNode handle(Expression expression) {
		if (expression instanceof ArrayLengthAccess) {
			final ArrayLengthAccess arrayLengthAccess = (ArrayLengthAccess) expression;
			return handle(arrayLengthAccess.getArray());
		} else if (expression instanceof FieldAccess) {
			final FieldAccess fieldAccess = (FieldAccess) expression;
			return handle(fieldAccess);
		} else if (expression instanceof MethodInvocation) {
			final MethodInvocation methodInvocation = (MethodInvocation) expression;
			return handle(methodInvocation);

		} else if (expression instanceof ConstructorInvocation) {
			final ConstructorInvocation constructorInvocation = (ConstructorInvocation) expression;
			return handle(constructorInvocation);

		} else if (expression instanceof StringLiteral) {
			final StringLiteral stringLiteral = (StringLiteral) expression;
			return handle(stringLiteral);

		} else if (expression instanceof NullLiteral) {
			final NullLiteral nullLiteral = (NullLiteral) expression;
			return handle(nullLiteral);

		} else if (expression instanceof ArrayCreation) {
			final ArrayCreation arrayCreation = (ArrayCreation) expression;
			return handle(arrayCreation);

		} else if (expression instanceof ArrayInitializer) {
			final ArrayInitializer arrayInitializer = (ArrayInitializer) expression;
			return handle(arrayInitializer);
		} else if (expression instanceof NumberLiteral) {
			final NumberLiteral numberLiteral = (NumberLiteral) expression;
			return handle(numberLiteral);

		} else if (expression instanceof SingleVariableAccess) {
			final SingleVariableAccess singleVariableAccess = (SingleVariableAccess) expression;
			return handle(singleVariableAccess);

		} else if (expression instanceof TypeAccess) {
			final TypeAccess typeAccess = (TypeAccess) expression;
			return handle(typeAccess);

		} else if (expression instanceof InfixExpression) {
			final InfixExpression infixExpression = (InfixExpression) expression;
			return handle(infixExpression);
		} else if (expression instanceof ClassInstanceCreation) {
			final ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) expression;
			return handle(classInstanceCreation);
		} else if (expression instanceof InstanceofExpression) {
			final InstanceofExpression instanceofExpression = (InstanceofExpression) expression;
			return handle(instanceofExpression);
		} else if (expression instanceof Assignment) {
			final Assignment assignment = (Assignment) expression;
			return handle(assignment);
		} else if (expression instanceof PrefixExpression) {
			final PrefixExpression prefixExpression = (PrefixExpression) expression;
			return handle(prefixExpression);
		} else if (expression instanceof SuperMethodInvocation) {
			final SuperMethodInvocation superMethodInvocation = (SuperMethodInvocation) expression;
			return handle(superMethodInvocation);
		} else if (expression instanceof ThisExpression) {
			final ThisExpression thisExpression = (ThisExpression) expression;
			return handle(thisExpression);

		} else if (expression instanceof CastExpression) {
			final CastExpression castExpression = (CastExpression) expression;
			return handle(castExpression);
		} else if (expression instanceof ParenthesizedExpression) {
			final ParenthesizedExpression parenthesizedExpression = (ParenthesizedExpression) expression;
			return handle(parenthesizedExpression);
		} else if (expression instanceof BooleanLiteral) {
			final BooleanLiteral booleanLiteral = (BooleanLiteral) expression;
			return handle(booleanLiteral);
		} else if (expression instanceof CharacterLiteral) {
			final CharacterLiteral characterLiteral = (CharacterLiteral) expression;
			return handle(characterLiteral);
		} else if (expression instanceof ConditionalExpression) {
			final ConditionalExpression conditionalExpression = (ConditionalExpression) expression;
			return handle(conditionalExpression);
		} else if (expression instanceof ArrayAccess) {
			final ArrayAccess arrayAccess = (ArrayAccess) expression;
			return handle(arrayAccess);
		} else if (expression instanceof TypeLiteral) {
			final TypeLiteral typeLiteral = (TypeLiteral) expression;
			return handle(typeLiteral);
		} else if (expression instanceof VariableDeclarationExpression) {
			final VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression) expression;
			return handle(variableDeclarationExpression);
		} else if (expression instanceof PostfixExpression) {
			final PostfixExpression postfixExpression = (PostfixExpression) expression;
			return handle(postfixExpression);

		} else if (expression instanceof SuperFieldAccess) {
			final SuperFieldAccess superFieldAccess = (SuperFieldAccess) expression;
			return handle(superFieldAccess);
		} else if (expression instanceof UnresolvedItemAccess) {
			final UnresolvedItemAccess itemAccess = (UnresolvedItemAccess) expression;
			return handle(itemAccess);

		}
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("ERROR: Unknown Expression: " + expression);
		}
		return null;
	}

	private FlowNode handle(SuperFieldAccess superFieldAccess) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(superFieldAccess);
		if (member.alreadySeen()) {
			return member;
		}
		handle(superFieldAccess.getField());
		return member;
	}

	private FlowNode handle(PostfixExpression postfixExpression) {
		return handle(postfixExpression.getOperand());
	}

	private FlowNode handle(VariableDeclarationExpression variableDeclarationExpression) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(variableDeclarationExpression);
		if (member.alreadySeen()) {
			return member;
		}
		for (final VariableDeclarationFragment fragment : variableDeclarationExpression.getFragments()) {
			handle(fragment);
		}
		return member;
	}

	private FlowNode handle(ArrayCreation arrayCreation) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(arrayCreation);
		if (member.alreadySeen()) {
			return member;
		}
		final ArrayInitializer initializer = arrayCreation.getInitializer();
		if (initializer != null) {
			handle(initializer);
		}
		for (final Expression dimension : arrayCreation.getDimensions()) {
			handle(dimension);
		}
		return member;
	}

	private FlowNode handle(ArrayInitializer arrayInitializer) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(arrayInitializer);
		if (member.alreadySeen()) {
			return member;
		}
		for (final Expression initializerExpression : arrayInitializer.getExpressions()) {
			handle(initializerExpression);
		}
		return member;
	}

	private FlowNode handle(NumberLiteral numberLiteral) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(numberLiteral);
		if (member.alreadySeen()) {
			return member;
		}
		addFlowToContainer(numberLiteral, member);
		return member;
	}

	private FlowNode handle(SingleVariableAccess singleVariableAccess) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(singleVariableAccess);
		if (member.alreadySeen()) {
			return member;
		}
		handle(singleVariableAccess.getQualifier());
		final VariableDeclaration variable = singleVariableAccess.getVariable();
		final FlowNode varDeclNode = this.handler.getFlowNodeOrCreate(variable); // No handling desired, as
		// it's easier
		// to use this SingleVariableAccess
		// handling instead
		// Assignment flows
		if (handleAssignmentFlows((MSingleVariableAccess) singleVariableAccess, member, variable, varDeclNode)) {
			return member;
		}

		// Non-assignment flows
		handleNonAssignmentFlows((MSingleVariableAccess) singleVariableAccess, member);

		// Field and (non-param) local flows
		handleFieldAndLocalFlows(member, variable, varDeclNode);
		return member;
	}

	/**
	 * @param member
	 * @param variable
	 * @param varDeclNode
	 */
	private void handleFieldAndLocalFlows(FlowNode member, VariableDeclaration variable, FlowNode varDeclNode) {
		if (variable instanceof VariableDeclarationFragment) {
			final VariableDeclarationFragment variableDeclarationFragment = (VariableDeclarationFragment) variable;
			final AbstractVariablesContainer variablesContainer = variableDeclarationFragment.getVariablesContainer();
			member.addInRef(varDeclNode);
			if (variablesContainer instanceof MFieldDefinition) { // Read access of a field also causes inter-procedural
				// flow
				this.handler.getFlowNodeOrCreate(variablesContainer); // No handling needed; only for
				// visualization
				this.handler.addMemberRef(member);
			}
			// Parameter flows
		} else if (variable instanceof SingleVariableDeclaration) {
			final SingleVariableDeclaration singleVariableDeclaration = (SingleVariableDeclaration) variable;
			if (singleVariableDeclaration.eContainer() instanceof AbstractMethodDeclaration) { // Read access of a
				// parameter
				member.addInRef(varDeclNode); // Add edge from decl to access
				this.handler.addMemberRef(member);
			} else if (LOGGER.isInfoEnabled()) {
				LOGGER.info("Unhandled container type " + singleVariableDeclaration.eContainer().getClass().getName()
						+ " for SingleVariableDeclaration");
			}
		} else if(LOGGER.isInfoEnabled()){
			final StringBuilder message = new StringBuilder("Unknown VariableDeclaration");
			if (variable != null) {
				message.append(" of type ").append(variable.getClass().getName());
			}
			LOGGER.info(message);
		}
	}

	/**
	 * @param singleVariableAccess
	 * @param member
	 */
	private void handleNonAssignmentFlows(MSingleVariableAccess singleVariableAccess, FlowNode member) {
		// Non-assignment flows are always read accesses
		singleVariableAccess.setAccessKind(AccessKind.READ);
		// An access always flows back to its container
		final EObject container = singleVariableAccess.eContainer();
		if (container instanceof Expression) {
			handle((Expression) container).addInRef(member);
		} else if (container instanceof Statement) {
			handle((Statement) container).addInRef(member);
		} else {
			this.handler.getFlowNodeOrCreate(container).addInRef(member); // No handling; should be fine
			// though,
			// as container is handled first anyway
		}
	}

	/**
	 * @param singleVariableAccess
	 * @param member
	 * @param variable
	 * @param varDeclNode
	 * @return no work left
	 */
	private boolean handleAssignmentFlows(MSingleVariableAccess singleVariableAccess, FlowNode member,
			VariableDeclaration variable, FlowNode varDeclNode) {
		EObject currentContainer = singleVariableAccess.eContainer();
		final LinkedList<EObject> seenContainers = new LinkedList<>();
		seenContainers.add(currentContainer);
		while (!(currentContainer instanceof Statement) && currentContainer != null) {
			if (currentContainer instanceof Assignment) {
				final Assignment assignment = (Assignment) currentContainer;
				EStructuralFeature assignmentSide;
				final int queueSize = seenContainers.size();
				if (queueSize > 1) {
					assignmentSide = seenContainers.get(queueSize - 2).eContainingFeature();
				} else {
					assignmentSide = singleVariableAccess.eContainingFeature();
				}
				final EObject variableContainer = variable.eContainer();
				if (assignmentSide.equals(assignment.getLeftHandSide().eContainingFeature())) {
					switch (assignment.getOperator()) {
					case ASSIGN:
						member.addOutRef(varDeclNode);
						singleVariableAccess.setAccessKind(AccessKind.WRITE);
						if (variableContainer instanceof FieldDeclaration) {
							this.handler.addMemberRef(member);
						}
						this.handler.propagateBackWriteAccess(seenContainers, member);
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
						singleVariableAccess.setAccessKind(AccessKind.READWRITE);
						this.handler.propagateBackReadAccess(seenContainers, member);
						this.handler.propagateBackWriteAccess(seenContainers, member);
						if (variableContainer instanceof FieldDeclaration) {
							this.handler.addMemberRef(member);
						}
						break;
					default:
						LOGGER.info("Unknown operator used in assignment");
						break;
					}
				} else if (assignmentSide.equals(assignment.getRightHandSide().eContainingFeature())) {
					member.addInRef(varDeclNode);
					singleVariableAccess.setAccessKind(AccessKind.READ);
					if (variableContainer instanceof FieldDeclaration
							|| variableContainer instanceof AbstractMethodDeclaration) {
						this.handler.addMemberRef(member);
					}
					this.handler.propagateBackReadAccess(seenContainers, member);
				} else {
					LOGGER.info("Unknown assignment side");
				}
				return true;
			}
			currentContainer = currentContainer.eContainer();
			seenContainers.add(currentContainer);
		}
		return false;
	}

	private FlowNode handle(TypeAccess typeAccess) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(typeAccess);
		if (member.alreadySeen()) {
			return member;
		}
		return member;
	}

	private FlowNode handle(InfixExpression infixExpression) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(infixExpression);
		if (member.alreadySeen()) {
			return member;
		}
		final FlowNode left = handle(infixExpression.getLeftOperand());
		final FlowNode right = handle(infixExpression.getRightOperand());
		member.addInRef(left);
		member.addInRef(right);
		for (final Expression extendedOperand : infixExpression.getExtendedOperands()) {
			final FlowNode ext = handle(extendedOperand);
			member.addInRef(ext);
		}
		// An infixExpression evaluates to a value, which should always flow back into
		// the expression's container
		final EObject container = infixExpression.eContainer();
		if (container instanceof Expression) {
			handle((Expression) container).addInRef(member);
		} else if (container instanceof Statement) {
			handle((Statement) container).addInRef(member);
		} else {
			this.handler.getFlowNodeOrCreate(container).addInRef(member); // No handling; should be fine
			// though,
			// as container is handled first anyway
		}
		return member;
	}

	private FlowNode handle(ClassInstanceCreation classInstanceCreation) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(classInstanceCreation);
		if (member.alreadySeen()) {
			return member;
		}
		handleArguments(classInstanceCreation, member);
		this.handler.addMemberRef(member);
		addFlowToContainer(classInstanceCreation, member);
		return member;
	}

	private FlowNode handle(InstanceofExpression instanceofExpression) {
		return handle(instanceofExpression.getLeftOperand());
	}

	private FlowNode handle(Assignment assignment) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(assignment);
		if (member.alreadySeen()) {
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
		final FlowNode member = this.handler.getFlowNodeOrCreate(superMethodInvocation);
		if (member.alreadySeen()) {
			return member;
		}
		handleArguments(superMethodInvocation, member);
		if (!((MethodDeclaration) superMethodInvocation.getMethod()).getReturnType().getType().getName()
				.equals("void")) {
			this.handler.addMemberRef(member);
			addFlowToContainer(superMethodInvocation, member);
		}
		return member;
	}

	private FlowNode handle(ThisExpression thisExpression) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(thisExpression);
		if (member.alreadySeen()) {
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
		final FlowNode member = this.handler.getFlowNodeOrCreate(booleanLiteral);
		if (member.alreadySeen()) {
			return member;
		}
		addFlowToContainer(booleanLiteral, member);
		return member;
	}

	private FlowNode handle(CharacterLiteral characterLiteral) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(characterLiteral);
		if (member.alreadySeen()) {
			return member;
		}
		addFlowToContainer(characterLiteral, member);
		return member;
	}

	private FlowNode handle(ConditionalExpression conditionalExpression) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(conditionalExpression);
		if (member.alreadySeen()) {
			return member;
		}
		member.addInRef(handle(conditionalExpression.getExpression()));
		member.addInRef(handle(conditionalExpression.getThenExpression()));
		member.addInRef(handle(conditionalExpression.getElseExpression()));
		return member;
	}

	private FlowNode handle(TypeLiteral typeLiteral) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(typeLiteral);
		if (member.alreadySeen()) {
			return member;
		}
		return member;
	}

	private FlowNode handle(ArrayAccess arrayAccess) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(arrayAccess);
		if (member.alreadySeen()) {
			return member;
		}
		handle(arrayAccess.getArray());
		handle(arrayAccess.getIndex());
		addFlowToContainer(arrayAccess, member);
		return member;
	}

	private FlowNode handle(FieldAccess fieldAccess) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(fieldAccess);
		if (member.alreadySeen()) {
			return member;
		}
		handle(fieldAccess.getExpression());
		handle(fieldAccess.getField());
		return member;
	}

	private FlowNode handle(MethodInvocation methodInvocation) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(methodInvocation);
		if (member.alreadySeen()) {
			return member;
		}
		handleArguments(methodInvocation, member);
		final MethodDeclaration method = (MethodDeclaration) methodInvocation.getMethod();
		TypeAccess returnType = null;
		if (method != null) {
			returnType = method.getReturnType();
		}
		// Assuming that unknown null method or type is potentially non-void
		if (method == null || returnType == null) {
			this.handler.addMemberRef(member);
			addFlowToContainer(methodInvocation, member);
			return member;
		}
		if (!returnType.getType().getName().equals("void")) {
			this.handler.addMemberRef(member);
			addFlowToContainer(methodInvocation, member);
		}
		return member;
	}

	/**
	 * Handling the arguments (if present) of a method invocation and adding their
	 * flows
	 *
	 * @param methodInvocation
	 * @param member
	 */
	private void handleArguments(AbstractMethodInvocation methodInvocation, FlowNode member) {
		final AbstractMethodDeclaration calledMethod = methodInvocation.getMethod();
		this.handler.getFlowNodeOrCreate(calledMethod); // Creating just a FlowNode for the called method; no
		// handling needed
		if (methodInvocation instanceof MethodInvocation) {
			handle(((MethodInvocation) methodInvocation).getExpression());
		}
		final EList<Expression> arguments = methodInvocation.getArguments();
		if (!arguments.isEmpty()) {
			for (final Expression argument : arguments) {
				final FlowNode argumentNode = handle(argument);
				final EList<SingleVariableDeclaration> parameters = calledMethod.getParameters();
				final int indexOf = arguments.indexOf(argument);
				if (indexOf < parameters.size()) {
					final FlowNode paramNode = handle(parameters.get(indexOf));
					argumentNode.addOutRef(paramNode);
				} else if (parameters.isEmpty()) {
					if (LOGGER.isInfoEnabled()) {
						LOGGER.info(
								"Parameter list is empty, but argument list of called method is not in method "
										+ calledMethod.getClass().getSimpleName());
					}
				} else {
					final FlowNode paramNode = handle(parameters.get(parameters.size() - 1));
					argumentNode.addOutRef(paramNode);
				}
			}
			this.handler.addMemberRef(member);
		}
	}

	private FlowNode handle(NullLiteral nullLiteral) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(nullLiteral);
		if (member.alreadySeen()) {
			return member;
		}
		addFlowToContainer(nullLiteral, member);
		return member;
	}

	private FlowNode handle(StringLiteral stringLiteral) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(stringLiteral);
		if (member.alreadySeen()) {
			return member;
		}
		addFlowToContainer(stringLiteral, member);
		return member;
	}

	private FlowNode handle(UnresolvedItemAccess itemAccess) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(itemAccess);
		if (member.alreadySeen()) {
			return member;
		}
		return member;
	}

	private FlowNode handle(Statement statement) {
		if (statement instanceof AssertStatement) {
			final AssertStatement assertStatement = (AssertStatement) statement;
			return handle(assertStatement);

		} else if (statement instanceof Block) {
			final Block block = (Block) statement;
			return handle(block);

		} else if (statement instanceof BreakStatement) {
			final BreakStatement breakStatement = (BreakStatement) statement;
			return handle(breakStatement);

		} else if (statement instanceof CatchClause) {
			final CatchClause catchClause = (CatchClause) statement;
			return handle(catchClause);

		} else if (statement instanceof ConstructorInvocation) {
			final ConstructorInvocation constructorInvocation = (ConstructorInvocation) statement;
			return handle(constructorInvocation);

		} else if (statement instanceof ContinueStatement) {
			final ContinueStatement continueStatement = (ContinueStatement) statement;
			return handle(continueStatement);

		} else if (statement instanceof DoStatement) {
			final DoStatement doStatement = (DoStatement) statement;
			return handle(doStatement);

		} else if (statement instanceof EmptyStatement) {
			return null;
		} else if (statement instanceof EnhancedForStatement) {
			final EnhancedForStatement enhancedForStetement = (EnhancedForStatement) statement;
			return handle(enhancedForStetement);

		} else if (statement instanceof ExpressionStatement) {
			final ExpressionStatement expressionStatement = (ExpressionStatement) statement;
			return handle(expressionStatement);

		} else if (statement instanceof ForStatement) {
			final ForStatement forStatement = (ForStatement) statement;
			return handle(forStatement);

		} else if (statement instanceof IfStatement) {
			final IfStatement ifStatement = (IfStatement) statement;
			return handle(ifStatement);

		} else if (statement instanceof LabeledStatement) {
			final LabeledStatement labeledStatement = (LabeledStatement) statement;
			return handle(labeledStatement);

		} else if (statement instanceof ReturnStatement) {
			final ReturnStatement returnStatement = (ReturnStatement) statement;
			return handle(returnStatement);

		} else if (statement instanceof SuperConstructorInvocation) {
			final SuperConstructorInvocation superConstructorInvocation = (SuperConstructorInvocation) statement;
			return handle(superConstructorInvocation);

		} else if (statement instanceof SwitchCase) {
			final SwitchCase switchCase = (SwitchCase) statement;
			return handle(switchCase);

		} else if (statement instanceof SwitchStatement) {
			final SwitchStatement switchStatement = (SwitchStatement) statement;
			return handle(switchStatement);

		} else if (statement instanceof SynchronizedStatement) {
			final SynchronizedStatement synchronizedStatement = (SynchronizedStatement) statement;
			return handle(synchronizedStatement);

		} else if (statement instanceof ThrowStatement) {
			final ThrowStatement throwStatement = (ThrowStatement) statement;
			return handle(throwStatement);

		} else if (statement instanceof TryStatement) {
			final TryStatement tryStatement = (TryStatement) statement;
			return handle(tryStatement);

		} else if (statement instanceof TypeDeclarationStatement) {
			final TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) statement;
			return handle(typeDeclarationStatement);

		} else if (statement instanceof UnresolvedLabeledStatement) {
			final UnresolvedLabeledStatement unresolvedLabeledStatement = (UnresolvedLabeledStatement) statement;
			return handle(unresolvedLabeledStatement);

		} else if (statement instanceof VariableDeclarationStatement) {
			final VariableDeclarationStatement variableDeclarationStatement = (VariableDeclarationStatement) statement;
			return handle(variableDeclarationStatement);

		} else if (statement instanceof WhileStatement) {
			final WhileStatement whileStatement = (WhileStatement) statement;
			return handle(whileStatement);

		} else {
			return null;
		}
	}

	private FlowNode handle(WhileStatement whileStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(whileStatement);
		if (member.alreadySeen()) {
			return member;
		}
		handle(whileStatement.getBody());
		member.addInRef(handle(whileStatement.getExpression()));
		return member;
	}

	private FlowNode handle(VariableDeclarationStatement variableDeclarationStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(variableDeclarationStatement);
		if (member.alreadySeen()) {
			return member;
		}
		for (final VariableDeclarationFragment fragment : variableDeclarationStatement.getFragments()) {
			handle(fragment);
		}
		return member;
	}

	private FlowNode handle(TypeDeclarationStatement typeDeclarationStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(typeDeclarationStatement);
		if (member.alreadySeen()) {
			return member;
		}
		handle(typeDeclarationStatement.getDeclaration());
		return member;
	}

	private FlowNode handle(TryStatement tryStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(tryStatement);
		if (member.alreadySeen()) {
			return member;
		}
		handle(tryStatement.getBody());
		final Block finallyBlock = tryStatement.getFinally();
		if (finallyBlock != null) {
			handle(finallyBlock);
		}
		for (final CatchClause clause : tryStatement.getCatchClauses()) {
			handle(clause);
		}
		return member;
	}

	private FlowNode handle(ThrowStatement throwStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(throwStatement);
		if (member.alreadySeen()) {
			return member;
		}
		handle(throwStatement.getExpression());
		return member;
	}

	private FlowNode handle(SynchronizedStatement synchronizedStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(synchronizedStatement);
		if (member.alreadySeen()) {
			return member;
		}
		handle(synchronizedStatement.getBody());
		handle(synchronizedStatement.getExpression());
		return member;
	}

	private FlowNode handle(SwitchStatement switchStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(switchStatement);
		if (member.alreadySeen()) {
			return member;
		}
		for (final Statement statement : switchStatement.getStatements()) {
			handle(statement);
		}
		member.addInRef(handle(switchStatement.getExpression()));
		return member;
	}

	private FlowNode handle(SwitchCase switchCase) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(switchCase);
		if (member.alreadySeen()) {
			return member;
		}
		member.addInRef(handle(switchCase.getExpression()));
		return member;
	}

	private FlowNode handle(SuperConstructorInvocation superConstructorInvocation) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(superConstructorInvocation);
		if (member.alreadySeen()) {
			return member;
		}
		handle(superConstructorInvocation.getExpression());
		for (final Expression argument : superConstructorInvocation.getArguments()) {
			handle(argument);
		}
		return member;
	}

	private FlowNode handle(ReturnStatement returnStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(returnStatement);
		if (member.alreadySeen()) {
			return member;
		}
		handle(returnStatement.getExpression());
		return member;
	}

	private FlowNode handle(LabeledStatement labeledStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(labeledStatement);
		if (member.alreadySeen()) {
			return member;
		}
		if (labeledStatement != null) {
			handle(labeledStatement.getBody());
		}
		return member;
	}

	private FlowNode handle(IfStatement ifStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(ifStatement);
		if (member.alreadySeen()) {
			return member;
		}
		handle(ifStatement.getElseStatement());
		handle(ifStatement.getThenStatement());
		member.addInRef(handle(ifStatement.getExpression()));
		return member;
	}

	private FlowNode handle(ForStatement forStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(forStatement);
		if (member.alreadySeen()) {
			return member;
		}
		handle(forStatement.getBody());
		member.addInRef(handle(forStatement.getExpression()));
		for (final Expression initializer : forStatement.getInitializers()) {
			handle(initializer);
		}
		for (final Expression updater : forStatement.getUpdaters()) {
			handle(updater);
		}
		return member;
	}

	private FlowNode handle(ExpressionStatement expressionStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(expressionStatement);
		if (member.alreadySeen()) {
			return member;
		}
		handle(expressionStatement.getExpression());
		return member;
	}

	private FlowNode handle(EnhancedForStatement enhancedForStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(enhancedForStatement);
		if (member.alreadySeen()) {
			return member;
		}
		handle(enhancedForStatement.getBody());
		member.addInRef(handle(enhancedForStatement.getExpression()));
		return member;
	}

	private FlowNode handle(DoStatement doStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(doStatement);
		if (member.alreadySeen()) {
			return member;
		}
		handle(doStatement.getBody());
		member.addInRef(handle(doStatement.getExpression()));
		return member;
	}

	private FlowNode handle(ContinueStatement continueStatement) {
		return handle(continueStatement.getLabel());
	}

	private FlowNode handle(ConstructorInvocation constructorInvocation) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(constructorInvocation);
		if (member.alreadySeen()) {
			return member;
		}
		final AbstractMethodDeclaration calledMethod = constructorInvocation.getMethod();
		this.handler.getFlowNodeOrCreate(calledMethod); // Creating just a FlowNode for the called method; no
		// handling needed
		final EList<Expression> arguments = constructorInvocation.getArguments();
		if (!arguments.isEmpty()) {
			for (final Expression argument : arguments) {
				final FlowNode argumentNode = handle(argument);
				final FlowNode paramNode = handle(calledMethod.getParameters().get(arguments.indexOf(argument)));
				argumentNode.addOutRef(paramNode);
			}
			this.handler.addMemberRef(member);
		}
		this.handler.addMemberRef(member);
		final EObject container = constructorInvocation.eContainer();
		if (container instanceof Expression) {
			handle((Expression) container).addInRef(member);
		} else if (container instanceof Statement) {
			handle((Statement) container).addInRef(member);
		} else {
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("ERROR: Unknown element type " + container.getClass().getName()
						+ " found in ConstructorInvocation handling.");
			}
		}
		return member;
	}

	private FlowNode handle(BreakStatement breakStatement) {
		final LabeledStatement label = breakStatement.getLabel();
		if(label == null) {
			return null;
		}
		return handle(label);
	}

	private FlowNode handle(CatchClause catchClause) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(catchClause);
		if (member.alreadySeen()) {
			return member;
		}
		handle(catchClause.getBody());
		handle(catchClause.getException());
		return member;
	}

	private FlowNode handle(AssertStatement assertStatement) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(assertStatement);
		if (member.alreadySeen()) {
			return member;
		}
		member.addInRef(handle(assertStatement.getExpression()));
		handle(assertStatement.getMessage());
		return member;
	}

	private FlowNode handle(Block block) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(block);
		if (member.alreadySeen()) {
			return member;
		}
		for (final Statement statement : block.getStatements()) {
			handle(statement);
		}
		return member;
	}

	private FlowNode handle(VariableDeclarationFragment fragment) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(fragment);
		if (member.alreadySeen()) {
			return member;
		}
		final Expression initializer = fragment.getInitializer();
		if (initializer != null) {
			handle(initializer).addOutRef(member);
		}
		return member;
	}

	private FlowNode handle(AbstractTypeDeclaration declaration) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(declaration);
		if (member.alreadySeen()) {
			return member;
		}
		for (final BodyDeclaration body : declaration.getBodyDeclarations()) {
			handle(body);
		}
		return member;
	}

	private FlowNode handle(BodyDeclaration body) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(body);
		if (member.alreadySeen()) {
			return member;
		}
		return member;
	}

	private FlowNode handle(SingleVariableDeclaration singleVariableDeclaration) {
		final FlowNode member = this.handler.getFlowNodeOrCreate(singleVariableDeclaration);
		if (member.alreadySeen()) {
			return member;
		}
		handle(singleVariableDeclaration.getInitializer());
		return member;
	}

	private void addFlowToContainer(Expression expression, FlowNode member) {
		final EObject container = expression.eContainer();
		if (container instanceof Expression) {
			handle((Expression) container).addInRef(member);
		} else if (container instanceof Statement) {
			handle((Statement) container).addInRef(member);
		} else {
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("ERROR: Unknown element type " + container.getClass().getName() + " found in "
						+ expression.getClass().getSimpleName() + " handling.");
			}
		}
	}
}
