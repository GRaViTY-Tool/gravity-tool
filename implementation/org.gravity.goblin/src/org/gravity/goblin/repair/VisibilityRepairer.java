package org.gravity.goblin.repair;

import java.util.List;
import org.apache.log4j.Logger;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.goblin.EGraphUtil;
import org.gravity.goblin.preconditions.ChangeVisibilityPreConditions;
import org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TConstructorDefinition;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotation;

import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.solution.repair.AbstractTransformationSolutionRepairer;

/**
 * Repairs broken visibilities after the application of refactorings
 * 
 * @author speldszus
 *
 */
public class VisibilityRepairer extends AbstractTransformationSolutionRepairer {

	private static final Logger LOGGER = Logger.getLogger(VisibilityRepairer.class.getName());

	@Override
	public TransformationSolution repair(TransformationSolution solution) {
		EGraph graph = solution.getResultGraph();
		TypeGraph pg = EGraphUtil.getPG(graph);

		for (TClass tClass : pg.getDeclaredTClasses()) {
			repair(tClass);
		}
		return solution;
	}

	/**
	 * Repair the visibilities of the members of the given class
	 * 
	 * @param tClass The class whose members visibility should be repaired
	 */
	private void repair(TClass tClass) {
		for (TMethodDefinition tDef : tClass.getDeclaredTMethodDefinitions()) {
			List<TAnnotation> metrics = tDef.getTAnnotation(MetricsPackage.eINSTANCE.getHIGAMMetric());
			if (metrics.size() != 1) {
				if (tDef instanceof TConstructorDefinition) {
					LOGGER.warn("Unexpected amount of metrics for \"" + tClass.getFullyQualifiedName()
							+ "->" + tDef.getSignatureString() + "\".");
				} else {
					throw new IllegalStateException("Unexpected amount of metrics for \""
							+ tClass.getFullyQualifiedName() + "->" + tDef.getSignatureString() + "\".");
				}
			} else {
				TModifier tModifier = tDef.getTModifier();
				TVisibility hMinVis = ((HIGAMMetric) metrics.get(0)).getHMinVis();
				if (hMinVis.ordinal() > tModifier.getTVisibility().ordinal()
						&& ChangeVisibilityPreConditions.checkPreconditions(tDef, tClass)) {
					tModifier.setTVisibility(hMinVis);
				}
			}
		}
	}

}
