/**
 */
package org.gravity.refactorings.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.MoveFieldConfiguration;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Move
 * Field</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MoveField extends MoveMember {
	
	@Override
	public boolean isApplicable(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			MoveFieldConfiguration esc = (MoveFieldConfiguration) configuration;
			return isApplicable(esc.getSignature(), esc.getSourceClass(), esc.getTargetClass());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			MoveFieldConfiguration esc = (MoveFieldConfiguration) configuration;
			return perform(esc.getSignature(), esc.getSourceClass(), esc.getTargetClass());
		}
		return Collections.emptyList();
	}
	
	public boolean isApplicable(TFieldSignature method, TClass tSourceClass, TClass tTargetClass) {

		TFieldDefinition definition = getTFieldDefinition(tSourceClass, method);
		if (definition != null) {
			if (tTargetClass.getSignature().contains(method)) {
				return false;
			}
			return noCallToAnyChildMember(definition, tSourceClass);

		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<TClass> perform(TFieldSignature method, TClass tTargetClass, TClass tSourceClass) {//
		if (tSourceClass.equals(tTargetClass)) {
			return null;
		}
		TFieldDefinition definition = getTFieldDefinition(tSourceClass, method);
		if (definition != null) {
			List<TClass> container = new LinkedList<TClass>();
			container.add(tTargetClass);
			container.add(tSourceClass);
			
			tSourceClass.getSignature().remove(method);
			tTargetClass.getSignature().add(method);
			definition.setDefinedBy(tTargetClass);

			return container;
		}
		return null;
	}

	public static final TFieldDefinition getTFieldDefinition(TClass tSourceClass, TFieldSignature method) {
		if (tSourceClass.getSignature().contains(method)) {
			for (TMember tmpDefinition : tSourceClass.getDefines()) {
				if (tmpDefinition instanceof TFieldDefinition) {
					TFieldDefinition definition = (TFieldDefinition) tmpDefinition;
					if (method.getDefinitions().contains(definition)) {
						return definition;
					}
				}
			}
		}
		return null;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.MOVE_FIELD;
	}
} // Move_FieldImpl


