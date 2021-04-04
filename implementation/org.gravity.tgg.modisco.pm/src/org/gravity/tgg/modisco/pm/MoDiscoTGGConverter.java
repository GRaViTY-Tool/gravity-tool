package org.gravity.tgg.modisco.pm;

import static org.gravity.eclipse.io.ModelSaver.saveModel;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Consumer;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.generation.files.GenerateJavaExtended;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.GravityMoDiscoModelPatcher;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.modisco.processing.GravityMoDiscoProcessorUtil;
import org.gravity.modisco.processing.IMoDiscoProcessor;
import org.gravity.tgg.modisco.pm.processing.pg.IProgramGraphProcessor;
import org.gravity.tgg.modisco.pm.processing.pg.ProgramGraphProcesorUtil;
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.tgg.algorithm.datastructures.SynchronizationProtocol;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.analysis.StaticAnalysis;
import org.moflon.tgg.runtime.CorrespondenceModel;

/**
 * A converter for creating a program model from eclipse projects using MoDisco
 *
 * @author speldszus
 *
 */
public class MoDiscoTGGConverter extends SynchronizationHelper implements IPGConverter {

	private static final String PM_XMI = "pm.xmi";

	private static final String CORRESPONDENCE_MODEL_XMI = "pm_correspondence_model.xmi";

	private static final String PROTOCOL_BIN = "pm_protocol.bin";

	private final IJavaProject iJavaProject;

	private boolean debug;
	private boolean autosave = true;

	private final GravityModiscoProjectDiscoverer discoverer;

	private MGravityModel preprocessedModiscoModel;

	private final boolean load;

	private static final Logger LOGGER = Logger.getLogger(MoDiscoTGGConverter.class);

	/**
	 * Initializes ResourceSet for EMF and eMoflon
	 *
	 * @param project The project this converter is created for
	 *
	 * @throws IOException   If the eMoflon TGG rules couldn't be loaded
	 * @throws CoreException
	 */
	public MoDiscoTGGConverter(final IJavaProject project, final ResourceSet set) throws IOException, CoreException {
		this(project, set, true);
	}

	public MoDiscoTGGConverter(final IJavaProject project, final ResourceSet set, final boolean load)
			throws IOException, CoreException {
		this.discoverer = new GravityModiscoProjectDiscoverer(set, load);
		this.iJavaProject = project;
		this.load = load;
		// BasicConfigurator.configure();
		init(this.discoverer.getResourceSet());
		GravityActivator.getDefault().addProject(project.getProject());

		if (load) {
			final CorrespondenceModel correspondenceModel = getCorrespondenceModel(project.getProject(), set);
			if (correspondenceModel != null) {
				final SynchronizationProtocol protocol = getProtocol(project, set);
				if (protocol != null) {
					setCorr(correspondenceModel);
					setSrc(correspondenceModel.getSource());
					setTrg(correspondenceModel.getTarget());
					setSynchronizationProtocol(protocol);
				}
			}
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
		final URI uri = EMFUtil.getPlatformResourceURI(protocolFile);
		Resource protocolResource;
		try {
			if (protocolFile.getFileExtension().equals("xmi")) {
				protocolResource = set.getResource(uri, true);
			} else {
				protocolResource = new BinaryResourceImpl(uri);
				set.getResources().add(protocolResource);
				protocolResource.load(protocolFile.getContents(), Collections.emptyMap());
			}
		} catch (final IOException | NullPointerException | WrappedException e) {
			LOGGER.error(e);
			protocolFile.delete(true, monitor);
			return null;
		}
		return (SynchronizationProtocol) protocolResource.getContents().get(0);
	}

	/**
	 * Initializes the class
	 *
	 * @param set The resource set which should be used
	 * @throws IOException
	 */
	private void init(final ResourceSet set) throws IOException {
		this.set = set;
		this.set.getResourceFactoryRegistry().getExtensionToFactoryMap()
		.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		setCorrPackage(PmPackage.eINSTANCE);

		this.configurator = new org.moflon.tgg.algorithm.configuration.Configurator() {
		};
		clearChanges();

		loadRulesFromProject();
	}

	private void loadRulesFromProject() throws IOException, MalformedURLException {
		final String smaXmiURI = "platform:/plugin/org.gravity.tgg.modisco.pm/model/Pm.sma.xmi"; //$NON-NLS-1$
		final Resource tggRulesResource = this.set.createResource(URI.createURI(smaXmiURI));
		try (InputStream tggRulesStream = new URL(smaXmiURI).openConnection().getInputStream()) {
			tggRulesResource.load(tggRulesStream, Collections.emptyMap());
		}

		setRules((StaticAnalysis) tggRulesResource.getContents().get(0));
	}

	@Override
	public boolean discard() {
		clearChanges();
		reset();
		return true;
	}

	@Override
	public boolean convertProject(final IProgressMonitor monitor) {
		return convertProject(new HashSet<>(), monitor);
	}

	@Override
	public boolean convertProject(final Collection<IPath> libs, final IProgressMonitor monitor) {
		IProgressMonitor progressMonitor;
		if (monitor == null) {
			progressMonitor = new NullProgressMonitor();
		} else {
			progressMonitor = monitor;
		}

		long start = 0;
		final boolean infoEnabled = LOGGER.isInfoEnabled();
		if (GravityActivator.MEASURE_PERFORMANCE) {
			start = System.currentTimeMillis();
		} else if (infoEnabled) {
			start = System.currentTimeMillis();
			LOGGER.log(Level.INFO, "GRaViTY convert project: " + this.iJavaProject.getProject().getName());
		}

		try {
			this.preprocessedModiscoModel = this.discoverer.discoverMGravityModelFromProject(this.iJavaProject, libs,
					progressMonitor);
		} catch (final DiscoveryException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return false;
		}
		if ((this.src != null) && this.src.equals(this.preprocessedModiscoModel) && (this.trg instanceof TypeGraph)) {
			return true;
		}

		final boolean success = convertModel(this.preprocessedModiscoModel, progressMonitor);
		if (GravityActivator.MEASURE_PERFORMANCE) {
			System.out.println("All:" + (System.currentTimeMillis() - start) + "ms");
		} else if (infoEnabled) {
			LOGGER.log(Level.INFO, "GRaViTY convert project - done " + (System.currentTimeMillis() - start) + "ms");
		}

		return success;
	}

	/**
	 * Converts the modisco model of the given project into a program model
	 *
	 * @param modiscoModel The modisco model of the Java project
	 * @param monitor      A progress monitor
	 * @return If the model has been converted successfully
	 */
	public boolean convertModel(final MGravityModel modiscoModel, final IProgressMonitor monitor) {
		if ((this.src != null) && this.src.equals(modiscoModel) && (this.trg instanceof TypeGraph)) {
			return true;
		}
		final SubMonitor submonitor = SubMonitor.convert(monitor, "Transform MoDisco Model to PM", 100);

		final Resource eResource = modiscoModel.eResource();
		if (!getResourceSet().equals(eResource.getResourceSet())) {
			getResourceSet().createResource(eResource.getURI()).getContents().add(modiscoModel);
		}
		setSrc(modiscoModel);
		setChangeSrc(null);
		clearChanges();
		setSynchronizationProtocol(null);

		final boolean infoEnabled = LOGGER.isInfoEnabled();
		long start = 0;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			start = System.currentTimeMillis();
		} else if (infoEnabled) {
			start = System.currentTimeMillis();
			LOGGER.log(Level.INFO, "eMoflon TGG fwd trafo");
		}

		final SubMonitor integrate = submonitor.split(70);
		integrate.setTaskName("Integrate FWD");
		integrateForward();
		integrate.done();

		if (GravityActivator.MEASURE_PERFORMANCE) {
			System.out.println("TGG:" + (System.currentTimeMillis() - start) + "ms");
		} else if (infoEnabled) {
			LOGGER.log(Level.INFO, "eMoflon TGG fwd trafo - done " + (System.currentTimeMillis() - start) + "ms");
		}

		final boolean success = this.trg instanceof TypeGraph;
		if (success) {
			postprocess(submonitor.split(20), infoEnabled);
			if (this.autosave) {
				Job.create("Save models", runnable -> {
					save(submonitor.split(10));
				}).schedule();
			}
		}
		submonitor.done();
		return success;
	}

	/**
	 * Executes all registered postprocessors
	 *
	 * @param monitor A progress monitor
	 * @param info    If info messages should be logged
	 */
	private void postprocess(final IProgressMonitor monitor, final boolean info) {
		final Collection<IProgramGraphProcessor> sortedProcessors = ProgramGraphProcesorUtil
				.getSortedProcessors(MoDiscoTGGActivator.PROCESS_PG_FWD);
		final SubMonitor processors = SubMonitor.convert(monitor, "Postprocessing", sortedProcessors.size());
		long start = 0;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			start = System.currentTimeMillis();
		} else if (info) {
			start = System.currentTimeMillis();
			LOGGER.log(Level.INFO, "Start postprocessing with " + sortedProcessors.size() + " post-processors");
		}
		for (final IProgramGraphProcessor processor : sortedProcessors) {
			processor.process(getPG(), processors);
			processors.worked(1);
		}
		if (GravityActivator.MEASURE_PERFORMANCE) {
			System.out.println("Postprocessing:" + (System.currentTimeMillis() - start) + "ms");
		} else if (info) {
			LOGGER.log(Level.INFO, "Postprocessing - done (" + (System.currentTimeMillis() - start) + "ms)");
		}
	}

	@Override
	public boolean syncProjectFwd(final IProgressMonitor monitor) {
		if ((this.discoverer == null) || (this.iJavaProject == null)) {
			return false;
		}
		long start = 0;
		final boolean infoEnabled = LOGGER.isInfoEnabled();
		if (infoEnabled) {
			start = System.currentTimeMillis();
			LOGGER.log(Level.INFO, start + " MoDisco sync project: " + this.iJavaProject.getProject().getName());
		}

		if (this.preprocessedModiscoModel == null) {
			return convertProject(monitor);
		}

		final MGravityModel oldProject = this.preprocessedModiscoModel;

		if (infoEnabled) {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Discover Project");
		}

		try {
			this.preprocessedModiscoModel = this.discoverer.discoverMGravityModelFromProject(this.iJavaProject,
					monitor);
		} catch (final DiscoveryException e) {
			LOGGER.error(e);
			return false;
		}
		if (infoEnabled) {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Discover Project - Done"); // NOPMD by speldszus on
			// 12/4/19, 9:09 PM
		}

		final GravityMoDiscoModelPatcher patcher = MoDiscoTGGActivator.getDefault().getSelectedPatcher();

		// final Consumer<EObject> changes = SynchronizationHelper -> {

		LOGGER.log(Level.INFO, System.currentTimeMillis() + " Calculate Patch");
		patcher.update(oldProject, this.preprocessedModiscoModel);
		LOGGER.log(Level.INFO, System.currentTimeMillis() + " Calculate Patch - Done");

		// };

		final boolean success = syncProjectFwd(null, monitor);

		if (infoEnabled) {
			final long stop = System.currentTimeMillis();
			LOGGER.log(Level.INFO, stop + "MoDisco sync project -done: " + (stop - start) + "ms");
		}

		return success;
	}

	@Override
	public boolean syncProjectFwd(final Consumer<EObject> consumer, final IProgressMonitor monitor) {
		if (getSrc() == null) {
			LOGGER.error("No initial transformation has been performed!");
			return false;
		}
		final boolean infoEnabled = LOGGER.isInfoEnabled();
		if (infoEnabled) {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Integrate FWD");
		}

		setChangeSrc(consumer);
		integrateForward();

		if (infoEnabled) {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Integrate FWD - Done");
		}

		if (this.debug) {
			save(monitor);
		}
		return getTrg() != null;
	}

	@Override
	public boolean syncProjectBwd(final Consumer<EObject> consumer, final IProgressMonitor monitor) {
		if ((this.discoverer == null) || (getSrc() == null) || (getTrg() == null)) {
			return false;
		}

		IProgressMonitor progressMonitor;
		if (monitor == null) {
			progressMonitor = new NullProgressMonitor();
		} else {
			progressMonitor = monitor;
		}

		for (final IProgramGraphProcessor processor : ProgramGraphProcesorUtil
				.getSortedProcessors(MoDiscoTGGActivator.PROCESS_PG_BWD)) {
			processor.process(getPG(), progressMonitor);
		}
		setChangeTrg(consumer);
		integrateBackward();

		if (this.debug) {
			save(progressMonitor);

		}

		final EObject src = getSrc();
		for (final IMoDiscoProcessor processor : GravityMoDiscoProcessorUtil
				.getSortedProcessors(MoDiscoTGGActivator.PROCESS_MODISCO_BWD)) {
			processor.process((MGravityModel) src, null, progressMonitor);
		}

		try {
			final IFolder srcFile = this.iJavaProject.getProject().getFolder("src");
			new GenerateJavaExtended(src, srcFile.getLocation().toFile(), Collections.emptyList())
			.doGenerate(new BasicMonitor.EclipseSubProgress(progressMonitor, 1));
			this.iJavaProject.getProject().refreshLocal(IResource.DEPTH_INFINITE, progressMonitor);
		} catch (IOException | CoreException e) {
			return false;
		}

		return true;
	}

	/**
	 * Saves program model, MoDisco model, correspondence model and synchronization
	 * protocol to the modisco folder
	 *
	 * @param direction       a description of the direction of the conversion
	 * @param progressMonitor a progress monitor return false if the models couldn't
	 *                        be saved, true otherwise
	 */
	boolean save(final IProgressMonitor progressMonitor) {
		final SubMonitor monitor = SubMonitor.convert(progressMonitor, "Save models", 3);
		IFolder folder;
		try {
			final IProject project = this.iJavaProject.getProject();
			folder = getFolder(project, progressMonitor);
		} catch (final IOException e) {
			LOGGER.error(e);
			return false;
		}
		if (!savePG(folder.getFile(PM_XMI), progressMonitor)) {
			return false;
		}
		monitor.worked(1);
		if (!saveModel(getCorr(), folder.getFile(CORRESPONDENCE_MODEL_XMI), progressMonitor)) {
			return false;
		}
		monitor.worked(1);
		saveSynchronizationProtocol(folder.getFile(PROTOCOL_BIN).getFullPath().toString());
		monitor.worked(1);
		return true;
	}

	public static IFolder getFolder(final IProject project, final IProgressMonitor monitor) throws IOException {
		return EclipseProjectUtil.getGravityFolder(project, monitor).getFolder("pm");
	}

	private static CorrespondenceModel getCorrespondenceModel(final IProject project, final ResourceSet set)
			throws IOException, CoreException {
		final NullProgressMonitor monitor = new NullProgressMonitor();
		final IFile corrFile = getFolder(project, monitor).getFile(CORRESPONDENCE_MODEL_XMI);
		if (!corrFile.exists()) {
			return null;
		}
		try {
			final Resource resource = set.getResource(EMFUtil.getPlatformResourceURI(corrFile), true);
			return (CorrespondenceModel) resource.getContents().get(0);
		} catch (final WrappedException e) {
			corrFile.delete(true, monitor);
			return null;
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

	@Override
	public boolean savePG(final IFile file, final IProgressMonitor monitor) {
		return saveModel(getTrg(), file, monitor);
	}

	@Override
	public TypeGraph getPG() {
		return (TypeGraph) getTrg();
	}

	/**
	 * Resets the converter to initial values
	 */
	private void reset() {
		if (this.src != null) {
			this.src.eResource().unload();
			this.src = null;
		}
		if (this.trg != null) {
			this.trg.eResource().unload();
			this.trg = null;
		}
		if (this.corr != null) {
			this.corr.eResource().unload();
			this.corr = null;
		}
		if (this.protocol != null) {
			this.protocol = null;
		}
		this.set = new ResourceSetImpl();
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

	@Override
	public boolean isDebug() {
		return this.debug;
	}

	@Override
	public void setDebug(final boolean debug) {
		this.debug = debug;
	}

	public static IFile getPMFile(final IProject project, final IProgressMonitor monitor) throws IOException {
		return getFolder(project, monitor).getFile(PM_XMI);
	}

	public void enableAutosave() {
		this.autosave = true;
	}

	public void disableAutosave() {
		this.autosave = false;
	}
}
