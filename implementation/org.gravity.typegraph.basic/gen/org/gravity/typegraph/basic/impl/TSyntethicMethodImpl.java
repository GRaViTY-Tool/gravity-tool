/**
 */
package org.gravity.typegraph.basic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSyntethicMethod;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSyntethic Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TSyntethicMethodImpl#getOriginalMethodDefinition <em>Original Method Definition</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TSyntethicMethodImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSyntethicMethodImpl extends TMemberImpl implements TSyntethicMethod {
	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected TMethodSignature signature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSyntethicMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TSYNTETHIC_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition getOriginalMethodDefinition() {
		if (eContainerFeatureID() != BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION) return null;
		return (TMethodDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalMethodDefinition(TMethodDefinition newOriginalMethodDefinition,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOriginalMethodDefinition, BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalMethodDefinition(TMethodDefinition newOriginalMethodDefinition) {
		if (newOriginalMethodDefinition != eInternalContainer() || (eContainerFeatureID() != BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION && newOriginalMethodDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newOriginalMethodDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOriginalMethodDefinition != null)
				msgs = ((InternalEObject)newOriginalMethodDefinition).eInverseAdd(this, BasicPackage.TMETHOD_DEFINITION__SYNTETHIC_METHODS, TMethodDefinition.class, msgs);
			msgs = basicSetOriginalMethodDefinition(newOriginalMethodDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION, newOriginalMethodDefinition, newOriginalMethodDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature getSignature() {
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject)signature;
			signature = (TMethodSignature)eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TSYNTETHIC_METHOD__SIGNATURE, oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(TMethodSignature newSignature) {
		TMethodSignature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TSYNTETHIC_METHOD__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOriginalMethodDefinition((TMethodDefinition)otherEnd, msgs);
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
			case BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION:
				return eInternalContainer().eInverseRemove(this, BasicPackage.TMETHOD_DEFINITION__SYNTETHIC_METHODS, TMethodDefinition.class, msgs);
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
			case BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION:
				return getOriginalMethodDefinition();
			case BasicPackage.TSYNTETHIC_METHOD__SIGNATURE:
				if (resolve) return getSignature();
				return basicGetSignature();
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
			case BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION:
				setOriginalMethodDefinition((TMethodDefinition)newValue);
				return;
			case BasicPackage.TSYNTETHIC_METHOD__SIGNATURE:
				setSignature((TMethodSignature)newValue);
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
			case BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION:
				setOriginalMethodDefinition((TMethodDefinition)null);
				return;
			case BasicPackage.TSYNTETHIC_METHOD__SIGNATURE:
				setSignature((TMethodSignature)null);
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
			case BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION:
				return getOriginalMethodDefinition() != null;
			case BasicPackage.TSYNTETHIC_METHOD__SIGNATURE:
				return signature != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public String getSignatureString() {
		return signature.getSignatureString();
	}

	// [user code injected with eMoflon] -->
} //TSyntethicMethodImpl
