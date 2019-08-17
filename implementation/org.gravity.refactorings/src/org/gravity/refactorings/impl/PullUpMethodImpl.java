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
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pull Up
 * Method</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PullUpMethodImpl extends RefactoringImpl {

	/**
	 * Creates a new refactoring
	 * 
	 * @param programModel The program model which should be refactored
	 */
	public PullUpMethodImpl(TypeGraph programModel) {
		super(programModel);
	}

	@Override
	public boolean isApplicable(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			PullUpMethodConfiguration esc = (PullUpMethodConfiguration) configuration;
			return isApplicable(esc.getSignature(), esc.getTargetClass());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) throws RefactoringFailedException {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			PullUpMethodConfiguration esc = (PullUpMethodConfiguration) configuration;
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
	public List<TClass> perform(TMethodSignature method, TClass parent) throws RefactoringFailedException {
		List<TClass> container = new LinkedList<>();
		TMethodDefinition tMethodDefinition = PullUpMethodImpl.selectRandomDefinitionOfChild(parent, method);
		if (tMethodDefinition != null) {
			TClass tmpChild = (TClass) tMethodDefinition.getDefinedBy();
			tmpChild.getSignature().remove(method);
			parent.getSignature().add(method);
			tMethodDefinition.setDefinedBy(parent);
			container.add(tmpChild);

			List<EObject> delete = new LinkedList<>();
			for (final TMethodDefinition childsDefinition : method.getDefinitions()) {
				TAbstractType tmpTChild = childsDefinition.getDefinedBy();
				if (tmpTChild instanceof TClass) {
					TClass tChild = (TClass) tmpTChild;
					if (!parent.equals(tmpChild) && parent.equals(tChild.getParentClass())
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
	private void updateAccesses(TMember newTarget, final TMember oldTarget) {
		List<TAccess> accesses = oldTarget.getAccessedBy().parallelStream()
				.filter(access -> !access.getTSource().equals(oldTarget)).collect(Collectors.toList());
		newTarget.getAccessedBy().addAll(accesses);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isApplicable(TMethodSignature tMethodSignatureToPullUp, TClass tParentClass) {
		if (tParentClass.isTLib()) {
			return false;
		}

		// Parent doesn't implement the signature yet
		if (!tParentClass.getSignature().contains(tMethodSignatureToPullUp)) {

			List<TMethodDefinition> tDefinitions = new LinkedList<>();
			// ForEach
			for (TClass tChild : tParentClass.getChildClasses()) {
				if (tChild.getSignature().contains(tMethodSignatureToPullUp)) {
					TMethodDefinition tMethodDefinition = tMethodSignatureToPullUp.getTDefinition(tChild);
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
			for (TClass tChild : tParentClass.getChildClasses()) {
				if (tChild.isTLib()) {
					return false;
				}

			}

			List<TMember> accessedMembers = new LinkedList<>();
			// ForEach
			for (TMethodDefinition tMethodDefinition : tDefinitions) {
				TAbstractType tmpActiveClass = tMethodDefinition.getDefinedBy();
				if (tmpActiveClass instanceof TClass) {
					TClass childClass = (TClass) tmpActiveClass;

					// ForEach
					for (TAccess tAccess : tMethodDefinition.getTAccessing()) {
						TMember accessed = tAccess.getTTarget();
						TAbstractType definingClass = accessed.getDefinedBy();
						if (!accessed.equals(tMethodDefinition)) {
							accessedMembers.add(accessed);
							if (definingClass.equals(childClass)) {
								return false;
							}
							if (!definingClass.equals(tParentClass) 
									&& definingClass.isSubTypeOf(tParentClass)
									&& !definingClass.isSubTypeOf(childClass)) {
								return false;
							}
						}
					}
				}
			}
			return true;
		} else {
			return false;
		}

	}

	private static final TMethodDefinition selectRandomDefinitionOfChild(TClass parent, TMethodSignature method) {
		for (TClass tmpChild : parent.getChildClasses()) {
			if (!parent.equals(tmpChild) && tmpChild.getSignature().contains(method)) {
				for (TMethodDefinition tMethodDefinition : method.getDefinitions()) {
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
		return TRefactoringID.TPullUpMethod;
	}
} // Pull_Up_MethodImpl
