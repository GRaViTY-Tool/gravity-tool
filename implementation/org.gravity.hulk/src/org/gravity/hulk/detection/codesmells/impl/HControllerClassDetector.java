/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.impl.HRelativeDetectorImpl;
import org.gravity.hulk.detection.metrics.impl.HInvocationRelationCalculator;
import org.gravity.typegraph.basic.TClass;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HContoller Class Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HControllerClassDetector#isRelative
 * <em>Relative</em>}</li>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HControllerClassDetector#getThreshold
 * <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HControllerClassDetector extends HRelativeDetectorImpl implements HCodeSmellDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param inc
	 * @param graph
	 *
	 * @generated
	 */
	public HControllerClassDetector(final DFSGraph graph, final HInvocationRelationCalculator inc) {
		final var edge9 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		this.getOutgoing().add(edge9);
		edge9.setGraph(graph);
		inc.getIncoming().add(edge9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var relation = this.get(tClass.getTAnnotation(), HInvocationRelation.class);
		if (relation == null) {
			throw new IllegalStateException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
		}

		if (this.isRelative()) {
			this.setThreshold(this.calculateRelativeThreshold(HRelativeValueConstants.MEDIUM));
		}

		if (Double.compare(this.getThreshold(), relation.getValue()) < 0) {
			final var controller = CodesmellsFactory.eINSTANCE.createHControllerClassSmell();
			controller.setTAnnotated(tClass);
			controller.setHInvocationRelation(relation);
			relation.getPartOf().add(controller);
			this.getHAnnotation().add(controller);
			return controller;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public double calculateRelativeThreshold(final HRelativeValueConstants level) {
		return this.calculateRelativeThreshold(level, HInvocationRelation.class);
	}

	@Override
	public String getGuiName() {
		return "Controller Class Smell";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eINSTANCE.getHControllerClassSmell();
	}

} // HContollerClassDetectorImpl
