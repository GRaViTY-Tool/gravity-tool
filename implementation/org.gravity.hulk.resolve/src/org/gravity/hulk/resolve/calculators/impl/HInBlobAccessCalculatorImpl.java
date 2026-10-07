/**
 */
package org.gravity.hulk.resolve.calculators.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.detection.AbstractHDetector;
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;
import org.gravity.hulk.resolve.calculators.HInBlobAccessCalculator;
import org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIn Blob Access
 * Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HInBlobAccessCalculatorImpl extends AbstractHDetector implements HInBlobAccessCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param m2dc
	 * @param graph
	 *
	 * @generated
	 */
	public HInBlobAccessCalculatorImpl(final DFSGraph graph, final HMethodToDataClassAccessCalculator m2dc) {
		final var edge1 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		edge1.setGraph(graph);
		this.getOutgoing().add(edge1);
		m2dc.getIncoming().add(edge1);
	}

	@Override
	public boolean detect(final HAntiPatternGraph apg) {// ForEach
		for (final HAnnotation tmpBlob : apg.getHAnnotations()) {
			if (tmpBlob instanceof final HBlobAntiPattern blob) {
				final var tmpTClass = blob.getTAnnotated();
				if (tmpTClass instanceof final TClass tClass) {
					final var tAllMembers = tClass.getAllTMembers();
					if (tAllMembers == null) {
						throw new IllegalStateException(
								"Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
					}
					for (final var tMember : tClass.getDefines()) {
						this.calculateIBA(apg, tAllMembers, tMember);
					}
				}
			}
		}
		return true;
	}

	private void calculateIBA(final HAntiPatternGraph apg, final EList<TMember> tAllMembers, final TMember tMember) {
		final var iba = RefactoringgraphFactory.eINSTANCE.createHInBlobAccess();
		this.getHAnnotation().add(iba);
		iba.setTAnnotated(tMember);
		apg.getHAnnotations().add(iba);

		// ForEach
		for (final TMember otherMember : tAllMembers) {
			if (!otherMember.equals(tMember)) {
				for (final TAccess calling : tMember.getAccessing()) {
					if (otherMember.getAccessedBy().contains(calling)) {
						iba.increment();
					}
				}
			}
		}
	}

	@Override
	public String getGuiName() {
		return "Calculate the In-Blob-Method accesses";
	}

	@Override
	public EClass getHAnnotationType() {
		return RefactoringgraphPackage.eINSTANCE.getHInBlobAccess();
	}

} // HInBlobAccessCalculatorImpl