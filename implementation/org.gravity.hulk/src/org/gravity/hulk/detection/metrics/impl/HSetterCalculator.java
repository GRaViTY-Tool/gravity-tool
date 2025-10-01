/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.impl.TMethodDefinitionImpl;
// [user defined imports] -->
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HSetter
 * Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HSetterCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HSetterCalculator(final DFSGraph graph) {
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

		final var metric = MetricsFactory.eINSTANCE.createHSetterMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(this.calculateValue(tClass));
		this.getHAnnotation().add(metric);
		return metric;
	}

	public double calculateValue(final TClass tClass) {

		if ((tClass == null) || tClass.isTLib()) {
			return 0;
		}

		var i = 0;
		for (final TMember m : tClass.getDefines()) {
			if (m instanceof TMethodDefinitionImpl) {
				final var sig = ((TMethodDefinitionImpl) m).getSignature();
				if (sig == null) {
					// System.out.println("Method within Class " + tClass.getTName() + " does not
					// have a signature");
					continue;
				}
				final var method = sig.getMethod();
				if (method == null) {
					// System.out.println(
					// "MethodSignature of a Method in Class " + tClass.getTName() + " does not have
					// a TMethod");
					continue;
				}
				final var name = method.getTName();
				if (name.toLowerCase().startsWith("set")) {
					i++;
				}
			}
		}
		for (final TClass parent : tClass.getParentClasses()) {
			i += this.calculateValue(parent);
		}

		return i;

	}

	@Override
	public String getGuiName() {
		return "Number of setter Methods";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHSetterMetric();
	}

} // HSetterCalculatorImpl
