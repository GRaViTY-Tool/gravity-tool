package org.gravity.goblin.repair;

import java.util.List;

import org.apache.log4j.Logger;
import org.gravity.goblin.EGraphUtil;
import org.gravity.goblin.preconditions.ChangeVisibilityPreConditions;
import org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TConstructor;
import org.gravity.typegraph.basic.TEnum;
import org.gravity.typegraph.basic.TMethodDefinition;
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
	public TransformationSolution repair(final TransformationSolution solution) {
		final var graph = solution.getResultGraph();
		final var pg = EGraphUtil.getPG(graph);

		for (final TClass tClass : pg.getDeclaredTClasses()) {
			repair(tClass);
		}
		return solution;
	}

	/**
	 * Repair the visibilities of the members of the given class
	 *
	 * @param tClass The class whose members visibility should be repaired
	 */
	private void repair(final TClass tClass) {
		final var isEnum = TEnum.isEnum(tClass);
		for (final TMethodDefinition definition : tClass.getDeclaredTMethodDefinitions()) {
			final var name = definition.getSignature().getMethod().getTName();
			if("toString".equals(name)) {
				continue;
			}
			if ((isEnum && ("values".equals(name) || "valueOf".equals(name))) || "initializer".equals(name)) {
				continue;
			}
			final List<TAnnotation> metrics = definition.getTAnnotation(MetricsPackage.eINSTANCE.getHIGAMMetric());
			if (metrics.size() != 1) {
				if (TConstructor.isConstructor(definition)) {
					LOGGER.warn("Unexpected amount of metrics for \"" + tClass.getFullyQualifiedName() + "->"
							+ definition.getSignatureString() + "\".");
				} else {
					LOGGER.error("Unexpected amount of metrics ("+metrics.size()
					+ ") for \""
					+ tClass.getFullyQualifiedName() + "->" + definition.getSignatureString() + "\".");
				}
			} else {
				final var tModifier = definition.getTModifier();
				final var hMinVis = ((HIGAMMetric) metrics.get(0)).getHMinVis();
				if ((hMinVis.ordinal() > tModifier.getTVisibility().ordinal())
						&& ChangeVisibilityPreConditions.checkPreconditions(definition, tClass)) {
					tModifier.setTVisibility(hMinVis);
				}
			}
		}
	}

}
