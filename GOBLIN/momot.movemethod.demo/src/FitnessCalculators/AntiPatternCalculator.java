package FitnessCalculators;

import java.io.ObjectInputStream.GetField;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternFactory;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.impl.AntipatterngraphFactoryImpl;
import org.gravity.hulk.detection.antipattern.HBlobDetector;
import org.gravity.hulk.detection.metrics.MetricsFactory;
import org.gravity.hulk.impl.HAntiPatternDetectionImpl;
import org.gravity.typegraph.basic.TypeGraph;

public class AntiPatternCalculator extends MetricCalculator{

	@Override
	public double calculate(EGraph graph){
		
		double fitness = 0;
		HAntiPatternHandling hulk = getHulk(graph);
		HDetector detector= getDetector(HBlobDetector.class, hulk);
		startDetector(detector, hulk);
		
		for(HAnnotation metric: detector.getHAnnotation()){
			if(metric instanceof HBlobAntiPattern){
				fitness ++;
			}
		}
		return fitness;
	}
}
