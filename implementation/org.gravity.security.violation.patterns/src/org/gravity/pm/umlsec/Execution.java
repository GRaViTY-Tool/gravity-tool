package org.gravity.pm.umlsec;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.MatchImpl;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Model;
import org.gravity.tgg.pm.uml.Type2TAbstractType;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.tgg.runtime.CorrespondenceModel;

import carisma.profile.umlsec.critical;

public class Execution {

	private static final Logger LOGGER = Logger.getLogger(Execution.class);

	private static final boolean INJECT = false;
	private static final boolean FULL = false;
	private HenshinResourceSet set;

	public static void main(final String[] args) throws IOException {
		final List<String> arguments = Arrays.asList(args);
		final var inject = INJECT || arguments.contains("-i") || arguments.contains("inject");
		final var full = FULL || arguments.contains("-f") || arguments.contains("full");
		final var builder = new StringBuilder("Executing ");
		if(full) {
			builder.append("full and incremental ");
		}
		else {
			builder.append("only incremental ");
		}
		builder.append("security violation patterns on a ");
		if(inject) {
			builder.append("system to wich one violation has been injected.");
		}
		else {
			builder.append("compliant system.");
		}
		LOGGER.info(builder);

		final var execution = new Execution();

		execution.load("instances/itrust/", "bi_corr.xmi");
		execution.detect(inject, full);
		LOGGER.info("done");
	}

	private long full;

	private CorrespondenceModel load(final String folder, final String file) throws IOException {
		LOGGER.info("Load models");
		final var start = System.currentTimeMillis();
		this.set = FixSecureDependency.initResourceSet(folder);
		this.pm = (TypeGraph) this.set.getResource("pm/pm.xmi").getContents().get(0);
		this.uml = (Model) this.set.getResource("uml/iTrust.uml").getContents().get(0);
		this.corr = (CorrespondenceModel) this.set.getResource(file).getContents().get(0);
		EcoreUtil.resolveAll(this.corr);
		done(start);
		return this.corr;
	}

	private void detect(final boolean inject, final boolean full) {
		LOGGER.info("Initialize Henshin");
		var start = System.currentTimeMillis();
		final List<EObject> umlContents = this.uml.eResource().getContents();

		simplifySecrecy(umlContents);
		Classifier assumeChanged;
		if (inject) {
			assumeChanged = insertViolation();
		} else {
			assumeChanged = getRandomClassifier(this.uml);
		}

		final List<EObject> roots = new ArrayList<>(umlContents.size() + 2);
		roots.add(this.pm);
		roots.add(this.corr);
		roots.addAll(umlContents);
		final EGraph graph = new EGraphImpl(roots);
		final var module = this.set.getModule(new File("SecureDependency.henshin").getAbsolutePath());
		final var rule = module.getAllRules().get(0);
		final var parameter = rule.getParameter("supplierClass");
		done(start);

		LOGGER.info("Incremental compliance check");
		final List<Match> incrementalMatches = new LinkedList<>();
		final var clientNode = rule.getLhs().getNode("clientClass");

		start = System.currentTimeMillis();
		final Engine engine = new EngineImpl("org.gravity.pm.umlsec.SignatureHelper");
		final var match = new MatchImpl(rule);
		match.setNodeTarget(clientNode, assumeChanged);
		for (final Match m : engine.findMatches(rule, graph, match)) {
			incrementalMatches.add(m);
		}
		final var incremental = System.currentTimeMillis() - start;
		done(start);

		LOGGER.info("There are " + incrementalMatches.size()
		+ " matches in the incremental compliance check using security violation patterns.");

		LOGGER.info("Incremental matching took " + (incremental / 1000d) + "s");

		if (full) {
			System.out.print("Full compliance check");
			start = System.currentTimeMillis();
			final var fullMatches = getAllValues(graph, rule, parameter);
			done(start);
			LOGGER.info("There are " + fullMatches.size()
			+ " matches int the full compliance check using security violation patterns.");
			LOGGER.info("Full matching took " + (this.full / 1000d) + "s");
			LOGGER.info("Speedup: " + (this.full / incremental));
		}
	}

	/**
	 * @param umlContents
	 */
	private void simplifySecrecy(final List<EObject> umlContents) {
		umlContents.parallelStream().forEach(root -> {
			if (root instanceof critical) {
				final var secrecy = ((critical) root).getSecrecy();
				final List<String> values = secrecy.stream().map(value -> {
					final var index = value.indexOf('(');
					return (index < 0 ? value : value.substring(0, index));
				}).collect(Collectors.toList());
				secrecy.clear();
				secrecy.addAll(values);
			}
		});
	}

	private Classifier insertViolation() {
		final var umlsec = FixSecureDependency.applyUMLsec(this.set, this.uml);

		final var classes = this.pm.getDeclaredTClasses().parallelStream()
				.filter(c -> c.getDeclaredTMethodDefinitions().stream().anyMatch(m -> !m.getAccessedBy().isEmpty()))
				.collect(Collectors.toList());
		final var tSupplier = classes.get(this.rnd.nextInt(classes.size()));
		final List<TMethodDefinition> methods = tSupplier.getDeclaredTMethodDefinitions().stream()
				.filter(m -> !m.getAccessedBy().isEmpty()).collect(Collectors.toList());
		final var supplierMethod = methods.get(this.rnd.nextInt(methods.size()));
		final var accesses = supplierMethod.getAccessedBy();
		final var clientMethod = accesses.get(this.rnd.nextInt(accesses.size())).getSource();
		final var tClient = clientMethod.getDefinedBy();
		final var classCorrespondences = this.corr.getCorrespondences().parallelStream()
				.filter(Type2TAbstractType.class::isInstance).map(Type2TAbstractType.class::cast)
				.collect(Collectors.toList());
		final var supplier = (Classifier) classCorrespondences.parallelStream().filter(c -> c.getTarget() == tSupplier)
				.map(Type2TAbstractType::getSource).findAny().orElse(null);
		var critical = supplier.getStereotypeApplications().stream().filter(critical.class::isInstance).findAny()
				.map(critical.class::cast).orElse(null);
		if (critical == null) {
			critical = (critical) supplier.applyStereotype(umlsec.getOwnedStereotype("critical"));
		}
		if (supplier.getStereotypeApplications().isEmpty()) {
			throw new IllegalStateException("Applying critical failed!");
		}
		critical.getSecrecy().add(supplierMethod.getSignature().getMethod().getTName());
		return (Classifier) classCorrespondences.parallelStream().filter(c -> c.getTarget() == tClient)
				.map(Type2TAbstractType::getSource).findAny().orElse(null);
	}

	/**
	 * @param umlContents
	 * @return
	 */
	private Classifier getRandomClassifier(final Model model) {
		final List<Classifier> classes = new LinkedList<>();
		model.eAllContents().forEachRemaining(o -> {
			if (o instanceof Classifier) {
				classes.add((Classifier) o);
			}
		});
		final var randomClassifier = classes.get(new Random().nextInt(classes.size()));
		return randomClassifier;
	}

	/**
	 * @param start
	 */
	private void done(final long start) {
		LOGGER.info(" -> done (" + ((System.currentTimeMillis() - start) / 1000d) + "s)");
	}

	/**
	 * @param graph
	 * @param rule
	 * @param parameter
	 * @return
	 */
	private List<Match> getAllValues(final EGraph graph, final Rule rule, final Parameter parameter) {
		final List<Match> matches = new LinkedList<>();
		final var start = System.currentTimeMillis();
		final Engine engine = new EngineImpl("org.gravity.pm.umlsec.SignatureHelper");
		for (final Match m : engine.findMatches(rule, graph, null)) {
			matches.add(m);
		}
		this.full = System.currentTimeMillis() - start;
		return matches;
	}

	private TypeGraph pm;
	private Model uml;
	private CorrespondenceModel corr;
	private final Random rnd = new Random();

}
