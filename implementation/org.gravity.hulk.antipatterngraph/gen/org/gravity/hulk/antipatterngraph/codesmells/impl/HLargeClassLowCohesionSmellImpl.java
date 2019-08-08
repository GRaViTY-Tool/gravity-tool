/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell;

import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TClass;
import org.eclipse.swt.widgets.TreeItem;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLarge Class Low Cohesion Smell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HLargeClassLowCohesionSmellImpl#getHLowCohesionSmell <em>HLow Cohesion Smell</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HLargeClassLowCohesionSmellImpl#getHLargeClassSmell <em>HLarge Class Smell</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLargeClassLowCohesionSmellImpl extends HCodeSmellImpl implements HLargeClassLowCohesionSmell {
	/**
	 * The cached value of the '{@link #getHLowCohesionSmell() <em>HLow Cohesion Smell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHLowCohesionSmell()
	 * @generated
	 * @ordered
	 */
	protected HLowCohesionSmell hLowCohesionSmell;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLargeClassLowCohesionSmellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HLARGE_CLASS_LOW_COHESION_SMELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLowCohesionSmell getHLowCohesionSmell() {
		if (hLowCohesionSmell != null && hLowCohesionSmell.eIsProxy()) {
			InternalEObject oldHLowCohesionSmell = (InternalEObject) hLowCohesionSmell;
			hLowCohesionSmell = (HLowCohesionSmell) eResolveProxy(oldHLowCohesionSmell);
			if (hLowCohesionSmell != oldHLowCohesionSmell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL__HLOW_COHESION_SMELL,
							oldHLowCohesionSmell, hLowCohesionSmell));
			}
		}
		return hLowCohesionSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLowCohesionSmell basicGetHLowCohesionSmell() {
		return hLowCohesionSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHLowCohesionSmell(HLowCohesionSmell newHLowCohesionSmell) {
		HLowCohesionSmell oldHLowCohesionSmell = hLowCohesionSmell;
		hLowCohesionSmell = newHLowCohesionSmell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL__HLOW_COHESION_SMELL, oldHLowCohesionSmell,
					hLowCohesionSmell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLargeClassSmell getHLargeClassSmell() {
		if (hLargeClassSmell != null && hLargeClassSmell.eIsProxy()) {
			InternalEObject oldHLargeClassSmell = (InternalEObject) hLargeClassSmell;
			hLargeClassSmell = (HLargeClassSmell) eResolveProxy(oldHLargeClassSmell);
			if (hLargeClassSmell != oldHLargeClassSmell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL__HLARGE_CLASS_SMELL, oldHLargeClassSmell,
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
	public void setHLargeClassSmell(HLargeClassSmell newHLargeClassSmell) {
		HLargeClassSmell oldHLargeClassSmell = hLargeClassSmell;
		hLargeClassSmell = newHLargeClassSmell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL__HLARGE_CLASS_SMELL, oldHLargeClassSmell,
					hLargeClassSmell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL__HLOW_COHESION_SMELL:
			if (resolve)
				return getHLowCohesionSmell();
			return basicGetHLowCohesionSmell();
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL__HLARGE_CLASS_SMELL:
			if (resolve)
				return getHLargeClassSmell();
			return basicGetHLargeClassSmell();
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
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL__HLOW_COHESION_SMELL:
			setHLowCohesionSmell((HLowCohesionSmell) newValue);
			return;
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL__HLARGE_CLASS_SMELL:
			setHLargeClassSmell((HLargeClassSmell) newValue);
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
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL__HLOW_COHESION_SMELL:
			setHLowCohesionSmell((HLowCohesionSmell) null);
			return;
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL__HLARGE_CLASS_SMELL:
			setHLargeClassSmell((HLargeClassSmell) null);
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
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL__HLOW_COHESION_SMELL:
			return hLowCohesionSmell != null;
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL__HLARGE_CLASS_SMELL:
			return hLargeClassSmell != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());

		HLargeClassSmell large_class = getHLargeClassSmell();
		if (large_class != null) {
			TreeItem treeItem = new TreeItem(item, style);
			treeItem.setText("LargeClass Smell");
			large_class.getTreeItem(treeItem, style);
		}

		HLowCohesionSmell low_cohesion = getHLowCohesionSmell();
		if (low_cohesion != null) {
			TreeItem treeItem = new TreeItem(item, style);
			treeItem.setText("LowCohesion Smell");
			low_cohesion.getTreeItem(treeItem, style);
		}

		return item;
	}

	// [user code injected with eMoflon] -->
} //HLargeClassLowCohesionSmellImpl
