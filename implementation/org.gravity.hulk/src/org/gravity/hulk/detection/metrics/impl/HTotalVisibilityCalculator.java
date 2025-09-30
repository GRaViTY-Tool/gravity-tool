/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.HTotalVisibilityMetric;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HDetectorImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTotal Visibility
 * Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HTotalVisibilityCalculator extends HDetectorImpl
		implements HMetricCalculator {
	private static final EClass METRIC_TYPE = org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE
			.getHTotalVisibilityMetric();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param graph
	 *
	 * @generated
	 */
	public HTotalVisibilityCalculator(final DFSGraph graph) {
		this.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {
		// [user code injected with eMoflon]
		var totalValue = 0;
		final var pg = apg.getModel();
		for (final TClass tClass : pg.getClasses()) {
			if (!tClass.isTLib()) {
				var value = 0;
				for (final TMember tMember : tClass.getDefines()) {
					final var tModifier = tMember.getTModifier();
					if (tModifier == null) {
						// System.err.println("The member \"" + tMember.getSignatureString() + "\" in
						// the class \""
						// + tClass.getFullyQualifiedName() + "\" has no modifier.");
					} else {
						final var tVisibility = tModifier.getTVisibility();
						if (tVisibility != null) {
							switch (tVisibility) {
								case TPUBLIC:
									value += this.publicValue;
									break;
								case TPROTECTED:
									value += this.protectedValue;
									break;
								case TPACKAGE:
									value += this.packageValue;
									break;
								case TPRIVATE:
									value += this.privateValue;
									break;
							}
						}
					}
				}
				totalValue += value;
				this.addMetric(tClass, METRIC_TYPE, value);
			}
		}
		this.addMetric(pg, METRIC_TYPE, totalValue);
		return true;
	}

	// TODO: make values changeable
	private final int privateValue = 0; // SearchParameters.privateValue;
	private final int packageValue = 1; // SearchParameters.packageValue;
	private final int protectedValue = 2; // SearchParameters.protectedValue;
	private final int publicValue = 3; // SearchParameters.publicValue;

	@Override
	public String getGuiName() {
		return "TotalMethodVisibility";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHTotalVisibilityMetric();
	}

	public void addMetric(final TAnnotatable annotateable, final EClass type, final int value) {
		HMetric metric = null;
		final var existingMetrics = annotateable.getTAnnotation(type);
		if (!existingMetrics.isEmpty()) {
			metric = (HTotalVisibilityMetric) existingMetrics.remove(0);
			annotateable.getTAnnotation().removeAll(existingMetrics);
			EcoreUtil.deleteAll(existingMetrics, true);
		}
		if (metric == null) {
			metric = (HMetric) type.getEPackage().getEFactoryInstance().create(type);
			metric.setTAnnotated(annotateable);
			this.getHAnnotation().add(metric);
		}
		metric.setValue(value);
	}
} // HTotalVisibilityCalculatorImpl
