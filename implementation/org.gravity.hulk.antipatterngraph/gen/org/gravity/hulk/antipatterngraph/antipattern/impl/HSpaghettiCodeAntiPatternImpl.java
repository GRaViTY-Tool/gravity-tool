/**
 */
package org.gravity.hulk.antipatterngraph.antipattern.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;
import org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern;

import org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell;

import org.gravity.hulk.antipatterngraph.impl.HAntiPatternImpl;

import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric;
// <-- [user defined imports]
import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSpaghetti Code Anti Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HSpaghettiCodeAntiPatternImpl#getHDepthOfInheritanceMetric <em>HDepth Of Inheritance Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HSpaghettiCodeAntiPatternImpl#getHIntenseFieldUsageCodeSmell <em>HIntense Field Usage Code Smell</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HSpaghettiCodeAntiPatternImpl#getHAverageOverloadingInClassMetric <em>HAverage Overloading In Class Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HSpaghettiCodeAntiPatternImpl#getHAverageParametersMetric <em>HAverage Parameters Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HSpaghettiCodeAntiPatternImpl#getHNumberOfChild <em>HNumber Of Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HSpaghettiCodeAntiPatternImpl extends HAntiPatternImpl implements HSpaghettiCodeAntiPattern {
	/**
	 * The cached value of the '{@link #getHDepthOfInheritanceMetric() <em>HDepth Of Inheritance Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHDepthOfInheritanceMetric()
	 * @generated
	 * @ordered
	 */
	protected HDepthOfInheritanceMetric hDepthOfInheritanceMetric;

	/**
	 * The cached value of the '{@link #getHIntenseFieldUsageCodeSmell() <em>HIntense Field Usage Code Smell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIntenseFieldUsageCodeSmell()
	 * @generated
	 * @ordered
	 */
	protected HIntenseFieldUsageCodeSmell hIntenseFieldUsageCodeSmell;

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
	 * The cached value of the '{@link #getHAverageParametersMetric() <em>HAverage Parameters Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHAverageParametersMetric()
	 * @generated
	 * @ordered
	 */
	protected HAverageParametersMetric hAverageParametersMetric;

	/**
	 * The cached value of the '{@link #getHNumberOfChild() <em>HNumber Of Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHNumberOfChild()
	 * @generated
	 * @ordered
	 */
	protected HNumberOfChildMetric hNumberOfChild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HSpaghettiCodeAntiPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HSPAGHETTI_CODE_ANTI_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDepthOfInheritanceMetric getHDepthOfInheritanceMetric() {
		if (hDepthOfInheritanceMetric != null && hDepthOfInheritanceMetric.eIsProxy()) {
			InternalEObject oldHDepthOfInheritanceMetric = (InternalEObject) hDepthOfInheritanceMetric;
			hDepthOfInheritanceMetric = (HDepthOfInheritanceMetric) eResolveProxy(oldHDepthOfInheritanceMetric);
			if (hDepthOfInheritanceMetric != oldHDepthOfInheritanceMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HDEPTH_OF_INHERITANCE_METRIC,
							oldHDepthOfInheritanceMetric, hDepthOfInheritanceMetric));
			}
		}
		return hDepthOfInheritanceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDepthOfInheritanceMetric basicGetHDepthOfInheritanceMetric() {
		return hDepthOfInheritanceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHDepthOfInheritanceMetric(HDepthOfInheritanceMetric newHDepthOfInheritanceMetric) {
		HDepthOfInheritanceMetric oldHDepthOfInheritanceMetric = hDepthOfInheritanceMetric;
		hDepthOfInheritanceMetric = newHDepthOfInheritanceMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HDEPTH_OF_INHERITANCE_METRIC,
					oldHDepthOfInheritanceMetric, hDepthOfInheritanceMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HIntenseFieldUsageCodeSmell getHIntenseFieldUsageCodeSmell() {
		if (hIntenseFieldUsageCodeSmell != null && hIntenseFieldUsageCodeSmell.eIsProxy()) {
			InternalEObject oldHIntenseFieldUsageCodeSmell = (InternalEObject) hIntenseFieldUsageCodeSmell;
			hIntenseFieldUsageCodeSmell = (HIntenseFieldUsageCodeSmell) eResolveProxy(oldHIntenseFieldUsageCodeSmell);
			if (hIntenseFieldUsageCodeSmell != oldHIntenseFieldUsageCodeSmell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HINTENSE_FIELD_USAGE_CODE_SMELL,
							oldHIntenseFieldUsageCodeSmell, hIntenseFieldUsageCodeSmell));
			}
		}
		return hIntenseFieldUsageCodeSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HIntenseFieldUsageCodeSmell basicGetHIntenseFieldUsageCodeSmell() {
		return hIntenseFieldUsageCodeSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHIntenseFieldUsageCodeSmell(HIntenseFieldUsageCodeSmell newHIntenseFieldUsageCodeSmell) {
		HIntenseFieldUsageCodeSmell oldHIntenseFieldUsageCodeSmell = hIntenseFieldUsageCodeSmell;
		hIntenseFieldUsageCodeSmell = newHIntenseFieldUsageCodeSmell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HINTENSE_FIELD_USAGE_CODE_SMELL,
					oldHIntenseFieldUsageCodeSmell, hIntenseFieldUsageCodeSmell));
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
							AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_OVERLOADING_IN_CLASS_METRIC,
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
					AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_OVERLOADING_IN_CLASS_METRIC,
					oldHAverageOverloadingInClassMetric, hAverageOverloadingInClassMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAverageParametersMetric getHAverageParametersMetric() {
		if (hAverageParametersMetric != null && hAverageParametersMetric.eIsProxy()) {
			InternalEObject oldHAverageParametersMetric = (InternalEObject) hAverageParametersMetric;
			hAverageParametersMetric = (HAverageParametersMetric) eResolveProxy(oldHAverageParametersMetric);
			if (hAverageParametersMetric != oldHAverageParametersMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_PARAMETERS_METRIC,
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
	public void setHAverageParametersMetric(HAverageParametersMetric newHAverageParametersMetric) {
		HAverageParametersMetric oldHAverageParametersMetric = hAverageParametersMetric;
		hAverageParametersMetric = newHAverageParametersMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_PARAMETERS_METRIC,
					oldHAverageParametersMetric, hAverageParametersMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfChildMetric getHNumberOfChild() {
		if (hNumberOfChild != null && hNumberOfChild.eIsProxy()) {
			InternalEObject oldHNumberOfChild = (InternalEObject) hNumberOfChild;
			hNumberOfChild = (HNumberOfChildMetric) eResolveProxy(oldHNumberOfChild);
			if (hNumberOfChild != oldHNumberOfChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HNUMBER_OF_CHILD, oldHNumberOfChild,
							hNumberOfChild));
			}
		}
		return hNumberOfChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfChildMetric basicGetHNumberOfChild() {
		return hNumberOfChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHNumberOfChild(HNumberOfChildMetric newHNumberOfChild) {
		HNumberOfChildMetric oldHNumberOfChild = hNumberOfChild;
		hNumberOfChild = newHNumberOfChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HNUMBER_OF_CHILD, oldHNumberOfChild,
					hNumberOfChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HDEPTH_OF_INHERITANCE_METRIC:
			if (resolve)
				return getHDepthOfInheritanceMetric();
			return basicGetHDepthOfInheritanceMetric();
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HINTENSE_FIELD_USAGE_CODE_SMELL:
			if (resolve)
				return getHIntenseFieldUsageCodeSmell();
			return basicGetHIntenseFieldUsageCodeSmell();
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_OVERLOADING_IN_CLASS_METRIC:
			if (resolve)
				return getHAverageOverloadingInClassMetric();
			return basicGetHAverageOverloadingInClassMetric();
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_PARAMETERS_METRIC:
			if (resolve)
				return getHAverageParametersMetric();
			return basicGetHAverageParametersMetric();
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HNUMBER_OF_CHILD:
			if (resolve)
				return getHNumberOfChild();
			return basicGetHNumberOfChild();
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
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HDEPTH_OF_INHERITANCE_METRIC:
			setHDepthOfInheritanceMetric((HDepthOfInheritanceMetric) newValue);
			return;
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HINTENSE_FIELD_USAGE_CODE_SMELL:
			setHIntenseFieldUsageCodeSmell((HIntenseFieldUsageCodeSmell) newValue);
			return;
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_OVERLOADING_IN_CLASS_METRIC:
			setHAverageOverloadingInClassMetric((HAverageOverloadingInClassMetric) newValue);
			return;
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_PARAMETERS_METRIC:
			setHAverageParametersMetric((HAverageParametersMetric) newValue);
			return;
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HNUMBER_OF_CHILD:
			setHNumberOfChild((HNumberOfChildMetric) newValue);
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
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HDEPTH_OF_INHERITANCE_METRIC:
			setHDepthOfInheritanceMetric((HDepthOfInheritanceMetric) null);
			return;
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HINTENSE_FIELD_USAGE_CODE_SMELL:
			setHIntenseFieldUsageCodeSmell((HIntenseFieldUsageCodeSmell) null);
			return;
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_OVERLOADING_IN_CLASS_METRIC:
			setHAverageOverloadingInClassMetric((HAverageOverloadingInClassMetric) null);
			return;
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_PARAMETERS_METRIC:
			setHAverageParametersMetric((HAverageParametersMetric) null);
			return;
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HNUMBER_OF_CHILD:
			setHNumberOfChild((HNumberOfChildMetric) null);
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
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HDEPTH_OF_INHERITANCE_METRIC:
			return hDepthOfInheritanceMetric != null;
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HINTENSE_FIELD_USAGE_CODE_SMELL:
			return hIntenseFieldUsageCodeSmell != null;
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_OVERLOADING_IN_CLASS_METRIC:
			return hAverageOverloadingInClassMetric != null;
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_PARAMETERS_METRIC:
			return hAverageParametersMetric != null;
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN__HNUMBER_OF_CHILD:
			return hNumberOfChild != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());

		HAverageOverloadingInClassMetric overloading = getHAverageOverloadingInClassMetric();
		if (overloading != null) {
			overloading.getTreeItem(item, style);
		}
		HAverageParametersMetric parameter = getHAverageParametersMetric();
		if (parameter != null) {
			parameter.getTreeItem(item, style);
		}
		HDepthOfInheritanceMetric inheritance = getHDepthOfInheritanceMetric();
		if (inheritance != null) {
			inheritance.getTreeItem(item, style);
		}
		HNumberOfChildMetric child = getHNumberOfChild();
		if (child != null) {
			child.getTreeItem(item, style);
		}
		HIntenseFieldUsageCodeSmell field = getHIntenseFieldUsageCodeSmell();
		if (field != null) {
			TreeItem new_item = new TreeItem(item, style);
			new_item.setText("Intense Field Usage");
			field.getTreeItem(new_item, style);
		}
		return item;
	}

	// [user code injected with eMoflon] -->
} //HSpaghettiCodeAntiPatternImpl
