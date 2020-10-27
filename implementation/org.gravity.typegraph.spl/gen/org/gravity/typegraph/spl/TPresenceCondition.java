/**
 */
package org.gravity.typegraph.spl;

import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPresence Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.spl.TPresenceCondition#getPc <em>Pc</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.spl.SplPackage#getTPresenceCondition()
 * @model
 * @generated
 */
public interface TPresenceCondition extends TAnnotation {
	/**
	 * Returns the value of the '<em><b>Pc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pc</em>' attribute.
	 * @see #setPc(String)
	 * @see org.gravity.typegraph.spl.SplPackage#getTPresenceCondition_Pc()
	 * @model
	 * @generated
	 */
	String getPc();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.spl.TPresenceCondition#getPc <em>Pc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pc</em>' attribute.
	 * @see #getPc()
	 * @generated
	 */
	void setPc(String value);

} // TPresenceCondition
