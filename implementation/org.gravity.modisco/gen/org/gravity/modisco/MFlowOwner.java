/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFlow Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MFlowOwner#getOwnedFlows <em>Owned Flows</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMFlowOwner()
 * @model abstract="true"
 * @generated
 */
public interface MFlowOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Flows</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.modisco.MFlow}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFlow#getFlowOwner <em>Flow Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Flows</em>' containment reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMFlowOwner_OwnedFlows()
	 * @see org.gravity.modisco.MFlow#getFlowOwner
	 * @model opposite="flowOwner" containment="true"
	 * @generated
	 */
	EList<MFlow> getOwnedFlows();

} // MFlowOwner
