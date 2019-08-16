/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell;

import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;

import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLow Cohesion Smell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HLowCohesionSmellImpl#getHLCOM5CustomMetric <em>HLCOM5 Custom Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HLowCohesionSmellImpl extends HCodeSmellImpl implements HLowCohesionSmell {
	/**
	 * The cached value of the '{@link #getHLCOM5CustomMetric() <em>HLCOM5 Custom Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHLCOM5CustomMetric()
	 * @generated
	 * @ordered
	 */
	protected HLCOM5Metric hLCOM5CustomMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLowCohesionSmellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HLOW_COHESION_SMELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLCOM5Metric getHLCOM5CustomMetric() {
		if (hLCOM5CustomMetric != null && hLCOM5CustomMetric.eIsProxy()) {
			InternalEObject oldHLCOM5CustomMetric = (InternalEObject) hLCOM5CustomMetric;
			hLCOM5CustomMetric = (HLCOM5Metric) eResolveProxy(oldHLCOM5CustomMetric);
			if (hLCOM5CustomMetric != oldHLCOM5CustomMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodesmellsPackage.HLOW_COHESION_SMELL__HLCOM5_CUSTOM_METRIC, oldHLCOM5CustomMetric,
							hLCOM5CustomMetric));
			}
		}
		return hLCOM5CustomMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLCOM5Metric basicGetHLCOM5CustomMetric() {
		return hLCOM5CustomMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHLCOM5CustomMetric(HLCOM5Metric newHLCOM5CustomMetric) {
		HLCOM5Metric oldHLCOM5CustomMetric = hLCOM5CustomMetric;
		hLCOM5CustomMetric = newHLCOM5CustomMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodesmellsPackage.HLOW_COHESION_SMELL__HLCOM5_CUSTOM_METRIC, oldHLCOM5CustomMetric,
					hLCOM5CustomMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HLOW_COHESION_SMELL__HLCOM5_CUSTOM_METRIC:
			if (resolve)
				return getHLCOM5CustomMetric();
			return basicGetHLCOM5CustomMetric();
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
		case CodesmellsPackage.HLOW_COHESION_SMELL__HLCOM5_CUSTOM_METRIC:
			setHLCOM5CustomMetric((HLCOM5Metric) newValue);
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
		case CodesmellsPackage.HLOW_COHESION_SMELL__HLCOM5_CUSTOM_METRIC:
			setHLCOM5CustomMetric((HLCOM5Metric) null);
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
		case CodesmellsPackage.HLOW_COHESION_SMELL__HLCOM5_CUSTOM_METRIC:
			return hLCOM5CustomMetric != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());
		getHLCOM5CustomMetric().getTreeItem(item, style);
		return item;
	}

	// [user code injected with eMoflon] -->
} //HLowCohesionSmellImpl
