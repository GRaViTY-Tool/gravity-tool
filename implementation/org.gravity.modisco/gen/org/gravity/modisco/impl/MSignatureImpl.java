/**
 */
package org.gravity.modisco.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSignature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MSignatureImpl#getMDefinitions <em>MDefinitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MSignatureImpl extends MAbstractFlowElementImpl implements MSignature {
	/**
	 * The cached value of the '{@link #getMDefinitions() <em>MDefinitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MDefinition> mDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MSIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MDefinition> getMDefinitions() {
		if (mDefinitions == null) {
			mDefinitions = new EObjectWithInverseResolvingEList<MDefinition>(MDefinition.class, this, ModiscoPackage.MSIGNATURE__MDEFINITIONS, ModiscoPackage.MDEFINITION__MSIGNATURE);
		}
		return mDefinitions;
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
			case ModiscoPackage.MSIGNATURE__MDEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMDefinitions()).basicAdd(otherEnd, msgs);
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
			case ModiscoPackage.MSIGNATURE__MDEFINITIONS:
				return ((InternalEList<?>)getMDefinitions()).basicRemove(otherEnd, msgs);
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
			case ModiscoPackage.MSIGNATURE__MDEFINITIONS:
				return getMDefinitions();
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
			case ModiscoPackage.MSIGNATURE__MDEFINITIONS:
				getMDefinitions().clear();
				getMDefinitions().addAll((Collection<? extends MDefinition>)newValue);
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
			case ModiscoPackage.MSIGNATURE__MDEFINITIONS:
				getMDefinitions().clear();
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
			case ModiscoPackage.MSIGNATURE__MDEFINITIONS:
				return mDefinitions != null && !mDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MSignatureImpl
