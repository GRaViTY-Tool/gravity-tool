package FitnessCalculators;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.detection.metrics.MetricsPackage;

public class CohesionCalculator extends MetricCalculator{

	@Override
	public double calculate(EGraph graph) {
		return calculate(MetricsPackage.eINSTANCE.getHLcom5Calculator(), graph);
	}

}
