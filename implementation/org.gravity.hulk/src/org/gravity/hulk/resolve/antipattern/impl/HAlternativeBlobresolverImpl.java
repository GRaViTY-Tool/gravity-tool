/**
 */
package org.gravity.hulk.resolve.antipattern.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
// <-- [user defined imports]
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
import org.gravity.hulk.resolve.antipattern.AntipatternPackage;
import org.gravity.hulk.resolve.antipattern.HAlternativeBlobresolver;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TConstructor;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.annotations.TAnnotation;

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
	protected HAlternativeBlobresolverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HALTERNATIVE_BLOBRESOLVER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {

		final HAntiPatternGraph newApg = init(apg);
		if (newApg == null) {
			throw new IllegalStateException("Couldn't initialize anti-pattern graph!");
		}

		// ForEach
		for (final HAnnotation annotation : newApg.getHAnnotations()) {
			if (annotation instanceof HBlobAntiPattern) {
				resolve(newApg, (HBlobAntiPattern) annotation);
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
		final TClass tClass = (TClass) blob.getTAnnotated();
		final HBlobResolveAnnotation hResolve = createBlobResolveAnnotation(apg, blob, tClass);

		//
		if (allowedToTouch(tClass)) {
			// ForEach
			for (final TAnnotation tmpHCluster : tClass.getTAnnotation()) {
				if (tmpHCluster instanceof HInBlobClusterAccess) {
					final HInBlobClusterAccess hCluster = (HInBlobClusterAccess) tmpHCluster;
					process(hCluster, tClass, hResolve);
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
		// [user code injected with eMoflon]

		// HRelativeValue relativeAmount = hCluster.getRelativeAmount();
		// HRelativeValueConstants hRelativeValue = relativeAmount.getValue();
		// boolean lowCohesion = hRelativeValue == HRelativeValueConstants.VERY_LOW
		// || hRelativeValue == HRelativeValueConstants.LOW || hRelativeValue ==
		// HRelativeValueConstants.MEDIUM;

		final EList<TMember> tMembers = hCluster.getHCluster().getTMembers();
		for (final TMember member : tMembers) {
			if (!allowedToTouch(member)) {
				return false;
			}
			if (member instanceof TMethodDefinition && TConstructor.isConstructor((TMethodDefinition) member)) {
				return false;
			}
		}

		// Keep the biggest cluster in the class
		final int size = hCluster.getHCluster().getTMembers().size();
		final SortedSet<Integer> sizes = new TreeSet<>();
		for (final TAnnotation tAnnotation : tClass.getTAnnotation()) {
			if (tAnnotation instanceof HCluster) {
				final HCluster otherCluster = (HCluster) tAnnotation;
				sizes.add(otherCluster.getTMembers().size());
			}
		}
		if (sizes.headSet(size).size() > 0.7 * sizes.size()) {
			return false;
		}

		final int dataClassCoupling = 0;
		final int internalCoupling = (int) hCluster.getValue();

		final HashMap<TClass, Integer> coupling = new HashMap<>();
		for (final TMember member : tMembers) {

			// Search DataClass with max coupling
			for (final TAnnotation tAnnotations : member.getTAnnotation()) {
				if (tAnnotations instanceof HMethodToDataClassAccess) {
					final HMethodToDataClassAccess m2dc = (HMethodToDataClassAccess) tAnnotations;
					int value = (int) m2dc.getValue();
					final TClass key = m2dc.getHDataClass();
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
			final TClass tDataClass = entry.getKey();
			final HMoveMembers hMoveMembers = createMove(tContainer, tClass, tDataClass, hParent);
			if (hMoveMembers != null) {
				for (final HMoveMember hMove : hMoveMembers.getHMoveMembers()) {
					final TMember member = (TMember) hMove.getTAnnotated();

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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AntipatternPackage.HALTERNATIVE_BLOBRESOLVER___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		case AntipatternPackage.HALTERNATIVE_BLOBRESOLVER___PROCESS__HINBLOBCLUSTERACCESS_TCLASS_HBLOBRESOLVEANNOTATION:
			return process((HInBlobClusterAccess) arguments.get(0), (TClass) arguments.get(1),
					(HBlobResolveAnnotation) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public final HBlobResolveAnnotation createBlobResolveAnnotation(final HAntiPatternGraph newApg,
			final HBlobAntiPattern hBlob, final TClass tClass) {
		final HBlobResolveAnnotation hResolve = RefactoringgraphFactory.eINSTANCE.createHBlobResolveAnnotation();
		hBlob.getPartOf().add(hResolve);
		getHAnnotation().add(hResolve);
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
