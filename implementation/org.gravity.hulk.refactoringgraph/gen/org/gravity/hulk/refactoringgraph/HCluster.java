/**
 */
package org.gravity.hulk.refactoringgraph;

import org.eclipse.emf.common.util.EList;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.typegraph.basic.TMember;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HCluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.HCluster#getTMembers <em>TMembers</em>}</li>
 * </ul>
 *
 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#getHCluster()
 * @model
 * @generated
 */
public interface HCluster extends HMetric {
	/**
	 * Returns the value of the '<em><b>TMembers</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMembers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMembers</em>' reference list.
	 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#getHCluster_TMembers()
	 * @model
	 * @generated
	 */
	EList<TMember> getTMembers();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HCluster
