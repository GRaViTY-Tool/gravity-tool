/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfFieldsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLCOM5 Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLCOM5MetricImpl#getHNumberOfMethodsMetric <em>HNumber Of Methods Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLCOM5MetricImpl#getHNumberOfFieldsMetric <em>HNumber Of Fields Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLCOM5MetricImpl#getHLocalFieldUniqueAccessMetric <em>HLocal Field Unique Access Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLCOM5MetricImpl extends HMetricImpl implements HLCOM5Metric {
	/**
	 * The cached value of the '{@link #getHNumberOfMethodsMetric() <em>HNumber Of Methods Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHNumberOfMethodsMetric()
	 * @generated
	 * @ordered
	 */
	protected HNumberOfMethodsMetric hNumberOfMethodsMetric;

	/**
	 * The cached value of the '{@link #getHNumberOfFieldsMetric() <em>HNumber Of Fields Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHNumberOfFieldsMetric()
	 * @generated
	 * @ordered
	 */
	protected HNumberOfFieldsMetric hNumberOfFieldsMetric;

	/**
	 * The cached value of the '{@link #getHLocalFieldUniqueAccessMetric() <em>HLocal Field Unique Access Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHLocalFieldUniqueAccessMetric()
	 * @generated
	 * @ordered
	 */
	protected HLocalFieldUniqueAccessMetric hLocalFieldUniqueAccessMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLCOM5MetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLCOM5_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfMethodsMetric getHNumberOfMethodsMetric() {
		if (hNumberOfMethodsMetric != null && hNumberOfMethodsMetric.eIsProxy()) {
			InternalEObject oldHNumberOfMethodsMetric = (InternalEObject) hNumberOfMethodsMetric;
			hNumberOfMethodsMetric = (HNumberOfMethodsMetric) eResolveProxy(oldHNumberOfMethodsMetric);
			if (hNumberOfMethodsMetric != oldHNumberOfMethodsMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetricsPackage.HLCOM5_METRIC__HNUMBER_OF_METHODS_METRIC, oldHNumberOfMethodsMetric,
							hNumberOfMethodsMetric));
			}
		}
		return hNumberOfMethodsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfMethodsMetric basicGetHNumberOfMethodsMetric() {
		return hNumberOfMethodsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHNumberOfMethodsMetric(HNumberOfMethodsMetric newHNumberOfMethodsMetric) {
		HNumberOfMethodsMetric oldHNumberOfMethodsMetric = hNumberOfMethodsMetric;
		hNumberOfMethodsMetric = newHNumberOfMethodsMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetricsPackage.HLCOM5_METRIC__HNUMBER_OF_METHODS_METRIC, oldHNumberOfMethodsMetric,
					hNumberOfMethodsMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfFieldsMetric getHNumberOfFieldsMetric() {
		if (hNumberOfFieldsMetric != null && hNumberOfFieldsMetric.eIsProxy()) {
			InternalEObject oldHNumberOfFieldsMetric = (InternalEObject) hNumberOfFieldsMetric;
			hNumberOfFieldsMetric = (HNumberOfFieldsMetric) eResolveProxy(oldHNumberOfFieldsMetric);
			if (hNumberOfFieldsMetric != oldHNumberOfFieldsMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetricsPackage.HLCOM5_METRIC__HNUMBER_OF_FIELDS_METRIC, oldHNumberOfFieldsMetric,
							hNumberOfFieldsMetric));
			}
		}
		return hNumberOfFieldsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfFieldsMetric basicGetHNumberOfFieldsMetric() {
		return hNumberOfFieldsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHNumberOfFieldsMetric(HNumberOfFieldsMetric newHNumberOfFieldsMetric) {
		HNumberOfFieldsMetric oldHNumberOfFieldsMetric = hNumberOfFieldsMetric;
		hNumberOfFieldsMetric = newHNumberOfFieldsMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetricsPackage.HLCOM5_METRIC__HNUMBER_OF_FIELDS_METRIC, oldHNumberOfFieldsMetric,
					hNumberOfFieldsMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalFieldUniqueAccessMetric getHLocalFieldUniqueAccessMetric() {
		if (hLocalFieldUniqueAccessMetric != null && hLocalFieldUniqueAccessMetric.eIsProxy()) {
			InternalEObject oldHLocalFieldUniqueAccessMetric = (InternalEObject) hLocalFieldUniqueAccessMetric;
			hLocalFieldUniqueAccessMetric = (HLocalFieldUniqueAccessMetric) eResolveProxy(
					oldHLocalFieldUniqueAccessMetric);
			if (hLocalFieldUniqueAccessMetric != oldHLocalFieldUniqueAccessMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetricsPackage.HLCOM5_METRIC__HLOCAL_FIELD_UNIQUE_ACCESS_METRIC,
							oldHLocalFieldUniqueAccessMetric, hLocalFieldUniqueAccessMetric));
			}
		}
		return hLocalFieldUniqueAccessMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalFieldUniqueAccessMetric basicGetHLocalFieldUniqueAccessMetric() {
		return hLocalFieldUniqueAccessMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHLocalFieldUniqueAccessMetric(HLocalFieldUniqueAccessMetric newHLocalFieldUniqueAccessMetric) {
		HLocalFieldUniqueAccessMetric oldHLocalFieldUniqueAccessMetric = hLocalFieldUniqueAccessMetric;
		hLocalFieldUniqueAccessMetric = newHLocalFieldUniqueAccessMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetricsPackage.HLCOM5_METRIC__HLOCAL_FIELD_UNIQUE_ACCESS_METRIC, oldHLocalFieldUniqueAccessMetric,
					hLocalFieldUniqueAccessMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetricsPackage.HLCOM5_METRIC__HNUMBER_OF_METHODS_METRIC:
			if (resolve)
				return getHNumberOfMethodsMetric();
			return basicGetHNumberOfMethodsMetric();
		case MetricsPackage.HLCOM5_METRIC__HNUMBER_OF_FIELDS_METRIC:
			if (resolve)
				return getHNumberOfFieldsMetric();
			return basicGetHNumberOfFieldsMetric();
		case MetricsPackage.HLCOM5_METRIC__HLOCAL_FIELD_UNIQUE_ACCESS_METRIC:
			if (resolve)
				return getHLocalFieldUniqueAccessMetric();
			return basicGetHLocalFieldUniqueAccessMetric();
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
		case MetricsPackage.HLCOM5_METRIC__HNUMBER_OF_METHODS_METRIC:
			setHNumberOfMethodsMetric((HNumberOfMethodsMetric) newValue);
			return;
		case MetricsPackage.HLCOM5_METRIC__HNUMBER_OF_FIELDS_METRIC:
			setHNumberOfFieldsMetric((HNumberOfFieldsMetric) newValue);
			return;
		case MetricsPackage.HLCOM5_METRIC__HLOCAL_FIELD_UNIQUE_ACCESS_METRIC:
			setHLocalFieldUniqueAccessMetric((HLocalFieldUniqueAccessMetric) newValue);
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
		case MetricsPackage.HLCOM5_METRIC__HNUMBER_OF_METHODS_METRIC:
			setHNumberOfMethodsMetric((HNumberOfMethodsMetric) null);
			return;
		case MetricsPackage.HLCOM5_METRIC__HNUMBER_OF_FIELDS_METRIC:
			setHNumberOfFieldsMetric((HNumberOfFieldsMetric) null);
			return;
		case MetricsPackage.HLCOM5_METRIC__HLOCAL_FIELD_UNIQUE_ACCESS_METRIC:
			setHLocalFieldUniqueAccessMetric((HLocalFieldUniqueAccessMetric) null);
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
		case MetricsPackage.HLCOM5_METRIC__HNUMBER_OF_METHODS_METRIC:
			return hNumberOfMethodsMetric != null;
		case MetricsPackage.HLCOM5_METRIC__HNUMBER_OF_FIELDS_METRIC:
			return hNumberOfFieldsMetric != null;
		case MetricsPackage.HLCOM5_METRIC__HLOCAL_FIELD_UNIQUE_ACCESS_METRIC:
			return hLocalFieldUniqueAccessMetric != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("LCOM5(" + ((TClass) getTAnnotated()).getTName() + ")=" + getValue());
		return item;
	}

	// [user code injected with eMoflon] -->
} //HLCOM5MetricImpl
