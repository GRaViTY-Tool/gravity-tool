/**
 */
package org.gravity.typegraph.basic.containers.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.typegraph.basic.TFieldDefinition;

import org.gravity.typegraph.basic.containers.ContainersPackage;
import org.gravity.typegraph.basic.containers.TFieldDefinitionContainer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TField Definition Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.impl.TFieldDefinitionContainerImpl#getTFieldDefinitions <em>TField Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFieldDefinitionContainerImpl extends MinimalEObjectImpl.Container implements TFieldDefinitionContainer {
	/**
	 * The cached value of the '{@link #getTFieldDefinitions() <em>TField Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTFieldDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TFieldDefinition> tFieldDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFieldDefinitionContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.TFIELD_DEFINITION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFieldDefinition> getTFieldDefinitions() {
		if (tFieldDefinitions == null) {
			tFieldDefinitions = new EObjectResolvingEList<TFieldDefinition>(TFieldDefinition.class, this, ContainersPackage.TFIELD_DEFINITION_CONTAINER__TFIELD_DEFINITIONS);
		}
		return tFieldDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContainersPackage.TFIELD_DEFINITION_CONTAINER__TFIELD_DEFINITIONS:
				return getTFieldDefinitions();
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
			case ContainersPackage.TFIELD_DEFINITION_CONTAINER__TFIELD_DEFINITIONS:
				getTFieldDefinitions().clear();
				getTFieldDefinitions().addAll((Collection<? extends TFieldDefinition>)newValue);
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
			case ContainersPackage.TFIELD_DEFINITION_CONTAINER__TFIELD_DEFINITIONS:
				getTFieldDefinitions().clear();
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
			case ContainersPackage.TFIELD_DEFINITION_CONTAINER__TFIELD_DEFINITIONS:
				return tFieldDefinitions != null && !tFieldDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TFieldDefinitionContainerImpl
