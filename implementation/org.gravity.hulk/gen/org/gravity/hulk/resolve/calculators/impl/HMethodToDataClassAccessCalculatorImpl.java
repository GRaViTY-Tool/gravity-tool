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

import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;

import org.gravity.hulk.detection.impl.HMetricCalculatorImpl;

import org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;

import org.gravity.hulk.resolve.calculators.CalculatorsPackage;
import org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator;

import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;

import org.gravity.typegraph.basic.annotations.TAnnotatable;

import org.gravity.typegraph.basic.containers.TMemberContainer;
// <-- [user defined imports]
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TSyntethicMethod;
import org.gravity.typegraph.basic.containers.ContainersFactory;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMethod To Data Class Access Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HMethodToDataClassAccessCalculatorImpl extends HMetricCalculatorImpl
		implements HMethodToDataClassAccessCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMethodToDataClassAccessCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculatorsPackage.Literals.HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph apg) {

		Object[] result1_black = HMethodToDataClassAccessCalculatorImpl
				.pattern_HMethodToDataClassAccessCalculator_0_1_ActivityNode1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		// ForEach 
		for (Object[] result2_black : HMethodToDataClassAccessCalculatorImpl
				.pattern_HMethodToDataClassAccessCalculator_0_2_ActivityNode2_blackBFF(apg)) {
			HBlobAntiPattern blob = (HBlobAntiPattern) result2_black[1];
			TClass tClass = (TClass) result2_black[2];
			// ForEach 
			for (Object[] result3_black : HMethodToDataClassAccessCalculatorImpl
					.pattern_HMethodToDataClassAccessCalculator_0_3_ActivityNode3_blackBF(tClass)) {
				TMember tMember = (TMember) result3_black[1];
				// ForEach 
				for (Object[] result4_black : HMethodToDataClassAccessCalculatorImpl
						.pattern_HMethodToDataClassAccessCalculator_0_4_ActivityNode18_blackBFF(blob)) {
					HDataClassSmell dataclass = (HDataClassSmell) result4_black[1];
					TClass tdataClass = (TClass) result4_black[2];

					Object[] result5_bindingAndBlack = HMethodToDataClassAccessCalculatorImpl
							.pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_bindingAndBlackFFBB(this,
									tdataClass);
					if (result5_bindingAndBlack == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this
								+ ", " + "[tdataClass] = " + tdataClass + ".");
					}
					TMemberContainer tAllEffectedMembers = (TMemberContainer) result5_bindingAndBlack[0];
					TMemberContainer tAllMembers = (TMemberContainer) result5_bindingAndBlack[1];
					// 
					Object[] result6_black = HMethodToDataClassAccessCalculatorImpl
							.pattern_HMethodToDataClassAccessCalculator_0_6_ActivityNode17_blackBBFF(tAllMembers,
									tMember);
					if (result6_black != null) {
						//nothing TMember someMember = (TMember) result6_black[2];
						//nothing TAccess someAccess = (TAccess) result6_black[3];

						Object[] result7_black = HMethodToDataClassAccessCalculatorImpl
								.pattern_HMethodToDataClassAccessCalculator_0_7_ActivityNode4_blackBBBBB(apg, this,
										dataclass, tdataClass, tMember);
						if (result7_black == null) {
							throw new RuntimeException("Pattern matching failed." + " Variables: " + "[apg] = " + apg
									+ ", " + "[this] = " + this + ", " + "[dataclass] = " + dataclass + ", "
									+ "[tdataClass] = " + tdataClass + ", " + "[tMember] = " + tMember + ".");
						}
						Object[] result7_green = HMethodToDataClassAccessCalculatorImpl
								.pattern_HMethodToDataClassAccessCalculator_0_7_ActivityNode4_greenBBFBBB(apg, this,
										dataclass, tdataClass, tMember);
						HMethodToDataClassAccess metric = (HMethodToDataClassAccess) result7_green[2];

						// ForEach 
						for (Object[] result8_black : HMethodToDataClassAccessCalculatorImpl
								.pattern_HMethodToDataClassAccessCalculator_0_8_ActivityNode5_blackFB(tAllMembers)) {
							TMember dcMember = (TMember) result8_black[0];
							// 
							Object[] result9_black = HMethodToDataClassAccessCalculatorImpl
									.pattern_HMethodToDataClassAccessCalculator_0_9_ActivityNode25_blackFBB(tMember,
											dcMember);
							if (result9_black != null) {
								//nothing TAccess calling = (TAccess) result9_black[0];
								// 
								HMethodToDataClassAccessCalculatorImpl
										.pattern_HMethodToDataClassAccessCalculator_0_10_ActivityNode20_expressionFB(
												metric);

							} else {
							}

						}
						// ForEach 
						for (Object[] result11_black : HMethodToDataClassAccessCalculatorImpl
								.pattern_HMethodToDataClassAccessCalculator_0_11_ActivityNode21_blackFB(
										tAllEffectedMembers)) {
							TMember dcMember2 = (TMember) result11_black[0];
							// 
							Object[] result12_black = HMethodToDataClassAccessCalculatorImpl
									.pattern_HMethodToDataClassAccessCalculator_0_12_ActivityNode26_blackBFB(tMember,
											dcMember2);
							if (result12_black != null) {
								//nothing TAccess access = (TAccess) result12_black[1];
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
		return HMethodToDataClassAccessCalculatorImpl.pattern_HMethodToDataClassAccessCalculator_0_14_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMemberContainer getAllAffectedMembers(TClass tClass) {
		// [user code injected with eMoflon]

		Set<TMember> allMembers = new HashSet<>();
		Stack<TClass> stack = new Stack<>();
		stack.add(tClass);
		while (!stack.isEmpty()) {
			TClass tNextClass = stack.pop();
			for (TMember member : tNextClass.getDefines()) {
				TMember redefined;
				if (member instanceof TMethodDefinition) {
					TMethodDefinition method = (TMethodDefinition) member;
					redefined = method.getOverriding();
				} else if (member instanceof TFieldDefinition) {
					TFieldDefinition field = (TFieldDefinition) member;
					redefined = field.getHiding();
				} else if (member instanceof TSyntethicMethod) {
					// Ignore synthetic methods
					continue;
				} else {
					throw new RuntimeException("Unknown TMember subtype.");
				}
				if (!allMembers.contains(redefined)) {
					allMembers.add(member);
				}
			}
			stack.addAll(tNextClass.getChildClasses());
		}
		TMemberContainer container = ContainersFactory.eINSTANCE.createTMemberContainer();
		container.getTMembers().addAll(allMembers);
		return container;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CalculatorsPackage.HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		case CalculatorsPackage.HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR___GET_ALL_AFFECTED_MEMBERS__TCLASS:
			return getAllAffectedMembers((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_1_ActivityNode1_blackB(
			HMethodToDataClassAccessCalculator _this) {
		return new Object[] { _this };
	}

	public static final Iterable<Object[]> pattern_HMethodToDataClassAccessCalculator_0_2_ActivityNode2_blackBFF(
			HAntiPatternGraph apg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (HAnnotation tmpBlob : apg.getHAnnotations()) {
			if (tmpBlob instanceof HBlobAntiPattern) {
				HBlobAntiPattern blob = (HBlobAntiPattern) tmpBlob;
				TAnnotatable tmpTClass = blob.getTAnnotated();
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					_result.add(new Object[] { apg, blob, tClass });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_HMethodToDataClassAccessCalculator_0_3_ActivityNode3_blackBF(
			TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tMember : tClass.getDefines()) {
			_result.add(new Object[] { tClass, tMember });
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_HMethodToDataClassAccessCalculator_0_4_ActivityNode18_blackBFF(
			HBlobAntiPattern blob) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (HDataClassSmell dataclass : blob.getHDataClassSmells()) {
			TAnnotatable tmpTdataClass = dataclass.getTAnnotated();
			if (tmpTdataClass instanceof TClass) {
				TClass tdataClass = (TClass) tmpTdataClass;
				_result.add(new Object[] { blob, dataclass, tdataClass });
			}

		}
		return _result;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_bindingFFBB(
			HMethodToDataClassAccessCalculator _this, TClass tdataClass) {
		TMemberContainer _localVariable_0 = _this.getAllAffectedMembers(tdataClass);
		TMemberContainer _localVariable_1 = tdataClass.getAllTMembersInContainer();
		TMemberContainer tAllEffectedMembers = _localVariable_0;
		if (tAllEffectedMembers != null) {
			TMemberContainer tAllMembers = _localVariable_1;
			if (tAllMembers != null) {
				return new Object[] { tAllEffectedMembers, tAllMembers, _this, tdataClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_blackBB(
			TMemberContainer tAllEffectedMembers, TMemberContainer tAllMembers) {
		if (!tAllEffectedMembers.equals(tAllMembers)) {
			return new Object[] { tAllEffectedMembers, tAllMembers };
		}
		return null;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_bindingAndBlackFFBB(
			HMethodToDataClassAccessCalculator _this, TClass tdataClass) {
		Object[] result_pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_binding = pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_bindingFFBB(
				_this, tdataClass);
		if (result_pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_binding != null) {
			TMemberContainer tAllEffectedMembers = (TMemberContainer) result_pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_binding[0];
			TMemberContainer tAllMembers = (TMemberContainer) result_pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_binding[1];

			Object[] result_pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_black = pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_blackBB(
					tAllEffectedMembers, tAllMembers);
			if (result_pattern_HMethodToDataClassAccessCalculator_0_5_ActivityNode13_black != null) {

				return new Object[] { tAllEffectedMembers, tAllMembers, _this, tdataClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_6_ActivityNode17_blackBBFF(
			TMemberContainer tAllMembers, TMember tMember) {
		for (TMember someMember : tAllMembers.getTMembers()) {
			if (!someMember.equals(tMember)) {
				for (TAccess someAccess : tMember.getTAccessing()) {
					if (someMember.getAccessedBy().contains(someAccess)) {
						return new Object[] { tAllMembers, tMember, someMember, someAccess };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_7_ActivityNode4_blackBBBBB(
			HAntiPatternGraph apg, HMethodToDataClassAccessCalculator _this, HDataClassSmell dataclass,
			TClass tdataClass, TMember tMember) {
		return new Object[] { apg, _this, dataclass, tdataClass, tMember };
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_7_ActivityNode4_greenBBFBBB(
			HAntiPatternGraph apg, HMethodToDataClassAccessCalculator _this, HDataClassSmell dataclass,
			TClass tdataClass, TMember tMember) {
		HMethodToDataClassAccess metric = RefactoringgraphFactory.eINSTANCE.createHMethodToDataClassAccess();
		apg.getHAnnotations().add(metric);
		_this.getHAnnotation().add(metric);
		metric.setTAnnotated(tMember);
		metric.setHDataClassSmell(dataclass);
		metric.setHDataClass(tdataClass);
		metric.setTMethodDefinition(tMember);
		return new Object[] { apg, _this, metric, dataclass, tdataClass, tMember };
	}

	public static final Iterable<Object[]> pattern_HMethodToDataClassAccessCalculator_0_8_ActivityNode5_blackFB(
			TMemberContainer tAllMembers) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember dcMember : tAllMembers.getTMembers()) {
			_result.add(new Object[] { dcMember, tAllMembers });
		}
		return _result;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_9_ActivityNode25_blackFBB(TMember tMember,
			TMember dcMember) {
		if (!dcMember.equals(tMember)) {
			for (TAccess calling : tMember.getTAccessing()) {
				if (dcMember.getAccessedBy().contains(calling)) {
					return new Object[] { calling, tMember, dcMember };
				}
			}
		}
		return null;
	}

	public static final double pattern_HMethodToDataClassAccessCalculator_0_10_ActivityNode20_expressionFB(
			HMethodToDataClassAccess metric) {
		double _localVariable_0 = metric.increment();
		double _result = Double.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_HMethodToDataClassAccessCalculator_0_11_ActivityNode21_blackFB(
			TMemberContainer tAllEffectedMembers) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember dcMember2 : tAllEffectedMembers.getTMembers()) {
			_result.add(new Object[] { dcMember2, tAllEffectedMembers });
		}
		return _result;
	}

	public static final Object[] pattern_HMethodToDataClassAccessCalculator_0_12_ActivityNode26_blackBFB(
			TMember tMember, TMember dcMember2) {
		if (!dcMember2.equals(tMember)) {
			for (TAccess access : tMember.getAccessedBy()) {
				if (dcMember2.getTAccessing().contains(access)) {
					return new Object[] { tMember, access, dcMember2 };
				}
			}
		}
		return null;
	}

	public static final double pattern_HMethodToDataClassAccessCalculator_0_13_ActivityNode6_expressionFB(
			HMethodToDataClassAccess metric) {
		double _localVariable_0 = metric.increment();
		double _result = Double.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_HMethodToDataClassAccessCalculator_0_14_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Calculate the Method accesses from Blob to DataClass";
	}

	// [user code injected with eMoflon] -->
} //HMethodToDataClassAccessCalculatorImpl
