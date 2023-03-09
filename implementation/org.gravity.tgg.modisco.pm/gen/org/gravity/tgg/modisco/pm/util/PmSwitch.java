/**
 */
package org.gravity.tgg.modisco.pm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.tgg.modisco.pm.*;

import org.moflon.tgg.runtime.AbstractCorrespondence;

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
 * @see org.gravity.tgg.modisco.pm.PmPackage
 * @generated
 */
public class PmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PmSwitch() {
		if (modelPackage == null) {
			modelPackage = PmPackage.eINSTANCE;
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
		case PmPackage.TYPE_TO_TABSTRACT_TYPE: {
			TypeToTAbstractType typeToTAbstractType = (TypeToTAbstractType) theEObject;
			T result = caseTypeToTAbstractType(typeToTAbstractType);
			if (result == null)
				result = caseAbstractCorrespondence(typeToTAbstractType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE: {
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) theEObject;
			T result = caseAnnotationMemberValuePairToTAnnotationValue(annotationMemberValuePairToTAnnotationValue);
			if (result == null)
				result = caseAbstractCorrespondence(annotationMemberValuePairToTAnnotationValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MODIFIER_TO_TCLASS_ENTITY: {
			ModifierToTClassEntity modifierToTClassEntity = (ModifierToTClassEntity) theEObject;
			T result = caseModifierToTClassEntity(modifierToTClassEntity);
			if (result == null)
				result = caseAbstractCorrespondence(modifierToTClassEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.FIELD_ACCESS_TO_TACCESS: {
			FieldAccessToTAccess fieldAccessToTAccess = (FieldAccessToTAccess) theEObject;
			T result = caseFieldAccessToTAccess(fieldAccessToTAccess);
			if (result == null)
				result = caseAbstractCorrespondence(fieldAccessToTAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.TYPE_PARAMETER_TO_TCLASS: {
			TypeParameterToTClass typeParameterToTClass = (TypeParameterToTClass) theEObject;
			T result = caseTypeParameterToTClass(typeParameterToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(typeParameterToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT: {
			MAbstractFlowElementToTAbstractFlowElement mAbstractFlowElementToTAbstractFlowElement = (MAbstractFlowElementToTAbstractFlowElement) theEObject;
			T result = caseMAbstractFlowElementToTAbstractFlowElement(mAbstractFlowElementToTAbstractFlowElement);
			if (result == null)
				result = caseAbstractCorrespondence(mAbstractFlowElementToTAbstractFlowElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MODIFIER_TO_TMETHOD_ENTITY: {
			ModifierToTMethodEntity modifierToTMethodEntity = (ModifierToTMethodEntity) theEObject;
			T result = caseModifierToTMethodEntity(modifierToTMethodEntity);
			if (result == null)
				result = caseAbstractCorrespondence(modifierToTMethodEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.LITERAL_TO_TNODE: {
			LiteralToTNode literalToTNode = (LiteralToTNode) theEObject;
			T result = caseLiteralToTNode(literalToTNode);
			if (result == null)
				result = caseAbstractCorrespondence(literalToTNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MODIFIER_TO_ABSTRACT_TYPE: {
			ModifierToAbstractType modifierToAbstractType = (ModifierToAbstractType) theEObject;
			T result = caseModifierToAbstractType(modifierToAbstractType);
			if (result == null)
				result = caseAbstractCorrespondence(modifierToAbstractType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.LINE_COMMENT_TO_TTEXT_ANNOTATION: {
			LineCommentToTTextAnnotation lineCommentToTTextAnnotation = (LineCommentToTTextAnnotation) theEObject;
			T result = caseLineCommentToTTextAnnotation(lineCommentToTTextAnnotation);
			if (result == null)
				result = caseAbstractCorrespondence(lineCommentToTTextAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.ANNOTATION_TO_TANNOTATION: {
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) theEObject;
			T result = caseAnnotationToTAnnotation(annotationToTAnnotation);
			if (result == null)
				result = caseAbstractCorrespondence(annotationToTAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.STATIC_TYPE_TO_ACCESS_STATIC_TYPE: {
			StaticTypeToAccessStaticType staticTypeToAccessStaticType = (StaticTypeToAccessStaticType) theEObject;
			T result = caseStaticTypeToAccessStaticType(staticTypeToAccessStaticType);
			if (result == null)
				result = caseAbstractCorrespondence(staticTypeToAccessStaticType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MMODIFIER_TO_TMODIFIER: {
			MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) theEObject;
			T result = caseMModifierToTModifier(mModifierToTModifier);
			if (result == null)
				result = caseAbstractCorrespondence(mModifierToTModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MMETHOD_NAME_TO_TMETHOD: {
			MMethodNameToTMethod mMethodNameToTMethod = (MMethodNameToTMethod) theEObject;
			T result = caseMMethodNameToTMethod(mMethodNameToTMethod);
			if (result == null)
				result = caseAbstractCorrespondence(mMethodNameToTMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MENTRY_TO_TPARAMETER: {
			MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) theEObject;
			T result = caseMEntryToTParameter(mEntryToTParameter);
			if (result == null)
				result = caseAbstractCorrespondence(mEntryToTParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MSIGNATURE_TO_TSIGNATURE: {
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) theEObject;
			T result = caseMSignatureToTSignature(mSignatureToTSignature);
			if (result == null)
				result = caseAbstractCorrespondence(mSignatureToTSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD: {
			MSyntethicMethodToTSyntethicMethod mSyntethicMethodToTSyntethicMethod = (MSyntethicMethodToTSyntethicMethod) theEObject;
			T result = caseMSyntethicMethodToTSyntethicMethod(mSyntethicMethodToTSyntethicMethod);
			if (result == null)
				result = caseAbstractCorrespondence(mSyntethicMethodToTSyntethicMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MODEL_TO_TYPE_GRAPH: {
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) theEObject;
			T result = caseModelToTypeGraph(modelToTypeGraph);
			if (result == null)
				result = caseAbstractCorrespondence(modelToTypeGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.PACKAGE_TO_TPACKAGE: {
			PackageToTPackage packageToTPackage = (PackageToTPackage) theEObject;
			T result = casePackageToTPackage(packageToTPackage);
			if (result == null)
				result = caseAbstractCorrespondence(packageToTPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MDEFINITION_TO_TMEMBER: {
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) theEObject;
			T result = caseMDefinitionToTMember(mDefinitionToTMember);
			if (result == null)
				result = caseAbstractCorrespondence(mDefinitionToTMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS: {
			UnresolvedTypeDeclarationToTClass unresolvedTypeDeclarationToTClass = (UnresolvedTypeDeclarationToTClass) theEObject;
			T result = caseUnresolvedTypeDeclarationToTClass(unresolvedTypeDeclarationToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(unresolvedTypeDeclarationToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.AST_NODE_TO_TANNOTATABLE: {
			ASTNodeToTAnnotatable astNodeToTAnnotatable = (ASTNodeToTAnnotatable) theEObject;
			T result = caseASTNodeToTAnnotatable(astNodeToTAnnotatable);
			if (result == null)
				result = caseAbstractCorrespondence(astNodeToTAnnotatable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.ANONYMOUS_CLASS_DECLARATION_TO_TCLASS: {
			AnonymousClassDeclarationToTClass anonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) theEObject;
			T result = caseAnonymousClassDeclarationToTClass(anonymousClassDeclarationToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(anonymousClassDeclarationToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MODIFIER_TO_TFIELD_ENTITY: {
			ModifierToTFieldEntity modifierToTFieldEntity = (ModifierToTFieldEntity) theEObject;
			T result = caseModifierToTFieldEntity(modifierToTFieldEntity);
			if (result == null)
				result = caseAbstractCorrespondence(modifierToTFieldEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MFIELD_NAME_TO_TFIELD: {
			MFieldNameToTField mFieldNameToTField = (MFieldNameToTField) theEObject;
			T result = caseMFieldNameToTField(mFieldNameToTField);
			if (result == null)
				result = caseAbstractCorrespondence(mFieldNameToTField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MFLOW_TO_TFLOW: {
			MFlowToTFlow mFlowToTFlow = (MFlowToTFlow) theEObject;
			T result = caseMFlowToTFlow(mFlowToTFlow);
			if (result == null)
				result = caseAbstractCorrespondence(mFlowToTFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION: {
			VariableDeclarationFragmentToTFieldDefinition variableDeclarationFragmentToTFieldDefinition = (VariableDeclarationFragmentToTFieldDefinition) theEObject;
			T result = caseVariableDeclarationFragmentToTFieldDefinition(variableDeclarationFragmentToTFieldDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(variableDeclarationFragmentToTFieldDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS: {
			MSingleVariableAccessToTAccess mSingleVariableAccessToTAccess = (MSingleVariableAccessToTAccess) theEObject;
			T result = caseMSingleVariableAccessToTAccess(mSingleVariableAccessToTAccess);
			if (result == null)
				result = caseAbstractCorrespondence(mSingleVariableAccessToTAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PmPackage.ABSTRACT_METHOD_INVOCATION_TO_TACCESS: {
			AbstractMethodInvocationToTAccess abstractMethodInvocationToTAccess = (AbstractMethodInvocationToTAccess) theEObject;
			T result = caseAbstractMethodInvocationToTAccess(abstractMethodInvocationToTAccess);
			if (result == null)
				result = caseAbstractCorrespondence(abstractMethodInvocationToTAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type To TAbstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type To TAbstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeToTAbstractType(TypeToTAbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Pair To TAnnotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValuePairToTAnnotationValue(AnnotationMemberValuePairToTAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier To TClass Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier To TClass Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifierToTClassEntity(ModifierToTClassEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access To TAccess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccessToTAccess(FieldAccessToTAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameterToTClass(TypeParameterToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAbstract Flow Element To TAbstract Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAbstract Flow Element To TAbstract Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAbstractFlowElementToTAbstractFlowElement(MAbstractFlowElementToTAbstractFlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier To TMethod Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier To TMethod Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifierToTMethodEntity(ModifierToTMethodEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal To TNode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal To TNode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralToTNode(LiteralToTNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier To Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier To Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifierToAbstractType(ModifierToAbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Comment To TText Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Comment To TText Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineCommentToTTextAnnotation(LineCommentToTTextAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation To TAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation To TAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationToTAnnotation(AnnotationToTAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Type To Access Static Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Type To Access Static Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticTypeToAccessStaticType(StaticTypeToAccessStaticType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MModifier To TModifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MModifier To TModifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMModifierToTModifier(MModifierToTModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMethod Name To TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMethod Name To TMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMethodNameToTMethod(MMethodNameToTMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEntry To TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEntry To TParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEntryToTParameter(MEntryToTParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSignature To TSignature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSignature To TSignature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSignatureToTSignature(MSignatureToTSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSyntethic Method To TSyntethic Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSyntethic Method To TSyntethic Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSyntethicMethodToTSyntethicMethod(MSyntethicMethodToTSyntethicMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model To Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model To Type Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelToTypeGraph(ModelToTypeGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package To TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package To TPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageToTPackage(PackageToTPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDefinition To TMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDefinition To TMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDefinitionToTMember(MDefinitionToTMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type Declaration To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedTypeDeclarationToTClass(UnresolvedTypeDeclarationToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AST Node To TAnnotatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AST Node To TAnnotatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTNodeToTAnnotatable(ASTNodeToTAnnotatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Declaration To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier To TField Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier To TField Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifierToTFieldEntity(ModifierToTFieldEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MField Name To TField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MField Name To TField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFieldNameToTField(MFieldNameToTField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFlow To TFlow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFlow To TFlow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFlowToTFlow(MFlowToTFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationFragmentToTFieldDefinition(VariableDeclarationFragmentToTFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSingle Variable Access To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSingle Variable Access To TAccess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSingleVariableAccessToTAccess(MSingleVariableAccessToTAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Invocation To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Invocation To TAccess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodInvocationToTAccess(AbstractMethodInvocationToTAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCorrespondence(AbstractCorrespondence object) {
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

} //PmSwitch
