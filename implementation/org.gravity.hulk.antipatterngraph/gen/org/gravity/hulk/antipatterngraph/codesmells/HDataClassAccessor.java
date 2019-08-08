/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.eclipse.emf.common.util.EList;

import org.gravity.hulk.antipatterngraph.HCodeSmell;
import org.gravity.hulk.antipatterngraph.HMetric;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HData Class Accessor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor#getHDataClassSmells <em>HData Class Smells</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHDataClassAccessor()
 * @model
 * @generated
 */
public interface HDataClassAccessor extends HCodeSmell, HMetric {
	/**
	 * Returns the value of the '<em><b>HData Class Smells</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HData Class Smells</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HData Class Smells</em>' reference list.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHDataClassAccessor_HDataClassSmells()
	 * @model
	 * @generated
	 */
	EList<HDataClassSmell> getHDataClassSmells();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HDataClassAccessor
