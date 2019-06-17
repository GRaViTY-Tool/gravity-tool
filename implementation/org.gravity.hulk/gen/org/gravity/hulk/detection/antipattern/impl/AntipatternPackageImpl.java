/**
 */
package org.gravity.hulk.detection.antipattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.detection.DetectionPackage;

import org.gravity.hulk.detection.antipattern.AntipatternFactory;
import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.hulk.detection.antipattern.HBlobDetector;
import org.gravity.hulk.detection.antipattern.HGodClassDetector;
import org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector;
import org.gravity.hulk.detection.antipattern.HSwissArmyKnifeDetector;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;

import org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl;

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
public class AntipatternPackageImpl extends EPackageImpl implements AntipatternPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hBlobDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hGodClassDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSwissArmyKnifeDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSpaghettiCodeDetectorEClass = null;

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
	 * @see org.gravity.hulk.detection.antipattern.AntipatternPackage#eNS_URI
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
		theAntipatternPackage.createPackageContents();
		theHulkPackage.createPackageContents();
		theDetectionPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theResolvePackage.createPackageContents();
		theCalculatorsPackage.createPackageContents();
		theAntipatternPackage_1.createPackageContents();

		// Initialize created meta-data
		theAntipatternPackage.initializePackageContents();
		theHulkPackage.initializePackageContents();
		theDetectionPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theResolvePackage.initializePackageContents();
		theCalculatorsPackage.initializePackageContents();
		theAntipatternPackage_1.initializePackageContents();

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
	public EClass getHBlobDetector() {
		return hBlobDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHBlobDetector__Calculate__TClass() {
		return hBlobDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHGodClassDetector() {
		return hGodClassDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGodClassDetector__Calculate__TClass() {
		return hGodClassDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHSwissArmyKnifeDetector() {
		return hSwissArmyKnifeDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHSwissArmyKnifeDetector__Calculate__TClass() {
		return hSwissArmyKnifeDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHSpaghettiCodeDetector() {
		return hSpaghettiCodeDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHSpaghettiCodeDetector__Calculate__TClass() {
		return hSpaghettiCodeDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHSpaghettiCodeDetector__Collect__HAnnotation() {
		return hSpaghettiCodeDetectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHSpaghettiCodeDetector__Connect__HSpaghettiCodeAntiPattern() {
		return hSpaghettiCodeDetectorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		hBlobDetectorEClass = createEClass(HBLOB_DETECTOR);
		createEOperation(hBlobDetectorEClass, HBLOB_DETECTOR___CALCULATE__TCLASS);

		hGodClassDetectorEClass = createEClass(HGOD_CLASS_DETECTOR);
		createEOperation(hGodClassDetectorEClass, HGOD_CLASS_DETECTOR___CALCULATE__TCLASS);

		hSwissArmyKnifeDetectorEClass = createEClass(HSWISS_ARMY_KNIFE_DETECTOR);
		createEOperation(hSwissArmyKnifeDetectorEClass, HSWISS_ARMY_KNIFE_DETECTOR___CALCULATE__TCLASS);

		hSpaghettiCodeDetectorEClass = createEClass(HSPAGHETTI_CODE_DETECTOR);
		createEOperation(hSpaghettiCodeDetectorEClass, HSPAGHETTI_CODE_DETECTOR___CALCULATE__TCLASS);
		createEOperation(hSpaghettiCodeDetectorEClass, HSPAGHETTI_CODE_DETECTOR___COLLECT__HANNOTATION);
		createEOperation(hSpaghettiCodeDetectorEClass, HSPAGHETTI_CODE_DETECTOR___CONNECT__HSPAGHETTICODEANTIPATTERN);
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
		org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage theAntipatternPackage_2 = (org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hBlobDetectorEClass.getESuperTypes().add(theDetectionPackage.getHAntiPatternDetector());
		hBlobDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hGodClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHAntiPatternDetector());
		hGodClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hSwissArmyKnifeDetectorEClass.getESuperTypes().add(theDetectionPackage.getHAntiPatternDetector());
		hSwissArmyKnifeDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hSpaghettiCodeDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		hSpaghettiCodeDetectorEClass.getESuperTypes().add(theDetectionPackage.getHAntiPatternDetector());

		// Initialize classes, features, and operations; add parameters
		initEClass(hBlobDetectorEClass, HBlobDetector.class, "HBlobDetector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getHBlobDetector__Calculate__TClass(),
				theAntipatterngraphPackage.getHAnnotation(), "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hGodClassDetectorEClass, HGodClassDetector.class, "HGodClassDetector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHGodClassDetector__Calculate__TClass(), theAntipatterngraphPackage.getHAnnotation(),
				"calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hSwissArmyKnifeDetectorEClass, HSwissArmyKnifeDetector.class, "HSwissArmyKnifeDetector",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHSwissArmyKnifeDetector__Calculate__TClass(),
				theAntipatterngraphPackage.getHAnnotation(), "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hSpaghettiCodeDetectorEClass, HSpaghettiCodeDetector.class, "HSpaghettiCodeDetector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHSpaghettiCodeDetector__Calculate__TClass(), theAntipatterngraphPackage.getHAnnotation(),
				"calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHSpaghettiCodeDetector__Collect__HAnnotation(), ecorePackage.getEBoolean(), "collect", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAnnotation(), "hAnnotation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHSpaghettiCodeDetector__Connect__HSpaghettiCodeAntiPattern(), ecorePackage.getEBoolean(),
				"connect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatternPackage_2.getHSpaghettiCodeAntiPattern(), "hAntiPattern", 0, 1, IS_UNIQUE,
				IS_ORDERED);
	}

} //AntipatternPackageImpl
