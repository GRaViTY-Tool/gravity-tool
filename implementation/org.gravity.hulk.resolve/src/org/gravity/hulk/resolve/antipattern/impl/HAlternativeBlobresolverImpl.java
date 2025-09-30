/**
 */
package org.gravity.hulk.resolve.antipattern.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
// <-- [user defined imports]
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation;
import org.gravity.hulk.refactoringgraph.HCluster;
import org.gravity.hulk.refactoringgraph.HInBlobClusterAccess;
import org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMember;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers;
import org.gravity.hulk.resolve.antipattern.HAlternativeBlobresolver;
import org.gravity.hulk.resolve.calculators.HClusterAccessCalculator;
import org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TConstructor;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HAlternative Blobresolver</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAlternativeBlobresolverImpl extends HBlobResolverImpl implements HAlternativeBlobresolver {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HAlternativeBlobresolverImpl(final DFSGraph graph,
			final HClusterAccessCalculator hCluster, final HMethodToDataClassAccessCalculator m2dc) {
		final var m2dcEdge = DfsFactory.eINSTANCE.createEdge();
		final var clusterEdge = DfsFactory.eINSTANCE.createEdge();
		clusterEdge.setGraph(graph);
		hCluster.getIncoming().add(clusterEdge);
		this.getOutgoing().add(clusterEdge);
		this.setGraph(graph);
		m2dc.getIncoming().add(m2dcEdge);
		this.getOutgoing().add(m2dcEdge);
		m2dcEdge.setGraph(graph);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {

		final var newApg = this.init(apg);
		if (newApg == null) {
			throw new IllegalStateException("Couldn't initialize anti-pattern graph!");
		}

		// ForEach
		for (final HAnnotation annotation : newApg.getHAnnotations()) {
			if (annotation instanceof HBlobAntiPattern) {
				this.resolve(newApg, (HBlobAntiPattern) annotation);
			}
		}
		return true;
	}

	/**
	 * Tries to resolve the blob anti-pattern
	 *
	 * @param apg  The anti-pattern graph
	 * @param blob The blob anti-pattern
	 */
	private void resolve(final HAntiPatternGraph apg, final HBlobAntiPattern blob) {
		final var tClass = (TClass) blob.getTAnnotated();
		final var hResolve = this.createBlobResolveAnnotation(apg, blob, tClass);

		//
		if (this.allowedToTouch(tClass)) {
			// ForEach
			for (final TAnnotation tmpHCluster : tClass.getTAnnotation()) {
				if (tmpHCluster instanceof final HInBlobClusterAccess hCluster) {
					this.process(hCluster, tClass, hResolve);
				}
			}

		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean process(final HInBlobClusterAccess hCluster, final TClass tClass,
			final HBlobResolveAnnotation hParent) {
		final var tMembers = hCluster.getHCluster().getTMembers();
		for (final TMember member : tMembers) {
			if (!this.allowedToTouch(member) || (member instanceof final TMethodDefinition definition
					&& TConstructor.isConstructor(definition))) {
				return false;
			}
		}

		// Keep the biggest cluster in the class
		final var size = hCluster.getHCluster().getTMembers().size();
		final SortedSet<Integer> sizes = new TreeSet<>();
		for (final TAnnotation tAnnotation : tClass.getTAnnotation()) {
			if (tAnnotation instanceof final HCluster otherCluster) {
				sizes.add(otherCluster.getTMembers().size());
			}
		}
		if (sizes.headSet(size).size() > 0.7 * sizes.size()) {
			return false;
		}

		final var dataClassCoupling = 0;
		final var internalCoupling = (int) hCluster.getValue();

		final var coupling = new HashMap<TClass, Integer>();
		for (final TMember member : tMembers) {

			// Search DataClass with max coupling
			for (final TAnnotation tAnnotations : member.getTAnnotation()) {
				if (tAnnotations instanceof final HMethodToDataClassAccess m2dc) {
					var value = (int) m2dc.getValue();
					final var key = m2dc.getHDataClass();
					if (coupling.containsKey(key)) {
						value += coupling.get(key);
					}
					coupling.put(key, value);
				}
			}
		}
		if (coupling.isEmpty()) {
			// if (!lowCohesion || tMembers.size() <= 2) {
			// return false;
			// }
			// HExtractClass extract = RefactoringsFactory.eINSTANCE.createHExtractClass();
			// extract.getTMembers().addAll(tMembers);
			// if (!isRefactoringPossible(extract)) {
			// return false;
			// }
			//
			// hParent.getHRefactorings().add(extract);
			// tClass.getTAnnotation().add(extract);
			// extract.setTAnnotated(tClass);
			// extract.setValue(internalCoupling + 1);
			return true;
		}

		final EList<TMember> tContainer = new BasicEList<>();
		tContainer.addAll(tMembers);

		final Set<HMoveMembers> possibleMoves = new HashSet<>();
		for (final Entry<TClass, Integer> entry : coupling.entrySet()) {
			final var tDataClass = entry.getKey();
			final var hMoveMembers = this.createMove(tContainer, tClass, tDataClass, hParent);
			if (hMoveMembers != null) {
				for (final HMoveMember hMove : hMoveMembers.getHMoveMembers()) {
					final var member = (TMember) hMove.getTAnnotated();

				}
				hMoveMembers.setValue(internalCoupling - (double) entry.getValue());
				possibleMoves.add(hMoveMembers);
			}
		}
		if (possibleMoves.isEmpty()) {
			// if (!lowCohesion || tMembers.size() <= 2) {
			// return false;
			// }
			// HExtractClass extract = RefactoringsFactory.eINSTANCE.createHExtractClass();
			// extract.getTMembers().addAll(tMembers);
			// if (isRefactoringPossible(extract)) {
			// hParent.getHRefactorings().add(extract);
			// extract.getPartOf().add(hParent);
			// extract.setValue(internalCoupling + 1);
			// return true;
			// }
		}
		return true;
	}

	public final HBlobResolveAnnotation createBlobResolveAnnotation(final HAntiPatternGraph newApg,
			final HBlobAntiPattern hBlob, final TClass tClass) {
		final var hResolve = RefactoringgraphFactory.eINSTANCE.createHBlobResolveAnnotation();
		hBlob.getPartOf().add(hResolve);
		this.getHAnnotation().add(hResolve);
		hResolve.setHBlobAntiPattern(hBlob);
		hResolve.setTAnnotated(tClass);
		newApg.getHAnnotations().add(hResolve);
		return hResolve;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Alternative " + super.getGuiName();
	}

	// [user code injected with eMoflon] -->
} // HAlternativeBlobresolverImpl