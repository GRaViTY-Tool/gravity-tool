/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.java.MethodDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMethod Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MMethodDefinition#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.modisco.MMethodDefinition#getSyntheticMethodDefinitions <em>Synthetic Method Definitions</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMMethodDefinition()
 * @model
 * @generated
 */
public interface MMethodDefinition extends MethodDeclaration, MAbstractMethodDefinition {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MGravityModel#getMMethodDefinitions <em>MMethod Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(MGravityModel)
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodDefinition_Model()
	 * @see org.gravity.modisco.MGravityModel#getMMethodDefinitions
	 * @model opposite="mMethodDefinitions" required="true"
	 * @generated
	 */
	MGravityModel getModel();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MMethodDefinition#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(MGravityModel value);

	/**
	 * Returns the value of the '<em><b>Synthetic Method Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MSyntheticMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MSyntheticMethodDefinition#getOriginalMethodDefinition <em>Original Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synthetic Method Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthetic Method Definitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodDefinition_SyntheticMethodDefinitions()
	 * @see org.gravity.modisco.MSyntheticMethodDefinition#getOriginalMethodDefinition
	 * @model opposite="originalMethodDefinition"
	 * @generated
	 */
	EList<MSyntheticMethodDefinition> getSyntheticMethodDefinitions();

} // MMethodDefinition
