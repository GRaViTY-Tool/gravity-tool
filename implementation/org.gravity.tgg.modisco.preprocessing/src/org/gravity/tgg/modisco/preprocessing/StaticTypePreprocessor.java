package org.gravity.tgg.modisco.preprocessing;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.ClassInstanceCreation;
import org.eclipse.gmt.modisco.java.ConditionalExpression;
import org.eclipse.gmt.modisco.java.ConstructorInvocation;
import org.eclipse.gmt.modisco.java.EnumConstantDeclaration;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.FieldAccess;
import org.eclipse.gmt.modisco.java.InfixExpression;
import org.eclipse.gmt.modisco.java.InstanceofExpression;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.NullLiteral;
import org.eclipse.gmt.modisco.java.NumberLiteral;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.ParenthesizedExpression;
import org.eclipse.gmt.modisco.java.PostfixExpression;
import org.eclipse.gmt.modisco.java.PrefixExpression;
import org.eclipse.gmt.modisco.java.ReturnStatement;
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
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationExpression;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.VariableDeclarationStatement;
import org.eclipse.gmt.modisco.java.emf.impl.FieldAccessImpl;
import org.eclipse.gmt.modisco.java.emf.impl.MethodInvocationImpl;
import org.eclipse.gmt.modisco.java.emf.impl.SingleVariableAccessImpl;
import org.gravity.modisco.FieldAccessStaticType;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MethodInvocationStaticType;
import org.gravity.modisco.ModiscoFactory;
public class StaticTypePreprocessor {
	MGravityModel model;
	
	
	public StaticTypePreprocessor(MGravityModel model) {
		this.model = model;
	}
	
	private Type getStaticType(AbstractMethodInvocation methodInvoc, MAbstractMethodDefinition method){
		Expression exp = null;
		Type type = null;
		if(methodInvoc instanceof MethodInvocation){
			exp = ((MethodInvocation)methodInvoc).getExpression();
		}else if(methodInvoc instanceof SuperMethodInvocation){	
			//super method invoc cannot happen with a qualifier other than "this"
			//=> static type is always the type that defines this method
			exp = null;
			
		}else if(methodInvoc instanceof ClassInstanceCreation){
			exp = ((ClassInstanceCreation)methodInvoc).getExpression();
		}else if(methodInvoc instanceof ConstructorInvocation){
			//ConstructorInvocation : this()
			//=> does not have a qualifier
			//=> static type is always type that defines this method
			exp = null;
		}else if(methodInvoc instanceof SuperConstructorInvocation){
			//seems to never happen?..
			throw new RuntimeException("Method invocates SuperConstructor, this is not handled by StaticTypePreprocessing!");
		}
		if(exp == null){
			type = method.getAbstractTypeDeclaration();
		}else{
			type = getStaticType(exp, method);
		}
		
		if(type == null){
			
			throw new RuntimeException("Could not calculate the Type of methodinvocation, this is not supposed to happen!");
		}
		return type;
	}
	
	private Type getStaticType(SingleVariableAccess access, MAbstractMethodDefinition method){
		Type type = null;
		Expression qualifier = access.getQualifier();
		if(qualifier == null){
			type = method.getAbstractTypeDeclaration();
		}else{
			type = getStaticType(qualifier, method);
		}
		
		if(type == null){
			throw new RuntimeException("Could not calculate the Type of SingleVariableAccess, this is not supposed to happen!");
		}
		return type;
	}
	
	private void addStaticTypeAccesses(MAbstractMethodDefinition method ){
		for(AbstractMethodInvocation methodInvoc : method.getAbstractMethodInvocations()){
			Type type = getStaticType(methodInvoc, method);
			MethodInvocationStaticType invocStatic = ModiscoFactory.eINSTANCE.createMethodInvocationStaticType();
			invocStatic.setType(type);
			invocStatic.setMethodInvoc(methodInvoc);
			method.getInvocationStaticType().add(invocStatic);
		}
	}
	
	public void addStaticTypeAccesses(){
		for(MMethodDefinition method: model.getMMethodDefinitions()){
			addStaticTypeAccesses(method);
		}
		
		for (MConstructorDefinition ctor:model.getMConstructorDefinitions()){
			addStaticTypeAccesses(ctor);
		}
	}
	
	
	public Type getFieldAccessType(FieldAccess access, MAbstractMethodDefinition method){
		if(((FieldAccess)access).getField() != null){
			return getStaticType(((FieldAccess)access).getField(), method);
		}
		return getStaticType(((FieldAccess)access).getExpression(), method);
	}
	
	public Type getMethodInvocType(MethodInvocation methodInvoc, MAbstractMethodDefinition model){
		AbstractMethodDeclaration aMethod = methodInvoc.getMethod();
		if(aMethod instanceof MMethodDefinition){
			return ((MMethodDefinition)aMethod).getReturnType().getType();
		}
		
		Expression exp = methodInvoc.getExpression();
		if(exp instanceof MethodInvocation){
			AbstractMethodDeclaration method = ((MethodInvocation)exp).getMethod();
			if(method instanceof MMethodDefinition){
				return ((MMethodDefinition)method).getReturnType().getType();
			}
		}
		return getStaticType(((MethodInvocation)methodInvoc).getExpression(), model);
	}
	
	private Type getSingleVarAccessType(SingleVariableAccess expression, MAbstractMethodDefinition method) {
		VariableDeclaration var = ((SingleVariableAccess)expression).getVariable();
		Expression init = var.getInitializer();
		
		
		if(var instanceof SingleVariableDeclaration){
			return ((SingleVariableDeclaration)var).getType().getType();
		}
		
		if(init != null){
			if(init instanceof MethodInvocation){
				AbstractMethodDeclaration targetMethod = ((MethodInvocation)init).getMethod();
				if(targetMethod instanceof MMethodDefinition){
					return ((MMethodDefinition)targetMethod).getReturnType().getType();
				}
			}
			
			if(init instanceof ClassInstanceCreation){
				return ((ClassInstanceCreation)init).getType().getType();
			}
			if(init instanceof CastExpression){
				return ((CastExpression)init).getType().getType();
			}
		}
		
		if(var instanceof VariableDeclarationFragment){
			AbstractVariablesContainer container = ((VariableDeclarationFragment)var).getVariablesContainer();
			TypeAccess access = container.getType();
			if(access != null){
				return access.getType();
			}
		}
		
		if(var instanceof EnumConstantDeclaration){
			return getStaticType(expression.getQualifier(), method);
		}

		return null;
	}
	
	public Type getTypeOfStringClass(){
		ArrayList<ClassDeclaration> classes = Util.getAllClasses(model,true);
		for(ClassDeclaration classDecl: classes){
			if(classDecl.getName().equals( "String")){
				Package langPackage = classDecl.getPackage();
				if(langPackage != null && langPackage.getName().equals("lang")){
					Package javaPackage = langPackage.getPackage();
					if(javaPackage != null && javaPackage.getName().equals("java")){
						return classDecl;
					}
				}	
			}
		}
		return null;
	}
	
	
	public Type getStaticType(Expression expression, MAbstractMethodDefinition method){
		if(expression instanceof FieldAccess){
			return getFieldAccessType((FieldAccess) expression, method);
		}

		if(expression instanceof MethodInvocation){
			return getMethodInvocType((MethodInvocation) expression, method);
		}
		if(expression instanceof SingleVariableAccess){
			return getSingleVarAccessType((SingleVariableAccess) expression, method);
		}
		if(expression instanceof TypeAccess){
			return ((TypeAccess)expression).getType();
		}
		
		if(expression instanceof ParenthesizedExpression){
			return getStaticType(((ParenthesizedExpression)expression).getExpression(), method);
		}
		if(expression instanceof ThisExpression){
			return method.getAbstractTypeDeclaration();
		}
		if(expression instanceof ClassInstanceCreation){
			return ((ClassInstanceCreation)expression).getType().getType();
		}
		if(expression instanceof SuperMethodInvocation){
			return null;
		}

		if(expression instanceof StringLiteral){
			return getTypeOfStringClass();
		}
		if(expression instanceof Assignment){
			return getStaticType(((Assignment)expression).getLeftHandSide(), method);
		}
	
		if(expression instanceof CastExpression){
			return ((CastExpression)expression).getType().getType();
		}
		
		if(expression instanceof TypeLiteral){
			return ((TypeLiteral)expression).getType().getType();
		}
					
		if(expression instanceof VariableDeclarationExpression){
			return ((VariableDeclarationExpression)expression).getType().getType();
		}
					

		if(expression instanceof SuperFieldAccess){
			return ((SuperFieldAccess)expression).getQualifier().getType();
		}
		if(expression instanceof ArrayAccess){
			return getStaticType(((ArrayAccess)expression).getArray(),method);
		}
					
		return null;
	}

	
	
				
	
}
