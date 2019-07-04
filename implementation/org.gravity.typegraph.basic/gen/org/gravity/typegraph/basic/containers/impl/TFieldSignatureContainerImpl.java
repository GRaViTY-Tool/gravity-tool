/**
 */
package org.gravity.typegraph.basic.containers.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.typegraph.basic.TFieldSignature;

import org.gravity.typegraph.basic.containers.ContainersPackage;
import org.gravity.typegraph.basic.containers.TFieldSignatureContainer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TField Signature Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.impl.TFieldSignatureContainerImpl#getTFieldSignatures <em>TField Signatures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFieldSignatureContainerImpl extends MinimalEObjectImpl.Container implements TFieldSignatureContainer {
	/**
	 * The cached value of the '{@link #getTFieldSignatures() <em>TField Signatures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTFieldSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<TFieldSignature> tFieldSignatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFieldSignatureContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.TFIELD_SIGNATURE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFieldSignature> getTFieldSignatures() {
		if (tFieldSignatures == null) {
			tFieldSignatures = new EObjectResolvingEList<TFieldSignature>(TFieldSignature.class, this, ContainersPackage.TFIELD_SIGNATURE_CONTAINER__TFIELD_SIGNATURES);
		}
		return tFieldSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContainersPackage.TFIELD_SIGNATURE_CONTAINER__TFIELD_SIGNATURES:
				return getTFieldSignatures();
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
			case ContainersPackage.TFIELD_SIGNATURE_CONTAINER__TFIELD_SIGNATURES:
				getTFieldSignatures().clear();
				getTFieldSignatures().addAll((Collection<? extends TFieldSignature>)newValue);
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
			case ContainersPackage.TFIELD_SIGNATURE_CONTAINER__TFIELD_SIGNATURES:
				getTFieldSignatures().clear();
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
			case ContainersPackage.TFIELD_SIGNATURE_CONTAINER__TFIELD_SIGNATURES:
				return tFieldSignatures != null && !tFieldSignatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TFieldSignatureContainerImpl
