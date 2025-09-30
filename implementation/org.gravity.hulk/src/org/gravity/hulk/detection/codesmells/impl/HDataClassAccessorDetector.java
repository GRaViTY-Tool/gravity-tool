/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HData
 * Class Accessor Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HDataClassAccessorDetector extends HClassBasedCalculatorImpl implements HCodeSmellDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param dataclassDetector
	 * @param graph
	 *
	 * @generated
	 */
	public HDataClassAccessorDetector(final DFSGraph graph, final HDataClassDetector dataclassDetector) {
		final var edge2 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		edge2.setGraph(graph);
		this.getOutgoing().add(edge2);
		dataclassDetector.getIncoming().add(edge2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var dataClassAccessed = accessesDataClass(tClass);
		if (dataClassAccessed) {
			final var ad = CodesmellsFactory.eINSTANCE.createHDataClassAccessor();
			ad.setValue(0.0);
			ad.setTAnnotated(tClass);
			this.getHAnnotation().add(ad);

			// ForEach
			for (final TMember tAccessing : tClass.getDefines()) {
				for (final TAccess access : tAccessing.getAccessing()) {
					final var dataClass = access.getTarget().getDefinedBy();
					if ((dataClass instanceof TClass) && !dataClass.equals(tClass)) {
						for (final TAnnotation annotation : dataClass.getTAnnotation()) {
							if (annotation instanceof final HDataClassSmell smell) {
								ad.increment();
								ad.getHDataClassSmells().add(smell);
								smell.getPartOf().add(ad);
							}
						}
					}

				}
			}
			return ad;
		}
		tClass.getTAnnotation().removeIf(HDataClassAccessor.class::isInstance);
		return null;

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
				metric.setApg(pg);
				this.getHAnnotation().add(metric);

			}
		}
		return true;
	}

	public static final boolean accessesDataClass(final TClass tClass) {
		for (final TMember tAnyAccessing : tClass.getDefines()) {
			for (final TAccess anyAccess : tAnyAccessing.getAccessing()) {
				final var tAnyAccessed = anyAccess.getTarget();
				if ((tAnyAccessed != null) && !tAnyAccessed.equals(tAnyAccessing)) {
					final var tmpTAnyDataClass = tAnyAccessed.getDefinedBy();
					if (tmpTAnyDataClass instanceof final TClass tAnyDataClass) {
						if (!tAnyDataClass.equals(tClass)) {
							for (final TAnnotation tmpTData : tAnyDataClass.getTAnnotation()) {
								if (tmpTData instanceof HDataClassSmell) {
									return true;
								}
							}
						}
					}

				}

			}
		}
		return false;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Data Class Accessor Smell";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eINSTANCE.getHDataClassAccessor();
	}

	// [user code injected with eMoflon] -->
} // HDataClassAccessorDetectorImpl
