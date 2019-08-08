/**
 */
package org.gravity.hulk.refactoringgraph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;

import org.gravity.hulk.antipatterngraph.values.ValuesPackage;

import org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation;
import org.gravity.hulk.refactoringgraph.HCluster;
import org.gravity.hulk.refactoringgraph.HInBlobAccess;
import org.gravity.hulk.refactoringgraph.HInBlobClusterAccess;
import org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;

import org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage;

import org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringgraphPackageImpl extends EPackageImpl implements RefactoringgraphPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMethodToDataClassAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hInBlobAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hBlobResolveAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hInBlobClusterAccessEClass = null;

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
	 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefactoringgraphPackageImpl() {
		super(eNS_URI, RefactoringgraphFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RefactoringgraphPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefactoringgraphPackage init() {
		if (isInited)
			return (RefactoringgraphPackage) EPackage.Registry.INSTANCE.getEPackage(RefactoringgraphPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRefactoringgraphPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RefactoringgraphPackageImpl theRefactoringgraphPackage = registeredRefactoringgraphPackage instanceof RefactoringgraphPackageImpl
				? (RefactoringgraphPackageImpl) registeredRefactoringgraphPackage
				: new RefactoringgraphPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AntipatterngraphPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RefactoringsPackage.eNS_URI);
		RefactoringsPackageImpl theRefactoringsPackage = (RefactoringsPackageImpl) (registeredPackage instanceof RefactoringsPackageImpl
				? registeredPackage
				: RefactoringsPackage.eINSTANCE);

		// Create package meta-data objects
		theRefactoringgraphPackage.createPackageContents();
		theRefactoringsPackage.createPackageContents();

		// Initialize created meta-data
		theRefactoringgraphPackage.initializePackageContents();
		theRefactoringsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRefactoringgraphPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefactoringgraphPackage.eNS_URI, theRefactoringgraphPackage);
		return theRefactoringgraphPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHMethodToDataClassAccess() {
		return hMethodToDataClassAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHMethodToDataClassAccess_HDataClassSmell() {
		return (EReference) hMethodToDataClassAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHMethodToDataClassAccess_HDataClass() {
		return (EReference) hMethodToDataClassAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHMethodToDataClassAccess_TMethodDefinition() {
		return (EReference) hMethodToDataClassAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHMethodToDataClassAccess__GetRelativeAmount() {
		return hMethodToDataClassAccessEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHInBlobAccess() {
		return hInBlobAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHBlobResolveAnnotation() {
		return hBlobResolveAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHBlobResolveAnnotation_HBlobAntiPattern() {
		return (EReference) hBlobResolveAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHBlobResolveAnnotation_HMoves() {
		return (EReference) hBlobResolveAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHBlobResolveAnnotation_HRefactorings() {
		return (EReference) hBlobResolveAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHCluster() {
		return hClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHCluster_TMembers() {
		return (EReference) hClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHInBlobClusterAccess() {
		return hInBlobClusterAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHInBlobClusterAccess_HCluster() {
		return (EReference) hInBlobClusterAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHInBlobClusterAccess__GetRelativeAmount() {
		return hInBlobClusterAccessEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefactoringgraphFactory getRefactoringgraphFactory() {
		return (RefactoringgraphFactory) getEFactoryInstance();
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
		hMethodToDataClassAccessEClass = createEClass(HMETHOD_TO_DATA_CLASS_ACCESS);
		createEReference(hMethodToDataClassAccessEClass, HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS_SMELL);
		createEReference(hMethodToDataClassAccessEClass, HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS);
		createEReference(hMethodToDataClassAccessEClass, HMETHOD_TO_DATA_CLASS_ACCESS__TMETHOD_DEFINITION);
		createEOperation(hMethodToDataClassAccessEClass, HMETHOD_TO_DATA_CLASS_ACCESS___GET_RELATIVE_AMOUNT);

		hInBlobAccessEClass = createEClass(HIN_BLOB_ACCESS);

		hBlobResolveAnnotationEClass = createEClass(HBLOB_RESOLVE_ANNOTATION);
		createEReference(hBlobResolveAnnotationEClass, HBLOB_RESOLVE_ANNOTATION__HBLOB_ANTI_PATTERN);
		createEReference(hBlobResolveAnnotationEClass, HBLOB_RESOLVE_ANNOTATION__HMOVES);
		createEReference(hBlobResolveAnnotationEClass, HBLOB_RESOLVE_ANNOTATION__HREFACTORINGS);

		hClusterEClass = createEClass(HCLUSTER);
		createEReference(hClusterEClass, HCLUSTER__TMEMBERS);

		hInBlobClusterAccessEClass = createEClass(HIN_BLOB_CLUSTER_ACCESS);
		createEReference(hInBlobClusterAccessEClass, HIN_BLOB_CLUSTER_ACCESS__HCLUSTER);
		createEOperation(hInBlobClusterAccessEClass, HIN_BLOB_CLUSTER_ACCESS___GET_RELATIVE_AMOUNT);
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
		RefactoringsPackage theRefactoringsPackage = (RefactoringsPackage) EPackage.Registry.INSTANCE
				.getEPackage(RefactoringsPackage.eNS_URI);
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		CodesmellsPackage theCodesmellsPackage = (CodesmellsPackage) EPackage.Registry.INSTANCE
				.getEPackage(CodesmellsPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage) EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		AntipatternPackage theAntipatternPackage = (AntipatternPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatternPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRefactoringsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hMethodToDataClassAccessEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hInBlobAccessEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hBlobResolveAnnotationEClass.getESuperTypes().add(theAntipatterngraphPackage.getHAnnotation());
		hClusterEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hInBlobClusterAccessEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());

		// Initialize classes, features, and operations; add parameters
		initEClass(hMethodToDataClassAccessEClass, HMethodToDataClassAccess.class, "HMethodToDataClassAccess",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMethodToDataClassAccess_HDataClassSmell(), theCodesmellsPackage.getHDataClassSmell(), null,
				"hDataClassSmell", null, 0, 1, HMethodToDataClassAccess.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMethodToDataClassAccess_HDataClass(), theBasicPackage.getTClass(), null, "hDataClass", null,
				0, 1, HMethodToDataClassAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMethodToDataClassAccess_TMethodDefinition(), theBasicPackage.getTMember(), null,
				"tMethodDefinition", null, 0, 1, HMethodToDataClassAccess.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getHMethodToDataClassAccess__GetRelativeAmount(), theValuesPackage.getHRelativeValue(),
				"getRelativeAmount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hInBlobAccessEClass, HInBlobAccess.class, "HInBlobAccess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hBlobResolveAnnotationEClass, HBlobResolveAnnotation.class, "HBlobResolveAnnotation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHBlobResolveAnnotation_HBlobAntiPattern(), theAntipatternPackage.getHBlobAntiPattern(), null,
				"hBlobAntiPattern", null, 0, 1, HBlobResolveAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHBlobResolveAnnotation_HMoves(), theRefactoringsPackage.getHMoveMember(), null, "hMoves",
				null, 0, -1, HBlobResolveAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHBlobResolveAnnotation_HRefactorings(), theRefactoringsPackage.getHRefactoring(), null,
				"hRefactorings", null, 0, -1, HBlobResolveAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hClusterEClass, HCluster.class, "HCluster", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHCluster_TMembers(), theBasicPackage.getTMember(), null, "tMembers", null, 0, -1,
				HCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hInBlobClusterAccessEClass, HInBlobClusterAccess.class, "HInBlobClusterAccess", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHInBlobClusterAccess_HCluster(), this.getHCluster(), null, "hCluster", null, 0, 1,
				HInBlobClusterAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getHInBlobClusterAccess__GetRelativeAmount(), theValuesPackage.getHRelativeValue(),
				"getRelativeAmount", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RefactoringgraphPackageImpl
