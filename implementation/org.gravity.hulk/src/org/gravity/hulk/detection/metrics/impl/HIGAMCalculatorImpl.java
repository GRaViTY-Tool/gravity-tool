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
import org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric;
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
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
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
		super();
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
	public boolean detect(HAntiPatternGraph apg) {
		// [user code injected with eMoflon]

		final TypeGraph pg = apg.getPg();

		TVisibility requiredTVisibility = TVisibility.TPRIVATE;
		final List<Double> methods = new LinkedList<>();
		for (final TPackage tPackage : pg.getPackages()) {
			if (tPackage.getParent() == null) {
				final TVisibility tVisibility = process(apg, tPackage, methods);
				if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
					requiredTVisibility = tVisibility;
				}
			}
		}
		if (methods.size() > 0) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HIGAM_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	private TVisibility process(HAntiPatternGraph apg, TPackage tPackage, List<Double> methods) {
		TVisibility requiredTVisibility = TVisibility.TPRIVATE;
		final int start = methods.size();
		for (final TPackage tSubPackage : tPackage.getSubpackage()) {
			final TVisibility tVisibility = process(apg, tSubPackage, methods);
			if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
				requiredTVisibility = tVisibility;
			}
		}
		for (final TClass tType : tPackage.getClasses()) {
			if (!tType.isTLib()) {
				final TVisibility tVisibility = process(apg, tType, methods);
				if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
					requiredTVisibility = tVisibility;
				}
			}
		}
		if (methods.size() > 0 && methods.size() > start) {
			createMetric(apg, tPackage, getAverage(methods, start, methods.size()), requiredTVisibility);
		}
		return requiredTVisibility;
	}

	private TVisibility process(HAntiPatternGraph apg, TClass tType, List<Double> methods) {
		TVisibility requiredTVisibility = TVisibility.TPRIVATE;
		final int start = methods.size();
		for (final TMember tMember : tType.getDefines()) {
			if (tMember instanceof TMethodDefinition) {
				final TVisibility tVisibility = process(apg, tMember, methods);
				if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
					requiredTVisibility = tVisibility;
				}
			}
		}
		if (methods.size() > 0 && methods.size() > start) {
			createMetric(apg, tType, getAverage(methods, start, methods.size()), requiredTVisibility);
		}
		return requiredTVisibility;
	}

	private TVisibility process(HAntiPatternGraph apg, TMember tMember, List<Double> methods) {
		final TModifier tModifier = tMember.getTModifier();
		final TAbstractType tType = tMember.getDefinedBy();
		if (tModifier == null) {
			if (tMember instanceof TMethodDefinition && TConstructor.isConstructor((TMethodDefinition) tMember)) {
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
			final TVisibility tCurVis = tModifier.getTVisibility();
			int tMinVis = TVisibility.TPRIVATE_VALUE;
			if (isMainMethod(tMember) || tMember.getDefinedBy() instanceof TInterface) {
				tMinVis = TVisibility.TPUBLIC_VALUE;
			} else {
				if (tMember instanceof TMethodDefinition) {
					final TVisibility sub1sub2 = sub1sub2((TMethodDefinition) tMember);
					tMinVis = sub1sub2.ordinal() > tMinVis ? sub1sub2.ordinal() : tMinVis;
				}

				for (final TAccess tAccess : tMember.getAccessedBy()) {
					final TVisibility acc1acc2 = acc1acc2(tAccess);
					tMinVis = acc1acc2.ordinal() > tMinVis ? acc1acc2.ordinal() : tMinVis;

					final TVisibility inh1 = inh1(tAccess);
					tMinVis = inh1.ordinal() > tMinVis ? inh1.ordinal() : tMinVis;

					final TVisibility inh2 = inh2(tAccess);
					tMinVis = inh2.ordinal() > tMinVis ? inh2.ordinal() : tMinVis;
				}
			}
			final double igam = tCurVis.getValue() == tMinVis ? 0 : 1;// ((double) (tCurVis.getValue() - tMinVis)) / 3;

			final TVisibility minVis = TVisibility.get(tMinVis);
			createMetric(apg, tMember, igam, minVis);

			methods.add(igam);

			return minVis;
		}
		return TVisibility.TPUBLIC;
	}

	private boolean isMainMethod(TMember tMember) {
		if (tMember instanceof TMethodDefinition) {
			final TMethodDefinition tMethod = (TMethodDefinition) tMember;
			final TMethodSignature tSignature = tMethod.getSignature();
			if ("main".equals(tSignature.getMethod().getTName())) {
				final TModifier tModifier = tMethod.getTModifier();
				if (tModifier.isIsStatic() && tModifier.getTVisibility() == TVisibility.TPUBLIC) {
					final EList<TParameter> tParams = tSignature.getParameters();
					if (tParams.isEmpty()) {
						final TParameter tParam = tParams.get(0);
						if ("java.lang.String".equals(tParam.getType().getFullyQualifiedName())) {
							return true;
						}
					}
				}
			}

		}
		return false;
	}

	private double getAverage(List<Double> values, int start, int end) {
		double avg = 0;
		for (int i = start; i < end; i++) {
			avg += values.get(i);
		}
		return avg / (end - start);
	}

	private void createMetric(HAntiPatternGraph apg, TAnnotatable annotatable, double igam, TVisibility minVis) {
		final HIGAMMetric metric = MetricsFactory.eINSTANCE.createHIGAMMetric();
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

	private static final Logger LOGGER = Logger.getLogger(HIGAMCalculator.class);

	private TVisibility acc1acc2(TAccess tAccess) {
		final TAbstractType tType = tAccess.getTTarget().getDefinedBy();
		final TAbstractType tAccessingType = tAccess.getTSource().getDefinedBy();

		// acc1
		final TVisibility tVisibility = access(tAccessingType, tType);

		// acc2
		final TAbstractType sourceClass = tAccess.getTSource().getDefinedBy();
		if (tVisibility == TVisibility.TPROTECTED && tAccess.getStaticType() != null
				&& tAccess.getStaticType() instanceof TClass
				&& !(((TClass) tAccess.getStaticType()).isSubTypeOf(sourceClass))
				&& sourceClass != tAccess.getStaticType()) {
			return TVisibility.TPUBLIC;
		}
		return tVisibility;
	}

	private TVisibility acc2(TAccess access) {
		final TModifier targetMod = access.getTTarget().getTModifier();
		if (targetMod.isIsStatic()) {
			return TVisibility.TPRIVATE;
		}

		return TVisibility.TPUBLIC;
	}

	private TVisibility inh1(TAccess tAccess) {
		final TAbstractType tStaticType = tAccess.getStaticType();
		final TMember tMember = tAccess.getTTarget();
		final TAbstractType tTarget = tMember.getDefinedBy();
		if (tStaticType == null || tStaticType.getTName().equals("Void")) {
			LOGGER.error(
					"No static type for access from \"" + tAccess.getTSource().getDefinedBy().getFullyQualifiedName()
					+ "->" + tAccess.getTSource().getSignatureString() + "\" to \""
					+ tTarget.getFullyQualifiedName() + "->" + tMember.getSignatureString() + "\".");
			return TVisibility.TPUBLIC;
		}
		return access(tStaticType, tTarget);
	}

	private TVisibility inh2(TAccess tAccess) {
		// TODO: Implement according to "Friedrich Steimann and Andreas Thies: From
		// Public to Private to Absent: Refactoring JAVAPrograms under Constrained
		// Accessibility"
		return TVisibility.TPRIVATE;
	}

	private TVisibility sub1sub2(TMethodDefinition member) {
		final TMethodDefinition tOverriddenDef = member.getOverriding();
		if (tOverriddenDef != null) {

			final TVisibility tOverriddenVis;
			final TModifier tOverriddenMod = tOverriddenDef.getTModifier();
			if (tOverriddenMod != null) {
				return tOverriddenMod.getTVisibility();
			} else {
				LOGGER.error( "TVisibility of \"" + tOverriddenDef.getDefinedBy().getFullyQualifiedName()
						+ "->" + tOverriddenDef.getSignatureString() + "\" is null.");
				return TVisibility.TPUBLIC;
			}

		}
		return TVisibility.TPRIVATE;
	}

	private TVisibility access(TAbstractType tSource, TAbstractType tTarget) {
		if (!tTarget.equals(tSource) && !tTarget.getInnerTypes().contains(tSource)
				&& !tSource.equals(tTarget.getOuterType())) {
			final TPackage tPackage = tTarget.getPackage();
			if (tPackage.equals(tSource.getPackage())) {
				return TVisibility.TPACKAGE;
			}

			boolean isSubClass = true;
			if (tSource instanceof TClass) {
				final TClass tClass = (TClass) tSource;
				isSubClass &= tTarget.equals(tClass.getParentClass()) || tClass.getImplements().contains(tTarget);
			} else if (tSource instanceof TInterface) {
				isSubClass &= ((TInterface) tSource).getParentInterfaces().contains(tTarget);
			}
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
