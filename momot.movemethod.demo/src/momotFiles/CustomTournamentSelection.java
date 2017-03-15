package momotFiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.eclipse.emf.henshin.interpreter.Assignment;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.impl.TMethodSignatureImpl;
import org.moeaframework.core.Population;
import org.moeaframework.core.Solution;
import org.moeaframework.core.Variable;
import org.moeaframework.core.operator.TournamentSelection;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.problem.solution.variable.ITransformationVariable;

public class CustomTournamentSelection extends TournamentSelection{
	static int generationCount = 0;
	PrintWriter writer;
	
	
	public CustomTournamentSelection(int size) {
		super(2);
		// TODO Auto-generated constructor stub
	}
	
	private void WriteLine(String line){
		if(writer == null){
			try {
				writer = new PrintWriter("log.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		writer.println(line);
		writer.flush();
		//System.out.println(line);
	}
	
	private void printSolution(Solution solution){
		for(int i = 0; i < solution.getNumberOfVariables(); i++){
			Variable var = solution.getVariable(i);
			
			Assignment assigment = ((ITransformationVariable) var).getAssignment();
			if(assigment != null && assigment.getParameterValues().size() == 3){
				TMethodSignatureImpl method = (TMethodSignatureImpl) assigment.getParameterValues().get(0);
				TClass sourceClass = (TClass) assigment.getParameterValues().get(1);
				TClass currentTargetClass = (TClass) assigment.getParameterValues().get(2);
				WriteLine("Method: "+method.getMethod().getTName()+"; SourceClass: "+sourceClass.getTName()+";TargetClass: "+currentTargetClass.getTName());
				
				if(method.getMethod().getTName().equals("createContact") && currentTargetClass.getTName().equals("Contact")){
					int y = 0;
					y++;
				}
				
			}else{
				WriteLine("Placeholder");
			}
			WriteLine("----------------");
		}
		WriteLine("Fitness: "+FitnessCalculator.calculateCoupling((TypeGraph)((TransformationSolution)solution).execute().getRoots().get(0)));
	}
	
	@Override
	public Solution[] select(int arg0, Population arg1) {
		WriteLine("Generation: " +generationCount);
		int solutionCount = 0;
		for(Solution sol: arg1){
			WriteLine("Induvidum: "+solutionCount);
			printSolution(sol);
			solutionCount++;
		}
		WriteLine("-------------------------------------------------------");
		generationCount++;
		
		// TODO Auto-generated method stub
		return super.select(arg0, arg1);
	}

}
