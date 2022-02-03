package org.gravity.modisco;

import static org.gravity.eclipse.io.ModelSaver.saveModel;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.UptodateVisitor;
import org.moflon.tgg.algorithm.datastructures.SynchronizationProtocol;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.analysis.StaticAnalysis;
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.moflon.tgg.runtime.PrecedenceStructure;

public abstract class AbstractModiscoTGGConverter extends SynchronizationHelper {

	private static final Logger LOGGER = Logger.getLogger(AbstractModiscoTGGConverter.class);

	private static final String PROTOCOL_BIN = "_protocol.bin";
	private static final String PROTOCOL_XMI = "_protocol.xmi";
	private static final String CORRESPONDENCE_MODEL_XMI = "_correspondence_model.xmi";

	protected final IJavaProject project;
	protected final IGravityModiscoProjectDiscoverer discoverer;
	protected final IFolder outputFolder;

	protected boolean load;
	protected boolean autosave = true;
	private boolean debug = false;

	private final String id;

	protected AbstractModiscoTGGConverter(final IJavaProject project, final String id, final boolean load)
			throws IOException, CoreException {
		this.id = id;
		this.load = load;
		this.project = project;

		this.outputFolder = EclipseProjectUtil.getGravityFolder(project.getProject(), null).getFolder(this.id);
		if (!this.outputFolder.exists()) {
			this.outputFolder.create(true, true, new NullProgressMonitor());
		}

		this.discoverer = GravityMoDiscoActivator.getDiscoverer(this.project, load);

		this.set = initResourceSet(this.discoverer);
		if (load) {
			load();
		}
	}

	public abstract boolean discard();

	protected abstract EPackage getCorrPackage();

	protected abstract String getSmaURI();

	private void load() throws IOException, CoreException {
		this.src = this.discoverer.loadModel();
		if (this.src != null) {
			this.trg = loadTarget();
			if (this.trg != null) {
				this.corr = loadCorrespondenceModel();
				if (this.corr != null) {
					EcoreUtil.resolveAll(this.corr);
					if (this.trg.equals(this.corr.getTarget()) && this.src.equals(this.corr.getSource())) {
						this.protocol = loadProtocol();
						if (this.protocol != null) {
							// Everything loaded successfully
							return;
						}
					}
				}
			}
			unload();
		}
	}

	/**
	 * @param project
	 * @param set
	 * @return
	 * @throws IOException
	 * @throws CoreException
	 */
	private SynchronizationProtocol loadProtocol() throws IOException, CoreException {
		final var monitor = new NullProgressMonitor();
		var protocolFile = this.outputFolder.getFile(this.id + PROTOCOL_XMI + ".zip");
		if (!protocolFile.exists() || !UptodateVisitor.isUptoDate(protocolFile)) {
			protocolFile = this.outputFolder.getFile(this.id + PROTOCOL_BIN);
			if (!protocolFile.exists() || !UptodateVisitor.isUptoDate(protocolFile)) {
				protocolFile = this.outputFolder.getFile(this.id + PROTOCOL_XMI);
				if (!protocolFile.exists() || !UptodateVisitor.isUptoDate(protocolFile)) {
					return null;
				}
			}
		}
		final var uri = EMFUtil.getPlatformResourceURI(protocolFile);
		Resource protocolResource;
		try {
			if (protocolFile.getFileExtension().equals("bin")) {
				protocolResource = new BinaryResourceImpl(uri);
				this.set.getResources().add(protocolResource);
				protocolResource.load(Collections.emptyMap());
			} else if (protocolFile.getFileExtension().equals("zip")) {
				protocolResource = this.set.createResource(uri);
				final Map<String, Boolean> options = new HashMap<>();
				options.put(Resource.OPTION_ZIP, true);
				protocolResource.load(options);
			} else {
				protocolResource = this.set.getResource(uri, true);
			}
		} catch (final IOException | NullPointerException | WrappedException e) {
			LOGGER.error(e);
			protocolFile.delete(true, monitor);
			return null;
		}
		final var synchronizationProtocol = new SynchronizationProtocol();
		synchronizationProtocol.load((PrecedenceStructure) protocolResource.getContents().get(0));
		return synchronizationProtocol;
	}

	/**
	 * Initializes the class
	 *
	 * @param discoverer
	 *
	 * @param set        The resource set which should be used
	 * @throws IOException
	 */
	protected ResourceSet initResourceSet(final IGravityModiscoProjectDiscoverer discoverer) throws IOException {
		this.set = discoverer.getResourceSet();
		this.set.getResourceFactoryRegistry().getExtensionToFactoryMap()
		.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		setCorrPackage(getCorrPackage());

		this.configurator = new org.moflon.tgg.algorithm.configuration.Configurator() {
		};
		clearChanges();

		loadRulesFromProject();
		return this.set;
	}

	/**
	 * Sets the eMoflon changes to empty consumers
	 */
	protected void clearChanges() {
		this.changeSrc = (root -> {
		});
		this.changeTrg = (root -> {
		});
	}

	protected void loadRulesFromProject() throws IOException {
		final var smaXmiURI = getSmaURI();
		final var optional = this.set.getResources().stream().filter(r -> smaXmiURI.equals(r.getURI().toString()))
				.findAny();
		Resource tggRulesResource;
		if (optional.isPresent()) {
			tggRulesResource = optional.get();
		} else {
			tggRulesResource = this.set.createResource(URI.createURI(smaXmiURI));
			try (var tggRulesStream = new URL(smaXmiURI).openConnection().getInputStream()) {
				tggRulesResource.load(tggRulesStream, Collections.emptyMap());
			}
		}
		setRules((StaticAnalysis) tggRulesResource.getContents().get(0));
	}

	protected EObject loadTarget() {
		return load(getTargetFile());
	}

	protected CorrespondenceModel loadCorrespondenceModel() {
		return (CorrespondenceModel) load(getCorrFile());
	}

	private EObject load(final IFile file) {
		if (!file.exists()) {
			return null;
		}
		try {
			final var resource = this.set.getResource(EMFUtil.getPlatformResourceURI(file), true);
			final var contents = resource.getContents();
			if(!contents.isEmpty()) {
				return contents.get(0);
			}
		} catch (final WrappedException e) {
			LOGGER.error("Stored correspondence model is not valid", e);
		}
		return null;
	}

	protected IFile getCorrFile() {
		return this.outputFolder.getFile(this.id + CORRESPONDENCE_MODEL_XMI);
	}

	public void unload() {
		this.trg = unload(this.trg);
		this.corr = unload(this.corr);

		if (this.protocol != null) {
			this.protocol = null;
		}
		this.changeSrc = null;
		this.changeTrg = null;
	}

	private <T extends EObject> T unload(T object) {
		if (object != null) {
			final var resource = object.eResource();
			if (resource != null) {
				resource.unload();
			}
			object = null;
		}
		return object;
	}

	public void disableAutosave() {
		this.autosave = false;
	}

	public void enableAutosave() {
		this.autosave = true;
	}

	@Override
	public void saveSynchronizationProtocol(final String path) {
		final var uri = URI.createPlatformResourceURI(path, false);
		saveModel(this.protocol.save(), uri);

	}

	/**
	 * Saves target model, MoDisco model, correspondence model and synchronization
	 * protocol to the gravity folder
	 *
	 * @param direction       a description of the direction of the conversion
	 * @param progressMonitor a progress monitor return false if the models couldn't
	 *                        be saved, true otherwise
	 */
	public boolean save(final IProgressMonitor monitor) {
		monitor.setTaskName("Save Models");
		final var targetFile = getTargetFile();
		if (!ModelSaver.saveModel(getTrg(), targetFile)) {
			return false;
		}
		if (!ModelSaver.saveModel(getCorr(), this.outputFolder.getFile(this.id + CORRESPONDENCE_MODEL_XMI))) {
			return false;
		}
		return ModelSaver.saveModel(getResourceSet(), getSynchronizationProtocol().save(),
				this.outputFolder.getFile(this.id + PROTOCOL_XMI));
	}

	protected abstract IFile getTargetFile();

	public IJavaProject getProject() {
		return this.project;
	}

	public boolean isDebug() {
		return this.debug;
	}

	public void setDebug(final boolean debug) {
		this.debug = debug;
	}
}
