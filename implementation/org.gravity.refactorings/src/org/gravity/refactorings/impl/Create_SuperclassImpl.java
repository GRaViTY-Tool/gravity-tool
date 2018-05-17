/**
 */
package org.gravity.refactorings.impl;

import java.lang.Iterable;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.CreateSuperClassConfiguration;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Create
 * Superclass</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Create_SuperclassImpl extends RefactoringImpl {

	@Override
	public boolean isApplicable(RefactoringConfiguration configuration) {
		if (configuration instanceof CreateSuperClassConfiguration) {
			CreateSuperClassConfiguration csc = (CreateSuperClassConfiguration) configuration;
			return isApplicable(csc.getChildren(), csc.getNewParent());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) {
		if (configuration instanceof CreateSuperClassConfiguration) {
			CreateSuperClassConfiguration csc = (CreateSuperClassConfiguration) configuration;
			return perform(csc.getChildren(), csc.getNewParent());
		}
		return Collections.emptyList();
	}

	public List<TClass> perform(List<TClass> child, TClass new_parent) {

		List<TClass> container = new LinkedList<TClass>();

		Object[] result2_black = Create_SuperclassImpl.pattern_Create_Superclass_0_2_ActivityNode42_blackBBB(container,
				new_parent, pg);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[container] = " + container + ", "
					+ "[new_parent] = " + new_parent + ", " + "[pg] = " + pg + ".");
		}
		Create_SuperclassImpl.pattern_Create_Superclass_0_2_ActivityNode42_greenBBB(container, new_parent, pg);

		//

		Search.linkClass(pg, new_parent);

		Object[] result4_black = Create_SuperclassImpl.pattern_Create_Superclass_0_4_ActivityNode46_blackBBFFB(child,
				new_parent, container);
		if (result4_black != null) {
			TClass old_tParent = (TClass) result4_black[2];
			// nothing TClass tChild = (TClass) result4_black[3];
			Create_SuperclassImpl.pattern_Create_Superclass_0_4_ActivityNode46_greenBBB(new_parent, old_tParent,
					container);

		} else {
		}
		// ForEach
		for (Object[] result5_black : Create_SuperclassImpl
				.pattern_Create_Superclass_0_5_ActivityNode47_blackBF(child)) {
			TClass tChildClass = (TClass) result5_black[1];
			//
			Object[] result6_black = Create_SuperclassImpl
					.pattern_Create_Superclass_0_6_ActivityNode48_blackFB(tChildClass);
			if (result6_black != null) {
				TClass tParent = (TClass) result6_black[0];

				Object[] result7_black = Create_SuperclassImpl
						.pattern_Create_Superclass_0_7_ActivityNode55_blackBB(tParent, tChildClass);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tParent] = " + tParent
							+ ", " + "[tChildClass] = " + tChildClass + ".");
				}
				Create_SuperclassImpl.pattern_Create_Superclass_0_7_ActivityNode55_redBB(tParent, tChildClass);

			} else {
			}

			Object[] result8_black = Create_SuperclassImpl
					.pattern_Create_Superclass_0_8_ActivityNode49_blackBBB(new_parent, tChildClass, container);
			if (result8_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[new_parent] = " + new_parent
						+ ", " + "[tChildClass] = " + tChildClass + ", " + "[container] = " + container + ".");
			}
			Create_SuperclassImpl.pattern_Create_Superclass_0_8_ActivityNode49_greenBBB(new_parent, tChildClass,
					container);

		}
		return container;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isApplicable(List<TClass> child, TClass new_parent) {

		TClass existingParent = getOtherTClassByName(pg, new_parent);
		if (existingParent != null) {

			Object[] result3_black = Create_SuperclassImpl
					.pattern_Create_Superclass_1_3_ActivityNode57_blackBFBF(new_parent, existingParent);
			if (result3_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[new_parent] = " + new_parent
						+ ", " + "[existingParent] = " + existingParent + ".");
			}
			TPackage new_parent_package = (TPackage) result3_black[1];
			TPackage existing_parent_package = (TPackage) result3_black[3];
			//
			if (Search.equivalent(existing_parent_package, new_parent_package)) {
				return false;
			}

		}
		//
		Object[] result6_black = Create_SuperclassImpl.pattern_Create_Superclass_1_6_ActivityNode38_blackBFF(child);
		if (result6_black != null) {
			// nothing TClass one = (TClass) result6_black[1];
			// nothing TClass two = (TClass) result6_black[2];
			// ForEach
			for (TClass b : child) {
				for (TClass a : child) {
					//
					TPackage basePackageOne = Search.getBasePackage(a);
					TPackage basePackageTwo = Search.getBasePackage(b);
					if (basePackageOne != basePackageTwo) {
						return false;
					}

				}
			}
			// ForEach
			for (Object[] result10_black : Create_SuperclassImpl
					.pattern_Create_Superclass_1_10_ActivityNode39_blackBFF(child)) {
				TClass tChildOne = (TClass) result10_black[1];
				TClass tChildTwo = (TClass) result10_black[2];
				//
				Object[] result11_black = Create_SuperclassImpl
						.pattern_Create_Superclass_1_11_ActivityNode40_blackBBF(tChildOne, tChildTwo);
				if (result11_black != null) {
					// nothing TClass tParent = (TClass) result11_black[2];
				} else {
					// ForEach
					for (Object[] result12_black : Create_SuperclassImpl
							.pattern_Create_Superclass_1_12_ActivityNode51_blackBF(child)) {
						TClass tChild = (TClass) result12_black[1];
						//
						Object[] result13_black = Create_SuperclassImpl
								.pattern_Create_Superclass_1_13_ActivityNode52_blackB(tChild);
						if (result13_black != null) {
						} else {
							//
							Object[] result14_black = Create_SuperclassImpl
									.pattern_Create_Superclass_1_14_ActivityNode53_blackBF(tChild);
							if (result14_black == null) {
								return false;
							}

						}

					}
					return Create_SuperclassImpl.pattern_Create_Superclass_1_16_expressionF();
				}

			}
			return Create_SuperclassImpl.pattern_Create_Superclass_1_17_expressionF();
		} else {
			return false;
		}

	}

	public static final Object[] pattern_Create_Superclass_0_2_ActivityNode42_blackBBB(List<TClass> container,
			TClass new_parent, TypeGraph pg) {
		return new Object[] { container, new_parent, pg };
	}

	public static final Object[] pattern_Create_Superclass_0_2_ActivityNode42_greenBBB(List<TClass> container,
			TClass new_parent, TypeGraph pg) {
		container.add(new_parent);
		pg.getOwnedTypes().add(new_parent);
		pg.getClasses().add(new_parent);
		return new Object[] { container, new_parent, pg };
	}

	public static final Object[] pattern_Create_Superclass_0_4_ActivityNode46_blackBBFFB(List<TClass> child,
			TClass new_parent, List<TClass> container) {
		if (!child.equals(container)) {
			for (TClass tChild : child) {
				if (!new_parent.equals(tChild)) {
					TClass old_tParent = tChild.getParentClass();
					if (old_tParent != null) {
						if (!new_parent.equals(old_tParent)) {
							if (!old_tParent.equals(tChild)) {
								return new Object[] { child, new_parent, old_tParent, tChild, container };
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Create_Superclass_0_4_ActivityNode46_greenBBB(TClass new_parent,
			TClass old_tParent, List<TClass> container) {
		old_tParent.getChildClasses().add(new_parent);
		container.add(old_tParent);
		return new Object[] { new_parent, old_tParent, container };
	}

	public static final Iterable<Object[]> pattern_Create_Superclass_0_5_ActivityNode47_blackBF(List<TClass> child) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tChildClass : child) {
			_result.add(new Object[] { child, tChildClass });
		}
		return _result;
	}

	public static final Object[] pattern_Create_Superclass_0_6_ActivityNode48_blackFB(TClass tChildClass) {
		TClass tParent = tChildClass.getParentClass();
		if (tParent != null) {
			if (!tChildClass.equals(tParent)) {
				return new Object[] { tParent, tChildClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_Create_Superclass_0_7_ActivityNode55_blackBB(TClass tParent,
			TClass tChildClass) {
		if (!tChildClass.equals(tParent)) {
			if (tParent.equals(tChildClass.getParentClass())) {
				return new Object[] { tParent, tChildClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_Create_Superclass_0_7_ActivityNode55_redBB(TClass tParent,
			TClass tChildClass) {
		tChildClass.setParentClass(null);
		return new Object[] { tParent, tChildClass };
	}

	public static final Object[] pattern_Create_Superclass_0_8_ActivityNode49_blackBBB(TClass new_parent,
			TClass tChildClass, List<TClass> container) {
		if (!new_parent.equals(tChildClass)) {
			return new Object[] { new_parent, tChildClass, container };
		}
		return null;
	}

	public static final Object[] pattern_Create_Superclass_0_8_ActivityNode49_greenBBB(TClass new_parent,
			TClass tChildClass, List<TClass> container) {
		new_parent.getChildClasses().add(tChildClass);
		container.add(tChildClass);
		return new Object[] { new_parent, tChildClass, container };
	}

	public static final TClass getOtherTClassByName(TypeGraph pg, TClass exclude) {
		String new_parent_tName = exclude.getTName();
		for (TClass existingParent : pg.getClasses()) {
			if (!existingParent.equals(exclude)) {
				String existingParent_tName = existingParent.getTName();
				if (existingParent_tName.equals(new_parent_tName)) {
					return existingParent;
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_Create_Superclass_1_3_ActivityNode57_blackBFBF(TClass new_parent,
			TClass existingParent) {
		if (!existingParent.equals(new_parent)) {
			TPackage new_parent_package = new_parent.getPackage();
			if (new_parent_package != null) {
				TPackage existing_parent_package = existingParent.getPackage();
				if (existing_parent_package != null) {
					if (!existing_parent_package.equals(new_parent_package)) {
						return new Object[] { new_parent, new_parent_package, existingParent, existing_parent_package };
					}
				}

			}

		}
		return null;
	}

	public static final Object[] pattern_Create_Superclass_1_6_ActivityNode38_blackBFF(List<TClass> child) {
		for (TClass one : child) {
			for (TClass two : child) {
				if (!one.equals(two)) {
					return new Object[] { child, one, two };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Create_Superclass_1_10_ActivityNode39_blackBFF(List<TClass> child) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tChildOne : child) {
			for (TClass tChildTwo : child) {
				if (!tChildOne.equals(tChildTwo)) {
					_result.add(new Object[] { child, tChildOne, tChildTwo });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Create_Superclass_1_11_ActivityNode40_blackBBF(TClass tChildOne,
			TClass tChildTwo) {
		if (!tChildOne.equals(tChildTwo)) {
			TClass tParent = tChildOne.getParentClass();
			if (tParent != null) {
				if (!tChildOne.equals(tParent)) {
					if (!tChildTwo.equals(tParent)) {
						if (tParent.getChildClasses().contains(tChildTwo)) {
							return new Object[] { tChildOne, tChildTwo, tParent };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Create_Superclass_1_12_ActivityNode51_blackBF(List<TClass> child) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tChild : child) {
			_result.add(new Object[] { child, tChild });
		}
		return _result;
	}

	public static final Object[] pattern_Create_Superclass_1_13_ActivityNode52_black_nac_0B(TClass tChild) {
		TClass tParentClass = tChild.getParentClass();
		if (tParentClass != null) {
			if (!tChild.equals(tParentClass)) {
				return new Object[] { tChild };
			}
		}

		return null;
	}

	public static final Object[] pattern_Create_Superclass_1_13_ActivityNode52_blackB(TClass tChild) {
		if (pattern_Create_Superclass_1_13_ActivityNode52_black_nac_0B(tChild) == null) {
			return new Object[] { tChild };
		}
		return null;
	}

	public static final Object[] pattern_Create_Superclass_1_14_ActivityNode53_blackBF(TClass tChild) {
		TClass tObject = tChild.getParentClass();
		if (tObject != null) {
			if (!tChild.equals(tObject)) {
				String tObject_tName = tObject.getTName();
				if (tObject_tName.equals("java.lang.Object")) {
					return new Object[] { tChild, tObject };
				}

			}
		}

		return null;
	}

	public static final boolean pattern_Create_Superclass_1_16_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Create_Superclass_1_17_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TCreateSuperClass;
	}

} // Create_SuperclassImpl
