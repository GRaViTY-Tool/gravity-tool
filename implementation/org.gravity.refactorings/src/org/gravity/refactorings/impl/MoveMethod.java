/**
 */
package org.gravity.refactorings.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.MoveMethodConfiguration;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.annotations.TAnnotation;

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
	public boolean isApplicable(final RefactoringConfiguration configuration) {
		if (getRefactoringID() != configuration.getRefactoringID()) {
			return false;
		}
		final MoveMethodConfiguration mm = (MoveMethodConfiguration) configuration;

		final TMethodSignature methodSig = mm.getSignature();
		final TClass sourceClass = mm.getSourceClass();
		final TClass targetClass = mm.getTargetClass();

		if (!getterSetterPrecondition(methodSig)) {
			return false;
		}

		if (methodSig.getReturnType() == targetClass) {
			return true;
		}

		for (final TParameter param : methodSig.getParameters()) {
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
		return !targetClass.getSignature().contains(methodSig);
	}

	@Override
	public Collection<TClass> perform(final RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			final MoveMethodConfiguration mm = (MoveMethodConfiguration) configuration;
			final EList<TMember> definitions = mm.getSignature().getDefinitions();
			for (final TMember tMember : mm.getSourceClass().getDefines()) {
				if (definitions.contains(tMember)) {
					tMember.setDefinedBy(mm.getTargetClass());
					mm.getSourceClass().getSignature().remove(mm.getSignature());
					mm.getTargetClass().getSignature().add(mm.getSignature());
				}
			}
		}
		return Collections.emptyList();
	}

	public static boolean getterSetterPrecondition(final TMethodSignature methodSig) {
		final String signature = methodSig.getMethod().getTName().toLowerCase();
		return !signature.startsWith("set") && !signature.startsWith("get");
	}

	public static boolean interfacePrecondition(final TMethodSignature methodSig, final TClass sourceClass) {
		final List<TInterface> interfaces = new ArrayList<>();
		final Deque<TClass> stack = new LinkedList<>();
		stack.add(sourceClass);
		while (!stack.isEmpty()) {
			final TClass parent = stack.pop();
			interfaces.addAll(parent.getImplements());
			stack.addAll(parent.getParentClasses());
		}

		for (final TInterface tInterface : interfaces) {
			for (final TSignature interfaceSig : tInterface.getSignature()) {
				if (interfaceSig == methodSig) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean overridePrecondition(final TMethodSignature methodSig, final TClass sourceClass) {
		for (final TMember member : sourceClass.getDefines()) {
			if (member.getSignature() == methodSig) {
				for (final TAnnotation annotation : member.getTAnnotation()) {
					if ((annotation.getType() != null) && annotation.getType().getTName().equalsIgnoreCase("override")) {
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
