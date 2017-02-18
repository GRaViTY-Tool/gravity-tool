/**
 */
package org.gravity.typegraph.basic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAccess</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAccessImpl#getTTarget <em>TTarget</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAccessImpl#getTSource <em>TSource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAccessImpl extends EObjectImpl implements TAccess {
	/**
	 * The cached value of the '{@link #getTTarget() <em>TTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTTarget()
	 * @generated
	 * @ordered
	 */
	protected TMember tTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMember getTTarget() {
		if (tTarget != null && tTarget.eIsProxy()) {
			InternalEObject oldTTarget = (InternalEObject) tTarget;
			tTarget = (TMember) eResolveProxy(oldTTarget);
			if (tTarget != oldTTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TACCESS__TTARGET, oldTTarget,
							tTarget));
			}
		}
		return tTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMember basicGetTTarget() {
		return tTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTTarget(TMember newTTarget, NotificationChain msgs) {
		TMember oldTTarget = tTarget;
		tTarget = newTTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicPackage.TACCESS__TTARGET, oldTTarget, newTTarget);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTTarget(TMember newTTarget) {
		if (newTTarget != tTarget) {
			NotificationChain msgs = null;
			if (tTarget != null)
				msgs = ((InternalEObject) tTarget).eInverseRemove(this, BasicPackage.TMEMBER__ACCESSED_BY,
						TMember.class, msgs);
			if (newTTarget != null)
				msgs = ((InternalEObject) newTTarget).eInverseAdd(this, BasicPackage.TMEMBER__ACCESSED_BY,
						TMember.class, msgs);
			msgs = basicSetTTarget(newTTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TACCESS__TTARGET, newTTarget,
					newTTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMember getTSource() {
		if (eContainerFeatureID() != BasicPackage.TACCESS__TSOURCE)
			return null;
		return (TMember) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTSource(TMember newTSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTSource, BasicPackage.TACCESS__TSOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTSource(TMember newTSource) {
		if (newTSource != eInternalContainer()
				|| (eContainerFeatureID() != BasicPackage.TACCESS__TSOURCE && newTSource != null)) {
			if (EcoreUtil.isAncestor(this, newTSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTSource != null)
				msgs = ((InternalEObject) newTSource).eInverseAdd(this, BasicPackage.TMEMBER__TACCESSING, TMember.class,
						msgs);
			msgs = basicSetTSource(newTSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TACCESS__TSOURCE, newTSource,
					newTSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicPackage.TACCESS__TTARGET:
			if (tTarget != null)
				msgs = ((InternalEObject) tTarget).eInverseRemove(this, BasicPackage.TMEMBER__ACCESSED_BY,
						TMember.class, msgs);
			return basicSetTTarget((TMember) otherEnd, msgs);
		case BasicPackage.TACCESS__TSOURCE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTSource((TMember) otherEnd, msgs);
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
		case BasicPackage.TACCESS__TTARGET:
			return basicSetTTarget(null, msgs);
		case BasicPackage.TACCESS__TSOURCE:
			return basicSetTSource(null, msgs);
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
		case BasicPackage.TACCESS__TSOURCE:
			return eInternalContainer().eInverseRemove(this, BasicPackage.TMEMBER__TACCESSING, TMember.class, msgs);
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
		case BasicPackage.TACCESS__TTARGET:
			if (resolve)
				return getTTarget();
			return basicGetTTarget();
		case BasicPackage.TACCESS__TSOURCE:
			return getTSource();
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
		case BasicPackage.TACCESS__TTARGET:
			setTTarget((TMember) newValue);
			return;
		case BasicPackage.TACCESS__TSOURCE:
			setTSource((TMember) newValue);
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
		case BasicPackage.TACCESS__TTARGET:
			setTTarget((TMember) null);
			return;
		case BasicPackage.TACCESS__TSOURCE:
			setTSource((TMember) null);
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
		case BasicPackage.TACCESS__TTARGET:
			return tTarget != null;
		case BasicPackage.TACCESS__TSOURCE:
			return getTSource() != null;
		}
		return super.eIsSet(featureID);
	}

} //TAccessImpl
