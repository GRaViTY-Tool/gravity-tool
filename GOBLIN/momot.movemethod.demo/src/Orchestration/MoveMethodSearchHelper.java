package Orchestration;

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
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TVisibility;

import ConstraintCalculators.AllConstraintsCalculator;
import ConstraintCalculators.ViolationsMap;
import PreConditions.ChangeVisibilityPreConditions;
import PreConditions.MoveMethodPreConditions;
import at.ac.tuwien.big.moea.util.CollectionUtil;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.variable.ITransformationVariable;
import at.ac.tuwien.big.momot.problem.solution.variable.RuleApplicationVariable;
import at.ac.tuwien.big.momot.problem.solution.variable.UnitApplicationVariable;
import at.ac.tuwien.big.momot.search.solution.executor.SearchHelper;
import momotFiles.Utility;

public class MoveMethodSearchHelper extends SearchHelper {
	Random random;

	private Random getRandom() {
		if (random == null) {
			random = new Random();
		}
		return random;
	}

	MoveMethodTransformationSearchOrchestration orchestration;

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
		throw new RuntimeException("");
	}

	private TClass getDifferentRandomClass(EGraph graph, TClass otherTClass) {
		List<TClass> classes = Utility.getDefinedClasses(Utility.getPG(graph));
		classes.remove(otherTClass);
		if (classes.size() == 0) {
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
		if (methodSigs.size() == 0) {
			return null;
		}
		if (methodSigs.size() == 1) {
			return methodSigs.get(0);
		}
		int index = getRandom().nextInt(methodSigs.size());
		return methodSigs.get(index);
	}
	
	private TFieldSignature getRandomFieldSig(TClass sourceClass) {
		List<TFieldSignature> fieldSigs = new ArrayList<TFieldSignature>();
		for (TSignature sig : sourceClass.getSignature()) {
			if (sig instanceof TFieldSignature) {
				TFieldSignature tfieldSignature = (TFieldSignature) sig;
				fieldSigs.add(tfieldSignature);

			}
		}
		if (fieldSigs.size() == 0) {
			return null;
		}
		if (fieldSigs.size() == 1) {
			return fieldSigs.get(0);
		}
		int index = getRandom().nextInt(fieldSigs.size());
		return fieldSigs.get(index);
	}

	private ITransformationVariable moveMethodTransformationVariable(EGraph graph, int maxTries,
			List<? extends Unit> units, Unit chosenUnit) {

		Assignment assignment = new AssignmentImpl(chosenUnit);
		Parameter sourceClassParam = chosenUnit.getParameter("sourceClass");
		Parameter targetClassParam = chosenUnit.getParameter("targetClass");
		Parameter methodSigParam = chosenUnit.getParameter("methodSig");

		return getMove(graph, maxTries, assignment, sourceClassParam, targetClassParam, methodSigParam);
	}

	private ITransformationVariable getMove(EGraph graph, int maxTries, Assignment assignment,
			Parameter sourceClassParam, Parameter targetClassParam, Parameter methodSigParam) {
		for (int i = 0; i < 10*maxTries; i++) {
			TClass sourceClass = getDifferentRandomClass(graph, null);
			assignment.setParameterValue(sourceClassParam, sourceClass);

			TMethodSignature methodSig = getRandomMethodSig(sourceClass);
			if (methodSig == null) {
				continue;
			}
			assignment.setParameterValue(methodSigParam, methodSig);
			
			Set<TClass> possibleTargets = new HashSet<TClass>();
			for(TParameter tParam : methodSig.getParamList().getEntries()){
				TAbstractType tType = tParam.getType();
				if (tType instanceof TClass && !tType.getSignature().contains(methodSig)) {
					possibleTargets.add((TClass) tType);
				}
			}
			for(TSignature tSig : sourceClass.getSignature()){
				if (tSig instanceof TFieldSignature) {
					TAbstractType tType = ((TFieldSignature) tSig).getType();
					if (tType instanceof TClass && !tType.getSignature().contains(methodSig)) {
						possibleTargets.add(((TClass) tType));
						
					}					
				}
			}
			if(possibleTargets.size()==0){
				continue;
			}
			
			TClass targetClass = (TClass) possibleTargets.toArray()[random.nextInt(possibleTargets.size())];
			assignment.setParameterValue(targetClassParam, targetClass);
			
			UnitApplicationVariable application = createApplication(graph, assignment);

			if (application.execute(getMonitor())) {
				application.setAssignment(application.getResultAssignment());
				return clean(application);
			} else {
				application.undo(getMonitor());
			}
		}
		return null;
	}

	private ITransformationVariable getRandomMove(EGraph graph, int maxTries, Assignment assignment,
			Parameter sourceClassParam, Parameter targetClassParam, Parameter methodSigParam) {
		for (int i = 0; i < 10*maxTries; i++) { // changed to 10*
			TClass sourceClass = getDifferentRandomClass(graph, null);
			assignment.setParameterValue(sourceClassParam, sourceClass);

			TClass targetClass = getDifferentRandomClass(graph, sourceClass);
			assignment.setParameterValue(targetClassParam, targetClass);

			TMethodSignature methodSig = getRandomMethodSig(sourceClass);
			if (methodSig == null) {
				continue;
			}
			assignment.setParameterValue(methodSigParam, methodSig);
			
			if (!MoveMethodPreConditions.moveMethodPreconditions(methodSig, sourceClass, targetClass)) {
				continue;
			}

			UnitApplicationVariable application = createApplication(graph, assignment);

			if (application.execute(getMonitor())) {
				application.setAssignment(application.getResultAssignment());
				return clean(application);
			} else {
				application.undo(getMonitor());
			}
		}
		return null;
	}
	
	
	
	private ITransformationVariable getVisTransformationVariable(EGraph graph, TClass sourceClass, TSignature memberSignature, Assignment assignment, Parameter oldVisParam, Parameter newVisParam) {
		TMember member = null;
		
		for (TMember methodDef : sourceClass.getDefines()) {
			if(methodDef.getSignature().equals(memberSignature)){
				member = methodDef;
			}
		}
		
		if (!ChangeVisibilityPreConditions.checkPreconditions(member, sourceClass)) {
			return null;
		}
		
		TVisibility oldVis = member.getTModifier().getTVisibility();
		
		assignment.setParameterValue(oldVisParam, oldVis);
		
		TVisibility newVis =  TVisibility.TPRIVATE;
		
		member.getTModifier().setTVisibility(newVis);
		ViolationsMap violations = new AllConstraintsCalculator().memberLeadsToViolations(member);
		if(violations.size() > 0){
			newVis = violations.getHashmap().get(member);
		}
		
		member.getTModifier().setTVisibility(oldVis);
		if(newVis.equals(oldVis)) {
			//no need for a transformation if the visibility stays the same
			return null;
		}
		
		assignment.setParameterValue(newVisParam, newVis);
		
		UnitApplicationVariable application = createApplication(graph, assignment);

		if (application.execute(getMonitor())) {
			application.setAssignment(application.getResultAssignment());
			return clean(application);
		} else {
			application.undo(getMonitor());
			return null;
		}
	}
	
	private ITransformationVariable changeMethodVisTransformationVariable(EGraph graph, int maxTries,
			List<? extends Unit> units, Unit chosenUnit) {

		Assignment assignment = new AssignmentImpl(chosenUnit);
		Parameter sourceClassParam = chosenUnit.getParameter("sourceClass");
		Parameter oldVisParam = chosenUnit.getParameter("oldVis");
		Parameter newVisParam = chosenUnit.getParameter("newVis");
		Parameter methodSigParam = chosenUnit.getParameter("methodSig");

		for (int i = 0; i < maxTries; i++) {
			TClass sourceClass = getDifferentRandomClass(graph, null);
			assignment.setParameterValue(sourceClassParam, sourceClass);

			TMethodSignature methodSig = getRandomMethodSig(sourceClass);
			if (methodSig == null) {
				continue;
			}
			assignment.setParameterValue(methodSigParam, methodSig);
			ITransformationVariable visTransformation = getVisTransformationVariable(graph, sourceClass, methodSig, assignment, oldVisParam, newVisParam);
			if(visTransformation != null) {
				return visTransformation;
			}
		}
		return null;
	}
	
	private ITransformationVariable changeFieldVisTransformationVariable(EGraph graph, int maxTries,
			List<? extends Unit> units, Unit chosenUnit) {

		Assignment assignment = new AssignmentImpl(chosenUnit);
		Parameter sourceClassParam = chosenUnit.getParameter("sourceClass");
		Parameter oldVisParam = chosenUnit.getParameter("oldVis");
		Parameter newVisParam = chosenUnit.getParameter("newVis");
		Parameter fieldSigParam = chosenUnit.getParameter("fieldSig");

		for (int i = 0; i < maxTries; i++) {
			TClass sourceClass = getDifferentRandomClass(graph, null);
			assignment.setParameterValue(sourceClassParam, sourceClass);

			TFieldSignature fieldSig = getRandomFieldSig(sourceClass);
			if (fieldSig == null) {
				continue;
			}
			assignment.setParameterValue(fieldSigParam, fieldSig);
			
			
			ITransformationVariable visTransformation = getVisTransformationVariable(graph, sourceClass, fieldSig, assignment, oldVisParam, newVisParam);
			if(visTransformation != null) {
				return visTransformation;
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
			return moveMethodTransformationVariable(graph, maxTries, units, chosenUnit);
		} else if(chosenUnit.getName().equals("changeMethodVisibility")) {
			return changeMethodVisTransformationVariable(graph, maxTries, units, chosenUnit);
		} else if(chosenUnit.getName().equals("changeFieldVisibility")) {
			return changeFieldVisTransformationVariable(graph, maxTries, units, chosenUnit);
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
						return clean(application);
					} else {
						application.undo(getMonitor());
					}
				}
			} else {
				final UnitApplicationVariable application = createApplication(graph, partialMatch);
				if (application.execute(getMonitor())) {
					application.setAssignment(application.getResultAssignment());
					return clean(application);
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
		throw new RuntimeException();
	}

	private ITransformationVariable clean(final ITransformationVariable variable) {
		getModuleManager().clearNonSolutionParameters(variable);
		return variable;
	}
}
