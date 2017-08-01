package ConstraintCalculators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;

import FitnessCalculators.IFitnessCalculator;

public class AllConstraintsCalculator extends ConstraintCalculator {

	private List<ConstraintCalculator> getCalcs(){
		ArrayList<ConstraintCalculator> list = new ArrayList<>();
		list.add(new VisibilityConstraintCalculator());
		list.add(new SubTypesConstraintCalculator());
		list.add(new AccessConstraintCalculator());
		list.add(new InheritanceConstraintCalculator());
		return list;
	}
	
	@Override
	public double calculate(TypeGraph graph) {
		double violations = 0;
		for(ConstraintCalculator calc: getCalcs()){
			violations += calc.calculate(graph);
		}	
		return violations;
	}

	@Override
	public Map<TMember, TVisibility> violations(TypeGraph graph) {
		HashMap<TMember, TVisibility> violations =  new HashMap<TMember, TVisibility>();
		for(ConstraintCalculator calc: getCalcs()){
			violations.putAll(calc.violations(graph));
		}	
		return violations;
	}
	
}
