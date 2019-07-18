/**
 */
package org.gravity.typegraph.basic.containers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.gravity.typegraph.basic.containers.ContainersFactory
 * @model kind="package"
 * @generated
 */
public interface ContainersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "containers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gravity-tool.org/typegraph/basic#//containers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "containers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContainersPackage eINSTANCE = org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.containers.impl.TTypeContainerImpl <em>TType Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.containers.impl.TTypeContainerImpl
	 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTTypeContainer()
	 * @generated
	 */
	int TTYPE_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>TAbstract Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_CONTAINER__TABSTRACT_TYPES = 0;

	/**
	 * The number of structural features of the '<em>TType Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TType Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.containers.impl.TAccessContainerImpl <em>TAccess Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.containers.impl.TAccessContainerImpl
	 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTAccessContainer()
	 * @generated
	 */
	int TACCESS_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>TAccess Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_CONTAINER__TACCESS_EDGES = 0;

	/**
	 * The number of structural features of the '<em>TAccess Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TAccess Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.containers.impl.TMemberContainerImpl <em>TMember Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.containers.impl.TMemberContainerImpl
	 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTMemberContainer()
	 * @generated
	 */
	int TMEMBER_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>TMembers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER_CONTAINER__TMEMBERS = 0;

	/**
	 * The number of structural features of the '<em>TMember Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMember Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.containers.impl.TClassContainerImpl <em>TClass Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.containers.impl.TClassContainerImpl
	 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTClassContainer()
	 * @generated
	 */
	int TCLASS_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>TClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_CONTAINER__TCLASS = 0;

	/**
	 * The number of structural features of the '<em>TClass Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TClass Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.containers.impl.TFieldContainerImpl <em>TField Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.containers.impl.TFieldContainerImpl
	 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTFieldContainer()
	 * @generated
	 */
	int TFIELD_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>TFields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_CONTAINER__TFIELDS = 0;

	/**
	 * The number of structural features of the '<em>TField Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TField Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.containers.impl.TFieldDefinitionContainerImpl <em>TField Definition Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.containers.impl.TFieldDefinitionContainerImpl
	 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTFieldDefinitionContainer()
	 * @generated
	 */
	int TFIELD_DEFINITION_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>TField Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION_CONTAINER__TFIELD_DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>TField Definition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TField Definition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.containers.impl.TFieldSignatureContainerImpl <em>TField Signature Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.containers.impl.TFieldSignatureContainerImpl
	 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTFieldSignatureContainer()
	 * @generated
	 */
	int TFIELD_SIGNATURE_CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>TField Signatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE_CONTAINER__TFIELD_SIGNATURES = 0;

	/**
	 * The number of structural features of the '<em>TField Signature Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TField Signature Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.containers.impl.TSignatureContainerImpl <em>TSignature Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.containers.impl.TSignatureContainerImpl
	 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTSignatureContainer()
	 * @generated
	 */
	int TSIGNATURE_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>TSignatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE_CONTAINER__TSIGNATURES = 0;

	/**
	 * The number of structural features of the '<em>TSignature Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TSignature Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.containers.impl.TMethodDefinitionContainerImpl <em>TMethod Definition Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.containers.impl.TMethodDefinitionContainerImpl
	 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTMethodDefinitionContainer()
	 * @generated
	 */
	int TMETHOD_DEFINITION_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>TMethod Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>TMethod Definition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMethod Definition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.containers.TTypeContainer <em>TType Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TType Container</em>'.
	 * @see org.gravity.typegraph.basic.containers.TTypeContainer
	 * @generated
	 */
	EClass getTTypeContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.containers.TTypeContainer#getTAbstractTypes <em>TAbstract Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TAbstract Types</em>'.
	 * @see org.gravity.typegraph.basic.containers.TTypeContainer#getTAbstractTypes()
	 * @see #getTTypeContainer()
	 * @generated
	 */
	EReference getTTypeContainer_TAbstractTypes();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.containers.TAccessContainer <em>TAccess Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAccess Container</em>'.
	 * @see org.gravity.typegraph.basic.containers.TAccessContainer
	 * @generated
	 */
	EClass getTAccessContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.containers.TAccessContainer#getTAccessEdges <em>TAccess Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TAccess Edges</em>'.
	 * @see org.gravity.typegraph.basic.containers.TAccessContainer#getTAccessEdges()
	 * @see #getTAccessContainer()
	 * @generated
	 */
	EReference getTAccessContainer_TAccessEdges();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.containers.TMemberContainer <em>TMember Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMember Container</em>'.
	 * @see org.gravity.typegraph.basic.containers.TMemberContainer
	 * @generated
	 */
	EClass getTMemberContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.containers.TMemberContainer#getTMembers <em>TMembers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TMembers</em>'.
	 * @see org.gravity.typegraph.basic.containers.TMemberContainer#getTMembers()
	 * @see #getTMemberContainer()
	 * @generated
	 */
	EReference getTMemberContainer_TMembers();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.containers.TClassContainer <em>TClass Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TClass Container</em>'.
	 * @see org.gravity.typegraph.basic.containers.TClassContainer
	 * @generated
	 */
	EClass getTClassContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.containers.TClassContainer#getTClass <em>TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TClass</em>'.
	 * @see org.gravity.typegraph.basic.containers.TClassContainer#getTClass()
	 * @see #getTClassContainer()
	 * @generated
	 */
	EReference getTClassContainer_TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.containers.TFieldContainer <em>TField Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TField Container</em>'.
	 * @see org.gravity.typegraph.basic.containers.TFieldContainer
	 * @generated
	 */
	EClass getTFieldContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.containers.TFieldContainer#getTFields <em>TFields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TFields</em>'.
	 * @see org.gravity.typegraph.basic.containers.TFieldContainer#getTFields()
	 * @see #getTFieldContainer()
	 * @generated
	 */
	EReference getTFieldContainer_TFields();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.containers.TFieldDefinitionContainer <em>TField Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TField Definition Container</em>'.
	 * @see org.gravity.typegraph.basic.containers.TFieldDefinitionContainer
	 * @generated
	 */
	EClass getTFieldDefinitionContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.containers.TFieldDefinitionContainer#getTFieldDefinitions <em>TField Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TField Definitions</em>'.
	 * @see org.gravity.typegraph.basic.containers.TFieldDefinitionContainer#getTFieldDefinitions()
	 * @see #getTFieldDefinitionContainer()
	 * @generated
	 */
	EReference getTFieldDefinitionContainer_TFieldDefinitions();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.containers.TFieldSignatureContainer <em>TField Signature Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TField Signature Container</em>'.
	 * @see org.gravity.typegraph.basic.containers.TFieldSignatureContainer
	 * @generated
	 */
	EClass getTFieldSignatureContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.containers.TFieldSignatureContainer#getTFieldSignatures <em>TField Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TField Signatures</em>'.
	 * @see org.gravity.typegraph.basic.containers.TFieldSignatureContainer#getTFieldSignatures()
	 * @see #getTFieldSignatureContainer()
	 * @generated
	 */
	EReference getTFieldSignatureContainer_TFieldSignatures();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.containers.TSignatureContainer <em>TSignature Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSignature Container</em>'.
	 * @see org.gravity.typegraph.basic.containers.TSignatureContainer
	 * @generated
	 */
	EClass getTSignatureContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.containers.TSignatureContainer#getTSignatures <em>TSignatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TSignatures</em>'.
	 * @see org.gravity.typegraph.basic.containers.TSignatureContainer#getTSignatures()
	 * @see #getTSignatureContainer()
	 * @generated
	 */
	EReference getTSignatureContainer_TSignatures();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.containers.TMethodDefinitionContainer <em>TMethod Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMethod Definition Container</em>'.
	 * @see org.gravity.typegraph.basic.containers.TMethodDefinitionContainer
	 * @generated
	 */
	EClass getTMethodDefinitionContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.containers.TMethodDefinitionContainer#getTMethodDefinitions <em>TMethod Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TMethod Definitions</em>'.
	 * @see org.gravity.typegraph.basic.containers.TMethodDefinitionContainer#getTMethodDefinitions()
	 * @see #getTMethodDefinitionContainer()
	 * @generated
	 */
	EReference getTMethodDefinitionContainer_TMethodDefinitions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContainersFactory getContainersFactory();

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
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.containers.impl.TTypeContainerImpl <em>TType Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.containers.impl.TTypeContainerImpl
		 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTTypeContainer()
		 * @generated
		 */
		EClass TTYPE_CONTAINER = eINSTANCE.getTTypeContainer();

		/**
		 * The meta object literal for the '<em><b>TAbstract Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTYPE_CONTAINER__TABSTRACT_TYPES = eINSTANCE.getTTypeContainer_TAbstractTypes();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.containers.impl.TAccessContainerImpl <em>TAccess Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.containers.impl.TAccessContainerImpl
		 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTAccessContainer()
		 * @generated
		 */
		EClass TACCESS_CONTAINER = eINSTANCE.getTAccessContainer();

		/**
		 * The meta object literal for the '<em><b>TAccess Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TACCESS_CONTAINER__TACCESS_EDGES = eINSTANCE.getTAccessContainer_TAccessEdges();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.containers.impl.TMemberContainerImpl <em>TMember Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.containers.impl.TMemberContainerImpl
		 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTMemberContainer()
		 * @generated
		 */
		EClass TMEMBER_CONTAINER = eINSTANCE.getTMemberContainer();

		/**
		 * The meta object literal for the '<em><b>TMembers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMEMBER_CONTAINER__TMEMBERS = eINSTANCE.getTMemberContainer_TMembers();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.containers.impl.TClassContainerImpl <em>TClass Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.containers.impl.TClassContainerImpl
		 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTClassContainer()
		 * @generated
		 */
		EClass TCLASS_CONTAINER = eINSTANCE.getTClassContainer();

		/**
		 * The meta object literal for the '<em><b>TClass</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS_CONTAINER__TCLASS = eINSTANCE.getTClassContainer_TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.containers.impl.TFieldContainerImpl <em>TField Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.containers.impl.TFieldContainerImpl
		 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTFieldContainer()
		 * @generated
		 */
		EClass TFIELD_CONTAINER = eINSTANCE.getTFieldContainer();

		/**
		 * The meta object literal for the '<em><b>TFields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_CONTAINER__TFIELDS = eINSTANCE.getTFieldContainer_TFields();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.containers.impl.TFieldDefinitionContainerImpl <em>TField Definition Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.containers.impl.TFieldDefinitionContainerImpl
		 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTFieldDefinitionContainer()
		 * @generated
		 */
		EClass TFIELD_DEFINITION_CONTAINER = eINSTANCE.getTFieldDefinitionContainer();

		/**
		 * The meta object literal for the '<em><b>TField Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_DEFINITION_CONTAINER__TFIELD_DEFINITIONS = eINSTANCE.getTFieldDefinitionContainer_TFieldDefinitions();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.containers.impl.TFieldSignatureContainerImpl <em>TField Signature Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.containers.impl.TFieldSignatureContainerImpl
		 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTFieldSignatureContainer()
		 * @generated
		 */
		EClass TFIELD_SIGNATURE_CONTAINER = eINSTANCE.getTFieldSignatureContainer();

		/**
		 * The meta object literal for the '<em><b>TField Signatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_SIGNATURE_CONTAINER__TFIELD_SIGNATURES = eINSTANCE.getTFieldSignatureContainer_TFieldSignatures();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.containers.impl.TSignatureContainerImpl <em>TSignature Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.containers.impl.TSignatureContainerImpl
		 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTSignatureContainer()
		 * @generated
		 */
		EClass TSIGNATURE_CONTAINER = eINSTANCE.getTSignatureContainer();

		/**
		 * The meta object literal for the '<em><b>TSignatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSIGNATURE_CONTAINER__TSIGNATURES = eINSTANCE.getTSignatureContainer_TSignatures();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.containers.impl.TMethodDefinitionContainerImpl <em>TMethod Definition Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.containers.impl.TMethodDefinitionContainerImpl
		 * @see org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl#getTMethodDefinitionContainer()
		 * @generated
		 */
		EClass TMETHOD_DEFINITION_CONTAINER = eINSTANCE.getTMethodDefinitionContainer();

		/**
		 * The meta object literal for the '<em><b>TMethod Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITIONS = eINSTANCE.getTMethodDefinitionContainer_TMethodDefinitions();

	}

} //ContainersPackage
