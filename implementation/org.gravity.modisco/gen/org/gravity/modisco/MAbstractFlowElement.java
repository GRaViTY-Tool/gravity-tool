/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAbstract Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MAbstractFlowElement#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.MAbstractFlowElement#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.MAbstractFlowElement#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMAbstractFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface MAbstractFlowElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Flows</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.modisco.MFlow}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFlow#getFlowOwner <em>Flow Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Flows</em>' containment reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMAbstractFlowElement_OwnedFlows()
	 * @see org.gravity.modisco.MFlow#getFlowOwner
	 * @model opposite="flowOwner" containment="true"
	 * @generated
	 */
	EList<MFlow> getOwnedFlows();

	/**
	 * Returns the value of the '<em><b>Incoming Flows</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MFlow}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFlow#getFlowTarget <em>Flow Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Flows</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMAbstractFlowElement_IncomingFlows()
	 * @see org.gravity.modisco.MFlow#getFlowTarget
	 * @model opposite="flowTarget"
	 * @generated
	 */
	EList<MFlow> getIncomingFlows();

	/**
	 * Returns the value of the '<em><b>Outgoing Flows</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MFlow}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MFlow#getFlowSource <em>Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Flows</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMAbstractFlowElement_OutgoingFlows()
	 * @see org.gravity.modisco.MFlow#getFlowSource
	 * @model opposite="flowSource"
	 * @generated
	 */
	EList<MFlow> getOutgoingFlows();

} // MAbstractFlowElement
