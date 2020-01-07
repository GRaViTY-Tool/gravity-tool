/**
 */
package org.gravity.hulk.antipatterngraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gravity.typegraph.basic.annotations.AnnotationsPackage;

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
 * @see org.gravity.hulk.antipatterngraph.AntipatterngraphFactory
 * @model kind="package"
 * @generated
 */
public interface AntipatterngraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "antipatterngraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gravity-tool.org/typegraph/antipatterngraph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.hulk.antipatterngraph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AntipatterngraphPackage eINSTANCE = org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.impl.HAnnotationImpl <em>HAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.impl.HAnnotationImpl
	 * @see org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl#getHAnnotation()
	 * @generated
	 */
	int HANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANNOTATION__TANNOTATED = AnnotationsPackage.TANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANNOTATION__TYPE = AnnotationsPackage.TANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANNOTATION__TVALUES = AnnotationsPackage.TANNOTATION__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANNOTATION__APG = AnnotationsPackage.TANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANNOTATION__PART_OF = AnnotationsPackage.TANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANNOTATION__CHANGED = AnnotationsPackage.TANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANNOTATION_FEATURE_COUNT = AnnotationsPackage.TANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>HAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANNOTATION_OPERATION_COUNT = AnnotationsPackage.TANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.impl.HAntiPatternImpl <em>HAnti Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.impl.HAntiPatternImpl
	 * @see org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl#getHAntiPattern()
	 * @generated
	 */
	int HANTI_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN__TANNOTATED = HANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN__TYPE = HANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN__TVALUES = HANNOTATION__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN__APG = HANNOTATION__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN__PART_OF = HANNOTATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN__CHANGED = HANNOTATION__CHANGED;

	/**
	 * The number of structural features of the '<em>HAnti Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_FEATURE_COUNT = HANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HAnti Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_OPERATION_COUNT = HANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl <em>HCode Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl
	 * @see org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl#getHCodeSmell()
	 * @generated
	 */
	int HCODE_SMELL = 2;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL__TANNOTATED = HANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL__TYPE = HANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL__TVALUES = HANNOTATION__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL__APG = HANNOTATION__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL__PART_OF = HANNOTATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL__CHANGED = HANNOTATION__CHANGED;

	/**
	 * The number of structural features of the '<em>HCode Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_FEATURE_COUNT = HANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HCode Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_OPERATION_COUNT = HANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.impl.HMetricImpl <em>HMetric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.impl.HMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl#getHMetric()
	 * @generated
	 */
	int HMETRIC = 3;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC__TANNOTATED = HANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC__TYPE = HANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC__TVALUES = HANNOTATION__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC__APG = HANNOTATION__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC__PART_OF = HANNOTATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC__CHANGED = HANNOTATION__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC__VALUE = HANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HMetric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_FEATURE_COUNT = HANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC___GET_RELATIVE_AMOUNT = HANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC___INCREMENT = HANNOTATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>HMetric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_OPERATION_COUNT = HANNOTATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.impl.HAntiPatternGraphImpl <em>HAnti Pattern Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.impl.HAntiPatternGraphImpl
	 * @see org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl#getHAntiPatternGraph()
	 * @generated
	 */
	int HANTI_PATTERN_GRAPH = 4;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_GRAPH__PG = 0;

	/**
	 * The feature id for the '<em><b>HAnnotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_GRAPH__HANNOTATIONS = 1;

	/**
	 * The feature id for the '<em><b>Current ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_GRAPH__CURRENT_ID = 2;

	/**
	 * The number of structural features of the '<em>HAnti Pattern Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_GRAPH_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_GRAPH___GET_NEXT_ID = 0;

	/**
	 * The number of operations of the '<em>HAnti Pattern Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_GRAPH_OPERATION_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.HAnnotation <em>HAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAnnotation</em>'.
	 * @see org.gravity.hulk.antipatterngraph.HAnnotation
	 * @generated
	 */
	EClass getHAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.HAnnotation#getApg <em>Apg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apg</em>'.
	 * @see org.gravity.hulk.antipatterngraph.HAnnotation#getApg()
	 * @see #getHAnnotation()
	 * @generated
	 */
	EReference getHAnnotation_Apg();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.antipatterngraph.HAnnotation#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part Of</em>'.
	 * @see org.gravity.hulk.antipatterngraph.HAnnotation#getPartOf()
	 * @see #getHAnnotation()
	 * @generated
	 */
	EReference getHAnnotation_PartOf();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.antipatterngraph.HAnnotation#isChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see org.gravity.hulk.antipatterngraph.HAnnotation#isChanged()
	 * @see #getHAnnotation()
	 * @generated
	 */
	EAttribute getHAnnotation_Changed();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.HAntiPattern <em>HAnti Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAnti Pattern</em>'.
	 * @see org.gravity.hulk.antipatterngraph.HAntiPattern
	 * @generated
	 */
	EClass getHAntiPattern();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.HCodeSmell <em>HCode Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HCode Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.HCodeSmell
	 * @generated
	 */
	EClass getHCodeSmell();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.HMetric <em>HMetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMetric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.HMetric
	 * @generated
	 */
	EClass getHMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.antipatterngraph.HMetric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gravity.hulk.antipatterngraph.HMetric#getValue()
	 * @see #getHMetric()
	 * @generated
	 */
	EAttribute getHMetric_Value();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.antipatterngraph.HMetric#getRelativeAmount() <em>Get Relative Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Relative Amount</em>' operation.
	 * @see org.gravity.hulk.antipatterngraph.HMetric#getRelativeAmount()
	 * @generated
	 */
	EOperation getHMetric__GetRelativeAmount();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.antipatterngraph.HMetric#increment() <em>Increment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Increment</em>' operation.
	 * @see org.gravity.hulk.antipatterngraph.HMetric#increment()
	 * @generated
	 */
	EOperation getHMetric__Increment();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.HAntiPatternGraph <em>HAnti Pattern Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAnti Pattern Graph</em>'.
	 * @see org.gravity.hulk.antipatterngraph.HAntiPatternGraph
	 * @generated
	 */
	EClass getHAntiPatternGraph();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getPg <em>Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pg</em>'.
	 * @see org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getPg()
	 * @see #getHAntiPatternGraph()
	 * @generated
	 */
	EReference getHAntiPatternGraph_Pg();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getHAnnotations <em>HAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HAnnotations</em>'.
	 * @see org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getHAnnotations()
	 * @see #getHAntiPatternGraph()
	 * @generated
	 */
	EReference getHAntiPatternGraph_HAnnotations();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getCurrentID <em>Current ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current ID</em>'.
	 * @see org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getCurrentID()
	 * @see #getHAntiPatternGraph()
	 * @generated
	 */
	EAttribute getHAntiPatternGraph_CurrentID();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getNextID() <em>Get Next ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next ID</em>' operation.
	 * @see org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getNextID()
	 * @generated
	 */
	EOperation getHAntiPatternGraph__GetNextID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AntipatterngraphFactory getAntipatterngraphFactory();

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
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.impl.HAnnotationImpl <em>HAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.impl.HAnnotationImpl
		 * @see org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl#getHAnnotation()
		 * @generated
		 */
		EClass HANNOTATION = eINSTANCE.getHAnnotation();

		/**
		 * The meta object literal for the '<em><b>Apg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANNOTATION__APG = eINSTANCE.getHAnnotation_Apg();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANNOTATION__PART_OF = eINSTANCE.getHAnnotation_PartOf();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANNOTATION__CHANGED = eINSTANCE.getHAnnotation_Changed();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.impl.HAntiPatternImpl <em>HAnti Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.impl.HAntiPatternImpl
		 * @see org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl#getHAntiPattern()
		 * @generated
		 */
		EClass HANTI_PATTERN = eINSTANCE.getHAntiPattern();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl <em>HCode Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl
		 * @see org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl#getHCodeSmell()
		 * @generated
		 */
		EClass HCODE_SMELL = eINSTANCE.getHCodeSmell();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.impl.HMetricImpl <em>HMetric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.impl.HMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl#getHMetric()
		 * @generated
		 */
		EClass HMETRIC = eINSTANCE.getHMetric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HMETRIC__VALUE = eINSTANCE.getHMetric_Value();

		/**
		 * The meta object literal for the '<em><b>Get Relative Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMETRIC___GET_RELATIVE_AMOUNT = eINSTANCE.getHMetric__GetRelativeAmount();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMETRIC___INCREMENT = eINSTANCE.getHMetric__Increment();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.impl.HAntiPatternGraphImpl <em>HAnti Pattern Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.impl.HAntiPatternGraphImpl
		 * @see org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl#getHAntiPatternGraph()
		 * @generated
		 */
		EClass HANTI_PATTERN_GRAPH = eINSTANCE.getHAntiPatternGraph();

		/**
		 * The meta object literal for the '<em><b>Pg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANTI_PATTERN_GRAPH__PG = eINSTANCE.getHAntiPatternGraph_Pg();

		/**
		 * The meta object literal for the '<em><b>HAnnotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANTI_PATTERN_GRAPH__HANNOTATIONS = eINSTANCE.getHAntiPatternGraph_HAnnotations();

		/**
		 * The meta object literal for the '<em><b>Current ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANTI_PATTERN_GRAPH__CURRENT_ID = eINSTANCE.getHAntiPatternGraph_CurrentID();

		/**
		 * The meta object literal for the '<em><b>Get Next ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_GRAPH___GET_NEXT_ID = eINSTANCE.getHAntiPatternGraph__GetNextID();

	}

} //AntipatterngraphPackage
