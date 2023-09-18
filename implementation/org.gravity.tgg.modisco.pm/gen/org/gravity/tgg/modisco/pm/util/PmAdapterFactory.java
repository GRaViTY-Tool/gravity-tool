/**
 */
package org.gravity.tgg.modisco.pm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.tgg.modisco.pm.*;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.pm.PmPackage
 * @generated
 */
public class PmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PmPackage.eINSTANCE;
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
	protected PmSwitch<Adapter> modelSwitch = new PmSwitch<Adapter>() {
		@Override
		public Adapter caseVariableDeclarationFragmentToTFieldDefinition(
				VariableDeclarationFragmentToTFieldDefinition object) {
			return createVariableDeclarationFragmentToTFieldDefinitionAdapter();
		}

		@Override
		public Adapter caseUnresolvedTypeDeclarationToTClass(UnresolvedTypeDeclarationToTClass object) {
			return createUnresolvedTypeDeclarationToTClassAdapter();
		}

		@Override
		public Adapter caseElementToModule(ElementToModule object) {
			return createElementToModuleAdapter();
		}

		@Override
		public Adapter caseTypeToTAbstractType(TypeToTAbstractType object) {
			return createTypeToTAbstractTypeAdapter();
		}

		@Override
		public Adapter caseMAbstractFlowElementToTAbstractFlowElement(
				MAbstractFlowElementToTAbstractFlowElement object) {
			return createMAbstractFlowElementToTAbstractFlowElementAdapter();
		}

		@Override
		public Adapter caseAbstractMethodInvocationToTAccess(AbstractMethodInvocationToTAccess object) {
			return createAbstractMethodInvocationToTAccessAdapter();
		}

		@Override
		public Adapter caseModifierToTMethodEntity(ModifierToTMethodEntity object) {
			return createModifierToTMethodEntityAdapter();
		}

		@Override
		public Adapter casePackageToTPackage(PackageToTPackage object) {
			return createPackageToTPackageAdapter();
		}

		@Override
		public Adapter caseModifierToTClassEntity(ModifierToTClassEntity object) {
			return createModifierToTClassEntityAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValuePairToTAnnotationValue(
				AnnotationMemberValuePairToTAnnotationValue object) {
			return createAnnotationMemberValuePairToTAnnotationValueAdapter();
		}

		@Override
		public Adapter caseASTNodeToTAnnotatable(ASTNodeToTAnnotatable object) {
			return createASTNodeToTAnnotatableAdapter();
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
		public Adapter caseMSignatureToTSignature(MSignatureToTSignature object) {
			return createMSignatureToTSignatureAdapter();
		}

		@Override
		public Adapter caseTypeParameterToTClass(TypeParameterToTClass object) {
			return createTypeParameterToTClassAdapter();
		}

		@Override
		public Adapter caseMSingleVariableAccessToTAccess(MSingleVariableAccessToTAccess object) {
			return createMSingleVariableAccessToTAccessAdapter();
		}

		@Override
		public Adapter caseMModifierToTModifier(MModifierToTModifier object) {
			return createMModifierToTModifierAdapter();
		}

		@Override
		public Adapter caseMFieldNameToTField(MFieldNameToTField object) {
			return createMFieldNameToTFieldAdapter();
		}

		@Override
		public Adapter caseMFlowToTFlow(MFlowToTFlow object) {
			return createMFlowToTFlowAdapter();
		}

		@Override
		public Adapter caseModifierToAbstractType(ModifierToAbstractType object) {
			return createModifierToAbstractTypeAdapter();
		}

		@Override
		public Adapter caseFieldAccessToTAccess(FieldAccessToTAccess object) {
			return createFieldAccessToTAccessAdapter();
		}

		@Override
		public Adapter caseMDefinitionToTMember(MDefinitionToTMember object) {
			return createMDefinitionToTMemberAdapter();
		}

		@Override
		public Adapter caseMEntryToTParameter(MEntryToTParameter object) {
			return createMEntryToTParameterAdapter();
		}

		@Override
		public Adapter caseAnnotationToTAnnotation(AnnotationToTAnnotation object) {
			return createAnnotationToTAnnotationAdapter();
		}

		@Override
		public Adapter caseStaticTypeToAccessStaticType(StaticTypeToAccessStaticType object) {
			return createStaticTypeToAccessStaticTypeAdapter();
		}

		@Override
		public Adapter caseMMethodNameToTMethod(MMethodNameToTMethod object) {
			return createMMethodNameToTMethodAdapter();
		}

		@Override
		public Adapter caseLiteralToTNode(LiteralToTNode object) {
			return createLiteralToTNodeAdapter();
		}

		@Override
		public Adapter caseAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass object) {
			return createAnonymousClassDeclarationToTClassAdapter();
		}

		@Override
		public Adapter caseModelToTypeGraph(ModelToTypeGraph object) {
			return createModelToTypeGraphAdapter();
		}

		@Override
		public Adapter caseMSyntethicMethodToTSyntethicMethod(MSyntethicMethodToTSyntethicMethod object) {
			return createMSyntethicMethodToTSyntethicMethodAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.VariableDeclarationFragmentToTFieldDefinition <em>Variable Declaration Fragment To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.VariableDeclarationFragmentToTFieldDefinition
	 * @generated
	 */
	public Adapter createVariableDeclarationFragmentToTFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.UnresolvedTypeDeclarationToTClass <em>Unresolved Type Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.UnresolvedTypeDeclarationToTClass
	 * @generated
	 */
	public Adapter createUnresolvedTypeDeclarationToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.ElementToModule <em>Element To Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.ElementToModule
	 * @generated
	 */
	public Adapter createElementToModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.TypeToTAbstractType <em>Type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.TypeToTAbstractType
	 * @generated
	 */
	public Adapter createTypeToTAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement <em>MAbstract Flow Element To TAbstract Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement
	 * @generated
	 */
	public Adapter createMAbstractFlowElementToTAbstractFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess <em>Abstract Method Invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess
	 * @generated
	 */
	public Adapter createAbstractMethodInvocationToTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.ModifierToTMethodEntity <em>Modifier To TMethod Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.ModifierToTMethodEntity
	 * @generated
	 */
	public Adapter createModifierToTMethodEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.PackageToTPackage <em>Package To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.PackageToTPackage
	 * @generated
	 */
	public Adapter createPackageToTPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.ModifierToTClassEntity <em>Modifier To TClass Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.ModifierToTClassEntity
	 * @generated
	 */
	public Adapter createModifierToTClassEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue <em>Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue
	 * @generated
	 */
	public Adapter createAnnotationMemberValuePairToTAnnotationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable <em>AST Node To TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable
	 * @generated
	 */
	public Adapter createASTNodeToTAnnotatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.LineCommentToTTextAnnotation <em>Line Comment To TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.LineCommentToTTextAnnotation
	 * @generated
	 */
	public Adapter createLineCommentToTTextAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.ModifierToTFieldEntity <em>Modifier To TField Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.ModifierToTFieldEntity
	 * @generated
	 */
	public Adapter createModifierToTFieldEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.MSignatureToTSignature <em>MSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.MSignatureToTSignature
	 * @generated
	 */
	public Adapter createMSignatureToTSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.TypeParameterToTClass <em>Type Parameter To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.TypeParameterToTClass
	 * @generated
	 */
	public Adapter createTypeParameterToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.MSingleVariableAccessToTAccess <em>MSingle Variable Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.MSingleVariableAccessToTAccess
	 * @generated
	 */
	public Adapter createMSingleVariableAccessToTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.MModifierToTModifier <em>MModifier To TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.MModifierToTModifier
	 * @generated
	 */
	public Adapter createMModifierToTModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.MFieldNameToTField <em>MField Name To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.MFieldNameToTField
	 * @generated
	 */
	public Adapter createMFieldNameToTFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.MFlowToTFlow <em>MFlow To TFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.MFlowToTFlow
	 * @generated
	 */
	public Adapter createMFlowToTFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.ModifierToAbstractType <em>Modifier To Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.ModifierToAbstractType
	 * @generated
	 */
	public Adapter createModifierToAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.FieldAccessToTAccess <em>Field Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.FieldAccessToTAccess
	 * @generated
	 */
	public Adapter createFieldAccessToTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.MDefinitionToTMember <em>MDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.MDefinitionToTMember
	 * @generated
	 */
	public Adapter createMDefinitionToTMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.MEntryToTParameter <em>MEntry To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.MEntryToTParameter
	 * @generated
	 */
	public Adapter createMEntryToTParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.AnnotationToTAnnotation <em>Annotation To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.AnnotationToTAnnotation
	 * @generated
	 */
	public Adapter createAnnotationToTAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.StaticTypeToAccessStaticType <em>Static Type To Access Static Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.StaticTypeToAccessStaticType
	 * @generated
	 */
	public Adapter createStaticTypeToAccessStaticTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.MMethodNameToTMethod <em>MMethod Name To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.MMethodNameToTMethod
	 * @generated
	 */
	public Adapter createMMethodNameToTMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.LiteralToTNode <em>Literal To TNode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.LiteralToTNode
	 * @generated
	 */
	public Adapter createLiteralToTNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass <em>Anonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass
	 * @generated
	 */
	public Adapter createAnonymousClassDeclarationToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.ModelToTypeGraph <em>Model To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.ModelToTypeGraph
	 * @generated
	 */
	public Adapter createModelToTypeGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.pm.MSyntethicMethodToTSyntethicMethod <em>MSyntethic Method To TSyntethic Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.pm.MSyntethicMethodToTSyntethicMethod
	 * @generated
	 */
	public Adapter createMSyntethicMethodToTSyntethicMethodAdapter() {
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

} //PmAdapterFactory
