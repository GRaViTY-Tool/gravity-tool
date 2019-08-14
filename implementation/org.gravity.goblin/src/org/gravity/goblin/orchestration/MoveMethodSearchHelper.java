package org.gravity.goblin.orchestration;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.AssignmentImpl;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.gravity.goblin.EGraphUtil;
import org.gravity.goblin.preconditions.MoveMethodPreConditions;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TSignature;

import at.ac.tuwien.big.moea.util.CollectionUtil;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.variable.ITransformationVariable;
import at.ac.tuwien.big.momot.problem.solution.variable.RuleApplicationVariable;
import at.ac.tuwien.big.momot.problem.solution.variable.UnitApplicationVariable;
import at.ac.tuwien.big.momot.search.solution.executor.SearchHelper;

/**
 * Applies the move method refactoring
 * 
 * @author speldszus
 *
 */
public class MoveMethodSearchHelper extends SearchHelper {

	private Random random;

	private Random getRandom() {
		if (random == null) {
			random = new SecureRandom();
		}
		return random;
	}

	private MoveMethodTransformationSearchOrchestration orchestration;

	public MoveMethodSearchHelper(MoveMethodTransformationSearchOrchestration orchestration) {
		this.orchestration = orchestration;
		this.engine = orchestration.getEngine();
	}

	@Override
	public TransformationSearchOrchestration getSearchOrchestration() {
		return orchestration;
	}

	@Override
	public void setSearchOrchestration(final TransformationSearchOrchestration searchOrchestration) {
		// empty
		throw new UnsupportedOperationException();
	}

	private TClass getDifferentRandomClass(EGraph graph, TClass otherTClass) {
		List<TClass> classes = EGraphUtil.getPG(graph).getDeclaredTClasses();
		classes.remove(otherTClass);
		if (classes.isEmpty()) {
			return null;
		}
		if (classes.size() == 1) {
			return classes.get(0);
		}
		int index = getRandom().nextInt(classes.size());
		return classes.get(index);
	}

	private TMethodSignature getRandomMethodSig(TClass sourceClass) {
		List<TMethodSignature> methodSigs = new ArrayList<TMethodSignature>();
		for (TSignature sig : sourceClass.getSignature()) {
			if (sig instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) sig;
				if (MoveMethodPreConditions.methodPreconditions(tMethodSignature, sourceClass)) {
					methodSigs.add(tMethodSignature);
				}

			}
		}
		if (methodSigs.isEmpty()) {
			return null;
		}
		if (methodSigs.size() == 1) {
			return methodSigs.get(0);
		}
		int index = getRandom().nextInt(methodSigs.size());
		return methodSigs.get(index);
	}

	private ITransformationVariable moveMethodTransformationVariable(EGraph graph, int maxTries, Unit chosenUnit) {

		Assignment assignment = new AssignmentImpl(chosenUnit);
		Parameter sourceClassParam = chosenUnit.getParameter("sourceClass");
		Parameter targetClassParam = chosenUnit.getParameter("targetClass");
		Parameter methodSigParam = chosenUnit.getParameter("methodSig");

		return getMove(graph, maxTries, assignment, sourceClassParam, targetClassParam, methodSigParam);
	}

	private ITransformationVariable getMove(EGraph graph, int maxTries, Assignment assignment,
			Parameter sourceClassParam, Parameter targetClassParam, Parameter methodSigParam) {
		for (int i = 0; i < 10 * maxTries; i++) {
			TClass sourceClass = getDifferentRandomClass(graph, null);
			assignment.setParameterValue(sourceClassParam, sourceClass);

			TMethodSignature methodSig = getRandomMethodSig(sourceClass);
			if (methodSig == null) {
				continue;
			}
			assignment.setParameterValue(methodSigParam, methodSig);

			Set<TClass> possibleTargets = new HashSet<TClass>();
			for (TParameter tParam : methodSig.getParamList().getEntries()) {
				TAbstractType tType = tParam.getType();
				if (tType instanceof TClass && !tType.getSignature().contains(methodSig)) {
					possibleTargets.add((TClass) tType);
				}
			}
			for (TSignature tSig : sourceClass.getSignature()) {
				if (tSig instanceof TFieldSignature) {
					TAbstractType tType = ((TFieldSignature) tSig).getType();
					if (tType instanceof TClass && !tType.getSignature().contains(methodSig)) {
						possibleTargets.add(((TClass) tType));

					}
				}
			}
			if (possibleTargets.isEmpty()) {
				continue;
			}

			TClass targetClass = (TClass) possibleTargets.toArray()[random.nextInt(possibleTargets.size())];
			assignment.setParameterValue(targetClassParam, targetClass);

			UnitApplicationVariable application = createApplication(graph, assignment);

			if (application.execute(getMonitor())) {
				application.setAssignment(application.getResultAssignment());
				return cleanVariable(application);
			} else {
				application.undo(getMonitor());
			}
		}
		return null;
	}

	@Override
	public ITransformationVariable findUnitApplication(final EGraph graph, final int maxTries) {
		// choose a unit randomly
		final List<? extends Unit> units = new ArrayList<>(getUnits());
		Unit chosenUnit = CollectionUtil.getRandomElement(units);

		if (chosenUnit.getName().equals("MoveMethodMain")) {
			return moveMethodTransformationVariable(graph, maxTries, chosenUnit);
		} else {
			return findUnitApplication(graph, maxTries, units, chosenUnit);
		}

	}

	private ITransformationVariable findUnitApplication(EGraph graph, int maxTries, List<? extends Unit> units,
			Unit chosenUnit) {
		// try to apply rule until match is found or maxRuleTries is reached
		int nrUnitTries = maxTries;

		while (chosenUnit != null) {
			// create assignment with user-defined parameter values
			final Assignment partialMatch = createPartialAssignment(chosenUnit);

			if (chosenUnit instanceof Rule) {
				// find matches
				final Iterator<Match> foundMatches = getEngine()
						.findMatches((Rule) chosenUnit, graph, (Match) partialMatch).iterator();

				if (foundMatches != null && foundMatches.hasNext()) {
					// match found - break loop, return match
					final Match match = foundMatches.next();
					final RuleApplicationVariable application = createApplication(graph, match);
					if (application.execute(getMonitor())) {
						for (final Parameter param : chosenUnit.getParameters()) {
							application.setParameterValue(param, application.getResultParameterValue(param));
						}
						return cleanVariable(application);
					} else {
						application.undo(getMonitor());
					}
				}
			} else {
				final UnitApplicationVariable application = createApplication(graph, partialMatch);
				if (application.execute(getMonitor())) {
					application.setAssignment(application.getResultAssignment());
					return cleanVariable(application);
				} else {
					application.undo(getMonitor());
				}
			}

			if (--nrUnitTries <= 0) {
				// try other rule
				units.remove(chosenUnit); // don't try this rule again
				chosenUnit = CollectionUtil.getRandomElement(units);
				nrUnitTries = maxTries;
			}
		}
		return null; // no match found with the number of tries
	}

	@Override
	public List<ITransformationVariable> findUnitApplications(final EGraph graph) {
		throw new UnsupportedOperationException();
	}

	private ITransformationVariable cleanVariable(final ITransformationVariable variable) {
		getModuleManager().clearNonSolutionParameters(variable);
		return variable;
	}
}
