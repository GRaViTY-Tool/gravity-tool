/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSyntethicMethod;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>TSyntethic Method</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TSyntethicMethodImpl#getOriginalMethodDefinition <em>Original Method Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSyntethicMethodImpl extends TMemberImpl implements TSyntethicMethod {
	/**
	 * The cached value of the '{@link #getOriginalMethodDefinition() <em>Original Method Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalMethodDefinition()
	 * @generated
	 * @ordered
	 */
	protected TMethodDefinition originalMethodDefinition;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TSyntethicMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TSYNTETHIC_METHOD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodDefinition getOriginalMethodDefinition() {
		if (originalMethodDefinition != null && originalMethodDefinition.eIsProxy()) {
			InternalEObject oldOriginalMethodDefinition = (InternalEObject)originalMethodDefinition;
			originalMethodDefinition = (TMethodDefinition)eResolveProxy(oldOriginalMethodDefinition);
			if (originalMethodDefinition != oldOriginalMethodDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION, oldOriginalMethodDefinition, originalMethodDefinition));
			}
		}
		return originalMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition basicGetOriginalMethodDefinition() {
		return originalMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalMethodDefinition(TMethodDefinition newOriginalMethodDefinition,
			NotificationChain msgs) {
		TMethodDefinition oldOriginalMethodDefinition = originalMethodDefinition;
		originalMethodDefinition = newOriginalMethodDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION, oldOriginalMethodDefinition, newOriginalMethodDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalMethodDefinition(TMethodDefinition newOriginalMethodDefinition) {
		if (newOriginalMethodDefinition != originalMethodDefinition) {
			NotificationChain msgs = null;
			if (originalMethodDefinition != null)
				msgs = ((InternalEObject)originalMethodDefinition).eInverseRemove(this, BasicPackage.TMETHOD_DEFINITION__SYNTETHIC_METHODS, TMethodDefinition.class, msgs);
			if (newOriginalMethodDefinition != null)
				msgs = ((InternalEObject)newOriginalMethodDefinition).eInverseAdd(this, BasicPackage.TMETHOD_DEFINITION__SYNTETHIC_METHODS, TMethodDefinition.class, msgs);
			msgs = basicSetOriginalMethodDefinition(newOriginalMethodDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION, newOriginalMethodDefinition, newOriginalMethodDefinition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public TMethodSignature getSignature() {
		return (TMethodSignature) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION:
				if (originalMethodDefinition != null)
					msgs = ((InternalEObject)originalMethodDefinition).eInverseRemove(this, BasicPackage.TMETHOD_DEFINITION__SYNTETHIC_METHODS, TMethodDefinition.class, msgs);
				return basicSetOriginalMethodDefinition((TMethodDefinition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION:
				if (resolve) return getOriginalMethodDefinition();
				return basicGetOriginalMethodDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION:
				setOriginalMethodDefinition((TMethodDefinition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION:
				setOriginalMethodDefinition((TMethodDefinition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasicPackage.TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION:
				return originalMethodDefinition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicPackage.TSYNTETHIC_METHOD___GET_SIGNATURE:
				return getSignature();
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getSignatureString() {
		return getSignature().getSignatureString();
	}

	// [user code injected with eMoflon] -->
} // TSyntethicMethodImpl
