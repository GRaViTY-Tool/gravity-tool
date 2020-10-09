/**
 */
package org.gravity.tgg.modisco.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.tgg.modisco.*;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.ModiscoPackage
 * @generated
 */
public class ModiscoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModiscoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModiscoPackage.eINSTANCE;
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
	protected ModiscoSwitch<Adapter> modelSwitch = new ModiscoSwitch<Adapter>() {
		@Override
		public Adapter casePrimitiveTypeToTClass(PrimitiveTypeToTClass object) {
			return createPrimitiveTypeToTClassAdapter();
		}

		@Override
		public Adapter caseMSingleVariableAccessToTAccess(MSingleVariableAccessToTAccess object) {
			return createMSingleVariableAccessToTAccessAdapter();
		}

		@Override
		public Adapter caseASTNodeToTAnnotatable(ASTNodeToTAnnotatable object) {
			return createASTNodeToTAnnotatableAdapter();
		}

		@Override
		public Adapter caseModelToTypeGraph(ModelToTypeGraph object) {
			return createModelToTypeGraphAdapter();
		}

		@Override
		public Adapter caseUnresolvedTypeDeclarationToTClass(UnresolvedTypeDeclarationToTClass object) {
			return createUnresolvedTypeDeclarationToTClassAdapter();
		}

		@Override
		public Adapter caseMMethodNameToTMethod(MMethodNameToTMethod object) {
			return createMMethodNameToTMethodAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValuePairToTAnnotationValue(
				AnnotationMemberValuePairToTAnnotationValue object) {
			return createAnnotationMemberValuePairToTAnnotationValueAdapter();
		}

		@Override
		public Adapter caseInterfaceDeclarationToTInterface(InterfaceDeclarationToTInterface object) {
			return createInterfaceDeclarationToTInterfaceAdapter();
		}

		@Override
		public Adapter caseNumberLiteralToTNumberNode(NumberLiteralToTNumberNode object) {
			return createNumberLiteralToTNumberNodeAdapter();
		}

		@Override
		public Adapter caseMFieldNameToTField(MFieldNameToTField object) {
			return createMFieldNameToTFieldAdapter();
		}

		@Override
		public Adapter caseStringLiteralToTTextNode(StringLiteralToTTextNode object) {
			return createStringLiteralToTTextNodeAdapter();
		}

		@Override
		public Adapter caseAbstractMethodInvocationToTAccess(AbstractMethodInvocationToTAccess object) {
			return createAbstractMethodInvocationToTAccessAdapter();
		}

		@Override
		public Adapter caseTypeToTAbstractType(TypeToTAbstractType object) {
			return createTypeToTAbstractTypeAdapter();
		}

		@Override
		public Adapter caseBooleanLiteralToTBoolNode(BooleanLiteralToTBoolNode object) {
			return createBooleanLiteralToTBoolNodeAdapter();
		}

		@Override
		public Adapter caseStaticTypeToAccessStaticType(StaticTypeToAccessStaticType object) {
			return createStaticTypeToAccessStaticTypeAdapter();
		}

		@Override
		public Adapter caseMAbstractFlowElementToTAbstractFlowElement(
				MAbstractFlowElementToTAbstractFlowElement object) {
			return createMAbstractFlowElementToTAbstractFlowElementAdapter();
		}

		@Override
		public Adapter caseModifierToTClassEntity(ModifierToTClassEntity object) {
			return createModifierToTClassEntityAdapter();
		}

		@Override
		public Adapter caseClassLiteralToClassNode(ClassLiteralToClassNode object) {
			return createClassLiteralToClassNodeAdapter();
		}

		@Override
		public Adapter caseClassDeclarationToTClass(ClassDeclarationToTClass object) {
			return createClassDeclarationToTClassAdapter();
		}

		@Override
		public Adapter caseVariableDeclarationFragmentToTFieldDefinition(
				VariableDeclarationFragmentToTFieldDefinition object) {
			return createVariableDeclarationFragmentToTFieldDefinitionAdapter();
		}

		@Override
		public Adapter caseMEntryToTParameter(MEntryToTParameter object) {
			return createMEntryToTParameterAdapter();
		}

		@Override
		public Adapter caseMSignatureToTSignature(MSignatureToTSignature object) {
			return createMSignatureToTSignatureAdapter();
		}

		@Override
		public Adapter caseModifierToAbstractType(ModifierToAbstractType object) {
			return createModifierToAbstractTypeAdapter();
		}

		@Override
		public Adapter caseMFlowToTFlow(MFlowToTFlow object) {
			return createMFlowToTFlowAdapter();
		}

		@Override
		public Adapter caseMSyntethicMethodToTSyntethicMethod(MSyntethicMethodToTSyntethicMethod object) {
			return createMSyntethicMethodToTSyntethicMethodAdapter();
		}

		@Override
		public Adapter caseFieldAccessToTAccess(FieldAccessToTAccess object) {
			return createFieldAccessToTAccessAdapter();
		}

		@Override
		public Adapter caseMModifierToTModifier(MModifierToTModifier object) {
			return createMModifierToTModifierAdapter();
		}

		@Override
		public Adapter caseMDefinitionToTMember(MDefinitionToTMember object) {
			return createMDefinitionToTMemberAdapter();
		}

		@Override
		public Adapter caseModifierToTMethodEntity(ModifierToTMethodEntity object) {
			return createModifierToTMethodEntityAdapter();
		}

		@Override
		public Adapter caseAnnotationToTAnnotation(AnnotationToTAnnotation object) {
			return createAnnotationToTAnnotationAdapter();
		}

		@Override
		public Adapter caseAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass object) {
			return createAnonymousClassDeclarationToTClassAdapter();
		}

		@Override
		public Adapter caseLineCommentToTTextAnnotation(LineCommentToTTextAnnotation object) {
			return createLineCommentToTTextAnnotationAdapter();
		}

		@Override
		public Adapter caseModifierToTFieldEntity(ModifierToTFieldEntity object) {
			return createModifierToTFieldEntityAdapter();
		}

		@Override
		public Adapter casePackageToTPackage(PackageToTPackage object) {
			return createPackageToTPackageAdapter();
		}

		@Override
		public Adapter caseTypeParameterToTClass(TypeParameterToTClass object) {
			return createTypeParameterToTClassAdapter();
		}

		@Override
		public Adapter caseAbstractCorrespondence(AbstractCorrespondence object) {
			return createAbstractCorrespondenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.PrimitiveTypeToTClass <em>Primitive Type To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.PrimitiveTypeToTClass
	 * @generated
	 */
	public Adapter createPrimitiveTypeToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MSingleVariableAccessToTAccess <em>MSingle Variable Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MSingleVariableAccessToTAccess
	 * @generated
	 */
	public Adapter createMSingleVariableAccessToTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ASTNodeToTAnnotatable <em>AST Node To TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ASTNodeToTAnnotatable
	 * @generated
	 */
	public Adapter createASTNodeToTAnnotatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ModelToTypeGraph <em>Model To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ModelToTypeGraph
	 * @generated
	 */
	public Adapter createModelToTypeGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass <em>Unresolved Type Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass
	 * @generated
	 */
	public Adapter createUnresolvedTypeDeclarationToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MMethodNameToTMethod <em>MMethod Name To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MMethodNameToTMethod
	 * @generated
	 */
	public Adapter createMMethodNameToTMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue <em>Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue
	 * @generated
	 */
	public Adapter createAnnotationMemberValuePairToTAnnotationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.InterfaceDeclarationToTInterface <em>Interface Declaration To TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.InterfaceDeclarationToTInterface
	 * @generated
	 */
	public Adapter createInterfaceDeclarationToTInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.NumberLiteralToTNumberNode <em>Number Literal To TNumber Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.NumberLiteralToTNumberNode
	 * @generated
	 */
	public Adapter createNumberLiteralToTNumberNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MFieldNameToTField <em>MField Name To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MFieldNameToTField
	 * @generated
	 */
	public Adapter createMFieldNameToTFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.StringLiteralToTTextNode <em>String Literal To TText Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.StringLiteralToTTextNode
	 * @generated
	 */
	public Adapter createStringLiteralToTTextNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess <em>Abstract Method Invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess
	 * @generated
	 */
	public Adapter createAbstractMethodInvocationToTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.TypeToTAbstractType <em>Type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.TypeToTAbstractType
	 * @generated
	 */
	public Adapter createTypeToTAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.BooleanLiteralToTBoolNode <em>Boolean Literal To TBool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.BooleanLiteralToTBoolNode
	 * @generated
	 */
	public Adapter createBooleanLiteralToTBoolNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.StaticTypeToAccessStaticType <em>Static Type To Access Static Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.StaticTypeToAccessStaticType
	 * @generated
	 */
	public Adapter createStaticTypeToAccessStaticTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MAbstractFlowElementToTAbstractFlowElement <em>MAbstract Flow Element To TAbstract Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MAbstractFlowElementToTAbstractFlowElement
	 * @generated
	 */
	public Adapter createMAbstractFlowElementToTAbstractFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ModifierToTClassEntity <em>Modifier To TClass Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ModifierToTClassEntity
	 * @generated
	 */
	public Adapter createModifierToTClassEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ClassLiteralToClassNode <em>Class Literal To Class Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ClassLiteralToClassNode
	 * @generated
	 */
	public Adapter createClassLiteralToClassNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ClassDeclarationToTClass <em>Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ClassDeclarationToTClass
	 * @generated
	 */
	public Adapter createClassDeclarationToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition <em>Variable Declaration Fragment To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition
	 * @generated
	 */
	public Adapter createVariableDeclarationFragmentToTFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MEntryToTParameter <em>MEntry To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MEntryToTParameter
	 * @generated
	 */
	public Adapter createMEntryToTParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MSignatureToTSignature <em>MSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MSignatureToTSignature
	 * @generated
	 */
	public Adapter createMSignatureToTSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ModifierToAbstractType <em>Modifier To Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ModifierToAbstractType
	 * @generated
	 */
	public Adapter createModifierToAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MFlowToTFlow <em>MFlow To TFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MFlowToTFlow
	 * @generated
	 */
	public Adapter createMFlowToTFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MSyntethicMethodToTSyntethicMethod <em>MSyntethic Method To TSyntethic Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MSyntethicMethodToTSyntethicMethod
	 * @generated
	 */
	public Adapter createMSyntethicMethodToTSyntethicMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.FieldAccessToTAccess <em>Field Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.FieldAccessToTAccess
	 * @generated
	 */
	public Adapter createFieldAccessToTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MModifierToTModifier <em>MModifier To TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MModifierToTModifier
	 * @generated
	 */
	public Adapter createMModifierToTModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MDefinitionToTMember <em>MDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MDefinitionToTMember
	 * @generated
	 */
	public Adapter createMDefinitionToTMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ModifierToTMethodEntity <em>Modifier To TMethod Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ModifierToTMethodEntity
	 * @generated
	 */
	public Adapter createModifierToTMethodEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.AnnotationToTAnnotation <em>Annotation To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.AnnotationToTAnnotation
	 * @generated
	 */
	public Adapter createAnnotationToTAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass <em>Anonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass
	 * @generated
	 */
	public Adapter createAnonymousClassDeclarationToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.LineCommentToTTextAnnotation <em>Line Comment To TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.LineCommentToTTextAnnotation
	 * @generated
	 */
	public Adapter createLineCommentToTTextAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ModifierToTFieldEntity <em>Modifier To TField Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ModifierToTFieldEntity
	 * @generated
	 */
	public Adapter createModifierToTFieldEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.PackageToTPackage <em>Package To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.PackageToTPackage
	 * @generated
	 */
	public Adapter createPackageToTPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.TypeParameterToTClass <em>Type Parameter To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.TypeParameterToTClass
	 * @generated
	 */
	public Adapter createTypeParameterToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractCorrespondence <em>Abstract Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractCorrespondence
	 * @generated
	 */
	public Adapter createAbstractCorrespondenceAdapter() {
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

} //ModiscoAdapterFactory
