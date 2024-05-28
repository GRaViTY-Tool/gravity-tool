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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.java.Type;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MSingleVariableDeclaration;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MEntry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MEntryImpl#getMNext <em>MNext</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MEntryImpl#getMPrevious <em>MPrevious</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MEntryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MEntryImpl#getAllParameterInstances <em>All Parameter Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MEntryImpl extends MAbstractFlowElementImpl implements MEntry {
	/**
	 * The cached value of the '{@link #getMNext() <em>MNext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMNext()
	 * @generated
	 * @ordered
	 */
	protected MEntry mNext;

	/**
	 * The cached value of the '{@link #getMPrevious() <em>MPrevious</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPrevious()
	 * @generated
	 * @ordered
	 */
	protected MEntry mPrevious;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getAllParameterInstances() <em>All Parameter Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllParameterInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<MSingleVariableDeclaration> allParameterInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEntry getMNext() {
		if (mNext != null && mNext.eIsProxy()) {
			InternalEObject oldMNext = (InternalEObject)mNext;
			mNext = (MEntry)eResolveProxy(oldMNext);
			if (mNext != oldMNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MENTRY__MNEXT, oldMNext, mNext));
			}
		}
		return mNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntry basicGetMNext() {
		return mNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMNext(MEntry newMNext, NotificationChain msgs) {
		MEntry oldMNext = mNext;
		mNext = newMNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MENTRY__MNEXT, oldMNext, newMNext);
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
	public void setMNext(MEntry newMNext) {
		if (newMNext != mNext) {
			NotificationChain msgs = null;
			if (mNext != null)
				msgs = ((InternalEObject)mNext).eInverseRemove(this, ModiscoPackage.MENTRY__MPREVIOUS, MEntry.class, msgs);
			if (newMNext != null)
				msgs = ((InternalEObject)newMNext).eInverseAdd(this, ModiscoPackage.MENTRY__MPREVIOUS, MEntry.class, msgs);
			msgs = basicSetMNext(newMNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MENTRY__MNEXT, newMNext, newMNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEntry getMPrevious() {
		if (mPrevious != null && mPrevious.eIsProxy()) {
			InternalEObject oldMPrevious = (InternalEObject)mPrevious;
			mPrevious = (MEntry)eResolveProxy(oldMPrevious);
			if (mPrevious != oldMPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MENTRY__MPREVIOUS, oldMPrevious, mPrevious));
			}
		}
		return mPrevious;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntry basicGetMPrevious() {
		return mPrevious;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPrevious(MEntry newMPrevious, NotificationChain msgs) {
		MEntry oldMPrevious = mPrevious;
		mPrevious = newMPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MENTRY__MPREVIOUS, oldMPrevious, newMPrevious);
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
	public void setMPrevious(MEntry newMPrevious) {
		if (newMPrevious != mPrevious) {
			NotificationChain msgs = null;
			if (mPrevious != null)
				msgs = ((InternalEObject)mPrevious).eInverseRemove(this, ModiscoPackage.MENTRY__MNEXT, MEntry.class, msgs);
			if (newMPrevious != null)
				msgs = ((InternalEObject)newMPrevious).eInverseAdd(this, ModiscoPackage.MENTRY__MNEXT, MEntry.class, msgs);
			msgs = basicSetMPrevious(newMPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MENTRY__MPREVIOUS, newMPrevious, newMPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MENTRY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MENTRY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MSingleVariableDeclaration> getAllParameterInstances() {
		if (allParameterInstances == null) {
			allParameterInstances = new EObjectWithInverseResolvingEList<MSingleVariableDeclaration>(MSingleVariableDeclaration.class, this, ModiscoPackage.MENTRY__ALL_PARAMETER_INSTANCES, ModiscoPackage.MSINGLE_VARIABLE_DECLARATION__MENTRY);
		}
		return allParameterInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModiscoPackage.MENTRY__MNEXT:
				if (mNext != null)
					msgs = ((InternalEObject)mNext).eInverseRemove(this, ModiscoPackage.MENTRY__MPREVIOUS, MEntry.class, msgs);
				return basicSetMNext((MEntry)otherEnd, msgs);
			case ModiscoPackage.MENTRY__MPREVIOUS:
				if (mPrevious != null)
					msgs = ((InternalEObject)mPrevious).eInverseRemove(this, ModiscoPackage.MENTRY__MNEXT, MEntry.class, msgs);
				return basicSetMPrevious((MEntry)otherEnd, msgs);
			case ModiscoPackage.MENTRY__ALL_PARAMETER_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllParameterInstances()).basicAdd(otherEnd, msgs);
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
			case ModiscoPackage.MENTRY__MNEXT:
				return basicSetMNext(null, msgs);
			case ModiscoPackage.MENTRY__MPREVIOUS:
				return basicSetMPrevious(null, msgs);
			case ModiscoPackage.MENTRY__ALL_PARAMETER_INSTANCES:
				return ((InternalEList<?>)getAllParameterInstances()).basicRemove(otherEnd, msgs);
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
			case ModiscoPackage.MENTRY__MNEXT:
				if (resolve) return getMNext();
				return basicGetMNext();
			case ModiscoPackage.MENTRY__MPREVIOUS:
				if (resolve) return getMPrevious();
				return basicGetMPrevious();
			case ModiscoPackage.MENTRY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ModiscoPackage.MENTRY__ALL_PARAMETER_INSTANCES:
				return getAllParameterInstances();
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
			case ModiscoPackage.MENTRY__MNEXT:
				setMNext((MEntry)newValue);
				return;
			case ModiscoPackage.MENTRY__MPREVIOUS:
				setMPrevious((MEntry)newValue);
				return;
			case ModiscoPackage.MENTRY__TYPE:
				setType((Type)newValue);
				return;
			case ModiscoPackage.MENTRY__ALL_PARAMETER_INSTANCES:
				getAllParameterInstances().clear();
				getAllParameterInstances().addAll((Collection<? extends MSingleVariableDeclaration>)newValue);
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
			case ModiscoPackage.MENTRY__MNEXT:
				setMNext((MEntry)null);
				return;
			case ModiscoPackage.MENTRY__MPREVIOUS:
				setMPrevious((MEntry)null);
				return;
			case ModiscoPackage.MENTRY__TYPE:
				setType((Type)null);
				return;
			case ModiscoPackage.MENTRY__ALL_PARAMETER_INSTANCES:
				getAllParameterInstances().clear();
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
			case ModiscoPackage.MENTRY__MNEXT:
				return mNext != null;
			case ModiscoPackage.MENTRY__MPREVIOUS:
				return mPrevious != null;
			case ModiscoPackage.MENTRY__TYPE:
				return type != null;
			case ModiscoPackage.MENTRY__ALL_PARAMETER_INSTANCES:
				return allParameterInstances != null && !allParameterInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MEntryImpl
