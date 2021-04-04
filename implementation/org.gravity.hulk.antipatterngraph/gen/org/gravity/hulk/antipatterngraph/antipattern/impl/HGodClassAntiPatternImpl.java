/**
 */
package org.gravity.hulk.antipatterngraph.antipattern.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;
import org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern;

import org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell;

import org.gravity.hulk.antipatterngraph.impl.HAntiPatternImpl;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.antipatterngraph.HCodeSmell;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HGod
 * Class Anti Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HGodClassAntiPatternImpl#getHLargeClassLowCohesionSmells
 * <em>HLarge Class Low Cohesion Smells</em>}</li>
 * <li>{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HGodClassAntiPatternImpl#getHControllerClassSmell
 * <em>HController Class Smell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGodClassAntiPatternImpl extends HAntiPatternImpl implements HGodClassAntiPattern {
	/**
	 * The cached value of the '{@link #getHLargeClassLowCohesionSmells() <em>HLarge
	 * Class Low Cohesion Smells</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getHLargeClassLowCohesionSmells()
	 * @generated
	 * @ordered
	 */
	protected EList<HCodeSmell> hLargeClassLowCohesionSmells;

	/**
	 * The cached value of the '{@link #getHControllerClassSmell() <em>HController
	 * Class Smell</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHControllerClassSmell()
	 * @generated
	 * @ordered
	 */
	protected HControllerClassSmell hControllerClassSmell;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HGodClassAntiPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HGOD_CLASS_ANTI_PATTERN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<HCodeSmell> getHLargeClassLowCohesionSmells() {
		if (hLargeClassLowCohesionSmells == null) {
			hLargeClassLowCohesionSmells = new EObjectResolvingEList<HCodeSmell>(HCodeSmell.class, this,
					AntipatternPackage.HGOD_CLASS_ANTI_PATTERN__HLARGE_CLASS_LOW_COHESION_SMELLS);
		}
		return hLargeClassLowCohesionSmells;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public HControllerClassSmell getHControllerClassSmell() {
		if (hControllerClassSmell != null && hControllerClassSmell.eIsProxy()) {
			InternalEObject oldHControllerClassSmell = (InternalEObject) hControllerClassSmell;
			hControllerClassSmell = (HControllerClassSmell) eResolveProxy(oldHControllerClassSmell);
			if (hControllerClassSmell != oldHControllerClassSmell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AntipatternPackage.HGOD_CLASS_ANTI_PATTERN__HCONTROLLER_CLASS_SMELL,
							oldHControllerClassSmell, hControllerClassSmell));
			}
		}
		return hControllerClassSmell;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HControllerClassSmell basicGetHControllerClassSmell() {
		return hControllerClassSmell;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHControllerClassSmell(HControllerClassSmell newHControllerClassSmell) {
		HControllerClassSmell oldHControllerClassSmell = hControllerClassSmell;
		hControllerClassSmell = newHControllerClassSmell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AntipatternPackage.HGOD_CLASS_ANTI_PATTERN__HCONTROLLER_CLASS_SMELL, oldHControllerClassSmell,
					hControllerClassSmell));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AntipatternPackage.HGOD_CLASS_ANTI_PATTERN__HLARGE_CLASS_LOW_COHESION_SMELLS:
			return getHLargeClassLowCohesionSmells();
		case AntipatternPackage.HGOD_CLASS_ANTI_PATTERN__HCONTROLLER_CLASS_SMELL:
			if (resolve)
				return getHControllerClassSmell();
			return basicGetHControllerClassSmell();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AntipatternPackage.HGOD_CLASS_ANTI_PATTERN__HLARGE_CLASS_LOW_COHESION_SMELLS:
			getHLargeClassLowCohesionSmells().clear();
			getHLargeClassLowCohesionSmells().addAll((Collection<? extends HCodeSmell>) newValue);
			return;
		case AntipatternPackage.HGOD_CLASS_ANTI_PATTERN__HCONTROLLER_CLASS_SMELL:
			setHControllerClassSmell((HControllerClassSmell) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AntipatternPackage.HGOD_CLASS_ANTI_PATTERN__HLARGE_CLASS_LOW_COHESION_SMELLS:
			getHLargeClassLowCohesionSmells().clear();
			return;
		case AntipatternPackage.HGOD_CLASS_ANTI_PATTERN__HCONTROLLER_CLASS_SMELL:
			setHControllerClassSmell((HControllerClassSmell) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AntipatternPackage.HGOD_CLASS_ANTI_PATTERN__HLARGE_CLASS_LOW_COHESION_SMELLS:
			return hLargeClassLowCohesionSmells != null && !hLargeClassLowCohesionSmells.isEmpty();
		case AntipatternPackage.HGOD_CLASS_ANTI_PATTERN__HCONTROLLER_CLASS_SMELL:
			return hControllerClassSmell != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());

		HControllerClassSmell controller = getHControllerClassSmell();
		if (controller != null) {
			TreeItem treeItem = new TreeItem(item, style);
			treeItem.setText("ControllerClass Smell");
			controller.getTreeItem(treeItem, style);
		}

		EList<HCodeSmell> largeClasLowCohesion = getHLargeClassLowCohesionSmells();
		if (largeClasLowCohesion != null) {
			for (HCodeSmell smell : largeClasLowCohesion) {
				TreeItem treeItem = new TreeItem(item, style);
				treeItem.setText("LargeClassLowCohesion Smell");
				smell.getTreeItem(treeItem, style);
			}
		}

		return item;
	}

	// [user code injected with eMoflon] -->
} // HGodClassAntiPatternImpl
