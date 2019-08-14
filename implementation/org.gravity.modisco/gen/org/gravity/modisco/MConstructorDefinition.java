/**
 */
package org.gravity.modisco;

import org.eclipse.gmt.modisco.java.ConstructorDeclaration;

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
 *   <li>{@link org.gravity.modisco.MConstructorDefinition#getMParameterList <em>MParameter List</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMConstructorDefinition()
 * @model
 * @generated
 */
public interface MConstructorDefinition extends MAbstractMethodDefinition, ConstructorDeclaration {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MGravityModel#getMConstructorDefinitions <em>MConstructor Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(MGravityModel)
	 * @see org.gravity.modisco.ModiscoPackage#getMConstructorDefinition_Model()
	 * @see org.gravity.modisco.MGravityModel#getMConstructorDefinitions
	 * @model opposite="mConstructorDefinitions" required="true"
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

	/**
	 * Returns the value of the '<em><b>MParameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MParameter List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MParameter List</em>' containment reference.
	 * @see #setMParameterList(MParameterList)
	 * @see org.gravity.modisco.ModiscoPackage#getMConstructorDefinition_MParameterList()
	 * @model containment="true"
	 * @generated
	 */
	MParameterList getMParameterList();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MConstructorDefinition#getMParameterList <em>MParameter List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MParameter List</em>' containment reference.
	 * @see #getMParameterList()
	 * @generated
	 */
	void setMParameterList(MParameterList value);

} // MConstructorDefinition
