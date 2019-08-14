/**
 */
package org.gravity.modisco;

import org.eclipse.gmt.modisco.java.Annotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MAnnotation#isMRelevant <em>MRelevant</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMAnnotation()
 * @model
 * @generated
 */
public interface MAnnotation extends Annotation {
	/**
	 * Returns the value of the '<em><b>MRelevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRelevant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRelevant</em>' attribute.
	 * @see #setMRelevant(boolean)
	 * @see org.gravity.modisco.ModiscoPackage#getMAnnotation_MRelevant()
	 * @model
	 * @generated
	 */
	boolean isMRelevant();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MAnnotation#isMRelevant <em>MRelevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MRelevant</em>' attribute.
	 * @see #isMRelevant()
	 * @generated
	 */
	void setMRelevant(boolean value);

} // MAnnotation
