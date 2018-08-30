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

		container.add(new_parent);
		pg.getOwnedTypes().add(new_parent);
		pg.getClasses().add(new_parent);

		Search.linkClass(pg, new_parent);

		TClass old_tParent = null;
		for (TClass tChild : child) {
			if (!new_parent.equals(tChild)) {
				old_tParent = tChild.getParentClass();
			}
		}
		if (old_tParent != null && !new_parent.equals(old_tParent)) {
			old_tParent.getChildClasses().add(new_parent);
			container.add(old_tParent);

		}

		for (TClass tChildClass : child) {
			if (new_parent.equals(tChildClass)) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[new_parent] = " + new_parent
						+ ", " + "[tChildClass] = " + tChildClass + ", " + "[container] = " + container + ".");
			}
			TClass tParent = tChildClass.getParentClass();
			if (tParent != null && !tChildClass.equals(tParent)) {
				tChildClass.setParentClass(null);
			} else {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tParent] = " + tParent + ", "
						+ "[tChildClass] = " + tChildClass + ".");
			}
			new_parent.getChildClasses().add(tChildClass);
			container.add(tChildClass);

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
		boolean result6_black = false;
		for (TClass one : child) {
			for (TClass two : child) {
				if (!one.equals(two)) {
					result6_black = true;
				}
			}
		}
		if (result6_black) {
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
				if (result11_black == null) {
					for (TClass tChild : child) {
						TClass tParentClass = tChild.getParentClass();
						if (tParentClass != null && !tChild.equals(tParentClass)) {
							if (!tParentClass.getFullyQualifiedName().equals("java.lang.Object")) {
								return false;
							}
						}

					}
					return true;
				}

			}
			return true;
		} else {
			return false;
		}

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

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TCreateSuperClass;
	}

} // Create_SuperclassImpl
