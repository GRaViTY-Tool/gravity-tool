package org.gravity.tgg.modisco;

import static org.gravity.eclipse.io.ModelSaver.saveModel;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.generation.files.GenerateJavaExtended;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.GravityMoDiscoModelPatcher;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.modisco.processing.GravityMoDiscoProcessorUtil;
import org.gravity.modisco.processing.IMoDiscoProcessor;
import org.gravity.tgg.modisco.processing.pg.IProgramGraphProcessor;
import org.gravity.tgg.modisco.processing.pg.ProgramGraphProcesorUtil;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * A converter for creating a program model from eclipse projects using MoDisco
 *
 * @author speldszus
 *
 */
public class MoDiscoTGGConverter implements IPGConverter {

	private final IJavaProject iJavaProject;

	private boolean debug;

	private final GravityModiscoProjectDiscoverer discoverer;

	private MGravityModel preprocessedModiscoModel;

	private TGGApp sync;

	private static final Logger LOGGER = Logger.getLogger(MoDiscoTGGConverter.class);

	/**
	 * Initializes ResourceSet for EMF and eMoflon
	 *
	 * @param project The project this converter is created for
	 *
	 * @throws IOException If the eMoflon TGG rules couldn't be loaded
	 */
	public MoDiscoTGGConverter(final IJavaProject project) throws IOException {
		this.discoverer = new GravityModiscoProjectDiscoverer();
		this.iJavaProject = project;
		GravityActivator.getDefault().addProject(project.getProject());
	}

	@Override
	public boolean discard() {
		if (this.sync == null) {
			return true;
		}
		try {
			this.sync.terminate();
		} catch (final IOException e) {
			LOGGER.error(e.getMessage(), e);
			return false;
		}
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
		if (infoEnabled) {
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

		/*try {
			final IFile file = EclipseProjectUtil.getGravityFolder(this.iJavaProject.getProject(), progressMonitor)
					.getFile("modisco" + System.currentTimeMillis() + ".xmi");
			saveModel(this.preprocessedModiscoModel.eResource(), file, progressMonitor);
		} catch (final IOException e) {
			if (LOGGER.isEnabledFor(Level.WARN)) {
				LOGGER.warn(e);
			}
		}*/

		final boolean success = convertModel(this.preprocessedModiscoModel, progressMonitor);

		if (infoEnabled) {
			LOGGER.log(Level.INFO, "GRaViTY convert project - done " + (System.currentTimeMillis() - start) + "ms");
		}

		return success;
	}

	/**
	 * Converts the modisco model of the given project into a program model
	 *
	 * @param targetModel The modisco model of the Java project
	 * @param monitor     A progress monitor
	 * @return If the model has been converted successfully
	 */
	public boolean convertModel(final MGravityModel targetModel,
			final IProgressMonitor monitor) {
		try {
			this.sync = new TGGApp(this.iJavaProject.getProject());
		} catch (final IOException e) {
			LOGGER.error(e.getMessage(), e);
			return false;
		}
		this.sync.getResourceHandler().getSourceResource().getContents().add(targetModel);

		final boolean infoEnabled = LOGGER.isInfoEnabled();
		long start = 0;
		if (infoEnabled) {
			start = System.currentTimeMillis();
			LOGGER.log(Level.INFO, "eMoflon TGG fwd trafo");
		}

		try {
			this.sync.forward();
		} catch (final IOException e) {
			LOGGER.log(Level.ERROR, e);
			return false;
		}
		if (infoEnabled) {
			LOGGER.log(Level.INFO, "eMoflon TGG fwd trafo - done " + (System.currentTimeMillis() - start) + "ms");
		}

		boolean success = this.sync.getResourceHandler().getTargetResource() != null;
		if (success) {
			final List<EObject> contents = this.sync.getResourceHandler().getTargetResource().getContents();
			success = !contents.isEmpty() && contents.get(0) instanceof TypeGraph;
		}
		if (success) {
			final Collection<IProgramGraphProcessor> sortedProcessors = ProgramGraphProcesorUtil
					.getSortedProcessors(MoDiscoTGGActivator.PROCESS_PG_FWD);
			if (infoEnabled) {
				LOGGER.log(Level.INFO, "Start postprocessing with " + sortedProcessors.size() + " post-processors");
			}
			for (final IProgramGraphProcessor processor : sortedProcessors) {
				processor.process(getPG(), monitor);
			}
			if (infoEnabled) {
				LOGGER.log(Level.INFO, "Postprocessing - done ");
			}
		}
		return success;
	}

	@Override
	public boolean syncProjectFwd(final IProgressMonitor monitor) {
		if (this.discoverer == null || this.iJavaProject == null) {
			return false;
		}
		long start = 0;
		final boolean infoEnabled = LOGGER.isInfoEnabled();
		if (infoEnabled) {
			start = System.currentTimeMillis();
			LOGGER.log(Level.INFO, start + " MoDisco sync project: " + this.iJavaProject.getProject().getName()); // NOPMD
			// by
			// speldszus
			// on
			// 12/4/19,
			// 9:09
			// PM
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
		if (this.sync == null) {
			LOGGER.error("No initial transformation has been performed!");
			return false;
		}
		final boolean infoEnabled = LOGGER.isInfoEnabled();
		if (infoEnabled) {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Integrate FWD"); // NOPMD by speldszus on 12/4/19,
			// 9:08 PM
		}
		try {
			this.sync.forward();
		} catch (final IOException e) {
			LOGGER.log(Level.ERROR, e);
			return false;
		}
		if (infoEnabled) {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Integrate FWD - Done");
		}

		if (this.debug) {
			save(monitor);
		}
		final Resource trg = this.sync.getResourceHandler().getTargetResource();
		return trg != null && !trg.getContents().isEmpty();
	}

	@Override
	public boolean syncProjectBwd(final Consumer<EObject> consumer, final IProgressMonitor monitor) {
		if (this.discoverer == null || this.sync == null) {
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
		try {
			this.sync.backward();
		} catch (final IOException e) {
			LOGGER.log(Level.ERROR, e);
			return false;
		}

		if (this.debug) {
			save(progressMonitor);

		}

		final EObject src = this.sync.getResourceHandler().getSourceResource().getContents().get(0);
		for (final IMoDiscoProcessor processor : GravityMoDiscoProcessorUtil
				.getSortedProcessors(MoDiscoTGGActivator.PROCESS_MODISCO_BWD)) {
			processor.process((MGravityModel) src, progressMonitor);
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
		IFolder folder;
		try {
			folder = EclipseProjectUtil.getGravityFolder(this.iJavaProject.getProject(), progressMonitor);
		} catch (final IOException e) {
			LOGGER.error(e);
			return false;
		}
		if (!savePG(folder.getFile("sync_pm.xmi"), progressMonitor)) { //$NON-NLS-1$
			return false;
		}
		if (!saveModel(this.sync.getResourceHandler().getSourceResource(), folder.getFile("sync__modisco.xmi"), //$NON-NLS-1$
				progressMonitor)) {
			return false;
		}
		if (!saveModel(this.sync.getResourceHandler().getCorrResource(), folder.getFile("sync_correspondence_model.xmi"), //$NON-NLS-1$
				progressMonitor)) {
			return false;
		}
		return saveModel(this.sync.getResourceHandler().getProtocolResource(), folder.getFile("sync__protocol.xmi"), //$NON-NLS-1$
				progressMonitor);
	}

	@Override
	public boolean savePG(final IFile file, final IProgressMonitor monitor) {
		return saveModel(this.sync.getResourceHandler().getTargetResource(), file, monitor);
	}

	@Override
	public TypeGraph getPG() {
		final Resource resource = this.sync.getResourceHandler().getTargetResource();
		if (resource != null && !resource.getContents().isEmpty()) {
			return (TypeGraph) resource.getContents().get(0);
		}
		LOGGER.log(Level.ERROR, "There is no program model!");
		return null;
	}

	@Override
	public boolean isDebug() {
		return this.debug;
	}

	@Override
	public void setDebug(final boolean debug) {
		this.debug = debug;
	}
}
