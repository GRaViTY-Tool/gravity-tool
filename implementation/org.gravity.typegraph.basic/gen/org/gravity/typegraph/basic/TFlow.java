/**
 */
package org.gravity.typegraph.basic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TFlow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TFlow#getFlowSource <em>Flow Source</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TFlow#getFlowTarget <em>Flow Target</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TFlow#getFlowOwner <em>Flow Owner</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTFlow()
 * @model
 * @generated
 */
public interface TFlow extends TAbstractFlowElement {
	/**
	 * Returns the value of the '<em><b>Flow Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAbstractFlowElement#getOutgoingFlows <em>Outgoing Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Source</em>' reference.
	 * @see #setFlowSource(TAbstractFlowElement)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTFlow_FlowSource()
	 * @see org.gravity.typegraph.basic.TAbstractFlowElement#getOutgoingFlows
	 * @model opposite="outgoingFlows" required="true"
	 * @generated
	 */
	TAbstractFlowElement getFlowSource();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TFlow#getFlowSource <em>Flow Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Source</em>' reference.
	 * @see #getFlowSource()
	 * @generated
	 */
	void setFlowSource(TAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>Flow Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAbstractFlowElement#getIncomingFlows <em>Incoming Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Target</em>' reference.
	 * @see #setFlowTarget(TAbstractFlowElement)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTFlow_FlowTarget()
	 * @see org.gravity.typegraph.basic.TAbstractFlowElement#getIncomingFlows
	 * @model opposite="incomingFlows" required="true"
	 * @generated
	 */
	TAbstractFlowElement getFlowTarget();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TFlow#getFlowTarget <em>Flow Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Target</em>' reference.
	 * @see #getFlowTarget()
	 * @generated
	 */
	void setFlowTarget(TAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>Flow Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAbstractFlowElement#getOwnedFlows <em>Owned Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Owner</em>' container reference.
	 * @see #setFlowOwner(TAbstractFlowElement)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTFlow_FlowOwner()
	 * @see org.gravity.typegraph.basic.TAbstractFlowElement#getOwnedFlows
	 * @model opposite="ownedFlows" required="true" transient="false"
	 * @generated
	 */
	TAbstractFlowElement getFlowOwner();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TFlow#getFlowOwner <em>Flow Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Owner</em>' container reference.
	 * @see #getFlowOwner()
	 * @generated
	 */
	void setFlowOwner(TAbstractFlowElement value);

} // TFlow
