/**
 */
package org.gravity.hulk.detection.metrics;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.gravity.hulk.detection.metrics.MetricsFactory
 * @model kind="package"
 * @generated
 */
public interface MetricsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metrics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.gravity.hulk/model/Hulk.ecore#//detection/metrics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metrics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsPackage eINSTANCE = org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HInvocationRelationCalculatorImpl <em>HInvocation Relation Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HInvocationRelationCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHInvocationRelationCalculator()
	 * @generated
	 */
	int HINVOCATION_RELATION_CALCULATOR = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HInvocation Relation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Invoc Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR___CALCULATE_INVOC_VALUE__HINCOMMINGINVOCATIONMETRIC_HOUTGOINGINVOCATIONMETRIC = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>HInvocation Relation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HIGAMCalculatorImpl <em>HIGAM Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HIGAMCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHIGAMCalculator()
	 * @generated
	 */
	int HIGAM_CALCULATOR = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_CALCULATOR__INCOMING = DetectionPackage.HMETRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_CALCULATOR__GRAPH = DetectionPackage.HMETRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_CALCULATOR__ORIGIN = DetectionPackage.HMETRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_CALCULATOR__OUTGOING = DetectionPackage.HMETRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HMETRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HMETRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_CALCULATOR__HANNOTATION = DetectionPackage.HMETRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HMETRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HIGAM Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_CALCULATOR_FEATURE_COUNT = DetectionPackage.HMETRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HMETRIC_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>HIGAM Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_CALCULATOR_OPERATION_COUNT = DetectionPackage.HMETRIC_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HNumberOfChildCalculatorImpl <em>HNumber Of Child Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HNumberOfChildCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHNumberOfChildCalculator()
	 * @generated
	 */
	int HNUMBER_OF_CHILD_CALCULATOR = 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HNumber Of Child Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HNumber Of Child Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HIGATCalculatorImpl <em>HIGAT Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HIGATCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHIGATCalculator()
	 * @generated
	 */
	int HIGAT_CALCULATOR = 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_CALCULATOR__INCOMING = DetectionPackage.HMETRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_CALCULATOR__GRAPH = DetectionPackage.HMETRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_CALCULATOR__ORIGIN = DetectionPackage.HMETRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_CALCULATOR__OUTGOING = DetectionPackage.HMETRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HMETRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HMETRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_CALCULATOR__HANNOTATION = DetectionPackage.HMETRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HMETRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HIGAT Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_CALCULATOR_FEATURE_COUNT = DetectionPackage.HMETRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HMETRIC_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>HIGAT Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_CALCULATOR_OPERATION_COUNT = DetectionPackage.HMETRIC_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HMemberNumberCalculatorImpl <em>HMember Number Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HMemberNumberCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHMemberNumberCalculator()
	 * @generated
	 */
	int HMEMBER_NUMBER_CALCULATOR = 4;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HMember Number Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HMember Number Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalAccessRelationCalculatorImpl <em>HLocal Access Relation Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HLocalAccessRelationCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalAccessRelationCalculator()
	 * @generated
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR = 5;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HLocal Access Relation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__HLOCALFIELDACCESSESMETRIC_HLOCALMETHODACCESSESMETRIC = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>HLocal Access Relation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HMethodNumberCalculatorImpl <em>HMethod Number Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HMethodNumberCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHMethodNumberCalculator()
	 * @generated
	 */
	int HMETHOD_NUMBER_CALCULATOR = 6;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HMethod Number Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HMethod Number Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HGetterSetterMethodRelationCalculatorImpl <em>HGetter Setter Method Relation Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HGetterSetterMethodRelationCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHGetterSetterMethodRelationCalculator()
	 * @generated
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR = 7;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HGetter Setter Method Relation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__HSETTERMETRIC_HGETTERMETRIC_HNUMBEROFMETHODSMETRIC = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>HGetter Setter Method Relation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HAverageParametersCalculatorImpl <em>HAverage Parameters Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HAverageParametersCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHAverageParametersCalculator()
	 * @generated
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR = 8;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HAverage Parameters Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HAverage Parameters Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HAverageOverloadingInClassCalculatorImpl <em>HAverage Overloading In Class Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HAverageOverloadingInClassCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHAverageOverloadingInClassCalculator()
	 * @generated
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR = 9;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HAverage Overloading In Class Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HAverage Overloading In Class Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalMethodAccessCalculatorImpl <em>HLocal Method Access Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HLocalMethodAccessCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalMethodAccessCalculator()
	 * @generated
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR = 10;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HLocal Method Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HLocal Method Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalFieldsAccessCalculatorImpl <em>HLocal Fields Access Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HLocalFieldsAccessCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalFieldsAccessCalculator()
	 * @generated
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR = 11;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HLocal Fields Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HLocal Fields Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HFieldNumberCalculatorImpl <em>HField Number Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HFieldNumberCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHFieldNumberCalculator()
	 * @generated
	 */
	int HFIELD_NUMBER_CALCULATOR = 12;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HField Number Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HField Number Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HFIELD_NUMBER_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HTotalVisibilityCalculatorImpl <em>HTotal Visibility Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HTotalVisibilityCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHTotalVisibilityCalculator()
	 * @generated
	 */
	int HTOTAL_VISIBILITY_CALCULATOR = 13;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_CALCULATOR__INCOMING = DetectionPackage.HMETRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_CALCULATOR__GRAPH = DetectionPackage.HMETRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_CALCULATOR__ORIGIN = DetectionPackage.HMETRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_CALCULATOR__OUTGOING = DetectionPackage.HMETRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HMETRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HMETRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_CALCULATOR__HANNOTATION = DetectionPackage.HMETRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HMETRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HTotal Visibility Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_CALCULATOR_FEATURE_COUNT = DetectionPackage.HMETRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HMETRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The number of operations of the '<em>HTotal Visibility Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_CALCULATOR_OPERATION_COUNT = DetectionPackage.HMETRIC_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HTotalCouplingCalculatorImpl <em>HTotal Coupling Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HTotalCouplingCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHTotalCouplingCalculator()
	 * @generated
	 */
	int HTOTAL_COUPLING_CALCULATOR = 14;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HTotal Coupling Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HTotal Coupling Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HLcom5CalculatorImpl <em>HLcom5 Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HLcom5CalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLcom5Calculator()
	 * @generated
	 */
	int HLCOM5_CALCULATOR = 15;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HLcom5 Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate Lcom5 Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR___CALCULATE_LCOM5_VALUE__HNUMBEROFFIELDSMETRIC_HNUMBEROFMETHODSMETRIC_HLOCALFIELDUNIQUEACCESSMETRIC = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>HLcom5 Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalFieldUniqueAccessCalculatorImpl <em>HLocal Field Unique Access Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HLocalFieldUniqueAccessCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalFieldUniqueAccessCalculator()
	 * @generated
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR = 16;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HLocal Field Unique Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HLocal Field Unique Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HAfferentCouplingCalculatorImpl <em>HAfferent Coupling Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HAfferentCouplingCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHAfferentCouplingCalculator()
	 * @generated
	 */
	int HAFFERENT_COUPLING_CALCULATOR = 17;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HAfferent Coupling Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HAfferent Coupling Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HEfferentCouplingCalculatorImpl <em>HEfferent Coupling Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HEfferentCouplingCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHEfferentCouplingCalculator()
	 * @generated
	 */
	int HEFFERENT_COUPLING_CALCULATOR = 18;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HEfferent Coupling Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HEfferent Coupling Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HIncommingInvocationCalculatorImpl <em>HIncomming Invocation Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HIncommingInvocationCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHIncommingInvocationCalculator()
	 * @generated
	 */
	int HINCOMMING_INVOCATION_CALCULATOR = 19;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HIncomming Invocation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HIncomming Invocation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HOutgoingInvocationCalculatorImpl <em>HOutgoing Invocation Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HOutgoingInvocationCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHOutgoingInvocationCalculator()
	 * @generated
	 */
	int HOUTGOING_INVOCATION_CALCULATOR = 20;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HOutgoing Invocation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HOutgoing Invocation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HDepthOfInheritanceCalculatorImpl <em>HDepth Of Inheritance Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HDepthOfInheritanceCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHDepthOfInheritanceCalculator()
	 * @generated
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR = 21;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HDepth Of Inheritance Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HDepth Of Inheritance Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HGetterCalculatorImpl <em>HGetter Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HGetterCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHGetterCalculator()
	 * @generated
	 */
	int HGETTER_CALCULATOR = 22;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HGetter Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HGetter Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HSetterCalculatorImpl <em>HSetter Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HSetterCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHSetterCalculator()
	 * @generated
	 */
	int HSETTER_CALCULATOR = 23;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HSetter Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HSetter Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HInvocationRelationCalculator <em>HInvocation Relation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HInvocation Relation Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HInvocationRelationCalculator
	 * @generated
	 */
	EClass getHInvocationRelationCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HInvocationRelationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HInvocationRelationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHInvocationRelationCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HInvocationRelationCalculator#calculateInvocValue(org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric, org.gravity.hulk.antipatterngraph.metrics.HOutgoingInvocationMetric) <em>Calculate Invoc Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Invoc Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HInvocationRelationCalculator#calculateInvocValue(org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric, org.gravity.hulk.antipatterngraph.metrics.HOutgoingInvocationMetric)
	 * @generated
	 */
	EOperation getHInvocationRelationCalculator__CalculateInvocValue__HIncommingInvocationMetric_HOutgoingInvocationMetric();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HInvocationRelationCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HInvocationRelationCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHInvocationRelationCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HIGAMCalculator <em>HIGAM Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIGAM Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HIGAMCalculator
	 * @generated
	 */
	EClass getHIGAMCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HIGAMCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HIGAMCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHIGAMCalculator__Detect__HAntiPatternGraph();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HNumberOfChildCalculator <em>HNumber Of Child Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Child Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HNumberOfChildCalculator
	 * @generated
	 */
	EClass getHNumberOfChildCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HNumberOfChildCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HNumberOfChildCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHNumberOfChildCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HNumberOfChildCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HNumberOfChildCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHNumberOfChildCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HIGATCalculator <em>HIGAT Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIGAT Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HIGATCalculator
	 * @generated
	 */
	EClass getHIGATCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HIGATCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HIGATCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHIGATCalculator__Detect__HAntiPatternGraph();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HMemberNumberCalculator <em>HMember Number Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMember Number Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HMemberNumberCalculator
	 * @generated
	 */
	EClass getHMemberNumberCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HMemberNumberCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HMemberNumberCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHMemberNumberCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HMemberNumberCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HMemberNumberCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHMemberNumberCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator <em>HLocal Access Relation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Access Relation Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator
	 * @generated
	 */
	EClass getHLocalAccessRelationCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalAccessRelationCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator#calculateValue(org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric, org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator#calculateValue(org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric, org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric)
	 * @generated
	 */
	EOperation getHLocalAccessRelationCalculator__CalculateValue__HLocalFieldAccessesMetric_HLocalMethodAccessesMetric();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalAccessRelationCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HMethodNumberCalculator <em>HMethod Number Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMethod Number Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HMethodNumberCalculator
	 * @generated
	 */
	EClass getHMethodNumberCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HMethodNumberCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HMethodNumberCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHMethodNumberCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HMethodNumberCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HMethodNumberCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHMethodNumberCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator <em>HGetter Setter Method Relation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HGetter Setter Method Relation Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator
	 * @generated
	 */
	EClass getHGetterSetterMethodRelationCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHGetterSetterMethodRelationCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator#calculateValue(org.gravity.hulk.antipatterngraph.metrics.HSetterMetric, org.gravity.hulk.antipatterngraph.metrics.HGetterMetric, org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator#calculateValue(org.gravity.hulk.antipatterngraph.metrics.HSetterMetric, org.gravity.hulk.antipatterngraph.metrics.HGetterMetric, org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric)
	 * @generated
	 */
	EOperation getHGetterSetterMethodRelationCalculator__CalculateValue__HSetterMetric_HGetterMetric_HNumberOfMethodsMetric();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHGetterSetterMethodRelationCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HAverageParametersCalculator <em>HAverage Parameters Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAverage Parameters Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HAverageParametersCalculator
	 * @generated
	 */
	EClass getHAverageParametersCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HAverageParametersCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HAverageParametersCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHAverageParametersCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HAverageParametersCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HAverageParametersCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHAverageParametersCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator <em>HAverage Overloading In Class Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAverage Overloading In Class Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator
	 * @generated
	 */
	EClass getHAverageOverloadingInClassCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHAverageOverloadingInClassCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHAverageOverloadingInClassCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator <em>HLocal Method Access Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Method Access Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator
	 * @generated
	 */
	EClass getHLocalMethodAccessCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalMethodAccessCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalMethodAccessCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator <em>HLocal Fields Access Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Fields Access Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator
	 * @generated
	 */
	EClass getHLocalFieldsAccessCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalFieldsAccessCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalFieldsAccessCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HFieldNumberCalculator <em>HField Number Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HField Number Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HFieldNumberCalculator
	 * @generated
	 */
	EClass getHFieldNumberCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HFieldNumberCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HFieldNumberCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHFieldNumberCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HFieldNumberCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HFieldNumberCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHFieldNumberCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HTotalVisibilityCalculator <em>HTotal Visibility Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTotal Visibility Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HTotalVisibilityCalculator
	 * @generated
	 */
	EClass getHTotalVisibilityCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HTotalVisibilityCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HTotalVisibilityCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHTotalVisibilityCalculator__Detect__HAntiPatternGraph();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HTotalCouplingCalculator <em>HTotal Coupling Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTotal Coupling Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HTotalCouplingCalculator
	 * @generated
	 */
	EClass getHTotalCouplingCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HTotalCouplingCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HTotalCouplingCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHTotalCouplingCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HTotalCouplingCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HTotalCouplingCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHTotalCouplingCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HLcom5Calculator <em>HLcom5 Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLcom5 Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HLcom5Calculator
	 * @generated
	 */
	EClass getHLcom5Calculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLcom5Calculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLcom5Calculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLcom5Calculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLcom5Calculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLcom5Calculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLcom5Calculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLcom5Calculator#calculateLcom5Value(org.gravity.hulk.antipatterngraph.metrics.HNumberOfFieldsMetric, org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric, org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric) <em>Calculate Lcom5 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Lcom5 Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLcom5Calculator#calculateLcom5Value(org.gravity.hulk.antipatterngraph.metrics.HNumberOfFieldsMetric, org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric, org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric)
	 * @generated
	 */
	EOperation getHLcom5Calculator__CalculateLcom5Value__HNumberOfFieldsMetric_HNumberOfMethodsMetric_HLocalFieldUniqueAccessMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HLocalFieldUniqueAccessCalculator <em>HLocal Field Unique Access Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Field Unique Access Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HLocalFieldUniqueAccessCalculator
	 * @generated
	 */
	EClass getHLocalFieldUniqueAccessCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalFieldUniqueAccessCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalFieldUniqueAccessCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalFieldUniqueAccessCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalFieldUniqueAccessCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalFieldUniqueAccessCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalFieldUniqueAccessCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator <em>HAfferent Coupling Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAfferent Coupling Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator
	 * @generated
	 */
	EClass getHAfferentCouplingCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHAfferentCouplingCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHAfferentCouplingCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator <em>HEfferent Coupling Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HEfferent Coupling Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator
	 * @generated
	 */
	EClass getHEfferentCouplingCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHEfferentCouplingCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHEfferentCouplingCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HIncommingInvocationCalculator <em>HIncomming Invocation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIncomming Invocation Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HIncommingInvocationCalculator
	 * @generated
	 */
	EClass getHIncommingInvocationCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HIncommingInvocationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HIncommingInvocationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHIncommingInvocationCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HIncommingInvocationCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HIncommingInvocationCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHIncommingInvocationCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HOutgoingInvocationCalculator <em>HOutgoing Invocation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HOutgoing Invocation Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HOutgoingInvocationCalculator
	 * @generated
	 */
	EClass getHOutgoingInvocationCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HOutgoingInvocationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HOutgoingInvocationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHOutgoingInvocationCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HOutgoingInvocationCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HOutgoingInvocationCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHOutgoingInvocationCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HDepthOfInheritanceCalculator <em>HDepth Of Inheritance Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDepth Of Inheritance Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HDepthOfInheritanceCalculator
	 * @generated
	 */
	EClass getHDepthOfInheritanceCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HDepthOfInheritanceCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HDepthOfInheritanceCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHDepthOfInheritanceCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HDepthOfInheritanceCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HDepthOfInheritanceCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHDepthOfInheritanceCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HGetterCalculator <em>HGetter Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HGetter Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HGetterCalculator
	 * @generated
	 */
	EClass getHGetterCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HGetterCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HGetterCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHGetterCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HGetterCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HGetterCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHGetterCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HSetterCalculator <em>HSetter Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSetter Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HSetterCalculator
	 * @generated
	 */
	EClass getHSetterCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HSetterCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HSetterCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHSetterCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HSetterCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HSetterCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHSetterCalculator__CalculateValue__TClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetricsFactory getMetricsFactory();

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
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HInvocationRelationCalculatorImpl <em>HInvocation Relation Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HInvocationRelationCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHInvocationRelationCalculator()
		 * @generated
		 */
		EClass HINVOCATION_RELATION_CALCULATOR = eINSTANCE.getHInvocationRelationCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HINVOCATION_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHInvocationRelationCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Invoc Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HINVOCATION_RELATION_CALCULATOR___CALCULATE_INVOC_VALUE__HINCOMMINGINVOCATIONMETRIC_HOUTGOINGINVOCATIONMETRIC = eINSTANCE
				.getHInvocationRelationCalculator__CalculateInvocValue__HIncommingInvocationMetric_HOutgoingInvocationMetric();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HINVOCATION_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHInvocationRelationCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HIGAMCalculatorImpl <em>HIGAM Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HIGAMCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHIGAMCalculator()
		 * @generated
		 */
		EClass HIGAM_CALCULATOR = eINSTANCE.getHIGAMCalculator();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIGAM_CALCULATOR___DETECT__HANTIPATTERNGRAPH = eINSTANCE
				.getHIGAMCalculator__Detect__HAntiPatternGraph();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HNumberOfChildCalculatorImpl <em>HNumber Of Child Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HNumberOfChildCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHNumberOfChildCalculator()
		 * @generated
		 */
		EClass HNUMBER_OF_CHILD_CALCULATOR = eINSTANCE.getHNumberOfChildCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHNumberOfChildCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHNumberOfChildCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HIGATCalculatorImpl <em>HIGAT Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HIGATCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHIGATCalculator()
		 * @generated
		 */
		EClass HIGAT_CALCULATOR = eINSTANCE.getHIGATCalculator();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIGAT_CALCULATOR___DETECT__HANTIPATTERNGRAPH = eINSTANCE
				.getHIGATCalculator__Detect__HAntiPatternGraph();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HMemberNumberCalculatorImpl <em>HMember Number Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HMemberNumberCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHMemberNumberCalculator()
		 * @generated
		 */
		EClass HMEMBER_NUMBER_CALCULATOR = eINSTANCE.getHMemberNumberCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMEMBER_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHMemberNumberCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMEMBER_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHMemberNumberCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalAccessRelationCalculatorImpl <em>HLocal Access Relation Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HLocalAccessRelationCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalAccessRelationCalculator()
		 * @generated
		 */
		EClass HLOCAL_ACCESS_RELATION_CALCULATOR = eINSTANCE.getHLocalAccessRelationCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHLocalAccessRelationCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__HLOCALFIELDACCESSESMETRIC_HLOCALMETHODACCESSESMETRIC = eINSTANCE
				.getHLocalAccessRelationCalculator__CalculateValue__HLocalFieldAccessesMetric_HLocalMethodAccessesMetric();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHLocalAccessRelationCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HMethodNumberCalculatorImpl <em>HMethod Number Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HMethodNumberCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHMethodNumberCalculator()
		 * @generated
		 */
		EClass HMETHOD_NUMBER_CALCULATOR = eINSTANCE.getHMethodNumberCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMETHOD_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHMethodNumberCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMETHOD_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHMethodNumberCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HGetterSetterMethodRelationCalculatorImpl <em>HGetter Setter Method Relation Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HGetterSetterMethodRelationCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHGetterSetterMethodRelationCalculator()
		 * @generated
		 */
		EClass HGETTER_SETTER_METHOD_RELATION_CALCULATOR = eINSTANCE.getHGetterSetterMethodRelationCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHGetterSetterMethodRelationCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__HSETTERMETRIC_HGETTERMETRIC_HNUMBEROFMETHODSMETRIC = eINSTANCE
				.getHGetterSetterMethodRelationCalculator__CalculateValue__HSetterMetric_HGetterMetric_HNumberOfMethodsMetric();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHGetterSetterMethodRelationCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HAverageParametersCalculatorImpl <em>HAverage Parameters Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HAverageParametersCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHAverageParametersCalculator()
		 * @generated
		 */
		EClass HAVERAGE_PARAMETERS_CALCULATOR = eINSTANCE.getHAverageParametersCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAVERAGE_PARAMETERS_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHAverageParametersCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAVERAGE_PARAMETERS_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHAverageParametersCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HAverageOverloadingInClassCalculatorImpl <em>HAverage Overloading In Class Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HAverageOverloadingInClassCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHAverageOverloadingInClassCalculator()
		 * @generated
		 */
		EClass HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR = eINSTANCE.getHAverageOverloadingInClassCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHAverageOverloadingInClassCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHAverageOverloadingInClassCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalMethodAccessCalculatorImpl <em>HLocal Method Access Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HLocalMethodAccessCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalMethodAccessCalculator()
		 * @generated
		 */
		EClass HLOCAL_METHOD_ACCESS_CALCULATOR = eINSTANCE.getHLocalMethodAccessCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHLocalMethodAccessCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHLocalMethodAccessCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalFieldsAccessCalculatorImpl <em>HLocal Fields Access Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HLocalFieldsAccessCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalFieldsAccessCalculator()
		 * @generated
		 */
		EClass HLOCAL_FIELDS_ACCESS_CALCULATOR = eINSTANCE.getHLocalFieldsAccessCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHLocalFieldsAccessCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHLocalFieldsAccessCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HFieldNumberCalculatorImpl <em>HField Number Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HFieldNumberCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHFieldNumberCalculator()
		 * @generated
		 */
		EClass HFIELD_NUMBER_CALCULATOR = eINSTANCE.getHFieldNumberCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HFIELD_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHFieldNumberCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HFIELD_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHFieldNumberCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HTotalVisibilityCalculatorImpl <em>HTotal Visibility Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HTotalVisibilityCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHTotalVisibilityCalculator()
		 * @generated
		 */
		EClass HTOTAL_VISIBILITY_CALCULATOR = eINSTANCE.getHTotalVisibilityCalculator();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HTOTAL_VISIBILITY_CALCULATOR___DETECT__HANTIPATTERNGRAPH = eINSTANCE
				.getHTotalVisibilityCalculator__Detect__HAntiPatternGraph();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HTotalCouplingCalculatorImpl <em>HTotal Coupling Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HTotalCouplingCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHTotalCouplingCalculator()
		 * @generated
		 */
		EClass HTOTAL_COUPLING_CALCULATOR = eINSTANCE.getHTotalCouplingCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HTOTAL_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHTotalCouplingCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HTOTAL_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHTotalCouplingCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HLcom5CalculatorImpl <em>HLcom5 Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HLcom5CalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLcom5Calculator()
		 * @generated
		 */
		EClass HLCOM5_CALCULATOR = eINSTANCE.getHLcom5Calculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLCOM5_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHLcom5Calculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLCOM5_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHLcom5Calculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Lcom5 Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLCOM5_CALCULATOR___CALCULATE_LCOM5_VALUE__HNUMBEROFFIELDSMETRIC_HNUMBEROFMETHODSMETRIC_HLOCALFIELDUNIQUEACCESSMETRIC = eINSTANCE
				.getHLcom5Calculator__CalculateLcom5Value__HNumberOfFieldsMetric_HNumberOfMethodsMetric_HLocalFieldUniqueAccessMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalFieldUniqueAccessCalculatorImpl <em>HLocal Field Unique Access Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HLocalFieldUniqueAccessCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalFieldUniqueAccessCalculator()
		 * @generated
		 */
		EClass HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR = eINSTANCE.getHLocalFieldUniqueAccessCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHLocalFieldUniqueAccessCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHLocalFieldUniqueAccessCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HAfferentCouplingCalculatorImpl <em>HAfferent Coupling Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HAfferentCouplingCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHAfferentCouplingCalculator()
		 * @generated
		 */
		EClass HAFFERENT_COUPLING_CALCULATOR = eINSTANCE.getHAfferentCouplingCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAFFERENT_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHAfferentCouplingCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAFFERENT_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHAfferentCouplingCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HEfferentCouplingCalculatorImpl <em>HEfferent Coupling Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HEfferentCouplingCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHEfferentCouplingCalculator()
		 * @generated
		 */
		EClass HEFFERENT_COUPLING_CALCULATOR = eINSTANCE.getHEfferentCouplingCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEFFERENT_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHEfferentCouplingCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEFFERENT_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHEfferentCouplingCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HIncommingInvocationCalculatorImpl <em>HIncomming Invocation Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HIncommingInvocationCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHIncommingInvocationCalculator()
		 * @generated
		 */
		EClass HINCOMMING_INVOCATION_CALCULATOR = eINSTANCE.getHIncommingInvocationCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HINCOMMING_INVOCATION_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHIncommingInvocationCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HINCOMMING_INVOCATION_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHIncommingInvocationCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HOutgoingInvocationCalculatorImpl <em>HOutgoing Invocation Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HOutgoingInvocationCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHOutgoingInvocationCalculator()
		 * @generated
		 */
		EClass HOUTGOING_INVOCATION_CALCULATOR = eINSTANCE.getHOutgoingInvocationCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOUTGOING_INVOCATION_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHOutgoingInvocationCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOUTGOING_INVOCATION_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHOutgoingInvocationCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HDepthOfInheritanceCalculatorImpl <em>HDepth Of Inheritance Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HDepthOfInheritanceCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHDepthOfInheritanceCalculator()
		 * @generated
		 */
		EClass HDEPTH_OF_INHERITANCE_CALCULATOR = eINSTANCE.getHDepthOfInheritanceCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHDepthOfInheritanceCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHDepthOfInheritanceCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HGetterCalculatorImpl <em>HGetter Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HGetterCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHGetterCalculator()
		 * @generated
		 */
		EClass HGETTER_CALCULATOR = eINSTANCE.getHGetterCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGETTER_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHGetterCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGETTER_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHGetterCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HSetterCalculatorImpl <em>HSetter Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HSetterCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHSetterCalculator()
		 * @generated
		 */
		EClass HSETTER_CALCULATOR = eINSTANCE.getHSetterCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSETTER_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHSetterCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSETTER_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHSetterCalculator__CalculateValue__TClass();

	}

} //MetricsPackage
