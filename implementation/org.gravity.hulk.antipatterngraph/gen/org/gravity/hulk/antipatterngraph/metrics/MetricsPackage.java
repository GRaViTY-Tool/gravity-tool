/**
 */
package org.gravity.hulk.antipatterngraph.metrics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

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
 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsFactory
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
	String eNS_URI = "http://www.gravity-tool.org/typegraph/antipatterngraph#//metrics";

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
	MetricsPackage eINSTANCE = org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNACCMetricImpl <em>HNACC Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNACCMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNACCMetric()
	 * @generated
	 */
	int HNACC_METRIC = 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The feature id for the '<em><b>HGetter Setter Smells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__HGETTER_SETTER_SMELLS = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HGetter Custom Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__HGETTER_CUSTOM_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>HSetter Custom Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__HSETTER_CUSTOM_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>HNumber Of Methods Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__HNUMBER_OF_METHODS_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>HNACC Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNACC Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMembersMetricImpl <em>HNumber Of Members Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMembersMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfMembersMetric()
	 * @generated
	 */
	int HNUMBER_OF_MEMBERS_METRIC = 1;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HNumber Of Members Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNumber Of Members Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalAccessRelationMetricImpl <em>HLocal Access Relation Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalAccessRelationMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalAccessRelationMetric()
	 * @generated
	 */
	int HLOCAL_ACCESS_RELATION_METRIC = 2;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The feature id for the '<em><b>HLocal Field Accesses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_FIELD_ACCESSES = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HLocal Method Accesses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_METHOD_ACCESSES = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HLocal Access Relation Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HLocal Access Relation Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HInvocationRelationImpl <em>HInvocation Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HInvocationRelationImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHInvocationRelation()
	 * @generated
	 */
	int HINVOCATION_RELATION = 3;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The feature id for the '<em><b>HOutgoing Invocation Custom Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__HOUTGOING_INVOCATION_CUSTOM_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HIncomming Invocation Custom Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__HINCOMMING_INVOCATION_CUSTOM_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HInvocation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HInvocation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfChildMetricImpl <em>HNumber Of Child Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfChildMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfChildMetric()
	 * @generated
	 */
	int HNUMBER_OF_CHILD_METRIC = 4;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HNumber Of Child Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNumber Of Child Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HIGAMMetricImpl <em>HIGAM Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HIGAMMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHIGAMMetric()
	 * @generated
	 */
	int HIGAM_METRIC = 5;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The feature id for the '<em><b>HMin Vis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_METRIC__HMIN_VIS = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HIGAM Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HIGAM Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAM_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HIGATMetricImpl <em>HIGAT Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HIGATMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHIGATMetric()
	 * @generated
	 */
	int HIGAT_METRIC = 6;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The feature id for the '<em><b>HMin Vis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_METRIC__HMIN_VIS = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HIGAT Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HIGAT Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGAT_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMethodsMetricImpl <em>HNumber Of Methods Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMethodsMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfMethodsMetric()
	 * @generated
	 */
	int HNUMBER_OF_METHODS_METRIC = 7;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HNumber Of Methods Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNumber Of Methods Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HAverageOverloadingInClassMetricImpl <em>HAverage Overloading In Class Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HAverageOverloadingInClassMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHAverageOverloadingInClassMetric()
	 * @generated
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC = 8;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HAverage Overloading In Class Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HAverage Overloading In Class Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HAverageParametersMetricImpl <em>HAverage Parameters Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HAverageParametersMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHAverageParametersMetric()
	 * @generated
	 */
	int HAVERAGE_PARAMETERS_METRIC = 9;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HAverage Parameters Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HAverage Parameters Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalMethodAccessesMetricImpl <em>HLocal Method Accesses Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalMethodAccessesMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalMethodAccessesMetric()
	 * @generated
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC = 10;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HLocal Method Accesses Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HLocal Method Accesses Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalFieldAccessesMetricImpl <em>HLocal Field Accesses Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalFieldAccessesMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalFieldAccessesMetric()
	 * @generated
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC = 11;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HLocal Field Accesses Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HLocal Field Accesses Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HTotalVisibilityMetricImpl <em>HTotal Visibility Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HTotalVisibilityMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHTotalVisibilityMetric()
	 * @generated
	 */
	int HTOTAL_VISIBILITY_METRIC = 12;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HTotal Visibility Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HTotal Visibility Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_VISIBILITY_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HTotalCouplingMetricImpl <em>HTotal Coupling Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HTotalCouplingMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHTotalCouplingMetric()
	 * @generated
	 */
	int HTOTAL_COUPLING_METRIC = 13;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HTotal Coupling Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HTotal Coupling Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTOTAL_COUPLING_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfFieldsMetricImpl <em>HNumber Of Fields Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfFieldsMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfFieldsMetric()
	 * @generated
	 */
	int HNUMBER_OF_FIELDS_METRIC = 14;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_FIELDS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_FIELDS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_FIELDS_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_FIELDS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_FIELDS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_FIELDS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_FIELDS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HNumber Of Fields Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_FIELDS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_FIELDS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_FIELDS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNumber Of Fields Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_FIELDS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLCOM5MetricImpl <em>HLCOM5 Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLCOM5MetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLCOM5Metric()
	 * @generated
	 */
	int HLCOM5_METRIC = 15;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The feature id for the '<em><b>HNumber Of Methods Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__HNUMBER_OF_METHODS_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HNumber Of Fields Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__HNUMBER_OF_FIELDS_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>HLocal Field Unique Access Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__HLOCAL_FIELD_UNIQUE_ACCESS_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HLCOM5 Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HLCOM5 Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HEfferentCouplingMetricImpl <em>HEfferent Coupling Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HEfferentCouplingMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHEfferentCouplingMetric()
	 * @generated
	 */
	int HEFFERENT_COUPLING_METRIC = 16;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HEfferent Coupling Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HEfferent Coupling Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEFFERENT_COUPLING_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HAfferentCouplingMetricImpl <em>HAfferent Coupling Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HAfferentCouplingMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHAfferentCouplingMetric()
	 * @generated
	 */
	int HAFFERENT_COUPLING_METRIC = 17;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HAfferent Coupling Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HAfferent Coupling Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAFFERENT_COUPLING_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalFieldUniqueAccessMetricImpl <em>HLocal Field Unique Access Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalFieldUniqueAccessMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalFieldUniqueAccessMetric()
	 * @generated
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_METRIC = 18;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HLocal Field Unique Access Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HLocal Field Unique Access Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_UNIQUE_ACCESS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HIncommingInvocationMetricImpl <em>HIncomming Invocation Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HIncommingInvocationMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHIncommingInvocationMetric()
	 * @generated
	 */
	int HINCOMMING_INVOCATION_METRIC = 19;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HIncomming Invocation Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HIncomming Invocation Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATION_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HOutgoingInvocationMetricImpl <em>HOutgoing Invocation Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HOutgoingInvocationMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHOutgoingInvocationMetric()
	 * @generated
	 */
	int HOUTGOING_INVOCATION_METRIC = 20;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HOutgoing Invocation Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HOutgoing Invocation Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATION_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HDepthOfInheritanceMetricImpl <em>HDepth Of Inheritance Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HDepthOfInheritanceMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHDepthOfInheritanceMetric()
	 * @generated
	 */
	int HDEPTH_OF_INHERITANCE_METRIC = 21;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HDepth Of Inheritance Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HDepth Of Inheritance Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HGetterMetricImpl <em>HGetter Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HGetterMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHGetterMetric()
	 * @generated
	 */
	int HGETTER_METRIC = 22;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HGetter Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HGetter Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HSetterMetricImpl <em>HSetter Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HSetterMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHSetterMetric()
	 * @generated
	 */
	int HSETTER_METRIC = 23;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_METRIC__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HSetter Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HSetter Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTER_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric <em>HNACC Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNACC Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNACCMetric
	 * @generated
	 */
	EClass getHNACCMetric();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHGetterSetterSmells <em>HGetter Setter Smells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HGetter Setter Smells</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHGetterSetterSmells()
	 * @see #getHNACCMetric()
	 * @generated
	 */
	EReference getHNACCMetric_HGetterSetterSmells();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHGetterCustomMetric <em>HGetter Custom Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HGetter Custom Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHGetterCustomMetric()
	 * @see #getHNACCMetric()
	 * @generated
	 */
	EReference getHNACCMetric_HGetterCustomMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHSetterCustomMetric <em>HSetter Custom Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HSetter Custom Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHSetterCustomMetric()
	 * @see #getHNACCMetric()
	 * @generated
	 */
	EReference getHNACCMetric_HSetterCustomMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHNumberOfMethodsMetric <em>HNumber Of Methods Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HNumber Of Methods Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHNumberOfMethodsMetric()
	 * @see #getHNACCMetric()
	 * @generated
	 */
	EReference getHNACCMetric_HNumberOfMethodsMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric <em>HNumber Of Members Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Members Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric
	 * @generated
	 */
	EClass getHNumberOfMembersMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric <em>HLocal Access Relation Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Access Relation Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric
	 * @generated
	 */
	EClass getHLocalAccessRelationMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric#getHLocalFieldAccesses <em>HLocal Field Accesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HLocal Field Accesses</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric#getHLocalFieldAccesses()
	 * @see #getHLocalAccessRelationMetric()
	 * @generated
	 */
	EReference getHLocalAccessRelationMetric_HLocalFieldAccesses();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric#getHLocalMethodAccesses <em>HLocal Method Accesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HLocal Method Accesses</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric#getHLocalMethodAccesses()
	 * @see #getHLocalAccessRelationMetric()
	 * @generated
	 */
	EReference getHLocalAccessRelationMetric_HLocalMethodAccesses();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation <em>HInvocation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HInvocation Relation</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation
	 * @generated
	 */
	EClass getHInvocationRelation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHOutgoingInvocationCustomMetric <em>HOutgoing Invocation Custom Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HOutgoing Invocation Custom Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHOutgoingInvocationCustomMetric()
	 * @see #getHInvocationRelation()
	 * @generated
	 */
	EReference getHInvocationRelation_HOutgoingInvocationCustomMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHIncommingInvocationCustomMetric <em>HIncomming Invocation Custom Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HIncomming Invocation Custom Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHIncommingInvocationCustomMetric()
	 * @see #getHInvocationRelation()
	 * @generated
	 */
	EReference getHInvocationRelation_HIncommingInvocationCustomMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric <em>HNumber Of Child Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Child Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric
	 * @generated
	 */
	EClass getHNumberOfChildMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric <em>HIGAM Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIGAM Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric
	 * @generated
	 */
	EClass getHIGAMMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric#getHMinVis <em>HMin Vis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HMin Vis</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric#getHMinVis()
	 * @see #getHIGAMMetric()
	 * @generated
	 */
	EAttribute getHIGAMMetric_HMinVis();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HIGATMetric <em>HIGAT Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIGAT Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HIGATMetric
	 * @generated
	 */
	EClass getHIGATMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.antipatterngraph.metrics.HIGATMetric#getHMinVis <em>HMin Vis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HMin Vis</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HIGATMetric#getHMinVis()
	 * @see #getHIGATMetric()
	 * @generated
	 */
	EAttribute getHIGATMetric_HMinVis();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric <em>HNumber Of Methods Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Methods Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric
	 * @generated
	 */
	EClass getHNumberOfMethodsMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric <em>HAverage Overloading In Class Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAverage Overloading In Class Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric
	 * @generated
	 */
	EClass getHAverageOverloadingInClassMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric <em>HAverage Parameters Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAverage Parameters Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric
	 * @generated
	 */
	EClass getHAverageParametersMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric <em>HLocal Method Accesses Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Method Accesses Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric
	 * @generated
	 */
	EClass getHLocalMethodAccessesMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric <em>HLocal Field Accesses Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Field Accesses Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric
	 * @generated
	 */
	EClass getHLocalFieldAccessesMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HTotalVisibilityMetric <em>HTotal Visibility Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTotal Visibility Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HTotalVisibilityMetric
	 * @generated
	 */
	EClass getHTotalVisibilityMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HTotalCouplingMetric <em>HTotal Coupling Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTotal Coupling Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HTotalCouplingMetric
	 * @generated
	 */
	EClass getHTotalCouplingMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfFieldsMetric <em>HNumber Of Fields Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Fields Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfFieldsMetric
	 * @generated
	 */
	EClass getHNumberOfFieldsMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric <em>HLCOM5 Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLCOM5 Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric
	 * @generated
	 */
	EClass getHLCOM5Metric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric#getHNumberOfMethodsMetric <em>HNumber Of Methods Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HNumber Of Methods Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric#getHNumberOfMethodsMetric()
	 * @see #getHLCOM5Metric()
	 * @generated
	 */
	EReference getHLCOM5Metric_HNumberOfMethodsMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric#getHNumberOfFieldsMetric <em>HNumber Of Fields Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HNumber Of Fields Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric#getHNumberOfFieldsMetric()
	 * @see #getHLCOM5Metric()
	 * @generated
	 */
	EReference getHLCOM5Metric_HNumberOfFieldsMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric#getHLocalFieldUniqueAccessMetric <em>HLocal Field Unique Access Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HLocal Field Unique Access Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric#getHLocalFieldUniqueAccessMetric()
	 * @see #getHLCOM5Metric()
	 * @generated
	 */
	EReference getHLCOM5Metric_HLocalFieldUniqueAccessMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HEfferentCouplingMetric <em>HEfferent Coupling Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HEfferent Coupling Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HEfferentCouplingMetric
	 * @generated
	 */
	EClass getHEfferentCouplingMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HAfferentCouplingMetric <em>HAfferent Coupling Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAfferent Coupling Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HAfferentCouplingMetric
	 * @generated
	 */
	EClass getHAfferentCouplingMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric <em>HLocal Field Unique Access Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Field Unique Access Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric
	 * @generated
	 */
	EClass getHLocalFieldUniqueAccessMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric <em>HIncomming Invocation Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIncomming Invocation Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric
	 * @generated
	 */
	EClass getHIncommingInvocationMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HOutgoingInvocationMetric <em>HOutgoing Invocation Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HOutgoing Invocation Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HOutgoingInvocationMetric
	 * @generated
	 */
	EClass getHOutgoingInvocationMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric <em>HDepth Of Inheritance Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDepth Of Inheritance Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric
	 * @generated
	 */
	EClass getHDepthOfInheritanceMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HGetterMetric <em>HGetter Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HGetter Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HGetterMetric
	 * @generated
	 */
	EClass getHGetterMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HSetterMetric <em>HSetter Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSetter Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HSetterMetric
	 * @generated
	 */
	EClass getHSetterMetric();

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
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNACCMetricImpl <em>HNACC Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNACCMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNACCMetric()
		 * @generated
		 */
		EClass HNACC_METRIC = eINSTANCE.getHNACCMetric();

		/**
		 * The meta object literal for the '<em><b>HGetter Setter Smells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HNACC_METRIC__HGETTER_SETTER_SMELLS = eINSTANCE.getHNACCMetric_HGetterSetterSmells();

		/**
		 * The meta object literal for the '<em><b>HGetter Custom Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HNACC_METRIC__HGETTER_CUSTOM_METRIC = eINSTANCE.getHNACCMetric_HGetterCustomMetric();

		/**
		 * The meta object literal for the '<em><b>HSetter Custom Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HNACC_METRIC__HSETTER_CUSTOM_METRIC = eINSTANCE.getHNACCMetric_HSetterCustomMetric();

		/**
		 * The meta object literal for the '<em><b>HNumber Of Methods Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HNACC_METRIC__HNUMBER_OF_METHODS_METRIC = eINSTANCE.getHNACCMetric_HNumberOfMethodsMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMembersMetricImpl <em>HNumber Of Members Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMembersMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfMembersMetric()
		 * @generated
		 */
		EClass HNUMBER_OF_MEMBERS_METRIC = eINSTANCE.getHNumberOfMembersMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalAccessRelationMetricImpl <em>HLocal Access Relation Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalAccessRelationMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalAccessRelationMetric()
		 * @generated
		 */
		EClass HLOCAL_ACCESS_RELATION_METRIC = eINSTANCE.getHLocalAccessRelationMetric();

		/**
		 * The meta object literal for the '<em><b>HLocal Field Accesses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_FIELD_ACCESSES = eINSTANCE
				.getHLocalAccessRelationMetric_HLocalFieldAccesses();

		/**
		 * The meta object literal for the '<em><b>HLocal Method Accesses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_METHOD_ACCESSES = eINSTANCE
				.getHLocalAccessRelationMetric_HLocalMethodAccesses();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HInvocationRelationImpl <em>HInvocation Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HInvocationRelationImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHInvocationRelation()
		 * @generated
		 */
		EClass HINVOCATION_RELATION = eINSTANCE.getHInvocationRelation();

		/**
		 * The meta object literal for the '<em><b>HOutgoing Invocation Custom Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HINVOCATION_RELATION__HOUTGOING_INVOCATION_CUSTOM_METRIC = eINSTANCE
				.getHInvocationRelation_HOutgoingInvocationCustomMetric();

		/**
		 * The meta object literal for the '<em><b>HIncomming Invocation Custom Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HINVOCATION_RELATION__HINCOMMING_INVOCATION_CUSTOM_METRIC = eINSTANCE
				.getHInvocationRelation_HIncommingInvocationCustomMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfChildMetricImpl <em>HNumber Of Child Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfChildMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfChildMetric()
		 * @generated
		 */
		EClass HNUMBER_OF_CHILD_METRIC = eINSTANCE.getHNumberOfChildMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HIGAMMetricImpl <em>HIGAM Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HIGAMMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHIGAMMetric()
		 * @generated
		 */
		EClass HIGAM_METRIC = eINSTANCE.getHIGAMMetric();

		/**
		 * The meta object literal for the '<em><b>HMin Vis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGAM_METRIC__HMIN_VIS = eINSTANCE.getHIGAMMetric_HMinVis();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HIGATMetricImpl <em>HIGAT Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HIGATMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHIGATMetric()
		 * @generated
		 */
		EClass HIGAT_METRIC = eINSTANCE.getHIGATMetric();

		/**
		 * The meta object literal for the '<em><b>HMin Vis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGAT_METRIC__HMIN_VIS = eINSTANCE.getHIGATMetric_HMinVis();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMethodsMetricImpl <em>HNumber Of Methods Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMethodsMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfMethodsMetric()
		 * @generated
		 */
		EClass HNUMBER_OF_METHODS_METRIC = eINSTANCE.getHNumberOfMethodsMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HAverageOverloadingInClassMetricImpl <em>HAverage Overloading In Class Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HAverageOverloadingInClassMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHAverageOverloadingInClassMetric()
		 * @generated
		 */
		EClass HAVERAGE_OVERLOADING_IN_CLASS_METRIC = eINSTANCE.getHAverageOverloadingInClassMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HAverageParametersMetricImpl <em>HAverage Parameters Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HAverageParametersMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHAverageParametersMetric()
		 * @generated
		 */
		EClass HAVERAGE_PARAMETERS_METRIC = eINSTANCE.getHAverageParametersMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalMethodAccessesMetricImpl <em>HLocal Method Accesses Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalMethodAccessesMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalMethodAccessesMetric()
		 * @generated
		 */
		EClass HLOCAL_METHOD_ACCESSES_METRIC = eINSTANCE.getHLocalMethodAccessesMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalFieldAccessesMetricImpl <em>HLocal Field Accesses Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalFieldAccessesMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalFieldAccessesMetric()
		 * @generated
		 */
		EClass HLOCAL_FIELD_ACCESSES_METRIC = eINSTANCE.getHLocalFieldAccessesMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HTotalVisibilityMetricImpl <em>HTotal Visibility Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HTotalVisibilityMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHTotalVisibilityMetric()
		 * @generated
		 */
		EClass HTOTAL_VISIBILITY_METRIC = eINSTANCE.getHTotalVisibilityMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HTotalCouplingMetricImpl <em>HTotal Coupling Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HTotalCouplingMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHTotalCouplingMetric()
		 * @generated
		 */
		EClass HTOTAL_COUPLING_METRIC = eINSTANCE.getHTotalCouplingMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfFieldsMetricImpl <em>HNumber Of Fields Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfFieldsMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfFieldsMetric()
		 * @generated
		 */
		EClass HNUMBER_OF_FIELDS_METRIC = eINSTANCE.getHNumberOfFieldsMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLCOM5MetricImpl <em>HLCOM5 Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLCOM5MetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLCOM5Metric()
		 * @generated
		 */
		EClass HLCOM5_METRIC = eINSTANCE.getHLCOM5Metric();

		/**
		 * The meta object literal for the '<em><b>HNumber Of Methods Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLCOM5_METRIC__HNUMBER_OF_METHODS_METRIC = eINSTANCE.getHLCOM5Metric_HNumberOfMethodsMetric();

		/**
		 * The meta object literal for the '<em><b>HNumber Of Fields Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLCOM5_METRIC__HNUMBER_OF_FIELDS_METRIC = eINSTANCE.getHLCOM5Metric_HNumberOfFieldsMetric();

		/**
		 * The meta object literal for the '<em><b>HLocal Field Unique Access Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLCOM5_METRIC__HLOCAL_FIELD_UNIQUE_ACCESS_METRIC = eINSTANCE
				.getHLCOM5Metric_HLocalFieldUniqueAccessMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HEfferentCouplingMetricImpl <em>HEfferent Coupling Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HEfferentCouplingMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHEfferentCouplingMetric()
		 * @generated
		 */
		EClass HEFFERENT_COUPLING_METRIC = eINSTANCE.getHEfferentCouplingMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HAfferentCouplingMetricImpl <em>HAfferent Coupling Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HAfferentCouplingMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHAfferentCouplingMetric()
		 * @generated
		 */
		EClass HAFFERENT_COUPLING_METRIC = eINSTANCE.getHAfferentCouplingMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalFieldUniqueAccessMetricImpl <em>HLocal Field Unique Access Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalFieldUniqueAccessMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalFieldUniqueAccessMetric()
		 * @generated
		 */
		EClass HLOCAL_FIELD_UNIQUE_ACCESS_METRIC = eINSTANCE.getHLocalFieldUniqueAccessMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HIncommingInvocationMetricImpl <em>HIncomming Invocation Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HIncommingInvocationMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHIncommingInvocationMetric()
		 * @generated
		 */
		EClass HINCOMMING_INVOCATION_METRIC = eINSTANCE.getHIncommingInvocationMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HOutgoingInvocationMetricImpl <em>HOutgoing Invocation Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HOutgoingInvocationMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHOutgoingInvocationMetric()
		 * @generated
		 */
		EClass HOUTGOING_INVOCATION_METRIC = eINSTANCE.getHOutgoingInvocationMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HDepthOfInheritanceMetricImpl <em>HDepth Of Inheritance Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HDepthOfInheritanceMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHDepthOfInheritanceMetric()
		 * @generated
		 */
		EClass HDEPTH_OF_INHERITANCE_METRIC = eINSTANCE.getHDepthOfInheritanceMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HGetterMetricImpl <em>HGetter Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HGetterMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHGetterMetric()
		 * @generated
		 */
		EClass HGETTER_METRIC = eINSTANCE.getHGetterMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HSetterMetricImpl <em>HSetter Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HSetterMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHSetterMetric()
		 * @generated
		 */
		EClass HSETTER_METRIC = eINSTANCE.getHSetterMetric();

	}

} //MetricsPackage
