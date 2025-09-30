/**
 */
package org.gravity.hulk.resolve.calculators.impl;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.detection.impl.HDetectorImpl;
import org.gravity.hulk.refactoringgraph.HInBlobAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;
import org.gravity.hulk.resolve.calculators.HInBlobAccessCalculator;
import org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIn Blob Access
 * Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HInBlobAccessCalculatorImpl extends HDetectorImpl implements HInBlobAccessCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param m2dc
	 * @param graph
	 *
	 * @generated
	 */
	public HInBlobAccessCalculatorImpl(final DFSGraph graph, final HMethodToDataClassAccessCalculator m2dc) {
		final var edge1 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		edge1.setGraph(graph);
		this.getOutgoing().add(edge1);
		m2dc.getIncoming().add(edge1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {// ForEach
		for (final Object[] result1_black : HInBlobAccessCalculatorImpl
				.pattern_HInBlobAccessCalculator_0_1_ActivityNode7_blackFFB(apg)) {
			// nothing HBlobAntiPattern blob = (HBlobAntiPattern) result1_black[0];
			final var tClass = (TClass) result1_black[1];

			final var tAllMembers = tClass.getAllTMembers();
			if (tAllMembers == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
			}
			for (final var tMember : tClass.getDefines()) {
				final var result3_green = HInBlobAccessCalculatorImpl
						.pattern_HInBlobAccessCalculator_0_3_ActivityNode8_greenBBBF(apg, this, tMember);
				final var iba = (HInBlobAccess) result3_green[3];

				// ForEach
				for (final TMember otherMember : tAllMembers) {
					//
					final var result5_black = HInBlobAccessCalculatorImpl
							.pattern_HInBlobAccessCalculator_0_5_ActivityNode14_blackBFB(tMember, otherMember);
					if (result5_black != null) {
						// nothing TAccess calling = (TAccess) result5_black[1];
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

	public static final Iterable<Object[]> pattern_HInBlobAccessCalculator_0_1_ActivityNode7_blackFFB(
			final HAntiPatternGraph apg) {
		final var _result = new LinkedList<Object[]>();
		for (final HAnnotation tmpBlob : apg.getHAnnotations()) {
			if (tmpBlob instanceof final HBlobAntiPattern blob) {
				final var tmpTClass = blob.getTAnnotated();
				if (tmpTClass instanceof final TClass tClass) {
					_result.add(new Object[] { blob, tClass, apg });
				}

			}
		}
		return _result;
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_2_ActivityNode12_bindingAndBlackFB(
			final TClass tClass) {
		final var tAllMembers = tClass.getAllTMembers();
		if (tAllMembers != null) {
			return new Object[] { tAllMembers, tClass };
		}
		return null;
	}

	public static final Object[] pattern_HInBlobAccessCalculator_0_3_ActivityNode8_greenBBBF(
			final HAntiPatternGraph apg,
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

	public static final double pattern_HInBlobAccessCalculator_0_6_ActivityNode11_expressionFB(
			final HInBlobAccess iba) {
		return iba.increment();
	}

	public static final boolean pattern_HInBlobAccessCalculator_0_7_expressionF() {
		return true;
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
} // HInBlobAccessCalculatorImpl