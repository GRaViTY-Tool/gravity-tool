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

import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MField Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MFieldNameImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MFieldNameImpl#getMFieldSignatures <em>MField Signatures</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MFieldNameImpl#getMFieldDefinitions <em>MField Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFieldNameImpl extends MNameImpl implements MFieldName {
	/**
	 * The cached value of the '{@link #getMFieldSignatures() <em>MField Signatures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFieldSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MFieldSignature> mFieldSignatures;

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
	protected MFieldNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MFIELD_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGravityModel getModel() {
		if (eContainerFeatureID() != ModiscoPackage.MFIELD_NAME__MODEL) return null;
		return (MGravityModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(MGravityModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, ModiscoPackage.MFIELD_NAME__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(MGravityModel newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != ModiscoPackage.MFIELD_NAME__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, ModiscoPackage.MGRAVITY_MODEL__MFIELD_NAMES, MGravityModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MFIELD_NAME__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFieldSignature> getMFieldSignatures() {
		if (mFieldSignatures == null) {
			mFieldSignatures = new EObjectWithInverseResolvingEList<MFieldSignature>(MFieldSignature.class, this, ModiscoPackage.MFIELD_NAME__MFIELD_SIGNATURES, ModiscoPackage.MFIELD_SIGNATURE__MFIELD_NAME);
		}
		return mFieldSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFieldDefinition> getMFieldDefinitions() {
		if (mFieldDefinitions == null) {
			mFieldDefinitions = new EObjectWithInverseResolvingEList<MFieldDefinition>(MFieldDefinition.class, this, ModiscoPackage.MFIELD_NAME__MFIELD_DEFINITIONS, ModiscoPackage.MFIELD_DEFINITION__MFIELD_NAME);
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
			case ModiscoPackage.MFIELD_NAME__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((MGravityModel)otherEnd, msgs);
			case ModiscoPackage.MFIELD_NAME__MFIELD_SIGNATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMFieldSignatures()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MFIELD_NAME__MFIELD_DEFINITIONS:
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
			case ModiscoPackage.MFIELD_NAME__MODEL:
				return basicSetModel(null, msgs);
			case ModiscoPackage.MFIELD_NAME__MFIELD_SIGNATURES:
				return ((InternalEList<?>)getMFieldSignatures()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MFIELD_NAME__MFIELD_DEFINITIONS:
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
			case ModiscoPackage.MFIELD_NAME__MODEL:
				return eInternalContainer().eInverseRemove(this, ModiscoPackage.MGRAVITY_MODEL__MFIELD_NAMES, MGravityModel.class, msgs);
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
			case ModiscoPackage.MFIELD_NAME__MODEL:
				return getModel();
			case ModiscoPackage.MFIELD_NAME__MFIELD_SIGNATURES:
				return getMFieldSignatures();
			case ModiscoPackage.MFIELD_NAME__MFIELD_DEFINITIONS:
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
			case ModiscoPackage.MFIELD_NAME__MODEL:
				setModel((MGravityModel)newValue);
				return;
			case ModiscoPackage.MFIELD_NAME__MFIELD_SIGNATURES:
				getMFieldSignatures().clear();
				getMFieldSignatures().addAll((Collection<? extends MFieldSignature>)newValue);
				return;
			case ModiscoPackage.MFIELD_NAME__MFIELD_DEFINITIONS:
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
			case ModiscoPackage.MFIELD_NAME__MODEL:
				setModel((MGravityModel)null);
				return;
			case ModiscoPackage.MFIELD_NAME__MFIELD_SIGNATURES:
				getMFieldSignatures().clear();
				return;
			case ModiscoPackage.MFIELD_NAME__MFIELD_DEFINITIONS:
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
			case ModiscoPackage.MFIELD_NAME__MODEL:
				return getModel() != null;
			case ModiscoPackage.MFIELD_NAME__MFIELD_SIGNATURES:
				return mFieldSignatures != null && !mFieldSignatures.isEmpty();
			case ModiscoPackage.MFIELD_NAME__MFIELD_DEFINITIONS:
				return mFieldDefinitions != null && !mFieldDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MFieldNameImpl
