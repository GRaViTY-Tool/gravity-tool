/**
 */
package org.gravity.typegraph.basic.containers.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.typegraph.basic.TAbstractType;

import org.gravity.typegraph.basic.containers.ContainersPackage;
import org.gravity.typegraph.basic.containers.TTypeContainer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TType Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.impl.TTypeContainerImpl#getTAbstractTypes <em>TAbstract Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TTypeContainerImpl extends MinimalEObjectImpl.Container implements TTypeContainer {
	/**
	 * The cached value of the '{@link #getTAbstractTypes() <em>TAbstract Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAbstractTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TAbstractType> tAbstractTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTypeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.TTYPE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAbstractType> getTAbstractTypes() {
		if (tAbstractTypes == null) {
			tAbstractTypes = new EObjectResolvingEList<TAbstractType>(TAbstractType.class, this, ContainersPackage.TTYPE_CONTAINER__TABSTRACT_TYPES);
		}
		return tAbstractTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContainersPackage.TTYPE_CONTAINER__TABSTRACT_TYPES:
				return getTAbstractTypes();
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
			case ContainersPackage.TTYPE_CONTAINER__TABSTRACT_TYPES:
				getTAbstractTypes().clear();
				getTAbstractTypes().addAll((Collection<? extends TAbstractType>)newValue);
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
			case ContainersPackage.TTYPE_CONTAINER__TABSTRACT_TYPES:
				getTAbstractTypes().clear();
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
			case ContainersPackage.TTYPE_CONTAINER__TABSTRACT_TYPES:
				return tAbstractTypes != null && !tAbstractTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TTypeContainerImpl
