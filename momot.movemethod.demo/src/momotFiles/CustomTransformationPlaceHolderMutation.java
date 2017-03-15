package momotFiles;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.impl.TMethodDefinitionImpl;
import org.gravity.typegraph.basic.impl.TMethodSignatureImpl;
import org.moeaframework.core.PRNG;

import com.google.common.reflect.Parameter;

import at.ac.tuwien.big.moea.util.MathUtil;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.problem.solution.variable.ITransformationVariable;
import at.ac.tuwien.big.momot.problem.solution.variable.TransformationPlaceholderVariable;
import at.ac.tuwien.big.momot.search.algorithm.operator.mutation.TransformationPlaceholderMutation;

public class CustomTransformationPlaceHolderMutation extends TransformationPlaceholderMutation{

	
	List<TClass> pgClasses;
	private List<TClass> getPGClasses(TypeGraph pg){
		if(pgClasses == null){
			pgClasses = new ArrayList<TClass>();
			for(TClass tClass: pg.getClasses()){
				if(!tClass.isTLib() && !tClass.getTName().equals("T")){
					pgClasses.add(tClass);
				}
			}
			
			
		}
		return pgClasses;
	}
	
		
	public CustomTransformationPlaceHolderMutation(double probability) {
		super(probability);
		// TODO Auto-generated constructor stub
	}
	
	
	private TClass getNewClass(TClass sourceClass, TClass currentTargetClass, TypeGraph pg){
		List<TClass> tClasses = getPGClasses(pg);
		for(int i = 0; i < 10; i++){
			
			final int randomVariable = MathUtil.randomInteger(tClasses.size()-1);
			TClass tClass = tClasses.get(randomVariable);
			if(tClass != sourceClass && tClass != currentTargetClass){
				return tClass;
			}
		}
		return currentTargetClass;
		
	}
	
	private TMethodSignatureImpl getNewMethod(TClass sourceClass, TMethodSignatureImpl methodSig){
		List<TMember> members = sourceClass.getDefines();
		List<TMethodDefinition> methodDefs = new ArrayList<TMethodDefinition>();
		
		
		
		for(TMember member: members){
			if(member instanceof TMethodDefinition){
				methodDefs.add((TMethodDefinition) member);
			}
		}
		if(methodDefs.size() <= 0){
			return methodSig;
		}
		for(int i = 0; i < 10; i++){
		final int randomVariable = MathUtil.randomInteger(methodDefs.size()-1);

			TMethodDefinition methodDef = methodDefs.get(randomVariable);
			if(methodDef.getSignature() != methodSig){
				return (TMethodSignatureImpl)methodDef.getSignature();
			}
		}
		return methodSig;
	}
	
	@Override
	protected TransformationSolution mutate(TransformationSolution mutant) {
		
		double random= PRNG.nextDouble();
		
		
		//TODO remove
		/*
		final int randomVariable = MathUtil.randomInteger(mutant.getNumberOfVariables());
		ITransformationVariable variable = mutant.getVariable(randomVariable);
		Assignment assigment = variable.getAssignment();
		if(assigment != null && assigment.getParameterValues().size() == 3){
			TMethodSignatureImpl method = (TMethodSignatureImpl) assigment.getParameterValues().get(0);
			TClass sourceClass = (TClass) assigment.getParameterValues().get(1);
			TClass currentTargetClass = (TClass) assigment.getParameterValues().get(2);
			
			for(TClass newSourceClass: ((TypeGraph)mutant.getSourceGraph().getRoots().get(0)).getClasses()){
				if(newSourceClass.getTName().equals("MailApp")){
					variable.setParameterValue("sourceClass", newSourceClass);
					sourceClass = newSourceClass;
					break;
				}
			}
			
			for(TClass newTargetClass: ((TypeGraph)mutant.getSourceGraph().getRoots().get(0)).getClasses()){
				if(newTargetClass.getTName().equals("Contact")){
					variable.setParameterValue("targetClass", newTargetClass);
					break;
				}
			}
			
			for(TMember member: sourceClass.getDefines()){
				if(member instanceof TMethodDefinitionImpl){
					if(((TMethodDefinitionImpl)member).getSignature().getMethod().getTName().equals("createContact")){
						variable.setParameterValue("methodSig", ((TMethodDefinitionImpl)member).getSignature());
					}
				}
			}
		}
		return mutant;
		*/
		
		if(random > 0.8){
			return super.mutate(mutant);
		}else{
			final int randomVariable = MathUtil.randomInteger(mutant.getNumberOfVariables());
			ITransformationVariable variable = mutant.getVariable(randomVariable);
			Assignment assigment = variable.getAssignment();
			if(assigment != null && assigment.getParameterValues().size() == 3){
				TMethodSignatureImpl method = (TMethodSignatureImpl) assigment.getParameterValues().get(0);
				TClass sourceClass = (TClass) assigment.getParameterValues().get(1);
				TClass currentTargetClass = (TClass) assigment.getParameterValues().get(2);
			
				// mutate for a new targetClass
				if(random >= 0.4){		
					TClass newClass = getNewClass(sourceClass, currentTargetClass, (TypeGraph)mutant.getSourceGraph().getRoots().get(0));
					variable.setParameterValue("targetClass", newClass);
				}
				//mutate for a new method in sourceClass
				else {
					TMethodSignatureImpl newSig = getNewMethod(sourceClass, method);
					variable.setParameterValue("methodSig", newSig);				
				}		
			}
			return mutant;	
		}
	}

}
