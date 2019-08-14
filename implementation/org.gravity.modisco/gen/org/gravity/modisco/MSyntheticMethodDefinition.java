/**
 */
package org.gravity.modisco;

import org.eclipse.gmt.modisco.java.BodyDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSynthetic Method Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MSyntheticMethodDefinition#getOriginalMethodDefinition <em>Original Method Definition</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMSyntheticMethodDefinition()
 * @model
 * @generated
 */
public interface MSyntheticMethodDefinition extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>Original Method Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MMethodDefinition#getSyntheticMethodDefinitions <em>Synthetic Method Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Method Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Method Definition</em>' reference.
	 * @see #setOriginalMethodDefinition(MMethodDefinition)
	 * @see org.gravity.modisco.ModiscoPackage#getMSyntheticMethodDefinition_OriginalMethodDefinition()
	 * @see org.gravity.modisco.MMethodDefinition#getSyntheticMethodDefinitions
	 * @model opposite="syntheticMethodDefinitions" required="true"
	 * @generated
	 */
	MMethodDefinition getOriginalMethodDefinition();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MSyntheticMethodDefinition#getOriginalMethodDefinition <em>Original Method Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Method Definition</em>' reference.
	 * @see #getOriginalMethodDefinition()
	 * @generated
	 */
	void setOriginalMethodDefinition(MMethodDefinition value);

} // MSyntheticMethodDefinition
