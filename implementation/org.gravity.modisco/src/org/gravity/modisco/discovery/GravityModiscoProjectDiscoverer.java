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
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.modisco.GravityMoDiscoActivator;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.GravityMoDiscoProcessorUtil;
import org.gravity.modisco.processing.IMoDiscoProcessor;

/**
 * A discoverer for the GRaViTY extensions to MoDisco
 * 
 * @author speldszus
 *
 */
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

	/**
	 * The default constructor
	 */
	public GravityModiscoProjectDiscoverer() {
		this.discoverer = new MyDiscoverJavaModelFromJavaProject();
	}

	/**
	 * Discovers a java project
	 * 
	 * @param javaProject     The java project
	 * @param progressMonitor A progress monitor
	 * @return The discovered MoDisco model with GRaViTY extensions
	 * @throws DiscoveryException If the discovery fails
	 */
	public MGravityModel discoverMGravityModelFromProject(IJavaProject javaProject, IProgressMonitor progressMonitor)
			throws DiscoveryException {
		return discoverMGravityModelFromProject(javaProject, Collections.emptySet(), progressMonitor);
	}

	/**
	 * Discovers a java project taking additional libs into account
	 * 
	 * @param javaProject     The java project
	 * @param libs            The locations of the additional libs
	 * @param progressMonitor A progress monitor
	 * @return The discovered MoDisco model with GRaViTY extensions
	 * @throws DiscoveryException If the discovery fails
	 */
	public MGravityModel discoverMGravityModelFromProject(IJavaProject javaProject, Collection<IPath> libs,
			IProgressMonitor progressMonitor) throws DiscoveryException {
		try {
			IProject iproject = javaProject.getProject();
			iproject.refreshLocal(IResource.DEPTH_INFINITE, progressMonitor);
		} catch (CoreException e) {
			LOGGER.log(Level.WARN, "The project couldn't be refreshed before discovery: " + e.getMessage(), e);
		}

		long t0 = System.currentTimeMillis();
		LOGGER.log(Level.INFO, t0 + " MoDisco discover project: " + javaProject.getProject().getName());

		Model eobject = discoverProject(javaProject, libs, progressMonitor);

		long t1 = System.currentTimeMillis();
		LOGGER.log(Level.INFO, t1 + " MoDisco discover project - done " + (t1 - t0) + "ms");

		if (eobject == null) {
			throw new DiscoveryException("Discovered modisco model is null");
		}

		if (progressMonitor.isCanceled()) {
			throw new CancellationException();
		}

		long t2 = System.currentTimeMillis();
		LOGGER.log(Level.INFO, t2 + " MoDisco preprocessing");

		MGravityModel model;
		if (eobject instanceof MGravityModel) {
			model = (MGravityModel) eobject;
			final Collection<IMoDiscoProcessor> sortedPreProcessors = GravityMoDiscoProcessorUtil
					.getSortedProcessors(GravityMoDiscoActivator.PROCESS_MODISCO_FWD);
			LOGGER.log(Level.INFO,
					t2 + " Starting MoDisco preprocessing with " + sortedPreProcessors.size() + " pre-processors");
			for (IMoDiscoProcessor processor : sortedPreProcessors) {
				if (!processor.process(model, progressMonitor)) {
					LOGGER.log(Level.INFO, "ERROR: Preprocessing failed");
					throw new DiscoveryException(
							new ProcessingException("Preprocessing failed for " + processor.getClass().getName()));
				}
			}
		} else {
			throw new DiscoveryException("Discovered modisco model is not of type MGravityModel");
		}

		long t3 = System.currentTimeMillis();
		LOGGER.log(Level.INFO, t3 + " MoDisco preprocessing - done " + (t3 - t2) + "ms");

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

	/**
	 * A getter for the resource set used at discovery by MoDisco
	 * 
	 * @return the resource set
	 */
	public ResourceSet getResourceSet() {
		return this.discoverer.getRS();
	}
}
