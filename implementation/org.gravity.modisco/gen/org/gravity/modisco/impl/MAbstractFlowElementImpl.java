/**
 */
package org.gravity.modisco.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MFlow;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MAbstract Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MAbstractFlowElementImpl#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MAbstractFlowElementImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MAbstractFlowElementImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MAbstractFlowElementImpl extends MinimalEObjectImpl.Container implements MAbstractFlowElement {
	/**
	 * The cached value of the '{@link #getOwnedFlows() <em>Owned Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<MFlow> ownedFlows;

	/**
	 * The cached value of the '{@link #getIncomingFlows() <em>Incoming Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<MFlow> incomingFlows;

	/**
	 * The cached value of the '{@link #getOutgoingFlows() <em>Outgoing Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<MFlow> outgoingFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAbstractFlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MABSTRACT_FLOW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFlow> getOwnedFlows() {
		if (ownedFlows == null) {
			ownedFlows = new EObjectContainmentWithInverseEList<MFlow>(MFlow.class, this, ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS, ModiscoPackage.MFLOW__FLOW_OWNER);
		}
		return ownedFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFlow> getIncomingFlows() {
		if (incomingFlows == null) {
			incomingFlows = new EObjectWithInverseResolvingEList<MFlow>(MFlow.class, this, ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS, ModiscoPackage.MFLOW__FLOW_TARGET);
		}
		return incomingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFlow> getOutgoingFlows() {
		if (outgoingFlows == null) {
			outgoingFlows = new EObjectWithInverseResolvingEList<MFlow>(MFlow.class, this, ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS, ModiscoPackage.MFLOW__FLOW_SOURCE);
		}
		return outgoingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFlows()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingFlows()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingFlows()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS:
				return ((InternalEList<?>)getOwnedFlows()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS:
				return ((InternalEList<?>)getIncomingFlows()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS:
				return ((InternalEList<?>)getOutgoingFlows()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS:
				return getOwnedFlows();
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS:
				return getIncomingFlows();
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS:
				return getOutgoingFlows();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS:
				getOwnedFlows().clear();
				getOwnedFlows().addAll((Collection<? extends MFlow>)newValue);
				return;
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS:
				getIncomingFlows().clear();
				getIncomingFlows().addAll((Collection<? extends MFlow>)newValue);
				return;
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				getOutgoingFlows().addAll((Collection<? extends MFlow>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS:
				getOwnedFlows().clear();
				return;
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS:
				getIncomingFlows().clear();
				return;
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS:
				return ownedFlows != null && !ownedFlows.isEmpty();
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS:
				return incomingFlows != null && !incomingFlows.isEmpty();
			case ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS:
				return outgoingFlows != null && !outgoingFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MAbstractFlowElementImpl
