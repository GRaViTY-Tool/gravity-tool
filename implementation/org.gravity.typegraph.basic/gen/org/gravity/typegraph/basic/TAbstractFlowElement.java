/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAbstract Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TAbstractFlowElement#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAbstractFlowElement#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAbstractFlowElement#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface TAbstractFlowElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Flows</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TFlow}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TFlow#getFlowOwner <em>Flow Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Flows</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractFlowElement_OwnedFlows()
	 * @see org.gravity.typegraph.basic.TFlow#getFlowOwner
	 * @model opposite="flowOwner" containment="true"
	 * @generated
	 */
	EList<TFlow> getOwnedFlows();

	/**
	 * Returns the value of the '<em><b>Incoming Flows</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TAbstractFlowElement}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAbstractFlowElement#getOutgoingFlows <em>Outgoing Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Flows</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractFlowElement_IncomingFlows()
	 * @see org.gravity.typegraph.basic.TAbstractFlowElement#getOutgoingFlows
	 * @model opposite="outgoingFlows"
	 * @generated
	 */
	EList<TAbstractFlowElement> getIncomingFlows();

	/**
	 * Returns the value of the '<em><b>Outgoing Flows</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TAbstractFlowElement}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAbstractFlowElement#getIncomingFlows <em>Incoming Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Flows</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractFlowElement_OutgoingFlows()
	 * @see org.gravity.typegraph.basic.TAbstractFlowElement#getIncomingFlows
	 * @model opposite="incomingFlows"
	 * @generated
	 */
	EList<TAbstractFlowElement> getOutgoingFlows();

} // TAbstractFlowElement
