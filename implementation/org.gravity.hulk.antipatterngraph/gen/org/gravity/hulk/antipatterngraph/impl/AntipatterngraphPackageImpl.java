/**
 */
package org.gravity.hulk.antipatterngraph.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPattern;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.HCodeSmell;
import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;

import org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;

import org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl;

import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;

import org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl;

import org.gravity.hulk.antipatterngraph.values.ValuesPackage;

import org.gravity.hulk.antipatterngraph.values.impl.ValuesPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.gravity.typegraph.basic.annotations.AnnotationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AntipatterngraphPackageImpl extends EPackageImpl implements AntipatterngraphPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAntiPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hCodeSmellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAntiPatternGraphEClass = null;

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
	 * @see org.gravity.hulk.antipatterngraph.AntipatterngraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AntipatterngraphPackageImpl() {
		super(eNS_URI, AntipatterngraphFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AntipatterngraphPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AntipatterngraphPackage init() {
		if (isInited)
			return (AntipatterngraphPackage) EPackage.Registry.INSTANCE.getEPackage(AntipatterngraphPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAntipatterngraphPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AntipatterngraphPackageImpl theAntipatterngraphPackage = registeredAntipatterngraphPackage instanceof AntipatterngraphPackageImpl
				? (AntipatterngraphPackageImpl) registeredAntipatterngraphPackage
				: new AntipatterngraphPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AntipatternPackage.eNS_URI);
		AntipatternPackageImpl theAntipatternPackage = (AntipatternPackageImpl) (registeredPackage instanceof AntipatternPackageImpl
				? registeredPackage
				: AntipatternPackage.eINSTANCE);
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
		theAntipatterngraphPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theValuesPackage.createPackageContents();

		// Initialize created meta-data
		theAntipatterngraphPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAntipatterngraphPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AntipatterngraphPackage.eNS_URI, theAntipatterngraphPackage);
		return theAntipatterngraphPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHAnnotation() {
		return hAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHAnnotation_Apg() {
		return (EReference) hAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHAnnotation_PartOf() {
		return (EReference) hAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHAnnotation_Changed() {
		return (EAttribute) hAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHAntiPattern() {
		return hAntiPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHCodeSmell() {
		return hCodeSmellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHMetric() {
		return hMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHMetric_Value() {
		return (EAttribute) hMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHMetric__GetRelativeAmount() {
		return hMetricEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHMetric__Increment() {
		return hMetricEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHAntiPatternGraph() {
		return hAntiPatternGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHAntiPatternGraph_Pg() {
		return (EReference) hAntiPatternGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHAntiPatternGraph_HAnnotations() {
		return (EReference) hAntiPatternGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHAntiPatternGraph_CurrentID() {
		return (EAttribute) hAntiPatternGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHAntiPatternGraph__GetNextID() {
		return hAntiPatternGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntipatterngraphFactory getAntipatterngraphFactory() {
		return (AntipatterngraphFactory) getEFactoryInstance();
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
		hAnnotationEClass = createEClass(HANNOTATION);
		createEReference(hAnnotationEClass, HANNOTATION__APG);
		createEReference(hAnnotationEClass, HANNOTATION__PART_OF);
		createEAttribute(hAnnotationEClass, HANNOTATION__CHANGED);

		hAntiPatternEClass = createEClass(HANTI_PATTERN);

		hCodeSmellEClass = createEClass(HCODE_SMELL);

		hMetricEClass = createEClass(HMETRIC);
		createEAttribute(hMetricEClass, HMETRIC__VALUE);
		createEOperation(hMetricEClass, HMETRIC___GET_RELATIVE_AMOUNT);
		createEOperation(hMetricEClass, HMETRIC___INCREMENT);

		hAntiPatternGraphEClass = createEClass(HANTI_PATTERN_GRAPH);
		createEReference(hAntiPatternGraphEClass, HANTI_PATTERN_GRAPH__PG);
		createEReference(hAntiPatternGraphEClass, HANTI_PATTERN_GRAPH__HANNOTATIONS);
		createEAttribute(hAntiPatternGraphEClass, HANTI_PATTERN_GRAPH__CURRENT_ID);
		createEOperation(hAntiPatternGraphEClass, HANTI_PATTERN_GRAPH___GET_NEXT_ID);
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
		AntipatternPackage theAntipatternPackage = (AntipatternPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatternPackage.eNS_URI);
		CodesmellsPackage theCodesmellsPackage = (CodesmellsPackage) EPackage.Registry.INSTANCE
				.getEPackage(CodesmellsPackage.eNS_URI);
		MetricsPackage theMetricsPackage = (MetricsPackage) EPackage.Registry.INSTANCE
				.getEPackage(MetricsPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage) EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage) EPackage.Registry.INSTANCE
				.getEPackage(AnnotationsPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAntipatternPackage);
		getESubpackages().add(theCodesmellsPackage);
		getESubpackages().add(theMetricsPackage);
		getESubpackages().add(theValuesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hAnnotationEClass.getESuperTypes().add(theAnnotationsPackage.getTAnnotation());
		hAntiPatternEClass.getESuperTypes().add(this.getHAnnotation());
		hCodeSmellEClass.getESuperTypes().add(this.getHAnnotation());
		hMetricEClass.getESuperTypes().add(this.getHAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(hAnnotationEClass, HAnnotation.class, "HAnnotation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHAnnotation_Apg(), this.getHAntiPatternGraph(), this.getHAntiPatternGraph_HAnnotations(),
				"apg", null, 1, 1, HAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHAnnotation_PartOf(), this.getHAnnotation(), null, "partOf", null, 0, -1, HAnnotation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHAnnotation_Changed(), ecorePackage.getEBoolean(), "changed", null, 1, 1, HAnnotation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(hAntiPatternEClass, HAntiPattern.class, "HAntiPattern", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hCodeSmellEClass, HCodeSmell.class, "HCodeSmell", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hMetricEClass, HMetric.class, "HMetric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHMetric_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, HMetric.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getHMetric__GetRelativeAmount(), theValuesPackage.getHRelativeValue(), "getRelativeAmount", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getHMetric__Increment(), ecorePackage.getEDouble(), "increment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hAntiPatternGraphEClass, HAntiPatternGraph.class, "HAntiPatternGraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHAntiPatternGraph_Pg(), theBasicPackage.getTypeGraph(), null, "pg", null, 1, 1,
				HAntiPatternGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHAntiPatternGraph_HAnnotations(), this.getHAnnotation(), this.getHAnnotation_Apg(),
				"hAnnotations", null, 0, -1, HAntiPatternGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHAntiPatternGraph_CurrentID(), ecorePackage.getEInt(), "currentID", null, 1, 1,
				HAntiPatternGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEOperation(getHAntiPatternGraph__GetNextID(), ecorePackage.getEInt(), "getNextID", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AntipatterngraphPackageImpl
