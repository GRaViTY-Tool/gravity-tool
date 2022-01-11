package org.gravity.tgg.uml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.GravityMoDiscoActivator;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.codegen.GravityModiscoCodeGenerator;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.security.annotations.AnnotationsActivator;
import org.gravity.tgg.modisco.uml.UmlPackage;
import org.moflon.tgg.algorithm.datastructures.SynchronizationProtocol;
import org.moflon.tgg.algorithm.delta.Delta;
import org.moflon.tgg.algorithm.delta.OnlineChangeDetector;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.analysis.StaticAnalysis;
import org.moflon.tgg.runtime.CorrespondenceModel;

import carisma.profile.umlsec.UMLsecActivator;

/**
 * This class provides the API for transforming Java projects into UML models
 * and synchronizing changes
 *
 * @author speldszus
 *
 */
public final class Transformation extends SynchronizationHelper {

	public static final Logger LOGGER = Logger.getLogger(Transformation.class);

	/**
	 * The name of the protocol file
	 */
	public static final String PROTOCOL_BIN = "uml_protocol.bin";

	/**
	 * The name of the correspondence model file
	 */
	public static final String CORRESPONDENCE_MODEL_XMI = "uml_correspondence_model.xmi";

	/**
	 * The name of the output folder
	 */
	static final String UML = "uml";

	private final IJavaProject project;
	final IFolder outputFolder;

	private boolean autosave = true;

	private final GravityModiscoProjectDiscoverer discoverer;

	public Transformation(final IJavaProject javaProject, final Resource target) throws IOException, CoreException {
		this(javaProject, target, true);
	}

	public Transformation(final IJavaProject javaProject, final Resource target, final boolean load)
			throws CoreException, IOException {
		this.project = javaProject;
		this.outputFolder = getFolder(javaProject.getProject(), new NullProgressMonitor());
		if (!this.outputFolder.exists()) {
			this.outputFolder.create(true, true, new NullProgressMonitor());
		}
		if (target != null) {
			this.set = target.getResourceSet();
			getTrg().eResource().getContents().addAll(target.getContents());
		} else {
			this.set = GravityActivator.getDefault().getResourceSet(javaProject.getProject());
		}
		setCorrPackage(UmlPackage.eINSTANCE);

		this.configurator = new org.moflon.tgg.algorithm.configuration.Configurator() {
		};
		clearChanges();

		loadRulesFromProject();

		if (load) {
			final SynchronizationProtocol synchonizationProtocol = getProtocol(javaProject, this.set);
			if (synchonizationProtocol != null) {
				final CorrespondenceModel correspondenceModel = getCorrespondenceModel(javaProject.getProject(),
						this.set);
				if (correspondenceModel != null) {
					setCorr(correspondenceModel);
					setSrc(correspondenceModel.getSource());
					setTrg(correspondenceModel.getTarget());
					setSynchronizationProtocol(synchonizationProtocol);
				}
			}
		}
		this.discoverer = new GravityModiscoProjectDiscoverer(this.set, load);
	}

	public static IFolder getFolder(final IProject project, final IProgressMonitor monitor) throws IOException {
		return EclipseProjectUtil.getGravityFolder(project, monitor).getFolder(UML);
	}

	private void loadRulesFromProject() throws IOException {
		final String smaXmiURI = "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml.sma.xmi"; //$NON-NLS-1$
		final Resource tggRulesResource = this.set.createResource(URI.createURI(smaXmiURI));
		try (InputStream tggRulesStream = new URL(smaXmiURI).openConnection().getInputStream()) {
			tggRulesResource.load(tggRulesStream, Collections.EMPTY_MAP);
		}

		setRules((StaticAnalysis) tggRulesResource.getContents().get(0));
	}

	/**
	 * Sets the eMoflon changes to empty consumers
	 */
	private void clearChanges() {
		this.changeSrc = (root -> {
		});
		this.changeTrg = (root -> {
		});
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

		final SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

		final Collection<IPath> libs  = new ArrayList<>();
		if (addUMLsec) {
			try {
				libs.add(AnnotationsActivator.applyUMLsecLib(this.project, subMonitor));
			} catch (CoreException | IOException e) {
				throw new TransformationFailedException(e);
			}
		}
		subMonitor.setWorkRemaining(95);
		subMonitor.setTaskName("Discover MoDiscoModel");

		long start = 0;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			start = System.currentTimeMillis();
		}

		MGravityModel mGravityModel;
		try {
			mGravityModel = this.discoverer.discoverMGravityModelFromProject(this.project, libs, subMonitor.split(25));
		} catch (OperationCanceledException | DiscoveryException e) {
			throw new TransformationFailedException(e);
		}
		mGravityModel.setName(mGravityModel.getName().replace('.', '-'));

		if ((this.src != null) && this.src.equals(mGravityModel) && (this.trg instanceof Model)) {
			return (Model) this.trg;
		}

		try {
			final Model model = modiscoToModel(mGravityModel, subMonitor);
			if (GravityActivator.MEASURE_PERFORMANCE) {
				GravityActivator.record("All:" + (System.currentTimeMillis() - start) + "ms");
			}
			if (addUMLsec) {
				postprocessUMLsec(model);
			}
			return model;
		} catch (final TransformationFailedException e) {
			mGravityModel.eResource().unload();
			throw e;
		}
	}

	public Model modiscoToModel(final MGravityModel mGravityModel, final IProgressMonitor monitor)
			throws TransformationFailedException, IOException {
		final SubMonitor subMonitor = SubMonitor.convert(monitor);
		final Resource eResource = mGravityModel.eResource();
		if (eResource == null) {
			getResourceSet().createResource(URI.createURI(GravityMoDiscoActivator.FILE_NAME)).getContents()
			.add(mGravityModel);
		} else if (!eResource.getResourceSet().equals(getResourceSet())) {
			getResourceSet().getResources().add(eResource);
		}

		setSrc(mGravityModel);

		final boolean debugging = GravityActivator.getDefault().isDebugging();
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
			GravityActivator.record("TGG:" + (System.currentTimeMillis() - start) + "ms");
		}

		subMonitor.setTaskName("Postprocess UML Model");
		subMonitor.setWorkRemaining(15);
		if (!(this.trg instanceof Model)) {
			if (this.trg != null) {
				final Resource trgResource = this.trg.eResource();
				if (trgResource != null) {
					trgResource.unload();
				}
			}
			throw new TransformationFailedException("Reverseengineering of a UML model failed.");
		}

		if (this.autosave) {
			save(this.outputFolder, subMonitor);
		}
		return (Model) this.trg;
	}

	/**
	 * Applies postprocessors to the transformed model
	 *
	 * @param model The model
	 * @throws TransformationFailedException
	 */
	public void postprocessUMLsec(final Model model) throws TransformationFailedException {
		try {
			long start;
			if (GravityActivator.MEASURE_PERFORMANCE) {
				start = System.currentTimeMillis();
			}
			final Profile profile = UMLsecActivator.loadUMLsecProfile(this.set);
			model.applyProfile(profile);
			new UmlSecProcessor(model).processFwd();
			if (GravityActivator.MEASURE_PERFORMANCE) {
				GravityActivator.record("Postpocessing: " + (System.currentTimeMillis() - start) + "ms");
			}
		} catch (final ProcessingException | IOException e) {
			throw new TransformationFailedException(e);
		}
	}

	/**
	 * Synchronizes changes from the UML model to the Java project
	 *
	 * @param monitor A progress monitor
	 * @throws TransformationFailedException If the transformation wasn't successful
	 * @throws IOException                   If writing files failed
	 */
	public void umlToProject(final IProgressMonitor monitor) throws TransformationFailedException, IOException {
		final IFile corrFile = this.outputFolder.getFile(CORRESPONDENCE_MODEL_XMI);
		if (!corrFile.exists()) {
			return;
		}

		final File oldTrgResource = getTrgFile().getLocation().toFile();
		final Resource r = getResourceSet().createResource(URI.createFileURI(oldTrgResource.getAbsolutePath()));
		try {
			r.load(Collections.emptyMap());
		} catch (final IOException e) {
			throw new TransformationFailedException(e);
		}

		final EObject oldModel = r.getContents().get(0);
		final EObject newModel = getTrg();

		try (OutputStream outputStreamOld = Files
				.newOutputStream(this.outputFolder.getFile("old.xmi").getLocation().toFile().toPath());
				OutputStream outputStreamNew = Files
						.newOutputStream(this.outputFolder.getFile("new.xmi").getLocation().toFile().toPath());) {
			oldModel.eResource().save(outputStreamOld, Collections.emptyMap());
			newModel.eResource().save(outputStreamNew, Collections.emptyMap());
		} catch (final IOException e) {
			throw new TransformationFailedException(e);
		}

		try {
			new UmlSecProcessor((Model) newModel).processBwd();
		} catch (final ProcessingException e) {
			throw new TransformationFailedException(e);
		}

		integrateBackward();

		save(this.outputFolder, monitor);

		GravityModiscoCodeGenerator.generateCode(this.project.getProject(), (MGravityModel) getSrc(), null, monitor);
	}

	public IFile getTrgFile() {
		return this.outputFolder.getFile(this.project.getProject().getName() + "." + UML);
	}

	private boolean save(final IFolder folder, final IProgressMonitor monitor) {
		monitor.setTaskName("Save UML Model");
		final IFile umlFile = folder.getFile(folder.getProject().getName() + ".uml");
		if (!ModelSaver.saveModel(getTrg(), umlFile, monitor)) {
			return false;
		}
		if (!ModelSaver.saveModel(getCorr(), folder.getFile(CORRESPONDENCE_MODEL_XMI), monitor)) {
			return false;
		}
		saveSynchronizationProtocol(folder.getFile(PROTOCOL_BIN));
		return true;
	}

	public IJavaProject getProject() {
		return this.project;
	}

	public void saveSynchronizationProtocol(final IFile path) {
		final URI uri = EMFUtil.getPlatformResourceURI(path);
		final org.moflon.tgg.runtime.PrecedenceStructure ps = this.protocol.save();
		final Resource resource;
		if (path.getFileExtension().equals("xmi")) {
			resource = this.set.createResource(uri);
		} else {
			resource = new BinaryResourceImpl(uri);
			this.set.getResources().add(resource);
		}
		resource.getContents().add(ps);
		final Map<Object, Object> saveOptions = new HashMap<>();
		if (ps.getTripleMatches().size() > 100000) {
			saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_FILE_BUFFER);
		} else {
			saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		}
		try {
			resource.save(saveOptions);
		} catch (final IOException e) {
			LOGGER.error(e);
		}

	}

	@Override
	public void saveSynchronizationProtocol(final String path) {
		final org.moflon.tgg.runtime.PrecedenceStructure ps = this.protocol.save();
		final URI uri = URI.createPlatformResourceURI(path, false);
		final Resource resource;
		if (path.endsWith(".xmi")) {
			resource = this.set.createResource(uri);
		} else {
			resource = new BinaryResourceImpl(uri);
			this.set.getResources().add(resource);
		}
		resource.getContents().add(ps);
		final Map<Object, Object> saveOptions = new HashMap<>();
		if (ps.getTripleMatches().size() > 100000) {
			saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_FILE_BUFFER);
		} else {
			saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		}
		try {
			resource.save(saveOptions);
		} catch (final IOException e) {
			LOGGER.error(e);
		}

	}

	/**
	 * @param project
	 * @param set
	 * @return
	 * @throws IOException
	 * @throws CoreException
	 */
	private SynchronizationProtocol getProtocol(final IJavaProject project, final ResourceSet set)
			throws IOException, CoreException {
		final NullProgressMonitor monitor = new NullProgressMonitor();
		final IFile protocolFile = getFolder(project.getProject(), monitor).getFile(PROTOCOL_BIN);
		if (!protocolFile.exists()) {
			return null;
		}
		try {
			final URI uri = EMFUtil.getPlatformResourceURI(protocolFile);
			Resource protocolResource;
			if (protocolFile.getFileExtension().equals("xmi")) {
				protocolResource = set.getResource(uri, true);
			} else {
				protocolResource = new BinaryResourceImpl(uri);
				set.getResources().add(protocolResource);
				protocolResource.load(protocolFile.getContents(), Collections.emptyMap());
			}
			return (SynchronizationProtocol) protocolResource.getContents().get(0);
		} catch (final IOException | NullPointerException e) {
			protocolFile.delete(true, monitor);
			return null;
		}
	}

	private static CorrespondenceModel getCorrespondenceModel(final IProject project, final ResourceSet set)
			throws IOException {
		final IFile corrFile = getFolder(project, new NullProgressMonitor()).getFile(CORRESPONDENCE_MODEL_XMI);
		if (!corrFile.exists()) {
			return null;
		}
		try {
			final Resource resource = set
					.getResource(URI.createPlatformResourceURI(corrFile.getFullPath().toString(), true), true);
			return (CorrespondenceModel) resource.getContents().get(0);
		} catch (final WrappedException e) {
			LOGGER.error("Stored correspondence model is not valid", e);
			return null;
		}
	}

	public static IFile getUMLFile(final IProject project, final IProgressMonitor monitor) throws IOException {
		return getFolder(project, monitor).getFile(project.getName() + '.' + UML);
	}

	public void disableAutosave() {
		this.autosave = false;
	}

	public void enableAutosave() {
		this.autosave = true;
	}

	public void applyChangeAndGenerateCode(final Consumer<EObject> changeTrg, final IProgressMonitor monitor)
			throws IOException {

		final MGravityModel model = (MGravityModel) getSrc();

		setChangeTrg(changeTrg.andThen(x -> {
			try {
				new UmlSecProcessor((Model) getTrg()).processBwd();
			} catch (final ProcessingException e) {
				LOGGER.error(e);
			}
		}));
		final Delta delta = integrateBackwardAndRecordDelta();

		GravityModiscoCodeGenerator.generateCode(this.project.getProject(), model, delta, monitor);

	}

	/**
	 * @return
	 */
	public Delta integrateBackwardAndRecordDelta() {
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
		final Delta delta = new Delta();
		new OnlineChangeDetector(delta, model);
		change.accept(model);
		OnlineChangeDetector.removeDeltaListeners(model);
		return delta;
	}
}
