/**
 */
package org.gravity.refactorings.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.gravity.refactorings.Refactoring;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.CreateSuperClassConfiguration;
import org.gravity.refactorings.util.PGAdditionHelper;
import org.gravity.typegraph.basic.TAbstractType;
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
public class CreateSuperclass implements Refactoring {

	@Override
	public boolean isApplicable(final RefactoringConfiguration configuration) throws RefactoringFailedException {
		if (configuration instanceof CreateSuperClassConfiguration) {
			final CreateSuperClassConfiguration csc = (CreateSuperClassConfiguration) configuration;
			return isApplicable(csc.getChildren(), csc.getNewParent().getFullyQualifiedName());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(final RefactoringConfiguration configuration) throws RefactoringFailedException {
		if (configuration instanceof CreateSuperClassConfiguration) {
			final CreateSuperClassConfiguration csc = (CreateSuperClassConfiguration) configuration;
			return perform(csc.getChildren(), csc.getNewParent());
		}
		return Collections.emptyList();
	}

	public List<TClass> perform(final List<TClass> child, final TClass newParent) throws RefactoringFailedException {
		if (child.isEmpty()) {
			throw new RefactoringFailedException("The list of child classes is empty!");
		}
		final TypeGraph pg = child.get(0).getPg();
		final List<TClass> container = new LinkedList<>();

		container.add(newParent);
		pg.getOwnedTypes().add(newParent);
		pg.getClasses().add(newParent);

		PGAdditionHelper.linkClass(pg, newParent);

		final TClass oldParent = child.get(0).getParentClass();
		if (oldParent != null) {
			newParent.setParentClass(oldParent);
			container.add(oldParent);

		}

		for (final TClass tChildClass : child) {
			tChildClass.setParentClass(newParent);
			container.add(tChildClass);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @throws RefactoringFailedException
	 *
	 * @generated
	 */
	public boolean isApplicable(final List<TClass> child, final String newParentName) {
		if (child.isEmpty()) {
			return false;
		}

		// All children have to be editable
		if (child.parallelStream().anyMatch(TAbstractType::isTLib)) {
			return false;
		}

		final TClass firstChild = child.get(0);
		// There is not already a class with this name
		final TypeGraph programModel = firstChild.getPg();
		if (programModel.getType(newParentName) != null) {
			return false;
		}

		// All child need the same base package and parent
		final TPackage basePackage = firstChild.getBasePackage();
		final TClass parent = firstChild.getParentClass();
		final TClass object = programModel.getClass("java.lang.Object");
		for (int i = 1; i < child.size(); i++) {
			final TClass nextChild = child.get(i);
			if (!basePackage.equals(nextChild.getBasePackage())) {
				return false;
			}
			final TClass parentClass = nextChild.getParentClass();
			if (parent == null) {
				if (parentClass != null && !parentClass.equals(object)) {
					return false;
				}
			} else if (!parent.equals(parentClass)) {
				return false;
			}
		}

		return true;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.CREATE_SUPERCLASS;
	}

} // Create_SuperclassImpl
