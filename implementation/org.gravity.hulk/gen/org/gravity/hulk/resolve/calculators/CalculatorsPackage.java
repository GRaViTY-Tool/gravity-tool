/**
 */
package org.gravity.hulk.resolve.calculators;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.gravity.hulk.detection.DetectionPackage;

import org.gravity.hulk.resolve.ResolvePackage;

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
 * @see org.gravity.hulk.resolve.calculators.CalculatorsFactory
 * @model kind="package"
 * @generated
 */
public interface CalculatorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calculators";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.gravity.hulk/model/Hulk.ecore#//resolve/calculators";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "calculators";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalculatorsPackage eINSTANCE = org.gravity.hulk.resolve.calculators.impl.CalculatorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.resolve.calculators.impl.HMethodToDataClassAccessCalculatorImpl <em>HMethod To Data Class Access Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.resolve.calculators.impl.HMethodToDataClassAccessCalculatorImpl
	 * @see org.gravity.hulk.resolve.calculators.impl.CalculatorsPackageImpl#getHMethodToDataClassAccessCalculator()
	 * @generated
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR__INCOMING = DetectionPackage.HMETRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR__GRAPH = DetectionPackage.HMETRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR__ORIGIN = DetectionPackage.HMETRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR__OUTGOING = DetectionPackage.HMETRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HMETRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HMETRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR__HANNOTATION = DetectionPackage.HMETRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HMETRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HMethod To Data Class Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR_FEATURE_COUNT = DetectionPackage.HMETRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HMETRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get All Affected Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR___GET_ALL_AFFECTED_MEMBERS__TCLASS = DetectionPackage.HMETRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HMethod To Data Class Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR_OPERATION_COUNT = DetectionPackage.HMETRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.resolve.calculators.impl.HInBlobAccessCalculatorImpl <em>HIn Blob Access Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.resolve.calculators.impl.HInBlobAccessCalculatorImpl
	 * @see org.gravity.hulk.resolve.calculators.impl.CalculatorsPackageImpl#getHInBlobAccessCalculator()
	 * @generated
	 */
	int HIN_BLOB_ACCESS_CALCULATOR = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_CALCULATOR__INCOMING = DetectionPackage.HMETRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_CALCULATOR__GRAPH = DetectionPackage.HMETRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_CALCULATOR__ORIGIN = DetectionPackage.HMETRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_CALCULATOR__OUTGOING = DetectionPackage.HMETRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HMETRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HMETRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_CALCULATOR__HANNOTATION = DetectionPackage.HMETRIC_CALCULATOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_CALCULATOR__HANTI_PATTERN_HANDLING = DetectionPackage.HMETRIC_CALCULATOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HIn Blob Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_CALCULATOR_FEATURE_COUNT = DetectionPackage.HMETRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HMETRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The number of operations of the '<em>HIn Blob Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_CALCULATOR_OPERATION_COUNT = DetectionPackage.HMETRIC_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.resolve.calculators.impl.HClusterCalculatorImpl <em>HCluster Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.resolve.calculators.impl.HClusterCalculatorImpl
	 * @see org.gravity.hulk.resolve.calculators.impl.CalculatorsPackageImpl#getHClusterCalculator()
	 * @generated
	 */
	int HCLUSTER_CALCULATOR = 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_CALCULATOR__INCOMING = ResolvePackage.HRESOLVER__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_CALCULATOR__GRAPH = ResolvePackage.HRESOLVER__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_CALCULATOR__ORIGIN = ResolvePackage.HRESOLVER__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_CALCULATOR__OUTGOING = ResolvePackage.HRESOLVER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_CALCULATOR__POST_TRAVERSAL = ResolvePackage.HRESOLVER__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_CALCULATOR__PRE_TRAVERSAL = ResolvePackage.HRESOLVER__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_CALCULATOR__HANNOTATION = ResolvePackage.HRESOLVER__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_CALCULATOR__HANTI_PATTERN_HANDLING = ResolvePackage.HRESOLVER__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HCluster Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_CALCULATOR_FEATURE_COUNT = ResolvePackage.HRESOLVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_CALCULATOR___DETECT__TCLASS = ResolvePackage.HRESOLVER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_CALCULATOR___DETECT__HANTIPATTERNGRAPH = ResolvePackage.HRESOLVER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>HCluster Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_CALCULATOR_OPERATION_COUNT = ResolvePackage.HRESOLVER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.resolve.calculators.impl.HClusterAccessCalculatorImpl <em>HCluster Access Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.resolve.calculators.impl.HClusterAccessCalculatorImpl
	 * @see org.gravity.hulk.resolve.calculators.impl.CalculatorsPackageImpl#getHClusterAccessCalculator()
	 * @generated
	 */
	int HCLUSTER_ACCESS_CALCULATOR = 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_ACCESS_CALCULATOR__INCOMING = ResolvePackage.HRESOLVER__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_ACCESS_CALCULATOR__GRAPH = ResolvePackage.HRESOLVER__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_ACCESS_CALCULATOR__ORIGIN = ResolvePackage.HRESOLVER__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_ACCESS_CALCULATOR__OUTGOING = ResolvePackage.HRESOLVER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_ACCESS_CALCULATOR__POST_TRAVERSAL = ResolvePackage.HRESOLVER__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_ACCESS_CALCULATOR__PRE_TRAVERSAL = ResolvePackage.HRESOLVER__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_ACCESS_CALCULATOR__HANNOTATION = ResolvePackage.HRESOLVER__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_ACCESS_CALCULATOR__HANTI_PATTERN_HANDLING = ResolvePackage.HRESOLVER__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HCluster Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_ACCESS_CALCULATOR_FEATURE_COUNT = ResolvePackage.HRESOLVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = ResolvePackage.HRESOLVER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>HCluster Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_ACCESS_CALCULATOR_OPERATION_COUNT = ResolvePackage.HRESOLVER_OPERATION_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator <em>HMethod To Data Class Access Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMethod To Data Class Access Calculator</em>'.
	 * @see org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator
	 * @generated
	 */
	EClass getHMethodToDataClassAccessCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHMethodToDataClassAccessCalculator__Detect__HAntiPatternGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator#getAllAffectedMembers(org.gravity.typegraph.basic.TClass) <em>Get All Affected Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Affected Members</em>' operation.
	 * @see org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator#getAllAffectedMembers(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHMethodToDataClassAccessCalculator__GetAllAffectedMembers__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.resolve.calculators.HInBlobAccessCalculator <em>HIn Blob Access Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIn Blob Access Calculator</em>'.
	 * @see org.gravity.hulk.resolve.calculators.HInBlobAccessCalculator
	 * @generated
	 */
	EClass getHInBlobAccessCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.calculators.HInBlobAccessCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.resolve.calculators.HInBlobAccessCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHInBlobAccessCalculator__Detect__HAntiPatternGraph();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.resolve.calculators.HClusterCalculator <em>HCluster Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HCluster Calculator</em>'.
	 * @see org.gravity.hulk.resolve.calculators.HClusterCalculator
	 * @generated
	 */
	EClass getHClusterCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.calculators.HClusterCalculator#detect(org.gravity.typegraph.basic.TClass) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.resolve.calculators.HClusterCalculator#detect(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHClusterCalculator__Detect__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.calculators.HClusterCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.resolve.calculators.HClusterCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHClusterCalculator__Detect__HAntiPatternGraph();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.resolve.calculators.HClusterAccessCalculator <em>HCluster Access Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HCluster Access Calculator</em>'.
	 * @see org.gravity.hulk.resolve.calculators.HClusterAccessCalculator
	 * @generated
	 */
	EClass getHClusterAccessCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.resolve.calculators.HClusterAccessCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.resolve.calculators.HClusterAccessCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHClusterAccessCalculator__Detect__HAntiPatternGraph();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CalculatorsFactory getCalculatorsFactory();

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
		 * The meta object literal for the '{@link org.gravity.hulk.resolve.calculators.impl.HMethodToDataClassAccessCalculatorImpl <em>HMethod To Data Class Access Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.resolve.calculators.impl.HMethodToDataClassAccessCalculatorImpl
		 * @see org.gravity.hulk.resolve.calculators.impl.CalculatorsPackageImpl#getHMethodToDataClassAccessCalculator()
		 * @generated
		 */
		EClass HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR = eINSTANCE.getHMethodToDataClassAccessCalculator();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = eINSTANCE
				.getHMethodToDataClassAccessCalculator__Detect__HAntiPatternGraph();

		/**
		 * The meta object literal for the '<em><b>Get All Affected Members</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR___GET_ALL_AFFECTED_MEMBERS__TCLASS = eINSTANCE
				.getHMethodToDataClassAccessCalculator__GetAllAffectedMembers__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.resolve.calculators.impl.HInBlobAccessCalculatorImpl <em>HIn Blob Access Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.resolve.calculators.impl.HInBlobAccessCalculatorImpl
		 * @see org.gravity.hulk.resolve.calculators.impl.CalculatorsPackageImpl#getHInBlobAccessCalculator()
		 * @generated
		 */
		EClass HIN_BLOB_ACCESS_CALCULATOR = eINSTANCE.getHInBlobAccessCalculator();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIN_BLOB_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = eINSTANCE
				.getHInBlobAccessCalculator__Detect__HAntiPatternGraph();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.resolve.calculators.impl.HClusterCalculatorImpl <em>HCluster Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.resolve.calculators.impl.HClusterCalculatorImpl
		 * @see org.gravity.hulk.resolve.calculators.impl.CalculatorsPackageImpl#getHClusterCalculator()
		 * @generated
		 */
		EClass HCLUSTER_CALCULATOR = eINSTANCE.getHClusterCalculator();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HCLUSTER_CALCULATOR___DETECT__TCLASS = eINSTANCE.getHClusterCalculator__Detect__TClass();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HCLUSTER_CALCULATOR___DETECT__HANTIPATTERNGRAPH = eINSTANCE
				.getHClusterCalculator__Detect__HAntiPatternGraph();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.resolve.calculators.impl.HClusterAccessCalculatorImpl <em>HCluster Access Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.resolve.calculators.impl.HClusterAccessCalculatorImpl
		 * @see org.gravity.hulk.resolve.calculators.impl.CalculatorsPackageImpl#getHClusterAccessCalculator()
		 * @generated
		 */
		EClass HCLUSTER_ACCESS_CALCULATOR = eINSTANCE.getHClusterAccessCalculator();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HCLUSTER_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = eINSTANCE
				.getHClusterAccessCalculator__Detect__HAntiPatternGraph();

	}

} //CalculatorsPackage
