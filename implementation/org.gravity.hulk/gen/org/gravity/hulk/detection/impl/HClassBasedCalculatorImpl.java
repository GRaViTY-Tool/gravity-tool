/**
 */
package org.gravity.hulk.detection.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.impl.HDetectorImpl;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HClass Based Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HClassBasedCalculatorImpl extends HDetectorImpl implements HClassBasedCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HClassBasedCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DetectionPackage.Literals.HCLASS_BASED_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph pg) {// ForEach 
		for (Object[] result1_black : HClassBasedCalculatorImpl
				.pattern_HClassBasedCalculator_1_1_ActivityNode6_blackFBFB(pg, this)) {
			TClass tClass = (TClass) result1_black[0];
			//nothing TypeGraph o = (TypeGraph) result1_black[2];
			// 
			Object[] result2_bindingAndBlack = HClassBasedCalculatorImpl
					.pattern_HClassBasedCalculator_1_2_ActivityNode7_bindingAndBlackFBBB(tClass, this, pg);
			if (result2_bindingAndBlack != null) {
				HAnnotation metric = (HAnnotation) result2_bindingAndBlack[0];
				HClassBasedCalculatorImpl.pattern_HClassBasedCalculator_1_2_ActivityNode7_greenBBBB(metric, tClass,
						this, pg);

			} else {
			}

		}
		return HClassBasedCalculatorImpl.pattern_HClassBasedCalculator_1_3_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HClassBasedCalculator_1_1_ActivityNode6_black_nac_0BB(TClass tClass,
			HClassBasedCalculator _this) {
		for (TAnnotation tmpExisting : tClass.getTAnnotation()) {
			if (tmpExisting instanceof HAnnotation) {
				HAnnotation existing = (HAnnotation) tmpExisting;
				if (_this.getHAnnotation().contains(existing)) {
					return new Object[] { tClass, _this };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_HClassBasedCalculator_1_1_ActivityNode6_blackFBFB(
			HAntiPatternGraph pg, HClassBasedCalculator _this) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		TypeGraph o = pg.getPg();
		if (o != null) {
			for (TClass tClass : o.getClasses()) {
				boolean tClass_tLib = tClass.isTLib();
				if (Boolean.valueOf(tClass_tLib).equals(Boolean.valueOf(false))) {
					String tClass_tName = tClass.getTName();
					if (!tClass_tName.equals("Anonymous")) {
						if (!tClass_tName.equals("T")) {
							if (pattern_HClassBasedCalculator_1_1_ActivityNode6_black_nac_0BB(tClass, _this) == null) {
								_result.add(new Object[] { tClass, pg, o, _this });
							}
						}
					}

				}

			}
		}

		return _result;
	}

	public static final Object[] pattern_HClassBasedCalculator_1_2_ActivityNode7_bindingFBB(HClassBasedCalculator _this,
			TClass tClass) {
		HAnnotation _localVariable_0 = _this.calculate(tClass);
		HAnnotation metric = _localVariable_0;
		if (metric != null) {
			return new Object[] { metric, _this, tClass };
		}
		return null;
	}

	public static final Object[] pattern_HClassBasedCalculator_1_2_ActivityNode7_blackBBBB(HAnnotation metric,
			TClass tClass, HClassBasedCalculator _this, HAntiPatternGraph pg) {
		return new Object[] { metric, tClass, _this, pg };
	}

	public static final Object[] pattern_HClassBasedCalculator_1_2_ActivityNode7_bindingAndBlackFBBB(TClass tClass,
			HClassBasedCalculator _this, HAntiPatternGraph pg) {
		Object[] result_pattern_HClassBasedCalculator_1_2_ActivityNode7_binding = pattern_HClassBasedCalculator_1_2_ActivityNode7_bindingFBB(
				_this, tClass);
		if (result_pattern_HClassBasedCalculator_1_2_ActivityNode7_binding != null) {
			HAnnotation metric = (HAnnotation) result_pattern_HClassBasedCalculator_1_2_ActivityNode7_binding[0];

			Object[] result_pattern_HClassBasedCalculator_1_2_ActivityNode7_black = pattern_HClassBasedCalculator_1_2_ActivityNode7_blackBBBB(
					metric, tClass, _this, pg);
			if (result_pattern_HClassBasedCalculator_1_2_ActivityNode7_black != null) {

				return new Object[] { metric, tClass, _this, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_HClassBasedCalculator_1_2_ActivityNode7_greenBBBB(HAnnotation metric,
			TClass tClass, HClassBasedCalculator _this, HAntiPatternGraph pg) {
		pg.getHAnnotations().add(metric);
		metric.setTAnnotated(tClass);
		_this.getHAnnotation().add(metric);
		return new Object[] { metric, tClass, _this, pg };
	}

	public static final boolean pattern_HClassBasedCalculator_1_3_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //HClassBasedCalculatorImpl
