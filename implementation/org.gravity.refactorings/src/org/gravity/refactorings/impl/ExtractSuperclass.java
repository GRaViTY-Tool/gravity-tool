/**
 */
package org.gravity.refactorings.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.gravity.refactorings.Refactoring;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.ExtractSuperClassConfiguration;
import org.gravity.refactorings.util.HelpersImpl;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
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
		final HelpersImpl helpers = new HelpersImpl();

		final List<TClass> result = csc.perform(children, newParent);
		// ForEach
		for (final TSignature tSignature : signatures) {

			final TMember bestDefinition = helpers.getBestTMember(children, tSignature);
			if (bestDefinition == null) {
				throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[helpers] = "
						+ helpers + ", " + "[children] = " + children + ", " + "[tSignature] = " + tSignature + ".");
			}
			//
			final Object[] result6_black = ExtractSuperclass
					.pattern_Extract_Superclass_0_6_ActivityNode218_blackBFB(bestDefinition, tSignature);
			if (result6_black != null) {
				final TClass tOwnerClass = (TClass) result6_black[1];

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
					helpers.mountAccesses(child, newParent, tSignature);
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
	public boolean isApplicable(List<TClass> children, TClass new_parent, List<TSignature> signatures)
			throws RefactoringFailedException {

		final CreateSuperclass csc = new CreateSuperclass();

		if (csc.isApplicable(children, new_parent)) {
			// ForEach
			for (final Object[] result4_black : ExtractSuperclass
					.pattern_Extract_Superclass_1_4_ActivityNode96_blackFBFB(children, signatures)) {
				final TClass child = (TClass) result4_black[0];
				final TSignature tSignature = (TSignature) result4_black[2];
				//
				if (child.getSignature().contains(tSignature)) {

					final List<TMember> allOutgoingAccesses = child.getAllOutgoingAccesses(tSignature);
					//
					final Object[] result7_black = ExtractSuperclass
							.pattern_Extract_Superclass_1_7_ActivityNode157_blackBBFB(allOutgoingAccesses, child,
									signatures);
					if (result7_black != null) {
						// nothing TFieldDefinition tChildFieldDefinition = (TFieldDefinition)
						// result7_black[2];
						return false;
					} else {
						//
						final Object[] result9_black = ExtractSuperclass
								.pattern_Extract_Superclass_1_9_ActivityNode158_blackBBFB(child, allOutgoingAccesses,
										signatures);
						if (result9_black != null) {
							// nothing TMethodDefinition tChildmethodDefinition = (TMethodDefinition)
							// result9_black[2];
							return false;
						}

					}

				} else {
					return false;
				}

			}
			return true;
		} else {
			return false;
		}

	}

	public static final Object[] pattern_Extract_Superclass_0_6_ActivityNode218_blackBFB(TMember bestDefinition,
			TSignature tSignature) {
		final TAbstractType tmpTOwnerClass = bestDefinition.getDefinedBy();
		if (tmpTOwnerClass instanceof TClass) {
			final TClass tOwnerClass = (TClass) tmpTOwnerClass;
			if (tOwnerClass.getSignature().contains(tSignature)) {
				return new Object[] { bestDefinition, tOwnerClass, tSignature };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_Extract_Superclass_1_4_ActivityNode96_blackFBFB(
			List<TClass> children, List<TSignature> signatures) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		for (final TClass child : children) {
			for (final TSignature tSignature : signatures) {
				_result.add(new Object[] { child, children, tSignature, signatures });
			}
		}
		return _result;
	}

	public static final Object[] pattern_Extract_Superclass_1_7_ActivityNode157_blackBBFB(
			List<TMember> allOutgoingAccesses, TClass child, List<TSignature> signatures) {
		for (final TMember tmpTChildFieldDefinition : allOutgoingAccesses) {
			if (tmpTChildFieldDefinition instanceof TFieldDefinition) {
				final TFieldDefinition tChildFieldDefinition = (TFieldDefinition) tmpTChildFieldDefinition;
				if (child.equals(tChildFieldDefinition.getDefinedBy())) {
					final TFieldSignature tFieldSignatureFromContainer = tChildFieldDefinition.getSignature();
					if (tFieldSignatureFromContainer == null || !signatures.contains(tFieldSignatureFromContainer)) {
						return new Object[] { allOutgoingAccesses, child, tChildFieldDefinition, signatures };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Extract_Superclass_1_9_ActivityNode158_blackBBFB(TClass child,
			List<TMember> allOutgoingAccesses, List<TSignature> signatures) {
		for (final TMember tmpTChildmethodDefinition : child.getDefines()) {
			if (tmpTChildmethodDefinition instanceof TMethodDefinition) {
				final TMethodDefinition tChildmethodDefinition = (TMethodDefinition) tmpTChildmethodDefinition;
				if (allOutgoingAccesses.contains(tChildmethodDefinition)) {
					final TMethodSignature tMethodSignatureFromContainer = tChildmethodDefinition.getSignature();
					if (tMethodSignatureFromContainer != null && signatures.contains(tMethodSignatureFromContainer)) {
						return new Object[] { child, allOutgoingAccesses, tChildmethodDefinition, signatures };
					}
				}
			}
		}
		return null;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.EXTRACT_CLASS;
	}
}