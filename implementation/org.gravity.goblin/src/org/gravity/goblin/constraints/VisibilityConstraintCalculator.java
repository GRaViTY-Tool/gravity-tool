package org.gravity.goblin.constraints;

import java.util.List;

import org.gravity.goblin.fitness.IFitnessCalculator;
import org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotation;

public class VisibilityConstraintCalculator implements IFitnessCalculator {

	@Override
	public double calculate(TypeGraph graph) {
		double value = 0;
		for (TClass tClass : graph.getDeclaredTClasses()) {
			for (TMethodDefinition tDef : tClass.getDeclaredTMethodDefinitions()) {
				List<TAnnotation> metrics = tDef.getTAnnotation(MetricsPackage.eINSTANCE.getHIGAMMetric());
				if (metrics.size() != 1) {
					System.err.println("Unexpected amount of metrics for \"" + tClass.getFullyQualifiedName() + "->"
							+ tDef.getSignatureString() + "\".");
				} else {
					HIGAMMetric igam = (HIGAMMetric) metrics.get(0);
					if (igam.getHMinVis().ordinal() > tDef.getTModifier().getTVisibility().ordinal()) {
						value += 1;
					}
				}
			}
		}
		return value;
	}

}
