/**
 */
package org.gravity.hulk.resolve.calculators.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.resolve.calculators.CalculatorsPackage;
import org.gravity.hulk.resolve.calculators.HClusterAccessCalculator;

import org.gravity.hulk.resolve.impl.HResolverImpl;
// <-- [user defined imports]
import java.util.HashSet;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.refactoringgraph.HCluster;
import org.gravity.hulk.refactoringgraph.HInBlobClusterAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
// [user defined imports] -->

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
		super();
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
	public boolean detect(HAntiPatternGraph apg) {
		// [user code injected with eMoflon]

		HashSet<HInBlobClusterAccess> allCreatedAnnotations = new HashSet<>();
		for (HAnnotation hAnnotation : apg.getHAnnotations()) {
			if (hAnnotation instanceof HBlobAntiPattern) {
				HBlobAntiPattern hBlob = (HBlobAntiPattern) hAnnotation;
				TClass tClass = (TClass) hBlob.getTAnnotated();
				HashSet<HInBlobClusterAccess> createdAnnotations = new HashSet<>();
				for (TAnnotation tAnnotation : tClass.getTAnnotation()) {
					if (tAnnotation instanceof HCluster) {
						HCluster hCluster = (HCluster) tAnnotation;
						EList<TMember> tMembers = hCluster.getTMembers();
						HashSet<TMember> seenOut = new HashSet<>();
						HashSet<TMember> seenIn = new HashSet<>();
						int value = 0;
						for (TMember tMember : tMembers) {
							for (TAccess tAccess : tMember.getAccessing()) {
								TMember tTarget = tAccess.getTarget();
								if (tClass.equals(tTarget.getDefinedBy())) {
									if (!seenOut.contains(tTarget)) {
										if (!tMembers.contains(tTarget)) {
											seenOut.add(tTarget);
											value++;
										}
									}
								}
							}
							for (TAccess tAccess : tMember.getAccessedBy()) {
								TMember tTarget = tAccess.getSource();
								if (tClass.equals(tTarget.getDefinedBy())) {
									if (!seenIn.contains(tTarget)) {
										if (!tMembers.contains(tTarget)) {
											seenIn.add(tTarget);
											value++;
										}
									}
								}
							}
						}
						HInBlobClusterAccess iba = RefactoringgraphFactory.eINSTANCE.createHInBlobClusterAccess();
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
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

	// [user code injected with eMoflon] -->
} //HClusterAccessCalculatorImpl