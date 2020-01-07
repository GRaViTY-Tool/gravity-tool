/**
 */
package org.gravity.modisco.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.modisco.MEntry;
import org.gravity.modisco.MParameterList;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MParameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MParameterListImpl#getMFirstEntry <em>MFirst Entry</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MParameterListImpl#getMEntrys <em>MEntrys</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MParameterListImpl extends MinimalEObjectImpl.Container implements MParameterList {
	/**
	 * The cached value of the '{@link #getMFirstEntry() <em>MFirst Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFirstEntry()
	 * @generated
	 * @ordered
	 */
	protected MEntry mFirstEntry;

	/**
	 * The cached value of the '{@link #getMEntrys() <em>MEntrys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEntrys()
	 * @generated
	 * @ordered
	 */
	protected EList<MEntry> mEntrys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MParameterListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MPARAMETER_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntry getMFirstEntry() {
		if (mFirstEntry != null && mFirstEntry.eIsProxy()) {
			InternalEObject oldMFirstEntry = (InternalEObject)mFirstEntry;
			mFirstEntry = (MEntry)eResolveProxy(oldMFirstEntry);
			if (mFirstEntry != oldMFirstEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MPARAMETER_LIST__MFIRST_ENTRY, oldMFirstEntry, mFirstEntry));
			}
		}
		return mFirstEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntry basicGetMFirstEntry() {
		return mFirstEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFirstEntry(MEntry newMFirstEntry) {
		MEntry oldMFirstEntry = mFirstEntry;
		mFirstEntry = newMFirstEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MPARAMETER_LIST__MFIRST_ENTRY, oldMFirstEntry, mFirstEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MEntry> getMEntrys() {
		if (mEntrys == null) {
			mEntrys = new EObjectContainmentEList<MEntry>(MEntry.class, this, ModiscoPackage.MPARAMETER_LIST__MENTRYS);
		}
		return mEntrys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModiscoPackage.MPARAMETER_LIST__MENTRYS:
				return ((InternalEList<?>)getMEntrys()).basicRemove(otherEnd, msgs);
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
			case ModiscoPackage.MPARAMETER_LIST__MFIRST_ENTRY:
				if (resolve) return getMFirstEntry();
				return basicGetMFirstEntry();
			case ModiscoPackage.MPARAMETER_LIST__MENTRYS:
				return getMEntrys();
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
			case ModiscoPackage.MPARAMETER_LIST__MFIRST_ENTRY:
				setMFirstEntry((MEntry)newValue);
				return;
			case ModiscoPackage.MPARAMETER_LIST__MENTRYS:
				getMEntrys().clear();
				getMEntrys().addAll((Collection<? extends MEntry>)newValue);
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
			case ModiscoPackage.MPARAMETER_LIST__MFIRST_ENTRY:
				setMFirstEntry((MEntry)null);
				return;
			case ModiscoPackage.MPARAMETER_LIST__MENTRYS:
				getMEntrys().clear();
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
			case ModiscoPackage.MPARAMETER_LIST__MFIRST_ENTRY:
				return mFirstEntry != null;
			case ModiscoPackage.MPARAMETER_LIST__MENTRYS:
				return mEntrys != null && !mEntrys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MParameterListImpl
