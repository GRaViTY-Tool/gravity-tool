package org.gravity.tgg.modisco;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
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
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;
import org.gravity.eclipse.converter.IPGConverter;
import static org.gravity.eclipse.io.ModelSaver.*;

import org.gravity.modisco.GravityMoDiscoModelPatcher;
import org.gravity.modisco.MGravityModel;
import org.gravity.tgg.modisco.postprocessing.MoDiscoTGGPostprocessing;
import org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing;
import org.gravity.typegraph.basic.TypeGraph;
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

	class MyDiscoverJavaModelFromJavaProject extends DiscoverJavaModelFromJavaProject {
		public ResourceSet getRS() {
			return getResourceSet();
		}

		public ElementsToAnalyze getElemetstoAnalyze() {
			return getElementsToAnalyze();
		}
	}

	private MyDiscoverJavaModelFromJavaProject discoverer;

	public MoDiscoTGGConverter() throws MalformedURLException, IOException {
		this.discoverer = new MyDiscoverJavaModelFromJavaProject();

		BasicConfigurator.configure();

		this.set = this.discoverer.getRS();
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

		long t0 = System.currentTimeMillis();
		try {
			java_project.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		System.out.println(t0 + " MoDisco discover project: " + java_project.getProject().getName());
		Model eobject = discoverProject(java_project, libs, progressMonitor);
		long t1 = System.currentTimeMillis();
		System.out.println(t1 + " MoDisco discover project - done " + (t1 - t0) + "ms");
		
		if(eobject == null){
			return false;
		}

		if (this.debug) {
			saveModel(eobject, this.modisco_folder.getFile("modisco.xmi"), progressMonitor); //$NON-NLS-1$ );
		}
		if (progressMonitor.isCanceled()) {
			return false;
		}

		long t2 = System.currentTimeMillis();
		System.out.println(t2 + " MoDisco preprocessing");
		if (eobject instanceof MGravityModel) {
			MGravityModel model = (MGravityModel) eobject;

			if(!MoDiscoTGGPreprocessing.preprocess(progressMonitor, model)){
				System.out.println("ERROR: Preprocessing failed");
				return false;
			}
		}
		long t3 = System.currentTimeMillis();
		System.out.println(t3 + " MoDisco preprocessing - done " + (t3 - t2) + "ms");
		if (this.debug) {
			saveModel(eobject, this.modisco_folder.getFile("modisco_preprocessed.xmi"), progressMonitor); //$NON-NLS-1$
		}

		setSrc(eobject);
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
		
		MoDiscoTGGPostprocessing.postprocess(getPG(), monitor);

		long t5 = System.currentTimeMillis();
		System.out.println(t5 + " eMoflon TGG fwd trafo - done " + (t5 - t4) + "ms");
		if (this.debug) {
			savePG(this.modisco_folder.getFile("pg.xmi"), progressMonitor); //$NON-NLS-1$
			saveCorr(this.modisco_folder.getFile("correspondence_model.xmi").getLocation().toString()); //$NON-NLS-1$
			saveSynchronizationProtocol(this.modisco_folder.getFile("sync_protocol.xmi").getLocation().toString()); //$NON-NLS-1$
		}

		boolean trgNotNull = getTrg() != null;
		boolean success = trgNotNull && getTrg() instanceof TypeGraph;
		
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
		System.out.println(start + " MoDisco sync project: " + java_project.getProject().getName());
		if (this.discoverer == null || this.java_project == null) {
			return false;
		}

		Resource targetModel = this.discoverer.getTargetModel();
		if (targetModel == null || targetModel.getContents().size() == 0) {
			return convertProject(java_project, monitor);
		}
		MGravityModel oldProject = (MGravityModel) targetModel.getContents().get(0);
		System.out.println(System.currentTimeMillis() + " Discover Project");
		MGravityModel newProject = (MGravityModel) discoverProject(java_project, monitor);
		System.out.println(System.currentTimeMillis() + " Discover Project - Done");

		GravityMoDiscoModelPatcher patcher = MoDiscoTGGActivator.getDefault().getSelectedPatcher();

		System.out.println(System.currentTimeMillis() + " Integrate FWD");
		setChangeSrc(SynchronizationHelper -> {

			System.out.println(System.currentTimeMillis() + " Calculate Patch");
			patcher.update(oldProject, newProject);
			System.out.println(System.currentTimeMillis() + " Calculate Patch - Done");

		});

		integrateForward();
		System.out.println(System.currentTimeMillis() + " Integrate FWD - Done");

		if (this.debug) {
			saveMoDiscoModel(this.modisco_folder.getFile("modisco.xmi"), monitor); //$NON-NLS-1$
			savePG(this.modisco_folder.getFile("pg.xmi"), monitor); //$NON-NLS-1$
		}
		long stop = System.currentTimeMillis();
		System.out.println(stop + "MoDisco sync project -done: " + (stop - start) + "ms");
		return getTrg() != null;
	}

	@Override
	public boolean syncProjectBwd(Consumer<EObject> consumer, IProgressMonitor monitor) {
		if (this.discoverer == null) {
			return false;
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

		Stack<Package> packages = new Stack<>();
		Model model = (Model) getSrc();
		packages.addAll(model.getOwnedElements());

		while (!packages.isEmpty()) {
			Package p = packages.pop();
			packages.addAll(p.getOwnedPackages());
			for (AbstractTypeDeclaration t : p.getOwnedElements()) {
				if (!t.isProxy()) {
					if (t.getOriginalClassFile() != null && t.getOriginalCompilationUnit() == null) {
						CompilationUnit cu = JavaFactory.eINSTANCE.createCompilationUnit();
						cu.getTypes().add(t);
						cu.setPackage(p);
						cu.setName(t.getName() + ".java");
						t.setOriginalCompilationUnit(cu);
						model.getCompilationUnits().add(cu);
					}
					CompilationUnit cu = t.getOriginalCompilationUnit();
					Set<NamedElement> types = new HashSet<>();
					for (ImportDeclaration i : cu.getImports()) {
						types.add(i.getImportedElement());
					}
					for (Annotation a : t.getAnnotations()) {
						org.eclipse.gmt.modisco.java.Type type = a.getType().getType();
						if (!types.contains(type)) {
							ImportDeclaration imp = JavaFactory.eINSTANCE.createImportDeclaration();
							imp.setImportedElement(type);
							cu.getImports().add(imp);
						}
					}
				}
			}
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

	public Model discoverProject(IJavaProject java_project, IProgressMonitor monitor) {
		return discoverProject(java_project, new HashSet<IPath>(), monitor);
	}

	public Model discoverProject(IJavaProject java_project, Collection<IPath> libs, IProgressMonitor monitor) {

		Model model = null;

		if (this.discoverer.isApplicableTo(java_project)) {
			try {

				ElementsToAnalyze analyze = new ElementsToAnalyze(java_project);
				List<Object> discoverableElements = AbstractDiscoverJavaModelFromProject
						.computeDiscoverableElements(java_project);

				for (Object discoverableObject : discoverableElements) {
					IPath path = null;
					if (discoverableObject instanceof IJavaProject) {
						IJavaProject proj = (IJavaProject) discoverableObject;
						path = proj.getProject().getLocation();
					} else if (discoverableObject instanceof IPackageFragmentRoot) {
						IPackageFragmentRoot root = (IPackageFragmentRoot) discoverableObject;
						path = root.getPath();
					}

					if (path != null) {
						for (IPath libPath : libs) {
							if (libPath.isPrefixOf(path)) {
								analyze.addElementToDiscover(discoverableObject);
							}
						}
					}
				}

				this.discoverer.setElementsToAnalyze(analyze);

				this.discoverer.discoverElement(java_project, monitor);
				Resource java_resource = this.discoverer.getTargetModel();
				if (java_resource != null) {
					if (java_resource.getURI() == null) {
						java_resource.setURI(URI.createURI(java_project.getProject().getName() + ".xmi"));
					}
					EList<EObject> contents = java_resource.getContents();

					if (contents.size() > 0) {
						EObject eobject = contents.get(0);

						if (eobject instanceof Model) {
							model = (Model) eobject;

						}
					}
				}

			} catch (DiscoveryException e) {
				e.printStackTrace();
			}
		}

		return model;
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
		this.verbose = debug;
		this.debug = debug;
	}

	@Override
	public boolean syncProjectFwd(Consumer<EObject> consumer, IProgressMonitor monitor) {
		return false;
	}

}
