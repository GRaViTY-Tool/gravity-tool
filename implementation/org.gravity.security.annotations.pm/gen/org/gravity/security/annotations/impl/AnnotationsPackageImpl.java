/**
 */
package org.gravity.security.annotations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.security.annotations.AnnotationsFactory;
import org.gravity.security.annotations.AnnotationsPackage;
import org.gravity.security.annotations.TCounterMeasure;
import org.gravity.security.annotations.TTainted;

import org.gravity.security.annotations.access.AccessPackage;

import org.gravity.security.annotations.access.impl.AccessPackageImpl;

import org.gravity.security.annotations.actions.ActionsPackage;

import org.gravity.security.annotations.actions.impl.ActionsPackageImpl;

import org.gravity.security.annotations.requirements.RequirementsPackage;

import org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationsPackageImpl extends EPackageImpl implements AnnotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCounterMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTaintedEClass = null;

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
	 * @see org.gravity.security.annotations.AnnotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnnotationsPackageImpl() {
		super(eNS_URI, AnnotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnnotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnnotationsPackage init() {
		if (isInited)
			return (AnnotationsPackage) EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAnnotationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AnnotationsPackageImpl theAnnotationsPackage = registeredAnnotationsPackage instanceof AnnotationsPackageImpl
				? (AnnotationsPackageImpl) registeredAnnotationsPackage
				: new AnnotationsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AccessPackage.eNS_URI);
		AccessPackageImpl theAccessPackage = (AccessPackageImpl) (registeredPackage instanceof AccessPackageImpl
				? registeredPackage
				: AccessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl) (registeredPackage instanceof RequirementsPackageImpl
				? registeredPackage
				: RequirementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl) (registeredPackage instanceof ActionsPackageImpl
				? registeredPackage
				: ActionsPackage.eINSTANCE);

		// Create package meta-data objects
		theAnnotationsPackage.createPackageContents();
		theAccessPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theActionsPackage.createPackageContents();

		// Initialize created meta-data
		theAnnotationsPackage.initializePackageContents();
		theAccessPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnnotationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnnotationsPackage.eNS_URI, theAnnotationsPackage);
		return theAnnotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCounterMeasure() {
		return tCounterMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTainted() {
		return tTaintedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationsFactory getAnnotationsFactory() {
		return (AnnotationsFactory) getEFactoryInstance();
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
		tCounterMeasureEClass = createEClass(TCOUNTER_MEASURE);

		tTaintedEClass = createEClass(TTAINTED);
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
		AccessPackage theAccessPackage = (AccessPackage) EPackage.Registry.INSTANCE.getEPackage(AccessPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(RequirementsPackage.eNS_URI);
		ActionsPackage theActionsPackage = (ActionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ActionsPackage.eNS_URI);
		org.gravity.typegraph.basic.annotations.AnnotationsPackage theAnnotationsPackage_1 = (org.gravity.typegraph.basic.annotations.AnnotationsPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAccessPackage);
		getESubpackages().add(theRequirementsPackage);
		getESubpackages().add(theActionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tCounterMeasureEClass.getESuperTypes().add(theAnnotationsPackage_1.getTAnnotation());
		tTaintedEClass.getESuperTypes().add(theAnnotationsPackage_1.getTAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(tCounterMeasureEClass, TCounterMeasure.class, "TCounterMeasure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tTaintedEClass, TTainted.class, "TTainted", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AnnotationsPackageImpl
