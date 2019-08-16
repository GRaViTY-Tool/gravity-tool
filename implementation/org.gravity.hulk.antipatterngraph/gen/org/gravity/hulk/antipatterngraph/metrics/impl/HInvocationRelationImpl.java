/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;
import org.gravity.hulk.antipatterngraph.metrics.HOutgoingInvocationMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HInvocation Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HInvocationRelationImpl#getHOutgoingInvocationCustomMetric <em>HOutgoing Invocation Custom Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HInvocationRelationImpl#getHIncommingInvocationCustomMetric <em>HIncomming Invocation Custom Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HInvocationRelationImpl extends HMetricImpl implements HInvocationRelation {
	/**
	 * The cached value of the '{@link #getHOutgoingInvocationCustomMetric() <em>HOutgoing Invocation Custom Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHOutgoingInvocationCustomMetric()
	 * @generated
	 * @ordered
	 */
	protected HOutgoingInvocationMetric hOutgoingInvocationCustomMetric;

	/**
	 * The cached value of the '{@link #getHIncommingInvocationCustomMetric() <em>HIncomming Invocation Custom Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIncommingInvocationCustomMetric()
	 * @generated
	 * @ordered
	 */
	protected HIncommingInvocationMetric hIncommingInvocationCustomMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HInvocationRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HINVOCATION_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HOutgoingInvocationMetric getHOutgoingInvocationCustomMetric() {
		if (hOutgoingInvocationCustomMetric != null && hOutgoingInvocationCustomMetric.eIsProxy()) {
			InternalEObject oldHOutgoingInvocationCustomMetric = (InternalEObject) hOutgoingInvocationCustomMetric;
			hOutgoingInvocationCustomMetric = (HOutgoingInvocationMetric) eResolveProxy(
					oldHOutgoingInvocationCustomMetric);
			if (hOutgoingInvocationCustomMetric != oldHOutgoingInvocationCustomMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetricsPackage.HINVOCATION_RELATION__HOUTGOING_INVOCATION_CUSTOM_METRIC,
							oldHOutgoingInvocationCustomMetric, hOutgoingInvocationCustomMetric));
			}
		}
		return hOutgoingInvocationCustomMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HOutgoingInvocationMetric basicGetHOutgoingInvocationCustomMetric() {
		return hOutgoingInvocationCustomMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHOutgoingInvocationCustomMetric(HOutgoingInvocationMetric newHOutgoingInvocationCustomMetric) {
		HOutgoingInvocationMetric oldHOutgoingInvocationCustomMetric = hOutgoingInvocationCustomMetric;
		hOutgoingInvocationCustomMetric = newHOutgoingInvocationCustomMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetricsPackage.HINVOCATION_RELATION__HOUTGOING_INVOCATION_CUSTOM_METRIC,
					oldHOutgoingInvocationCustomMetric, hOutgoingInvocationCustomMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIncommingInvocationMetric getHIncommingInvocationCustomMetric() {
		if (hIncommingInvocationCustomMetric != null && hIncommingInvocationCustomMetric.eIsProxy()) {
			InternalEObject oldHIncommingInvocationCustomMetric = (InternalEObject) hIncommingInvocationCustomMetric;
			hIncommingInvocationCustomMetric = (HIncommingInvocationMetric) eResolveProxy(
					oldHIncommingInvocationCustomMetric);
			if (hIncommingInvocationCustomMetric != oldHIncommingInvocationCustomMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetricsPackage.HINVOCATION_RELATION__HINCOMMING_INVOCATION_CUSTOM_METRIC,
							oldHIncommingInvocationCustomMetric, hIncommingInvocationCustomMetric));
			}
		}
		return hIncommingInvocationCustomMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HIncommingInvocationMetric basicGetHIncommingInvocationCustomMetric() {
		return hIncommingInvocationCustomMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHIncommingInvocationCustomMetric(HIncommingInvocationMetric newHIncommingInvocationCustomMetric) {
		HIncommingInvocationMetric oldHIncommingInvocationCustomMetric = hIncommingInvocationCustomMetric;
		hIncommingInvocationCustomMetric = newHIncommingInvocationCustomMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetricsPackage.HINVOCATION_RELATION__HINCOMMING_INVOCATION_CUSTOM_METRIC,
					oldHIncommingInvocationCustomMetric, hIncommingInvocationCustomMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetricsPackage.HINVOCATION_RELATION__HOUTGOING_INVOCATION_CUSTOM_METRIC:
			if (resolve)
				return getHOutgoingInvocationCustomMetric();
			return basicGetHOutgoingInvocationCustomMetric();
		case MetricsPackage.HINVOCATION_RELATION__HINCOMMING_INVOCATION_CUSTOM_METRIC:
			if (resolve)
				return getHIncommingInvocationCustomMetric();
			return basicGetHIncommingInvocationCustomMetric();
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
		case MetricsPackage.HINVOCATION_RELATION__HOUTGOING_INVOCATION_CUSTOM_METRIC:
			setHOutgoingInvocationCustomMetric((HOutgoingInvocationMetric) newValue);
			return;
		case MetricsPackage.HINVOCATION_RELATION__HINCOMMING_INVOCATION_CUSTOM_METRIC:
			setHIncommingInvocationCustomMetric((HIncommingInvocationMetric) newValue);
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
		case MetricsPackage.HINVOCATION_RELATION__HOUTGOING_INVOCATION_CUSTOM_METRIC:
			setHOutgoingInvocationCustomMetric((HOutgoingInvocationMetric) null);
			return;
		case MetricsPackage.HINVOCATION_RELATION__HINCOMMING_INVOCATION_CUSTOM_METRIC:
			setHIncommingInvocationCustomMetric((HIncommingInvocationMetric) null);
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
		case MetricsPackage.HINVOCATION_RELATION__HOUTGOING_INVOCATION_CUSTOM_METRIC:
			return hOutgoingInvocationCustomMetric != null;
		case MetricsPackage.HINVOCATION_RELATION__HINCOMMING_INVOCATION_CUSTOM_METRIC:
			return hIncommingInvocationCustomMetric != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("InvocationRelation(" + ((TClass) getTAnnotated()).getTName() + ")=" + getValue());
		return item;
	}

	// [user code injected with eMoflon] -->
} //HInvocationRelationImpl
