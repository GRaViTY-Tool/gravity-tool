/**
 */
package org.gravity.security.annotations.requirements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.security.annotations.AnnotationsPackage;

import org.gravity.security.annotations.access.AccessPackage;

import org.gravity.security.annotations.access.impl.AccessPackageImpl;

import org.gravity.security.annotations.actions.ActionsPackage;

import org.gravity.security.annotations.actions.impl.ActionsPackageImpl;

import org.gravity.security.annotations.impl.AnnotationsPackageImpl;

import org.gravity.security.annotations.requirements.RequirementsFactory;
import org.gravity.security.annotations.requirements.RequirementsPackage;
import org.gravity.security.annotations.requirements.TAbstractCriticalElement;
import org.gravity.security.annotations.requirements.TAnnotationWithCounterMeasure;
import org.gravity.security.annotations.requirements.TCritical;
import org.gravity.security.annotations.requirements.THigh;
import org.gravity.security.annotations.requirements.TIntegrity;
import org.gravity.security.annotations.requirements.TSecrecy;

import org.gravity.typegraph.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsPackageImpl extends EPackageImpl implements RequirementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSecrecyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tIntegrityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tHighEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCriticalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAnnotationWithCounterMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAbstractCriticalElementEClass = null;

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
	 * @see org.gravity.security.annotations.requirements.RequirementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementsPackageImpl() {
		super(eNS_URI, RequirementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequirementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementsPackage init() {
		if (isInited)
			return (RequirementsPackage) EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRequirementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RequirementsPackageImpl theRequirementsPackage = registeredRequirementsPackage instanceof RequirementsPackageImpl
				? (RequirementsPackageImpl) registeredRequirementsPackage
				: new RequirementsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl) (registeredPackage instanceof AnnotationsPackageImpl
				? registeredPackage
				: AnnotationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AccessPackage.eNS_URI);
		AccessPackageImpl theAccessPackage = (AccessPackageImpl) (registeredPackage instanceof AccessPackageImpl
				? registeredPackage
				: AccessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl) (registeredPackage instanceof ActionsPackageImpl
				? registeredPackage
				: ActionsPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementsPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();
		theAccessPackage.createPackageContents();
		theActionsPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementsPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();
		theAccessPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementsPackage.eNS_URI, theRequirementsPackage);
		return theRequirementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSecrecy() {
		return tSecrecyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTIntegrity() {
		return tIntegrityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTHigh() {
		return tHighEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCritical() {
		return tCriticalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCritical_Secrecy() {
		return (EReference) tCriticalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCritical_Integrity() {
		return (EReference) tCriticalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCritical_High() {
		return (EReference) tCriticalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAnnotationWithCounterMeasure() {
		return tAnnotationWithCounterMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAnnotationWithCounterMeasure_Countermeasure() {
		return (EReference) tAnnotationWithCounterMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAbstractCriticalElement() {
		return tAbstractCriticalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsFactory getRequirementsFactory() {
		return (RequirementsFactory) getEFactoryInstance();
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
		tSecrecyEClass = createEClass(TSECRECY);

		tIntegrityEClass = createEClass(TINTEGRITY);

		tHighEClass = createEClass(THIGH);

		tCriticalEClass = createEClass(TCRITICAL);
		createEReference(tCriticalEClass, TCRITICAL__SECRECY);
		createEReference(tCriticalEClass, TCRITICAL__INTEGRITY);
		createEReference(tCriticalEClass, TCRITICAL__HIGH);

		tAnnotationWithCounterMeasureEClass = createEClass(TANNOTATION_WITH_COUNTER_MEASURE);
		createEReference(tAnnotationWithCounterMeasureEClass, TANNOTATION_WITH_COUNTER_MEASURE__COUNTERMEASURE);

		tAbstractCriticalElementEClass = createEClass(TABSTRACT_CRITICAL_ELEMENT);
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
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		org.gravity.typegraph.basic.annotations.AnnotationsPackage theAnnotationsPackage_1 = (org.gravity.typegraph.basic.annotations.AnnotationsPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tSecrecyEClass.getESuperTypes().add(this.getTAnnotationWithCounterMeasure());
		tSecrecyEClass.getESuperTypes().add(this.getTAbstractCriticalElement());
		tIntegrityEClass.getESuperTypes().add(this.getTAnnotationWithCounterMeasure());
		tIntegrityEClass.getESuperTypes().add(this.getTAbstractCriticalElement());
		tHighEClass.getESuperTypes().add(this.getTAnnotationWithCounterMeasure());
		tCriticalEClass.getESuperTypes().add(this.getTAbstractCriticalElement());
		tAnnotationWithCounterMeasureEClass.getESuperTypes().add(theAnnotationsPackage_1.getTAnnotation());
		tAbstractCriticalElementEClass.getESuperTypes().add(theAnnotationsPackage_1.getTAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(tSecrecyEClass, TSecrecy.class, "TSecrecy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tIntegrityEClass, TIntegrity.class, "TIntegrity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tHighEClass, THigh.class, "THigh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tCriticalEClass, TCritical.class, "TCritical", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCritical_Secrecy(), theBasicPackage.getTSignature(), null, "secrecy", null, 0, -1,
				TCritical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCritical_Integrity(), theBasicPackage.getTSignature(), null, "integrity", null, 0, -1,
				TCritical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCritical_High(), theBasicPackage.getTSignature(), null, "high", null, 0, -1, TCritical.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tAnnotationWithCounterMeasureEClass, TAnnotationWithCounterMeasure.class,
				"TAnnotationWithCounterMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAnnotationWithCounterMeasure_Countermeasure(), theBasicPackage.getTMethodDefinition(), null,
				"countermeasure", null, 0, 1, TAnnotationWithCounterMeasure.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tAbstractCriticalElementEClass, TAbstractCriticalElement.class, "TAbstractCriticalElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //RequirementsPackageImpl
