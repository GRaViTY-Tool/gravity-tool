/**
 */
package org.gravity.hulk.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HAntiPatternResolving;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
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

import org.gravity.typegraph.basic.BasicPackage;

import org.moflon.core.dfs.DfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HulkPackageImpl extends EPackageImpl implements HulkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAntiPatternDetectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAntiPatternResolvingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAntiPatternHandlingEClass = null;

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
	 * @see org.gravity.hulk.HulkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HulkPackageImpl() {
		super(eNS_URI, HulkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HulkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HulkPackage init() {
		if (isInited)
			return (HulkPackage) EPackage.Registry.INSTANCE.getEPackage(HulkPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHulkPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HulkPackageImpl theHulkPackage = registeredHulkPackage instanceof HulkPackageImpl
				? (HulkPackageImpl) registeredHulkPackage
				: new HulkPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DfsPackage.eINSTANCE.eClass();
		AntipatterngraphPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DetectionPackage.eNS_URI);
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

		// Create package meta-data objects
		theHulkPackage.createPackageContents();
		theDetectionPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theHulkPackage.initializePackageContents();
		theDetectionPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHulkPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HulkPackage.eNS_URI, theHulkPackage);
		return theHulkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAntiPatternDetection() {
		return hAntiPatternDetectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternDetection__CreateAntiPatternDependencies__DFSGraph() {
		return hAntiPatternDetectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternDetection__CreateCodeSmellDependencies__DFSGraph() {
		return hAntiPatternDetectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternDetection__CreateMetricDependencies__DFSGraph() {
		return hAntiPatternDetectionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternDetection__Execute() {
		return hAntiPatternDetectionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternDetection__GetDependencyGraph() {
		return hAntiPatternDetectionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAntiPatternResolving() {
		return hAntiPatternResolvingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternResolving__CreateResolveCalculatorDependency__DFSGraph() {
		return hAntiPatternResolvingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternResolving__GetDependencyGraph() {
		return hAntiPatternResolvingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternResolving__Execute() {
		return hAntiPatternResolvingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternResolving__CreateResolveAntiPatternDependency__DFSGraph() {
		return hAntiPatternResolvingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternResolving__GetSuperDependencyGraph() {
		return hAntiPatternResolvingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDetector() {
		return hDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDetector_HAnnotation() {
		return (EReference) hDetectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDetector_HAntiPatternHandling() {
		return (EReference) hDetectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHDetector__Detect__HAntiPatternGraph() {
		return hDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAntiPatternHandling() {
		return hAntiPatternHandlingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHAntiPatternHandling_HDetector() {
		return (EReference) hAntiPatternHandlingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHAntiPatternHandling_Apg() {
		return (EReference) hAntiPatternHandlingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHAntiPatternHandling_Programlocation() {
		return (EAttribute) hAntiPatternHandlingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternHandling__Execute() {
		return hAntiPatternHandlingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternHandling__GetDependencyGraph() {
		return hAntiPatternHandlingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HulkFactory getHulkFactory() {
		return (HulkFactory) getEFactoryInstance();
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
		hAntiPatternDetectionEClass = createEClass(HANTI_PATTERN_DETECTION);
		createEOperation(hAntiPatternDetectionEClass,
				HANTI_PATTERN_DETECTION___CREATE_ANTI_PATTERN_DEPENDENCIES__DFSGRAPH);
		createEOperation(hAntiPatternDetectionEClass,
				HANTI_PATTERN_DETECTION___CREATE_CODE_SMELL_DEPENDENCIES__DFSGRAPH);
		createEOperation(hAntiPatternDetectionEClass, HANTI_PATTERN_DETECTION___CREATE_METRIC_DEPENDENCIES__DFSGRAPH);
		createEOperation(hAntiPatternDetectionEClass, HANTI_PATTERN_DETECTION___EXECUTE);
		createEOperation(hAntiPatternDetectionEClass, HANTI_PATTERN_DETECTION___GET_DEPENDENCY_GRAPH);

		hAntiPatternResolvingEClass = createEClass(HANTI_PATTERN_RESOLVING);
		createEOperation(hAntiPatternResolvingEClass,
				HANTI_PATTERN_RESOLVING___CREATE_RESOLVE_CALCULATOR_DEPENDENCY__DFSGRAPH);
		createEOperation(hAntiPatternResolvingEClass, HANTI_PATTERN_RESOLVING___GET_DEPENDENCY_GRAPH);
		createEOperation(hAntiPatternResolvingEClass, HANTI_PATTERN_RESOLVING___EXECUTE);
		createEOperation(hAntiPatternResolvingEClass,
				HANTI_PATTERN_RESOLVING___CREATE_RESOLVE_ANTI_PATTERN_DEPENDENCY__DFSGRAPH);
		createEOperation(hAntiPatternResolvingEClass, HANTI_PATTERN_RESOLVING___GET_SUPER_DEPENDENCY_GRAPH);

		hDetectorEClass = createEClass(HDETECTOR);
		createEReference(hDetectorEClass, HDETECTOR__HANNOTATION);
		createEReference(hDetectorEClass, HDETECTOR__HANTI_PATTERN_HANDLING);
		createEOperation(hDetectorEClass, HDETECTOR___DETECT__HANTIPATTERNGRAPH);

		hAntiPatternHandlingEClass = createEClass(HANTI_PATTERN_HANDLING);
		createEReference(hAntiPatternHandlingEClass, HANTI_PATTERN_HANDLING__HDETECTOR);
		createEReference(hAntiPatternHandlingEClass, HANTI_PATTERN_HANDLING__APG);
		createEAttribute(hAntiPatternHandlingEClass, HANTI_PATTERN_HANDLING__PROGRAMLOCATION);
		createEOperation(hAntiPatternHandlingEClass, HANTI_PATTERN_HANDLING___EXECUTE);
		createEOperation(hAntiPatternHandlingEClass, HANTI_PATTERN_HANDLING___GET_DEPENDENCY_GRAPH);
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
		DfsPackage theDfsPackage = (DfsPackage) EPackage.Registry.INSTANCE.getEPackage(DfsPackage.eNS_URI);
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDetectionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hAntiPatternDetectionEClass.getESuperTypes().add(this.getHAntiPatternHandling());
		hAntiPatternResolvingEClass.getESuperTypes().add(this.getHAntiPatternDetection());
		hDetectorEClass.getESuperTypes().add(theDfsPackage.getNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(hAntiPatternDetectionEClass, HAntiPatternDetection.class, "HAntiPatternDetection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getHAntiPatternDetection__CreateAntiPatternDependencies__DFSGraph(), null,
				"createAntiPatternDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDfsPackage.getDFSGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHAntiPatternDetection__CreateCodeSmellDependencies__DFSGraph(), null,
				"createCodeSmellDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDfsPackage.getDFSGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHAntiPatternDetection__CreateMetricDependencies__DFSGraph(), null,
				"createMetricDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDfsPackage.getDFSGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHAntiPatternDetection__Execute(), ecorePackage.getEBoolean(), "execute", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getHAntiPatternDetection__GetDependencyGraph(), theDfsPackage.getDFSGraph(),
				"getDependencyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hAntiPatternResolvingEClass, HAntiPatternResolving.class, "HAntiPatternResolving", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHAntiPatternResolving__CreateResolveCalculatorDependency__DFSGraph(), null,
				"createResolveCalculatorDependency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDfsPackage.getDFSGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHAntiPatternResolving__GetDependencyGraph(), theDfsPackage.getDFSGraph(),
				"getDependencyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHAntiPatternResolving__Execute(), ecorePackage.getEBoolean(), "execute", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getHAntiPatternResolving__CreateResolveAntiPatternDependency__DFSGraph(), null,
				"createResolveAntiPatternDependency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDfsPackage.getDFSGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHAntiPatternResolving__GetSuperDependencyGraph(), theDfsPackage.getDFSGraph(),
				"getSuperDependencyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hDetectorEClass, HDetector.class, "HDetector", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHDetector_HAnnotation(), theAntipatterngraphPackage.getHAnnotation(), null, "hAnnotation",
				null, 0, -1, HDetector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDetector_HAntiPatternHandling(), this.getHAntiPatternHandling(),
				this.getHAntiPatternHandling_HDetector(), "hAntiPatternHandling", null, 1, 1, HDetector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getHDetector__Detect__HAntiPatternGraph(), ecorePackage.getEBoolean(), "detect", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "apg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hAntiPatternHandlingEClass, HAntiPatternHandling.class, "HAntiPatternHandling", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHAntiPatternHandling_HDetector(), this.getHDetector(),
				this.getHDetector_HAntiPatternHandling(), "hDetector", null, 0, -1, HAntiPatternHandling.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHAntiPatternHandling_Apg(), theAntipatterngraphPackage.getHAntiPatternGraph(), null, "apg",
				null, 1, 1, HAntiPatternHandling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHAntiPatternHandling_Programlocation(), ecorePackage.getEString(), "programlocation", null, 1,
				1, HAntiPatternHandling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getHAntiPatternHandling__Execute(), ecorePackage.getEBoolean(), "execute", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getHAntiPatternHandling__GetDependencyGraph(), theDfsPackage.getDFSGraph(), "getDependencyGraph",
				0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HulkPackageImpl
