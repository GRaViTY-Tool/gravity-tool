/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.util.ArrayList;
// [user defined imports] -->

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.impl.TMethodDefinitionImpl;
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIncomming Invocation
 * Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HIncommingInvocationCalculator extends HClassBasedCalculatorImpl
		implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HIncommingInvocationCalculator(DFSGraph graph) {
		this.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var metric = MetricsFactory.eINSTANCE.createHIncommingInvocationMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(this.calculateValue(tClass));
		this.getHAnnotation().add(metric);
		return metric;
	}

	public double calculateValue(final TClass tClass) {
		var invoc = 0;
		final var invocingMethods = new ArrayList<TMember>();
		for (final TMember m : tClass.getDefines()) {
			if (m instanceof TMethodDefinitionImpl) {
				for (final TAccess t : m.getAccessedBy()) {
					final var tSource = t.getSource();
					if (tSource == null) {
						// System.out.println(
						// "Method within Class " + tClass.getTName() + " was accessed without an Access
						// Source");
						continue;
					}
					final var definingClass = tSource.getDefinedBy();
					if (definingClass == null) {
						// System.out.println("Method within Class " + tClass.getTName()
						// + " was accessed by a Source without defining Class");
						continue;
					}
					if (!definingClass.equals(tClass) && !invocingMethods.contains(tSource)) {

						invocingMethods.add(tSource);
						invoc++;

					}
				}
			}
		}
		return invoc;

	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Incomming Invocation custom";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHIncommingInvocationMetric();
	}

	// [user code injected with eMoflon] -->
} // HIncommingInvocationCalculatorImpl
