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
 *   <li>{@link org.gravity.modisco.impl.MFlowImpl#getFlowSource <em>Flow Source</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MFlowImpl#getFlowTarget <em>Flow Target</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MFlowImpl#getFlowOwner <em>Flow Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFlowImpl extends MAbstractFlowElementImpl implements MFlow {
	/**
	 * The cached value of the '{@link #getFlowSource() <em>Flow Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowSource()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElement flowSource;

	/**
	 * The cached value of the '{@link #getFlowTarget() <em>Flow Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowTarget()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElement flowTarget;

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
	public MAbstractFlowElement getFlowSource() {
		if (flowSource != null && flowSource.eIsProxy()) {
			InternalEObject oldFlowSource = (InternalEObject)flowSource;
			flowSource = (MAbstractFlowElement)eResolveProxy(oldFlowSource);
			if (flowSource != oldFlowSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MFLOW__FLOW_SOURCE, oldFlowSource, flowSource));
			}
		}
		return flowSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElement basicGetFlowSource() {
		return flowSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowSource(MAbstractFlowElement newFlowSource, NotificationChain msgs) {
		MAbstractFlowElement oldFlowSource = flowSource;
		flowSource = newFlowSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFLOW__FLOW_SOURCE, oldFlowSource, newFlowSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowSource(MAbstractFlowElement newFlowSource) {
		if (newFlowSource != flowSource) {
			NotificationChain msgs = null;
			if (flowSource != null)
				msgs = ((InternalEObject)flowSource).eInverseRemove(this, ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS, MAbstractFlowElement.class, msgs);
			if (newFlowSource != null)
				msgs = ((InternalEObject)newFlowSource).eInverseAdd(this, ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS, MAbstractFlowElement.class, msgs);
			msgs = basicSetFlowSource(newFlowSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFLOW__FLOW_SOURCE, newFlowSource, newFlowSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElement getFlowTarget() {
		if (flowTarget != null && flowTarget.eIsProxy()) {
			InternalEObject oldFlowTarget = (InternalEObject)flowTarget;
			flowTarget = (MAbstractFlowElement)eResolveProxy(oldFlowTarget);
			if (flowTarget != oldFlowTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MFLOW__FLOW_TARGET, oldFlowTarget, flowTarget));
			}
		}
		return flowTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElement basicGetFlowTarget() {
		return flowTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowTarget(MAbstractFlowElement newFlowTarget, NotificationChain msgs) {
		MAbstractFlowElement oldFlowTarget = flowTarget;
		flowTarget = newFlowTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFLOW__FLOW_TARGET, oldFlowTarget, newFlowTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowTarget(MAbstractFlowElement newFlowTarget) {
		if (newFlowTarget != flowTarget) {
			NotificationChain msgs = null;
			if (flowTarget != null)
				msgs = ((InternalEObject)flowTarget).eInverseRemove(this, ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS, MAbstractFlowElement.class, msgs);
			if (newFlowTarget != null)
				msgs = ((InternalEObject)newFlowTarget).eInverseAdd(this, ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS, MAbstractFlowElement.class, msgs);
			msgs = basicSetFlowTarget(newFlowTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFLOW__FLOW_TARGET, newFlowTarget, newFlowTarget));
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
			case ModiscoPackage.MFLOW__FLOW_SOURCE:
				if (flowSource != null)
					msgs = ((InternalEObject)flowSource).eInverseRemove(this, ModiscoPackage.MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS, MAbstractFlowElement.class, msgs);
				return basicSetFlowSource((MAbstractFlowElement)otherEnd, msgs);
			case ModiscoPackage.MFLOW__FLOW_TARGET:
				if (flowTarget != null)
					msgs = ((InternalEObject)flowTarget).eInverseRemove(this, ModiscoPackage.MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS, MAbstractFlowElement.class, msgs);
				return basicSetFlowTarget((MAbstractFlowElement)otherEnd, msgs);
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
			case ModiscoPackage.MFLOW__FLOW_SOURCE:
				return basicSetFlowSource(null, msgs);
			case ModiscoPackage.MFLOW__FLOW_TARGET:
				return basicSetFlowTarget(null, msgs);
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
			case ModiscoPackage.MFLOW__FLOW_SOURCE:
				if (resolve) return getFlowSource();
				return basicGetFlowSource();
			case ModiscoPackage.MFLOW__FLOW_TARGET:
				if (resolve) return getFlowTarget();
				return basicGetFlowTarget();
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
			case ModiscoPackage.MFLOW__FLOW_SOURCE:
				setFlowSource((MAbstractFlowElement)newValue);
				return;
			case ModiscoPackage.MFLOW__FLOW_TARGET:
				setFlowTarget((MAbstractFlowElement)newValue);
				return;
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
			case ModiscoPackage.MFLOW__FLOW_SOURCE:
				setFlowSource((MAbstractFlowElement)null);
				return;
			case ModiscoPackage.MFLOW__FLOW_TARGET:
				setFlowTarget((MAbstractFlowElement)null);
				return;
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
			case ModiscoPackage.MFLOW__FLOW_SOURCE:
				return flowSource != null;
			case ModiscoPackage.MFLOW__FLOW_TARGET:
				return flowTarget != null;
			case ModiscoPackage.MFLOW__FLOW_OWNER:
				return getFlowOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //MFlowImpl
