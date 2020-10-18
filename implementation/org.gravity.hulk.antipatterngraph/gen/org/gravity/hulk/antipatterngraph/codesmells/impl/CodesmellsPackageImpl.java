/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;

import org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HEmptyClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HManyParametersCodeSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell;

import org.gravity.hulk.antipatterngraph.codesmells.HNoInheritanceCodeSmell;
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
public class CodesmellsPackageImpl extends EPackageImpl implements CodesmellsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hControllerClassSmellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hDataClassSmellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hEmptyClassSmellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hGetterSetterSmellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLargeClassLowCohesionSmellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLargeClassSmellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLowCohesionSmellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hDataClassAccessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMuchOverloadingCodeSmellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hManyParametersCodeSmellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hIntenseFieldUsageCodeSmellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNoInheritanceCodeSmellEClass = null;

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
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodesmellsPackageImpl() {
		super(eNS_URI, CodesmellsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CodesmellsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodesmellsPackage init() {
		if (isInited)
			return (CodesmellsPackage) EPackage.Registry.INSTANCE.getEPackage(CodesmellsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCodesmellsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CodesmellsPackageImpl theCodesmellsPackage = registeredCodesmellsPackage instanceof CodesmellsPackageImpl
				? (CodesmellsPackageImpl) registeredCodesmellsPackage
				: new CodesmellsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AntipatterngraphPackage.eNS_URI);
		AntipatterngraphPackageImpl theAntipatterngraphPackage = (AntipatterngraphPackageImpl) (registeredPackage instanceof AntipatterngraphPackageImpl
				? registeredPackage
				: AntipatterngraphPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AntipatternPackage.eNS_URI);
		AntipatternPackageImpl theAntipatternPackage = (AntipatternPackageImpl) (registeredPackage instanceof AntipatternPackageImpl
				? registeredPackage
				: AntipatternPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl) (registeredPackage instanceof MetricsPackageImpl
				? registeredPackage
				: MetricsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (registeredPackage instanceof ValuesPackageImpl
				? registeredPackage
				: ValuesPackage.eINSTANCE);

		// Create package meta-data objects
		theCodesmellsPackage.createPackageContents();
		theAntipatterngraphPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theValuesPackage.createPackageContents();

		// Initialize created meta-data
		theCodesmellsPackage.initializePackageContents();
		theAntipatterngraphPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodesmellsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodesmellsPackage.eNS_URI, theCodesmellsPackage);
		return theCodesmellsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHControllerClassSmell() {
		return hControllerClassSmellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHControllerClassSmell_HInvocationRelation() {
		return (EReference) hControllerClassSmellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHDataClassSmell() {
		return hDataClassSmellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHDataClassSmell_GetterSetterSmells() {
		return (EReference) hDataClassSmellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHDataClassSmell_HNACCMetric() {
		return (EReference) hDataClassSmellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHEmptyClassSmell() {
		return hEmptyClassSmellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHGetterSetterSmell() {
		return hGetterSetterSmellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHGetterSetterSmell_TFieldDefinition() {
		return (EReference) hGetterSetterSmellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHLargeClassLowCohesionSmell() {
		return hLargeClassLowCohesionSmellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHLargeClassLowCohesionSmell_HLowCohesionSmell() {
		return (EReference) hLargeClassLowCohesionSmellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHLargeClassLowCohesionSmell_HLargeClassSmell() {
		return (EReference) hLargeClassLowCohesionSmellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHLargeClassSmell() {
		return hLargeClassSmellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHLargeClassSmell_HNumberOfMembers() {
		return (EReference) hLargeClassSmellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHLowCohesionSmell() {
		return hLowCohesionSmellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHLowCohesionSmell_HLCOM5CustomMetric() {
		return (EReference) hLowCohesionSmellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHDataClassAccessor() {
		return hDataClassAccessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHDataClassAccessor_HDataClassSmells() {
		return (EReference) hDataClassAccessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHMuchOverloadingCodeSmell() {
		return hMuchOverloadingCodeSmellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHMuchOverloadingCodeSmell_HAverageOverloadingInClassMetric() {
		return (EReference) hMuchOverloadingCodeSmellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHManyParametersCodeSmell() {
		return hManyParametersCodeSmellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHManyParametersCodeSmell_HAverageParametersMetric() {
		return (EReference) hManyParametersCodeSmellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHIntenseFieldUsageCodeSmell() {
		return hIntenseFieldUsageCodeSmellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIntenseFieldUsageCodeSmell_HLocalAccessRelationMetric() {
		return (EReference) hIntenseFieldUsageCodeSmellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHNoInheritanceCodeSmell() {
		return hNoInheritanceCodeSmellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHNoInheritanceCodeSmell_HChildClassesMetric() {
		return (EReference) hNoInheritanceCodeSmellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodesmellsFactory getCodesmellsFactory() {
		return (CodesmellsFactory) getEFactoryInstance();
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
		hControllerClassSmellEClass = createEClass(HCONTROLLER_CLASS_SMELL);
		createEReference(hControllerClassSmellEClass, HCONTROLLER_CLASS_SMELL__HINVOCATION_RELATION);

		hDataClassSmellEClass = createEClass(HDATA_CLASS_SMELL);
		createEReference(hDataClassSmellEClass, HDATA_CLASS_SMELL__GETTER_SETTER_SMELLS);
		createEReference(hDataClassSmellEClass, HDATA_CLASS_SMELL__HNACC_METRIC);

		hEmptyClassSmellEClass = createEClass(HEMPTY_CLASS_SMELL);

		hGetterSetterSmellEClass = createEClass(HGETTER_SETTER_SMELL);
		createEReference(hGetterSetterSmellEClass, HGETTER_SETTER_SMELL__TFIELD_DEFINITION);

		hLargeClassLowCohesionSmellEClass = createEClass(HLARGE_CLASS_LOW_COHESION_SMELL);
		createEReference(hLargeClassLowCohesionSmellEClass, HLARGE_CLASS_LOW_COHESION_SMELL__HLOW_COHESION_SMELL);
		createEReference(hLargeClassLowCohesionSmellEClass, HLARGE_CLASS_LOW_COHESION_SMELL__HLARGE_CLASS_SMELL);

		hLargeClassSmellEClass = createEClass(HLARGE_CLASS_SMELL);
		createEReference(hLargeClassSmellEClass, HLARGE_CLASS_SMELL__HNUMBER_OF_MEMBERS);

		hLowCohesionSmellEClass = createEClass(HLOW_COHESION_SMELL);
		createEReference(hLowCohesionSmellEClass, HLOW_COHESION_SMELL__HLCOM5_CUSTOM_METRIC);

		hDataClassAccessorEClass = createEClass(HDATA_CLASS_ACCESSOR);
		createEReference(hDataClassAccessorEClass, HDATA_CLASS_ACCESSOR__HDATA_CLASS_SMELLS);

		hMuchOverloadingCodeSmellEClass = createEClass(HMUCH_OVERLOADING_CODE_SMELL);
		createEReference(hMuchOverloadingCodeSmellEClass,
				HMUCH_OVERLOADING_CODE_SMELL__HAVERAGE_OVERLOADING_IN_CLASS_METRIC);

		hManyParametersCodeSmellEClass = createEClass(HMANY_PARAMETERS_CODE_SMELL);
		createEReference(hManyParametersCodeSmellEClass, HMANY_PARAMETERS_CODE_SMELL__HAVERAGE_PARAMETERS_METRIC);

		hIntenseFieldUsageCodeSmellEClass = createEClass(HINTENSE_FIELD_USAGE_CODE_SMELL);
		createEReference(hIntenseFieldUsageCodeSmellEClass,
				HINTENSE_FIELD_USAGE_CODE_SMELL__HLOCAL_ACCESS_RELATION_METRIC);

		hNoInheritanceCodeSmellEClass = createEClass(HNO_INHERITANCE_CODE_SMELL);
		createEReference(hNoInheritanceCodeSmellEClass, HNO_INHERITANCE_CODE_SMELL__HCHILD_CLASSES_METRIC);
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
		MetricsPackage theMetricsPackage = (MetricsPackage) EPackage.Registry.INSTANCE
				.getEPackage(MetricsPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hControllerClassSmellEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());
		hDataClassSmellEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());
		hEmptyClassSmellEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());
		hGetterSetterSmellEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());
		hLargeClassLowCohesionSmellEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());
		hLargeClassSmellEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());
		hLowCohesionSmellEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());
		hDataClassAccessorEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());
		hDataClassAccessorEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hMuchOverloadingCodeSmellEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());
		hManyParametersCodeSmellEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());
		hIntenseFieldUsageCodeSmellEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());
		hNoInheritanceCodeSmellEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());

		// Initialize classes, features, and operations; add parameters
		initEClass(hControllerClassSmellEClass, HControllerClassSmell.class, "HControllerClassSmell", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHControllerClassSmell_HInvocationRelation(), theMetricsPackage.getHInvocationRelation(), null,
				"hInvocationRelation", null, 0, 1, HControllerClassSmell.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hDataClassSmellEClass, HDataClassSmell.class, "HDataClassSmell", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHDataClassSmell_GetterSetterSmells(), this.getHGetterSetterSmell(), null,
				"getterSetterSmells", null, 0, -1, HDataClassSmell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDataClassSmell_HNACCMetric(), theMetricsPackage.getHNACCMetric(), null, "hNACCMetric", null,
				0, 1, HDataClassSmell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hEmptyClassSmellEClass, HEmptyClassSmell.class, "HEmptyClassSmell", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hGetterSetterSmellEClass, HGetterSetterSmell.class, "HGetterSetterSmell", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHGetterSetterSmell_TFieldDefinition(), theBasicPackage.getTFieldDefinition(), null,
				"tFieldDefinition", null, 0, 1, HGetterSetterSmell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hLargeClassLowCohesionSmellEClass, HLargeClassLowCohesionSmell.class, "HLargeClassLowCohesionSmell",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHLargeClassLowCohesionSmell_HLowCohesionSmell(), this.getHLowCohesionSmell(), null,
				"hLowCohesionSmell", null, 0, 1, HLargeClassLowCohesionSmell.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHLargeClassLowCohesionSmell_HLargeClassSmell(), this.getHLargeClassSmell(), null,
				"hLargeClassSmell", null, 0, 1, HLargeClassLowCohesionSmell.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hLargeClassSmellEClass, HLargeClassSmell.class, "HLargeClassSmell", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHLargeClassSmell_HNumberOfMembers(), theMetricsPackage.getHNumberOfMembersMetric(), null,
				"hNumberOfMembers", null, 0, 1, HLargeClassSmell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hLowCohesionSmellEClass, HLowCohesionSmell.class, "HLowCohesionSmell", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHLowCohesionSmell_HLCOM5CustomMetric(), theMetricsPackage.getHLCOM5Metric(), null,
				"hLCOM5CustomMetric", null, 0, 1, HLowCohesionSmell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hDataClassAccessorEClass, HDataClassAccessor.class, "HDataClassAccessor", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHDataClassAccessor_HDataClassSmells(), this.getHDataClassSmell(), null, "hDataClassSmells",
				null, 0, -1, HDataClassAccessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hMuchOverloadingCodeSmellEClass, HMuchOverloadingCodeSmell.class, "HMuchOverloadingCodeSmell",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMuchOverloadingCodeSmell_HAverageOverloadingInClassMetric(),
				theMetricsPackage.getHAverageOverloadingInClassMetric(), null, "hAverageOverloadingInClassMetric", null,
				0, 1, HMuchOverloadingCodeSmell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hManyParametersCodeSmellEClass, HManyParametersCodeSmell.class, "HManyParametersCodeSmell",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHManyParametersCodeSmell_HAverageParametersMetric(),
				theMetricsPackage.getHAverageParametersMetric(), null, "hAverageParametersMetric", null, 0, 1,
				HManyParametersCodeSmell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hIntenseFieldUsageCodeSmellEClass, HIntenseFieldUsageCodeSmell.class, "HIntenseFieldUsageCodeSmell",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHIntenseFieldUsageCodeSmell_HLocalAccessRelationMetric(),
				theMetricsPackage.getHLocalAccessRelationMetric(), null, "hLocalAccessRelationMetric", null, 0, 1,
				HIntenseFieldUsageCodeSmell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hNoInheritanceCodeSmellEClass, HNoInheritanceCodeSmell.class, "HNoInheritanceCodeSmell",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHNoInheritanceCodeSmell_HChildClassesMetric(), theMetricsPackage.getHNumberOfChildMetric(),
				null, "hChildClassesMetric", null, 0, 1, HNoInheritanceCodeSmell.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CodesmellsPackageImpl
