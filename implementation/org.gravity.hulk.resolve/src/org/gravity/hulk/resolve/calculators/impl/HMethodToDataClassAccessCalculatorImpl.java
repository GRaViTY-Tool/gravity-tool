/**
 */
package org.gravity.hulk.resolve.calculators.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
// <-- [user defined imports]
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
import org.gravity.hulk.detection.antipattern.impl.HBlobDetector;
import org.gravity.hulk.detection.impl.HDetectorImpl;
import org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;
import org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TSyntethicMethod;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HMethod
 * To Data Class Access Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HMethodToDataClassAccessCalculatorImpl extends HDetectorImpl
		implements HMethodToDataClassAccessCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param blobDetector
	 * @param graph
	 *
	 * @generated
	 */
	public HMethodToDataClassAccessCalculatorImpl(final DFSGraph graph, final HBlobDetector blobDetector) {
		final var edge2 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		edge2.setGraph(graph);
		this.getOutgoing().add(edge2);
		blobDetector.getIncoming().add(edge2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {

		final var result1_black = HMethodToDataClassAccessCalculatorImpl
				.pattern_HMethodToDataClassAccessCalculator_0_1_ActivityNode1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		// ForEach
		for (final Object[] result2_black : HMethodToDataClassAccessCalculatorImpl
				.pattern_HMethodToDataClassAccessCalculator_0_2_ActivityNode2_blackBFF(apg)) {
			final var blob = (HBlobAntiPattern) result2_black[1];
			final var tClass = (TClass) result2_black[2];
			// ForEach
			for (final Object[] result3_black : HMethodToDataClassAccessCalculatorImpl
					.pattern_HMethodToDataClassAccessCalculator_0_3_ActivityNode3_blackBF(tClass)) {
				final var tMember = (TMember) result3_black[1];
				// ForEach
				for (final Object[] result4_black : HMethodToDataClassAccessCalculatorImpl
						.pattern_HMethodToDataClassAccessCalculator_0_4_ActivityNode18_blackBFF(blob)) {
					final var dataclass = (HDataClassSmell) result4_black[1];
					final var tdataClass = (TClass) result4_black[2];

					final var result5_bindingAndBlack = HMethodToDataClassAccessCalculatorImpl
							.pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_bindingAndBlackFFBB(this,
									tdataClass);
					if (result5_bindingAndBlack == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this
								+ ", " + "[tdataClass] = " + tdataClass + ".");
					}
					final var tAllEffectedMembers = (EList<TMember>) result5_bindingAndBlack[0];
					final var tAllMembers = (EList<TMember>) result5_bindingAndBlack[1];
					//
					final var result6_black = HMethodToDataClassAccessCalculatorImpl
							.pattern_HMethodToDataClassAccessCalculator_0_6_ActivityNode17_blackBBFF(tAllMembers,
									tMember);
					if (result6_black != null) {
						// nothing TMember someMember = (TMember) result6_black[2];
						// nothing TAccess someAccess = (TAccess) result6_black[3];

						final var result7_black = HMethodToDataClassAccessCalculatorImpl
								.pattern_HMethodToDataClassAccessCalculator_0_7_ActivityNode4_blackBBBBB(apg, this,
										dataclass, tdataClass, tMember);
						if (result7_black == null) {
							throw new RuntimeException("Pattern matching failed." + " Variables: " + "[apg] = " + apg
									+ ", " + "[this] = " + this + ", " + "[dataclass] = " + dataclass + ", "
									+ "[tdataClass] = " + tdataClass + ", " + "[tMember] = " + tMember + ".");
						}
						final var result7_green = HMethodToDataClassAccessCalculatorImpl
								.pattern_HMethodToDataClassAccessCalculator_0_7_ActivityNode4_greenBBFBBB(apg, this,
										dataclass, tdataClass, tMember);
						final var metric = (HMethodToDataClassAccess) result7_green[2];

						// ForEach
						for (final Object[] result8_black : HMethodToDataClassAccessCalculatorImpl
								.pattern_HMethodToDataClassAccessCalculator_0_8_ActivityNode5_blackFB(tAllMembers)) {
							final var dcMember = (TMember) result8_black[0];
							//
							final var result9_black = HMethodToDataClassAccessCalculatorImpl
									.pattern_HMethodToDataClassAccessCalculator_0_9_ActivityNode25_blackFBB(tMember,
											dcMember);
							if (result9_black != null) {
								// nothing TAccess calling = (TAccess) result9_black[0];
								//
								HMethodToDataClassAccessCalculatorImpl
										.pattern_HMethodToDataClassAccessCalculator_0_10_ActivityNode20_expressionFB(
												metric);

							} else {
							}

						}
						// ForEach
						for (final Object[] result11_black : HMethodToDataClassAccessCalculatorImpl
								.pattern_HMethodToDataClassAccessCalculator_0_11_ActivityNode21_blackFB(
										tAllEffectedMembers)) {
							final var dcMember2 = (TMember) result11_black[0];
							//
							final var result12_black = HMethodToDataClassAccessCalculatorImpl
									.pattern_HMethodToDataClassAccessCalculator_0_12_ActivityNode26_blackBFB(tMember,
											dcMember2);
							if (result12_black != null) {
								// nothing TAccess access = (TAccess) result12_black[1];
								//
								HMethodToDataClassAccessCalculatorImpl
										.pattern_HMethodToDataClassAccessCalculator_0_13_ActivityNode6_expressionFB(
												metric);

							} else {
							}

						}

					} else {
					}

				}

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
	public EList<TMember> getAllAffectedMembers(final TClass tClass) {
		// [user code injected with eMoflon]

		final Set<TMember> allMembers = new HashSet<>();
		final Deque<TClass> stack = new LinkedList<>();
		stack.add(tClass);
		while (!stack.isEmpty()) {
			final var tNextClass = stack.pop();
			for (final TMember member : tNextClass.getDefines()) {
				List<TMember> redefined;
				if (member instanceof final TMethodDefinition method) {
					redefined = new ArrayList<>(method.getOverriding());
				} else if (member instanceof final TFieldDefinition field) {
					redefined = Arrays.asList(field.getHiding());
				} else if (member instanceof TSyntethicMethod) {
					// Ignore synthetic methods
					continue;
				} else {
					throw new RuntimeException("Unknown TMember subtype.");
				}
				for (final TMember redefinedMember : redefined) {
					if (!allMembers.contains(redefinedMember)) {
						allMembers.add(member);
						break;
					}
				}
			}
			stack.addAll(tNextClass.getChildClasses());
		}
		final EList<TMember> container = new BasicEList<>();
		container.addAll(allMembers);
		return container;

	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_1_ActivityNode1_blackB(
			final HMethodToDataClassAccessCalculator _this) {
		return new Object[] { _this };
	}

	public static final Iterable<Object[]> pattern_HMethodToDataClassAccessCalculator_0_2_ActivityNode2_blackBFF(
			final HAntiPatternGraph apg) {
		final var _result = new LinkedList<Object[]>();
		for (final HAnnotation tmpBlob : apg.getHAnnotations()) {
			if (tmpBlob instanceof final HBlobAntiPattern blob) {
				final var tmpTClass = blob.getTAnnotated();
				if (tmpTClass instanceof final TClass tClass) {
					_result.add(new Object[] { apg, blob, tClass });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_HMethodToDataClassAccessCalculator_0_3_ActivityNode3_blackBF(
			final TClass tClass) {
		final var _result = new LinkedList<Object[]>();
		for (final TMember tMember : tClass.getDefines()) {
			_result.add(new Object[] { tClass, tMember });
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_HMethodToDataClassAccessCalculator_0_4_ActivityNode18_blackBFF(
			final HBlobAntiPattern blob) {
		final var _result = new LinkedList<Object[]>();
		for (final HDataClassSmell dataclass : blob.getHDataClassSmells()) {
			final var tmpTdataClass = dataclass.getTAnnotated();
			if (tmpTdataClass instanceof final TClass tdataClass) {
				_result.add(new Object[] { blob, dataclass, tdataClass });
			}

		}
		return _result;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_bindingFFBB(
			final HMethodToDataClassAccessCalculator _this, final TClass tdataClass) {
		final var tAllEffectedMembers = _this.getAllAffectedMembers(tdataClass);
		if (tAllEffectedMembers != null) {
			final var tAllMembers = tdataClass.getAllTMembers();
			if (tAllMembers != null) {
				return new Object[] { tAllEffectedMembers, tAllMembers, _this, tdataClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_bindingAndBlackFFBB(
			final HMethodToDataClassAccessCalculator _this, final TClass tdataClass) {
		final var result_pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_binding = pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_bindingFFBB(
				_this, tdataClass);
		if (result_pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_binding != null) {
			final var tAllEffectedMembers = (EList<TMember>) result_pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_binding[0];
			final var tAllMembers = (EList<TMember>) result_pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_binding[1];

			if (!tAllEffectedMembers.equals(tAllMembers)) {
				return new Object[] { tAllEffectedMembers, tAllMembers, _this, tdataClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_6_ActivityNode17_blackBBFF(
			final EList<TMember> tAllMembers, final TMember tMember) {
		for (final TMember someMember : tAllMembers) {
			if (!someMember.equals(tMember)) {
				for (final TAccess someAccess : tMember.getAccessing()) {
					if (someMember.getAccessedBy().contains(someAccess)) {
						return new Object[] { tAllMembers, tMember, someMember, someAccess };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_7_ActivityNode4_blackBBBBB(
			final HAntiPatternGraph apg, final HMethodToDataClassAccessCalculator _this,
			final HDataClassSmell dataclass, final TClass tdataClass, final TMember tMember) {
		return new Object[] { apg, _this, dataclass, tdataClass, tMember };
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_7_ActivityNode4_greenBBFBBB(
			final HAntiPatternGraph apg, final HMethodToDataClassAccessCalculator _this,
			final HDataClassSmell dataclass, final TClass tdataClass, final TMember tMember) {
		final var metric = RefactoringgraphFactory.eINSTANCE.createHMethodToDataClassAccess();
		apg.getHAnnotations().add(metric);
		_this.getHAnnotation().add(metric);
		metric.setTAnnotated(tMember);
		metric.setHDataClassSmell(dataclass);
		metric.setHDataClass(tdataClass);
		metric.setTMethodDefinition(tMember);
		return new Object[] { apg, _this, metric, dataclass, tdataClass, tMember };
	}

	public static final Iterable<Object[]> pattern_HMethodToDataClassAccessCalculator_0_8_ActivityNode5_blackFB(
			final EList<TMember> tAllMembers) {
		final var _result = new LinkedList<Object[]>();
		for (final TMember dcMember : tAllMembers) {
			_result.add(new Object[] { dcMember, tAllMembers });
		}
		return _result;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_9_ActivityNode25_blackFBB(
			final TMember tMember, final TMember dcMember) {
		if (!dcMember.equals(tMember)) {
			for (final TAccess calling : tMember.getAccessing()) {
				if (dcMember.getAccessedBy().contains(calling)) {
					return new Object[] { calling, tMember, dcMember };
				}
			}
		}
		return null;
	}

	public static final double pattern_HMethodToDataClassAccessCalculator_0_10_ActivityNode20_expressionFB(
			final HMethodToDataClassAccess metric) {
		return metric.increment();
	}

	public static final Iterable<Object[]> pattern_HMethodToDataClassAccessCalculator_0_11_ActivityNode21_blackFB(
			final EList<TMember> tAllEffectedMembers) {
		final var _result = new LinkedList<Object[]>();
		for (final TMember dcMember2 : tAllEffectedMembers) {
			_result.add(new Object[] { dcMember2, tAllEffectedMembers });
		}
		return _result;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_12_ActivityNode26_blackBFB(
			final TMember tMember, final TMember dcMember2) {
		if (!dcMember2.equals(tMember)) {
			for (final TAccess access : tMember.getAccessedBy()) {
				if (dcMember2.getAccessing().contains(access)) {
					return new Object[] { tMember, access, dcMember2 };
				}
			}
		}
		return null;
	}

	public static final double pattern_HMethodToDataClassAccessCalculator_0_13_ActivityNode6_expressionFB(
			final HMethodToDataClassAccess metric) {
		return metric.increment();
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Calculate the Method accesses from Blob to DataClass";
	}

	@Override
	public EClass getHAnnotationType() {
		return RefactoringgraphPackage.eINSTANCE.getHMethodToDataClassAccess();
	}

	// [user code injected with eMoflon] -->
} // HMethodToDataClassAccessCalculatorImpl