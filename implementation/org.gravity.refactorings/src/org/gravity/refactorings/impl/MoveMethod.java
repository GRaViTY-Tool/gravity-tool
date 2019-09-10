/**
 */
package org.gravity.refactorings.impl;

import org.eclipse.emf.common.util.EList;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.MoveMethodConfiguration;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.annotations.TAnnotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Move
 * Method</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MoveMethod extends MoveMember {

	@Override
	public boolean isApplicable(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			MoveMethodConfiguration mm = (MoveMethodConfiguration) configuration;

			TMethodSignature methodSig = mm.getSignature();
			TClass sourceClass = mm.getSourceClass();
			TClass targetClass = mm.getTargetClass();
			
			if (!getterSetterPrecondition(methodSig)) {
				return false;
			}

			if (methodSig.getReturnType() == targetClass) {
				return true;
			}

			for (TParameter param : methodSig.getParameters()) {
				if (param.getType() == targetClass) {
					return true;
				}
			}

			if (!interfacePrecondition(methodSig, sourceClass)) {
				return false;
			}
			if (!overridePrecondition(methodSig, sourceClass)) {
				return false;
			}
			if (targetClass.getSignature().contains(methodSig)) {
				return false;
			}
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			MoveMethodConfiguration mm = (MoveMethodConfiguration) configuration;
			EList<TMethodDefinition> definitions = mm.getSignature().getDefinitions();
			for (TMember tMember : mm.getSourceClass().getDefines()) {
				if (definitions.contains(tMember)) {
					tMember.setDefinedBy(mm.getTargetClass());
					mm.getSourceClass().getSignature().remove(mm.getSignature());
					mm.getTargetClass().getSignature().add(mm.getSignature());
				}
			}
		}
		return Collections.emptyList();
	}

	public static boolean getterSetterPrecondition(TMethodSignature methodSig) {
		if (methodSig.getSignatureString().toLowerCase().startsWith("set")) {
			return false;
		}
		if (methodSig.getSignatureString().toLowerCase().startsWith("get")) {
			return false;
		}
		return true;
	}

	public static boolean interfacePrecondition(TMethodSignature methodSig, TClass sourceClass) {
		List<TInterface> interfaces = new ArrayList<TInterface>();
		TClass parent = sourceClass;
		while (parent != null) {
			interfaces.addAll(parent.getImplements());
			parent = parent.getParentClass();
		}

		for (TInterface tInterface : interfaces) {
			for (TSignature interfaceSig : tInterface.getSignature()) {
				if (interfaceSig == methodSig) {
					// LOGGER.log(Level.WARNING, "Can't move
					// "+sourceClass.getFullyQualifiedName()+"."+methodSig.getSignatureString()+",
					// REASON interface");
					return false;
				}
			}
		}

		return true;
	}

	public static boolean overridePrecondition(TMethodSignature methodSig, TClass sourceClass) {
		for (TMember member : sourceClass.getDefines()) {
			if (member.getSignature() == methodSig) {
				for (TAnnotation annotation : member.getTAnnotation()) {
					if (annotation.getType() != null && annotation.getType().getTName().equalsIgnoreCase("override")) {
						// LOGGER.log(Level.WARNING, "Can't move
						// "+sourceClass.getFullyQualifiedName()+"."+methodSig.getSignatureString()+",
						// REASON override");
						return false;
					}
				}
			}
		}
		return true;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.MOVE_METHOD;
	}
}
