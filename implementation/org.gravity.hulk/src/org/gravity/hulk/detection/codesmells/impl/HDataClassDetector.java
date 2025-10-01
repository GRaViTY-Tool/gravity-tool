/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell;
import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.impl.HRelativeDetectorImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HData
 * Class Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HDataClassDetector#isRelative
 * <em>Relative</em>}</li>
 * <li>{@link org.gravity.hulk.detection.codesmells.impl.HDataClassDetector#getThreshold
 * <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HDataClassDetector extends HRelativeDetectorImpl implements HCodeSmellDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param getterSetterDetector
	 * @param graph
	 *
	 * @generated
	 */
	public HDataClassDetector(final DFSGraph graph, final HGetterSetterDetector getterSetterDetector) {
		final var edge = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		edge.setGraph(graph);
		this.getOutgoing().add(edge);
		getterSetterDetector.getIncoming().add(edge);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {//
		this.removeAnnotations(tClass);

		HNACCMetric nm = null;
		for (final TAnnotation tmpNm : tClass.getTAnnotation()) {
			if (tmpNm instanceof final HNACCMetric nacc) {
				nm = nacc;
			} else if (tmpNm instanceof final HDataClassSmell dataClass) {
				return dataClass;
			}
		}
		if (nm != null) {
			if (this.isRelative()) {
				this.setThreshold(this.calculateRelativeThreshold(HRelativeValueConstants.HIGH));
			}
			//
			if (this.getThreshold() <= nm.getValue()) {

				return this.create(tClass, nm);
			}

		}
		return null;
	}

	private HAnnotation create(final TClass tClass, final HNACCMetric nm) {
		final var dataClassSmell = CodesmellsFactory.eINSTANCE.createHDataClassSmell();
		dataClassSmell.setTAnnotated(tClass);
		dataClassSmell.setHNACCMetric(nm);
		this.getHAnnotation().add(dataClassSmell);
		nm.getPartOf().add(dataClassSmell);

		// ForEach
		for (final HGetterSetterSmell getterSetter : nm.getHGetterSetterSmells()) {
			getterSetter.getPartOf().add(dataClassSmell);
			dataClassSmell.getGetterSetterSmells().add(getterSetter);
		}
		// ForEach
		for (final TClass tChild : tClass.getChildClasses()) {
			if (!tChild.equals(tClass)) {
				this.makeChildDC(tChild, dataClassSmell);
			}
		}
		return dataClassSmell;
	}

	private void makeChildDC(final TClass tChild, final HDataClassSmell tSmell) {//
		for (final TAnnotation tmpSmell : tChild.getTAnnotation()) {
			if (tmpSmell instanceof HDataClassSmell) {
				return;
			}
		}
		final var data = CodesmellsFactory.eINSTANCE.createHDataClassSmell();
		data.setTAnnotated(tChild);
		data.getPartOf().add(tSmell);

		// ForEach
		for (final TClass next : tChild.getChildClasses()) {
			if (!next.equals(tChild)) {
				this.makeChildDC(next, data);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double calculateRelativeThreshold(final HRelativeValueConstants level) {
		return this.calculateRelativeThreshold(level, HNACCMetric.class);
	}

	@Override
	public String getGuiName() {
		return "Data Class Smell";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eINSTANCE.getHDataClassSmell();
	}

} // HDataClassDetectorImpl
