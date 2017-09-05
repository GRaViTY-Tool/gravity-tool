package FitnessCalculators;

import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.impl.AntipatterngraphFactoryImpl;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.core.dfs.DFSGraph;

public abstract class MetricCalculator implements IFitnessCalculator{
	
	
	private double calculate(EClass detectorClass, HAntiPatternHandling hulk){
		double fitness = 0;
		HulkDetector hulkDetector = new HulkDetector(hulk, new Hashtable<String, String>());
		HashSet<HDetector> selected = new HashSet<HDetector>();
		hulkDetector.detectSelectedAntiPattern(Collections.singleton(detectorClass), selected, new HashSet<HDetector>());
		
		for(HAnnotation metric: selected.iterator().next().getHAnnotation()){
			if(metric instanceof HMetric){
				fitness += ((HMetric)metric).getValue();
			}
		}
		return fitness;
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
		
	public double calculate(EClass detectorClass, EGraph graph){
		return calculate(detectorClass, getHulk(graph));
	}
}
