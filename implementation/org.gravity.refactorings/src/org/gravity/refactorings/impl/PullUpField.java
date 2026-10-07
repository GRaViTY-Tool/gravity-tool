/**
 */
package org.gravity.refactorings.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.refactorings.Refactoring;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.PullUpFieldConfiguration;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TSignature;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pull Up
 * Field</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PullUpField implements Refactoring {

	@Override
	public boolean isApplicable(final RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			final PullUpFieldConfiguration esc = (PullUpFieldConfiguration) configuration;
			return isApplicable(esc.getSignature(), esc.getTargetClass());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(final RefactoringConfiguration configuration) throws RefactoringFailedException {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			final PullUpFieldConfiguration esc = (PullUpFieldConfiguration) configuration;
			return perform(esc.getSignature(), esc.getTargetClass());
		}
		return Collections.emptyList();
	}

	public List<TClass> perform(final TFieldSignature field, final TClass parent) throws RefactoringFailedException {
		final List<TClass> parentsChild = parent.getChildClasses();
		if (parentsChild.isEmpty()) {
			return Collections.emptyList();
		}
		final List<TClass> classContainer = new LinkedList<>();

		final TClass tchild = parentsChild.get(0);
		final TFieldDefinition fieldParentDefinition = field.getTDefinition(tchild);
		if (fieldParentDefinition == null) {
			throw new RefactoringFailedException("Couldn't find field to keep!");
		}

		move(tchild, parent, field, fieldParentDefinition);
		classContainer.add(tchild);

		// ForEach
		for (int i = 1; i < parentsChild.size(); i++) {
			final TClass child = parentsChild.get(i);
			final TFieldDefinition fieldChildDefinition = field.getTDefinition(child);
			if (fieldChildDefinition == null) {
				throw new RefactoringFailedException("Child has no definition of the field");
			}
			classContainer.add(child);

			for (final TAccess currentAccess : fieldChildDefinition.getAccessedBy()) {
				currentAccess.setTarget(fieldParentDefinition);
			}
			fieldChildDefinition.setDefinedBy(null);
			child.getSignature().remove(field);

			EcoreUtil.delete(fieldChildDefinition);
		}
		return classContainer;

	}

	/**
	 * Moves a member to a other type
	 *
	 * @param source     The source containing the member definition
	 * @param target     The new target
	 * @param signature  The signature of the member
	 * @param definition The member definition
	 */
	private void move(final TAbstractType source, final TAbstractType target, final TSignature signature,
			final TMember definition) {
		source.getSignature().remove(signature);
		target.getSignature().add(signature);
		definition.setDefinedBy(target);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean isApplicable(final TFieldSignature field, final TClass parent) {
		// The parent istn't allowed to implement the field signature itself
		if (parent.getSignature().contains(field)) {
			return false;
		}

		// All child have to implement the signature
		for (final TClass child : parent.getChildClasses()) {
			if (child.getSignature().contains(field)) {
				final TFieldDefinition fieldDefinition = field.getTDefinition(child);
				if (fieldDefinition == null) {
					return false;
				}

			} else {
				return false;
			}

		}

		final TPackage basePackage = parent.getBasePackage();
		for (final TClass child : parent.getChildClasses()) {
			final TPackage childBasePackage = child.getBasePackage();
			if (!basePackage.equals(childBasePackage)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.PULLUP_FIELD;
	}
} // Pull_Up_FieldImpl
