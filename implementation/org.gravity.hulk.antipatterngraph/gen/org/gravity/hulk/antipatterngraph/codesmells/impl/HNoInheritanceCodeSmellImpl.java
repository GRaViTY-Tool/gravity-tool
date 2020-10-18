/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HNoInheritanceCodeSmell;

import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HNo Inheritance Code Smell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HNoInheritanceCodeSmellImpl#getHChildClassesMetric <em>HChild Classes Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HNoInheritanceCodeSmellImpl extends HCodeSmellImpl implements HNoInheritanceCodeSmell {
	/**
	 * The cached value of the '{@link #getHChildClassesMetric() <em>HChild Classes Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHChildClassesMetric()
	 * @generated
	 * @ordered
	 */
	protected HNumberOfChildMetric hChildClassesMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HNoInheritanceCodeSmellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HNO_INHERITANCE_CODE_SMELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HNumberOfChildMetric getHChildClassesMetric() {
		if (hChildClassesMetric != null && hChildClassesMetric.eIsProxy()) {
			InternalEObject oldHChildClassesMetric = (InternalEObject) hChildClassesMetric;
			hChildClassesMetric = (HNumberOfChildMetric) eResolveProxy(oldHChildClassesMetric);
			if (hChildClassesMetric != oldHChildClassesMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodesmellsPackage.HNO_INHERITANCE_CODE_SMELL__HCHILD_CLASSES_METRIC, oldHChildClassesMetric,
							hChildClassesMetric));
			}
		}
		return hChildClassesMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfChildMetric basicGetHChildClassesMetric() {
		return hChildClassesMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHChildClassesMetric(HNumberOfChildMetric newHChildClassesMetric) {
		HNumberOfChildMetric oldHChildClassesMetric = hChildClassesMetric;
		hChildClassesMetric = newHChildClassesMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodesmellsPackage.HNO_INHERITANCE_CODE_SMELL__HCHILD_CLASSES_METRIC, oldHChildClassesMetric,
					hChildClassesMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HNO_INHERITANCE_CODE_SMELL__HCHILD_CLASSES_METRIC:
			if (resolve)
				return getHChildClassesMetric();
			return basicGetHChildClassesMetric();
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
		case CodesmellsPackage.HNO_INHERITANCE_CODE_SMELL__HCHILD_CLASSES_METRIC:
			setHChildClassesMetric((HNumberOfChildMetric) newValue);
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
		case CodesmellsPackage.HNO_INHERITANCE_CODE_SMELL__HCHILD_CLASSES_METRIC:
			setHChildClassesMetric((HNumberOfChildMetric) null);
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
		case CodesmellsPackage.HNO_INHERITANCE_CODE_SMELL__HCHILD_CLASSES_METRIC:
			return hChildClassesMetric != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		// TODO Auto-generated method stub
		return null;
	}

} //HNoInheritanceCodeSmellImpl
