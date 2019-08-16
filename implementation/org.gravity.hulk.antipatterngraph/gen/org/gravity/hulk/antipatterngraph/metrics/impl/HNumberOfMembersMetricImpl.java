/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HNumber Of Members Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HNumberOfMembersMetricImpl extends HMetricImpl implements HNumberOfMembersMetric {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HNumberOfMembersMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HNUMBER_OF_MEMBERS_METRIC;
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("NumberOfMembers(" + ((TClass) getTAnnotated()).getTName() + ")=" + getValue());
		return item;
	}

	// [user code injected with eMoflon] -->
} //HNumberOfMembersMetricImpl
