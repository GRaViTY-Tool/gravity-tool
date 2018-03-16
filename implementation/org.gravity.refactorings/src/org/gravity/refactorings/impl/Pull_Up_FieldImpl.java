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
import org.gravity.refactorings.configuration.impl.PullUpFieldConfiguration;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pull Up
 * Field</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Pull_Up_FieldImpl extends RefactoringImpl {

	@Override
	public boolean isApplicable(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			PullUpFieldConfiguration esc = (PullUpFieldConfiguration) configuration;
			return isApplicable(esc.getSignature(), esc.getTargetClass());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			PullUpFieldConfiguration esc = (PullUpFieldConfiguration) configuration;
			return perform(esc.getSignature(), esc.getTargetClass());
		}
		return Collections.emptyList();
	}

	public List<TClass> perform(TFieldSignature field, TClass parent) {

		TypeGraph pg = getPg();

		List<TClass> classContainer = new LinkedList<TClass>();
		//
		Object[] result3_black = Pull_Up_FieldImpl.pattern_Pull_Up_Field_0_3_ActivityNode135_blackBFFBB(parent, field,
				classContainer);
		if (result3_black != null) {
			TClass tchild = (TClass) result3_black[1];
			TFieldDefinition fieldParentDefinition = (TFieldDefinition) result3_black[2];
			Pull_Up_FieldImpl.pattern_Pull_Up_Field_0_3_ActivityNode135_redBBB(tchild, fieldParentDefinition, field);

			Pull_Up_FieldImpl.pattern_Pull_Up_Field_0_3_ActivityNode135_greenBBBBB(parent, tchild,
					fieldParentDefinition, field, classContainer);

			// ForEach
			for (Object[] result4_black : Pull_Up_FieldImpl.pattern_Pull_Up_Field_0_4_ActivityNode137_blackBFBFB(parent,
					field, classContainer)) {
				TClass child = (TClass) result4_black[1];
				TFieldDefinition fieldChildDefinition = (TFieldDefinition) result4_black[3];
				Pull_Up_FieldImpl.pattern_Pull_Up_Field_0_4_ActivityNode137_greenBB(child, classContainer);

				// ForEach
				for (Object[] result5_black : Pull_Up_FieldImpl.pattern_Pull_Up_Field_0_5_ActivityNode138_blackBFBFF(pg,
						fieldChildDefinition)) {
					TAccess currentAccess = (TAccess) result5_black[1];
					// nothing TClass accesserClass = (TClass) result5_black[3];
					// nothing TMember tMember = (TMember) result5_black[4];

					Object[] result6_black = Pull_Up_FieldImpl.pattern_Pull_Up_Field_0_6_ActivityNode139_blackBBB(
							currentAccess, fieldChildDefinition, fieldParentDefinition);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[currentAccess] = "
								+ currentAccess + ", " + "[fieldChildDefinition] = " + fieldChildDefinition + ", "
								+ "[fieldParentDefinition] = " + fieldParentDefinition + ".");
					}
					Pull_Up_FieldImpl.pattern_Pull_Up_Field_0_6_ActivityNode139_redBB(currentAccess,
							fieldChildDefinition);

					Pull_Up_FieldImpl.pattern_Pull_Up_Field_0_6_ActivityNode139_greenBB(currentAccess,
							fieldParentDefinition);

				}

				Object[] result7_black = Pull_Up_FieldImpl
						.pattern_Pull_Up_Field_0_7_ActivityNode140_blackBBB(fieldChildDefinition, child, field);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[fieldChildDefinition] = "
							+ fieldChildDefinition + ", " + "[child] = " + child + ", " + "[field] = " + field + ".");
				}
				Pull_Up_FieldImpl.pattern_Pull_Up_Field_0_7_ActivityNode140_redBBB(fieldChildDefinition, child, field);

				EcoreUtil.delete(fieldChildDefinition);
				fieldChildDefinition = null;
				;

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

			TPackage basePackage = Search.getBasePackage(parent);
			
			List<TFieldDefinition> tFieldDefinitions = new LinkedList<>();
			// ForEach
			for (Object[] result5_black : Pull_Up_FieldImpl.pattern_Pull_Up_Field_1_5_ActivityNode128_blackBF(parent)) {
				TClass child = (TClass) result5_black[1];
				//
				Object[] result6_black = Pull_Up_FieldImpl.pattern_Pull_Up_Field_1_6_ActivityNode129_blackBB(child,
						field);
				if (result6_black != null) {
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
					TPackage childBasePackage = Search.getBasePackage(child);
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
					for (TFieldDefinition fieldParentDefinition : field.getDefinitions()) {
						if (tchild.equals(fieldParentDefinition.getDefinedBy())) {
							return new Object[] { parent, tchild, fieldParentDefinition, field, classContainer };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Pull_Up_Field_0_3_ActivityNode135_redBBB(TClass tchild,
			TFieldDefinition fieldParentDefinition, TFieldSignature field) {
		tchild.getSignature().remove(field);
		fieldParentDefinition.setDefinedBy(null);
		return new Object[] { tchild, fieldParentDefinition, field };
	}

	public static final Object[] pattern_Pull_Up_Field_0_3_ActivityNode135_greenBBBBB(TClass parent, TClass tchild,
			TFieldDefinition fieldParentDefinition, TFieldSignature field, List<TClass> classContainer) {
		parent.getSignature().add(field);
		fieldParentDefinition.setDefinedBy(parent);
		classContainer.add(tchild);
		return new Object[] { parent, tchild, fieldParentDefinition, field, classContainer };
	}

	public static final Iterable<Object[]> pattern_Pull_Up_Field_0_4_ActivityNode137_blackBFBFB(TClass parent,
			TFieldSignature field, List<TClass> classContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass child : parent.getChildClasses()) {
			if (!child.equals(parent)) {
				if (child.getSignature().contains(field)) {
					for (TFieldDefinition fieldChildDefinition : field.getDefinitions()) {
						if (child.equals(fieldChildDefinition.getDefinedBy())) {
							_result.add(new Object[] { parent, child, field, fieldChildDefinition, classContainer });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Pull_Up_Field_0_4_ActivityNode137_greenBB(TClass child,
			List<TClass> classContainer) {
		classContainer.add(child);
		return new Object[] { child, classContainer };
	}

	public static final Iterable<Object[]> pattern_Pull_Up_Field_0_5_ActivityNode138_blackBFBFF(TypeGraph pg,
			TFieldDefinition fieldChildDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass accesserClass : pg.getClasses()) {
			for (TAccess currentAccess : fieldChildDefinition.getAccessedBy()) {
				TMember tMember = currentAccess.getTSource();
				if (tMember != null) {
					if (!fieldChildDefinition.equals(tMember)) {
						if (accesserClass.equals(tMember.getDefinedBy())) {
							_result.add(
									new Object[] { pg, currentAccess, fieldChildDefinition, accesserClass, tMember });
						}
					}
				}

			}
		}
		return _result;
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

	public static final Object[] pattern_Pull_Up_Field_0_6_ActivityNode139_redBB(TAccess currentAccess,
			TFieldDefinition fieldChildDefinition) {
		fieldChildDefinition.getAccessedBy().remove(currentAccess);
		return new Object[] { currentAccess, fieldChildDefinition };
	}

	public static final Object[] pattern_Pull_Up_Field_0_6_ActivityNode139_greenBB(TAccess currentAccess,
			TFieldDefinition fieldParentDefinition) {
		fieldParentDefinition.getAccessedBy().add(currentAccess);
		return new Object[] { currentAccess, fieldParentDefinition };
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

	public static final Object[] pattern_Pull_Up_Field_0_7_ActivityNode140_redBBB(TFieldDefinition fieldChildDefinition,
			TClass child, TFieldSignature field) {
		fieldChildDefinition.setDefinedBy(null);
		child.getSignature().remove(field);
		return new Object[] { fieldChildDefinition, child, field };
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

	public static final Object[] pattern_Pull_Up_Field_1_6_ActivityNode129_blackBB(TClass child,
			TFieldSignature field) {
		if (child.getSignature().contains(field)) {
			return new Object[] { child, field };
		}
		return null;
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
		return TRefactoringID.TPullUpField;
	}
} // Pull_Up_FieldImpl
