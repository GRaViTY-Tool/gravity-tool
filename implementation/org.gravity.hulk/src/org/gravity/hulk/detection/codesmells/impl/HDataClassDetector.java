/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell;
import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HRelativeDetectorImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->
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
	 * The default value of the '{@link #isRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELATIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected boolean relative = RELATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected double threshold = THRESHOLD_EDEFAULT;

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
	public boolean isRelative() {
		return this.relative;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setRelative(final boolean newRelative) {
		this.relative = newRelative;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double getThreshold() {
		return this.threshold;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setThreshold(final double newThreshold) {
		this.threshold = newThreshold;
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

		}
		return null;
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
		// [user code injected with eMoflon]

		return this.calculateRelativeThreshold(level, HNACCMetric.class);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean detect(final HAntiPatternGraph pg) {// ForEach
		for (final TClass tClass : HClassBasedCalculatorImpl.getClassesToVisit(pg, this)) {
			final var metric = this.calculate(tClass);
			if (metric != null) {
				metric.setTAnnotated(tClass);
				pg.getHAnnotations().add(metric);
				this.getHAnnotation().add(metric);

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
	public String toString() {
		if (this.eIsProxy()) {
			return super.toString();
		}

		final var result = new StringBuilder(super.toString());
		result.append(" (relative: ");
		result.append(this.relative);
		result.append(", threshold: ");
		result.append(this.threshold);
		result.append(')');
		return result.toString();
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Data Class Smell";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eINSTANCE.getHDataClassSmell();
	}

	// [user code injected with eMoflon] -->
} // HDataClassDetectorImpl
