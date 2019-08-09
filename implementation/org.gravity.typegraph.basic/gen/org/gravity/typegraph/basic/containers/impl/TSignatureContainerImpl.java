/**
 */
package org.gravity.typegraph.basic.containers.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.typegraph.basic.TSignature;

import org.gravity.typegraph.basic.containers.ContainersPackage;
import org.gravity.typegraph.basic.containers.TSignatureContainer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSignature Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.impl.TSignatureContainerImpl#getTSignatures <em>TSignatures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSignatureContainerImpl extends MinimalEObjectImpl.Container implements TSignatureContainer {
	/**
	 * The cached value of the '{@link #getTSignatures() <em>TSignatures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<TSignature> tSignatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSignatureContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.TSIGNATURE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSignature> getTSignatures() {
		if (tSignatures == null) {
			tSignatures = new EObjectResolvingEList<TSignature>(TSignature.class, this, ContainersPackage.TSIGNATURE_CONTAINER__TSIGNATURES);
		}
		return tSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContainersPackage.TSIGNATURE_CONTAINER__TSIGNATURES:
				return getTSignatures();
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
			case ContainersPackage.TSIGNATURE_CONTAINER__TSIGNATURES:
				getTSignatures().clear();
				getTSignatures().addAll((Collection<? extends TSignature>)newValue);
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
			case ContainersPackage.TSIGNATURE_CONTAINER__TSIGNATURES:
				getTSignatures().clear();
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
			case ContainersPackage.TSIGNATURE_CONTAINER__TSIGNATURES:
				return tSignatures != null && !tSignatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TSignatureContainerImpl
