/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
// <-- [user defined imports]
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.metrics.HIGATMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HIGATCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIGAT Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HIGATCalculatorImpl extends HMetricCalculatorImpl implements HIGATCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HIGATCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HIGAT_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HIGAT_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]
	private static final Logger LOGGER =  Logger.getLogger(HIGATCalculatorImpl.class);


	private TVisibility process(HAntiPatternGraph apg, TPackage tPackage, List<Double> methods) {
		final int start = methods.size();
		TVisibility requiredTVisibility = TVisibility.TPRIVATE;
		for (final TPackage tSubPackage : tPackage.getSubpackage()) {
			final TVisibility tVisibility = process(apg, tSubPackage, methods);
			if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
				requiredTVisibility = tVisibility;
			}
		}
		for (final TAbstractType tType : tPackage.getOwnedTypes()) {
			if (tType.isDeclared()) {
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

	private TVisibility process(HAntiPatternGraph apg, TAbstractType tType, List<Double> methods) {
		TVisibility tMinVis = TVisibility.TPUBLIC;
		final TModifier tModifier = tType.getTModifier();
		if(tModifier == null) {
			LOGGER.error("Type has no modifier: "+tType.getFullyQualifiedName());
			return tMinVis;
		}
		final TVisibility tCurVis = tModifier.getTVisibility();

		if (!(tType instanceof TInterface) || tType.getOuterType() != null) {

			final Set<TAbstractType> accessedBy = new HashSet<>();
			for (final TMember tMember : tType.getDefines()) {
				for (final TAccess tAccess : tMember.getAccessedBy()) {
					final TAbstractType definedBy = tAccess.getTSource().getDefinedBy();
					if (!tType.equals(definedBy) && !tType.getInnerTypes().contains(definedBy)
							&& !definedBy.equals(tType.getOuterType())) {
						accessedBy.add(definedBy);
					}
				}
			}
			tMinVis = TVisibility.TPRIVATE;

			if (accessedBy.size() > 0) {
				boolean onlySubClasses = true;
				final TPackage tPackage = tType.getPackage();
				final Set<TPackage> otherPackages = new HashSet<>();
				for (final TAbstractType tAccessingType : accessedBy) {
					final TPackage tOtherPackage = tAccessingType.getPackage();
					if (!tPackage.equals(tOtherPackage)) {
						otherPackages.add(tOtherPackage);
					}
					if (tAccessingType instanceof TClass) {
						final TClass tClass = (TClass) tAccessingType;
						onlySubClasses &= tType.equals(tClass.getParentClass())
								|| tClass.getImplements().contains(tType);
					} else if (tAccessingType instanceof TInterface) {
						onlySubClasses &= ((TInterface) tAccessingType).getParentInterfaces().contains(tType);
					}
				}
				if (otherPackages.size() == 0) {
					tMinVis = TVisibility.TPACKAGE;
				} else {
					if (onlySubClasses) {
						tMinVis = TVisibility.TPROTECTED;
					} else {
						tMinVis = TVisibility.TPUBLIC;
					}
				}
			}
		}

		final double igat = tCurVis.equals(tMinVis) ? 0 : 1;

		createMetric(apg, tType, igat, tMinVis);

		methods.add(igat);

		return tMinVis;
	}

	private double getAverage(List<Double> values, int start, int end) {
		double avg = 0;
		for (int i = start; i < end; i++) {
			avg += values.get(i);
		}
		return avg / (end - start);
	}

	private void createMetric(HAntiPatternGraph apg, TAnnotatable annotatable, double igam, TVisibility minVis) {
		final HIGATMetric metric = MetricsFactory.eINSTANCE.createHIGATMetric();
		metric.setTAnnotated(annotatable);
		metric.setValue(igam);
		metric.setApg(apg);
		metric.setHMinVis(minVis);

		getHAnnotation().add(metric);
		annotatable.getTAnnotation().add(metric);
	}

	@Override
	public String getGuiName() {
		return "Inappropriate Generosity with Accessibility of Types";
	}

	// [user code injected with eMoflon] -->
} //HIGATCalculatorImpl
