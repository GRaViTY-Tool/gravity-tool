package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.ArrayAccess;
import org.eclipse.modisco.java.ArrayCreation;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.Assignment;
import org.eclipse.modisco.java.BooleanLiteral;
import org.eclipse.modisco.java.CastExpression;
import org.eclipse.modisco.java.ConditionalExpression;
import org.eclipse.modisco.java.EnhancedForStatement;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.ExpressionStatement;
import org.eclipse.modisco.java.FieldAccess;
import org.eclipse.modisco.java.ForStatement;
import org.eclipse.modisco.java.IfStatement;
import org.eclipse.modisco.java.InfixExpression;
import org.eclipse.modisco.java.InstanceofExpression;
import org.eclipse.modisco.java.MethodInvocation;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.NumberLiteral;
import org.eclipse.modisco.java.PrimitiveType;
import org.eclipse.modisco.java.PrimitiveTypeBoolean;
import org.eclipse.modisco.java.PrimitiveTypeDouble;
import org.eclipse.modisco.java.PrimitiveTypeFloat;
import org.eclipse.modisco.java.PrimitiveTypeInt;
import org.eclipse.modisco.java.PrimitiveTypeLong;
import org.eclipse.modisco.java.ReturnStatement;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Statement;
import org.eclipse.modisco.java.StringLiteral;
import org.eclipse.modisco.java.ThrowStatement;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.UnresolvedMethodDeclaration;
import org.eclipse.modisco.java.UnresolvedVariableDeclarationFragment;
import org.eclipse.modisco.java.VariableDeclaration;
import org.eclipse.modisco.java.VariableDeclarationFragment;
import org.eclipse.modisco.java.WhileStatement;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.eclipse.osgi.util.NLS;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.Messages;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.util.MoDiscoUtil;
import org.gravity.modisco.util.NameUtil;

/**
 * Preprocessing replacing null return types
 *
 * @author speldszus
 *
 */
public class ReturnTypePreprocessing extends AbstractTypedModiscoProcessor<MMethodDefinition> {

	private static final Logger LOGGER = Logger.getLogger(ReturnTypePreprocessing.class);

	@Override
	public boolean process(final MGravityModel model, final Collection<MMethodDefinition> elements, final IFolder debug,
			final IProgressMonitor monitor) {
		return elements.parallelStream().filter(method -> {
			final var returnType = method.getReturnType();
			return (returnType == null) || (returnType.getType() == null);
		}).sequential().allMatch(method -> fixReturnType(method, model));
	}

	/**
	 * Retrieves the return type of the given method. Iff the return type is null it
	 * is set to java.lang.Object!
	 *
	 * @param method The method for which the return type should be retrieved
	 * @param model  the model of the program
	 * @return The return type of the method
	 */
	private static boolean fixReturnType(final MMethodDefinition method, final MGravityModel model) {
		Type type = null;
		for (final AbstractMethodInvocation invocation : method.getUsages()) {
			try {
				final var tmpType = guessReturnTypeOfCall(model, invocation);
				if ((tmpType != null) && ((type == null) || MoDiscoUtil.isSuperType(tmpType, type))) {
					type = tmpType;
				}
			} catch (final IllegalStateException e) {
				logInfoOptimizeGuess(invocation, method);
			}
		}
		if (type == null) {
			if (LOGGER.isEnabledFor(Level.WARN)) {
				LOGGER.warn(NLS.bind(Messages.returnTypeNotSetAssumeObject, method.getName()));
			}
			type = MoDiscoUtil.getJavaLangObject(model);
			if (type == null) {
				LOGGER.error(NLS.bind(Messages.returnTypeIsNull, method.getName()));
				return false;
			}
		}
		final var returnType = JavaFactory.eINSTANCE.createTypeAccess();
		method.setReturnType(returnType);
		returnType.setType(type);
		return true;
	}

	/**
	 * Logs a possible optimization of a return type guess if logging is enabled
	 *
	 * @param invocation An invocation
	 * @param target     The target of the invocation
	 */
	private static void logInfoOptimizeGuess(final AbstractMethodInvocation invocation,
			final MMethodDefinition target) {
		if (LOGGER.isInfoEnabled()) {
			final var source = getContainingMethod(invocation);
			final var targetName = NameUtil.getFullyQualifiedName(target);
			if (source != null) {
				final var sourceName = NameUtil.getFullyQualifiedName(source);
				LOGGER.info(
						NLS.bind(Messages.warnGuessMightBeOptimizedDetailed, new String[] { targetName, sourceName }));
			} else {
				LOGGER.info(NLS.bind(Messages.warnGuessMightBeOptimized, targetName));
			}
		}
	}

	/**
	 * try to guess the return type of the called method.
	 *
	 * @param model      The model containing the invocation
	 * @param invocation The method invocation
	 * @return The return type of the method
	 */
	private static Type guessReturnTypeOfCall(final MGravityModel model, final AbstractMethodInvocation invocation) {
		final var container = invocation.eContainer();
		if(container != null) {
			return guessReturnTypeOfCall(model, invocation, container);
		}
		LOGGER.warn("Cannot guess reurn type as call is in no container");
		return null;
	}

	/**
	 * Guesses the return type from the container of the call
	 *
	 * @param model      The model containing the invocation
	 * @param invocation The method invocation
	 * @param container  A container of the invocation
	 * @return The return type of the method
	 */
	private static Type guessReturnTypeOfCall(final MGravityModel model, final AbstractMethodInvocation invocation,
			final EObject container) {
		// AbstractMethodInvocation has to be before expression and statement as
		// instances implement always also one of the other interfaces
		if (container instanceof AbstractMethodInvocation) {
			return getReturnType(invocation, (AbstractMethodInvocation) container);
		}

		// Statement
		else if (container instanceof Statement) {
			return guessReturnTypeOfCall(model, (Statement) container);
		}

		// Expression
		else if (container instanceof Expression) {
			return guessReturnTypeOfCall(model, invocation, (Expression) container);
		}

		// VariableDeclaration
		else if (container instanceof VariableDeclarationFragment) {
			final var type = ((VariableDeclarationFragment) container).getVariablesContainer().getType();
			if (type != null) {
				return type.getType();
			}
		}

		throw new IllegalStateException(NLS.bind(Messages.unknownType, container.eClass().getName()));
	}

	/**
	 * Guess the return type of a method invocation based on an other invocation
	 * containing the invocation
	 *
	 * @param invocation The invocation whose return type should be guessed
	 * @param container  The invocation containing the other one
	 * @return The guessed return type
	 */
	private static Type getReturnType(final AbstractMethodInvocation invocation,
			final AbstractMethodInvocation container) {
		final var method = container.getMethod();
		if ((method == null) || (method instanceof UnresolvedMethodDeclaration)) {
			// We cannot retrieve information from unresolved elements
			return null;
		}

		final var index = container.getArguments().indexOf(invocation); // Some subtypes of AbstractMethodInvocation are
		// expressions!
		if (index >= 0) {
			return guessReturnTypeFromParameterAssignment(method, index);
		} else if (container instanceof MethodInvocation) {
			final var expression = ((MethodInvocation) container).getExpression();
			if (expression == null) {
				// We cannot guess from a method invoked without context.
				return null;
			}
			if (expression.equals(invocation)) {// Some subtypes of AbstractMethodInvocation are expressions!
				return method.getAbstractTypeDeclaration();
			}
		}
		throw new IllegalStateException(NLS.bind(Messages.unknownType, invocation.eClass().getName()));
	}

	/**
	 * Guesses the return type from the parameter at the given index
	 *
	 * @param method The method to whose parameter the returned value is assigned
	 * @param index  The index of the assignment
	 * @return The corresponding type
	 */
	private static Type guessReturnTypeFromParameterAssignment(final AbstractMethodDeclaration method,
			final int index) {
		final var parameters = method.getParameters();
		final var numParams = parameters.size();
		if (numParams == 0) {
			if (method.isProxy()) {
				// We cannot retrieve information from unresolved elements
				return null;
			}
			throw new IllegalStateException("Arguments are assigned to a method without parameters!");
		}
		if (index >= numParams) {
			final var last = parameters.get(numParams - 1);
			if (last.isVarargs()) {
				return last.getType().getType();
			}
			throw new IllegalStateException("More arguments are assigned to method than it has parameters!");
		}
		return parameters.get(index).getType().getType();
	}

	/**
	 * try to guess the return type of the called method based on the statement
	 * where the call is located.
	 *
	 * @param pg        The model containing the invocation
	 * @param statement The statement containing the invocation
	 * @return The return type of the method
	 */
	private static Type guessReturnTypeOfCall(final MGravityModel pg, final Statement statement) {
		if (statement instanceof ExpressionStatement) {
			// It is not possible to guess the return type from this use
			return null;
			// We cannot handle infix expressions but its also no error
		} else if (statement instanceof ReturnStatement) {
			final var definition = getContainingMethod(statement);
			if (definition instanceof MMethodDefinition) {
				return ((MMethodDefinition) definition).getReturnType().getType();
			}
		} else if ((statement instanceof IfStatement) || (statement instanceof WhileStatement)
				|| (statement instanceof ForStatement)) {
			return getOrphanType(pg, PrimitiveTypeBoolean.class);
		} else if (statement instanceof ThrowStatement) {
			// The return type is thrown
			return MoDiscoUtil.getThrowableClassOrObject(pg);
		} else if (statement instanceof EnhancedForStatement) {
			final var plain = ((EnhancedForStatement) statement).getParameter().getType().getType();
			final var result = pg.getOrphanTypes().parallelStream().filter(ArrayType.class::isInstance)
					.map(ArrayType.class::cast).filter(a -> plain.equals(a.getElementType().getType())).findAny();
			if (result.isPresent()) {
				return result.get();
			}
			final var array = JavaFactory.eINSTANCE.createArrayType();
			array.setName(plain.getName() + "[]");
			final var access = JavaFactory.eINSTANCE.createTypeAccess();
			access.setType(plain);
			array.setElementType(access);
			pg.getOrphanTypes().add(array);
			return array;
		}
		throw new IllegalStateException(NLS.bind(Messages.unhandeledExpression, statement.eClass().getName()));
	}

	/**
	 * try to guess the return type of the called method.
	 *
	 * @param pg         The model containing the invocation
	 * @param invocation The method invocation
	 * @param expression The expression containing the invocation
	 * @return The return type of the method
	 */
	private static Type guessReturnTypeOfCall(final MGravityModel pg, final AbstractMethodInvocation invocation,
			final Expression expression) {
		if (expression instanceof InfixExpression) {
			return guessFromInfix(pg, invocation, (InfixExpression) expression);
		} else if (expression instanceof Assignment) {
			return getAssignmentType(pg, (Assignment) expression);
		} else if (expression instanceof ArrayInitializer) {
			return getArraysType(((ArrayInitializer) expression));
		} else if (expression instanceof CastExpression) {
			return ((CastExpression) expression).getType().getType();
		} else if (expression instanceof ConditionalExpression) {
			final var conditional = (ConditionalExpression) expression;
			if (conditional.getExpression().equals(invocation)) {
				return getOrphanType(pg, PrimitiveTypeBoolean.class);
			}
			return guessReturnTypeOfCall(pg, invocation, conditional.eContainer());
		} else if (expression instanceof SingleVariableAccess) {
			return getType(pg, ((SingleVariableAccess) expression).getVariable());
		} else if (expression instanceof InstanceofExpression) {
			// We cannot guess based on this usage
			return null;
		}
		throw new IllegalStateException(NLS.bind(Messages.unhandeledExpression, expression.eClass().getName()));
	}

	/**
	 * Gets the type of the initialized array
	 *
	 * @param initializer The initializer
	 * @return the type
	 */
	private static Type getArraysType(final ArrayInitializer initializer) {
		final var initializedObject = initializer.eContainer();
		if (initializedObject instanceof VariableDeclarationFragment) {
			return ((VariableDeclarationFragment) initializedObject).getVariablesContainer().getType().getType();
		} else if (initializedObject instanceof ArrayCreation) {
			final var type = ((ArrayCreation) initializedObject).getType().getType();
			if (type instanceof ArrayType) {
				return ((ArrayType) type).getElementType().getType();
			}
			return type;
		}
		throw new IllegalStateException(NLS.bind(Messages.unhandeledExpression, initializedObject.eClass().getName()));
	}

	/**
	 * Guesses the return type of the invocation used in an infix expression from
	 * the other operand
	 *
	 * @param model      The modisco model
	 * @param invocation The invocation whose return type should be guessed
	 * @param infix      The infix expression the invocation is used in
	 * @return The guessed return type
	 */
	private static Type guessFromInfix(final MGravityModel model, final AbstractMethodInvocation invocation,
			final InfixExpression infix) {
		var other = infix.getLeftOperand();
		if (other == invocation) {
			other = infix.getRightOperand();
		}
		if (other == invocation) {
			// We cannot guess the return type
			return null;
		}
		if (other instanceof StringLiteral) {
			return MoDiscoUtil.getType(model, "java.lang.String");
		}
		if (other instanceof BooleanLiteral) {
			return getOrphanType(model, PrimitiveTypeBoolean.class);
		}
		if (other instanceof NumberLiteral) {
			return getPrimitiveType(model, (NumberLiteral) other);
		}
		return guessReturnTypeOfCall(model, invocation, other);
	}

	/**
	 * Searches the number type of a number literal
	 *
	 * @param model   The modisco model
	 * @param literal The number literal
	 * @return The corresponding primitive type
	 */
	private static Type getPrimitiveType(final Model model, final NumberLiteral literal) {
		final var value = literal.getTokenValue();
		try {
			Integer.parseInt(value);
			return getOrphanType(model, PrimitiveTypeInt.class);
		} catch (final NumberFormatException e1) {
			try {
				Long.parseLong(value);
				return getOrphanType(model, PrimitiveTypeLong.class);
			} catch (final NumberFormatException e2) {
				try {
					Float.parseFloat(value);
					return getOrphanType(model, PrimitiveTypeFloat.class);
				} catch (final NumberFormatException e3) {
					try {
						Double.parseDouble(value);
						return getOrphanType(model, PrimitiveTypeDouble.class);
					} catch (final NumberFormatException e4) {
						throw new IllegalStateException(
								NLS.bind(Messages.unhandeledExpression, literal.eClass().getName()));
					}
				}
			}
		}
	}

	/**
	 * Searches a primitive type in the orphan types
	 *
	 * @param model The model from which the type should be searched
	 * @param type  The class of the primitive type
	 * @return The found type or null
	 */
	private static Type getOrphanType(final Model model, final Class<? extends PrimitiveType> type) {
		return model.getOrphanTypes().parallelStream().filter(type::isInstance).findAny().orElse(null);
	}

	/**
	 * Get the variable of the assignment
	 *
	 * @param assignment The assign statement
	 * @param pg         The model containing the assignment
	 * @return The variable
	 */
	private static Type getAssignmentType(final MGravityModel pg, final Assignment assignment) {
		final var expression = assignment.getLeftHandSide();
		if (expression instanceof SingleVariableAccess) {
			return getType(pg, ((SingleVariableAccess) expression).getVariable());
		} else if (expression instanceof FieldAccess) {
			return getType(pg, ((FieldAccess) expression).getField().getVariable());
		} else if (expression instanceof ArrayAccess) {
			return ((ArrayType) getArrayType(pg, (ArrayAccess) expression)).getElementType().getType();
		} else {
			throw new IllegalStateException(NLS.bind(Messages.unknownType, expression.eClass().getName()));
		}
	}

	/**
	 * Gets the type or a possible type of the variable
	 *
	 * @param pg       The program model containing the variable
	 * @param variable The variable
	 * @return The type of the variable
	 */
	private static Type getType(final MGravityModel pg, final VariableDeclaration variable) {
		if(variable == null) {
			LOGGER.warn("Cannot get type as variable is null");
			return null;
		}
		if (variable instanceof UnresolvedVariableDeclarationFragment) {
			return MoDiscoUtil.getJavaLangObject(pg);
		} else if (variable instanceof VariableDeclarationFragment) {
			final var container = ((VariableDeclarationFragment) variable).getVariablesContainer();
			if (container != null) {
				final var typeAccess = container.getType();
				if (typeAccess != null) {
					return typeAccess.getType();
				}
			}
		} else if (variable instanceof SingleVariableDeclaration) {
			final var typeAccess = ((SingleVariableDeclaration) variable).getType();
			if (typeAccess != null) {
				return typeAccess.getType();
			}
		}
		throw new IllegalStateException(NLS.bind(Messages.unknownType, variable.eClass().getName()));
	}

	/**
	 * Guesses the type of the accessed array
	 *
	 * @param pg          The program model containing the array
	 * @param arrayAccess The access to the array
	 * @return The type of the array
	 */
	private static Type getArrayType(final MGravityModel pg, final ArrayAccess arrayAccess) {
		final var expression = arrayAccess.getArray();
		if (expression instanceof SingleVariableAccess) {
			final var variable = ((SingleVariableAccess) expression).getVariable();
			return getType(pg, variable);
		} else if (expression instanceof AbstractMethodInvocation) {
			return MoDiscoUtil.getJavaLangObject(pg);
		} else {
			throw new IllegalStateException(NLS.bind(Messages.unknownType, expression.eClass().getName()));
		}
	}

	/**
	 *
	 * Search the method or field containing the statement
	 *
	 * @param statement The statement
	 * @return The definition containing the statement
	 */
	private static MDefinition getContainingMethod(final EObject statement) {
		var eContainer = statement;
		while ((eContainer != null) && !(eContainer instanceof MDefinition)) {
			eContainer = eContainer.eContainer();
		}
		return (MDefinition) eContainer;
	}

	@Override
	public Class<MMethodDefinition> getSupportedType() {
		return MMethodDefinition.class;
	}
}
