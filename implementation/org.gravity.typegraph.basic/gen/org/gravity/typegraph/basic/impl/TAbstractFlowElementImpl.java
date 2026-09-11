/**
 */
package org.gravity.typegraph.basic.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractFlowElement;
import org.gravity.typegraph.basic.TFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAbstract Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractFlowElementImpl#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractFlowElementImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAbstractFlowElementImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TAbstractFlowElementImpl extends MinimalEObjectImpl.Container implements TAbstractFlowElement {
	/**
	 * The cached value of the '{@link #getOwnedFlows() <em>Owned Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<TFlow> ownedFlows;

	/**
	 * The cached value of the '{@link #getIncomingFlows() <em>Incoming Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<TAbstractFlowElement> incomingFlows;

	/**
	 * The cached value of the '{@link #getOutgoingFlows() <em>Outgoing Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<TAbstractFlowElement> outgoingFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAbstractFlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TABSTRACT_FLOW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFlow> getOwnedFlows() {
		if (ownedFlows == null) {
			ownedFlows = new EObjectContainmentWithInverseEList<TFlow>(TFlow.class, this, BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS, BasicPackage.TFLOW__FLOW_OWNER);
		}
		return ownedFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAbstractFlowElement> getIncomingFlows() {
		if (incomingFlows == null) {
			incomingFlows = new EObjectWithInverseResolvingEList.ManyInverse<TAbstractFlowElement>(TAbstractFlowElement.class, this, BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS, BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS);
		}
		return incomingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAbstractFlowElement> getOutgoingFlows() {
		if (outgoingFlows == null) {
			outgoingFlows = new EObjectWithInverseResolvingEList.ManyInverse<TAbstractFlowElement>(TAbstractFlowElement.class, this, BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS, BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS);
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
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingFlows()).basicAdd(otherEnd, msgs);
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS:
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
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS:
				return ((InternalEList<?>)getOwnedFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS:
				return ((InternalEList<?>)getIncomingFlows()).basicRemove(otherEnd, msgs);
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS:
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
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS:
				return getOwnedFlows();
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS:
				return getIncomingFlows();
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS:
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
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS:
				getOwnedFlows().clear();
				getOwnedFlows().addAll((Collection<? extends TFlow>)newValue);
				return;
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS:
				getIncomingFlows().clear();
				getIncomingFlows().addAll((Collection<? extends TAbstractFlowElement>)newValue);
				return;
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				getOutgoingFlows().addAll((Collection<? extends TAbstractFlowElement>)newValue);
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
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS:
				getOwnedFlows().clear();
				return;
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS:
				getIncomingFlows().clear();
				return;
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS:
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
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS:
				return ownedFlows != null && !ownedFlows.isEmpty();
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS:
				return incomingFlows != null && !incomingFlows.isEmpty();
			case BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS:
				return outgoingFlows != null && !outgoingFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TAbstractFlowElementImpl
