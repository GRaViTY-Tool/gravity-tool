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
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HOutgoing Invocation Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HOutgoingInvocationCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HOutgoingInvocationCalculator(final DFSGraph graph) {
		this.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var metric = MetricsFactory.eINSTANCE.createHOutgoingInvocationMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(this.calculateValue(tClass));
		this.getHAnnotation().add(metric);
		return metric;
	}

	public double calculateValue(final TClass tClass) {

		var invoc = 0;
		final var invocedMethods = new ArrayList<TMember>();
		for (final TMember m : tClass.getDefines()) {
			for (final TAccess t : m.getAccessing()) {
				final var tTarget = t.getTarget();
				if (tTarget instanceof final TMethodDefinitionImpl targetMethod) {
					final var definingClass = targetMethod.getDefinedBy();

					if (definingClass == null) {
						System.out.println(
								"Method in Class " + tClass.getTName() + " accesses a Method without defining Class");
						continue;
					}

					if (!definingClass.equals(tClass) && !definingClass.isTLib()
							&& !invocedMethods.contains(targetMethod)) {

						invocedMethods.add(targetMethod);
						invoc++;

					}
				}
			}
		}

		return invoc;

	}

	@Override
	public String getGuiName() {
		return "Number of outgoing invocations";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHOutgoingInvocationMetric();
	}

} // HOutgoingInvocationCalculatorImpl
