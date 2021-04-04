/**
 */
package org.gravity.hulk.detection.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.antipatterngraph.values.ValuesPackage;

import org.gravity.hulk.detection.DetectionFactory;
import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HAntiPatternDetector;
import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HClassBasedMetricCalculator;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.HRelativeDetector;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;

import org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;

import org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl;

import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl;

import org.gravity.hulk.impl.HulkPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.moflon.core.dfs.DfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DetectionPackageImpl extends EPackageImpl implements DetectionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hCodeSmellDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMetricCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAntiPatternDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hClassBasedCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hClassBasedMetricCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hRelativeDetectorEClass = null;

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
	 * @see org.gravity.hulk.detection.DetectionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DetectionPackageImpl() {
		super(eNS_URI, DetectionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DetectionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DetectionPackage init() {
		if (isInited)
			return (DetectionPackage) EPackage.Registry.INSTANCE.getEPackage(DetectionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDetectionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DetectionPackageImpl theDetectionPackage = registeredDetectionPackage instanceof DetectionPackageImpl
				? (DetectionPackageImpl) registeredDetectionPackage
				: new DetectionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DfsPackage.eINSTANCE.eClass();
		AntipatterngraphPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HulkPackage.eNS_URI);
		HulkPackageImpl theHulkPackage = (HulkPackageImpl) (registeredPackage instanceof HulkPackageImpl
				? registeredPackage
				: HulkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AntipatternPackage.eNS_URI);
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

		// Create package meta-data objects
		theDetectionPackage.createPackageContents();
		theHulkPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theDetectionPackage.initializePackageContents();
		theHulkPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDetectionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DetectionPackage.eNS_URI, theDetectionPackage);
		return theDetectionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHCodeSmellDetector() {
		return hCodeSmellDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMetricCalculator() {
		return hMetricCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAntiPatternDetector() {
		return hAntiPatternDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHClassBasedCalculator() {
		return hClassBasedCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHClassBasedCalculator__Calculate__TClass() {
		return hClassBasedCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHClassBasedCalculator__Detect__HAntiPatternGraph() {
		return hClassBasedCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHClassBasedMetricCalculator() {
		return hClassBasedMetricCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHClassBasedMetricCalculator__Calculate__TClass() {
		return hClassBasedMetricCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHClassBasedMetricCalculator__CalculateMetric__TClass() {
		return hClassBasedMetricCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHClassBasedMetricCalculator__CalculateValue__TClass() {
		return hClassBasedMetricCalculatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHRelativeDetector() {
		return hRelativeDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHRelativeDetector_Relative() {
		return (EAttribute) hRelativeDetectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHRelativeDetector_Threshold() {
		return (EAttribute) hRelativeDetectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHRelativeDetector__CalculateRelativeThreshold__HRelativeValueConstants() {
		return hRelativeDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectionFactory getDetectionFactory() {
		return (DetectionFactory) getEFactoryInstance();
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
		hCodeSmellDetectorEClass = createEClass(HCODE_SMELL_DETECTOR);

		hMetricCalculatorEClass = createEClass(HMETRIC_CALCULATOR);

		hAntiPatternDetectorEClass = createEClass(HANTI_PATTERN_DETECTOR);

		hClassBasedCalculatorEClass = createEClass(HCLASS_BASED_CALCULATOR);
		createEOperation(hClassBasedCalculatorEClass, HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS);
		createEOperation(hClassBasedCalculatorEClass, HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH);

		hClassBasedMetricCalculatorEClass = createEClass(HCLASS_BASED_METRIC_CALCULATOR);
		createEOperation(hClassBasedMetricCalculatorEClass, HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS);
		createEOperation(hClassBasedMetricCalculatorEClass, HCLASS_BASED_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hClassBasedMetricCalculatorEClass, HCLASS_BASED_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hRelativeDetectorEClass = createEClass(HRELATIVE_DETECTOR);
		createEAttribute(hRelativeDetectorEClass, HRELATIVE_DETECTOR__RELATIVE);
		createEAttribute(hRelativeDetectorEClass, HRELATIVE_DETECTOR__THRESHOLD);
		createEOperation(hRelativeDetectorEClass,
				HRELATIVE_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS);
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
		HulkPackage theHulkPackage = (HulkPackage) EPackage.Registry.INSTANCE.getEPackage(HulkPackage.eNS_URI);
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage) EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAntipatternPackage);
		getESubpackages().add(theCodesmellsPackage);
		getESubpackages().add(theMetricsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hCodeSmellDetectorEClass.getESuperTypes().add(theHulkPackage.getHDetector());
		hMetricCalculatorEClass.getESuperTypes().add(theHulkPackage.getHDetector());
		hAntiPatternDetectorEClass.getESuperTypes().add(theHulkPackage.getHDetector());
		hClassBasedCalculatorEClass.getESuperTypes().add(theHulkPackage.getHDetector());
		hClassBasedMetricCalculatorEClass.getESuperTypes().add(this.getHClassBasedCalculator());
		hClassBasedMetricCalculatorEClass.getESuperTypes().add(this.getHMetricCalculator());
		hRelativeDetectorEClass.getESuperTypes().add(theHulkPackage.getHDetector());

		// Initialize classes, features, and operations; add parameters
		initEClass(hCodeSmellDetectorEClass, HCodeSmellDetector.class, "HCodeSmellDetector", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hMetricCalculatorEClass, HMetricCalculator.class, "HMetricCalculator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hAntiPatternDetectorEClass, HAntiPatternDetector.class, "HAntiPatternDetector", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hClassBasedCalculatorEClass, HClassBasedCalculator.class, "HClassBasedCalculator", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getHClassBasedCalculator__Calculate__TClass(),
				theAntipatterngraphPackage.getHAnnotation(), "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHClassBasedCalculator__Detect__HAntiPatternGraph(), ecorePackage.getEBoolean(), "detect",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "pg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hClassBasedMetricCalculatorEClass, HClassBasedMetricCalculator.class, "HClassBasedMetricCalculator",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHClassBasedMetricCalculator__Calculate__TClass(),
				theAntipatterngraphPackage.getHAnnotation(), "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHClassBasedMetricCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHClassBasedMetricCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hRelativeDetectorEClass, HRelativeDetector.class, "HRelativeDetector", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHRelativeDetector_Relative(), ecorePackage.getEBoolean(), "relative", "true", 1, 1,
				HRelativeDetector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHRelativeDetector_Threshold(), ecorePackage.getEDouble(), "threshold", null, 1, 1,
				HRelativeDetector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getHRelativeDetector__CalculateRelativeThreshold__HRelativeValueConstants(),
				ecorePackage.getEDouble(), "calculateRelativeThreshold", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theValuesPackage.getHRelativeValueConstants(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //DetectionPackageImpl
