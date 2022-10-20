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
		public Adapter caseAnonymousClass4_Abstract(AnonymousClass4_Abstract object) {
			return createAnonymousClass4_AbstractAdapter();
		}

		@Override
		public Adapter caseArrayType2NonArrayType(ArrayType2NonArrayType object) {
			return createArrayType2NonArrayTypeAdapter();
		}

		@Override
		public Adapter caseVariableDec2Parameter4(VariableDec2Parameter4 object) {
			return createVariableDec2Parameter4Adapter();
		}

		@Override
		public Adapter caseEnumDec2Enum(EnumDec2Enum object) {
			return createEnumDec2EnumAdapter();
		}

		@Override
		public Adapter caseClassDecWithModifier2Class(ClassDecWithModifier2Class object) {
			return createClassDecWithModifier2ClassAdapter();
		}

		@Override
		public Adapter caseJavaPackageToUMLPackage_underPackage(JavaPackageToUMLPackage_underPackage object) {
			return createJavaPackageToUMLPackage_underPackageAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_InClass(InnerDeclaration2InnerClassifier_InClass object) {
			return createInnerDeclaration2InnerClassifier_InClassAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_InInterface(
				InnerDeclaration2InnerClassifier_InInterface object) {
			return createInnerDeclaration2InnerClassifier_InInterfaceAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_InMethod_Abstract(
				InnerDeclaration2InnerClassifier_InMethod_Abstract object) {
			return createInnerDeclaration2InnerClassifier_InMethod_AbstractAdapter();
		}

		@Override
		public Adapter caseManifestation4CompilationUnit2Artifact(Manifestation4CompilationUnit2Artifact object) {
			return createManifestation4CompilationUnit2ArtifactAdapter();
		}

		@Override
		public Adapter caseConstructorDec2Operation(ConstructorDec2Operation object) {
			return createConstructorDec2OperationAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_InEnum(InnerDeclaration2InnerClassifier_InEnum object) {
			return createInnerDeclaration2InnerClassifier_InEnumAdapter();
		}

		@Override
		public Adapter caseOrphandedPrimitive2PrimitiveType(OrphandedPrimitive2PrimitiveType object) {
			return createOrphandedPrimitive2PrimitiveTypeAdapter();
		}

		@Override
		public Adapter caseAnonymousClass4EnumConstInPackage(AnonymousClass4EnumConstInPackage object) {
			return createAnonymousClass4EnumConstInPackageAdapter();
		}

		@Override
		public Adapter caseModifier2NamedElement_Abstract(Modifier2NamedElement_Abstract object) {
			return createModifier2NamedElement_AbstractAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeDeclaration2Interface(AnnotationTypeDeclaration2Interface object) {
			return createAnnotationTypeDeclaration2InterfaceAdapter();
		}

		@Override
		public Adapter caseJavaModel2UmlModelRule(JavaModel2UmlModelRule object) {
			return createJavaModel2UmlModelRuleAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeBoolean(PrimitiveTypeBoolean object) {
			return createPrimitiveTypeBooleanAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_InMethod4Interface(
				InnerDeclaration2InnerClassifier_InMethod4Interface object) {
			return createInnerDeclaration2InnerClassifier_InMethod4InterfaceAdapter();
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
		public Adapter casePrimitiveTypeLong(PrimitiveTypeLong object) {
			return createPrimitiveTypeLongAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Interface_InnerTypeInClass(
				ParameterizedType2Interface_InnerTypeInClass object) {
			return createParameterizedType2Interface_InnerTypeInClassAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_InAnonymous(
				InnerDeclaration2InnerClassifier_InAnonymous object) {
			return createInnerDeclaration2InnerClassifier_InAnonymousAdapter();
		}

		@Override
		public Adapter caseOperationInAnnotationType(OperationInAnnotationType object) {
			return createOperationInAnnotationTypeAdapter();
		}

		@Override
		public Adapter caseTypeAccess2InterfaceGeneralization(TypeAccess2InterfaceGeneralization object) {
			return createTypeAccess2InterfaceGeneralizationAdapter();
		}

		@Override
		public Adapter caseTypeParameter2Object_Abstract(TypeParameter2Object_Abstract object) {
			return createTypeParameter2Object_AbstractAdapter();
		}

		@Override
		public Adapter caseTypeParameter2Object_InMethod_InClass(TypeParameter2Object_InMethod_InClass object) {
			return createTypeParameter2Object_InMethod_InClassAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeShort(PrimitiveTypeShort object) {
			return createPrimitiveTypeShortAdapter();
		}

		@Override
		public Adapter caseTypeParameter2Object_InMethod_Abstract(TypeParameter2Object_InMethod_Abstract object) {
			return createTypeParameter2Object_InMethod_AbstractAdapter();
		}

		@Override
		public Adapter caseAnonymousClass4Class(AnonymousClass4Class object) {
			return createAnonymousClass4ClassAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_InMethod4Class(
				InnerDeclaration2InnerClassifier_InMethod4Class object) {
			return createInnerDeclaration2InnerClassifier_InMethod4ClassAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Classifier_Abstract(ParameterizedType2Classifier_Abstract object) {
			return createParameterizedType2Classifier_AbstractAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Classifier_InnerTypeInInterface_Abstract(
				ParameterizedType2Classifier_InnerTypeInInterface_Abstract object) {
			return createParameterizedType2Classifier_InnerTypeInInterface_AbstractAdapter();
		}

		@Override
		public Adapter caseJavaPackageToUMLPackage_underModel(JavaPackageToUMLPackage_underModel object) {
			return createJavaPackageToUMLPackage_underModelAdapter();
		}

		@Override
		public Adapter caseOrphanedTypeDec2OrphanedType_Abstract(OrphanedTypeDec2OrphanedType_Abstract object) {
			return createOrphanedTypeDec2OrphanedType_AbstractAdapter();
		}

		@Override
		public Adapter caseJavaAnnotationValueEntry2Comment(JavaAnnotationValueEntry2Comment object) {
			return createJavaAnnotationValueEntry2CommentAdapter();
		}

		@Override
		public Adapter caseAbstractTypeAccess2ReturnParam(AbstractTypeAccess2ReturnParam object) {
			return createAbstractTypeAccess2ReturnParamAdapter();
		}

		@Override
		public Adapter casePrimitiveType2PrimitiveType(PrimitiveType2PrimitiveType object) {
			return createPrimitiveType2PrimitiveTypeAdapter();
		}

		@Override
		public Adapter caseAnonymousClass4Interface(AnonymousClass4Interface object) {
			return createAnonymousClass4InterfaceAdapter();
		}

		@Override
		public Adapter caseFieldDec2Property4Class(FieldDec2Property4Class object) {
			return createFieldDec2Property4ClassAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Classifier_InnerTypeInClass_Abstract(
				ParameterizedType2Classifier_InnerTypeInClass_Abstract object) {
			return createParameterizedType2Classifier_InnerTypeInClass_AbstractAdapter();
		}

		@Override
		public Adapter caseInterfaceDec2Interface(InterfaceDec2Interface object) {
			return createInterfaceDec2InterfaceAdapter();
		}

		@Override
		public Adapter caseOperationInClass(OperationInClass object) {
			return createOperationInClassAdapter();
		}

		@Override
		public Adapter caseTypeParameter2Object_InInterface(TypeParameter2Object_InInterface object) {
			return createTypeParameter2Object_InInterfaceAdapter();
		}

		@Override
		public Adapter caseAnonymousClass4EnumConstInType(AnonymousClass4EnumConstInType object) {
			return createAnonymousClass4EnumConstInTypeAdapter();
		}

		@Override
		public Adapter caseEnumDecWithModifier2Enum(EnumDecWithModifier2Enum object) {
			return createEnumDecWithModifier2EnumAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Class(ParameterizedType2Class object) {
			return createParameterizedType2ClassAdapter();
		}

		@Override
		public Adapter caseFieldDec2Property4Enum(FieldDec2Property4Enum object) {
			return createFieldDec2Property4EnumAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeFloat(PrimitiveTypeFloat object) {
			return createPrimitiveTypeFloatAdapter();
		}

		@Override
		public Adapter caseInterfaceDecWithModifier2Interface(InterfaceDecWithModifier2Interface object) {
			return createInterfaceDecWithModifier2InterfaceAdapter();
		}

		@Override
		public Adapter caseClassDec2Class(ClassDec2Class object) {
			return createClassDec2ClassAdapter();
		}

		@Override
		public Adapter caseTypeParameter2Object_InClass(TypeParameter2Object_InClass object) {
			return createTypeParameter2Object_InClassAdapter();
		}

		@Override
		public Adapter caseTypeAccess2Generalization(TypeAccess2Generalization object) {
			return createTypeAccess2GeneralizationAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeChar(PrimitiveTypeChar object) {
			return createPrimitiveTypeCharAdapter();
		}

		@Override
		public Adapter caseOperationInAnonymous(OperationInAnonymous object) {
			return createOperationInAnonymousAdapter();
		}

		@Override
		public Adapter caseIgnoreOrphanTypesEdge(IgnoreOrphanTypesEdge object) {
			return createIgnoreOrphanTypesEdgeAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_InAnnotationType(
				InnerDeclaration2InnerClassifier_InAnnotationType object) {
			return createInnerDeclaration2InnerClassifier_InAnnotationTypeAdapter();
		}

		@Override
		public Adapter caseCompilationUnit2Artifact(CompilationUnit2Artifact object) {
			return createCompilationUnit2ArtifactAdapter();
		}

		@Override
		public Adapter caseFieldDeclarationTypeAccessType2PropertyType(
				FieldDeclarationTypeAccessType2PropertyType object) {
			return createFieldDeclarationTypeAccessType2PropertyTypeAdapter();
		}

		@Override
		public Adapter caseMethodDec2OperationWithModifier(MethodDec2OperationWithModifier object) {
			return createMethodDec2OperationWithModifierAdapter();
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
		public Adapter caseOperationInInterface(OperationInInterface object) {
			return createOperationInInterfaceAdapter();
		}

		@Override
		public Adapter caseFieldDec2Property4_Anonymous(FieldDec2Property4_Anonymous object) {
			return createFieldDec2Property4_AnonymousAdapter();
		}

		@Override
		public Adapter caseAnonymousClass4Anonymous(AnonymousClass4Anonymous object) {
			return createAnonymousClass4AnonymousAdapter();
		}

		@Override
		public Adapter caseIgnoreClassInstanceCreation4ArrayInitializer(
				IgnoreClassInstanceCreation4ArrayInitializer object) {
			return createIgnoreClassInstanceCreation4ArrayInitializerAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeInt(PrimitiveTypeInt object) {
			return createPrimitiveTypeIntAdapter();
		}

		@Override
		public Adapter caseTypeDependency2UsageDependency(TypeDependency2UsageDependency object) {
			return createTypeDependency2UsageDependencyAdapter();
		}

		@Override
		public Adapter caseAnonymousClass4EnumConst_Abstract(AnonymousClass4EnumConst_Abstract object) {
			return createAnonymousClass4EnumConst_AbstractAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeDeclaration2Interface_WithModifier(
				AnnotationTypeDeclaration2Interface_WithModifier object) {
			return createAnnotationTypeDeclaration2Interface_WithModifierAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_Abstract(InnerDeclaration2InnerClassifier_Abstract object) {
			return createInnerDeclaration2InnerClassifier_AbstractAdapter();
		}

		@Override
		public Adapter caseTypeParameter2Object_InMethod_InInterface(TypeParameter2Object_InMethod_InInterface object) {
			return createTypeParameter2Object_InMethod_InInterfaceAdapter();
		}

		@Override
		public Adapter caseOrphanedClassDec2OrphanedClass(OrphanedClassDec2OrphanedClass object) {
			return createOrphanedClassDec2OrphanedClassAdapter();
		}

		@Override
		public Adapter caseFieldDec2Property(FieldDec2Property object) {
			return createFieldDec2PropertyAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Class_InnerTypeInInterface(
				ParameterizedType2Class_InnerTypeInInterface object) {
			return createParameterizedType2Class_InnerTypeInInterfaceAdapter();
		}

		@Override
		public Adapter caseUnresolvedTypeDeclaration2Type(UnresolvedTypeDeclaration2Type object) {
			return createUnresolvedTypeDeclaration2TypeAdapter();
		}

		@Override
		public Adapter caseLinkTypeToPackage(LinkTypeToPackage object) {
			return createLinkTypeToPackageAdapter();
		}

		@Override
		public Adapter caseJavaAnnotation2Comment_Abstract(JavaAnnotation2Comment_Abstract object) {
			return createJavaAnnotation2Comment_AbstractAdapter();
		}

		@Override
		public Adapter caseOperationInEnum(OperationInEnum object) {
			return createOperationInEnumAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeByte(PrimitiveTypeByte object) {
			return createPrimitiveTypeByteAdapter();
		}

		@Override
		public Adapter caseInnerDeclaration2InnerClassifier_InMethod4IAnonymous(
				InnerDeclaration2InnerClassifier_InMethod4IAnonymous object) {
			return createInnerDeclaration2InnerClassifier_InMethod4IAnonymousAdapter();
		}

		@Override
		public Adapter caseJavaAnnotationValue2Comment(JavaAnnotationValue2Comment object) {
			return createJavaAnnotationValue2CommentAdapter();
		}

		@Override
		public Adapter caseFieldDec2Property_WithModifier(FieldDec2Property_WithModifier object) {
			return createFieldDec2Property_WithModifierAdapter();
		}

		@Override
		public Adapter caseTypeAccess2InterfaceRealization(TypeAccess2InterfaceRealization object) {
			return createTypeAccess2InterfaceRealizationAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Interface(ParameterizedType2Interface object) {
			return createParameterizedType2InterfaceAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeVoid(PrimitiveTypeVoid object) {
			return createPrimitiveTypeVoidAdapter();
		}

		@Override
		public Adapter caseParameterizedType2Class_InnerTypeInClass(ParameterizedType2Class_InnerTypeInClass object) {
			return createParameterizedType2Class_InnerTypeInClassAdapter();
		}

		@Override
		public Adapter caseMethodDec2Operation(MethodDec2Operation object) {
			return createMethodDec2OperationAdapter();
		}

		@Override
		public Adapter caseJavaAnnotation2Comment4BodyDeclaration(JavaAnnotation2Comment4BodyDeclaration object) {
			return createJavaAnnotation2Comment4BodyDeclarationAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeDouble(PrimitiveTypeDouble object) {
			return createPrimitiveTypeDoubleAdapter();
		}

		@Override
		public Adapter caseConstructorDec2OperationWithModifier(ConstructorDec2OperationWithModifier object) {
			return createConstructorDec2OperationWithModifierAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.AnonymousClass4_Abstract <em>Anonymous Class4 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.AnonymousClass4_Abstract
	 * @generated
	 */
	public Adapter createAnonymousClass4_AbstractAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.VariableDec2Parameter4 <em>Variable Dec2 Parameter4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.VariableDec2Parameter4
	 * @generated
	 */
	public Adapter createVariableDec2Parameter4Adapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ClassDecWithModifier2Class <em>Class Dec With Modifier2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ClassDecWithModifier2Class
	 * @generated
	 */
	public Adapter createClassDecWithModifier2ClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InClass <em>Inner Declaration2 Inner Classifier In Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InClass
	 * @generated
	 */
	public Adapter createInnerDeclaration2InnerClassifier_InClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InInterface <em>Inner Declaration2 Inner Classifier In Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InInterface
	 * @generated
	 */
	public Adapter createInnerDeclaration2InnerClassifier_InInterfaceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation <em>Constructor Dec2 Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation
	 * @generated
	 */
	public Adapter createConstructorDec2OperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InEnum <em>Inner Declaration2 Inner Classifier In Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InEnum
	 * @generated
	 */
	public Adapter createInnerDeclaration2InnerClassifier_InEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.OrphandedPrimitive2PrimitiveType <em>Orphanded Primitive2 Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.OrphandedPrimitive2PrimitiveType
	 * @generated
	 */
	public Adapter createOrphandedPrimitive2PrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.AnonymousClass4EnumConstInPackage <em>Anonymous Class4 Enum Const In Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.AnonymousClass4EnumConstInPackage
	 * @generated
	 */
	public Adapter createAnonymousClass4EnumConstInPackageAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InMethod4Interface <em>Inner Declaration2 Inner Classifier In Method4 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InMethod4Interface
	 * @generated
	 */
	public Adapter createInnerDeclaration2InnerClassifier_InMethod4InterfaceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InAnonymous <em>Inner Declaration2 Inner Classifier In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InAnonymous
	 * @generated
	 */
	public Adapter createInnerDeclaration2InnerClassifier_InAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.OperationInAnnotationType <em>Operation In Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.OperationInAnnotationType
	 * @generated
	 */
	public Adapter createOperationInAnnotationTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.AnonymousClass4Class <em>Anonymous Class4 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.AnonymousClass4Class
	 * @generated
	 */
	public Adapter createAnonymousClass4ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InMethod4Class <em>Inner Declaration2 Inner Classifier In Method4 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InMethod4Class
	 * @generated
	 */
	public Adapter createInnerDeclaration2InnerClassifier_InMethod4ClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.OrphanedTypeDec2OrphanedType_Abstract <em>Orphaned Type Dec2 Orphaned Type Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.OrphanedTypeDec2OrphanedType_Abstract
	 * @generated
	 */
	public Adapter createOrphanedTypeDec2OrphanedType_AbstractAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.AbstractTypeAccess2ReturnParam <em>Abstract Type Access2 Return Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.AbstractTypeAccess2ReturnParam
	 * @generated
	 */
	public Adapter createAbstractTypeAccess2ReturnParamAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.AnonymousClass4Interface <em>Anonymous Class4 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.AnonymousClass4Interface
	 * @generated
	 */
	public Adapter createAnonymousClass4InterfaceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.OperationInClass <em>Operation In Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.OperationInClass
	 * @generated
	 */
	public Adapter createOperationInClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.AnonymousClass4EnumConstInType <em>Anonymous Class4 Enum Const In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.AnonymousClass4EnumConstInType
	 * @generated
	 */
	public Adapter createAnonymousClass4EnumConstInTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ClassDec2Class <em>Class Dec2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ClassDec2Class
	 * @generated
	 */
	public Adapter createClassDec2ClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.OperationInAnonymous <em>Operation In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.OperationInAnonymous
	 * @generated
	 */
	public Adapter createOperationInAnonymousAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InAnnotationType <em>Inner Declaration2 Inner Classifier In Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InAnnotationType
	 * @generated
	 */
	public Adapter createInnerDeclaration2InnerClassifier_InAnnotationTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.MethodDec2OperationWithModifier <em>Method Dec2 Operation With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.MethodDec2OperationWithModifier
	 * @generated
	 */
	public Adapter createMethodDec2OperationWithModifierAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.OperationInInterface <em>Operation In Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.OperationInInterface
	 * @generated
	 */
	public Adapter createOperationInInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4_Anonymous <em>Field Dec2 Property4 Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4_Anonymous
	 * @generated
	 */
	public Adapter createFieldDec2Property4_AnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.AnonymousClass4Anonymous <em>Anonymous Class4 Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.AnonymousClass4Anonymous
	 * @generated
	 */
	public Adapter createAnonymousClass4AnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.IgnoreClassInstanceCreation4ArrayInitializer <em>Ignore Class Instance Creation4 Array Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.IgnoreClassInstanceCreation4ArrayInitializer
	 * @generated
	 */
	public Adapter createIgnoreClassInstanceCreation4ArrayInitializerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.AnonymousClass4EnumConst_Abstract <em>Anonymous Class4 Enum Const Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.AnonymousClass4EnumConst_Abstract
	 * @generated
	 */
	public Adapter createAnonymousClass4EnumConst_AbstractAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.FieldDec2Property <em>Field Dec2 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.FieldDec2Property
	 * @generated
	 */
	public Adapter createFieldDec2PropertyAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.UnresolvedTypeDeclaration2Type <em>Unresolved Type Declaration2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.UnresolvedTypeDeclaration2Type
	 * @generated
	 */
	public Adapter createUnresolvedTypeDeclaration2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.LinkTypeToPackage <em>Link Type To Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.LinkTypeToPackage
	 * @generated
	 */
	public Adapter createLinkTypeToPackageAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.OperationInEnum <em>Operation In Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.OperationInEnum
	 * @generated
	 */
	public Adapter createOperationInEnumAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InMethod4IAnonymous <em>Inner Declaration2 Inner Classifier In Method4 IAnonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InMethod4IAnonymous
	 * @generated
	 */
	public Adapter createInnerDeclaration2InnerClassifier_InMethod4IAnonymousAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.FieldDec2Property_WithModifier <em>Field Dec2 Property With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.FieldDec2Property_WithModifier
	 * @generated
	 */
	public Adapter createFieldDec2Property_WithModifierAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation <em>Method Dec2 Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation
	 * @generated
	 */
	public Adapter createMethodDec2OperationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.uml.Rules.ConstructorDec2OperationWithModifier <em>Constructor Dec2 Operation With Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.uml.Rules.ConstructorDec2OperationWithModifier
	 * @generated
	 */
	public Adapter createConstructorDec2OperationWithModifierAdapter() {
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
