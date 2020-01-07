/**
 */
package org.gravity.hulk;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.core.dfs.DfsPackage;

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
 * @see org.gravity.hulk.HulkFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.gravity'"
 * @generated
 */
public interface HulkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hulk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.gravity.hulk/model/Hulk.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.hulk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HulkPackage eINSTANCE = org.gravity.hulk.impl.HulkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.impl.HAntiPatternHandlingImpl <em>HAnti Pattern Handling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.impl.HAntiPatternHandlingImpl
	 * @see org.gravity.hulk.impl.HulkPackageImpl#getHAntiPatternHandling()
	 * @generated
	 */
	int HANTI_PATTERN_HANDLING = 3;

	/**
	 * The feature id for the '<em><b>HDetector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_HANDLING__HDETECTOR = 0;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_HANDLING__APG = 1;

	/**
	 * The feature id for the '<em><b>Programlocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_HANDLING__PROGRAMLOCATION = 2;

	/**
	 * The number of structural features of the '<em>HAnti Pattern Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_HANDLING_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_HANDLING___EXECUTE = 0;

	/**
	 * The operation id for the '<em>Get Dependency Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_HANDLING___GET_DEPENDENCY_GRAPH = 1;

	/**
	 * The number of operations of the '<em>HAnti Pattern Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_HANDLING_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.impl.HAntiPatternDetectionImpl <em>HAnti Pattern Detection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.impl.HAntiPatternDetectionImpl
	 * @see org.gravity.hulk.impl.HulkPackageImpl#getHAntiPatternDetection()
	 * @generated
	 */
	int HANTI_PATTERN_DETECTION = 0;

	/**
	 * The feature id for the '<em><b>HDetector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION__HDETECTOR = HANTI_PATTERN_HANDLING__HDETECTOR;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION__APG = HANTI_PATTERN_HANDLING__APG;

	/**
	 * The feature id for the '<em><b>Programlocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION__PROGRAMLOCATION = HANTI_PATTERN_HANDLING__PROGRAMLOCATION;

	/**
	 * The number of structural features of the '<em>HAnti Pattern Detection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION_FEATURE_COUNT = HANTI_PATTERN_HANDLING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Anti Pattern Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION___CREATE_ANTI_PATTERN_DEPENDENCIES__DFSGRAPH = HANTI_PATTERN_HANDLING_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Create Code Smell Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION___CREATE_CODE_SMELL_DEPENDENCIES__DFSGRAPH = HANTI_PATTERN_HANDLING_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Metric Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION___CREATE_METRIC_DEPENDENCIES__DFSGRAPH = HANTI_PATTERN_HANDLING_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION___EXECUTE = HANTI_PATTERN_HANDLING_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Dependency Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION___GET_DEPENDENCY_GRAPH = HANTI_PATTERN_HANDLING_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>HAnti Pattern Detection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION_OPERATION_COUNT = HANTI_PATTERN_HANDLING_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.impl.HAntiPatternResolvingImpl <em>HAnti Pattern Resolving</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.impl.HAntiPatternResolvingImpl
	 * @see org.gravity.hulk.impl.HulkPackageImpl#getHAntiPatternResolving()
	 * @generated
	 */
	int HANTI_PATTERN_RESOLVING = 1;

	/**
	 * The feature id for the '<em><b>HDetector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING__HDETECTOR = HANTI_PATTERN_DETECTION__HDETECTOR;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING__APG = HANTI_PATTERN_DETECTION__APG;

	/**
	 * The feature id for the '<em><b>Programlocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING__PROGRAMLOCATION = HANTI_PATTERN_DETECTION__PROGRAMLOCATION;

	/**
	 * The number of structural features of the '<em>HAnti Pattern Resolving</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING_FEATURE_COUNT = HANTI_PATTERN_DETECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Anti Pattern Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING___CREATE_ANTI_PATTERN_DEPENDENCIES__DFSGRAPH = HANTI_PATTERN_DETECTION___CREATE_ANTI_PATTERN_DEPENDENCIES__DFSGRAPH;

	/**
	 * The operation id for the '<em>Create Code Smell Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING___CREATE_CODE_SMELL_DEPENDENCIES__DFSGRAPH = HANTI_PATTERN_DETECTION___CREATE_CODE_SMELL_DEPENDENCIES__DFSGRAPH;

	/**
	 * The operation id for the '<em>Create Metric Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING___CREATE_METRIC_DEPENDENCIES__DFSGRAPH = HANTI_PATTERN_DETECTION___CREATE_METRIC_DEPENDENCIES__DFSGRAPH;

	/**
	 * The operation id for the '<em>Create Resolve Calculator Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING___CREATE_RESOLVE_CALCULATOR_DEPENDENCY__DFSGRAPH = HANTI_PATTERN_DETECTION_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Dependency Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING___GET_DEPENDENCY_GRAPH = HANTI_PATTERN_DETECTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING___EXECUTE = HANTI_PATTERN_DETECTION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Resolve Anti Pattern Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING___CREATE_RESOLVE_ANTI_PATTERN_DEPENDENCY__DFSGRAPH = HANTI_PATTERN_DETECTION_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Get Super Dependency Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING___GET_SUPER_DEPENDENCY_GRAPH = HANTI_PATTERN_DETECTION_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>HAnti Pattern Resolving</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVING_OPERATION_COUNT = HANTI_PATTERN_DETECTION_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.impl.HDetectorImpl <em>HDetector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.impl.HDetectorImpl
	 * @see org.gravity.hulk.impl.HulkPackageImpl#getHDetector()
	 * @generated
	 */
	int HDETECTOR = 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__INCOMING = DfsPackage.NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__GRAPH = DfsPackage.NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__ORIGIN = DfsPackage.NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__OUTGOING = DfsPackage.NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__POST_TRAVERSAL = DfsPackage.NODE__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__PRE_TRAVERSAL = DfsPackage.NODE__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__HANNOTATION = DfsPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__HANTI_PATTERN_HANDLING = DfsPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HDetector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR_FEATURE_COUNT = DfsPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR___DETECT__HANTIPATTERNGRAPH = DfsPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>HDetector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR_OPERATION_COUNT = DfsPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.HAntiPatternDetection <em>HAnti Pattern Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAnti Pattern Detection</em>'.
	 * @see org.gravity.hulk.HAntiPatternDetection
	 * @generated
	 */
	EClass getHAntiPatternDetection();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternDetection#createAntiPatternDependencies(org.moflon.core.dfs.DFSGraph) <em>Create Anti Pattern Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Anti Pattern Dependencies</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternDetection#createAntiPatternDependencies(org.moflon.core.dfs.DFSGraph)
	 * @generated
	 */
	EOperation getHAntiPatternDetection__CreateAntiPatternDependencies__DFSGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternDetection#createCodeSmellDependencies(org.moflon.core.dfs.DFSGraph) <em>Create Code Smell Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Code Smell Dependencies</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternDetection#createCodeSmellDependencies(org.moflon.core.dfs.DFSGraph)
	 * @generated
	 */
	EOperation getHAntiPatternDetection__CreateCodeSmellDependencies__DFSGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternDetection#createMetricDependencies(org.moflon.core.dfs.DFSGraph) <em>Create Metric Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Metric Dependencies</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternDetection#createMetricDependencies(org.moflon.core.dfs.DFSGraph)
	 * @generated
	 */
	EOperation getHAntiPatternDetection__CreateMetricDependencies__DFSGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternDetection#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternDetection#execute()
	 * @generated
	 */
	EOperation getHAntiPatternDetection__Execute();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternDetection#getDependencyGraph() <em>Get Dependency Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dependency Graph</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternDetection#getDependencyGraph()
	 * @generated
	 */
	EOperation getHAntiPatternDetection__GetDependencyGraph();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.HAntiPatternResolving <em>HAnti Pattern Resolving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAnti Pattern Resolving</em>'.
	 * @see org.gravity.hulk.HAntiPatternResolving
	 * @generated
	 */
	EClass getHAntiPatternResolving();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternResolving#createResolveCalculatorDependency(org.moflon.core.dfs.DFSGraph) <em>Create Resolve Calculator Dependency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Resolve Calculator Dependency</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternResolving#createResolveCalculatorDependency(org.moflon.core.dfs.DFSGraph)
	 * @generated
	 */
	EOperation getHAntiPatternResolving__CreateResolveCalculatorDependency__DFSGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternResolving#getDependencyGraph() <em>Get Dependency Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dependency Graph</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternResolving#getDependencyGraph()
	 * @generated
	 */
	EOperation getHAntiPatternResolving__GetDependencyGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternResolving#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternResolving#execute()
	 * @generated
	 */
	EOperation getHAntiPatternResolving__Execute();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternResolving#createResolveAntiPatternDependency(org.moflon.core.dfs.DFSGraph) <em>Create Resolve Anti Pattern Dependency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Resolve Anti Pattern Dependency</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternResolving#createResolveAntiPatternDependency(org.moflon.core.dfs.DFSGraph)
	 * @generated
	 */
	EOperation getHAntiPatternResolving__CreateResolveAntiPatternDependency__DFSGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternResolving#getSuperDependencyGraph() <em>Get Super Dependency Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super Dependency Graph</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternResolving#getSuperDependencyGraph()
	 * @generated
	 */
	EOperation getHAntiPatternResolving__GetSuperDependencyGraph();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.HDetector <em>HDetector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDetector</em>'.
	 * @see org.gravity.hulk.HDetector
	 * @generated
	 */
	EClass getHDetector();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.HDetector#getHAnnotation <em>HAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HAnnotation</em>'.
	 * @see org.gravity.hulk.HDetector#getHAnnotation()
	 * @see #getHDetector()
	 * @generated
	 */
	EReference getHDetector_HAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.HDetector#getHAntiPatternHandling <em>HAnti Pattern Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HAnti Pattern Handling</em>'.
	 * @see org.gravity.hulk.HDetector#getHAntiPatternHandling()
	 * @see #getHDetector()
	 * @generated
	 */
	EReference getHDetector_HAntiPatternHandling();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HDetector#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.HDetector#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHDetector__Detect__HAntiPatternGraph();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.HAntiPatternHandling <em>HAnti Pattern Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAnti Pattern Handling</em>'.
	 * @see org.gravity.hulk.HAntiPatternHandling
	 * @generated
	 */
	EClass getHAntiPatternHandling();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.HAntiPatternHandling#getHDetector <em>HDetector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HDetector</em>'.
	 * @see org.gravity.hulk.HAntiPatternHandling#getHDetector()
	 * @see #getHAntiPatternHandling()
	 * @generated
	 */
	EReference getHAntiPatternHandling_HDetector();

	/**
	 * Returns the meta object for the containment reference '{@link org.gravity.hulk.HAntiPatternHandling#getApg <em>Apg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Apg</em>'.
	 * @see org.gravity.hulk.HAntiPatternHandling#getApg()
	 * @see #getHAntiPatternHandling()
	 * @generated
	 */
	EReference getHAntiPatternHandling_Apg();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.HAntiPatternHandling#getProgramlocation <em>Programlocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Programlocation</em>'.
	 * @see org.gravity.hulk.HAntiPatternHandling#getProgramlocation()
	 * @see #getHAntiPatternHandling()
	 * @generated
	 */
	EAttribute getHAntiPatternHandling_Programlocation();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternHandling#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternHandling#execute()
	 * @generated
	 */
	EOperation getHAntiPatternHandling__Execute();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternHandling#getDependencyGraph() <em>Get Dependency Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dependency Graph</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternHandling#getDependencyGraph()
	 * @generated
	 */
	EOperation getHAntiPatternHandling__GetDependencyGraph();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HulkFactory getHulkFactory();

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
		 * The meta object literal for the '{@link org.gravity.hulk.impl.HAntiPatternDetectionImpl <em>HAnti Pattern Detection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.impl.HAntiPatternDetectionImpl
		 * @see org.gravity.hulk.impl.HulkPackageImpl#getHAntiPatternDetection()
		 * @generated
		 */
		EClass HANTI_PATTERN_DETECTION = eINSTANCE.getHAntiPatternDetection();

		/**
		 * The meta object literal for the '<em><b>Create Anti Pattern Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_DETECTION___CREATE_ANTI_PATTERN_DEPENDENCIES__DFSGRAPH = eINSTANCE
				.getHAntiPatternDetection__CreateAntiPatternDependencies__DFSGraph();

		/**
		 * The meta object literal for the '<em><b>Create Code Smell Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_DETECTION___CREATE_CODE_SMELL_DEPENDENCIES__DFSGRAPH = eINSTANCE
				.getHAntiPatternDetection__CreateCodeSmellDependencies__DFSGraph();

		/**
		 * The meta object literal for the '<em><b>Create Metric Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_DETECTION___CREATE_METRIC_DEPENDENCIES__DFSGRAPH = eINSTANCE
				.getHAntiPatternDetection__CreateMetricDependencies__DFSGraph();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_DETECTION___EXECUTE = eINSTANCE.getHAntiPatternDetection__Execute();

		/**
		 * The meta object literal for the '<em><b>Get Dependency Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_DETECTION___GET_DEPENDENCY_GRAPH = eINSTANCE
				.getHAntiPatternDetection__GetDependencyGraph();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.impl.HAntiPatternResolvingImpl <em>HAnti Pattern Resolving</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.impl.HAntiPatternResolvingImpl
		 * @see org.gravity.hulk.impl.HulkPackageImpl#getHAntiPatternResolving()
		 * @generated
		 */
		EClass HANTI_PATTERN_RESOLVING = eINSTANCE.getHAntiPatternResolving();

		/**
		 * The meta object literal for the '<em><b>Create Resolve Calculator Dependency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_RESOLVING___CREATE_RESOLVE_CALCULATOR_DEPENDENCY__DFSGRAPH = eINSTANCE
				.getHAntiPatternResolving__CreateResolveCalculatorDependency__DFSGraph();

		/**
		 * The meta object literal for the '<em><b>Get Dependency Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_RESOLVING___GET_DEPENDENCY_GRAPH = eINSTANCE
				.getHAntiPatternResolving__GetDependencyGraph();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_RESOLVING___EXECUTE = eINSTANCE.getHAntiPatternResolving__Execute();

		/**
		 * The meta object literal for the '<em><b>Create Resolve Anti Pattern Dependency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_RESOLVING___CREATE_RESOLVE_ANTI_PATTERN_DEPENDENCY__DFSGRAPH = eINSTANCE
				.getHAntiPatternResolving__CreateResolveAntiPatternDependency__DFSGraph();

		/**
		 * The meta object literal for the '<em><b>Get Super Dependency Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_RESOLVING___GET_SUPER_DEPENDENCY_GRAPH = eINSTANCE
				.getHAntiPatternResolving__GetSuperDependencyGraph();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.impl.HDetectorImpl <em>HDetector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.impl.HDetectorImpl
		 * @see org.gravity.hulk.impl.HulkPackageImpl#getHDetector()
		 * @generated
		 */
		EClass HDETECTOR = eINSTANCE.getHDetector();

		/**
		 * The meta object literal for the '<em><b>HAnnotation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDETECTOR__HANNOTATION = eINSTANCE.getHDetector_HAnnotation();

		/**
		 * The meta object literal for the '<em><b>HAnti Pattern Handling</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDETECTOR__HANTI_PATTERN_HANDLING = eINSTANCE.getHDetector_HAntiPatternHandling();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HDETECTOR___DETECT__HANTIPATTERNGRAPH = eINSTANCE.getHDetector__Detect__HAntiPatternGraph();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.impl.HAntiPatternHandlingImpl <em>HAnti Pattern Handling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.impl.HAntiPatternHandlingImpl
		 * @see org.gravity.hulk.impl.HulkPackageImpl#getHAntiPatternHandling()
		 * @generated
		 */
		EClass HANTI_PATTERN_HANDLING = eINSTANCE.getHAntiPatternHandling();

		/**
		 * The meta object literal for the '<em><b>HDetector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANTI_PATTERN_HANDLING__HDETECTOR = eINSTANCE.getHAntiPatternHandling_HDetector();

		/**
		 * The meta object literal for the '<em><b>Apg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANTI_PATTERN_HANDLING__APG = eINSTANCE.getHAntiPatternHandling_Apg();

		/**
		 * The meta object literal for the '<em><b>Programlocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANTI_PATTERN_HANDLING__PROGRAMLOCATION = eINSTANCE.getHAntiPatternHandling_Programlocation();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_HANDLING___EXECUTE = eINSTANCE.getHAntiPatternHandling__Execute();

		/**
		 * The meta object literal for the '<em><b>Get Dependency Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_HANDLING___GET_DEPENDENCY_GRAPH = eINSTANCE
				.getHAntiPatternHandling__GetDependencyGraph();

	}

} //HulkPackage
