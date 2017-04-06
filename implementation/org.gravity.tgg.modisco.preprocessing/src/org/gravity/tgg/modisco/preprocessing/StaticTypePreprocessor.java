package org.gravity.tgg.modisco.preprocessing;

import java.util.HashSet;

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
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.NullLiteral;
import org.eclipse.gmt.modisco.java.NumberLiteral;
import org.eclipse.gmt.modisco.java.ParenthesizedExpression;
import org.eclipse.gmt.modisco.java.PostfixExpression;
import org.eclipse.gmt.modisco.java.PrefixExpression;
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
	
	
	public Type getStaticType(MGravityModel model, AbstractMethodInvocation methodInvoc, MAbstractMethodDefinition method, StaticTypePreprocessor eval){
		Expression exp = null;
		Type type = null;
		if(methodInvoc instanceof MethodInvocation){
			exp = ((MethodInvocation)methodInvoc).getExpression();
		}else if(methodInvoc instanceof SuperMethodInvocation){
			//super method invoc cannot happen with a qualifier => static type is always the type that defines this method
			exp = null;
			
		}else if(methodInvoc instanceof ClassInstanceCreation){
			exp = ((ClassInstanceCreation)methodInvoc).getExpression();
		}else if(methodInvoc instanceof ConstructorInvocation){
			//seems to never happen?..
			throw new RuntimeException("Method invocates Constructor, this is not handled by StaticTypePreprocessing!");
		}else if(methodInvoc instanceof SuperConstructorInvocation){
			//seems to never happen?..
			throw new RuntimeException("Method invocates SuperConstructor, this is not handled by StaticTypePreprocessing!");
		}
		if(exp == null || exp instanceof ThisExpression
				|| (exp instanceof MethodInvocation 
				&& ((MethodInvocation)exp).getExpression() instanceof ThisExpression)){
			type = method.getAbstractTypeDeclaration();
			int i = 0;
			i++;
		}else{
			type = eval.getStaticType(exp, method);
		}
		
		if(type == null){
			throw new RuntimeException("Could not calculate the Type of methodinvocation, this is not supposed to happen!");
		}
		return type;
	}
	
	public Type getStaticType(MGravityModel model, SingleVariableAccess access, MAbstractMethodDefinition method, StaticTypePreprocessor eval){
		Type type = null;
		Expression qualifier = access.getQualifier();
		if(qualifier == null){
			type = method.getAbstractTypeDeclaration();
		}else{
			type = eval.getStaticType(qualifier, method);
		}
		
		if(type == null){
			int i =0;
			i++;
		}
		return type;
	}
	
	public void addStaticTypeAccesses(MGravityModel model, MAbstractMethodDefinition method ,StaticTypePreprocessor eval){
		for(AbstractMethodInvocation methodInvoc : method.getAbstractMethodInvocations()){
			Type type = getStaticType(model, methodInvoc, method, eval);
			MethodInvocationStaticType invocStatic = ModiscoFactory.eINSTANCE.createMethodInvocationStaticType();
			invocStatic.setType(type);
			invocStatic.setMethodInvoc(methodInvoc);
			method.getInvocationStaticType().add(invocStatic);
		}
		
		for(SingleVariableAccess fieldAccess : method.getMAbstractFieldAccess()){
			Type type = getStaticType(model, fieldAccess, method, eval);
			FieldAccessStaticType invocStatic = ModiscoFactory.eINSTANCE.createFieldAccessStaticType();
			invocStatic.setType(type);
			invocStatic.setFieldAccess(fieldAccess);
			method.getAccessStaticType().add(invocStatic);
		}
	}
	
	public void addStaticTypeAccesses(MGravityModel model ){
		HashSet<Class> expressionTypes = new HashSet<Class>();
		StaticTypePreprocessor eval = new StaticTypePreprocessor();
		for(MMethodDefinition method: model.getMMethodDefinitions()){
			addStaticTypeAccesses(model, method, eval);
		}
		
		for (MConstructorDefinition ctor:model.getMConstructorDefinitions()){
			addStaticTypeAccesses(model, ctor, eval);
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
			return container.getType().getType();
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
			return null;
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
					
		return null;
	}

	
	
				
	
}
