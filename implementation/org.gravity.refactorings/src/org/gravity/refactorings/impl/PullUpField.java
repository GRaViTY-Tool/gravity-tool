/**
 */
package org.gravity.refactorings.impl;

import java.lang.Iterable;
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
			PullUpFieldConfiguration esc = (PullUpFieldConfiguration) configuration;
			return isApplicable(esc.getSignature(), esc.getTargetClass());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) throws RefactoringFailedException {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			PullUpFieldConfiguration esc = (PullUpFieldConfiguration) configuration;
			return perform(esc.getSignature(), esc.getTargetClass());
		}
		return Collections.emptyList();
	}

	public List<TClass> perform(TFieldSignature field, TClass parent) throws RefactoringFailedException {
		List<TClass> classContainer = new LinkedList<TClass>();
		//
		Object[] result3_black = PullUpField.pattern_Pull_Up_Field_0_3_ActivityNode135_blackBFFBB(parent, field,
				classContainer);
		if (result3_black != null) {
			TClass tchild = (TClass) result3_black[1];
			TFieldDefinition fieldParentDefinition = (TFieldDefinition) result3_black[2];

			tchild.getSignature().remove(field);
			fieldParentDefinition.setDefinedBy(null);

			parent.getSignature().add(field);
			fieldParentDefinition.setDefinedBy(parent);
			classContainer.add(tchild);

			// ForEach
			for (Object[] result4_black : PullUpField.pattern_Pull_Up_Field_0_4_ActivityNode137_blackBFBFB(parent,
					field, classContainer)) {
				TClass child = (TClass) result4_black[1];
				TFieldDefinition fieldChildDefinition = (TFieldDefinition) result4_black[3];
				classContainer.add(child);

				// ForEach
				for (TAccess currentAccess : PullUpField
						.pattern_Pull_Up_Field_0_5_ActivityNode138_blackBFBFF(fieldChildDefinition)) {
					Object[] result6_black = PullUpField.pattern_Pull_Up_Field_0_6_ActivityNode139_blackBBB(
							currentAccess, fieldChildDefinition, fieldParentDefinition);
					if (result6_black == null) {
						throw new RefactoringFailedException(
								"Pattern matching failed." + " Variables: " + "[currentAccess] = " + currentAccess
										+ ", " + "[fieldChildDefinition] = " + fieldChildDefinition + ", "
										+ "[fieldParentDefinition] = " + fieldParentDefinition + ".");
					}
					fieldChildDefinition.getAccessedBy().remove(currentAccess);
					fieldParentDefinition.getAccessedBy().add(currentAccess);
				}

				Object[] result7_black = PullUpField
						.pattern_Pull_Up_Field_0_7_ActivityNode140_blackBBB(fieldChildDefinition, child, field);
				if (result7_black == null) {
					throw new RefactoringFailedException("Pattern matching failed." + " Variables: "
							+ "[fieldChildDefinition] = " + fieldChildDefinition + ", " + "[child] = " + child + ", "
							+ "[field] = " + field + ".");
				}
				fieldChildDefinition.setDefinedBy(null);
				child.getSignature().remove(field);

				EcoreUtil.delete(fieldChildDefinition);
				fieldChildDefinition = null;
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

		if (!parent.getSignature().contains(field)) {

			TPackage basePackage = parent.getBasePackage();

			List<TFieldDefinition> tFieldDefinitions = new LinkedList<>();
			// ForEach
			for (Object[] result5_black : PullUpField.pattern_Pull_Up_Field_1_5_ActivityNode128_blackBF(parent)) {
				TClass child = (TClass) result5_black[1];
				//
				if (child.getSignature().contains(field)) {
					//
					TFieldDefinition fieldDefinition = getTFieldDefinition(child, field);
					if (fieldDefinition != null) {
						tFieldDefinitions.add(fieldDefinition);

					} else {
						return false;
					}

				} else {
					return false;
				}

			}
			// ForEach
			for (TClass child : parent.getChildClasses()) {
				TPackage childBasePackage = child.getBasePackage();
				if (!basePackage.equals(childBasePackage)) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}

	}

	public static final Object[] pattern_Pull_Up_Field_0_3_ActivityNode135_blackBFFBB(TClass parent,
			TFieldSignature field, List<TClass> classContainer) {
		for (TClass tchild : parent.getChildClasses()) {
			if (!parent.equals(tchild)) {
				if (tchild.getSignature().contains(field)) {
					for (TFieldDefinition fieldParentDefinition : field.getFieldDefinitions()) {
						if (tchild.equals(fieldParentDefinition.getDefinedBy())) {
							return new Object[] { parent, tchild, fieldParentDefinition, field, classContainer };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Pull_Up_Field_0_4_ActivityNode137_blackBFBFB(TClass parent,
			TFieldSignature field, List<TClass> classContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass child : parent.getChildClasses()) {
			if (!child.equals(parent)) {
				if (child.getSignature().contains(field)) {
					for (TFieldDefinition fieldChildDefinition : field.getFieldDefinitions()) {
						if (child.equals(fieldChildDefinition.getDefinedBy())) {
							_result.add(new Object[] { parent, child, field, fieldChildDefinition, classContainer });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<TAccess> pattern_Pull_Up_Field_0_5_ActivityNode138_blackBFBFF(
			TFieldDefinition fieldChildDefinition) {
		LinkedList<TAccess> result = new LinkedList<>();
		for (TAccess currentAccess : fieldChildDefinition.getAccessedBy()) {
			TMember tMember = currentAccess.getTSource();
			if (tMember != null) {
				if (!fieldChildDefinition.equals(tMember)) {
					result.add(currentAccess);

				}
			}
		}
		return result;
	}

	public static final Object[] pattern_Pull_Up_Field_0_6_ActivityNode139_blackBBB(TAccess currentAccess,
			TFieldDefinition fieldChildDefinition, TFieldDefinition fieldParentDefinition) {
		if (!fieldChildDefinition.equals(fieldParentDefinition)) {
			if (fieldChildDefinition.getAccessedBy().contains(currentAccess)) {
				return new Object[] { currentAccess, fieldChildDefinition, fieldParentDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_Pull_Up_Field_0_7_ActivityNode140_blackBBB(
			TFieldDefinition fieldChildDefinition, TClass child, TFieldSignature field) {
		if (child.equals(fieldChildDefinition.getDefinedBy())) {
			if (child.getSignature().contains(field)) {
				if (field.getDefinitions().contains(fieldChildDefinition)) {
					return new Object[] { fieldChildDefinition, child, field };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Pull_Up_Field_1_5_ActivityNode128_blackBF(TClass parent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass child : parent.getChildClasses()) {
			if (!child.equals(parent)) {
				_result.add(new Object[] { parent, child });
			}
		}
		return _result;
	}

	public static final TFieldDefinition getTFieldDefinition(TClass child, TFieldSignature field) {
		for (TMember tmpFieldDefinition : child.getDefines()) {
			if (tmpFieldDefinition instanceof TFieldDefinition) {
				TFieldDefinition fieldDefinition = (TFieldDefinition) tmpFieldDefinition;
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
