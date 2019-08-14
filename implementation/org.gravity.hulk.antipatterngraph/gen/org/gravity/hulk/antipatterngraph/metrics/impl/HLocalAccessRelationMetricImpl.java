/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLocal Access Relation Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalAccessRelationMetricImpl#getHLocalFieldAccesses <em>HLocal Field Accesses</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalAccessRelationMetricImpl#getHLocalMethodAccesses <em>HLocal Method Accesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HLocalAccessRelationMetricImpl extends HMetricImpl implements HLocalAccessRelationMetric {
	/**
	 * The cached value of the '{@link #getHLocalFieldAccesses() <em>HLocal Field Accesses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHLocalFieldAccesses()
	 * @generated
	 * @ordered
	 */
	protected HLocalFieldAccessesMetric hLocalFieldAccesses;

	/**
	 * The cached value of the '{@link #getHLocalMethodAccesses() <em>HLocal Method Accesses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHLocalMethodAccesses()
	 * @generated
	 * @ordered
	 */
	protected HLocalMethodAccessesMetric hLocalMethodAccesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLocalAccessRelationMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLOCAL_ACCESS_RELATION_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLocalFieldAccessesMetric getHLocalFieldAccesses() {
		if (hLocalFieldAccesses != null && hLocalFieldAccesses.eIsProxy()) {
			InternalEObject oldHLocalFieldAccesses = (InternalEObject) hLocalFieldAccesses;
			hLocalFieldAccesses = (HLocalFieldAccessesMetric) eResolveProxy(oldHLocalFieldAccesses);
			if (hLocalFieldAccesses != oldHLocalFieldAccesses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_FIELD_ACCESSES, oldHLocalFieldAccesses,
							hLocalFieldAccesses));
			}
		}
		return hLocalFieldAccesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalFieldAccessesMetric basicGetHLocalFieldAccesses() {
		return hLocalFieldAccesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHLocalFieldAccesses(HLocalFieldAccessesMetric newHLocalFieldAccesses) {
		HLocalFieldAccessesMetric oldHLocalFieldAccesses = hLocalFieldAccesses;
		hLocalFieldAccesses = newHLocalFieldAccesses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_FIELD_ACCESSES, oldHLocalFieldAccesses,
					hLocalFieldAccesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLocalMethodAccessesMetric getHLocalMethodAccesses() {
		if (hLocalMethodAccesses != null && hLocalMethodAccesses.eIsProxy()) {
			InternalEObject oldHLocalMethodAccesses = (InternalEObject) hLocalMethodAccesses;
			hLocalMethodAccesses = (HLocalMethodAccessesMetric) eResolveProxy(oldHLocalMethodAccesses);
			if (hLocalMethodAccesses != oldHLocalMethodAccesses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_METHOD_ACCESSES,
							oldHLocalMethodAccesses, hLocalMethodAccesses));
			}
		}
		return hLocalMethodAccesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalMethodAccessesMetric basicGetHLocalMethodAccesses() {
		return hLocalMethodAccesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHLocalMethodAccesses(HLocalMethodAccessesMetric newHLocalMethodAccesses) {
		HLocalMethodAccessesMetric oldHLocalMethodAccesses = hLocalMethodAccesses;
		hLocalMethodAccesses = newHLocalMethodAccesses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_METHOD_ACCESSES, oldHLocalMethodAccesses,
					hLocalMethodAccesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_FIELD_ACCESSES:
			if (resolve)
				return getHLocalFieldAccesses();
			return basicGetHLocalFieldAccesses();
		case MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_METHOD_ACCESSES:
			if (resolve)
				return getHLocalMethodAccesses();
			return basicGetHLocalMethodAccesses();
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
		case MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_FIELD_ACCESSES:
			setHLocalFieldAccesses((HLocalFieldAccessesMetric) newValue);
			return;
		case MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_METHOD_ACCESSES:
			setHLocalMethodAccesses((HLocalMethodAccessesMetric) newValue);
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
		case MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_FIELD_ACCESSES:
			setHLocalFieldAccesses((HLocalFieldAccessesMetric) null);
			return;
		case MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_METHOD_ACCESSES:
			setHLocalMethodAccesses((HLocalMethodAccessesMetric) null);
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
		case MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_FIELD_ACCESSES:
			return hLocalFieldAccesses != null;
		case MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_METHOD_ACCESSES:
			return hLocalMethodAccesses != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("LocalFieldAccess/LocalMethodAccess(" + ((TClass) getTAnnotated()).getTName() + ") = " + getValue()
				+ ")");
		return item;
	}

	// [user code injected with eMoflon] -->
} //HLocalAccessRelationMetricImpl
