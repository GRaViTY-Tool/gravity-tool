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
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;
import org.gravity.hulk.resolve.calculators.CalculatorsPackage;
import org.gravity.hulk.resolve.calculators.HInBlobAccessCalculator;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;

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
	@Override
	public boolean detect(final HAntiPatternGraph apg) {// ForEach
		for (final Object[] result1_black : HInBlobAccessCalculatorImpl
				.pattern_HInBlobAccessCalculator_0_1_ActivityNode7_blackFFB(apg)) {
			//nothing HBlobAntiPattern blob = (HBlobAntiPattern) result1_black[0];
			final var tClass = (TClass) result1_black[1];

			final var tAllMembers = tClass.getAllTMembers();
			if (tAllMembers == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
			}
			// ForEach
			for (final Object[] result3_black : HInBlobAccessCalculatorImpl
					.pattern_HInBlobAccessCalculator_0_3_ActivityNode8_blackBBBF(apg, this, tClass)) {
				final var tMember = (TMember) result3_black[3];
				final var result3_green = HInBlobAccessCalculatorImpl
						.pattern_HInBlobAccessCalculator_0_3_ActivityNode8_greenBBBF(apg, this, tMember);
				final var iba = (HInBlobAccess) result3_green[3];

				// ForEach
				for (final TMember otherMember : tAllMembers) {
					//
					final var result5_black = HInBlobAccessCalculatorImpl
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
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CalculatorsPackage.HIN_BLOB_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Iterable<Object[]> pattern_HInBlobAccessCalculator_0_1_ActivityNode7_blackFFB(
			final HAntiPatternGraph apg) {
		final var _result = new LinkedList<Object[]>();
		for (final HAnnotation tmpBlob : apg.getHAnnotations()) {
			if (tmpBlob instanceof HBlobAntiPattern) {
				final var blob = (HBlobAntiPattern) tmpBlob;
				final var tmpTClass = blob.getTAnnotated();
				if (tmpTClass instanceof TClass) {
					final var tClass = (TClass) tmpTClass;
					_result.add(new Object[] { blob, tClass, apg });
				}

			}
		}
		return _result;
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_2_ActivityNode12_bindingAndBlackFB(final TClass tClass) {
		final var tAllMembers = tClass.getAllTMembers();
		if (tAllMembers != null) {
			return new Object[] { tAllMembers, tClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_HInBlobAccessCalculator_0_3_ActivityNode8_blackBBBF(
			final HAntiPatternGraph apg, final HInBlobAccessCalculator _this, final TClass tClass) {
		final var _result = new LinkedList<Object[]>();
		for (final TMember tMember : tClass.getDefines()) {
			_result.add(new Object[] { apg, _this, tClass, tMember });
		}
		return _result;
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_3_ActivityNode8_greenBBBF(final HAntiPatternGraph apg,
			final HInBlobAccessCalculator _this, final TMember tMember) {
		final var iba = RefactoringgraphFactory.eINSTANCE.createHInBlobAccess();
		_this.getHAnnotation().add(iba);
		iba.setTAnnotated(tMember);
		apg.getHAnnotations().add(iba);
		return new Object[] { apg, _this, tMember, iba };
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_5_ActivityNode14_blackBFB(final TMember tMember,
			final TMember otherMember) {
		if (!otherMember.equals(tMember)) {
			for (final TAccess calling : tMember.getAccessing()) {
				if (otherMember.getAccessedBy().contains(calling)) {
					return new Object[] { tMember, calling, otherMember };
				}
			}
		}
		return null;
	}

	public static final double pattern_HInBlobAccessCalculator_0_6_ActivityNode11_expressionFB(final HInBlobAccess iba) {
		final var _localVariable_0 = iba.increment();
		final var _result = _localVariable_0;
		return _result;
	}

	public static final boolean pattern_HInBlobAccessCalculator_0_7_expressionF() {
		final boolean _result = true;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Calculate the In-Blob-Method accesses";
	}

	@Override
	public EClass getHAnnotationType() {
		return RefactoringgraphPackage.eINSTANCE.getHInBlobAccess();
	}

	// [user code injected with eMoflon] -->
} //HInBlobAccessCalculatorImpl