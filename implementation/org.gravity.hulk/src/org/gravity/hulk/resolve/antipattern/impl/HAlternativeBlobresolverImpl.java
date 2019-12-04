/**
 */
package org.gravity.hulk.resolve.antipattern.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
// <-- [user defined imports]
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

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
import org.gravity.typegraph.basic.TConstructorDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.containers.ContainersFactory;
import org.gravity.typegraph.basic.containers.TMemberContainer;

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
	public boolean detect(HAntiPatternGraph apg) {

		final HAntiPatternGraph newApg = init(apg);
		if (newApg == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[apg] = " + apg + ".");
		}

		// ForEach
		for (final Object[] result3_black : HAlternativeBlobresolverImpl
				.pattern_HAlternativeBlobresolver_0_3_ActivityNode32_blackBFFB(newApg, this)) {
			final HBlobAntiPattern hBlob = (HBlobAntiPattern) result3_black[1];
			final TClass tClass = (TClass) result3_black[2];
			final Object[] result3_green = HAlternativeBlobresolverImpl
					.pattern_HAlternativeBlobresolver_0_3_ActivityNode32_greenBBBBF(newApg, hBlob, tClass, this);
			final HBlobResolveAnnotation hResolve = (HBlobResolveAnnotation) result3_green[4];

			//
			if (HAlternativeBlobresolverImpl.pattern_HAlternativeBlobresolver_0_4_ActivityNode34_expressionFBB(this,
					tClass)) {
				// ForEach
				for (final Object[] result5_black : HAlternativeBlobresolverImpl
						.pattern_HAlternativeBlobresolver_0_5_ActivityNode35_blackBF(tClass)) {
					final HInBlobClusterAccess hCluster = (HInBlobClusterAccess) result5_black[1];
					//
					HAlternativeBlobresolverImpl.pattern_HAlternativeBlobresolver_0_6_ActivityNode37_expressionFBBBB(
							this, hCluster, tClass, hResolve);

				}

			} else {
			}

		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean process(HInBlobClusterAccess hCluster, TClass tClass, HBlobResolveAnnotation hParent) {
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
			if (member instanceof TConstructorDefinition) {
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
		if (coupling.size() == 0) {
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

		final TMemberContainer tContainer = ContainersFactory.eINSTANCE.createTMemberContainer();
		tContainer.getTMembers().addAll(tMembers);

		final Set<HMoveMembers> possibleMoves = new HashSet<>();
		for (final TClass tDataClass : coupling.keySet()) {
			final HMoveMembers hMoveMembers = createMove(tContainer, tClass, tDataClass, hParent);
			if (hMoveMembers != null) {
				for (final HMoveMember hMove : hMoveMembers.getHMoveMembers()) {
					final TMember member = (TMember) hMove.getTAnnotated();

				}
				hMoveMembers.setValue(internalCoupling - coupling.get(tDataClass));
				possibleMoves.add(hMoveMembers);
			}
		}
		if (possibleMoves.size() == 0) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AntipatternPackage.HALTERNATIVE_BLOBRESOLVER___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		case AntipatternPackage.HALTERNATIVE_BLOBRESOLVER___PROCESS__HINBLOBCLUSTERACCESS_TCLASS_HBLOBRESOLVEANNOTATION:
			return process((HInBlobClusterAccess) arguments.get(0), (TClass) arguments.get(1),
					(HBlobResolveAnnotation) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Iterable<Object[]> pattern_HAlternativeBlobresolver_0_3_ActivityNode32_blackBFFB(
			HAntiPatternGraph newApg, HAlternativeBlobresolver _this) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		for (final HAnnotation tmpHBlob : newApg.getHAnnotations()) {
			if (tmpHBlob instanceof HBlobAntiPattern) {
				final HBlobAntiPattern hBlob = (HBlobAntiPattern) tmpHBlob;
				final TAnnotatable tmpTClass = hBlob.getTAnnotated();
				if (tmpTClass instanceof TClass) {
					final TClass tClass = (TClass) tmpTClass;
					_result.add(new Object[] { newApg, hBlob, tClass, _this });
				}

			}
		}
		return _result;
	}

	public static final Object[] pattern_HAlternativeBlobresolver_0_3_ActivityNode32_greenBBBBF(
			HAntiPatternGraph newApg, HBlobAntiPattern hBlob, TClass tClass, HAlternativeBlobresolver _this) {
		final HBlobResolveAnnotation hResolve = RefactoringgraphFactory.eINSTANCE.createHBlobResolveAnnotation();
		hBlob.getPartOf().add(hResolve);
		_this.getHAnnotation().add(hResolve);
		hResolve.setHBlobAntiPattern(hBlob);
		hResolve.setTAnnotated(tClass);
		newApg.getHAnnotations().add(hResolve);
		return new Object[] { newApg, hBlob, tClass, _this, hResolve };
	}

	public static final boolean pattern_HAlternativeBlobresolver_0_4_ActivityNode34_expressionFBB(
			HAlternativeBlobresolver _this, TClass tClass) {
		final boolean _localVariable_0 = _this.allowedToTouch(tClass);
		final boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_HAlternativeBlobresolver_0_5_ActivityNode35_blackBF(TClass tClass) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		for (final TAnnotation tmpHCluster : tClass.getTAnnotation()) {
			if (tmpHCluster instanceof HInBlobClusterAccess) {
				final HInBlobClusterAccess hCluster = (HInBlobClusterAccess) tmpHCluster;
				_result.add(new Object[] { tClass, hCluster });
			}
		}
		return _result;
	}

	public static final boolean pattern_HAlternativeBlobresolver_0_6_ActivityNode37_expressionFBBBB(
			HAlternativeBlobresolver _this, HInBlobClusterAccess hCluster, TClass tClass,
			HBlobResolveAnnotation hResolve) {
		final boolean _localVariable_0 = _this.process(hCluster, tClass, hResolve);
		final boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Alternative " + super.getGuiName();
	}

	// [user code injected with eMoflon] -->
} // HAlternativeBlobresolverImpl
