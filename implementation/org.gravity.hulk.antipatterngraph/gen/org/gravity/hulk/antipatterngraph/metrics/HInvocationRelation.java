/**
 */
package org.gravity.hulk.antipatterngraph.metrics;

import org.gravity.hulk.antipatterngraph.HMetric;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HInvocation Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHOutgoingInvocationCustomMetric <em>HOutgoing Invocation Custom Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHIncommingInvocationCustomMetric <em>HIncomming Invocation Custom Metric</em>}</li>
 * </ul>
 *
 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHInvocationRelation()
 * @model
 * @generated
 */
public interface HInvocationRelation extends HMetric {
	/**
	 * Returns the value of the '<em><b>HOutgoing Invocation Custom Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HOutgoing Invocation Custom Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HOutgoing Invocation Custom Metric</em>' reference.
	 * @see #setHOutgoingInvocationCustomMetric(HOutgoingInvocationMetric)
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHInvocationRelation_HOutgoingInvocationCustomMetric()
	 * @model
	 * @generated
	 */
	HOutgoingInvocationMetric getHOutgoingInvocationCustomMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHOutgoingInvocationCustomMetric <em>HOutgoing Invocation Custom Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HOutgoing Invocation Custom Metric</em>' reference.
	 * @see #getHOutgoingInvocationCustomMetric()
	 * @generated
	 */
	void setHOutgoingInvocationCustomMetric(HOutgoingInvocationMetric value);

	/**
	 * Returns the value of the '<em><b>HIncomming Invocation Custom Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HIncomming Invocation Custom Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HIncomming Invocation Custom Metric</em>' reference.
	 * @see #setHIncommingInvocationCustomMetric(HIncommingInvocationMetric)
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHInvocationRelation_HIncommingInvocationCustomMetric()
	 * @model
	 * @generated
	 */
	HIncommingInvocationMetric getHIncommingInvocationCustomMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHIncommingInvocationCustomMetric <em>HIncomming Invocation Custom Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIncomming Invocation Custom Metric</em>' reference.
	 * @see #getHIncommingInvocationCustomMetric()
	 * @generated
	 */
	void setHIncommingInvocationCustomMetric(HIncommingInvocationMetric value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HInvocationRelation
