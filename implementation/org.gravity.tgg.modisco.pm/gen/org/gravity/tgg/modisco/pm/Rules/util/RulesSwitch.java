/**
 */
package org.gravity.tgg.modisco.pm.Rules.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.tgg.modisco.pm.Rules.AbstractAnnotationTypeAccess;
import org.gravity.tgg.modisco.pm.Rules.AbstractMethodDefinition;
import org.gravity.tgg.modisco.pm.Rules.AbstractMethodInvocation;
import org.gravity.tgg.modisco.pm.Rules.Annotation;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberKey;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValue;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueAnnotation;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueAnnotationArray;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueArray;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueBoolean;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueBooleanArray;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueClass;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueClassArray;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueNumber;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueNumberArray;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueString;
import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueStringArray;
import org.gravity.tgg.modisco.pm.Rules.AnnotationOnBodyDeclaration;
import org.gravity.tgg.modisco.pm.Rules.AnnotationType;
import org.gravity.tgg.modisco.pm.Rules.AnnotationTypeAccessOnAnnotation;
import org.gravity.tgg.modisco.pm.Rules.AnnotationTypeAccessOnBodyDecl;
import org.gravity.tgg.modisco.pm.Rules.AnnotationTypeAccessOnSelf;
import org.gravity.tgg.modisco.pm.Rules.AnnotationTypeInAnonymous;
import org.gravity.tgg.modisco.pm.Rules.AnnotationTypeNested;
import org.gravity.tgg.modisco.pm.Rules.AnonymousClass;
import org.gravity.tgg.modisco.pm.Rules.AnonymousClassInAnonymous;
import org.gravity.tgg.modisco.pm.Rules.AnonymousClassInType;
import org.gravity.tgg.modisco.pm.Rules.AnonymousClassType;
import org.gravity.tgg.modisco.pm.Rules.AnonymousClassTypeClass;
import org.gravity.tgg.modisco.pm.Rules.AnonymousClassTypeInterface;
import org.gravity.tgg.modisco.pm.Rules.ArrayInitializerIgnoreExpressionsEdge;
import org.gravity.tgg.modisco.pm.Rules.ArrayTypeToClass;
import org.gravity.tgg.modisco.pm.Rules.ClassExtendsClass;
import org.gravity.tgg.modisco.pm.Rules.ClassImplementsInterface;
import org.gravity.tgg.modisco.pm.Rules.ClassInAnonymous;
import org.gravity.tgg.modisco.pm.Rules.ClassInnerAnonClassMember;
import org.gravity.tgg.modisco.pm.Rules.ClassInnerClassMember;
import org.gravity.tgg.modisco.pm.Rules.ClassInnerMember;
import org.gravity.tgg.modisco.pm.Rules.ClassInstanceCreation;
import org.gravity.tgg.modisco.pm.Rules.ConstructorDefinition;
import org.gravity.tgg.modisco.pm.Rules.ConstructorInvocation;
import org.gravity.tgg.modisco.pm.Rules.DataFlowIn;
import org.gravity.tgg.modisco.pm.Rules.DataFlowOut;
import org.gravity.tgg.modisco.pm.Rules.EnumInAnonymous;
import org.gravity.tgg.modisco.pm.Rules.FieldAccess;
import org.gravity.tgg.modisco.pm.Rules.FieldAccessRead;
import org.gravity.tgg.modisco.pm.Rules.FieldAccessReadWrite;
import org.gravity.tgg.modisco.pm.Rules.FieldAccessWrite;
import org.gravity.tgg.modisco.pm.Rules.FieldDefinition;
import org.gravity.tgg.modisco.pm.Rules.FieldName;
import org.gravity.tgg.modisco.pm.Rules.FieldSignature;
import org.gravity.tgg.modisco.pm.Rules.FieldSignatureAbstract;
import org.gravity.tgg.modisco.pm.Rules.FieldSignatureArrayType;
import org.gravity.tgg.modisco.pm.Rules.FlowNode;
import org.gravity.tgg.modisco.pm.Rules.Initializer;
import org.gravity.tgg.modisco.pm.Rules.InitializerInAnonymous;
import org.gravity.tgg.modisco.pm.Rules.InitializerInType;
import org.gravity.tgg.modisco.pm.Rules.Interface;
import org.gravity.tgg.modisco.pm.Rules.InterfaceExtendsInterface;
import org.gravity.tgg.modisco.pm.Rules.InterfaceInAnonymous;
import org.gravity.tgg.modisco.pm.Rules.InterfaceMember;
import org.gravity.tgg.modisco.pm.Rules.LinkDefinitionToAnonymous;
import org.gravity.tgg.modisco.pm.Rules.LinkDefinitionToType;
import org.gravity.tgg.modisco.pm.Rules.MemberInAnnotationVisibility;
import org.gravity.tgg.modisco.pm.Rules.MemberInClassVisibility;
import org.gravity.tgg.modisco.pm.Rules.MemberInEnumVisibility;
import org.gravity.tgg.modisco.pm.Rules.MethodDefinition;
import org.gravity.tgg.modisco.pm.Rules.MethodDefinitionReturnArray;
import org.gravity.tgg.modisco.pm.Rules.MethodDefinitionReturnSingle;
import org.gravity.tgg.modisco.pm.Rules.MethodInvocation;
import org.gravity.tgg.modisco.pm.Rules.MethodInvocationStaticType;
import org.gravity.tgg.modisco.pm.Rules.MethodInvocationTarget;
import org.gravity.tgg.modisco.pm.Rules.MethodInvocationTargetRecursive;
import org.gravity.tgg.modisco.pm.Rules.MethodName;
import org.gravity.tgg.modisco.pm.Rules.MethodOverriding;
import org.gravity.tgg.modisco.pm.Rules.MethodParameter;
import org.gravity.tgg.modisco.pm.Rules.MethodParameterArrayType;
import org.gravity.tgg.modisco.pm.Rules.MethodParameterLink;
import org.gravity.tgg.modisco.pm.Rules.MethodParameterLinkFirst;
import org.gravity.tgg.modisco.pm.Rules.MethodParameterSingleType;
import org.gravity.tgg.modisco.pm.Rules.MethodSignature;
import org.gravity.tgg.modisco.pm.Rules.MethodSignatureArrayReturn;
import org.gravity.tgg.modisco.pm.Rules.MethodSignatureSingleReturn;
import org.gravity.tgg.modisco.pm.Rules.ModelToPg;
import org.gravity.tgg.modisco.pm.Rules.NestedClassInType;
import org.gravity.tgg.modisco.pm.Rules.NestedEnum;
import org.gravity.tgg.modisco.pm.Rules.NestedInterfaceInType;
import org.gravity.tgg.modisco.pm.Rules.NestedTypes;
import org.gravity.tgg.modisco.pm.Rules.NestedTypesInAnonymous;
import org.gravity.tgg.modisco.pm.Rules.PackageToPGPackage;
import org.gravity.tgg.modisco.pm.Rules.ParameterizedTypeToClass;
import org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsBoolean;
import org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsByte;
import org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsChar;
import org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsDouble;
import org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsFloat;
import org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsInt;
import org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsLong;
import org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsShort;
import org.gravity.tgg.modisco.pm.Rules.PrimitiveTypesIsVoid;
import org.gravity.tgg.modisco.pm.Rules.PrimitiveTypesToClass;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.SubPackageToPGPackage;
import org.gravity.tgg.modisco.pm.Rules.SuperConstructorInvocation;
import org.gravity.tgg.modisco.pm.Rules.SuperMethodInvocation;
import org.gravity.tgg.modisco.pm.Rules.SyntethicMethod;
import org.gravity.tgg.modisco.pm.Rules.TextAnnotations;
import org.gravity.tgg.modisco.pm.Rules.TypeParameter;
import org.gravity.tgg.modisco.pm.Rules.Types;
import org.gravity.tgg.modisco.pm.Rules.TypesOrphaned;
import org.gravity.tgg.modisco.pm.Rules.TypesVisibility;
import org.gravity.tgg.modisco.pm.Rules.UnresolvedMethodDeclaration;
import org.gravity.tgg.modisco.pm.Rules.UnresolvedTypeDeclaration;
import org.gravity.tgg.modisco.pm.Rules.VariableDeclarationFragment;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.pm.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RulesPackage.TYPES_ORPHANED: {
			TypesOrphaned typesOrphaned = (TypesOrphaned) theEObject;
			T result = caseTypesOrphaned(typesOrphaned);
			if (result == null)
				result = caseAbstractRule(typesOrphaned);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CONSTRUCTOR_DEFINITION: {
			ConstructorDefinition constructorDefinition = (ConstructorDefinition) theEObject;
			T result = caseConstructorDefinition(constructorDefinition);
			if (result == null)
				result = caseAbstractRule(constructorDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_INVOCATION_TARGET: {
			MethodInvocationTarget methodInvocationTarget = (MethodInvocationTarget) theEObject;
			T result = caseMethodInvocationTarget(methodInvocationTarget);
			if (result == null)
				result = caseAbstractRule(methodInvocationTarget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY: {
			AnnotationMemberValueBooleanArray annotationMemberValueBooleanArray = (AnnotationMemberValueBooleanArray) theEObject;
			T result = caseAnnotationMemberValueBooleanArray(annotationMemberValueBooleanArray);
			if (result == null)
				result = caseAbstractRule(annotationMemberValueBooleanArray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION: {
			AnnotationMemberValueAnnotation annotationMemberValueAnnotation = (AnnotationMemberValueAnnotation) theEObject;
			T result = caseAnnotationMemberValueAnnotation(annotationMemberValueAnnotation);
			if (result == null)
				result = caseAbstractRule(annotationMemberValueAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS: {
			org.gravity.tgg.modisco.pm.Rules.Class class_ = (org.gravity.tgg.modisco.pm.Rules.Class) theEObject;
			T result = caseClass(class_);
			if (result == null)
				result = caseAbstractRule(class_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTERFACE_MEMBER: {
			InterfaceMember interfaceMember = (InterfaceMember) theEObject;
			T result = caseInterfaceMember(interfaceMember);
			if (result == null)
				result = caseAbstractRule(interfaceMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.MEMBER_IN_ENUM_VISIBILITY: {
			MemberInEnumVisibility memberInEnumVisibility = (MemberInEnumVisibility) theEObject;
			T result = caseMemberInEnumVisibility(memberInEnumVisibility);
			if (result == null)
				result = caseAbstractRule(memberInEnumVisibility);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN: {
			MethodSignatureArrayReturn methodSignatureArrayReturn = (MethodSignatureArrayReturn) theEObject;
			T result = caseMethodSignatureArrayReturn(methodSignatureArrayReturn);
			if (result == null)
				result = caseAbstractRule(methodSignatureArrayReturn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY: {
			AnnotationMemberValueClassArray annotationMemberValueClassArray = (AnnotationMemberValueClassArray) theEObject;
			T result = caseAnnotationMemberValueClassArray(annotationMemberValueClassArray);
			if (result == null)
				result = caseAbstractRule(annotationMemberValueClassArray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_SIGNATURE: {
			FieldSignature fieldSignature = (FieldSignature) theEObject;
			T result = caseFieldSignature(fieldSignature);
			if (result == null)
				result = caseAbstractRule(fieldSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.MODEL_TO_PG: {
			ModelToPg modelToPg = (ModelToPg) theEObject;
			T result = caseModelToPg(modelToPg);
			if (result == null)
				result = caseAbstractRule(modelToPg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS: {
			LinkDefinitionToAnonymous linkDefinitionToAnonymous = (LinkDefinitionToAnonymous) theEObject;
			T result = caseLinkDefinitionToAnonymous(linkDefinitionToAnonymous);
			if (result == null)
				result = caseAbstractRule(linkDefinitionToAnonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST: {
			MethodParameterLinkFirst methodParameterLinkFirst = (MethodParameterLinkFirst) theEObject;
			T result = caseMethodParameterLinkFirst(methodParameterLinkFirst);
			if (result == null)
				result = caseAbstractRule(methodParameterLinkFirst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTERFACE: {
			Interface interface_ = (Interface) theEObject;
			T result = caseInterface(interface_);
			if (result == null)
				result = caseAbstractRule(interface_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPES: {
			Types types = (Types) theEObject;
			T result = caseTypes(types);
			if (result == null)
				result = caseAbstractRule(types);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY: {
			AnnotationMemberValueNumberArray annotationMemberValueNumberArray = (AnnotationMemberValueNumberArray) theEObject;
			T result = caseAnnotationMemberValueNumberArray(annotationMemberValueNumberArray);
			if (result == null)
				result = caseAbstractRule(annotationMemberValueNumberArray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPE_PARAMETER: {
			TypeParameter typeParameter = (TypeParameter) theEObject;
			T result = caseTypeParameter(typeParameter);
			if (result == null)
				result = caseAbstractRule(typeParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE: {
			InterfaceExtendsInterface interfaceExtendsInterface = (InterfaceExtendsInterface) theEObject;
			T result = caseInterfaceExtendsInterface(interfaceExtendsInterface);
			if (result == null)
				result = caseAbstractRule(interfaceExtendsInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DATA_FLOW_IN: {
			DataFlowIn dataFlowIn = (DataFlowIn) theEObject;
			T result = caseDataFlowIn(dataFlowIn);
			if (result == null)
				result = caseAbstractRule(dataFlowIn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS: {
			AnonymousClassTypeClass anonymousClassTypeClass = (AnonymousClassTypeClass) theEObject;
			T result = caseAnonymousClassTypeClass(anonymousClassTypeClass);
			if (result == null)
				result = caseAbstractRule(anonymousClassTypeClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INITIALIZER_IN_ANONYMOUS: {
			InitializerInAnonymous initializerInAnonymous = (InitializerInAnonymous) theEObject;
			T result = caseInitializerInAnonymous(initializerInAnonymous);
			if (result == null)
				result = caseAbstractRule(initializerInAnonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN: {
			AnnotationMemberValueBoolean annotationMemberValueBoolean = (AnnotationMemberValueBoolean) theEObject;
			T result = caseAnnotationMemberValueBoolean(annotationMemberValueBoolean);
			if (result == null)
				result = caseAbstractRule(annotationMemberValueBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NESTED_ENUM: {
			NestedEnum nestedEnum = (NestedEnum) theEObject;
			T result = caseNestedEnum(nestedEnum);
			if (result == null)
				result = caseAbstractRule(nestedEnum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS: {
			AnonymousClass anonymousClass = (AnonymousClass) theEObject;
			T result = caseAnonymousClass(anonymousClass);
			if (result == null)
				result = caseAbstractRule(anonymousClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE: {
			MethodParameterSingleType methodParameterSingleType = (MethodParameterSingleType) theEObject;
			T result = caseMethodParameterSingleType(methodParameterSingleType);
			if (result == null)
				result = caseAbstractRule(methodParameterSingleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_TYPE_IN_ANONYMOUS: {
			AnnotationTypeInAnonymous annotationTypeInAnonymous = (AnnotationTypeInAnonymous) theEObject;
			T result = caseAnnotationTypeInAnonymous(annotationTypeInAnonymous);
			if (result == null)
				result = caseAbstractRule(annotationTypeInAnonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_CHAR: {
			PrimitiveTypeIsChar primitiveTypeIsChar = (PrimitiveTypeIsChar) theEObject;
			T result = casePrimitiveTypeIsChar(primitiveTypeIsChar);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsChar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INITIALIZER: {
			Initializer initializer = (Initializer) theEObject;
			T result = caseInitializer(initializer);
			if (result == null)
				result = caseAbstractRule(initializer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS_IN_TYPE: {
			AnonymousClassInType anonymousClassInType = (AnonymousClassInType) theEObject;
			T result = caseAnonymousClassInType(anonymousClassInType);
			if (result == null)
				result = caseAbstractRule(anonymousClassInType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION: {
			SuperConstructorInvocation superConstructorInvocation = (SuperConstructorInvocation) theEObject;
			T result = caseSuperConstructorInvocation(superConstructorInvocation);
			if (result == null)
				result = caseAbstractRule(superConstructorInvocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ABSTRACT_ANNOTATION_TYPE_ACCESS: {
			AbstractAnnotationTypeAccess abstractAnnotationTypeAccess = (AbstractAnnotationTypeAccess) theEObject;
			T result = caseAbstractAnnotationTypeAccess(abstractAnnotationTypeAccess);
			if (result == null)
				result = caseAbstractRule(abstractAnnotationTypeAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY: {
			AnnotationMemberValueStringArray annotationMemberValueStringArray = (AnnotationMemberValueStringArray) theEObject;
			T result = caseAnnotationMemberValueStringArray(annotationMemberValueStringArray);
			if (result == null)
				result = caseAbstractRule(annotationMemberValueStringArray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS: {
			ParameterizedTypeToClass parameterizedTypeToClass = (ParameterizedTypeToClass) theEObject;
			T result = caseParameterizedTypeToClass(parameterizedTypeToClass);
			if (result == null)
				result = caseAbstractRule(parameterizedTypeToClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TEXT_ANNOTATIONS: {
			TextAnnotations textAnnotations = (TextAnnotations) theEObject;
			T result = caseTextAnnotations(textAnnotations);
			if (result == null)
				result = caseAbstractRule(textAnnotations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SUPER_METHOD_INVOCATION: {
			SuperMethodInvocation superMethodInvocation = (SuperMethodInvocation) theEObject;
			T result = caseSuperMethodInvocation(superMethodInvocation);
			if (result == null)
				result = caseAbstractRule(superMethodInvocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION: {
			AnnotationOnBodyDeclaration annotationOnBodyDeclaration = (AnnotationOnBodyDeclaration) theEObject;
			T result = caseAnnotationOnBodyDeclaration(annotationOnBodyDeclaration);
			if (result == null)
				result = caseAbstractRule(annotationOnBodyDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_INSTANCE_CREATION: {
			ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) theEObject;
			T result = caseClassInstanceCreation(classInstanceCreation);
			if (result == null)
				result = caseAbstractRule(classInstanceCreation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_TYPE: {
			AnnotationType annotationType = (AnnotationType) theEObject;
			T result = caseAnnotationType(annotationType);
			if (result == null)
				result = caseAbstractRule(annotationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_VALUE_ARRAY: {
			AnnotationMemberValueArray annotationMemberValueArray = (AnnotationMemberValueArray) theEObject;
			T result = caseAnnotationMemberValueArray(annotationMemberValueArray);
			if (result == null)
				result = caseAbstractRule(annotationMemberValueArray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_DOUBLE: {
			PrimitiveTypeIsDouble primitiveTypeIsDouble = (PrimitiveTypeIsDouble) theEObject;
			T result = casePrimitiveTypeIsDouble(primitiveTypeIsDouble);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsDouble);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_PARAMETER: {
			MethodParameter methodParameter = (MethodParameter) theEObject;
			T result = caseMethodParameter(methodParameter);
			if (result == null)
				result = caseAbstractRule(methodParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPES_IS_VOID: {
			PrimitiveTypesIsVoid primitiveTypesIsVoid = (PrimitiveTypesIsVoid) theEObject;
			T result = casePrimitiveTypesIsVoid(primitiveTypesIsVoid);
			if (result == null)
				result = caseAbstractRule(primitiveTypesIsVoid);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT: {
			VariableDeclarationFragment variableDeclarationFragment = (VariableDeclarationFragment) theEObject;
			T result = caseVariableDeclarationFragment(variableDeclarationFragment);
			if (result == null)
				result = caseAbstractRule(variableDeclarationFragment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_IN_ANONYMOUS: {
			ClassInAnonymous classInAnonymous = (ClassInAnonymous) theEObject;
			T result = caseClassInAnonymous(classInAnonymous);
			if (result == null)
				result = caseAbstractRule(classInAnonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN: {
			MethodSignatureSingleReturn methodSignatureSingleReturn = (MethodSignatureSingleReturn) theEObject;
			T result = caseMethodSignatureSingleReturn(methodSignatureSingleReturn);
			if (result == null)
				result = caseAbstractRule(methodSignatureSingleReturn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_ACCESS: {
			FieldAccess fieldAccess = (FieldAccess) theEObject;
			T result = caseFieldAccess(fieldAccess);
			if (result == null)
				result = caseAbstractRule(fieldAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_SHORT: {
			PrimitiveTypeIsShort primitiveTypeIsShort = (PrimitiveTypeIsShort) theEObject;
			T result = casePrimitiveTypeIsShort(primitiveTypeIsShort);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsShort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_BODY_DECL: {
			AnnotationTypeAccessOnBodyDecl annotationTypeAccessOnBodyDecl = (AnnotationTypeAccessOnBodyDecl) theEObject;
			T result = caseAnnotationTypeAccessOnBodyDecl(annotationTypeAccessOnBodyDecl);
			if (result == null)
				result = caseAbstractRule(annotationTypeAccessOnBodyDecl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ARRAY_TYPE_TO_CLASS: {
			ArrayTypeToClass arrayTypeToClass = (ArrayTypeToClass) theEObject;
			T result = caseArrayTypeToClass(arrayTypeToClass);
			if (result == null)
				result = caseAbstractRule(arrayTypeToClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION: {
			Annotation annotation = (Annotation) theEObject;
			T result = caseAnnotation(annotation);
			if (result == null)
				result = caseAbstractRule(annotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_INVOCATION: {
			MethodInvocation methodInvocation = (MethodInvocation) theEObject;
			T result = caseMethodInvocation(methodInvocation);
			if (result == null)
				result = caseAbstractRule(methodInvocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS: {
			AnnotationMemberValueClass annotationMemberValueClass = (AnnotationMemberValueClass) theEObject;
			T result = caseAnnotationMemberValueClass(annotationMemberValueClass);
			if (result == null)
				result = caseAbstractRule(annotationMemberValueClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INITIALIZER_IN_TYPE: {
			InitializerInType initializerInType = (InitializerInType) theEObject;
			T result = caseInitializerInType(initializerInType);
			if (result == null)
				result = caseAbstractRule(initializerInType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE: {
			MethodInvocationTargetRecursive methodInvocationTargetRecursive = (MethodInvocationTargetRecursive) theEObject;
			T result = caseMethodInvocationTargetRecursive(methodInvocationTargetRecursive);
			if (result == null)
				result = caseAbstractRule(methodInvocationTargetRecursive);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PACKAGE_TO_PG_PACKAGE: {
			PackageToPGPackage packageToPGPackage = (PackageToPGPackage) theEObject;
			T result = casePackageToPGPackage(packageToPGPackage);
			if (result == null)
				result = caseAbstractRule(packageToPGPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_FLOAT: {
			PrimitiveTypeIsFloat primitiveTypeIsFloat = (PrimitiveTypeIsFloat) theEObject;
			T result = casePrimitiveTypeIsFloat(primitiveTypeIsFloat);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsFloat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_NAME: {
			FieldName fieldName = (FieldName) theEObject;
			T result = caseFieldName(fieldName);
			if (result == null)
				result = caseAbstractRule(fieldName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY: {
			MemberInAnnotationVisibility memberInAnnotationVisibility = (MemberInAnnotationVisibility) theEObject;
			T result = caseMemberInAnnotationVisibility(memberInAnnotationVisibility);
			if (result == null)
				result = caseAbstractRule(memberInAnnotationVisibility);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_TYPE_NESTED: {
			AnnotationTypeNested annotationTypeNested = (AnnotationTypeNested) theEObject;
			T result = caseAnnotationTypeNested(annotationTypeNested);
			if (result == null)
				result = caseAbstractRule(annotationTypeNested);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_DEFINITION: {
			MethodDefinition methodDefinition = (MethodDefinition) theEObject;
			T result = caseMethodDefinition(methodDefinition);
			if (result == null)
				result = caseAbstractRule(methodDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FLOW_NODE: {
			FlowNode flowNode = (FlowNode) theEObject;
			T result = caseFlowNode(flowNode);
			if (result == null)
				result = caseAbstractRule(flowNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_LONG: {
			PrimitiveTypeIsLong primitiveTypeIsLong = (PrimitiveTypeIsLong) theEObject;
			T result = casePrimitiveTypeIsLong(primitiveTypeIsLong);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsLong);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ABSTRACT_METHOD_INVOCATION: {
			AbstractMethodInvocation abstractMethodInvocation = (AbstractMethodInvocation) theEObject;
			T result = caseAbstractMethodInvocation(abstractMethodInvocation);
			if (result == null)
				result = caseAbstractRule(abstractMethodInvocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ABSTRACT_METHOD_DEFINITION: {
			AbstractMethodDefinition abstractMethodDefinition = (AbstractMethodDefinition) theEObject;
			T result = caseAbstractMethodDefinition(abstractMethodDefinition);
			if (result == null)
				result = caseAbstractRule(abstractMethodDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE: {
			SubPackageToPGPackage subPackageToPGPackage = (SubPackageToPGPackage) theEObject;
			T result = caseSubPackageToPGPackage(subPackageToPGPackage);
			if (result == null)
				result = caseAbstractRule(subPackageToPGPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY: {
			AnnotationMemberValueAnnotationArray annotationMemberValueAnnotationArray = (AnnotationMemberValueAnnotationArray) theEObject;
			T result = caseAnnotationMemberValueAnnotationArray(annotationMemberValueAnnotationArray);
			if (result == null)
				result = caseAbstractRule(annotationMemberValueAnnotationArray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER: {
			ClassInnerAnonClassMember classInnerAnonClassMember = (ClassInnerAnonClassMember) theEObject;
			T result = caseClassInnerAnonClassMember(classInnerAnonClassMember);
			if (result == null)
				result = caseAbstractRule(classInnerAnonClassMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN: {
			PrimitiveTypeIsBoolean primitiveTypeIsBoolean = (PrimitiveTypeIsBoolean) theEObject;
			T result = casePrimitiveTypeIsBoolean(primitiveTypeIsBoolean);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_INNER_MEMBER: {
			ClassInnerMember classInnerMember = (ClassInnerMember) theEObject;
			T result = caseClassInnerMember(classInnerMember);
			if (result == null)
				result = caseAbstractRule(classInnerMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NESTED_TYPES_IN_ANONYMOUS: {
			NestedTypesInAnonymous nestedTypesInAnonymous = (NestedTypesInAnonymous) theEObject;
			T result = caseNestedTypesInAnonymous(nestedTypesInAnonymous);
			if (result == null)
				result = caseAbstractRule(nestedTypesInAnonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE: {
			ClassImplementsInterface classImplementsInterface = (ClassImplementsInterface) theEObject;
			T result = caseClassImplementsInterface(classImplementsInterface);
			if (result == null)
				result = caseAbstractRule(classImplementsInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_INT: {
			PrimitiveTypeIsInt primitiveTypeIsInt = (PrimitiveTypeIsInt) theEObject;
			T result = casePrimitiveTypeIsInt(primitiveTypeIsInt);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsInt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY: {
			MemberInClassVisibility memberInClassVisibility = (MemberInClassVisibility) theEObject;
			T result = caseMemberInClassVisibility(memberInClassVisibility);
			if (result == null)
				result = caseAbstractRule(memberInClassVisibility);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_KEY: {
			AnnotationMemberKey annotationMemberKey = (AnnotationMemberKey) theEObject;
			T result = caseAnnotationMemberKey(annotationMemberKey);
			if (result == null)
				result = caseAbstractRule(annotationMemberKey);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_INNER_CLASS_MEMBER: {
			ClassInnerClassMember classInnerClassMember = (ClassInnerClassMember) theEObject;
			T result = caseClassInnerClassMember(classInnerClassMember);
			if (result == null)
				result = caseAbstractRule(classInnerClassMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE: {
			AnonymousClassTypeInterface anonymousClassTypeInterface = (AnonymousClassTypeInterface) theEObject;
			T result = caseAnonymousClassTypeInterface(anonymousClassTypeInterface);
			if (result == null)
				result = caseAbstractRule(anonymousClassTypeInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_PARAMETER_LINK: {
			MethodParameterLink methodParameterLink = (MethodParameterLink) theEObject;
			T result = caseMethodParameterLink(methodParameterLink);
			if (result == null)
				result = caseAbstractRule(methodParameterLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS_TYPE: {
			AnonymousClassType anonymousClassType = (AnonymousClassType) theEObject;
			T result = caseAnonymousClassType(anonymousClassType);
			if (result == null)
				result = caseAbstractRule(anonymousClassType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NESTED_TYPES: {
			NestedTypes nestedTypes = (NestedTypes) theEObject;
			T result = caseNestedTypes(nestedTypes);
			if (result == null)
				result = caseAbstractRule(nestedTypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION: {
			AnnotationTypeAccessOnAnnotation annotationTypeAccessOnAnnotation = (AnnotationTypeAccessOnAnnotation) theEObject;
			T result = caseAnnotationTypeAccessOnAnnotation(annotationTypeAccessOnAnnotation);
			if (result == null)
				result = caseAbstractRule(annotationTypeAccessOnAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_SELF: {
			AnnotationTypeAccessOnSelf annotationTypeAccessOnSelf = (AnnotationTypeAccessOnSelf) theEObject;
			T result = caseAnnotationTypeAccessOnSelf(annotationTypeAccessOnSelf);
			if (result == null)
				result = caseAbstractRule(annotationTypeAccessOnSelf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_ACCESS_READ: {
			FieldAccessRead fieldAccessRead = (FieldAccessRead) theEObject;
			T result = caseFieldAccessRead(fieldAccessRead);
			if (result == null)
				result = caseAbstractRule(fieldAccessRead);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION: {
			UnresolvedMethodDeclaration unresolvedMethodDeclaration = (UnresolvedMethodDeclaration) theEObject;
			T result = caseUnresolvedMethodDeclaration(unresolvedMethodDeclaration);
			if (result == null)
				result = caseAbstractRule(unresolvedMethodDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE: {
			FieldSignatureArrayType fieldSignatureArrayType = (FieldSignatureArrayType) theEObject;
			T result = caseFieldSignatureArrayType(fieldSignatureArrayType);
			if (result == null)
				result = caseAbstractRule(fieldSignatureArrayType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER: {
			AnnotationMemberValueNumber annotationMemberValueNumber = (AnnotationMemberValueNumber) theEObject;
			T result = caseAnnotationMemberValueNumber(annotationMemberValueNumber);
			if (result == null)
				result = caseAbstractRule(annotationMemberValueNumber);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_DEFINITION: {
			FieldDefinition fieldDefinition = (FieldDefinition) theEObject;
			T result = caseFieldDefinition(fieldDefinition);
			if (result == null)
				result = caseAbstractRule(fieldDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ENUM_IN_ANONYMOUS: {
			EnumInAnonymous enumInAnonymous = (EnumInAnonymous) theEObject;
			T result = caseEnumInAnonymous(enumInAnonymous);
			if (result == null)
				result = caseAbstractRule(enumInAnonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS_IN_ANONYMOUS: {
			AnonymousClassInAnonymous anonymousClassInAnonymous = (AnonymousClassInAnonymous) theEObject;
			T result = caseAnonymousClassInAnonymous(anonymousClassInAnonymous);
			if (result == null)
				result = caseAbstractRule(anonymousClassInAnonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SYNTETHIC_METHOD: {
			SyntethicMethod syntethicMethod = (SyntethicMethod) theEObject;
			T result = caseSyntethicMethod(syntethicMethod);
			if (result == null)
				result = caseAbstractRule(syntethicMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LINK_DEFINITION_TO_TYPE: {
			LinkDefinitionToType linkDefinitionToType = (LinkDefinitionToType) theEObject;
			T result = caseLinkDefinitionToType(linkDefinitionToType);
			if (result == null)
				result = caseAbstractRule(linkDefinitionToType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPES_VISIBILITY: {
			TypesVisibility typesVisibility = (TypesVisibility) theEObject;
			T result = caseTypesVisibility(typesVisibility);
			if (result == null)
				result = caseAbstractRule(typesVisibility);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY: {
			MethodDefinitionReturnArray methodDefinitionReturnArray = (MethodDefinitionReturnArray) theEObject;
			T result = caseMethodDefinitionReturnArray(methodDefinitionReturnArray);
			if (result == null)
				result = caseAbstractRule(methodDefinitionReturnArray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ENUM: {
			org.gravity.tgg.modisco.pm.Rules.Enum enum_ = (org.gravity.tgg.modisco.pm.Rules.Enum) theEObject;
			T result = caseEnum(enum_);
			if (result == null)
				result = caseAbstractRule(enum_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_SIGNATURE: {
			MethodSignature methodSignature = (MethodSignature) theEObject;
			T result = caseMethodSignature(methodSignature);
			if (result == null)
				result = caseAbstractRule(methodSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTERFACE_IN_ANONYMOUS: {
			InterfaceInAnonymous interfaceInAnonymous = (InterfaceInAnonymous) theEObject;
			T result = caseInterfaceInAnonymous(interfaceInAnonymous);
			if (result == null)
				result = caseAbstractRule(interfaceInAnonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DATA_FLOW_OUT: {
			DataFlowOut dataFlowOut = (DataFlowOut) theEObject;
			T result = caseDataFlowOut(dataFlowOut);
			if (result == null)
				result = caseAbstractRule(dataFlowOut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPES_TO_CLASS: {
			PrimitiveTypesToClass primitiveTypesToClass = (PrimitiveTypesToClass) theEObject;
			T result = casePrimitiveTypesToClass(primitiveTypesToClass);
			if (result == null)
				result = caseAbstractRule(primitiveTypesToClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_NAME: {
			MethodName methodName = (MethodName) theEObject;
			T result = caseMethodName(methodName);
			if (result == null)
				result = caseAbstractRule(methodName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_PARAMETER_ARRAY_TYPE: {
			MethodParameterArrayType methodParameterArrayType = (MethodParameterArrayType) theEObject;
			T result = caseMethodParameterArrayType(methodParameterArrayType);
			if (result == null)
				result = caseAbstractRule(methodParameterArrayType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NESTED_INTERFACE_IN_TYPE: {
			NestedInterfaceInType nestedInterfaceInType = (NestedInterfaceInType) theEObject;
			T result = caseNestedInterfaceInType(nestedInterfaceInType);
			if (result == null)
				result = caseAbstractRule(nestedInterfaceInType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CONSTRUCTOR_INVOCATION: {
			ConstructorInvocation constructorInvocation = (ConstructorInvocation) theEObject;
			T result = caseConstructorInvocation(constructorInvocation);
			if (result == null)
				result = caseAbstractRule(constructorInvocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION: {
			UnresolvedTypeDeclaration unresolvedTypeDeclaration = (UnresolvedTypeDeclaration) theEObject;
			T result = caseUnresolvedTypeDeclaration(unresolvedTypeDeclaration);
			if (result == null)
				result = caseAbstractRule(unresolvedTypeDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_VALUE: {
			AnnotationMemberValue annotationMemberValue = (AnnotationMemberValue) theEObject;
			T result = caseAnnotationMemberValue(annotationMemberValue);
			if (result == null)
				result = caseAbstractRule(annotationMemberValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_ACCESS_WRITE: {
			FieldAccessWrite fieldAccessWrite = (FieldAccessWrite) theEObject;
			T result = caseFieldAccessWrite(fieldAccessWrite);
			if (result == null)
				result = caseAbstractRule(fieldAccessWrite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_EXTENDS_CLASS: {
			ClassExtendsClass classExtendsClass = (ClassExtendsClass) theEObject;
			T result = caseClassExtendsClass(classExtendsClass);
			if (result == null)
				result = caseAbstractRule(classExtendsClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE: {
			MethodDefinitionReturnSingle methodDefinitionReturnSingle = (MethodDefinitionReturnSingle) theEObject;
			T result = caseMethodDefinitionReturnSingle(methodDefinitionReturnSingle);
			if (result == null)
				result = caseAbstractRule(methodDefinitionReturnSingle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE: {
			ArrayInitializerIgnoreExpressionsEdge arrayInitializerIgnoreExpressionsEdge = (ArrayInitializerIgnoreExpressionsEdge) theEObject;
			T result = caseArrayInitializerIgnoreExpressionsEdge(arrayInitializerIgnoreExpressionsEdge);
			if (result == null)
				result = caseAbstractRule(arrayInitializerIgnoreExpressionsEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NESTED_CLASS_IN_TYPE: {
			NestedClassInType nestedClassInType = (NestedClassInType) theEObject;
			T result = caseNestedClassInType(nestedClassInType);
			if (result == null)
				result = caseAbstractRule(nestedClassInType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_ACCESS_READ_WRITE: {
			FieldAccessReadWrite fieldAccessReadWrite = (FieldAccessReadWrite) theEObject;
			T result = caseFieldAccessReadWrite(fieldAccessReadWrite);
			if (result == null)
				result = caseAbstractRule(fieldAccessReadWrite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_SIGNATURE_ABSTRACT: {
			FieldSignatureAbstract fieldSignatureAbstract = (FieldSignatureAbstract) theEObject;
			T result = caseFieldSignatureAbstract(fieldSignatureAbstract);
			if (result == null)
				result = caseAbstractRule(fieldSignatureAbstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_OVERRIDING: {
			MethodOverriding methodOverriding = (MethodOverriding) theEObject;
			T result = caseMethodOverriding(methodOverriding);
			if (result == null)
				result = caseAbstractRule(methodOverriding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE: {
			PrimitiveTypeIsByte primitiveTypeIsByte = (PrimitiveTypeIsByte) theEObject;
			T result = casePrimitiveTypeIsByte(primitiveTypeIsByte);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsByte);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING: {
			AnnotationMemberValueString annotationMemberValueString = (AnnotationMemberValueString) theEObject;
			T result = caseAnnotationMemberValueString(annotationMemberValueString);
			if (result == null)
				result = caseAbstractRule(annotationMemberValueString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE: {
			MethodInvocationStaticType methodInvocationStaticType = (MethodInvocationStaticType) theEObject;
			T result = caseMethodInvocationStaticType(methodInvocationStaticType);
			if (result == null)
				result = caseAbstractRule(methodInvocationStaticType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types Orphaned</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types Orphaned</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypesOrphaned(TypesOrphaned object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorDefinition(ConstructorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocationTarget(MethodInvocationTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Boolean Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Boolean Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueBooleanArray(AnnotationMemberValueBooleanArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueAnnotation(AnnotationMemberValueAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.gravity.tgg.modisco.pm.Rules.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceMember(InterfaceMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member In Enum Visibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member In Enum Visibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberInEnumVisibility(MemberInEnumVisibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Signature Array Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Signature Array Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodSignatureArrayReturn(MethodSignatureArrayReturn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Class Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Class Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueClassArray(AnnotationMemberValueClassArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldSignature(FieldSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model To Pg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model To Pg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelToPg(ModelToPg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Definition To Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Definition To Anonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkDefinitionToAnonymous(LinkDefinitionToAnonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter Link First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter Link First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameterLinkFirst(MethodParameterLinkFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypes(Types object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Number Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Number Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueNumberArray(AnnotationMemberValueNumberArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter(TypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Extends Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Extends Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceExtendsInterface(InterfaceExtendsInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlowIn(DataFlowIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassTypeClass(AnonymousClassTypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initializer In Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initializer In Anonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializerInAnonymous(InitializerInAnonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueBoolean(AnnotationMemberValueBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedEnum(NestedEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClass(AnonymousClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter Single Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter Single Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameterSingleType(MethodParameterSingleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type In Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type In Anonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeInAnonymous(AnnotationTypeInAnonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsChar(PrimitiveTypeIsChar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializer(Initializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class In Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class In Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassInType(AnonymousClassInType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Constructor Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Constructor Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperConstructorInvocation(SuperConstructorInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Annotation Type Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Annotation Type Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAnnotationTypeAccess(AbstractAnnotationTypeAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value String Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value String Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueStringArray(AnnotationMemberValueStringArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type To Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type To Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedTypeToClass(ParameterizedTypeToClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAnnotations(TextAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperMethodInvocation(SuperMethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation On Body Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation On Body Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationOnBodyDeclaration(AnnotationOnBodyDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Instance Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Instance Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInstanceCreation(ClassInstanceCreation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationType(AnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueArray(AnnotationMemberValueArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsDouble(PrimitiveTypeIsDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameter(MethodParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Types Is Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Types Is Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypesIsVoid(PrimitiveTypesIsVoid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationFragment(VariableDeclarationFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class In Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class In Anonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInAnonymous(ClassInAnonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Signature Single Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Signature Single Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodSignatureSingleReturn(MethodSignatureSingleReturn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccess(FieldAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsShort(PrimitiveTypeIsShort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Access On Body Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Access On Body Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeAccessOnBodyDecl(AnnotationTypeAccessOnBodyDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type To Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type To Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayTypeToClass(ArrayTypeToClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocation(MethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueClass(AnnotationMemberValueClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initializer In Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initializer In Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializerInType(InitializerInType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation Target Recursive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation Target Recursive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocationTargetRecursive(MethodInvocationTargetRecursive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package To PG Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package To PG Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageToPGPackage(PackageToPGPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsFloat(PrimitiveTypeIsFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldName(FieldName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member In Annotation Visibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member In Annotation Visibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberInAnnotationVisibility(MemberInAnnotationVisibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Nested</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Nested</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeNested(AnnotationTypeNested object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDefinition(MethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowNode(FlowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsLong(PrimitiveTypeIsLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodInvocation(AbstractMethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodDefinition(AbstractMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Package To PG Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Package To PG Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPackageToPGPackage(SubPackageToPGPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Annotation Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Annotation Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueAnnotationArray(AnnotationMemberValueAnnotationArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Inner Anon Class Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Inner Anon Class Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInnerAnonClassMember(ClassInnerAnonClassMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsBoolean(PrimitiveTypeIsBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Inner Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Inner Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInnerMember(ClassInnerMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Types In Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Types In Anonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedTypesInAnonymous(NestedTypesInAnonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Implements Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Implements Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassImplementsInterface(ClassImplementsInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsInt(PrimitiveTypeIsInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member In Class Visibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member In Class Visibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberInClassVisibility(MemberInClassVisibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberKey(AnnotationMemberKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Inner Class Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Inner Class Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInnerClassMember(ClassInnerClassMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Type Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Type Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassTypeInterface(AnonymousClassTypeInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameterLink(MethodParameterLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassType(AnonymousClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedTypes(NestedTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Access On Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Access On Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeAccessOnAnnotation(AnnotationTypeAccessOnAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Access On Self</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Access On Self</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeAccessOnSelf(AnnotationTypeAccessOnSelf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccessRead(FieldAccessRead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedMethodDeclaration(UnresolvedMethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Signature Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Signature Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldSignatureArrayType(FieldSignatureArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueNumber(AnnotationMemberValueNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDefinition(FieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum In Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum In Anonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumInAnonymous(EnumInAnonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class In Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class In Anonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassInAnonymous(AnonymousClassInAnonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syntethic Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syntethic Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyntethicMethod(SyntethicMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Definition To Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Definition To Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkDefinitionToType(LinkDefinitionToType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types Visibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types Visibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypesVisibility(TypesVisibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Definition Return Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Definition Return Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDefinitionReturnArray(MethodDefinitionReturnArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(org.gravity.tgg.modisco.pm.Rules.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodSignature(MethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface In Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface In Anonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceInAnonymous(InterfaceInAnonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlowOut(DataFlowOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Types To Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Types To Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypesToClass(PrimitiveTypesToClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodName(MethodName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameterArrayType(MethodParameterArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Interface In Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Interface In Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedInterfaceInType(NestedInterfaceInType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorInvocation(ConstructorInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedTypeDeclaration(UnresolvedTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValue(AnnotationMemberValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access Write</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccessWrite(FieldAccessWrite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Extends Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Extends Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassExtendsClass(ClassExtendsClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Definition Return Single</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Definition Return Single</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDefinitionReturnSingle(MethodDefinitionReturnSingle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Initializer Ignore Expressions Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Initializer Ignore Expressions Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInitializerIgnoreExpressionsEdge(ArrayInitializerIgnoreExpressionsEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Class In Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Class In Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedClassInType(NestedClassInType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access Read Write</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access Read Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccessReadWrite(FieldAccessReadWrite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Signature Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Signature Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldSignatureAbstract(FieldSignatureAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Overriding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Overriding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodOverriding(MethodOverriding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsByte(PrimitiveTypeIsByte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueString(AnnotationMemberValueString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation Static Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation Static Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocationStaticType(MethodInvocationStaticType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
