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
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TPackage;

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
	public boolean isApplicable(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			final PullUpFieldConfiguration esc = (PullUpFieldConfiguration) configuration;
			return isApplicable(esc.getSignature(), esc.getTargetClass());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) throws RefactoringFailedException {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			final PullUpFieldConfiguration esc = (PullUpFieldConfiguration) configuration;
			return perform(esc.getSignature(), esc.getTargetClass());
		}
		return Collections.emptyList();
	}

	public List<TClass> perform(TFieldSignature field, TClass parent) throws RefactoringFailedException {
		final List<TClass> classContainer = new LinkedList<>();
		//
		final Object[] result3_black = PullUpField.pattern_Pull_Up_Field_0_3_ActivityNode135_blackBFFBB(parent, field,
				classContainer);
		if (result3_black != null) {
			final TClass tchild = (TClass) result3_black[1];
			final TFieldDefinition fieldParentDefinition = (TFieldDefinition) result3_black[2];

			tchild.getSignature().remove(field);
			fieldParentDefinition.setDefinedBy(null);

			parent.getSignature().add(field);
			fieldParentDefinition.setDefinedBy(parent);
			classContainer.add(tchild);

			// ForEach
			for (final Object[] result4_black : PullUpField.pattern_Pull_Up_Field_0_4_ActivityNode137_blackBFBFB(parent,
					field, classContainer)) {
				final TClass child = (TClass) result4_black[1];
				final TFieldDefinition fieldChildDefinition = (TFieldDefinition) result4_black[3];
				classContainer.add(child);

				// ForEach
				for (final TAccess currentAccess : PullUpField
						.pattern_Pull_Up_Field_0_5_ActivityNode138_blackBFBFF(fieldChildDefinition)) {
					if (fieldChildDefinition.equals(fieldParentDefinition)
							|| !fieldChildDefinition.getAccessedBy().contains(currentAccess)) {
						throw new RefactoringFailedException(
								"Pattern matching failed." + " Variables: " + "[currentAccess] = " + currentAccess
								+ ", " + "[fieldChildDefinition] = " + fieldChildDefinition + ", "
								+ "[fieldParentDefinition] = " + fieldParentDefinition + ".");
					}
					fieldChildDefinition.getAccessedBy().remove(currentAccess);
					fieldParentDefinition.getAccessedBy().add(currentAccess);
				}

				if (child.equals(fieldChildDefinition.getDefinedBy()) && child.getSignature().contains(field)
						&& field.getDefinitions().contains(fieldChildDefinition)) {
				} else {
					throw new RefactoringFailedException("Pattern matching failed." + " Variables: "
							+ "[fieldChildDefinition] = " + fieldChildDefinition + ", " + "[child] = " + child + ", "
							+ "[field] = " + field + ".");
				}
				fieldChildDefinition.setDefinedBy(null);
				child.getSignature().remove(field);

				EcoreUtil.delete(fieldChildDefinition);
			}
			return classContainer;
		} else {
			return classContainer;
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean isApplicable(TFieldSignature field, TClass parent) {
		// The parent istn't allowed to implement the field signature itself
		if (parent.getSignature().contains(field)) {
			return false;
		}

		// All child have to implement the signature
		for (final TClass child : parent.getChildClasses()) {
			if (child.getSignature().contains(field)) {
				final TFieldDefinition fieldDefinition = getTFieldDefinition(child, field);
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

	public static final Object[] pattern_Pull_Up_Field_0_3_ActivityNode135_blackBFFBB(TClass parent,
			TFieldSignature field, List<TClass> classContainer) {
		for (final TClass tchild : parent.getChildClasses()) {
			if (!parent.equals(tchild) && tchild.getSignature().contains(field)) {
				for (final TFieldDefinition fieldParentDefinition : field.getFieldDefinitions()) {
					if (tchild.equals(fieldParentDefinition.getDefinedBy())) {
						return new Object[] { parent, tchild, fieldParentDefinition, field, classContainer };
					}

				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Pull_Up_Field_0_4_ActivityNode137_blackBFBFB(TClass parent,
			TFieldSignature field, List<TClass> classContainer) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		for (final TClass child : parent.getChildClasses()) {
			if (!child.equals(parent)&&child.getSignature().contains(field)) {
				for (final TFieldDefinition fieldChildDefinition : field.getFieldDefinitions()) {
					if (child.equals(fieldChildDefinition.getDefinedBy())) {
						_result.add(new Object[] { parent, child, field, fieldChildDefinition, classContainer });
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<TAccess> pattern_Pull_Up_Field_0_5_ActivityNode138_blackBFBFF(
			TFieldDefinition fieldChildDefinition) {
		final LinkedList<TAccess> result = new LinkedList<>();
		for (final TAccess currentAccess : fieldChildDefinition.getAccessedBy()) {
			final TMember tMember = currentAccess.getTSource();
			if (tMember != null) {
				if (!fieldChildDefinition.equals(tMember)) {
					result.add(currentAccess);

				}
			}
		}
		return result;
	}

	public static final TFieldDefinition getTFieldDefinition(TClass child, TFieldSignature field) {
		for (final TMember tmpFieldDefinition : child.getDefines()) {
			if (tmpFieldDefinition instanceof TFieldDefinition) {
				final TFieldDefinition fieldDefinition = (TFieldDefinition) tmpFieldDefinition;
				if (field.getDefinitions().contains(fieldDefinition)) {
					return fieldDefinition;
				}
			}
		}
		return null;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.PULLUP_FIELD;
	}
} // Pull_Up_FieldImpl
