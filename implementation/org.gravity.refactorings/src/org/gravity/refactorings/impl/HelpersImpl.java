/**
 */
package org.gravity.refactorings.impl;

import java.lang.Iterable;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Helpers</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.refactorings.impl.HelpersImpl#getTypeGraph <em>Type
 * Graph</em>}</li>
 * <li>{@link org.gravity.refactorings.impl.HelpersImpl#getSearch
 * <em>Search</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HelpersImpl {
	/**
	 * The cached value of the '{@link #getTypeGraph() <em>Type Graph</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypeGraph()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph typeGraph;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HelpersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TypeGraph getTypeGraph() {
		return typeGraph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTypeGraph(TypeGraph newTypeGraph) {
		typeGraph = newTypeGraph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean esc_Helper_MountAccesses(TClass child, TClass parent, TSignature tSignature) {

		if (tSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tSignature;
			// ForEach
			for (Object[] result4_black : HelpersImpl.pattern_Helpers_0_4_ActivityNode117_blackBFBF(child,
					tFieldSignature)) {
				TFieldDefinition tFieldDefinition = (TFieldDefinition) result4_black[1];
				TAccess tFieldAccess = (TAccess) result4_black[3];

				Object[] result5_black = HelpersImpl.pattern_Helpers_0_5_ActivityNode118_blackBBBBF(tFieldAccess,
						tFieldDefinition, parent, tFieldSignature);
				if (result5_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tFieldAccess] = "
							+ tFieldAccess + ", " + "[tFieldDefinition] = " + tFieldDefinition + ", " + "[parent] = "
							+ parent + ", " + "[tFieldSignature] = " + tFieldSignature + ".");
				}
				TFieldDefinition tFieldParentDefinition = (TFieldDefinition) result5_black[4];
				HelpersImpl.pattern_Helpers_0_5_ActivityNode118_redBB(tFieldAccess, tFieldDefinition);

				HelpersImpl.pattern_Helpers_0_5_ActivityNode118_greenBB(tFieldAccess, tFieldParentDefinition);

			}
			// ForEach
			for (Object[] result6_black : HelpersImpl.pattern_Helpers_0_6_ActivityNode122b_blackBFBFF(child,
					tFieldSignature)) {
				// nothing TFieldDefinition tFieldDefinition = (TFieldDefinition)
				// result6_black[1];
				TAccess tFieldAccess = (TAccess) result6_black[3];
				TMember tFieldAccessTarget = (TMember) result6_black[4];

				Object[] result7_black = HelpersImpl.pattern_Helpers_0_7_ActivityNode124b_blackBB(tFieldAccess,
						tFieldAccessTarget);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tFieldAccess] = "
							+ tFieldAccess + ", " + "[tFieldAccessTarget] = " + tFieldAccessTarget + ".");
				}
				HelpersImpl.pattern_Helpers_0_7_ActivityNode124b_redBB(tFieldAccess, tFieldAccessTarget);

				EcoreUtil.delete(tFieldAccess);
				tFieldAccess = null;
				;

			}

			Object[] result8_black = HelpersImpl.pattern_Helpers_0_8_ActivityNode112_blackBFB(child, tFieldSignature);
			if (result8_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[child] = " + child + ", "
						+ "[tFieldSignature] = " + tFieldSignature + ".");
			}
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result8_black[1];
			HelpersImpl.pattern_Helpers_0_8_ActivityNode112_redBBB(child, tFieldDefinition, tFieldSignature);

			EcoreUtil.delete(tFieldDefinition);
			tFieldDefinition = null;
			;

		} else if (tSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tSignature;
			// ForEach
			for (Object[] result10_black : HelpersImpl.pattern_Helpers_0_10_ActivityNode121_blackBFBF(child,
					tMethodSignature)) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) result10_black[1];
				TAccess tMethodAccess = (TAccess) result10_black[3];

				Object[] result11_black = HelpersImpl.pattern_Helpers_0_11_ActivityNode123_blackBBFBB(parent,
						tMethodSignature, tMethodAccess, tMethodDefinition);
				if (result11_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parent] = " + parent
							+ ", " + "[tMethodSignature] = " + tMethodSignature + ", " + "[tMethodAccess] = "
							+ tMethodAccess + ", " + "[tMethodDefinition] = " + tMethodDefinition + ".");
				}
				TMethodDefinition tMethodParentDefinition = (TMethodDefinition) result11_black[2];
				HelpersImpl.pattern_Helpers_0_11_ActivityNode123_redBB(tMethodAccess, tMethodDefinition);

				HelpersImpl.pattern_Helpers_0_11_ActivityNode123_greenBB(tMethodParentDefinition, tMethodAccess);

			}
			// ForEach
			for (Object[] result12_black : HelpersImpl.pattern_Helpers_0_12_ActivityNode122_blackBFBFF(child,
					tMethodSignature)) {
				// nothing TMethodDefinition tMethodDefinition = (TMethodDefinition)
				// result12_black[1];
				TAccess tMethodAccess = (TAccess) result12_black[3];
				TMember tMethodAccessTarget = (TMember) result12_black[4];

				Object[] result13_black = HelpersImpl.pattern_Helpers_0_13_ActivityNode124_blackBB(tMethodAccess,
						tMethodAccessTarget);
				if (result13_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMethodAccess] = "
							+ tMethodAccess + ", " + "[tMethodAccessTarget] = " + tMethodAccessTarget + ".");
				}
				HelpersImpl.pattern_Helpers_0_13_ActivityNode124_redBB(tMethodAccess, tMethodAccessTarget);

				EcoreUtil.delete(tMethodAccess);
				tMethodAccess = null;
				;

			}

			Object[] result14_black = HelpersImpl.pattern_Helpers_0_14_ActivityNode113_blackBFB(child,
					tMethodSignature);
			if (result14_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[child] = " + child + ", "
						+ "[tMethodSignature] = " + tMethodSignature + ".");
			}
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result14_black[1];
			HelpersImpl.pattern_Helpers_0_14_ActivityNode113_redBBB(child, tMethodDefinition, tMethodSignature);

			EcoreUtil.delete(tMethodDefinition);
			tMethodDefinition = null;
			;

			return HelpersImpl.pattern_Helpers_0_15_expressionF();
		} else {
			return HelpersImpl.pattern_Helpers_0_16_expressionF();
		}
		return false;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TMember esc_Helper_GetBestTMember(List<TClass> tMemberPool, TSignature signature) {
		// [user code injected with eMoflon]

		TMember returnMember = null;
		int bestTMemberWeight = Integer.MIN_VALUE;

		for (TClass tClass : tMemberPool) {
			int i;
			int e;

			TMember tMemberOfClass = Search.getDefinition(tClass, signature);

			List<TMember> internalAccessedTMembers = this
					.esc_Helper_Heuristic_getInternalAccessedTMembers(tMemberOfClass, tClass);
			i = internalAccessedTMembers.size();

			List<TMember> externAccessedTMembers = this.esc_Helper_Heuristic_getExternAccessedTMembers(tMemberOfClass,
					tClass);
			e = externAccessedTMembers.size();

			int tWeightMember = i - e;

			System.out.println("GetBestTMember: class=" + tClass.getTName() + " i=" + i + "; e=" + e + "; tWeight="
					+ tWeightMember);

			if (tWeightMember > bestTMemberWeight) {
				bestTMemberWeight = tWeightMember;
				returnMember = tMemberOfClass;
			}
		}

		System.out.println(
				"Best-GetBestTMember: tWeight=" + bestTMemberWeight + "; tMember=" + returnMember.getSignatureString());

		return returnMember;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<TMember> esc_Helper_Heuristic_getInternalAccessedTMembers(TMember tMember, TClass tClass) {

		List<TMember> returnContainer = new LinkedList<TMember>();
		// ForEach
		for (Object[] result3_black : HelpersImpl.pattern_Helpers_2_3_ActivityNode178_blackFBF(tMember)) {
			// nothing TAccess tAccess = (TAccess) result3_black[0];
			TMember accessedTMember = (TMember) result3_black[2];
			//
			if (!Search.hasTMember(tClass, accessedTMember) && !Search.hasParentTMember(tClass, accessedTMember)) {
				continue;
			}
			returnContainer.add(accessedTMember);

		}
		return HelpersImpl.pattern_Helpers_2_8_expressionFB(returnContainer);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<TMember> esc_Helper_Heuristic_getExternAccessedTMembers(TMember tMember, TClass tClass) {

		List<TMember> returnContainer = new LinkedList<>();
		// ForEach
		for (Object[] result3_black : HelpersImpl.pattern_Helpers_3_3_ActivityNode189_blackBFF(tMember)) {
			// nothing TAccess tAccess = (TAccess) result3_black[1];
			TMember accessedTMember = (TMember) result3_black[2];
			//
			if (!Search.hasTMember(tClass, accessedTMember) && !Search.hasParentTMember(tClass, accessedTMember)) {

				Object[] result6_black = HelpersImpl.pattern_Helpers_3_6_ActivityNode191_blackBB(returnContainer,
						accessedTMember);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[returnContainer] = "
							+ returnContainer + ", " + "[accessedTMember] = " + accessedTMember + ".");
				}
				HelpersImpl.pattern_Helpers_3_6_ActivityNode191_greenBB(returnContainer, accessedTMember);

			}

		}
		return HelpersImpl.pattern_Helpers_3_7_expressionFB(returnContainer);

	}

	public static final Object[] pattern_Helpers_0_1_ActivityNode162_blackB(TSignature tSignature) {
		return new Object[] { tSignature };
	}

	public static final Object[] pattern_Helpers_0_3_ActivityNode163_blackBF(List<TSignature> listOfSignatures) {
		for (TSignature tmpTFieldSignature : listOfSignatures) {
			if (tmpTFieldSignature instanceof TFieldSignature) {
				TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
				return new Object[] { listOfSignatures, tFieldSignature };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Helpers_0_4_ActivityNode117_blackBFBF(TClass child,
			TFieldSignature tFieldSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tmpTFieldDefinition : child.getDefines()) {
			if (tmpTFieldDefinition instanceof TFieldDefinition) {
				TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
				if (tFieldSignature.getDefinitions().contains(tFieldDefinition)) {
					for (TAccess tFieldAccess : tFieldDefinition.getAccessedBy()) {
						_result.add(new Object[] { child, tFieldDefinition, tFieldSignature, tFieldAccess });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Helpers_0_5_ActivityNode118_blackBBBBF(TAccess tFieldAccess,
			TFieldDefinition tFieldDefinition, TClass parent, TFieldSignature tFieldSignature) {
		if (tFieldDefinition.getAccessedBy().contains(tFieldAccess)) {
			for (TMember tmpTFieldParentDefinition : parent.getDefines()) {
				if (tmpTFieldParentDefinition instanceof TFieldDefinition) {
					TFieldDefinition tFieldParentDefinition = (TFieldDefinition) tmpTFieldParentDefinition;
					if (!tFieldDefinition.equals(tFieldParentDefinition)) {
						if (tFieldSignature.getDefinitions().contains(tFieldParentDefinition)) {
							return new Object[] { tFieldAccess, tFieldDefinition, parent, tFieldSignature,
									tFieldParentDefinition };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Helpers_0_5_ActivityNode118_redBB(TAccess tFieldAccess,
			TFieldDefinition tFieldDefinition) {
		tFieldDefinition.getAccessedBy().remove(tFieldAccess);
		return new Object[] { tFieldAccess, tFieldDefinition };
	}

	public static final Object[] pattern_Helpers_0_5_ActivityNode118_greenBB(TAccess tFieldAccess,
			TFieldDefinition tFieldParentDefinition) {
		tFieldParentDefinition.getAccessedBy().add(tFieldAccess);
		return new Object[] { tFieldAccess, tFieldParentDefinition };
	}

	public static final Iterable<Object[]> pattern_Helpers_0_6_ActivityNode122b_blackBFBFF(TClass child,
			TFieldSignature tFieldSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tmpTFieldDefinition : child.getDefines()) {
			if (tmpTFieldDefinition instanceof TFieldDefinition) {
				TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
				if (tFieldSignature.getDefinitions().contains(tFieldDefinition)) {
					for (TAccess tFieldAccess : tFieldDefinition.getTAccessing()) {
						TMember tFieldAccessTarget = tFieldAccess.getTTarget();
						if (tFieldAccessTarget != null) {
							if (!tFieldAccessTarget.equals(tFieldDefinition)) {
								_result.add(new Object[] { child, tFieldDefinition, tFieldSignature, tFieldAccess,
										tFieldAccessTarget });
							}
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Helpers_0_7_ActivityNode124b_blackBB(TAccess tFieldAccess,
			TMember tFieldAccessTarget) {
		if (tFieldAccessTarget.getAccessedBy().contains(tFieldAccess)) {
			return new Object[] { tFieldAccess, tFieldAccessTarget };
		}
		return null;
	}

	public static final Object[] pattern_Helpers_0_7_ActivityNode124b_redBB(TAccess tFieldAccess,
			TMember tFieldAccessTarget) {
		tFieldAccessTarget.getAccessedBy().remove(tFieldAccess);
		return new Object[] { tFieldAccess, tFieldAccessTarget };
	}

	public static final Object[] pattern_Helpers_0_8_ActivityNode112_blackBFB(TClass child,
			TFieldSignature tFieldSignature) {
		if (child.getSignature().contains(tFieldSignature)) {
			for (TMember tmpTFieldDefinition : child.getDefines()) {
				if (tmpTFieldDefinition instanceof TFieldDefinition) {
					TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
					if (tFieldSignature.getDefinitions().contains(tFieldDefinition)) {
						return new Object[] { child, tFieldDefinition, tFieldSignature };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Helpers_0_8_ActivityNode112_redBBB(TClass child,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		child.getSignature().remove(tFieldSignature);
		tFieldDefinition.setDefinedBy(null);
		tFieldSignature.getDefinitions().remove(tFieldDefinition);
		return new Object[] { child, tFieldDefinition, tFieldSignature };
	}

	public static final Iterable<Object[]> pattern_Helpers_0_10_ActivityNode121_blackBFBF(TClass child,
			TMethodSignature tMethodSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tmpTMethodDefinition : child.getDefines()) {
			if (tmpTMethodDefinition instanceof TMethodDefinition) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
				if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
					for (TAccess tMethodAccess : tMethodDefinition.getAccessedBy()) {
						_result.add(new Object[] { child, tMethodDefinition, tMethodSignature, tMethodAccess });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Helpers_0_11_ActivityNode123_blackBBFBB(TClass parent,
			TMethodSignature tMethodSignature, TAccess tMethodAccess, TMethodDefinition tMethodDefinition) {
		if (tMethodDefinition.getAccessedBy().contains(tMethodAccess)) {
			for (TMethodDefinition tMethodParentDefinition : tMethodSignature.getDefinitions()) {
				if (!tMethodDefinition.equals(tMethodParentDefinition)) {
					if (parent.equals(tMethodParentDefinition.getDefinedBy())) {
						return new Object[] { parent, tMethodSignature, tMethodParentDefinition, tMethodAccess,
								tMethodDefinition };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Helpers_0_11_ActivityNode123_redBB(TAccess tMethodAccess,
			TMethodDefinition tMethodDefinition) {
		tMethodDefinition.getAccessedBy().remove(tMethodAccess);
		return new Object[] { tMethodAccess, tMethodDefinition };
	}

	public static final Object[] pattern_Helpers_0_11_ActivityNode123_greenBB(TMethodDefinition tMethodParentDefinition,
			TAccess tMethodAccess) {
		tMethodParentDefinition.getAccessedBy().add(tMethodAccess);
		return new Object[] { tMethodParentDefinition, tMethodAccess };
	}

	public static final Iterable<Object[]> pattern_Helpers_0_12_ActivityNode122_blackBFBFF(TClass child,
			TMethodSignature tMethodSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tmpTMethodDefinition : child.getDefines()) {
			if (tmpTMethodDefinition instanceof TMethodDefinition) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
				if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
					for (TAccess tMethodAccess : tMethodDefinition.getTAccessing()) {
						TMember tMethodAccessTarget = tMethodAccess.getTTarget();
						if (tMethodAccessTarget != null) {
							if (!tMethodAccessTarget.equals(tMethodDefinition)) {
								_result.add(new Object[] { child, tMethodDefinition, tMethodSignature, tMethodAccess,
										tMethodAccessTarget });
							}
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Helpers_0_13_ActivityNode124_blackBB(TAccess tMethodAccess,
			TMember tMethodAccessTarget) {
		if (tMethodAccessTarget.getAccessedBy().contains(tMethodAccess)) {
			return new Object[] { tMethodAccess, tMethodAccessTarget };
		}
		return null;
	}

	public static final Object[] pattern_Helpers_0_13_ActivityNode124_redBB(TAccess tMethodAccess,
			TMember tMethodAccessTarget) {
		tMethodAccessTarget.getAccessedBy().remove(tMethodAccess);
		return new Object[] { tMethodAccess, tMethodAccessTarget };
	}

	public static final Object[] pattern_Helpers_0_14_ActivityNode113_blackBFB(TClass child,
			TMethodSignature tMethodSignature) {
		if (child.getSignature().contains(tMethodSignature)) {
			for (TMember tmpTMethodDefinition : child.getDefines()) {
				if (tmpTMethodDefinition instanceof TMethodDefinition) {
					TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
					if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
						return new Object[] { child, tMethodDefinition, tMethodSignature };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Helpers_0_14_ActivityNode113_redBBB(TClass child,
			TMethodDefinition tMethodDefinition, TMethodSignature tMethodSignature) {
		child.getSignature().remove(tMethodSignature);
		tMethodDefinition.setDefinedBy(null);
		tMethodSignature.getDefinitions().remove(tMethodDefinition);
		return new Object[] { child, tMethodDefinition, tMethodSignature };
	}

	public static final boolean pattern_Helpers_0_15_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Helpers_0_16_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Iterable<Object[]> pattern_Helpers_2_3_ActivityNode178_blackFBF(TMember tMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TAccess tAccess : tMember.getTAccessing()) {
			TMember accessedTMember = tAccess.getTTarget();
			if (accessedTMember != null) {
				if (!accessedTMember.equals(tMember)) {
					_result.add(new Object[] { tAccess, tMember, accessedTMember });
				}
			}

		}
		return _result;
	}

	public static final List<TMember> pattern_Helpers_2_8_expressionFB(List<TMember> returnContainer) {
		List<TMember> _result = returnContainer;
		return _result;
	}

	public static final Iterable<Object[]> pattern_Helpers_3_3_ActivityNode189_blackBFF(TMember tMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TAccess tAccess : tMember.getTAccessing()) {
			TMember accessedTMember = tAccess.getTTarget();
			if (accessedTMember != null) {
				if (!accessedTMember.equals(tMember)) {
					_result.add(new Object[] { tMember, tAccess, accessedTMember });
				}
			}

		}
		return _result;
	}

	public static final Object[] pattern_Helpers_3_6_ActivityNode191_blackBB(List<TMember> returnContainer,
			TMember accessedTMember) {
		return new Object[] { returnContainer, accessedTMember };
	}

	public static final Object[] pattern_Helpers_3_6_ActivityNode191_greenBB(List<TMember> returnContainer,
			TMember accessedTMember) {
		returnContainer.add(accessedTMember);
		return new Object[] { returnContainer, accessedTMember };
	}

	public static final List<TMember> pattern_Helpers_3_7_expressionFB(List<TMember> returnContainer) {
		List<TMember> _result = returnContainer;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HelpersImpl
