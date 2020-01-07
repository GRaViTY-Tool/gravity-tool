/**
 */
package org.gravity.modisco.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.emf.impl.BodyDeclarationImpl;

import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MSyntheticMethodDefinition;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSynthetic Method Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MSyntheticMethodDefinitionImpl#getOriginalMethodDefinition <em>Original Method Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSyntheticMethodDefinitionImpl extends BodyDeclarationImpl implements MSyntheticMethodDefinition {
	/**
	 * The cached value of the '{@link #getOriginalMethodDefinition() <em>Original Method Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalMethodDefinition()
	 * @generated
	 * @ordered
	 */
	protected MMethodDefinition originalMethodDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSyntheticMethodDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MSYNTHETIC_METHOD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodDefinition getOriginalMethodDefinition() {
		if (originalMethodDefinition != null && originalMethodDefinition.eIsProxy()) {
			InternalEObject oldOriginalMethodDefinition = (InternalEObject)originalMethodDefinition;
			originalMethodDefinition = (MMethodDefinition)eResolveProxy(oldOriginalMethodDefinition);
			if (originalMethodDefinition != oldOriginalMethodDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION, oldOriginalMethodDefinition, originalMethodDefinition));
			}
		}
		return originalMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodDefinition basicGetOriginalMethodDefinition() {
		return originalMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalMethodDefinition(MMethodDefinition newOriginalMethodDefinition, NotificationChain msgs) {
		MMethodDefinition oldOriginalMethodDefinition = originalMethodDefinition;
		originalMethodDefinition = newOriginalMethodDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION, oldOriginalMethodDefinition, newOriginalMethodDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalMethodDefinition(MMethodDefinition newOriginalMethodDefinition) {
		if (newOriginalMethodDefinition != originalMethodDefinition) {
			NotificationChain msgs = null;
			if (originalMethodDefinition != null)
				msgs = ((InternalEObject)originalMethodDefinition).eInverseRemove(this, ModiscoPackage.MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS, MMethodDefinition.class, msgs);
			if (newOriginalMethodDefinition != null)
				msgs = ((InternalEObject)newOriginalMethodDefinition).eInverseAdd(this, ModiscoPackage.MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS, MMethodDefinition.class, msgs);
			msgs = basicSetOriginalMethodDefinition(newOriginalMethodDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION, newOriginalMethodDefinition, newOriginalMethodDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION:
				if (originalMethodDefinition != null)
					msgs = ((InternalEObject)originalMethodDefinition).eInverseRemove(this, ModiscoPackage.MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS, MMethodDefinition.class, msgs);
				return basicSetOriginalMethodDefinition((MMethodDefinition)otherEnd, msgs);
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
			case ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION:
				return basicSetOriginalMethodDefinition(null, msgs);
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
			case ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION:
				if (resolve) return getOriginalMethodDefinition();
				return basicGetOriginalMethodDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION:
				setOriginalMethodDefinition((MMethodDefinition)newValue);
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
			case ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION:
				setOriginalMethodDefinition((MMethodDefinition)null);
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
			case ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION:
				return originalMethodDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //MSyntheticMethodDefinitionImpl
