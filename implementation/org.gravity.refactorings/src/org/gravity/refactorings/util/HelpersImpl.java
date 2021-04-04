/**
 */
package org.gravity.refactorings.util;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Helpers</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.refactorings.util.HelpersImpl#getTypeGraph <em>Type
 * Graph</em>}</li>
 * <li>{@link org.gravity.refactorings.util.HelpersImpl#getSearch
 * <em>Search</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class HelpersImpl {

	private static final Logger LOGGER = Logger.getLogger(HelpersImpl.class.getName());

	private HelpersImpl() {
		// This class shouldn't be instantiated
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @throws RefactoringFailedException
	 *
	 * @generated
	 */
	public static boolean mountAccesses(final TClass child, final TClass parent, final TSignature tSignature)
			throws RefactoringFailedException {

		if (tSignature instanceof TFieldSignature) {
			return mountAccesses(child, parent, (TFieldSignature) tSignature);
		} else if (tSignature instanceof TMethodSignature) {
			return mountAccesses(child, parent, (TMethodSignature) tSignature);
		}
		return false;

	}

	private static boolean mountAccesses(final TClass child, final TClass parent, final TMethodSignature tMethodSignature)
			throws RefactoringFailedException {
		for (final TMember tMethodDefinition : child.getDefines()) {
			if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
				for (final TAccess tMethodAccess : tMethodDefinition.getAccessedBy()) {
					final TMethodDefinition tMethodParentDefinition = tMethodSignature.getTDefinition(parent);
					if (tMethodParentDefinition == null) {
						throw new RefactoringFailedException(
								"Pattern matching failed." + " Variables: " + "[parent] = " + parent + ", "
										+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tMethodAccess] = "
										+ tMethodAccess + ", " + "[tMethodDefinition] = " + tMethodDefinition + ".");
					}
					tMethodDefinition.getAccessedBy().remove(tMethodAccess);
					tMethodParentDefinition.getAccessedBy().add(tMethodAccess);

				}
			}
		}
		for (final TMember tMethodDefinition : child.getDefines()) {
			if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
				for (TAccess tMethodAccess : tMethodDefinition.getAccessing()) {
					final TMember tMethodAccessTarget = tMethodAccess.getTarget();
					if (!tMethodAccessTarget.equals(tMethodDefinition)) {

						if (tMethodAccessTarget.getAccessedBy().contains(tMethodAccess)) {
							tMethodAccessTarget.getAccessedBy().remove(tMethodAccess);
							EcoreUtil.delete(tMethodAccess);
							tMethodAccess = null;
						} else {
							throw new RefactoringFailedException(
									"Pattern matching failed." + " Variables: " + "[tMethodAccess] = " + tMethodAccess
									+ ", " + "[tMethodAccessTarget] = " + tMethodAccessTarget + ".");
						}

					}
				}
			}
		}

		final TMethodDefinition tMethodDefinition = tMethodSignature.getTDefinition(child);
		if (tMethodDefinition == null) {
			throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[child] = " + child
					+ ", " + "[tMethodSignature] = " + tMethodSignature + ".");
		}
		child.getSignature().remove(tMethodSignature);
		tMethodDefinition.setDefinedBy(null);
		tMethodSignature.getDefinitions().remove(tMethodDefinition);

		EcoreUtil.delete(tMethodDefinition);

		return true;
	}

	private static boolean mountAccesses(final TClass child, final TClass parent, final TFieldSignature tFieldSignature)
			throws RefactoringFailedException {
		for (final TMember tmpTFieldDefinition : child.getDefines()) {
			if ((tmpTFieldDefinition instanceof TFieldDefinition)
					&& tFieldSignature.getDefinitions().contains(tmpTFieldDefinition)) {
				for (final TAccess tFieldAccess : tmpTFieldDefinition.getAccessedBy()) {
					TFieldDefinition tFieldParentDefinition = null;
					if (tmpTFieldDefinition.getAccessedBy().contains(tFieldAccess)) {
						for (final TMember tmpTFieldParentDefinition : parent.getDefines()) {
							if ((tmpTFieldParentDefinition instanceof TFieldDefinition)
									&& !tmpTFieldDefinition.equals(tmpTFieldParentDefinition)
									&& tFieldSignature.getDefinitions().contains(tmpTFieldParentDefinition)) {
								tFieldParentDefinition = (TFieldDefinition) tmpTFieldParentDefinition;

							}
						}
					}
					if (tFieldParentDefinition == null) {
						throw new RefactoringFailedException(
								"Pattern matching failed." + " Variables: " + "[tFieldAccess] = " + tFieldAccess + ", "
										+ "[tFieldDefinition] = " + tmpTFieldDefinition + ", " + "[parent] = " + parent
										+ ", " + "[tFieldSignature] = " + tFieldSignature + ".");
					}
					tmpTFieldDefinition.getAccessedBy().remove(tFieldAccess);
					tFieldParentDefinition.getAccessedBy().add(tFieldAccess);

				}

			}
		}

		for (final TMember tmpTFieldDefinition : child.getDefines()) {
			if ((tmpTFieldDefinition instanceof TFieldDefinition)
					&& tFieldSignature.getDefinitions().contains(tmpTFieldDefinition)) {
				for (final TAccess tFieldAccess : tmpTFieldDefinition.getAccessing()) {
					final TMember tFieldAccessTarget = tFieldAccess.getTarget();
					if (!tFieldAccessTarget.equals(tmpTFieldDefinition)) {
						tFieldAccessTarget.getAccessedBy().remove(tFieldAccess);
						EcoreUtil.delete(tFieldAccess);
					}
				}
			}
		}

		TFieldDefinition tFieldDefinition = null;
		if (child.getSignature().contains(tFieldSignature)) {
			for (final TMember tmpTFieldDefinition : child.getDefines()) {
				if (tmpTFieldDefinition instanceof TFieldDefinition) {
					final TFieldDefinition tFieldDefinitionCandidate = (TFieldDefinition) tmpTFieldDefinition;
					if (tFieldSignature.getDefinitions().contains(tFieldDefinitionCandidate)) {
						tFieldDefinition = tFieldDefinitionCandidate;
					}
				}
			}
		}
		if (tFieldDefinition == null) {
			throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[child] = " + child
					+ ", " + "[tFieldSignature] = " + tFieldSignature + ".");
		}
		child.getSignature().remove(tFieldSignature);
		tFieldDefinition.setDefinedBy(null);
		tFieldSignature.getDefinitions().remove(tFieldDefinition);
		EcoreUtil.delete(tFieldDefinition);

		return true;
	}

	/**
	 * Searches the implementation of the signature which has the highest cohesion
	 * and lowest coupling
	 *
	 * @param tMemberPool The pool of classes containing implementations of the
	 *                    signature
	 * @param signature   The signature for which an implementation should be
	 *                    searched
	 * @return The best implementation within the pool
	 */
	public static TMember getBestTMember(final List<TClass> tMemberPool, final TSignature signature) {
		TMember returnMember = null;
		int bestTMemberWeight = Integer.MIN_VALUE;
		for (final TClass tClass : tMemberPool) {
			final TMember tMemberOfClass = signature.getTDefinition(tClass);
			if (tMemberOfClass == null) {
				continue;
			}

			final int internalAccesses = getInternalAccesses(tClass, tMemberOfClass);
			final int externalAccesses = getExternalAcesses(tClass, tMemberOfClass);
			final int tWeightMember = internalAccesses - externalAccesses;
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("GetBestTMember: class=" + tClass.getTName() + " i=" + internalAccesses + "; e="
						+ externalAccesses + "; tWeight=" + tWeightMember);
			}

			if (tWeightMember > bestTMemberWeight) {
				bestTMemberWeight = tWeightMember;
				returnMember = tMemberOfClass;
			}
		}
		if (returnMember == null) {
			throw new IllegalStateException(
					"No implementation of the signature \"" + signature.getSignatureString() + "\" found");
		}

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Best-GetBestTMember: tWeight=" + bestTMemberWeight + "; tMember="
					+ returnMember.getSignatureString());
		}

		return returnMember;

	}

	/**
	 * Counts the amount of accesses to different members within of the given class
	 *
	 * @param type   The class to whose members accesses should be counted
	 * @param member The member with outgoing accesses
	 * @return the amount of accesses
	 */
	private static int getInternalAccesses(final TClass type, final TMember member) {
		int internalAccesses = 0;
		for (final TAccess tAccess : member.getAccessing()) {
			final TMember accessedTMember = tAccess.getTarget();
			if ((accessedTMember != null) && !accessedTMember.equals(member)
					&& (type.hasTMember(accessedTMember) || type.hasAParentThisTMember(accessedTMember))) {
				internalAccesses++;
			}
		}
		return internalAccesses;
	}

	/**
	 * Counts the amount of accesses to different members outside of the given class
	 *
	 * @param type   The class to which accesses should be excluded
	 * @param member The member with outgoing accesses
	 * @return the amount of accesses
	 */
	private static int getExternalAcesses(final TClass type, final TMember member) {
		int externalAccesses = 0;
		for (final TMember accessedTMember : HelpersImpl.getAccessedMembers(member)) {
			if (!type.hasTMember(accessedTMember) && !type.hasAParentThisTMember(accessedTMember)) {
				externalAccesses++;
			}
		}
		return externalAccesses;
	}

	private static Iterable<TMember> getAccessedMembers(final TMember tMember) {
		final LinkedList<TMember> result = new LinkedList<>();
		for (final TAccess tAccess : tMember.getAccessing()) {
			final TMember accessedTMember = tAccess.getTarget();
			if ((accessedTMember != null) && !accessedTMember.equals(tMember)) {
				result.add(accessedTMember);
			}
		}
		return result;
	}
} // HelpersImpl
