/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.java.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MField Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MFieldSignature#getMFieldName <em>MField Name</em>}</li>
 *   <li>{@link org.gravity.modisco.MFieldSignature#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.modisco.MFieldSignature#getType <em>Type</em>}</li>
 *   <li>{@link org.gravity.modisco.MFieldSignature#getMFieldDefinitions <em>MField Definitions</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMFieldSignature()
 * @model
 * @generated
 */
public interface MFieldSignature extends MSignature {
	/**
	 * Returns the value of the '<em><b>MField Name</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFieldName#getMFieldSignatures <em>MField Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MField Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MField Name</em>' reference.
	 * @see #setMFieldName(MFieldName)
	 * @see org.gravity.modisco.ModiscoPackage#getMFieldSignature_MFieldName()
	 * @see org.gravity.modisco.MFieldName#getMFieldSignatures
	 * @model opposite="mFieldSignatures" required="true"
	 * @generated
	 */
	MFieldName getMFieldName();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MFieldSignature#getMFieldName <em>MField Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MField Name</em>' reference.
	 * @see #getMFieldName()
	 * @generated
	 */
	void setMFieldName(MFieldName value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MGravityModel#getMFieldSignatures <em>MField Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(MGravityModel)
	 * @see org.gravity.modisco.ModiscoPackage#getMFieldSignature_Model()
	 * @see org.gravity.modisco.MGravityModel#getMFieldSignatures
	 * @model opposite="mFieldSignatures" required="true" transient="false"
	 * @generated
	 */
	MGravityModel getModel();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MFieldSignature#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(MGravityModel value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.gravity.modisco.ModiscoPackage#getMFieldSignature_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MFieldSignature#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>MField Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MFieldDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFieldDefinition#getMFieldSignature <em>MField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MField Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MField Definitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMFieldSignature_MFieldDefinitions()
	 * @see org.gravity.modisco.MFieldDefinition#getMFieldSignature
	 * @model opposite="mFieldSignature"
	 * @generated
	 */
	EList<MFieldDefinition> getMFieldDefinitions();

} // MFieldSignature
