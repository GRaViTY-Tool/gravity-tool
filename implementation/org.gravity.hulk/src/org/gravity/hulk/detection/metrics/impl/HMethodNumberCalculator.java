/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMethod Number
 * Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HMethodNumberCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param graph
	 *
	 * @generated
	 */
	public HMethodNumberCalculator(final DFSGraph graph) {
		this.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		if (tClass.isTLib()) {
			throw new IllegalArgumentException("Class is defined in a library " + tClass.getFullyQualifiedName() + ".");
		}
		final var nm = MetricsFactory.eINSTANCE.createHNumberOfMethodsMetric();
		nm.setTAnnotated(tClass);
		this.getHAnnotation().add(nm);
		nm.setValue(this.calculateValue(tClass));
		return nm;
	}

	public double calculateValue(final TClass tClass) {
		return tClass.getDeclaredTMethodDefinitions().size();
	}

	@Override
	public String getGuiName() {
		return "Number of Methods";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHNumberOfMethodsMetric();
	}

} // HMethodNumberCalculatorImpl
