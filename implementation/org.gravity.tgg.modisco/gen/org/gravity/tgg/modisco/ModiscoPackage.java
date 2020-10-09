/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.ModiscoFactory
 * @model kind="package"
 * @generated
 */
public interface ModiscoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modisco";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.tgg.modisco/model/Modisco.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.tgg.modisco";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModiscoPackage eINSTANCE = org.gravity.tgg.modisco.impl.ModiscoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.PrimitiveTypeToTClassImpl <em>Primitive Type To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.PrimitiveTypeToTClassImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getPrimitiveTypeToTClass()
	 * @generated
	 */
	int PRIMITIVE_TYPE_TO_TCLASS = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_TO_TCLASS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_TO_TCLASS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Type To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_TO_TCLASS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive Type To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_TO_TCLASS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MSingleVariableAccessToTAccessImpl <em>MSingle Variable Access To TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MSingleVariableAccessToTAccessImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMSingleVariableAccessToTAccess()
	 * @generated
	 */
	int MSINGLE_VARIABLE_ACCESS_TO_TACCESS = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS_TO_TACCESS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS_TO_TACCESS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MSingle Variable Access To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS_TO_TACCESS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MSingle Variable Access To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS_TO_TACCESS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ASTNodeToTAnnotatableImpl <em>AST Node To TAnnotatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ASTNodeToTAnnotatableImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getASTNodeToTAnnotatable()
	 * @generated
	 */
	int AST_NODE_TO_TANNOTATABLE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_TO_TANNOTATABLE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_TO_TANNOTATABLE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AST Node To TAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_TO_TANNOTATABLE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AST Node To TAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_TO_TANNOTATABLE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ModelToTypeGraphImpl <em>Model To Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ModelToTypeGraphImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getModelToTypeGraph()
	 * @generated
	 */
	int MODEL_TO_TYPE_GRAPH = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_TYPE_GRAPH__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_TYPE_GRAPH__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_TYPE_GRAPH_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_TYPE_GRAPH_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.UnresolvedTypeDeclarationToTClassImpl <em>Unresolved Type Declaration To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.UnresolvedTypeDeclarationToTClassImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getUnresolvedTypeDeclarationToTClass()
	 * @generated
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unresolved Type Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unresolved Type Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MMethodNameToTMethodImpl <em>MMethod Name To TMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MMethodNameToTMethodImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMMethodNameToTMethod()
	 * @generated
	 */
	int MMETHOD_NAME_TO_TMETHOD = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_TO_TMETHOD__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_TO_TMETHOD__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MMethod Name To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_TO_TMETHOD_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MMethod Name To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_TO_TMETHOD_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.AnnotationMemberValuePairToTAnnotationValueImpl <em>Annotation Member Value Pair To TAnnotation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.AnnotationMemberValuePairToTAnnotationValueImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>Annotation Member Value Pair To TAnnotation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Annotation Member Value Pair To TAnnotation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.InterfaceDeclarationToTInterfaceImpl <em>Interface Declaration To TInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.InterfaceDeclarationToTInterfaceImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getInterfaceDeclarationToTInterface()
	 * @generated
	 */
	int INTERFACE_DECLARATION_TO_TINTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_TO_TINTERFACE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_TO_TINTERFACE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Declaration To TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_TO_TINTERFACE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface Declaration To TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_TO_TINTERFACE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.NumberLiteralToTNumberNodeImpl <em>Number Literal To TNumber Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.NumberLiteralToTNumberNodeImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getNumberLiteralToTNumberNode()
	 * @generated
	 */
	int NUMBER_LITERAL_TO_TNUMBER_NODE = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_TO_TNUMBER_NODE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_TO_TNUMBER_NODE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Literal To TNumber Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_TO_TNUMBER_NODE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Number Literal To TNumber Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_TO_TNUMBER_NODE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MFieldNameToTFieldImpl <em>MField Name To TField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MFieldNameToTFieldImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMFieldNameToTField()
	 * @generated
	 */
	int MFIELD_NAME_TO_TFIELD = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_TO_TFIELD__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_TO_TFIELD__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MField Name To TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_TO_TFIELD_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MField Name To TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_TO_TFIELD_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.StringLiteralToTTextNodeImpl <em>String Literal To TText Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.StringLiteralToTTextNodeImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getStringLiteralToTTextNode()
	 * @generated
	 */
	int STRING_LITERAL_TO_TTEXT_NODE = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_TO_TTEXT_NODE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_TO_TTEXT_NODE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Literal To TText Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_TO_TTEXT_NODE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String Literal To TText Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_TO_TTEXT_NODE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.AbstractMethodInvocationToTAccessImpl <em>Abstract Method Invocation To TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.AbstractMethodInvocationToTAccessImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAbstractMethodInvocationToTAccess()
	 * @generated
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Method Invocation To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Method Invocation To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.TypeToTAbstractTypeImpl <em>Type To TAbstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.TypeToTAbstractTypeImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getTypeToTAbstractType()
	 * @generated
	 */
	int TYPE_TO_TABSTRACT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TABSTRACT_TYPE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TABSTRACT_TYPE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type To TAbstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TABSTRACT_TYPE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type To TAbstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TABSTRACT_TYPE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.BooleanLiteralToTBoolNodeImpl <em>Boolean Literal To TBool Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.BooleanLiteralToTBoolNodeImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getBooleanLiteralToTBoolNode()
	 * @generated
	 */
	int BOOLEAN_LITERAL_TO_TBOOL_NODE = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_TO_TBOOL_NODE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_TO_TBOOL_NODE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Literal To TBool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_TO_TBOOL_NODE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Literal To TBool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_TO_TBOOL_NODE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.StaticTypeToAccessStaticTypeImpl <em>Static Type To Access Static Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.StaticTypeToAccessStaticTypeImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getStaticTypeToAccessStaticType()
	 * @generated
	 */
	int STATIC_TYPE_TO_ACCESS_STATIC_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TYPE_TO_ACCESS_STATIC_TYPE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TYPE_TO_ACCESS_STATIC_TYPE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Type To Access Static Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TYPE_TO_ACCESS_STATIC_TYPE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Static Type To Access Static Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TYPE_TO_ACCESS_STATIC_TYPE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MAbstractFlowElementToTAbstractFlowElementImpl <em>MAbstract Flow Element To TAbstract Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MAbstractFlowElementToTAbstractFlowElementImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMAbstractFlowElementToTAbstractFlowElement()
	 * @generated
	 */
	int MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>MAbstract Flow Element To TAbstract Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>MAbstract Flow Element To TAbstract Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ModifierToTClassEntityImpl <em>Modifier To TClass Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ModifierToTClassEntityImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getModifierToTClassEntity()
	 * @generated
	 */
	int MODIFIER_TO_TCLASS_ENTITY = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TCLASS_ENTITY__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TCLASS_ENTITY__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modifier To TClass Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TCLASS_ENTITY_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modifier To TClass Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TCLASS_ENTITY_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ClassLiteralToClassNodeImpl <em>Class Literal To Class Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ClassLiteralToClassNodeImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getClassLiteralToClassNode()
	 * @generated
	 */
	int CLASS_LITERAL_TO_CLASS_NODE = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LITERAL_TO_CLASS_NODE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LITERAL_TO_CLASS_NODE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Literal To Class Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LITERAL_TO_CLASS_NODE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Literal To Class Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LITERAL_TO_CLASS_NODE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ClassDeclarationToTClassImpl <em>Class Declaration To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ClassDeclarationToTClassImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getClassDeclarationToTClass()
	 * @generated
	 */
	int CLASS_DECLARATION_TO_TCLASS = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_TO_TCLASS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_TO_TCLASS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_TO_TCLASS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_TO_TCLASS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.VariableDeclarationFragmentToTFieldDefinitionImpl <em>Variable Declaration Fragment To TField Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.VariableDeclarationFragmentToTFieldDefinitionImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getVariableDeclarationFragmentToTFieldDefinition()
	 * @generated
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>Variable Declaration Fragment To TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Variable Declaration Fragment To TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MEntryToTParameterImpl <em>MEntry To TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MEntryToTParameterImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMEntryToTParameter()
	 * @generated
	 */
	int MENTRY_TO_TPARAMETER = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_TO_TPARAMETER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_TO_TPARAMETER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MEntry To TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_TO_TPARAMETER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MEntry To TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_TO_TPARAMETER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MSignatureToTSignatureImpl <em>MSignature To TSignature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MSignatureToTSignatureImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMSignatureToTSignature()
	 * @generated
	 */
	int MSIGNATURE_TO_TSIGNATURE = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TSIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TSIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MSignature To TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TSIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MSignature To TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TSIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ModifierToAbstractTypeImpl <em>Modifier To Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ModifierToAbstractTypeImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getModifierToAbstractType()
	 * @generated
	 */
	int MODIFIER_TO_ABSTRACT_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_ABSTRACT_TYPE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_ABSTRACT_TYPE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modifier To Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_ABSTRACT_TYPE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modifier To Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_ABSTRACT_TYPE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MFlowToTFlowImpl <em>MFlow To TFlow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MFlowToTFlowImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMFlowToTFlow()
	 * @generated
	 */
	int MFLOW_TO_TFLOW = 23;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW_TO_TFLOW__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW_TO_TFLOW__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MFlow To TFlow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW_TO_TFLOW_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MFlow To TFlow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW_TO_TFLOW_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MSyntethicMethodToTSyntethicMethodImpl <em>MSyntethic Method To TSyntethic Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MSyntethicMethodToTSyntethicMethodImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMSyntethicMethodToTSyntethicMethod()
	 * @generated
	 */
	int MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD = 24;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MSyntethic Method To TSyntethic Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MSyntethic Method To TSyntethic Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.FieldAccessToTAccessImpl <em>Field Access To TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.FieldAccessToTAccessImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getFieldAccessToTAccess()
	 * @generated
	 */
	int FIELD_ACCESS_TO_TACCESS = 25;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_TO_TACCESS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_TO_TACCESS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Access To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_TO_TACCESS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field Access To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_TO_TACCESS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MModifierToTModifierImpl <em>MModifier To TModifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MModifierToTModifierImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMModifierToTModifier()
	 * @generated
	 */
	int MMODIFIER_TO_TMODIFIER = 26;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODIFIER_TO_TMODIFIER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODIFIER_TO_TMODIFIER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MModifier To TModifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODIFIER_TO_TMODIFIER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MModifier To TModifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODIFIER_TO_TMODIFIER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MDefinitionToTMemberImpl <em>MDefinition To TMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MDefinitionToTMemberImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMDefinitionToTMember()
	 * @generated
	 */
	int MDEFINITION_TO_TMEMBER = 27;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TMEMBER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TMEMBER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MDefinition To TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TMEMBER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MDefinition To TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TMEMBER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ModifierToTMethodEntityImpl <em>Modifier To TMethod Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ModifierToTMethodEntityImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getModifierToTMethodEntity()
	 * @generated
	 */
	int MODIFIER_TO_TMETHOD_ENTITY = 28;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TMETHOD_ENTITY__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TMETHOD_ENTITY__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modifier To TMethod Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TMETHOD_ENTITY_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modifier To TMethod Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TMETHOD_ENTITY_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.AnnotationToTAnnotationImpl <em>Annotation To TAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.AnnotationToTAnnotationImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAnnotationToTAnnotation()
	 * @generated
	 */
	int ANNOTATION_TO_TANNOTATION = 29;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TO_TANNOTATION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TO_TANNOTATION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation To TAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TO_TANNOTATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Annotation To TAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TO_TANNOTATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.AnonymousClassDeclarationToTClassImpl <em>Anonymous Class Declaration To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.AnonymousClassDeclarationToTClassImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS = 30;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Anonymous Class Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Anonymous Class Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.LineCommentToTTextAnnotationImpl <em>Line Comment To TText Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.LineCommentToTTextAnnotationImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getLineCommentToTTextAnnotation()
	 * @generated
	 */
	int LINE_COMMENT_TO_TTEXT_ANNOTATION = 31;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT_TO_TTEXT_ANNOTATION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT_TO_TTEXT_ANNOTATION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Line Comment To TText Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT_TO_TTEXT_ANNOTATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Line Comment To TText Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT_TO_TTEXT_ANNOTATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ModifierToTFieldEntityImpl <em>Modifier To TField Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ModifierToTFieldEntityImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getModifierToTFieldEntity()
	 * @generated
	 */
	int MODIFIER_TO_TFIELD_ENTITY = 32;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TFIELD_ENTITY__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TFIELD_ENTITY__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modifier To TField Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TFIELD_ENTITY_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modifier To TField Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TFIELD_ENTITY_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.PackageToTPackageImpl <em>Package To TPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.PackageToTPackageImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getPackageToTPackage()
	 * @generated
	 */
	int PACKAGE_TO_TPACKAGE = 33;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_TPACKAGE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_TPACKAGE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package To TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_TPACKAGE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package To TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_TPACKAGE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.TypeParameterToTClassImpl <em>Type Parameter To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.TypeParameterToTClassImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getTypeParameterToTClass()
	 * @generated
	 */
	int TYPE_PARAMETER_TO_TCLASS = 34;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_TO_TCLASS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_TO_TCLASS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Parameter To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_TO_TCLASS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Parameter To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_TO_TCLASS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.PrimitiveTypeToTClass <em>Primitive Type To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type To TClass</em>'.
	 * @see org.gravity.tgg.modisco.PrimitiveTypeToTClass
	 * @generated
	 */
	EClass getPrimitiveTypeToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.PrimitiveTypeToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.PrimitiveTypeToTClass#getSource()
	 * @see #getPrimitiveTypeToTClass()
	 * @generated
	 */
	EReference getPrimitiveTypeToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.PrimitiveTypeToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.PrimitiveTypeToTClass#getTarget()
	 * @see #getPrimitiveTypeToTClass()
	 * @generated
	 */
	EReference getPrimitiveTypeToTClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MSingleVariableAccessToTAccess <em>MSingle Variable Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSingle Variable Access To TAccess</em>'.
	 * @see org.gravity.tgg.modisco.MSingleVariableAccessToTAccess
	 * @generated
	 */
	EClass getMSingleVariableAccessToTAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MSingleVariableAccessToTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MSingleVariableAccessToTAccess#getSource()
	 * @see #getMSingleVariableAccessToTAccess()
	 * @generated
	 */
	EReference getMSingleVariableAccessToTAccess_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MSingleVariableAccessToTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MSingleVariableAccessToTAccess#getTarget()
	 * @see #getMSingleVariableAccessToTAccess()
	 * @generated
	 */
	EReference getMSingleVariableAccessToTAccess_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ASTNodeToTAnnotatable <em>AST Node To TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AST Node To TAnnotatable</em>'.
	 * @see org.gravity.tgg.modisco.ASTNodeToTAnnotatable
	 * @generated
	 */
	EClass getASTNodeToTAnnotatable();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ASTNodeToTAnnotatable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ASTNodeToTAnnotatable#getSource()
	 * @see #getASTNodeToTAnnotatable()
	 * @generated
	 */
	EReference getASTNodeToTAnnotatable_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ASTNodeToTAnnotatable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ASTNodeToTAnnotatable#getTarget()
	 * @see #getASTNodeToTAnnotatable()
	 * @generated
	 */
	EReference getASTNodeToTAnnotatable_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ModelToTypeGraph <em>Model To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model To Type Graph</em>'.
	 * @see org.gravity.tgg.modisco.ModelToTypeGraph
	 * @generated
	 */
	EClass getModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ModelToTypeGraph#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ModelToTypeGraph#getSource()
	 * @see #getModelToTypeGraph()
	 * @generated
	 */
	EReference getModelToTypeGraph_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ModelToTypeGraph#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ModelToTypeGraph#getTarget()
	 * @see #getModelToTypeGraph()
	 * @generated
	 */
	EReference getModelToTypeGraph_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass <em>Unresolved Type Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Type Declaration To TClass</em>'.
	 * @see org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass
	 * @generated
	 */
	EClass getUnresolvedTypeDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass#getSource()
	 * @see #getUnresolvedTypeDeclarationToTClass()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclarationToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass#getTarget()
	 * @see #getUnresolvedTypeDeclarationToTClass()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclarationToTClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MMethodNameToTMethod <em>MMethod Name To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMethod Name To TMethod</em>'.
	 * @see org.gravity.tgg.modisco.MMethodNameToTMethod
	 * @generated
	 */
	EClass getMMethodNameToTMethod();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MMethodNameToTMethod#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MMethodNameToTMethod#getSource()
	 * @see #getMMethodNameToTMethod()
	 * @generated
	 */
	EReference getMMethodNameToTMethod_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MMethodNameToTMethod#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MMethodNameToTMethod#getTarget()
	 * @see #getMMethodNameToTMethod()
	 * @generated
	 */
	EReference getMMethodNameToTMethod_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue <em>Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue
	 * @generated
	 */
	EClass getAnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue#getSource()
	 * @see #getAnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 */
	EReference getAnnotationMemberValuePairToTAnnotationValue_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue#getTarget()
	 * @see #getAnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 */
	EReference getAnnotationMemberValuePairToTAnnotationValue_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.InterfaceDeclarationToTInterface <em>Interface Declaration To TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Declaration To TInterface</em>'.
	 * @see org.gravity.tgg.modisco.InterfaceDeclarationToTInterface
	 * @generated
	 */
	EClass getInterfaceDeclarationToTInterface();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.InterfaceDeclarationToTInterface#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.InterfaceDeclarationToTInterface#getSource()
	 * @see #getInterfaceDeclarationToTInterface()
	 * @generated
	 */
	EReference getInterfaceDeclarationToTInterface_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.InterfaceDeclarationToTInterface#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.InterfaceDeclarationToTInterface#getTarget()
	 * @see #getInterfaceDeclarationToTInterface()
	 * @generated
	 */
	EReference getInterfaceDeclarationToTInterface_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.NumberLiteralToTNumberNode <em>Number Literal To TNumber Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal To TNumber Node</em>'.
	 * @see org.gravity.tgg.modisco.NumberLiteralToTNumberNode
	 * @generated
	 */
	EClass getNumberLiteralToTNumberNode();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.NumberLiteralToTNumberNode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.NumberLiteralToTNumberNode#getSource()
	 * @see #getNumberLiteralToTNumberNode()
	 * @generated
	 */
	EReference getNumberLiteralToTNumberNode_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.NumberLiteralToTNumberNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.NumberLiteralToTNumberNode#getTarget()
	 * @see #getNumberLiteralToTNumberNode()
	 * @generated
	 */
	EReference getNumberLiteralToTNumberNode_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MFieldNameToTField <em>MField Name To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MField Name To TField</em>'.
	 * @see org.gravity.tgg.modisco.MFieldNameToTField
	 * @generated
	 */
	EClass getMFieldNameToTField();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MFieldNameToTField#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MFieldNameToTField#getSource()
	 * @see #getMFieldNameToTField()
	 * @generated
	 */
	EReference getMFieldNameToTField_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MFieldNameToTField#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MFieldNameToTField#getTarget()
	 * @see #getMFieldNameToTField()
	 * @generated
	 */
	EReference getMFieldNameToTField_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.StringLiteralToTTextNode <em>String Literal To TText Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal To TText Node</em>'.
	 * @see org.gravity.tgg.modisco.StringLiteralToTTextNode
	 * @generated
	 */
	EClass getStringLiteralToTTextNode();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.StringLiteralToTTextNode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.StringLiteralToTTextNode#getSource()
	 * @see #getStringLiteralToTTextNode()
	 * @generated
	 */
	EReference getStringLiteralToTTextNode_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.StringLiteralToTTextNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.StringLiteralToTTextNode#getTarget()
	 * @see #getStringLiteralToTTextNode()
	 * @generated
	 */
	EReference getStringLiteralToTTextNode_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess <em>Abstract Method Invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Method Invocation To TAccess</em>'.
	 * @see org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess
	 * @generated
	 */
	EClass getAbstractMethodInvocationToTAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess#getSource()
	 * @see #getAbstractMethodInvocationToTAccess()
	 * @generated
	 */
	EReference getAbstractMethodInvocationToTAccess_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess#getTarget()
	 * @see #getAbstractMethodInvocationToTAccess()
	 * @generated
	 */
	EReference getAbstractMethodInvocationToTAccess_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.TypeToTAbstractType <em>Type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type To TAbstract Type</em>'.
	 * @see org.gravity.tgg.modisco.TypeToTAbstractType
	 * @generated
	 */
	EClass getTypeToTAbstractType();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.TypeToTAbstractType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.TypeToTAbstractType#getSource()
	 * @see #getTypeToTAbstractType()
	 * @generated
	 */
	EReference getTypeToTAbstractType_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.TypeToTAbstractType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.TypeToTAbstractType#getTarget()
	 * @see #getTypeToTAbstractType()
	 * @generated
	 */
	EReference getTypeToTAbstractType_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.BooleanLiteralToTBoolNode <em>Boolean Literal To TBool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal To TBool Node</em>'.
	 * @see org.gravity.tgg.modisco.BooleanLiteralToTBoolNode
	 * @generated
	 */
	EClass getBooleanLiteralToTBoolNode();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.BooleanLiteralToTBoolNode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.BooleanLiteralToTBoolNode#getSource()
	 * @see #getBooleanLiteralToTBoolNode()
	 * @generated
	 */
	EReference getBooleanLiteralToTBoolNode_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.BooleanLiteralToTBoolNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.BooleanLiteralToTBoolNode#getTarget()
	 * @see #getBooleanLiteralToTBoolNode()
	 * @generated
	 */
	EReference getBooleanLiteralToTBoolNode_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.StaticTypeToAccessStaticType <em>Static Type To Access Static Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Type To Access Static Type</em>'.
	 * @see org.gravity.tgg.modisco.StaticTypeToAccessStaticType
	 * @generated
	 */
	EClass getStaticTypeToAccessStaticType();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.StaticTypeToAccessStaticType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.StaticTypeToAccessStaticType#getSource()
	 * @see #getStaticTypeToAccessStaticType()
	 * @generated
	 */
	EReference getStaticTypeToAccessStaticType_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.StaticTypeToAccessStaticType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.StaticTypeToAccessStaticType#getTarget()
	 * @see #getStaticTypeToAccessStaticType()
	 * @generated
	 */
	EReference getStaticTypeToAccessStaticType_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MAbstractFlowElementToTAbstractFlowElement <em>MAbstract Flow Element To TAbstract Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAbstract Flow Element To TAbstract Flow Element</em>'.
	 * @see org.gravity.tgg.modisco.MAbstractFlowElementToTAbstractFlowElement
	 * @generated
	 */
	EClass getMAbstractFlowElementToTAbstractFlowElement();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MAbstractFlowElementToTAbstractFlowElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MAbstractFlowElementToTAbstractFlowElement#getSource()
	 * @see #getMAbstractFlowElementToTAbstractFlowElement()
	 * @generated
	 */
	EReference getMAbstractFlowElementToTAbstractFlowElement_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MAbstractFlowElementToTAbstractFlowElement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MAbstractFlowElementToTAbstractFlowElement#getTarget()
	 * @see #getMAbstractFlowElementToTAbstractFlowElement()
	 * @generated
	 */
	EReference getMAbstractFlowElementToTAbstractFlowElement_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ModifierToTClassEntity <em>Modifier To TClass Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier To TClass Entity</em>'.
	 * @see org.gravity.tgg.modisco.ModifierToTClassEntity
	 * @generated
	 */
	EClass getModifierToTClassEntity();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ModifierToTClassEntity#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ModifierToTClassEntity#getSource()
	 * @see #getModifierToTClassEntity()
	 * @generated
	 */
	EReference getModifierToTClassEntity_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ModifierToTClassEntity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ModifierToTClassEntity#getTarget()
	 * @see #getModifierToTClassEntity()
	 * @generated
	 */
	EReference getModifierToTClassEntity_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ClassLiteralToClassNode <em>Class Literal To Class Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Literal To Class Node</em>'.
	 * @see org.gravity.tgg.modisco.ClassLiteralToClassNode
	 * @generated
	 */
	EClass getClassLiteralToClassNode();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ClassLiteralToClassNode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ClassLiteralToClassNode#getSource()
	 * @see #getClassLiteralToClassNode()
	 * @generated
	 */
	EReference getClassLiteralToClassNode_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ClassLiteralToClassNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ClassLiteralToClassNode#getTarget()
	 * @see #getClassLiteralToClassNode()
	 * @generated
	 */
	EReference getClassLiteralToClassNode_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ClassDeclarationToTClass <em>Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Declaration To TClass</em>'.
	 * @see org.gravity.tgg.modisco.ClassDeclarationToTClass
	 * @generated
	 */
	EClass getClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ClassDeclarationToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ClassDeclarationToTClass#getSource()
	 * @see #getClassDeclarationToTClass()
	 * @generated
	 */
	EReference getClassDeclarationToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ClassDeclarationToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ClassDeclarationToTClass#getTarget()
	 * @see #getClassDeclarationToTClass()
	 * @generated
	 */
	EReference getClassDeclarationToTClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition <em>Variable Declaration Fragment To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * @see org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition
	 * @generated
	 */
	EClass getVariableDeclarationFragmentToTFieldDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition#getSource()
	 * @see #getVariableDeclarationFragmentToTFieldDefinition()
	 * @generated
	 */
	EReference getVariableDeclarationFragmentToTFieldDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition#getTarget()
	 * @see #getVariableDeclarationFragmentToTFieldDefinition()
	 * @generated
	 */
	EReference getVariableDeclarationFragmentToTFieldDefinition_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MEntryToTParameter <em>MEntry To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MEntry To TParameter</em>'.
	 * @see org.gravity.tgg.modisco.MEntryToTParameter
	 * @generated
	 */
	EClass getMEntryToTParameter();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MEntryToTParameter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MEntryToTParameter#getSource()
	 * @see #getMEntryToTParameter()
	 * @generated
	 */
	EReference getMEntryToTParameter_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MEntryToTParameter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MEntryToTParameter#getTarget()
	 * @see #getMEntryToTParameter()
	 * @generated
	 */
	EReference getMEntryToTParameter_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MSignatureToTSignature <em>MSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSignature To TSignature</em>'.
	 * @see org.gravity.tgg.modisco.MSignatureToTSignature
	 * @generated
	 */
	EClass getMSignatureToTSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MSignatureToTSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MSignatureToTSignature#getSource()
	 * @see #getMSignatureToTSignature()
	 * @generated
	 */
	EReference getMSignatureToTSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MSignatureToTSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MSignatureToTSignature#getTarget()
	 * @see #getMSignatureToTSignature()
	 * @generated
	 */
	EReference getMSignatureToTSignature_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ModifierToAbstractType <em>Modifier To Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier To Abstract Type</em>'.
	 * @see org.gravity.tgg.modisco.ModifierToAbstractType
	 * @generated
	 */
	EClass getModifierToAbstractType();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ModifierToAbstractType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ModifierToAbstractType#getSource()
	 * @see #getModifierToAbstractType()
	 * @generated
	 */
	EReference getModifierToAbstractType_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ModifierToAbstractType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ModifierToAbstractType#getTarget()
	 * @see #getModifierToAbstractType()
	 * @generated
	 */
	EReference getModifierToAbstractType_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MFlowToTFlow <em>MFlow To TFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFlow To TFlow</em>'.
	 * @see org.gravity.tgg.modisco.MFlowToTFlow
	 * @generated
	 */
	EClass getMFlowToTFlow();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MFlowToTFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MFlowToTFlow#getSource()
	 * @see #getMFlowToTFlow()
	 * @generated
	 */
	EReference getMFlowToTFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MFlowToTFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MFlowToTFlow#getTarget()
	 * @see #getMFlowToTFlow()
	 * @generated
	 */
	EReference getMFlowToTFlow_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MSyntethicMethodToTSyntethicMethod <em>MSyntethic Method To TSyntethic Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSyntethic Method To TSyntethic Method</em>'.
	 * @see org.gravity.tgg.modisco.MSyntethicMethodToTSyntethicMethod
	 * @generated
	 */
	EClass getMSyntethicMethodToTSyntethicMethod();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MSyntethicMethodToTSyntethicMethod#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MSyntethicMethodToTSyntethicMethod#getSource()
	 * @see #getMSyntethicMethodToTSyntethicMethod()
	 * @generated
	 */
	EReference getMSyntethicMethodToTSyntethicMethod_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MSyntethicMethodToTSyntethicMethod#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MSyntethicMethodToTSyntethicMethod#getTarget()
	 * @see #getMSyntethicMethodToTSyntethicMethod()
	 * @generated
	 */
	EReference getMSyntethicMethodToTSyntethicMethod_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.FieldAccessToTAccess <em>Field Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Access To TAccess</em>'.
	 * @see org.gravity.tgg.modisco.FieldAccessToTAccess
	 * @generated
	 */
	EClass getFieldAccessToTAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.FieldAccessToTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.FieldAccessToTAccess#getSource()
	 * @see #getFieldAccessToTAccess()
	 * @generated
	 */
	EReference getFieldAccessToTAccess_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.FieldAccessToTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.FieldAccessToTAccess#getTarget()
	 * @see #getFieldAccessToTAccess()
	 * @generated
	 */
	EReference getFieldAccessToTAccess_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MModifierToTModifier <em>MModifier To TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MModifier To TModifier</em>'.
	 * @see org.gravity.tgg.modisco.MModifierToTModifier
	 * @generated
	 */
	EClass getMModifierToTModifier();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MModifierToTModifier#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MModifierToTModifier#getSource()
	 * @see #getMModifierToTModifier()
	 * @generated
	 */
	EReference getMModifierToTModifier_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MModifierToTModifier#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MModifierToTModifier#getTarget()
	 * @see #getMModifierToTModifier()
	 * @generated
	 */
	EReference getMModifierToTModifier_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MDefinitionToTMember <em>MDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MDefinition To TMember</em>'.
	 * @see org.gravity.tgg.modisco.MDefinitionToTMember
	 * @generated
	 */
	EClass getMDefinitionToTMember();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MDefinitionToTMember#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MDefinitionToTMember#getSource()
	 * @see #getMDefinitionToTMember()
	 * @generated
	 */
	EReference getMDefinitionToTMember_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MDefinitionToTMember#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MDefinitionToTMember#getTarget()
	 * @see #getMDefinitionToTMember()
	 * @generated
	 */
	EReference getMDefinitionToTMember_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ModifierToTMethodEntity <em>Modifier To TMethod Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier To TMethod Entity</em>'.
	 * @see org.gravity.tgg.modisco.ModifierToTMethodEntity
	 * @generated
	 */
	EClass getModifierToTMethodEntity();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ModifierToTMethodEntity#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ModifierToTMethodEntity#getSource()
	 * @see #getModifierToTMethodEntity()
	 * @generated
	 */
	EReference getModifierToTMethodEntity_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ModifierToTMethodEntity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ModifierToTMethodEntity#getTarget()
	 * @see #getModifierToTMethodEntity()
	 * @generated
	 */
	EReference getModifierToTMethodEntity_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.AnnotationToTAnnotation <em>Annotation To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation To TAnnotation</em>'.
	 * @see org.gravity.tgg.modisco.AnnotationToTAnnotation
	 * @generated
	 */
	EClass getAnnotationToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AnnotationToTAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.AnnotationToTAnnotation#getSource()
	 * @see #getAnnotationToTAnnotation()
	 * @generated
	 */
	EReference getAnnotationToTAnnotation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AnnotationToTAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.AnnotationToTAnnotation#getTarget()
	 * @see #getAnnotationToTAnnotation()
	 * @generated
	 */
	EReference getAnnotationToTAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass <em>Anonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Class Declaration To TClass</em>'.
	 * @see org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass
	 * @generated
	 */
	EClass getAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass#getSource()
	 * @see #getAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	EReference getAnonymousClassDeclarationToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass#getTarget()
	 * @see #getAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	EReference getAnonymousClassDeclarationToTClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.LineCommentToTTextAnnotation <em>Line Comment To TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Comment To TText Annotation</em>'.
	 * @see org.gravity.tgg.modisco.LineCommentToTTextAnnotation
	 * @generated
	 */
	EClass getLineCommentToTTextAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.LineCommentToTTextAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.LineCommentToTTextAnnotation#getSource()
	 * @see #getLineCommentToTTextAnnotation()
	 * @generated
	 */
	EReference getLineCommentToTTextAnnotation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.LineCommentToTTextAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.LineCommentToTTextAnnotation#getTarget()
	 * @see #getLineCommentToTTextAnnotation()
	 * @generated
	 */
	EReference getLineCommentToTTextAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ModifierToTFieldEntity <em>Modifier To TField Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier To TField Entity</em>'.
	 * @see org.gravity.tgg.modisco.ModifierToTFieldEntity
	 * @generated
	 */
	EClass getModifierToTFieldEntity();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ModifierToTFieldEntity#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ModifierToTFieldEntity#getSource()
	 * @see #getModifierToTFieldEntity()
	 * @generated
	 */
	EReference getModifierToTFieldEntity_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ModifierToTFieldEntity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ModifierToTFieldEntity#getTarget()
	 * @see #getModifierToTFieldEntity()
	 * @generated
	 */
	EReference getModifierToTFieldEntity_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.PackageToTPackage <em>Package To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package To TPackage</em>'.
	 * @see org.gravity.tgg.modisco.PackageToTPackage
	 * @generated
	 */
	EClass getPackageToTPackage();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.PackageToTPackage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.PackageToTPackage#getSource()
	 * @see #getPackageToTPackage()
	 * @generated
	 */
	EReference getPackageToTPackage_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.PackageToTPackage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.PackageToTPackage#getTarget()
	 * @see #getPackageToTPackage()
	 * @generated
	 */
	EReference getPackageToTPackage_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.TypeParameterToTClass <em>Type Parameter To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter To TClass</em>'.
	 * @see org.gravity.tgg.modisco.TypeParameterToTClass
	 * @generated
	 */
	EClass getTypeParameterToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.TypeParameterToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.TypeParameterToTClass#getSource()
	 * @see #getTypeParameterToTClass()
	 * @generated
	 */
	EReference getTypeParameterToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.TypeParameterToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.TypeParameterToTClass#getTarget()
	 * @see #getTypeParameterToTClass()
	 * @generated
	 */
	EReference getTypeParameterToTClass_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModiscoFactory getModiscoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.PrimitiveTypeToTClassImpl <em>Primitive Type To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.PrimitiveTypeToTClassImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getPrimitiveTypeToTClass()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_TO_TCLASS = eINSTANCE.getPrimitiveTypeToTClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE_TO_TCLASS__SOURCE = eINSTANCE.getPrimitiveTypeToTClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE_TO_TCLASS__TARGET = eINSTANCE.getPrimitiveTypeToTClass_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MSingleVariableAccessToTAccessImpl <em>MSingle Variable Access To TAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MSingleVariableAccessToTAccessImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMSingleVariableAccessToTAccess()
		 * @generated
		 */
		EClass MSINGLE_VARIABLE_ACCESS_TO_TACCESS = eINSTANCE.getMSingleVariableAccessToTAccess();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSINGLE_VARIABLE_ACCESS_TO_TACCESS__SOURCE = eINSTANCE.getMSingleVariableAccessToTAccess_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSINGLE_VARIABLE_ACCESS_TO_TACCESS__TARGET = eINSTANCE.getMSingleVariableAccessToTAccess_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ASTNodeToTAnnotatableImpl <em>AST Node To TAnnotatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ASTNodeToTAnnotatableImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getASTNodeToTAnnotatable()
		 * @generated
		 */
		EClass AST_NODE_TO_TANNOTATABLE = eINSTANCE.getASTNodeToTAnnotatable();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AST_NODE_TO_TANNOTATABLE__SOURCE = eINSTANCE.getASTNodeToTAnnotatable_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AST_NODE_TO_TANNOTATABLE__TARGET = eINSTANCE.getASTNodeToTAnnotatable_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ModelToTypeGraphImpl <em>Model To Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ModelToTypeGraphImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getModelToTypeGraph()
		 * @generated
		 */
		EClass MODEL_TO_TYPE_GRAPH = eINSTANCE.getModelToTypeGraph();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TO_TYPE_GRAPH__SOURCE = eINSTANCE.getModelToTypeGraph_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TO_TYPE_GRAPH__TARGET = eINSTANCE.getModelToTypeGraph_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.UnresolvedTypeDeclarationToTClassImpl <em>Unresolved Type Declaration To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.UnresolvedTypeDeclarationToTClassImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getUnresolvedTypeDeclarationToTClass()
		 * @generated
		 */
		EClass UNRESOLVED_TYPE_DECLARATION_TO_TCLASS = eINSTANCE.getUnresolvedTypeDeclarationToTClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__SOURCE = eINSTANCE
				.getUnresolvedTypeDeclarationToTClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__TARGET = eINSTANCE
				.getUnresolvedTypeDeclarationToTClass_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MMethodNameToTMethodImpl <em>MMethod Name To TMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MMethodNameToTMethodImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMMethodNameToTMethod()
		 * @generated
		 */
		EClass MMETHOD_NAME_TO_TMETHOD = eINSTANCE.getMMethodNameToTMethod();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_NAME_TO_TMETHOD__SOURCE = eINSTANCE.getMMethodNameToTMethod_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_NAME_TO_TMETHOD__TARGET = eINSTANCE.getMMethodNameToTMethod_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.AnnotationMemberValuePairToTAnnotationValueImpl <em>Annotation Member Value Pair To TAnnotation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.AnnotationMemberValuePairToTAnnotationValueImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAnnotationMemberValuePairToTAnnotationValue()
		 * @generated
		 */
		EClass ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = eINSTANCE
				.getAnnotationMemberValuePairToTAnnotationValue();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__SOURCE = eINSTANCE
				.getAnnotationMemberValuePairToTAnnotationValue_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__TARGET = eINSTANCE
				.getAnnotationMemberValuePairToTAnnotationValue_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.InterfaceDeclarationToTInterfaceImpl <em>Interface Declaration To TInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.InterfaceDeclarationToTInterfaceImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getInterfaceDeclarationToTInterface()
		 * @generated
		 */
		EClass INTERFACE_DECLARATION_TO_TINTERFACE = eINSTANCE.getInterfaceDeclarationToTInterface();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DECLARATION_TO_TINTERFACE__SOURCE = eINSTANCE.getInterfaceDeclarationToTInterface_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DECLARATION_TO_TINTERFACE__TARGET = eINSTANCE.getInterfaceDeclarationToTInterface_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.NumberLiteralToTNumberNodeImpl <em>Number Literal To TNumber Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.NumberLiteralToTNumberNodeImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getNumberLiteralToTNumberNode()
		 * @generated
		 */
		EClass NUMBER_LITERAL_TO_TNUMBER_NODE = eINSTANCE.getNumberLiteralToTNumberNode();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_LITERAL_TO_TNUMBER_NODE__SOURCE = eINSTANCE.getNumberLiteralToTNumberNode_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_LITERAL_TO_TNUMBER_NODE__TARGET = eINSTANCE.getNumberLiteralToTNumberNode_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MFieldNameToTFieldImpl <em>MField Name To TField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MFieldNameToTFieldImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMFieldNameToTField()
		 * @generated
		 */
		EClass MFIELD_NAME_TO_TFIELD = eINSTANCE.getMFieldNameToTField();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_NAME_TO_TFIELD__SOURCE = eINSTANCE.getMFieldNameToTField_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_NAME_TO_TFIELD__TARGET = eINSTANCE.getMFieldNameToTField_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.StringLiteralToTTextNodeImpl <em>String Literal To TText Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.StringLiteralToTTextNodeImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getStringLiteralToTTextNode()
		 * @generated
		 */
		EClass STRING_LITERAL_TO_TTEXT_NODE = eINSTANCE.getStringLiteralToTTextNode();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_LITERAL_TO_TTEXT_NODE__SOURCE = eINSTANCE.getStringLiteralToTTextNode_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_LITERAL_TO_TTEXT_NODE__TARGET = eINSTANCE.getStringLiteralToTTextNode_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.AbstractMethodInvocationToTAccessImpl <em>Abstract Method Invocation To TAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.AbstractMethodInvocationToTAccessImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAbstractMethodInvocationToTAccess()
		 * @generated
		 */
		EClass ABSTRACT_METHOD_INVOCATION_TO_TACCESS = eINSTANCE.getAbstractMethodInvocationToTAccess();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_METHOD_INVOCATION_TO_TACCESS__SOURCE = eINSTANCE
				.getAbstractMethodInvocationToTAccess_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_METHOD_INVOCATION_TO_TACCESS__TARGET = eINSTANCE
				.getAbstractMethodInvocationToTAccess_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.TypeToTAbstractTypeImpl <em>Type To TAbstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.TypeToTAbstractTypeImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getTypeToTAbstractType()
		 * @generated
		 */
		EClass TYPE_TO_TABSTRACT_TYPE = eINSTANCE.getTypeToTAbstractType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TO_TABSTRACT_TYPE__SOURCE = eINSTANCE.getTypeToTAbstractType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TO_TABSTRACT_TYPE__TARGET = eINSTANCE.getTypeToTAbstractType_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.BooleanLiteralToTBoolNodeImpl <em>Boolean Literal To TBool Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.BooleanLiteralToTBoolNodeImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getBooleanLiteralToTBoolNode()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL_TO_TBOOL_NODE = eINSTANCE.getBooleanLiteralToTBoolNode();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_LITERAL_TO_TBOOL_NODE__SOURCE = eINSTANCE.getBooleanLiteralToTBoolNode_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_LITERAL_TO_TBOOL_NODE__TARGET = eINSTANCE.getBooleanLiteralToTBoolNode_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.StaticTypeToAccessStaticTypeImpl <em>Static Type To Access Static Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.StaticTypeToAccessStaticTypeImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getStaticTypeToAccessStaticType()
		 * @generated
		 */
		EClass STATIC_TYPE_TO_ACCESS_STATIC_TYPE = eINSTANCE.getStaticTypeToAccessStaticType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_TYPE_TO_ACCESS_STATIC_TYPE__SOURCE = eINSTANCE.getStaticTypeToAccessStaticType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_TYPE_TO_ACCESS_STATIC_TYPE__TARGET = eINSTANCE.getStaticTypeToAccessStaticType_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MAbstractFlowElementToTAbstractFlowElementImpl <em>MAbstract Flow Element To TAbstract Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MAbstractFlowElementToTAbstractFlowElementImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMAbstractFlowElementToTAbstractFlowElement()
		 * @generated
		 */
		EClass MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT = eINSTANCE
				.getMAbstractFlowElementToTAbstractFlowElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE = eINSTANCE
				.getMAbstractFlowElementToTAbstractFlowElement_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET = eINSTANCE
				.getMAbstractFlowElementToTAbstractFlowElement_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ModifierToTClassEntityImpl <em>Modifier To TClass Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ModifierToTClassEntityImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getModifierToTClassEntity()
		 * @generated
		 */
		EClass MODIFIER_TO_TCLASS_ENTITY = eINSTANCE.getModifierToTClassEntity();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER_TO_TCLASS_ENTITY__SOURCE = eINSTANCE.getModifierToTClassEntity_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER_TO_TCLASS_ENTITY__TARGET = eINSTANCE.getModifierToTClassEntity_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ClassLiteralToClassNodeImpl <em>Class Literal To Class Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ClassLiteralToClassNodeImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getClassLiteralToClassNode()
		 * @generated
		 */
		EClass CLASS_LITERAL_TO_CLASS_NODE = eINSTANCE.getClassLiteralToClassNode();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LITERAL_TO_CLASS_NODE__SOURCE = eINSTANCE.getClassLiteralToClassNode_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LITERAL_TO_CLASS_NODE__TARGET = eINSTANCE.getClassLiteralToClassNode_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ClassDeclarationToTClassImpl <em>Class Declaration To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ClassDeclarationToTClassImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getClassDeclarationToTClass()
		 * @generated
		 */
		EClass CLASS_DECLARATION_TO_TCLASS = eINSTANCE.getClassDeclarationToTClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION_TO_TCLASS__SOURCE = eINSTANCE.getClassDeclarationToTClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION_TO_TCLASS__TARGET = eINSTANCE.getClassDeclarationToTClass_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.VariableDeclarationFragmentToTFieldDefinitionImpl <em>Variable Declaration Fragment To TField Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.VariableDeclarationFragmentToTFieldDefinitionImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getVariableDeclarationFragmentToTFieldDefinition()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION = eINSTANCE
				.getVariableDeclarationFragmentToTFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__SOURCE = eINSTANCE
				.getVariableDeclarationFragmentToTFieldDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__TARGET = eINSTANCE
				.getVariableDeclarationFragmentToTFieldDefinition_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MEntryToTParameterImpl <em>MEntry To TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MEntryToTParameterImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMEntryToTParameter()
		 * @generated
		 */
		EClass MENTRY_TO_TPARAMETER = eINSTANCE.getMEntryToTParameter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTRY_TO_TPARAMETER__SOURCE = eINSTANCE.getMEntryToTParameter_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTRY_TO_TPARAMETER__TARGET = eINSTANCE.getMEntryToTParameter_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MSignatureToTSignatureImpl <em>MSignature To TSignature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MSignatureToTSignatureImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMSignatureToTSignature()
		 * @generated
		 */
		EClass MSIGNATURE_TO_TSIGNATURE = eINSTANCE.getMSignatureToTSignature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIGNATURE_TO_TSIGNATURE__SOURCE = eINSTANCE.getMSignatureToTSignature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIGNATURE_TO_TSIGNATURE__TARGET = eINSTANCE.getMSignatureToTSignature_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ModifierToAbstractTypeImpl <em>Modifier To Abstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ModifierToAbstractTypeImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getModifierToAbstractType()
		 * @generated
		 */
		EClass MODIFIER_TO_ABSTRACT_TYPE = eINSTANCE.getModifierToAbstractType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER_TO_ABSTRACT_TYPE__SOURCE = eINSTANCE.getModifierToAbstractType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER_TO_ABSTRACT_TYPE__TARGET = eINSTANCE.getModifierToAbstractType_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MFlowToTFlowImpl <em>MFlow To TFlow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MFlowToTFlowImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMFlowToTFlow()
		 * @generated
		 */
		EClass MFLOW_TO_TFLOW = eINSTANCE.getMFlowToTFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFLOW_TO_TFLOW__SOURCE = eINSTANCE.getMFlowToTFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFLOW_TO_TFLOW__TARGET = eINSTANCE.getMFlowToTFlow_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MSyntethicMethodToTSyntethicMethodImpl <em>MSyntethic Method To TSyntethic Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MSyntethicMethodToTSyntethicMethodImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMSyntethicMethodToTSyntethicMethod()
		 * @generated
		 */
		EClass MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD = eINSTANCE.getMSyntethicMethodToTSyntethicMethod();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE = eINSTANCE
				.getMSyntethicMethodToTSyntethicMethod_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET = eINSTANCE
				.getMSyntethicMethodToTSyntethicMethod_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.FieldAccessToTAccessImpl <em>Field Access To TAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.FieldAccessToTAccessImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getFieldAccessToTAccess()
		 * @generated
		 */
		EClass FIELD_ACCESS_TO_TACCESS = eINSTANCE.getFieldAccessToTAccess();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ACCESS_TO_TACCESS__SOURCE = eINSTANCE.getFieldAccessToTAccess_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ACCESS_TO_TACCESS__TARGET = eINSTANCE.getFieldAccessToTAccess_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MModifierToTModifierImpl <em>MModifier To TModifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MModifierToTModifierImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMModifierToTModifier()
		 * @generated
		 */
		EClass MMODIFIER_TO_TMODIFIER = eINSTANCE.getMModifierToTModifier();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMODIFIER_TO_TMODIFIER__SOURCE = eINSTANCE.getMModifierToTModifier_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMODIFIER_TO_TMODIFIER__TARGET = eINSTANCE.getMModifierToTModifier_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MDefinitionToTMemberImpl <em>MDefinition To TMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MDefinitionToTMemberImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMDefinitionToTMember()
		 * @generated
		 */
		EClass MDEFINITION_TO_TMEMBER = eINSTANCE.getMDefinitionToTMember();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDEFINITION_TO_TMEMBER__SOURCE = eINSTANCE.getMDefinitionToTMember_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDEFINITION_TO_TMEMBER__TARGET = eINSTANCE.getMDefinitionToTMember_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ModifierToTMethodEntityImpl <em>Modifier To TMethod Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ModifierToTMethodEntityImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getModifierToTMethodEntity()
		 * @generated
		 */
		EClass MODIFIER_TO_TMETHOD_ENTITY = eINSTANCE.getModifierToTMethodEntity();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER_TO_TMETHOD_ENTITY__SOURCE = eINSTANCE.getModifierToTMethodEntity_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER_TO_TMETHOD_ENTITY__TARGET = eINSTANCE.getModifierToTMethodEntity_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.AnnotationToTAnnotationImpl <em>Annotation To TAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.AnnotationToTAnnotationImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAnnotationToTAnnotation()
		 * @generated
		 */
		EClass ANNOTATION_TO_TANNOTATION = eINSTANCE.getAnnotationToTAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TO_TANNOTATION__SOURCE = eINSTANCE.getAnnotationToTAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TO_TANNOTATION__TARGET = eINSTANCE.getAnnotationToTAnnotation_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.AnonymousClassDeclarationToTClassImpl <em>Anonymous Class Declaration To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.AnonymousClassDeclarationToTClassImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAnonymousClassDeclarationToTClass()
		 * @generated
		 */
		EClass ANONYMOUS_CLASS_DECLARATION_TO_TCLASS = eINSTANCE.getAnonymousClassDeclarationToTClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_CLASS_DECLARATION_TO_TCLASS__SOURCE = eINSTANCE
				.getAnonymousClassDeclarationToTClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_CLASS_DECLARATION_TO_TCLASS__TARGET = eINSTANCE
				.getAnonymousClassDeclarationToTClass_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.LineCommentToTTextAnnotationImpl <em>Line Comment To TText Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.LineCommentToTTextAnnotationImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getLineCommentToTTextAnnotation()
		 * @generated
		 */
		EClass LINE_COMMENT_TO_TTEXT_ANNOTATION = eINSTANCE.getLineCommentToTTextAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_COMMENT_TO_TTEXT_ANNOTATION__SOURCE = eINSTANCE.getLineCommentToTTextAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_COMMENT_TO_TTEXT_ANNOTATION__TARGET = eINSTANCE.getLineCommentToTTextAnnotation_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ModifierToTFieldEntityImpl <em>Modifier To TField Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ModifierToTFieldEntityImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getModifierToTFieldEntity()
		 * @generated
		 */
		EClass MODIFIER_TO_TFIELD_ENTITY = eINSTANCE.getModifierToTFieldEntity();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER_TO_TFIELD_ENTITY__SOURCE = eINSTANCE.getModifierToTFieldEntity_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER_TO_TFIELD_ENTITY__TARGET = eINSTANCE.getModifierToTFieldEntity_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.PackageToTPackageImpl <em>Package To TPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.PackageToTPackageImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getPackageToTPackage()
		 * @generated
		 */
		EClass PACKAGE_TO_TPACKAGE = eINSTANCE.getPackageToTPackage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TO_TPACKAGE__SOURCE = eINSTANCE.getPackageToTPackage_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TO_TPACKAGE__TARGET = eINSTANCE.getPackageToTPackage_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.TypeParameterToTClassImpl <em>Type Parameter To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.TypeParameterToTClassImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getTypeParameterToTClass()
		 * @generated
		 */
		EClass TYPE_PARAMETER_TO_TCLASS = eINSTANCE.getTypeParameterToTClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_PARAMETER_TO_TCLASS__SOURCE = eINSTANCE.getTypeParameterToTClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_PARAMETER_TO_TCLASS__TARGET = eINSTANCE.getTypeParameterToTClass_Target();

	}

} //ModiscoPackage
