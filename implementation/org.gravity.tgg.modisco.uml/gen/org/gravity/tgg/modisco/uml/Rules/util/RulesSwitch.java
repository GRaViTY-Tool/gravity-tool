/**
 */
package org.gravity.tgg.modisco.uml.Rules.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.tgg.modisco.uml.Rules.*;

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
 * @see org.gravity.tgg.modisco.uml.Rules.RulesPackage
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
		case RulesPackage.ANONYMOUS_CLASS4_ABSTRACT: {
			AnonymousClass4_Abstract anonymousClass4_Abstract = (AnonymousClass4_Abstract) theEObject;
			T result = caseAnonymousClass4_Abstract(anonymousClass4_Abstract);
			if (result == null)
				result = caseAbstractRule(anonymousClass4_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE: {
			ArrayType2NonArrayType arrayType2NonArrayType = (ArrayType2NonArrayType) theEObject;
			T result = caseArrayType2NonArrayType(arrayType2NonArrayType);
			if (result == null)
				result = caseAbstractRule(arrayType2NonArrayType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.VARIABLE_DEC2_PARAMETER4: {
			VariableDec2Parameter4 variableDec2Parameter4 = (VariableDec2Parameter4) theEObject;
			T result = caseVariableDec2Parameter4(variableDec2Parameter4);
			if (result == null)
				result = caseAbstractRule(variableDec2Parameter4);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ENUM_DEC2_ENUM: {
			EnumDec2Enum enumDec2Enum = (EnumDec2Enum) theEObject;
			T result = caseEnumDec2Enum(enumDec2Enum);
			if (result == null)
				result = caseAbstractRule(enumDec2Enum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_DEC_WITH_MODIFIER2_CLASS: {
			ClassDecWithModifier2Class classDecWithModifier2Class = (ClassDecWithModifier2Class) theEObject;
			T result = caseClassDecWithModifier2Class(classDecWithModifier2Class);
			if (result == null)
				result = caseAbstractRule(classDecWithModifier2Class);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE: {
			JavaPackageToUMLPackage_underPackage javaPackageToUMLPackage_underPackage = (JavaPackageToUMLPackage_underPackage) theEObject;
			T result = caseJavaPackageToUMLPackage_underPackage(javaPackageToUMLPackage_underPackage);
			if (result == null)
				result = caseAbstractRule(javaPackageToUMLPackage_underPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_CLASS: {
			InnerDeclaration2InnerClassifier_InClass innerDeclaration2InnerClassifier_InClass = (InnerDeclaration2InnerClassifier_InClass) theEObject;
			T result = caseInnerDeclaration2InnerClassifier_InClass(innerDeclaration2InnerClassifier_InClass);
			if (result == null)
				result = caseAbstractRule(innerDeclaration2InnerClassifier_InClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_INTERFACE: {
			InnerDeclaration2InnerClassifier_InInterface innerDeclaration2InnerClassifier_InInterface = (InnerDeclaration2InnerClassifier_InInterface) theEObject;
			T result = caseInnerDeclaration2InnerClassifier_InInterface(innerDeclaration2InnerClassifier_InInterface);
			if (result == null)
				result = caseAbstractRule(innerDeclaration2InnerClassifier_InInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD_ABSTRACT: {
			InnerDeclaration2InnerClassifier_InMethod_Abstract innerDeclaration2InnerClassifier_InMethod_Abstract = (InnerDeclaration2InnerClassifier_InMethod_Abstract) theEObject;
			T result = caseInnerDeclaration2InnerClassifier_InMethod_Abstract(
					innerDeclaration2InnerClassifier_InMethod_Abstract);
			if (result == null)
				result = caseAbstractRule(innerDeclaration2InnerClassifier_InMethod_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT: {
			Manifestation4CompilationUnit2Artifact manifestation4CompilationUnit2Artifact = (Manifestation4CompilationUnit2Artifact) theEObject;
			T result = caseManifestation4CompilationUnit2Artifact(manifestation4CompilationUnit2Artifact);
			if (result == null)
				result = caseAbstractRule(manifestation4CompilationUnit2Artifact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION: {
			ConstructorDec2Operation constructorDec2Operation = (ConstructorDec2Operation) theEObject;
			T result = caseConstructorDec2Operation(constructorDec2Operation);
			if (result == null)
				result = caseAbstractRule(constructorDec2Operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM: {
			InnerDeclaration2InnerClassifier_InEnum innerDeclaration2InnerClassifier_InEnum = (InnerDeclaration2InnerClassifier_InEnum) theEObject;
			T result = caseInnerDeclaration2InnerClassifier_InEnum(innerDeclaration2InnerClassifier_InEnum);
			if (result == null)
				result = caseAbstractRule(innerDeclaration2InnerClassifier_InEnum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ORPHANDED_PRIMITIVE2_PRIMITIVE_TYPE: {
			OrphandedPrimitive2PrimitiveType orphandedPrimitive2PrimitiveType = (OrphandedPrimitive2PrimitiveType) theEObject;
			T result = caseOrphandedPrimitive2PrimitiveType(orphandedPrimitive2PrimitiveType);
			if (result == null)
				result = caseAbstractRule(orphandedPrimitive2PrimitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_PACKAGE: {
			AnonymousClass4EnumConstInPackage anonymousClass4EnumConstInPackage = (AnonymousClass4EnumConstInPackage) theEObject;
			T result = caseAnonymousClass4EnumConstInPackage(anonymousClass4EnumConstInPackage);
			if (result == null)
				result = caseAbstractRule(anonymousClass4EnumConstInPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.MODIFIER2_NAMED_ELEMENT_ABSTRACT: {
			Modifier2NamedElement_Abstract modifier2NamedElement_Abstract = (Modifier2NamedElement_Abstract) theEObject;
			T result = caseModifier2NamedElement_Abstract(modifier2NamedElement_Abstract);
			if (result == null)
				result = caseAbstractRule(modifier2NamedElement_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE: {
			AnnotationTypeDeclaration2Interface annotationTypeDeclaration2Interface = (AnnotationTypeDeclaration2Interface) theEObject;
			T result = caseAnnotationTypeDeclaration2Interface(annotationTypeDeclaration2Interface);
			if (result == null)
				result = caseAbstractRule(annotationTypeDeclaration2Interface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE: {
			JavaModel2UmlModelRule javaModel2UmlModelRule = (JavaModel2UmlModelRule) theEObject;
			T result = caseJavaModel2UmlModelRule(javaModel2UmlModelRule);
			if (result == null)
				result = caseAbstractRule(javaModel2UmlModelRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_BOOLEAN: {
			PrimitiveTypeBoolean primitiveTypeBoolean = (PrimitiveTypeBoolean) theEObject;
			T result = casePrimitiveTypeBoolean(primitiveTypeBoolean);
			if (result == null)
				result = caseAbstractRule(primitiveTypeBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_INTERFACE: {
			InnerDeclaration2InnerClassifier_InMethod4Interface innerDeclaration2InnerClassifier_InMethod4Interface = (InnerDeclaration2InnerClassifier_InMethod4Interface) theEObject;
			T result = caseInnerDeclaration2InnerClassifier_InMethod4Interface(
					innerDeclaration2InnerClassifier_InMethod4Interface);
			if (result == null)
				result = caseAbstractRule(innerDeclaration2InnerClassifier_InMethod4Interface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE: {
			FieldDec2Property4Interface fieldDec2Property4Interface = (FieldDec2Property4Interface) theEObject;
			T result = caseFieldDec2Property4Interface(fieldDec2Property4Interface);
			if (result == null)
				result = caseAbstractRule(fieldDec2Property4Interface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.MODIFIER2_FEATURE_ABSTRACT: {
			Modifier2Feature_Abstract modifier2Feature_Abstract = (Modifier2Feature_Abstract) theEObject;
			T result = caseModifier2Feature_Abstract(modifier2Feature_Abstract);
			if (result == null)
				result = caseAbstractRule(modifier2Feature_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_LONG: {
			PrimitiveTypeLong primitiveTypeLong = (PrimitiveTypeLong) theEObject;
			T result = casePrimitiveTypeLong(primitiveTypeLong);
			if (result == null)
				result = caseAbstractRule(primitiveTypeLong);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE_INNER_TYPE_IN_CLASS: {
			ParameterizedType2Interface_InnerTypeInClass parameterizedType2Interface_InnerTypeInClass = (ParameterizedType2Interface_InnerTypeInClass) theEObject;
			T result = caseParameterizedType2Interface_InnerTypeInClass(parameterizedType2Interface_InnerTypeInClass);
			if (result == null)
				result = caseAbstractRule(parameterizedType2Interface_InnerTypeInClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS: {
			InnerDeclaration2InnerClassifier_InAnonymous innerDeclaration2InnerClassifier_InAnonymous = (InnerDeclaration2InnerClassifier_InAnonymous) theEObject;
			T result = caseInnerDeclaration2InnerClassifier_InAnonymous(innerDeclaration2InnerClassifier_InAnonymous);
			if (result == null)
				result = caseAbstractRule(innerDeclaration2InnerClassifier_InAnonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.OPERATION_IN_ANNOTATION_TYPE: {
			OperationInAnnotationType operationInAnnotationType = (OperationInAnnotationType) theEObject;
			T result = caseOperationInAnnotationType(operationInAnnotationType);
			if (result == null)
				result = caseAbstractRule(operationInAnnotationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION: {
			TypeAccess2InterfaceGeneralization typeAccess2InterfaceGeneralization = (TypeAccess2InterfaceGeneralization) theEObject;
			T result = caseTypeAccess2InterfaceGeneralization(typeAccess2InterfaceGeneralization);
			if (result == null)
				result = caseAbstractRule(typeAccess2InterfaceGeneralization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPE_PARAMETER2_OBJECT_ABSTRACT: {
			TypeParameter2Object_Abstract typeParameter2Object_Abstract = (TypeParameter2Object_Abstract) theEObject;
			T result = caseTypeParameter2Object_Abstract(typeParameter2Object_Abstract);
			if (result == null)
				result = caseAbstractRule(typeParameter2Object_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_METHOD_IN_CLASS: {
			TypeParameter2Object_InMethod_InClass typeParameter2Object_InMethod_InClass = (TypeParameter2Object_InMethod_InClass) theEObject;
			T result = caseTypeParameter2Object_InMethod_InClass(typeParameter2Object_InMethod_InClass);
			if (result == null)
				result = caseAbstractRule(typeParameter2Object_InMethod_InClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_SHORT: {
			PrimitiveTypeShort primitiveTypeShort = (PrimitiveTypeShort) theEObject;
			T result = casePrimitiveTypeShort(primitiveTypeShort);
			if (result == null)
				result = caseAbstractRule(primitiveTypeShort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_METHOD_ABSTRACT: {
			TypeParameter2Object_InMethod_Abstract typeParameter2Object_InMethod_Abstract = (TypeParameter2Object_InMethod_Abstract) theEObject;
			T result = caseTypeParameter2Object_InMethod_Abstract(typeParameter2Object_InMethod_Abstract);
			if (result == null)
				result = caseAbstractRule(typeParameter2Object_InMethod_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS4_CLASS: {
			AnonymousClass4Class anonymousClass4Class = (AnonymousClass4Class) theEObject;
			T result = caseAnonymousClass4Class(anonymousClass4Class);
			if (result == null)
				result = caseAbstractRule(anonymousClass4Class);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_CLASS: {
			InnerDeclaration2InnerClassifier_InMethod4Class innerDeclaration2InnerClassifier_InMethod4Class = (InnerDeclaration2InnerClassifier_InMethod4Class) theEObject;
			T result = caseInnerDeclaration2InnerClassifier_InMethod4Class(
					innerDeclaration2InnerClassifier_InMethod4Class);
			if (result == null)
				result = caseAbstractRule(innerDeclaration2InnerClassifier_InMethod4Class);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETERIZED_TYPE2_CLASSIFIER_ABSTRACT: {
			ParameterizedType2Classifier_Abstract parameterizedType2Classifier_Abstract = (ParameterizedType2Classifier_Abstract) theEObject;
			T result = caseParameterizedType2Classifier_Abstract(parameterizedType2Classifier_Abstract);
			if (result == null)
				result = caseAbstractRule(parameterizedType2Classifier_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETERIZED_TYPE2_CLASSIFIER_INNER_TYPE_IN_INTERFACE_ABSTRACT: {
			ParameterizedType2Classifier_InnerTypeInInterface_Abstract parameterizedType2Classifier_InnerTypeInInterface_Abstract = (ParameterizedType2Classifier_InnerTypeInInterface_Abstract) theEObject;
			T result = caseParameterizedType2Classifier_InnerTypeInInterface_Abstract(
					parameterizedType2Classifier_InnerTypeInInterface_Abstract);
			if (result == null)
				result = caseAbstractRule(parameterizedType2Classifier_InnerTypeInInterface_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL: {
			JavaPackageToUMLPackage_underModel javaPackageToUMLPackage_underModel = (JavaPackageToUMLPackage_underModel) theEObject;
			T result = caseJavaPackageToUMLPackage_underModel(javaPackageToUMLPackage_underModel);
			if (result == null)
				result = caseAbstractRule(javaPackageToUMLPackage_underModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ORPHANED_TYPE_DEC2_ORPHANED_TYPE_ABSTRACT: {
			OrphanedTypeDec2OrphanedType_Abstract orphanedTypeDec2OrphanedType_Abstract = (OrphanedTypeDec2OrphanedType_Abstract) theEObject;
			T result = caseOrphanedTypeDec2OrphanedType_Abstract(orphanedTypeDec2OrphanedType_Abstract);
			if (result == null)
				result = caseAbstractRule(orphanedTypeDec2OrphanedType_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT: {
			JavaAnnotationValueEntry2Comment javaAnnotationValueEntry2Comment = (JavaAnnotationValueEntry2Comment) theEObject;
			T result = caseJavaAnnotationValueEntry2Comment(javaAnnotationValueEntry2Comment);
			if (result == null)
				result = caseAbstractRule(javaAnnotationValueEntry2Comment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM: {
			AbstractTypeAccess2ReturnParam abstractTypeAccess2ReturnParam = (AbstractTypeAccess2ReturnParam) theEObject;
			T result = caseAbstractTypeAccess2ReturnParam(abstractTypeAccess2ReturnParam);
			if (result == null)
				result = caseAbstractRule(abstractTypeAccess2ReturnParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE: {
			PrimitiveType2PrimitiveType primitiveType2PrimitiveType = (PrimitiveType2PrimitiveType) theEObject;
			T result = casePrimitiveType2PrimitiveType(primitiveType2PrimitiveType);
			if (result == null)
				result = caseAbstractRule(primitiveType2PrimitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS4_INTERFACE: {
			AnonymousClass4Interface anonymousClass4Interface = (AnonymousClass4Interface) theEObject;
			T result = caseAnonymousClass4Interface(anonymousClass4Interface);
			if (result == null)
				result = caseAbstractRule(anonymousClass4Interface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS: {
			FieldDec2Property4Class fieldDec2Property4Class = (FieldDec2Property4Class) theEObject;
			T result = caseFieldDec2Property4Class(fieldDec2Property4Class);
			if (result == null)
				result = caseAbstractRule(fieldDec2Property4Class);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETERIZED_TYPE2_CLASSIFIER_INNER_TYPE_IN_CLASS_ABSTRACT: {
			ParameterizedType2Classifier_InnerTypeInClass_Abstract parameterizedType2Classifier_InnerTypeInClass_Abstract = (ParameterizedType2Classifier_InnerTypeInClass_Abstract) theEObject;
			T result = caseParameterizedType2Classifier_InnerTypeInClass_Abstract(
					parameterizedType2Classifier_InnerTypeInClass_Abstract);
			if (result == null)
				result = caseAbstractRule(parameterizedType2Classifier_InnerTypeInClass_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTERFACE_DEC2_INTERFACE: {
			InterfaceDec2Interface interfaceDec2Interface = (InterfaceDec2Interface) theEObject;
			T result = caseInterfaceDec2Interface(interfaceDec2Interface);
			if (result == null)
				result = caseAbstractRule(interfaceDec2Interface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.OPERATION_IN_CLASS: {
			OperationInClass operationInClass = (OperationInClass) theEObject;
			T result = caseOperationInClass(operationInClass);
			if (result == null)
				result = caseAbstractRule(operationInClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_INTERFACE: {
			TypeParameter2Object_InInterface typeParameter2Object_InInterface = (TypeParameter2Object_InInterface) theEObject;
			T result = caseTypeParameter2Object_InInterface(typeParameter2Object_InInterface);
			if (result == null)
				result = caseAbstractRule(typeParameter2Object_InInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE: {
			AnonymousClass4EnumConstInType anonymousClass4EnumConstInType = (AnonymousClass4EnumConstInType) theEObject;
			T result = caseAnonymousClass4EnumConstInType(anonymousClass4EnumConstInType);
			if (result == null)
				result = caseAbstractRule(anonymousClass4EnumConstInType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM: {
			EnumDecWithModifier2Enum enumDecWithModifier2Enum = (EnumDecWithModifier2Enum) theEObject;
			T result = caseEnumDecWithModifier2Enum(enumDecWithModifier2Enum);
			if (result == null)
				result = caseAbstractRule(enumDecWithModifier2Enum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS: {
			ParameterizedType2Class parameterizedType2Class = (ParameterizedType2Class) theEObject;
			T result = caseParameterizedType2Class(parameterizedType2Class);
			if (result == null)
				result = caseAbstractRule(parameterizedType2Class);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM: {
			FieldDec2Property4Enum fieldDec2Property4Enum = (FieldDec2Property4Enum) theEObject;
			T result = caseFieldDec2Property4Enum(fieldDec2Property4Enum);
			if (result == null)
				result = caseAbstractRule(fieldDec2Property4Enum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_FLOAT: {
			PrimitiveTypeFloat primitiveTypeFloat = (PrimitiveTypeFloat) theEObject;
			T result = casePrimitiveTypeFloat(primitiveTypeFloat);
			if (result == null)
				result = caseAbstractRule(primitiveTypeFloat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTERFACE_DEC_WITH_MODIFIER2_INTERFACE: {
			InterfaceDecWithModifier2Interface interfaceDecWithModifier2Interface = (InterfaceDecWithModifier2Interface) theEObject;
			T result = caseInterfaceDecWithModifier2Interface(interfaceDecWithModifier2Interface);
			if (result == null)
				result = caseAbstractRule(interfaceDecWithModifier2Interface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_DEC2_CLASS: {
			ClassDec2Class classDec2Class = (ClassDec2Class) theEObject;
			T result = caseClassDec2Class(classDec2Class);
			if (result == null)
				result = caseAbstractRule(classDec2Class);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS: {
			TypeParameter2Object_InClass typeParameter2Object_InClass = (TypeParameter2Object_InClass) theEObject;
			T result = caseTypeParameter2Object_InClass(typeParameter2Object_InClass);
			if (result == null)
				result = caseAbstractRule(typeParameter2Object_InClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION: {
			TypeAccess2Generalization typeAccess2Generalization = (TypeAccess2Generalization) theEObject;
			T result = caseTypeAccess2Generalization(typeAccess2Generalization);
			if (result == null)
				result = caseAbstractRule(typeAccess2Generalization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_CHAR: {
			PrimitiveTypeChar primitiveTypeChar = (PrimitiveTypeChar) theEObject;
			T result = casePrimitiveTypeChar(primitiveTypeChar);
			if (result == null)
				result = caseAbstractRule(primitiveTypeChar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.OPERATION_IN_ANONYMOUS: {
			OperationInAnonymous operationInAnonymous = (OperationInAnonymous) theEObject;
			T result = caseOperationInAnonymous(operationInAnonymous);
			if (result == null)
				result = caseAbstractRule(operationInAnonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE: {
			IgnoreOrphanTypesEdge ignoreOrphanTypesEdge = (IgnoreOrphanTypesEdge) theEObject;
			T result = caseIgnoreOrphanTypesEdge(ignoreOrphanTypesEdge);
			if (result == null)
				result = caseAbstractRule(ignoreOrphanTypesEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANNOTATION_TYPE: {
			InnerDeclaration2InnerClassifier_InAnnotationType innerDeclaration2InnerClassifier_InAnnotationType = (InnerDeclaration2InnerClassifier_InAnnotationType) theEObject;
			T result = caseInnerDeclaration2InnerClassifier_InAnnotationType(
					innerDeclaration2InnerClassifier_InAnnotationType);
			if (result == null)
				result = caseAbstractRule(innerDeclaration2InnerClassifier_InAnnotationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT: {
			CompilationUnit2Artifact compilationUnit2Artifact = (CompilationUnit2Artifact) theEObject;
			T result = caseCompilationUnit2Artifact(compilationUnit2Artifact);
			if (result == null)
				result = caseAbstractRule(compilationUnit2Artifact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_DECLARATION_TYPE_ACCESS_TYPE2_PROPERTY_TYPE: {
			FieldDeclarationTypeAccessType2PropertyType fieldDeclarationTypeAccessType2PropertyType = (FieldDeclarationTypeAccessType2PropertyType) theEObject;
			T result = caseFieldDeclarationTypeAccessType2PropertyType(fieldDeclarationTypeAccessType2PropertyType);
			if (result == null)
				result = caseAbstractRule(fieldDeclarationTypeAccessType2PropertyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_DEC2_OPERATION_WITH_MODIFIER: {
			MethodDec2OperationWithModifier methodDec2OperationWithModifier = (MethodDec2OperationWithModifier) theEObject;
			T result = caseMethodDec2OperationWithModifier(methodDec2OperationWithModifier);
			if (result == null)
				result = caseAbstractRule(methodDec2OperationWithModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION: {
			JavaAnnotation2Comment4SingleVariableDeclaration javaAnnotation2Comment4SingleVariableDeclaration = (JavaAnnotation2Comment4SingleVariableDeclaration) theEObject;
			T result = caseJavaAnnotation2Comment4SingleVariableDeclaration(
					javaAnnotation2Comment4SingleVariableDeclaration);
			if (result == null)
				result = caseAbstractRule(javaAnnotation2Comment4SingleVariableDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE_INNER_TYPE_IN_INTERFACE: {
			ParameterizedType2Interface_InnerTypeInInterface parameterizedType2Interface_InnerTypeInInterface = (ParameterizedType2Interface_InnerTypeInInterface) theEObject;
			T result = caseParameterizedType2Interface_InnerTypeInInterface(
					parameterizedType2Interface_InnerTypeInInterface);
			if (result == null)
				result = caseAbstractRule(parameterizedType2Interface_InnerTypeInInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.OPERATION_IN_INTERFACE: {
			OperationInInterface operationInInterface = (OperationInInterface) theEObject;
			T result = caseOperationInInterface(operationInInterface);
			if (result == null)
				result = caseAbstractRule(operationInInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_DEC2_PROPERTY4_ANONYMOUS: {
			FieldDec2Property4_Anonymous fieldDec2Property4_Anonymous = (FieldDec2Property4_Anonymous) theEObject;
			T result = caseFieldDec2Property4_Anonymous(fieldDec2Property4_Anonymous);
			if (result == null)
				result = caseAbstractRule(fieldDec2Property4_Anonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS: {
			AnonymousClass4Anonymous anonymousClass4Anonymous = (AnonymousClass4Anonymous) theEObject;
			T result = caseAnonymousClass4Anonymous(anonymousClass4Anonymous);
			if (result == null)
				result = caseAbstractRule(anonymousClass4Anonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER: {
			IgnoreClassInstanceCreation4ArrayInitializer ignoreClassInstanceCreation4ArrayInitializer = (IgnoreClassInstanceCreation4ArrayInitializer) theEObject;
			T result = caseIgnoreClassInstanceCreation4ArrayInitializer(ignoreClassInstanceCreation4ArrayInitializer);
			if (result == null)
				result = caseAbstractRule(ignoreClassInstanceCreation4ArrayInitializer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_INT: {
			PrimitiveTypeInt primitiveTypeInt = (PrimitiveTypeInt) theEObject;
			T result = casePrimitiveTypeInt(primitiveTypeInt);
			if (result == null)
				result = caseAbstractRule(primitiveTypeInt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY: {
			TypeDependency2UsageDependency typeDependency2UsageDependency = (TypeDependency2UsageDependency) theEObject;
			T result = caseTypeDependency2UsageDependency(typeDependency2UsageDependency);
			if (result == null)
				result = caseAbstractRule(typeDependency2UsageDependency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_ABSTRACT: {
			AnonymousClass4EnumConst_Abstract anonymousClass4EnumConst_Abstract = (AnonymousClass4EnumConst_Abstract) theEObject;
			T result = caseAnonymousClass4EnumConst_Abstract(anonymousClass4EnumConst_Abstract);
			if (result == null)
				result = caseAbstractRule(anonymousClass4EnumConst_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER: {
			AnnotationTypeDeclaration2Interface_WithModifier annotationTypeDeclaration2Interface_WithModifier = (AnnotationTypeDeclaration2Interface_WithModifier) theEObject;
			T result = caseAnnotationTypeDeclaration2Interface_WithModifier(
					annotationTypeDeclaration2Interface_WithModifier);
			if (result == null)
				result = caseAbstractRule(annotationTypeDeclaration2Interface_WithModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_ABSTRACT: {
			InnerDeclaration2InnerClassifier_Abstract innerDeclaration2InnerClassifier_Abstract = (InnerDeclaration2InnerClassifier_Abstract) theEObject;
			T result = caseInnerDeclaration2InnerClassifier_Abstract(innerDeclaration2InnerClassifier_Abstract);
			if (result == null)
				result = caseAbstractRule(innerDeclaration2InnerClassifier_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_METHOD_IN_INTERFACE: {
			TypeParameter2Object_InMethod_InInterface typeParameter2Object_InMethod_InInterface = (TypeParameter2Object_InMethod_InInterface) theEObject;
			T result = caseTypeParameter2Object_InMethod_InInterface(typeParameter2Object_InMethod_InInterface);
			if (result == null)
				result = caseAbstractRule(typeParameter2Object_InMethod_InInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS: {
			OrphanedClassDec2OrphanedClass orphanedClassDec2OrphanedClass = (OrphanedClassDec2OrphanedClass) theEObject;
			T result = caseOrphanedClassDec2OrphanedClass(orphanedClassDec2OrphanedClass);
			if (result == null)
				result = caseAbstractRule(orphanedClassDec2OrphanedClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_DEC2_PROPERTY: {
			FieldDec2Property fieldDec2Property = (FieldDec2Property) theEObject;
			T result = caseFieldDec2Property(fieldDec2Property);
			if (result == null)
				result = caseAbstractRule(fieldDec2Property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE: {
			ParameterizedType2Class_InnerTypeInInterface parameterizedType2Class_InnerTypeInInterface = (ParameterizedType2Class_InnerTypeInInterface) theEObject;
			T result = caseParameterizedType2Class_InnerTypeInInterface(parameterizedType2Class_InnerTypeInInterface);
			if (result == null)
				result = caseAbstractRule(parameterizedType2Class_InnerTypeInInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE: {
			UnresolvedTypeDeclaration2Type unresolvedTypeDeclaration2Type = (UnresolvedTypeDeclaration2Type) theEObject;
			T result = caseUnresolvedTypeDeclaration2Type(unresolvedTypeDeclaration2Type);
			if (result == null)
				result = caseAbstractRule(unresolvedTypeDeclaration2Type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LINK_TYPE_TO_PACKAGE: {
			LinkTypeToPackage linkTypeToPackage = (LinkTypeToPackage) theEObject;
			T result = caseLinkTypeToPackage(linkTypeToPackage);
			if (result == null)
				result = caseAbstractRule(linkTypeToPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.JAVA_ANNOTATION2_COMMENT_ABSTRACT: {
			JavaAnnotation2Comment_Abstract javaAnnotation2Comment_Abstract = (JavaAnnotation2Comment_Abstract) theEObject;
			T result = caseJavaAnnotation2Comment_Abstract(javaAnnotation2Comment_Abstract);
			if (result == null)
				result = caseAbstractRule(javaAnnotation2Comment_Abstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.OPERATION_IN_ENUM: {
			OperationInEnum operationInEnum = (OperationInEnum) theEObject;
			T result = caseOperationInEnum(operationInEnum);
			if (result == null)
				result = caseAbstractRule(operationInEnum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_BYTE: {
			PrimitiveTypeByte primitiveTypeByte = (PrimitiveTypeByte) theEObject;
			T result = casePrimitiveTypeByte(primitiveTypeByte);
			if (result == null)
				result = caseAbstractRule(primitiveTypeByte);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS: {
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous innerDeclaration2InnerClassifier_InMethod4IAnonymous = (InnerDeclaration2InnerClassifier_InMethod4IAnonymous) theEObject;
			T result = caseInnerDeclaration2InnerClassifier_InMethod4IAnonymous(
					innerDeclaration2InnerClassifier_InMethod4IAnonymous);
			if (result == null)
				result = caseAbstractRule(innerDeclaration2InnerClassifier_InMethod4IAnonymous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT: {
			JavaAnnotationValue2Comment javaAnnotationValue2Comment = (JavaAnnotationValue2Comment) theEObject;
			T result = caseJavaAnnotationValue2Comment(javaAnnotationValue2Comment);
			if (result == null)
				result = caseAbstractRule(javaAnnotationValue2Comment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER: {
			FieldDec2Property_WithModifier fieldDec2Property_WithModifier = (FieldDec2Property_WithModifier) theEObject;
			T result = caseFieldDec2Property_WithModifier(fieldDec2Property_WithModifier);
			if (result == null)
				result = caseAbstractRule(fieldDec2Property_WithModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION: {
			TypeAccess2InterfaceRealization typeAccess2InterfaceRealization = (TypeAccess2InterfaceRealization) theEObject;
			T result = caseTypeAccess2InterfaceRealization(typeAccess2InterfaceRealization);
			if (result == null)
				result = caseAbstractRule(typeAccess2InterfaceRealization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE: {
			ParameterizedType2Interface parameterizedType2Interface = (ParameterizedType2Interface) theEObject;
			T result = caseParameterizedType2Interface(parameterizedType2Interface);
			if (result == null)
				result = caseAbstractRule(parameterizedType2Interface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_VOID: {
			PrimitiveTypeVoid primitiveTypeVoid = (PrimitiveTypeVoid) theEObject;
			T result = casePrimitiveTypeVoid(primitiveTypeVoid);
			if (result == null)
				result = caseAbstractRule(primitiveTypeVoid);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_CLASS: {
			ParameterizedType2Class_InnerTypeInClass parameterizedType2Class_InnerTypeInClass = (ParameterizedType2Class_InnerTypeInClass) theEObject;
			T result = caseParameterizedType2Class_InnerTypeInClass(parameterizedType2Class_InnerTypeInClass);
			if (result == null)
				result = caseAbstractRule(parameterizedType2Class_InnerTypeInClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_DEC2_OPERATION: {
			MethodDec2Operation methodDec2Operation = (MethodDec2Operation) theEObject;
			T result = caseMethodDec2Operation(methodDec2Operation);
			if (result == null)
				result = caseAbstractRule(methodDec2Operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_BODY_DECLARATION: {
			JavaAnnotation2Comment4BodyDeclaration javaAnnotation2Comment4BodyDeclaration = (JavaAnnotation2Comment4BodyDeclaration) theEObject;
			T result = caseJavaAnnotation2Comment4BodyDeclaration(javaAnnotation2Comment4BodyDeclaration);
			if (result == null)
				result = caseAbstractRule(javaAnnotation2Comment4BodyDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE: {
			PrimitiveTypeDouble primitiveTypeDouble = (PrimitiveTypeDouble) theEObject;
			T result = casePrimitiveTypeDouble(primitiveTypeDouble);
			if (result == null)
				result = caseAbstractRule(primitiveTypeDouble);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER: {
			ConstructorDec2OperationWithModifier constructorDec2OperationWithModifier = (ConstructorDec2OperationWithModifier) theEObject;
			T result = caseConstructorDec2OperationWithModifier(constructorDec2OperationWithModifier);
			if (result == null)
				result = caseAbstractRule(constructorDec2OperationWithModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class4 Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class4 Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClass4_Abstract(AnonymousClass4_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type2 Non Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type2 Non Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType2NonArrayType(ArrayType2NonArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Dec2 Parameter4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Dec2 Parameter4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDec2Parameter4(VariableDec2Parameter4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Dec2 Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Dec2 Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDec2Enum(EnumDec2Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Dec With Modifier2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Dec With Modifier2 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDecWithModifier2Class(ClassDecWithModifier2Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Package To UML Package under Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Package To UML Package under Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaPackageToUMLPackage_underPackage(JavaPackageToUMLPackage_underPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerDeclaration2InnerClassifier_InClass(InnerDeclaration2InnerClassifier_InClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerDeclaration2InnerClassifier_InInterface(InnerDeclaration2InnerClassifier_InInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Method Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Method Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerDeclaration2InnerClassifier_InMethod_Abstract(
			InnerDeclaration2InnerClassifier_InMethod_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifestation4 Compilation Unit2 Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifestation4 Compilation Unit2 Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestation4CompilationUnit2Artifact(Manifestation4CompilationUnit2Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Dec2 Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Dec2 Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorDec2Operation(ConstructorDec2Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerDeclaration2InnerClassifier_InEnum(InnerDeclaration2InnerClassifier_InEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orphanded Primitive2 Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orphanded Primitive2 Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrphandedPrimitive2PrimitiveType(OrphandedPrimitive2PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class4 Enum Const In Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class4 Enum Const In Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClass4EnumConstInPackage(AnonymousClass4EnumConstInPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier2 Named Element Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier2 Named Element Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier2NamedElement_Abstract(Modifier2NamedElement_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Declaration2 Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Declaration2 Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeDeclaration2Interface(AnnotationTypeDeclaration2Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Model2 Uml Model Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Model2 Uml Model Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaModel2UmlModelRule(JavaModel2UmlModelRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeBoolean(PrimitiveTypeBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Method4 Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Method4 Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerDeclaration2InnerClassifier_InMethod4Interface(
			InnerDeclaration2InnerClassifier_InMethod4Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Dec2 Property4 Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Dec2 Property4 Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDec2Property4Interface(FieldDec2Property4Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier2 Feature Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier2 Feature Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier2Feature_Abstract(Modifier2Feature_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeLong(PrimitiveTypeLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type2 Interface Inner Type In Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type2 Interface Inner Type In Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType2Interface_InnerTypeInClass(ParameterizedType2Interface_InnerTypeInClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Anonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerDeclaration2InnerClassifier_InAnonymous(InnerDeclaration2InnerClassifier_InAnonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation In Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation In Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInAnnotationType(OperationInAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access2 Interface Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access2 Interface Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccess2InterfaceGeneralization(TypeAccess2InterfaceGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter2 Object Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter2 Object Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter2Object_Abstract(TypeParameter2Object_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter2 Object In Method In Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter2 Object In Method In Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter2Object_InMethod_InClass(TypeParameter2Object_InMethod_InClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeShort(PrimitiveTypeShort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter2 Object In Method Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter2 Object In Method Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter2Object_InMethod_Abstract(TypeParameter2Object_InMethod_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class4 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class4 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClass4Class(AnonymousClass4Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Method4 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Method4 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerDeclaration2InnerClassifier_InMethod4Class(
			InnerDeclaration2InnerClassifier_InMethod4Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type2 Classifier Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type2 Classifier Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType2Classifier_Abstract(ParameterizedType2Classifier_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type2 Classifier Inner Type In Interface Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type2 Classifier Inner Type In Interface Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType2Classifier_InnerTypeInInterface_Abstract(
			ParameterizedType2Classifier_InnerTypeInInterface_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Package To UML Package under Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Package To UML Package under Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaPackageToUMLPackage_underModel(JavaPackageToUMLPackage_underModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orphaned Type Dec2 Orphaned Type Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orphaned Type Dec2 Orphaned Type Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrphanedTypeDec2OrphanedType_Abstract(OrphanedTypeDec2OrphanedType_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Annotation Value Entry2 Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Annotation Value Entry2 Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaAnnotationValueEntry2Comment(JavaAnnotationValueEntry2Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Access2 Return Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Access2 Return Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeAccess2ReturnParam(AbstractTypeAccess2ReturnParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type2 Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type2 Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType2PrimitiveType(PrimitiveType2PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class4 Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class4 Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClass4Interface(AnonymousClass4Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Dec2 Property4 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Dec2 Property4 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDec2Property4Class(FieldDec2Property4Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type2 Classifier Inner Type In Class Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type2 Classifier Inner Type In Class Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType2Classifier_InnerTypeInClass_Abstract(
			ParameterizedType2Classifier_InnerTypeInClass_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Dec2 Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Dec2 Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDec2Interface(InterfaceDec2Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation In Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation In Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInClass(OperationInClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter2 Object In Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter2 Object In Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter2Object_InInterface(TypeParameter2Object_InInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class4 Enum Const In Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class4 Enum Const In Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClass4EnumConstInType(AnonymousClass4EnumConstInType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Dec With Modifier2 Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Dec With Modifier2 Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDecWithModifier2Enum(EnumDecWithModifier2Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type2 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType2Class(ParameterizedType2Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Dec2 Property4 Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Dec2 Property4 Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDec2Property4Enum(FieldDec2Property4Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeFloat(PrimitiveTypeFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Dec With Modifier2 Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Dec With Modifier2 Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDecWithModifier2Interface(InterfaceDecWithModifier2Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Dec2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Dec2 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDec2Class(ClassDec2Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter2 Object In Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter2 Object In Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter2Object_InClass(TypeParameter2Object_InClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access2 Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access2 Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccess2Generalization(TypeAccess2Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeChar(PrimitiveTypeChar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation In Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation In Anonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInAnonymous(OperationInAnonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ignore Orphan Types Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ignore Orphan Types Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIgnoreOrphanTypesEdge(IgnoreOrphanTypesEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerDeclaration2InnerClassifier_InAnnotationType(
			InnerDeclaration2InnerClassifier_InAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit2 Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit2 Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit2Artifact(CompilationUnit2Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Declaration Type Access Type2 Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Declaration Type Access Type2 Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDeclarationTypeAccessType2PropertyType(FieldDeclarationTypeAccessType2PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Dec2 Operation With Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Dec2 Operation With Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDec2OperationWithModifier(MethodDec2OperationWithModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Annotation2 Comment4 Single Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Annotation2 Comment4 Single Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaAnnotation2Comment4SingleVariableDeclaration(
			JavaAnnotation2Comment4SingleVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type2 Interface Inner Type In Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type2 Interface Inner Type In Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType2Interface_InnerTypeInInterface(
			ParameterizedType2Interface_InnerTypeInInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation In Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation In Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInInterface(OperationInInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Dec2 Property4 Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Dec2 Property4 Anonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDec2Property4_Anonymous(FieldDec2Property4_Anonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class4 Anonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class4 Anonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClass4Anonymous(AnonymousClass4Anonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ignore Class Instance Creation4 Array Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ignore Class Instance Creation4 Array Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIgnoreClassInstanceCreation4ArrayInitializer(IgnoreClassInstanceCreation4ArrayInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeInt(PrimitiveTypeInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Dependency2 Usage Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Dependency2 Usage Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDependency2UsageDependency(TypeDependency2UsageDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class4 Enum Const Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class4 Enum Const Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClass4EnumConst_Abstract(AnonymousClass4EnumConst_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Declaration2 Interface With Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Declaration2 Interface With Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeDeclaration2Interface_WithModifier(
			AnnotationTypeDeclaration2Interface_WithModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerDeclaration2InnerClassifier_Abstract(InnerDeclaration2InnerClassifier_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter2 Object In Method In Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter2 Object In Method In Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter2Object_InMethod_InInterface(TypeParameter2Object_InMethod_InInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orphaned Class Dec2 Orphaned Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orphaned Class Dec2 Orphaned Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrphanedClassDec2OrphanedClass(OrphanedClassDec2OrphanedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Dec2 Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Dec2 Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDec2Property(FieldDec2Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type2 Class Inner Type In Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type2 Class Inner Type In Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType2Class_InnerTypeInInterface(ParameterizedType2Class_InnerTypeInInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type Declaration2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type Declaration2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedTypeDeclaration2Type(UnresolvedTypeDeclaration2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Type To Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type To Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkTypeToPackage(LinkTypeToPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Annotation2 Comment Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Annotation2 Comment Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaAnnotation2Comment_Abstract(JavaAnnotation2Comment_Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation In Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation In Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInEnum(OperationInEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeByte(PrimitiveTypeByte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Method4 IAnonymous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inner Declaration2 Inner Classifier In Method4 IAnonymous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerDeclaration2InnerClassifier_InMethod4IAnonymous(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Annotation Value2 Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Annotation Value2 Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaAnnotationValue2Comment(JavaAnnotationValue2Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Dec2 Property With Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Dec2 Property With Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDec2Property_WithModifier(FieldDec2Property_WithModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access2 Interface Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access2 Interface Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccess2InterfaceRealization(TypeAccess2InterfaceRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type2 Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type2 Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType2Interface(ParameterizedType2Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeVoid(PrimitiveTypeVoid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type2 Class Inner Type In Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type2 Class Inner Type In Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType2Class_InnerTypeInClass(ParameterizedType2Class_InnerTypeInClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Dec2 Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Dec2 Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDec2Operation(MethodDec2Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Annotation2 Comment4 Body Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Annotation2 Comment4 Body Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaAnnotation2Comment4BodyDeclaration(JavaAnnotation2Comment4BodyDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeDouble(PrimitiveTypeDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Dec2 Operation With Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Dec2 Operation With Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorDec2OperationWithModifier(ConstructorDec2OperationWithModifier object) {
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
