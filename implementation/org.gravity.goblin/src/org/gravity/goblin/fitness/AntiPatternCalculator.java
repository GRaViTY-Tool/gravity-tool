package org.gravity.goblin.fitness;

import org.eclipse.emf.common.util.EList;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotation;

public class AntiPatternCalculator extends MetricCalculator {

	@Override
	public double calculate(TypeGraph graph) {
		int blobs = 0;
		for (TClass tDeclaredClass : graph.getDeclaredTClasses()) {
			EList<TAnnotation> tAnnotation = tDeclaredClass.getTAnnotation(AntipatternPackage.eINSTANCE.getHBlobAntiPattern());
			blobs += tAnnotation.size();
		}
		return blobs;
	}
}
