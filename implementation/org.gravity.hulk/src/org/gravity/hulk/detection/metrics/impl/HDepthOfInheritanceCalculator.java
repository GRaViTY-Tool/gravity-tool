/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.AbstractClassBasedCalculator;
import org.gravity.hulk.detection.metrics.HMetricCalculator;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HDepth
 * Of Inheritance Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HDepthOfInheritanceCalculator extends AbstractClassBasedCalculator implements HMetricCalculator {

	private final Map<Object, Double> depthMemo = new HashMap<>();

	public HDepthOfInheritanceCalculator(final DFSGraph graph) {
		this.setGraph(graph);
	}

	@Override
	public boolean detect(final HAntiPatternGraph apg) {
		this.depthMemo.clear();
		return super.detect(apg);
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
		return this.getDepth(tClass, type -> {
			final var c = (TClass) type;
			final List<TAbstractType> parents = new ArrayList<>();
			if (c.getParentClasses() != null) {
				parents.addAll(c.getParentClasses());
			}
			if (c.getImplements() != null) {
				parents.addAll(c.getImplements());
			}
			return parents;
		});
	}

	public double calculateValue(final TInterface iface) {
		return this.getDepth(iface, type -> {
			final var i = (TInterface) type;
			return new ArrayList<>(i.getParentInterfaces());
		});
	}

	private double getDepth(final TAbstractType type,
			final Function<TAbstractType, List<TAbstractType>> parentProvider) {
		if (type == null) {
			return 0;
		}
		if (this.depthMemo.containsKey(type)) {
			return this.depthMemo.get(type);
		}

		// Object treated as root with depth 0
		if ("java.lang.Object".equals(type.getFullyQualifiedName())) {
			this.depthMemo.put(type, 0d);
			return 0;
		}

		final var parents = parentProvider.apply(type);
		if (parents == null || parents.isEmpty()) {
			this.depthMemo.put(type, 1d);
			return 1;
		}

		var maxDepth = 0d;
		for (final TAbstractType parent : parents) {
			maxDepth = Math.max(maxDepth, this.getDepth(parent, parentProvider));
		}

		final var depth = maxDepth + 1;
		this.depthMemo.put(type, depth);
		return depth;
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
