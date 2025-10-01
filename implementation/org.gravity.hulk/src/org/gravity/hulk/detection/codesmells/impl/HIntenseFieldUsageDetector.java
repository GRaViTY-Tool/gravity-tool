/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.impl.HRelativeDetectorImpl;
import org.gravity.hulk.detection.metrics.impl.HLocalAccessRelationCalculator;
import org.gravity.typegraph.basic.TClass;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HIntense Field Usage Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HIntenseFieldUsageDetector#isRelative
 * <em>Relative</em>}</li>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HIntenseFieldUsageDetector#getThreshold
 * <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HIntenseFieldUsageDetector extends HRelativeDetectorImpl implements HCodeSmellDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param local
	 * @param graph
	 *
	 * @generated
	 */
	public HIntenseFieldUsageDetector(final DFSGraph graph, final HLocalAccessRelationCalculator local) {
		final var edge12 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		edge12.setGraph(graph);
		this.getOutgoing().add(edge12);
		local.getIncoming().add(edge12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var hMetric = this.get(tClass.getTAnnotation(), HLocalAccessRelationMetric.class);
		if (hMetric == null) {
			throw new IllegalStateException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
		}
		//
		if (this.isRelative()) {
			this.setThreshold(this.calculateRelativeThreshold(HRelativeValueConstants.VERY_HIGH));
		}
		//
		if (Double.compare(this.getThreshold(), hMetric.getValue()) < 0) {

			final var smell = CodesmellsFactory.eINSTANCE.createHIntenseFieldUsageCodeSmell();
			smell.setTAnnotated(tClass);
			smell.setHLocalAccessRelationMetric(hMetric);
			this.getHAnnotation().add(smell);
			hMetric.getPartOf().add(smell);

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
		// [user code injected with eMoflon]

		return this.calculateRelativeThreshold(level, HLocalAccessRelationMetric.class);

	}

	@Override
	public String getGuiName() {
		return "Intense usage of local fields";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eINSTANCE
				.getHIntenseFieldUsageCodeSmell();
	}

	// [user code injected with eMoflon] -->
} // HIntenseFieldUsageDetectorImpl
