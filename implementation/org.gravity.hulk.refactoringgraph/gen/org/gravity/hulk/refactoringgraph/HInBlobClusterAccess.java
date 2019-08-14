/**
 */
package org.gravity.hulk.refactoringgraph;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIn Blob Cluster Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.HInBlobClusterAccess#getHCluster <em>HCluster</em>}</li>
 * </ul>
 *
 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#getHInBlobClusterAccess()
 * @model
 * @generated
 */
public interface HInBlobClusterAccess extends HMetric {
	/**
	 * Returns the value of the '<em><b>HCluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HCluster</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HCluster</em>' reference.
	 * @see #setHCluster(HCluster)
	 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#getHInBlobClusterAccess_HCluster()
	 * @model
	 * @generated
	 */
	HCluster getHCluster();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.refactoringgraph.HInBlobClusterAccess#getHCluster <em>HCluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HCluster</em>' reference.
	 * @see #getHCluster()
	 * @generated
	 */
	void setHCluster(HCluster value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	HRelativeValue getRelativeAmount();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HInBlobClusterAccess
