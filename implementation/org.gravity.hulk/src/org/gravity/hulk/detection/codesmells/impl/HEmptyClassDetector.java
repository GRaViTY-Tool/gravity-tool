/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HEmpty Class
 * Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HEmptyClassDetector extends HClassBasedCalculatorImpl implements HCodeSmellDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param graph
	 *
	 * @generated
	 */
	public HEmptyClassDetector(final DFSGraph graph) {
		this.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {//
		this.removeAnnotations(tClass);

		if (!tClass.isTLib() && tClass.getDefines().isEmpty()) {
			final var smell = CodesmellsFactory.eINSTANCE.createHEmptyClassSmell();
			smell.setTAnnotated(tClass);
			this.getHAnnotation().add(smell);
			return smell;
		}
		return null;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Empty Class Smell";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eINSTANCE.getHEmptyClassSmell();
	}

	// [user code injected with eMoflon] -->
} // HEmptyClassDetectorImpl
