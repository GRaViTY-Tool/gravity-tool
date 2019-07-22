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
 *   <li>{@link org.gravity.typegraph.basic.impl.TFlowImpl#getFlowSource <em>Flow Source</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFlowImpl#getFlowTarget <em>Flow Target</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFlowImpl#getFlowOwner <em>Flow Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFlowImpl extends TAbstractFlowElementImpl implements TFlow {
	/**
	 * The cached value of the '{@link #getFlowSource() <em>Flow Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowSource()
	 * @generated
	 * @ordered
	 */
	protected TAbstractFlowElement flowSource;

	/**
	 * The cached value of the '{@link #getFlowTarget() <em>Flow Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowTarget()
	 * @generated
	 * @ordered
	 */
	protected TAbstractFlowElement flowTarget;

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
	public TAbstractFlowElement getFlowSource() {
		if (flowSource != null && flowSource.eIsProxy()) {
			InternalEObject oldFlowSource = (InternalEObject)flowSource;
			flowSource = (TAbstractFlowElement)eResolveProxy(oldFlowSource);
			if (flowSource != oldFlowSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TFLOW__FLOW_SOURCE, oldFlowSource, flowSource));
			}
		}
		return flowSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractFlowElement basicGetFlowSource() {
		return flowSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowSource(TAbstractFlowElement newFlowSource, NotificationChain msgs) {
		TAbstractFlowElement oldFlowSource = flowSource;
		flowSource = newFlowSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TFLOW__FLOW_SOURCE, oldFlowSource, newFlowSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowSource(TAbstractFlowElement newFlowSource) {
		if (newFlowSource != flowSource) {
			NotificationChain msgs = null;
			if (flowSource != null)
				msgs = ((InternalEObject)flowSource).eInverseRemove(this, BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS, TAbstractFlowElement.class, msgs);
			if (newFlowSource != null)
				msgs = ((InternalEObject)newFlowSource).eInverseAdd(this, BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS, TAbstractFlowElement.class, msgs);
			msgs = basicSetFlowSource(newFlowSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TFLOW__FLOW_SOURCE, newFlowSource, newFlowSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractFlowElement getFlowTarget() {
		if (flowTarget != null && flowTarget.eIsProxy()) {
			InternalEObject oldFlowTarget = (InternalEObject)flowTarget;
			flowTarget = (TAbstractFlowElement)eResolveProxy(oldFlowTarget);
			if (flowTarget != oldFlowTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TFLOW__FLOW_TARGET, oldFlowTarget, flowTarget));
			}
		}
		return flowTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractFlowElement basicGetFlowTarget() {
		return flowTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowTarget(TAbstractFlowElement newFlowTarget, NotificationChain msgs) {
		TAbstractFlowElement oldFlowTarget = flowTarget;
		flowTarget = newFlowTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TFLOW__FLOW_TARGET, oldFlowTarget, newFlowTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowTarget(TAbstractFlowElement newFlowTarget) {
		if (newFlowTarget != flowTarget) {
			NotificationChain msgs = null;
			if (flowTarget != null)
				msgs = ((InternalEObject)flowTarget).eInverseRemove(this, BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS, TAbstractFlowElement.class, msgs);
			if (newFlowTarget != null)
				msgs = ((InternalEObject)newFlowTarget).eInverseAdd(this, BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS, TAbstractFlowElement.class, msgs);
			msgs = basicSetFlowTarget(newFlowTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TFLOW__FLOW_TARGET, newFlowTarget, newFlowTarget));
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
			case BasicPackage.TFLOW__FLOW_SOURCE:
				if (flowSource != null)
					msgs = ((InternalEObject)flowSource).eInverseRemove(this, BasicPackage.TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS, TAbstractFlowElement.class, msgs);
				return basicSetFlowSource((TAbstractFlowElement)otherEnd, msgs);
			case BasicPackage.TFLOW__FLOW_TARGET:
				if (flowTarget != null)
					msgs = ((InternalEObject)flowTarget).eInverseRemove(this, BasicPackage.TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS, TAbstractFlowElement.class, msgs);
				return basicSetFlowTarget((TAbstractFlowElement)otherEnd, msgs);
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
			case BasicPackage.TFLOW__FLOW_SOURCE:
				return basicSetFlowSource(null, msgs);
			case BasicPackage.TFLOW__FLOW_TARGET:
				return basicSetFlowTarget(null, msgs);
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
			case BasicPackage.TFLOW__FLOW_SOURCE:
				if (resolve) return getFlowSource();
				return basicGetFlowSource();
			case BasicPackage.TFLOW__FLOW_TARGET:
				if (resolve) return getFlowTarget();
				return basicGetFlowTarget();
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
			case BasicPackage.TFLOW__FLOW_SOURCE:
				setFlowSource((TAbstractFlowElement)newValue);
				return;
			case BasicPackage.TFLOW__FLOW_TARGET:
				setFlowTarget((TAbstractFlowElement)newValue);
				return;
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
			case BasicPackage.TFLOW__FLOW_SOURCE:
				setFlowSource((TAbstractFlowElement)null);
				return;
			case BasicPackage.TFLOW__FLOW_TARGET:
				setFlowTarget((TAbstractFlowElement)null);
				return;
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
			case BasicPackage.TFLOW__FLOW_SOURCE:
				return flowSource != null;
			case BasicPackage.TFLOW__FLOW_TARGET:
				return flowTarget != null;
			case BasicPackage.TFLOW__FLOW_OWNER:
				return getFlowOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //TFlowImpl
