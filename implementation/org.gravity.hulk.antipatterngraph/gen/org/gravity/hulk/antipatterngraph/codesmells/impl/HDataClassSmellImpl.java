/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell;

import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;

import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HData Class Smell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HDataClassSmellImpl#getGetterSetterSmells <em>Getter Setter Smells</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HDataClassSmellImpl#getHNACCMetric <em>HNACC Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HDataClassSmellImpl extends HCodeSmellImpl implements HDataClassSmell {
	/**
	 * The cached value of the '{@link #getGetterSetterSmells() <em>Getter Setter Smells</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterSetterSmells()
	 * @generated
	 * @ordered
	 */
	protected EList<HGetterSetterSmell> getterSetterSmells;

	/**
	 * The cached value of the '{@link #getHNACCMetric() <em>HNACC Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHNACCMetric()
	 * @generated
	 * @ordered
	 */
	protected HNACCMetric hNACCMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDataClassSmellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HDATA_CLASS_SMELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HGetterSetterSmell> getGetterSetterSmells() {
		if (getterSetterSmells == null) {
			getterSetterSmells = new EObjectResolvingEList<HGetterSetterSmell>(HGetterSetterSmell.class, this,
					CodesmellsPackage.HDATA_CLASS_SMELL__GETTER_SETTER_SMELLS);
		}
		return getterSetterSmells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HNACCMetric getHNACCMetric() {
		if (hNACCMetric != null && hNACCMetric.eIsProxy()) {
			InternalEObject oldHNACCMetric = (InternalEObject) hNACCMetric;
			hNACCMetric = (HNACCMetric) eResolveProxy(oldHNACCMetric);
			if (hNACCMetric != oldHNACCMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodesmellsPackage.HDATA_CLASS_SMELL__HNACC_METRIC, oldHNACCMetric, hNACCMetric));
			}
		}
		return hNACCMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNACCMetric basicGetHNACCMetric() {
		return hNACCMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHNACCMetric(HNACCMetric newHNACCMetric) {
		HNACCMetric oldHNACCMetric = hNACCMetric;
		hNACCMetric = newHNACCMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodesmellsPackage.HDATA_CLASS_SMELL__HNACC_METRIC,
					oldHNACCMetric, hNACCMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HDATA_CLASS_SMELL__GETTER_SETTER_SMELLS:
			return getGetterSetterSmells();
		case CodesmellsPackage.HDATA_CLASS_SMELL__HNACC_METRIC:
			if (resolve)
				return getHNACCMetric();
			return basicGetHNACCMetric();
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
		case CodesmellsPackage.HDATA_CLASS_SMELL__GETTER_SETTER_SMELLS:
			getGetterSetterSmells().clear();
			getGetterSetterSmells().addAll((Collection<? extends HGetterSetterSmell>) newValue);
			return;
		case CodesmellsPackage.HDATA_CLASS_SMELL__HNACC_METRIC:
			setHNACCMetric((HNACCMetric) newValue);
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
		case CodesmellsPackage.HDATA_CLASS_SMELL__GETTER_SETTER_SMELLS:
			getGetterSetterSmells().clear();
			return;
		case CodesmellsPackage.HDATA_CLASS_SMELL__HNACC_METRIC:
			setHNACCMetric((HNACCMetric) null);
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
		case CodesmellsPackage.HDATA_CLASS_SMELL__GETTER_SETTER_SMELLS:
			return getterSetterSmells != null && !getterSetterSmells.isEmpty();
		case CodesmellsPackage.HDATA_CLASS_SMELL__HNACC_METRIC:
			return hNACCMetric != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());

		if (getHNACCMetric() != null) {
			TreeItem nacc = getHNACCMetric().getTreeItem(item, style);
			for (HGetterSetterSmell gs : getGetterSetterSmells()) {
				gs.getTreeItem(nacc, style);
			}
		}
		return item;
	}

	// [user code injected with eMoflon] -->
} //HDataClassSmellImpl
