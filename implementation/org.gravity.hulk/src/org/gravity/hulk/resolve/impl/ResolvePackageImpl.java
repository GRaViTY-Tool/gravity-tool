/**
 */
package org.gravity.hulk.resolve.impl;

import org.eclipse.emf.ecore.EClass;
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

import org.gravity.hulk.resolve.HAntiPatternResolver;
import org.gravity.hulk.resolve.HResolver;
import org.gravity.hulk.resolve.ResolveFactory;
import org.gravity.hulk.resolve.ResolvePackage;

import org.gravity.hulk.resolve.calculators.CalculatorsPackage;

import org.gravity.hulk.resolve.calculators.impl.CalculatorsPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.moflon.core.dfs.DfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResolvePackageImpl extends EPackageImpl implements ResolvePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAntiPatternResolverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hResolverEClass = null;

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
	 * @see org.gravity.hulk.resolve.ResolvePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResolvePackageImpl() {
		super(eNS_URI, ResolveFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResolvePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResolvePackage init() {
		if (isInited)
			return (ResolvePackage) EPackage.Registry.INSTANCE.getEPackage(ResolvePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredResolvePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ResolvePackageImpl theResolvePackage = registeredResolvePackage instanceof ResolvePackageImpl
				? (ResolvePackageImpl) registeredResolvePackage
				: new ResolvePackageImpl();

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
		theResolvePackage.createPackageContents();
		theHulkPackage.createPackageContents();
		theDetectionPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theCalculatorsPackage.createPackageContents();
		theAntipatternPackage_1.createPackageContents();

		// Initialize created meta-data
		theResolvePackage.initializePackageContents();
		theHulkPackage.initializePackageContents();
		theDetectionPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theCalculatorsPackage.initializePackageContents();
		theAntipatternPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResolvePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResolvePackage.eNS_URI, theResolvePackage);
		return theResolvePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAntiPatternResolver() {
		return hAntiPatternResolverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHResolver() {
		return hResolverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveFactory getResolveFactory() {
		return (ResolveFactory) getEFactoryInstance();
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
		hAntiPatternResolverEClass = createEClass(HANTI_PATTERN_RESOLVER);

		hResolverEClass = createEClass(HRESOLVER);
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
		CalculatorsPackage theCalculatorsPackage = (CalculatorsPackage) EPackage.Registry.INSTANCE
				.getEPackage(CalculatorsPackage.eNS_URI);
		org.gravity.hulk.resolve.antipattern.AntipatternPackage theAntipatternPackage_1 = (org.gravity.hulk.resolve.antipattern.AntipatternPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.hulk.resolve.antipattern.AntipatternPackage.eNS_URI);
		HulkPackage theHulkPackage = (HulkPackage) EPackage.Registry.INSTANCE.getEPackage(HulkPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCalculatorsPackage);
		getESubpackages().add(theAntipatternPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hAntiPatternResolverEClass.getESuperTypes().add(this.getHResolver());
		hResolverEClass.getESuperTypes().add(theHulkPackage.getHDetector());

		// Initialize classes, features, and operations; add parameters
		initEClass(hAntiPatternResolverEClass, HAntiPatternResolver.class, "HAntiPatternResolver", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hResolverEClass, HResolver.class, "HResolver", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //ResolvePackageImpl
