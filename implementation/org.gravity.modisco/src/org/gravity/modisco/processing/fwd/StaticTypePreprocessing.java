package org.gravity.modisco.processing.fwd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
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
import org.eclipse.gmt.modisco.java.Package;
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
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MethodInvocationStaticType;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.util.MoDiscoUtil;

public class StaticTypePreprocessor {

	MGravityModel model;

	public StaticTypePreprocessor(MGravityModel model) {
		this.model = model;
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
			throw new RuntimeException(
					"Method invocates SuperConstructor, this is not handled by StaticTypePreprocessing!");
		}
		if (exp == null) {
			type = method.getAbstractTypeDeclaration();
		} else {
			type = getStaticType(exp, method);
		}
		return type;
	}

	private Type getStaticType(SingleVariableAccess access, MAbstractMethodDefinition method) {
		Type type = null;
		Expression qualifier = access.getQualifier();
		if (qualifier == null) {
			type = method.getAbstractTypeDeclaration();
		} else {
			type = getStaticType(qualifier, method);
		}

		if (type == null) {
			throw new RuntimeException(
					"Could not calculate the Type of SingleVariableAccess, this is not supposed to happen!");
		}
		return type;
	}

	void addStaticTypeAccesses(MAbstractMethodDefinition method) {
		for (AbstractMethodInvocation methodInvoc : method.getAbstractMethodInvocations()) {
			Type type = getStaticType(methodInvoc, method);
			MethodInvocationStaticType invocStatic = ModiscoFactory.eINSTANCE.createMethodInvocationStaticType();
			invocStatic.setType(type);
			invocStatic.setMethodInvoc(methodInvoc);
			method.getInvocationStaticType().add(invocStatic);
		}
	}

	public void addStaticTypeAccesses() {
		for (MMethodDefinition method : model.getMMethodDefinitions()) {
			addStaticTypeAccesses(method);
		}

		for (MConstructorDefinition ctor : model.getMConstructorDefinitions()) {
			addStaticTypeAccesses(ctor);
		}
	}

	public Type getFieldAccessType(FieldAccess access, MAbstractMethodDefinition method) {
		/*
		 * if(((FieldAccess)access).getField() != null){ return
		 * getStaticType(((FieldAccess)access).getField(), method); }
		 */
		return getStaticType(((FieldAccess) access).getExpression(), method);
	}

	public Type getMethodInvocType(MethodInvocation methodInvoc, MAbstractMethodDefinition model) {
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

	public Type getStaticType(Expression expression, MAbstractMethodDefinition method) {
		if (expression instanceof FieldAccess) {
			return getFieldAccessType((FieldAccess) expression, method);
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
			return getOrCreateJavaLangString();
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

	/**
	 * Searches for the type "java.lang.Sting" and returns it.
	 * If there is no such type in the model, it is created and returned.
	 * 
	 * @return The Type representing "java.lang.String"
	 */
	private Type getOrCreateJavaLangString() {
		AbstractTypeDeclaration string = MoDiscoUtil.getType(model, "java.lang.String");
		if(string == null) {
			string = JavaFactory.eINSTANCE.createClassDeclaration();
			string.setName("String");
			Package lang = MoDiscoUtil.getPackage(model, new String[] {"java", "lang"});
			if(lang == null) {
				Package java = MoDiscoUtil.getPackage(model, new String[] {"java"});
				if(java == null) {
					java = JavaFactory.eINSTANCE.createPackage();
					java.setName("java");
					model.getOwnedElements().add(java);
				}
				lang = JavaFactory.eINSTANCE.createPackage();
				lang.setName("lang");
				java.getOwnedPackages().add(java);
			}
			lang.getOwnedElements().add(string);
		}
		return string;
	}

}
