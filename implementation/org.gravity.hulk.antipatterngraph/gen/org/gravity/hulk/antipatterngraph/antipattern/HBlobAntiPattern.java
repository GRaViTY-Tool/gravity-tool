/**
 */
package org.gravity.hulk.antipatterngraph.antipattern;

import org.eclipse.emf.common.util.EList;

import org.gravity.hulk.antipatterngraph.HAntiPattern;

import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HBlob Anti Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern#getHDataClassSmells <em>HData Class Smells</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern#getHGodClassAntiPattern <em>HGod Class Anti Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage#getHBlobAntiPattern()
 * @model
 * @generated
 */
public interface HBlobAntiPattern extends HAntiPattern {
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
	 * @see org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage#getHBlobAntiPattern_HDataClassSmells()
	 * @model
	 * @generated
	 */
	EList<HDataClassSmell> getHDataClassSmells();

	/**
	 * Returns the value of the '<em><b>HGod Class Anti Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HGod Class Anti Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HGod Class Anti Pattern</em>' reference.
	 * @see #setHGodClassAntiPattern(HGodClassAntiPattern)
	 * @see org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage#getHBlobAntiPattern_HGodClassAntiPattern()
	 * @model
	 * @generated
	 */
	HGodClassAntiPattern getHGodClassAntiPattern();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern#getHGodClassAntiPattern <em>HGod Class Anti Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HGod Class Anti Pattern</em>' reference.
	 * @see #getHGodClassAntiPattern()
	 * @generated
	 */
	void setHGodClassAntiPattern(HGodClassAntiPattern value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HBlobAntiPattern
