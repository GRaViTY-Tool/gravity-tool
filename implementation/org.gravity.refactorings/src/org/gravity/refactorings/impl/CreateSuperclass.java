/**
 */
package org.gravity.refactorings.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
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
		final TypeGraph pg = child.get(0).getModel();
		final List<TClass> container = new LinkedList<>();

		container.add(newParent);
		pg.getAllTypes().add(newParent);
		pg.getClasses().add(newParent);

		PGAdditionHelper.linkClass(pg, newParent);

		final EList<TClass> oldParents = child.get(0).getParentClasses();
		if (!oldParents.isEmpty()) {
			newParent.getParentClasses().addAll(oldParents);
			container.addAll(oldParents);

		}

		for (final TClass tChildClass : child) {
			final EList<TClass> parentClasses = tChildClass.getParentClasses();
			parentClasses.clear();
			parentClasses.add(newParent);
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
		final TypeGraph programModel = firstChild.getModel();
		if (programModel.getType(newParentName) != null) {
			return false;
		}

		final TClass object = programModel.getClass("java.lang.Object");

		// All child need the same base package and parent
		final TPackage expectedBasePackage = firstChild.getBasePackage();
		final List<TClass> expectedParents = firstChild.getParentClasses();
		for (int i = 1; i < child.size(); i++) {
			final TClass nextChild = child.get(i);
			if (!expectedBasePackage.equals(nextChild.getBasePackage())) {
				return false;
			}
			final List<TClass> parentClasses = nextChild.getParentClasses();

			// Check that the next child has all parent classes the first one has
			for (final TAbstractType expectedParent : expectedParents) {
				if (!expectedParent.equals(object) && !parentClasses.contains(expectedParent)) {
					return false;
				}
			}
			// Check that the next child has no additional parents
			for (final TAbstractType parent : parentClasses) {
				if (!parent.equals(object) && !expectedParents.contains(parent)) {
					return false;
				}
			}
		}

		return true;
	}

	private boolean hasOnlyObjectAsParent(final TClass object, final TClass child) {
		final List<TClass> parents = child.getParents();
		return parents.isEmpty() || ((parents.size() == 1) && parents.contains(object));
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.CREATE_SUPERCLASS;
	}

} // Create_SuperclassImpl
