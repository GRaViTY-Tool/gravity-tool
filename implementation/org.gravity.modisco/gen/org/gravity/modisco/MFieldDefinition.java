/**
 */
package org.gravity.modisco;

import org.eclipse.gmt.modisco.java.FieldDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MField Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MFieldDefinition#getMFieldSignature <em>MField Signature</em>}</li>
 *   <li>{@link org.gravity.modisco.MFieldDefinition#getMFieldName <em>MField Name</em>}</li>
 *   <li>{@link org.gravity.modisco.MFieldDefinition#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMFieldDefinition()
 * @model
 * @generated
 */
public interface MFieldDefinition extends MDefinition, FieldDeclaration {
	/**
	 * Returns the value of the '<em><b>MField Signature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFieldSignature#getMFieldDefinitions <em>MField Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MField Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MField Signature</em>' reference.
	 * @see #setMFieldSignature(MFieldSignature)
	 * @see org.gravity.modisco.ModiscoPackage#getMFieldDefinition_MFieldSignature()
	 * @see org.gravity.modisco.MFieldSignature#getMFieldDefinitions
	 * @model opposite="mFieldDefinitions"
	 * @generated
	 */
	MFieldSignature getMFieldSignature();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MFieldDefinition#getMFieldSignature <em>MField Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MField Signature</em>' reference.
	 * @see #getMFieldSignature()
	 * @generated
	 */
	void setMFieldSignature(MFieldSignature value);

	/**
	 * Returns the value of the '<em><b>MField Name</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFieldName#getMFieldDefinitions <em>MField Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MField Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MField Name</em>' reference.
	 * @see #setMFieldName(MFieldName)
	 * @see org.gravity.modisco.ModiscoPackage#getMFieldDefinition_MFieldName()
	 * @see org.gravity.modisco.MFieldName#getMFieldDefinitions
	 * @model opposite="mFieldDefinitions" required="true"
	 * @generated
	 */
	MFieldName getMFieldName();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MFieldDefinition#getMFieldName <em>MField Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MField Name</em>' reference.
	 * @see #getMFieldName()
	 * @generated
	 */
	void setMFieldName(MFieldName value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MGravityModel#getMFieldDefinitions <em>MField Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(MGravityModel)
	 * @see org.gravity.modisco.ModiscoPackage#getMFieldDefinition_Model()
	 * @see org.gravity.modisco.MGravityModel#getMFieldDefinitions
	 * @model opposite="mFieldDefinitions" required="true"
	 * @generated
	 */
	MGravityModel getModel();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MFieldDefinition#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(MGravityModel value);

} // MFieldDefinition
