package FitnessCalculators;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.detection.metrics.HTotalCouplingCalculator;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TypeGraph;

public class CouplingCalculator extends MetricCalculator{
	
		
	@Override
	public double calculate(EGraph graph) {
		//total
		return calculate(HTotalCouplingCalculator.class, graph);
		
		//efferent
		//return calculate(HEfferentCouplingCalculator.class, graph);
		
		//afferent
		//return calculate(HAfferentCouplingCalculator.class, graph);
	}
	
	
	
	public static double calculateCoupling(TypeGraph graph){
		int invoc = 0;
		for(TClass tClass: graph.getClasses()){
			
			if(tClass.isTLib()){
				for (TMember m : tClass.getDefines()) {
					invoc += 100;
					//hard penalty on moving methods to lib classes
				}
			}
			
			if(tClass.getTName().equals("T")){
				for (TMember m : tClass.getDefines()) {
					invoc += 100;
					//hard penalty on moving methods to T classes
				}
			}
			
			for (TMember m : tClass.getDefines()) {			
				for (TAccess t : m.getTAccessing()) {
					TMember tTarget = t.getTTarget();
					
					TAbstractType definingClass = tTarget.getDefinedBy();
					if ( definingClass != null && !definingClass.equals(tClass) && !definingClass.isTLib()) {
						invoc++;
					}
				}
			}
			
			
		}
		
		
		return invoc;
	}




	

}
