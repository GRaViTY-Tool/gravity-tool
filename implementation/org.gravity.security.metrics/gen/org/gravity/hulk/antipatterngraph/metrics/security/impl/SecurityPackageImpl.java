/**
 */
package org.gravity.hulk.antipatterngraph.metrics.security.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.antipatterngraph.metrics.security.CriticalClassRatio;
import org.gravity.hulk.antipatterngraph.metrics.security.SecurityFactory;
import org.gravity.hulk.antipatterngraph.metrics.security.SecurityPackage;

import org.gravity.typegraph.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPackageImpl extends EPackageImpl implements SecurityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criticalClassRatioEClass = null;

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
	 * @see org.gravity.hulk.antipatterngraph.metrics.security.SecurityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityPackageImpl() {
		super(eNS_URI, SecurityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SecurityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityPackage init() {
		if (isInited) return (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSecurityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SecurityPackageImpl theSecurityPackage = registeredSecurityPackage instanceof SecurityPackageImpl ? (SecurityPackageImpl)registeredSecurityPackage : new SecurityPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AntipatterngraphPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSecurityPackage.createPackageContents();

		// Initialize created meta-data
		theSecurityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecurityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityPackage.eNS_URI, theSecurityPackage);
		return theSecurityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCriticalClassRatio() {
		return criticalClassRatioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityFactory getSecurityFactory() {
		return (SecurityFactory)getEFactoryInstance();
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
		criticalClassRatioEClass = createEClass(CRITICAL_CLASS_RATIO);
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
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage)EPackage.Registry.INSTANCE.getEPackage(AntipatterngraphPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		criticalClassRatioEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());

		// Initialize classes, features, and operations; add parameters
		initEClass(criticalClassRatioEClass, CriticalClassRatio.class, "CriticalClassRatio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SecurityPackageImpl
