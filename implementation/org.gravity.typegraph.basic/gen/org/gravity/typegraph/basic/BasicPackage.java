/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gravity.typegraph.basic.annotations.AnnotationsPackage;

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
 * @see org.gravity.typegraph.basic.BasicFactory
 * @model kind="package"
 * @generated
 */
public interface BasicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gravity-tool.org/typegraph/basic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.typegraph.basic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicPackage eINSTANCE = org.gravity.typegraph.basic.impl.BasicPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TAccessImpl <em>TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TAccessImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAccess()
	 * @generated
	 */
	int TACCESS = 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl <em>TAbstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TAbstractTypeImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAbstractType()
	 * @generated
	 */
	int TABSTRACT_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TClassImpl <em>TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TClassImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTClass()
	 * @generated
	 */
	int TCLASS = 1;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TNameImpl <em>TName</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TNameImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTName()
	 * @generated
	 */
	int TNAME = 21;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TFieldImpl <em>TField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TFieldImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTField()
	 * @generated
	 */
	int TFIELD = 2;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TMemberImpl <em>TMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TMemberImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMember()
	 * @generated
	 */
	int TMEMBER = 6;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TFieldDefinitionImpl <em>TField Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TFieldDefinitionImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTFieldDefinition()
	 * @generated
	 */
	int TFIELD_DEFINITION = 3;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.TSignature <em>TSignature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.TSignature
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTSignature()
	 * @generated
	 */
	int TSIGNATURE = 12;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TFieldSignatureImpl <em>TField Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TFieldSignatureImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTFieldSignature()
	 * @generated
	 */
	int TFIELD_SIGNATURE = 4;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TCallImpl <em>TCall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TCallImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTCall()
	 * @generated
	 */
	int TCALL = 5;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TMethodImpl <em>TMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TMethodImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMethod()
	 * @generated
	 */
	int TMETHOD = 7;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TMethodDefinitionImpl <em>TMethod Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TMethodDefinitionImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMethodDefinition()
	 * @generated
	 */
	int TMETHOD_DEFINITION = 8;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl <em>TMethod Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TMethodSignatureImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMethodSignature()
	 * @generated
	 */
	int TMETHOD_SIGNATURE = 9;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TPackageImpl <em>TPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TPackageImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTPackage()
	 * @generated
	 */
	int TPACKAGE = 10;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TParameterImpl <em>TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TParameterImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTParameter()
	 * @generated
	 */
	int TPARAMETER = 11;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TypeGraphImpl <em>Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TypeGraphImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTypeGraph()
	 * @generated
	 */
	int TYPE_GRAPH = 13;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TInterfaceImpl <em>TInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TInterfaceImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTInterface()
	 * @generated
	 */
	int TINTERFACE = 14;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TReadImpl <em>TRead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TReadImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTRead()
	 * @generated
	 */
	int TREAD = 16;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TWriteImpl <em>TWrite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TWriteImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTWrite()
	 * @generated
	 */
	int TWRITE = 17;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TModifierImpl <em>TModifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TModifierImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTModifier()
	 * @generated
	 */
	int TMODIFIER = 18;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TSyntethicMethodImpl <em>TSyntethic Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TSyntethicMethodImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTSyntethicMethod()
	 * @generated
	 */
	int TSYNTETHIC_METHOD = 19;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TUnresolvedTypeImpl <em>TUnresolved Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TUnresolvedTypeImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTUnresolvedType()
	 * @generated
	 */
	int TUNRESOLVED_TYPE = 20;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TAbstractFlowElementImpl <em>TAbstract Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TAbstractFlowElementImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAbstractFlowElement()
	 * @generated
	 */
	int TABSTRACT_FLOW_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS = 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS = 2;

	/**
	 * The number of structural features of the '<em>TAbstract Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_FLOW_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TAbstract Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_FLOW_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS__OWNED_FLOWS = TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS__INCOMING_FLOWS = TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS__OUTGOING_FLOWS = TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>TTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS__TTARGET = TABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TSource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS__TSOURCE = TABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS__STATIC_TYPE = TABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_FEATURE_COUNT = TABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_OPERATION_COUNT = TABSTRACT_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__TANNOTATION = AnnotationsPackage.TANNOTATABLE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__PG = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__PACKAGE = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__SIGNATURE = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__DEFINES = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>TLib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__TLIB = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__TNAME = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>TModifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__TMODIFIER = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inner Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__INNER_TYPES = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Outer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__OUTER_TYPE = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>TAbstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE_FEATURE_COUNT = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___GET_TANNOTATION__ECLASS = AnnotationsPackage.TANNOTATABLE___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___IS_SUPER_TYPE_OF__TABSTRACTTYPE = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Sub Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___IS_SUB_TYPE_OF__TABSTRACTTYPE = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Declared</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___IS_DECLARED = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___GET_FULLY_QUALIFIED_NAME = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get TMethod Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___GET_TMETHOD_SIGNATURE__STRING = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get TMethod Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___GET_TMETHOD_DEFINITION__STRING = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Base Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___GET_BASE_PACKAGE = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___GET_TDEFINITION__TSIGNATURE = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___GET_TDEFINITION__STRING = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Has TMember</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___HAS_TMEMBER__TMEMBER = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Has Common Super Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Fill Same Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___FILL_SAME_TYPE__ELIST = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Inner Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___IS_INNER_TYPE__TABSTRACTTYPE = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Real Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE___GET_REAL_PACKAGE__TABSTRACTTYPE = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>TAbstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE_OPERATION_COUNT = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 14;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__TANNOTATION = TABSTRACT_TYPE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__PG = TABSTRACT_TYPE__PG;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__PACKAGE = TABSTRACT_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__SIGNATURE = TABSTRACT_TYPE__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__DEFINES = TABSTRACT_TYPE__DEFINES;

	/**
	 * The feature id for the '<em><b>TLib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__TLIB = TABSTRACT_TYPE__TLIB;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__TNAME = TABSTRACT_TYPE__TNAME;

	/**
	 * The feature id for the '<em><b>TModifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__TMODIFIER = TABSTRACT_TYPE__TMODIFIER;

	/**
	 * The feature id for the '<em><b>Inner Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__INNER_TYPES = TABSTRACT_TYPE__INNER_TYPES;

	/**
	 * The feature id for the '<em><b>Outer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__OUTER_TYPE = TABSTRACT_TYPE__OUTER_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__PARENT_CLASS = TABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__CHILD_CLASSES = TABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__IMPLEMENTS = TABSTRACT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_FEATURE_COUNT = TABSTRACT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_TANNOTATION__ECLASS = TABSTRACT_TYPE___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Is Declared</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___IS_DECLARED = TABSTRACT_TYPE___IS_DECLARED;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_FULLY_QUALIFIED_NAME = TABSTRACT_TYPE___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get TMethod Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_TMETHOD_SIGNATURE__STRING = TABSTRACT_TYPE___GET_TMETHOD_SIGNATURE__STRING;

	/**
	 * The operation id for the '<em>Get TMethod Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_TMETHOD_DEFINITION__STRING = TABSTRACT_TYPE___GET_TMETHOD_DEFINITION__STRING;

	/**
	 * The operation id for the '<em>Get Base Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_BASE_PACKAGE = TABSTRACT_TYPE___GET_BASE_PACKAGE;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_TDEFINITION__TSIGNATURE = TABSTRACT_TYPE___GET_TDEFINITION__TSIGNATURE;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_TDEFINITION__STRING = TABSTRACT_TYPE___GET_TDEFINITION__STRING;

	/**
	 * The operation id for the '<em>Has TMember</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___HAS_TMEMBER__TMEMBER = TABSTRACT_TYPE___HAS_TMEMBER__TMEMBER;

	/**
	 * The operation id for the '<em>Fill Same Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___FILL_SAME_TYPE__ELIST = TABSTRACT_TYPE___FILL_SAME_TYPE__ELIST;

	/**
	 * The operation id for the '<em>Is Inner Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___IS_INNER_TYPE__TABSTRACTTYPE = TABSTRACT_TYPE___IS_INNER_TYPE__TABSTRACTTYPE;

	/**
	 * The operation id for the '<em>Get Real Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_REAL_PACKAGE__TABSTRACTTYPE = TABSTRACT_TYPE___GET_REAL_PACKAGE__TABSTRACTTYPE;

	/**
	 * The operation id for the '<em>Get TMethod Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_TMETHOD_DEFINITIONS = TABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Declared TMethod Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_DECLARED_TMETHOD_DEFINITIONS = TABSTRACT_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All TMembers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_ALL_TMEMBERS = TABSTRACT_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All TMembers In Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_ALL_TMEMBERS_IN_CONTAINER = TABSTRACT_TYPE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_ALL_CHILDREN = TABSTRACT_TYPE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Sub Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___IS_SUB_TYPE_OF__TABSTRACTTYPE = TABSTRACT_TYPE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___IS_SUPER_TYPE_OF__TABSTRACTTYPE = TABSTRACT_TYPE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get All Outgoing Accesses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_ALL_OUTGOING_ACCESSES__TSIGNATURE = TABSTRACT_TYPE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Has AParent This TMember</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___HAS_APARENT_THIS_TMEMBER__TMEMBER = TABSTRACT_TYPE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Resolved Parent Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_RESOLVED_PARENT_CLASS = TABSTRACT_TYPE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___TO_STRING = TABSTRACT_TYPE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___GET_PARENTS = TABSTRACT_TYPE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Has Common Super Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE = TABSTRACT_TYPE_OPERATION_COUNT + 12;

	/**
	 * The number of operations of the '<em>TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_OPERATION_COUNT = TABSTRACT_TYPE_OPERATION_COUNT + 13;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAME__TNAME = 0;

	/**
	 * The number of structural features of the '<em>TName</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TName</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAME_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD__TNAME = TNAME__TNAME;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD__SIGNATURES = TNAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD__PG = TNAME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_FEATURE_COUNT = TNAME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_OPERATION_COUNT = TNAME_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__TANNOTATION = AnnotationsPackage.TANNOTATABLE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__OWNED_FLOWS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__INCOMING_FLOWS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__OUTGOING_FLOWS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__DEFINED_BY = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Accessed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__ACCESSED_BY = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>TAccessing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__TACCESSING = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>TModifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__TMODIFIER = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__SIGNATURE = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER_FEATURE_COUNT = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER___GET_TANNOTATION__ECLASS = AnnotationsPackage.TANNOTATABLE___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Get Signature String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER___GET_SIGNATURE_STRING = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER_OPERATION_COUNT = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__TANNOTATION = TMEMBER__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__OWNED_FLOWS = TMEMBER__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__INCOMING_FLOWS = TMEMBER__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__OUTGOING_FLOWS = TMEMBER__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__DEFINED_BY = TMEMBER__DEFINED_BY;

	/**
	 * The feature id for the '<em><b>Accessed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__ACCESSED_BY = TMEMBER__ACCESSED_BY;

	/**
	 * The feature id for the '<em><b>TAccessing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__TACCESSING = TMEMBER__TACCESSING;

	/**
	 * The feature id for the '<em><b>TModifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__TMODIFIER = TMEMBER__TMODIFIER;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__SIGNATURE = TMEMBER__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Hiding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__HIDING = TMEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hidden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__HIDDEN_BY = TMEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION_FEATURE_COUNT = TMEMBER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION___GET_TANNOTATION__ECLASS = TMEMBER___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Get Signature String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION___GET_SIGNATURE_STRING = TMEMBER___GET_SIGNATURE_STRING;

	/**
	 * The operation id for the '<em>Get Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION___GET_SIGNATURE = TMEMBER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION_OPERATION_COUNT = TMEMBER_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE__TANNOTATION = AnnotationsPackage.TANNOTATABLE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE__OWNED_FLOWS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE__INCOMING_FLOWS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE__OUTGOING_FLOWS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE__DEFINITIONS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE_FEATURE_COUNT = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE___GET_TANNOTATION__ECLASS = AnnotationsPackage.TANNOTATABLE___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Get Signature String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE___GET_SIGNATURE_STRING = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE___GET_TDEFINITION__TABSTRACTTYPE = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE_OPERATION_COUNT = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__TANNOTATION = TSIGNATURE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__OWNED_FLOWS = TSIGNATURE__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__INCOMING_FLOWS = TSIGNATURE__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__OUTGOING_FLOWS = TSIGNATURE__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__DEFINITIONS = TSIGNATURE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Field</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__FIELD = TSIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__TYPE = TSIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE_FEATURE_COUNT = TSIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE___GET_TANNOTATION__ECLASS = TSIGNATURE___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Get Signature String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE___GET_SIGNATURE_STRING = TSIGNATURE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE___GET_TDEFINITION__TABSTRACTTYPE = TSIGNATURE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Field Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE___GET_FIELD_DEFINITIONS = TSIGNATURE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE_OPERATION_COUNT = TSIGNATURE_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL__OWNED_FLOWS = TACCESS__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL__INCOMING_FLOWS = TACCESS__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL__OUTGOING_FLOWS = TACCESS__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>TTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL__TTARGET = TACCESS__TTARGET;

	/**
	 * The feature id for the '<em><b>TSource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL__TSOURCE = TACCESS__TSOURCE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL__STATIC_TYPE = TACCESS__STATIC_TYPE;

	/**
	 * The number of structural features of the '<em>TCall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_FEATURE_COUNT = TACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TCall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_OPERATION_COUNT = TACCESS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD__TNAME = TNAME__TNAME;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD__SIGNATURES = TNAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD__PG = TNAME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_FEATURE_COUNT = TNAME_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD___GET_SIGNATURE__TABSTRACTTYPE_ELIST = TNAME_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_OPERATION_COUNT = TNAME_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__TANNOTATION = TMEMBER__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OWNED_FLOWS = TMEMBER__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__INCOMING_FLOWS = TMEMBER__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OUTGOING_FLOWS = TMEMBER__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__DEFINED_BY = TMEMBER__DEFINED_BY;

	/**
	 * The feature id for the '<em><b>Accessed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__ACCESSED_BY = TMEMBER__ACCESSED_BY;

	/**
	 * The feature id for the '<em><b>TAccessing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__TACCESSING = TMEMBER__TACCESSING;

	/**
	 * The feature id for the '<em><b>TModifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__TMODIFIER = TMEMBER__TMODIFIER;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__SIGNATURE = TMEMBER__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Overriding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OVERRIDING = TMEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overridden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OVERRIDDEN_BY = TMEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Overloading</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OVERLOADING = TMEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Overloaded By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OVERLOADED_BY = TMEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__RETURN_TYPE = TMEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Syntethic Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__SYNTETHIC_METHODS = TMEMBER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION_FEATURE_COUNT = TMEMBER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION___GET_TANNOTATION__ECLASS = TMEMBER___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Get Signature String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION___GET_SIGNATURE_STRING = TMEMBER___GET_SIGNATURE_STRING;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION___TO_STRING = TMEMBER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION___GET_SIGNATURE = TMEMBER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION_OPERATION_COUNT = TMEMBER_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__TANNOTATION = TSIGNATURE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__OWNED_FLOWS = TSIGNATURE__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__INCOMING_FLOWS = TSIGNATURE__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__OUTGOING_FLOWS = TSIGNATURE__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__DEFINITIONS = TSIGNATURE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__METHOD = TSIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__RETURN_TYPE = TSIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__PARAMETERS = TSIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__FIRST_PARAMETER = TSIGNATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE_FEATURE_COUNT = TSIGNATURE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE___GET_TANNOTATION__ECLASS = TSIGNATURE___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Get Signature String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE___GET_SIGNATURE_STRING = TSIGNATURE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE___GET_TDEFINITION__TABSTRACTTYPE = TSIGNATURE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE___TO_STRING = TSIGNATURE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is This Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE___IS_THIS_SIGNATURE__TABSTRACTTYPE_ELIST = TSIGNATURE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Method Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE___GET_METHOD_DEFINITIONS = TSIGNATURE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE_OPERATION_COUNT = TSIGNATURE_OPERATION_COUNT + 5;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__TANNOTATION = AnnotationsPackage.TANNOTATABLE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__PG = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subpackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__SUBPACKAGE = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__PARENT = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__CLASSES = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__INTERFACES = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__OWNED_TYPES = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__TYPE_GRAPH = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__TNAME = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE_FEATURE_COUNT = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE___GET_TANNOTATION__ECLASS = AnnotationsPackage.TANNOTATABLE___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE___GET_FULLY_QUALIFIED_NAME = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Owned Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE___GET_ALL_OWNED_TYPES = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Owned Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE___GET_ALL_OWNED_CLASSES = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Base Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE___GET_BASE_PACKAGE = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE_OPERATION_COUNT = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 4;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__TANNOTATION = AnnotationsPackage.TANNOTATABLE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__OWNED_FLOWS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__INCOMING_FLOWS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__OUTGOING_FLOWS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__NEXT = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__PREVIOUS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__TYPE = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_FEATURE_COUNT = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER___GET_TANNOTATION__ECLASS = AnnotationsPackage.TANNOTATABLE___GET_TANNOTATION__ECLASS;

	/**
	 * The number of operations of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_OPERATION_COUNT = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__TANNOTATION = AnnotationsPackage.TANNOTATABLE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__PACKAGES = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__METHODS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__FIELDS = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__CLASSES = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__INTERFACES = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__OWNED_TYPES = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>TAnnotation Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__TANNOTATION_TYPES = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__TNAME = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH_FEATURE_COUNT = AnnotationsPackage.TANNOTATABLE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH___GET_TANNOTATION__ECLASS = AnnotationsPackage.TANNOTATABLE___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Get Declared TClasses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH___GET_DECLARED_TCLASSES = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH___TO_STRING = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH___GET_PACKAGE__STRING = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH___GET_PACKAGE__ELIST = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH___GET_CLASS__STRING = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH___GET_INTERFACE__STRING = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH___GET_METHOD__STRING = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Field</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH___GET_FIELD__STRING = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH___GET_SIGNATURE__STRING = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH_OPERATION_COUNT = AnnotationsPackage.TANNOTATABLE_OPERATION_COUNT + 9;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__TANNOTATION = TABSTRACT_TYPE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__PG = TABSTRACT_TYPE__PG;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__PACKAGE = TABSTRACT_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__SIGNATURE = TABSTRACT_TYPE__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__DEFINES = TABSTRACT_TYPE__DEFINES;

	/**
	 * The feature id for the '<em><b>TLib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__TLIB = TABSTRACT_TYPE__TLIB;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__TNAME = TABSTRACT_TYPE__TNAME;

	/**
	 * The feature id for the '<em><b>TModifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__TMODIFIER = TABSTRACT_TYPE__TMODIFIER;

	/**
	 * The feature id for the '<em><b>Inner Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__INNER_TYPES = TABSTRACT_TYPE__INNER_TYPES;

	/**
	 * The feature id for the '<em><b>Outer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__OUTER_TYPE = TABSTRACT_TYPE__OUTER_TYPE;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__IMPLEMENTED_BY = TABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__PARENT_INTERFACES = TABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__CHILD_INTERFACES = TABSTRACT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_FEATURE_COUNT = TABSTRACT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___GET_TANNOTATION__ECLASS = TABSTRACT_TYPE___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Is Declared</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___IS_DECLARED = TABSTRACT_TYPE___IS_DECLARED;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___GET_FULLY_QUALIFIED_NAME = TABSTRACT_TYPE___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get TMethod Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___GET_TMETHOD_SIGNATURE__STRING = TABSTRACT_TYPE___GET_TMETHOD_SIGNATURE__STRING;

	/**
	 * The operation id for the '<em>Get TMethod Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___GET_TMETHOD_DEFINITION__STRING = TABSTRACT_TYPE___GET_TMETHOD_DEFINITION__STRING;

	/**
	 * The operation id for the '<em>Get Base Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___GET_BASE_PACKAGE = TABSTRACT_TYPE___GET_BASE_PACKAGE;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___GET_TDEFINITION__TSIGNATURE = TABSTRACT_TYPE___GET_TDEFINITION__TSIGNATURE;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___GET_TDEFINITION__STRING = TABSTRACT_TYPE___GET_TDEFINITION__STRING;

	/**
	 * The operation id for the '<em>Has TMember</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___HAS_TMEMBER__TMEMBER = TABSTRACT_TYPE___HAS_TMEMBER__TMEMBER;

	/**
	 * The operation id for the '<em>Fill Same Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___FILL_SAME_TYPE__ELIST = TABSTRACT_TYPE___FILL_SAME_TYPE__ELIST;

	/**
	 * The operation id for the '<em>Is Inner Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___IS_INNER_TYPE__TABSTRACTTYPE = TABSTRACT_TYPE___IS_INNER_TYPE__TABSTRACTTYPE;

	/**
	 * The operation id for the '<em>Get Real Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___GET_REAL_PACKAGE__TABSTRACTTYPE = TABSTRACT_TYPE___GET_REAL_PACKAGE__TABSTRACTTYPE;

	/**
	 * The operation id for the '<em>Is Sub Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___IS_SUB_TYPE_OF__TABSTRACTTYPE = TABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___IS_SUPER_TYPE_OF__TABSTRACTTYPE = TABSTRACT_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Common Super Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE = TABSTRACT_TYPE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_OPERATION_COUNT = TABSTRACT_TYPE_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD__OWNED_FLOWS = TACCESS__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD__INCOMING_FLOWS = TACCESS__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD__OUTGOING_FLOWS = TACCESS__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>TTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD__TTARGET = TACCESS__TTARGET;

	/**
	 * The feature id for the '<em><b>TSource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD__TSOURCE = TACCESS__TSOURCE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD__STATIC_TYPE = TACCESS__STATIC_TYPE;

	/**
	 * The number of structural features of the '<em>TRead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD_FEATURE_COUNT = TACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TRead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD_OPERATION_COUNT = TACCESS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWRITE__OWNED_FLOWS = TACCESS__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWRITE__INCOMING_FLOWS = TACCESS__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWRITE__OUTGOING_FLOWS = TACCESS__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>TTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWRITE__TTARGET = TACCESS__TTARGET;

	/**
	 * The feature id for the '<em><b>TSource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWRITE__TSOURCE = TACCESS__TSOURCE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWRITE__STATIC_TYPE = TACCESS__STATIC_TYPE;

	/**
	 * The number of structural features of the '<em>TWrite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWRITE_FEATURE_COUNT = TACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TWrite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWRITE_OPERATION_COUNT = TACCESS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TVisibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMODIFIER__TVISIBILITY = 0;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMODIFIER__IS_STATIC = 1;

	/**
	 * The number of structural features of the '<em>TModifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMODIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TModifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMODIFIER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD__TANNOTATION = TMEMBER__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD__OWNED_FLOWS = TMEMBER__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD__INCOMING_FLOWS = TMEMBER__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD__OUTGOING_FLOWS = TMEMBER__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD__DEFINED_BY = TMEMBER__DEFINED_BY;

	/**
	 * The feature id for the '<em><b>Accessed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD__ACCESSED_BY = TMEMBER__ACCESSED_BY;

	/**
	 * The feature id for the '<em><b>TAccessing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD__TACCESSING = TMEMBER__TACCESSING;

	/**
	 * The feature id for the '<em><b>TModifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD__TMODIFIER = TMEMBER__TMODIFIER;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD__SIGNATURE = TMEMBER__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Original Method Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION = TMEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSyntethic Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD_FEATURE_COUNT = TMEMBER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD___GET_TANNOTATION__ECLASS = TMEMBER___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Get Signature String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD___GET_SIGNATURE_STRING = TMEMBER___GET_SIGNATURE_STRING;

	/**
	 * The operation id for the '<em>Get Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD___GET_SIGNATURE = TMEMBER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>TSyntethic Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTETHIC_METHOD_OPERATION_COUNT = TMEMBER_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__TANNOTATION = TCLASS__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__PG = TCLASS__PG;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__PACKAGE = TCLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__SIGNATURE = TCLASS__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__DEFINES = TCLASS__DEFINES;

	/**
	 * The feature id for the '<em><b>TLib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__TLIB = TCLASS__TLIB;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__TNAME = TCLASS__TNAME;

	/**
	 * The feature id for the '<em><b>TModifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__TMODIFIER = TCLASS__TMODIFIER;

	/**
	 * The feature id for the '<em><b>Inner Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__INNER_TYPES = TCLASS__INNER_TYPES;

	/**
	 * The feature id for the '<em><b>Outer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__OUTER_TYPE = TCLASS__OUTER_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__PARENT_CLASS = TCLASS__PARENT_CLASS;

	/**
	 * The feature id for the '<em><b>Child Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__CHILD_CLASSES = TCLASS__CHILD_CLASSES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__IMPLEMENTS = TCLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__IMPLEMENTED_BY = TCLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__PARENT_INTERFACES = TCLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE__CHILD_INTERFACES = TCLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TUnresolved Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE_FEATURE_COUNT = TCLASS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_TANNOTATION__ECLASS = TCLASS___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Is Declared</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___IS_DECLARED = TCLASS___IS_DECLARED;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_FULLY_QUALIFIED_NAME = TCLASS___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get TMethod Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_TMETHOD_SIGNATURE__STRING = TCLASS___GET_TMETHOD_SIGNATURE__STRING;

	/**
	 * The operation id for the '<em>Get TMethod Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_TMETHOD_DEFINITION__STRING = TCLASS___GET_TMETHOD_DEFINITION__STRING;

	/**
	 * The operation id for the '<em>Get Base Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_BASE_PACKAGE = TCLASS___GET_BASE_PACKAGE;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_TDEFINITION__TSIGNATURE = TCLASS___GET_TDEFINITION__TSIGNATURE;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_TDEFINITION__STRING = TCLASS___GET_TDEFINITION__STRING;

	/**
	 * The operation id for the '<em>Has TMember</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___HAS_TMEMBER__TMEMBER = TCLASS___HAS_TMEMBER__TMEMBER;

	/**
	 * The operation id for the '<em>Fill Same Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___FILL_SAME_TYPE__ELIST = TCLASS___FILL_SAME_TYPE__ELIST;

	/**
	 * The operation id for the '<em>Is Inner Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___IS_INNER_TYPE__TABSTRACTTYPE = TCLASS___IS_INNER_TYPE__TABSTRACTTYPE;

	/**
	 * The operation id for the '<em>Get Real Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_REAL_PACKAGE__TABSTRACTTYPE = TCLASS___GET_REAL_PACKAGE__TABSTRACTTYPE;

	/**
	 * The operation id for the '<em>Get TMethod Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_TMETHOD_DEFINITIONS = TCLASS___GET_TMETHOD_DEFINITIONS;

	/**
	 * The operation id for the '<em>Get Declared TMethod Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_DECLARED_TMETHOD_DEFINITIONS = TCLASS___GET_DECLARED_TMETHOD_DEFINITIONS;

	/**
	 * The operation id for the '<em>Get All TMembers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_ALL_TMEMBERS = TCLASS___GET_ALL_TMEMBERS;

	/**
	 * The operation id for the '<em>Get All TMembers In Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_ALL_TMEMBERS_IN_CONTAINER = TCLASS___GET_ALL_TMEMBERS_IN_CONTAINER;

	/**
	 * The operation id for the '<em>Get All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_ALL_CHILDREN = TCLASS___GET_ALL_CHILDREN;

	/**
	 * The operation id for the '<em>Get All Outgoing Accesses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_ALL_OUTGOING_ACCESSES__TSIGNATURE = TCLASS___GET_ALL_OUTGOING_ACCESSES__TSIGNATURE;

	/**
	 * The operation id for the '<em>Has AParent This TMember</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___HAS_APARENT_THIS_TMEMBER__TMEMBER = TCLASS___HAS_APARENT_THIS_TMEMBER__TMEMBER;

	/**
	 * The operation id for the '<em>Get Resolved Parent Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_RESOLVED_PARENT_CLASS = TCLASS___GET_RESOLVED_PARENT_CLASS;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___TO_STRING = TCLASS___TO_STRING;

	/**
	 * The operation id for the '<em>Get Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___GET_PARENTS = TCLASS___GET_PARENTS;

	/**
	 * The operation id for the '<em>Is Sub Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___IS_SUB_TYPE_OF__TABSTRACTTYPE = TCLASS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___IS_SUPER_TYPE_OF__TABSTRACTTYPE = TCLASS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Common Super Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE = TCLASS_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>TUnresolved Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNRESOLVED_TYPE_OPERATION_COUNT = TCLASS_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TFlowImpl <em>TFlow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TFlowImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTFlow()
	 * @generated
	 */
	int TFLOW = 22;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW__OWNED_FLOWS = TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW__INCOMING_FLOWS = TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW__OUTGOING_FLOWS = TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Flow Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW__FLOW_OWNER = TABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TFlow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_FEATURE_COUNT = TABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TFlow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_OPERATION_COUNT = TABSTRACT_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TReadWriteImpl <em>TRead Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TReadWriteImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTReadWrite()
	 * @generated
	 */
	int TREAD_WRITE = 24;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD_WRITE__OWNED_FLOWS = TACCESS__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD_WRITE__INCOMING_FLOWS = TACCESS__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD_WRITE__OUTGOING_FLOWS = TACCESS__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>TTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD_WRITE__TTARGET = TACCESS__TTARGET;

	/**
	 * The feature id for the '<em><b>TSource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD_WRITE__TSOURCE = TACCESS__TSOURCE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD_WRITE__STATIC_TYPE = TACCESS__STATIC_TYPE;

	/**
	 * The number of structural features of the '<em>TRead Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD_WRITE_FEATURE_COUNT = TACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TRead Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREAD_WRITE_OPERATION_COUNT = TACCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TConstructorImpl <em>TConstructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TConstructorImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTConstructor()
	 * @generated
	 */
	int TCONSTRUCTOR = 25;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR__TANNOTATED = AnnotationsPackage.TANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR__TYPE = AnnotationsPackage.TANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR__TVALUES = AnnotationsPackage.TANNOTATION__TVALUES;

	/**
	 * The number of structural features of the '<em>TConstructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR_FEATURE_COUNT = AnnotationsPackage.TANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___ECLASS = AnnotationsPackage.TANNOTATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___EIS_PROXY = AnnotationsPackage.TANNOTATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___ERESOURCE = AnnotationsPackage.TANNOTATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___ECONTAINER = AnnotationsPackage.TANNOTATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___ECONTAINING_FEATURE = AnnotationsPackage.TANNOTATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___ECONTAINMENT_FEATURE = AnnotationsPackage.TANNOTATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___ECONTENTS = AnnotationsPackage.TANNOTATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___EALL_CONTENTS = AnnotationsPackage.TANNOTATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___ECROSS_REFERENCES = AnnotationsPackage.TANNOTATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___EGET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___EGET__ESTRUCTURALFEATURE_BOOLEAN = AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___ESET__ESTRUCTURALFEATURE_OBJECT = AnnotationsPackage.TANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___EIS_SET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___EUNSET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___EINVOKE__EOPERATION_ELIST = AnnotationsPackage.TANNOTATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR___GET_VALUE__STRING = AnnotationsPackage.TANNOTATION___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>TConstructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRUCTOR_OPERATION_COUNT = AnnotationsPackage.TANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TEnumImpl <em>TEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TEnumImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTEnum()
	 * @generated
	 */
	int TENUM = 26;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM__TANNOTATED = AnnotationsPackage.TANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM__TYPE = AnnotationsPackage.TANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM__TVALUES = AnnotationsPackage.TANNOTATION__TVALUES;

	/**
	 * The number of structural features of the '<em>TEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_FEATURE_COUNT = AnnotationsPackage.TANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___ECLASS = AnnotationsPackage.TANNOTATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___EIS_PROXY = AnnotationsPackage.TANNOTATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___ERESOURCE = AnnotationsPackage.TANNOTATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___ECONTAINER = AnnotationsPackage.TANNOTATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___ECONTAINING_FEATURE = AnnotationsPackage.TANNOTATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___ECONTAINMENT_FEATURE = AnnotationsPackage.TANNOTATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___ECONTENTS = AnnotationsPackage.TANNOTATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___EALL_CONTENTS = AnnotationsPackage.TANNOTATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___ECROSS_REFERENCES = AnnotationsPackage.TANNOTATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___EGET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___EGET__ESTRUCTURALFEATURE_BOOLEAN = AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___ESET__ESTRUCTURALFEATURE_OBJECT = AnnotationsPackage.TANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___EIS_SET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___EUNSET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___EINVOKE__EOPERATION_ELIST = AnnotationsPackage.TANNOTATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM___GET_VALUE__STRING = AnnotationsPackage.TANNOTATION___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>TEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_OPERATION_COUNT = AnnotationsPackage.TANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.TVisibility <em>TVisibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.TVisibility
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTVisibility()
	 * @generated
	 */
	int TVISIBILITY = 27;

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TAccess <em>TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAccess</em>'.
	 * @see org.gravity.typegraph.basic.TAccess
	 * @generated
	 */
	EClass getTAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TAccess#getTTarget <em>TTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TTarget</em>'.
	 * @see org.gravity.typegraph.basic.TAccess#getTTarget()
	 * @see #getTAccess()
	 * @generated
	 */
	EReference getTAccess_TTarget();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TAccess#getTSource <em>TSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>TSource</em>'.
	 * @see org.gravity.typegraph.basic.TAccess#getTSource()
	 * @see #getTAccess()
	 * @generated
	 */
	EReference getTAccess_TSource();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TAccess#getStaticType <em>Static Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Static Type</em>'.
	 * @see org.gravity.typegraph.basic.TAccess#getStaticType()
	 * @see #getTAccess()
	 * @generated
	 */
	EReference getTAccess_StaticType();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TClass <em>TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TClass</em>'.
	 * @see org.gravity.typegraph.basic.TClass
	 * @generated
	 */
	EClass getTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TClass#getParentClass <em>Parent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Class</em>'.
	 * @see org.gravity.typegraph.basic.TClass#getParentClass()
	 * @see #getTClass()
	 * @generated
	 */
	EReference getTClass_ParentClass();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TClass#getChildClasses <em>Child Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Classes</em>'.
	 * @see org.gravity.typegraph.basic.TClass#getChildClasses()
	 * @see #getTClass()
	 * @generated
	 */
	EReference getTClass_ChildClasses();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see org.gravity.typegraph.basic.TClass#getImplements()
	 * @see #getTClass()
	 * @generated
	 */
	EReference getTClass_Implements();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#getTMethodDefinitions() <em>Get TMethod Definitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get TMethod Definitions</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#getTMethodDefinitions()
	 * @generated
	 */
	EOperation getTClass__GetTMethodDefinitions();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#getDeclaredTMethodDefinitions() <em>Get Declared TMethod Definitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Declared TMethod Definitions</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#getDeclaredTMethodDefinitions()
	 * @generated
	 */
	EOperation getTClass__GetDeclaredTMethodDefinitions();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#getAllTMembers() <em>Get All TMembers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All TMembers</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#getAllTMembers()
	 * @generated
	 */
	EOperation getTClass__GetAllTMembers();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#getAllTMembersInContainer() <em>Get All TMembers In Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All TMembers In Container</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#getAllTMembersInContainer()
	 * @generated
	 */
	EOperation getTClass__GetAllTMembersInContainer();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#getAllChildren() <em>Get All Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Children</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#getAllChildren()
	 * @generated
	 */
	EOperation getTClass__GetAllChildren();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#isSubTypeOf(org.gravity.typegraph.basic.TAbstractType) <em>Is Sub Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sub Type Of</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#isSubTypeOf(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTClass__IsSubTypeOf__TAbstractType();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#isSuperTypeOf(org.gravity.typegraph.basic.TAbstractType) <em>Is Super Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Super Type Of</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#isSuperTypeOf(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTClass__IsSuperTypeOf__TAbstractType();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#getAllOutgoingAccesses(org.gravity.typegraph.basic.TSignature) <em>Get All Outgoing Accesses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Outgoing Accesses</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#getAllOutgoingAccesses(org.gravity.typegraph.basic.TSignature)
	 * @generated
	 */
	EOperation getTClass__GetAllOutgoingAccesses__TSignature();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#hasAParentThisTMember(org.gravity.typegraph.basic.TMember) <em>Has AParent This TMember</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has AParent This TMember</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#hasAParentThisTMember(org.gravity.typegraph.basic.TMember)
	 * @generated
	 */
	EOperation getTClass__HasAParentThisTMember__TMember();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#getResolvedParentClass() <em>Get Resolved Parent Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resolved Parent Class</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#getResolvedParentClass()
	 * @generated
	 */
	EOperation getTClass__GetResolvedParentClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#toString()
	 * @generated
	 */
	EOperation getTClass__ToString();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#getParents() <em>Get Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parents</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#getParents()
	 * @generated
	 */
	EOperation getTClass__GetParents();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TClass#hasCommonSuperType(org.gravity.typegraph.basic.TAbstractType) <em>Has Common Super Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Common Super Type</em>' operation.
	 * @see org.gravity.typegraph.basic.TClass#hasCommonSuperType(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTClass__HasCommonSuperType__TAbstractType();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TField <em>TField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TField</em>'.
	 * @see org.gravity.typegraph.basic.TField
	 * @generated
	 */
	EClass getTField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TField#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see org.gravity.typegraph.basic.TField#getSignatures()
	 * @see #getTField()
	 * @generated
	 */
	EReference getTField_Signatures();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TField#getPg <em>Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pg</em>'.
	 * @see org.gravity.typegraph.basic.TField#getPg()
	 * @see #getTField()
	 * @generated
	 */
	EReference getTField_Pg();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TFieldDefinition <em>TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TField Definition</em>'.
	 * @see org.gravity.typegraph.basic.TFieldDefinition
	 * @generated
	 */
	EClass getTFieldDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TFieldDefinition#getHiding <em>Hiding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hiding</em>'.
	 * @see org.gravity.typegraph.basic.TFieldDefinition#getHiding()
	 * @see #getTFieldDefinition()
	 * @generated
	 */
	EReference getTFieldDefinition_Hiding();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TFieldDefinition#getHiddenBy <em>Hidden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hidden By</em>'.
	 * @see org.gravity.typegraph.basic.TFieldDefinition#getHiddenBy()
	 * @see #getTFieldDefinition()
	 * @generated
	 */
	EReference getTFieldDefinition_HiddenBy();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TFieldDefinition#getSignature() <em>Get Signature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Signature</em>' operation.
	 * @see org.gravity.typegraph.basic.TFieldDefinition#getSignature()
	 * @generated
	 */
	EOperation getTFieldDefinition__GetSignature();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TFieldSignature <em>TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TField Signature</em>'.
	 * @see org.gravity.typegraph.basic.TFieldSignature
	 * @generated
	 */
	EClass getTFieldSignature();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TFieldSignature#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Field</em>'.
	 * @see org.gravity.typegraph.basic.TFieldSignature#getField()
	 * @see #getTFieldSignature()
	 * @generated
	 */
	EReference getTFieldSignature_Field();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TFieldSignature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.gravity.typegraph.basic.TFieldSignature#getType()
	 * @see #getTFieldSignature()
	 * @generated
	 */
	EReference getTFieldSignature_Type();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TFieldSignature#getSignatureString() <em>Get Signature String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Signature String</em>' operation.
	 * @see org.gravity.typegraph.basic.TFieldSignature#getSignatureString()
	 * @generated
	 */
	EOperation getTFieldSignature__GetSignatureString();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TFieldSignature#getTDefinition(org.gravity.typegraph.basic.TAbstractType) <em>Get TDefinition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get TDefinition</em>' operation.
	 * @see org.gravity.typegraph.basic.TFieldSignature#getTDefinition(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTFieldSignature__GetTDefinition__TAbstractType();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TFieldSignature#getFieldDefinitions() <em>Get Field Definitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Field Definitions</em>' operation.
	 * @see org.gravity.typegraph.basic.TFieldSignature#getFieldDefinitions()
	 * @generated
	 */
	EOperation getTFieldSignature__GetFieldDefinitions();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TCall <em>TCall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCall</em>'.
	 * @see org.gravity.typegraph.basic.TCall
	 * @generated
	 */
	EClass getTCall();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TMember <em>TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMember</em>'.
	 * @see org.gravity.typegraph.basic.TMember
	 * @generated
	 */
	EClass getTMember();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TMember#getDefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defined By</em>'.
	 * @see org.gravity.typegraph.basic.TMember#getDefinedBy()
	 * @see #getTMember()
	 * @generated
	 */
	EReference getTMember_DefinedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TMember#getAccessedBy <em>Accessed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessed By</em>'.
	 * @see org.gravity.typegraph.basic.TMember#getAccessedBy()
	 * @see #getTMember()
	 * @generated
	 */
	EReference getTMember_AccessedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TMember#getTAccessing <em>TAccessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TAccessing</em>'.
	 * @see org.gravity.typegraph.basic.TMember#getTAccessing()
	 * @see #getTMember()
	 * @generated
	 */
	EReference getTMember_TAccessing();

	/**
	 * Returns the meta object for the containment reference '{@link org.gravity.typegraph.basic.TMember#getTModifier <em>TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TModifier</em>'.
	 * @see org.gravity.typegraph.basic.TMember#getTModifier()
	 * @see #getTMember()
	 * @generated
	 */
	EReference getTMember_TModifier();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TMember#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Signature</em>'.
	 * @see org.gravity.typegraph.basic.TMember#getSignature()
	 * @see #getTMember()
	 * @generated
	 */
	EReference getTMember_Signature();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TMember#getSignatureString() <em>Get Signature String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Signature String</em>' operation.
	 * @see org.gravity.typegraph.basic.TMember#getSignatureString()
	 * @generated
	 */
	EOperation getTMember__GetSignatureString();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TMethod <em>TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMethod</em>'.
	 * @see org.gravity.typegraph.basic.TMethod
	 * @generated
	 */
	EClass getTMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TMethod#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see org.gravity.typegraph.basic.TMethod#getSignatures()
	 * @see #getTMethod()
	 * @generated
	 */
	EReference getTMethod_Signatures();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TMethod#getPg <em>Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pg</em>'.
	 * @see org.gravity.typegraph.basic.TMethod#getPg()
	 * @see #getTMethod()
	 * @generated
	 */
	EReference getTMethod_Pg();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TMethod#getSignature(org.gravity.typegraph.basic.TAbstractType, org.eclipse.emf.common.util.EList) <em>Get Signature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Signature</em>' operation.
	 * @see org.gravity.typegraph.basic.TMethod#getSignature(org.gravity.typegraph.basic.TAbstractType, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTMethod__GetSignature__TAbstractType_EList();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TMethodDefinition <em>TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMethod Definition</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition
	 * @generated
	 */
	EClass getTMethodDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverriding <em>Overriding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overriding</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getOverriding()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_Overriding();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverriddenBy <em>Overridden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overridden By</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getOverriddenBy()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_OverriddenBy();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverloading <em>Overloading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overloading</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getOverloading()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_Overloading();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverloadedBy <em>Overloaded By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overloaded By</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getOverloadedBy()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_OverloadedBy();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TMethodDefinition#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getReturnType()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_ReturnType();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TMethodDefinition#getSyntethicMethods <em>Syntethic Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Syntethic Methods</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getSyntethicMethods()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_SyntethicMethods();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TMethodDefinition#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#toString()
	 * @generated
	 */
	EOperation getTMethodDefinition__ToString();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TMethodDefinition#getSignature() <em>Get Signature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Signature</em>' operation.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getSignature()
	 * @generated
	 */
	EOperation getTMethodDefinition__GetSignature();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TMethodSignature <em>TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMethod Signature</em>'.
	 * @see org.gravity.typegraph.basic.TMethodSignature
	 * @generated
	 */
	EClass getTMethodSignature();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TMethodSignature#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see org.gravity.typegraph.basic.TMethodSignature#getMethod()
	 * @see #getTMethodSignature()
	 * @generated
	 */
	EReference getTMethodSignature_Method();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TMethodSignature#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.gravity.typegraph.basic.TMethodSignature#getReturnType()
	 * @see #getTMethodSignature()
	 * @generated
	 */
	EReference getTMethodSignature_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TMethodSignature#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.gravity.typegraph.basic.TMethodSignature#getParameters()
	 * @see #getTMethodSignature()
	 * @generated
	 */
	EReference getTMethodSignature_Parameters();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TMethodSignature#getFirstParameter <em>First Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Parameter</em>'.
	 * @see org.gravity.typegraph.basic.TMethodSignature#getFirstParameter()
	 * @see #getTMethodSignature()
	 * @generated
	 */
	EReference getTMethodSignature_FirstParameter();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TMethodSignature#getSignatureString() <em>Get Signature String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Signature String</em>' operation.
	 * @see org.gravity.typegraph.basic.TMethodSignature#getSignatureString()
	 * @generated
	 */
	EOperation getTMethodSignature__GetSignatureString();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TMethodSignature#getTDefinition(org.gravity.typegraph.basic.TAbstractType) <em>Get TDefinition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get TDefinition</em>' operation.
	 * @see org.gravity.typegraph.basic.TMethodSignature#getTDefinition(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTMethodSignature__GetTDefinition__TAbstractType();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TMethodSignature#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.gravity.typegraph.basic.TMethodSignature#toString()
	 * @generated
	 */
	EOperation getTMethodSignature__ToString();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TMethodSignature#isThisSignature(org.gravity.typegraph.basic.TAbstractType, org.eclipse.emf.common.util.EList) <em>Is This Signature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is This Signature</em>' operation.
	 * @see org.gravity.typegraph.basic.TMethodSignature#isThisSignature(org.gravity.typegraph.basic.TAbstractType, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTMethodSignature__IsThisSignature__TAbstractType_EList();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TMethodSignature#getMethodDefinitions() <em>Get Method Definitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Method Definitions</em>' operation.
	 * @see org.gravity.typegraph.basic.TMethodSignature#getMethodDefinitions()
	 * @generated
	 */
	EOperation getTMethodSignature__GetMethodDefinitions();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TPackage <em>TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPackage</em>'.
	 * @see org.gravity.typegraph.basic.TPackage
	 * @generated
	 */
	EClass getTPackage();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TPackage#getPg <em>Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pg</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getPg()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Pg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TPackage#getSubpackage <em>Subpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpackage</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getSubpackage()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Subpackage();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getParent()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Parent();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getClasses()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Classes();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TPackage#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getInterfaces()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Interfaces();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TPackage#getOwnedTypes <em>Owned Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Types</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getOwnedTypes()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_OwnedTypes();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TPackage#getTypeGraph <em>Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Graph</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getTypeGraph()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_TypeGraph();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TPackage#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getTName()
	 * @see #getTPackage()
	 * @generated
	 */
	EAttribute getTPackage_TName();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TPackage#getFullyQualifiedName() <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Fully Qualified Name</em>' operation.
	 * @see org.gravity.typegraph.basic.TPackage#getFullyQualifiedName()
	 * @generated
	 */
	EOperation getTPackage__GetFullyQualifiedName();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TPackage#getAllOwnedTypes() <em>Get All Owned Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Owned Types</em>' operation.
	 * @see org.gravity.typegraph.basic.TPackage#getAllOwnedTypes()
	 * @generated
	 */
	EOperation getTPackage__GetAllOwnedTypes();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TPackage#getAllOwnedClasses() <em>Get All Owned Classes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Owned Classes</em>' operation.
	 * @see org.gravity.typegraph.basic.TPackage#getAllOwnedClasses()
	 * @generated
	 */
	EOperation getTPackage__GetAllOwnedClasses();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TPackage#getBasePackage() <em>Get Base Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Base Package</em>' operation.
	 * @see org.gravity.typegraph.basic.TPackage#getBasePackage()
	 * @generated
	 */
	EOperation getTPackage__GetBasePackage();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TParameter <em>TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter</em>'.
	 * @see org.gravity.typegraph.basic.TParameter
	 * @generated
	 */
	EClass getTParameter();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TParameter#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.gravity.typegraph.basic.TParameter#getNext()
	 * @see #getTParameter()
	 * @generated
	 */
	EReference getTParameter_Next();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TParameter#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see org.gravity.typegraph.basic.TParameter#getPrevious()
	 * @see #getTParameter()
	 * @generated
	 */
	EReference getTParameter_Previous();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.gravity.typegraph.basic.TParameter#getType()
	 * @see #getTParameter()
	 * @generated
	 */
	EReference getTParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TSignature <em>TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSignature</em>'.
	 * @see org.gravity.typegraph.basic.TSignature
	 * @generated
	 */
	EClass getTSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TSignature#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see org.gravity.typegraph.basic.TSignature#getDefinitions()
	 * @see #getTSignature()
	 * @generated
	 */
	EReference getTSignature_Definitions();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TSignature#getSignatureString() <em>Get Signature String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Signature String</em>' operation.
	 * @see org.gravity.typegraph.basic.TSignature#getSignatureString()
	 * @generated
	 */
	EOperation getTSignature__GetSignatureString();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TSignature#getTDefinition(org.gravity.typegraph.basic.TAbstractType) <em>Get TDefinition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get TDefinition</em>' operation.
	 * @see org.gravity.typegraph.basic.TSignature#getTDefinition(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTSignature__GetTDefinition__TAbstractType();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TypeGraph <em>Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Graph</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph
	 * @generated
	 */
	EClass getTypeGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TypeGraph#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getPackages()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TypeGraph#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getMethods()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TypeGraph#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getFields()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Fields();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TypeGraph#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getClasses()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Classes();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TypeGraph#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getInterfaces()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TypeGraph#getOwnedTypes <em>Owned Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Types</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getOwnedTypes()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_OwnedTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TypeGraph#getTAnnotationTypes <em>TAnnotation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TAnnotation Types</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getTAnnotationTypes()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_TAnnotationTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TypeGraph#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getTName()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EAttribute getTypeGraph_TName();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TypeGraph#getDeclaredTClasses() <em>Get Declared TClasses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Declared TClasses</em>' operation.
	 * @see org.gravity.typegraph.basic.TypeGraph#getDeclaredTClasses()
	 * @generated
	 */
	EOperation getTypeGraph__GetDeclaredTClasses();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TypeGraph#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.gravity.typegraph.basic.TypeGraph#toString()
	 * @generated
	 */
	EOperation getTypeGraph__ToString();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TypeGraph#getPackage(java.lang.String) <em>Get Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Package</em>' operation.
	 * @see org.gravity.typegraph.basic.TypeGraph#getPackage(java.lang.String)
	 * @generated
	 */
	EOperation getTypeGraph__GetPackage__String();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TypeGraph#getPackage(org.eclipse.emf.common.util.EList) <em>Get Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Package</em>' operation.
	 * @see org.gravity.typegraph.basic.TypeGraph#getPackage(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTypeGraph__GetPackage__EList();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TypeGraph#getClass(java.lang.String) <em>Get Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Class</em>' operation.
	 * @see org.gravity.typegraph.basic.TypeGraph#getClass(java.lang.String)
	 * @generated
	 */
	EOperation getTypeGraph__GetClass__String();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TypeGraph#getInterface(java.lang.String) <em>Get Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Interface</em>' operation.
	 * @see org.gravity.typegraph.basic.TypeGraph#getInterface(java.lang.String)
	 * @generated
	 */
	EOperation getTypeGraph__GetInterface__String();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TypeGraph#getMethod(java.lang.String) <em>Get Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Method</em>' operation.
	 * @see org.gravity.typegraph.basic.TypeGraph#getMethod(java.lang.String)
	 * @generated
	 */
	EOperation getTypeGraph__GetMethod__String();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TypeGraph#getField(java.lang.String) <em>Get Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Field</em>' operation.
	 * @see org.gravity.typegraph.basic.TypeGraph#getField(java.lang.String)
	 * @generated
	 */
	EOperation getTypeGraph__GetField__String();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TypeGraph#getSignature(java.lang.String) <em>Get Signature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Signature</em>' operation.
	 * @see org.gravity.typegraph.basic.TypeGraph#getSignature(java.lang.String)
	 * @generated
	 */
	EOperation getTypeGraph__GetSignature__String();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TInterface <em>TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInterface</em>'.
	 * @see org.gravity.typegraph.basic.TInterface
	 * @generated
	 */
	EClass getTInterface();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TInterface#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implemented By</em>'.
	 * @see org.gravity.typegraph.basic.TInterface#getImplementedBy()
	 * @see #getTInterface()
	 * @generated
	 */
	EReference getTInterface_ImplementedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TInterface#getParentInterfaces <em>Parent Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Interfaces</em>'.
	 * @see org.gravity.typegraph.basic.TInterface#getParentInterfaces()
	 * @see #getTInterface()
	 * @generated
	 */
	EReference getTInterface_ParentInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TInterface#getChildInterfaces <em>Child Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Interfaces</em>'.
	 * @see org.gravity.typegraph.basic.TInterface#getChildInterfaces()
	 * @see #getTInterface()
	 * @generated
	 */
	EReference getTInterface_ChildInterfaces();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TInterface#isSubTypeOf(org.gravity.typegraph.basic.TAbstractType) <em>Is Sub Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sub Type Of</em>' operation.
	 * @see org.gravity.typegraph.basic.TInterface#isSubTypeOf(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTInterface__IsSubTypeOf__TAbstractType();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TInterface#isSuperTypeOf(org.gravity.typegraph.basic.TAbstractType) <em>Is Super Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Super Type Of</em>' operation.
	 * @see org.gravity.typegraph.basic.TInterface#isSuperTypeOf(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTInterface__IsSuperTypeOf__TAbstractType();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TInterface#hasCommonSuperType(org.gravity.typegraph.basic.TAbstractType) <em>Has Common Super Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Common Super Type</em>' operation.
	 * @see org.gravity.typegraph.basic.TInterface#hasCommonSuperType(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTInterface__HasCommonSuperType__TAbstractType();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TAbstractType <em>TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAbstract Type</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType
	 * @generated
	 */
	EClass getTAbstractType();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TAbstractType#getPg <em>Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pg</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getPg()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EReference getTAbstractType_Pg();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TAbstractType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getPackage()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EReference getTAbstractType_Package();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TAbstractType#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signature</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getSignature()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EReference getTAbstractType_Signature();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TAbstractType#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defines</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getDefines()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EReference getTAbstractType_Defines();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TAbstractType#isTLib <em>TLib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TLib</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#isTLib()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EAttribute getTAbstractType_TLib();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TAbstractType#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getTName()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EAttribute getTAbstractType_TName();

	/**
	 * Returns the meta object for the containment reference '{@link org.gravity.typegraph.basic.TAbstractType#getTModifier <em>TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TModifier</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getTModifier()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EReference getTAbstractType_TModifier();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TAbstractType#getInnerTypes <em>Inner Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inner Types</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getInnerTypes()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EReference getTAbstractType_InnerTypes();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TAbstractType#getOuterType <em>Outer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Type</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getOuterType()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EReference getTAbstractType_OuterType();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#isSuperTypeOf(org.gravity.typegraph.basic.TAbstractType) <em>Is Super Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Super Type Of</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#isSuperTypeOf(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTAbstractType__IsSuperTypeOf__TAbstractType();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#isSubTypeOf(org.gravity.typegraph.basic.TAbstractType) <em>Is Sub Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sub Type Of</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#isSubTypeOf(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTAbstractType__IsSubTypeOf__TAbstractType();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#isDeclared() <em>Is Declared</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Declared</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#isDeclared()
	 * @generated
	 */
	EOperation getTAbstractType__IsDeclared();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#getFullyQualifiedName() <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Fully Qualified Name</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#getFullyQualifiedName()
	 * @generated
	 */
	EOperation getTAbstractType__GetFullyQualifiedName();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#getTMethodSignature(java.lang.String) <em>Get TMethod Signature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get TMethod Signature</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#getTMethodSignature(java.lang.String)
	 * @generated
	 */
	EOperation getTAbstractType__GetTMethodSignature__String();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#getTMethodDefinition(java.lang.String) <em>Get TMethod Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get TMethod Definition</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#getTMethodDefinition(java.lang.String)
	 * @generated
	 */
	EOperation getTAbstractType__GetTMethodDefinition__String();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#getBasePackage() <em>Get Base Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Base Package</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#getBasePackage()
	 * @generated
	 */
	EOperation getTAbstractType__GetBasePackage();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#getTDefinition(org.gravity.typegraph.basic.TSignature) <em>Get TDefinition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get TDefinition</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#getTDefinition(org.gravity.typegraph.basic.TSignature)
	 * @generated
	 */
	EOperation getTAbstractType__GetTDefinition__TSignature();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#getTDefinition(java.lang.String) <em>Get TDefinition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get TDefinition</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#getTDefinition(java.lang.String)
	 * @generated
	 */
	EOperation getTAbstractType__GetTDefinition__String();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#hasTMember(org.gravity.typegraph.basic.TMember) <em>Has TMember</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has TMember</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#hasTMember(org.gravity.typegraph.basic.TMember)
	 * @generated
	 */
	EOperation getTAbstractType__HasTMember__TMember();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#hasCommonSuperType(org.gravity.typegraph.basic.TAbstractType) <em>Has Common Super Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Common Super Type</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#hasCommonSuperType(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTAbstractType__HasCommonSuperType__TAbstractType();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#fillSameType(org.eclipse.emf.common.util.EList) <em>Fill Same Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Same Type</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#fillSameType(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTAbstractType__FillSameType__EList();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#isInnerType(org.gravity.typegraph.basic.TAbstractType) <em>Is Inner Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Inner Type</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#isInnerType(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTAbstractType__IsInnerType__TAbstractType();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TAbstractType#getRealPackage(org.gravity.typegraph.basic.TAbstractType) <em>Get Real Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Real Package</em>' operation.
	 * @see org.gravity.typegraph.basic.TAbstractType#getRealPackage(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTAbstractType__GetRealPackage__TAbstractType();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TRead <em>TRead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRead</em>'.
	 * @see org.gravity.typegraph.basic.TRead
	 * @generated
	 */
	EClass getTRead();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TWrite <em>TWrite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TWrite</em>'.
	 * @see org.gravity.typegraph.basic.TWrite
	 * @generated
	 */
	EClass getTWrite();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TModifier <em>TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TModifier</em>'.
	 * @see org.gravity.typegraph.basic.TModifier
	 * @generated
	 */
	EClass getTModifier();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TModifier#getTVisibility <em>TVisibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TVisibility</em>'.
	 * @see org.gravity.typegraph.basic.TModifier#getTVisibility()
	 * @see #getTModifier()
	 * @generated
	 */
	EAttribute getTModifier_TVisibility();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TModifier#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see org.gravity.typegraph.basic.TModifier#isIsStatic()
	 * @see #getTModifier()
	 * @generated
	 */
	EAttribute getTModifier_IsStatic();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TSyntethicMethod <em>TSyntethic Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSyntethic Method</em>'.
	 * @see org.gravity.typegraph.basic.TSyntethicMethod
	 * @generated
	 */
	EClass getTSyntethicMethod();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TSyntethicMethod#getOriginalMethodDefinition <em>Original Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Method Definition</em>'.
	 * @see org.gravity.typegraph.basic.TSyntethicMethod#getOriginalMethodDefinition()
	 * @see #getTSyntethicMethod()
	 * @generated
	 */
	EReference getTSyntethicMethod_OriginalMethodDefinition();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.TSyntethicMethod#getSignature() <em>Get Signature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Signature</em>' operation.
	 * @see org.gravity.typegraph.basic.TSyntethicMethod#getSignature()
	 * @generated
	 */
	EOperation getTSyntethicMethod__GetSignature();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TUnresolvedType <em>TUnresolved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TUnresolved Type</em>'.
	 * @see org.gravity.typegraph.basic.TUnresolvedType
	 * @generated
	 */
	EClass getTUnresolvedType();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TName</em>'.
	 * @see org.gravity.typegraph.basic.TName
	 * @generated
	 */
	EClass getTName();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TName#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see org.gravity.typegraph.basic.TName#getTName()
	 * @see #getTName()
	 * @generated
	 */
	EAttribute getTName_TName();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TFlow <em>TFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFlow</em>'.
	 * @see org.gravity.typegraph.basic.TFlow
	 * @generated
	 */
	EClass getTFlow();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TFlow#getFlowOwner <em>Flow Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Flow Owner</em>'.
	 * @see org.gravity.typegraph.basic.TFlow#getFlowOwner()
	 * @see #getTFlow()
	 * @generated
	 */
	EReference getTFlow_FlowOwner();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TAbstractFlowElement <em>TAbstract Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAbstract Flow Element</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractFlowElement
	 * @generated
	 */
	EClass getTAbstractFlowElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TAbstractFlowElement#getOwnedFlows <em>Owned Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Flows</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractFlowElement#getOwnedFlows()
	 * @see #getTAbstractFlowElement()
	 * @generated
	 */
	EReference getTAbstractFlowElement_OwnedFlows();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TAbstractFlowElement#getIncomingFlows <em>Incoming Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Flows</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractFlowElement#getIncomingFlows()
	 * @see #getTAbstractFlowElement()
	 * @generated
	 */
	EReference getTAbstractFlowElement_IncomingFlows();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TAbstractFlowElement#getOutgoingFlows <em>Outgoing Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Flows</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractFlowElement#getOutgoingFlows()
	 * @see #getTAbstractFlowElement()
	 * @generated
	 */
	EReference getTAbstractFlowElement_OutgoingFlows();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TReadWrite <em>TRead Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRead Write</em>'.
	 * @see org.gravity.typegraph.basic.TReadWrite
	 * @generated
	 */
	EClass getTReadWrite();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TConstructor <em>TConstructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConstructor</em>'.
	 * @see org.gravity.typegraph.basic.TConstructor
	 * @generated
	 */
	EClass getTConstructor();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TEnum <em>TEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEnum</em>'.
	 * @see org.gravity.typegraph.basic.TEnum
	 * @generated
	 */
	EClass getTEnum();

	/**
	 * Returns the meta object for enum '{@link org.gravity.typegraph.basic.TVisibility <em>TVisibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TVisibility</em>'.
	 * @see org.gravity.typegraph.basic.TVisibility
	 * @generated
	 */
	EEnum getTVisibility();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicFactory getBasicFactory();

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
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TAccessImpl <em>TAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TAccessImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAccess()
		 * @generated
		 */
		EClass TACCESS = eINSTANCE.getTAccess();

		/**
		 * The meta object literal for the '<em><b>TTarget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TACCESS__TTARGET = eINSTANCE.getTAccess_TTarget();

		/**
		 * The meta object literal for the '<em><b>TSource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TACCESS__TSOURCE = eINSTANCE.getTAccess_TSource();

		/**
		 * The meta object literal for the '<em><b>Static Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TACCESS__STATIC_TYPE = eINSTANCE.getTAccess_StaticType();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TClassImpl <em>TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TClassImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTClass()
		 * @generated
		 */
		EClass TCLASS = eINSTANCE.getTClass();

		/**
		 * The meta object literal for the '<em><b>Parent Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS__PARENT_CLASS = eINSTANCE.getTClass_ParentClass();

		/**
		 * The meta object literal for the '<em><b>Child Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS__CHILD_CLASSES = eINSTANCE.getTClass_ChildClasses();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS__IMPLEMENTS = eINSTANCE.getTClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Get TMethod Definitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___GET_TMETHOD_DEFINITIONS = eINSTANCE.getTClass__GetTMethodDefinitions();

		/**
		 * The meta object literal for the '<em><b>Get Declared TMethod Definitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___GET_DECLARED_TMETHOD_DEFINITIONS = eINSTANCE.getTClass__GetDeclaredTMethodDefinitions();

		/**
		 * The meta object literal for the '<em><b>Get All TMembers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___GET_ALL_TMEMBERS = eINSTANCE.getTClass__GetAllTMembers();

		/**
		 * The meta object literal for the '<em><b>Get All TMembers In Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___GET_ALL_TMEMBERS_IN_CONTAINER = eINSTANCE.getTClass__GetAllTMembersInContainer();

		/**
		 * The meta object literal for the '<em><b>Get All Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___GET_ALL_CHILDREN = eINSTANCE.getTClass__GetAllChildren();

		/**
		 * The meta object literal for the '<em><b>Is Sub Type Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___IS_SUB_TYPE_OF__TABSTRACTTYPE = eINSTANCE.getTClass__IsSubTypeOf__TAbstractType();

		/**
		 * The meta object literal for the '<em><b>Is Super Type Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___IS_SUPER_TYPE_OF__TABSTRACTTYPE = eINSTANCE.getTClass__IsSuperTypeOf__TAbstractType();

		/**
		 * The meta object literal for the '<em><b>Get All Outgoing Accesses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___GET_ALL_OUTGOING_ACCESSES__TSIGNATURE = eINSTANCE.getTClass__GetAllOutgoingAccesses__TSignature();

		/**
		 * The meta object literal for the '<em><b>Has AParent This TMember</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___HAS_APARENT_THIS_TMEMBER__TMEMBER = eINSTANCE.getTClass__HasAParentThisTMember__TMember();

		/**
		 * The meta object literal for the '<em><b>Get Resolved Parent Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___GET_RESOLVED_PARENT_CLASS = eINSTANCE.getTClass__GetResolvedParentClass();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___TO_STRING = eINSTANCE.getTClass__ToString();

		/**
		 * The meta object literal for the '<em><b>Get Parents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___GET_PARENTS = eINSTANCE.getTClass__GetParents();

		/**
		 * The meta object literal for the '<em><b>Has Common Super Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TCLASS___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE = eINSTANCE.getTClass__HasCommonSuperType__TAbstractType();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TFieldImpl <em>TField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TFieldImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTField()
		 * @generated
		 */
		EClass TFIELD = eINSTANCE.getTField();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD__SIGNATURES = eINSTANCE.getTField_Signatures();

		/**
		 * The meta object literal for the '<em><b>Pg</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD__PG = eINSTANCE.getTField_Pg();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TFieldDefinitionImpl <em>TField Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TFieldDefinitionImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTFieldDefinition()
		 * @generated
		 */
		EClass TFIELD_DEFINITION = eINSTANCE.getTFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Hiding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_DEFINITION__HIDING = eINSTANCE.getTFieldDefinition_Hiding();

		/**
		 * The meta object literal for the '<em><b>Hidden By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_DEFINITION__HIDDEN_BY = eINSTANCE.getTFieldDefinition_HiddenBy();

		/**
		 * The meta object literal for the '<em><b>Get Signature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TFIELD_DEFINITION___GET_SIGNATURE = eINSTANCE.getTFieldDefinition__GetSignature();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TFieldSignatureImpl <em>TField Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TFieldSignatureImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTFieldSignature()
		 * @generated
		 */
		EClass TFIELD_SIGNATURE = eINSTANCE.getTFieldSignature();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_SIGNATURE__FIELD = eINSTANCE.getTFieldSignature_Field();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_SIGNATURE__TYPE = eINSTANCE.getTFieldSignature_Type();

		/**
		 * The meta object literal for the '<em><b>Get Signature String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TFIELD_SIGNATURE___GET_SIGNATURE_STRING = eINSTANCE.getTFieldSignature__GetSignatureString();

		/**
		 * The meta object literal for the '<em><b>Get TDefinition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TFIELD_SIGNATURE___GET_TDEFINITION__TABSTRACTTYPE = eINSTANCE.getTFieldSignature__GetTDefinition__TAbstractType();

		/**
		 * The meta object literal for the '<em><b>Get Field Definitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TFIELD_SIGNATURE___GET_FIELD_DEFINITIONS = eINSTANCE.getTFieldSignature__GetFieldDefinitions();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TCallImpl <em>TCall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TCallImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTCall()
		 * @generated
		 */
		EClass TCALL = eINSTANCE.getTCall();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TMemberImpl <em>TMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TMemberImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMember()
		 * @generated
		 */
		EClass TMEMBER = eINSTANCE.getTMember();

		/**
		 * The meta object literal for the '<em><b>Defined By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMEMBER__DEFINED_BY = eINSTANCE.getTMember_DefinedBy();

		/**
		 * The meta object literal for the '<em><b>Accessed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMEMBER__ACCESSED_BY = eINSTANCE.getTMember_AccessedBy();

		/**
		 * The meta object literal for the '<em><b>TAccessing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMEMBER__TACCESSING = eINSTANCE.getTMember_TAccessing();

		/**
		 * The meta object literal for the '<em><b>TModifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMEMBER__TMODIFIER = eINSTANCE.getTMember_TModifier();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMEMBER__SIGNATURE = eINSTANCE.getTMember_Signature();

		/**
		 * The meta object literal for the '<em><b>Get Signature String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TMEMBER___GET_SIGNATURE_STRING = eINSTANCE.getTMember__GetSignatureString();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TMethodImpl <em>TMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TMethodImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMethod()
		 * @generated
		 */
		EClass TMETHOD = eINSTANCE.getTMethod();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD__SIGNATURES = eINSTANCE.getTMethod_Signatures();

		/**
		 * The meta object literal for the '<em><b>Pg</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD__PG = eINSTANCE.getTMethod_Pg();

		/**
		 * The meta object literal for the '<em><b>Get Signature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TMETHOD___GET_SIGNATURE__TABSTRACTTYPE_ELIST = eINSTANCE.getTMethod__GetSignature__TAbstractType_EList();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TMethodDefinitionImpl <em>TMethod Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TMethodDefinitionImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMethodDefinition()
		 * @generated
		 */
		EClass TMETHOD_DEFINITION = eINSTANCE.getTMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Overriding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__OVERRIDING = eINSTANCE.getTMethodDefinition_Overriding();

		/**
		 * The meta object literal for the '<em><b>Overridden By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__OVERRIDDEN_BY = eINSTANCE.getTMethodDefinition_OverriddenBy();

		/**
		 * The meta object literal for the '<em><b>Overloading</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__OVERLOADING = eINSTANCE.getTMethodDefinition_Overloading();

		/**
		 * The meta object literal for the '<em><b>Overloaded By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__OVERLOADED_BY = eINSTANCE.getTMethodDefinition_OverloadedBy();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__RETURN_TYPE = eINSTANCE.getTMethodDefinition_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Syntethic Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__SYNTETHIC_METHODS = eINSTANCE.getTMethodDefinition_SyntethicMethods();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TMETHOD_DEFINITION___TO_STRING = eINSTANCE.getTMethodDefinition__ToString();

		/**
		 * The meta object literal for the '<em><b>Get Signature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TMETHOD_DEFINITION___GET_SIGNATURE = eINSTANCE.getTMethodDefinition__GetSignature();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl <em>TMethod Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TMethodSignatureImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMethodSignature()
		 * @generated
		 */
		EClass TMETHOD_SIGNATURE = eINSTANCE.getTMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_SIGNATURE__METHOD = eINSTANCE.getTMethodSignature_Method();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_SIGNATURE__RETURN_TYPE = eINSTANCE.getTMethodSignature_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_SIGNATURE__PARAMETERS = eINSTANCE.getTMethodSignature_Parameters();

		/**
		 * The meta object literal for the '<em><b>First Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_SIGNATURE__FIRST_PARAMETER = eINSTANCE.getTMethodSignature_FirstParameter();

		/**
		 * The meta object literal for the '<em><b>Get Signature String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TMETHOD_SIGNATURE___GET_SIGNATURE_STRING = eINSTANCE.getTMethodSignature__GetSignatureString();

		/**
		 * The meta object literal for the '<em><b>Get TDefinition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TMETHOD_SIGNATURE___GET_TDEFINITION__TABSTRACTTYPE = eINSTANCE.getTMethodSignature__GetTDefinition__TAbstractType();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TMETHOD_SIGNATURE___TO_STRING = eINSTANCE.getTMethodSignature__ToString();

		/**
		 * The meta object literal for the '<em><b>Is This Signature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TMETHOD_SIGNATURE___IS_THIS_SIGNATURE__TABSTRACTTYPE_ELIST = eINSTANCE.getTMethodSignature__IsThisSignature__TAbstractType_EList();

		/**
		 * The meta object literal for the '<em><b>Get Method Definitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TMETHOD_SIGNATURE___GET_METHOD_DEFINITIONS = eINSTANCE.getTMethodSignature__GetMethodDefinitions();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TPackageImpl <em>TPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TPackageImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTPackage()
		 * @generated
		 */
		EClass TPACKAGE = eINSTANCE.getTPackage();

		/**
		 * The meta object literal for the '<em><b>Pg</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__PG = eINSTANCE.getTPackage_Pg();

		/**
		 * The meta object literal for the '<em><b>Subpackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__SUBPACKAGE = eINSTANCE.getTPackage_Subpackage();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__PARENT = eINSTANCE.getTPackage_Parent();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__CLASSES = eINSTANCE.getTPackage_Classes();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__INTERFACES = eINSTANCE.getTPackage_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Owned Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__OWNED_TYPES = eINSTANCE.getTPackage_OwnedTypes();

		/**
		 * The meta object literal for the '<em><b>Type Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__TYPE_GRAPH = eINSTANCE.getTPackage_TypeGraph();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPACKAGE__TNAME = eINSTANCE.getTPackage_TName();

		/**
		 * The meta object literal for the '<em><b>Get Fully Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TPACKAGE___GET_FULLY_QUALIFIED_NAME = eINSTANCE.getTPackage__GetFullyQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Get All Owned Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TPACKAGE___GET_ALL_OWNED_TYPES = eINSTANCE.getTPackage__GetAllOwnedTypes();

		/**
		 * The meta object literal for the '<em><b>Get All Owned Classes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TPACKAGE___GET_ALL_OWNED_CLASSES = eINSTANCE.getTPackage__GetAllOwnedClasses();

		/**
		 * The meta object literal for the '<em><b>Get Base Package</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TPACKAGE___GET_BASE_PACKAGE = eINSTANCE.getTPackage__GetBasePackage();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TParameterImpl <em>TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TParameterImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTParameter()
		 * @generated
		 */
		EClass TPARAMETER = eINSTANCE.getTParameter();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER__NEXT = eINSTANCE.getTParameter_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER__PREVIOUS = eINSTANCE.getTParameter_Previous();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER__TYPE = eINSTANCE.getTParameter_Type();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.TSignature <em>TSignature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.TSignature
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTSignature()
		 * @generated
		 */
		EClass TSIGNATURE = eINSTANCE.getTSignature();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSIGNATURE__DEFINITIONS = eINSTANCE.getTSignature_Definitions();

		/**
		 * The meta object literal for the '<em><b>Get Signature String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TSIGNATURE___GET_SIGNATURE_STRING = eINSTANCE.getTSignature__GetSignatureString();

		/**
		 * The meta object literal for the '<em><b>Get TDefinition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TSIGNATURE___GET_TDEFINITION__TABSTRACTTYPE = eINSTANCE.getTSignature__GetTDefinition__TAbstractType();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TypeGraphImpl <em>Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TypeGraphImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTypeGraph()
		 * @generated
		 */
		EClass TYPE_GRAPH = eINSTANCE.getTypeGraph();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__PACKAGES = eINSTANCE.getTypeGraph_Packages();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__METHODS = eINSTANCE.getTypeGraph_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__FIELDS = eINSTANCE.getTypeGraph_Fields();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__CLASSES = eINSTANCE.getTypeGraph_Classes();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__INTERFACES = eINSTANCE.getTypeGraph_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Owned Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__OWNED_TYPES = eINSTANCE.getTypeGraph_OwnedTypes();

		/**
		 * The meta object literal for the '<em><b>TAnnotation Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__TANNOTATION_TYPES = eINSTANCE.getTypeGraph_TAnnotationTypes();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_GRAPH__TNAME = eINSTANCE.getTypeGraph_TName();

		/**
		 * The meta object literal for the '<em><b>Get Declared TClasses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_GRAPH___GET_DECLARED_TCLASSES = eINSTANCE.getTypeGraph__GetDeclaredTClasses();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_GRAPH___TO_STRING = eINSTANCE.getTypeGraph__ToString();

		/**
		 * The meta object literal for the '<em><b>Get Package</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_GRAPH___GET_PACKAGE__STRING = eINSTANCE.getTypeGraph__GetPackage__String();

		/**
		 * The meta object literal for the '<em><b>Get Package</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_GRAPH___GET_PACKAGE__ELIST = eINSTANCE.getTypeGraph__GetPackage__EList();

		/**
		 * The meta object literal for the '<em><b>Get Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_GRAPH___GET_CLASS__STRING = eINSTANCE.getTypeGraph__GetClass__String();

		/**
		 * The meta object literal for the '<em><b>Get Interface</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_GRAPH___GET_INTERFACE__STRING = eINSTANCE.getTypeGraph__GetInterface__String();

		/**
		 * The meta object literal for the '<em><b>Get Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_GRAPH___GET_METHOD__STRING = eINSTANCE.getTypeGraph__GetMethod__String();

		/**
		 * The meta object literal for the '<em><b>Get Field</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_GRAPH___GET_FIELD__STRING = eINSTANCE.getTypeGraph__GetField__String();

		/**
		 * The meta object literal for the '<em><b>Get Signature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_GRAPH___GET_SIGNATURE__STRING = eINSTANCE.getTypeGraph__GetSignature__String();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TInterfaceImpl <em>TInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TInterfaceImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTInterface()
		 * @generated
		 */
		EClass TINTERFACE = eINSTANCE.getTInterface();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINTERFACE__IMPLEMENTED_BY = eINSTANCE.getTInterface_ImplementedBy();

		/**
		 * The meta object literal for the '<em><b>Parent Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINTERFACE__PARENT_INTERFACES = eINSTANCE.getTInterface_ParentInterfaces();

		/**
		 * The meta object literal for the '<em><b>Child Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINTERFACE__CHILD_INTERFACES = eINSTANCE.getTInterface_ChildInterfaces();

		/**
		 * The meta object literal for the '<em><b>Is Sub Type Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TINTERFACE___IS_SUB_TYPE_OF__TABSTRACTTYPE = eINSTANCE.getTInterface__IsSubTypeOf__TAbstractType();

		/**
		 * The meta object literal for the '<em><b>Is Super Type Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TINTERFACE___IS_SUPER_TYPE_OF__TABSTRACTTYPE = eINSTANCE.getTInterface__IsSuperTypeOf__TAbstractType();

		/**
		 * The meta object literal for the '<em><b>Has Common Super Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TINTERFACE___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE = eINSTANCE.getTInterface__HasCommonSuperType__TAbstractType();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl <em>TAbstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TAbstractTypeImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAbstractType()
		 * @generated
		 */
		EClass TABSTRACT_TYPE = eINSTANCE.getTAbstractType();

		/**
		 * The meta object literal for the '<em><b>Pg</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_TYPE__PG = eINSTANCE.getTAbstractType_Pg();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_TYPE__PACKAGE = eINSTANCE.getTAbstractType_Package();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_TYPE__SIGNATURE = eINSTANCE.getTAbstractType_Signature();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_TYPE__DEFINES = eINSTANCE.getTAbstractType_Defines();

		/**
		 * The meta object literal for the '<em><b>TLib</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABSTRACT_TYPE__TLIB = eINSTANCE.getTAbstractType_TLib();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABSTRACT_TYPE__TNAME = eINSTANCE.getTAbstractType_TName();

		/**
		 * The meta object literal for the '<em><b>TModifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_TYPE__TMODIFIER = eINSTANCE.getTAbstractType_TModifier();

		/**
		 * The meta object literal for the '<em><b>Inner Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_TYPE__INNER_TYPES = eINSTANCE.getTAbstractType_InnerTypes();

		/**
		 * The meta object literal for the '<em><b>Outer Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_TYPE__OUTER_TYPE = eINSTANCE.getTAbstractType_OuterType();

		/**
		 * The meta object literal for the '<em><b>Is Super Type Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___IS_SUPER_TYPE_OF__TABSTRACTTYPE = eINSTANCE.getTAbstractType__IsSuperTypeOf__TAbstractType();

		/**
		 * The meta object literal for the '<em><b>Is Sub Type Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___IS_SUB_TYPE_OF__TABSTRACTTYPE = eINSTANCE.getTAbstractType__IsSubTypeOf__TAbstractType();

		/**
		 * The meta object literal for the '<em><b>Is Declared</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___IS_DECLARED = eINSTANCE.getTAbstractType__IsDeclared();

		/**
		 * The meta object literal for the '<em><b>Get Fully Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___GET_FULLY_QUALIFIED_NAME = eINSTANCE.getTAbstractType__GetFullyQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Get TMethod Signature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___GET_TMETHOD_SIGNATURE__STRING = eINSTANCE.getTAbstractType__GetTMethodSignature__String();

		/**
		 * The meta object literal for the '<em><b>Get TMethod Definition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___GET_TMETHOD_DEFINITION__STRING = eINSTANCE.getTAbstractType__GetTMethodDefinition__String();

		/**
		 * The meta object literal for the '<em><b>Get Base Package</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___GET_BASE_PACKAGE = eINSTANCE.getTAbstractType__GetBasePackage();

		/**
		 * The meta object literal for the '<em><b>Get TDefinition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___GET_TDEFINITION__TSIGNATURE = eINSTANCE.getTAbstractType__GetTDefinition__TSignature();

		/**
		 * The meta object literal for the '<em><b>Get TDefinition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___GET_TDEFINITION__STRING = eINSTANCE.getTAbstractType__GetTDefinition__String();

		/**
		 * The meta object literal for the '<em><b>Has TMember</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___HAS_TMEMBER__TMEMBER = eINSTANCE.getTAbstractType__HasTMember__TMember();

		/**
		 * The meta object literal for the '<em><b>Has Common Super Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE = eINSTANCE.getTAbstractType__HasCommonSuperType__TAbstractType();

		/**
		 * The meta object literal for the '<em><b>Fill Same Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___FILL_SAME_TYPE__ELIST = eINSTANCE.getTAbstractType__FillSameType__EList();

		/**
		 * The meta object literal for the '<em><b>Is Inner Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___IS_INNER_TYPE__TABSTRACTTYPE = eINSTANCE.getTAbstractType__IsInnerType__TAbstractType();

		/**
		 * The meta object literal for the '<em><b>Get Real Package</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABSTRACT_TYPE___GET_REAL_PACKAGE__TABSTRACTTYPE = eINSTANCE.getTAbstractType__GetRealPackage__TAbstractType();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TReadImpl <em>TRead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TReadImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTRead()
		 * @generated
		 */
		EClass TREAD = eINSTANCE.getTRead();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TWriteImpl <em>TWrite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TWriteImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTWrite()
		 * @generated
		 */
		EClass TWRITE = eINSTANCE.getTWrite();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TModifierImpl <em>TModifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TModifierImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTModifier()
		 * @generated
		 */
		EClass TMODIFIER = eINSTANCE.getTModifier();

		/**
		 * The meta object literal for the '<em><b>TVisibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMODIFIER__TVISIBILITY = eINSTANCE.getTModifier_TVisibility();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMODIFIER__IS_STATIC = eINSTANCE.getTModifier_IsStatic();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TSyntethicMethodImpl <em>TSyntethic Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TSyntethicMethodImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTSyntethicMethod()
		 * @generated
		 */
		EClass TSYNTETHIC_METHOD = eINSTANCE.getTSyntethicMethod();

		/**
		 * The meta object literal for the '<em><b>Original Method Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION = eINSTANCE.getTSyntethicMethod_OriginalMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Get Signature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TSYNTETHIC_METHOD___GET_SIGNATURE = eINSTANCE.getTSyntethicMethod__GetSignature();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TUnresolvedTypeImpl <em>TUnresolved Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TUnresolvedTypeImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTUnresolvedType()
		 * @generated
		 */
		EClass TUNRESOLVED_TYPE = eINSTANCE.getTUnresolvedType();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TNameImpl <em>TName</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TNameImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTName()
		 * @generated
		 */
		EClass TNAME = eINSTANCE.getTName();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNAME__TNAME = eINSTANCE.getTName_TName();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TFlowImpl <em>TFlow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TFlowImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTFlow()
		 * @generated
		 */
		EClass TFLOW = eINSTANCE.getTFlow();

		/**
		 * The meta object literal for the '<em><b>Flow Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFLOW__FLOW_OWNER = eINSTANCE.getTFlow_FlowOwner();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TAbstractFlowElementImpl <em>TAbstract Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TAbstractFlowElementImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAbstractFlowElement()
		 * @generated
		 */
		EClass TABSTRACT_FLOW_ELEMENT = eINSTANCE.getTAbstractFlowElement();

		/**
		 * The meta object literal for the '<em><b>Owned Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS = eINSTANCE.getTAbstractFlowElement_OwnedFlows();

		/**
		 * The meta object literal for the '<em><b>Incoming Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS = eINSTANCE.getTAbstractFlowElement_IncomingFlows();

		/**
		 * The meta object literal for the '<em><b>Outgoing Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS = eINSTANCE.getTAbstractFlowElement_OutgoingFlows();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TReadWriteImpl <em>TRead Write</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TReadWriteImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTReadWrite()
		 * @generated
		 */
		EClass TREAD_WRITE = eINSTANCE.getTReadWrite();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TConstructorImpl <em>TConstructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TConstructorImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTConstructor()
		 * @generated
		 */
		EClass TCONSTRUCTOR = eINSTANCE.getTConstructor();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TEnumImpl <em>TEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TEnumImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTEnum()
		 * @generated
		 */
		EClass TENUM = eINSTANCE.getTEnum();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.TVisibility <em>TVisibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.TVisibility
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTVisibility()
		 * @generated
		 */
		EEnum TVISIBILITY = eINSTANCE.getTVisibility();

	}

} //BasicPackage
