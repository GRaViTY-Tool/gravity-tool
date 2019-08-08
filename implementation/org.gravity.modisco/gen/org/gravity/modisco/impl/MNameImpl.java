/**
 */
package org.gravity.modisco.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.modisco.MName;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MName</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MNameImpl#getMSignatures <em>MSignatures</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MNameImpl#getMName <em>MName</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MNameImpl extends MinimalEObjectImpl.Container implements MName {
	/**
	 * The cached value of the '{@link #getMSignatures() <em>MSignatures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MSignature> mSignatures;

	/**
	 * The default value of the '{@link #getMName() <em>MName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMName()
	 * @generated
	 * @ordered
	 */
	protected static final String MNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMName() <em>MName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMName()
	 * @generated
	 * @ordered
	 */
	protected String mName = MNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MNAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MSignature> getMSignatures() {
		if (mSignatures == null) {
			mSignatures = new EObjectResolvingEList<MSignature>(MSignature.class, this, ModiscoPackage.MNAME__MSIGNATURES);
		}
		return mSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMName() {
		return mName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMName(String newMName) {
		String oldMName = mName;
		mName = newMName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MNAME__MNAME, oldMName, mName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModiscoPackage.MNAME__MSIGNATURES:
				return getMSignatures();
			case ModiscoPackage.MNAME__MNAME:
				return getMName();
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
			case ModiscoPackage.MNAME__MSIGNATURES:
				getMSignatures().clear();
				getMSignatures().addAll((Collection<? extends MSignature>)newValue);
				return;
			case ModiscoPackage.MNAME__MNAME:
				setMName((String)newValue);
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
			case ModiscoPackage.MNAME__MSIGNATURES:
				getMSignatures().clear();
				return;
			case ModiscoPackage.MNAME__MNAME:
				setMName(MNAME_EDEFAULT);
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
			case ModiscoPackage.MNAME__MSIGNATURES:
				return mSignatures != null && !mSignatures.isEmpty();
			case ModiscoPackage.MNAME__MNAME:
				return MNAME_EDEFAULT == null ? mName != null : !MNAME_EDEFAULT.equals(mName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mName: ");
		result.append(mName);
		result.append(')');
		return result.toString();
	}

} //MNameImpl
