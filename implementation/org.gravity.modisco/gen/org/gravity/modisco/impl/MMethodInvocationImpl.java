/**
 */
package org.gravity.modisco.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmt.modisco.java.Type;

import org.eclipse.gmt.modisco.java.emf.impl.MethodInvocationImpl;

import org.gravity.modisco.MMethodInvocation;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMethod Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MMethodInvocationImpl#getMStaticType <em>MStatic Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMethodInvocationImpl extends MethodInvocationImpl implements MMethodInvocation {
	/**
	 * The cached value of the '{@link #getMStaticType() <em>MStatic Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStaticType()
	 * @generated
	 * @ordered
	 */
	protected Type mStaticType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMethodInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MMETHOD_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getMStaticType() {
		if (mStaticType != null && mStaticType.eIsProxy()) {
			InternalEObject oldMStaticType = (InternalEObject)mStaticType;
			mStaticType = (Type)eResolveProxy(oldMStaticType);
			if (mStaticType != oldMStaticType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MMETHOD_INVOCATION__MSTATIC_TYPE, oldMStaticType, mStaticType));
			}
		}
		return mStaticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetMStaticType() {
		return mStaticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMStaticType(Type newMStaticType) {
		Type oldMStaticType = mStaticType;
		mStaticType = newMStaticType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_INVOCATION__MSTATIC_TYPE, oldMStaticType, mStaticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModiscoPackage.MMETHOD_INVOCATION__MSTATIC_TYPE:
				if (resolve) return getMStaticType();
				return basicGetMStaticType();
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
			case ModiscoPackage.MMETHOD_INVOCATION__MSTATIC_TYPE:
				setMStaticType((Type)newValue);
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
			case ModiscoPackage.MMETHOD_INVOCATION__MSTATIC_TYPE:
				setMStaticType((Type)null);
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
			case ModiscoPackage.MMETHOD_INVOCATION__MSTATIC_TYPE:
				return mStaticType != null;
		}
		return super.eIsSet(featureID);
	}

} //MMethodInvocationImpl
