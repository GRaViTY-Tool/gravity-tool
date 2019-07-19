/**
 */
package org.gravity.hulk.resolve.antipattern.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;

import org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation;

import org.gravity.hulk.resolve.antipattern.AntipatternPackage;
import org.gravity.hulk.resolve.antipattern.HAlternativeBlobresolver;

import org.gravity.typegraph.basic.TClass;

import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.HashMap;
import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.refactoringgraph.HCluster;
import org.gravity.hulk.refactoringgraph.HInBlobAccess;
import org.gravity.hulk.refactoringgraph.HInBlobClusterAccess;
import org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TConstructorDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.containers.ContainersFactory;
import org.gravity.typegraph.basic.containers.TMemberContainer;
import org.gravity.hulk.refactoringgraph.refactorings.HExtractClass;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMember;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers;
import org.gravity.hulk.refactoringgraph.refactorings.RefactoringsFactory;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAlternative Blobresolver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAlternativeBlobresolverImpl extends HBlobResolverImpl implements HAlternativeBlobresolver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAlternativeBlobresolverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HALTERNATIVE_BLOBRESOLVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph apg) {

		Object[] result1_black = HAlternativeBlobresolverImpl
				.pattern_HAlternativeBlobresolver_0_1_ActivityNode30_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}

		Object[] result2_bindingAndBlack = HAlternativeBlobresolverImpl
				.pattern_HAlternativeBlobresolver_0_2_ActivityNode31_bindingAndBlackFBB(this, apg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[apg] = " + apg + ".");
		}
		HAntiPatternGraph newApg = (HAntiPatternGraph) result2_bindingAndBlack[0];
		// ForEach 
		for (Object[] result3_black : HAlternativeBlobresolverImpl
				.pattern_HAlternativeBlobresolver_0_3_ActivityNode32_blackBFFB(newApg, this)) {
			HBlobAntiPattern hBlob = (HBlobAntiPattern) result3_black[1];
			TClass tClass = (TClass) result3_black[2];
			Object[] result3_green = HAlternativeBlobresolverImpl
					.pattern_HAlternativeBlobresolver_0_3_ActivityNode32_greenBBBBF(newApg, hBlob, tClass, this);
			HBlobResolveAnnotation hResolve = (HBlobResolveAnnotation) result3_green[4];

			// 
			if (HAlternativeBlobresolverImpl.pattern_HAlternativeBlobresolver_0_4_ActivityNode34_expressionFBB(this,
					tClass)) {
				// ForEach 
				for (Object[] result5_black : HAlternativeBlobresolverImpl
						.pattern_HAlternativeBlobresolver_0_5_ActivityNode35_blackBF(tClass)) {
					HInBlobClusterAccess hCluster = (HInBlobClusterAccess) result5_black[1];
					// 
					HAlternativeBlobresolverImpl.pattern_HAlternativeBlobresolver_0_6_ActivityNode37_expressionFBBBB(
							this, hCluster, tClass, hResolve);

				}

			} else {
			}

		}
		return HAlternativeBlobresolverImpl.pattern_HAlternativeBlobresolver_0_7_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean process(HInBlobClusterAccess hCluster, TClass tClass, HBlobResolveAnnotation hParent) {
		// [user code injected with eMoflon]

		//		HRelativeValue relativeAmount = hCluster.getRelativeAmount();
		//		HRelativeValueConstants hRelativeValue = relativeAmount.getValue();
		//		boolean lowCohesion = hRelativeValue == HRelativeValueConstants.VERY_LOW
		//				|| hRelativeValue == HRelativeValueConstants.LOW || hRelativeValue == HRelativeValueConstants.MEDIUM;

		EList<TMember> tMembers = hCluster.getHCluster().getTMembers();
		for (TMember member : tMembers) {
			if (!allowedToTouch(member)) {
				return false;
			}
			if (member instanceof TConstructorDefinition) {
				return false;
			}
		}

		// Keep the biggest cluster in the class
		int size = hCluster.getHCluster().getTMembers().size();
		SortedSet<Integer> sizes = new TreeSet<>();
		for (TAnnotation tAnnotation : tClass.getTAnnotation()) {
			if (tAnnotation instanceof HCluster) {
				HCluster otherCluster = (HCluster) tAnnotation;
				sizes.add(otherCluster.getTMembers().size());
			}
		}
		if (sizes.headSet(size).size() > 0.7 * sizes.size()) {
			return false;
		}

		int dataClassCoupling = 0;
		int internalCoupling = (int) hCluster.getValue();

		HashMap<TClass, Integer> coupling = new HashMap<>();
		for (TMember member : tMembers) {

			// Search DataClass with max coupling
			for (TAnnotation tAnnotations : member.getTAnnotation()) {
				if (tAnnotations instanceof HMethodToDataClassAccess) {
					HMethodToDataClassAccess m2dc = (HMethodToDataClassAccess) tAnnotations;
					int value = (int) m2dc.getValue();
					TClass key = m2dc.getHDataClass();
					if (coupling.containsKey(key)) {
						value += coupling.get(key);
					}
					coupling.put(key, value);
				}
			}
		}
		if (coupling.size() == 0) {
			//			if (!lowCohesion || tMembers.size() <= 2) {
			//				return false;
			//			}
			//			HExtractClass extract = RefactoringsFactory.eINSTANCE.createHExtractClass();
			//			extract.getTMembers().addAll(tMembers);
			//			if (!isRefactoringPossible(extract)) {
			//				return false;
			//			}
			//
			//			hParent.getHRefactorings().add(extract);
			//			tClass.getTAnnotation().add(extract);
			//			extract.setTAnnotated(tClass);
			//			extract.setValue(internalCoupling + 1);
			return true;
		}

		TMemberContainer tContainer = ContainersFactory.eINSTANCE.createTMemberContainer();
		tContainer.getTMembers().addAll(tMembers);

		Set<HMoveMembers> possibleMoves = new HashSet<>();
		for (TClass tDataClass : coupling.keySet()) {
			HMoveMembers hMoveMembers = createMove(tContainer, tClass, tDataClass, hParent);
			if (hMoveMembers != null) {
				for (HMoveMember hMove : hMoveMembers.getHMoveMembers()) {
					TMember member = (TMember) hMove.getTAnnotated();

				}
				hMoveMembers.setValue(internalCoupling - coupling.get(tDataClass));
				possibleMoves.add(hMoveMembers);
			}
		}
		if (possibleMoves.size() == 0) {
			//			if (!lowCohesion || tMembers.size() <= 2) {
			//				return false;
			//			}
			//			HExtractClass extract = RefactoringsFactory.eINSTANCE.createHExtractClass();
			//			extract.getTMembers().addAll(tMembers);
			//			if (isRefactoringPossible(extract)) {
			//				hParent.getHRefactorings().add(extract);
			//				extract.getPartOf().add(hParent);
			//				extract.setValue(internalCoupling + 1);
			//				return true;
			//			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

	public static final Object[] pattern_HAlternativeBlobresolver_0_1_ActivityNode30_blackB(
			HAlternativeBlobresolver _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_HAlternativeBlobresolver_0_2_ActivityNode31_bindingFBB(
			HAlternativeBlobresolver _this, HAntiPatternGraph apg) {
		HAntiPatternGraph _localVariable_0 = _this.init(apg);
		HAntiPatternGraph newApg = _localVariable_0;
		if (newApg != null) {
			return new Object[] { newApg, _this, apg };
		}
		return null;
	}

	public static final Object[] pattern_HAlternativeBlobresolver_0_2_ActivityNode31_blackB(HAntiPatternGraph newApg) {
		return new Object[] { newApg };
	}

	public static final Object[] pattern_HAlternativeBlobresolver_0_2_ActivityNode31_bindingAndBlackFBB(
			HAlternativeBlobresolver _this, HAntiPatternGraph apg) {
		Object[] result_pattern_HAlternativeBlobresolver_0_2_ActivityNode31_binding = pattern_HAlternativeBlobresolver_0_2_ActivityNode31_bindingFBB(
				_this, apg);
		if (result_pattern_HAlternativeBlobresolver_0_2_ActivityNode31_binding != null) {
			HAntiPatternGraph newApg = (HAntiPatternGraph) result_pattern_HAlternativeBlobresolver_0_2_ActivityNode31_binding[0];

			Object[] result_pattern_HAlternativeBlobresolver_0_2_ActivityNode31_black = pattern_HAlternativeBlobresolver_0_2_ActivityNode31_blackB(
					newApg);
			if (result_pattern_HAlternativeBlobresolver_0_2_ActivityNode31_black != null) {

				return new Object[] { newApg, _this, apg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_HAlternativeBlobresolver_0_3_ActivityNode32_blackBFFB(
			HAntiPatternGraph newApg, HAlternativeBlobresolver _this) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (HAnnotation tmpHBlob : newApg.getHAnnotations()) {
			if (tmpHBlob instanceof HBlobAntiPattern) {
				HBlobAntiPattern hBlob = (HBlobAntiPattern) tmpHBlob;
				TAnnotatable tmpTClass = hBlob.getTAnnotated();
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					_result.add(new Object[] { newApg, hBlob, tClass, _this });
				}

			}
		}
		return _result;
	}

	public static final Object[] pattern_HAlternativeBlobresolver_0_3_ActivityNode32_greenBBBBF(
			HAntiPatternGraph newApg, HBlobAntiPattern hBlob, TClass tClass, HAlternativeBlobresolver _this) {
		HBlobResolveAnnotation hResolve = RefactoringgraphFactory.eINSTANCE.createHBlobResolveAnnotation();
		hBlob.getPartOf().add(hResolve);
		_this.getHAnnotation().add(hResolve);
		hResolve.setHBlobAntiPattern(hBlob);
		hResolve.setTAnnotated(tClass);
		newApg.getHAnnotations().add(hResolve);
		return new Object[] { newApg, hBlob, tClass, _this, hResolve };
	}

	public static final boolean pattern_HAlternativeBlobresolver_0_4_ActivityNode34_expressionFBB(
			HAlternativeBlobresolver _this, TClass tClass) {
		boolean _localVariable_0 = _this.allowedToTouch(tClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_HAlternativeBlobresolver_0_5_ActivityNode35_blackBF(TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TAnnotation tmpHCluster : tClass.getTAnnotation()) {
			if (tmpHCluster instanceof HInBlobClusterAccess) {
				HInBlobClusterAccess hCluster = (HInBlobClusterAccess) tmpHCluster;
				_result.add(new Object[] { tClass, hCluster });
			}
		}
		return _result;
	}

	public static final boolean pattern_HAlternativeBlobresolver_0_6_ActivityNode37_expressionFBBBB(
			HAlternativeBlobresolver _this, HInBlobClusterAccess hCluster, TClass tClass,
			HBlobResolveAnnotation hResolve) {
		boolean _localVariable_0 = _this.process(hCluster, tClass, hResolve);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_HAlternativeBlobresolver_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Alternative " + super.getGuiName();
	}

	// [user code injected with eMoflon] -->
} //HAlternativeBlobresolverImpl
