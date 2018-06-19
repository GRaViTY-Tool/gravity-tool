package org.gravity.tgg.modisco;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
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
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.ImportDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.NamedElement;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.gravity.eclipse.converter.IPGConverter;
import static org.gravity.eclipse.io.ModelSaver.*;

import org.gravity.modisco.GravityMoDiscoModelPatcher;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.modisco.processing.GravityMoDiscoProcessorUtil;
import org.gravity.modisco.processing.IMoDiscoProcessor;
import org.gravity.tgg.modisco.processing.pg.IProgramGraphProcessor;
import org.gravity.tgg.modisco.processing.pg.ProgramGraphProcesorUtil;
import org.gravity.tgg.modisco.processing.pg.ProgramGraphProcessorFWD;
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.configuration.PGSavingConfigurator;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.analysis.StaticAnalysis;

public class MoDiscoTGGConverter extends SynchronizationHelper implements IPGConverter {

	private IJavaProject java_project = null;

	private Collection<IPath> libs;

	private boolean debug;

	private IFolder modisco_folder;

	private Resource tggRulesResource;

	private GravityModiscoProjectDiscoverer discoverer;

	private MGravityModel targetModel;

	public MoDiscoTGGConverter() throws MalformedURLException, IOException {
		this.discoverer = new GravityModiscoProjectDiscoverer();

		BasicConfigurator.configure();

		this.set = this.discoverer.getResourceSet();
		this.set.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		this.corrPackageResource = this.set.createResource(URI.createURI("GravityTGG.ecore")); //$NON-NLS-1$
		InputStream corr_package = new URL("platform:/plugin/org.gravity.tgg.modisco/model/Modisco.ecore") //$NON-NLS-1$
				.openConnection().getInputStream();
		this.corrPackageResource.load(corr_package, Collections.EMPTY_MAP);
		corr_package.close();

		this.configurator = new Configurator() {
		};
		this.changeSrc = (root -> {
		});
		this.changeTrg = (root -> {
		});

		InputStream tgg_rules = new URL("platform:/plugin/org.gravity.tgg.modisco/model/Modisco.sma.xmi") //$NON-NLS-1$
				.openConnection().getInputStream();
		this.tggRulesResource = this.set.createResource(URI.createURI("TGGRules.sma.xmi")); //$NON-NLS-1$
		this.tggRulesResource.load(tgg_rules, Collections.EMPTY_MAP);
		tgg_rules.close();

		setRules((StaticAnalysis) this.tggRulesResource.getContents().get(0));
	}

	@Override
	public boolean convertProject(IJavaProject project, IProgressMonitor monitor) {
		libs = new HashSet<>();
		return convertProject(project, libs, monitor);
	}

	@Override
	public boolean convertProject(IJavaProject java_project, Collection<IPath> libs, IProgressMonitor monitor) {
		IProgressMonitor progressMonitor;
		if (monitor == null) {
			progressMonitor = new NullProgressMonitor();
		} else {
			progressMonitor = monitor;
		}

		long start = System.currentTimeMillis();
		System.out.println(start + " GRaViTY convert project: " + java_project.getProject().getName());

		this.java_project = java_project;
		this.modisco_folder = java_project.getProject().getFolder("modisco"); //$NON-NLS-1$
		this.libs = libs;

		// if(!createOutFiles(java_project, monitor)){
		// System.err.println("Creating output folders failed.");
		// return false;
		// }

		try {
			targetModel = discoverer.discoverMGravityModelFromProject(java_project, libs, progressMonitor);
		} catch (DiscoveryException e) {
			e.printStackTrace();
			return false;
		}
		if (this.debug) {
			saveModel(targetModel, this.modisco_folder.getFile("modisco_preprocessed.xmi"), progressMonitor); //$NON-NLS-1$
		}

		setSrc(targetModel);
		setChangeSrc(null);
		this.changeSrc = (root -> {
		});
		this.changeTrg = (root -> {
		});
		setSynchronizationProtocol(null);

		if (debug) {
			setConfigurator(new PGSavingConfigurator(this,
					this.modisco_folder.getFile("emoflon_pg.xmi").getLocation().toString()));
		}

		long t4 = System.currentTimeMillis();
		System.out.println(t4 + " eMoflon TGG fwd trafo");
		integrateForward();

		boolean trgNotNull = getTrg() != null;
		boolean success = trgNotNull && getTrg() instanceof TypeGraph;

		org.moflon.tgg.runtime.PrecedenceStructure ps = null;
		if (this.debug) {
			// Create precedence structure before applying prepocessing to allow
			// replacements of model elements using crossreferences.
			ps = protocol.save();
			set.createResource(eMoflonEMFUtil
					.createFileURI(this.modisco_folder.getFile("sync_protocol.xmi").getLocation().toString(), false)) //$NON-NLS-1$
					.getContents().add(ps);
		}

		if (success)
			for (IProgramGraphProcessor processor : ProgramGraphProcesorUtil
					.getSortedProcessors(MoDiscoTGGActivator.PROCESS_PG_FWD)) {
				processor.process(getPG(), progressMonitor);
			}

		long t5 = System.currentTimeMillis();
		System.out.println(t5 + " eMoflon TGG fwd trafo - done " + (t5 - t4) + "ms");
		if (this.debug) {
			savePG(this.modisco_folder.getFile("pg.xmi"), progressMonitor); //$NON-NLS-1$
			saveCorr(this.modisco_folder.getFile("correspondence_model.xmi").getLocation().toString()); //$NON-NLS-1$
			eMoflonEMFUtil.saveModel(ps.eResource().getResourceSet(), ps, ps.eResource().getURI().path());
		}

		if (!success) {
			if (src != null) {
				src.eResource().unload();
				src = null;
			}
			if (trgNotNull) {
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

		long stop = System.currentTimeMillis();
		System.out.println(stop + " GRaViTY convert project - done " + (stop - start) + "ms");

		return success;
	}

	@Override
	public boolean syncProjectFwd(IProgressMonitor monitor) {
		long start = System.currentTimeMillis();
		if (this.discoverer == null || this.java_project == null) {
			return false;
		}
		System.out.println(start + " MoDisco sync project: " + java_project.getProject().getName());

		if (targetModel == null) {
			return convertProject(java_project, monitor);
		}
		MGravityModel oldProject = targetModel;
		System.out.println(System.currentTimeMillis() + " Discover Project");
		try {
			targetModel = this.discoverer.discoverMGravityModelFromProject(java_project, monitor);
		} catch (DiscoveryException e) {
			e.printStackTrace();
			return false;
		}
		System.out.println(System.currentTimeMillis() + " Discover Project - Done");

		GravityMoDiscoModelPatcher patcher = MoDiscoTGGActivator.getDefault().getSelectedPatcher();

		Consumer<EObject> changeSrc2 = SynchronizationHelper -> {

			System.out.println(System.currentTimeMillis() + " Calculate Patch");
			patcher.update(oldProject, targetModel);
			System.out.println(System.currentTimeMillis() + " Calculate Patch - Done");

		};

		boolean success = syncProjectFwd(changeSrc2, monitor);

		long stop = System.currentTimeMillis();
		System.out.println(stop + "MoDisco sync project -done: " + (stop - start) + "ms");

		return success;
	}

	@Override
	public boolean syncProjectFwd(Consumer<EObject> consumer, IProgressMonitor monitor) {
		System.out.println(System.currentTimeMillis() + " Integrate FWD");

		setChangeSrc(consumer);

		integrateForward();
		System.out.println(System.currentTimeMillis() + " Integrate FWD - Done");

		if (this.debug) {
			saveMoDiscoModel(this.modisco_folder.getFile("modisco.xmi"), monitor); //$NON-NLS-1$
			savePG(this.modisco_folder.getFile("pg.xmi"), monitor); //$NON-NLS-1$
		}
		return getTrg() != null;
	}

	@Override
	public boolean syncProjectBwd(Consumer<EObject> consumer, IProgressMonitor monitor) {
		if (this.discoverer == null) {
			return false;
		}

		for (IProgramGraphProcessor processor : ProgramGraphProcesorUtil
				.getSortedProcessors(MoDiscoTGGActivator.PROCESS_PG_BWD)) {
			processor.process(getPG(), monitor);
		}
		setChangeTrg(consumer);
		integrateBackward();

		if (this.debug) {
			savePG(this.modisco_folder.getFile("sync_bwd_pg.xmi"), monitor); //$NON-NLS-1$
			saveMoDiscoModel(this.modisco_folder.getFile("sync_bwd_modisco.xmi"), monitor); //$NON-NLS-1$
			saveCorr(this.modisco_folder.getFile("sync_bwd_correspondence_model.xmi").getLocation().toString()); //$NON-NLS-1$
			saveSynchronizationProtocol(
					this.modisco_folder.getFile("sync_bwd_sync_protocol.xmi").getLocation().toString()); //$NON-NLS-1$

		}

		for (IMoDiscoProcessor processor : GravityMoDiscoProcessorUtil
				.getSortedProcessors(MoDiscoTGGActivator.PROCESS_MODISCO_BWD)) {
			processor.process((MGravityModel) getSrc(), monitor);
		}

		try {
			IFolder out_file = this.java_project.getProject().getFolder("src");
			if (monitor == null) {
				monitor = new NullProgressMonitor();
			}
			new GenerateJavaExtended(getSrc(), out_file.getLocation().toFile(), Collections.emptyList())
					.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
		} catch (IOException e1) {
			e1.printStackTrace();
			return false;
		}

		try {
			this.java_project.getProject().refreshLocal(IProject.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	private void addLibToProject(IJavaProject java_project, Collection<IPath> libs, IProgressMonitor monitor) {
		try {
			Set<IPackageFragmentRoot> roots = new HashSet<>(libs.size());
			IClasspathEntry[] oldClasspath = java_project.getRawClasspath();
			for (IPath lib : libs) {
				File file;
				if (lib.isRoot()) {
					file = lib.toFile();
				} else {
					IPath ws = ResourcesPlugin.getWorkspace().getRoot().getLocation();
					file = ws.append(lib).toFile();
				}
				if (file.exists()) {
					boolean contained = false;
					for (IClasspathEntry e : oldClasspath) {
						contained |= e.getPath().makeAbsolute().equals(lib);
					}
					if (!contained) {
						IPackageFragmentRoot root = java_project.getPackageFragmentRoot(file.getAbsolutePath());
						roots.add(root);
					}
				}
			}
			IClasspathEntry[] newClasspath = new IClasspathEntry[oldClasspath.length + roots.size()];
			System.arraycopy(oldClasspath, 0, newClasspath, 0, oldClasspath.length);
			int i = oldClasspath.length;
			for (IPackageFragmentRoot root : roots) {
				newClasspath[i++] = root.getResolvedClasspathEntry();
			}
			java_project.setRawClasspath(newClasspath, monitor);
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}

	private boolean createOutFiles(IJavaProject java_project, IProgressMonitor monitor) {
		IProject project = java_project.getProject();
		this.modisco_folder = project.getFolder("modisco"); //$NON-NLS-1$
		if (!this.modisco_folder.exists()) {
			try {
				this.modisco_folder.create(true, true, monitor);
			} catch (CoreException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean savePG(IFile file, IProgressMonitor monitor) {
		return saveModel(getTrg(), file, monitor);
	}

	private boolean saveMoDiscoModel(IFile modisco_file, IProgressMonitor monitor) {
		return saveModel(getSrc(), modisco_file, monitor);
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
