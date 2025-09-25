/**
 */
package org.gravity.hulk.detection.antipattern;

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
 * @see org.gravity.hulk.detection.antipattern.AntipatternFactory
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
	String eNS_URI = "platform:/resource/org.gravity.hulk/model/Hulk.ecore#//detection/antipattern";

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
	AntipatternPackage eINSTANCE = org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.antipattern.impl.HBlobDetectorImpl <em>HBlob Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.antipattern.impl.HBlobDetectorImpl
	 * @see org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl#getHBlobDetector()
	 * @generated
	 */
	int HBLOB_DETECTOR = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_DETECTOR__INCOMING = DetectionPackage.HANTI_PATTERN_DETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_DETECTOR__GRAPH = DetectionPackage.HANTI_PATTERN_DETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_DETECTOR__ORIGIN = DetectionPackage.HANTI_PATTERN_DETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_DETECTOR__OUTGOING = DetectionPackage.HANTI_PATTERN_DETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_DETECTOR__POST_TRAVERSAL = DetectionPackage.HANTI_PATTERN_DETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HANTI_PATTERN_DETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_DETECTOR__HANNOTATION = DetectionPackage.HANTI_PATTERN_DETECTOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HANTI_PATTERN_DETECTOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HBlob Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_DETECTOR_FEATURE_COUNT = DetectionPackage.HANTI_PATTERN_DETECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>HBlob Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_DETECTOR_OPERATION_COUNT = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.antipattern.impl.HGodClassDetectorImpl <em>HGod Class Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.antipattern.impl.HGodClassDetectorImpl
	 * @see org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl#getHGodClassDetector()
	 * @generated
	 */
	int HGOD_CLASS_DETECTOR = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_DETECTOR__INCOMING = DetectionPackage.HANTI_PATTERN_DETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_DETECTOR__GRAPH = DetectionPackage.HANTI_PATTERN_DETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_DETECTOR__ORIGIN = DetectionPackage.HANTI_PATTERN_DETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_DETECTOR__OUTGOING = DetectionPackage.HANTI_PATTERN_DETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_DETECTOR__POST_TRAVERSAL = DetectionPackage.HANTI_PATTERN_DETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HANTI_PATTERN_DETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_DETECTOR__HANNOTATION = DetectionPackage.HANTI_PATTERN_DETECTOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HANTI_PATTERN_DETECTOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HGod Class Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_DETECTOR_FEATURE_COUNT = DetectionPackage.HANTI_PATTERN_DETECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>HGod Class Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_DETECTOR_OPERATION_COUNT = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.antipattern.impl.HSwissArmyKnifeDetectorImpl <em>HSwiss Army Knife Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.antipattern.impl.HSwissArmyKnifeDetectorImpl
	 * @see org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl#getHSwissArmyKnifeDetector()
	 * @generated
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR = 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR__INCOMING = DetectionPackage.HANTI_PATTERN_DETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR__GRAPH = DetectionPackage.HANTI_PATTERN_DETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR__ORIGIN = DetectionPackage.HANTI_PATTERN_DETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR__OUTGOING = DetectionPackage.HANTI_PATTERN_DETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR__POST_TRAVERSAL = DetectionPackage.HANTI_PATTERN_DETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HANTI_PATTERN_DETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR__HANNOTATION = DetectionPackage.HANTI_PATTERN_DETECTOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HANTI_PATTERN_DETECTOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HSwiss Army Knife Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR_FEATURE_COUNT = DetectionPackage.HANTI_PATTERN_DETECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>HSwiss Army Knife Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_DETECTOR_OPERATION_COUNT = DetectionPackage.HANTI_PATTERN_DETECTOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.antipattern.impl.HSpaghettiCodeDetectorImpl <em>HSpaghetti Code Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.antipattern.impl.HSpaghettiCodeDetectorImpl
	 * @see org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl#getHSpaghettiCodeDetector()
	 * @generated
	 */
	int HSPAGHETTI_CODE_DETECTOR = 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR__INCOMING = DetectionPackage.HCLASS_BASED_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR__GRAPH = DetectionPackage.HCLASS_BASED_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR__ORIGIN = DetectionPackage.HCLASS_BASED_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR__OUTGOING = DetectionPackage.HCLASS_BASED_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR__HANNOTATION = DetectionPackage.HCLASS_BASED_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR__HANTI_PATTERN_HANDLING = DetectionPackage.HCLASS_BASED_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HSpaghetti Code Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR___COLLECT__HANNOTATION = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR___CONNECT__HSPAGHETTICODEANTIPATTERN = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>HSpaghetti Code Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_DETECTOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.antipattern.HBlobDetector <em>HBlob Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HBlob Detector</em>'.
	 * @see org.gravity.hulk.detection.antipattern.HBlobDetector
	 * @generated
	 */
	EClass getHBlobDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.antipattern.HBlobDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.antipattern.HBlobDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHBlobDetector__Calculate__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.antipattern.HGodClassDetector <em>HGod Class Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HGod Class Detector</em>'.
	 * @see org.gravity.hulk.detection.antipattern.HGodClassDetector
	 * @generated
	 */
	EClass getHGodClassDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.antipattern.HGodClassDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.antipattern.HGodClassDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHGodClassDetector__Calculate__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.antipattern.HSwissArmyKnifeDetector <em>HSwiss Army Knife Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSwiss Army Knife Detector</em>'.
	 * @see org.gravity.hulk.detection.antipattern.HSwissArmyKnifeDetector
	 * @generated
	 */
	EClass getHSwissArmyKnifeDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.antipattern.HSwissArmyKnifeDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.antipattern.HSwissArmyKnifeDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHSwissArmyKnifeDetector__Calculate__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector <em>HSpaghetti Code Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSpaghetti Code Detector</em>'.
	 * @see org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector
	 * @generated
	 */
	EClass getHSpaghettiCodeDetector();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHSpaghettiCodeDetector__Calculate__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector#collect(org.gravity.hulk.antipatterngraph.HAnnotation) <em>Collect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect</em>' operation.
	 * @see org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector#collect(org.gravity.hulk.antipatterngraph.HAnnotation)
	 * @generated
	 */
	EOperation getHSpaghettiCodeDetector__Collect__HAnnotation();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector#connect(org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern) <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector#connect(org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern)
	 * @generated
	 */
	EOperation getHSpaghettiCodeDetector__Connect__HSpaghettiCodeAntiPattern();

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
		 * The meta object literal for the '{@link org.gravity.hulk.detection.antipattern.impl.HBlobDetectorImpl <em>HBlob Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.antipattern.impl.HBlobDetectorImpl
		 * @see org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl#getHBlobDetector()
		 * @generated
		 */
		EClass HBLOB_DETECTOR = eINSTANCE.getHBlobDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HBLOB_DETECTOR___CALCULATE__TCLASS = eINSTANCE.getHBlobDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.antipattern.impl.HGodClassDetectorImpl <em>HGod Class Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.antipattern.impl.HGodClassDetectorImpl
		 * @see org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl#getHGodClassDetector()
		 * @generated
		 */
		EClass HGOD_CLASS_DETECTOR = eINSTANCE.getHGodClassDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGOD_CLASS_DETECTOR___CALCULATE__TCLASS = eINSTANCE.getHGodClassDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.antipattern.impl.HSwissArmyKnifeDetectorImpl <em>HSwiss Army Knife Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.antipattern.impl.HSwissArmyKnifeDetectorImpl
		 * @see org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl#getHSwissArmyKnifeDetector()
		 * @generated
		 */
		EClass HSWISS_ARMY_KNIFE_DETECTOR = eINSTANCE.getHSwissArmyKnifeDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSWISS_ARMY_KNIFE_DETECTOR___CALCULATE__TCLASS = eINSTANCE
				.getHSwissArmyKnifeDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.antipattern.impl.HSpaghettiCodeDetectorImpl <em>HSpaghetti Code Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.antipattern.impl.HSpaghettiCodeDetectorImpl
		 * @see org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl#getHSpaghettiCodeDetector()
		 * @generated
		 */
		EClass HSPAGHETTI_CODE_DETECTOR = eINSTANCE.getHSpaghettiCodeDetector();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSPAGHETTI_CODE_DETECTOR___CALCULATE__TCLASS = eINSTANCE
				.getHSpaghettiCodeDetector__Calculate__TClass();

		/**
		 * The meta object literal for the '<em><b>Collect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSPAGHETTI_CODE_DETECTOR___COLLECT__HANNOTATION = eINSTANCE
				.getHSpaghettiCodeDetector__Collect__HAnnotation();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSPAGHETTI_CODE_DETECTOR___CONNECT__HSPAGHETTICODEANTIPATTERN = eINSTANCE
				.getHSpaghettiCodeDetector__Connect__HSpaghettiCodeAntiPattern();

	}

} //AntipatternPackage
