/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLarge Class Smell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HLargeClassSmellImpl#getHNumberOfMembers <em>HNumber Of Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HLargeClassSmellImpl extends HCodeSmellImpl implements HLargeClassSmell {
	/**
	 * The cached value of the '{@link #getHNumberOfMembers() <em>HNumber Of Members</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHNumberOfMembers()
	 * @generated
	 * @ordered
	 */
	protected HNumberOfMembersMetric hNumberOfMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLargeClassSmellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HLARGE_CLASS_SMELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HNumberOfMembersMetric getHNumberOfMembers() {
		if (hNumberOfMembers != null && hNumberOfMembers.eIsProxy()) {
			InternalEObject oldHNumberOfMembers = (InternalEObject) hNumberOfMembers;
			hNumberOfMembers = (HNumberOfMembersMetric) eResolveProxy(oldHNumberOfMembers);
			if (hNumberOfMembers != oldHNumberOfMembers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodesmellsPackage.HLARGE_CLASS_SMELL__HNUMBER_OF_MEMBERS, oldHNumberOfMembers,
							hNumberOfMembers));
			}
		}
		return hNumberOfMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfMembersMetric basicGetHNumberOfMembers() {
		return hNumberOfMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHNumberOfMembers(HNumberOfMembersMetric newHNumberOfMembers) {
		HNumberOfMembersMetric oldHNumberOfMembers = hNumberOfMembers;
		hNumberOfMembers = newHNumberOfMembers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodesmellsPackage.HLARGE_CLASS_SMELL__HNUMBER_OF_MEMBERS, oldHNumberOfMembers, hNumberOfMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HLARGE_CLASS_SMELL__HNUMBER_OF_MEMBERS:
			if (resolve)
				return getHNumberOfMembers();
			return basicGetHNumberOfMembers();
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
		case CodesmellsPackage.HLARGE_CLASS_SMELL__HNUMBER_OF_MEMBERS:
			setHNumberOfMembers((HNumberOfMembersMetric) newValue);
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
		case CodesmellsPackage.HLARGE_CLASS_SMELL__HNUMBER_OF_MEMBERS:
			setHNumberOfMembers((HNumberOfMembersMetric) null);
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
		case CodesmellsPackage.HLARGE_CLASS_SMELL__HNUMBER_OF_MEMBERS:
			return hNumberOfMembers != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());

		getHNumberOfMembers().getTreeItem(item, style);
		return item;
	}

	// [user code injected with eMoflon] -->
} //HLargeClassSmellImpl
