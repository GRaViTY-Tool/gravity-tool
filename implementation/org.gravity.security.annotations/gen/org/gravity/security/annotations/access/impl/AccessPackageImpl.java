/**
 */
package org.gravity.security.annotations.access.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.security.annotations.AnnotationsPackage;

import org.gravity.security.annotations.access.AccessFactory;
import org.gravity.security.annotations.access.AccessPackage;
import org.gravity.security.annotations.access.TApi;

import org.gravity.security.annotations.actions.ActionsPackage;

import org.gravity.security.annotations.actions.impl.ActionsPackageImpl;

import org.gravity.security.annotations.impl.AnnotationsPackageImpl;

import org.gravity.security.annotations.requirements.RequirementsPackage;

import org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessPackageImpl extends EPackageImpl implements AccessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tApiEClass = null;

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
	 * @see org.gravity.security.annotations.access.AccessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccessPackageImpl() {
		super(eNS_URI, AccessFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AccessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccessPackage init() {
		if (isInited)
			return (AccessPackage) EPackage.Registry.INSTANCE.getEPackage(AccessPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAccessPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AccessPackageImpl theAccessPackage = registeredAccessPackage instanceof AccessPackageImpl
				? (AccessPackageImpl) registeredAccessPackage
				: new AccessPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl) (registeredPackage instanceof AnnotationsPackageImpl
				? registeredPackage
				: AnnotationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl) (registeredPackage instanceof RequirementsPackageImpl
				? registeredPackage
				: RequirementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl) (registeredPackage instanceof ActionsPackageImpl
				? registeredPackage
				: ActionsPackage.eINSTANCE);

		// Create package meta-data objects
		theAccessPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theActionsPackage.createPackageContents();

		// Initialize created meta-data
		theAccessPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccessPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccessPackage.eNS_URI, theAccessPackage);
		return theAccessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTApi() {
		return tApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessFactory getAccessFactory() {
		return (AccessFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		tApiEClass = createEClass(TAPI);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		org.gravity.typegraph.basic.annotations.AnnotationsPackage theAnnotationsPackage_1 = (org.gravity.typegraph.basic.annotations.AnnotationsPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tApiEClass.getESuperTypes().add(theAnnotationsPackage_1.getTAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(tApiEClass, TApi.class, "TApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //AccessPackageImpl
