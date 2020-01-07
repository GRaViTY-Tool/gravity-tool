/**
 */
package org.gravity.modisco.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.AbstractTypeDeclaration;

import org.eclipse.modisco.java.emf.impl.AnonymousClassDeclarationImpl;

import org.gravity.modisco.MAnonymous;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MAnonymous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MAnonymousImpl#getMSourroundingType <em>MSourrounding Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MAnonymousImpl extends AnonymousClassDeclarationImpl implements MAnonymous {
	/**
	 * The cached value of the '{@link #getMSourroundingType() <em>MSourrounding Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSourroundingType()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeDeclaration mSourroundingType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAnonymousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MANONYMOUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration getMSourroundingType() {
		if (mSourroundingType != null && mSourroundingType.eIsProxy()) {
			InternalEObject oldMSourroundingType = (InternalEObject)mSourroundingType;
			mSourroundingType = (AbstractTypeDeclaration)eResolveProxy(oldMSourroundingType);
			if (mSourroundingType != oldMSourroundingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MANONYMOUS__MSOURROUNDING_TYPE, oldMSourroundingType, mSourroundingType));
			}
		}
		return mSourroundingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration basicGetMSourroundingType() {
		return mSourroundingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSourroundingType(AbstractTypeDeclaration newMSourroundingType) {
		AbstractTypeDeclaration oldMSourroundingType = mSourroundingType;
		mSourroundingType = newMSourroundingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MANONYMOUS__MSOURROUNDING_TYPE, oldMSourroundingType, mSourroundingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModiscoPackage.MANONYMOUS__MSOURROUNDING_TYPE:
				if (resolve) return getMSourroundingType();
				return basicGetMSourroundingType();
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
			case ModiscoPackage.MANONYMOUS__MSOURROUNDING_TYPE:
				setMSourroundingType((AbstractTypeDeclaration)newValue);
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
			case ModiscoPackage.MANONYMOUS__MSOURROUNDING_TYPE:
				setMSourroundingType((AbstractTypeDeclaration)null);
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
			case ModiscoPackage.MANONYMOUS__MSOURROUNDING_TYPE:
				return mSourroundingType != null;
		}
		return super.eIsSet(featureID);
	}

} //MAnonymousImpl
