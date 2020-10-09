/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.ModiscoPackage
 * @generated
 */
public interface ModiscoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModiscoFactory eINSTANCE = org.gravity.tgg.modisco.impl.ModiscoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Primitive Type To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type To TClass</em>'.
	 * @generated
	 */
	PrimitiveTypeToTClass createPrimitiveTypeToTClass();

	/**
	 * Returns a new object of class '<em>MSingle Variable Access To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSingle Variable Access To TAccess</em>'.
	 * @generated
	 */
	MSingleVariableAccessToTAccess createMSingleVariableAccessToTAccess();

	/**
	 * Returns a new object of class '<em>AST Node To TAnnotatable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AST Node To TAnnotatable</em>'.
	 * @generated
	 */
	ASTNodeToTAnnotatable createASTNodeToTAnnotatable();

	/**
	 * Returns a new object of class '<em>Model To Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model To Type Graph</em>'.
	 * @generated
	 */
	ModelToTypeGraph createModelToTypeGraph();

	/**
	 * Returns a new object of class '<em>Unresolved Type Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Type Declaration To TClass</em>'.
	 * @generated
	 */
	UnresolvedTypeDeclarationToTClass createUnresolvedTypeDeclarationToTClass();

	/**
	 * Returns a new object of class '<em>MMethod Name To TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MMethod Name To TMethod</em>'.
	 * @generated
	 */
	MMethodNameToTMethod createMMethodNameToTMethod();

	/**
	 * Returns a new object of class '<em>Annotation Member Value Pair To TAnnotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @generated
	 */
	AnnotationMemberValuePairToTAnnotationValue createAnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns a new object of class '<em>Interface Declaration To TInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Declaration To TInterface</em>'.
	 * @generated
	 */
	InterfaceDeclarationToTInterface createInterfaceDeclarationToTInterface();

	/**
	 * Returns a new object of class '<em>Number Literal To TNumber Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Literal To TNumber Node</em>'.
	 * @generated
	 */
	NumberLiteralToTNumberNode createNumberLiteralToTNumberNode();

	/**
	 * Returns a new object of class '<em>MField Name To TField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MField Name To TField</em>'.
	 * @generated
	 */
	MFieldNameToTField createMFieldNameToTField();

	/**
	 * Returns a new object of class '<em>String Literal To TText Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal To TText Node</em>'.
	 * @generated
	 */
	StringLiteralToTTextNode createStringLiteralToTTextNode();

	/**
	 * Returns a new object of class '<em>Abstract Method Invocation To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Method Invocation To TAccess</em>'.
	 * @generated
	 */
	AbstractMethodInvocationToTAccess createAbstractMethodInvocationToTAccess();

	/**
	 * Returns a new object of class '<em>Type To TAbstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type To TAbstract Type</em>'.
	 * @generated
	 */
	TypeToTAbstractType createTypeToTAbstractType();

	/**
	 * Returns a new object of class '<em>Boolean Literal To TBool Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal To TBool Node</em>'.
	 * @generated
	 */
	BooleanLiteralToTBoolNode createBooleanLiteralToTBoolNode();

	/**
	 * Returns a new object of class '<em>Static Type To Access Static Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Type To Access Static Type</em>'.
	 * @generated
	 */
	StaticTypeToAccessStaticType createStaticTypeToAccessStaticType();

	/**
	 * Returns a new object of class '<em>MAbstract Flow Element To TAbstract Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MAbstract Flow Element To TAbstract Flow Element</em>'.
	 * @generated
	 */
	MAbstractFlowElementToTAbstractFlowElement createMAbstractFlowElementToTAbstractFlowElement();

	/**
	 * Returns a new object of class '<em>Modifier To TClass Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier To TClass Entity</em>'.
	 * @generated
	 */
	ModifierToTClassEntity createModifierToTClassEntity();

	/**
	 * Returns a new object of class '<em>Class Literal To Class Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Literal To Class Node</em>'.
	 * @generated
	 */
	ClassLiteralToClassNode createClassLiteralToClassNode();

	/**
	 * Returns a new object of class '<em>Class Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Declaration To TClass</em>'.
	 * @generated
	 */
	ClassDeclarationToTClass createClassDeclarationToTClass();

	/**
	 * Returns a new object of class '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * @generated
	 */
	VariableDeclarationFragmentToTFieldDefinition createVariableDeclarationFragmentToTFieldDefinition();

	/**
	 * Returns a new object of class '<em>MEntry To TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MEntry To TParameter</em>'.
	 * @generated
	 */
	MEntryToTParameter createMEntryToTParameter();

	/**
	 * Returns a new object of class '<em>MSignature To TSignature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSignature To TSignature</em>'.
	 * @generated
	 */
	MSignatureToTSignature createMSignatureToTSignature();

	/**
	 * Returns a new object of class '<em>Modifier To Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier To Abstract Type</em>'.
	 * @generated
	 */
	ModifierToAbstractType createModifierToAbstractType();

	/**
	 * Returns a new object of class '<em>MFlow To TFlow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MFlow To TFlow</em>'.
	 * @generated
	 */
	MFlowToTFlow createMFlowToTFlow();

	/**
	 * Returns a new object of class '<em>MSyntethic Method To TSyntethic Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSyntethic Method To TSyntethic Method</em>'.
	 * @generated
	 */
	MSyntethicMethodToTSyntethicMethod createMSyntethicMethodToTSyntethicMethod();

	/**
	 * Returns a new object of class '<em>Field Access To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Access To TAccess</em>'.
	 * @generated
	 */
	FieldAccessToTAccess createFieldAccessToTAccess();

	/**
	 * Returns a new object of class '<em>MModifier To TModifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MModifier To TModifier</em>'.
	 * @generated
	 */
	MModifierToTModifier createMModifierToTModifier();

	/**
	 * Returns a new object of class '<em>MDefinition To TMember</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MDefinition To TMember</em>'.
	 * @generated
	 */
	MDefinitionToTMember createMDefinitionToTMember();

	/**
	 * Returns a new object of class '<em>Modifier To TMethod Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier To TMethod Entity</em>'.
	 * @generated
	 */
	ModifierToTMethodEntity createModifierToTMethodEntity();

	/**
	 * Returns a new object of class '<em>Annotation To TAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation To TAnnotation</em>'.
	 * @generated
	 */
	AnnotationToTAnnotation createAnnotationToTAnnotation();

	/**
	 * Returns a new object of class '<em>Anonymous Class Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Class Declaration To TClass</em>'.
	 * @generated
	 */
	AnonymousClassDeclarationToTClass createAnonymousClassDeclarationToTClass();

	/**
	 * Returns a new object of class '<em>Line Comment To TText Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Comment To TText Annotation</em>'.
	 * @generated
	 */
	LineCommentToTTextAnnotation createLineCommentToTTextAnnotation();

	/**
	 * Returns a new object of class '<em>Modifier To TField Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier To TField Entity</em>'.
	 * @generated
	 */
	ModifierToTFieldEntity createModifierToTFieldEntity();

	/**
	 * Returns a new object of class '<em>Package To TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package To TPackage</em>'.
	 * @generated
	 */
	PackageToTPackage createPackageToTPackage();

	/**
	 * Returns a new object of class '<em>Type Parameter To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Parameter To TClass</em>'.
	 * @generated
	 */
	TypeParameterToTClass createTypeParameterToTClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModiscoPackage getModiscoPackage();

} //ModiscoFactory
