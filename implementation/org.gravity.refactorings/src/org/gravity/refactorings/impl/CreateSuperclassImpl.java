/**
 */
package org.gravity.refactorings.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.gravity.refactorings.RefactoringFailedException;
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
public class CreateSuperclassImpl extends RefactoringImpl {

	@Override
	public boolean isApplicable(RefactoringConfiguration configuration) throws RefactoringFailedException {
		if (configuration instanceof CreateSuperClassConfiguration) {
			CreateSuperClassConfiguration csc = (CreateSuperClassConfiguration) configuration;
			return isApplicable(csc.getChildren(), csc.getNewParent());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) throws RefactoringFailedException {
		if (configuration instanceof CreateSuperClassConfiguration) {
			CreateSuperClassConfiguration csc = (CreateSuperClassConfiguration) configuration;
			return perform(csc.getChildren(), csc.getNewParent());
		}
		return Collections.emptyList();
	}

	public List<TClass> perform(List<TClass> child, TClass newParent) throws RefactoringFailedException {

		List<TClass> container = new LinkedList<TClass>();

		container.add(newParent);
		pg.getOwnedTypes().add(newParent);
		pg.getClasses().add(newParent);

		PGAdditionHelper.linkClass(pg, newParent);

		TClass oldParent = null;
		for (TClass tChild : child) {
			if (!newParent.equals(tChild)) {
				oldParent = tChild.getParentClass();
			}
		}
		if (oldParent != null && !newParent.equals(oldParent)) {
			oldParent.getChildClasses().add(newParent);
			container.add(oldParent);

		}

		for (TClass tChildClass : child) {
			if (newParent.equals(tChildClass)) {
				throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[new_parent] = " + newParent
						+ ", " + "[tChildClass] = " + tChildClass + ", " + "[container] = " + container + ".");
			}
			TClass tParent = tChildClass.getParentClass();
			if (tParent != null && !tChildClass.equals(tParent)) {
				tChildClass.setParentClass(null);
			} else {
				throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[tParent] = " + tParent + ", "
						+ "[tChildClass] = " + tChildClass + ".");
			}
			newParent.getChildClasses().add(tChildClass);
			container.add(tChildClass);

		}
		return container;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws RefactoringFailedException 
	 * 
	 * @generated
	 */
	public boolean isApplicable(List<TClass> child, TClass newParent) throws RefactoringFailedException {

		TClass existingParent = getOtherTClassByName(pg, newParent);
		if (existingParent != null) {
			TPackage newParentsPackage = null;
			TPackage existingParentsPackage = null;
			if (!existingParent.equals(newParent)) {
				newParentsPackage = newParent.getPackage();
				if (newParentsPackage != null) {
					existingParentsPackage = existingParent.getPackage();
					if (existingParentsPackage != null) {
						if (!existingParentsPackage.equals(newParentsPackage)) {

						}
					}
				}
			}

			if (newParentsPackage == null || existingParentsPackage == null) {
				throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[new_parent] = " + newParent
						+ ", " + "[existingParent] = " + existingParent + ".");
			}
			//
			if (PGAdditionHelper.equivalent(existingParentsPackage, newParentsPackage)) {
				return false;
			}

		}
		//
		boolean classesAreEqual = false;
		for (TClass one : child) {
			for (TClass two : child) {
				if (!one.equals(two)) {
					classesAreEqual = true;
				}
			}
		}
		if (classesAreEqual) {
			for (TClass b : child) {
				for (TClass a : child) {
					//
					TPackage basePackageOne = a.getBasePackage();
					TPackage basePackageTwo = b.getBasePackage();
					if (basePackageOne != basePackageTwo) {
						return false;
					}

				}
			}
			// ForEach pair of children
			for (TClass tChildOne : child) {
				TClass parentOne = tChildOne.getResolvedParentClass();
				for (TClass tChildTwo : child) {
					if (!tChildOne.equals(tChildTwo)) {
						TClass parentTwo = tChildTwo.getResolvedParentClass();
						if(!parentOne.equals(parentTwo)) {
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

	public static final TClass getOtherTClassByName(TypeGraph pg, TClass exclude) {
		String newParentName = exclude.getTName();
		for (TClass existingParent : pg.getClasses()) {
			if (!existingParent.equals(exclude)) {
				String existingParentName = existingParent.getTName();
				if (existingParentName.equals(newParentName)) {
					return existingParent;
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
