/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HEmptyClassSmell;
import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HEmptyClassDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HEmpty Class Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HEmptyClassDetectorImpl extends HClassBasedCalculatorImpl implements HEmptyClassDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HEmptyClassDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HEMPTY_CLASS_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HAnnotation calculate(TClass tClass) {//
		if (!tClass.isTLib()&& tClass.getDefines().isEmpty()) {

			final Object[] result2_black = HEmptyClassDetectorImpl
					.pattern_HEmptyClassDetector_0_2_ActivityNode16_blackBB(tClass, this);
			if (result2_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
						+ "[this] = " + this + ".");
			}
			final Object[] result2_green = HEmptyClassDetectorImpl
					.pattern_HEmptyClassDetector_0_2_ActivityNode16_greenFBB(tClass, this);
			final HEmptyClassSmell smell = (HEmptyClassSmell) result2_green[0];

			return HEmptyClassDetectorImpl.pattern_HEmptyClassDetector_0_3_expressionFB(smell);
		} else {
			return HEmptyClassDetectorImpl.pattern_HEmptyClassDetector_0_4_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		if (operationID == CodesmellsPackage.HEMPTY_CLASS_DETECTOR___CALCULATE__TCLASS) {
			return calculate((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HEmptyClassDetector_0_2_ActivityNode16_blackBB(TClass tClass,
			HEmptyClassDetector _this) {
		return new Object[] { tClass, _this };
	}

	public static final Object[] pattern_HEmptyClassDetector_0_2_ActivityNode16_greenFBB(TClass tClass,
			HEmptyClassDetector _this) {
		final HEmptyClassSmell smell = CodesmellsFactory.eINSTANCE.createHEmptyClassSmell();
		smell.setTAnnotated(tClass);
		_this.getHAnnotation().add(smell);
		return new Object[] { smell, tClass, _this };
	}

	public static final HAnnotation pattern_HEmptyClassDetector_0_3_expressionFB(HEmptyClassSmell smell) {
		final HAnnotation _result = smell;
		return _result;
	}

	public static final HAnnotation pattern_HEmptyClassDetector_0_4_expressionF() {
		final HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Empty Class Smell";
	}

	// [user code injected with eMoflon] -->
} //HEmptyClassDetectorImpl
