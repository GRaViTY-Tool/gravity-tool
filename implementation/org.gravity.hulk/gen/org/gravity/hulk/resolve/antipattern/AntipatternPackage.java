/**
 */
package org.gravity.hulk.resolve.antipattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gravity.hulk.detection.DetectionPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.resolve.antipattern.AntipatternFactory
 * @model kind="package"
 * @generated
 */
public interface AntipatternPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "antipattern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.gravity.hulk/model/Hulk.ecore#//resolve/antipattern";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "antipattern";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AntipatternPackage eINSTANCE = org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl <em>HBlob Resolver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl
	 * @see org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl#getHBlobResolver()
	 * @generated
	 */
	int HBLOB_RESOLVER = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER__INCOMING = DetectionPackage.HANTI_PATTERN_DETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER__GRAPH = DetectionPackage.HANTI_PATTERN_DETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER__ORIGIN = DetectionPackage.HANTI_PATTERN_DETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER__OUTGOING = DetectionPackage.HANTI_PATTERN_DETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER__POST_TRAVERSAL = DetectionPackage.HANTI_PATTERN_DETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER__PRE_TRAVERSAL = DetectionPackage.HANTI_PATTERN_DETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER__HANNOTATION = DetectionPackage.HANTI_PATTERN_DETECTOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER__HANTI_PATTERN_HANDLING = DetectionPackage.HANTI_PATTERN_DETECTOR__HANTI_PATTERN_HANDLING;

	/**
	 * The feature id for the '<em><b>Executed Moves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER__EXECUTED_MOVES = DetectionPackage.HANTI_PATTERN_DETECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER__ORIGINAL_APG = DetectionPackage.HANTI_PATTERN_DETECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Copy apg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER__COPY_APG = DetectionPackage.HANTI_PATTERN_DETECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HBlob Resolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER_FEATURE_COUNT = DetectionPackage.HANTI_PATTERN_DETECTOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Refactoring Possible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER___IS_REFACTORING_POSSIBLE__HREFACTORING = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Create Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER___CREATE_MOVE__TMEMBERCONTAINER_TCLASS_TCLASS_HBLOBRESOLVEANNOTATION = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Allowed To Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER___ALLOWED_TO_TOUCH__TANNOTATABLE = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER___INIT__HANTIPATTERNGRAPH = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>HBlob Resolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVER_OPERATION_COUNT = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.resolve.antipattern.impl.HAlternativeBlobresolverImpl <em>HAlternative Blobresolver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.resolve.antipattern.impl.HAlternativeBlobresolverImpl
	 * @see org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl#getHAlternativeBlobresolver()
	 * @generated
	 */
	int HALTERNATIVE_BLOBRESOLVER = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER__INCOMING = HBLOB_RESOLVER__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER__GRAPH = HBLOB_RESOLVER__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER__ORIGIN = HBLOB_RESOLVER__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER__OUTGOING = HBLOB_RESOLVER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER__POST_TRAVERSAL = HBLOB_RESOLVER__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER__PRE_TRAVERSAL = HBLOB_RESOLVER__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER__HANNOTATION = HBLOB_RESOLVER__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER__HANTI_PATTERN_HANDLING = HBLOB_RESOLVER__HANTI_PATTERN_HANDLING;

	/**
	 * The feature id for the '<em><b>Executed Moves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER__EXECUTED_MOVES = HBLOB_RESOLVER__EXECUTED_MOVES;

	/**
	 * The feature id for the '<em><b>Original apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER__ORIGINAL_APG = HBLOB_RESOLVER__ORIGINAL_APG;

	/**
	 * The feature id for the '<em><b>Copy apg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER__COPY_APG = HBLOB_RESOLVER__COPY_APG;

	/**
	 * The number of structural features of the '<em>HAlternative Blobresolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER_FEATURE_COUNT = HBLOB_RESOLVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Refactoring Possible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER___IS_REFACTORING_POSSIBLE__HREFACTORING = HBLOB_RESOLVER___IS_REFACTORING_POSSIBLE__HREFACTORING;

	/**
	 * The operation id for the '<em>Create Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER___CREATE_MOVE__TMEMBERCONTAINER_TCLASS_TCLASS_HBLOBRESOLVEANNOTATION = HBLOB_RESOLVER___CREATE_MOVE__TMEMBERCONTAINER_TCLASS_TCLASS_HBLOBRESOLVEANNOTATION;

	/**
	 * The operation id for the '<em>Allowed To Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER___ALLOWED_TO_TOUCH__TANNOTATABLE = HBLOB_RESOLVER___ALLOWED_TO_TOUCH__TANNOTATABLE;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER___INIT__HANTIPATTERNGRAPH = HBLOB_RESOLVER___INIT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER___DETECT__HANTIPATTERNGRAPH = HBLOB_RESOLVER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER___PROCESS__HINBLOBCLUSTERACCESS_TCLASS_HBLOBRESOLVEANNOTATION = HBLOB_RESOLVER_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HAlternative Blobresolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTERNATIVE_BLOBRESOLVER_OPERATION_COUNT = HBLOB_RESOLVER_OPERATION_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.resolve.antipattern.HBlobResolver <em>HBlob Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HBlob Resolver</em>'.
	 * @see org.gravity.hulk.resolve.antipattern.HBlobResolver
	 * @generated
	 */
	EClass getHBlobResolver();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#getExecutedMoves <em>Executed Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Moves</em>'.
	 * @see org.gravity.hulk.resolve.antipattern.HBlobResolver#getExecutedMoves()
	 * @see #getHBlobResolver()
	 * @generated
	 */
	EReference getHBlobResolver_ExecutedMoves();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#getOriginal_apg <em>Original apg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original apg</em>'.
	 * @see org.gravity.hulk.resolve.antipattern.HBlobResolver#getOriginal_apg()
	 * @see #getHBlobResolver()
	 * @generated
	 */
	EReference getHBlobResolver_Original_apg();

	/**
	 * Returns the meta object for the containment reference '{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#getCopy_apg <em>Copy apg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copy apg</em>'.
	 * @see org.gravity.hulk.resolve.antipattern.HBlobResolver#getCopy_apg()
	 * @see #getHBlobResolver()
	 * @generated
	 */
	EReference getHBlobResolver_Copy_apg();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.resolve.antipattern.HBlobResolver#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHBlobResolver__Detect__HAntiPatternGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#isRefactoringPossible(org.gravity.hulk.refactoringgraph.refactorings.HRefactoring) <em>Is Refactoring Possible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Refactoring Possible</em>' operation.
	 * @see org.gravity.hulk.resolve.antipattern.HBlobResolver#isRefactoringPossible(org.gravity.hulk.refactoringgraph.refactorings.HRefactoring)
	 * @generated
	 */
	EOperation getHBlobResolver__IsRefactoringPossible__HRefactoring();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#createMove(org.gravity.typegraph.basic.containers.TMemberContainer, org.gravity.typegraph.basic.TClass, org.gravity.typegraph.basic.TClass, org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation) <em>Create Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Move</em>' operation.
	 * @see org.gravity.hulk.resolve.antipattern.HBlobResolver#createMove(org.gravity.typegraph.basic.containers.TMemberContainer, org.gravity.typegraph.basic.TClass, org.gravity.typegraph.basic.TClass, org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation)
	 * @generated
	 */
	EOperation getHBlobResolver__CreateMove__TMemberContainer_TClass_TClass_HBlobResolveAnnotation();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#allowedToTouch(org.gravity.typegraph.basic.annotations.TAnnotatable) <em>Allowed To Touch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Allowed To Touch</em>' operation.
	 * @see org.gravity.hulk.resolve.antipattern.HBlobResolver#allowedToTouch(org.gravity.typegraph.basic.annotations.TAnnotatable)
	 * @generated
	 */
	EOperation getHBlobResolver__AllowedToTouch__TAnnotatable();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#init(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see org.gravity.hulk.resolve.antipattern.HBlobResolver#init(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHBlobResolver__Init__HAntiPatternGraph();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.resolve.antipattern.HAlternativeBlobresolver <em>HAlternative Blobresolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAlternative Blobresolver</em>'.
	 * @see org.gravity.hulk.resolve.antipattern.HAlternativeBlobresolver
	 * @generated
	 */
	EClass getHAlternativeBlobresolver();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.antipattern.HAlternativeBlobresolver#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.resolve.antipattern.HAlternativeBlobresolver#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHAlternativeBlobresolver__Detect__HAntiPatternGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.antipattern.HAlternativeBlobresolver#process(org.gravity.hulk.refactoringgraph.HInBlobClusterAccess, org.gravity.typegraph.basic.TClass, org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation) <em>Process</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Process</em>' operation.
	 * @see org.gravity.hulk.resolve.antipattern.HAlternativeBlobresolver#process(org.gravity.hulk.refactoringgraph.HInBlobClusterAccess, org.gravity.typegraph.basic.TClass, org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation)
	 * @generated
	 */
	EOperation getHAlternativeBlobresolver__Process__HInBlobClusterAccess_TClass_HBlobResolveAnnotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AntipatternFactory getAntipatternFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl <em>HBlob Resolver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl
		 * @see org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl#getHBlobResolver()
		 * @generated
		 */
		EClass HBLOB_RESOLVER = eINSTANCE.getHBlobResolver();

		/**
		 * The meta object literal for the '<em><b>Executed Moves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBLOB_RESOLVER__EXECUTED_MOVES = eINSTANCE.getHBlobResolver_ExecutedMoves();

		/**
		 * The meta object literal for the '<em><b>Original apg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBLOB_RESOLVER__ORIGINAL_APG = eINSTANCE.getHBlobResolver_Original_apg();

		/**
		 * The meta object literal for the '<em><b>Copy apg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBLOB_RESOLVER__COPY_APG = eINSTANCE.getHBlobResolver_Copy_apg();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HBLOB_RESOLVER___DETECT__HANTIPATTERNGRAPH = eINSTANCE.getHBlobResolver__Detect__HAntiPatternGraph();

		/**
		 * The meta object literal for the '<em><b>Is Refactoring Possible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HBLOB_RESOLVER___IS_REFACTORING_POSSIBLE__HREFACTORING = eINSTANCE
				.getHBlobResolver__IsRefactoringPossible__HRefactoring();

		/**
		 * The meta object literal for the '<em><b>Create Move</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HBLOB_RESOLVER___CREATE_MOVE__TMEMBERCONTAINER_TCLASS_TCLASS_HBLOBRESOLVEANNOTATION = eINSTANCE
				.getHBlobResolver__CreateMove__TMemberContainer_TClass_TClass_HBlobResolveAnnotation();

		/**
		 * The meta object literal for the '<em><b>Allowed To Touch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HBLOB_RESOLVER___ALLOWED_TO_TOUCH__TANNOTATABLE = eINSTANCE
				.getHBlobResolver__AllowedToTouch__TAnnotatable();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HBLOB_RESOLVER___INIT__HANTIPATTERNGRAPH = eINSTANCE.getHBlobResolver__Init__HAntiPatternGraph();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.resolve.antipattern.impl.HAlternativeBlobresolverImpl <em>HAlternative Blobresolver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.resolve.antipattern.impl.HAlternativeBlobresolverImpl
		 * @see org.gravity.hulk.resolve.antipattern.impl.AntipatternPackageImpl#getHAlternativeBlobresolver()
		 * @generated
		 */
		EClass HALTERNATIVE_BLOBRESOLVER = eINSTANCE.getHAlternativeBlobresolver();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HALTERNATIVE_BLOBRESOLVER___DETECT__HANTIPATTERNGRAPH = eINSTANCE
				.getHAlternativeBlobresolver__Detect__HAntiPatternGraph();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HALTERNATIVE_BLOBRESOLVER___PROCESS__HINBLOBCLUSTERACCESS_TCLASS_HBLOBRESOLVEANNOTATION = eINSTANCE
				.getHAlternativeBlobresolver__Process__HInBlobClusterAccess_TClass_HBlobResolveAnnotation();

	}

} //AntipatternPackage
