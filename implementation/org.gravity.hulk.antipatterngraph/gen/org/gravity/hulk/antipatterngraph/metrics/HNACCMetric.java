/**
 */
package org.gravity.hulk.antipatterngraph.metrics;

import org.eclipse.emf.common.util.EList;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HNACC Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHGetterSetterSmells <em>HGetter Setter Smells</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHGetterCustomMetric <em>HGetter Custom Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHSetterCustomMetric <em>HSetter Custom Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHNumberOfMethodsMetric <em>HNumber Of Methods Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHNACCMetric()
 * @model
 * @generated
 */
public interface HNACCMetric extends HMetric {
	/**
	 * Returns the value of the '<em><b>HGetter Setter Smells</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HGetter Setter Smells</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HGetter Setter Smells</em>' reference list.
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHNACCMetric_HGetterSetterSmells()
	 * @model
	 * @generated
	 */
	EList<HGetterSetterSmell> getHGetterSetterSmells();

	/**
	 * Returns the value of the '<em><b>HGetter Custom Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HGetter Custom Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HGetter Custom Metric</em>' reference.
	 * @see #setHGetterCustomMetric(HGetterMetric)
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHNACCMetric_HGetterCustomMetric()
	 * @model
	 * @generated
	 */
	HGetterMetric getHGetterCustomMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHGetterCustomMetric <em>HGetter Custom Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HGetter Custom Metric</em>' reference.
	 * @see #getHGetterCustomMetric()
	 * @generated
	 */
	void setHGetterCustomMetric(HGetterMetric value);

	/**
	 * Returns the value of the '<em><b>HSetter Custom Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HSetter Custom Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HSetter Custom Metric</em>' reference.
	 * @see #setHSetterCustomMetric(HSetterMetric)
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHNACCMetric_HSetterCustomMetric()
	 * @model
	 * @generated
	 */
	HSetterMetric getHSetterCustomMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHSetterCustomMetric <em>HSetter Custom Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HSetter Custom Metric</em>' reference.
	 * @see #getHSetterCustomMetric()
	 * @generated
	 */
	void setHSetterCustomMetric(HSetterMetric value);

	/**
	 * Returns the value of the '<em><b>HNumber Of Methods Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HNumber Of Methods Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HNumber Of Methods Metric</em>' reference.
	 * @see #setHNumberOfMethodsMetric(HNumberOfMethodsMetric)
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHNACCMetric_HNumberOfMethodsMetric()
	 * @model
	 * @generated
	 */
	HNumberOfMethodsMetric getHNumberOfMethodsMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHNumberOfMethodsMetric <em>HNumber Of Methods Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HNumber Of Methods Metric</em>' reference.
	 * @see #getHNumberOfMethodsMetric()
	 * @generated
	 */
	void setHNumberOfMethodsMetric(HNumberOfMethodsMetric value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HNACCMetric
