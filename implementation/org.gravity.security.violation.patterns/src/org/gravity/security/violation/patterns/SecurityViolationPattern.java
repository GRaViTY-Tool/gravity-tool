package org.gravity.security.violation.patterns;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.uml2.uml.Model;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.impl.HDetectorImpl;
import org.gravity.security.violation.patterns.violations.ViolationsFactory;
import org.gravity.security.violation.patterns.violations.ViolationsPackage;
import org.gravity.tgg.pm.uml.CorrespondenceGraphGenerator;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.tgg.runtime.CorrespondenceModel;

import carisma.core.analysis.AnalysisHost;
import carisma.core.analysis.result.AnalysisResultMessage;
import carisma.core.analysis.result.StatusType;
import carisma.core.checks.CarismaCheckWithID;
import carisma.core.checks.CheckParameter;
import carisma.profile.umlsec.UmlsecPackage;
import carisma.profile.umlsec.critical;

public class SecurityViolationPattern extends HDetectorImpl implements CarismaCheckWithID {

	public static final String CHECK_NAME = "Security Violation Pattern";
	public static final String CARISMA_ID = "org.gravity.security.violation.patterns.securedependency";

	private TypeGraph pm;
	private CorrespondenceModel corr;
	private Model uml;

	private final HenshinResourceSet set;
	private final Rule rule;

	public SecurityViolationPattern() {
		this.set = new HenshinResourceSet();
		final var module = this.set.getModule(SecurityViolationPatternsActivator.URI_PATTERN_RULE, true);
		this.rule = module.getAllRules().get(0);
	}

	private void init(final CorrespondenceModel corr) {
		this.corr = corr;
		this.pm = (TypeGraph) corr.getTarget();
		this.uml = (Model) corr.getSource();
		this.set.getResources().add(this.pm.eResource());
		this.set.getResources().add(this.uml.eResource());
		this.set.getResources().add(this.corr.eResource());
	}

	public List<Match> detect(final CorrespondenceModel corr) {
		final var oldSet = corr.eResource().getResourceSet();
		init(corr);
		final List<EObject> umlContents = this.uml.eResource().getContents();
		final var signatures = replaceAllWithNames(umlContents);
		final List<EObject> roots = new ArrayList<>(umlContents.size() + 2);
		roots.add(this.pm);
		roots.add(this.corr);
		roots.addAll(umlContents);
		final EGraph graph = new EGraphImpl(roots);

		final Engine engine = new EngineImpl();
		engine.getScriptEngine().put(SignatureHelper.class.getName(), SignatureHelper.class);
		final List<Match> matches = new LinkedList<>();
		for (final Match m : engine.findMatches(this.rule, graph, null)) {
			matches.add(m);
		}
		restore(oldSet, umlContents, signatures);
		return matches;
	}

	private Map<critical, Map<Integer, List<String>>> replaceAllWithNames(final List<EObject> uml) {
		final Map<critical, Map<Integer, List<String>>> signatures = new HashMap<>();
		for (final EObject object : uml) {
			if (object instanceof critical) {
				final var crit = (critical) object;
				signatures.computeIfAbsent(crit, key -> {
					final Map<Integer, List<String>> map = new HashMap<>();
					final var secrecy = key.getSecrecy();
					map.put(UmlsecPackage.CRITICAL__SECRECY, new ArrayList<>(secrecy));
					replaceWithNames(secrecy);
					final var integrity = key.getIntegrity();
					map.put(UmlsecPackage.CRITICAL__INTEGRITY, new ArrayList<>(integrity));
					replaceWithNames(integrity);
					final var high = key.getHigh();
					map.put(UmlsecPackage.CRITICAL__HIGH, new ArrayList<>(high));
					replaceWithNames(high);
					return map;
				});
			}
		}
		return signatures;
	}

	private void restore(final ResourceSet rs, final List<EObject> contents,
			final Map<critical, Map<Integer, List<String>>> signatures) {
		for (final EObject object : contents) {
			final var values = signatures.get(object);
			if(values != null) {
				final var crit = (critical) object;
				crit.getSecrecy().clear();
				crit.getSecrecy().addAll(values.get(UmlsecPackage.CRITICAL__SECRECY));
				crit.getIntegrity().clear();
				crit.getIntegrity().addAll(values.get(UmlsecPackage.CRITICAL__INTEGRITY));
				crit.getHigh().clear();
				crit.getHigh().addAll(values.get(UmlsecPackage.CRITICAL__HIGH));
			}
		}
		rs.getResources().add(this.pm.eResource());
		rs.getResources().add(this.uml.eResource());
		rs.getResources().add(this.corr.eResource());
	}

	private void replaceWithNames(final List<String> critical) {
		final List<String> names = critical.stream().map(signature -> {
			final var paramSep = signature.indexOf('(');
			if (paramSep > 0) {
				return signature.substring(0, paramSep);
			}
			final var typeSep = signature.indexOf(':');
			if(typeSep > 0) {
				return signature.substring(0, typeSep);
			}
			return signature;
		}).collect(Collectors.toList());
		critical.clear();
		critical.addAll(names);
	}

	// From here starts the implementation of the Hulk check

	@Override
	public EClass getHAnnotationType() {
		return ViolationsPackage.eINSTANCE.getSecureDependencyViolation();
	}

	@Override
	public boolean detect(final HAntiPatternGraph apg) {
		final var originalPM = apg.getModel();
		final var originalSet = originalPM.eResource().getResourceSet();

		final var project = JavaProjectUtil.getJavaProject(EclipseProjectUtil.getProjectByName(originalPM.getTName()));
		this.corr = CorrespondenceGraphGenerator.createModel(project, new NullProgressMonitor());

		for (final Match m : detect(this.corr)) {
			final var requirement = (critical) m.getNodeTarget(this.rule.getLhs().getNode("required"));
			final var access = (TAccess) m.getNodeTarget(this.rule.getLhs().getNode("access"));
			final var source = access.getSource();
			final var target = access.getTarget();

			final var violation = ViolationsFactory.eINSTANCE.createSecureDependencyViolation();
			if (this.pm == originalPM) {
				violation.setSource(source);
				violation.setTarget(target);
				violation.setRequirement(requirement);
				violation.setTAnnotated(access);
			} else {
				final var sourceSignature = source.getSignatureString();
				final var sourceClass = source.getDefinedBy().getFullyQualifiedName();
				violation.setSource(originalPM.getType(sourceClass).getTDefinition(sourceSignature));

				final var targetSignature = target.getSignatureString();
				final var targetClass = target.getDefinedBy().getFullyQualifiedName();
				violation.setSource(originalPM.getType(targetClass).getTDefinition(targetSignature));

				violation.setRequirement(requirement);

				final var accessSearch = source.getAccessing().parallelStream().filter(a -> a.getTarget() == target)
						.filter(a -> a
								.getTAnnotation(ViolationsPackage.eINSTANCE.getSecureDependencyViolation()) == null)
						.findAny();
				if (accessSearch.isPresent()) {
					violation.setTAnnotated(accessSearch.get());
				} else {
					violation.setTAnnotated(source);
				}
			}
			apg.getHAnnotations().add(violation);
			originalSet.getResources().addAll(this.set.getResources());
		}

		return true;
	}

	@Override
	public String getGuiName() {
		return CHECK_NAME;
	}

	// From here starts the implementation of the CARiSMA integration

	@Override
	public boolean perform(final Map<String, CheckParameter> parameters, final AnalysisHost host) {
		final var project = getProject(host);
		this.corr = CorrespondenceGraphGenerator.createModel(JavaProjectUtil.getJavaProject(project),
				new NullProgressMonitor());
		for (final Match m : detect(this.corr)) {
			final var access = (TAccess) m.getNodeTarget(this.rule.getLhs().getNode("access"));

			final var source = access.getSource();
			final var sourceSignature = source.getSignatureString();
			final var sourceClass = source.getDefinedBy().getFullyQualifiedName();

			final var target = access.getTarget();
			final var targetSignature = target.getSignatureString();
			final var targetClass = target.getDefinedBy().getFullyQualifiedName();

			host.addResultMessage(new AnalysisResultMessage(StatusType.ERROR,
					"Secure dependency is violated in the implementation for the member " + sourceSignature
					+ " of the class " + sourceClass + " for the security-level of " + "secrecy"
					+ "by an access to the member " + targetSignature + " of the class " + targetClass));
		}
		return true;
	}

	private IProject getProject(final AnalysisHost host) {
		final var uri = host.getAnalyzedModel().getURI();
		final var workspace = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = null;
		if (uri.isPlatform()) {
			project = workspace.getFile(new Path(host.getCurrentModelFilename())).getProject();
		} else {
			final var string = uri.toString();
			final var file = new File(string);
			if (file.exists()) {
				if (file.isAbsolute()) {
					for (final IProject p : workspace.getProjects()) {
						if (file.toPath().startsWith(p.getLocation().toFile().toPath())) {
							project = p;
							break;
						}
					}
					if (project == null) {
						host.addResultMessage(new AnalysisResultMessage(StatusType.ERROR,
								"Couldn't find project containing the model"));
					}
				} else {
					final var ifile = workspace.getFile(Path.fromPortableString(string));
					if (ifile.exists()) {
						project = ifile.getProject();
					} else {
						for (final IProject p : workspace.getProjects()) {
							if (p.getFile(string).exists()) {
								project = p;
								break;
							}
						}
					}
				}
			}
		}
		return project;
	}

	@Override
	public String getCheckID() {
		return CARISMA_ID;
	}

	@Override
	public String getName() {
		return CHECK_NAME;
	}
}
