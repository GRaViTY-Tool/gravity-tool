/**
 */
package org.gravity.typegraph.basic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractFlowElement;
import org.gravity.typegraph.basic.TFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFlow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFlowImpl#getFlowOwner <em>Flow Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFlowImpl extends TAbstractFlowElementImpl implements TFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractFlowElement getFlowOwner() {
		if (eContainerFeatureID() != BasicPackage.TFLOW__FLOW_OWNER) return null;
		return (TAbstractFlowElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowOwner(TAbstractFlowElement newFlowOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFlowOwner, BasicPackage.TFLOW__FLOW_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowOwner(TAbstractFlowElement newFlowOwner) {
		if (newFlowOwner != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TFLOW__FLOW_OWNER && newFlowOwner != null)) {
			if (EcoreUtil.isAncestor(this, newFlowOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFlowOwner != null)
				msgs = ((InternalEObject)newFlowOwner).eInverseAdd(this, BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS, TAbstractFlowElement.class, msgs);
			msgs = basicSetFlowOwner(newFlowOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TFLOW__FLOW_OWNER, newFlowOwner, newFlowOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TFLOW__FLOW_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFlowOwner((TAbstractFlowElement)otherEnd, msgs);
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
			case BasicPackage.TFLOW__FLOW_OWNER:
				return basicSetFlowOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BasicPackage.TFLOW__FLOW_OWNER:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS, TAbstractFlowElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicPackage.TFLOW__FLOW_OWNER:
				return getFlowOwner();
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
			case BasicPackage.TFLOW__FLOW_OWNER:
				setFlowOwner((TAbstractFlowElement)newValue);
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
			case BasicPackage.TFLOW__FLOW_OWNER:
				setFlowOwner((TAbstractFlowElement)null);
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
			case BasicPackage.TFLOW__FLOW_OWNER:
				return getFlowOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //TFlowImpl
