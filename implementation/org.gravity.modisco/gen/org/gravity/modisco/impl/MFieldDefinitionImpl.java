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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;

import org.eclipse.gmt.modisco.java.emf.JavaPackage;

import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MField Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MFieldDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MFieldDefinitionImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MFieldDefinitionImpl#getMFieldSignature <em>MField Signature</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MFieldDefinitionImpl#getMFieldName <em>MField Name</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MFieldDefinitionImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFieldDefinitionImpl extends MDefinitionImpl implements MFieldDefinition {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeAccess type;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclarationFragment> fragments;

	/**
	 * The cached value of the '{@link #getMFieldSignature() <em>MField Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFieldSignature()
	 * @generated
	 * @ordered
	 */
	protected MFieldSignature mFieldSignature;

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
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected MGravityModel model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFieldDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MFIELD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeAccess newType, NotificationChain msgs) {
		TypeAccess oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeAccess newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModiscoPackage.MFIELD_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModiscoPackage.MFIELD_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclarationFragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentWithInverseEList<VariableDeclarationFragment>(VariableDeclarationFragment.class, this, ModiscoPackage.MFIELD_DEFINITION__FRAGMENTS, JavaPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldSignature getMFieldSignature() {
		if (mFieldSignature != null && mFieldSignature.eIsProxy()) {
			InternalEObject oldMFieldSignature = (InternalEObject)mFieldSignature;
			mFieldSignature = (MFieldSignature)eResolveProxy(oldMFieldSignature);
			if (mFieldSignature != oldMFieldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MFIELD_DEFINITION__MFIELD_SIGNATURE, oldMFieldSignature, mFieldSignature));
			}
		}
		return mFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldSignature basicGetMFieldSignature() {
		return mFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFieldSignature(MFieldSignature newMFieldSignature, NotificationChain msgs) {
		MFieldSignature oldMFieldSignature = mFieldSignature;
		mFieldSignature = newMFieldSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_DEFINITION__MFIELD_SIGNATURE, oldMFieldSignature, newMFieldSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFieldSignature(MFieldSignature newMFieldSignature) {
		if (newMFieldSignature != mFieldSignature) {
			NotificationChain msgs = null;
			if (mFieldSignature != null)
				msgs = ((InternalEObject)mFieldSignature).eInverseRemove(this, ModiscoPackage.MFIELD_SIGNATURE__MFIELD_DEFINITIONS, MFieldSignature.class, msgs);
			if (newMFieldSignature != null)
				msgs = ((InternalEObject)newMFieldSignature).eInverseAdd(this, ModiscoPackage.MFIELD_SIGNATURE__MFIELD_DEFINITIONS, MFieldSignature.class, msgs);
			msgs = basicSetMFieldSignature(newMFieldSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_DEFINITION__MFIELD_SIGNATURE, newMFieldSignature, newMFieldSignature));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MFIELD_DEFINITION__MFIELD_NAME, oldMFieldName, mFieldName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_DEFINITION__MFIELD_NAME, oldMFieldName, newMFieldName);
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
				msgs = ((InternalEObject)mFieldName).eInverseRemove(this, ModiscoPackage.MFIELD_NAME__MFIELD_DEFINITIONS, MFieldName.class, msgs);
			if (newMFieldName != null)
				msgs = ((InternalEObject)newMFieldName).eInverseAdd(this, ModiscoPackage.MFIELD_NAME__MFIELD_DEFINITIONS, MFieldName.class, msgs);
			msgs = basicSetMFieldName(newMFieldName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_DEFINITION__MFIELD_NAME, newMFieldName, newMFieldName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MFIELD_DEFINITION__MODEL, oldModel, model));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_DEFINITION__MODEL, oldModel, newModel);
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
				msgs = ((InternalEObject)model).eInverseRemove(this, ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS, MGravityModel.class, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS, MGravityModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_DEFINITION__MODEL, newModel, newModel));
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
			case ModiscoPackage.MFIELD_DEFINITION__FRAGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFragments()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MFIELD_DEFINITION__MFIELD_SIGNATURE:
				if (mFieldSignature != null)
					msgs = ((InternalEObject)mFieldSignature).eInverseRemove(this, ModiscoPackage.MFIELD_SIGNATURE__MFIELD_DEFINITIONS, MFieldSignature.class, msgs);
				return basicSetMFieldSignature((MFieldSignature)otherEnd, msgs);
			case ModiscoPackage.MFIELD_DEFINITION__MFIELD_NAME:
				if (mFieldName != null)
					msgs = ((InternalEObject)mFieldName).eInverseRemove(this, ModiscoPackage.MFIELD_NAME__MFIELD_DEFINITIONS, MFieldName.class, msgs);
				return basicSetMFieldName((MFieldName)otherEnd, msgs);
			case ModiscoPackage.MFIELD_DEFINITION__MODEL:
				if (model != null)
					msgs = ((InternalEObject)model).eInverseRemove(this, ModiscoPackage.MGRAVITY_MODEL__MFIELD_DEFINITIONS, MGravityModel.class, msgs);
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
			case ModiscoPackage.MFIELD_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case ModiscoPackage.MFIELD_DEFINITION__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MFIELD_DEFINITION__MFIELD_SIGNATURE:
				return basicSetMFieldSignature(null, msgs);
			case ModiscoPackage.MFIELD_DEFINITION__MFIELD_NAME:
				return basicSetMFieldName(null, msgs);
			case ModiscoPackage.MFIELD_DEFINITION__MODEL:
				return basicSetModel(null, msgs);
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
			case ModiscoPackage.MFIELD_DEFINITION__TYPE:
				return getType();
			case ModiscoPackage.MFIELD_DEFINITION__FRAGMENTS:
				return getFragments();
			case ModiscoPackage.MFIELD_DEFINITION__MFIELD_SIGNATURE:
				if (resolve) return getMFieldSignature();
				return basicGetMFieldSignature();
			case ModiscoPackage.MFIELD_DEFINITION__MFIELD_NAME:
				if (resolve) return getMFieldName();
				return basicGetMFieldName();
			case ModiscoPackage.MFIELD_DEFINITION__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
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
			case ModiscoPackage.MFIELD_DEFINITION__TYPE:
				setType((TypeAccess)newValue);
				return;
			case ModiscoPackage.MFIELD_DEFINITION__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends VariableDeclarationFragment>)newValue);
				return;
			case ModiscoPackage.MFIELD_DEFINITION__MFIELD_SIGNATURE:
				setMFieldSignature((MFieldSignature)newValue);
				return;
			case ModiscoPackage.MFIELD_DEFINITION__MFIELD_NAME:
				setMFieldName((MFieldName)newValue);
				return;
			case ModiscoPackage.MFIELD_DEFINITION__MODEL:
				setModel((MGravityModel)newValue);
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
			case ModiscoPackage.MFIELD_DEFINITION__TYPE:
				setType((TypeAccess)null);
				return;
			case ModiscoPackage.MFIELD_DEFINITION__FRAGMENTS:
				getFragments().clear();
				return;
			case ModiscoPackage.MFIELD_DEFINITION__MFIELD_SIGNATURE:
				setMFieldSignature((MFieldSignature)null);
				return;
			case ModiscoPackage.MFIELD_DEFINITION__MFIELD_NAME:
				setMFieldName((MFieldName)null);
				return;
			case ModiscoPackage.MFIELD_DEFINITION__MODEL:
				setModel((MGravityModel)null);
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
			case ModiscoPackage.MFIELD_DEFINITION__TYPE:
				return type != null;
			case ModiscoPackage.MFIELD_DEFINITION__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case ModiscoPackage.MFIELD_DEFINITION__MFIELD_SIGNATURE:
				return mFieldSignature != null;
			case ModiscoPackage.MFIELD_DEFINITION__MFIELD_NAME:
				return mFieldName != null;
			case ModiscoPackage.MFIELD_DEFINITION__MODEL:
				return model != null;
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
		if (baseClass == AbstractVariablesContainer.class) {
			switch (derivedFeatureID) {
				case ModiscoPackage.MFIELD_DEFINITION__TYPE: return JavaPackage.ABSTRACT_VARIABLES_CONTAINER__TYPE;
				case ModiscoPackage.MFIELD_DEFINITION__FRAGMENTS: return JavaPackage.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS;
				default: return -1;
			}
		}
		if (baseClass == FieldDeclaration.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == AbstractVariablesContainer.class) {
			switch (baseFeatureID) {
				case JavaPackage.ABSTRACT_VARIABLES_CONTAINER__TYPE: return ModiscoPackage.MFIELD_DEFINITION__TYPE;
				case JavaPackage.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS: return ModiscoPackage.MFIELD_DEFINITION__FRAGMENTS;
				default: return -1;
			}
		}
		if (baseClass == FieldDeclaration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MFieldDefinitionImpl
