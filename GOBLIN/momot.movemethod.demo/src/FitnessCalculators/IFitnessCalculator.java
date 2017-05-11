package FitnessCalculators;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.TypeGraph;

public interface IFitnessCalculator {

	public double calculate(EGraph graph);
	
}
