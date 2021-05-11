/**
 */
package org.gravity.hulk.resolve.calculators.impl;

import java.lang.reflect.InvocationTargetException;
// <-- [user defined imports]
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.refactoringgraph.HCluster;
import org.gravity.hulk.refactoringgraph.HInBlobClusterAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;
import org.gravity.hulk.resolve.calculators.CalculatorsPackage;
import org.gravity.hulk.resolve.calculators.HClusterAccessCalculator;
import org.gravity.hulk.resolve.impl.HResolverImpl;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
// [user defined imports] -->
import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HCluster Access Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HClusterAccessCalculatorImpl extends HResolverImpl implements HClusterAccessCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HClusterAccessCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculatorsPackage.Literals.HCLUSTER_ACCESS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {
		// [user code injected with eMoflon]

		final var allCreatedAnnotations = new HashSet<HInBlobClusterAccess>();
		for (final HAnnotation hAnnotation : apg.getHAnnotations()) {
			if (hAnnotation instanceof HBlobAntiPattern) {
				final var hBlob = (HBlobAntiPattern) hAnnotation;
				final var tClass = (TClass) hBlob.getTAnnotated();
				final var createdAnnotations = new HashSet<HInBlobClusterAccess>();
				for (final TAnnotation tAnnotation : tClass.getTAnnotation()) {
					if (tAnnotation instanceof HCluster) {
						final var hCluster = (HCluster) tAnnotation;
						final var tMembers = hCluster.getTMembers();
						final var seenOut = new HashSet<TMember>();
						final var seenIn = new HashSet<TMember>();
						var value = 0;
						for (final TMember tMember : tMembers) {
							for (final TAccess tAccess : tMember.getAccessing()) {
								final var tTarget = tAccess.getTarget();
								if (tClass.equals(tTarget.getDefinedBy()) && !seenOut.contains(tTarget)) {
									if (!tMembers.contains(tTarget)) {
										seenOut.add(tTarget);
										value++;
									}
								}
							}
							for (final TAccess tAccess : tMember.getAccessedBy()) {
								final var tTarget = tAccess.getSource();
								if (tClass.equals(tTarget.getDefinedBy()) && !seenIn.contains(tTarget)) {
									if (!tMembers.contains(tTarget)) {
										seenIn.add(tTarget);
										value++;
									}
								}
							}
						}
						final var iba = RefactoringgraphFactory.eINSTANCE.createHInBlobClusterAccess();
						iba.setValue(value);
						iba.setHCluster(hCluster);
						createdAnnotations.add(iba);
					}
				}
				tClass.getTAnnotation().addAll(createdAnnotations);
				allCreatedAnnotations.addAll(createdAnnotations);
			}
		}
		apg.getHAnnotations().addAll(allCreatedAnnotations);
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CalculatorsPackage.HCLUSTER_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Member Cluster Accesses";
	}

	@Override
	public EClass getHAnnotationType() {
		return RefactoringgraphPackage.eINSTANCE.getHInBlobClusterAccess();
	}

	// [user code injected with eMoflon] -->
} //HClusterAccessCalculatorImpl