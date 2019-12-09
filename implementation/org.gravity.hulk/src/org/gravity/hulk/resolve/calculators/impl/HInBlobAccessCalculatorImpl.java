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
	@Override
	public boolean detect(final HAntiPatternGraph apg) {// ForEach
		for (final Object[] result1_black : HInBlobAccessCalculatorImpl
				.pattern_HInBlobAccessCalculator_0_1_ActivityNode7_blackFFB(apg)) {
			//nothing HBlobAntiPattern blob = (HBlobAntiPattern) result1_black[0];
			final TClass tClass = (TClass) result1_black[1];

			final EList<TMember> tAllMembers = tClass.getAllTMembers();
			if (tAllMembers == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
			}
			// ForEach
			for (final Object[] result3_black : HInBlobAccessCalculatorImpl
					.pattern_HInBlobAccessCalculator_0_3_ActivityNode8_blackBBBF(apg, this, tClass)) {
				final TMember tMember = (TMember) result3_black[3];
				final Object[] result3_green = HInBlobAccessCalculatorImpl
						.pattern_HInBlobAccessCalculator_0_3_ActivityNode8_greenBBBF(apg, this, tMember);
				final HInBlobAccess iba = (HInBlobAccess) result3_green[3];

				// ForEach
				for (final TMember otherMember : tAllMembers) {
					//
					final Object[] result5_black = HInBlobAccessCalculatorImpl
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
		final LinkedList<Object[]> _result = new LinkedList<>();
		for (final HAnnotation tmpBlob : apg.getHAnnotations()) {
			if (tmpBlob instanceof HBlobAntiPattern) {
				final HBlobAntiPattern blob = (HBlobAntiPattern) tmpBlob;
				final TAnnotatable tmpTClass = blob.getTAnnotated();
				if (tmpTClass instanceof TClass) {
					final TClass tClass = (TClass) tmpTClass;
					_result.add(new Object[] { blob, tClass, apg });
				}

			}
		}
		return _result;
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_2_ActivityNode12_bindingAndBlackFB(final TClass tClass) {
		final EList<TMember> tAllMembers = tClass.getAllTMembers();
		if (tAllMembers != null) {
			return new Object[] { tAllMembers, tClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_HInBlobAccessCalculator_0_3_ActivityNode8_blackBBBF(
			final HAntiPatternGraph apg, final HInBlobAccessCalculator _this, final TClass tClass) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		for (final TMember tMember : tClass.getDefines()) {
			_result.add(new Object[] { apg, _this, tClass, tMember });
		}
		return _result;
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_3_ActivityNode8_greenBBBF(final HAntiPatternGraph apg,
			final HInBlobAccessCalculator _this, final TMember tMember) {
		final HInBlobAccess iba = RefactoringgraphFactory.eINSTANCE.createHInBlobAccess();
		_this.getHAnnotation().add(iba);
		iba.setTAnnotated(tMember);
		apg.getHAnnotations().add(iba);
		return new Object[] { apg, _this, tMember, iba };
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_5_ActivityNode14_blackBFB(final TMember tMember,
			final TMember otherMember) {
		if (!otherMember.equals(tMember)) {
			for (final TAccess calling : tMember.getTAccessing()) {
				if (otherMember.getAccessedBy().contains(calling)) {
					return new Object[] { tMember, calling, otherMember };
				}
			}
		}
		return null;
	}

	public static final double pattern_HInBlobAccessCalculator_0_6_ActivityNode11_expressionFB(final HInBlobAccess iba) {
		final double _localVariable_0 = iba.increment();
		final double _result = _localVariable_0;
		return _result;
	}

	public static final boolean pattern_HInBlobAccessCalculator_0_7_expressionF() {
		final boolean _result = Boolean.TRUE;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Calculate the In-Blob-Method accesses";
	}

	// [user code injected with eMoflon] -->
} //HInBlobAccessCalculatorImpl
