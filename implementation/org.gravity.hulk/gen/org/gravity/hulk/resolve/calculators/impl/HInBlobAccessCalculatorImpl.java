/**
 */
package org.gravity.hulk.resolve.calculators.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;

import org.gravity.hulk.detection.impl.HMetricCalculatorImpl;

import org.gravity.hulk.refactoringgraph.HInBlobAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;

import org.gravity.hulk.resolve.calculators.CalculatorsPackage;
import org.gravity.hulk.resolve.calculators.HInBlobAccessCalculator;

import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;

import org.gravity.typegraph.basic.annotations.TAnnotatable;

import org.gravity.typegraph.basic.containers.TMemberContainer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIn Blob Access Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HInBlobAccessCalculatorImpl extends HMetricCalculatorImpl implements HInBlobAccessCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HInBlobAccessCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculatorsPackage.Literals.HIN_BLOB_ACCESS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph apg) {// ForEach 
		for (Object[] result1_black : HInBlobAccessCalculatorImpl
				.pattern_HInBlobAccessCalculator_0_1_ActivityNode7_blackFFB(apg)) {
			//nothing HBlobAntiPattern blob = (HBlobAntiPattern) result1_black[0];
			TClass tClass = (TClass) result1_black[1];

			Object[] result2_bindingAndBlack = HInBlobAccessCalculatorImpl
					.pattern_HInBlobAccessCalculator_0_2_ActivityNode12_bindingAndBlackFB(tClass);
			if (result2_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
			}
			TMemberContainer tAllMembers = (TMemberContainer) result2_bindingAndBlack[0];
			// ForEach 
			for (Object[] result3_black : HInBlobAccessCalculatorImpl
					.pattern_HInBlobAccessCalculator_0_3_ActivityNode8_blackBBBF(apg, this, tClass)) {
				TMember tMember = (TMember) result3_black[3];
				Object[] result3_green = HInBlobAccessCalculatorImpl
						.pattern_HInBlobAccessCalculator_0_3_ActivityNode8_greenBBBF(apg, this, tMember);
				HInBlobAccess iba = (HInBlobAccess) result3_green[3];

				// ForEach 
				for (Object[] result4_black : HInBlobAccessCalculatorImpl
						.pattern_HInBlobAccessCalculator_0_4_ActivityNode10_blackBF(tAllMembers)) {
					TMember otherMember = (TMember) result4_black[1];
					// 
					Object[] result5_black = HInBlobAccessCalculatorImpl
							.pattern_HInBlobAccessCalculator_0_5_ActivityNode14_blackBFB(tMember, otherMember);
					if (result5_black != null) {
						//nothing TAccess calling = (TAccess) result5_black[1];
						// 
						HInBlobAccessCalculatorImpl
								.pattern_HInBlobAccessCalculator_0_6_ActivityNode11_expressionFB(iba);

					} else {
					}

				}

			}

		}
		return HInBlobAccessCalculatorImpl.pattern_HInBlobAccessCalculator_0_7_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CalculatorsPackage.HIN_BLOB_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Iterable<Object[]> pattern_HInBlobAccessCalculator_0_1_ActivityNode7_blackFFB(
			HAntiPatternGraph apg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (HAnnotation tmpBlob : apg.getHAnnotations()) {
			if (tmpBlob instanceof HBlobAntiPattern) {
				HBlobAntiPattern blob = (HBlobAntiPattern) tmpBlob;
				TAnnotatable tmpTClass = blob.getTAnnotated();
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					_result.add(new Object[] { blob, tClass, apg });
				}

			}
		}
		return _result;
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_2_ActivityNode12_bindingFB(TClass tClass) {
		TMemberContainer _localVariable_0 = tClass.getAllTMembersInContainer();
		TMemberContainer tAllMembers = _localVariable_0;
		if (tAllMembers != null) {
			return new Object[] { tAllMembers, tClass };
		}
		return null;
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_2_ActivityNode12_blackB(
			TMemberContainer tAllMembers) {
		return new Object[] { tAllMembers };
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_2_ActivityNode12_bindingAndBlackFB(TClass tClass) {
		Object[] result_pattern_HInBlobAccessCalculator_0_2_ActivityNode12_binding = pattern_HInBlobAccessCalculator_0_2_ActivityNode12_bindingFB(
				tClass);
		if (result_pattern_HInBlobAccessCalculator_0_2_ActivityNode12_binding != null) {
			TMemberContainer tAllMembers = (TMemberContainer) result_pattern_HInBlobAccessCalculator_0_2_ActivityNode12_binding[0];

			Object[] result_pattern_HInBlobAccessCalculator_0_2_ActivityNode12_black = pattern_HInBlobAccessCalculator_0_2_ActivityNode12_blackB(
					tAllMembers);
			if (result_pattern_HInBlobAccessCalculator_0_2_ActivityNode12_black != null) {

				return new Object[] { tAllMembers, tClass };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_HInBlobAccessCalculator_0_3_ActivityNode8_blackBBBF(
			HAntiPatternGraph apg, HInBlobAccessCalculator _this, TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tMember : tClass.getDefines()) {
			_result.add(new Object[] { apg, _this, tClass, tMember });
		}
		return _result;
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_3_ActivityNode8_greenBBBF(HAntiPatternGraph apg,
			HInBlobAccessCalculator _this, TMember tMember) {
		HInBlobAccess iba = RefactoringgraphFactory.eINSTANCE.createHInBlobAccess();
		_this.getHAnnotation().add(iba);
		iba.setTAnnotated(tMember);
		apg.getHAnnotations().add(iba);
		return new Object[] { apg, _this, tMember, iba };
	}

	public static final Iterable<Object[]> pattern_HInBlobAccessCalculator_0_4_ActivityNode10_blackBF(
			TMemberContainer tAllMembers) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember otherMember : tAllMembers.getTMembers()) {
			_result.add(new Object[] { tAllMembers, otherMember });
		}
		return _result;
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_5_ActivityNode14_blackBFB(TMember tMember,
			TMember otherMember) {
		if (!otherMember.equals(tMember)) {
			for (TAccess calling : tMember.getTAccessing()) {
				if (otherMember.getAccessedBy().contains(calling)) {
					return new Object[] { tMember, calling, otherMember };
				}
			}
		}
		return null;
	}

	public static final double pattern_HInBlobAccessCalculator_0_6_ActivityNode11_expressionFB(HInBlobAccess iba) {
		double _localVariable_0 = iba.increment();
		double _result = Double.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_HInBlobAccessCalculator_0_7_expressionF() {
		boolean _result = Boolean.TRUE;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Calculate the In-Blob-Method accesses";
	}

	// [user code injected with eMoflon] -->
} //HInBlobAccessCalculatorImpl
