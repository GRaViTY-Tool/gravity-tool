/**
 */
package org.gravity.security.annotations.requirements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.security.annotations.requirements.RequirementsPackage;
import org.gravity.security.annotations.requirements.TAnnotationWithCounterMeasure;

import org.gravity.typegraph.basic.TMethodDefinition;

import org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAnnotation With Counter Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.security.annotations.requirements.impl.TAnnotationWithCounterMeasureImpl#getCountermeasure <em>Countermeasure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAnnotationWithCounterMeasureImpl extends TAnnotationImpl implements TAnnotationWithCounterMeasure {
	/**
	 * The cached value of the '{@link #getCountermeasure() <em>Countermeasure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountermeasure()
	 * @generated
	 * @ordered
	 */
	protected TMethodDefinition countermeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAnnotationWithCounterMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.TANNOTATION_WITH_COUNTER_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodDefinition getCountermeasure() {
		if (countermeasure != null && countermeasure.eIsProxy()) {
			InternalEObject oldCountermeasure = (InternalEObject) countermeasure;
			countermeasure = (TMethodDefinition) eResolveProxy(oldCountermeasure);
			if (countermeasure != oldCountermeasure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RequirementsPackage.TANNOTATION_WITH_COUNTER_MEASURE__COUNTERMEASURE, oldCountermeasure,
							countermeasure));
			}
		}
		return countermeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition basicGetCountermeasure() {
		return countermeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountermeasure(TMethodDefinition newCountermeasure) {
		TMethodDefinition oldCountermeasure = countermeasure;
		countermeasure = newCountermeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RequirementsPackage.TANNOTATION_WITH_COUNTER_MEASURE__COUNTERMEASURE, oldCountermeasure,
					countermeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RequirementsPackage.TANNOTATION_WITH_COUNTER_MEASURE__COUNTERMEASURE:
			if (resolve)
				return getCountermeasure();
			return basicGetCountermeasure();
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
		case RequirementsPackage.TANNOTATION_WITH_COUNTER_MEASURE__COUNTERMEASURE:
			setCountermeasure((TMethodDefinition) newValue);
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
		case RequirementsPackage.TANNOTATION_WITH_COUNTER_MEASURE__COUNTERMEASURE:
			setCountermeasure((TMethodDefinition) null);
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
		case RequirementsPackage.TANNOTATION_WITH_COUNTER_MEASURE__COUNTERMEASURE:
			return countermeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //TAnnotationWithCounterMeasureImpl
