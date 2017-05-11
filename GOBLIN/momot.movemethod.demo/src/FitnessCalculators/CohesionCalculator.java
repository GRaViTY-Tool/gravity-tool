package FitnessCalculators;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.impl.AntipatterngraphFactoryImpl;
import org.gravity.hulk.antipatterngraph.metrics.HEfferentCouplingMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
import org.gravity.hulk.detection.HClassBasedMetricCalculator;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.HLcom5Calculator;
import org.gravity.hulk.detection.metrics.MetricsFactory;
import org.gravity.typegraph.basic.TypeGraph;

public class CohesionCalculator extends MetricCalculator{

	@Override
	public double calculate(EGraph graph) {
		return calculate(HLcom5Calculator.class, graph);
	}

}
