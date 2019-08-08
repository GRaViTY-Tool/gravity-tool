/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.gravity.hulk.antipatterngraph.HCodeSmell;

import org.gravity.typegraph.basic.TFieldDefinition;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HGetter Setter Smell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell#getTFieldDefinition <em>TField Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHGetterSetterSmell()
 * @model
 * @generated
 */
public interface HGetterSetterSmell extends HCodeSmell {
	/**
	 * Returns the value of the '<em><b>TField Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TField Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TField Definition</em>' reference.
	 * @see #setTFieldDefinition(TFieldDefinition)
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHGetterSetterSmell_TFieldDefinition()
	 * @model
	 * @generated
	 */
	TFieldDefinition getTFieldDefinition();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell#getTFieldDefinition <em>TField Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TField Definition</em>' reference.
	 * @see #getTFieldDefinition()
	 * @generated
	 */
	void setTFieldDefinition(TFieldDefinition value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HGetterSetterSmell
