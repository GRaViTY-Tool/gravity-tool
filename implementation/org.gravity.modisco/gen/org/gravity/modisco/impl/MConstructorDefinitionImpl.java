/**
 */
package org.gravity.modisco.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MParameterList;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MConstructor Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MConstructorDefinitionImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MConstructorDefinitionImpl#getMParameterList <em>MParameter List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MConstructorDefinitionImpl extends MAbstractMethodDefinitionImpl implements MConstructorDefinition {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected MGravityModel model;

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
	protected MConstructorDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MCONSTRUCTOR_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGravityModel getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (MGravityModel)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGravityModel basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(MGravityModel newModel, NotificationChain msgs) {
		MGravityModel oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(MGravityModel newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS, MGravityModel.class, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS, MGravityModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL, newModel, newModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MPARAMETER_LIST, oldMParameterList, newMParameterList);
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
				msgs = ((InternalEObject)mParameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModiscoPackage.MCONSTRUCTOR_DEFINITION__MPARAMETER_LIST, null, msgs);
			if (newMParameterList != null)
				msgs = ((InternalEObject)newMParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModiscoPackage.MCONSTRUCTOR_DEFINITION__MPARAMETER_LIST, null, msgs);
			msgs = basicSetMParameterList(newMParameterList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MPARAMETER_LIST, newMParameterList, newMParameterList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				if (model != null)
					msgs = ((InternalEObject)model).eInverseRemove(this, ModiscoPackage.MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS, MGravityModel.class, msgs);
				return basicSetModel((MGravityModel)otherEnd, msgs);
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				return basicSetModel(null, msgs);
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MPARAMETER_LIST:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MPARAMETER_LIST:
				return getMParameterList();
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				setModel((MGravityModel)newValue);
				return;
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MPARAMETER_LIST:
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				setModel((MGravityModel)null);
				return;
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MPARAMETER_LIST:
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				return model != null;
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MPARAMETER_LIST:
				return mParameterList != null;
		}
		return super.eIsSet(featureID);
	}

} //MConstructorDefinitionImpl
