package org.gravity.pm.umlsec;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
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
import carisma.profile.umlsec.critical;

public class SecurityViolationPattern extends HDetectorImpl implements CarismaCheckWithID {
	private static final String CHECK_NAME = "Security Violation Pattern";
	private static final String CARISMA_ID = "org.gravity.security.violation.patterns.securedependency";
	private TypeGraph pm;
	private CorrespondenceModel corr;
	private Model uml;

	private HenshinResourceSet set;

	public SecurityViolationPattern(final CorrespondenceModel corr) {
		init(corr);
	}

	private void init(final CorrespondenceModel corr) {
		this.corr = corr;
		this.pm = (TypeGraph) corr.getSource();
		this.uml = (Model) corr.getTarget();
		final var resourceSet = corr.eResource().getResourceSet();
		if (resourceSet instanceof HenshinResourceSet) {
			this.set = (HenshinResourceSet) resourceSet;
		} else {
			this.set = new HenshinResourceSet();
			this.set.getResources().addAll(this.set.getResources());
		}
	}

	public List<Match> detect() {
		final List<EObject> umlContents = this.uml.eResource().getContents();
		final List<EObject> roots = new ArrayList<>(umlContents.size() + 2);
		roots.add(this.pm);
		roots.add(this.corr);
		roots.addAll(umlContents);
		final EGraph graph = new EGraphImpl(roots);
		final var module = this.set.getModule(new File("SecureDependency.henshin").getAbsolutePath());
		final var rule = module.getAllRules().get(0);

		final Engine engine = new EngineImpl("org.gravity.pm.umlsec.SignatureHelper");
		final List<Match> matches = new LinkedList<>();
		for (final Match m : engine.findMatches(rule, graph, null)) {
			matches.add(m);
		}
		return matches;
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
		init(CorrespondenceGraphGenerator.createModel(project, new NullProgressMonitor()));

		for (final Match m : detect()) {
			final var rule = m.getRule();
			final var requirement = (critical) m.getParameterValue(rule.getParameter("supplierCritical"));
			final var access = (TAccess) m.getNodeTarget(rule.getLhs().getNode("access"));
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
				if(accessSearch.isPresent()) {
					violation.setTAnnotated(accessSearch.get());
				}
				else {
					violation.setTAnnotated(source);
				}
			}
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
		final var project = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(host.getCurrentModelFilename())).getProject();
		init(CorrespondenceGraphGenerator.createModel(JavaProjectUtil.getJavaProject(project), new NullProgressMonitor()));
		for (final Match m : detect()) {
			final var rule = m.getRule();
			final var access = (TAccess) m.getNodeTarget(rule.getLhs().getNode("access"));

			final var source = access.getSource();
			final var sourceSignature = source.getSignatureString();
			final var sourceClass = source.getDefinedBy().getFullyQualifiedName();

			final var target = access.getTarget();
			final var targetSignature = target.getSignatureString();
			final var targetClass = target.getDefinedBy().getFullyQualifiedName();

			host.addResultMessage(new AnalysisResultMessage(StatusType.ERROR, "Secure dependency is violated in the implementation for the member "+sourceSignature+" of the class "+
					sourceClass +" for the security-level of "+"secrecy"+ "by an access to the member "+targetSignature+" of the class "+targetClass));
		}
		return true;
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
