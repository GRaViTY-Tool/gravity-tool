/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.impl.HRelativeDetectorImpl;
import org.gravity.hulk.detection.metrics.impl.HAverageParametersCalculator;
import org.gravity.typegraph.basic.TClass;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HMany
 * Parameters Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HManyParametersDetector#isRelative
 * <em>Relative</em>}</li>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HManyParametersDetector#getThreshold
 * <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HManyParametersDetector extends HRelativeDetectorImpl implements HCodeSmellDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param paramMetric
	 * @param graph
	 *
	 * @generated
	 */
	public HManyParametersDetector(final DFSGraph graph, final HAverageParametersCalculator paramMetric) {
		final var edge10 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		this.getOutgoing().add(edge10);
		paramMetric.getIncoming().add(edge10);
		edge10.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var parameters = this.get(tClass.getTAnnotation(), HAverageParametersMetric.class);
		if (parameters == null) {
			throw new IllegalStateException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
		}
		//
		if (this.isRelative()) {
			this.setThreshold(this.calculateRelativeThreshold(HRelativeValueConstants.VERY_HIGH));

		}
		//
		if (Double.compare(this.getThreshold(), parameters.getValue()) < 0) {
			final var smell = CodesmellsFactory.eINSTANCE.createHManyParametersCodeSmell();
			smell.setTAnnotated(tClass);
			smell.setHAverageParametersMetric(parameters);
			this.getHAnnotation().add(smell);
			parameters.getPartOf().add(smell);
			return smell;
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
		return this.calculateRelativeThreshold(level, HAverageParametersMetric.class);

	}

	@Override
	public String getGuiName() {
		return "Many Parameters Code Smell";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eINSTANCE.getHManyParametersCodeSmell();
	}

} // HManyParametersDetectorImpl
