/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.antipatterngraph.values.ValuesPackage;

import org.gravity.hulk.detection.DetectionPackage;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;

import org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl;

import org.gravity.hulk.detection.codesmells.CodesmellsFactory;
import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HContollerClassDetector;
import org.gravity.hulk.detection.codesmells.HDataClassAccessorDetector;
import org.gravity.hulk.detection.codesmells.HDataClassDetector;
import org.gravity.hulk.detection.codesmells.HEmptyClassDetector;
import org.gravity.hulk.detection.codesmells.HGetterSetterDetector;
import org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector;
import org.gravity.hulk.detection.codesmells.HLargeClassDetector;
import org.gravity.hulk.detection.codesmells.HLargeClassLowCohesionDetector;
import org.gravity.hulk.detection.codesmells.HLowCohesionDetector;
import org.gravity.hulk.detection.codesmells.HManyParametersDetector;
import org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector;

import org.gravity.hulk.detection.impl.DetectionPackageImpl;

import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl;

import org.gravity.hulk.impl.HulkPackageImpl;

import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;

import org.gravity.hulk.resolve.ResolvePackage;

import org.gravity.hulk.resolve.calculators.CalculatorsPackage;

import org.gravity.hulk.resolve.calculators.impl.CalculatorsPackageImpl;

import org.gravity.hulk.resolve.impl.ResolvePackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.moflon.core.dfs.DfsPackage;

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
	private EClass hContollerClassDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hDataClassDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hEmptyClassDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hGetterSetterDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLargeClassLowCohesionDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLargeClassDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLowCohesionDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hDataClassAccessorDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hManyParametersDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMuchOverloadingDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hIntenseFieldUsageDetectorEClass = null;

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
	 * @see org.gravity.hulk.detection.codesmells.CodesmellsPackage#eNS_URI
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
		DfsPackage.eINSTANCE.eClass();
		AntipatterngraphPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();
		RefactoringgraphPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HulkPackage.eNS_URI);
		HulkPackageImpl theHulkPackage = (HulkPackageImpl) (registeredPackage instanceof HulkPackageImpl
				? registeredPackage
				: HulkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DetectionPackage.eNS_URI);
		DetectionPackageImpl theDetectionPackage = (DetectionPackageImpl) (registeredPackage instanceof DetectionPackageImpl
				? registeredPackage
				: DetectionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AntipatternPackage.eNS_URI);
		AntipatternPackageImpl theAntipatternPackage = (AntipatternPackageImpl) (registeredPackage instanceof AntipatternPackageImpl
				? registeredPackage
				: AntipatternPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl) (registeredPackage instanceof MetricsPackageImpl
				? registeredPackage
				: MetricsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResolvePackage.eNS_URI);
		ResolvePackageImpl theResolvePackage = (ResolvePackageImpl) (registeredPackage instanceof ResolvePackageImpl
				? registeredPackage
				: ResolvePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CalculatorsPackage.eNS_URI);
		CalculatorsPackageImpl theCalculatorsPackage = (CalculatorsPackageImpl) (registeredPackage instanceof CalculatorsPackageImpl
				? registeredPackage
				: CalculatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.hulk.resolve.antipattern.AntipatternPackage.eNS_URI);
		org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl theAntipatternPackage_1 = (org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl) (registeredPackage instanceof org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl
				? registeredPackage
				: org.gravity.hulk.resolve.antipattern.AntipatternPackage.eINSTANCE);

		// Create package meta-data objects
		theCodesmellsPackage.createPackageContents();
		theHulkPackage.createPackageContents();
		theDetectionPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theResolvePackage.createPackageContents();
		theCalculatorsPackage.createPackageContents();
		theAntipatternPackage_1.createPackageContents();

		// Initialize created meta-data
		theCodesmellsPackage.initializePackageContents();
		theHulkPackage.initializePackageContents();
		theDetectionPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theResolvePackage.initializePackageContents();
		theCalculatorsPackage.initializePackageContents();
		theAntipatternPackage_1.initializePackageContents();

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
	public EClass getHContollerClassDetector() {
		return hContollerClassDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHContollerClassDetector__Calculate__TClass() {
		return hContollerClassDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHContollerClassDetector__CalculateRelativeThreshold__HRelativeValueConstants() {
		return hContollerClassDetectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDataClassDetector() {
		return hDataClassDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHDataClassDetector__Calculate__TClass() {
		return hDataClassDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHDataClassDetector__MakeChildDC__TClass_HDataClassSmell() {
		return hDataClassDetectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHDataClassDetector__CalculateRelativeThreshold__HRelativeValueConstants() {
		return hDataClassDetectorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHEmptyClassDetector() {
		return hEmptyClassDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHEmptyClassDetector__Calculate__TClass() {
		return hEmptyClassDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHGetterSetterDetector() {
		return hGetterSetterDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGetterSetterDetector__IsGetterSetter__TMethodDefinition() {
		return hGetterSetterDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGetterSetterDetector__Calculate__TClass() {
		return hGetterSetterDetectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLargeClassLowCohesionDetector() {
		return hLargeClassLowCohesionDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLargeClassLowCohesionDetector__Calculate__TClass() {
		return hLargeClassLowCohesionDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLargeClassDetector() {
		return hLargeClassDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLargeClassDetector__Calculate__TClass() {
		return hLargeClassDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLargeClassDetector__CalculateRelativeThreshold__HRelativeValueConstants() {
		return hLargeClassDetectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLowCohesionDetector() {
		return hLowCohesionDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLowCohesionDetector__Calculate__TClass() {
		return hLowCohesionDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLowCohesionDetector__CalculateRelativeThreshold__HRelativeValueConstants() {
		return hLowCohesionDetectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDataClassAccessorDetector() {
		return hDataClassAccessorDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHDataClassAccessorDetector__Calculate__TClass() {
		return hDataClassAccessorDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHManyParametersDetector() {
		return hManyParametersDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHManyParametersDetector__Calculate__TClass() {
		return hManyParametersDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHManyParametersDetector__CalculateRelativeThreshold__HRelativeValueConstants() {
		return hManyParametersDetectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMuchOverloadingDetector() {
		return hMuchOverloadingDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMuchOverloadingDetector__Calculate__TClass() {
		return hMuchOverloadingDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMuchOverloadingDetector__CalculateRelativeThreshold__HRelativeValueConstants() {
		return hMuchOverloadingDetectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHIntenseFieldUsageDetector() {
		return hIntenseFieldUsageDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHIntenseFieldUsageDetector__Calculate__TClass() {
		return hIntenseFieldUsageDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHIntenseFieldUsageDetector__CalculateRelativeThreshold__HRelativeValueConstants() {
		return hIntenseFieldUsageDetectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		hContollerClassDetectorEClass = createEClass(HCONTOLLER_CLASS_DETECTOR);
		createEOperation(hContollerClassDetectorEClass, HCONTOLLER_CLASS_DETECTOR___CALCULATE__TCLASS);
		createEOperation(hContollerClassDetectorEClass,
				HCONTOLLER_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS);

		hDataClassDetectorEClass = createEClass(HDATA_CLASS_DETECTOR);
		createEOperation(hDataClassDetectorEClass, HDATA_CLASS_DETECTOR___CALCULATE__TCLASS);
		createEOperation(hDataClassDetectorEClass, HDATA_CLASS_DETECTOR___MAKE_CHILD_DC__TCLASS_HDATACLASSSMELL);
		createEOperation(hDataClassDetectorEClass,
				HDATA_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS);

		hEmptyClassDetectorEClass = createEClass(HEMPTY_CLASS_DETECTOR);
		createEOperation(hEmptyClassDetectorEClass, HEMPTY_CLASS_DETECTOR___CALCULATE__TCLASS);

		hGetterSetterDetectorEClass = createEClass(HGETTER_SETTER_DETECTOR);
		createEOperation(hGetterSetterDetectorEClass, HGETTER_SETTER_DETECTOR___IS_GETTER_SETTER__TMETHODDEFINITION);
		createEOperation(hGetterSetterDetectorEClass, HGETTER_SETTER_DETECTOR___CALCULATE__TCLASS);

		hLargeClassLowCohesionDetectorEClass = createEClass(HLARGE_CLASS_LOW_COHESION_DETECTOR);
		createEOperation(hLargeClassLowCohesionDetectorEClass, HLARGE_CLASS_LOW_COHESION_DETECTOR___CALCULATE__TCLASS);

		hLargeClassDetectorEClass = createEClass(HLARGE_CLASS_DETECTOR);
		createEOperation(hLargeClassDetectorEClass, HLARGE_CLASS_DETECTOR___CALCULATE__TCLASS);
		createEOperation(hLargeClassDetectorEClass,
				HLARGE_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS);

		hLowCohesionDetectorEClass = createEClass(HLOW_COHESION_DETECTOR);
		createEOperation(hLowCohesionDetectorEClass, HLOW_COHESION_DETECTOR___CALCULATE__TCLASS);
		createEOperation(hLowCohesionDetectorEClass,
				HLOW_COHESION_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS);

		hDataClassAccessorDetectorEClass = createEClass(HDATA_CLASS_ACCESSOR_DETECTOR);
		createEOperation(hDataClassAccessorDetectorEClass, HDATA_CLASS_ACCESSOR_DETECTOR___CALCULATE__TCLASS);

		hManyParametersDetectorEClass = createEClass(HMANY_PARAMETERS_DETECTOR);
		createEOperation(hManyParametersDetectorEClass, HMANY_PARAMETERS_DETECTOR___CALCULATE__TCLASS);
		createEOperation(hManyParametersDetectorEClass,
				HMANY_PARAMETERS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS);

		hMuchOverloadingDetectorEClass = createEClass(HMUCH_OVERLOADING_DETECTOR);
		createEOperation(hMuchOverloadingDetectorEClass, HMUCH_OVERLOADING_DETECTOR___CALCULATE__TCLASS);
		createEOperation(hMuchOverloadingDetectorEClass,
				HMUCH_OVERLOADING_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS);

		hIntenseFieldUsageDetectorEClass = createEClass(HINTENSE_FIELD_USAGE_DETECTOR);
		createEOperation(hIntenseFieldUsageDetectorEClass, HINTENSE_FIELD_USAGE_DETECTOR___CALCULATE__TCLASS);
		createEOperation(hIntenseFieldUsageDetectorEClass,
				HINTENSE_FIELD_USAGE_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS);
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
		DetectionPackage theDetectionPackage = (DetectionPackage) EPackage.Registry.INSTANCE
				.getEPackage(DetectionPackage.eNS_URI);
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage) EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage theCodesmellsPackage_1 = (org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hContollerClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHCodeSmellDetector());
		hContollerClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hContollerClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHRelativeDetector());
		hDataClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHCodeSmellDetector());
		hDataClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hDataClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHRelativeDetector());
		hEmptyClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hEmptyClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHCodeSmellDetector());
		hGetterSetterDetectorEClass.getESuperTypes().add(theDetectionPackage.getHCodeSmellDetector());
		hGetterSetterDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hLargeClassLowCohesionDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hLargeClassLowCohesionDetectorEClass.getESuperTypes().add(theDetectionPackage.getHCodeSmellDetector());
		hLargeClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hLargeClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHCodeSmellDetector());
		hLargeClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHRelativeDetector());
		hLowCohesionDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hLowCohesionDetectorEClass.getESuperTypes().add(theDetectionPackage.getHCodeSmellDetector());
		hLowCohesionDetectorEClass.getESuperTypes().add(theDetectionPackage.getHRelativeDetector());
		hDataClassAccessorDetectorEClass.getESuperTypes().add(theDetectionPackage.getHCodeSmellDetector());
		hDataClassAccessorDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hManyParametersDetectorEClass.getESuperTypes().add(theDetectionPackage.getHCodeSmellDetector());
		hManyParametersDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hManyParametersDetectorEClass.getESuperTypes().add(theDetectionPackage.getHRelativeDetector());
		hMuchOverloadingDetectorEClass.getESuperTypes().add(theDetectionPackage.getHCodeSmellDetector());
		hMuchOverloadingDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hMuchOverloadingDetectorEClass.getESuperTypes().add(theDetectionPackage.getHRelativeDetector());
		hIntenseFieldUsageDetectorEClass.getESuperTypes().add(theDetectionPackage.getHCodeSmellDetector());
		hIntenseFieldUsageDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hIntenseFieldUsageDetectorEClass.getESuperTypes().add(theDetectionPackage.getHRelativeDetector());

		// Initialize classes, features, and operations; add parameters
		initEClass(hContollerClassDetectorEClass, HContollerClassDetector.class, "HContollerClassDetector",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getHContollerClassDetector__Calculate__TClass(),
				theAntipatterngraphPackage.getHAnnotation(), "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHContollerClassDetector__CalculateRelativeThreshold__HRelativeValueConstants(),
				ecorePackage.getEDouble(), "calculateRelativeThreshold", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theValuesPackage.getHRelativeValueConstants(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hDataClassDetectorEClass, HDataClassDetector.class, "HDataClassDetector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHDataClassDetector__Calculate__TClass(), theAntipatterngraphPackage.getHAnnotation(),
				"calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHDataClassDetector__MakeChildDC__TClass_HDataClassSmell(), null, "makeChildDC", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCodesmellsPackage_1.getHDataClassSmell(), "tSmell", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHDataClassDetector__CalculateRelativeThreshold__HRelativeValueConstants(),
				ecorePackage.getEDouble(), "calculateRelativeThreshold", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theValuesPackage.getHRelativeValueConstants(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hEmptyClassDetectorEClass, HEmptyClassDetector.class, "HEmptyClassDetector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHEmptyClassDetector__Calculate__TClass(), theAntipatterngraphPackage.getHAnnotation(),
				"calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hGetterSetterDetectorEClass, HGetterSetterDetector.class, "HGetterSetterDetector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHGetterSetterDetector__IsGetterSetter__TMethodDefinition(), ecorePackage.getEBoolean(),
				"isGetterSetter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTMethodDefinition(), "method", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHGetterSetterDetector__Calculate__TClass(), theAntipatterngraphPackage.getHAnnotation(),
				"calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hLargeClassLowCohesionDetectorEClass, HLargeClassLowCohesionDetector.class,
				"HLargeClassLowCohesionDetector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHLargeClassLowCohesionDetector__Calculate__TClass(),
				theAntipatterngraphPackage.getHAnnotation(), "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hLargeClassDetectorEClass, HLargeClassDetector.class, "HLargeClassDetector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHLargeClassDetector__Calculate__TClass(), theAntipatterngraphPackage.getHAnnotation(),
				"calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHLargeClassDetector__CalculateRelativeThreshold__HRelativeValueConstants(),
				ecorePackage.getEDouble(), "calculateRelativeThreshold", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theValuesPackage.getHRelativeValueConstants(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hLowCohesionDetectorEClass, HLowCohesionDetector.class, "HLowCohesionDetector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHLowCohesionDetector__Calculate__TClass(), theAntipatterngraphPackage.getHAnnotation(),
				"calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHLowCohesionDetector__CalculateRelativeThreshold__HRelativeValueConstants(),
				ecorePackage.getEDouble(), "calculateRelativeThreshold", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theValuesPackage.getHRelativeValueConstants(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hDataClassAccessorDetectorEClass, HDataClassAccessorDetector.class, "HDataClassAccessorDetector",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHDataClassAccessorDetector__Calculate__TClass(),
				theAntipatterngraphPackage.getHAnnotation(), "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hManyParametersDetectorEClass, HManyParametersDetector.class, "HManyParametersDetector",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHManyParametersDetector__Calculate__TClass(),
				theAntipatterngraphPackage.getHAnnotation(), "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHManyParametersDetector__CalculateRelativeThreshold__HRelativeValueConstants(),
				ecorePackage.getEDouble(), "calculateRelativeThreshold", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theValuesPackage.getHRelativeValueConstants(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hMuchOverloadingDetectorEClass, HMuchOverloadingDetector.class, "HMuchOverloadingDetector",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHMuchOverloadingDetector__Calculate__TClass(),
				theAntipatterngraphPackage.getHAnnotation(), "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHMuchOverloadingDetector__CalculateRelativeThreshold__HRelativeValueConstants(),
				ecorePackage.getEDouble(), "calculateRelativeThreshold", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theValuesPackage.getHRelativeValueConstants(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hIntenseFieldUsageDetectorEClass, HIntenseFieldUsageDetector.class, "HIntenseFieldUsageDetector",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHIntenseFieldUsageDetector__Calculate__TClass(),
				theAntipatterngraphPackage.getHAnnotation(), "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHIntenseFieldUsageDetector__CalculateRelativeThreshold__HRelativeValueConstants(),
				ecorePackage.getEDouble(), "calculateRelativeThreshold", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theValuesPackage.getHRelativeValueConstants(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //CodesmellsPackageImpl
