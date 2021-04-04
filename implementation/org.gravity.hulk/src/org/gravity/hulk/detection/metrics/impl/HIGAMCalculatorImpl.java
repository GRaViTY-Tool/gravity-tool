/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HIGAMCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TConstructor;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.annotations.TAnnotatable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HIGAM
 * Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HIGAMCalculatorImpl extends HMetricCalculatorImpl implements HIGAMCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HIGAMCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HIGAM_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {
		// [user code injected with eMoflon]

		final var pg = apg.getModel();

		var requiredTVisibility = TVisibility.TPRIVATE;
		final List<Double> methods = new LinkedList<>();
		for (final TPackage tPackage : pg.getPackages()) {
			if (tPackage.getParent() == null) {
				final var tVisibility = process(apg, tPackage, methods);
				if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
					requiredTVisibility = tVisibility;
				}
			}
		}
		if (!methods.isEmpty()) {
			createMetric(apg, pg, getAverage(methods, 0, methods.size()), requiredTVisibility);
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HIGAM_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	private TVisibility process(final HAntiPatternGraph apg, final TPackage tPackage, final List<Double> methods) {
		var requiredTVisibility = TVisibility.TPRIVATE;
		final var start = methods.size();
		for (final TPackage tSubPackage : tPackage.getSubpackages()) {
			final var tVisibility = process(apg, tSubPackage, methods);
			if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
				requiredTVisibility = tVisibility;
			}
		}
		for (final TClass tType : tPackage.getClasses()) {
			if (!tType.isTLib()) {
				final var tVisibility = process(apg, tType, methods);
				if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
					requiredTVisibility = tVisibility;
				}
			}
		}
		if (!methods.isEmpty() && (methods.size() > start)) {
			createMetric(apg, tPackage, getAverage(methods, start, methods.size()), requiredTVisibility);
		}
		return requiredTVisibility;
	}

	private TVisibility process(final HAntiPatternGraph apg, final TClass tType, final List<Double> methods) {
		var requiredTVisibility = TVisibility.TPRIVATE;
		final var start = methods.size();
		for (final TMember tMember : tType.getDefines()) {
			if (tMember instanceof TMethodDefinition) {
				final var tVisibility = process(apg, tMember, methods);
				if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
					requiredTVisibility = tVisibility;
				}
			}
		}
		if (!methods.isEmpty() && (methods.size() > start)) {
			createMetric(apg, tType, getAverage(methods, start, methods.size()), requiredTVisibility);
		}
		return requiredTVisibility;
	}

	private TVisibility process(final HAntiPatternGraph apg, final TMember tMember, final List<Double> methods) {
		final var tModifier = tMember.getTModifier();
		final var tType = tMember.getDefinedBy();
		if (tModifier == null) {
			if ((tMember instanceof TMethodDefinition) && TConstructor.isConstructor(tMember)) {
				if (LOGGER.isInfoEnabled()) {
					LOGGER.info("Skipped constructor \"" + tMember.getSignatureString()
					+ "\" it is probably a default constructor and has no modifer.");
				}
			} else if (tType.getTName().startsWith("%ENUM%")) {
				if (LOGGER.isInfoEnabled()) {
					LOGGER.info("Skipped member in enum \"" + tMember.getSignatureString() + "\".");
				}
			} else {
				LOGGER.error("The member \"" + tMember.getSignatureString() + "\" has no modifer, assuming PUBLIC!");
			}
		} else {
			final var tCurVis = tModifier.getTVisibility();
			var tMinVis = TVisibility.TPRIVATE_VALUE;
			if (isMainMethod(tMember) || (tMember.getDefinedBy() instanceof TInterface)) {
				tMinVis = TVisibility.TPUBLIC_VALUE;
			} else {
				if (tMember instanceof TMethodDefinition) {
					final var sub1sub2 = sub1sub2((TMethodDefinition) tMember);
					tMinVis = sub1sub2.ordinal() > tMinVis ? sub1sub2.ordinal() : tMinVis;
				}

				for (final TAccess tAccess : tMember.getAccessedBy()) {
					final var acc1acc2 = acc1acc2(tAccess);
					tMinVis = acc1acc2.ordinal() > tMinVis ? acc1acc2.ordinal() : tMinVis;

					final var inh1 = inh1(tAccess);
					tMinVis = inh1.ordinal() > tMinVis ? inh1.ordinal() : tMinVis;

					final var inh2 = inh2(tAccess);
					tMinVis = inh2.ordinal() > tMinVis ? inh2.ordinal() : tMinVis;
				}
			}
			final double igam = tCurVis.getValue() == tMinVis ? 0 : 1;

			final var minVis = TVisibility.get(tMinVis);
			createMetric(apg, tMember, igam, minVis);

			methods.add(igam);

			return minVis;
		}
		return TVisibility.TPUBLIC;
	}

	private boolean isMainMethod(final TMember tMember) {
		if (tMember instanceof TMethodDefinition) {
			final var tMethod = (TMethodDefinition) tMember;
			final var tSignature = tMethod.getSignature();
			if ("main".equals(tSignature.getMethod().getTName())) {
				final var tModifier = tMethod.getTModifier();
				if (tModifier.isIsStatic() && (tModifier.getTVisibility() == TVisibility.TPUBLIC)) {
					final var tParams = tSignature.getParameters();
					if (tParams.size() == 1) {
						final var tParam = tParams.get(0);
						if ("java.lang.String".equals(tParam.getType().getFullyQualifiedName()) && tParam.isArray()) {
							return true;
						}
					}
				}
			}

		}
		return false;
	}

	private double getAverage(final List<Double> values, final int start, final int end) {
		var avg = 0D;
		for (var i = start; i < end; i++) {
			avg += values.get(i);
		}
		return avg / (end - start);
	}

	private void createMetric(final HAntiPatternGraph apg, final TAnnotatable annotatable, final double igam, final TVisibility minVis) {
		final var metric = MetricsFactory.eINSTANCE.createHIGAMMetric();
		metric.setTAnnotated(annotatable);
		metric.setValue(igam);
		metric.setApg(apg);
		metric.setHMinVis(minVis);
		getHAnnotation().add(metric);
	}

	@Override
	public String getGuiName() {
		return "Inappropriate Generosity with Accessibility of Methods";
	}

	// <-- [user code injected with eMoflon]

	private static final Logger LOGGER = Logger.getLogger(HIGAMCalculatorImpl.class);

	private TVisibility acc1acc2(final TAccess tAccess) {
		final var tType = tAccess.getTarget().getDefinedBy();
		final var tAccessingType = tAccess.getSource().getDefinedBy();

		// acc1
		final var tVisibility = access(tAccessingType, tType);

		// acc2
		final var sourceClass = tAccess.getSource().getDefinedBy();
		if ((tVisibility == TVisibility.TPROTECTED) && (tAccess.getStaticType() != null)
				&& (tAccess.getStaticType() instanceof TClass)
				&& !(((TClass) tAccess.getStaticType()).isSubTypeOf(sourceClass))
				&& (sourceClass != tAccess.getStaticType())) {
			return TVisibility.TPUBLIC;
		}
		return tVisibility;
	}

	private TVisibility acc2(final TAccess access) {
		final var targetMod = access.getTarget().getTModifier();
		if (targetMod.isIsStatic()) {
			return TVisibility.TPRIVATE;
		}

		return TVisibility.TPUBLIC;
	}

	private TVisibility inh1(final TAccess tAccess) {
		final var tStaticType = tAccess.getStaticType();
		final var tMember = tAccess.getTarget();
		final var tTarget = tMember.getDefinedBy();
		if ((tStaticType == null) || tStaticType.getTName().equals("Void")) {
			LOGGER.error(
					"No static type for access from \"" + tAccess.getSource().getDefinedBy().getFullyQualifiedName()
					+ "->" + tAccess.getSource().getSignatureString() + "\" to \""
					+ tTarget.getFullyQualifiedName() + "->" + tMember.getSignatureString() + "\".");
			return TVisibility.TPUBLIC;
		}
		return access(tStaticType, tTarget);
	}

	private TVisibility inh2(final TAccess tAccess) {
		// TODO: Implement according to "Friedrich Steimann and Andreas Thies: From
		// Public to Private to Absent: Refactoring JAVAPrograms under Constrained
		// Accessibility"
		return TVisibility.TPRIVATE;
	}

	private TVisibility sub1sub2(final TMethodDefinition member) {
		for (final TMethodDefinition tOverriddenDef : member.getOverriding()) {

			final TVisibility tOverriddenVis;
			final var tOverriddenMod = tOverriddenDef.getTModifier();
			if (tOverriddenMod != null) {
				return tOverriddenMod.getTVisibility();
			} else {
				LOGGER.error("TVisibility of \"" + tOverriddenDef.getDefinedBy().getFullyQualifiedName() + "->"
						+ tOverriddenDef.getSignatureString() + "\" is null.");
				return TVisibility.TPUBLIC;
			}

		}
		return TVisibility.TPRIVATE;
	}

	private TVisibility access(final TAbstractType tSource, final TAbstractType tTarget) {
		if (!tTarget.equals(tSource) && !tTarget.getInnerTypes().contains(tSource)
				&& !tSource.equals(tTarget.getOuterType())) {
			final var tPackage = tTarget.getPackage();
			if (tPackage.equals(tSource.getPackage())) {
				return TVisibility.TPACKAGE;
			}

			final var isSubClass = tSource.isSubTypeOf(tTarget);
			if (isSubClass) {
				return TVisibility.TPROTECTED;
			} else {
				return TVisibility.TPUBLIC;
			}
		}
		return TVisibility.TPRIVATE;
	}

	// [user code injected with eMoflon] -->
} // HIGAMCalculatorImpl
