/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLocal Field Unique Access Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalFieldUniqueAccessMetricImpl extends HMetricImpl implements HLocalFieldUniqueAccessMetric {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLocalFieldUniqueAccessMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLOCAL_FIELD_UNIQUE_ACCESS_METRIC;
	}
	// <-- [user code injected with eMoflon]

	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("LocalFieldAccesses(" + ((TClass) getTAnnotated()).getTName() + ") = " + getValue() + ")");
		return item;
	}

	// [user code injected with eMoflon] -->
} //HLocalFieldUniqueAccessMetricImpl
