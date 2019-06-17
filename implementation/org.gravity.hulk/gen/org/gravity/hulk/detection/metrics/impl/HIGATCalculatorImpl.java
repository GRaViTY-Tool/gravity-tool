/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.detection.impl.HMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HIGATCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
// <-- [user defined imports]
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import org.gravity.hulk.antipatterngraph.metrics.HIGATMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
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
		case MetricsPackage.HIGAT_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]
	private static final Logger LOGGER =  Logger.getLogger(HIGATCalculatorImpl.class);


	private TVisibility process(HAntiPatternGraph apg, TPackage tPackage, List<Double> methods) {
		int start = methods.size();
		TVisibility requiredTVisibility = TVisibility.TPRIVATE;
		for (TPackage tSubPackage : tPackage.getSubpackage()) {
			TVisibility tVisibility = process(apg, tSubPackage, methods);
			if (tVisibility.ordinal() < requiredTVisibility.ordinal()) {
				requiredTVisibility = tVisibility;
			}
		}
		for (TAbstractType tType : tPackage.getOwnedTypes()) {
			if (tType.isDeclared()) {
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

	private TVisibility process(HAntiPatternGraph apg, TAbstractType tType, List<Double> methods) {
		TVisibility tMinVis = TVisibility.TPUBLIC;
		TModifier tModifier = tType.getTModifier();
		if(tModifier == null) {
			LOGGER.log(Level.ERROR, "Type has no modifier: "+tType.getFullyQualifiedName());
			return tMinVis;
		}
		TVisibility tCurVis = tModifier.getTVisibility();

		if (!(tType instanceof TInterface) || tType.getOuterType() != null) {

			Set<TAbstractType> accessedBy = new HashSet<>();
			for (TMember tMember : tType.getDefines()) {
				for (TAccess tAccess : tMember.getAccessedBy()) {
					TAbstractType definedBy = tAccess.getTSource().getDefinedBy();
					if (!tType.equals(definedBy) && !tType.getInnerTypes().contains(definedBy)
							&& !definedBy.equals(tType.getOuterType())) {
						accessedBy.add(definedBy);
					}
				}
			}
			tMinVis = TVisibility.TPRIVATE;

			if (accessedBy.size() > 0) {
				boolean onlySubClasses = true;
				TPackage tPackage = tType.getPackage();
				Set<TPackage> otherPackages = new HashSet<>();
				for (TAbstractType tAccessingType : accessedBy) {
					TPackage tOtherPackage = tAccessingType.getPackage();
					if (!tPackage.equals(tOtherPackage)) {
						otherPackages.add(tOtherPackage);
					}
					if (tAccessingType instanceof TClass) {
						TClass tClass = (TClass) tAccessingType;
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

		double igat = tCurVis.equals(tMinVis) ? 0 : 1;

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
		HIGATMetric metric = MetricsFactory.eINSTANCE.createHIGATMetric();
		metric.setValue(igam);
		metric.setApg(apg);
		metric.setTAnnotated(annotatable);
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
