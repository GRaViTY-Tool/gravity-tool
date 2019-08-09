/**
 */
package org.gravity.typegraph.basic.annotations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.annotations.AnnotationsPackage;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAnnotation Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.annotations.impl.TAnnotationValueImpl#getTKey <em>TKey</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.annotations.impl.TAnnotationValueImpl#getTValue <em>TValue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAnnotationValueImpl extends MinimalEObjectImpl.Container implements TAnnotationValue {
	/**
	 * The default value of the '{@link #getTKey() <em>TKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTKey()
	 * @generated
	 * @ordered
	 */
	protected static final String TKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTKey() <em>TKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTKey()
	 * @generated
	 * @ordered
	 */
	protected String tKey = TKEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTValue() <em>TValue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTValue()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> tValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAnnotationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.TANNOTATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTKey() {
		return tKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTKey(String newTKey) {
		String oldTKey = tKey;
		tKey = newTKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.TANNOTATION_VALUE__TKEY, oldTKey, tKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getTValue() {
		if (tValue == null) {
			tValue = new EObjectContainmentEList<EObject>(EObject.class, this, AnnotationsPackage.TANNOTATION_VALUE__TVALUE);
		}
		return tValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.TANNOTATION_VALUE__TVALUE:
				return ((InternalEList<?>)getTValue()).basicRemove(otherEnd, msgs);
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
			case AnnotationsPackage.TANNOTATION_VALUE__TKEY:
				return getTKey();
			case AnnotationsPackage.TANNOTATION_VALUE__TVALUE:
				return getTValue();
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
			case AnnotationsPackage.TANNOTATION_VALUE__TKEY:
				setTKey((String)newValue);
				return;
			case AnnotationsPackage.TANNOTATION_VALUE__TVALUE:
				getTValue().clear();
				getTValue().addAll((Collection<? extends EObject>)newValue);
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
			case AnnotationsPackage.TANNOTATION_VALUE__TKEY:
				setTKey(TKEY_EDEFAULT);
				return;
			case AnnotationsPackage.TANNOTATION_VALUE__TVALUE:
				getTValue().clear();
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
			case AnnotationsPackage.TANNOTATION_VALUE__TKEY:
				return TKEY_EDEFAULT == null ? tKey != null : !TKEY_EDEFAULT.equals(tKey);
			case AnnotationsPackage.TANNOTATION_VALUE__TVALUE:
				return tValue != null && !tValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (tKey: ");
		result.append(tKey);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TAnnotationValueImpl
