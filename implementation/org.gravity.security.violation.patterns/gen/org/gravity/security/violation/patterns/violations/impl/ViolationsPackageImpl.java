/**
 */
package org.gravity.security.violation.patterns.violations.impl;

import carisma.profile.umlsec.UmlsecPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.security.violation.patterns.violations.SecureDependencyViolation;
import org.gravity.security.violation.patterns.violations.ViolationsFactory;
import org.gravity.security.violation.patterns.violations.ViolationsPackage;

import org.gravity.typegraph.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViolationsPackageImpl extends EPackageImpl implements ViolationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secureDependencyViolationEClass = null;

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
	 * @see org.gravity.security.violation.patterns.violations.ViolationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViolationsPackageImpl() {
		super(eNS_URI, ViolationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ViolationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViolationsPackage init() {
		if (isInited) return (ViolationsPackage)EPackage.Registry.INSTANCE.getEPackage(ViolationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredViolationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ViolationsPackageImpl theViolationsPackage = registeredViolationsPackage instanceof ViolationsPackageImpl ? (ViolationsPackageImpl)registeredViolationsPackage : new ViolationsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AntipatterngraphPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		UmlsecPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theViolationsPackage.createPackageContents();

		// Initialize created meta-data
		theViolationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViolationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViolationsPackage.eNS_URI, theViolationsPackage);
		return theViolationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecureDependencyViolation() {
		return secureDependencyViolationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecureDependencyViolation_Source() {
		return (EReference)secureDependencyViolationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecureDependencyViolation_Target() {
		return (EReference)secureDependencyViolationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecureDependencyViolation_Requirement() {
		return (EReference)secureDependencyViolationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViolationsFactory getViolationsFactory() {
		return (ViolationsFactory)getEFactoryInstance();
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
		secureDependencyViolationEClass = createEClass(SECURE_DEPENDENCY_VIOLATION);
		createEReference(secureDependencyViolationEClass, SECURE_DEPENDENCY_VIOLATION__SOURCE);
		createEReference(secureDependencyViolationEClass, SECURE_DEPENDENCY_VIOLATION__TARGET);
		createEReference(secureDependencyViolationEClass, SECURE_DEPENDENCY_VIOLATION__REQUIREMENT);
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
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		UmlsecPackage theUmlsecPackage = (UmlsecPackage)EPackage.Registry.INSTANCE.getEPackage(UmlsecPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		secureDependencyViolationEClass.getESuperTypes().add(theAntipatterngraphPackage.getHAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(secureDependencyViolationEClass, SecureDependencyViolation.class, "SecureDependencyViolation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecureDependencyViolation_Source(), theBasicPackage.getTMember(), null, "source", null, 0, 1, SecureDependencyViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecureDependencyViolation_Target(), theBasicPackage.getTMember(), null, "target", null, 0, 1, SecureDependencyViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecureDependencyViolation_Requirement(), theUmlsecPackage.getcritical(), null, "requirement", null, 0, 1, SecureDependencyViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ViolationsPackageImpl
