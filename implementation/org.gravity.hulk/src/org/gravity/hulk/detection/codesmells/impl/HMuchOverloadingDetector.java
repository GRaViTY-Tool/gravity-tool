/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.impl.HRelativeDetectorImpl;
import org.gravity.hulk.detection.metrics.impl.HAverageOverloadingInClassCalculator;
import org.gravity.typegraph.basic.TClass;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMuch Overloading
 * Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HMuchOverloadingDetector#isRelative
 * <em>Relative</em>}</li>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HMuchOverloadingDetector#getThreshold
 * <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HMuchOverloadingDetector extends HRelativeDetectorImpl implements HCodeSmellDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param overMetric
	 * @param graph
	 *
	 * @generated
	 */
	public HMuchOverloadingDetector(final DFSGraph graph,
			final HAverageOverloadingInClassCalculator overMetric) {
		final var edge11 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		this.getOutgoing().add(edge11);
		overMetric.getIncoming().add(edge11);
		edge11.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var over = this.get(tClass.getTAnnotation(),
				HAverageOverloadingInClassMetric.class);
		if (over == null) {
			throw new IllegalStateException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
		}
		//
		if (this.isRelative()) {
			this.setThreshold(this.calculateRelativeThreshold(HRelativeValueConstants.VERY_HIGH));
		}
		//
		if (Double.compare(this.getThreshold(), over.getValue()) < 0) {
			final var smell = CodesmellsFactory.eINSTANCE.createHMuchOverloadingCodeSmell();
			smell.setTAnnotated(tClass);
			smell.setHAverageOverloadingInClassMetric(over);
			this.getHAnnotation().add(smell);
			over.getPartOf().add(smell);
			return smell;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double calculateRelativeThreshold(final HRelativeValueConstants level) {
		return this.calculateRelativeThreshold(level, HAverageOverloadingInClassMetric.class);

	}

	@Override
	public String getGuiName() {
		return "Much Overloading Code Smell";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eINSTANCE.getHMuchOverloadingCodeSmell();
	}

} // HMuchOverloadingDetectorImpl
