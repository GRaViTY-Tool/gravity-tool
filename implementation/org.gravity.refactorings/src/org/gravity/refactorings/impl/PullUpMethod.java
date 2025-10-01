/**
 */
package org.gravity.refactorings.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.refactorings.Refactoring;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.PullUpMethodConfiguration;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pull Up
 * Method</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PullUpMethod implements Refactoring {

	@Override
	public boolean isApplicable(final RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			final PullUpMethodConfiguration esc = (PullUpMethodConfiguration) configuration;
			return isApplicable(esc.getSignature(), esc.getTargetClass());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(final RefactoringConfiguration configuration) throws RefactoringFailedException {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			final PullUpMethodConfiguration esc = (PullUpMethodConfiguration) configuration;
			return perform(esc.getSignature(), esc.getTargetClass());
		}
		return Collections.emptyList();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @throws RefactoringFailedException
	 *
	 * @generated
	 */
	public List<TClass> perform(final TMethodSignature method, final TClass parent) {
		final List<TClass> container = new LinkedList<>();
		final TMethodDefinition tMethodDefinition = PullUpMethod.selectRandomDefinitionOfChild(parent, method);
		if (tMethodDefinition != null) {
			final TClass oldImplementingClass = (TClass) tMethodDefinition.getDefinedBy();
			oldImplementingClass.getSignature().remove(method);
			parent.getSignature().add(method);
			tMethodDefinition.setDefinedBy(parent);
			container.add(oldImplementingClass);

			final List<EObject> delete = new LinkedList<>();
			for (final TMethodDefinition childsDefinition : method.getMethodDefinitions()) {
				final TAbstractType tmpTChild = childsDefinition.getDefinedBy();
				if (tmpTChild instanceof TClass) {
					final TClass tChild = (TClass) tmpTChild;
					if (!parent.equals(tChild) && tChild.getParentClasses().contains(parent)
							&& tChild.getSignature().contains(method)) {
						container.add(tChild);
						delete.add(childsDefinition);
						tChild.getSignature().remove(method);
						updateAccesses(tMethodDefinition, childsDefinition);
					}
				}
			}
			EMFUtil.deleteAll(delete, method.eResource());
		}
		return container;
	}

	/**
	 * Redirects all accesses to the old member to the new member
	 *
	 * @param newTarget The new target of the accesses
	 * @param oldTarget The old target of the accesses
	 */
	private void updateAccesses(final TMember newTarget, final TMember oldTarget) {
		final List<TAccess> accesses = oldTarget.getAccessedBy().parallelStream()
				.filter(access -> !access.getSource().equals(oldTarget)).collect(Collectors.toList());
		newTarget.getAccessedBy().addAll(accesses);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean isApplicable(final TMethodSignature tMethodSignatureToPullUp, final TClass tParentClass) {
		if (tParentClass.isTLib()) {
			return false;
		}

		// Parent doesn't implement the signature yet
		if (!tParentClass.getSignature().contains(tMethodSignatureToPullUp)) {

			final List<TMethodDefinition> tDefinitions = new LinkedList<>();
			// ForEach
			for (final TClass tChild : tParentClass.getChildClasses()) {
				if (tChild.getSignature().contains(tMethodSignatureToPullUp)) {
					final TMethodDefinition tMethodDefinition = tMethodSignatureToPullUp.getTDefinition(tChild);
					if (tMethodDefinition == null) {
						return false;
					} else {
						tDefinitions.add(tMethodDefinition);
					}
				} else {
					return false;
				}

			}
			if (tDefinitions.isEmpty()) {
				return false;
			}

			// ForEach
			for (final TClass tChild : tParentClass.getChildClasses()) {
				if (tChild.isTLib()) {
					return false;
				}

			}

			// ForEach
			for (final TMethodDefinition tMethodDefinition : tDefinitions) {
				final TAbstractType childClass = tMethodDefinition.getDefinedBy();
				// ForEach
				for (final TAccess tAccess : tMethodDefinition.getAccessing()) {
					final TMember accessed = tAccess.getTarget();
					final TAbstractType definingClass = accessed.getDefinedBy();
					if (!accessed.equals(tMethodDefinition)) {
						if (definingClass.equals(childClass)) {
							return false;
						}
						if (!definingClass.equals(tParentClass) && definingClass.isSubTypeOf(tParentClass)
								&& !definingClass.isSubTypeOf(childClass)) {
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

	private static final TMethodDefinition selectRandomDefinitionOfChild(final TClass parent,
			final TMethodSignature method) {
		for (final TClass tmpChild : parent.getChildClasses()) {
			if (!parent.equals(tmpChild) && tmpChild.getSignature().contains(method)) {
				for (final TMethodDefinition tMethodDefinition : method.getMethodDefinitions()) {
					if (tmpChild.equals(tMethodDefinition.getDefinedBy())) {
						return tMethodDefinition;
					}
				}
			}
		}
		return null;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.PULLUP_METHOD;
	}
} // Pull_Up_MethodImpl
