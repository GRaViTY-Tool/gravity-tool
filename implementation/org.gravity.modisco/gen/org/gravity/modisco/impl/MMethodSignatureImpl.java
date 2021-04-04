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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MEntry;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MParameterList;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMethod Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MMethodSignatureImpl#getMFirstEntry <em>MFirst Entry</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodSignatureImpl#getMEntrys <em>MEntrys</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodSignatureImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMethodSignatureImpl extends MSignatureImpl implements MMethodSignature {
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMethodSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MMETHOD_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEntry getMFirstEntry() {
		if (mFirstEntry != null && mFirstEntry.eIsProxy()) {
			InternalEObject oldMFirstEntry = (InternalEObject)mFirstEntry;
			mFirstEntry = (MEntry)eResolveProxy(oldMFirstEntry);
			if (mFirstEntry != oldMFirstEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MMETHOD_SIGNATURE__MFIRST_ENTRY, oldMFirstEntry, mFirstEntry));
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
	@Override
	public void setMFirstEntry(MEntry newMFirstEntry) {
		MEntry oldMFirstEntry = mFirstEntry;
		mFirstEntry = newMFirstEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_SIGNATURE__MFIRST_ENTRY, oldMFirstEntry, mFirstEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MEntry> getMEntrys() {
		if (mEntrys == null) {
			mEntrys = new EObjectContainmentEList<MEntry>(MEntry.class, this, ModiscoPackage.MMETHOD_SIGNATURE__MENTRYS);
		}
		return mEntrys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (Type)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MMETHOD_SIGNATURE__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType(Type newReturnType) {
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_SIGNATURE__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModiscoPackage.MMETHOD_SIGNATURE__MENTRYS:
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
			case ModiscoPackage.MMETHOD_SIGNATURE__MFIRST_ENTRY:
				if (resolve) return getMFirstEntry();
				return basicGetMFirstEntry();
			case ModiscoPackage.MMETHOD_SIGNATURE__MENTRYS:
				return getMEntrys();
			case ModiscoPackage.MMETHOD_SIGNATURE__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
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
			case ModiscoPackage.MMETHOD_SIGNATURE__MFIRST_ENTRY:
				setMFirstEntry((MEntry)newValue);
				return;
			case ModiscoPackage.MMETHOD_SIGNATURE__MENTRYS:
				getMEntrys().clear();
				getMEntrys().addAll((Collection<? extends MEntry>)newValue);
				return;
			case ModiscoPackage.MMETHOD_SIGNATURE__RETURN_TYPE:
				setReturnType((Type)newValue);
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
			case ModiscoPackage.MMETHOD_SIGNATURE__MFIRST_ENTRY:
				setMFirstEntry((MEntry)null);
				return;
			case ModiscoPackage.MMETHOD_SIGNATURE__MENTRYS:
				getMEntrys().clear();
				return;
			case ModiscoPackage.MMETHOD_SIGNATURE__RETURN_TYPE:
				setReturnType((Type)null);
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
			case ModiscoPackage.MMETHOD_SIGNATURE__MFIRST_ENTRY:
				return mFirstEntry != null;
			case ModiscoPackage.MMETHOD_SIGNATURE__MENTRYS:
				return mEntrys != null && !mEntrys.isEmpty();
			case ModiscoPackage.MMETHOD_SIGNATURE__RETURN_TYPE:
				return returnType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MParameterList.class) {
			switch (derivedFeatureID) {
				case ModiscoPackage.MMETHOD_SIGNATURE__MFIRST_ENTRY: return ModiscoPackage.MPARAMETER_LIST__MFIRST_ENTRY;
				case ModiscoPackage.MMETHOD_SIGNATURE__MENTRYS: return ModiscoPackage.MPARAMETER_LIST__MENTRYS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MParameterList.class) {
			switch (baseFeatureID) {
				case ModiscoPackage.MPARAMETER_LIST__MFIRST_ENTRY: return ModiscoPackage.MMETHOD_SIGNATURE__MFIRST_ENTRY;
				case ModiscoPackage.MPARAMETER_LIST__MENTRYS: return ModiscoPackage.MMETHOD_SIGNATURE__MENTRYS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MMethodSignatureImpl
