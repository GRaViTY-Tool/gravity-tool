/**
 */
package org.gravity.refactorings.impl;

import java.lang.Iterable;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.PullUpMethodConfiguration;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pull Up
 * Method</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Pull_Up_MethodImpl extends RefactoringImpl {

	@Override
	public boolean isApplicable(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			PullUpMethodConfiguration esc = (PullUpMethodConfiguration) configuration;
			return isApplicable(esc.getSignature(), esc.getSourceClass());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			PullUpMethodConfiguration esc = (PullUpMethodConfiguration) configuration;
			return perform(esc.getSignature(), esc.getSourceClass());
		}
		return Collections.emptyList();
	}

	public Pull_Up_MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<TClass> perform(TMethodSignature method, TClass parent) {

		TypeGraph pg = getPg();
		List<TClass> container = new LinkedList<TClass>();

		//
		Object[] result2_black = Pull_Up_MethodImpl.pattern_Pull_Up_Method_0_2_ActivityNode18_blackBBFFB(parent, method,
				container);
		if (result2_black != null) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[2];
			TClass tmpChild = (TClass) result2_black[3];
			tmpChild.getSignature().remove(method);

			tMethodDefinition.setDefinedBy(parent);
			parent.getSignature().add(method);
			container.add(tmpChild);

			// ForEach
			for (Object[] result3_black : Pull_Up_MethodImpl
					.pattern_Pull_Up_Method_0_3_ActivityNode20_blackBBFFB(parent, method, container)) {
				TMethodDefinition childsDefinition = (TMethodDefinition) result3_black[2];
				TClass tChild = (TClass) result3_black[3];
				container.add(tChild);

				// ForEach
				for (Object[] result4_black : Pull_Up_MethodImpl
						.pattern_Pull_Up_Method_0_4_ActivityNode65_blackBFBFF(childsDefinition, pg)) {
					// nothing TMember accessing = (TMember) result4_black[1];
					// nothing TClass tClass = (TClass) result4_black[3];
					TAccess tOldAccess = (TAccess) result4_black[4];

					Object[] result5_black = Pull_Up_MethodImpl.pattern_Pull_Up_Method_0_5_ActivityNode66_blackBBB(
							tMethodDefinition, childsDefinition, tOldAccess);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[tMethodDefinition] = " + tMethodDefinition + ", " + "[childsDefinition] = "
								+ childsDefinition + ", " + "[tOldAccess] = " + tOldAccess + ".");
					}
					Pull_Up_MethodImpl.pattern_Pull_Up_Method_0_5_ActivityNode66_redBB(childsDefinition, tOldAccess);

					Pull_Up_MethodImpl.pattern_Pull_Up_Method_0_5_ActivityNode66_greenBB(tMethodDefinition, tOldAccess);

				}
				// ForEach
				for (Object[] result6_black : Pull_Up_MethodImpl
						.pattern_Pull_Up_Method_0_6_ActivityNode220_blackBFF(childsDefinition)) {
					TAccess outgoing = (TAccess) result6_black[1];
					TMember target = (TMember) result6_black[2];
					Pull_Up_MethodImpl.pattern_Pull_Up_Method_0_6_ActivityNode220_redBBB(childsDefinition, outgoing,
							target);

					EcoreUtil.delete(outgoing);
					outgoing = null;
					;

				}

				Object[] result7_black = Pull_Up_MethodImpl
						.pattern_Pull_Up_Method_0_7_ActivityNode221_blackBF(childsDefinition);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[childsDefinition] = "
							+ childsDefinition + ".");
				}
				TAbstractType retType = (TAbstractType) result7_black[1];
				Pull_Up_MethodImpl.pattern_Pull_Up_Method_0_7_ActivityNode221_redBB(childsDefinition, retType);

				Object[] result8_black = Pull_Up_MethodImpl.pattern_Pull_Up_Method_0_8_ActivityNode21_blackBBB(tChild,
						method, childsDefinition);
				if (result8_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tChild] = " + tChild
							+ ", " + "[method] = " + method + ", " + "[childsDefinition] = " + childsDefinition + ".");
				}
				Pull_Up_MethodImpl.pattern_Pull_Up_Method_0_8_ActivityNode21_redBBB(tChild, method, childsDefinition);

				EcoreUtil.delete(childsDefinition);
				childsDefinition = null;
				;

			}
			return container;
		} else {
			return container;
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isApplicable(TMethodSignature method, TClass parent) {
		TypeGraph pg = getPg();

		if (!parent.getSignature().contains(method)) {

			TPackage basePackage = Search.getBasePackage(parent);

			List<TMethodDefinition> tDefinitions = new LinkedList<>();
			// ForEach
			for (Object[] result5_black : Pull_Up_MethodImpl.pattern_Pull_Up_Method_1_5_ActivityNode8_blackFB(parent)) {
				TClass tChild = (TClass) result5_black[0];
				//
				Object[] result6_black = Pull_Up_MethodImpl.pattern_Pull_Up_Method_1_6_ActivityNode9_blackBB(tChild,
						method);
				if (result6_black != null) {
					//
					Object[] result7_black = Pull_Up_MethodImpl
							.pattern_Pull_Up_Method_1_7_ActivityNode10_blackBBBF(tDefinitions, method, tChild);
					if (result7_black != null) {
						TMethodDefinition tMethodDefinition = (TMethodDefinition) result7_black[3];
						tDefinitions.add(tMethodDefinition);

					} else {
						return false;
					}

				} else {
					return false;
				}

			}
			// ForEach
			for (Object[] result10_black : Pull_Up_MethodImpl
					.pattern_Pull_Up_Method_1_10_ActivityNode11_blackBF(parent)) {
				TClass tChild = (TClass) result10_black[1];
				if (!basePackage.equals(Search.getBasePackage(tChild))) {
					return false;
				}

			}

			List<TMember> accessedMembers = new LinkedList<>();
			// ForEach
			for (Object[] result14_black : Pull_Up_MethodImpl
					.pattern_Pull_Up_Method_1_14_ActivityNode14_blackFBFB(tDefinitions, parent)) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) result14_black[0];
				TClass activeClass = (TClass) result14_black[2];
				// ForEach
				for (Object[] result15_black : Pull_Up_MethodImpl
						.pattern_Pull_Up_Method_1_15_ActivityNode15_blackBFFBBF(tMethodDefinition, accessedMembers,
								pg)) {
					TMember accessed = (TMember) result15_black[1];
					TClass definingClass = (TClass) result15_black[2];
					// nothing TAccess tAccess = (TAccess) result15_black[5];
					accessedMembers.add(accessed);
					//
					if (Search.isChild(definingClass, parent)) {
						//
						if (!Search.isChild(definingClass, activeClass)) {
							return false;
						}

					}
				}

			}
			return true;
		} else {
			return false;
		}

	}

	public static final Object[] pattern_Pull_Up_Method_0_2_ActivityNode18_blackBBFFB(TClass parent,
			TMethodSignature method, List<TClass> container) {
		for (TClass tmpChild : parent.getChildClasses()) {
			if (!parent.equals(tmpChild)) {
				if (tmpChild.getSignature().contains(method)) {
					for (TMethodDefinition tMethodDefinition : method.getDefinitions()) {
						if (tmpChild.equals(tMethodDefinition.getDefinedBy())) {
							return new Object[] { parent, method, tMethodDefinition, tmpChild, container };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Pull_Up_Method_0_3_ActivityNode20_blackBBFFB(TClass parent,
			TMethodSignature method, List<TClass> container) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (parent.getSignature().contains(method)) {
			for (TMethodDefinition childsDefinition : method.getDefinitions()) {
				TAbstractType tmpTChild = childsDefinition.getDefinedBy();
				if (tmpTChild instanceof TClass) {
					TClass tChild = (TClass) tmpTChild;
					if (!parent.equals(tChild)) {
						if (parent.equals(tChild.getParentClass())) {
							if (tChild.getSignature().contains(method)) {
								_result.add(new Object[] { parent, method, childsDefinition, tChild, container });
							}
						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Pull_Up_Method_0_4_ActivityNode65_blackBFBFF(
			TMethodDefinition childsDefinition, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tClass : pg.getClasses()) {
			for (TAccess tOldAccess : childsDefinition.getAccessedBy()) {
				TMember accessing = tOldAccess.getTSource();
				if (accessing != null) {
					if (!accessing.equals(childsDefinition)) {
						if (tClass.equals(accessing.getDefinedBy())) {
							_result.add(new Object[] { childsDefinition, accessing, pg, tClass, tOldAccess });
						}
					}
				}

			}
		}
		return _result;
	}

	public static final Object[] pattern_Pull_Up_Method_0_5_ActivityNode66_blackBBB(TMethodDefinition tMethodDefinition,
			TMethodDefinition childsDefinition, TAccess tOldAccess) {
		if (!childsDefinition.equals(tMethodDefinition)) {
			if (childsDefinition.getAccessedBy().contains(tOldAccess)) {
				return new Object[] { tMethodDefinition, childsDefinition, tOldAccess };
			}
		}
		return null;
	}

	public static final Object[] pattern_Pull_Up_Method_0_5_ActivityNode66_redBB(TMethodDefinition childsDefinition,
			TAccess tOldAccess) {
		childsDefinition.getAccessedBy().remove(tOldAccess);
		return new Object[] { childsDefinition, tOldAccess };
	}

	public static final Object[] pattern_Pull_Up_Method_0_5_ActivityNode66_greenBB(TMethodDefinition tMethodDefinition,
			TAccess tOldAccess) {
		tMethodDefinition.getAccessedBy().add(tOldAccess);
		return new Object[] { tMethodDefinition, tOldAccess };
	}

	public static final Iterable<Object[]> pattern_Pull_Up_Method_0_6_ActivityNode220_blackBFF(
			TMethodDefinition childsDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TAccess outgoing : childsDefinition.getTAccessing()) {
			TMember target = outgoing.getTTarget();
			if (target != null) {
				if (!childsDefinition.equals(target)) {
					_result.add(new Object[] { childsDefinition, outgoing, target });
				}
			}

		}
		return _result;
	}

	public static final Object[] pattern_Pull_Up_Method_0_6_ActivityNode220_redBBB(TMethodDefinition childsDefinition,
			TAccess outgoing, TMember target) {
		childsDefinition.getTAccessing().remove(outgoing);
		target.getAccessedBy().remove(outgoing);
		return new Object[] { childsDefinition, outgoing, target };
	}

	public static final Object[] pattern_Pull_Up_Method_0_7_ActivityNode221_blackBF(
			TMethodDefinition childsDefinition) {
		TAbstractType retType = childsDefinition.getReturnType();
		if (retType != null) {
			return new Object[] { childsDefinition, retType };
		}

		return null;
	}

	public static final Object[] pattern_Pull_Up_Method_0_7_ActivityNode221_redBB(TMethodDefinition childsDefinition,
			TAbstractType retType) {
		childsDefinition.setReturnType(null);
		return new Object[] { childsDefinition, retType };
	}

	public static final Object[] pattern_Pull_Up_Method_0_8_ActivityNode21_blackBBB(TClass tChild,
			TMethodSignature method, TMethodDefinition childsDefinition) {
		if (tChild.getSignature().contains(method)) {
			if (tChild.equals(childsDefinition.getDefinedBy())) {
				if (method.getDefinitions().contains(childsDefinition)) {
					return new Object[] { tChild, method, childsDefinition };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Pull_Up_Method_0_8_ActivityNode21_redBBB(TClass tChild,
			TMethodSignature method, TMethodDefinition childsDefinition) {
		tChild.getSignature().remove(method);
		childsDefinition.setDefinedBy(null);
		method.getDefinitions().remove(childsDefinition);
		return new Object[] { tChild, method, childsDefinition };
	}

	public static final Iterable<Object[]> pattern_Pull_Up_Method_1_5_ActivityNode8_blackFB(TClass parent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tChild : parent.getChildClasses()) {
			if (!parent.equals(tChild)) {
				_result.add(new Object[] { tChild, parent });
			}
		}
		return _result;
	}

	public static final Object[] pattern_Pull_Up_Method_1_6_ActivityNode9_blackBB(TClass tChild,
			TMethodSignature method) {
		if (tChild.getSignature().contains(method)) {
			return new Object[] { tChild, method };
		}
		return null;
	}

	public static final Object[] pattern_Pull_Up_Method_1_7_ActivityNode10_blackBBBF(
			List<TMethodDefinition> tDefinitions, TMethodSignature method, TClass tChild) {
		for (TMethodDefinition tMethodDefinition : method.getDefinitions()) {
			if (tChild.equals(tMethodDefinition.getDefinedBy())) {
				return new Object[] { tDefinitions, method, tChild, tMethodDefinition };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Pull_Up_Method_1_10_ActivityNode11_blackBF(TClass parent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tChild : parent.getChildClasses()) {
			if (!parent.equals(tChild)) {
				_result.add(new Object[] { parent, tChild });
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Pull_Up_Method_1_14_ActivityNode14_blackFBFB(
			List<TMethodDefinition> tDefinitions, TClass parent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMethodDefinition tMethodDefinition : tDefinitions) {
			TAbstractType tmpActiveClass = tMethodDefinition.getDefinedBy();
			if (tmpActiveClass instanceof TClass) {
				TClass activeClass = (TClass) tmpActiveClass;
				if (!activeClass.equals(parent)) {
					if (parent.getChildClasses().contains(activeClass)) {
						_result.add(new Object[] { tMethodDefinition, tDefinitions, activeClass, parent });
					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Pull_Up_Method_1_15_ActivityNode15_blackBFFBBF(
			TMethodDefinition tMethodDefinition, List<TMember> accessedMembers, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass definingClass : pg.getClasses()) {
			for (TAccess tAccess : tMethodDefinition.getTAccessing()) {
				TMember accessed = tAccess.getTTarget();
				if (accessed != null) {
					if (!accessed.equals(tMethodDefinition)) {
						if (definingClass.equals(accessed.getDefinedBy())) {
							_result.add(new Object[] { tMethodDefinition, accessed, definingClass, accessedMembers, pg,
									tAccess });
						}
					}
				}

			}
		}
		return _result;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TPullUpMethod;
	}
} // Pull_Up_MethodImpl
