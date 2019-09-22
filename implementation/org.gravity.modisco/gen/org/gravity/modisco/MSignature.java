/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSignature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MSignature#getMDefinitions <em>MDefinitions</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMSignature()
 * @model abstract="true"
 * @generated
 */
public interface MSignature extends MAbstractFlowElement {
	/**
	 * Returns the value of the '<em><b>MDefinitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MDefinition#getMSignature <em>MSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDefinitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDefinitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMSignature_MDefinitions()
	 * @see org.gravity.modisco.MDefinition#getMSignature
	 * @model opposite="mSignature"
	 * @generated
	 */
	EList<MDefinition> getMDefinitions();

} // MSignature
