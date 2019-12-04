/**
 */
package org.gravity.hulk.detection.codesmells;

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
 * @see org.gravity.hulk.detection.codesmells.CodesmellsFactory
 * @model kind="package"
 * @generated
 */
public interface CodesmellsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codesmells";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.gravity.hulk/model/Hulk.ecore#//detection/codesmells";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codesmells";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodesmellsPackage eINSTANCE = org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.codesmells.impl.HContollerClassDetectorImpl <em>HContoller Class Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.codesmells.impl.HContollerClassDetectorImpl
	 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHContollerClassDetector()
	 * @generated
	 */
	int HCONTOLLER_CLASS_DETECTOR = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR__INCOMING = DetectionPackage.HCODE_SMELL_DETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR__GRAPH = DetectionPackage.HCODE_SMELL_DETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR__ORIGIN = DetectionPackage.HCODE_SMELL_DETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR__OUTGOING = DetectionPackage.HCODE_SMELL_DETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR__POST_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR__HANNOTATION = DetectionPackage.HCODE_SMELL_DETECTOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCODE_SMELL_DETECTOR__HANTI_PATTERN_HANDLING;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR__RELATIVE = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR__THRESHOLD = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HContoller Class Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR_FEATURE_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Calculate Relative Threshold</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT
			+ 4;

	/**
	 * The number of operations of the '<em>HContoller Class Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTOLLER_CLASS_DETECTOR_OPERATION_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.codesmells.impl.HDataClassDetectorImpl <em>HData Class Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.codesmells.impl.HDataClassDetectorImpl
	 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHDataClassDetector()
	 * @generated
	 */
	int HDATA_CLASS_DETECTOR = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR__INCOMING = DetectionPackage.HCODE_SMELL_DETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR__GRAPH = DetectionPackage.HCODE_SMELL_DETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR__ORIGIN = DetectionPackage.HCODE_SMELL_DETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR__OUTGOING = DetectionPackage.HCODE_SMELL_DETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR__POST_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR__HANNOTATION = DetectionPackage.HCODE_SMELL_DETECTOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCODE_SMELL_DETECTOR__HANTI_PATTERN_HANDLING;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR__RELATIVE = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR__THRESHOLD = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HData Class Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR_FEATURE_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Make Child DC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR___MAKE_CHILD_DC__TCLASS_HDATACLASSSMELL = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Calculate Relative Threshold</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT
			+ 5;

	/**
	 * The number of operations of the '<em>HData Class Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_DETECTOR_OPERATION_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.codesmells.impl.HEmptyClassDetectorImpl <em>HEmpty Class Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.codesmells.impl.HEmptyClassDetectorImpl
	 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHEmptyClassDetector()
	 * @generated
	 */
	int HEMPTY_CLASS_DETECTOR = 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_DETECTOR__INCOMING = DetectionPackage.HCLASS_BASED_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_DETECTOR__GRAPH = DetectionPackage.HCLASS_BASED_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_DETECTOR__ORIGIN = DetectionPackage.HCLASS_BASED_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_DETECTOR__OUTGOING = DetectionPackage.HCLASS_BASED_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_DETECTOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_DETECTOR__HANNOTATION = DetectionPackage.HCLASS_BASED_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HEmpty Class Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_DETECTOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>HEmpty Class Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_DETECTOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.codesmells.impl.HGetterSetterDetectorImpl <em>HGetter Setter Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.codesmells.impl.HGetterSetterDetectorImpl
	 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHGetterSetterDetector()
	 * @generated
	 */
	int HGETTER_SETTER_DETECTOR = 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR__INCOMING = DetectionPackage.HCODE_SMELL_DETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR__GRAPH = DetectionPackage.HCODE_SMELL_DETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR__ORIGIN = DetectionPackage.HCODE_SMELL_DETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR__OUTGOING = DetectionPackage.HCODE_SMELL_DETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR__POST_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR__HANNOTATION = DetectionPackage.HCODE_SMELL_DETECTOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCODE_SMELL_DETECTOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HGetter Setter Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR_FEATURE_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Getter Setter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR___IS_GETTER_SETTER__TMETHODDEFINITION = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>HGetter Setter Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_DETECTOR_OPERATION_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.codesmells.impl.HLargeClassLowCohesionDetectorImpl <em>HLarge Class Low Cohesion Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.codesmells.impl.HLargeClassLowCohesionDetectorImpl
	 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHLargeClassLowCohesionDetector()
	 * @generated
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR = 4;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR__INCOMING = DetectionPackage.HCLASS_BASED_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR__GRAPH = DetectionPackage.HCLASS_BASED_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR__ORIGIN = DetectionPackage.HCLASS_BASED_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR__OUTGOING = DetectionPackage.HCLASS_BASED_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR__HANNOTATION = DetectionPackage.HCLASS_BASED_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HLarge Class Low Cohesion Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The number of operations of the '<em>HLarge Class Low Cohesion Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_DETECTOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.codesmells.impl.HLargeClassDetectorImpl <em>HLarge Class Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.codesmells.impl.HLargeClassDetectorImpl
	 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHLargeClassDetector()
	 * @generated
	 */
	int HLARGE_CLASS_DETECTOR = 5;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR__INCOMING = DetectionPackage.HCLASS_BASED_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR__GRAPH = DetectionPackage.HCLASS_BASED_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR__ORIGIN = DetectionPackage.HCLASS_BASED_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR__OUTGOING = DetectionPackage.HCLASS_BASED_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR__HANNOTATION = DetectionPackage.HCLASS_BASED_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR__RELATIVE = DetectionPackage.HCLASS_BASED_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR__THRESHOLD = DetectionPackage.HCLASS_BASED_CALCULATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HLarge Class Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_CALCULATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate Relative Threshold</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>HLarge Class Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_DETECTOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.codesmells.impl.HLowCohesionDetectorImpl <em>HLow Cohesion Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.codesmells.impl.HLowCohesionDetectorImpl
	 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHLowCohesionDetector()
	 * @generated
	 */
	int HLOW_COHESION_DETECTOR = 6;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR__INCOMING = DetectionPackage.HCLASS_BASED_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR__GRAPH = DetectionPackage.HCLASS_BASED_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR__ORIGIN = DetectionPackage.HCLASS_BASED_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR__OUTGOING = DetectionPackage.HCLASS_BASED_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR__HANNOTATION = DetectionPackage.HCLASS_BASED_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR__RELATIVE = DetectionPackage.HCLASS_BASED_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR__THRESHOLD = DetectionPackage.HCLASS_BASED_CALCULATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HLow Cohesion Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_CALCULATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate Relative Threshold</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>HLow Cohesion Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_DETECTOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.codesmells.impl.HDataClassAccessorDetectorImpl <em>HData Class Accessor Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.codesmells.impl.HDataClassAccessorDetectorImpl
	 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHDataClassAccessorDetector()
	 * @generated
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR = 7;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR__INCOMING = DetectionPackage.HCODE_SMELL_DETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR__GRAPH = DetectionPackage.HCODE_SMELL_DETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR__ORIGIN = DetectionPackage.HCODE_SMELL_DETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR__OUTGOING = DetectionPackage.HCODE_SMELL_DETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR__POST_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR__HANNOTATION = DetectionPackage.HCODE_SMELL_DETECTOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCODE_SMELL_DETECTOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HData Class Accessor Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR_FEATURE_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>HData Class Accessor Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_DETECTOR_OPERATION_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.codesmells.impl.HManyParametersDetectorImpl <em>HMany Parameters Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.codesmells.impl.HManyParametersDetectorImpl
	 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHManyParametersDetector()
	 * @generated
	 */
	int HMANY_PARAMETERS_DETECTOR = 8;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR__INCOMING = DetectionPackage.HCODE_SMELL_DETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR__GRAPH = DetectionPackage.HCODE_SMELL_DETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR__ORIGIN = DetectionPackage.HCODE_SMELL_DETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR__OUTGOING = DetectionPackage.HCODE_SMELL_DETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR__POST_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR__HANNOTATION = DetectionPackage.HCODE_SMELL_DETECTOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCODE_SMELL_DETECTOR__HANTI_PATTERN_HANDLING;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR__RELATIVE = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR__THRESHOLD = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HMany Parameters Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR_FEATURE_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Calculate Relative Threshold</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT
			+ 4;

	/**
	 * The number of operations of the '<em>HMany Parameters Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_DETECTOR_OPERATION_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.codesmells.impl.HMuchOverloadingDetectorImpl <em>HMuch Overloading Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.codesmells.impl.HMuchOverloadingDetectorImpl
	 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHMuchOverloadingDetector()
	 * @generated
	 */
	int HMUCH_OVERLOADING_DETECTOR = 9;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR__INCOMING = DetectionPackage.HCODE_SMELL_DETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR__GRAPH = DetectionPackage.HCODE_SMELL_DETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR__ORIGIN = DetectionPackage.HCODE_SMELL_DETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR__OUTGOING = DetectionPackage.HCODE_SMELL_DETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR__POST_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR__HANNOTATION = DetectionPackage.HCODE_SMELL_DETECTOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCODE_SMELL_DETECTOR__HANTI_PATTERN_HANDLING;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR__RELATIVE = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR__THRESHOLD = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HMuch Overloading Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR_FEATURE_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Calculate Relative Threshold</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT
			+ 4;

	/**
	 * The number of operations of the '<em>HMuch Overloading Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_DETECTOR_OPERATION_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.codesmells.impl.HIntenseFieldUsageDetectorImpl <em>HIntense Field Usage Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.codesmells.impl.HIntenseFieldUsageDetectorImpl
	 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHIntenseFieldUsageDetector()
	 * @generated
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR = 10;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR__INCOMING = DetectionPackage.HCODE_SMELL_DETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR__GRAPH = DetectionPackage.HCODE_SMELL_DETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR__ORIGIN = DetectionPackage.HCODE_SMELL_DETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR__OUTGOING = DetectionPackage.HCODE_SMELL_DETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR__POST_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HCODE_SMELL_DETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR__HANNOTATION = DetectionPackage.HCODE_SMELL_DETECTOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCODE_SMELL_DETECTOR__HANTI_PATTERN_HANDLING;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR__RELATIVE = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR__THRESHOLD = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HIntense Field Usage Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR_FEATURE_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Calculate Relative Threshold</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT
			+ 4;

	/**
	 * The number of operations of the '<em>HIntense Field Usage Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_DETECTOR_OPERATION_COUNT = DetectionPackage.HCODE_SMELL_DETECTOR_OPERATION_COUNT + 5;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.codesmells.HContollerClassDetector <em>HContoller Class Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HContoller Class Detector</em>'.
	 * @see org.gravity.hulk.detection.codesmells.HContollerClassDetector
	 * @generated
	 */
	EClass getHContollerClassDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HContollerClassDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HContollerClassDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHContollerClassDetector__Calculate__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HContollerClassDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants) <em>Calculate Relative Threshold</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Relative Threshold</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HContollerClassDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants)
	 * @generated
	 */
	EOperation getHContollerClassDetector__CalculateRelativeThreshold__HRelativeValueConstants();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.codesmells.HDataClassDetector <em>HData Class Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HData Class Detector</em>'.
	 * @see org.gravity.hulk.detection.codesmells.HDataClassDetector
	 * @generated
	 */
	EClass getHDataClassDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HDataClassDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HDataClassDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHDataClassDetector__Calculate__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HDataClassDetector#makeChildDC(org.gravity.typegraph.basic.TClass, org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell) <em>Make Child DC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Child DC</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HDataClassDetector#makeChildDC(org.gravity.typegraph.basic.TClass, org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell)
	 * @generated
	 */
	EOperation getHDataClassDetector__MakeChildDC__TClass_HDataClassSmell();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HDataClassDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants) <em>Calculate Relative Threshold</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Relative Threshold</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HDataClassDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants)
	 * @generated
	 */
	EOperation getHDataClassDetector__CalculateRelativeThreshold__HRelativeValueConstants();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.codesmells.HEmptyClassDetector <em>HEmpty Class Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HEmpty Class Detector</em>'.
	 * @see org.gravity.hulk.detection.codesmells.HEmptyClassDetector
	 * @generated
	 */
	EClass getHEmptyClassDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HEmptyClassDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HEmptyClassDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHEmptyClassDetector__Calculate__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.codesmells.HGetterSetterDetector <em>HGetter Setter Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HGetter Setter Detector</em>'.
	 * @see org.gravity.hulk.detection.codesmells.HGetterSetterDetector
	 * @generated
	 */
	EClass getHGetterSetterDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HGetterSetterDetector#isGetterSetter(org.gravity.typegraph.basic.TMethodDefinition) <em>Is Getter Setter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Getter Setter</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HGetterSetterDetector#isGetterSetter(org.gravity.typegraph.basic.TMethodDefinition)
	 * @generated
	 */
	EOperation getHGetterSetterDetector__IsGetterSetter__TMethodDefinition();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HGetterSetterDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HGetterSetterDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHGetterSetterDetector__Calculate__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.codesmells.HLargeClassLowCohesionDetector <em>HLarge Class Low Cohesion Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLarge Class Low Cohesion Detector</em>'.
	 * @see org.gravity.hulk.detection.codesmells.HLargeClassLowCohesionDetector
	 * @generated
	 */
	EClass getHLargeClassLowCohesionDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HLargeClassLowCohesionDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HLargeClassLowCohesionDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLargeClassLowCohesionDetector__Calculate__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.codesmells.HLargeClassDetector <em>HLarge Class Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLarge Class Detector</em>'.
	 * @see org.gravity.hulk.detection.codesmells.HLargeClassDetector
	 * @generated
	 */
	EClass getHLargeClassDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HLargeClassDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HLargeClassDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLargeClassDetector__Calculate__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HLargeClassDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants) <em>Calculate Relative Threshold</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Relative Threshold</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HLargeClassDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants)
	 * @generated
	 */
	EOperation getHLargeClassDetector__CalculateRelativeThreshold__HRelativeValueConstants();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.codesmells.HLowCohesionDetector <em>HLow Cohesion Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLow Cohesion Detector</em>'.
	 * @see org.gravity.hulk.detection.codesmells.HLowCohesionDetector
	 * @generated
	 */
	EClass getHLowCohesionDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HLowCohesionDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HLowCohesionDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLowCohesionDetector__Calculate__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HLowCohesionDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants) <em>Calculate Relative Threshold</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Relative Threshold</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HLowCohesionDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants)
	 * @generated
	 */
	EOperation getHLowCohesionDetector__CalculateRelativeThreshold__HRelativeValueConstants();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.codesmells.HDataClassAccessorDetector <em>HData Class Accessor Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HData Class Accessor Detector</em>'.
	 * @see org.gravity.hulk.detection.codesmells.HDataClassAccessorDetector
	 * @generated
	 */
	EClass getHDataClassAccessorDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HDataClassAccessorDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HDataClassAccessorDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHDataClassAccessorDetector__Calculate__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.codesmells.HManyParametersDetector <em>HMany Parameters Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMany Parameters Detector</em>'.
	 * @see org.gravity.hulk.detection.codesmells.HManyParametersDetector
	 * @generated
	 */
	EClass getHManyParametersDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HManyParametersDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HManyParametersDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHManyParametersDetector__Calculate__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HManyParametersDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants) <em>Calculate Relative Threshold</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Relative Threshold</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HManyParametersDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants)
	 * @generated
	 */
	EOperation getHManyParametersDetector__CalculateRelativeThreshold__HRelativeValueConstants();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector <em>HMuch Overloading Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMuch Overloading Detector</em>'.
	 * @see org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector
	 * @generated
	 */
	EClass getHMuchOverloadingDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHMuchOverloadingDetector__Calculate__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants) <em>Calculate Relative Threshold</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Relative Threshold</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants)
	 * @generated
	 */
	EOperation getHMuchOverloadingDetector__CalculateRelativeThreshold__HRelativeValueConstants();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector <em>HIntense Field Usage Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIntense Field Usage Detector</em>'.
	 * @see org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector
	 * @generated
	 */
	EClass getHIntenseFieldUsageDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHIntenseFieldUsageDetector__Calculate__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants) <em>Calculate Relative Threshold</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Relative Threshold</em>' operation.
	 * @see org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector#calculateRelativeThreshold(org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants)
	 * @generated
	 */
	EOperation getHIntenseFieldUsageDetector__CalculateRelativeThreshold__HRelativeValueConstants();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodesmellsFactory getCodesmellsFactory();

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
		 * The meta object literal for the '{@link org.gravity.hulk.detection.codesmells.impl.HContollerClassDetectorImpl <em>HContoller Class Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.codesmells.impl.HContollerClassDetectorImpl
		 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHContollerClassDetector()
		 * @generated
		 */
		EClass HCONTOLLER_CLASS_DETECTOR = eINSTANCE.getHContollerClassDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HCONTOLLER_CLASS_DETECTOR___CALCULATE__TCLASS = eINSTANCE
				.getHContollerClassDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Relative Threshold</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HCONTOLLER_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = eINSTANCE
				.getHContollerClassDetector__CalculateRelativeThreshold__HRelativeValueConstants();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.codesmells.impl.HDataClassDetectorImpl <em>HData Class Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.codesmells.impl.HDataClassDetectorImpl
		 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHDataClassDetector()
		 * @generated
		 */
		EClass HDATA_CLASS_DETECTOR = eINSTANCE.getHDataClassDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HDATA_CLASS_DETECTOR___CALCULATE__TCLASS = eINSTANCE.getHDataClassDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '<em><b>Make Child DC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HDATA_CLASS_DETECTOR___MAKE_CHILD_DC__TCLASS_HDATACLASSSMELL = eINSTANCE
				.getHDataClassDetector__MakeChildDC__TClass_HDataClassSmell();

		/**
		 * The meta object literal for the '<em><b>Calculate Relative Threshold</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HDATA_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = eINSTANCE
				.getHDataClassDetector__CalculateRelativeThreshold__HRelativeValueConstants();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.codesmells.impl.HEmptyClassDetectorImpl <em>HEmpty Class Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.codesmells.impl.HEmptyClassDetectorImpl
		 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHEmptyClassDetector()
		 * @generated
		 */
		EClass HEMPTY_CLASS_DETECTOR = eINSTANCE.getHEmptyClassDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEMPTY_CLASS_DETECTOR___CALCULATE__TCLASS = eINSTANCE.getHEmptyClassDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.codesmells.impl.HGetterSetterDetectorImpl <em>HGetter Setter Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.codesmells.impl.HGetterSetterDetectorImpl
		 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHGetterSetterDetector()
		 * @generated
		 */
		EClass HGETTER_SETTER_DETECTOR = eINSTANCE.getHGetterSetterDetector();

		/**
		 * The meta object literal for the '<em><b>Is Getter Setter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGETTER_SETTER_DETECTOR___IS_GETTER_SETTER__TMETHODDEFINITION = eINSTANCE
				.getHGetterSetterDetector__IsGetterSetter__TMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGETTER_SETTER_DETECTOR___CALCULATE__TCLASS = eINSTANCE
				.getHGetterSetterDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.codesmells.impl.HLargeClassLowCohesionDetectorImpl <em>HLarge Class Low Cohesion Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.codesmells.impl.HLargeClassLowCohesionDetectorImpl
		 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHLargeClassLowCohesionDetector()
		 * @generated
		 */
		EClass HLARGE_CLASS_LOW_COHESION_DETECTOR = eINSTANCE.getHLargeClassLowCohesionDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLARGE_CLASS_LOW_COHESION_DETECTOR___CALCULATE__TCLASS = eINSTANCE
				.getHLargeClassLowCohesionDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.codesmells.impl.HLargeClassDetectorImpl <em>HLarge Class Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.codesmells.impl.HLargeClassDetectorImpl
		 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHLargeClassDetector()
		 * @generated
		 */
		EClass HLARGE_CLASS_DETECTOR = eINSTANCE.getHLargeClassDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLARGE_CLASS_DETECTOR___CALCULATE__TCLASS = eINSTANCE.getHLargeClassDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Relative Threshold</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLARGE_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = eINSTANCE
				.getHLargeClassDetector__CalculateRelativeThreshold__HRelativeValueConstants();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.codesmells.impl.HLowCohesionDetectorImpl <em>HLow Cohesion Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.codesmells.impl.HLowCohesionDetectorImpl
		 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHLowCohesionDetector()
		 * @generated
		 */
		EClass HLOW_COHESION_DETECTOR = eINSTANCE.getHLowCohesionDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOW_COHESION_DETECTOR___CALCULATE__TCLASS = eINSTANCE.getHLowCohesionDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Relative Threshold</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOW_COHESION_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = eINSTANCE
				.getHLowCohesionDetector__CalculateRelativeThreshold__HRelativeValueConstants();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.codesmells.impl.HDataClassAccessorDetectorImpl <em>HData Class Accessor Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.codesmells.impl.HDataClassAccessorDetectorImpl
		 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHDataClassAccessorDetector()
		 * @generated
		 */
		EClass HDATA_CLASS_ACCESSOR_DETECTOR = eINSTANCE.getHDataClassAccessorDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HDATA_CLASS_ACCESSOR_DETECTOR___CALCULATE__TCLASS = eINSTANCE
				.getHDataClassAccessorDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.codesmells.impl.HManyParametersDetectorImpl <em>HMany Parameters Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.codesmells.impl.HManyParametersDetectorImpl
		 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHManyParametersDetector()
		 * @generated
		 */
		EClass HMANY_PARAMETERS_DETECTOR = eINSTANCE.getHManyParametersDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMANY_PARAMETERS_DETECTOR___CALCULATE__TCLASS = eINSTANCE
				.getHManyParametersDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Relative Threshold</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMANY_PARAMETERS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = eINSTANCE
				.getHManyParametersDetector__CalculateRelativeThreshold__HRelativeValueConstants();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.codesmells.impl.HMuchOverloadingDetectorImpl <em>HMuch Overloading Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.codesmells.impl.HMuchOverloadingDetectorImpl
		 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHMuchOverloadingDetector()
		 * @generated
		 */
		EClass HMUCH_OVERLOADING_DETECTOR = eINSTANCE.getHMuchOverloadingDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMUCH_OVERLOADING_DETECTOR___CALCULATE__TCLASS = eINSTANCE
				.getHMuchOverloadingDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Relative Threshold</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMUCH_OVERLOADING_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = eINSTANCE
				.getHMuchOverloadingDetector__CalculateRelativeThreshold__HRelativeValueConstants();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.codesmells.impl.HIntenseFieldUsageDetectorImpl <em>HIntense Field Usage Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.codesmells.impl.HIntenseFieldUsageDetectorImpl
		 * @see org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl#getHIntenseFieldUsageDetector()
		 * @generated
		 */
		EClass HINTENSE_FIELD_USAGE_DETECTOR = eINSTANCE.getHIntenseFieldUsageDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HINTENSE_FIELD_USAGE_DETECTOR___CALCULATE__TCLASS = eINSTANCE
				.getHIntenseFieldUsageDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Relative Threshold</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HINTENSE_FIELD_USAGE_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS = eINSTANCE
				.getHIntenseFieldUsageDetector__CalculateRelativeThreshold__HRelativeValueConstants();

	}

} //CodesmellsPackage
