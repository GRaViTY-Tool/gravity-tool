/**
 */
package org.gravity.modisco.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.emf.impl.SingleVariableDeclarationImpl;

import org.gravity.modisco.MEntry;
import org.gravity.modisco.MSingleVariableDeclaration;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSingle Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MSingleVariableDeclarationImpl#getMEntry <em>MEntry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSingleVariableDeclarationImpl extends SingleVariableDeclarationImpl implements MSingleVariableDeclaration {
	/**
	 * The cached value of the '{@link #getMEntry() <em>MEntry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEntry()
	 * @generated
	 * @ordered
	 */
	protected MEntry mEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSingleVariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MSINGLE_VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntry getMEntry() {
		if (mEntry != null && mEntry.eIsProxy()) {
			InternalEObject oldMEntry = (InternalEObject)mEntry;
			mEntry = (MEntry)eResolveProxy(oldMEntry);
			if (mEntry != oldMEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MSINGLE_VARIABLE_DECLARATION__MENTRY, oldMEntry, mEntry));
			}
		}
		return mEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntry basicGetMEntry() {
		return mEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMEntry(MEntry newMEntry, NotificationChain msgs) {
		MEntry oldMEntry = mEntry;
		mEntry = newMEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MSINGLE_VARIABLE_DECLARATION__MENTRY, oldMEntry, newMEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMEntry(MEntry newMEntry) {
		if (newMEntry != mEntry) {
			NotificationChain msgs = null;
			if (mEntry != null)
				msgs = ((InternalEObject)mEntry).eInverseRemove(this, ModiscoPackage.MENTRY__PARAMETERS, MEntry.class, msgs);
			if (newMEntry != null)
				msgs = ((InternalEObject)newMEntry).eInverseAdd(this, ModiscoPackage.MENTRY__PARAMETERS, MEntry.class, msgs);
			msgs = basicSetMEntry(newMEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MSINGLE_VARIABLE_DECLARATION__MENTRY, newMEntry, newMEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModiscoPackage.MSINGLE_VARIABLE_DECLARATION__MENTRY:
				if (mEntry != null)
					msgs = ((InternalEObject)mEntry).eInverseRemove(this, ModiscoPackage.MENTRY__PARAMETERS, MEntry.class, msgs);
				return basicSetMEntry((MEntry)otherEnd, msgs);
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
			case ModiscoPackage.MSINGLE_VARIABLE_DECLARATION__MENTRY:
				return basicSetMEntry(null, msgs);
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
			case ModiscoPackage.MSINGLE_VARIABLE_DECLARATION__MENTRY:
				if (resolve) return getMEntry();
				return basicGetMEntry();
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
			case ModiscoPackage.MSINGLE_VARIABLE_DECLARATION__MENTRY:
				setMEntry((MEntry)newValue);
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
			case ModiscoPackage.MSINGLE_VARIABLE_DECLARATION__MENTRY:
				setMEntry((MEntry)null);
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
			case ModiscoPackage.MSINGLE_VARIABLE_DECLARATION__MENTRY:
				return mEntry != null;
		}
		return super.eIsSet(featureID);
	}

} //MSingleVariableDeclarationImpl
