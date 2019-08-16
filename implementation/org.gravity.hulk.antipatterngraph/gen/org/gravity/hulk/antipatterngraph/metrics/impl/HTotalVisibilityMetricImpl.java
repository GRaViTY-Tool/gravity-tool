/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.antipatterngraph.metrics.HTotalVisibilityMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTotal Visibility Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HTotalVisibilityMetricImpl extends HMetricImpl implements HTotalVisibilityMetric {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTotalVisibilityMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HTOTAL_VISIBILITY_METRIC;
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("TotalMethodVisibility(" + getTAnnotated() + ")=" + getValue());
		return item;
	}

	// [user code injected with eMoflon] -->
} //HTotalVisibilityMetricImpl
