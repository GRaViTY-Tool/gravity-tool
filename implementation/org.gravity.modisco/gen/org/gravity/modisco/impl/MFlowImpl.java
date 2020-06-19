/**
 */
package org.gravity.modisco.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MFlow;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MFlow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MFlowImpl#getFlowOwner <em>Flow Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFlowImpl extends MAbstractFlowElementImpl implements MFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElement getFlowOwner() {
		if (eContainerFeatureID() != ModiscoPackage.MFLOW__FLOW_OWNER) return null;
		return (MAbstractFlowElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowOwner(MAbstractFlowElement newFlowOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFlowOwner, ModiscoPackage.MFLOW__FLOW_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowOwner(MAbstractFlowElement newFlowOwner) {
		if (newFlowOwner != eInternalContainer() || (eContainerFeatureID() != ModiscoPackage.MFLOW__FLOW_OWNER && newFlowOwner != null)) {
			if (EcoreUtil.isAncestor(this, newFlowOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFlowOwner != null)
				msgs = ((InternalEObject)newFlowOwner).eInverseAdd(this, ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS, MAbstractFlowElement.class, msgs);
			msgs = basicSetFlowOwner(newFlowOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFLOW__FLOW_OWNER, newFlowOwner, newFlowOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModiscoPackage.MFLOW__FLOW_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFlowOwner((MAbstractFlowElement)otherEnd, msgs);
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
			case ModiscoPackage.MFLOW__FLOW_OWNER:
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
			case ModiscoPackage.MFLOW__FLOW_OWNER:
				return eInternalContainer().eInverseRemove(this, ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS, MAbstractFlowElement.class, msgs);
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
			case ModiscoPackage.MFLOW__FLOW_OWNER:
				return getFlowOwner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModiscoPackage.MFLOW__FLOW_OWNER:
				setFlowOwner((MAbstractFlowElement)newValue);
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
			case ModiscoPackage.MFLOW__FLOW_OWNER:
				setFlowOwner((MAbstractFlowElement)null);
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
			case ModiscoPackage.MFLOW__FLOW_OWNER:
				return getFlowOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //MFlowImpl
