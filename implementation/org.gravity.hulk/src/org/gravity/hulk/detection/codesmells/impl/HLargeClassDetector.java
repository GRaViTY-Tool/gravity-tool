/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.impl.HRelativeDetectorImpl;
import org.gravity.hulk.detection.metrics.impl.HMemberNumberCalculator;
import org.gravity.typegraph.basic.TClass;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HLarge
 * Class Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HLargeClassDetector#isRelative
 * <em>Relative</em>}</li>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HLargeClassDetector#getThreshold
 * <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLargeClassDetector extends HRelativeDetectorImpl implements HCodeSmellDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param nmd
	 *
	 * @generated
	 */
	public HLargeClassDetector(final DFSGraph graph, final HMemberNumberCalculator nmd) {
		final var edge1 = DfsFactory.eINSTANCE.createEdge();
		edge1.setGraph(graph);
		nmd.getIncoming().add(edge1);
		this.setGraph(graph);
		this.getOutgoing().add(edge1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {//
		this.removeAnnotations(tClass);

		if (tClass.isTLib()) {
			return null;
		}

		final var nm = this.get(tClass.getTAnnotation(), HNumberOfMembersMetric.class);
		if (nm != null) {
			if (this.isRelative()) {
				this.setThreshold(this.calculateRelativeThreshold(HRelativeValueConstants.VERY_HIGH));
			}
			if (HRelativeDetectorImpl.thresholdReached(nm, this.getThreshold())) {

				final var largeClassSmell = CodesmellsFactory.eINSTANCE.createHLargeClassSmell();
				largeClassSmell.setTAnnotated(tClass);
				largeClassSmell.setHNumberOfMembers(nm);
				nm.getPartOf().add(largeClassSmell);
				this.getHAnnotation().add(largeClassSmell);
				return largeClassSmell;
			}

		}
		return null;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double calculateRelativeThreshold(final HRelativeValueConstants level) {
		return this.calculateRelativeThreshold(HRelativeValueConstants.HIGH, HNumberOfMembersMetric.class);

	}

	@Override
	public String getGuiName() {
		return "Large Class Smell";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eINSTANCE.getHLargeClassSmell();
	}
} // HLargeClassDetectorImpl
