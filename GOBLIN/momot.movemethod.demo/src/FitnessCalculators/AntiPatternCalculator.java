package FitnessCalculators;

import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.detection.antipattern.AntipatternPackage;

public class AntiPatternCalculator extends MetricCalculator{

	@Override
	public double calculate(EGraph graph){
		
		double fitness = 0;
		HAntiPatternHandling hulk = getHulk(graph);
		
		HulkDetector hulkDetector = new HulkDetector(hulk, new Hashtable<String, String>());
		HashSet<HDetector> selected = new HashSet<HDetector>();
		hulkDetector.detectSelectedAntiPattern(Collections.singleton(AntipatternPackage.eINSTANCE.getHBlobDetector()), selected, new HashSet<HDetector>());
		
		for(HAnnotation metric: selected.iterator().next().getHAnnotation()){
			if(metric instanceof HBlobAntiPattern){
				fitness ++;
			}
		}
		return fitness;
	}
}
