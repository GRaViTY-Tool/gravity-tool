/**
 */
package org.gravity.refactorings.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.gravity.refactorings.Refactoring;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.ExtractSuperClassConfiguration;
import org.gravity.refactorings.util.HelpersImpl;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TSignature;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Extract
 * Superclass</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.refactorings.impl.ExtractSuperclass#getCreate_Superclass
 * <em>Create Superclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtractSuperclass implements Refactoring {

	@Override
	public boolean isApplicable(RefactoringConfiguration configuration) throws RefactoringFailedException {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			final ExtractSuperClassConfiguration esc = (ExtractSuperClassConfiguration) configuration;
			return isApplicable(esc.getChildren(), esc.getNewParent(), esc.getSignatures());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) throws RefactoringFailedException {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			final ExtractSuperClassConfiguration esc = (ExtractSuperClassConfiguration) configuration;
			return perform(esc.getChildren(), esc.getNewParent(), esc.getSignatures());
		}
		return Collections.emptyList();
	}

	public List<TClass> perform(List<TClass> children, TClass newParent, List<TSignature> signatures)
			throws RefactoringFailedException {
		if (children.isEmpty()) {
			throw new RefactoringFailedException("There are no children to extract a superclass from!");
		}
		final CreateSuperclass csc = new CreateSuperclass();

		final List<TClass> result = csc.perform(children, newParent);
		// ForEach
		for (final TSignature tSignature : signatures) {

			final TMember bestDefinition = HelpersImpl.getBestTMember(children, tSignature);
			if (bestDefinition == null) {
				throw new RefactoringFailedException("Unable to find a member definition to extract.");
			}
			//
			final TClass tOwnerClass = ExtractSuperclass.getDefiningClass(bestDefinition, tSignature);
			if (tOwnerClass != null) {

				if (!tOwnerClass.getSignature().contains(tSignature)
						|| !tOwnerClass.equals(bestDefinition.getDefinedBy())) {
					throw new RefactoringFailedException("Pattern matching failed." + " Variables: "
							+ "[tOwnerClass] = " + tOwnerClass + ", " + "[bestDefinition] = " + bestDefinition + ", "
							+ "[tSignature] = " + tSignature + ".");
				}
				tOwnerClass.getSignature().remove(tSignature);
				bestDefinition.setDefinedBy(null);

			}
			newParent.getSignature().add(tSignature);
			bestDefinition.setDefinedBy(newParent);

			// ForEach
			for (final TClass child : children) {
				if (child.getSignature().contains(tSignature)) {
					//
					HelpersImpl.mountAccesses(child, newParent, tSignature);
				}
			}

		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @throws RefactoringFailedException
	 *
	 * @generated
	 */
	public boolean isApplicable(List<TClass> children, TClass newParent, List<TSignature> signatures)
			throws RefactoringFailedException {

		final CreateSuperclass csc = new CreateSuperclass();

		if (!csc.isApplicable(children, newParent)) {
			return false;
		}
		// ForEach
		for (final TClass child : children) {
			for (final TSignature tSignature : signatures) {
				//
				if (!child.getSignature().contains(tSignature)) {
					return false;
				}

				final List<TMember> allOutgoingAccesses = child.getAllOutgoingAccesses(tSignature);
				if (ExtractSuperclass.isMemberAccessed(child, allOutgoingAccesses, signatures)) {
					return false;
				}

			}
		}
		return true;

	}

	private static final TClass getDefiningClass(TMember bestDefinition, TSignature tSignature) {
		final TAbstractType tmpTOwnerClass = bestDefinition.getDefinedBy();
		if (tmpTOwnerClass instanceof TClass) {
			final TClass tOwnerClass = (TClass) tmpTOwnerClass;
			if (tOwnerClass.getSignature().contains(tSignature)) {
				return tOwnerClass;
			}
		}
		return null;
	}

	public static final boolean isMemberAccessed(TClass child, List<TMember> accessed, List<TSignature> signatures) {
		for (final TMethodDefinition tChildmethodDefinition : child.getDeclaredTMethodDefinitions()) {
			if (accessed.contains(tChildmethodDefinition)
					&& signatures.contains(tChildmethodDefinition.getSignature())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.EXTRACT_CLASS;
	}
}