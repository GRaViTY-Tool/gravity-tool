/**
 */
package org.gravity.typegraph.basic.containers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.gravity.typegraph.basic.annotations.AnnotationsPackage;

import org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl;

import org.gravity.typegraph.basic.containers.ContainersFactory;
import org.gravity.typegraph.basic.containers.ContainersPackage;
import org.gravity.typegraph.basic.containers.TAccessContainer;
import org.gravity.typegraph.basic.containers.TClassContainer;
import org.gravity.typegraph.basic.containers.TFieldContainer;
import org.gravity.typegraph.basic.containers.TFieldDefinitionContainer;
import org.gravity.typegraph.basic.containers.TFieldSignatureContainer;
import org.gravity.typegraph.basic.containers.TMemberContainer;
import org.gravity.typegraph.basic.containers.TMethodDefinitionContainer;
import org.gravity.typegraph.basic.containers.TSignatureContainer;
import org.gravity.typegraph.basic.containers.TTypeContainer;

import org.gravity.typegraph.basic.impl.BasicPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainersPackageImpl extends EPackageImpl implements ContainersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTypeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAccessContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMemberContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tClassContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFieldContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFieldDefinitionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFieldSignatureContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSignatureContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMethodDefinitionContainerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gravity.typegraph.basic.containers.ContainersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContainersPackageImpl() {
		super(eNS_URI, ContainersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ContainersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContainersPackage init() {
		if (isInited) return (ContainersPackage)EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContainersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContainersPackageImpl theContainersPackage = registeredContainersPackage instanceof ContainersPackageImpl ? (ContainersPackageImpl)registeredContainersPackage : new ContainersPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(registeredPackage instanceof BasicPackageImpl ? registeredPackage : BasicPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl)(registeredPackage instanceof AnnotationsPackageImpl ? registeredPackage : AnnotationsPackage.eINSTANCE);

		// Create package meta-data objects
		theContainersPackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();

		// Initialize created meta-data
		theContainersPackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContainersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContainersPackage.eNS_URI, theContainersPackage);
		return theContainersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTypeContainer() {
		return tTypeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTypeContainer_TAbstractTypes() {
		return (EReference)tTypeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAccessContainer() {
		return tAccessContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAccessContainer_TAccessEdges() {
		return (EReference)tAccessContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTMemberContainer() {
		return tMemberContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMemberContainer_TMembers() {
		return (EReference)tMemberContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTClassContainer() {
		return tClassContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTClassContainer_TClass() {
		return (EReference)tClassContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFieldContainer() {
		return tFieldContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFieldContainer_TFields() {
		return (EReference)tFieldContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFieldDefinitionContainer() {
		return tFieldDefinitionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFieldDefinitionContainer_TFieldDefinitions() {
		return (EReference)tFieldDefinitionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFieldSignatureContainer() {
		return tFieldSignatureContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFieldSignatureContainer_TFieldSignatures() {
		return (EReference)tFieldSignatureContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSignatureContainer() {
		return tSignatureContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSignatureContainer_TSignatures() {
		return (EReference)tSignatureContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTMethodDefinitionContainer() {
		return tMethodDefinitionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethodDefinitionContainer_TMethodDefinitions() {
		return (EReference)tMethodDefinitionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainersFactory getContainersFactory() {
		return (ContainersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tTypeContainerEClass = createEClass(TTYPE_CONTAINER);
		createEReference(tTypeContainerEClass, TTYPE_CONTAINER__TABSTRACT_TYPES);

		tAccessContainerEClass = createEClass(TACCESS_CONTAINER);
		createEReference(tAccessContainerEClass, TACCESS_CONTAINER__TACCESS_EDGES);

		tMemberContainerEClass = createEClass(TMEMBER_CONTAINER);
		createEReference(tMemberContainerEClass, TMEMBER_CONTAINER__TMEMBERS);

		tClassContainerEClass = createEClass(TCLASS_CONTAINER);
		createEReference(tClassContainerEClass, TCLASS_CONTAINER__TCLASS);

		tFieldContainerEClass = createEClass(TFIELD_CONTAINER);
		createEReference(tFieldContainerEClass, TFIELD_CONTAINER__TFIELDS);

		tFieldDefinitionContainerEClass = createEClass(TFIELD_DEFINITION_CONTAINER);
		createEReference(tFieldDefinitionContainerEClass, TFIELD_DEFINITION_CONTAINER__TFIELD_DEFINITIONS);

		tFieldSignatureContainerEClass = createEClass(TFIELD_SIGNATURE_CONTAINER);
		createEReference(tFieldSignatureContainerEClass, TFIELD_SIGNATURE_CONTAINER__TFIELD_SIGNATURES);

		tSignatureContainerEClass = createEClass(TSIGNATURE_CONTAINER);
		createEReference(tSignatureContainerEClass, TSIGNATURE_CONTAINER__TSIGNATURES);

		tMethodDefinitionContainerEClass = createEClass(TMETHOD_DEFINITION_CONTAINER);
		createEReference(tMethodDefinitionContainerEClass, TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tTypeContainerEClass, TTypeContainer.class, "TTypeContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTTypeContainer_TAbstractTypes(), theBasicPackage.getTAbstractType(), null, "tAbstractTypes", null, 0, -1, TTypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tAccessContainerEClass, TAccessContainer.class, "TAccessContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAccessContainer_TAccessEdges(), theBasicPackage.getTAccess(), null, "tAccessEdges", null, 0, -1, TAccessContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tMemberContainerEClass, TMemberContainer.class, "TMemberContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMemberContainer_TMembers(), theBasicPackage.getTMember(), null, "tMembers", null, 0, -1, TMemberContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tClassContainerEClass, TClassContainer.class, "TClassContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTClassContainer_TClass(), theBasicPackage.getTClass(), null, "tClass", null, 0, -1, TClassContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tFieldContainerEClass, TFieldContainer.class, "TFieldContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFieldContainer_TFields(), theBasicPackage.getTField(), null, "tFields", null, 0, -1, TFieldContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tFieldDefinitionContainerEClass, TFieldDefinitionContainer.class, "TFieldDefinitionContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFieldDefinitionContainer_TFieldDefinitions(), theBasicPackage.getTFieldDefinition(), null, "tFieldDefinitions", null, 0, -1, TFieldDefinitionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tFieldSignatureContainerEClass, TFieldSignatureContainer.class, "TFieldSignatureContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFieldSignatureContainer_TFieldSignatures(), theBasicPackage.getTFieldSignature(), null, "tFieldSignatures", null, 0, -1, TFieldSignatureContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tSignatureContainerEClass, TSignatureContainer.class, "TSignatureContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTSignatureContainer_TSignatures(), theBasicPackage.getTSignature(), null, "tSignatures", null, 0, -1, TSignatureContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tMethodDefinitionContainerEClass, TMethodDefinitionContainer.class, "TMethodDefinitionContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMethodDefinitionContainer_TMethodDefinitions(), theBasicPackage.getTMethodDefinition(), null, "tMethodDefinitions", null, 0, -1, TMethodDefinitionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContainersPackageImpl
