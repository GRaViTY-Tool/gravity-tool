/**
 */
package org.gravity.typegraph.basic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TClassEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TClass Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TClassEntityImpl#getTClass <em>TClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TClassEntityImpl extends TDeclaredEntityImpl implements TClassEntity {
	/**
	 * The cached value of the '{@link #getTClass() <em>TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTClass()
	 * @generated
	 * @ordered
	 */
	protected TClass tClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TClassEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TCLASS_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass getTClass() {
		if (tClass != null && tClass.eIsProxy()) {
			InternalEObject oldTClass = (InternalEObject) tClass;
			tClass = (TClass) eResolveProxy(oldTClass);
			if (tClass != oldTClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TCLASS_ENTITY__TCLASS,
							oldTClass, tClass));
			}
		}
		return tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetTClass() {
		return tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTClass(TClass newTClass, NotificationChain msgs) {
		TClass oldTClass = tClass;
		tClass = newTClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicPackage.TCLASS_ENTITY__TCLASS, oldTClass, newTClass);
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
	public void setTClass(TClass newTClass) {
		if (newTClass != tClass) {
			NotificationChain msgs = null;
			if (tClass != null)
				msgs = ((InternalEObject) tClass).eInverseRemove(this, BasicPackage.TCLASS__TCLASS_ENTITY, TClass.class,
						msgs);
			if (newTClass != null)
				msgs = ((InternalEObject) newTClass).eInverseAdd(this, BasicPackage.TCLASS__TCLASS_ENTITY, TClass.class,
						msgs);
			msgs = basicSetTClass(newTClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TCLASS_ENTITY__TCLASS, newTClass,
					newTClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicPackage.TCLASS_ENTITY__TCLASS:
			if (tClass != null)
				msgs = ((InternalEObject) tClass).eInverseRemove(this, BasicPackage.TCLASS__TCLASS_ENTITY, TClass.class,
						msgs);
			return basicSetTClass((TClass) otherEnd, msgs);
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
		case BasicPackage.TCLASS_ENTITY__TCLASS:
			return basicSetTClass(null, msgs);
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
		case BasicPackage.TCLASS_ENTITY__TCLASS:
			if (resolve)
				return getTClass();
			return basicGetTClass();
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
		case BasicPackage.TCLASS_ENTITY__TCLASS:
			setTClass((TClass) newValue);
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
		case BasicPackage.TCLASS_ENTITY__TCLASS:
			setTClass((TClass) null);
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
		case BasicPackage.TCLASS_ENTITY__TCLASS:
			return tClass != null;
		}
		return super.eIsSet(featureID);
	}

} //TClassEntityImpl
