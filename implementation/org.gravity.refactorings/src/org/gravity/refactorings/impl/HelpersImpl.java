/**
 */
package org.gravity.refactorings.impl;

import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Level;
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
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Helpers</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.refactorings.impl.HelpersImpl#getTypeGraph <em>Type
 * Graph</em>}</li>
 * <li>{@link org.gravity.refactorings.impl.HelpersImpl#getSearch
 * <em>Search</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HelpersImpl {
	
	private static final Logger LOGGER = Logger.getLogger(HelpersImpl.class.getName());
	
	/**
	 * The cached value of the '{@link #getTypeGraph() <em>Type Graph</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypeGraph()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph typeGraph;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TypeGraph getTypeGraph() {
		return typeGraph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTypeGraph(TypeGraph newTypeGraph) {
		typeGraph = newTypeGraph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws RefactoringFailedException 
	 * 
	 * @generated
	 */
	public boolean mountAccesses(TClass child, TClass parent, TSignature tSignature) throws RefactoringFailedException {

		if (tSignature instanceof TFieldSignature) {
			return mountAccesses(child, parent, (TFieldSignature) tSignature);
		} else if (tSignature instanceof TMethodSignature) {
			return mountAccesses(child, parent, (TMethodSignature) tSignature);
		}
		return false;

	}

	public boolean mountAccesses(TClass child, TClass parent, TMethodSignature tMethodSignature) throws RefactoringFailedException {
		for (TMember tMethodDefinition : child.getDefines()) {
			if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
				for (TAccess tMethodAccess : tMethodDefinition.getAccessedBy()) {
					TMethodDefinition tMethodParentDefinition = getMethodDefinition(parent, tMethodSignature);
					if (tMethodParentDefinition == null) {
						throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[parent] = " + parent
								+ ", " + "[tMethodSignature] = " + tMethodSignature + ", " + "[tMethodAccess] = "
								+ tMethodAccess + ", " + "[tMethodDefinition] = " + tMethodDefinition + ".");
					}
					tMethodDefinition.getAccessedBy().remove(tMethodAccess);
					tMethodParentDefinition.getAccessedBy().add(tMethodAccess);

				}
			}
		}
		for (TMember tMethodDefinition : child.getDefines()) {
			if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
				for (TAccess tMethodAccess : tMethodDefinition.getTAccessing()) {
					TMember tMethodAccessTarget = tMethodAccess.getTTarget();
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

		TMethodDefinition tMethodDefinition = HelpersImpl.getMethodDefinition(child, tMethodSignature);
		if (tMethodDefinition == null) {
			throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[child] = " + child + ", "
					+ "[tMethodSignature] = " + tMethodSignature + ".");
		}
		child.getSignature().remove(tMethodSignature);
		tMethodDefinition.setDefinedBy(null);
		tMethodSignature.getDefinitions().remove(tMethodDefinition);

		EcoreUtil.delete(tMethodDefinition);
		tMethodDefinition = null;

		return true;
	}

	public boolean mountAccesses(TClass child, TClass parent, TFieldSignature tFieldSignature) throws RefactoringFailedException {
		for (TMember tmpTFieldDefinition : child.getDefines()) {
			if (tmpTFieldDefinition instanceof TFieldDefinition) {
				if (tFieldSignature.getDefinitions().contains(tmpTFieldDefinition)) {
					for (TAccess tFieldAccess : tmpTFieldDefinition.getAccessedBy()) {
						TFieldDefinition tFieldParentDefinition = null;
						if (tmpTFieldDefinition.getAccessedBy().contains(tFieldAccess)) {
							for (TMember tmpTFieldParentDefinition : parent.getDefines()) {
								if (tmpTFieldParentDefinition instanceof TFieldDefinition) {
									if (!tmpTFieldDefinition.equals(tmpTFieldParentDefinition)) {
										if (tFieldSignature.getDefinitions().contains(tmpTFieldParentDefinition)) {
											tFieldParentDefinition = (TFieldDefinition) tmpTFieldParentDefinition;
										}
									}
								}
							}
						}
						if (tFieldParentDefinition == null) {
							throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[tFieldAccess] = "
									+ tFieldAccess + ", " + "[tFieldDefinition] = " + tmpTFieldDefinition + ", "
									+ "[parent] = " + parent + ", " + "[tFieldSignature] = " + tFieldSignature + ".");
						}
						tmpTFieldDefinition.getAccessedBy().remove(tFieldAccess);
						tFieldParentDefinition.getAccessedBy().add(tFieldAccess);

					}
				}
			}
		}

		for (TMember tmpTFieldDefinition : child.getDefines()) {
			if (tmpTFieldDefinition instanceof TFieldDefinition) {
				if (tFieldSignature.getDefinitions().contains(tmpTFieldDefinition)) {
					for (TAccess tFieldAccess : tmpTFieldDefinition.getTAccessing()) {
						TMember tFieldAccessTarget = tFieldAccess.getTTarget();
						if (!tFieldAccessTarget.equals(tmpTFieldDefinition)) {
							tFieldAccessTarget.getAccessedBy().remove(tFieldAccess);
							EcoreUtil.delete(tFieldAccess);
							tFieldAccess = null;
						}
					}
				}
			}
		}

		TFieldDefinition tFieldDefinition = null;
		if (child.getSignature().contains(tFieldSignature)) {
			for (TMember tmpTFieldDefinition : child.getDefines()) {
				if (tmpTFieldDefinition instanceof TFieldDefinition) {
					TFieldDefinition tFieldDefinitionCandidate = (TFieldDefinition) tmpTFieldDefinition;
					if (tFieldSignature.getDefinitions().contains(tFieldDefinitionCandidate)) {
						tFieldDefinition = tFieldDefinitionCandidate;
					}
				}
			}
		}
		if (tFieldDefinition == null) {
			throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[child] = " + child + ", "
					+ "[tFieldSignature] = " + tFieldSignature + ".");
		}
		child.getSignature().remove(tFieldSignature);
		tFieldDefinition.setDefinedBy(null);
		tFieldSignature.getDefinitions().remove(tFieldDefinition);
		EcoreUtil.delete(tFieldDefinition);
		tFieldDefinition = null;

		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TMember getBestTMember(List<TClass> tMemberPool, TSignature signature) {
		TMember returnMember = null;
		int bestTMemberWeight = Integer.MIN_VALUE;

		for (TClass tClass : tMemberPool) {

			TMember tMemberOfClass = signature.getTDefinition(tClass);

			int internalAccesses = 0;
			for (TAccess tAccess : tMemberOfClass.getTAccessing()) {
				TMember accessedTMember = tAccess.getTTarget();
				if (accessedTMember != null && !accessedTMember.equals(tMemberOfClass)) {
					if (tClass.hasTMember(accessedTMember)
							|| tClass.hasAParentThisTMember(accessedTMember)) {
						internalAccesses++;
					}
				}
			}

			int externalAccesses = 0;
			for (TMember accessedTMember : HelpersImpl.getAccessedMembers(tMemberOfClass)) {
				if (!tClass.hasTMember(accessedTMember) && !tClass.hasAParentThisTMember(accessedTMember)) {
					externalAccesses++;
				}

			}

			int tWeightMember = internalAccesses - externalAccesses;

			LOGGER.log( Level.INFO, "GetBestTMember: class=" + tClass.getTName() + " i=" + internalAccesses + "; e="
					+ externalAccesses + "; tWeight=" + tWeightMember);

			if (tWeightMember > bestTMemberWeight) {
				bestTMemberWeight = tWeightMember;
				returnMember = tMemberOfClass;
			}
		}

		LOGGER.log( Level.INFO, 
				"Best-GetBestTMember: tWeight=" + bestTMemberWeight + "; tMember=" + returnMember.getSignatureString());

		return returnMember;

	}

	public static final TMethodDefinition getMethodDefinition(TClass child, TMethodSignature tMethodSignature) {
		if (child.getSignature().contains(tMethodSignature)) {
			for (TMember tmpTMethodDefinition : child.getDefines()) {
				if (tmpTMethodDefinition instanceof TMethodDefinition) {
					TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
					if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
						return tMethodDefinition;
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<TMember> getAccessedMembers(TMember tMember) {
		LinkedList<TMember> result = new LinkedList<TMember>();
		for (TAccess tAccess : tMember.getTAccessing()) {
			TMember accessedTMember = tAccess.getTTarget();
			if (accessedTMember != null) {
				if (!accessedTMember.equals(tMember)) {
					result.add(accessedTMember);
				}
			}
		}
		return result;
	}
} // HelpersImpl
