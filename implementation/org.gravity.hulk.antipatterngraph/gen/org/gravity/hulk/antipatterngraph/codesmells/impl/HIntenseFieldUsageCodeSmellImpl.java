/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell;

import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;

import org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIntense Field Usage Code Smell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HIntenseFieldUsageCodeSmellImpl#getHLocalAccessRelationMetric <em>HLocal Access Relation Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HIntenseFieldUsageCodeSmellImpl extends HCodeSmellImpl implements HIntenseFieldUsageCodeSmell {
	/**
	 * The cached value of the '{@link #getHLocalAccessRelationMetric() <em>HLocal Access Relation Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHLocalAccessRelationMetric()
	 * @generated
	 * @ordered
	 */
	protected HLocalAccessRelationMetric hLocalAccessRelationMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HIntenseFieldUsageCodeSmellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HINTENSE_FIELD_USAGE_CODE_SMELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalAccessRelationMetric getHLocalAccessRelationMetric() {
		if (hLocalAccessRelationMetric != null && hLocalAccessRelationMetric.eIsProxy()) {
			InternalEObject oldHLocalAccessRelationMetric = (InternalEObject) hLocalAccessRelationMetric;
			hLocalAccessRelationMetric = (HLocalAccessRelationMetric) eResolveProxy(oldHLocalAccessRelationMetric);
			if (hLocalAccessRelationMetric != oldHLocalAccessRelationMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodesmellsPackage.HINTENSE_FIELD_USAGE_CODE_SMELL__HLOCAL_ACCESS_RELATION_METRIC,
							oldHLocalAccessRelationMetric, hLocalAccessRelationMetric));
			}
		}
		return hLocalAccessRelationMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalAccessRelationMetric basicGetHLocalAccessRelationMetric() {
		return hLocalAccessRelationMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHLocalAccessRelationMetric(HLocalAccessRelationMetric newHLocalAccessRelationMetric) {
		HLocalAccessRelationMetric oldHLocalAccessRelationMetric = hLocalAccessRelationMetric;
		hLocalAccessRelationMetric = newHLocalAccessRelationMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodesmellsPackage.HINTENSE_FIELD_USAGE_CODE_SMELL__HLOCAL_ACCESS_RELATION_METRIC,
					oldHLocalAccessRelationMetric, hLocalAccessRelationMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_CODE_SMELL__HLOCAL_ACCESS_RELATION_METRIC:
			if (resolve)
				return getHLocalAccessRelationMetric();
			return basicGetHLocalAccessRelationMetric();
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
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_CODE_SMELL__HLOCAL_ACCESS_RELATION_METRIC:
			setHLocalAccessRelationMetric((HLocalAccessRelationMetric) newValue);
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
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_CODE_SMELL__HLOCAL_ACCESS_RELATION_METRIC:
			setHLocalAccessRelationMetric((HLocalAccessRelationMetric) null);
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
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_CODE_SMELL__HLOCAL_ACCESS_RELATION_METRIC:
			return hLocalAccessRelationMetric != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());

		getHLocalAccessRelationMetric().getTreeItem(item, style);
		return item;
	}

	// [user code injected with eMoflon] -->
} //HIntenseFieldUsageCodeSmellImpl
