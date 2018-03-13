package org.gravity.goblin.repair;

import static org.gravity.hulk.HulkAPI.AntiPatternNames.Blob;
import static org.gravity.hulk.HulkAPI.AntiPatternNames.IGAM;
import static org.gravity.hulk.HulkAPI.AntiPatternNames.LCOM5;
import static org.gravity.hulk.HulkAPI.AntiPatternNames.TotalCoupling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.goblin.Utility;
import org.gravity.hulk.HulkAPI;
import org.gravity.typegraph.basic.TypeGraph;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.search.fitness.IFitnessFunction;
import at.ac.tuwien.big.moea.search.fitness.IMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension;
import at.ac.tuwien.big.moea.search.solution.repair.ISolutionRepairer;
import at.ac.tuwien.big.moea.util.MathUtil;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.fitness.IEGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.search.solution.repair.ITransformationRepairer;

public class PostProcessRepairMultiDimensionalFitnessFunction
		implements IEGraphMultiDimensionalFitnessFunction, IMultiDimensionalFitnessFunction<TransformationSolution> {

	ITransformationRepairer optimizationRepairer;

	@Override
	public IEGraphMultiDimensionalFitnessFunction setSolutionRepairer(ITransformationRepairer repairer) {
		this.repairer = repairer;
		return this;
	}

	public IEGraphMultiDimensionalFitnessFunction setOptimizationRepairer(ITransformationRepairer repairer) {
		this.optimizationRepairer = repairer;
		return this;
	}

	private double delegateEvaluation(final Solution solution) {
		boolean failedConstraint = false;
		
		int i = 0;
		for (final IFitnessDimension<TransformationSolution> dimension : constraints) {
			if (!failedConstraint) {
				final double constraintEvaluation = evaluate(dimension, solution);
				solution.setConstraint(i++, constraintEvaluation);
				failedConstraint = IFitnessDimension.CONSTRAINT_OK != constraintEvaluation;
			} else {
				solution.setConstraint(i++, Double.MAX_VALUE);
			}
		}

		i = 0;
		for (final IFitnessDimension<TransformationSolution> dimension : objectives) {
			if (!failedConstraint) {
				solution.setObjective(i++, evaluate(dimension, solution));
			} else {
				solution.setObjective(i++, Double.MAX_VALUE);
			}
		}

		return getAggregateFitness(solution);
	}

	@Override
	public double doEvaluate(Solution solution) {
		if (clazz.isInstance(solution)) {
			//Calculate metrics
			EGraph graph = ((TransformationSolution) solution).execute();
			TypeGraph pg = Utility.getPG(graph);
			Resource r = pg.eResource();
			if(r == null) {
				ResourceSetImpl rs = new ResourceSetImpl();
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", 
					       new XMIResourceFactoryImpl());
				r = rs.createResource(URI.createURI("pg.xmi"));
				r.getContents().add(pg);
			}
			HulkAPI.detect(pg, "", Blob, LCOM5, IGAM, TotalCoupling);
			
			double result = delegateEvaluation(solution);
			if (solution.violatesConstraints()) {
				// repair
				if (repairsSolutions() && solution != null) {
					solution = getSolutionRepairer().repair(clazz.cast(solution));
				}
				// re-evaluate
				result = delegateEvaluation(solution);
			}
			if (optimizationRepairer != null) {
				solution = optimizationRepairer.repair(clazz.cast(solution));
				// re-evaluate
				result = delegateEvaluation(solution);
			}
			return result;
		} else {
			throw new RuntimeException("wrong solution type");
		}
	}

	// ----------------------------Copied from
	// MultiDimensionalFitnessFunction---------------
	// Removed Post and Preprocessing methods
	// changed above methods
	protected List<IFitnessDimension<TransformationSolution>> objectives;
	protected List<IFitnessDimension<TransformationSolution>> constraints;

	protected Class<TransformationSolution> clazz;
	protected ISolutionRepairer<TransformationSolution> repairer;

	public PostProcessRepairMultiDimensionalFitnessFunction() {
		this.objectives = new ArrayList<>();
		this.constraints = new ArrayList<>();
		this.clazz = TransformationSolution.class;
	}

	@Override
	public <D extends IFitnessDimension<TransformationSolution>> IFitnessFunction<TransformationSolution> addConstraint(
			final D constraint) {
		constraints.add(constraint);
		return this;
	}

	@Override
	public <D extends IFitnessDimension<TransformationSolution>> IFitnessFunction<TransformationSolution> addObjective(
			final D objective) {
		objectives.add(objective);
		return this;
	}

	private double evaluate(final IFitnessDimension<TransformationSolution> dimension, final Solution solution) {
		final Double evaluation = dimension.doEvaluate(solution);
		if (dimension.isMaximumFunction()) {
			return -evaluation;
		}

		return evaluation;
	}

	@Override
	public double evaluate(final TransformationSolution solution) {
		return delegateEvaluation(solution);
	}

	@Override
	public int[] evaluatesConstraints() {
		final int[] constraintIndices = new int[constraints.size()];
		for (int i = 0; i < constraints.size(); i++) {
			constraintIndices[i] = i;
		}
		return constraintIndices;
	}

	@Override
	public int evaluatesNrConstraints() {
		return constraints.size();
	}

	@Override
	public int evaluatesNrObjectives() {
		return objectives.size();
	}

	@Override
	public int[] evaluatesObjectives() {
		final int[] objectiveIndices = new int[constraints.size()];
		for (int i = 0; i < constraints.size(); i++) {
			objectiveIndices[i] = i;
		}
		return objectiveIndices;
	}

	protected double getAggregateFitness(final Solution solution) {
		return MathUtil.getSum(solution.getObjectives(), solution.getConstraints());
	}

	protected IFitnessDimension<TransformationSolution> getByName(final String name,
			final Iterable<IFitnessDimension<TransformationSolution>> list) {
		for (final IFitnessDimension<TransformationSolution> dimension : list) {
			if (dimension.getName().equals(name)) {
				return dimension;
			}
		}
		return null;
	}

	@Override
	public IFitnessDimension<TransformationSolution> getConstraint(final String name) {
		return getByName(name, constraints);
	}

	@Override
	public int getConstraintIndex(final String name) {
		return getIndex(name, constraints);
	}

	@Override
	public String getConstraintName(final int index) {
		if (index < constraints.size()) {
			return constraints.get(index).getName();
		}
		return null;
	}

	@Override
	public List<String> getConstraintNames() {
		return getNames(constraints);
	}

	@Override
	public Collection<IFitnessDimension<TransformationSolution>> getConstraints() {
		return constraints;
	}

	protected int getIndex(final String name, final Iterable<IFitnessDimension<TransformationSolution>> values) {
		int index = 0;
		for (final IFitnessDimension<TransformationSolution> dimension : values) {
			if (dimension.getName().equals(name)) {
				return index;
			}
			index++;
		}
		return -1;
	}

	private List<String> getNames(final Iterable<IFitnessDimension<TransformationSolution>> list) {
		final List<String> names = new ArrayList<>();
		for (final IFitnessDimension<?> element : list) {
			names.add(element.getName());
		}
		return names;
	}

	@Override
	public IFitnessDimension<TransformationSolution> getObjective(final String name) {
		return getByName(name, objectives);
	}

	@Override
	public int getObjectiveIndex(final String name) {
		return getIndex(name, objectives);
	}

	@Override
	public String getObjectiveName(final int index) {
		if (index < objectives.size()) {
			return objectives.get(index).getName();
		}
		return null;
	}

	@Override
	public List<String> getObjectiveNames() {
		return getNames(objectives);
	}

	@Override
	public Collection<IFitnessDimension<TransformationSolution>> getObjectives() {
		return objectives;
	}

	@Override
	public ISolutionRepairer<TransformationSolution> getSolutionRepairer() {
		return repairer;
	}

	@Override
	public <D extends IFitnessDimension<TransformationSolution>> IFitnessFunction<TransformationSolution> removeConstraint(
			final D constraint) {
		throw new UnsupportedOperationException();
	}

	@Override
	public <D extends IFitnessDimension<TransformationSolution>> IFitnessFunction<TransformationSolution> removeConstraint(
			final String constraintName) {
		this.constraints.remove(getByName(constraintName, constraints));
		return this;
	}

	@Override
	public <D extends IFitnessDimension<TransformationSolution>> IFitnessFunction<TransformationSolution> removeObjective(
			final D objective) {
		this.objectives.remove(objective);
		return this;
	}

	@Override
	public <D extends IFitnessDimension<TransformationSolution>> IFitnessFunction<TransformationSolution> removeObjective(
			final String objectiveName) {
		this.objectives.remove(getByName(objectiveName, objectives));
		return this;
	}

	@Override
	public boolean repairsSolutions() {
		return getSolutionRepairer() != null;
	}

}
