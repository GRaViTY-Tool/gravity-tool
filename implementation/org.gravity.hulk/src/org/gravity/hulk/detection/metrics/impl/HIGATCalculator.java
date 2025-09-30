/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.util.HashSet;
// <-- [user defined imports]
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HDetectorImpl;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
// [user defined imports] -->
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIGAT Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HIGATCalculator extends HDetectorImpl implements HMetricCalculator {

	private static final Logger LOGGER = Logger.getLogger(HIGATCalculator.class);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param graph
	 *
	 * @generated
	 */
	public HIGATCalculator(final DFSGraph graph) {
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

		final var pg = apg.getModel();
		this.removeAnnotations(pg);

		var requiredTVisibility = TVisibility.TPRIVATE;
		final List<Double> methods = new LinkedList<>();
		for (final TPackage tPackage : pg.getPackages()) {
			if (tPackage.getParent() == null) {
				final var tVisibility = this.process(apg, tPackage, methods);
				if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
					requiredTVisibility = tVisibility;
				}
			}
		}
		if (!methods.isEmpty()) {
			this.createMetric(apg, pg, this.getAverage(methods, 0, methods.size()), requiredTVisibility);
		}

		return true;
	}

	private TVisibility process(final HAntiPatternGraph apg, final TPackage tPackage, final List<Double> methods) {
		this.removeAnnotations(tPackage);

		final var start = methods.size();
		var requiredTVisibility = TVisibility.TPRIVATE;
		for (final TPackage tSubPackage : tPackage.getSubpackages()) {
			final var tVisibility = this.process(apg, tSubPackage, methods);
			if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
				requiredTVisibility = tVisibility;
			}
		}
		for (final TAbstractType tType : tPackage.getAllTypes()) {
			if (tType.isDeclared()) {
				final var tVisibility = this.process(apg, tType, methods);
				if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
					requiredTVisibility = tVisibility;
				}
			}
		}
		if ((methods.size() > 0) && (methods.size() > start)) {
			this.createMetric(apg, tPackage, this.getAverage(methods, start, methods.size()), requiredTVisibility);
		}
		return requiredTVisibility;
	}

	private TVisibility process(final HAntiPatternGraph apg, final TAbstractType tType, final List<Double> methods) {
		this.removeAnnotations(tType);

		var tMinVis = TVisibility.TPUBLIC;
		final var tModifier = tType.getTModifier();
		if (tModifier == null) {
			LOGGER.error("Type has no modifier: " + tType.getFullyQualifiedName());
			return tMinVis;
		}
		final var tCurVis = tModifier.getTVisibility();

		if (!(tType instanceof TInterface) || (tType.getOuterType() != null)) {

			final Set<TAbstractType> accessedBy = new HashSet<>();
			for (final TMember tMember : tType.getDefines()) {
				for (final TAccess tAccess : tMember.getAccessedBy()) {
					final var definedBy = tAccess.getSource().getDefinedBy();
					if (!tType.equals(definedBy) && !tType.getInnerTypes().contains(definedBy)
							&& !definedBy.equals(tType.getOuterType())) {
						accessedBy.add(definedBy);
					}
				}
			}
			tMinVis = TVisibility.TPRIVATE;

			if (!accessedBy.isEmpty()) {
				var onlySubClasses = true;
				final var tPackage = tType.getPackage();
				final Set<TPackage> otherPackages = new HashSet<>();
				for (final TAbstractType tAccessingType : accessedBy) {
					final var tOtherPackage = tAccessingType.getPackage();
					if (!tPackage.equals(tOtherPackage)) {
						otherPackages.add(tOtherPackage);
					}
					onlySubClasses &= tAccessingType.isSubTypeOf(tType);
				}
				if (otherPackages.isEmpty()) {
					tMinVis = TVisibility.TPACKAGE;
				} else if (onlySubClasses) {
					tMinVis = TVisibility.TPROTECTED;
				} else {
					tMinVis = TVisibility.TPUBLIC;
				}
			}
		}

		final double igat = tCurVis.equals(tMinVis) ? 0 : 1;

		this.createMetric(apg, tType, igat, tMinVis);

		methods.add(igat);

		return tMinVis;
	}

	private double getAverage(final List<Double> values, final int start, final int end) {
		var avg = 0D;
		for (var i = start; i < end; i++) {
			avg += values.get(i);
		}
		return avg / (end - start);
	}

	private void createMetric(final HAntiPatternGraph apg, final TAnnotatable annotatable, final double igam,
			final TVisibility minVis) {
		final var metric = MetricsFactory.eINSTANCE.createHIGATMetric();
		metric.setTAnnotated(annotatable);
		metric.setValue(igam);
		metric.setApg(apg);
		metric.setHMinVis(minVis);

		this.getHAnnotation().add(metric);
		annotatable.getTAnnotation().add(metric);
	}

	@Override
	public String getGuiName() {
		return "Inappropriate Generosity with Accessibility of Types";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHIGATMetric();
	}

	// [user code injected with eMoflon] -->
} // HIGATCalculatorImpl
