/**
 */
package org.gravity.hulk.refactoringgraph.refactorings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;

import org.gravity.hulk.refactoringgraph.impl.RefactoringgraphPackageImpl;

import org.gravity.hulk.refactoringgraph.refactorings.HExtractClass;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveField;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMember;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMethod;
import org.gravity.hulk.refactoringgraph.refactorings.HRefactoring;
import org.gravity.hulk.refactoringgraph.refactorings.RefactoringsFactory;
import org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage;

import org.gravity.typegraph.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringsPackageImpl extends EPackageImpl implements RefactoringsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hRefactoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMoveMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hExtractClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMoveMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMoveFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMoveMembersEClass = null;

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
	 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefactoringsPackageImpl() {
		super(eNS_URI, RefactoringsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RefactoringsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefactoringsPackage init() {
		if (isInited)
			return (RefactoringsPackage) EPackage.Registry.INSTANCE.getEPackage(RefactoringsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRefactoringsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RefactoringsPackageImpl theRefactoringsPackage = registeredRefactoringsPackage instanceof RefactoringsPackageImpl
				? (RefactoringsPackageImpl) registeredRefactoringsPackage
				: new RefactoringsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AntipatterngraphPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RefactoringgraphPackage.eNS_URI);
		RefactoringgraphPackageImpl theRefactoringgraphPackage = (RefactoringgraphPackageImpl) (registeredPackage instanceof RefactoringgraphPackageImpl
				? registeredPackage
				: RefactoringgraphPackage.eINSTANCE);

		// Create package meta-data objects
		theRefactoringsPackage.createPackageContents();
		theRefactoringgraphPackage.createPackageContents();

		// Initialize created meta-data
		theRefactoringsPackage.initializePackageContents();
		theRefactoringgraphPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRefactoringsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefactoringsPackage.eNS_URI, theRefactoringsPackage);
		return theRefactoringsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHRefactoring() {
		return hRefactoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHMoveMethod() {
		return hMoveMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHExtractClass() {
		return hExtractClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHExtractClass_TMembers() {
		return (EReference) hExtractClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHExtractClass__GetAvgIba() {
		return hExtractClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHMoveMember() {
		return hMoveMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHMoveMember_SourceClass() {
		return (EReference) hMoveMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHMoveMember_TargetClass() {
		return (EReference) hMoveMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHMoveMember_M2dc() {
		return (EReference) hMoveMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHMoveMember_Iba() {
		return (EReference) hMoveMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHMoveMember_TSignature() {
		return (EReference) hMoveMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHMoveField() {
		return hMoveFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHMoveMembers() {
		return hMoveMembersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHMoveMembers_HMoveMembers() {
		return (EReference) hMoveMembersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHMoveMembers_TargetClass() {
		return (EReference) hMoveMembersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHMoveMembers_SourceClass() {
		return (EReference) hMoveMembersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefactoringsFactory getRefactoringsFactory() {
		return (RefactoringsFactory) getEFactoryInstance();
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
		hRefactoringEClass = createEClass(HREFACTORING);

		hMoveMethodEClass = createEClass(HMOVE_METHOD);

		hExtractClassEClass = createEClass(HEXTRACT_CLASS);
		createEReference(hExtractClassEClass, HEXTRACT_CLASS__TMEMBERS);
		createEOperation(hExtractClassEClass, HEXTRACT_CLASS___GET_AVG_IBA);

		hMoveMemberEClass = createEClass(HMOVE_MEMBER);
		createEReference(hMoveMemberEClass, HMOVE_MEMBER__SOURCE_CLASS);
		createEReference(hMoveMemberEClass, HMOVE_MEMBER__TARGET_CLASS);
		createEReference(hMoveMemberEClass, HMOVE_MEMBER__M2DC);
		createEReference(hMoveMemberEClass, HMOVE_MEMBER__IBA);
		createEReference(hMoveMemberEClass, HMOVE_MEMBER__TSIGNATURE);

		hMoveFieldEClass = createEClass(HMOVE_FIELD);

		hMoveMembersEClass = createEClass(HMOVE_MEMBERS);
		createEReference(hMoveMembersEClass, HMOVE_MEMBERS__HMOVE_MEMBERS);
		createEReference(hMoveMembersEClass, HMOVE_MEMBERS__TARGET_CLASS);
		createEReference(hMoveMembersEClass, HMOVE_MEMBERS__SOURCE_CLASS);
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
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		RefactoringgraphPackage theRefactoringgraphPackage = (RefactoringgraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(RefactoringgraphPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hRefactoringEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hMoveMethodEClass.getESuperTypes().add(this.getHMoveMember());
		hExtractClassEClass.getESuperTypes().add(this.getHRefactoring());
		hMoveMemberEClass.getESuperTypes().add(this.getHRefactoring());
		hMoveFieldEClass.getESuperTypes().add(this.getHMoveMember());
		hMoveMembersEClass.getESuperTypes().add(this.getHRefactoring());

		// Initialize classes, features, and operations; add parameters
		initEClass(hRefactoringEClass, HRefactoring.class, "HRefactoring", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hMoveMethodEClass, HMoveMethod.class, "HMoveMethod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hExtractClassEClass, HExtractClass.class, "HExtractClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHExtractClass_TMembers(), theBasicPackage.getTMember(), null, "tMembers", null, 0, -1,
				HExtractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getHExtractClass__GetAvgIba(), ecorePackage.getEDouble(), "getAvgIba", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(hMoveMemberEClass, HMoveMember.class, "HMoveMember", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMoveMember_SourceClass(), theBasicPackage.getTClass(), null, "sourceClass", null, 1, 1,
				HMoveMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMoveMember_TargetClass(), theBasicPackage.getTClass(), null, "targetClass", null, 1, 1,
				HMoveMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMoveMember_M2dc(), theRefactoringgraphPackage.getHMethodToDataClassAccess(), null, "m2dc",
				null, 1, 1, HMoveMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMoveMember_Iba(), theRefactoringgraphPackage.getHInBlobAccess(), null, "iba", null, 1, 1,
				HMoveMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMoveMember_TSignature(), theBasicPackage.getTSignature(), null, "tSignature", null, 0, -1,
				HMoveMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hMoveFieldEClass, HMoveField.class, "HMoveField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hMoveMembersEClass, HMoveMembers.class, "HMoveMembers", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMoveMembers_HMoveMembers(), this.getHMoveMember(), null, "hMoveMembers", null, 0, -1,
				HMoveMembers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMoveMembers_TargetClass(), theBasicPackage.getTClass(), null, "targetClass", null, 0, 1,
				HMoveMembers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMoveMembers_SourceClass(), theBasicPackage.getTClass(), null, "sourceClass", null, 0, 1,
				HMoveMembers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //RefactoringsPackageImpl
