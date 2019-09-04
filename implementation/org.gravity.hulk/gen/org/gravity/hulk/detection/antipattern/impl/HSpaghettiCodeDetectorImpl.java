/**
 */
package org.gravity.hulk.detection.antipattern.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternFactory;
import org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern;

import org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector;
import org.gravity.hulk.detection.impl.HAntiPatternDetectorImpl;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;
// <-- [user defined imports]
import java.util.ArrayList;
import java.util.List;
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HSpaghetti Code Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HSpaghettiCodeDetectorImpl extends HAntiPatternDetectorImpl implements HSpaghettiCodeDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HSpaghettiCodeDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HSPAGHETTI_CODE_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean detect(HAntiPatternGraph pg) {// ForEach
		for (TClass tClass : HClassBasedCalculatorImpl.getClassesToVisit(pg, this)) {
			HAnnotation metric = calculate(tClass);
			if (metric != null) {
				metric.setTAnnotated(tClass);
				pg.getHAnnotations().add(metric);
				getHAnnotation().add(metric);

			}
		}
		return true;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {
		HIntenseFieldUsageCodeSmell intenseFieldUsage = null;
		HAverageParametersMetric averageParams = null;
		HDepthOfInheritanceMetric depthOfInheritance = null;
		HNumberOfChildMetric numberOfChild = null;
		HAverageOverloadingInClassMetric averageOverloading = null;
		for (TAnnotation annotation : tClass.getTAnnotation()) {
			if (annotation instanceof HAverageParametersMetric) {
				averageParams = (HAverageParametersMetric) annotation;
			} else if (annotation instanceof HIntenseFieldUsageCodeSmell) {
				intenseFieldUsage = (HIntenseFieldUsageCodeSmell) annotation;
			} else if (annotation instanceof HDepthOfInheritanceMetric) {
				depthOfInheritance = (HDepthOfInheritanceMetric) annotation;
			} else if (annotation instanceof HNumberOfChildMetric) {
				numberOfChild = (HNumberOfChildMetric) annotation;
			} else if (annotation instanceof HAverageOverloadingInClassMetric) {
				averageOverloading = (HAverageOverloadingInClassMetric) annotation;
			}
		}
		if (intenseFieldUsage == null || averageParams == null || depthOfInheritance == null || numberOfChild == null
				|| averageOverloading == null) {
			return null;
		}

		collect(intenseFieldUsage);

		if (HRelativeValueConstants.VERY_LOW.equals(averageParams.getRelativeAmount())) {

			HRelativeValue iRelative = depthOfInheritance.getRelativeAmount();
			if (iRelative != null && HRelativeValueConstants.VERY_LOW.equals(iRelative.getValue())) {
				collect(depthOfInheritance);
				//
				HRelativeValue cRelative = numberOfChild.getRelativeAmount();
				if (cRelative != null && HRelativeValueConstants.VERY_LOW.equals(cRelative.getValue())) {
					collect(numberOfChild);

				}
				//
				HRelativeValue oRelative = averageOverloading.getRelativeAmount();
				if (oRelative != null && HRelativeValueConstants.VERY_LOW.equals(oRelative.getValue())) {
					collect(averageOverloading);
				}

			} else {
				HRelativeValue cRelative = numberOfChild.getRelativeAmount();
				if (cRelative != null && HRelativeValueConstants.VERY_LOW.equals(cRelative.getValue())) {
					collect(numberOfChild);
					//
					HRelativeValue oRelative = averageOverloading.getRelativeAmount();
					if (oRelative != null && HRelativeValueConstants.VERY_LOW.equals(oRelative.getValue())) {
						collect(averageOverloading);
					}

				} else {
					HRelativeValue oRelative = averageOverloading.getRelativeAmount();
					if (oRelative != null && HRelativeValueConstants.VERY_LOW.equals(oRelative.getValue())) {
						collect(averageOverloading);
					} else {
						return null;
					}

				}

			}
			HSpaghettiCodeAntiPattern anti = AntipatternFactory.eINSTANCE.createHSpaghettiCodeAntiPattern();
			anti.setTAnnotated(tClass);
			getHAnnotation().add(anti);
			//
			connect(anti);
			//

			TAnnotationType tType = getAnnotationType(tClass.getPg(), "SpaghettiCode");
			if (tType != null) {
				TAnnotation tAnnotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
				tAnnotation.setTAnnotated(tClass);
				tType.getAnnotations().add(tAnnotation);
			}
			return anti;
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean collect(HAnnotation hAnnotation) {
		// [user code injected with eMoflon]

		return annotations.add(hAnnotation);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean connect(HSpaghettiCodeAntiPattern hAntiPattern) {
		// [user code injected with eMoflon]

		for (HAnnotation a : annotations) {
			a.getPartOf().add(hAntiPattern);
			if (a instanceof HIntenseFieldUsageCodeSmell) {
				hAntiPattern.setHIntenseFieldUsageCodeSmell((HIntenseFieldUsageCodeSmell) a);
			} else if (a instanceof HAverageParametersMetric) {
				hAntiPattern.setHAverageParametersMetric((HAverageParametersMetric) a);
			} else if (a instanceof HAverageOverloadingInClassMetric) {
				hAntiPattern.setHAverageOverloadingInClassMetric((HAverageOverloadingInClassMetric) a);
			} else if (a instanceof HNumberOfChildMetric) {
				hAntiPattern.setHNumberOfChild((HNumberOfChildMetric) a);
			} else if (a instanceof HDepthOfInheritanceMetric) {
				hAntiPattern.setHDepthOfInheritanceMetric((HDepthOfInheritanceMetric) a);
			}
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
		case AntipatternPackage.HSPAGHETTI_CODE_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case AntipatternPackage.HSPAGHETTI_CODE_DETECTOR___COLLECT__HANNOTATION:
			return collect((HAnnotation) arguments.get(0));
		case AntipatternPackage.HSPAGHETTI_CODE_DETECTOR___CONNECT__HSPAGHETTICODEANTIPATTERN:
			return connect((HSpaghettiCodeAntiPattern) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final HNumberOfChildMetric getNumberOfChildMetric(TClass tClass) {
		for (TAnnotation tmpChild : tClass.getTAnnotation()) {
			if (tmpChild instanceof HNumberOfChildMetric) {
				return (HNumberOfChildMetric) tmpChild;
			}
		}
		return null;
	}

	// <-- [user code injected with eMoflon]

	private List<HAnnotation> annotations = new ArrayList<>();

	@Override
	public String getGuiName() {
		return "Spaghetti Code [Anti-Pattern]";
	}

	// [user code injected with eMoflon] -->
} // HSpaghettiCodeDetectorImpl
