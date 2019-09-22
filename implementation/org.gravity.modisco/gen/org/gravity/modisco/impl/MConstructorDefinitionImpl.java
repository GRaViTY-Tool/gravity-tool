/**
 */
package org.gravity.modisco.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MConstructor Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MConstructorDefinitionImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MConstructorDefinitionImpl extends MAbstractMethodDefinitionImpl implements MConstructorDefinition {
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
	protected MConstructorDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MCONSTRUCTOR_DEFINITION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL, oldModel, model));
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
	public void setModel(MGravityModel newModel) {
		MGravityModel oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION__MODEL:
				return model != null;
		}
		return super.eIsSet(featureID);
	}

} //MConstructorDefinitionImpl
