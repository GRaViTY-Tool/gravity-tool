package Repair;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.annotations.TAnnotation;

import ConstraintCalculators.ConstraintCalculator;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.solution.repair.AbstractTransformationSolutionRepairer;
import momotFiles.searchTypeGraph;
import momotFiles.searchTypeGraph.FitnessFunction;

public class VisibilityRepairer extends AbstractTransformationSolutionRepairer{

	@Override
	public TransformationSolution repair(TransformationSolution solution) {
		EGraph graph = solution.getResultGraph();
		for(FitnessFunction constraint: searchTypeGraph.constraints){
			if(constraint.calculator instanceof ConstraintCalculator){
				ConstraintCalculator calc = (ConstraintCalculator) constraint.calculator;
				
				Map<TMember, TVisibility> violations = calc.violations(solution.getResultGraph());
				for(Entry<TMember, TVisibility> violation : calc.violations(solution.getResultGraph()).entrySet()){
					if(checkPreconditions(violation)){
						violation.getKey().getTAnnotation().add(new RepairAnnotation(violation.getKey().getTModifier().getTVisibility(), violation.getValue()));
						violation.getKey().getTModifier().setTVisibility(violation.getValue());
					}
				}
				
			}
			
		}
		return solution;
	}

	//if a childClass implements an interface with the same field as the field in the violation do not change the visibility as this may introduce ambiguity
	private boolean checkINH2Preconditions(TClass sourceClass,Entry<TMember, TVisibility> violation){
		if(!(violation.getKey() instanceof TFieldDefinition)){
			return true;
		}
		if(!violation.getKey().getTModifier().isIsStatic()){
			return true;
		}
		
		for(TClass child : sourceClass.getChildClasses()){
			for(TInterface tInterface: child.getImplements()){
				
				for(TMember member: tInterface.getDefines()){
					if(member.getTModifier() == null){
						return false;
					}					
					if(member.getTModifier().isIsStatic() 
						&& member.getSignature() == violation.getKey().getSignature()){
						return false;
					}
				}
			}			
		}
		return true;
	}
	
	//if a parentclass defines a method with the same signature do not change the visibility as this may introduce a new dynamic binding
	private boolean checkDynPreconditions(TClass sourceClass, Entry<TMember, TVisibility> violation){
				
		TClass parent = sourceClass.getParentClass();
		if(parent == null){
			return true;
		}
		for(TMember member: parent.getDefines()){
			if(member.getSignature() == violation.getKey().getSignature()){
				return false;
			}
		}
		return true;
	}
	
	private boolean isSecurityAnnotation(TAnnotation annotation){
		if(annotation.getType().getTName().equals("High")){
			return true;
		}
		if(annotation.getType().getTName().equals("Critical")){
			return true;
		}		
		if(annotation.getType().getTName().equals("Secrecy")){
			return true;
		}
		if(annotation.getType().getTName().equals("Integrity")){
			return true;
		}
		
		return false;
		
	}
	
	private boolean checkSecurityPreconditions(TClass sourceClass, Entry<TMember, TVisibility> violation){
		for(TAnnotation annotation: violation.getKey().getTAnnotation()){
			if(isSecurityAnnotation(annotation)){
				return false;
			}
		}
		return true;
	}

	private boolean checkPreconditions(Entry<TMember, TVisibility> violation) {
		TAbstractType definedBy = violation.getKey().getDefinedBy();
		// do not change method visibility that is not defined by a class
		if(!(definedBy instanceof TClass)){
			return false;
		}
		TClass sourceClass = ((TClass)definedBy);
		boolean result = checkDynPreconditions(sourceClass, violation) ;
		result &= checkINH2Preconditions(sourceClass, violation);
		result &= checkSecurityPreconditions(sourceClass, violation);
		
		return result;
	}

	
}
