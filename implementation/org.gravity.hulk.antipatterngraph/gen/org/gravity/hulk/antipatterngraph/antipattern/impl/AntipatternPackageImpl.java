/**
 */
package org.gravity.hulk.antipatterngraph.antipattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.antipatterngraph.antipattern.AntipatternFactory;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;

import org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl;

import org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl;

import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;

import org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl;

import org.gravity.hulk.antipatterngraph.values.ValuesPackage;

import org.gravity.hulk.antipatterngraph.values.impl.ValuesPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AntipatternPackageImpl extends EPackageImpl implements AntipatternPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hBlobAntiPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hGodClassAntiPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSwissArmyKnifeAntiPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSpaghettiCodeAntiPatternEClass = null;

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
	 * @see org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AntipatternPackageImpl() {
		super(eNS_URI, AntipatternFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AntipatternPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AntipatternPackage init() {
		if (isInited)
			return (AntipatternPackage) EPackage.Registry.INSTANCE.getEPackage(AntipatternPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAntipatternPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AntipatternPackageImpl theAntipatternPackage = registeredAntipatternPackage instanceof AntipatternPackageImpl
				? (AntipatternPackageImpl) registeredAntipatternPackage
				: new AntipatternPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AntipatterngraphPackage.eNS_URI);
		AntipatterngraphPackageImpl theAntipatterngraphPackage = (AntipatterngraphPackageImpl) (registeredPackage instanceof AntipatterngraphPackageImpl
				? registeredPackage
				: AntipatterngraphPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CodesmellsPackage.eNS_URI);
		CodesmellsPackageImpl theCodesmellsPackage = (CodesmellsPackageImpl) (registeredPackage instanceof CodesmellsPackageImpl
				? registeredPackage
				: CodesmellsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl) (registeredPackage instanceof MetricsPackageImpl
				? registeredPackage
				: MetricsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (registeredPackage instanceof ValuesPackageImpl
				? registeredPackage
				: ValuesPackage.eINSTANCE);

		// Create package meta-data objects
		theAntipatternPackage.createPackageContents();
		theAntipatterngraphPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theValuesPackage.createPackageContents();

		// Initialize created meta-data
		theAntipatternPackage.initializePackageContents();
		theAntipatterngraphPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAntipatternPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AntipatternPackage.eNS_URI, theAntipatternPackage);
		return theAntipatternPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHBlobAntiPattern() {
		return hBlobAntiPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHBlobAntiPattern_HDataClassSmells() {
		return (EReference) hBlobAntiPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHBlobAntiPattern_HGodClassAntiPattern() {
		return (EReference) hBlobAntiPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHGodClassAntiPattern() {
		return hGodClassAntiPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHGodClassAntiPattern_HLargeClassLowCohesionSmell() {
		return (EReference) hGodClassAntiPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHGodClassAntiPattern_HControllerClassSmell() {
		return (EReference) hGodClassAntiPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHSwissArmyKnifeAntiPattern() {
		return hSwissArmyKnifeAntiPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSwissArmyKnifeAntiPattern_HIncommingInvocationCustomMetric() {
		return (EReference) hSwissArmyKnifeAntiPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSwissArmyKnifeAntiPattern_HLargeClassSmell() {
		return (EReference) hSwissArmyKnifeAntiPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSwissArmyKnifeAntiPattern_HMuchOverloadingCodeSmell() {
		return (EReference) hSwissArmyKnifeAntiPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHSpaghettiCodeAntiPattern() {
		return hSpaghettiCodeAntiPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSpaghettiCodeAntiPattern_HDepthOfInheritanceMetric() {
		return (EReference) hSpaghettiCodeAntiPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSpaghettiCodeAntiPattern_HIntenseFieldUsageCodeSmell() {
		return (EReference) hSpaghettiCodeAntiPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSpaghettiCodeAntiPattern_HAverageOverloadingInClassMetric() {
		return (EReference) hSpaghettiCodeAntiPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSpaghettiCodeAntiPattern_HAverageParametersMetric() {
		return (EReference) hSpaghettiCodeAntiPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSpaghettiCodeAntiPattern_HNumberOfChild() {
		return (EReference) hSpaghettiCodeAntiPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntipatternFactory getAntipatternFactory() {
		return (AntipatternFactory) getEFactoryInstance();
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
		hBlobAntiPatternEClass = createEClass(HBLOB_ANTI_PATTERN);
		createEReference(hBlobAntiPatternEClass, HBLOB_ANTI_PATTERN__HDATA_CLASS_SMELLS);
		createEReference(hBlobAntiPatternEClass, HBLOB_ANTI_PATTERN__HGOD_CLASS_ANTI_PATTERN);

		hGodClassAntiPatternEClass = createEClass(HGOD_CLASS_ANTI_PATTERN);
		createEReference(hGodClassAntiPatternEClass, HGOD_CLASS_ANTI_PATTERN__HLARGE_CLASS_LOW_COHESION_SMELL);
		createEReference(hGodClassAntiPatternEClass, HGOD_CLASS_ANTI_PATTERN__HCONTROLLER_CLASS_SMELL);

		hSwissArmyKnifeAntiPatternEClass = createEClass(HSWISS_ARMY_KNIFE_ANTI_PATTERN);
		createEReference(hSwissArmyKnifeAntiPatternEClass,
				HSWISS_ARMY_KNIFE_ANTI_PATTERN__HINCOMMING_INVOCATION_CUSTOM_METRIC);
		createEReference(hSwissArmyKnifeAntiPatternEClass, HSWISS_ARMY_KNIFE_ANTI_PATTERN__HLARGE_CLASS_SMELL);
		createEReference(hSwissArmyKnifeAntiPatternEClass,
				HSWISS_ARMY_KNIFE_ANTI_PATTERN__HMUCH_OVERLOADING_CODE_SMELL);

		hSpaghettiCodeAntiPatternEClass = createEClass(HSPAGHETTI_CODE_ANTI_PATTERN);
		createEReference(hSpaghettiCodeAntiPatternEClass, HSPAGHETTI_CODE_ANTI_PATTERN__HDEPTH_OF_INHERITANCE_METRIC);
		createEReference(hSpaghettiCodeAntiPatternEClass,
				HSPAGHETTI_CODE_ANTI_PATTERN__HINTENSE_FIELD_USAGE_CODE_SMELL);
		createEReference(hSpaghettiCodeAntiPatternEClass,
				HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_OVERLOADING_IN_CLASS_METRIC);
		createEReference(hSpaghettiCodeAntiPatternEClass, HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_PARAMETERS_METRIC);
		createEReference(hSpaghettiCodeAntiPatternEClass, HSPAGHETTI_CODE_ANTI_PATTERN__HNUMBER_OF_CHILD);
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
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		CodesmellsPackage theCodesmellsPackage = (CodesmellsPackage) EPackage.Registry.INSTANCE
				.getEPackage(CodesmellsPackage.eNS_URI);
		MetricsPackage theMetricsPackage = (MetricsPackage) EPackage.Registry.INSTANCE
				.getEPackage(MetricsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hBlobAntiPatternEClass.getESuperTypes().add(theAntipatterngraphPackage.getHAntiPattern());
		hGodClassAntiPatternEClass.getESuperTypes().add(theAntipatterngraphPackage.getHAntiPattern());
		hSwissArmyKnifeAntiPatternEClass.getESuperTypes().add(theAntipatterngraphPackage.getHAntiPattern());
		hSpaghettiCodeAntiPatternEClass.getESuperTypes().add(theAntipatterngraphPackage.getHAntiPattern());

		// Initialize classes, features, and operations; add parameters
		initEClass(hBlobAntiPatternEClass, HBlobAntiPattern.class, "HBlobAntiPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHBlobAntiPattern_HDataClassSmells(), theCodesmellsPackage.getHDataClassSmell(), null,
				"hDataClassSmells", null, 0, -1, HBlobAntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHBlobAntiPattern_HGodClassAntiPattern(), this.getHGodClassAntiPattern(), null,
				"hGodClassAntiPattern", null, 0, 1, HBlobAntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hGodClassAntiPatternEClass, HGodClassAntiPattern.class, "HGodClassAntiPattern", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHGodClassAntiPattern_HLargeClassLowCohesionSmell(),
				theCodesmellsPackage.getHLargeClassLowCohesionSmell(), null, "hLargeClassLowCohesionSmell", null, 0, 1,
				HGodClassAntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHGodClassAntiPattern_HControllerClassSmell(), theCodesmellsPackage.getHControllerClassSmell(),
				null, "hControllerClassSmell", null, 0, 1, HGodClassAntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hSwissArmyKnifeAntiPatternEClass, HSwissArmyKnifeAntiPattern.class, "HSwissArmyKnifeAntiPattern",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHSwissArmyKnifeAntiPattern_HIncommingInvocationCustomMetric(),
				theMetricsPackage.getHIncommingInvocationMetric(), null, "hIncommingInvocationCustomMetric", null, 0, 1,
				HSwissArmyKnifeAntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSwissArmyKnifeAntiPattern_HLargeClassSmell(), theCodesmellsPackage.getHLargeClassSmell(),
				null, "hLargeClassSmell", null, 0, 1, HSwissArmyKnifeAntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSwissArmyKnifeAntiPattern_HMuchOverloadingCodeSmell(),
				theCodesmellsPackage.getHMuchOverloadingCodeSmell(), null, "hMuchOverloadingCodeSmell", null, 0, 1,
				HSwissArmyKnifeAntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hSpaghettiCodeAntiPatternEClass, HSpaghettiCodeAntiPattern.class, "HSpaghettiCodeAntiPattern",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHSpaghettiCodeAntiPattern_HDepthOfInheritanceMetric(),
				theMetricsPackage.getHDepthOfInheritanceMetric(), null, "hDepthOfInheritanceMetric", null, 0, 1,
				HSpaghettiCodeAntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSpaghettiCodeAntiPattern_HIntenseFieldUsageCodeSmell(),
				theCodesmellsPackage.getHIntenseFieldUsageCodeSmell(), null, "hIntenseFieldUsageCodeSmell", null, 0, 1,
				HSpaghettiCodeAntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSpaghettiCodeAntiPattern_HAverageOverloadingInClassMetric(),
				theMetricsPackage.getHAverageOverloadingInClassMetric(), null, "hAverageOverloadingInClassMetric", null,
				0, 1, HSpaghettiCodeAntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSpaghettiCodeAntiPattern_HAverageParametersMetric(),
				theMetricsPackage.getHAverageParametersMetric(), null, "hAverageParametersMetric", null, 0, 1,
				HSpaghettiCodeAntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSpaghettiCodeAntiPattern_HNumberOfChild(), theMetricsPackage.getHNumberOfChildMetric(), null,
				"hNumberOfChild", null, 0, 1, HSpaghettiCodeAntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AntipatternPackageImpl
