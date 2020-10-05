/**
 */
package org.gravity.typegraph.spl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.gravity.typegraph.basic.annotations.AnnotationsPackage;

import org.gravity.typegraph.spl.SplFactory;
import org.gravity.typegraph.spl.SplPackage;
import org.gravity.typegraph.spl.TPresenceCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SplPackageImpl extends EPackageImpl implements SplPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPresenceConditionEClass = null;

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
	 * @see org.gravity.typegraph.spl.SplPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SplPackageImpl() {
		super(eNS_URI, SplFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SplPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SplPackage init() {
		if (isInited) return (SplPackage)EPackage.Registry.INSTANCE.getEPackage(SplPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSplPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SplPackageImpl theSplPackage = registeredSplPackage instanceof SplPackageImpl ? (SplPackageImpl)registeredSplPackage : new SplPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSplPackage.createPackageContents();

		// Initialize created meta-data
		theSplPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSplPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SplPackage.eNS_URI, theSplPackage);
		return theSplPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPresenceCondition() {
		return tPresenceConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPresenceCondition_Pc() {
		return (EAttribute)tPresenceConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplFactory getSplFactory() {
		return (SplFactory)getEFactoryInstance();
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
		tPresenceConditionEClass = createEClass(TPRESENCE_CONDITION);
		createEAttribute(tPresenceConditionEClass, TPRESENCE_CONDITION__PC);
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
		AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tPresenceConditionEClass.getESuperTypes().add(theAnnotationsPackage.getTAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(tPresenceConditionEClass, TPresenceCondition.class, "TPresenceCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTPresenceCondition_Pc(), ecorePackage.getEString(), "pc", null, 0, 1, TPresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SplPackageImpl
