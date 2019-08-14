/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HManyParametersCodeSmell;

import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;

import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TClass;
import org.eclipse.swt.widgets.TreeItem;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMany Parameters Code Smell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HManyParametersCodeSmellImpl#getHAverageParametersMetric <em>HAverage Parameters Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HManyParametersCodeSmellImpl extends HCodeSmellImpl implements HManyParametersCodeSmell {
	/**
	 * The cached value of the '{@link #getHAverageParametersMetric() <em>HAverage Parameters Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHAverageParametersMetric()
	 * @generated
	 * @ordered
	 */
	protected HAverageParametersMetric hAverageParametersMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HManyParametersCodeSmellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HMANY_PARAMETERS_CODE_SMELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HAverageParametersMetric getHAverageParametersMetric() {
		if (hAverageParametersMetric != null && hAverageParametersMetric.eIsProxy()) {
			InternalEObject oldHAverageParametersMetric = (InternalEObject) hAverageParametersMetric;
			hAverageParametersMetric = (HAverageParametersMetric) eResolveProxy(oldHAverageParametersMetric);
			if (hAverageParametersMetric != oldHAverageParametersMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodesmellsPackage.HMANY_PARAMETERS_CODE_SMELL__HAVERAGE_PARAMETERS_METRIC,
							oldHAverageParametersMetric, hAverageParametersMetric));
			}
		}
		return hAverageParametersMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAverageParametersMetric basicGetHAverageParametersMetric() {
		return hAverageParametersMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHAverageParametersMetric(HAverageParametersMetric newHAverageParametersMetric) {
		HAverageParametersMetric oldHAverageParametersMetric = hAverageParametersMetric;
		hAverageParametersMetric = newHAverageParametersMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodesmellsPackage.HMANY_PARAMETERS_CODE_SMELL__HAVERAGE_PARAMETERS_METRIC,
					oldHAverageParametersMetric, hAverageParametersMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HMANY_PARAMETERS_CODE_SMELL__HAVERAGE_PARAMETERS_METRIC:
			if (resolve)
				return getHAverageParametersMetric();
			return basicGetHAverageParametersMetric();
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
		case CodesmellsPackage.HMANY_PARAMETERS_CODE_SMELL__HAVERAGE_PARAMETERS_METRIC:
			setHAverageParametersMetric((HAverageParametersMetric) newValue);
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
		case CodesmellsPackage.HMANY_PARAMETERS_CODE_SMELL__HAVERAGE_PARAMETERS_METRIC:
			setHAverageParametersMetric((HAverageParametersMetric) null);
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
		case CodesmellsPackage.HMANY_PARAMETERS_CODE_SMELL__HAVERAGE_PARAMETERS_METRIC:
			return hAverageParametersMetric != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());

		TreeItem item_parameter = new TreeItem(item, style);
		getHAverageParametersMetric().getTreeItem(item_parameter, style);
		return item;
	}

	// [user code injected with eMoflon] -->
} //HManyParametersCodeSmellImpl
