package org.gravity.goblin.orchestration;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
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
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TSignature;

import at.ac.tuwien.big.moea.util.CollectionUtil;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.variable.ITransformationVariable;
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
		if (this.random == null) {
			this.random = new SecureRandom();
		}
		return this.random;
	}

	private final MoveMethodTransformationSearchOrchestration orchestration;

	public MoveMethodSearchHelper(final MoveMethodTransformationSearchOrchestration orchestration) {
		this.orchestration = orchestration;
		this.engine = orchestration.getEngine();
	}

	@Override
	public TransformationSearchOrchestration getSearchOrchestration() {
		return this.orchestration;
	}

	@Override
	public void setSearchOrchestration(final TransformationSearchOrchestration searchOrchestration) {
		// empty
		throw new UnsupportedOperationException();
	}

	private TClass getDifferentRandomClass(final EGraph graph, final TClass otherTClass) {
		final List<TClass> classes = EGraphUtil.getPG(graph).getDeclaredTClasses();
		classes.remove(otherTClass);
		if (classes.isEmpty()) {
			return null;
		}
		if (classes.size() == 1) {
			return classes.get(0);
		}
		final var index = getRandom().nextInt(classes.size());
		return classes.get(index);
	}

	private TMethodSignature getRandomMethodSig(final TClass sourceClass) {
		final List<TMethodSignature> methodSigs = new ArrayList<>();
		for (final TSignature sig : sourceClass.getSignature()) {
			if (sig instanceof TMethodSignature) {
				final var tMethodSignature = (TMethodSignature) sig;
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
		final var index = getRandom().nextInt(methodSigs.size());
		return methodSigs.get(index);
	}

	private ITransformationVariable moveMethodTransformationVariable(final EGraph graph, final int maxTries, final Unit chosenUnit) {

		final Assignment assignment = new AssignmentImpl(chosenUnit);
		final var sourceClassParam = chosenUnit.getParameter("sourceClass");
		final var targetClassParam = chosenUnit.getParameter("targetClass");
		final var methodSigParam = chosenUnit.getParameter("methodSig");

		return getMove(graph, maxTries, assignment, sourceClassParam, targetClassParam, methodSigParam);
	}

	private ITransformationVariable getMove(final EGraph graph, final int maxTries, final Assignment assignment,
			final Parameter sourceClassParam, final Parameter targetClassParam, final Parameter methodSigParam) {
		for (var i = 0; i < (10 * maxTries); i++) {
			final var sourceClass = getDifferentRandomClass(graph, null);
			assignment.setParameterValue(sourceClassParam, sourceClass);

			final var methodSig = getRandomMethodSig(sourceClass);
			if (methodSig == null) {
				continue;
			}
			assignment.setParameterValue(methodSigParam, methodSig);

			final Set<TClass> possibleTargets = new HashSet<>();
			for (final TParameter tParam : methodSig.getParameters()) {
				final var tType = tParam.getType();
				if ((tType instanceof TClass) && !tType.getSignature().contains(methodSig)) {
					possibleTargets.add((TClass) tType);
				}
			}
			for (final TSignature tSig : sourceClass.getSignature()) {
				if (tSig instanceof TFieldSignature) {
					final var tType = ((TFieldSignature) tSig).getType();
					if ((tType instanceof TClass) && !tType.getSignature().contains(methodSig)) {
						possibleTargets.add(((TClass) tType));

					}
				}
			}
			if (possibleTargets.isEmpty()) {
				continue;
			}

			final var targetClass = (TClass) possibleTargets.toArray()[this.random.nextInt(possibleTargets.size())];
			assignment.setParameterValue(targetClassParam, targetClass);

			final var application = createApplication(graph, assignment);

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
		final Unit chosenUnit = CollectionUtil.getRandomElement(units);

		if (chosenUnit.getName().equals("MoveMethod")) {
			return moveMethodTransformationVariable(graph, maxTries, chosenUnit);
		} else {
			return findUnitApplication(graph, maxTries, units, chosenUnit);
		}

	}

	private ITransformationVariable findUnitApplication(final EGraph graph, final int maxTries, final List<? extends Unit> units,
			Unit chosenUnit) {
		// try to apply rule until match is found or maxRuleTries is reached
		var nrUnitTries = maxTries;

		while (chosenUnit != null) {
			// create assignment with user-defined parameter values
			final var partialMatch = createPartialAssignment(chosenUnit);

			if (chosenUnit instanceof Rule) {
				// find matches
				final var foundMatches = getEngine()
						.findMatches((Rule) chosenUnit, graph, (Match) partialMatch).iterator();

				if ((foundMatches != null) && foundMatches.hasNext()) {
					// match found - break loop, return match
					final var match = foundMatches.next();
					final var application = createApplication(graph, match);
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
				final var application = createApplication(graph, partialMatch);
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
