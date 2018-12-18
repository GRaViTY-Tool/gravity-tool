package org.gravity.tgg.modisco;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.Consumer;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
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
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.configuration.PGSavingConfigurator;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.analysis.StaticAnalysis;

/**
 * A converter for creating a program model from eclipse projects using MoDisco
 * 
 * @author speldszus
 *
 */
public class MoDiscoTGGConverter extends SynchronizationHelper implements IPGConverter {

	private IJavaProject iJavaProject = null;

	private Collection<IPath> libs;

	private boolean debug;

	private IFolder modiscoFolder;

	private Resource tggRulesResource;

	private GravityModiscoProjectDiscoverer discoverer;

	private MGravityModel targetModel;

	private static final Logger LOGGER = Logger.getLogger(MoDiscoTGGConverter.class);

	/**
	 * Initializes ResourceSet for EMF and eMoflon
	 * 
	 * @throws MalformedURLException If the eMoflon TGG rules couldn't be loaded
	 * @throws IOException           If the eMoflon TGG rules couldn't be loaded
	 */
	public MoDiscoTGGConverter() throws MalformedURLException, IOException {
		this.discoverer = new GravityModiscoProjectDiscoverer();

		BasicConfigurator.configure();

		this.set = this.discoverer.getResourceSet();
		this.set.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		this.corrPackageResource = this.set.createResource(URI.createURI("GravityTGG.ecore")); //$NON-NLS-1$
		InputStream corrPackage = new URL("platform:/plugin/org.gravity.tgg.modisco/model/Modisco.ecore") //$NON-NLS-1$
				.openConnection().getInputStream();
		this.corrPackageResource.load(corrPackage, Collections.EMPTY_MAP);
		corrPackage.close();

		this.configurator = new Configurator() {
		};
		clearChanges();

		InputStream tggRulesStream = new URL("platform:/plugin/org.gravity.tgg.modisco/model/Modisco.sma.xmi") //$NON-NLS-1$
				.openConnection().getInputStream();
		this.tggRulesResource = this.set.createResource(URI.createURI("TGGRules.sma.xmi")); //$NON-NLS-1$
		this.tggRulesResource.load(tggRulesStream, Collections.EMPTY_MAP);
		tggRulesStream.close();

		setRules((StaticAnalysis) this.tggRulesResource.getContents().get(0));
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

		this.projectName = javaProject.getProject().getName();
		GravityActivator.getDefault().addProject(javaProject.getProject());
		this.iJavaProject = javaProject;
		this.modiscoFolder = javaProject.getProject().getFolder("modisco"); //$NON-NLS-1$
		this.libs = libs;

		long start = System.currentTimeMillis();
		LOGGER.log(Level.INFO, "GRaViTY convert project: " + this.projectName);

		try {
			targetModel = discoverer.discoverMGravityModelFromProject(javaProject, libs, progressMonitor);
		} catch (DiscoveryException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return false;
		}
		if (this.debug) {
			saveModel(targetModel, this.modiscoFolder.getFile("modisco_preprocessed.xmi"), progressMonitor); //$NON-NLS-1$
		}
		
		setSrc(targetModel);
		setChangeSrc(null);
		clearChanges();
		setSynchronizationProtocol(null);

		if (debug) {
			setConfigurator(new PGSavingConfigurator(this,
					this.modiscoFolder.getFile("emoflon_pg.xmi").getLocation().toString()));
		}

		long t4 = System.currentTimeMillis();
		LOGGER.log(Level.INFO, "eMoflon TGG fwd trafo");
		integrateForward();
		LOGGER.log(Level.INFO, "eMoflon TGG fwd trafo - done " + (System.currentTimeMillis() - t4) + "ms");

		org.moflon.tgg.runtime.PrecedenceStructure ps = null;
		if (this.debug) {
			// Create precedence structure before applying prepocessing to allow
			// replacements of model elements using crossreferences.
			ps = protocol.save();
			set.createResource(eMoflonEMFUtil
					.createFileURI(this.modiscoFolder.getFile("sync_protocol.xmi").getLocation().toString(), false)) //$NON-NLS-1$
					.getContents().add(ps);
		}
		boolean success = trg != null && trg instanceof TypeGraph;
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
			saveCorr(this.modiscoFolder.getFile("correspondence_model.xmi").getLocation().toString()); //$NON-NLS-1$
			eMoflonEMFUtil.saveModel(ps.eResource().getResourceSet(), ps, ps.eResource().getURI().path());
		}

		if (!success) {
			reset();
		}

		LOGGER.log(Level.INFO, "GRaViTY convert project - done " + (System.currentTimeMillis() - start) + "ms");

		return success;
	}

	/**
	 * Resets the converter to initial values
	 */
	private void reset() {
		if (src != null) {
			src.eResource().unload();
			src = null;
		}
		if (trg != null) {
			trg.eResource().unload();
			trg = null;
		}
		if (corr != null) {
			corr.eResource().unload();
			corr = null;
		}
		if (protocol != null) {
			protocol = null;
		}
		set = new ResourceSetImpl();
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
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
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

		setChangeSrc(consumer);

		integrateForward();
		LOGGER.log(Level.INFO, System.currentTimeMillis() + " Integrate FWD - Done");

		if (this.debug) {
			saveModel(src, this.modiscoFolder.getFile("modisco.xmi"), monitor); //$NON-NLS-1$
			savePG(this.modiscoFolder.getFile("pg.xmi"), monitor); //$NON-NLS-1$
		}
		return getTrg() != null;
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
		setChangeTrg(consumer);
		integrateBackward();

		if (this.debug) {
			save("bwd", progressMonitor); //$NON-NLS-1$

		}

		for (IMoDiscoProcessor processor : GravityMoDiscoProcessorUtil
				.getSortedProcessors(MoDiscoTGGActivator.PROCESS_MODISCO_BWD)) {
			processor.process((MGravityModel) getSrc(), progressMonitor);
		}

		try {
			IFolder srcFile = this.iJavaProject.getProject().getFolder("src");
			new GenerateJavaExtended(getSrc(), srcFile.getLocation().toFile(), Collections.emptyList())
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
		saveModel(this.src, this.modiscoFolder.getFile("sync_" + direction + "_modisco.xmi"), progressMonitor); //$NON-NLS-1$
		saveCorr(
				this.modiscoFolder.getFile("sync_" + direction + "_correspondence_model.xmi").getLocation().toString()); //$NON-NLS-1$
		saveSynchronizationProtocol(
				this.modiscoFolder.getFile("sync_" + direction + "bwd_sync_protocol.xmi").getLocation().toString()); //$NON-NLS-1$
	}

	@Override
	public void setSrc(EObject sourceModel) {
		GravityActivator.getDefault().addSrc(projectName, sourceModel);
		super.setSrc(sourceModel);
	}

	@Override
	public void setTrg(EObject targetModel) {
		GravityActivator.getDefault().addTrg(projectName, targetModel);
		super.setTrg(targetModel);
	}

	@Override
	public boolean savePG(IFile file, IProgressMonitor monitor) {
		return saveModel(getTrg(), file, monitor);
	}

	@Override
	public TypeGraph getPG() {
		return (TypeGraph) getTrg();
	}

	@Override
	public boolean isDebug() {
		return this.debug;
	}

	@Override
	public void setDebug(boolean debug) {
		// this.verbose = debug;
		this.debug = debug;
	}

}
