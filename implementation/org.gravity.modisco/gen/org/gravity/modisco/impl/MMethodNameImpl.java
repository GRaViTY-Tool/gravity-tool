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

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMethod Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MMethodNameImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodNameImpl#getMMethodDefinitions <em>MMethod Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodNameImpl#getMMethodSignatures <em>MMethod Signatures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMethodNameImpl extends MNameImpl implements MMethodName {
	/**
	 * The cached value of the '{@link #getMMethodDefinitions() <em>MMethod Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMethodDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MAbstractMethodDefinition> mMethodDefinitions;

	/**
	 * The cached value of the '{@link #getMMethodSignatures() <em>MMethod Signatures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMethodSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MMethodSignature> mMethodSignatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMethodNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MMETHOD_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGravityModel getModel() {
		if (eContainerFeatureID() != ModiscoPackage.MMETHOD_NAME__MODEL) return null;
		return (MGravityModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(MGravityModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, ModiscoPackage.MMETHOD_NAME__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(MGravityModel newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != ModiscoPackage.MMETHOD_NAME__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES, MGravityModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_NAME__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MAbstractMethodDefinition> getMMethodDefinitions() {
		if (mMethodDefinitions == null) {
			mMethodDefinitions = new EObjectWithInverseResolvingEList<MAbstractMethodDefinition>(MAbstractMethodDefinition.class, this, ModiscoPackage.MMETHOD_NAME__MMETHOD_DEFINITIONS, ModiscoPackage.MABSTRACT_METHOD_DEFINITION__MMETHOD_NAME);
		}
		return mMethodDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MMethodSignature> getMMethodSignatures() {
		if (mMethodSignatures == null) {
			mMethodSignatures = new EObjectWithInverseResolvingEList<MMethodSignature>(MMethodSignature.class, this, ModiscoPackage.MMETHOD_NAME__MMETHOD_SIGNATURES, ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_NAME);
		}
		return mMethodSignatures;
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
			case ModiscoPackage.MMETHOD_NAME__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((MGravityModel)otherEnd, msgs);
			case ModiscoPackage.MMETHOD_NAME__MMETHOD_DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMMethodDefinitions()).basicAdd(otherEnd, msgs);
			case ModiscoPackage.MMETHOD_NAME__MMETHOD_SIGNATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMMethodSignatures()).basicAdd(otherEnd, msgs);
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
			case ModiscoPackage.MMETHOD_NAME__MODEL:
				return basicSetModel(null, msgs);
			case ModiscoPackage.MMETHOD_NAME__MMETHOD_DEFINITIONS:
				return ((InternalEList<?>)getMMethodDefinitions()).basicRemove(otherEnd, msgs);
			case ModiscoPackage.MMETHOD_NAME__MMETHOD_SIGNATURES:
				return ((InternalEList<?>)getMMethodSignatures()).basicRemove(otherEnd, msgs);
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
			case ModiscoPackage.MMETHOD_NAME__MODEL:
				return eInternalContainer().eInverseRemove(this, ModiscoPackage.MGRAVITY_MODEL__MMETHOD_NAMES, MGravityModel.class, msgs);
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
			case ModiscoPackage.MMETHOD_NAME__MODEL:
				return getModel();
			case ModiscoPackage.MMETHOD_NAME__MMETHOD_DEFINITIONS:
				return getMMethodDefinitions();
			case ModiscoPackage.MMETHOD_NAME__MMETHOD_SIGNATURES:
				return getMMethodSignatures();
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
			case ModiscoPackage.MMETHOD_NAME__MODEL:
				setModel((MGravityModel)newValue);
				return;
			case ModiscoPackage.MMETHOD_NAME__MMETHOD_DEFINITIONS:
				getMMethodDefinitions().clear();
				getMMethodDefinitions().addAll((Collection<? extends MAbstractMethodDefinition>)newValue);
				return;
			case ModiscoPackage.MMETHOD_NAME__MMETHOD_SIGNATURES:
				getMMethodSignatures().clear();
				getMMethodSignatures().addAll((Collection<? extends MMethodSignature>)newValue);
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
			case ModiscoPackage.MMETHOD_NAME__MODEL:
				setModel((MGravityModel)null);
				return;
			case ModiscoPackage.MMETHOD_NAME__MMETHOD_DEFINITIONS:
				getMMethodDefinitions().clear();
				return;
			case ModiscoPackage.MMETHOD_NAME__MMETHOD_SIGNATURES:
				getMMethodSignatures().clear();
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
			case ModiscoPackage.MMETHOD_NAME__MODEL:
				return getModel() != null;
			case ModiscoPackage.MMETHOD_NAME__MMETHOD_DEFINITIONS:
				return mMethodDefinitions != null && !mMethodDefinitions.isEmpty();
			case ModiscoPackage.MMETHOD_NAME__MMETHOD_SIGNATURES:
				return mMethodSignatures != null && !mMethodSignatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MMethodNameImpl
