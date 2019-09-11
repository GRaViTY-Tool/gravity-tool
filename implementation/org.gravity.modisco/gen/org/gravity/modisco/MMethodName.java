/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMethod Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MMethodName#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.modisco.MMethodName#getMMethodDefinitions <em>MMethod Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.MMethodName#getMMethodSignatures <em>MMethod Signatures</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMMethodName()
 * @model
 * @generated
 */
public interface MMethodName extends MName {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MGravityModel#getMMethodNames <em>MMethod Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(MGravityModel)
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodName_Model()
	 * @see org.gravity.modisco.MGravityModel#getMMethodNames
	 * @model opposite="mMethodNames" required="true" transient="false"
	 * @generated
	 */
	MGravityModel getModel();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MMethodName#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(MGravityModel value);

	/**
	 * Returns the value of the '<em><b>MMethod Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MAbstractMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MAbstractMethodDefinition#getMMethodName <em>MMethod Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMethod Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Definitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodName_MMethodDefinitions()
	 * @see org.gravity.modisco.MAbstractMethodDefinition#getMMethodName
	 * @model opposite="mMethodName"
	 * @generated
	 */
	EList<MAbstractMethodDefinition> getMMethodDefinitions();

	/**
	 * Returns the value of the '<em><b>MMethod Signatures</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MMethodSignature}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MMethodSignature#getMMethodName <em>MMethod Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMethod Signatures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Signatures</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodName_MMethodSignatures()
	 * @see org.gravity.modisco.MMethodSignature#getMMethodName
	 * @model opposite="mMethodName"
	 * @generated
	 */
	EList<MMethodSignature> getMMethodSignatures();

} // MMethodName
