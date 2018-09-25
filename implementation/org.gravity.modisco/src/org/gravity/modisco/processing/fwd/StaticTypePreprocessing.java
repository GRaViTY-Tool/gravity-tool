package org.gravity.modisco.processing.fwd;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.ArrayAccess;
import org.eclipse.gmt.modisco.java.Assignment;
import org.eclipse.gmt.modisco.java.CastExpression;
import org.eclipse.gmt.modisco.java.ClassInstanceCreation;
import org.eclipse.gmt.modisco.java.ConstructorInvocation;
import org.eclipse.gmt.modisco.java.EnumConstantDeclaration;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.FieldAccess;
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
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationExpression;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MethodInvocationStaticType;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.processing.IMoDiscoProcessor;
import org.gravity.modisco.util.MoDiscoUtil;

/**
 *  
 * A Preprocessor for resolving the static type on an access
 *
 */
public class StaticTypePreprocessing implements IMoDiscoProcessor {

	private static final Logger LOGGER = Logger.getLogger(StaticTypePreprocessing.class);
	
	private MGravityModel model;

	@Override
	public boolean process(MGravityModel model, IProgressMonitor monitor) {
		this.model = model;
		for(MAbstractMethodDefinition definition : model.getMAbstractMethodDefinitions()) {
			if(!addStaticTypeAccesses(definition)) {
				return false;
			}
		}
		return true;
	}

	private Type getStaticType(AbstractMethodInvocation methodInvoc, MAbstractMethodDefinition method) {
		Expression exp = null;
		Type type = null;
		if (methodInvoc instanceof MethodInvocation) {
			exp = ((MethodInvocation) methodInvoc).getExpression();
		} else if (methodInvoc instanceof SuperMethodInvocation) {
			// super method invoc cannot happen with a qualifier other than "this"
			// => static type is always the type that defines this method
			exp = null;

		} else if (methodInvoc instanceof ClassInstanceCreation) {
			exp = ((ClassInstanceCreation) methodInvoc).getExpression();
		} else if (methodInvoc instanceof ConstructorInvocation) {
			// ConstructorInvocation : this()
			// => does not have a qualifier
			// => static type is always type that defines this method
			exp = null;
		} else if (methodInvoc instanceof SuperConstructorInvocation) {
			// seems to never happen?..
			LOGGER.log(Level.ERROR,	"Method invocates SuperConstructor, this is not handled by StaticTypePreprocessing!");
			return null;
		}
		if (exp == null) {
			type = method.getAbstractTypeDeclaration();
		} else {
			type = getStaticType(exp, method);
		}
		return type;
	}

	private boolean addStaticTypeAccesses(MAbstractMethodDefinition method) {
		for (AbstractMethodInvocation methodInvoc : method.getAbstractMethodInvocations()) {
			Type type = getStaticType(methodInvoc, method);
			if(type == null) {
				return false;
			}
			MethodInvocationStaticType invocStatic = ModiscoFactory.eINSTANCE.createMethodInvocationStaticType();
			invocStatic.setType(type);
			invocStatic.setMethodInvoc(methodInvoc);
			method.getInvocationStaticType().add(invocStatic);
		}
		return true;
	}

	private Type getMethodInvocType(MethodInvocation methodInvoc, MAbstractMethodDefinition model) {
		AbstractMethodDeclaration aMethod = methodInvoc.getMethod();
		if (aMethod instanceof MMethodDefinition) {
			return ((MMethodDefinition) aMethod).getReturnType().getType();
		}

		Expression exp = methodInvoc.getExpression();
		if (exp instanceof MethodInvocation) {
			AbstractMethodDeclaration method = ((MethodInvocation) exp).getMethod();
			if (method instanceof MMethodDefinition) {
				return ((MMethodDefinition) method).getReturnType().getType();
			}
		}
		return getStaticType(((MethodInvocation) methodInvoc).getExpression(), model);
	}

	private Type getSingleVarAccessType(SingleVariableAccess expression, MAbstractMethodDefinition method) {
		VariableDeclaration var = ((SingleVariableAccess) expression).getVariable();
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
				throw new RuntimeException("Preprocessing of unknown construct.");
			}
		}
		Expression init = var.getInitializer();

		if (var instanceof SingleVariableDeclaration) {
			return ((SingleVariableDeclaration) var).getType().getType();
		}

		if (init != null) {
			if (init instanceof MethodInvocation) {
				AbstractMethodDeclaration targetMethod = ((MethodInvocation) init).getMethod();
				if (targetMethod instanceof MMethodDefinition) {
					return ((MMethodDefinition) targetMethod).getReturnType().getType();
				}
			}

			if (init instanceof ClassInstanceCreation) {
				return ((ClassInstanceCreation) init).getType().getType();
			}
			if (init instanceof CastExpression) {
				return ((CastExpression) init).getType().getType();
			}
		}

		if (var instanceof VariableDeclarationFragment) {
			AbstractVariablesContainer container = ((VariableDeclarationFragment) var).getVariablesContainer();
			TypeAccess access = container.getType();
			if (access != null) {
				return access.getType();
			}
		}

		if (var instanceof EnumConstantDeclaration) {
			return getStaticType(expression.getQualifier(), method);
		}

		return null;
	}

	private Type getStaticType(Expression expression, MAbstractMethodDefinition method) {
		if (expression instanceof FieldAccess) {
			return getStaticType(((FieldAccess) expression).getExpression(), method);
		}
		if (expression instanceof MethodInvocation) {
			return getMethodInvocType((MethodInvocation) expression, method);
		}
		if (expression instanceof SingleVariableAccess) {
			return getSingleVarAccessType((SingleVariableAccess) expression, method);
		}
		if (expression instanceof TypeAccess) {
			return ((TypeAccess) expression).getType();
		}
		if (expression instanceof ParenthesizedExpression) {
			return getStaticType(((ParenthesizedExpression) expression).getExpression(), method);
		}
		if (expression instanceof ThisExpression) {
			return method.getAbstractTypeDeclaration();
		}
		if (expression instanceof ClassInstanceCreation) {
			return ((ClassInstanceCreation) expression).getType().getType();
		}
		if (expression instanceof SuperMethodInvocation) {
			return null;
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

		if (expression instanceof VariableDeclarationExpression) {
			return ((VariableDeclarationExpression) expression).getType().getType();
		}

		if (expression instanceof SuperFieldAccess) {
			TypeAccess qualifier = ((SuperFieldAccess) expression).getQualifier();
			if (qualifier == null) {
				//Dirty hack for super.field access in libs
				return (Type) ((MFieldDefinition)((SuperFieldAccess) expression).getField().getVariable().eContainer()).eContainer();
			}
			return qualifier.getType();
		}
		if (expression instanceof ArrayAccess) {
			return getStaticType(((ArrayAccess) expression).getArray(), method);
		}

		return null;
	}
}
