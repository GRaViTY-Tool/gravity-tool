/**
 */
package org.gravity.tgg.modisco.Rules.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.tgg.modisco.Rules.AbstractAnnotationTypeAccess;
import org.gravity.tgg.modisco.Rules.AbstractMethodDefinition;
import org.gravity.tgg.modisco.Rules.AbstractMethodInvocation;
import org.gravity.tgg.modisco.Rules.Annotation;
import org.gravity.tgg.modisco.Rules.AnnotationMemberKey;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValue;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueAnnotation;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueAnnotationArray;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueArray;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueBoolean;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueBooleanArray;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueClass;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueClassArray;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueNumber;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueNumberArray;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueString;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueStringArray;
import org.gravity.tgg.modisco.Rules.AnnotationOnBodyDeclaration;
import org.gravity.tgg.modisco.Rules.AnnotationType;
import org.gravity.tgg.modisco.Rules.AnnotationTypeAccessOnAnnotation;
import org.gravity.tgg.modisco.Rules.AnnotationTypeAccessOnBodyDecl;
import org.gravity.tgg.modisco.Rules.AnnotationTypeAccessOnSelf;
import org.gravity.tgg.modisco.Rules.AnnotationTypeInAnonymous;
import org.gravity.tgg.modisco.Rules.AnnotationTypeNested;
import org.gravity.tgg.modisco.Rules.AnonymousClass;
import org.gravity.tgg.modisco.Rules.AnonymousClassType;
import org.gravity.tgg.modisco.Rules.AnonymousClassTypeClass;
import org.gravity.tgg.modisco.Rules.AnonymousClassTypeInterface;
import org.gravity.tgg.modisco.Rules.ArrayInitializerIgnoreExpressionsEdge;
import org.gravity.tgg.modisco.Rules.ArrayTypeToClass;
import org.gravity.tgg.modisco.Rules.ClassExtendsClass;
import org.gravity.tgg.modisco.Rules.ClassImplementsInterface;
import org.gravity.tgg.modisco.Rules.ClassInAnonymous;
import org.gravity.tgg.modisco.Rules.ClassInnerAnonClassMember;
import org.gravity.tgg.modisco.Rules.ClassInnerClassMember;
import org.gravity.tgg.modisco.Rules.ClassInnerMember;
import org.gravity.tgg.modisco.Rules.ClassInstanceCreation;
import org.gravity.tgg.modisco.Rules.ConstructorDefinition;
import org.gravity.tgg.modisco.Rules.ConstructorInvocation;
import org.gravity.tgg.modisco.Rules.DataFlow;
import org.gravity.tgg.modisco.Rules.EnumInAnonymous;
import org.gravity.tgg.modisco.Rules.FieldAccess;
import org.gravity.tgg.modisco.Rules.FieldAccessRead;
import org.gravity.tgg.modisco.Rules.FieldAccessReadWrite;
import org.gravity.tgg.modisco.Rules.FieldAccessWrite;
import org.gravity.tgg.modisco.Rules.FieldDefinition;
import org.gravity.tgg.modisco.Rules.FieldName;
import org.gravity.tgg.modisco.Rules.FieldSignature;
import org.gravity.tgg.modisco.Rules.FieldSignatureAbstract;
import org.gravity.tgg.modisco.Rules.FieldSignatureArrayType;
import org.gravity.tgg.modisco.Rules.FlowNode;
import org.gravity.tgg.modisco.Rules.Interface;
import org.gravity.tgg.modisco.Rules.InterfaceExtendsInterface;
import org.gravity.tgg.modisco.Rules.InterfaceInAnonymous;
import org.gravity.tgg.modisco.Rules.InterfaceMember;
import org.gravity.tgg.modisco.Rules.LinkDefinitionToAnonymous;
import org.gravity.tgg.modisco.Rules.LinkDefinitionToType;
import org.gravity.tgg.modisco.Rules.MemberInAnnotationVisibility;
import org.gravity.tgg.modisco.Rules.MemberInClassVisibility;
import org.gravity.tgg.modisco.Rules.MemberInEnumVisibility;
import org.gravity.tgg.modisco.Rules.MethodDefinition;
import org.gravity.tgg.modisco.Rules.MethodDefinitionReturnArray;
import org.gravity.tgg.modisco.Rules.MethodDefinitionReturnSingle;
import org.gravity.tgg.modisco.Rules.MethodInvocation;
import org.gravity.tgg.modisco.Rules.MethodInvocationRecursive;
import org.gravity.tgg.modisco.Rules.MethodInvocationStaticType;
import org.gravity.tgg.modisco.Rules.MethodInvocationStaticTypeArray;
import org.gravity.tgg.modisco.Rules.MethodInvocationStaticType_abstract;
import org.gravity.tgg.modisco.Rules.MethodName;
import org.gravity.tgg.modisco.Rules.MethodOverriding;
import org.gravity.tgg.modisco.Rules.MethodParameter;
import org.gravity.tgg.modisco.Rules.MethodParameterArrayType;
import org.gravity.tgg.modisco.Rules.MethodParameterLink;
import org.gravity.tgg.modisco.Rules.MethodParameterLinkFirst;
import org.gravity.tgg.modisco.Rules.MethodParameterSingleType;
import org.gravity.tgg.modisco.Rules.MethodSignature;
import org.gravity.tgg.modisco.Rules.MethodSignatureArrayReturn;
import org.gravity.tgg.modisco.Rules.MethodSignatureSingleReturn;
import org.gravity.tgg.modisco.Rules.ModelToPg;
import org.gravity.tgg.modisco.Rules.NestedClassInType;
import org.gravity.tgg.modisco.Rules.NestedEnum;
import org.gravity.tgg.modisco.Rules.NestedInterfaceInType;
import org.gravity.tgg.modisco.Rules.NestedTypes;
import org.gravity.tgg.modisco.Rules.NestedTypesInAnonymous;
import org.gravity.tgg.modisco.Rules.PackageToPGPackage;
import org.gravity.tgg.modisco.Rules.ParameterizedTypeToClass;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsBoolean;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsByte;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsChar;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsDouble;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsFloat;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsInt;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsLong;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsShort;
import org.gravity.tgg.modisco.Rules.PrimitiveTypesIsVoid;
import org.gravity.tgg.modisco.Rules.PrimitiveTypesToClass;
import org.gravity.tgg.modisco.Rules.RulesPackage;
import org.gravity.tgg.modisco.Rules.SubPackageToPGPackage;
import org.gravity.tgg.modisco.Rules.SuperConstructorInvocation;
import org.gravity.tgg.modisco.Rules.SuperMethodInvocation;
import org.gravity.tgg.modisco.Rules.SyntethicMethod;
import org.gravity.tgg.modisco.Rules.TextAnnotations;
import org.gravity.tgg.modisco.Rules.TypeParameter;
import org.gravity.tgg.modisco.Rules.Types;
import org.gravity.tgg.modisco.Rules.TypesOrphaned;
import org.gravity.tgg.modisco.Rules.TypesVisibility;
import org.gravity.tgg.modisco.Rules.UnresolvedMethodDeclaration;
import org.gravity.tgg.modisco.Rules.UnresolvedTypeDeclaration;
import org.gravity.tgg.modisco.Rules.VariableDeclarationFragment;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.Rules.RulesPackage
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
		public Adapter caseMethodInvocationStaticType(MethodInvocationStaticType object) {
			return createMethodInvocationStaticTypeAdapter();
		}

		@Override
		public Adapter caseTypesVisibility(TypesVisibility object) {
			return createTypesVisibilityAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValue(AnnotationMemberValue object) {
			return createAnnotationMemberValueAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeAccessOnBodyDecl(AnnotationTypeAccessOnBodyDecl object) {
			return createAnnotationTypeAccessOnBodyDeclAdapter();
		}

		@Override
		public Adapter caseFieldSignatureArrayType(FieldSignatureArrayType object) {
			return createFieldSignatureArrayTypeAdapter();
		}

		@Override
		public Adapter caseSyntethicMethod(SyntethicMethod object) {
			return createSyntethicMethodAdapter();
		}

		@Override
		public Adapter caseFieldAccessReadWrite(FieldAccessReadWrite object) {
			return createFieldAccessReadWriteAdapter();
		}

		@Override
		public Adapter caseMethodSignatureArrayReturn(MethodSignatureArrayReturn object) {
			return createMethodSignatureArrayReturnAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberKey(AnnotationMemberKey object) {
			return createAnnotationMemberKeyAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsBoolean(PrimitiveTypeIsBoolean object) {
			return createPrimitiveTypeIsBooleanAdapter();
		}

		@Override
		public Adapter casePrimitiveTypesToClass(PrimitiveTypesToClass object) {
			return createPrimitiveTypesToClassAdapter();
		}

		@Override
		public Adapter caseAnnotation(Annotation object) {
			return createAnnotationAdapter();
		}

		@Override
		public Adapter casePackageToPGPackage(PackageToPGPackage object) {
			return createPackageToPGPackageAdapter();
		}

		@Override
		public Adapter caseClassExtendsClass(ClassExtendsClass object) {
			return createClassExtendsClassAdapter();
		}

		@Override
		public Adapter caseTypes(Types object) {
			return createTypesAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueBooleanArray(AnnotationMemberValueBooleanArray object) {
			return createAnnotationMemberValueBooleanArrayAdapter();
		}

		@Override
		public Adapter caseMethodName(MethodName object) {
			return createMethodNameAdapter();
		}

		@Override
		public Adapter caseMethodParameterLink(MethodParameterLink object) {
			return createMethodParameterLinkAdapter();
		}

		@Override
		public Adapter caseMethodParameterSingleType(MethodParameterSingleType object) {
			return createMethodParameterSingleTypeAdapter();
		}

		@Override
		public Adapter caseMethodParameterLinkFirst(MethodParameterLinkFirst object) {
			return createMethodParameterLinkFirstAdapter();
		}

		@Override
		public Adapter caseMethodInvocationStaticTypeArray(MethodInvocationStaticTypeArray object) {
			return createMethodInvocationStaticTypeArrayAdapter();
		}

		@Override
		public Adapter caseClassInAnonymous(ClassInAnonymous object) {
			return createClassInAnonymousAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsLong(PrimitiveTypeIsLong object) {
			return createPrimitiveTypeIsLongAdapter();
		}

		@Override
		public Adapter caseVariableDeclarationFragment(VariableDeclarationFragment object) {
			return createVariableDeclarationFragmentAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueArray(AnnotationMemberValueArray object) {
			return createAnnotationMemberValueArrayAdapter();
		}

		@Override
		public Adapter caseLinkDefinitionToAnonymous(LinkDefinitionToAnonymous object) {
			return createLinkDefinitionToAnonymousAdapter();
		}

		@Override
		public Adapter caseInterfaceInAnonymous(InterfaceInAnonymous object) {
			return createInterfaceInAnonymousAdapter();
		}

		@Override
		public Adapter caseClassInstanceCreation(ClassInstanceCreation object) {
			return createClassInstanceCreationAdapter();
		}

		@Override
		public Adapter caseMethodParameter(MethodParameter object) {
			return createMethodParameterAdapter();
		}

		@Override
		public Adapter caseInterfaceMember(InterfaceMember object) {
			return createInterfaceMemberAdapter();
		}

		@Override
		public Adapter caseClassImplementsInterface(ClassImplementsInterface object) {
			return createClassImplementsInterfaceAdapter();
		}

		@Override
		public Adapter caseSuperConstructorInvocation(SuperConstructorInvocation object) {
			return createSuperConstructorInvocationAdapter();
		}

		@Override
		public Adapter caseMemberInClassVisibility(MemberInClassVisibility object) {
			return createMemberInClassVisibilityAdapter();
		}

		@Override
		public Adapter caseMethodSignature(MethodSignature object) {
			return createMethodSignatureAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueNumber(AnnotationMemberValueNumber object) {
			return createAnnotationMemberValueNumberAdapter();
		}

		@Override
		public Adapter caseMemberInAnnotationVisibility(MemberInAnnotationVisibility object) {
			return createMemberInAnnotationVisibilityAdapter();
		}

		@Override
		public Adapter caseMethodSignatureSingleReturn(MethodSignatureSingleReturn object) {
			return createMethodSignatureSingleReturnAdapter();
		}

		@Override
		public Adapter caseFlowNode(FlowNode object) {
			return createFlowNodeAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueNumberArray(AnnotationMemberValueNumberArray object) {
			return createAnnotationMemberValueNumberArrayAdapter();
		}

		@Override
		public Adapter caseAbstractMethodDefinition(AbstractMethodDefinition object) {
			return createAbstractMethodDefinitionAdapter();
		}

		@Override
		public Adapter caseInterface(Interface object) {
			return createInterfaceAdapter();
		}

		@Override
		public Adapter caseMemberInEnumVisibility(MemberInEnumVisibility object) {
			return createMemberInEnumVisibilityAdapter();
		}

		@Override
		public Adapter caseUnresolvedTypeDeclaration(UnresolvedTypeDeclaration object) {
			return createUnresolvedTypeDeclarationAdapter();
		}

		@Override
		public Adapter caseMethodDefinition(MethodDefinition object) {
			return createMethodDefinitionAdapter();
		}

		@Override
		public Adapter caseSubPackageToPGPackage(SubPackageToPGPackage object) {
			return createSubPackageToPGPackageAdapter();
		}

		@Override
		public Adapter caseNestedTypesInAnonymous(NestedTypesInAnonymous object) {
			return createNestedTypesInAnonymousAdapter();
		}

		@Override
		public Adapter casePrimitiveTypesIsVoid(PrimitiveTypesIsVoid object) {
			return createPrimitiveTypesIsVoidAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueAnnotationArray(AnnotationMemberValueAnnotationArray object) {
			return createAnnotationMemberValueAnnotationArrayAdapter();
		}

		@Override
		public Adapter caseAnnotationOnBodyDeclaration(AnnotationOnBodyDeclaration object) {
			return createAnnotationOnBodyDeclarationAdapter();
		}

		@Override
		public Adapter caseAnonymousClassTypeClass(AnonymousClassTypeClass object) {
			return createAnonymousClassTypeClassAdapter();
		}

		@Override
		public Adapter caseMethodDefinitionReturnArray(MethodDefinitionReturnArray object) {
			return createMethodDefinitionReturnArrayAdapter();
		}

		@Override
		public Adapter caseArrayTypeToClass(ArrayTypeToClass object) {
			return createArrayTypeToClassAdapter();
		}

		@Override
		public Adapter caseMethodInvocationRecursive(MethodInvocationRecursive object) {
			return createMethodInvocationRecursiveAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueStringArray(AnnotationMemberValueStringArray object) {
			return createAnnotationMemberValueStringArrayAdapter();
		}

		@Override
		public Adapter caseClassInnerClassMember(ClassInnerClassMember object) {
			return createClassInnerClassMemberAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsDouble(PrimitiveTypeIsDouble object) {
			return createPrimitiveTypeIsDoubleAdapter();
		}

		@Override
		public Adapter caseTypeParameter(TypeParameter object) {
			return createTypeParameterAdapter();
		}

		@Override
		public Adapter caseInterfaceExtendsInterface(InterfaceExtendsInterface object) {
			return createInterfaceExtendsInterfaceAdapter();
		}

		@Override
		public Adapter caseNestedTypes(NestedTypes object) {
			return createNestedTypesAdapter();
		}

		@Override
		public Adapter caseDataFlow(DataFlow object) {
			return createDataFlowAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeAccessOnSelf(AnnotationTypeAccessOnSelf object) {
			return createAnnotationTypeAccessOnSelfAdapter();
		}

		@Override
		public Adapter caseParameterizedTypeToClass(ParameterizedTypeToClass object) {
			return createParameterizedTypeToClassAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueString(AnnotationMemberValueString object) {
			return createAnnotationMemberValueStringAdapter();
		}

		@Override
		public Adapter caseMethodDefinitionReturnSingle(MethodDefinitionReturnSingle object) {
			return createMethodDefinitionReturnSingleAdapter();
		}

		@Override
		public Adapter caseClass(org.gravity.tgg.modisco.Rules.Class object) {
			return createClassAdapter();
		}

		@Override
		public Adapter caseMethodInvocationStaticType_abstract(MethodInvocationStaticType_abstract object) {
			return createMethodInvocationStaticType_abstractAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsShort(PrimitiveTypeIsShort object) {
			return createPrimitiveTypeIsShortAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueClassArray(AnnotationMemberValueClassArray object) {
			return createAnnotationMemberValueClassArrayAdapter();
		}

		@Override
		public Adapter caseTypesOrphaned(TypesOrphaned object) {
			return createTypesOrphanedAdapter();
		}

		@Override
		public Adapter caseFieldName(FieldName object) {
			return createFieldNameAdapter();
		}

		@Override
		public Adapter caseModelToPg(ModelToPg object) {
			return createModelToPgAdapter();
		}

		@Override
		public Adapter caseFieldDefinition(FieldDefinition object) {
			return createFieldDefinitionAdapter();
		}

		@Override
		public Adapter caseMethodParameterArrayType(MethodParameterArrayType object) {
			return createMethodParameterArrayTypeAdapter();
		}

		@Override
		public Adapter caseAnonymousClassTypeInterface(AnonymousClassTypeInterface object) {
			return createAnonymousClassTypeInterfaceAdapter();
		}

		@Override
		public Adapter caseMethodInvocation(MethodInvocation object) {
			return createMethodInvocationAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueBoolean(AnnotationMemberValueBoolean object) {
			return createAnnotationMemberValueBooleanAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsInt(PrimitiveTypeIsInt object) {
			return createPrimitiveTypeIsIntAdapter();
		}

		@Override
		public Adapter caseFieldAccess(FieldAccess object) {
			return createFieldAccessAdapter();
		}

		@Override
		public Adapter caseUnresolvedMethodDeclaration(UnresolvedMethodDeclaration object) {
			return createUnresolvedMethodDeclarationAdapter();
		}

		@Override
		public Adapter caseConstructorInvocation(ConstructorInvocation object) {
			return createConstructorInvocationAdapter();
		}

		@Override
		public Adapter caseEnum(org.gravity.tgg.modisco.Rules.Enum object) {
			return createEnumAdapter();
		}

		@Override
		public Adapter caseNestedInterfaceInType(NestedInterfaceInType object) {
			return createNestedInterfaceInTypeAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeNested(AnnotationTypeNested object) {
			return createAnnotationTypeNestedAdapter();
		}

		@Override
		public Adapter caseLinkDefinitionToType(LinkDefinitionToType object) {
			return createLinkDefinitionToTypeAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsChar(PrimitiveTypeIsChar object) {
			return createPrimitiveTypeIsCharAdapter();
		}

		@Override
		public Adapter caseAnonymousClassType(AnonymousClassType object) {
			return createAnonymousClassTypeAdapter();
		}

		@Override
		public Adapter caseFieldAccessRead(FieldAccessRead object) {
			return createFieldAccessReadAdapter();
		}

		@Override
		public Adapter caseFieldAccessWrite(FieldAccessWrite object) {
			return createFieldAccessWriteAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsFloat(PrimitiveTypeIsFloat object) {
			return createPrimitiveTypeIsFloatAdapter();
		}

		@Override
		public Adapter caseAbstractAnnotationTypeAccess(AbstractAnnotationTypeAccess object) {
			return createAbstractAnnotationTypeAccessAdapter();
		}

		@Override
		public Adapter caseTextAnnotations(TextAnnotations object) {
			return createTextAnnotationsAdapter();
		}

		@Override
		public Adapter caseClassInnerAnonClassMember(ClassInnerAnonClassMember object) {
			return createClassInnerAnonClassMemberAdapter();
		}

		@Override
		public Adapter caseNestedClassInType(NestedClassInType object) {
			return createNestedClassInTypeAdapter();
		}

		@Override
		public Adapter caseAbstractMethodInvocation(AbstractMethodInvocation object) {
			return createAbstractMethodInvocationAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueAnnotation(AnnotationMemberValueAnnotation object) {
			return createAnnotationMemberValueAnnotationAdapter();
		}

		@Override
		public Adapter caseArrayInitializerIgnoreExpressionsEdge(ArrayInitializerIgnoreExpressionsEdge object) {
			return createArrayInitializerIgnoreExpressionsEdgeAdapter();
		}

		@Override
		public Adapter caseEnumInAnonymous(EnumInAnonymous object) {
			return createEnumInAnonymousAdapter();
		}

		@Override
		public Adapter caseConstructorDefinition(ConstructorDefinition object) {
			return createConstructorDefinitionAdapter();
		}

		@Override
		public Adapter caseFieldSignature(FieldSignature object) {
			return createFieldSignatureAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeAccessOnAnnotation(AnnotationTypeAccessOnAnnotation object) {
			return createAnnotationTypeAccessOnAnnotationAdapter();
		}

		@Override
		public Adapter caseFieldSignatureAbstract(FieldSignatureAbstract object) {
			return createFieldSignatureAbstractAdapter();
		}

		@Override
		public Adapter caseClassInnerMember(ClassInnerMember object) {
			return createClassInnerMemberAdapter();
		}

		@Override
		public Adapter caseSuperMethodInvocation(SuperMethodInvocation object) {
			return createSuperMethodInvocationAdapter();
		}

		@Override
		public Adapter caseNestedEnum(NestedEnum object) {
			return createNestedEnumAdapter();
		}

		@Override
		public Adapter caseAnnotationType(AnnotationType object) {
			return createAnnotationTypeAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueClass(AnnotationMemberValueClass object) {
			return createAnnotationMemberValueClassAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsByte(PrimitiveTypeIsByte object) {
			return createPrimitiveTypeIsByteAdapter();
		}

		@Override
		public Adapter caseAnonymousClass(AnonymousClass object) {
			return createAnonymousClassAdapter();
		}

		@Override
		public Adapter caseMethodOverriding(MethodOverriding object) {
			return createMethodOverridingAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeInAnonymous(AnnotationTypeInAnonymous object) {
			return createAnnotationTypeInAnonymousAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodInvocationStaticType <em>Method Invocation Static Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodInvocationStaticType
	 * @generated
	 */
	public Adapter createMethodInvocationStaticTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.TypesVisibility <em>Types Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.TypesVisibility
	 * @generated
	 */
	public Adapter createTypesVisibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberValue <em>Annotation Member Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberValue
	 * @generated
	 */
	public Adapter createAnnotationMemberValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationTypeAccessOnBodyDecl <em>Annotation Type Access On Body Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationTypeAccessOnBodyDecl
	 * @generated
	 */
	public Adapter createAnnotationTypeAccessOnBodyDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldSignatureArrayType <em>Field Signature Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldSignatureArrayType
	 * @generated
	 */
	public Adapter createFieldSignatureArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.SyntethicMethod <em>Syntethic Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.SyntethicMethod
	 * @generated
	 */
	public Adapter createSyntethicMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldAccessReadWrite <em>Field Access Read Write</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldAccessReadWrite
	 * @generated
	 */
	public Adapter createFieldAccessReadWriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodSignatureArrayReturn <em>Method Signature Array Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodSignatureArrayReturn
	 * @generated
	 */
	public Adapter createMethodSignatureArrayReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberKey <em>Annotation Member Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberKey
	 * @generated
	 */
	public Adapter createAnnotationMemberKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsBoolean <em>Primitive Type Is Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsBoolean
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypesToClass <em>Primitive Types To Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypesToClass
	 * @generated
	 */
	public Adapter createPrimitiveTypesToClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PackageToPGPackage <em>Package To PG Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PackageToPGPackage
	 * @generated
	 */
	public Adapter createPackageToPGPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ClassExtendsClass <em>Class Extends Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ClassExtendsClass
	 * @generated
	 */
	public Adapter createClassExtendsClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.Types
	 * @generated
	 */
	public Adapter createTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberValueBooleanArray <em>Annotation Member Value Boolean Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberValueBooleanArray
	 * @generated
	 */
	public Adapter createAnnotationMemberValueBooleanArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodName
	 * @generated
	 */
	public Adapter createMethodNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodParameterLink <em>Method Parameter Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodParameterLink
	 * @generated
	 */
	public Adapter createMethodParameterLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodParameterSingleType <em>Method Parameter Single Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodParameterSingleType
	 * @generated
	 */
	public Adapter createMethodParameterSingleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodParameterLinkFirst <em>Method Parameter Link First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodParameterLinkFirst
	 * @generated
	 */
	public Adapter createMethodParameterLinkFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodInvocationStaticTypeArray <em>Method Invocation Static Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodInvocationStaticTypeArray
	 * @generated
	 */
	public Adapter createMethodInvocationStaticTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ClassInAnonymous <em>Class In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ClassInAnonymous
	 * @generated
	 */
	public Adapter createClassInAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsLong <em>Primitive Type Is Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsLong
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.VariableDeclarationFragment <em>Variable Declaration Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.VariableDeclarationFragment
	 * @generated
	 */
	public Adapter createVariableDeclarationFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberValueArray <em>Annotation Member Value Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberValueArray
	 * @generated
	 */
	public Adapter createAnnotationMemberValueArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.LinkDefinitionToAnonymous <em>Link Definition To Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.LinkDefinitionToAnonymous
	 * @generated
	 */
	public Adapter createLinkDefinitionToAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.InterfaceInAnonymous <em>Interface In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.InterfaceInAnonymous
	 * @generated
	 */
	public Adapter createInterfaceInAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ClassInstanceCreation <em>Class Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ClassInstanceCreation
	 * @generated
	 */
	public Adapter createClassInstanceCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodParameter <em>Method Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodParameter
	 * @generated
	 */
	public Adapter createMethodParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.InterfaceMember <em>Interface Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.InterfaceMember
	 * @generated
	 */
	public Adapter createInterfaceMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ClassImplementsInterface <em>Class Implements Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ClassImplementsInterface
	 * @generated
	 */
	public Adapter createClassImplementsInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.SuperConstructorInvocation <em>Super Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.SuperConstructorInvocation
	 * @generated
	 */
	public Adapter createSuperConstructorInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MemberInClassVisibility <em>Member In Class Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MemberInClassVisibility
	 * @generated
	 */
	public Adapter createMemberInClassVisibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodSignature <em>Method Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodSignature
	 * @generated
	 */
	public Adapter createMethodSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberValueNumber <em>Annotation Member Value Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberValueNumber
	 * @generated
	 */
	public Adapter createAnnotationMemberValueNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MemberInAnnotationVisibility <em>Member In Annotation Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MemberInAnnotationVisibility
	 * @generated
	 */
	public Adapter createMemberInAnnotationVisibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodSignatureSingleReturn <em>Method Signature Single Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodSignatureSingleReturn
	 * @generated
	 */
	public Adapter createMethodSignatureSingleReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberValueNumberArray <em>Annotation Member Value Number Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberValueNumberArray
	 * @generated
	 */
	public Adapter createAnnotationMemberValueNumberArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AbstractMethodDefinition <em>Abstract Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AbstractMethodDefinition
	 * @generated
	 */
	public Adapter createAbstractMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MemberInEnumVisibility <em>Member In Enum Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MemberInEnumVisibility
	 * @generated
	 */
	public Adapter createMemberInEnumVisibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.UnresolvedTypeDeclaration <em>Unresolved Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.UnresolvedTypeDeclaration
	 * @generated
	 */
	public Adapter createUnresolvedTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodDefinition <em>Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodDefinition
	 * @generated
	 */
	public Adapter createMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.SubPackageToPGPackage <em>Sub Package To PG Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.SubPackageToPGPackage
	 * @generated
	 */
	public Adapter createSubPackageToPGPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.NestedTypesInAnonymous <em>Nested Types In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.NestedTypesInAnonymous
	 * @generated
	 */
	public Adapter createNestedTypesInAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypesIsVoid <em>Primitive Types Is Void</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypesIsVoid
	 * @generated
	 */
	public Adapter createPrimitiveTypesIsVoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberValueAnnotationArray <em>Annotation Member Value Annotation Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberValueAnnotationArray
	 * @generated
	 */
	public Adapter createAnnotationMemberValueAnnotationArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationOnBodyDeclaration <em>Annotation On Body Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationOnBodyDeclaration
	 * @generated
	 */
	public Adapter createAnnotationOnBodyDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnonymousClassTypeClass <em>Anonymous Class Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnonymousClassTypeClass
	 * @generated
	 */
	public Adapter createAnonymousClassTypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodDefinitionReturnArray <em>Method Definition Return Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodDefinitionReturnArray
	 * @generated
	 */
	public Adapter createMethodDefinitionReturnArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ArrayTypeToClass <em>Array Type To Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ArrayTypeToClass
	 * @generated
	 */
	public Adapter createArrayTypeToClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodInvocationRecursive <em>Method Invocation Recursive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodInvocationRecursive
	 * @generated
	 */
	public Adapter createMethodInvocationRecursiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberValueStringArray <em>Annotation Member Value String Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberValueStringArray
	 * @generated
	 */
	public Adapter createAnnotationMemberValueStringArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ClassInnerClassMember <em>Class Inner Class Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ClassInnerClassMember
	 * @generated
	 */
	public Adapter createClassInnerClassMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsDouble <em>Primitive Type Is Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsDouble
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.TypeParameter
	 * @generated
	 */
	public Adapter createTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.InterfaceExtendsInterface <em>Interface Extends Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.InterfaceExtendsInterface
	 * @generated
	 */
	public Adapter createInterfaceExtendsInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.NestedTypes <em>Nested Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.NestedTypes
	 * @generated
	 */
	public Adapter createNestedTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationTypeAccessOnSelf <em>Annotation Type Access On Self</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationTypeAccessOnSelf
	 * @generated
	 */
	public Adapter createAnnotationTypeAccessOnSelfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ParameterizedTypeToClass <em>Parameterized Type To Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ParameterizedTypeToClass
	 * @generated
	 */
	public Adapter createParameterizedTypeToClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberValueString <em>Annotation Member Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberValueString
	 * @generated
	 */
	public Adapter createAnnotationMemberValueStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodDefinitionReturnSingle <em>Method Definition Return Single</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodDefinitionReturnSingle
	 * @generated
	 */
	public Adapter createMethodDefinitionReturnSingleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodInvocationStaticType_abstract <em>Method Invocation Static Type abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodInvocationStaticType_abstract
	 * @generated
	 */
	public Adapter createMethodInvocationStaticType_abstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsShort <em>Primitive Type Is Short</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsShort
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberValueClassArray <em>Annotation Member Value Class Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberValueClassArray
	 * @generated
	 */
	public Adapter createAnnotationMemberValueClassArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.TypesOrphaned <em>Types Orphaned</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.TypesOrphaned
	 * @generated
	 */
	public Adapter createTypesOrphanedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldName
	 * @generated
	 */
	public Adapter createFieldNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ModelToPg <em>Model To Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ModelToPg
	 * @generated
	 */
	public Adapter createModelToPgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldDefinition <em>Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldDefinition
	 * @generated
	 */
	public Adapter createFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodParameterArrayType <em>Method Parameter Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodParameterArrayType
	 * @generated
	 */
	public Adapter createMethodParameterArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnonymousClassTypeInterface <em>Anonymous Class Type Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnonymousClassTypeInterface
	 * @generated
	 */
	public Adapter createAnonymousClassTypeInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodInvocation <em>Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodInvocation
	 * @generated
	 */
	public Adapter createMethodInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberValueBoolean <em>Annotation Member Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberValueBoolean
	 * @generated
	 */
	public Adapter createAnnotationMemberValueBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsInt <em>Primitive Type Is Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsInt
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldAccess <em>Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldAccess
	 * @generated
	 */
	public Adapter createFieldAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.UnresolvedMethodDeclaration <em>Unresolved Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.UnresolvedMethodDeclaration
	 * @generated
	 */
	public Adapter createUnresolvedMethodDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ConstructorInvocation <em>Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ConstructorInvocation
	 * @generated
	 */
	public Adapter createConstructorInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.NestedInterfaceInType <em>Nested Interface In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.NestedInterfaceInType
	 * @generated
	 */
	public Adapter createNestedInterfaceInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationTypeNested <em>Annotation Type Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationTypeNested
	 * @generated
	 */
	public Adapter createAnnotationTypeNestedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.LinkDefinitionToType <em>Link Definition To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.LinkDefinitionToType
	 * @generated
	 */
	public Adapter createLinkDefinitionToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsChar <em>Primitive Type Is Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsChar
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnonymousClassType <em>Anonymous Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnonymousClassType
	 * @generated
	 */
	public Adapter createAnonymousClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldAccessRead <em>Field Access Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldAccessRead
	 * @generated
	 */
	public Adapter createFieldAccessReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldAccessWrite <em>Field Access Write</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldAccessWrite
	 * @generated
	 */
	public Adapter createFieldAccessWriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsFloat <em>Primitive Type Is Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsFloat
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AbstractAnnotationTypeAccess <em>Abstract Annotation Type Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AbstractAnnotationTypeAccess
	 * @generated
	 */
	public Adapter createAbstractAnnotationTypeAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.TextAnnotations <em>Text Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.TextAnnotations
	 * @generated
	 */
	public Adapter createTextAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ClassInnerAnonClassMember <em>Class Inner Anon Class Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ClassInnerAnonClassMember
	 * @generated
	 */
	public Adapter createClassInnerAnonClassMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.NestedClassInType <em>Nested Class In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.NestedClassInType
	 * @generated
	 */
	public Adapter createNestedClassInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AbstractMethodInvocation <em>Abstract Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AbstractMethodInvocation
	 * @generated
	 */
	public Adapter createAbstractMethodInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberValueAnnotation <em>Annotation Member Value Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberValueAnnotation
	 * @generated
	 */
	public Adapter createAnnotationMemberValueAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ArrayInitializerIgnoreExpressionsEdge <em>Array Initializer Ignore Expressions Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ArrayInitializerIgnoreExpressionsEdge
	 * @generated
	 */
	public Adapter createArrayInitializerIgnoreExpressionsEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.EnumInAnonymous <em>Enum In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.EnumInAnonymous
	 * @generated
	 */
	public Adapter createEnumInAnonymousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ConstructorDefinition <em>Constructor Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ConstructorDefinition
	 * @generated
	 */
	public Adapter createConstructorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldSignature <em>Field Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldSignature
	 * @generated
	 */
	public Adapter createFieldSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationTypeAccessOnAnnotation <em>Annotation Type Access On Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationTypeAccessOnAnnotation
	 * @generated
	 */
	public Adapter createAnnotationTypeAccessOnAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldSignatureAbstract <em>Field Signature Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldSignatureAbstract
	 * @generated
	 */
	public Adapter createFieldSignatureAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ClassInnerMember <em>Class Inner Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ClassInnerMember
	 * @generated
	 */
	public Adapter createClassInnerMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.SuperMethodInvocation <em>Super Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.SuperMethodInvocation
	 * @generated
	 */
	public Adapter createSuperMethodInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.NestedEnum <em>Nested Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.NestedEnum
	 * @generated
	 */
	public Adapter createNestedEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationType
	 * @generated
	 */
	public Adapter createAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationMemberValueClass <em>Annotation Member Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationMemberValueClass
	 * @generated
	 */
	public Adapter createAnnotationMemberValueClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsByte <em>Primitive Type Is Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsByte
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnonymousClass <em>Anonymous Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnonymousClass
	 * @generated
	 */
	public Adapter createAnonymousClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodOverriding <em>Method Overriding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodOverriding
	 * @generated
	 */
	public Adapter createMethodOverridingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationTypeInAnonymous <em>Annotation Type In Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationTypeInAnonymous
	 * @generated
	 */
	public Adapter createAnnotationTypeInAnonymousAdapter() {
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
