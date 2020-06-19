package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.AbstractVariablesContainer;
import org.eclipse.modisco.java.ArrayAccess;
import org.eclipse.modisco.java.ArrayCreation;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.ArrayLengthAccess;
import org.eclipse.modisco.java.Assignment;
import org.eclipse.modisco.java.CastExpression;
import org.eclipse.modisco.java.ConditionalExpression;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.ExpressionStatement;
import org.eclipse.modisco.java.FieldAccess;
import org.eclipse.modisco.java.ForStatement;
import org.eclipse.modisco.java.IfStatement;
import org.eclipse.modisco.java.InfixExpression;
import org.eclipse.modisco.java.MethodInvocation;
import org.eclipse.modisco.java.ParenthesizedExpression;
import org.eclipse.modisco.java.PrefixExpression;
import org.eclipse.modisco.java.PrimitiveTypeBoolean;
import org.eclipse.modisco.java.PrimitiveTypeInt;
import org.eclipse.modisco.java.ReturnStatement;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.Statement;
import org.eclipse.modisco.java.ThrowStatement;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.VariableDeclaration;
import org.eclipse.modisco.java.VariableDeclarationFragment;
import org.eclipse.modisco.java.WhileStatement;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.eclipse.osgi.util.NLS;
import org.gravity.modisco.MConstructorDefinition;
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
	public boolean process(final MGravityModel model, final Collection<MMethodDefinition> elements, IFolder debug,
			final IProgressMonitor monitor) {
		return elements.parallelStream().filter(method -> {
			final TypeAccess returnType = method.getReturnType();
			return returnType == null || returnType.getType() == null;
		}).allMatch(method -> fixReturnType(method, model));
	}

	/**
	 * Retrieves the return type of the given method. Iff the return type is null it
	 * is set to java.lang.Object!
	 *
	 * @param method
	 *            The method for which the return type should be retrieved
	 * @param model
	 *            the model of the program
	 * @return The return type of the method
	 */
	private static boolean fixReturnType(final MMethodDefinition method, final MGravityModel model) {
		Type type = null;
		for (final AbstractMethodInvocation invocation : method.getUsages()) {
			try {
				final Type tmpType = guessReturnTypeOfCall(model, invocation);
				if (tmpType != null && (type == null || MoDiscoUtil.isSuperType(tmpType, type))) {
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
		final TypeAccess returnType = JavaFactory.eINSTANCE.createTypeAccess();
		method.setReturnType(returnType);
		returnType.setType(type);
		return true;
	}

	/**
	 * Logs a possible optimization of a return type guess if logging is enabled
	 *
	 * @param invocation
	 *            An invocation
	 * @param target
	 *            The target of the invocation
	 */
	private static void logInfoOptimizeGuess(final AbstractMethodInvocation invocation,
			final MMethodDefinition target) {
		if (LOGGER.isInfoEnabled()) {
			final MDefinition source = getContainingMethod(invocation);
			final String targetName = NameUtil.getFullyQualifiedName(target);
			if (source != null) {
				final String sourceName = NameUtil.getFullyQualifiedName(source);
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
	 * @param pg
	 *            The model containing the invocation
	 * @param invocation
	 *            The method invocation
	 * @return The return type of the method
	 */
	private static Type guessReturnTypeOfCall(final MGravityModel pg, final AbstractMethodInvocation invocation) {
		final EObject eContainer = invocation.eContainer();

		// Statement
		if (eContainer instanceof Statement) {
			return guessReturnTypeOfCall(pg, invocation, (Statement) eContainer);
		}

		// Expression
		else if (eContainer instanceof Expression) {
			return guessReturnTypeOfCall(pg, invocation, (Expression) eContainer);
		}

		// VariableDeclaration
		else if (eContainer instanceof VariableDeclarationFragment) {
			return ((VariableDeclarationFragment) eContainer).getVariablesContainer().getType().getType();
		}

		// AbstractMethodInvocation
		else if (eContainer instanceof AbstractMethodInvocation) {
			return getReturnType(invocation, (AbstractMethodInvocation) eContainer);
		}

		throw new IllegalStateException(NLS.bind(Messages.unknownType, eContainer.eClass().getName()));
	}

	/**
	 * Guess the return type of a method invocation based on an other invocation
	 * containing the invocation
	 *
	 * @param invocation
	 *            The invocation whose return type should be guessed
	 * @param container
	 *            The invocation containing the other one
	 * @return The guessed return type
	 */
	private static Type getReturnType(final AbstractMethodInvocation invocation,
			final AbstractMethodInvocation container) {
		final int index = container.getArguments().indexOf(invocation); // Some subtypes of AbstractMethodInvocation are
		// expressions!
		if (index >= 0) {
			return container.getMethod().getParameters().get(index).getType().getType();
		} else {
			if (container instanceof MethodInvocation) {
				final Expression expression = ((MethodInvocation) container).getExpression();
				if (expression.equals(invocation)) {// Some subtypes of AbstractMethodInvocation are expressions!
					return container.getMethod().getAbstractTypeDeclaration();
				} else {
					throw new IllegalStateException(NLS.bind(Messages.unknownType, invocation.eClass().getName()));
				}
			} else {
				throw new IllegalStateException(NLS.bind(Messages.unknownType, invocation.eClass().getName()));
			}
		}
	}

	/**
	 * try to guess the return type of the called method.
	 *
	 * @param pg
	 *            The model containing the invocation
	 * @param invocation
	 *            The method invocation
	 * @param statement
	 *            The statement containing the invocation
	 * @return The return type of the method
	 */
	private static Type guessReturnTypeOfCall(final MGravityModel pg, final AbstractMethodInvocation invocation,
			final Statement statement) {
		if (statement instanceof ForStatement) {
			return MoDiscoUtil.getJavaLangObject(pg);
		} else if (statement instanceof ExpressionStatement) {
			return null;
			// We cannot handle infix expressions but its also no error
		} else if (statement instanceof ReturnStatement) {
			final MDefinition definition = getContainingMethod(statement);
			if (definition instanceof MMethodDefinition) {
				return ((MMethodDefinition) definition).getReturnType().getType();
			} else if (definition instanceof MConstructorDefinition) {
				return ((MConstructorDefinition) definition).getAbstractTypeDeclaration();
			} else if (definition instanceof AbstractVariablesContainer) {
				return ((AbstractVariablesContainer) definition).getType().getType();
			} else {
				throw new IllegalStateException(NLS.bind(Messages.unknownMethodDef, statement.eClass().getName()));
			}
		} else if (statement instanceof IfStatement || statement instanceof WhileStatement) {
			return pg.getOrphanTypes().parallelStream().filter(t -> t instanceof PrimitiveTypeBoolean).findAny()
					.orElse(null);
		} else if (statement instanceof ThrowStatement) {
			// The return type is thrown
			return MoDiscoUtil.getThrowableClassOrObject(pg);
		}
		throw new IllegalStateException(NLS.bind(Messages.unhandeledExpression, statement.eClass().getName()));
	}

	/**
	 * try to guess the return type of the called method.
	 *
	 * @param pg
	 *            The model containing the invocation
	 * @param invocation
	 *            The method invocation
	 * @param expression
	 *            The expression containing the invocation
	 * @return The return type of the method
	 */
	private static Type guessReturnTypeOfCall(final MGravityModel pg, final AbstractMethodInvocation invocation,
			final Expression expression) {
		if (expression instanceof ParenthesizedExpression || expression instanceof PrefixExpression
				|| expression instanceof InfixExpression) {
			return MoDiscoUtil.getJavaLangObject(pg);
		} else if (expression instanceof Assignment) {
			return getAssignmentType(pg, (Assignment) expression);
		} else if (expression instanceof ArrayInitializer) {
			final EObject initializedObject = ((ArrayInitializer) expression).eContainer();
			if (initializedObject instanceof VariableDeclarationFragment) {
				return ((VariableDeclarationFragment) initializedObject).getVariablesContainer().getType().getType();
			} else {
				throw new IllegalStateException(NLS.bind(Messages.unknownType, expression.eClass().getName()));
			}
		} else if (expression instanceof ArrayLengthAccess) {
			return pg.getOrphanTypes().parallelStream().filter(t -> t instanceof PrimitiveTypeInt).findAny()
					.orElse(null);
		} else if (expression instanceof CastExpression) {
			return ((CastExpression) expression).getType().getType();
		} else if (expression instanceof FieldAccess) {
			final VariableDeclaration variable = ((FieldAccess) expression).getField().getVariable();
			return getType(pg, variable);
		} else if (expression instanceof ArrayAccess) {
			return getArrayType(pg, (ArrayAccess) expression);
		} else if (expression instanceof ArrayCreation) {
			return ((ArrayCreation) expression).getType().getType();
		} else if (expression instanceof ConditionalExpression) {
			if (((ConditionalExpression) expression).getExpression().equals(invocation)) {
				return pg.getOrphanTypes().parallelStream().filter(t -> t instanceof PrimitiveTypeBoolean).findAny()
						.orElse(null);
			}
			return MoDiscoUtil.getJavaLangObject(pg);
		}
		throw new IllegalStateException(NLS.bind(Messages.unhandeledExpression, expression.eClass().getName()));
	}

	/**
	 * Get the variable of the assignment
	 *
	 * @param assignment
	 *            The assign statement
	 * @param pg
	 *            The model containing the assignment
	 * @return The variable
	 */
	private static Type getAssignmentType(final MGravityModel pg, final Assignment assignment) {
		final Expression expression = assignment.getLeftHandSide();
		if (expression instanceof SingleVariableAccess) {
			return getType(pg, ((SingleVariableAccess) expression).getVariable());
		} else if (expression instanceof FieldAccess) {
			return getType(pg, ((FieldAccess) expression).getField().getVariable());
		} else if (expression instanceof ArrayAccess) {
			return getArrayType(pg, (ArrayAccess) expression);
		} else {
			throw new IllegalStateException(NLS.bind(Messages.unknownType, expression.eClass().getName()));
		}
	}

	/**
	 * Gets the type or a possible type of the variable
	 *
	 * @param pg
	 *            The program model containing the variable
	 * @param variable
	 *            The variable
	 * @return The type of the variable
	 */
	private static Type getType(final MGravityModel pg, final VariableDeclaration variable) {
		if (variable instanceof VariableDeclarationFragment) {
			final TypeAccess typeAccess = ((VariableDeclarationFragment) variable).getVariablesContainer().getType();
			if (typeAccess == null) {
				return MoDiscoUtil.getJavaLangObject(pg);
			} else {
				return typeAccess.getType();
			}
		} else {
			throw new IllegalStateException(NLS.bind(Messages.unknownType, variable.eClass().getName()));
		}
	}

	/**
	 * Guesses the type of the accessed array
	 *
	 * @param pg
	 *            The program model containing the array
	 * @param arrayAccess
	 *            The access to the array
	 * @return The type of the array
	 */
	private static Type getArrayType(final MGravityModel pg, final ArrayAccess arrayAccess) {
		final Expression expression = arrayAccess.getArray();
		if (expression instanceof SingleVariableAccess) {
			final VariableDeclaration variable = ((SingleVariableAccess) expression).getVariable();
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
	 * @param statement
	 *            The statement
	 * @return The definition containing the statement
	 */
	private static MDefinition getContainingMethod(final EObject statement) {
		EObject eContainer = statement;
		while (eContainer != null && !(eContainer instanceof MDefinition)) {
			eContainer = eContainer.eContainer();
		}
		return (MDefinition) eContainer;
	}

	@Override
	public Class<MMethodDefinition> getSupportedType() {
		return MMethodDefinition.class;
	}
}
