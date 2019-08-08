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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmt.modisco.java.Type;

import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodName;
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
 *   <li>{@link org.gravity.modisco.impl.MMethodSignatureImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodSignatureImpl#getMMethodName <em>MMethod Name</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodSignatureImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodSignatureImpl#getMMethodDefinitions <em>MMethod Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodSignatureImpl#getMParameterList <em>MParameter List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMethodSignatureImpl extends MSignatureImpl implements MMethodSignature {
	/**
	 * The cached value of the '{@link #getMMethodName() <em>MMethod Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMethodName()
	 * @generated
	 * @ordered
	 */
	protected MMethodName mMethodName;

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
	 * The cached value of the '{@link #getMMethodDefinitions() <em>MMethod Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMethodDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MMethodDefinition> mMethodDefinitions;

	/**
	 * The cached value of the '{@link #getMParameterList() <em>MParameter List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMParameterList()
	 * @generated
	 * @ordered
	 */
	protected MParameterList mParameterList;

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
	public MGravityModel getModel() {
		if (eContainerFeatureID() != ModiscoPackage.MMETHOD_SIGNATURE__MODEL) return null;
		return (MGravityModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(MGravityModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, ModiscoPackage.MMETHOD_SIGNATURE__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(MGravityModel newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != ModiscoPackage.MMETHOD_SIGNATURE__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, ModiscoPackage.MGRAVITY_MODEL__MMETHOD_SIGNATURES, MGravityModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_SIGNATURE__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodName getMMethodName() {
		if (mMethodName != null && mMethodName.eIsProxy()) {
			InternalEObject oldMMethodName = (InternalEObject)mMethodName;
			mMethodName = (MMethodName)eResolveProxy(oldMMethodName);
			if (mMethodName != oldMMethodName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_NAME, oldMMethodName, mMethodName));
			}
		}
		return mMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodName basicGetMMethodName() {
		return mMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMethodName(MMethodName newMMethodName, NotificationChain msgs) {
		MMethodName oldMMethodName = mMethodName;
		mMethodName = newMMethodName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_NAME, oldMMethodName, newMMethodName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMMethodName(MMethodName newMMethodName) {
		if (newMMethodName != mMethodName) {
			NotificationChain msgs = null;
			if (mMethodName != null)
				msgs = ((InternalEObject)mMethodName).eInverseRemove(this, ModiscoPackage.MMETHOD_NAME__MMETHOD_SIGNATURES, MMethodName.class, msgs);
			if (newMMethodName != null)
				msgs = ((InternalEObject)newMMethodName).eInverseAdd(this, ModiscoPackage.MMETHOD_NAME__MMETHOD_SIGNATURES, MMethodName.class, msgs);
			msgs = basicSetMMethodName(newMMethodName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_NAME, newMMethodName, newMMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public EList<MMethodDefinition> getMMethodDefinitions() {
		if (mMethodDefinitions == null) {
			mMethodDefinitions = new EObjectWithInverseResolvingEList<MMethodDefinition>(MMethodDefinition.class, this, ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS, ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_SIGNATURE);
		}
		return mMethodDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MParameterList getMParameterList() {
		return mParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMParameterList(MParameterList newMParameterList, NotificationChain msgs) {
		MParameterList oldMParameterList = mParameterList;
		mParameterList = newMParameterList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_SIGNATURE__MPARAMETER_LIST, oldMParameterList, newMParameterList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMParameterList(MParameterList newMParameterList) {
		if (newMParameterList != mParameterList) {
			NotificationChain msgs = null;
			if (mParameterList != null)
				msgs = ((InternalEObject)mParameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModiscoPackage.MMETHOD_SIGNATURE__MPARAMETER_LIST, null, msgs);
			if (newMParameterList != null)
				msgs = ((InternalEObject)newMParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModiscoPackage.MMETHOD_SIGNATURE__MPARAMETER_LIST, null, msgs);
			msgs = basicSetMParameterList(newMParameterList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_SIGNATURE__MPARAMETER_LIST, newMParameterList, newMParameterList));
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
			case ModiscoPackage.MMETHOD_SIGNATURE__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((MGravityModel)otherEnd, msgs);
			case ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_NAME:
				if (mMethodName != null)
					msgs = ((InternalEObject)mMethodName).eInverseRemove(this, ModiscoPackage.MMETHOD_NAME__MMETHOD_SIGNATURES, MMethodName.class, msgs);
				return basicSetMMethodName((MMethodName)otherEnd, msgs);
			case ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMMethodDefinitions()).basicAdd(otherEnd, msgs);
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
			case ModiscoPackage.MMETHOD_SIGNATURE__MODEL:
				return basicSetModel(null, msgs);
			case ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_NAME:
				return basicSetMMethodName(null, msgs);
			case ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS:
				return ((InternalEList<?>)getMMethodDefinitions()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MMETHOD_SIGNATURE__MPARAMETER_LIST:
				return basicSetMParameterList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModiscoPackage.MMETHOD_SIGNATURE__MODEL:
				return eInternalContainer().eInverseRemove(this, ModiscoPackage.MGRAVITY_MODEL__MMETHOD_SIGNATURES, MGravityModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModiscoPackage.MMETHOD_SIGNATURE__MODEL:
				return getModel();
			case ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_NAME:
				if (resolve) return getMMethodName();
				return basicGetMMethodName();
			case ModiscoPackage.MMETHOD_SIGNATURE__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS:
				return getMMethodDefinitions();
			case ModiscoPackage.MMETHOD_SIGNATURE__MPARAMETER_LIST:
				return getMParameterList();
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
			case ModiscoPackage.MMETHOD_SIGNATURE__MODEL:
				setModel((MGravityModel)newValue);
				return;
			case ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_NAME:
				setMMethodName((MMethodName)newValue);
				return;
			case ModiscoPackage.MMETHOD_SIGNATURE__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS:
				getMMethodDefinitions().clear();
				getMMethodDefinitions().addAll((Collection<? extends MMethodDefinition>)newValue);
				return;
			case ModiscoPackage.MMETHOD_SIGNATURE__MPARAMETER_LIST:
				setMParameterList((MParameterList)newValue);
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
			case ModiscoPackage.MMETHOD_SIGNATURE__MODEL:
				setModel((MGravityModel)null);
				return;
			case ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_NAME:
				setMMethodName((MMethodName)null);
				return;
			case ModiscoPackage.MMETHOD_SIGNATURE__RETURN_TYPE:
				setReturnType((Type)null);
				return;
			case ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS:
				getMMethodDefinitions().clear();
				return;
			case ModiscoPackage.MMETHOD_SIGNATURE__MPARAMETER_LIST:
				setMParameterList((MParameterList)null);
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
			case ModiscoPackage.MMETHOD_SIGNATURE__MODEL:
				return getModel() != null;
			case ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_NAME:
				return mMethodName != null;
			case ModiscoPackage.MMETHOD_SIGNATURE__RETURN_TYPE:
				return returnType != null;
			case ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS:
				return mMethodDefinitions != null && !mMethodDefinitions.isEmpty();
			case ModiscoPackage.MMETHOD_SIGNATURE__MPARAMETER_LIST:
				return mParameterList != null;
		}
		return super.eIsSet(featureID);
	}

} //MMethodSignatureImpl
