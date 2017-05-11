/**
 */
package org.gravity.typegraph.basic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TField Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TFieldEntityImpl#getTFieldDefinition <em>TField Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFieldEntityImpl extends TMemberEntityImpl implements TFieldEntity {
	/**
	 * The cached value of the '{@link #getTFieldDefinition() <em>TField Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTFieldDefinition()
	 * @generated
	 * @ordered
	 */
	protected TFieldDefinition tFieldDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFieldEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TFIELD_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldDefinition getTFieldDefinition() {
		if (tFieldDefinition != null && tFieldDefinition.eIsProxy()) {
			InternalEObject oldTFieldDefinition = (InternalEObject) tFieldDefinition;
			tFieldDefinition = (TFieldDefinition) eResolveProxy(oldTFieldDefinition);
			if (tFieldDefinition != oldTFieldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BasicPackage.TFIELD_ENTITY__TFIELD_DEFINITION, oldTFieldDefinition, tFieldDefinition));
			}
		}
		return tFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldDefinition basicGetTFieldDefinition() {
		return tFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTFieldDefinition(TFieldDefinition newTFieldDefinition, NotificationChain msgs) {
		TFieldDefinition oldTFieldDefinition = tFieldDefinition;
		tFieldDefinition = newTFieldDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicPackage.TFIELD_ENTITY__TFIELD_DEFINITION, oldTFieldDefinition, newTFieldDefinition);
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
	public void setTFieldDefinition(TFieldDefinition newTFieldDefinition) {
		if (newTFieldDefinition != tFieldDefinition) {
			NotificationChain msgs = null;
			if (tFieldDefinition != null)
				msgs = ((InternalEObject) tFieldDefinition).eInverseRemove(this,
						BasicPackage.TFIELD_DEFINITION__TFIELD_ENTITY, TFieldDefinition.class, msgs);
			if (newTFieldDefinition != null)
				msgs = ((InternalEObject) newTFieldDefinition).eInverseAdd(this,
						BasicPackage.TFIELD_DEFINITION__TFIELD_ENTITY, TFieldDefinition.class, msgs);
			msgs = basicSetTFieldDefinition(newTFieldDefinition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TFIELD_ENTITY__TFIELD_DEFINITION,
					newTFieldDefinition, newTFieldDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicPackage.TFIELD_ENTITY__TFIELD_DEFINITION:
			if (tFieldDefinition != null)
				msgs = ((InternalEObject) tFieldDefinition).eInverseRemove(this,
						BasicPackage.TFIELD_DEFINITION__TFIELD_ENTITY, TFieldDefinition.class, msgs);
			return basicSetTFieldDefinition((TFieldDefinition) otherEnd, msgs);
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
		case BasicPackage.TFIELD_ENTITY__TFIELD_DEFINITION:
			return basicSetTFieldDefinition(null, msgs);
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
		case BasicPackage.TFIELD_ENTITY__TFIELD_DEFINITION:
			if (resolve)
				return getTFieldDefinition();
			return basicGetTFieldDefinition();
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
		case BasicPackage.TFIELD_ENTITY__TFIELD_DEFINITION:
			setTFieldDefinition((TFieldDefinition) newValue);
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
		case BasicPackage.TFIELD_ENTITY__TFIELD_DEFINITION:
			setTFieldDefinition((TFieldDefinition) null);
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
		case BasicPackage.TFIELD_ENTITY__TFIELD_DEFINITION:
			return tFieldDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //TFieldEntityImpl
