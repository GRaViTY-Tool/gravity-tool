/**
 */
package org.gravity.hulk.antipatterngraph.metrics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage
 * @generated
 */
public interface MetricsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsFactory eINSTANCE = org.gravity.hulk.antipatterngraph.metrics.impl.MetricsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HNACC Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HNACC Metric</em>'.
	 * @generated
	 */
	HNACCMetric createHNACCMetric();

	/**
	 * Returns a new object of class '<em>HNumber Of Members Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HNumber Of Members Metric</em>'.
	 * @generated
	 */
	HNumberOfMembersMetric createHNumberOfMembersMetric();

	/**
	 * Returns a new object of class '<em>HLocal Access Relation Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLocal Access Relation Metric</em>'.
	 * @generated
	 */
	HLocalAccessRelationMetric createHLocalAccessRelationMetric();

	/**
	 * Returns a new object of class '<em>HInvocation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HInvocation Relation</em>'.
	 * @generated
	 */
	HInvocationRelation createHInvocationRelation();

	/**
	 * Returns a new object of class '<em>HNumber Of Child Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HNumber Of Child Metric</em>'.
	 * @generated
	 */
	HNumberOfChildMetric createHNumberOfChildMetric();

	/**
	 * Returns a new object of class '<em>HIGAM Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HIGAM Metric</em>'.
	 * @generated
	 */
	HIGAMMetric createHIGAMMetric();

	/**
	 * Returns a new object of class '<em>HIGAT Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HIGAT Metric</em>'.
	 * @generated
	 */
	HIGATMetric createHIGATMetric();

	/**
	 * Returns a new object of class '<em>HNumber Of Methods Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HNumber Of Methods Metric</em>'.
	 * @generated
	 */
	HNumberOfMethodsMetric createHNumberOfMethodsMetric();

	/**
	 * Returns a new object of class '<em>HAverage Overloading In Class Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HAverage Overloading In Class Metric</em>'.
	 * @generated
	 */
	HAverageOverloadingInClassMetric createHAverageOverloadingInClassMetric();

	/**
	 * Returns a new object of class '<em>HAverage Parameters Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HAverage Parameters Metric</em>'.
	 * @generated
	 */
	HAverageParametersMetric createHAverageParametersMetric();

	/**
	 * Returns a new object of class '<em>HLocal Method Accesses Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLocal Method Accesses Metric</em>'.
	 * @generated
	 */
	HLocalMethodAccessesMetric createHLocalMethodAccessesMetric();

	/**
	 * Returns a new object of class '<em>HLocal Field Accesses Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLocal Field Accesses Metric</em>'.
	 * @generated
	 */
	HLocalFieldAccessesMetric createHLocalFieldAccessesMetric();

	/**
	 * Returns a new object of class '<em>HTotal Visibility Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTotal Visibility Metric</em>'.
	 * @generated
	 */
	HTotalVisibilityMetric createHTotalVisibilityMetric();

	/**
	 * Returns a new object of class '<em>HTotal Coupling Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTotal Coupling Metric</em>'.
	 * @generated
	 */
	HTotalCouplingMetric createHTotalCouplingMetric();

	/**
	 * Returns a new object of class '<em>HNumber Of Fields Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HNumber Of Fields Metric</em>'.
	 * @generated
	 */
	HNumberOfFieldsMetric createHNumberOfFieldsMetric();

	/**
	 * Returns a new object of class '<em>HLCOM5 Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLCOM5 Metric</em>'.
	 * @generated
	 */
	HLCOM5Metric createHLCOM5Metric();

	/**
	 * Returns a new object of class '<em>HEfferent Coupling Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HEfferent Coupling Metric</em>'.
	 * @generated
	 */
	HEfferentCouplingMetric createHEfferentCouplingMetric();

	/**
	 * Returns a new object of class '<em>HAfferent Coupling Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HAfferent Coupling Metric</em>'.
	 * @generated
	 */
	HAfferentCouplingMetric createHAfferentCouplingMetric();

	/**
	 * Returns a new object of class '<em>HLocal Field Unique Access Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLocal Field Unique Access Metric</em>'.
	 * @generated
	 */
	HLocalFieldUniqueAccessMetric createHLocalFieldUniqueAccessMetric();

	/**
	 * Returns a new object of class '<em>HIncomming Invocation Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HIncomming Invocation Metric</em>'.
	 * @generated
	 */
	HIncommingInvocationMetric createHIncommingInvocationMetric();

	/**
	 * Returns a new object of class '<em>HOutgoing Invocation Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HOutgoing Invocation Metric</em>'.
	 * @generated
	 */
	HOutgoingInvocationMetric createHOutgoingInvocationMetric();

	/**
	 * Returns a new object of class '<em>HDepth Of Inheritance Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HDepth Of Inheritance Metric</em>'.
	 * @generated
	 */
	HDepthOfInheritanceMetric createHDepthOfInheritanceMetric();

	/**
	 * Returns a new object of class '<em>HGetter Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HGetter Metric</em>'.
	 * @generated
	 */
	HGetterMetric createHGetterMetric();

	/**
	 * Returns a new object of class '<em>HSetter Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HSetter Metric</em>'.
	 * @generated
	 */
	HSetterMetric createHSetterMetric();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetricsPackage getMetricsPackage();

} //MetricsFactory
