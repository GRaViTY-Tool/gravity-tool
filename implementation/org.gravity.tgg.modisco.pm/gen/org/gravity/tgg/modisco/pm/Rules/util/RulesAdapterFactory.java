/**
 */
package org.gravity.tgg.modisco.pm.Rules.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.tgg.modisco.pm.Rules.*;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.pm.Rules.RulesPackage
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
		public Adapter caseAnnotationMemberValueNumber(AnnotationMemberValueNumber object) {
			return createAnnotationMemberValueNumberAdapter();
		}

		@Override
		public Adapter caseAbstractAnnotationTypeAccess(AbstractAnnotationTypeAccess object) {
			return createAbstractAnnotationTypeAccessAdapter();
		}

		@Override
		public Adapter caseClassInstanceCreation(ClassInstanceCreation object) {
			return createClassInstanceCreationAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueArray(AnnotationMemberValueArray object) {
			return createAnnotationMemberValueArrayAdapter();
		}

		@Override
		public Adapter caseSubPackageToPGPackage(SubPackageToPGPackage object) {
			return createSubPackageToPGPackageAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueClassArray(AnnotationMemberValueClassArray object) {
			return createAnnotationMemberValueClassArrayAdapter();
		}

		@Override
		public Adapter caseInterfaceMember(InterfaceMember object) {
			return createInterfaceMemberAdapter();
		}

		@Override
		public Adapter caseSuperMethodInvocation(SuperMethodInvocation object) {
			return createSuperMethodInvocationAdapter();
		}

		@Override
		public Adapter caseClassInnerClassMember(ClassInnerClassMember object) {
			return createClassInnerClassMemberAdapter();
		}

		@Override
		public Adapter caseLinkDefinitionToAnonymous(LinkDefinitionToAnonymous object) {
			return createLinkDefinitionToAnonymousAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeAccessOnSelf(AnnotationTypeAccessOnSelf object) {
			return createAnnotationTypeAccessOnSelfAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValue(AnnotationMemberValue object) {
			return createAnnotationMemberValueAdapter();
		}

		@Override
		public Adapter caseMethodOverriding(MethodOverriding object) {
			return createMethodOverridingAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsChar(PrimitiveTypeIsChar object) {
			return createPrimitiveTypeIsCharAdapter();
		}

		@Override
		public Adapter caseFieldAccess(FieldAccess object) {
			return createFieldAccessAdapter();
		}

		@Override
		public Adapter caseAnonymousClassTypeClass(AnonymousClassTypeClass object) {
			return createAnonymousClassTypeClassAdapter();
		}

		@Override
		public Adapter caseMemberInClassVisibility(MemberInClassVisibility object) {
			return createMemberInClassVisibilityAdapter();
		}

		@Override
		public Adapter caseTypeNestedInAnonymous_Abstract(TypeNestedInAnonymous_Abstract object) {
			return createTypeNestedInAnonymous_AbstractAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsBoolean(PrimitiveTypeIsBoolean object) {
			return createPrimitiveTypeIsBooleanAdapter();
		}

		@Override
		public Adapter casePrimitiveTypesIsVoid(PrimitiveTypesIsVoid object) {
			return createPrimitiveTypesIsVoidAdapter();
		}

		@Override
		public Adapter caseMethodParameter(MethodParameter object) {
			return createMethodParameterAdapter();
		}

		@Override
		public Adapter caseVariableDeclarationFragment(VariableDeclarationFragment object) {
			return createVariableDeclarationFragmentAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsByte(PrimitiveTypeIsByte object) {
			return createPrimitiveTypeIsByteAdapter();
		}

		@Override
		public Adapter caseMethodParameterLinkFirst(MethodParameterLinkFirst object) {
			return createMethodParameterLinkFirstAdapter();
		}

		@Override
		public Adapter caseFieldAccessReadWrite(FieldAccessReadWrite object) {
			return createFieldAccessReadWriteAdapter();
		}

		@Override
		public Adapter caseEnumInAnonymous(EnumInAnonymous object) {
			return createEnumInAnonymousAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueNumberArray(AnnotationMemberValueNumberArray object) {
			return createAnnotationMemberValueNumberArrayAdapter();
		}

		@Override
		public Adapter caseConstructorInvocation(ConstructorInvocation object) {
			return createConstructorInvocationAdapter();
		}

		@Override
		public Adapter caseUnresolvedTypeDeclaration(UnresolvedTypeDeclaration object) {
			return createUnresolvedTypeDeclarationAdapter();
		}

		@Override
		public Adapter caseInitializer(Initializer object) {
			return createInitializerAdapter();
		}

		@Override
		public Adapter caseTypesOrphaned(TypesOrphaned object) {
			return createTypesOrphanedAdapter();
		}

		@Override
		public Adapter caseClassInPackage(ClassInPackage object) {
			return createClassInPackageAdapter();
		}

		@Override
		public Adapter caseAnonymousClassType(AnonymousClassType object) {
			return createAnonymousClassTypeAdapter();
		}

		@Override
		public Adapter caseInterfaceExtendsInterface(InterfaceExtendsInterface object) {
			return createInterfaceExtendsInterfaceAdapter();
		}

		@Override
		public Adapter caseTypeParameter(TypeParameter object) {
			return createTypeParameterAdapter();
		}

		@Override
		public Adapter caseFlowNode(FlowNode object) {
			return createFlowNodeAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeInAnonymous(AnnotationTypeInAnonymous object) {
			return createAnnotationTypeInAnonymousAdapter();
		}

		@Override
		public Adapter caseClassInnerAnonClassMember(ClassInnerAnonClassMember object) {
			return createClassInnerAnonClassMemberAdapter();
		}

		@Override
		public Adapter caseAnonymousClassInType(AnonymousClassInType object) {
			return createAnonymousClassInTypeAdapter();
		}

		@Override
		public Adapter caseOrphanedEnum(OrphanedEnum object) {
			return createOrphanedEnumAdapter();
		}

		@Override
		public Adapter caseClassImplementsInterface(ClassImplementsInterface object) {
			return createClassImplementsInterfaceAdapter();
		}

		@Override
		public Adapter caseClassImplementsPatrameterizedInterface(ClassImplementsPatrameterizedInterface object) {
			return createClassImplementsPatrameterizedInterfaceAdapter();
		}

		@Override
		public Adapter caseParameterizedTypeToType(ParameterizedTypeToType object) {
			return createParameterizedTypeToTypeAdapter();
		}

		@Override
		public Adapter caseTypeNestedInType_Abstract(TypeNestedInType_Abstract object) {
			return createTypeNestedInType_AbstractAdapter();
		}

		@Override
		public Adapter caseEnumInPackage(EnumInPackage object) {
			return createEnumInPackageAdapter();
		}

		@Override
		public Adapter caseInterfaceInAnonymous(InterfaceInAnonymous object) {
			return createInterfaceInAnonymousAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueString(AnnotationMemberValueString object) {
			return createAnnotationMemberValueStringAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsDouble(PrimitiveTypeIsDouble object) {
			return createPrimitiveTypeIsDoubleAdapter();
		}

		@Override
		public Adapter caseMemberInEnumVisibility(MemberInEnumVisibility object) {
			return createMemberInEnumVisibilityAdapter();
		}

		@Override
		public Adapter caseNestedInterfaceInType(NestedInterfaceInType object) {
			return createNestedInterfaceInTypeAdapter();
		}

		@Override
		public Adapter caseEnumConstant(EnumConstant object) {
			return createEnumConstantAdapter();
		}

		@Override
		public Adapter caseTextAnnotations(TextAnnotations object) {
			return createTextAnnotationsAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueAnnotationArray(AnnotationMemberValueAnnotationArray object) {
			return createAnnotationMemberValueAnnotationArrayAdapter();
		}

		@Override
		public Adapter caseFieldSignature(FieldSignature object) {
			return createFieldSignatureAdapter();
		}

		@Override
		public Adapter caseAnonymousEnumConstant(AnonymousEnumConstant object) {
			return createAnonymousEnumConstantAdapter();
		}

		@Override
		public Adapter caseInterfaceInPackage(InterfaceInPackage object) {
			return createInterfaceInPackageAdapter();
		}

		@Override
		public Adapter caseClassExtendsClass(ClassExtendsClass object) {
			return createClassExtendsClassAdapter();
		}

		@Override
		public Adapter caseClassInAnonymous(ClassInAnonymous object) {
			return createClassInAnonymousAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueBoolean(AnnotationMemberValueBoolean object) {
			return createAnnotationMemberValueBooleanAdapter();
		}

		@Override
		public Adapter caseAbstractMethodDefinition(AbstractMethodDefinition object) {
			return createAbstractMethodDefinitionAdapter();
		}

		@Override
		public Adapter caseMethodParameterLink(MethodParameterLink object) {
			return createMethodParameterLinkAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueBooleanArray(AnnotationMemberValueBooleanArray object) {
			return createAnnotationMemberValueBooleanArrayAdapter();
		}

		@Override
		public Adapter caseTypesVisibility(TypesVisibility object) {
			return createTypesVisibilityAdapter();
		}

		@Override
		public Adapter caseOrphanedInterface(OrphanedInterface object) {
			return createOrphanedInterfaceAdapter();
		}

		@Override
		public Adapter caseMethodDefinition(MethodDefinition object) {
			return createMethodDefinitionAdapter();
		}

		@Override
		public Adapter caseFieldName(FieldName object) {
			return createFieldNameAdapter();
		}

		@Override
		public Adapter caseAnonymousClass(AnonymousClass object) {
			return createAnonymousClassAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueClass(AnnotationMemberValueClass object) {
			return createAnnotationMemberValueClassAdapter();
		}

		@Override
		public Adapter caseMemberInAnnotationVisibility(MemberInAnnotationVisibility object) {
			return createMemberInAnnotationVisibilityAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsInt(PrimitiveTypeIsInt object) {
			return createPrimitiveTypeIsIntAdapter();
		}

		@Override
		public Adapter caseUnresolvedMethodDeclaration(UnresolvedMethodDeclaration object) {
			return createUnresolvedMethodDeclarationAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeNested(AnnotationTypeNested object) {
			return createAnnotationTypeNestedAdapter();
		}

		@Override
		public Adapter caseNestedEnumInType(NestedEnumInType object) {
			return createNestedEnumInTypeAdapter();
		}

		@Override
		public Adapter caseConstructorDefinition(ConstructorDefinition object) {
			return createConstructorDefinitionAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueStringArray(AnnotationMemberValueStringArray object) {
			return createAnnotationMemberValueStringArrayAdapter();
		}

		@Override
		public Adapter caseArrayTypeToType(ArrayTypeToType object) {
			return createArrayTypeToTypeAdapter();
		}

		@Override
		public Adapter caseSuperConstructorInvocation(SuperConstructorInvocation object) {
			return createSuperConstructorInvocationAdapter();
		}

		@Override
		public Adapter casePackageToPGPackage(PackageToPGPackage object) {
			return createPackageToPGPackageAdapter();
		}

		@Override
		public Adapter caseTypeInPackage_Abstract(TypeInPackage_Abstract object) {
			return createTypeInPackage_AbstractAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeInPackage(AnnotationTypeInPackage object) {
			return createAnnotationTypeInPackageAdapter();
		}

		@Override
		public Adapter caseMethodInvocationTarget(MethodInvocationTarget object) {
			return createMethodInvocationTargetAdapter();
		}

		@Override
		public Adapter caseFieldAccessWrite(FieldAccessWrite object) {
			return createFieldAccessWriteAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsShort(PrimitiveTypeIsShort object) {
			return createPrimitiveTypeIsShortAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberKey(AnnotationMemberKey object) {
			return createAnnotationMemberKeyAdapter();
		}

		@Override
		public Adapter caseInitializerInAnonymous(InitializerInAnonymous object) {
			return createInitializerInAnonymousAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsLong(PrimitiveTypeIsLong object) {
			return createPrimitiveTypeIsLongAdapter();
		}

		@Override
		public Adapter caseAnonymousClassInAnonymous(AnonymousClassInAnonymous object) {
			return createAnonymousClassInAnonymousAdapter();
		}

		@Override
		public Adapter caseClassInnerMember(ClassInnerMember object) {
			return createClassInnerMemberAdapter();
		}

		@Override
		public Adapter caseNestedClassInType(NestedClassInType object) {
			return createNestedClassInTypeAdapter();
		}

		@Override
		public Adapter caseClassImplementsInterface_Abstract(ClassImplementsInterface_Abstract object) {
			return createClassImplementsInterface_AbstractAdapter();
		}

		@Override
		public Adapter caseMethodInvocationStaticType(MethodInvocationStaticType object) {
			return createMethodInvocationStaticTypeAdapter();
		}

		@Override
		public Adapter caseOrphanedClass(OrphanedClass object) {
			return createOrphanedClassAdapter();
		}

		@Override
		public Adapter casePrimitiveType_Abstract(PrimitiveType_Abstract object) {
			return createPrimitiveType_AbstractAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeAccessOnBodyDecl(AnnotationTypeAccessOnBodyDecl object) {
			return createAnnotationTypeAccessOnBodyDeclAdapter();
		}

		@Override
		public Adapter caseDataFlowIn(DataFlowIn object) {
			return createDataFlowInAdapter();
		}

		@Override
		public Adapter caseLinkDefinitionToType(LinkDefinitionToType object) {
			return createLinkDefinitionToTypeAdapter();
		}

		@Override
		public Adapter caseFieldAccessRead(FieldAccessRead object) {
			return createFieldAccessReadAdapter();
		}

		@Override
		public Adapter caseInitializerInType(InitializerInType object) {
			return createInitializerInTypeAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeAccessOnAnnotation(AnnotationTypeAccessOnAnnotation object) {
			return createAnnotationTypeAccessOnAnnotationAdapter();
		}

		@Override
		public Adapter caseUnresolvedInterfaceDeclaration(UnresolvedInterfaceDeclaration object) {
			return createUnresolvedInterfaceDeclarationAdapter();
		}

		@Override
		public Adapter caseAnnotation(Annotation object) {
			return createAnnotationAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueAnnotation(AnnotationMemberValueAnnotation object) {
			return createAnnotationMemberValueAnnotationAdapter();
		}

		@Override
		public Adapter caseFieldDefinition(FieldDefinition object) {
			return createFieldDefinitionAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsFloat(PrimitiveTypeIsFloat object) {
			return createPrimitiveTypeIsFloatAdapter();
		}

		@Override
		public Adapter caseAbstractMethodInvocation(AbstractMethodInvocation object) {
			return createAbstractMethodInvocationAdapter();
		}

		@Override
		public Adapter caseDataFlowOut(DataFlowOut object) {
			return createDataFlowOutAdapter();
		}

		@Override
		public Adapter caseMethodSignature(MethodSignature object) {
			return createMethodSignatureAdapter();
		}

		@Override
		public Adapter caseSyntethicMethod(SyntethicMethod object) {
			return createSyntethicMethodAdapter();
		}

		@Override
		public Adapter caseMethodName(MethodName object) {
			return createMethodNameAdapter();
		}

		@Override
		public Adapter caseUnresolvedClassDeclaration(UnresolvedClassDeclaration object) {
			return createUnresolvedClassDeclarationAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeMember(AnnotationTypeMember object) {
			return createAnnotationTypeMemberAdapter();
		}

		@Override
		public Adapter caseArrayInitializerIgnoreExpressionsEdge(ArrayInitializerIgnoreExpressionsEdge object) {
			return createArrayInitializerIgnoreExpressionsEdgeAdapter();
		}

		@Override
		public Adapter caseMethodInvocation(MethodInvocation object) {
			return createMethodInvocationAdapter();
		}

		@Override
		public Adapter caseAnonymousClassTypeInterface(AnonymousClassTypeInterface object) {
			return createAnonymousClassTypeInterfaceAdapter();
		}

		@Override
		public Adapter caseModelToPg(ModelToPg object) {
			return createModelToPgAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueNumber <em>Annotation Member Value Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueNumber
	 * @generated
	 */
	public Adapter createAnnotationMemberValueNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AbstractAnnotationTypeAccess <em>Abstract Annotation Type Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AbstractAnnotationTypeAccess
	 * @generated
	 */
	public Adapter createAbstractAnnotationTypeAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ClassInstanceCreation <em>Class Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ClassInstanceCreation
	 * @generated
	 */
	public Adapter createClassInstanceCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueArray <em>Annotation Member Value Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueArray
	 * @generated
	 */
	public Adapter createAnnotationMemberValueArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.SubPackageToPGPackage <em>Sub Package To PG Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.SubPackageToPGPackage
	 * @generated
	 */
	public Adapter createSubPackageToPGPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueClassArray <em>Annotation Member Value Class Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueClassArray
	 * @generated
	 */
	public Adapter createAnnotationMemberValueClassArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.InterfaceMember <em>Interface Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.InterfaceMember
	 * @generated
	 */
	public Adapter createInterfaceMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.SuperMethodInvocation <em>Super Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.SuperMethodInvocation
	 * @generated
	 */
	public Adapter createSuperMethodInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ClassInnerClassMember <em>Class Inner Class Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ClassInnerClassMember
	 * @generated
	 */
	public Adapter createClassInnerClassMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.LinkDefinitionToAnonymous <em>Link Definition To Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.LinkDefinitionToAnonymous
	 * @generated
	 */
	public Adapter createLinkDefinitionToAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationTypeAccessOnSelf <em>Annotation Type Access On Self</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationTypeAccessOnSelf
	 * @generated
	 */
	public Adapter createAnnotationTypeAccessOnSelfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValue <em>Annotation Member Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValue
	 * @generated
	 */
	public Adapter createAnnotationMemberValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MethodOverriding <em>Method Overriding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MethodOverriding
	 * @generated
	 */
	public Adapter createMethodOverridingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsChar <em>Primitive Type Is Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsChar
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.FieldAccess <em>Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.FieldAccess
	 * @generated
	 */
	public Adapter createFieldAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnonymousClassTypeClass <em>Anonymous Class Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnonymousClassTypeClass
	 * @generated
	 */
	public Adapter createAnonymousClassTypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MemberInClassVisibility <em>Member In Class Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MemberInClassVisibility
	 * @generated
	 */
	public Adapter createMemberInClassVisibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.TypeNestedInAnonymous_Abstract <em>Type Nested In Anonymous Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.TypeNestedInAnonymous_Abstract
	 * @generated
	 */
	public Adapter createTypeNestedInAnonymous_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsBoolean <em>Primitive Type Is Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsBoolean
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.PrimitiveTypesIsVoid <em>Primitive Types Is Void</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.PrimitiveTypesIsVoid
	 * @generated
	 */
	public Adapter createPrimitiveTypesIsVoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MethodParameter <em>Method Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MethodParameter
	 * @generated
	 */
	public Adapter createMethodParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.VariableDeclarationFragment <em>Variable Declaration Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.VariableDeclarationFragment
	 * @generated
	 */
	public Adapter createVariableDeclarationFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsByte <em>Primitive Type Is Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsByte
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MethodParameterLinkFirst <em>Method Parameter Link First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MethodParameterLinkFirst
	 * @generated
	 */
	public Adapter createMethodParameterLinkFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.FieldAccessReadWrite <em>Field Access Read Write</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.FieldAccessReadWrite
	 * @generated
	 */
	public Adapter createFieldAccessReadWriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.EnumInAnonymous <em>Enum In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.EnumInAnonymous
	 * @generated
	 */
	public Adapter createEnumInAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueNumberArray <em>Annotation Member Value Number Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueNumberArray
	 * @generated
	 */
	public Adapter createAnnotationMemberValueNumberArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ConstructorInvocation <em>Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ConstructorInvocation
	 * @generated
	 */
	public Adapter createConstructorInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.UnresolvedTypeDeclaration <em>Unresolved Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.UnresolvedTypeDeclaration
	 * @generated
	 */
	public Adapter createUnresolvedTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.Initializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.Initializer
	 * @generated
	 */
	public Adapter createInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.TypesOrphaned <em>Types Orphaned</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.TypesOrphaned
	 * @generated
	 */
	public Adapter createTypesOrphanedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ClassInPackage <em>Class In Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ClassInPackage
	 * @generated
	 */
	public Adapter createClassInPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnonymousClassType <em>Anonymous Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnonymousClassType
	 * @generated
	 */
	public Adapter createAnonymousClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.InterfaceExtendsInterface <em>Interface Extends Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.InterfaceExtendsInterface
	 * @generated
	 */
	public Adapter createInterfaceExtendsInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.TypeParameter
	 * @generated
	 */
	public Adapter createTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationTypeInAnonymous <em>Annotation Type In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationTypeInAnonymous
	 * @generated
	 */
	public Adapter createAnnotationTypeInAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ClassInnerAnonClassMember <em>Class Inner Anon Class Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ClassInnerAnonClassMember
	 * @generated
	 */
	public Adapter createClassInnerAnonClassMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnonymousClassInType <em>Anonymous Class In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnonymousClassInType
	 * @generated
	 */
	public Adapter createAnonymousClassInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.OrphanedEnum <em>Orphaned Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.OrphanedEnum
	 * @generated
	 */
	public Adapter createOrphanedEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ClassImplementsInterface <em>Class Implements Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ClassImplementsInterface
	 * @generated
	 */
	public Adapter createClassImplementsInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ClassImplementsPatrameterizedInterface <em>Class Implements Patrameterized Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ClassImplementsPatrameterizedInterface
	 * @generated
	 */
	public Adapter createClassImplementsPatrameterizedInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ParameterizedTypeToType <em>Parameterized Type To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ParameterizedTypeToType
	 * @generated
	 */
	public Adapter createParameterizedTypeToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.TypeNestedInType_Abstract <em>Type Nested In Type Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.TypeNestedInType_Abstract
	 * @generated
	 */
	public Adapter createTypeNestedInType_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.EnumInPackage <em>Enum In Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.EnumInPackage
	 * @generated
	 */
	public Adapter createEnumInPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.InterfaceInAnonymous <em>Interface In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.InterfaceInAnonymous
	 * @generated
	 */
	public Adapter createInterfaceInAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueString <em>Annotation Member Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueString
	 * @generated
	 */
	public Adapter createAnnotationMemberValueStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsDouble <em>Primitive Type Is Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsDouble
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MemberInEnumVisibility <em>Member In Enum Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MemberInEnumVisibility
	 * @generated
	 */
	public Adapter createMemberInEnumVisibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.NestedInterfaceInType <em>Nested Interface In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.NestedInterfaceInType
	 * @generated
	 */
	public Adapter createNestedInterfaceInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.EnumConstant <em>Enum Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.EnumConstant
	 * @generated
	 */
	public Adapter createEnumConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.TextAnnotations <em>Text Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.TextAnnotations
	 * @generated
	 */
	public Adapter createTextAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueAnnotationArray <em>Annotation Member Value Annotation Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueAnnotationArray
	 * @generated
	 */
	public Adapter createAnnotationMemberValueAnnotationArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.FieldSignature <em>Field Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.FieldSignature
	 * @generated
	 */
	public Adapter createFieldSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnonymousEnumConstant <em>Anonymous Enum Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnonymousEnumConstant
	 * @generated
	 */
	public Adapter createAnonymousEnumConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.InterfaceInPackage <em>Interface In Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.InterfaceInPackage
	 * @generated
	 */
	public Adapter createInterfaceInPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ClassExtendsClass <em>Class Extends Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ClassExtendsClass
	 * @generated
	 */
	public Adapter createClassExtendsClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ClassInAnonymous <em>Class In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ClassInAnonymous
	 * @generated
	 */
	public Adapter createClassInAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueBoolean <em>Annotation Member Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueBoolean
	 * @generated
	 */
	public Adapter createAnnotationMemberValueBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AbstractMethodDefinition <em>Abstract Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AbstractMethodDefinition
	 * @generated
	 */
	public Adapter createAbstractMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MethodParameterLink <em>Method Parameter Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MethodParameterLink
	 * @generated
	 */
	public Adapter createMethodParameterLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueBooleanArray <em>Annotation Member Value Boolean Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueBooleanArray
	 * @generated
	 */
	public Adapter createAnnotationMemberValueBooleanArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.TypesVisibility <em>Types Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.TypesVisibility
	 * @generated
	 */
	public Adapter createTypesVisibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.OrphanedInterface <em>Orphaned Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.OrphanedInterface
	 * @generated
	 */
	public Adapter createOrphanedInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MethodDefinition <em>Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MethodDefinition
	 * @generated
	 */
	public Adapter createMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.FieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.FieldName
	 * @generated
	 */
	public Adapter createFieldNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnonymousClass <em>Anonymous Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnonymousClass
	 * @generated
	 */
	public Adapter createAnonymousClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueClass <em>Annotation Member Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueClass
	 * @generated
	 */
	public Adapter createAnnotationMemberValueClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MemberInAnnotationVisibility <em>Member In Annotation Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MemberInAnnotationVisibility
	 * @generated
	 */
	public Adapter createMemberInAnnotationVisibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsInt <em>Primitive Type Is Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsInt
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.UnresolvedMethodDeclaration <em>Unresolved Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.UnresolvedMethodDeclaration
	 * @generated
	 */
	public Adapter createUnresolvedMethodDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationTypeNested <em>Annotation Type Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationTypeNested
	 * @generated
	 */
	public Adapter createAnnotationTypeNestedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.NestedEnumInType <em>Nested Enum In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.NestedEnumInType
	 * @generated
	 */
	public Adapter createNestedEnumInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ConstructorDefinition <em>Constructor Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ConstructorDefinition
	 * @generated
	 */
	public Adapter createConstructorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueStringArray <em>Annotation Member Value String Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueStringArray
	 * @generated
	 */
	public Adapter createAnnotationMemberValueStringArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ArrayTypeToType <em>Array Type To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ArrayTypeToType
	 * @generated
	 */
	public Adapter createArrayTypeToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.SuperConstructorInvocation <em>Super Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.SuperConstructorInvocation
	 * @generated
	 */
	public Adapter createSuperConstructorInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.PackageToPGPackage <em>Package To PG Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.PackageToPGPackage
	 * @generated
	 */
	public Adapter createPackageToPGPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.TypeInPackage_Abstract <em>Type In Package Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.TypeInPackage_Abstract
	 * @generated
	 */
	public Adapter createTypeInPackage_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationTypeInPackage <em>Annotation Type In Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationTypeInPackage
	 * @generated
	 */
	public Adapter createAnnotationTypeInPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MethodInvocationTarget <em>Method Invocation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MethodInvocationTarget
	 * @generated
	 */
	public Adapter createMethodInvocationTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.FieldAccessWrite <em>Field Access Write</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.FieldAccessWrite
	 * @generated
	 */
	public Adapter createFieldAccessWriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsShort <em>Primitive Type Is Short</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsShort
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberKey <em>Annotation Member Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberKey
	 * @generated
	 */
	public Adapter createAnnotationMemberKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.InitializerInAnonymous <em>Initializer In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.InitializerInAnonymous
	 * @generated
	 */
	public Adapter createInitializerInAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsLong <em>Primitive Type Is Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsLong
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnonymousClassInAnonymous <em>Anonymous Class In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnonymousClassInAnonymous
	 * @generated
	 */
	public Adapter createAnonymousClassInAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ClassInnerMember <em>Class Inner Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ClassInnerMember
	 * @generated
	 */
	public Adapter createClassInnerMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.NestedClassInType <em>Nested Class In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.NestedClassInType
	 * @generated
	 */
	public Adapter createNestedClassInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ClassImplementsInterface_Abstract <em>Class Implements Interface Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ClassImplementsInterface_Abstract
	 * @generated
	 */
	public Adapter createClassImplementsInterface_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MethodInvocationStaticType <em>Method Invocation Static Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MethodInvocationStaticType
	 * @generated
	 */
	public Adapter createMethodInvocationStaticTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.OrphanedClass <em>Orphaned Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.OrphanedClass
	 * @generated
	 */
	public Adapter createOrphanedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.PrimitiveType_Abstract <em>Primitive Type Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.PrimitiveType_Abstract
	 * @generated
	 */
	public Adapter createPrimitiveType_AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationTypeAccessOnBodyDecl <em>Annotation Type Access On Body Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationTypeAccessOnBodyDecl
	 * @generated
	 */
	public Adapter createAnnotationTypeAccessOnBodyDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.DataFlowIn <em>Data Flow In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.DataFlowIn
	 * @generated
	 */
	public Adapter createDataFlowInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.LinkDefinitionToType <em>Link Definition To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.LinkDefinitionToType
	 * @generated
	 */
	public Adapter createLinkDefinitionToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.FieldAccessRead <em>Field Access Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.FieldAccessRead
	 * @generated
	 */
	public Adapter createFieldAccessReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.InitializerInType <em>Initializer In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.InitializerInType
	 * @generated
	 */
	public Adapter createInitializerInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationTypeAccessOnAnnotation <em>Annotation Type Access On Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationTypeAccessOnAnnotation
	 * @generated
	 */
	public Adapter createAnnotationTypeAccessOnAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.UnresolvedInterfaceDeclaration <em>Unresolved Interface Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.UnresolvedInterfaceDeclaration
	 * @generated
	 */
	public Adapter createUnresolvedInterfaceDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueAnnotation <em>Annotation Member Value Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueAnnotation
	 * @generated
	 */
	public Adapter createAnnotationMemberValueAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.FieldDefinition <em>Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.FieldDefinition
	 * @generated
	 */
	public Adapter createFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsFloat <em>Primitive Type Is Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsFloat
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AbstractMethodInvocation <em>Abstract Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AbstractMethodInvocation
	 * @generated
	 */
	public Adapter createAbstractMethodInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.DataFlowOut <em>Data Flow Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.DataFlowOut
	 * @generated
	 */
	public Adapter createDataFlowOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MethodSignature <em>Method Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MethodSignature
	 * @generated
	 */
	public Adapter createMethodSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.SyntethicMethod <em>Syntethic Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.SyntethicMethod
	 * @generated
	 */
	public Adapter createSyntethicMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MethodName
	 * @generated
	 */
	public Adapter createMethodNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.UnresolvedClassDeclaration <em>Unresolved Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.UnresolvedClassDeclaration
	 * @generated
	 */
	public Adapter createUnresolvedClassDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnnotationTypeMember <em>Annotation Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnnotationTypeMember
	 * @generated
	 */
	public Adapter createAnnotationTypeMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ArrayInitializerIgnoreExpressionsEdge <em>Array Initializer Ignore Expressions Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ArrayInitializerIgnoreExpressionsEdge
	 * @generated
	 */
	public Adapter createArrayInitializerIgnoreExpressionsEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.MethodInvocation <em>Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.MethodInvocation
	 * @generated
	 */
	public Adapter createMethodInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.AnonymousClassTypeInterface <em>Anonymous Class Type Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.AnonymousClassTypeInterface
	 * @generated
	 */
	public Adapter createAnonymousClassTypeInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.Rules.ModelToPg <em>Model To Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.Rules.ModelToPg
	 * @generated
	 */
	public Adapter createModelToPgAdapter() {
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
