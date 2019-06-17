/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell;

import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HGetterSetterDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HGetter Setter Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HGetterSetterDetectorImpl extends HCodeSmellDetectorImpl implements HGetterSetterDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HGetterSetterDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HGETTER_SETTER_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGetterSetter(TMethodDefinition method) {
		// [user code injected with eMoflon]

		String tName = method.getSignature().getMethod().getTName();
		return tName.startsWith("get") || tName.startsWith("get");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {

		Object[] result1_black = HGetterSetterDetectorImpl
				.pattern_HGetterSetterDetector_1_1_ActivityNode2_blackBFB(tClass, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[this] = " + this + ".");
		}
		HNACCMetric nacc = (HNACCMetric) result1_black[1];
		// ForEach 
		for (Object[] result2_black : HGetterSetterDetectorImpl
				.pattern_HGetterSetterDetector_1_2_ActivityNode3_blackBF(tClass)) {
			TMethodDefinition tMember = (TMethodDefinition) result2_black[1];
			// 
			if (HGetterSetterDetectorImpl.pattern_HGetterSetterDetector_1_3_ActivityNode44_expressionFBB(this,
					tMember)) {

				Object[] result4_black = HGetterSetterDetectorImpl
						.pattern_HGetterSetterDetector_1_4_ActivityNode45_blackBBB(this, tMember, nacc);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[tMember] = " + tMember + ", " + "[nacc] = " + nacc + ".");
				}
				HGetterSetterDetectorImpl.pattern_HGetterSetterDetector_1_4_ActivityNode45_greenBBFB(this, tMember,
						nacc);
				//nothing HGetterSetterSmell gs = (HGetterSetterSmell) result4_green[2];

			} else {
			}

		}
		return HGetterSetterDetectorImpl.pattern_HGetterSetterDetector_1_5_expressionFB(nacc);
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == HDetector.class) {
			switch (baseOperationID) {
			case HulkPackage.HDETECTOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HGETTER_SETTER_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HGETTER_SETTER_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HGETTER_SETTER_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CodesmellsPackage.HGETTER_SETTER_DETECTOR___IS_GETTER_SETTER__TMETHODDEFINITION:
			return isGetterSetter((TMethodDefinition) arguments.get(0));
		case CodesmellsPackage.HGETTER_SETTER_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HGETTER_SETTER_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HGetterSetterDetector_1_1_ActivityNode2_blackBFB(TClass tClass,
			HGetterSetterDetector _this) {
		for (TAnnotation tmpNacc : tClass.getTAnnotation()) {
			if (tmpNacc instanceof HNACCMetric) {
				HNACCMetric nacc = (HNACCMetric) tmpNacc;
				return new Object[] { tClass, nacc, _this };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_HGetterSetterDetector_1_2_ActivityNode3_blackBF(TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tmpTMember : tClass.getDefines()) {
			if (tmpTMember instanceof TMethodDefinition) {
				TMethodDefinition tMember = (TMethodDefinition) tmpTMember;
				_result.add(new Object[] { tClass, tMember });
			}
		}
		return _result;
	}

	public static final boolean pattern_HGetterSetterDetector_1_3_ActivityNode44_expressionFBB(
			HGetterSetterDetector _this, TMethodDefinition tMember) {
		boolean _localVariable_0 = _this.isGetterSetter(tMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HGetterSetterDetector_1_4_ActivityNode45_blackBBB(HGetterSetterDetector _this,
			TMethodDefinition tMember, HNACCMetric nacc) {
		return new Object[] { _this, tMember, nacc };
	}

	public static final Object[] pattern_HGetterSetterDetector_1_4_ActivityNode45_greenBBFB(HGetterSetterDetector _this,
			TMethodDefinition tMember, HNACCMetric nacc) {
		HGetterSetterSmell gs = CodesmellsFactory.eINSTANCE.createHGetterSetterSmell();
		_this.getHAnnotation().add(gs);
		gs.setTAnnotated(tMember);
		gs.getPartOf().add(nacc);
		nacc.getHGetterSetterSmells().add(gs);
		return new Object[] { _this, tMember, gs, nacc };
	}

	public static final HAnnotation pattern_HGetterSetterDetector_1_5_expressionFB(HNACCMetric nacc) {
		HAnnotation _result = nacc;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Getter/Setter Smell";
	}

	// [user code injected with eMoflon] -->
} //HGetterSetterDetectorImpl
