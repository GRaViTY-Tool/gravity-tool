package FitnessCalculators;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Stack;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.impl.AntipatterngraphFactoryImpl;
import org.gravity.hulk.detection.HClassBasedMetricCalculator;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.impl.HAntiPatternHandlingImpl;
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.core.dfs.DFSGraph;

public abstract class MetricCalculator implements IFitnessCalculator{
	
	
	private double calculate(Class detectorClass, HAntiPatternHandling hulk){
		double fitness = 0;
		HDetector detector= getDetector(detectorClass, hulk);
		startDetector(detector, hulk);
		
		for(HAnnotation metric: detector.getHAnnotation()){
			if(metric instanceof HMetric){
				fitness += ((HMetric)metric).getValue();
			}
		}
		return fitness;
	}
	
	public void startDetector(HDetector detector, HAntiPatternHandling hulk){		
		
		Stack<HDetector> stack = new Stack<HDetector>();
		stack.add(detector);
		//det.setHAntiPatternHandling(hulk);
		HulkDetector hulkDetector = new HulkDetector(hulk, new Hashtable<String, String>());
		hulkDetector.detectSelectedAntiPattern(stack, new HashSet<HDetector>(), false);
	}
	
	public HDetector getDetector(Class clazz, HAntiPatternHandling hulk){
		HDetector det= null;
		for(HDetector detector :hulk.getHDetector()){
			if(clazz.isInstance(detector)){
				det = detector;
			}
		}
		return det;
	}
	
	public HAntiPatternHandling getHulk(EGraph graph){
		EObject root = graph.getRoots().get(0);
		
		HAntiPatternHandling hulk = null;
		
		
		if(root instanceof HAntiPatternHandling){
			hulk = (HAntiPatternHandling) root;
		}else{
			HAntiPatternGraph antipatternGraph = null;
			if(root instanceof TypeGraph){
				antipatternGraph = AntipatterngraphFactoryImpl.eINSTANCE.createHAntiPatternGraph();
				antipatternGraph.setPg((TypeGraph) root);
	
			}
			
			if(root instanceof HAntiPatternGraph){
				antipatternGraph = (HAntiPatternGraph) root;
			}
			hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
			hulk.setApg(antipatternGraph);
			DFSGraph dfs = hulk.getDependencyGraph();

			Resource res = new ResourceSetImpl().createResource(URI.createURI("SemllDependencyGraph.xmi")); //$NON-NLS-1$
			res.getContents().add(dfs);
		}
		return hulk;
	}
		
	public double calculate(Class detectorClass, EGraph graph){
		return calculate(detectorClass, getHulk(graph));
	}
}
