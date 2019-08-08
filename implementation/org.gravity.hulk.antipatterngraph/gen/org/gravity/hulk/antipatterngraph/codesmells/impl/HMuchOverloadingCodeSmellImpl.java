/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell;
import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;
import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMuch Overloading Code Smell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HMuchOverloadingCodeSmellImpl#getHAverageOverloadingInClassMetric <em>HAverage Overloading In Class Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HMuchOverloadingCodeSmellImpl extends HCodeSmellImpl implements HMuchOverloadingCodeSmell {
	/**
	 * The cached value of the '{@link #getHAverageOverloadingInClassMetric() <em>HAverage Overloading In Class Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHAverageOverloadingInClassMetric()
	 * @generated
	 * @ordered
	 */
	protected HAverageOverloadingInClassMetric hAverageOverloadingInClassMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMuchOverloadingCodeSmellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HMUCH_OVERLOADING_CODE_SMELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAverageOverloadingInClassMetric getHAverageOverloadingInClassMetric() {
		if (hAverageOverloadingInClassMetric != null && hAverageOverloadingInClassMetric.eIsProxy()) {
			InternalEObject oldHAverageOverloadingInClassMetric = (InternalEObject) hAverageOverloadingInClassMetric;
			hAverageOverloadingInClassMetric = (HAverageOverloadingInClassMetric) eResolveProxy(
					oldHAverageOverloadingInClassMetric);
			if (hAverageOverloadingInClassMetric != oldHAverageOverloadingInClassMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodesmellsPackage.HMUCH_OVERLOADING_CODE_SMELL__HAVERAGE_OVERLOADING_IN_CLASS_METRIC,
							oldHAverageOverloadingInClassMetric, hAverageOverloadingInClassMetric));
			}
		}
		return hAverageOverloadingInClassMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAverageOverloadingInClassMetric basicGetHAverageOverloadingInClassMetric() {
		return hAverageOverloadingInClassMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHAverageOverloadingInClassMetric(
			HAverageOverloadingInClassMetric newHAverageOverloadingInClassMetric) {
		HAverageOverloadingInClassMetric oldHAverageOverloadingInClassMetric = hAverageOverloadingInClassMetric;
		hAverageOverloadingInClassMetric = newHAverageOverloadingInClassMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodesmellsPackage.HMUCH_OVERLOADING_CODE_SMELL__HAVERAGE_OVERLOADING_IN_CLASS_METRIC,
					oldHAverageOverloadingInClassMetric, hAverageOverloadingInClassMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HMUCH_OVERLOADING_CODE_SMELL__HAVERAGE_OVERLOADING_IN_CLASS_METRIC:
			if (resolve)
				return getHAverageOverloadingInClassMetric();
			return basicGetHAverageOverloadingInClassMetric();
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
		case CodesmellsPackage.HMUCH_OVERLOADING_CODE_SMELL__HAVERAGE_OVERLOADING_IN_CLASS_METRIC:
			setHAverageOverloadingInClassMetric((HAverageOverloadingInClassMetric) newValue);
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
		case CodesmellsPackage.HMUCH_OVERLOADING_CODE_SMELL__HAVERAGE_OVERLOADING_IN_CLASS_METRIC:
			setHAverageOverloadingInClassMetric((HAverageOverloadingInClassMetric) null);
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
		case CodesmellsPackage.HMUCH_OVERLOADING_CODE_SMELL__HAVERAGE_OVERLOADING_IN_CLASS_METRIC:
			return hAverageOverloadingInClassMetric != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());

		TreeItem metric = new TreeItem(item, style);
		getHAverageOverloadingInClassMetric().createItemContents(metric, style);
		return item;
	}

	// [user code injected with eMoflon] -->
} //HMuchOverloadingCodeSmellImpl
