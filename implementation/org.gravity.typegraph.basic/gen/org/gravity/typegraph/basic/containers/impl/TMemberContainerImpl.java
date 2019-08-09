/**
 */
package org.gravity.typegraph.basic.containers.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.typegraph.basic.TMember;

import org.gravity.typegraph.basic.containers.ContainersPackage;
import org.gravity.typegraph.basic.containers.TMemberContainer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMember Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.impl.TMemberContainerImpl#getTMembers <em>TMembers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMemberContainerImpl extends MinimalEObjectImpl.Container implements TMemberContainer {
	/**
	 * The cached value of the '{@link #getTMembers() <em>TMembers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<TMember> tMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMemberContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.TMEMBER_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMember> getTMembers() {
		if (tMembers == null) {
			tMembers = new EObjectResolvingEList<TMember>(TMember.class, this, ContainersPackage.TMEMBER_CONTAINER__TMEMBERS);
		}
		return tMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContainersPackage.TMEMBER_CONTAINER__TMEMBERS:
				return getTMembers();
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
			case ContainersPackage.TMEMBER_CONTAINER__TMEMBERS:
				getTMembers().clear();
				getTMembers().addAll((Collection<? extends TMember>)newValue);
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
			case ContainersPackage.TMEMBER_CONTAINER__TMEMBERS:
				getTMembers().clear();
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
			case ContainersPackage.TMEMBER_CONTAINER__TMEMBERS:
				return tMembers != null && !tMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TMemberContainerImpl
