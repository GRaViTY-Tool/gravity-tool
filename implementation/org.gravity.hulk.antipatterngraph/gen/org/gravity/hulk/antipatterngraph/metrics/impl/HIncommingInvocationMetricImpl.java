/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TClass;
import org.eclipse.swt.widgets.TreeItem;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIncomming Invocation Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HIncommingInvocationMetricImpl extends HMetricImpl implements HIncommingInvocationMetric {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HIncommingInvocationMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HINCOMMING_INVOCATION_METRIC;
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("IncommingInvocation(" + ((TClass) getTAnnotated()).getTName() + ")=" + getValue());
		return item;
	}

	// [user code injected with eMoflon] -->
} //HIncommingInvocationMetricImpl
