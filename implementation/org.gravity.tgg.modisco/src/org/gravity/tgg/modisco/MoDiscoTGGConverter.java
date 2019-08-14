package org.gravity.tgg.modisco;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.Consumer;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import static org.gravity.eclipse.io.ModelSaver.*;

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

	private IJavaProject iJavaProject = null;

	private Collection<IPath> libs;

	private boolean debug;

	private IFolder modiscoFolder;

	private GravityModiscoProjectDiscoverer discoverer;

	private MGravityModel targetModel;

	private TGGApp sync;

	private static final Logger LOGGER = Logger.getLogger(MoDiscoTGGConverter.class);

	/**
	 * Initializes ResourceSet for EMF and eMoflon
	 * 
	 * @throws IOException           If the eMoflon TGG rules couldn't be loaded
	 */
	public MoDiscoTGGConverter() throws IOException {
		this.discoverer = new GravityModiscoProjectDiscoverer();
		this.sync = new TGGApp();
	}

	public boolean discard() {
		try {
			this.sync.terminate();
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
			return false;
		}
		return true;
	}
	
	@Override
	public boolean convertProject(IJavaProject project, IProgressMonitor monitor) {
		libs = new HashSet<>();
		return convertProject(project, libs, monitor);
	}

	@Override
	public boolean convertProject(IJavaProject javaProject, Collection<IPath> libs, IProgressMonitor monitor) {
		IProgressMonitor progressMonitor;
		if (monitor == null) {
			progressMonitor = new NullProgressMonitor();
		} else {
			progressMonitor = monitor;
		}

		GravityActivator.getDefault().addProject(javaProject.getProject());
		this.iJavaProject = javaProject;
		this.modiscoFolder = javaProject.getProject().getFolder("modisco"); //$NON-NLS-1$
		this.libs = libs;

		long start = System.currentTimeMillis();
		LOGGER.log(Level.INFO, "GRaViTY convert project: " + javaProject.getProject().getName());

		try {
			targetModel = discoverer.discoverMGravityModelFromProject(javaProject, libs, progressMonitor);
		} catch (DiscoveryException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return false;
		}
		if (this.debug) {
			saveModel(targetModel, this.modiscoFolder.getFile("modisco_preprocessed.xmi"), progressMonitor); //$NON-NLS-1$
		}
		sync.getSourceResource().getContents().add(targetModel);

		long t4 = System.currentTimeMillis();
		LOGGER.log(Level.INFO, "eMoflon TGG fwd trafo");
		try {
			sync.forward();
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, e);
			return false;
		}
		LOGGER.log(Level.INFO, "eMoflon TGG fwd trafo - done " + (System.currentTimeMillis() - t4) + "ms");

		boolean success = sync.getTargetResource() != null && sync.getTargetResource().getContents().get(0) instanceof TypeGraph;
		if (success) {
			Collection<IProgramGraphProcessor> sortedProcessors = ProgramGraphProcesorUtil
					.getSortedProcessors(MoDiscoTGGActivator.PROCESS_PG_FWD);
			LOGGER.log(Level.INFO, "Start postprocessing with " + sortedProcessors.size() + " post-processors");
			for (IProgramGraphProcessor processor : sortedProcessors) {
				processor.process(getPG(), progressMonitor);
			}
			LOGGER.log(Level.INFO, "Postprocessing - done ");
		}

		if (this.debug) {
			savePG(this.modiscoFolder.getFile("pg.xmi"), progressMonitor); //$NON-NLS-1$
	}


		LOGGER.log(Level.INFO, "GRaViTY convert project - done " + (System.currentTimeMillis() - start) + "ms");

		return success;
	}

	@Override
	public boolean syncProjectFwd(IProgressMonitor monitor) {
		long start = System.currentTimeMillis();
		if (this.discoverer == null || this.iJavaProject == null) {
			return false;
		}
		LOGGER.log(Level.INFO, start + " MoDisco sync project: " + iJavaProject.getProject().getName());

		if (targetModel == null) {
			return convertProject(iJavaProject, monitor);
		}
		MGravityModel oldProject = targetModel;
		LOGGER.log(Level.INFO, System.currentTimeMillis() + " Discover Project");
		try {
			targetModel = this.discoverer.discoverMGravityModelFromProject(iJavaProject, monitor);
		} catch (DiscoveryException e) {
			LOGGER.error(e);
			return false;
		}
		LOGGER.log(Level.INFO, System.currentTimeMillis() + " Discover Project - Done");

		GravityMoDiscoModelPatcher patcher = MoDiscoTGGActivator.getDefault().getSelectedPatcher();

		Consumer<EObject> changeSrc2 = SynchronizationHelper -> {

			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Calculate Patch");
			patcher.update(oldProject, targetModel);
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Calculate Patch - Done");

		};

		boolean success = syncProjectFwd(changeSrc2, monitor);

		long stop = System.currentTimeMillis();
		LOGGER.log(Level.INFO, stop + "MoDisco sync project -done: " + (stop - start) + "ms");

		return success;
	}

	@Override
	public boolean syncProjectFwd(Consumer<EObject> consumer, IProgressMonitor monitor) {
		LOGGER.log(Level.INFO, System.currentTimeMillis() + " Integrate FWD");

		try {
			sync.forward();
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, e);
			return false;
		}
		LOGGER.log(Level.INFO, System.currentTimeMillis() + " Integrate FWD - Done");

		if (this.debug) {
			saveModel(sync.getSourceResource(), this.modiscoFolder.getFile("modisco.xmi"), monitor); //$NON-NLS-1$
			savePG(this.modiscoFolder.getFile("pg.xmi"), monitor); //$NON-NLS-1$
		}
		Resource trg = sync.getTargetResource();
		return trg != null && !trg.getContents().isEmpty();
	}

	@Override
	public boolean syncProjectBwd(Consumer<EObject> consumer, IProgressMonitor monitor) {
		if (this.discoverer == null) {
			return false;
		}

		IProgressMonitor progressMonitor;
		if (monitor == null) {
			progressMonitor = new NullProgressMonitor();
		} else {
			progressMonitor = monitor;
		}

		for (IProgramGraphProcessor processor : ProgramGraphProcesorUtil
				.getSortedProcessors(MoDiscoTGGActivator.PROCESS_PG_BWD)) {
			processor.process(getPG(), progressMonitor);
		}
		try {
			sync.backward();
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, e);
			return false;
		}

		if (this.debug) {
			save("bwd", progressMonitor); //$NON-NLS-1$

		}

		EObject src = sync.getSourceResource().getContents().get(0);
		for (IMoDiscoProcessor processor : GravityMoDiscoProcessorUtil
				.getSortedProcessors(MoDiscoTGGActivator.PROCESS_MODISCO_BWD)) {
			processor.process((MGravityModel) src, progressMonitor);
		}

		try {
			IFolder srcFile = this.iJavaProject.getProject().getFolder("src");
			new GenerateJavaExtended(src, srcFile.getLocation().toFile(), Collections.emptyList())
					.doGenerate(new BasicMonitor.EclipseSubProgress(progressMonitor, 1));
			this.iJavaProject.getProject().refreshLocal(IProject.DEPTH_INFINITE, progressMonitor);
		} catch (IOException | CoreException e) {
			return false;
		}

		return true;
	}

	/**
	 * Saves program model, MoDisco model, correspondence model and synchronization
	 * protocol to the modisco folder
	 * 
	 * @param progressMonitor a progress monitor
	 * @param direction       a string describing the direction of the conversion
	 */
	private void save(String direction, IProgressMonitor progressMonitor) {
		savePG(this.modiscoFolder.getFile("sync_" + direction + "_pg.xmi"), progressMonitor); //$NON-NLS-1$
		saveModel(sync.getSourceResource(), this.modiscoFolder.getFile("sync_" + direction + "_modisco.xmi"), //$NON-NLS-1$
				progressMonitor);
		saveModel(sync.getCorrResource(), this.modiscoFolder.getFile("sync_" + direction + "_correspondence_model.xmi"), //$NON-NLS-1$
				progressMonitor);
		saveModel(sync.getProtocolResource(), this.modiscoFolder.getFile("sync_" + direction + "bwd_sync_protocol.xmi"), //$NON-NLS-1$
				progressMonitor);
	}

	@Override
	public boolean savePG(IFile file, IProgressMonitor monitor) {
		return saveModel(sync.getTargetResource(), file, monitor);
	}

	@Override
	public TypeGraph getPG() {
		Resource resource = sync.getTargetResource();
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
	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	@Override
	public ResourceSet getResourceSet() {
		return discoverer.getResourceSet();
	}

}
