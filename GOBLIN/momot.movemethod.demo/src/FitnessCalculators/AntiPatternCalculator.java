package FitnessCalculators;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.detection.antipattern.HBlobDetector;

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
