/**
 */
package org.gravity.hulk.refactoringgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.refactoringgraph.HCluster;
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;

import org.gravity.typegraph.basic.TMember;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HCluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.impl.HClusterImpl#getTMembers <em>TMembers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HClusterImpl extends HMetricImpl implements HCluster {
	/**
	 * The cached value of the '{@link #getTMembers() <em>TMembers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<TMember> tMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringgraphPackage.Literals.HCLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMember> getTMembers() {
		if (tMembers == null) {
			tMembers = new EObjectResolvingEList<TMember>(TMember.class, this,
					RefactoringgraphPackage.HCLUSTER__TMEMBERS);
		}
		return tMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RefactoringgraphPackage.HCLUSTER__TMEMBERS:
			return getTMembers();
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
		case RefactoringgraphPackage.HCLUSTER__TMEMBERS:
			getTMembers().clear();
			getTMembers().addAll((Collection<? extends TMember>) newValue);
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
		case RefactoringgraphPackage.HCLUSTER__TMEMBERS:
			getTMembers().clear();
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
		case RefactoringgraphPackage.HCLUSTER__TMEMBERS:
			return tMembers != null && !tMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("Cluster of connected Members");
		for (TMember m : getTMembers()) {
			TreeItem i = new TreeItem(item, style);
			i.setText(m.toString());
		}
		return item;
	}

	// [user code injected with eMoflon] -->
} //HClusterImpl
