/**
 */
package org.gravity.hulk.antipatterngraph.metrics;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.typegraph.basic.TVisibility;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIGAT Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.HIGATMetric#getHMinVis <em>HMin Vis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHIGATMetric()
 * @model
 * @generated
 */
public interface HIGATMetric extends HMetric {
	/**
	 * Returns the value of the '<em><b>HMin Vis</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gravity.typegraph.basic.TVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HMin Vis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HMin Vis</em>' attribute.
	 * @see org.gravity.typegraph.basic.TVisibility
	 * @see #setHMinVis(TVisibility)
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHIGATMetric_HMinVis()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TVisibility getHMinVis();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.metrics.HIGATMetric#getHMinVis <em>HMin Vis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HMin Vis</em>' attribute.
	 * @see org.gravity.typegraph.basic.TVisibility
	 * @see #getHMinVis()
	 * @generated
	 */
	void setHMinVis(TVisibility value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HIGATMetric
