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
	private EClass hBlobDetectorEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hGodClassDetectorEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSwissArmyKnifeDetectorEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSpaghettiCodeDetectorEClass;

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
		if (isInited) {
			return (AntipatternPackage) EPackage.Registry.INSTANCE.getEPackage(AntipatternPackage.eNS_URI);
		}

		// Obtain or create and register package
		final Object registeredAntipatternPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		final AntipatternPackageImpl theAntipatternPackage = registeredAntipatternPackage instanceof AntipatternPackageImpl
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
				final HulkPackageImpl theHulkPackage = (HulkPackageImpl) (registeredPackage instanceof HulkPackageImpl
						? registeredPackage
								: HulkPackage.eINSTANCE);
				registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DetectionPackage.eNS_URI);
				final DetectionPackageImpl theDetectionPackage = (DetectionPackageImpl) (registeredPackage instanceof DetectionPackageImpl
						? registeredPackage
								: DetectionPackage.eINSTANCE);
				registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CodesmellsPackage.eNS_URI);
				final CodesmellsPackageImpl theCodesmellsPackage = (CodesmellsPackageImpl) (registeredPackage instanceof CodesmellsPackageImpl
						? registeredPackage
								: CodesmellsPackage.eINSTANCE);
				registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
				final MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl) (registeredPackage instanceof MetricsPackageImpl
						? registeredPackage
								: MetricsPackage.eINSTANCE);
				registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResolvePackage.eNS_URI);
				final ResolvePackageImpl theResolvePackage = (ResolvePackageImpl) (registeredPackage instanceof ResolvePackageImpl
						? registeredPackage
								: ResolvePackage.eINSTANCE);
				registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CalculatorsPackage.eNS_URI);
				final CalculatorsPackageImpl theCalculatorsPackage = (CalculatorsPackageImpl) (registeredPackage instanceof CalculatorsPackageImpl
						? registeredPackage
								: CalculatorsPackage.eINSTANCE);
				registeredPackage = EPackage.Registry.INSTANCE
						.getEPackage(org.gravity.hulk.resolve.antipattern.AntipatternPackage.eNS_URI);
				final org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl theAntipatternPackage_1 = (org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl) (registeredPackage instanceof org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl
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
	@Override
	public EClass getHBlobDetector() {
		return this.hBlobDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHBlobDetector__Calculate__TClass() {
		return this.hBlobDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHGodClassDetector() {
		return this.hGodClassDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHGodClassDetector__Calculate__TClass() {
		return this.hGodClassDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHSwissArmyKnifeDetector() {
		return this.hSwissArmyKnifeDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSwissArmyKnifeDetector__Calculate__TClass() {
		return this.hSwissArmyKnifeDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHSpaghettiCodeDetector() {
		return this.hSpaghettiCodeDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSpaghettiCodeDetector__Calculate__TClass() {
		return this.hSpaghettiCodeDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSpaghettiCodeDetector__Collect__HAnnotation() {
		return this.hSpaghettiCodeDetectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSpaghettiCodeDetector__Connect__HSpaghettiCodeAntiPattern() {
		return this.hSpaghettiCodeDetectorEClass.getEOperations().get(2);
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
	private boolean isCreated;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (this.isCreated) {
			return;
		}
		this.isCreated = true;

		// Create classes and their features
		this.hBlobDetectorEClass = createEClass(HBLOB_DETECTOR);
		createEOperation(this.hBlobDetectorEClass, HBLOB_DETECTOR___CALCULATE__TCLASS);

		this.hGodClassDetectorEClass = createEClass(HGOD_CLASS_DETECTOR);
		createEOperation(this.hGodClassDetectorEClass, HGOD_CLASS_DETECTOR___CALCULATE__TCLASS);

		this.hSwissArmyKnifeDetectorEClass = createEClass(HSWISS_ARMY_KNIFE_DETECTOR);
		createEOperation(this.hSwissArmyKnifeDetectorEClass, HSWISS_ARMY_KNIFE_DETECTOR___CALCULATE__TCLASS);

		this.hSpaghettiCodeDetectorEClass = createEClass(HSPAGHETTI_CODE_DETECTOR);
		createEOperation(this.hSpaghettiCodeDetectorEClass, HSPAGHETTI_CODE_DETECTOR___CALCULATE__TCLASS);
		createEOperation(this.hSpaghettiCodeDetectorEClass, HSPAGHETTI_CODE_DETECTOR___COLLECT__HANNOTATION);
		createEOperation(this.hSpaghettiCodeDetectorEClass, HSPAGHETTI_CODE_DETECTOR___CONNECT__HSPAGHETTICODEANTIPATTERN);
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
		if (this.isInitialized) {
			return;
		}
		this.isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		final DetectionPackage theDetectionPackage = (DetectionPackage) EPackage.Registry.INSTANCE
				.getEPackage(DetectionPackage.eNS_URI);
		final AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		final BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		final org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage theAntipatternPackage_2 = (org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		this.hBlobDetectorEClass.getESuperTypes().add(theDetectionPackage.getHAntiPatternDetector());
		this.hBlobDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		this.hGodClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHAntiPatternDetector());
		this.hGodClassDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		this.hSwissArmyKnifeDetectorEClass.getESuperTypes().add(theDetectionPackage.getHAntiPatternDetector());
		this.hSwissArmyKnifeDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		this.hSpaghettiCodeDetectorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedCalculator());
		this.hSpaghettiCodeDetectorEClass.getESuperTypes().add(theDetectionPackage.getHAntiPatternDetector());

		// Initialize classes, features, and operations; add parameters
		initEClass(this.hBlobDetectorEClass, HBlobDetector.class, "HBlobDetector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getHBlobDetector__Calculate__TClass(),
				theAntipatterngraphPackage.getHAnnotation(), "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(this.hGodClassDetectorEClass, HGodClassDetector.class, "HGodClassDetector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHGodClassDetector__Calculate__TClass(), theAntipatterngraphPackage.getHAnnotation(),
				"calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(this.hSwissArmyKnifeDetectorEClass, HSwissArmyKnifeDetector.class, "HSwissArmyKnifeDetector",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHSwissArmyKnifeDetector__Calculate__TClass(),
				theAntipatterngraphPackage.getHAnnotation(), "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(this.hSpaghettiCodeDetectorEClass, HSpaghettiCodeDetector.class, "HSpaghettiCodeDetector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHSpaghettiCodeDetector__Calculate__TClass(), theAntipatterngraphPackage.getHAnnotation(),
				"calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHSpaghettiCodeDetector__Collect__HAnnotation(), this.ecorePackage.getEBoolean(), "collect", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAnnotation(), "hAnnotation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHSpaghettiCodeDetector__Connect__HSpaghettiCodeAntiPattern(), this.ecorePackage.getEBoolean(),
				"connect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatternPackage_2.getHSpaghettiCodeAntiPattern(), "hAntiPattern", 0, 1, IS_UNIQUE,
				IS_ORDERED);
	}

} //AntipatternPackageImpl
