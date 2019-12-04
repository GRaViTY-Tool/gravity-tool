/**
 */
package org.gravity.hulk.resolve.calculators.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.detection.DetectionPackage;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;

import org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;

import org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl;

import org.gravity.hulk.detection.impl.DetectionPackageImpl;

import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl;

import org.gravity.hulk.impl.HulkPackageImpl;

import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;

import org.gravity.hulk.resolve.ResolvePackage;

import org.gravity.hulk.resolve.calculators.CalculatorsFactory;
import org.gravity.hulk.resolve.calculators.CalculatorsPackage;
import org.gravity.hulk.resolve.calculators.HClusterAccessCalculator;
import org.gravity.hulk.resolve.calculators.HClusterCalculator;
import org.gravity.hulk.resolve.calculators.HInBlobAccessCalculator;
import org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator;

import org.gravity.hulk.resolve.impl.ResolvePackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.gravity.typegraph.basic.containers.ContainersPackage;

import org.moflon.core.dfs.DfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CalculatorsPackageImpl extends EPackageImpl implements CalculatorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMethodToDataClassAccessCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hInBlobAccessCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hClusterCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hClusterAccessCalculatorEClass = null;

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
	 * @see org.gravity.hulk.resolve.calculators.CalculatorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CalculatorsPackageImpl() {
		super(eNS_URI, CalculatorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CalculatorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CalculatorsPackage init() {
		if (isInited)
			return (CalculatorsPackage) EPackage.Registry.INSTANCE.getEPackage(CalculatorsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCalculatorsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CalculatorsPackageImpl theCalculatorsPackage = registeredCalculatorsPackage instanceof CalculatorsPackageImpl
				? (CalculatorsPackageImpl) registeredCalculatorsPackage
				: new CalculatorsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CodesmellsPackage.eNS_URI);
		CodesmellsPackageImpl theCodesmellsPackage = (CodesmellsPackageImpl) (registeredPackage instanceof CodesmellsPackageImpl
				? registeredPackage
				: CodesmellsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl) (registeredPackage instanceof MetricsPackageImpl
				? registeredPackage
				: MetricsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResolvePackage.eNS_URI);
		ResolvePackageImpl theResolvePackage = (ResolvePackageImpl) (registeredPackage instanceof ResolvePackageImpl
				? registeredPackage
				: ResolvePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.hulk.resolve.antipattern.AntipatternPackage.eNS_URI);
		org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl theAntipatternPackage_1 = (org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl) (registeredPackage instanceof org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl
				? registeredPackage
				: org.gravity.hulk.resolve.antipattern.AntipatternPackage.eINSTANCE);

		// Create package meta-data objects
		theCalculatorsPackage.createPackageContents();
		theHulkPackage.createPackageContents();
		theDetectionPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theResolvePackage.createPackageContents();
		theAntipatternPackage_1.createPackageContents();

		// Initialize created meta-data
		theCalculatorsPackage.initializePackageContents();
		theHulkPackage.initializePackageContents();
		theDetectionPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theResolvePackage.initializePackageContents();
		theAntipatternPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCalculatorsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CalculatorsPackage.eNS_URI, theCalculatorsPackage);
		return theCalculatorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMethodToDataClassAccessCalculator() {
		return hMethodToDataClassAccessCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMethodToDataClassAccessCalculator__Detect__HAntiPatternGraph() {
		return hMethodToDataClassAccessCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMethodToDataClassAccessCalculator__GetAllAffectedMembers__TClass() {
		return hMethodToDataClassAccessCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHInBlobAccessCalculator() {
		return hInBlobAccessCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHInBlobAccessCalculator__Detect__HAntiPatternGraph() {
		return hInBlobAccessCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHClusterCalculator() {
		return hClusterCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHClusterCalculator__Detect__TClass() {
		return hClusterCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHClusterCalculator__Detect__HAntiPatternGraph() {
		return hClusterCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHClusterAccessCalculator() {
		return hClusterAccessCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHClusterAccessCalculator__Detect__HAntiPatternGraph() {
		return hClusterAccessCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorsFactory getCalculatorsFactory() {
		return (CalculatorsFactory) getEFactoryInstance();
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
		hMethodToDataClassAccessCalculatorEClass = createEClass(HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR);
		createEOperation(hMethodToDataClassAccessCalculatorEClass,
				HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH);
		createEOperation(hMethodToDataClassAccessCalculatorEClass,
				HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR___GET_ALL_AFFECTED_MEMBERS__TCLASS);

		hInBlobAccessCalculatorEClass = createEClass(HIN_BLOB_ACCESS_CALCULATOR);
		createEOperation(hInBlobAccessCalculatorEClass, HIN_BLOB_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH);

		hClusterCalculatorEClass = createEClass(HCLUSTER_CALCULATOR);
		createEOperation(hClusterCalculatorEClass, HCLUSTER_CALCULATOR___DETECT__TCLASS);
		createEOperation(hClusterCalculatorEClass, HCLUSTER_CALCULATOR___DETECT__HANTIPATTERNGRAPH);

		hClusterAccessCalculatorEClass = createEClass(HCLUSTER_ACCESS_CALCULATOR);
		createEOperation(hClusterAccessCalculatorEClass, HCLUSTER_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH);
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
		ResolvePackage theResolvePackage = (ResolvePackage) EPackage.Registry.INSTANCE
				.getEPackage(ResolvePackage.eNS_URI);
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		ContainersPackage theContainersPackage = (ContainersPackage) EPackage.Registry.INSTANCE
				.getEPackage(ContainersPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hMethodToDataClassAccessCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHMetricCalculator());
		hMethodToDataClassAccessCalculatorEClass.getESuperTypes().add(theResolvePackage.getHResolver());
		hInBlobAccessCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHMetricCalculator());
		hInBlobAccessCalculatorEClass.getESuperTypes().add(theResolvePackage.getHResolver());
		hClusterCalculatorEClass.getESuperTypes().add(theResolvePackage.getHResolver());
		hClusterAccessCalculatorEClass.getESuperTypes().add(theResolvePackage.getHResolver());

		// Initialize classes, features, and operations; add parameters
		initEClass(hMethodToDataClassAccessCalculatorEClass, HMethodToDataClassAccessCalculator.class,
				"HMethodToDataClassAccessCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getHMethodToDataClassAccessCalculator__Detect__HAntiPatternGraph(),
				ecorePackage.getEBoolean(), "detect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "apg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHMethodToDataClassAccessCalculator__GetAllAffectedMembers__TClass(),
				theContainersPackage.getTMemberContainer(), "getAllAffectedMembers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hInBlobAccessCalculatorEClass, HInBlobAccessCalculator.class, "HInBlobAccessCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHInBlobAccessCalculator__Detect__HAntiPatternGraph(), ecorePackage.getEBoolean(),
				"detect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "apg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hClusterCalculatorEClass, HClusterCalculator.class, "HClusterCalculator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHClusterCalculator__Detect__TClass(), ecorePackage.getEBoolean(), "detect", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHClusterCalculator__Detect__HAntiPatternGraph(), ecorePackage.getEBoolean(), "detect", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "apg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hClusterAccessCalculatorEClass, HClusterAccessCalculator.class, "HClusterAccessCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHClusterAccessCalculator__Detect__HAntiPatternGraph(), ecorePackage.getEBoolean(),
				"detect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "apg", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //CalculatorsPackageImpl
