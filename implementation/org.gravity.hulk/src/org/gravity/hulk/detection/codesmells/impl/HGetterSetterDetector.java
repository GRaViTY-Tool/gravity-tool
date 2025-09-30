/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.metrics.impl.HGetterSetterMethodRelationCalculator;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HGetter
 * Setter Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HGetterSetterDetector extends HClassBasedCalculatorImpl implements HCodeSmellDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param nacc
	 * @param graph
	 *
	 * @generated
	 */
	public HGetterSetterDetector(final DFSGraph graph, final HGetterSetterMethodRelationCalculator nacc) {
		final var edge8 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		this.getOutgoing().add(edge8);
		nacc.getIncoming().add(edge8);
		edge8.setGraph(graph);
	}

	private boolean isGetterSetter(final TMethodDefinition method) {
		final var tName = method.getSignature().getMethod().getTName();
		return tName.startsWith("get") || tName.startsWith("set");

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var nacc = this.get(tClass.getTAnnotation(), HNACCMetric.class);
		if (nacc == null) {
			throw new IllegalStateException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[this] = " + this + ".");
		}
		// ForEach
		for (final TMember tmpTMember : tClass.getDefines()) {
			if (tmpTMember instanceof final TMethodDefinition tMember
					&& this.isGetterSetter(tMember)) {
				final var gs = CodesmellsFactory.eINSTANCE.createHGetterSetterSmell();
				gs.setTAnnotated(tMember);
				gs.getPartOf().add(nacc);
				nacc.getHGetterSetterSmells().add(gs);
				this.getHAnnotation().add(gs);
			}

		}
		return nacc;
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

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Getter/Setter Smell";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eINSTANCE.getHGetterSetterSmell();
	}

	// [user code injected with eMoflon] -->
} // HGetterSetterDetectorImpl
