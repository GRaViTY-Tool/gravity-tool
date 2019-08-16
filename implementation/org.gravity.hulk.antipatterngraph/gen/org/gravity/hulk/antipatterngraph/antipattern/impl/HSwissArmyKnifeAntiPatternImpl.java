/**
 */
package org.gravity.hulk.antipatterngraph.antipattern.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;
import org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell;
import org.gravity.hulk.antipatterngraph.impl.HAntiPatternImpl;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSwiss Army Knife Anti Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HSwissArmyKnifeAntiPatternImpl#getHIncommingInvocationCustomMetric <em>HIncomming Invocation Custom Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HSwissArmyKnifeAntiPatternImpl#getHLargeClassSmell <em>HLarge Class Smell</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HSwissArmyKnifeAntiPatternImpl#getHMuchOverloadingCodeSmell <em>HMuch Overloading Code Smell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HSwissArmyKnifeAntiPatternImpl extends HAntiPatternImpl implements HSwissArmyKnifeAntiPattern {
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
	 * The cached value of the '{@link #getHLargeClassSmell() <em>HLarge Class Smell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHLargeClassSmell()
	 * @generated
	 * @ordered
	 */
	protected HLargeClassSmell hLargeClassSmell;

	/**
	 * The cached value of the '{@link #getHMuchOverloadingCodeSmell() <em>HMuch Overloading Code Smell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHMuchOverloadingCodeSmell()
	 * @generated
	 * @ordered
	 */
	protected HMuchOverloadingCodeSmell hMuchOverloadingCodeSmell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HSwissArmyKnifeAntiPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HSWISS_ARMY_KNIFE_ANTI_PATTERN;
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
							AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HINCOMMING_INVOCATION_CUSTOM_METRIC,
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
					AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HINCOMMING_INVOCATION_CUSTOM_METRIC,
					oldHIncommingInvocationCustomMetric, hIncommingInvocationCustomMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLargeClassSmell getHLargeClassSmell() {
		if (hLargeClassSmell != null && hLargeClassSmell.eIsProxy()) {
			InternalEObject oldHLargeClassSmell = (InternalEObject) hLargeClassSmell;
			hLargeClassSmell = (HLargeClassSmell) eResolveProxy(oldHLargeClassSmell);
			if (hLargeClassSmell != oldHLargeClassSmell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HLARGE_CLASS_SMELL, oldHLargeClassSmell,
							hLargeClassSmell));
			}
		}
		return hLargeClassSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLargeClassSmell basicGetHLargeClassSmell() {
		return hLargeClassSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHLargeClassSmell(HLargeClassSmell newHLargeClassSmell) {
		HLargeClassSmell oldHLargeClassSmell = hLargeClassSmell;
		hLargeClassSmell = newHLargeClassSmell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HLARGE_CLASS_SMELL, oldHLargeClassSmell,
					hLargeClassSmell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HMuchOverloadingCodeSmell getHMuchOverloadingCodeSmell() {
		if (hMuchOverloadingCodeSmell != null && hMuchOverloadingCodeSmell.eIsProxy()) {
			InternalEObject oldHMuchOverloadingCodeSmell = (InternalEObject) hMuchOverloadingCodeSmell;
			hMuchOverloadingCodeSmell = (HMuchOverloadingCodeSmell) eResolveProxy(oldHMuchOverloadingCodeSmell);
			if (hMuchOverloadingCodeSmell != oldHMuchOverloadingCodeSmell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HMUCH_OVERLOADING_CODE_SMELL,
							oldHMuchOverloadingCodeSmell, hMuchOverloadingCodeSmell));
			}
		}
		return hMuchOverloadingCodeSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMuchOverloadingCodeSmell basicGetHMuchOverloadingCodeSmell() {
		return hMuchOverloadingCodeSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHMuchOverloadingCodeSmell(HMuchOverloadingCodeSmell newHMuchOverloadingCodeSmell) {
		HMuchOverloadingCodeSmell oldHMuchOverloadingCodeSmell = hMuchOverloadingCodeSmell;
		hMuchOverloadingCodeSmell = newHMuchOverloadingCodeSmell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HMUCH_OVERLOADING_CODE_SMELL,
					oldHMuchOverloadingCodeSmell, hMuchOverloadingCodeSmell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HINCOMMING_INVOCATION_CUSTOM_METRIC:
			if (resolve)
				return getHIncommingInvocationCustomMetric();
			return basicGetHIncommingInvocationCustomMetric();
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HLARGE_CLASS_SMELL:
			if (resolve)
				return getHLargeClassSmell();
			return basicGetHLargeClassSmell();
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HMUCH_OVERLOADING_CODE_SMELL:
			if (resolve)
				return getHMuchOverloadingCodeSmell();
			return basicGetHMuchOverloadingCodeSmell();
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
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HINCOMMING_INVOCATION_CUSTOM_METRIC:
			setHIncommingInvocationCustomMetric((HIncommingInvocationMetric) newValue);
			return;
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HLARGE_CLASS_SMELL:
			setHLargeClassSmell((HLargeClassSmell) newValue);
			return;
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HMUCH_OVERLOADING_CODE_SMELL:
			setHMuchOverloadingCodeSmell((HMuchOverloadingCodeSmell) newValue);
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
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HINCOMMING_INVOCATION_CUSTOM_METRIC:
			setHIncommingInvocationCustomMetric((HIncommingInvocationMetric) null);
			return;
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HLARGE_CLASS_SMELL:
			setHLargeClassSmell((HLargeClassSmell) null);
			return;
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HMUCH_OVERLOADING_CODE_SMELL:
			setHMuchOverloadingCodeSmell((HMuchOverloadingCodeSmell) null);
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
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HINCOMMING_INVOCATION_CUSTOM_METRIC:
			return hIncommingInvocationCustomMetric != null;
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HLARGE_CLASS_SMELL:
			return hLargeClassSmell != null;
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN__HMUCH_OVERLOADING_CODE_SMELL:
			return hMuchOverloadingCodeSmell != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());

		TreeItem item_large = new TreeItem(item, style);
		item_large.setText("Large Class Code Smell");
		getHLargeClassSmell().createItemContents(item_large, style);

		TreeItem item_over = new TreeItem(item, style);
		item_over.setText("Much Overloading Code Smell");
		getHMuchOverloadingCodeSmell().createItemContents(item_over, style);

		TreeItem item_invoc = new TreeItem(item, style);
		item_invoc.setText("Many Incoming Invocations");
		getHIncommingInvocationCustomMetric().createItemContents(item_invoc, style);

		return item;
	}

	// [user code injected with eMoflon] -->
} //HSwissArmyKnifeAntiPatternImpl
