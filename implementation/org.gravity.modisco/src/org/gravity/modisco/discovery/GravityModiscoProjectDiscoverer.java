package org.gravity.modisco.discovery;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;
import org.gravity.modisco.GravityMoDiscoActivator;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.GravityMoDiscoProcessorUtil;
import org.gravity.modisco.processing.IMoDiscoProcessor;

public class GravityModiscoProjectDiscoverer {
	
	private static final Logger LOGGER = Logger.getLogger(GravityModiscoProjectDiscoverer.class.getName());
	
	class MyDiscoverJavaModelFromJavaProject extends DiscoverJavaModelFromJavaProject {
		
		public ResourceSet getRS() {
			return getResourceSet();
		}

		public ElementsToAnalyze getElemetstoAnalyze() {
			return getElementsToAnalyze();
		}
	}

	private MyDiscoverJavaModelFromJavaProject discoverer;
	
	public GravityModiscoProjectDiscoverer() {
		this.discoverer = new MyDiscoverJavaModelFromJavaProject();
	}
	
	public MGravityModel discoverMGravityModelFromProject(IJavaProject java_project, IProgressMonitor progressMonitor)
			throws DiscoveryException {
		return discoverMGravityModelFromProject(java_project, Collections.emptySet(), progressMonitor);
	}

	public MGravityModel discoverMGravityModelFromProject(IJavaProject java_project, Collection<IPath> libs,
			IProgressMonitor progressMonitor) throws DiscoveryException {
		try {
			IProject iproject = java_project.getProject();
			iproject.refreshLocal(IResource.DEPTH_INFINITE, progressMonitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		long t0 = System.currentTimeMillis();
		LOGGER.log( Level.INFO, t0 + " MoDisco discover project: " + java_project.getProject().getName());
		
		Model eobject = discoverProject(java_project, libs, progressMonitor);
		
		long t1 = System.currentTimeMillis();
		LOGGER.log( Level.INFO, t1 + " MoDisco discover project - done " + (t1 - t0) + "ms");

		if (eobject == null) {
			throw new DiscoveryException("Discovered modisco model is null");
		}

		if (progressMonitor.isCanceled()) {
			throw new CancellationException();
		}

		long t2 = System.currentTimeMillis();
		LOGGER.log( Level.INFO, t2 + " MoDisco preprocessing");
		
		MGravityModel model;
		if (eobject instanceof MGravityModel) {
			model = (MGravityModel) eobject;
			for (IMoDiscoProcessor processor : GravityMoDiscoProcessorUtil.getSortedProcessors(GravityMoDiscoActivator.PROCESS_MODISCO_FWD)) {
				if(!processor.process(model, progressMonitor)) {
					LOGGER.log( Level.INFO, "ERROR: Preprocessing failed");
					throw new RuntimeException("Preprocessing failed");
				}
			}
			
//			if (!new GravityMoDiscoPreprocessing().process(model, progressMonitor)) {
//				LOGGER.log( Level.INFO, "ERROR: Preprocessing failed");
//				throw new RuntimeException("Preprocessing failed");
//			}

		} else {
			throw new DiscoveryException("Discovered modisco model is not of type MGravityModel");
		}
		
		long t3 = System.currentTimeMillis();
		LOGGER.log( Level.INFO, t3 + " MoDisco preprocessing - done " + (t3 - t2) + "ms");
		
		return model;
	}

	private Model discoverProject(IJavaProject java_project, Collection<IPath> libs, IProgressMonitor monitor)
			throws DiscoveryException {

		Model model = null;

		if (this.discoverer.isApplicableTo(java_project)) {

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

		}

		return model;
	}
	
	public ResourceSet getResourceSet() {
		return this.discoverer.getRS();
	}
}
