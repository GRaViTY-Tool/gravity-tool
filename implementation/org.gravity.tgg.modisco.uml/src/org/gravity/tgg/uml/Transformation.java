package org.gravity.tgg.uml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.modisco.AbstractModiscoTGGConverter;
import org.gravity.modisco.GravityMoDiscoActivator;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.codegen.GravityModiscoCodeGenerator;
import org.gravity.modisco.util.MoDiscoUtil;
import org.gravity.security.annotations.AnnotationsActivator;
import org.gravity.tgg.modisco.uml.UmlPackage;
import org.moflon.tgg.algorithm.delta.Delta;
import org.moflon.tgg.algorithm.delta.OnlineChangeDetector;

import carisma.profile.umlsec.UMLsecActivator;

/**
 * This class provides the API for transforming Java projects into UML models
 * and synchronizing changes
 *
 * @author speldszus
 *
 */
public final class Transformation extends AbstractModiscoTGGConverter {

	private static final String COMMON_JAVA_DATATYPES = "Common Java datatypes";

	private static final String SOURCE_REFERENCES = "source references";

	private static final String EXTERNALS = "externals";

	public static final Logger LOGGER = Logger.getLogger(Transformation.class);

	/**
	 * The name of the output folder
	 */
	static final String UML = "uml";

	/**
	 * The name of the output file
	 */
	private static final String MODEL_UML = "classdiagram.uml";

	public Transformation(final IJavaProject javaProject) throws IOException, CoreException {
		this(javaProject, true);
	}

	public Transformation(final IJavaProject javaProject, final boolean load) throws CoreException, IOException {
		super(javaProject, UML, load);
	}

	/**
	 * Translates the given java project into an UML model
	 *
	 * @param addUMLsec Iff the UMLsec annotations should be added to the java
	 *                  project
	 * @param monitor   A progress monitor
	 * @return The UML model
	 * @throws TransformationFailedException If the UML model couldn't be created
	 *                                       due to a transformation error
	 * @throws IOException                   If writing files failed
	 */
	public Model projectToModel(final boolean addUMLsec, final IProgressMonitor monitor)
			throws TransformationFailedException, IOException {
		if (this.load && (getTrg() != null) && (getSrc() != null) && (getCorr() != null)) {
			final var iproject = this.project.getProject();
			try {
				if (iproject.getModificationStamp() <= EclipseProjectUtil.getGravityFolder(iproject, monitor)
						.getModificationStamp()) {
					return (Model) getTrg();
				}
			} catch (final IOException e) {
				LOGGER.error(e.getMessage(), e);
				discard();
				clearChanges();
			}
		}

		final var subMonitor = SubMonitor.convert(monitor, 100);
		final var libs = getLibs(addUMLsec, subMonitor);
		subMonitor.setWorkRemaining(95);
		subMonitor.setTaskName("Discover MoDiscoModel");

		var start = 0L;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			start = System.currentTimeMillis();
		}

		MGravityModel mGravityModel;
		try {
			mGravityModel = this.discoverer.discoverModel(libs, subMonitor.split(25));
		} catch (OperationCanceledException | DiscoveryException e) {
			throw new TransformationFailedException(e);
		}
		mGravityModel.setName(mGravityModel.getName().replace('.', '-'));

		if ((this.src != null) && this.src.equals(mGravityModel) && (this.trg instanceof Model)) {
			return (Model) this.trg;
		}

		try {
			clearChanges();
			final var model = modiscoToModel(mGravityModel, subMonitor);
			if (GravityActivator.MEASURE_PERFORMANCE) {
				GravityActivator.recordMessage("All:" + (System.currentTimeMillis() - start) + "ms");
			}
			if (addUMLsec) {
				postprocessUMLsecFwd(model);
			}
			return model;
		} catch (final TransformationFailedException e) {
			mGravityModel.eResource().unload();
			throw e;
		}
	}

	/**
	 * Calculates the libraries to consider in detail
	 *
	 * @param addUMLsec Whether the UMLsec lib should be added as dependency
	 * @param monitor   A progress monitor
	 * @return The libs to consider, currently, none or only UMLsec iff added
	 * @throws TransformationFailedException If the UMLsec lib cannot be added to
	 *                                       the project
	 */
	private Collection<IPath> getLibs(final boolean addUMLsec, final SubMonitor monitor)
			throws TransformationFailedException {
		final Collection<IPath> libs = new ArrayList<>();
		if (addUMLsec) {
			try {
				libs.add(AnnotationsActivator.applyUMLsecLib(this.project, monitor));
			} catch (CoreException | IOException e) {
				throw new TransformationFailedException(e);
			}
		}
		return libs;
	}

	public Model modiscoToModel(final MGravityModel mGravityModel, final IProgressMonitor monitor)
			throws TransformationFailedException, IOException {
		final var subMonitor = SubMonitor.convert(monitor);
		final var eResource = mGravityModel.eResource();
		if (eResource == null) {
			getResourceSet().createResource(URI.createURI(GravityMoDiscoActivator.FILE_NAME)).getContents()
					.add(mGravityModel);
		} else if (!eResource.getResourceSet().equals(getResourceSet())) {
			getResourceSet().getResources().add(eResource);
		}

		setSrc(mGravityModel);

		final var debugging = GravityActivator.getDefault().isDebugging();
		if (debugging) {
			getSrc().eResource().save(Collections.emptyMap());
		}

		subMonitor.setTaskName("Transform MoDisco Model to UML Model");
		long start;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			start = System.currentTimeMillis();
		}
		integrateForward();
		if (GravityActivator.MEASURE_PERFORMANCE) {
			GravityActivator.recordMessage("TGG:" + (System.currentTimeMillis() - start) + "ms");
		}

		subMonitor.setTaskName("Postprocess UML Model");
		subMonitor.setWorkRemaining(15);
		if (!(this.trg instanceof Model)) {
			if (this.trg != null) {
				final var trgResource = this.trg.eResource();
				if (trgResource != null) {
					trgResource.unload();
				}
			}
			throw new TransformationFailedException("Reverseengineering of a UML model failed.");
		}

		if (this.autosave) {
			save(subMonitor);
		}
		return (Model) this.trg;
	}

	public static IStatus generateCode(final IProject project, final IFile uml, final IProgressMonitor monitor) {
		IJavaProject javaProject;
		try {
			javaProject = JavaProjectUtil.convertToJavaProject(Collections.singleton("src"), project, monitor);
			final var transformationFactory = GravityUmlActivator.getTransformationFactory();
			final var transformation = transformationFactory.getTransformation(javaProject.getProject());
			final var set = transformation.getResourceSet();
			set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
					UMLResource.Factory.INSTANCE);
			final var uri = EMFUtil.getPlatformResourceURI(uml);
			final var targetResource = set.getResource(uri, true);
			final var contents = targetResource.getContents();
			final Set<EObject> roots = contents.parallelStream().filter(Model.class::isInstance)
					.collect(Collectors.toSet());
			if (roots.size() != 1) {
				return new Status(IStatus.ERROR, GravityUmlActivator.PLUGIN_ID, "Couldn't find root model!");
			}
			final var root = createModelStructure(project, contents, (Model) roots.iterator().next());
			addTypesToDefaultPackage(project, root);

			new UmlSecProcessor(root).processBwd();

			targetResource.save(Collections.emptyMap());

			transformation.setTrg(root);
			transformation.integrateBackward();
			if (transformation.src instanceof MGravityModel) {
				GravityModiscoCodeGenerator.generateCode(javaProject, (MGravityModel) transformation.src, null,
						monitor);

				transformation.integrateForward();
				transformation.save(monitor);
			} else {
				return new Status(IStatus.ERROR, GravityUmlActivator.PLUGIN_ID, "Transformation failed");
			}
		} catch (IOException | CoreException | ProcessingException e) {
			return new Status(IStatus.ERROR, GravityUmlActivator.PLUGIN_ID, e.getLocalizedMessage(), e);
		}
		return Status.OK_STATUS;
	}

	public void applyChangeAndGenerateCode(final Consumer<EObject> umlChanges, final IProgressMonitor monitor)
			throws IOException, CoreException {

		final var model = (MGravityModel) getSrc();

		setChangeTrg(umlChanges.andThen(x -> {
			try {
				new UmlSecProcessor((Model) getTrg()).processBwd();
			} catch (final ProcessingException e) {
				LOGGER.error(e);
			}
		}));
		final var delta = integrateBackwardAndRecordDelta();

		GravityModiscoCodeGenerator.generateCode(this.project, model, delta, monitor);

	}

	/**
	 * Records the changed files while propagating changes from the UML model into
	 * the modisco model
	 *
	 * @return The changes
	 */
	private Delta integrateBackwardAndRecordDelta() {
		return applyChangeAndRecordDelta(x -> integrateBackward(), getSrc());
	}

	/**
	 * Applies a change to a model and records the changes as delta
	 *
	 * @param change The change
	 * @param model  The model the change should be applied to
	 * @return The recorded delta
	 */
	private Delta applyChangeAndRecordDelta(final Consumer<EObject> change, final EObject model) {
		final var delta = new Delta();
		new OnlineChangeDetector(delta, model);
		change.accept(model);
		OnlineChangeDetector.removeDeltaListeners(model);
		return delta;
	}

	@Override
	public boolean discard() {
		unload();
		return GravityUmlActivator.getTransformationFactory().drop(this.project.getProject());
	}

	/**
	 * Searches the file corresponding to the UML model reverse-engineered by
	 * GRaViTY
	 *
	 * @param project The project
	 * @param monitor A progress monitor
	 * @return the file
	 * @throws IOException If the file system cannot be accessed
	 */
	public static IFile getUMLFile(final IProject project, final IProgressMonitor monitor) throws IOException {
		return getUMLFile(EclipseProjectUtil.getGravityFolder(project, monitor).getFolder(UML));
	}

	private static IFile getUMLFile(final IFolder folder) {
		return folder.getFile(MODEL_UML);
	}

	@Override
	protected IFile getTargetFile() {
		return getUMLFile(this.outputFolder);
	}

	@Override
	protected UmlPackage getCorrPackage() {
		return UmlPackage.eINSTANCE;
	}

	@Override
	protected String getSmaURI() {
		return "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml.sma.xmi";
	}

	/**
	 * Applies postprocessors to the transformed model
	 *
	 * @param model The model
	 * @throws TransformationFailedException
	 */
	private void postprocessUMLsecFwd(final Model model) throws TransformationFailedException {
		try {
			long start;
			if (GravityActivator.MEASURE_PERFORMANCE) {
				start = System.currentTimeMillis();
			}
			final var profile = UMLsecActivator.loadUMLsecProfile(this.set);
			model.applyProfile(profile);
			new UmlSecProcessor(model).processFwd();
			if (GravityActivator.MEASURE_PERFORMANCE) {
				GravityActivator.recordMessage("Postpocessing: " + (System.currentTimeMillis() - start) + "ms");
			}
		} catch (final ProcessingException | IOException e) {
			throw new TransformationFailedException(e);
		}
	}

	private static Model createModelStructure(final IProject project, final EList<EObject> container, Model root) {
		final var name = root.getName();
		if (!"root model".equals(name)) {
			if (!project.getName().equals(name)) {
				root.setName(project.getName());
			}

			final var model = UMLFactory.eINSTANCE.createModel();
			model.setName("root model");
			model.getPackagedElements().add(root);

			container.remove(root);
			container.add(model);
			root = model;
		}

		if (root.getPackagedElement(EXTERNALS) == null) {
			root.createNestedPackage(EXTERNALS, UMLPackage.eINSTANCE.getModel());
		}

		if (root.getPackagedElement(SOURCE_REFERENCES) == null) {
			root.createNestedPackage(SOURCE_REFERENCES, UMLPackage.eINSTANCE.getModel());
		}

		final List<Model> models = root.getPackagedElements().stream().filter(Model.class::isInstance)
				.filter(m -> !EXTERNALS.equals(m.getName())).filter(m -> !SOURCE_REFERENCES.equals(m.getName()))
				.map(Model.class::cast).collect(Collectors.toList());
		if (models.size() != 1) {
			throw new IllegalStateException();
		}
		final var java = models.get(0);
		if (java.getPackagedElement(COMMON_JAVA_DATATYPES) == null) {
			java.createNestedPackage(COMMON_JAVA_DATATYPES);
		}

		return root;
	}

	/**
	 * Adds types that are not in a package to the default package
	 *
	 * @param project The project the elements should be added to
	 * @param root    The root UML model
	 */
	private static void addTypesToDefaultPackage(final IProject project, final Model root) {
		final var projectModel = (Model) root.getOwnedMember(project.getName());
		final Collection<Classifier> typesInDefaultPackage = new LinkedList<>();
		for (final Element element : projectModel.getOwnedElements()) {
			if ((element instanceof Class) || (element instanceof Interface) || (element instanceof Enumeration)) {
				final var classifier = (Classifier) element;
				if ((classifier.getPackage() == null) || projectModel.equals(classifier.getPackage())) {
					typesInDefaultPackage.add(classifier);
				}
			}
		}
		if (!typesInDefaultPackage.isEmpty()) {
			var defaultPackage = (Package) projectModel.getOwnedMember(MoDiscoUtil.DEFAULT_PACKAGE);
			if (defaultPackage == null) {
				defaultPackage = UMLFactory.eINSTANCE.createPackage();
				defaultPackage.setName(MoDiscoUtil.DEFAULT_PACKAGE);
				defaultPackage.setNestingPackage(projectModel);
			}
			defaultPackage.getPackagedElements().addAll(typesInDefaultPackage);
		}
	}
}
