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
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern;

import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;

import org.gravity.hulk.antipatterngraph.impl.HAntiPatternImpl;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HBlob Anti Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HBlobAntiPatternImpl#getHDataClassSmells <em>HData Class Smells</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HBlobAntiPatternImpl#getHGodClassAntiPattern <em>HGod Class Anti Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HBlobAntiPatternImpl extends HAntiPatternImpl implements HBlobAntiPattern {
	/**
	 * The cached value of the '{@link #getHDataClassSmells() <em>HData Class Smells</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHDataClassSmells()
	 * @generated
	 * @ordered
	 */
	protected EList<HDataClassSmell> hDataClassSmells;

	/**
	 * The cached value of the '{@link #getHGodClassAntiPattern() <em>HGod Class Anti Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHGodClassAntiPattern()
	 * @generated
	 * @ordered
	 */
	protected HGodClassAntiPattern hGodClassAntiPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HBlobAntiPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HBLOB_ANTI_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HDataClassSmell> getHDataClassSmells() {
		if (hDataClassSmells == null) {
			hDataClassSmells = new EObjectResolvingEList<HDataClassSmell>(HDataClassSmell.class, this,
					AntipatternPackage.HBLOB_ANTI_PATTERN__HDATA_CLASS_SMELLS);
		}
		return hDataClassSmells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HGodClassAntiPattern getHGodClassAntiPattern() {
		if (hGodClassAntiPattern != null && hGodClassAntiPattern.eIsProxy()) {
			InternalEObject oldHGodClassAntiPattern = (InternalEObject) hGodClassAntiPattern;
			hGodClassAntiPattern = (HGodClassAntiPattern) eResolveProxy(oldHGodClassAntiPattern);
			if (hGodClassAntiPattern != oldHGodClassAntiPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AntipatternPackage.HBLOB_ANTI_PATTERN__HGOD_CLASS_ANTI_PATTERN, oldHGodClassAntiPattern,
							hGodClassAntiPattern));
			}
		}
		return hGodClassAntiPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HGodClassAntiPattern basicGetHGodClassAntiPattern() {
		return hGodClassAntiPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHGodClassAntiPattern(HGodClassAntiPattern newHGodClassAntiPattern) {
		HGodClassAntiPattern oldHGodClassAntiPattern = hGodClassAntiPattern;
		hGodClassAntiPattern = newHGodClassAntiPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AntipatternPackage.HBLOB_ANTI_PATTERN__HGOD_CLASS_ANTI_PATTERN, oldHGodClassAntiPattern,
					hGodClassAntiPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AntipatternPackage.HBLOB_ANTI_PATTERN__HDATA_CLASS_SMELLS:
			return getHDataClassSmells();
		case AntipatternPackage.HBLOB_ANTI_PATTERN__HGOD_CLASS_ANTI_PATTERN:
			if (resolve)
				return getHGodClassAntiPattern();
			return basicGetHGodClassAntiPattern();
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
		case AntipatternPackage.HBLOB_ANTI_PATTERN__HDATA_CLASS_SMELLS:
			getHDataClassSmells().clear();
			getHDataClassSmells().addAll((Collection<? extends HDataClassSmell>) newValue);
			return;
		case AntipatternPackage.HBLOB_ANTI_PATTERN__HGOD_CLASS_ANTI_PATTERN:
			setHGodClassAntiPattern((HGodClassAntiPattern) newValue);
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
		case AntipatternPackage.HBLOB_ANTI_PATTERN__HDATA_CLASS_SMELLS:
			getHDataClassSmells().clear();
			return;
		case AntipatternPackage.HBLOB_ANTI_PATTERN__HGOD_CLASS_ANTI_PATTERN:
			setHGodClassAntiPattern((HGodClassAntiPattern) null);
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
		case AntipatternPackage.HBLOB_ANTI_PATTERN__HDATA_CLASS_SMELLS:
			return hDataClassSmells != null && !hDataClassSmells.isEmpty();
		case AntipatternPackage.HBLOB_ANTI_PATTERN__HGOD_CLASS_ANTI_PATTERN:
			return hGodClassAntiPattern != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());

		TreeItem item_main = new TreeItem(item, style);
		item_main.setText("God Class Anti-Pattern");

		TreeItem subitem_main = getHGodClassAntiPattern().getTreeItem(item_main, style);

		TreeItem item_data = new TreeItem(item, style);
		item_data.setText("DataClass Smells");

		for (HDataClassSmell data : getHDataClassSmells()) {
			TreeItem subitem_data = data.getTreeItem(item_data, style);
		}
		return item;
	}

	// [user code injected with eMoflon] -->
} //HBlobAntiPatternImpl
