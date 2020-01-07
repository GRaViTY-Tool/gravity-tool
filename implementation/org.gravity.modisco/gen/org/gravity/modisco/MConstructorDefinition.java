/**
 */
package org.gravity.modisco;

import org.eclipse.modisco.java.ConstructorDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MConstructor Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MConstructorDefinition#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMConstructorDefinition()
 * @model
 * @generated
 */
public interface MConstructorDefinition extends MAbstractMethodDefinition, ConstructorDeclaration {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(MGravityModel)
	 * @see org.gravity.modisco.ModiscoPackage#getMConstructorDefinition_Model()
	 * @model required="true"
	 * @generated
	 */
	MGravityModel getModel();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MConstructorDefinition#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(MGravityModel value);

} // MConstructorDefinition
