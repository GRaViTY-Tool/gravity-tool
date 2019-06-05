/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.detection.impl.HMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HIGAMCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
// <-- [user defined imports]
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric;
import org.gravity.hulk.antipatterngraph.metrics.HIGATMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TConstructorDefinition;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIGAM Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HIGAMCalculatorImpl extends HMetricCalculatorImpl implements HIGAMCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HIGAMCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HIGAM_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph apg) {
		// [user code injected with eMoflon]

		TypeGraph pg = apg.getPg();

		TVisibility requiredTVisibility = TVisibility.TPRIVATE;
		List<Double> methods = new LinkedList<>();
		for (TPackage tPackage : pg.getPackages()) {
			if (tPackage.getParent() == null) {
				TVisibility tVisibility = process(apg, tPackage, methods);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		int start = methods.size();
		for (TPackage tSubPackage : tPackage.getSubpackage()) {
			TVisibility tVisibility = process(apg, tSubPackage, methods);
			if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
				requiredTVisibility = tVisibility;
			}
		}
		for (TClass tType : tPackage.getClasses()) {
			if (!tType.isTLib()) {
				TVisibility tVisibility = process(apg, tType, methods);
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
		int start = methods.size();
		for (TMember tMember : tType.getDefines()) {
			if (tMember instanceof TMethodDefinition) {
				TVisibility tVisibility = process(apg, tMember, methods);
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
		TModifier tModifier = tMember.getTModifier();
		TAbstractType tType = tMember.getDefinedBy();
		if (tModifier == null) {
			if (tMember instanceof TConstructorDefinition) {
				LOGGER.log(Level.INFO, "Skipped constructor \"" + tMember.getSignatureString()
						+ "\" it is probably a default constructor and has no modifer.");
			} else if (tType.getTName().startsWith("%ENUM%")) {
				LOGGER.log(Level.INFO, "Skipped member in enum \"" + tMember.getSignatureString() + "\".");
			} else {
				LOGGER.log(Level.ERROR,
						"The member \"" + tMember.getSignatureString() + "\" has no modifer, assuming PUBLIC!");
			}
		} else {
			TVisibility tCurVis = tModifier.getTVisibility();
			int tMinVis = TVisibility.TPRIVATE_VALUE;
			if (isMainMethod(tMember) || tMember.getDefinedBy() instanceof TInterface) {
				tMinVis = TVisibility.TPUBLIC_VALUE;
			} else {
				if (tMember instanceof TMethodDefinition) {
					TVisibility sub1sub2 = sub1sub2((TMethodDefinition) tMember);
					tMinVis = sub1sub2.ordinal() > tMinVis ? sub1sub2.ordinal() : tMinVis;
				}

				for (TAccess tAccess : tMember.getAccessedBy()) {
					TVisibility acc1acc2 = acc1acc2(tAccess);
					tMinVis = acc1acc2.ordinal() > tMinVis ? acc1acc2.ordinal() : tMinVis;

					TVisibility inh1 = inh1(tAccess);
					tMinVis = inh1.ordinal() > tMinVis ? inh1.ordinal() : tMinVis;

					TVisibility inh2 = inh2(tAccess);
					tMinVis = inh2.ordinal() > tMinVis ? inh2.ordinal() : tMinVis;
				}
			}
			double igam = tCurVis.getValue() == tMinVis ? 0 : 1;// ((double) (tCurVis.getValue() - tMinVis)) / 3;

			TVisibility minVis = TVisibility.get(tMinVis);
			createMetric(apg, tMember, igam, minVis);

			methods.add(igam);

			return minVis;
		}
		return TVisibility.TPUBLIC;
	}

	private boolean isMainMethod(TMember tMember) {
		if (tMember instanceof TMethodDefinition) {
			TMethodDefinition tMethod = (TMethodDefinition) tMember;
			TMethodSignature tSignature = tMethod.getSignature();
			if ("main".equals(tSignature.getMethod().getTName())) {
				TModifier tModifier = tMethod.getTModifier();
				if (tModifier.isIsStatic() && tModifier.getTVisibility() == TVisibility.TPUBLIC) {
					EList<TParameter> tParams = tSignature.getParamList().getEntries();
					if (tParams.size() == 0) {
						TParameter tParam = tParams.get(0);
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
		HIGAMMetric metric = MetricsFactory.eINSTANCE.createHIGAMMetric();
		metric.setValue(igam);
		metric.setApg(apg);
		metric.setTAnnotated(annotatable);
		metric.setHMinVis(minVis);

		getHAnnotation().add(metric);
		annotatable.getTAnnotation().add(metric);
	}

	@Override
	public String getGuiName() {
		return "Inappropriate Generosity with Accessibility of Methods";
	}

	// <-- [user code injected with eMoflon]

	private static final Logger LOGGER = Logger.getLogger(HIGAMCalculator.class);

	private TVisibility acc1acc2(TAccess tAccess) {
		TAbstractType tType = tAccess.getTTarget().getDefinedBy();
		TAbstractType tAccessingType = tAccess.getTSource().getDefinedBy();

		//acc1
		TVisibility tVisibility = access(tAccessingType, tType);

		//acc2
		TAbstractType sourceClass = (TAbstractType) tAccess.getTSource().getDefinedBy();
		if (tVisibility == TVisibility.TPROTECTED && tAccess.getStaticType() != null
				&& tAccess.getStaticType() instanceof TClass
				&& !(((TClass) tAccess.getStaticType()).isSubTypeOf(sourceClass))
				&& sourceClass != tAccess.getStaticType()) {
			return TVisibility.TPUBLIC;
		}
		return tVisibility;
	}

	private TVisibility acc2(TAccess access) {
		TModifier targetMod = access.getTTarget().getTModifier();
		if (targetMod.isIsStatic()) {
			return TVisibility.TPRIVATE;
		}

		return TVisibility.TPUBLIC;
	}

	private TVisibility inh1(TAccess tAccess) {
		TAbstractType tStaticType = tAccess.getStaticType();
		TMember tMember = tAccess.getTTarget();
		TAbstractType tTarget = tMember.getDefinedBy();
		if (tStaticType == null || tStaticType.getTName().equals("Void")) {
			LOGGER.log(Level.ERROR,
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
		TMethodDefinition tOverriddenDef = member.getOverriding();
		if (tOverriddenDef != null) {

			TVisibility tOverriddenVis;
			TModifier tOverriddenMod = tOverriddenDef.getTModifier();
			if (tOverriddenMod != null) {
				return tOverriddenMod.getTVisibility();
			} else {
				LOGGER.log(Level.ERROR, "TVisibility of \"" + tOverriddenDef.getDefinedBy().getFullyQualifiedName()
						+ "->" + tOverriddenDef.getSignatureString() + "\" is null.");
				return TVisibility.TPUBLIC;
			}

		}
		return TVisibility.TPRIVATE;
	}

	private TVisibility access(TAbstractType tSource, TAbstractType tTarget) {
		if (!tTarget.equals(tSource) && !tTarget.getInnerTypes().contains(tSource)
				&& !tSource.equals(tTarget.getOuterType())) {
			TPackage tPackage = tTarget.getPackage();
			if (tPackage.equals(tSource.getPackage())) {
				return TVisibility.TPACKAGE;
			}

			boolean isSubClass = true;
			if (tSource instanceof TClass) {
				TClass tClass = (TClass) tSource;
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
} //HIGAMCalculatorImpl