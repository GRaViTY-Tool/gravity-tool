/**
 */
package org.gravity.hulk.resolve.antipattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.gravity.hulk.HulkPackage;
import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;
import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl;
import org.gravity.hulk.detection.impl.DetectionPackageImpl;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl;
import org.gravity.hulk.impl.HulkPackageImpl;
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;
import org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage;
import org.gravity.hulk.resolve.ResolvePackage;
import org.gravity.hulk.resolve.antipattern.AntipatternFactory;
import org.gravity.hulk.resolve.antipattern.AntipatternPackage;
import org.gravity.hulk.resolve.antipattern.HAlternativeBlobresolver;
import org.gravity.hulk.resolve.antipattern.HBlobResolver;
import org.gravity.hulk.resolve.calculators.CalculatorsPackage;
import org.gravity.hulk.resolve.calculators.impl.CalculatorsPackageImpl;
import org.gravity.hulk.resolve.impl.ResolvePackageImpl;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.annotations.AnnotationsPackage;
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
	private EClass hBlobResolverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAlternativeBlobresolverEClass = null;

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
	 * @see org.gravity.hulk.resolve.antipattern.AntipatternPackage#eNS_URI
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
		registeredPackage = EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.hulk.detection.antipattern.AntipatternPackage.eNS_URI);
		final org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl theAntipatternPackage_1 = (org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl) (registeredPackage instanceof org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl
				? registeredPackage
				: org.gravity.hulk.detection.antipattern.AntipatternPackage.eINSTANCE);
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

		// Create package meta-data objects
		theAntipatternPackage.createPackageContents();
		theHulkPackage.createPackageContents();
		theDetectionPackage.createPackageContents();
		theAntipatternPackage_1.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theResolvePackage.createPackageContents();
		theCalculatorsPackage.createPackageContents();

		// Initialize created meta-data
		theAntipatternPackage.initializePackageContents();
		theHulkPackage.initializePackageContents();
		theDetectionPackage.initializePackageContents();
		theAntipatternPackage_1.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theResolvePackage.initializePackageContents();
		theCalculatorsPackage.initializePackageContents();

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
	public EClass getHBlobResolver() {
		return this.hBlobResolverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHBlobResolver_ExecutedMoves() {
		return (EReference) this.hBlobResolverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHBlobResolver_Original_apg() {
		return (EReference) this.hBlobResolverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHBlobResolver_Copy_apg() {
		return (EReference) this.hBlobResolverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHBlobResolver__Detect__HAntiPatternGraph() {
		return this.hBlobResolverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHBlobResolver__IsRefactoringPossible__HRefactoring() {
		return this.hBlobResolverEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHBlobResolver__CreateMove__TMemberContainer_TClass_TClass_HBlobResolveAnnotation() {
		return this.hBlobResolverEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHBlobResolver__AllowedToTouch__TAnnotatable() {
		return this.hBlobResolverEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHBlobResolver__Init__HAntiPatternGraph() {
		return this.hBlobResolverEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHAlternativeBlobresolver() {
		return this.hAlternativeBlobresolverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHAlternativeBlobresolver__Detect__HAntiPatternGraph() {
		return this.hAlternativeBlobresolverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHAlternativeBlobresolver__Process__HInBlobClusterAccess_TClass_HBlobResolveAnnotation() {
		return this.hAlternativeBlobresolverEClass.getEOperations().get(1);
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
		if (this.isCreated) {
			return;
		}
		this.isCreated = true;

		// Create classes and their features
		this.hBlobResolverEClass = createEClass(HBLOB_RESOLVER);
		createEReference(this.hBlobResolverEClass, HBLOB_RESOLVER__EXECUTED_MOVES);
		createEReference(this.hBlobResolverEClass, HBLOB_RESOLVER__ORIGINAL_APG);
		createEReference(this.hBlobResolverEClass, HBLOB_RESOLVER__COPY_APG);
		createEOperation(this.hBlobResolverEClass, HBLOB_RESOLVER___DETECT__HANTIPATTERNGRAPH);
		createEOperation(this.hBlobResolverEClass, HBLOB_RESOLVER___IS_REFACTORING_POSSIBLE__HREFACTORING);
		createEOperation(this.hBlobResolverEClass,
				HBLOB_RESOLVER___CREATE_MOVE__TMEMBERCONTAINER_TCLASS_TCLASS_HBLOBRESOLVEANNOTATION);
		createEOperation(this.hBlobResolverEClass, HBLOB_RESOLVER___ALLOWED_TO_TOUCH__TANNOTATABLE);
		createEOperation(this.hBlobResolverEClass, HBLOB_RESOLVER___INIT__HANTIPATTERNGRAPH);

		this.hAlternativeBlobresolverEClass = createEClass(HALTERNATIVE_BLOBRESOLVER);
		createEOperation(this.hAlternativeBlobresolverEClass, HALTERNATIVE_BLOBRESOLVER___DETECT__HANTIPATTERNGRAPH);
		createEOperation(this.hAlternativeBlobresolverEClass,
				HALTERNATIVE_BLOBRESOLVER___PROCESS__HINBLOBCLUSTERACCESS_TCLASS_HBLOBRESOLVEANNOTATION);
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
		final ResolvePackage theResolvePackage = (ResolvePackage) EPackage.Registry.INSTANCE
				.getEPackage(ResolvePackage.eNS_URI);
		final RefactoringsPackage theRefactoringsPackage = (RefactoringsPackage) EPackage.Registry.INSTANCE
				.getEPackage(RefactoringsPackage.eNS_URI);
		final AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		final BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		final RefactoringgraphPackage theRefactoringgraphPackage = (RefactoringgraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(RefactoringgraphPackage.eNS_URI);
		final AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage) EPackage.Registry.INSTANCE
				.getEPackage(AnnotationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		this.hBlobResolverEClass.getESuperTypes().add(theDetectionPackage.getHAntiPatternDetector());
		this.hBlobResolverEClass.getESuperTypes().add(theResolvePackage.getHAntiPatternResolver());
		this.hAlternativeBlobresolverEClass.getESuperTypes().add(this.getHBlobResolver());

		// Initialize classes, features, and operations; add parameters
		initEClass(this.hBlobResolverEClass, HBlobResolver.class, "HBlobResolver", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHBlobResolver_ExecutedMoves(), theRefactoringsPackage.getHMoveMethod(), null, "executedMoves",
				null, 0, -1, HBlobResolver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHBlobResolver_Original_apg(), theAntipatterngraphPackage.getHAntiPatternGraph(), null,
				"original_apg", null, 0, 1, HBlobResolver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHBlobResolver_Copy_apg(), theAntipatterngraphPackage.getHAntiPatternGraph(), null, "copy_apg",
				null, 0, 1, HBlobResolver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getHBlobResolver__Detect__HAntiPatternGraph(), this.ecorePackage.getEBoolean(),
				"detect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "apg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHBlobResolver__IsRefactoringPossible__HRefactoring(), this.ecorePackage.getEBoolean(),
				"isRefactoringPossible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRefactoringsPackage.getHRefactoring(), "refactoring", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHBlobResolver__CreateMove__TMemberContainer_TClass_TClass_HBlobResolveAnnotation(),
				theRefactoringsPackage.getHMoveMembers(), "createMove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRefactoringgraphPackage.getHBlobResolveAnnotation(), "parent", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getHBlobResolver__AllowedToTouch__TAnnotatable(), this.ecorePackage.getEBoolean(),
				"allowedToTouch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAnnotationsPackage.getTAnnotatable(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHBlobResolver__Init__HAntiPatternGraph(),
				theAntipatterngraphPackage.getHAntiPatternGraph(), "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "pg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(this.hAlternativeBlobresolverEClass, HAlternativeBlobresolver.class, "HAlternativeBlobresolver",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHAlternativeBlobresolver__Detect__HAntiPatternGraph(), this.ecorePackage.getEBoolean(),
				"detect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "apg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHAlternativeBlobresolver__Process__HInBlobClusterAccess_TClass_HBlobResolveAnnotation(),
				this.ecorePackage.getEBoolean(), "process", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRefactoringgraphPackage.getHInBlobClusterAccess(), "hCluster", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRefactoringgraphPackage.getHBlobResolveAnnotation(), "hParent", 0, 1, IS_UNIQUE,
				IS_ORDERED);
	}

} //AntipatternPackageImpl