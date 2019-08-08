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

import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MField Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MFieldSignatureImpl#getMFieldName <em>MField Name</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MFieldSignatureImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MFieldSignatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MFieldSignatureImpl#getMFieldDefinitions <em>MField Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFieldSignatureImpl extends MSignatureImpl implements MFieldSignature {
	/**
	 * The cached value of the '{@link #getMFieldName() <em>MField Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFieldName()
	 * @generated
	 * @ordered
	 */
	protected MFieldName mFieldName;

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
	 * The cached value of the '{@link #getMFieldDefinitions() <em>MField Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFieldDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MFieldDefinition> mFieldDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFieldSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MFIELD_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldName getMFieldName() {
		if (mFieldName != null && mFieldName.eIsProxy()) {
			InternalEObject oldMFieldName = (InternalEObject)mFieldName;
			mFieldName = (MFieldName)eResolveProxy(oldMFieldName);
			if (mFieldName != oldMFieldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MFIELD_SIGNATURE__MFIELD_NAME, oldMFieldName, mFieldName));
			}
		}
		return mFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldName basicGetMFieldName() {
		return mFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFieldName(MFieldName newMFieldName, NotificationChain msgs) {
		MFieldName oldMFieldName = mFieldName;
		mFieldName = newMFieldName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_SIGNATURE__MFIELD_NAME, oldMFieldName, newMFieldName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFieldName(MFieldName newMFieldName) {
		if (newMFieldName != mFieldName) {
			NotificationChain msgs = null;
			if (mFieldName != null)
				msgs = ((InternalEObject)mFieldName).eInverseRemove(this, ModiscoPackage.MFIELD_NAME__MFIELD_SIGNATURES, MFieldName.class, msgs);
			if (newMFieldName != null)
				msgs = ((InternalEObject)newMFieldName).eInverseAdd(this, ModiscoPackage.MFIELD_NAME__MFIELD_SIGNATURES, MFieldName.class, msgs);
			msgs = basicSetMFieldName(newMFieldName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_SIGNATURE__MFIELD_NAME, newMFieldName, newMFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGravityModel getModel() {
		if (eContainerFeatureID() != ModiscoPackage.MFIELD_SIGNATURE__MODEL) return null;
		return (MGravityModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(MGravityModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, ModiscoPackage.MFIELD_SIGNATURE__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(MGravityModel newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != ModiscoPackage.MFIELD_SIGNATURE__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, ModiscoPackage.MGRAVITY_MODEL__MFIELD_SIGNATURES, MGravityModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_SIGNATURE__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MFIELD_SIGNATURE__TYPE, oldType, type));
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
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_SIGNATURE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFieldDefinition> getMFieldDefinitions() {
		if (mFieldDefinitions == null) {
			mFieldDefinitions = new EObjectWithInverseResolvingEList<MFieldDefinition>(MFieldDefinition.class, this, ModiscoPackage.MFIELD_SIGNATURE__MFIELD_DEFINITIONS, ModiscoPackage.MFIELD_DEFINITION__MFIELD_SIGNATURE);
		}
		return mFieldDefinitions;
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
			case ModiscoPackage.MFIELD_SIGNATURE__MFIELD_NAME:
				if (mFieldName != null)
					msgs = ((InternalEObject)mFieldName).eInverseRemove(this, ModiscoPackage.MFIELD_NAME__MFIELD_SIGNATURES, MFieldName.class, msgs);
				return basicSetMFieldName((MFieldName)otherEnd, msgs);
			case ModiscoPackage.MFIELD_SIGNATURE__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((MGravityModel)otherEnd, msgs);
			case ModiscoPackage.MFIELD_SIGNATURE__MFIELD_DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMFieldDefinitions()).basicAdd(otherEnd, msgs);
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
			case ModiscoPackage.MFIELD_SIGNATURE__MFIELD_NAME:
				return basicSetMFieldName(null, msgs);
			case ModiscoPackage.MFIELD_SIGNATURE__MODEL:
				return basicSetModel(null, msgs);
			case ModiscoPackage.MFIELD_SIGNATURE__MFIELD_DEFINITIONS:
				return ((InternalEList<?>)getMFieldDefinitions()).basicRemove(otherEnd, msgs);
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
			case ModiscoPackage.MFIELD_SIGNATURE__MODEL:
				return eInternalContainer().eInverseRemove(this, ModiscoPackage.MGRAVITY_MODEL__MFIELD_SIGNATURES, MGravityModel.class, msgs);
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
			case ModiscoPackage.MFIELD_SIGNATURE__MFIELD_NAME:
				if (resolve) return getMFieldName();
				return basicGetMFieldName();
			case ModiscoPackage.MFIELD_SIGNATURE__MODEL:
				return getModel();
			case ModiscoPackage.MFIELD_SIGNATURE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ModiscoPackage.MFIELD_SIGNATURE__MFIELD_DEFINITIONS:
				return getMFieldDefinitions();
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
			case ModiscoPackage.MFIELD_SIGNATURE__MFIELD_NAME:
				setMFieldName((MFieldName)newValue);
				return;
			case ModiscoPackage.MFIELD_SIGNATURE__MODEL:
				setModel((MGravityModel)newValue);
				return;
			case ModiscoPackage.MFIELD_SIGNATURE__TYPE:
				setType((Type)newValue);
				return;
			case ModiscoPackage.MFIELD_SIGNATURE__MFIELD_DEFINITIONS:
				getMFieldDefinitions().clear();
				getMFieldDefinitions().addAll((Collection<? extends MFieldDefinition>)newValue);
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
			case ModiscoPackage.MFIELD_SIGNATURE__MFIELD_NAME:
				setMFieldName((MFieldName)null);
				return;
			case ModiscoPackage.MFIELD_SIGNATURE__MODEL:
				setModel((MGravityModel)null);
				return;
			case ModiscoPackage.MFIELD_SIGNATURE__TYPE:
				setType((Type)null);
				return;
			case ModiscoPackage.MFIELD_SIGNATURE__MFIELD_DEFINITIONS:
				getMFieldDefinitions().clear();
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
			case ModiscoPackage.MFIELD_SIGNATURE__MFIELD_NAME:
				return mFieldName != null;
			case ModiscoPackage.MFIELD_SIGNATURE__MODEL:
				return getModel() != null;
			case ModiscoPackage.MFIELD_SIGNATURE__TYPE:
				return type != null;
			case ModiscoPackage.MFIELD_SIGNATURE__MFIELD_DEFINITIONS:
				return mFieldDefinitions != null && !mFieldDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MFieldSignatureImpl
