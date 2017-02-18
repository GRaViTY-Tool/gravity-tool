/**
 */
package org.gravity.typegraph.basic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMethod Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodEntityImpl#getTMethodDefinition <em>TMethod Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMethodEntityImpl extends TMemberEntityImpl implements TMethodEntity {
	/**
	 * The cached value of the '{@link #getTMethodDefinition() <em>TMethod Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMethodDefinition()
	 * @generated
	 * @ordered
	 */
	protected TMethodDefinition tMethodDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMethodEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TMETHOD_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition getTMethodDefinition() {
		if (tMethodDefinition != null && tMethodDefinition.eIsProxy()) {
			InternalEObject oldTMethodDefinition = (InternalEObject) tMethodDefinition;
			tMethodDefinition = (TMethodDefinition) eResolveProxy(oldTMethodDefinition);
			if (tMethodDefinition != oldTMethodDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BasicPackage.TMETHOD_ENTITY__TMETHOD_DEFINITION, oldTMethodDefinition, tMethodDefinition));
			}
		}
		return tMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition basicGetTMethodDefinition() {
		return tMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTMethodDefinition(TMethodDefinition newTMethodDefinition, NotificationChain msgs) {
		TMethodDefinition oldTMethodDefinition = tMethodDefinition;
		tMethodDefinition = newTMethodDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicPackage.TMETHOD_ENTITY__TMETHOD_DEFINITION, oldTMethodDefinition, newTMethodDefinition);
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
	public void setTMethodDefinition(TMethodDefinition newTMethodDefinition) {
		if (newTMethodDefinition != tMethodDefinition) {
			NotificationChain msgs = null;
			if (tMethodDefinition != null)
				msgs = ((InternalEObject) tMethodDefinition).eInverseRemove(this,
						BasicPackage.TMETHOD_DEFINITION__TMETHOD_ENTITY, TMethodDefinition.class, msgs);
			if (newTMethodDefinition != null)
				msgs = ((InternalEObject) newTMethodDefinition).eInverseAdd(this,
						BasicPackage.TMETHOD_DEFINITION__TMETHOD_ENTITY, TMethodDefinition.class, msgs);
			msgs = basicSetTMethodDefinition(newTMethodDefinition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_ENTITY__TMETHOD_DEFINITION,
					newTMethodDefinition, newTMethodDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicPackage.TMETHOD_ENTITY__TMETHOD_DEFINITION:
			if (tMethodDefinition != null)
				msgs = ((InternalEObject) tMethodDefinition).eInverseRemove(this,
						BasicPackage.TMETHOD_DEFINITION__TMETHOD_ENTITY, TMethodDefinition.class, msgs);
			return basicSetTMethodDefinition((TMethodDefinition) otherEnd, msgs);
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
		case BasicPackage.TMETHOD_ENTITY__TMETHOD_DEFINITION:
			return basicSetTMethodDefinition(null, msgs);
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
		case BasicPackage.TMETHOD_ENTITY__TMETHOD_DEFINITION:
			if (resolve)
				return getTMethodDefinition();
			return basicGetTMethodDefinition();
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
		case BasicPackage.TMETHOD_ENTITY__TMETHOD_DEFINITION:
			setTMethodDefinition((TMethodDefinition) newValue);
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
		case BasicPackage.TMETHOD_ENTITY__TMETHOD_DEFINITION:
			setTMethodDefinition((TMethodDefinition) null);
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
		case BasicPackage.TMETHOD_ENTITY__TMETHOD_DEFINITION:
			return tMethodDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //TMethodEntityImpl
