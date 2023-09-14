/**
 */
package org.gravity.tgg.modisco.pm;

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
 * @see org.gravity.tgg.modisco.pm.PmFactory
 * @model kind="package"
 * @generated
 */
public interface PmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.tgg.modisco.pm/model/Pm.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.tgg.modisco.pm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PmPackage eINSTANCE = org.gravity.tgg.modisco.pm.impl.PmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.LiteralToTNodeImpl <em>Literal To TNode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.LiteralToTNodeImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getLiteralToTNode()
	 * @generated
	 */
	int LITERAL_TO_TNODE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TO_TNODE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TO_TNODE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal To TNode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TO_TNODE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Literal To TNode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TO_TNODE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.ModifierToTMethodEntityImpl <em>Modifier To TMethod Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.ModifierToTMethodEntityImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getModifierToTMethodEntity()
	 * @generated
	 */
	int MODIFIER_TO_TMETHOD_ENTITY = 1;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.ASTNodeToTAnnotatableImpl <em>AST Node To TAnnotatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.ASTNodeToTAnnotatableImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getASTNodeToTAnnotatable()
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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.AnnotationMemberValuePairToTAnnotationValueImpl <em>Annotation Member Value Pair To TAnnotation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.AnnotationMemberValuePairToTAnnotationValueImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getAnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = 3;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.ModelToTypeGraphImpl <em>Model To Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.ModelToTypeGraphImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getModelToTypeGraph()
	 * @generated
	 */
	int MODEL_TO_TYPE_GRAPH = 4;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.StaticTypeToAccessStaticTypeImpl <em>Static Type To Access Static Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.StaticTypeToAccessStaticTypeImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getStaticTypeToAccessStaticType()
	 * @generated
	 */
	int STATIC_TYPE_TO_ACCESS_STATIC_TYPE = 5;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.UnresolvedTypeDeclarationToTClassImpl <em>Unresolved Type Declaration To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.UnresolvedTypeDeclarationToTClassImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getUnresolvedTypeDeclarationToTClass()
	 * @generated
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS = 6;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.FieldAccessToTAccessImpl <em>Field Access To TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.FieldAccessToTAccessImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getFieldAccessToTAccess()
	 * @generated
	 */
	int FIELD_ACCESS_TO_TACCESS = 7;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.TypeToTAbstractTypeImpl <em>Type To TAbstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.TypeToTAbstractTypeImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getTypeToTAbstractType()
	 * @generated
	 */
	int TYPE_TO_TABSTRACT_TYPE = 8;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.ModifierToTClassEntityImpl <em>Modifier To TClass Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.ModifierToTClassEntityImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getModifierToTClassEntity()
	 * @generated
	 */
	int MODIFIER_TO_TCLASS_ENTITY = 9;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.PackageToTPackageImpl <em>Package To TPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.PackageToTPackageImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getPackageToTPackage()
	 * @generated
	 */
	int PACKAGE_TO_TPACKAGE = 10;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.MFlowToTFlowImpl <em>MFlow To TFlow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.MFlowToTFlowImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMFlowToTFlow()
	 * @generated
	 */
	int MFLOW_TO_TFLOW = 11;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.LineCommentToTTextAnnotationImpl <em>Line Comment To TText Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.LineCommentToTTextAnnotationImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getLineCommentToTTextAnnotation()
	 * @generated
	 */
	int LINE_COMMENT_TO_TTEXT_ANNOTATION = 12;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.AnonymousClassDeclarationToTClassImpl <em>Anonymous Class Declaration To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.AnonymousClassDeclarationToTClassImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS = 13;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.MEntryToTParameterImpl <em>MEntry To TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.MEntryToTParameterImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMEntryToTParameter()
	 * @generated
	 */
	int MENTRY_TO_TPARAMETER = 14;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.ModifierToAbstractTypeImpl <em>Modifier To Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.ModifierToAbstractTypeImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getModifierToAbstractType()
	 * @generated
	 */
	int MODIFIER_TO_ABSTRACT_TYPE = 15;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.VariableDeclarationFragmentToTFieldDefinitionImpl <em>Variable Declaration Fragment To TField Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.VariableDeclarationFragmentToTFieldDefinitionImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getVariableDeclarationFragmentToTFieldDefinition()
	 * @generated
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION = 16;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.TypeParameterToTClassImpl <em>Type Parameter To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.TypeParameterToTClassImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getTypeParameterToTClass()
	 * @generated
	 */
	int TYPE_PARAMETER_TO_TCLASS = 17;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.ModifierToTFieldEntityImpl <em>Modifier To TField Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.ModifierToTFieldEntityImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getModifierToTFieldEntity()
	 * @generated
	 */
	int MODIFIER_TO_TFIELD_ENTITY = 18;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.MSingleVariableAccessToTAccessImpl <em>MSingle Variable Access To TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.MSingleVariableAccessToTAccessImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMSingleVariableAccessToTAccess()
	 * @generated
	 */
	int MSINGLE_VARIABLE_ACCESS_TO_TACCESS = 19;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.MSignatureToTSignatureImpl <em>MSignature To TSignature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.MSignatureToTSignatureImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMSignatureToTSignature()
	 * @generated
	 */
	int MSIGNATURE_TO_TSIGNATURE = 20;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.AbstractMethodInvocationToTAccessImpl <em>Abstract Method Invocation To TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.AbstractMethodInvocationToTAccessImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getAbstractMethodInvocationToTAccess()
	 * @generated
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS = 21;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.MSyntethicMethodToTSyntethicMethodImpl <em>MSyntethic Method To TSyntethic Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.MSyntethicMethodToTSyntethicMethodImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMSyntethicMethodToTSyntethicMethod()
	 * @generated
	 */
	int MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD = 22;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.MDefinitionToTMemberImpl <em>MDefinition To TMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.MDefinitionToTMemberImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMDefinitionToTMember()
	 * @generated
	 */
	int MDEFINITION_TO_TMEMBER = 23;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.MMethodNameToTMethodImpl <em>MMethod Name To TMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.MMethodNameToTMethodImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMMethodNameToTMethod()
	 * @generated
	 */
	int MMETHOD_NAME_TO_TMETHOD = 24;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.MAbstractFlowElementToTAbstractFlowElementImpl <em>MAbstract Flow Element To TAbstract Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.MAbstractFlowElementToTAbstractFlowElementImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMAbstractFlowElementToTAbstractFlowElement()
	 * @generated
	 */
	int MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT = 25;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.MFieldNameToTFieldImpl <em>MField Name To TField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.MFieldNameToTFieldImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMFieldNameToTField()
	 * @generated
	 */
	int MFIELD_NAME_TO_TFIELD = 26;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.AnnotationToTAnnotationImpl <em>Annotation To TAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.AnnotationToTAnnotationImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getAnnotationToTAnnotation()
	 * @generated
	 */
	int ANNOTATION_TO_TANNOTATION = 27;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.MModifierToTModifierImpl <em>MModifier To TModifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.MModifierToTModifierImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMModifierToTModifier()
	 * @generated
	 */
	int MMODIFIER_TO_TMODIFIER = 28;

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
	 * The meta object id for the '{@link org.gravity.tgg.modisco.pm.impl.ElementToModuleImpl <em>Element To Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.pm.impl.ElementToModuleImpl
	 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getElementToModule()
	 * @generated
	 */
	int ELEMENT_TO_MODULE = 29;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TO_MODULE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TO_MODULE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element To Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TO_MODULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element To Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TO_MODULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.LiteralToTNode <em>Literal To TNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal To TNode</em>'.
	 * @see org.gravity.tgg.modisco.pm.LiteralToTNode
	 * @generated
	 */
	EClass getLiteralToTNode();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.LiteralToTNode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.LiteralToTNode#getSource()
	 * @see #getLiteralToTNode()
	 * @generated
	 */
	EReference getLiteralToTNode_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.LiteralToTNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.LiteralToTNode#getTarget()
	 * @see #getLiteralToTNode()
	 * @generated
	 */
	EReference getLiteralToTNode_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.ModifierToTMethodEntity <em>Modifier To TMethod Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier To TMethod Entity</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModifierToTMethodEntity
	 * @generated
	 */
	EClass getModifierToTMethodEntity();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ModifierToTMethodEntity#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModifierToTMethodEntity#getSource()
	 * @see #getModifierToTMethodEntity()
	 * @generated
	 */
	EReference getModifierToTMethodEntity_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ModifierToTMethodEntity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModifierToTMethodEntity#getTarget()
	 * @see #getModifierToTMethodEntity()
	 * @generated
	 */
	EReference getModifierToTMethodEntity_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable <em>AST Node To TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AST Node To TAnnotatable</em>'.
	 * @see org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable
	 * @generated
	 */
	EClass getASTNodeToTAnnotatable();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable#getSource()
	 * @see #getASTNodeToTAnnotatable()
	 * @generated
	 */
	EReference getASTNodeToTAnnotatable_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable#getTarget()
	 * @see #getASTNodeToTAnnotatable()
	 * @generated
	 */
	EReference getASTNodeToTAnnotatable_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue <em>Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue
	 * @generated
	 */
	EClass getAnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue#getSource()
	 * @see #getAnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 */
	EReference getAnnotationMemberValuePairToTAnnotationValue_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue#getTarget()
	 * @see #getAnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 */
	EReference getAnnotationMemberValuePairToTAnnotationValue_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.ModelToTypeGraph <em>Model To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model To Type Graph</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModelToTypeGraph
	 * @generated
	 */
	EClass getModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ModelToTypeGraph#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModelToTypeGraph#getSource()
	 * @see #getModelToTypeGraph()
	 * @generated
	 */
	EReference getModelToTypeGraph_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ModelToTypeGraph#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModelToTypeGraph#getTarget()
	 * @see #getModelToTypeGraph()
	 * @generated
	 */
	EReference getModelToTypeGraph_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.StaticTypeToAccessStaticType <em>Static Type To Access Static Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Type To Access Static Type</em>'.
	 * @see org.gravity.tgg.modisco.pm.StaticTypeToAccessStaticType
	 * @generated
	 */
	EClass getStaticTypeToAccessStaticType();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.StaticTypeToAccessStaticType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.StaticTypeToAccessStaticType#getSource()
	 * @see #getStaticTypeToAccessStaticType()
	 * @generated
	 */
	EReference getStaticTypeToAccessStaticType_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.StaticTypeToAccessStaticType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.StaticTypeToAccessStaticType#getTarget()
	 * @see #getStaticTypeToAccessStaticType()
	 * @generated
	 */
	EReference getStaticTypeToAccessStaticType_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.UnresolvedTypeDeclarationToTClass <em>Unresolved Type Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Type Declaration To TClass</em>'.
	 * @see org.gravity.tgg.modisco.pm.UnresolvedTypeDeclarationToTClass
	 * @generated
	 */
	EClass getUnresolvedTypeDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.UnresolvedTypeDeclarationToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.UnresolvedTypeDeclarationToTClass#getSource()
	 * @see #getUnresolvedTypeDeclarationToTClass()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclarationToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.UnresolvedTypeDeclarationToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.UnresolvedTypeDeclarationToTClass#getTarget()
	 * @see #getUnresolvedTypeDeclarationToTClass()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclarationToTClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.FieldAccessToTAccess <em>Field Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Access To TAccess</em>'.
	 * @see org.gravity.tgg.modisco.pm.FieldAccessToTAccess
	 * @generated
	 */
	EClass getFieldAccessToTAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.FieldAccessToTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.FieldAccessToTAccess#getSource()
	 * @see #getFieldAccessToTAccess()
	 * @generated
	 */
	EReference getFieldAccessToTAccess_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.FieldAccessToTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.FieldAccessToTAccess#getTarget()
	 * @see #getFieldAccessToTAccess()
	 * @generated
	 */
	EReference getFieldAccessToTAccess_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.TypeToTAbstractType <em>Type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type To TAbstract Type</em>'.
	 * @see org.gravity.tgg.modisco.pm.TypeToTAbstractType
	 * @generated
	 */
	EClass getTypeToTAbstractType();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.TypeToTAbstractType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.TypeToTAbstractType#getSource()
	 * @see #getTypeToTAbstractType()
	 * @generated
	 */
	EReference getTypeToTAbstractType_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.TypeToTAbstractType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.TypeToTAbstractType#getTarget()
	 * @see #getTypeToTAbstractType()
	 * @generated
	 */
	EReference getTypeToTAbstractType_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.ModifierToTClassEntity <em>Modifier To TClass Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier To TClass Entity</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModifierToTClassEntity
	 * @generated
	 */
	EClass getModifierToTClassEntity();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ModifierToTClassEntity#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModifierToTClassEntity#getSource()
	 * @see #getModifierToTClassEntity()
	 * @generated
	 */
	EReference getModifierToTClassEntity_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ModifierToTClassEntity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModifierToTClassEntity#getTarget()
	 * @see #getModifierToTClassEntity()
	 * @generated
	 */
	EReference getModifierToTClassEntity_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.PackageToTPackage <em>Package To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package To TPackage</em>'.
	 * @see org.gravity.tgg.modisco.pm.PackageToTPackage
	 * @generated
	 */
	EClass getPackageToTPackage();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.PackageToTPackage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.PackageToTPackage#getSource()
	 * @see #getPackageToTPackage()
	 * @generated
	 */
	EReference getPackageToTPackage_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.PackageToTPackage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.PackageToTPackage#getTarget()
	 * @see #getPackageToTPackage()
	 * @generated
	 */
	EReference getPackageToTPackage_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.MFlowToTFlow <em>MFlow To TFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFlow To TFlow</em>'.
	 * @see org.gravity.tgg.modisco.pm.MFlowToTFlow
	 * @generated
	 */
	EClass getMFlowToTFlow();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MFlowToTFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.MFlowToTFlow#getSource()
	 * @see #getMFlowToTFlow()
	 * @generated
	 */
	EReference getMFlowToTFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MFlowToTFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.MFlowToTFlow#getTarget()
	 * @see #getMFlowToTFlow()
	 * @generated
	 */
	EReference getMFlowToTFlow_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.LineCommentToTTextAnnotation <em>Line Comment To TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Comment To TText Annotation</em>'.
	 * @see org.gravity.tgg.modisco.pm.LineCommentToTTextAnnotation
	 * @generated
	 */
	EClass getLineCommentToTTextAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.LineCommentToTTextAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.LineCommentToTTextAnnotation#getSource()
	 * @see #getLineCommentToTTextAnnotation()
	 * @generated
	 */
	EReference getLineCommentToTTextAnnotation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.LineCommentToTTextAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.LineCommentToTTextAnnotation#getTarget()
	 * @see #getLineCommentToTTextAnnotation()
	 * @generated
	 */
	EReference getLineCommentToTTextAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass <em>Anonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Class Declaration To TClass</em>'.
	 * @see org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass
	 * @generated
	 */
	EClass getAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass#getSource()
	 * @see #getAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	EReference getAnonymousClassDeclarationToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass#getTarget()
	 * @see #getAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	EReference getAnonymousClassDeclarationToTClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.MEntryToTParameter <em>MEntry To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MEntry To TParameter</em>'.
	 * @see org.gravity.tgg.modisco.pm.MEntryToTParameter
	 * @generated
	 */
	EClass getMEntryToTParameter();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MEntryToTParameter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.MEntryToTParameter#getSource()
	 * @see #getMEntryToTParameter()
	 * @generated
	 */
	EReference getMEntryToTParameter_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MEntryToTParameter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.MEntryToTParameter#getTarget()
	 * @see #getMEntryToTParameter()
	 * @generated
	 */
	EReference getMEntryToTParameter_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.ModifierToAbstractType <em>Modifier To Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier To Abstract Type</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModifierToAbstractType
	 * @generated
	 */
	EClass getModifierToAbstractType();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ModifierToAbstractType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModifierToAbstractType#getSource()
	 * @see #getModifierToAbstractType()
	 * @generated
	 */
	EReference getModifierToAbstractType_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ModifierToAbstractType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModifierToAbstractType#getTarget()
	 * @see #getModifierToAbstractType()
	 * @generated
	 */
	EReference getModifierToAbstractType_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.VariableDeclarationFragmentToTFieldDefinition <em>Variable Declaration Fragment To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * @see org.gravity.tgg.modisco.pm.VariableDeclarationFragmentToTFieldDefinition
	 * @generated
	 */
	EClass getVariableDeclarationFragmentToTFieldDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.VariableDeclarationFragmentToTFieldDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.VariableDeclarationFragmentToTFieldDefinition#getSource()
	 * @see #getVariableDeclarationFragmentToTFieldDefinition()
	 * @generated
	 */
	EReference getVariableDeclarationFragmentToTFieldDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.VariableDeclarationFragmentToTFieldDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.VariableDeclarationFragmentToTFieldDefinition#getTarget()
	 * @see #getVariableDeclarationFragmentToTFieldDefinition()
	 * @generated
	 */
	EReference getVariableDeclarationFragmentToTFieldDefinition_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.TypeParameterToTClass <em>Type Parameter To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter To TClass</em>'.
	 * @see org.gravity.tgg.modisco.pm.TypeParameterToTClass
	 * @generated
	 */
	EClass getTypeParameterToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.TypeParameterToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.TypeParameterToTClass#getSource()
	 * @see #getTypeParameterToTClass()
	 * @generated
	 */
	EReference getTypeParameterToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.TypeParameterToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.TypeParameterToTClass#getTarget()
	 * @see #getTypeParameterToTClass()
	 * @generated
	 */
	EReference getTypeParameterToTClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.ModifierToTFieldEntity <em>Modifier To TField Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier To TField Entity</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModifierToTFieldEntity
	 * @generated
	 */
	EClass getModifierToTFieldEntity();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ModifierToTFieldEntity#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModifierToTFieldEntity#getSource()
	 * @see #getModifierToTFieldEntity()
	 * @generated
	 */
	EReference getModifierToTFieldEntity_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ModifierToTFieldEntity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.ModifierToTFieldEntity#getTarget()
	 * @see #getModifierToTFieldEntity()
	 * @generated
	 */
	EReference getModifierToTFieldEntity_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.MSingleVariableAccessToTAccess <em>MSingle Variable Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSingle Variable Access To TAccess</em>'.
	 * @see org.gravity.tgg.modisco.pm.MSingleVariableAccessToTAccess
	 * @generated
	 */
	EClass getMSingleVariableAccessToTAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MSingleVariableAccessToTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.MSingleVariableAccessToTAccess#getSource()
	 * @see #getMSingleVariableAccessToTAccess()
	 * @generated
	 */
	EReference getMSingleVariableAccessToTAccess_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MSingleVariableAccessToTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.MSingleVariableAccessToTAccess#getTarget()
	 * @see #getMSingleVariableAccessToTAccess()
	 * @generated
	 */
	EReference getMSingleVariableAccessToTAccess_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.MSignatureToTSignature <em>MSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSignature To TSignature</em>'.
	 * @see org.gravity.tgg.modisco.pm.MSignatureToTSignature
	 * @generated
	 */
	EClass getMSignatureToTSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MSignatureToTSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.MSignatureToTSignature#getSource()
	 * @see #getMSignatureToTSignature()
	 * @generated
	 */
	EReference getMSignatureToTSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MSignatureToTSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.MSignatureToTSignature#getTarget()
	 * @see #getMSignatureToTSignature()
	 * @generated
	 */
	EReference getMSignatureToTSignature_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess <em>Abstract Method Invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Method Invocation To TAccess</em>'.
	 * @see org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess
	 * @generated
	 */
	EClass getAbstractMethodInvocationToTAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess#getSource()
	 * @see #getAbstractMethodInvocationToTAccess()
	 * @generated
	 */
	EReference getAbstractMethodInvocationToTAccess_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess#getTarget()
	 * @see #getAbstractMethodInvocationToTAccess()
	 * @generated
	 */
	EReference getAbstractMethodInvocationToTAccess_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.MSyntethicMethodToTSyntethicMethod <em>MSyntethic Method To TSyntethic Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSyntethic Method To TSyntethic Method</em>'.
	 * @see org.gravity.tgg.modisco.pm.MSyntethicMethodToTSyntethicMethod
	 * @generated
	 */
	EClass getMSyntethicMethodToTSyntethicMethod();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MSyntethicMethodToTSyntethicMethod#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.MSyntethicMethodToTSyntethicMethod#getSource()
	 * @see #getMSyntethicMethodToTSyntethicMethod()
	 * @generated
	 */
	EReference getMSyntethicMethodToTSyntethicMethod_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MSyntethicMethodToTSyntethicMethod#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.MSyntethicMethodToTSyntethicMethod#getTarget()
	 * @see #getMSyntethicMethodToTSyntethicMethod()
	 * @generated
	 */
	EReference getMSyntethicMethodToTSyntethicMethod_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.MDefinitionToTMember <em>MDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MDefinition To TMember</em>'.
	 * @see org.gravity.tgg.modisco.pm.MDefinitionToTMember
	 * @generated
	 */
	EClass getMDefinitionToTMember();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MDefinitionToTMember#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.MDefinitionToTMember#getSource()
	 * @see #getMDefinitionToTMember()
	 * @generated
	 */
	EReference getMDefinitionToTMember_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MDefinitionToTMember#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.MDefinitionToTMember#getTarget()
	 * @see #getMDefinitionToTMember()
	 * @generated
	 */
	EReference getMDefinitionToTMember_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.MMethodNameToTMethod <em>MMethod Name To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMethod Name To TMethod</em>'.
	 * @see org.gravity.tgg.modisco.pm.MMethodNameToTMethod
	 * @generated
	 */
	EClass getMMethodNameToTMethod();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MMethodNameToTMethod#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.MMethodNameToTMethod#getSource()
	 * @see #getMMethodNameToTMethod()
	 * @generated
	 */
	EReference getMMethodNameToTMethod_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MMethodNameToTMethod#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.MMethodNameToTMethod#getTarget()
	 * @see #getMMethodNameToTMethod()
	 * @generated
	 */
	EReference getMMethodNameToTMethod_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement <em>MAbstract Flow Element To TAbstract Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAbstract Flow Element To TAbstract Flow Element</em>'.
	 * @see org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement
	 * @generated
	 */
	EClass getMAbstractFlowElementToTAbstractFlowElement();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement#getSource()
	 * @see #getMAbstractFlowElementToTAbstractFlowElement()
	 * @generated
	 */
	EReference getMAbstractFlowElementToTAbstractFlowElement_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement#getTarget()
	 * @see #getMAbstractFlowElementToTAbstractFlowElement()
	 * @generated
	 */
	EReference getMAbstractFlowElementToTAbstractFlowElement_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.MFieldNameToTField <em>MField Name To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MField Name To TField</em>'.
	 * @see org.gravity.tgg.modisco.pm.MFieldNameToTField
	 * @generated
	 */
	EClass getMFieldNameToTField();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MFieldNameToTField#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.MFieldNameToTField#getSource()
	 * @see #getMFieldNameToTField()
	 * @generated
	 */
	EReference getMFieldNameToTField_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MFieldNameToTField#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.MFieldNameToTField#getTarget()
	 * @see #getMFieldNameToTField()
	 * @generated
	 */
	EReference getMFieldNameToTField_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.AnnotationToTAnnotation <em>Annotation To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation To TAnnotation</em>'.
	 * @see org.gravity.tgg.modisco.pm.AnnotationToTAnnotation
	 * @generated
	 */
	EClass getAnnotationToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.AnnotationToTAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.AnnotationToTAnnotation#getSource()
	 * @see #getAnnotationToTAnnotation()
	 * @generated
	 */
	EReference getAnnotationToTAnnotation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.AnnotationToTAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.AnnotationToTAnnotation#getTarget()
	 * @see #getAnnotationToTAnnotation()
	 * @generated
	 */
	EReference getAnnotationToTAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.MModifierToTModifier <em>MModifier To TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MModifier To TModifier</em>'.
	 * @see org.gravity.tgg.modisco.pm.MModifierToTModifier
	 * @generated
	 */
	EClass getMModifierToTModifier();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MModifierToTModifier#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.MModifierToTModifier#getSource()
	 * @see #getMModifierToTModifier()
	 * @generated
	 */
	EReference getMModifierToTModifier_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.MModifierToTModifier#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.MModifierToTModifier#getTarget()
	 * @see #getMModifierToTModifier()
	 * @generated
	 */
	EReference getMModifierToTModifier_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.pm.ElementToModule <em>Element To Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element To Module</em>'.
	 * @see org.gravity.tgg.modisco.pm.ElementToModule
	 * @generated
	 */
	EClass getElementToModule();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ElementToModule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.pm.ElementToModule#getSource()
	 * @see #getElementToModule()
	 * @generated
	 */
	EReference getElementToModule_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.pm.ElementToModule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.pm.ElementToModule#getTarget()
	 * @see #getElementToModule()
	 * @generated
	 */
	EReference getElementToModule_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PmFactory getPmFactory();

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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.LiteralToTNodeImpl <em>Literal To TNode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.LiteralToTNodeImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getLiteralToTNode()
		 * @generated
		 */
		EClass LITERAL_TO_TNODE = eINSTANCE.getLiteralToTNode();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_TO_TNODE__SOURCE = eINSTANCE.getLiteralToTNode_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_TO_TNODE__TARGET = eINSTANCE.getLiteralToTNode_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.ModifierToTMethodEntityImpl <em>Modifier To TMethod Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.ModifierToTMethodEntityImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getModifierToTMethodEntity()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.ASTNodeToTAnnotatableImpl <em>AST Node To TAnnotatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.ASTNodeToTAnnotatableImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getASTNodeToTAnnotatable()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.AnnotationMemberValuePairToTAnnotationValueImpl <em>Annotation Member Value Pair To TAnnotation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.AnnotationMemberValuePairToTAnnotationValueImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getAnnotationMemberValuePairToTAnnotationValue()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.ModelToTypeGraphImpl <em>Model To Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.ModelToTypeGraphImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getModelToTypeGraph()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.StaticTypeToAccessStaticTypeImpl <em>Static Type To Access Static Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.StaticTypeToAccessStaticTypeImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getStaticTypeToAccessStaticType()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.UnresolvedTypeDeclarationToTClassImpl <em>Unresolved Type Declaration To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.UnresolvedTypeDeclarationToTClassImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getUnresolvedTypeDeclarationToTClass()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.FieldAccessToTAccessImpl <em>Field Access To TAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.FieldAccessToTAccessImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getFieldAccessToTAccess()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.TypeToTAbstractTypeImpl <em>Type To TAbstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.TypeToTAbstractTypeImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getTypeToTAbstractType()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.ModifierToTClassEntityImpl <em>Modifier To TClass Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.ModifierToTClassEntityImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getModifierToTClassEntity()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.PackageToTPackageImpl <em>Package To TPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.PackageToTPackageImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getPackageToTPackage()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.MFlowToTFlowImpl <em>MFlow To TFlow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.MFlowToTFlowImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMFlowToTFlow()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.LineCommentToTTextAnnotationImpl <em>Line Comment To TText Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.LineCommentToTTextAnnotationImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getLineCommentToTTextAnnotation()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.AnonymousClassDeclarationToTClassImpl <em>Anonymous Class Declaration To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.AnonymousClassDeclarationToTClassImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getAnonymousClassDeclarationToTClass()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.MEntryToTParameterImpl <em>MEntry To TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.MEntryToTParameterImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMEntryToTParameter()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.ModifierToAbstractTypeImpl <em>Modifier To Abstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.ModifierToAbstractTypeImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getModifierToAbstractType()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.VariableDeclarationFragmentToTFieldDefinitionImpl <em>Variable Declaration Fragment To TField Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.VariableDeclarationFragmentToTFieldDefinitionImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getVariableDeclarationFragmentToTFieldDefinition()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.TypeParameterToTClassImpl <em>Type Parameter To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.TypeParameterToTClassImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getTypeParameterToTClass()
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

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.ModifierToTFieldEntityImpl <em>Modifier To TField Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.ModifierToTFieldEntityImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getModifierToTFieldEntity()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.MSingleVariableAccessToTAccessImpl <em>MSingle Variable Access To TAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.MSingleVariableAccessToTAccessImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMSingleVariableAccessToTAccess()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.MSignatureToTSignatureImpl <em>MSignature To TSignature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.MSignatureToTSignatureImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMSignatureToTSignature()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.AbstractMethodInvocationToTAccessImpl <em>Abstract Method Invocation To TAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.AbstractMethodInvocationToTAccessImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getAbstractMethodInvocationToTAccess()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.MSyntethicMethodToTSyntethicMethodImpl <em>MSyntethic Method To TSyntethic Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.MSyntethicMethodToTSyntethicMethodImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMSyntethicMethodToTSyntethicMethod()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.MDefinitionToTMemberImpl <em>MDefinition To TMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.MDefinitionToTMemberImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMDefinitionToTMember()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.MMethodNameToTMethodImpl <em>MMethod Name To TMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.MMethodNameToTMethodImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMMethodNameToTMethod()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.MAbstractFlowElementToTAbstractFlowElementImpl <em>MAbstract Flow Element To TAbstract Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.MAbstractFlowElementToTAbstractFlowElementImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMAbstractFlowElementToTAbstractFlowElement()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.MFieldNameToTFieldImpl <em>MField Name To TField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.MFieldNameToTFieldImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMFieldNameToTField()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.AnnotationToTAnnotationImpl <em>Annotation To TAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.AnnotationToTAnnotationImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getAnnotationToTAnnotation()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.MModifierToTModifierImpl <em>MModifier To TModifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.MModifierToTModifierImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getMModifierToTModifier()
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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.pm.impl.ElementToModuleImpl <em>Element To Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.pm.impl.ElementToModuleImpl
		 * @see org.gravity.tgg.modisco.pm.impl.PmPackageImpl#getElementToModule()
		 * @generated
		 */
		EClass ELEMENT_TO_MODULE = eINSTANCE.getElementToModule();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TO_MODULE__SOURCE = eINSTANCE.getElementToModule_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TO_MODULE__TARGET = eINSTANCE.getElementToModule_Target();

	}

} //PmPackage
