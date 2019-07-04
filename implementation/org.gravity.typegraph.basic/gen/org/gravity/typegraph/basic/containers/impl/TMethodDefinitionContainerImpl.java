/**
 */
package org.gravity.typegraph.basic.containers.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.typegraph.basic.TMethodDefinition;

import org.gravity.typegraph.basic.containers.ContainersPackage;
import org.gravity.typegraph.basic.containers.TMethodDefinitionContainer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMethod Definition Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.impl.TMethodDefinitionContainerImpl#getTMethodDefinitions <em>TMethod Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMethodDefinitionContainerImpl extends MinimalEObjectImpl.Container implements TMethodDefinitionContainer {
	/**
	 * The cached value of the '{@link #getTMethodDefinitions() <em>TMethod Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMethodDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> tMethodDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMethodDefinitionContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.TMETHOD_DEFINITION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TMethodDefinition> getTMethodDefinitions() {
		if (tMethodDefinitions == null) {
			tMethodDefinitions = new EObjectResolvingEList<TMethodDefinition>(TMethodDefinition.class, this, ContainersPackage.TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITIONS);
		}
		return tMethodDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContainersPackage.TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITIONS:
				return getTMethodDefinitions();
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
			case ContainersPackage.TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITIONS:
				getTMethodDefinitions().clear();
				getTMethodDefinitions().addAll((Collection<? extends TMethodDefinition>)newValue);
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
			case ContainersPackage.TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITIONS:
				getTMethodDefinitions().clear();
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
			case ContainersPackage.TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITIONS:
				return tMethodDefinitions != null && !tMethodDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TMethodDefinitionContainerImpl
