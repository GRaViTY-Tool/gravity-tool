/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MField Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MFieldName#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.modisco.MFieldName#getMFieldSignatures <em>MField Signatures</em>}</li>
 *   <li>{@link org.gravity.modisco.MFieldName#getMFieldDefinitions <em>MField Definitions</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMFieldName()
 * @model
 * @generated
 */
public interface MFieldName extends MName {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MGravityModel#getMFieldNames <em>MField Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(MGravityModel)
	 * @see org.gravity.modisco.ModiscoPackage#getMFieldName_Model()
	 * @see org.gravity.modisco.MGravityModel#getMFieldNames
	 * @model opposite="mFieldNames" required="true" transient="false"
	 * @generated
	 */
	MGravityModel getModel();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MFieldName#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(MGravityModel value);

	/**
	 * Returns the value of the '<em><b>MField Signatures</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MFieldSignature}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFieldSignature#getMFieldName <em>MField Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MField Signatures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MField Signatures</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMFieldName_MFieldSignatures()
	 * @see org.gravity.modisco.MFieldSignature#getMFieldName
	 * @model opposite="mFieldName"
	 * @generated
	 */
	EList<MFieldSignature> getMFieldSignatures();

	/**
	 * Returns the value of the '<em><b>MField Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MFieldDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFieldDefinition#getMFieldName <em>MField Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MField Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MField Definitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMFieldName_MFieldDefinitions()
	 * @see org.gravity.modisco.MFieldDefinition#getMFieldName
	 * @model opposite="mFieldName"
	 * @generated
	 */
	EList<MFieldDefinition> getMFieldDefinitions();

} // MFieldName
