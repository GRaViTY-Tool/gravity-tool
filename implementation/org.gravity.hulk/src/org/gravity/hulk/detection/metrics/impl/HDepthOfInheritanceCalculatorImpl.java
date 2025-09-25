/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HDepthOfInheritanceCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HDepth
 * Of Inheritance Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HDepthOfInheritanceCalculatorImpl extends HClassBasedMetricCalculatorImpl
implements HDepthOfInheritanceCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HDepthOfInheritanceCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HDEPTH_OF_INHERITANCE_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculateMetric(final TClass tClass) {
		removeAnnotations(tClass);

		final var metric = MetricsFactory.eINSTANCE.createHDepthOfInheritanceMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(calculateValue(tClass));
		getHAnnotation().add(metric);
		return metric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Depth of Inheritance";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHDepthOfInheritanceMetric();
	}

	// [user code injected with eMoflon] -->
} // HDepthOfInheritanceCalculatorImpl
