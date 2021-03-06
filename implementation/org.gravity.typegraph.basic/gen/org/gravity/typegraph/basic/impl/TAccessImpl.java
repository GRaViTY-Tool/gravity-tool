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
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TMember;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAccess</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAccessImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAccessImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TAccessImpl#getStaticType <em>Static Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TAccessImpl extends TAbstractFlowElementImpl implements TAccess {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TMember target;

	/**
	 * The cached value of the '{@link #getStaticType() <em>Static Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType staticType;

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
	@Override
	public TMember getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (TMember)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TACCESS__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMember basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(TMember newTarget, NotificationChain msgs) {
		TMember oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TACCESS__TARGET, oldTarget, newTarget);
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
	public void setTarget(TMember newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, BasicPackage.TMEMBER__ACCESSED_BY, TMember.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, BasicPackage.TMEMBER__ACCESSED_BY, TMember.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TACCESS__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMember getSource() {
		if (eContainerFeatureID() != BasicPackage.TACCESS__SOURCE) return null;
		return (TMember)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(TMember newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, BasicPackage.TACCESS__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(TMember newSource) {
		if (newSource != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TACCESS__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, BasicPackage.TMEMBER__ACCESSING, TMember.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TACCESS__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getStaticType() {
		if (staticType != null && staticType.eIsProxy()) {
			InternalEObject oldStaticType = (InternalEObject)staticType;
			staticType = (TAbstractType)eResolveProxy(oldStaticType);
			if (staticType != oldStaticType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TACCESS__STATIC_TYPE, oldStaticType, staticType));
			}
		}
		return staticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetStaticType() {
		return staticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaticType(TAbstractType newStaticType) {
		TAbstractType oldStaticType = staticType;
		staticType = newStaticType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TACCESS__STATIC_TYPE, oldStaticType, staticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TACCESS__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, BasicPackage.TMEMBER__ACCESSED_BY, TMember.class, msgs);
				return basicSetTarget((TMember)otherEnd, msgs);
			case BasicPackage.TACCESS__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((TMember)otherEnd, msgs);
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
			case BasicPackage.TACCESS__TARGET:
				return basicSetTarget(null, msgs);
			case BasicPackage.TACCESS__SOURCE:
				return basicSetSource(null, msgs);
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
			case BasicPackage.TACCESS__SOURCE:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TMEMBER__ACCESSING, TMember.class, msgs);
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
			case BasicPackage.TACCESS__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case BasicPackage.TACCESS__SOURCE:
				return getSource();
			case BasicPackage.TACCESS__STATIC_TYPE:
				if (resolve) return getStaticType();
				return basicGetStaticType();
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
			case BasicPackage.TACCESS__TARGET:
				setTarget((TMember)newValue);
				return;
			case BasicPackage.TACCESS__SOURCE:
				setSource((TMember)newValue);
				return;
			case BasicPackage.TACCESS__STATIC_TYPE:
				setStaticType((TAbstractType)newValue);
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
			case BasicPackage.TACCESS__TARGET:
				setTarget((TMember)null);
				return;
			case BasicPackage.TACCESS__SOURCE:
				setSource((TMember)null);
				return;
			case BasicPackage.TACCESS__STATIC_TYPE:
				setStaticType((TAbstractType)null);
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
			case BasicPackage.TACCESS__TARGET:
				return target != null;
			case BasicPackage.TACCESS__SOURCE:
				return getSource() != null;
			case BasicPackage.TACCESS__STATIC_TYPE:
				return staticType != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TAccessImpl
