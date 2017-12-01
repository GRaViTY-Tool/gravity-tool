package org.gravity.goblin.fitness;

import java.security.InvalidParameterException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotation;

public abstract class MetricCalculator implements IFitnessCalculator {

	public double calculate(EClass metricClass, TypeGraph graph) {
		if(!metricClass.getEAllSuperTypes().contains(AntipatterngraphPackage.eINSTANCE.getHMetric())) {
			throw new InvalidParameterException();
		}
		double value = 0;
		for (TClass tDeclaredClass : graph.getDeclaredTClasses()) {
			EList<TAnnotation> tAnnotation = tDeclaredClass.getTAnnotation(metricClass);
			if (tAnnotation != null) {
				value += ((HMetric) tAnnotation.get(0)).getValue();
			}
		}
		return value;
	}
}
