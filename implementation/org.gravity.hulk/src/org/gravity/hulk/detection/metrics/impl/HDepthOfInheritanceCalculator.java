/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HDepth
 * Of Inheritance Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HDepthOfInheritanceCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HDepthOfInheritanceCalculator(final DFSGraph graph) {
		this.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var metric = MetricsFactory.eINSTANCE.createHDepthOfInheritanceMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(this.calculateValue(tClass));
		this.getHAnnotation().add(metric);
		return metric;
	}

	public double calculateValue(final TClass tClass) {
		final Set<TClass> seen = new HashSet<>();
		final Map<TClass, Integer> distances = new HashMap<>();

		final Deque<TClass> Q = new LinkedList<>();
		distances.put(tClass, 0);
		Q.push(tClass);

		var minDist = Integer.MAX_VALUE;
		while (!Q.isEmpty()) {
			final var v = Q.pop();

			if (!seen.contains(v)) {
				for (final TClass parent : v.getParentClasses()) {
					var dist = parent.getChildClasses().parallelStream().mapToInt(distances::get)
							.filter(Objects::nonNull).min().getAsInt();
					if (parent.isTLib() || parent.getParents().isEmpty()) {
						if ("java.lang.Object".equals(parent.getFullyQualifiedName())) {
							dist -= 1;
						}
						if (minDist > dist) {
							minDist = dist;
						}
					} else {
						distances.put(parent, dist);
						Q.addAll(parent.getParentClasses());
					}
					seen.add(parent);
				}
			}
		}
		return minDist;

	}

	@Override
	public String getGuiName() {
		return "Depth of Inheritance";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHDepthOfInheritanceMetric();
	}

} // HDepthOfInheritanceCalculatorImpl
