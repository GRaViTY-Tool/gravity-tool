/**
 */
package org.gravity.tgg.modisco.uml.Rules.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.tgg.modisco.uml.Rules.*;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.uml.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter caseParameterizedType2Interface_InnerTypeInClass(
				ParameterizedType2Interface_InnerTypeInClass object) {
			return createParameterizedType2Interface_InnerTypeInClassAdapter();
		}

		@Override
		public Adapter caseInnerClassDeclaration2InnerClass_InClass(InnerClassDeclaration2InnerClass_InClass object) {
			return createInnerClassDeclaration2InnerClass_InClassAdapter();
		}

		@Override
		public Adapter caseInterfaceDec2Interface(InterfaceDec2Interface object) {
			return createInterfaceDec2InterfaceAdapter();
		}

		@Override
		public Adapter caseMethodDec2Operation4EnumWithModifier(MethodDec2Operation4EnumWithModifier object) {
			return createMethodDec2Operation4EnumWithModifierAdapter();
		}

		@Override
		public Adapter caseTypeParameter2Object_InMethod_InClass(TypeParameter2Object_InMethod_InClass object) {
			return createTypeParameter2Object_InMethod_InClassAdapter();
		}

		@Override
		public Adapter caseInnerInterfaceDeclaration2InnerInterface_InInterface_WithModifier(
				InnerInterfaceDeclaration2InnerInterface_InInterface_WithModifier object) {
			return createInnerInterfaceDeclaration2InnerInterface_InInterface_WithModifierAdapter();
		}

		@Override
		public Adapter caseFieldDeclarationTypeAccessType2PropertyType(
				FieldDeclarationTypeAccessType2PropertyType object) {
			return createFieldDeclarationTypeAccessType2PropertyTypeAdapter();
		}

		@Override
		public Adapter caseFieldDec2Property4Class(FieldDec2Property4Class object) {
			return createFieldDec2Property4ClassAdapter();
		}

		@Override
		public Adapter caseFieldDec2Property4_Abstract(FieldDec2Property4_Abstract object) {
			return createFieldDec2Property4_AbstractAdapter();
		}

		@Override
		public Adapter caseArrayType2NonArrayType(ArrayType2NonArrayType object) {
			return createArrayType2NonArrayTypeAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Classifier_Abstract(ParameterizedType2Classifier_Abstract object) {
			return createParameterizedType2Classifier_AbstractAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeVoid(PrimitiveTypeVoid object) {
			return createPrimitiveTypeVoidAdapter();
		}

		@Override
		public Adapter caseJavaAnnotationValueEntry2Comment(JavaAnnotationValueEntry2Comment object) {
			return createJavaAnnotationValueEntry2CommentAdapter();
		}

		@Override
		public Adapter caseJavaAnnotationValue2Comment(JavaAnnotationValue2Comment object) {
			return createJavaAnnotationValue2CommentAdapter();
		}

		@Override
		public Adapter caseJavaPackageToUMLPackage_underPackage(JavaPackageToUMLPackage_underPackage object) {
			return createJavaPackageToUMLPackage_underPackageAdapter();
		}

		@Override
		public Adapter caseConstructorDec2Operation4InterfaceWithModifier(
				ConstructorDec2Operation4InterfaceWithModifier object) {
			return createConstructorDec2Operation4InterfaceWithModifierAdapter();
		}

		@Override
		public Adapter caseInnerClassDeclaration2InnerClass_InMethod(InnerClassDeclaration2InnerClass_InMethod object) {
			return createInnerClassDeclaration2InnerClass_InMethodAdapter();
		}

		@Override
		public Adapter caseEnumDecWithModifier2Enum(EnumDecWithModifier2Enum object) {
			return createEnumDecWithModifier2EnumAdapter();
		}

		@Override
		public Adapter caseTypeParameter2Object_InInterface(TypeParameter2Object_InInterface object) {
			return createTypeParameter2Object_InInterfaceAdapter();
		}

		@Override
		public Adapter caseTypeDependency2UsageDependency(TypeDependency2UsageDependency object) {
			return createTypeDependency2UsageDependencyAdapter();
		}

		@Override
		public Adapter caseInnerClassDeclaration2InnerClass_Abstract(InnerClassDeclaration2InnerClass_Abstract object) {
			return createInnerClassDeclaration2InnerClass_AbstractAdapter();
		}

		@Override
		public Adapter caseIgnoreOrphanTypesEdge(IgnoreOrphanTypesEdge object) {
			return createIgnoreOrphanTypesEdgeAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeShort(PrimitiveTypeShort object) {
			return createPrimitiveTypeShortAdapter();
		}

		@Override
		public Adapter caseMethodDec2Operation4Interface(MethodDec2Operation4Interface object) {
			return createMethodDec2Operation4InterfaceAdapter();
		}

		@Override
		public Adapter caseTypeAccess2InterfaceRealization(TypeAccess2InterfaceRealization object) {
			return createTypeAccess2InterfaceRealizationAdapter();
		}

		@Override
		public Adapter caseTypeAccessType2ParameterType_Return(TypeAccessType2ParameterType_Return object) {
			return createTypeAccessType2ParameterType_ReturnAdapter();
		}

		@Override
		public Adapter caseEnumDec2Enum(EnumDec2Enum object) {
			return createEnumDec2EnumAdapter();
		}

		@Override
		public Adapter caseJavaAnnotation2Comment4BodyDeclaration(JavaAnnotation2Comment4BodyDeclaration object) {
			return createJavaAnnotation2Comment4BodyDeclarationAdapter();
		}

		@Override
		public Adapter caseFieldDec2Property4Interface(FieldDec2Property4Interface object) {
			return createFieldDec2Property4InterfaceAdapter();
		}

		@Override
		public Adapter caseModifier2Feature_Abstract(Modifier2Feature_Abstract object) {
			return createModifier2Feature_AbstractAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Classifier_InnerTypeInInterface_Abstract(
				ParameterizedType2Classifier_InnerTypeInInterface_Abstract object) {
			return createParameterizedType2Classifier_InnerTypeInInterface_AbstractAdapter();
		}

		@Override
		public Adapter caseModifier2NamedElement_Abstract(Modifier2NamedElement_Abstract object) {
			return createModifier2NamedElement_AbstractAdapter();
		}

		@Override
		public Adapter caseFieldDec2Property4Enum(FieldDec2Property4Enum object) {
			return createFieldDec2Property4EnumAdapter();
		}

		@Override
		public Adapter caseTypeAccess2InterfaceGeneralization(TypeAccess2InterfaceGeneralization object) {
			return createTypeAccess2InterfaceGeneralizationAdapter();
		}

		@Override
		public Adapter caseInnerEnumDeclaration2InnerEnumeration_InClass_WithModifier(
				InnerEnumDeclaration2InnerEnumeration_InClass_WithModifier object) {
			return createInnerEnumDeclaration2InnerEnumeration_InClass_WithModifierAdapter();
		}

		@Override
		public Adapter caseTypeAccessType2ParameterType_Abstract(TypeAccessType2ParameterType_Abstract object) {
			return createTypeAccessType2ParameterType_AbstractAdapter();
		}

		@Override
		public Adapter caseMethodDec2Operation4Class(MethodDec2Operation4Class object) {
			return createMethodDec2Operation4ClassAdapter();
		}

		@Override
		public Adapter caseJavaAnnotation2Comment4SingleVariableDeclaration(
				JavaAnnotation2Comment4SingleVariableDeclaration object) {
			return createJavaAnnotation2Comment4SingleVariableDeclarationAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Interface_InnerTypeInInterface(
				ParameterizedType2Interface_InnerTypeInInterface object) {
			return createParameterizedType2Interface_InnerTypeInInterfaceAdapter();
		}

		@Override
		public Adapter caseAnonymousClass_WithModifier(AnonymousClass_WithModifier object) {
			return createAnonymousClass_WithModifierAdapter();
		}

		@Override
		public Adapter caseConstructorDec2Operation4EnumWithModifier(ConstructorDec2Operation4EnumWithModifier object) {
			return createConstructorDec2Operation4EnumWithModifierAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeLong(PrimitiveTypeLong object) {
			return createPrimitiveTypeLongAdapter();
		}

		@Override
		public Adapter caseJavaAnnotation2Comment_Abstract(JavaAnnotation2Comment_Abstract object) {
			return createJavaAnnotation2Comment_AbstractAdapter();
		}

		@Override
		public Adapter caseJavaModel2UmlModelRule(JavaModel2UmlModelRule object) {
			return createJavaModel2UmlModelRuleAdapter();
		}

		@Override
		public Adapter caseInnerInterfaceDeclaration2InnerInterface_InMethod(
				InnerInterfaceDeclaration2InnerInterface_InMethod object) {
			return createInnerInterfaceDeclaration2InnerInterface_InMethodAdapter();
		}

		@Override
		public Adapter caseTypeAccessType2ParameterType_Parameter(TypeAccessType2ParameterType_Parameter object) {
			return createTypeAccessType2ParameterType_ParameterAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeBoolean(PrimitiveTypeBoolean object) {
			return createPrimitiveTypeBooleanAdapter();
		}

		@Override
		public Adapter caseTypeAccess2ReturnParam(TypeAccess2ReturnParam object) {
			return createTypeAccess2ReturnParamAdapter();
		}

		@Override
		public Adapter caseInnerClassDeclaration2InnerClass_InInterface(
				InnerClassDeclaration2InnerClass_InInterface object) {
			return createInnerClassDeclaration2InnerClass_InInterfaceAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_InMethod_Abstract(
				InnerDeclaration2InnerClassifier_InMethod_Abstract object) {
			return createInnerDeclaration2InnerClassifier_InMethod_AbstractAdapter();
		}

		@Override
		public Adapter caseInnerInterfaceDeclaration2InnerInterface_InClass(
				InnerInterfaceDeclaration2InnerInterface_InClass object) {
			return createInnerInterfaceDeclaration2InnerInterface_InClassAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeDeclaration2Interface(AnnotationTypeDeclaration2Interface object) {
			return createAnnotationTypeDeclaration2InterfaceAdapter();
		}

		@Override
		public Adapter caseTypeParameter2Object_InMethod_Abstract(TypeParameter2Object_InMethod_Abstract object) {
			return createTypeParameter2Object_InMethod_AbstractAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_Abstract(InnerDeclaration2InnerClassifier_Abstract object) {
			return createInnerDeclaration2InnerClassifier_AbstractAdapter();
		}

		@Override
		public Adapter caseInnerInterfaceDeclaration2InnerInterface_InInterface(
				InnerInterfaceDeclaration2InnerInterface_InInterface object) {
			return createInnerInterfaceDeclaration2InnerInterface_InInterfaceAdapter();
		}

		@Override
		public Adapter caseConstructorDec2Operation4Class(ConstructorDec2Operation4Class object) {
			return createConstructorDec2Operation4ClassAdapter();
		}

		@Override
		public Adapter caseTypeAccess2Generalization(TypeAccess2Generalization object) {
			return createTypeAccess2GeneralizationAdapter();
		}

		@Override
		public Adapter caseMethodDec2Operation4InterfaceWithModifier(MethodDec2Operation4InterfaceWithModifier object) {
			return createMethodDec2Operation4InterfaceWithModifierAdapter();
		}

		@Override
		public Adapter caseConstructorDec2Operation4ClassWithModifier(
				ConstructorDec2Operation4ClassWithModifier object) {
			return createConstructorDec2Operation4ClassWithModifierAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeDeclaration2Interface_WithModifier(
				AnnotationTypeDeclaration2Interface_WithModifier object) {
			return createAnnotationTypeDeclaration2Interface_WithModifierAdapter();
		}

		@Override
		public Adapter caseInnerClassDeclaration2InnerClass_InMethod_withModifier(
				InnerClassDeclaration2InnerClass_InMethod_withModifier object) {
			return createInnerClassDeclaration2InnerClass_InMethod_withModifierAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeFloat(PrimitiveTypeFloat object) {
			return createPrimitiveTypeFloatAdapter();
		}

		@Override
		public Adapter caseConstructorDec2Operation4Interface(ConstructorDec2Operation4Interface object) {
			return createConstructorDec2Operation4InterfaceAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Class_InnerTypeInClass(ParameterizedType2Class_InnerTypeInClass object) {
			return createParameterizedType2Class_InnerTypeInClassAdapter();
		}

		@Override
		public Adapter caseJavaPackageToUMLPackage_underModel(JavaPackageToUMLPackage_underModel object) {
			return createJavaPackageToUMLPackage_underModelAdapter();
		}

		@Override
		public Adapter caseOrphanedClassDec2OrphanedClass(OrphanedClassDec2OrphanedClass object) {
			return createOrphanedClassDec2OrphanedClassAdapter();
		}

		@Override
		public Adapter caseMethodDec2Operation4Enum(MethodDec2Operation4Enum object) {
			return createMethodDec2Operation4EnumAdapter();
		}

		@Override
		public Adapter caseInnerInterfaceDeclaration2InnerInterface_Abstract(
				InnerInterfaceDeclaration2InnerInterface_Abstract object) {
			return createInnerInterfaceDeclaration2InnerInterface_AbstractAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeDouble(PrimitiveTypeDouble object) {
			return createPrimitiveTypeDoubleAdapter();
		}

		@Override
		public Adapter caseInnerClassDeclaration2InnerClass_InClass_WithModifier(
				InnerClassDeclaration2InnerClass_InClass_WithModifier object) {
			return createInnerClassDeclaration2InnerClass_InClass_WithModifierAdapter();
		}

		@Override
		public Adapter caseMethodDec2OperationAnonymous(MethodDec2OperationAnonymous object) {
			return createMethodDec2OperationAnonymousAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Class(ParameterizedType2Class object) {
			return createParameterizedType2ClassAdapter();
		}

		@Override
		public Adapter caseAbstractMethodDec2OperationAnonymous(AbstractMethodDec2OperationAnonymous object) {
			return createAbstractMethodDec2OperationAnonymousAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeByte(PrimitiveTypeByte object) {
			return createPrimitiveTypeByteAdapter();
		}

		@Override
		public Adapter caseInnerClassDeclaration2InnerClass_InInterface_WithModifier(
				InnerClassDeclaration2InnerClass_InInterface_WithModifier object) {
			return createInnerClassDeclaration2InnerClass_InInterface_WithModifierAdapter();
		}

		@Override
		public Adapter caseMethodDec2Operation_Abstract(MethodDec2Operation_Abstract object) {
			return createMethodDec2Operation_AbstractAdapter();
		}

		@Override
		public Adapter caseInnerEnumDeclaration2InnerEnum_InMethod(InnerEnumDeclaration2InnerEnum_InMethod object) {
			return createInnerEnumDeclaration2InnerEnum_InMethodAdapter();
		}

		@Override
		public Adapter caseFieldDec2Property4Class_WithModifier(FieldDec2Property4Class_WithModifier object) {
			return createFieldDec2Property4Class_WithModifierAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeChar(PrimitiveTypeChar object) {
			return createPrimitiveTypeCharAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Classifier_InnerTypeInClass_Abstract(
				ParameterizedType2Classifier_InnerTypeInClass_Abstract object) {
			return createParameterizedType2Classifier_InnerTypeInClass_AbstractAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_InClass_Abstract(
				InnerDeclaration2InnerClassifier_InClass_Abstract object) {
			return createInnerDeclaration2InnerClassifier_InClass_AbstractAdapter();
		}

		@Override
		public Adapter caseClassDecWithModifier2Class_InPackage(ClassDecWithModifier2Class_InPackage object) {
			return createClassDecWithModifier2Class_InPackageAdapter();
		}

		@Override
		public Adapter caseManifestation4CompilationUnit2Artifact(Manifestation4CompilationUnit2Artifact object) {
			return createManifestation4CompilationUnit2ArtifactAdapter();
		}

		@Override
		public Adapter caseTypeParameter2Object_InMethod_InInterface(TypeParameter2Object_InMethod_InInterface object) {
			return createTypeParameter2Object_InMethod_InInterfaceAdapter();
		}

		@Override
		public Adapter caseClassDec2Class_InPackage(ClassDec2Class_InPackage object) {
			return createClassDec2Class_InPackageAdapter();
		}

		@Override
		public Adapter caseInnerInterfaceDeclaration2InnerInterface_InClass_WithModifier(
				InnerInterfaceDeclaration2InnerInterface_InClass_WithModifier object) {
			return createInnerInterfaceDeclaration2InnerInterface_InClass_WithModifierAdapter();
		}

		@Override
		public Adapter caseInnerEnumDeclaration2InnerEnumeration_InInterface(
				InnerEnumDeclaration2InnerEnumeration_InInterface object) {
			return createInnerEnumDeclaration2InnerEnumeration_InInterfaceAdapter();
		}

		@Override
		public Adapter caseFieldDec2Property4Interface_WithModifier(FieldDec2Property4Interface_WithModifier object) {
			return createFieldDec2Property4Interface_WithModifierAdapter();
		}

		@Override
		public Adapter caseInnerEnumDeclaration2InnerEnumeration_Abstract(
				InnerEnumDeclaration2InnerEnumeration_Abstract object) {
			return createInnerEnumDeclaration2InnerEnumeration_AbstractAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_InInterface_Abstract(
				InnerDeclaration2InnerClassifier_InInterface_Abstract object) {
			return createInnerDeclaration2InnerClassifier_InInterface_AbstractAdapter();
		}

		@Override
		public Adapter caseVariableDec2Parameter(VariableDec2Parameter object) {
			return createVariableDec2ParameterAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Interface(ParameterizedType2Interface object) {
			return createParameterizedType2InterfaceAdapter();
		}

		@Override
		public Adapter caseTypeParameter2Object_Abstract(TypeParameter2Object_Abstract object) {
			return createTypeParameter2Object_AbstractAdapter();
		}

		@Override
		public Adapter caseInnerEnumDeclaration2InnerEnumeration_InClass(
				InnerEnumDeclaration2InnerEnumeration_InClass object) {
			return createInnerEnumDeclaration2InnerEnumeration_InClassAdapter();
		}

		@Override
		public Adapter casePrimitiveType2PrimitiveType(PrimitiveType2PrimitiveType object) {
			return createPrimitiveType2PrimitiveTypeAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Class_InnerTypeInInterface(
				ParameterizedType2Class_InnerTypeInInterface object) {
			return createParameterizedType2Class_InnerTypeInInterfaceAdapter();
		}

		@Override
		public Adapter caseInterfaceDecWithModifier2Interface(InterfaceDecWithModifier2Interface object) {
			return createInterfaceDecWithModifier2InterfaceAdapter();
		}

		@Override
		public Adapter caseConstructorDec2OperationAnonymous(ConstructorDec2OperationAnonymous object) {
			return createConstructorDec2OperationAnonymousAdapter();
		}

		@Override
		public Adapter caseTypeParameter2Object_InClass(TypeParameter2Object_InClass object) {
			return createTypeParameter2Object_InClassAdapter();
		}

		@Override
		public Adapter caseInnerEnumDeclaration2InnerEnumeration_InInterface_WithModifier(
				InnerEnumDeclaration2InnerEnumeration_InInterface_WithModifier object) {
			return createInnerEnumDeclaration2InnerEnumeration_InInterface_WithModifierAdapter();
		}

		@Override
		public Adapter caseFieldDec2Property4Enum_WithModifier(FieldDec2Property4Enum_WithModifier object) {
			return createFieldDec2Property4Enum_WithModifierAdapter();
		}

		@Override
		public Adapter caseConstructorDec2Operation_Abstract(ConstructorDec2Operation_Abstract object) {
			return createConstructorDec2Operation_AbstractAdapter();
		}

		@Override
		public Adapter caseMethodDec2Operation4ClassWithModifier(MethodDec2Operation4ClassWithModifier object) {
			return createMethodDec2Operation4ClassWithModifierAdapter();
		}

		@Override
		public Adapter caseConstructorDec2Operation4Enum(ConstructorDec2Operation4Enum object) {
			return createConstructorDec2Operation4EnumAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeInt(PrimitiveTypeInt object) {
			return createPrimitiveTypeIntAdapter();
		}

		@Override
		public Adapter caseCompilationUnit2Artifact(CompilationUnit2Artifact object) {
			return createCompilationUnit2ArtifactAdapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Interface_InnerTypeInClass <em>Parameterized Type2 Interface Inner Type In Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Interface_InnerTypeInClass
	 * @generated
	 */
	public Adapter createParameterizedType2Interface_InnerTypeInClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InClass <em>Inner Class Declaration2 Inner Class In Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InClass
	 * @generated
	 */
	public Adapter createInnerClassDeclaration2InnerClass_InClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InterfaceDec2Interface <em>Interface Dec2 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InterfaceDec2Interface
	 * @generated
	 */
	public Adapter createInterfaceDec2InterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4EnumWithModifier <em>Method Dec2 Operation4 Enum With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4EnumWithModifier
	 * @generated
	 */
	public Adapter createMethodDec2Operation4EnumWithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_InMethod_InClass <em>Type Parameter2 Object In Method In Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_InMethod_InClass
	 * @generated
	 */
	public Adapter createTypeParameter2Object_InMethod_InClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_InInterface_WithModifier <em>Inner Interface Declaration2 Inner Interface In Interface With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_InInterface_WithModifier
	 * @generated
	 */
	public Adapter createInnerInterfaceDeclaration2InnerInterface_InInterface_WithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.FieldDeclarationTypeAccessType2PropertyType <em>Field Declaration Type Access Type2 Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.FieldDeclarationTypeAccessType2PropertyType
	 * @generated
	 */
	public Adapter createFieldDeclarationTypeAccessType2PropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Class <em>Field Dec2 Property4 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Class
	 * @generated
	 */
	public Adapter createFieldDec2Property4ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4_Abstract <em>Field Dec2 Property4 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4_Abstract
	 * @generated
	 */
	public Adapter createFieldDec2Property4_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ArrayType2NonArrayType <em>Array Type2 Non Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ArrayType2NonArrayType
	 * @generated
	 */
	public Adapter createArrayType2NonArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Classifier_Abstract <em>Parameterized Type2 Classifier Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Classifier_Abstract
	 * @generated
	 */
	public Adapter createParameterizedType2Classifier_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeVoid <em>Primitive Type Void</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeVoid
	 * @generated
	 */
	public Adapter createPrimitiveTypeVoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.JavaAnnotationValueEntry2Comment <em>Java Annotation Value Entry2 Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.JavaAnnotationValueEntry2Comment
	 * @generated
	 */
	public Adapter createJavaAnnotationValueEntry2CommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.JavaAnnotationValue2Comment <em>Java Annotation Value2 Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.JavaAnnotationValue2Comment
	 * @generated
	 */
	public Adapter createJavaAnnotationValue2CommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.JavaPackageToUMLPackage_underPackage <em>Java Package To UML Package under Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.JavaPackageToUMLPackage_underPackage
	 * @generated
	 */
	public Adapter createJavaPackageToUMLPackage_underPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4InterfaceWithModifier <em>Constructor Dec2 Operation4 Interface With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4InterfaceWithModifier
	 * @generated
	 */
	public Adapter createConstructorDec2Operation4InterfaceWithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InMethod <em>Inner Class Declaration2 Inner Class In Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InMethod
	 * @generated
	 */
	public Adapter createInnerClassDeclaration2InnerClass_InMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.EnumDecWithModifier2Enum <em>Enum Dec With Modifier2 Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.EnumDecWithModifier2Enum
	 * @generated
	 */
	public Adapter createEnumDecWithModifier2EnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_InInterface <em>Type Parameter2 Object In Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_InInterface
	 * @generated
	 */
	public Adapter createTypeParameter2Object_InInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeDependency2UsageDependency <em>Type Dependency2 Usage Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeDependency2UsageDependency
	 * @generated
	 */
	public Adapter createTypeDependency2UsageDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_Abstract <em>Inner Class Declaration2 Inner Class Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_Abstract
	 * @generated
	 */
	public Adapter createInnerClassDeclaration2InnerClass_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.IgnoreOrphanTypesEdge <em>Ignore Orphan Types Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.IgnoreOrphanTypesEdge
	 * @generated
	 */
	public Adapter createIgnoreOrphanTypesEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeShort <em>Primitive Type Short</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeShort
	 * @generated
	 */
	public Adapter createPrimitiveTypeShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4Interface <em>Method Dec2 Operation4 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4Interface
	 * @generated
	 */
	public Adapter createMethodDec2Operation4InterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeAccess2InterfaceRealization <em>Type Access2 Interface Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeAccess2InterfaceRealization
	 * @generated
	 */
	public Adapter createTypeAccess2InterfaceRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeAccessType2ParameterType_Return <em>Type Access Type2 Parameter Type Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeAccessType2ParameterType_Return
	 * @generated
	 */
	public Adapter createTypeAccessType2ParameterType_ReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.EnumDec2Enum <em>Enum Dec2 Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.EnumDec2Enum
	 * @generated
	 */
	public Adapter createEnumDec2EnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.JavaAnnotation2Comment4BodyDeclaration <em>Java Annotation2 Comment4 Body Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.JavaAnnotation2Comment4BodyDeclaration
	 * @generated
	 */
	public Adapter createJavaAnnotation2Comment4BodyDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Interface <em>Field Dec2 Property4 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Interface
	 * @generated
	 */
	public Adapter createFieldDec2Property4InterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.Modifier2Feature_Abstract <em>Modifier2 Feature Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.Modifier2Feature_Abstract
	 * @generated
	 */
	public Adapter createModifier2Feature_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Classifier_InnerTypeInInterface_Abstract <em>Parameterized Type2 Classifier Inner Type In Interface Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Classifier_InnerTypeInInterface_Abstract
	 * @generated
	 */
	public Adapter createParameterizedType2Classifier_InnerTypeInInterface_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.Modifier2NamedElement_Abstract <em>Modifier2 Named Element Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.Modifier2NamedElement_Abstract
	 * @generated
	 */
	public Adapter createModifier2NamedElement_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Enum <em>Field Dec2 Property4 Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Enum
	 * @generated
	 */
	public Adapter createFieldDec2Property4EnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeAccess2InterfaceGeneralization <em>Type Access2 Interface Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeAccess2InterfaceGeneralization
	 * @generated
	 */
	public Adapter createTypeAccess2InterfaceGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnumeration_InClass_WithModifier <em>Inner Enum Declaration2 Inner Enumeration In Class With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnumeration_InClass_WithModifier
	 * @generated
	 */
	public Adapter createInnerEnumDeclaration2InnerEnumeration_InClass_WithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeAccessType2ParameterType_Abstract <em>Type Access Type2 Parameter Type Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeAccessType2ParameterType_Abstract
	 * @generated
	 */
	public Adapter createTypeAccessType2ParameterType_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4Class <em>Method Dec2 Operation4 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4Class
	 * @generated
	 */
	public Adapter createMethodDec2Operation4ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.JavaAnnotation2Comment4SingleVariableDeclaration <em>Java Annotation2 Comment4 Single Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.JavaAnnotation2Comment4SingleVariableDeclaration
	 * @generated
	 */
	public Adapter createJavaAnnotation2Comment4SingleVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Interface_InnerTypeInInterface <em>Parameterized Type2 Interface Inner Type In Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Interface_InnerTypeInInterface
	 * @generated
	 */
	public Adapter createParameterizedType2Interface_InnerTypeInInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.AnonymousClass_WithModifier <em>Anonymous Class With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.AnonymousClass_WithModifier
	 * @generated
	 */
	public Adapter createAnonymousClass_WithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4EnumWithModifier <em>Constructor Dec2 Operation4 Enum With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4EnumWithModifier
	 * @generated
	 */
	public Adapter createConstructorDec2Operation4EnumWithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeLong <em>Primitive Type Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeLong
	 * @generated
	 */
	public Adapter createPrimitiveTypeLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.JavaAnnotation2Comment_Abstract <em>Java Annotation2 Comment Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.JavaAnnotation2Comment_Abstract
	 * @generated
	 */
	public Adapter createJavaAnnotation2Comment_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.JavaModel2UmlModelRule <em>Java Model2 Uml Model Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.JavaModel2UmlModelRule
	 * @generated
	 */
	public Adapter createJavaModel2UmlModelRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_InMethod <em>Inner Interface Declaration2 Inner Interface In Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_InMethod
	 * @generated
	 */
	public Adapter createInnerInterfaceDeclaration2InnerInterface_InMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeAccessType2ParameterType_Parameter <em>Type Access Type2 Parameter Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeAccessType2ParameterType_Parameter
	 * @generated
	 */
	public Adapter createTypeAccessType2ParameterType_ParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeBoolean <em>Primitive Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeBoolean
	 * @generated
	 */
	public Adapter createPrimitiveTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeAccess2ReturnParam <em>Type Access2 Return Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeAccess2ReturnParam
	 * @generated
	 */
	public Adapter createTypeAccess2ReturnParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InInterface <em>Inner Class Declaration2 Inner Class In Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InInterface
	 * @generated
	 */
	public Adapter createInnerClassDeclaration2InnerClass_InInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InMethod_Abstract <em>Inner Declaration2 Inner Classifier In Method Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InMethod_Abstract
	 * @generated
	 */
	public Adapter createInnerDeclaration2InnerClassifier_InMethod_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_InClass <em>Inner Interface Declaration2 Inner Interface In Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_InClass
	 * @generated
	 */
	public Adapter createInnerInterfaceDeclaration2InnerInterface_InClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.AnnotationTypeDeclaration2Interface <em>Annotation Type Declaration2 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.AnnotationTypeDeclaration2Interface
	 * @generated
	 */
	public Adapter createAnnotationTypeDeclaration2InterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_InMethod_Abstract <em>Type Parameter2 Object In Method Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_InMethod_Abstract
	 * @generated
	 */
	public Adapter createTypeParameter2Object_InMethod_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_Abstract <em>Inner Declaration2 Inner Classifier Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_Abstract
	 * @generated
	 */
	public Adapter createInnerDeclaration2InnerClassifier_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_InInterface <em>Inner Interface Declaration2 Inner Interface In Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_InInterface
	 * @generated
	 */
	public Adapter createInnerInterfaceDeclaration2InnerInterface_InInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4Class <em>Constructor Dec2 Operation4 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4Class
	 * @generated
	 */
	public Adapter createConstructorDec2Operation4ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeAccess2Generalization <em>Type Access2 Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeAccess2Generalization
	 * @generated
	 */
	public Adapter createTypeAccess2GeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4InterfaceWithModifier <em>Method Dec2 Operation4 Interface With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4InterfaceWithModifier
	 * @generated
	 */
	public Adapter createMethodDec2Operation4InterfaceWithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4ClassWithModifier <em>Constructor Dec2 Operation4 Class With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4ClassWithModifier
	 * @generated
	 */
	public Adapter createConstructorDec2Operation4ClassWithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.AnnotationTypeDeclaration2Interface_WithModifier <em>Annotation Type Declaration2 Interface With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.AnnotationTypeDeclaration2Interface_WithModifier
	 * @generated
	 */
	public Adapter createAnnotationTypeDeclaration2Interface_WithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InMethod_withModifier <em>Inner Class Declaration2 Inner Class In Method with Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InMethod_withModifier
	 * @generated
	 */
	public Adapter createInnerClassDeclaration2InnerClass_InMethod_withModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeFloat <em>Primitive Type Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeFloat
	 * @generated
	 */
	public Adapter createPrimitiveTypeFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4Interface <em>Constructor Dec2 Operation4 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4Interface
	 * @generated
	 */
	public Adapter createConstructorDec2Operation4InterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Class_InnerTypeInClass <em>Parameterized Type2 Class Inner Type In Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Class_InnerTypeInClass
	 * @generated
	 */
	public Adapter createParameterizedType2Class_InnerTypeInClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.JavaPackageToUMLPackage_underModel <em>Java Package To UML Package under Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.JavaPackageToUMLPackage_underModel
	 * @generated
	 */
	public Adapter createJavaPackageToUMLPackage_underModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.OrphanedClassDec2OrphanedClass <em>Orphaned Class Dec2 Orphaned Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.OrphanedClassDec2OrphanedClass
	 * @generated
	 */
	public Adapter createOrphanedClassDec2OrphanedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4Enum <em>Method Dec2 Operation4 Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4Enum
	 * @generated
	 */
	public Adapter createMethodDec2Operation4EnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_Abstract <em>Inner Interface Declaration2 Inner Interface Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_Abstract
	 * @generated
	 */
	public Adapter createInnerInterfaceDeclaration2InnerInterface_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeDouble <em>Primitive Type Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeDouble
	 * @generated
	 */
	public Adapter createPrimitiveTypeDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InClass_WithModifier <em>Inner Class Declaration2 Inner Class In Class With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InClass_WithModifier
	 * @generated
	 */
	public Adapter createInnerClassDeclaration2InnerClass_InClass_WithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.MethodDec2OperationAnonymous <em>Method Dec2 Operation Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.MethodDec2OperationAnonymous
	 * @generated
	 */
	public Adapter createMethodDec2OperationAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Class <em>Parameterized Type2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Class
	 * @generated
	 */
	public Adapter createParameterizedType2ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.AbstractMethodDec2OperationAnonymous <em>Abstract Method Dec2 Operation Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.AbstractMethodDec2OperationAnonymous
	 * @generated
	 */
	public Adapter createAbstractMethodDec2OperationAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeByte <em>Primitive Type Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeByte
	 * @generated
	 */
	public Adapter createPrimitiveTypeByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InInterface_WithModifier <em>Inner Class Declaration2 Inner Class In Interface With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InInterface_WithModifier
	 * @generated
	 */
	public Adapter createInnerClassDeclaration2InnerClass_InInterface_WithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation_Abstract <em>Method Dec2 Operation Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation_Abstract
	 * @generated
	 */
	public Adapter createMethodDec2Operation_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnum_InMethod <em>Inner Enum Declaration2 Inner Enum In Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnum_InMethod
	 * @generated
	 */
	public Adapter createInnerEnumDeclaration2InnerEnum_InMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Class_WithModifier <em>Field Dec2 Property4 Class With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Class_WithModifier
	 * @generated
	 */
	public Adapter createFieldDec2Property4Class_WithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeChar <em>Primitive Type Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeChar
	 * @generated
	 */
	public Adapter createPrimitiveTypeCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Classifier_InnerTypeInClass_Abstract <em>Parameterized Type2 Classifier Inner Type In Class Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Classifier_InnerTypeInClass_Abstract
	 * @generated
	 */
	public Adapter createParameterizedType2Classifier_InnerTypeInClass_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InClass_Abstract <em>Inner Declaration2 Inner Classifier In Class Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InClass_Abstract
	 * @generated
	 */
	public Adapter createInnerDeclaration2InnerClassifier_InClass_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ClassDecWithModifier2Class_InPackage <em>Class Dec With Modifier2 Class In Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ClassDecWithModifier2Class_InPackage
	 * @generated
	 */
	public Adapter createClassDecWithModifier2Class_InPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.Manifestation4CompilationUnit2Artifact <em>Manifestation4 Compilation Unit2 Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.Manifestation4CompilationUnit2Artifact
	 * @generated
	 */
	public Adapter createManifestation4CompilationUnit2ArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_InMethod_InInterface <em>Type Parameter2 Object In Method In Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_InMethod_InInterface
	 * @generated
	 */
	public Adapter createTypeParameter2Object_InMethod_InInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ClassDec2Class_InPackage <em>Class Dec2 Class In Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ClassDec2Class_InPackage
	 * @generated
	 */
	public Adapter createClassDec2Class_InPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_InClass_WithModifier <em>Inner Interface Declaration2 Inner Interface In Class With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_InClass_WithModifier
	 * @generated
	 */
	public Adapter createInnerInterfaceDeclaration2InnerInterface_InClass_WithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnumeration_InInterface <em>Inner Enum Declaration2 Inner Enumeration In Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnumeration_InInterface
	 * @generated
	 */
	public Adapter createInnerEnumDeclaration2InnerEnumeration_InInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Interface_WithModifier <em>Field Dec2 Property4 Interface With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Interface_WithModifier
	 * @generated
	 */
	public Adapter createFieldDec2Property4Interface_WithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnumeration_Abstract <em>Inner Enum Declaration2 Inner Enumeration Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnumeration_Abstract
	 * @generated
	 */
	public Adapter createInnerEnumDeclaration2InnerEnumeration_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InInterface_Abstract <em>Inner Declaration2 Inner Classifier In Interface Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InInterface_Abstract
	 * @generated
	 */
	public Adapter createInnerDeclaration2InnerClassifier_InInterface_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.VariableDec2Parameter <em>Variable Dec2 Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.VariableDec2Parameter
	 * @generated
	 */
	public Adapter createVariableDec2ParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Interface <em>Parameterized Type2 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Interface
	 * @generated
	 */
	public Adapter createParameterizedType2InterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_Abstract <em>Type Parameter2 Object Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_Abstract
	 * @generated
	 */
	public Adapter createTypeParameter2Object_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnumeration_InClass <em>Inner Enum Declaration2 Inner Enumeration In Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnumeration_InClass
	 * @generated
	 */
	public Adapter createInnerEnumDeclaration2InnerEnumeration_InClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.PrimitiveType2PrimitiveType <em>Primitive Type2 Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.PrimitiveType2PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveType2PrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Class_InnerTypeInInterface <em>Parameterized Type2 Class Inner Type In Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Class_InnerTypeInInterface
	 * @generated
	 */
	public Adapter createParameterizedType2Class_InnerTypeInInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InterfaceDecWithModifier2Interface <em>Interface Dec With Modifier2 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InterfaceDecWithModifier2Interface
	 * @generated
	 */
	public Adapter createInterfaceDecWithModifier2InterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ConstructorDec2OperationAnonymous <em>Constructor Dec2 Operation Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ConstructorDec2OperationAnonymous
	 * @generated
	 */
	public Adapter createConstructorDec2OperationAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_InClass <em>Type Parameter2 Object In Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_InClass
	 * @generated
	 */
	public Adapter createTypeParameter2Object_InClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnumeration_InInterface_WithModifier <em>Inner Enum Declaration2 Inner Enumeration In Interface With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnumeration_InInterface_WithModifier
	 * @generated
	 */
	public Adapter createInnerEnumDeclaration2InnerEnumeration_InInterface_WithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Enum_WithModifier <em>Field Dec2 Property4 Enum With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Enum_WithModifier
	 * @generated
	 */
	public Adapter createFieldDec2Property4Enum_WithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation_Abstract <em>Constructor Dec2 Operation Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation_Abstract
	 * @generated
	 */
	public Adapter createConstructorDec2Operation_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4ClassWithModifier <em>Method Dec2 Operation4 Class With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4ClassWithModifier
	 * @generated
	 */
	public Adapter createMethodDec2Operation4ClassWithModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4Enum <em>Constructor Dec2 Operation4 Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4Enum
	 * @generated
	 */
	public Adapter createConstructorDec2Operation4EnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeInt <em>Primitive Type Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeInt
	 * @generated
	 */
	public Adapter createPrimitiveTypeIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.CompilationUnit2Artifact <em>Compilation Unit2 Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.CompilationUnit2Artifact
	 * @generated
	 */
	public Adapter createCompilationUnit2ArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RulesAdapterFactory
