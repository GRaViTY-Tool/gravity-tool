package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.AbstractTypeQualifiedExpression;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.ArrayAccess;
import org.eclipse.gmt.modisco.java.Assignment;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.CastExpression;
import org.eclipse.gmt.modisco.java.ClassInstanceCreation;
import org.eclipse.gmt.modisco.java.ConditionalExpression;
import org.eclipse.gmt.modisco.java.ConstructorDeclaration;
import org.eclipse.gmt.modisco.java.ConstructorInvocation;
import org.eclipse.gmt.modisco.java.EnumConstantDeclaration;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.FieldAccess;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.InfixExpression;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.ParenthesizedExpression;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.StringLiteral;
import org.eclipse.gmt.modisco.java.SuperConstructorInvocation;
import org.eclipse.gmt.modisco.java.SuperFieldAccess;
import org.eclipse.gmt.modisco.java.SuperMethodInvocation;
import org.eclipse.gmt.modisco.java.ThisExpression;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.TypeLiteral;
import org.eclipse.gmt.modisco.java.UnresolvedItemAccess;
import org.eclipse.gmt.modisco.java.UnresolvedMethodDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodInvocation;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.util.MoDiscoUtil;

/**
 * 
 * A Preprocessor for resolving the static type on an access
 *
 */
public class StaticTypePreprocessing extends AbstractTypedModiscoProcessor<MAbstractMethodDefinition> {

	private static final Logger LOGGER = Logger.getLogger(StaticTypePreprocessing.class);

	private MGravityModel model;

	@Override
	public boolean process(MGravityModel model, Collection<MAbstractMethodDefinition> elements,
			IProgressMonitor monitor) {
		this.model = model;
		List<MAbstractMethodDefinition> failed = elements.parallelStream().filter(definition -> {
			boolean success = addStaticTypeAccesses(definition);
			if (!success) {
				return true;
			}
			return false;
		}).collect(Collectors.toList());
		if (failed.isEmpty()) {
			return true;
		}
		failed.forEach(definition -> LOGGER
				.error("Adding static type accesses failed for definition: " + definition.getName()));
		return false;
	}

	@Override
	public Class<MAbstractMethodDefinition> getSupportedType() {
		return MAbstractMethodDefinition.class;
	}

	/**
	 * adds static invocation types to all accesses in the method
	 * 
	 * @param method The method
	 * @return if the method has been processed sucessfully
	 */
	private boolean addStaticTypeAccesses(MAbstractMethodDefinition method) {
		for (AbstractMethodInvocation methodInvoc : method.getMMethodInvocations()) {
			if (!(methodInvoc instanceof MMethodInvocation)) {
				continue;
			}
			Type type;
			try {
				type = getStaticType(methodInvoc, method);
			} catch (ProcessingException e) {
				LOGGER.log(Level.ERROR, e.getMessage(), e);
				return false;
			}
			if (type == null && !methodInvoc.getMethod().isProxy()) {
				return false;
			}
			((MMethodInvocation) methodInvoc).setMStaticType(type);
		}
		return true;
	}

	/**
	 * Searches the static type of the object used in a method invocation in a
	 * calling method
	 * 
	 * @param methodInvoc The method invocation
	 * @param method      The calling method
	 * @return The static type of the object on which the invoked method is called
	 * @throws ProcessingException
	 */
	private Type getStaticType(AbstractMethodInvocation methodInvoc, MAbstractMethodDefinition method)
			throws ProcessingException {
		Type type = null;
		if (methodInvoc instanceof MethodInvocation) {
			type = getStaticType(((MethodInvocation) methodInvoc).getExpression(), method);
			if (type == null) {
				LOGGER.log(Level.WARN, "Cannot find static type of invocation of \"" + methodInvoc.getMethod()
						+ "\" in " + method.getAbstractTypeDeclaration() + "." + method.getName());
				// If we cannot find the static type assume the declaring type
				type = getDeclaringType(methodInvoc.getMethod());
			}

		} else if (methodInvoc instanceof SuperMethodInvocation) {
			// super method invoc cannot happen with a qualifier other than "this"
			// => static type is always the type that defines this method
			type = getDeclaringType(method);
		} else if (methodInvoc instanceof ClassInstanceCreation) {
			type = getStaticType(((ClassInstanceCreation) methodInvoc).getExpression(), method);
		} else if (methodInvoc instanceof ConstructorInvocation) {
			// ConstructorInvocation : this()
			// => does not have a qualifier
			// => static type is always type that defines this method
			type = method.getAbstractTypeDeclaration();
		} else if (methodInvoc instanceof SuperConstructorInvocation) {
			// seems to never happen?..
			LOGGER.log(Level.ERROR,
					"Method invocates SuperConstructor, this is not handled by StaticTypePreprocessing!");
			throw new ProcessingException(methodInvoc);
		} else {
			LOGGER.log(Level.ERROR, "Unknown invocation type : " + methodInvoc.getClass().getName());
			throw new ProcessingException(methodInvoc);
		}
		return type;
	}

	/**
	 * Tries to resolve the static type of an access to a variable
	 * 
	 * @param expression The variable access expression
	 * @param method     The method containing the access
	 * @return The static type
	 * @throws ProcessingException
	 */
	private Type getStaticType(SingleVariableAccess expression, MAbstractMethodDefinition method)
			throws ProcessingException {
		VariableDeclaration var = expression.getVariable();
		if (var == null) {
			/*
			 * Handling of constructs not supported by MoDisco like:
			 * 
			 * try(Scanner s = new Scanner("")){ ... s.nextInt(); ... }
			 *
			 * Assume static type to be type in which a called method has been defined.
			 */
			EObject container = expression.eContainer();
			if (container instanceof MethodInvocation) {
				return ((MethodInvocation) container).getMethod().getAbstractTypeDeclaration();
			} else {
				throw new ProcessingException("Preprocessing of unknown construct.");
			}
		} else if (var instanceof SingleVariableDeclaration) {
			return ((SingleVariableDeclaration) var).getType().getType();
		} else if (var instanceof VariableDeclarationFragment) {
			AbstractVariablesContainer container = ((VariableDeclarationFragment) var).getVariablesContainer();
			TypeAccess access = container.getType();
			if (access != null) {
				return access.getType();
			}
		} else if (var instanceof EnumConstantDeclaration) {
			return getStaticType(expression.getQualifier(), method);
		} else {
			LOGGER.log(Level.WARN, "Unknown variable declaration: " + var.getClass().getName());
		}
		return getStaticTypeFromInitializer(var.getInitializer());
	}

	/**
	 * Tries to guess the static type of a variable from the initializer
	 * 
	 * @param initializer The expression used as initializer
	 * @return The possible static type of the variable
	 */
	private Type getStaticTypeFromInitializer(Expression initializer) {
		if (initializer != null) {
			if (initializer instanceof MethodInvocation) {
				AbstractMethodDeclaration targetMethod = ((MethodInvocation) initializer).getMethod();
				if (targetMethod instanceof MMethodDefinition) {
					return ((MMethodDefinition) targetMethod).getReturnType().getType();
				}
			}

			if (initializer instanceof ClassInstanceCreation) {
				return ((ClassInstanceCreation) initializer).getType().getType();
			}
			if (initializer instanceof CastExpression) {
				return ((CastExpression) initializer).getType().getType();
			}
		}
		return null;
	}

	/**
	 * Tries to resolve the static type of an access contained in an expression
	 * 
	 * @param expression The expression
	 * @param method     The method containing the access
	 * @return The static type
	 * @throws ProcessingException
	 */
	private Type getStaticType(Expression expression, MAbstractMethodDefinition method) throws ProcessingException {
		if (expression == null) {
			// If the access is not contained in an expression the access is to a direct
			// member of the type declaring the method
			return getDeclaringType(method);
		}
		if (expression instanceof TypeAccess) {
			return ((TypeAccess) expression).getType();
		}
		if (expression instanceof FieldAccess) {
			return getStaticType(((FieldAccess) expression).getExpression(), method);
		}
		if (expression instanceof SingleVariableAccess) {
			return getStaticType((SingleVariableAccess) expression, method);
		}
		if (expression instanceof ParenthesizedExpression) {
			return getStaticType(((ParenthesizedExpression) expression).getExpression(), method);
		}
		if (expression instanceof AbstractTypeQualifiedExpression) {
			return getStaticType((AbstractTypeQualifiedExpression) expression, method);
		}
		if (expression instanceof ClassInstanceCreation) {
			return ((ClassInstanceCreation) expression).getType().getType();
		}
		if (expression instanceof StringLiteral) {
			return MoDiscoUtil.getOrCreateJavaLangString(model);
		}
		if (expression instanceof Assignment) {
			return getStaticType(((Assignment) expression).getLeftHandSide(), method);
		}
		if (expression instanceof CastExpression) {
			return ((CastExpression) expression).getType().getType();
		}
		if (expression instanceof TypeLiteral) {
			return ((TypeLiteral) expression).getType().getType();
		}
		if (expression instanceof AbstractVariablesContainer) {
			return ((AbstractVariablesContainer) expression).getType().getType();
		}
		if (expression instanceof ArrayAccess) {
			return getStaticType(((ArrayAccess) expression).getArray(), method);
		}
		if (expression instanceof InfixExpression) {
			return getStaticType((InfixExpression) expression, method);
		}
		if (expression instanceof ConditionalExpression) {
			return getStaticType(((ConditionalExpression) expression).getExpression(), method);
		}
		if (expression instanceof UnresolvedItemAccess) {
			return getStaticType((UnresolvedItemAccess) expression, method);
		}
		if (expression instanceof AbstractMethodInvocation) {
			AbstractMethodDeclaration calledOn = ((AbstractMethodInvocation) expression).getMethod();
			if (calledOn instanceof MethodDeclaration) {
				TypeAccess returnType = ((MethodDeclaration) calledOn).getReturnType();
				if (returnType == null) {
					if (calledOn instanceof UnresolvedMethodDeclaration) {
						return null;
					}
					throw new ProcessingException();
				}
				return returnType.getType();
			} else if (calledOn instanceof ConstructorDeclaration) {
				return ((ConstructorDeclaration) calledOn).getAbstractTypeDeclaration();
			}
		}
		LOGGER.log(Level.ERROR, "Calculating static types from \"" + expression.getClass().getSimpleName()
				+ "\" expressions is not supported");
		return null;
	}

	/**
	 * Tries to resolve the static call type of an unresolved item access
	 * 
	 * @param expression The access expression
	 * @param method     The method containing the access
	 * @return The static type
	 */
	private Type getStaticType(UnresolvedItemAccess expression, MAbstractMethodDefinition method) {
		String nameOfAccessedElement = expression.getElement().getName();
		// Check if the item is a parameter
		for (SingleVariableDeclaration parameter : method.getParameters()) {
			if (nameOfAccessedElement.equals(parameter.getName())) {
				return parameter.getType().getType();
			}
		}
		// Check is the accessed item is a field
		Type declaringType = getDeclaringType(method);
		if (declaringType instanceof AbstractTypeDeclaration) {
			Type type = searchTypeOfFieldWithName(nameOfAccessedElement, (AbstractTypeDeclaration) declaringType);
			if (type != null) {
				return type;
			}
		}
		LOGGER.log(Level.WARN, "Couldn't resolve the static type of an access to an unresolved item: " + expression);
		return null;
	}

	/**
	 * Searches if a type declares a field with a given name and returns its type
	 * 
	 * @param name The name of the field
	 * @param type The type containing the field
	 * @return The type of the field or null if there is no field with this name
	 */
	private Type searchTypeOfFieldWithName(String name, AbstractTypeDeclaration type) {
		return type.getBodyDeclarations().parallelStream().filter(body -> body instanceof FieldDeclaration)
				.map(body -> (FieldDeclaration) body).filter(field -> {
					return field.getFragments().stream().anyMatch(fragment -> fragment.getName().equals(name));
				}).map(field -> field.getType().getType()).findAny().orElse(null);
	}

	/**
	 * Tries to get the static type of an access contained in an infix expression
	 * 
	 * @param expression The infix expression
	 * @param method     The method containing the access
	 * @return The static type
	 * @throws ProcessingException
	 */
	private Type getStaticType(final InfixExpression expression, MAbstractMethodDefinition method)
			throws ProcessingException {
		Type type = getStaticType(expression.getLeftOperand(), method);
		if (type == null) {
			type = getStaticType(expression.getRightOperand(), method);
		}
		return type;
	}

	/**
	 * Tries to get the static type of an super or this access
	 * 
	 * @param expression The access
	 * @param method     The method containing the access
	 * @return The static type
	 * @throws ProcessingException If the expression is not supported
	 */
	private Type getStaticType(AbstractTypeQualifiedExpression expression, MAbstractMethodDefinition method)
			throws ProcessingException {
		TypeAccess qualifier = expression.getQualifier();
		if (qualifier == null) {
			if (expression instanceof ThisExpression) {
				return getDeclaringType(method);
			}
			if (expression instanceof SuperMethodInvocation) {
				return getDeclaringType(((SuperMethodInvocation) expression).getMethod());
			}
			if (expression instanceof SuperFieldAccess) {
				// Dirty hack for super.field access in libs
				return (Type) ((MDefinition) ((SuperFieldAccess) expression).getField().getVariable().eContainer())
						.eContainer();
			}
			throw new ProcessingException("Not suported expression: " + expression.eClass().getName());
		}
		return qualifier.getType();
	}

	/**
	 * Searches the type declaring this method definition
	 * 
	 * @param body The method definition
	 * @return the declaring type
	 */
	private Type getDeclaringType(BodyDeclaration body) {
		Type type = body.getAbstractTypeDeclaration();
		if (type == null) {
			final EObject container = body.eContainer();
			if (container instanceof AnonymousClassDeclaration) {
				type = getDeclaringType((AnonymousClassDeclaration) container);
			} else if (container instanceof AbstractTypeDeclaration) {
				type = (AbstractTypeDeclaration) container;
			} else {
				LOGGER.log(Level.ERROR, "Unknown deklaring type of: " + body);
			}
		}
		return type;
	}

	/**
	 * Searches the type declaring this anonymous class
	 * 
	 * @param anon The anonymous class
	 * @return the declaring type
	 */
	private Type getDeclaringType(AnonymousClassDeclaration anon) {
		EObject container = anon.eContainer();
		if (container instanceof ClassInstanceCreation) {
			ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) container;
			TypeAccess typeAccess = classInstanceCreation.getType();
			if (typeAccess == null) {
				LOGGER.log(Level.ERROR, "Class instance has not type: " + classInstanceCreation);
				return null;
			}
			return typeAccess.getType();
		} else if (container instanceof EnumConstantDeclaration) {
			EnumConstantDeclaration enumConst = (EnumConstantDeclaration) container;
			return enumConst.getAbstractTypeDeclaration();
		}
		LOGGER.log(Level.ERROR, "Unknown container of anon class: " + container.eClass().getName());
		return null;
	}
}
