package org.gravity.modisco.discovery;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromLibrary;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.modisco.GravityMoDiscoActivator;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.processing.GravityMoDiscoProcessorUtil;
import org.gravity.modisco.processing.IMoDiscoProcessor;

/**
 * A discoverer for the GRaViTY extensions to MoDisco
 * 
 * @author speldszus
 *
 */
public class GravityModiscoProjectDiscoverer implements IDiscoverer<IJavaProject> {

	private static final Logger LOGGER = Logger.getLogger(GravityModiscoProjectDiscoverer.class.getName());

	class MyDiscoverJavaModelFromJavaProject extends DiscoverJavaModelFromJavaProject {

		/**
		 * A public wrapper to get the resource set of the discoverer
		 * @return The resource set
		 */
		public ResourceSet getRS() {
			return super.getResourceSet();
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
	 * Discovers a java library
	 * 
	 * @param jar             The java library
	 * @param progressMonitor A progress monitor
	 * @return The discovered MoDisco model with GRaViTY extensions
	 * @throws DiscoveryException If the discovery fails
	 */
	public MGravityModel discoverMGravityModelFromLibrary(File jar, IProgressMonitor progressMonitor)
			throws DiscoveryException {
		IFile file;
		try {
			IJavaProject project = JavaProjectUtil.createJavaProject("_tmp" + System.currentTimeMillis(),
					Collections.emptySet(), progressMonitor);

			IPath location = new Path(jar.getAbsolutePath());
			file = project.getProject().getFile(location.lastSegment());
			file.createLink(location, IResource.REPLACE, progressMonitor);

			IPath filePath = project.getProject().getWorkspace().getRoot().getLocation().append(file.getFullPath());

			IClasspathEntry cpe = JavaCore.newLibraryEntry(filePath, null, null);
			JavaProjectUtil.addToClassPath(project, Arrays.asList(cpe), progressMonitor);
		} catch (DuplicateProjectNameException | CoreException e) {
			throw new DiscoveryException(e);
		}

		IPackageFragmentRoot fragment = JavaCore.createJarPackageFragmentRootFrom(file);
		DiscoverJavaModelFromLibrary libDiscoverer = new DiscoverJavaModelFromLibrary();
		if (!libDiscoverer.isApplicableTo(fragment)) {
			throw new DiscoveryException("The discoverer cannot be applied to the file: " + jar.getName());
		}
		libDiscoverer.discoverElement(fragment, progressMonitor);
		MGravityModel model = (MGravityModel) libDiscoverer.getTargetModel().getContents().get(0);

		if (model == null) {
			throw new DiscoveryException("An error occurred at discovery, no model has been created!");
		}
		model.eResource().setURI(URI.createURI(jar.getName() + ".xmi"));
		return processFwd(model, progressMonitor);
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
			processFwd(model, progressMonitor);
		} else {
			throw new DiscoveryException("Discovered modisco model is not of type MGravityModel");
		}

		long t3 = System.currentTimeMillis();
		LOGGER.log(Level.INFO, t3 + " MoDisco preprocessing - done " + (t3 - t2) + "ms");

		return model;
	}

	/**
	 * Applies all processors to the discovered modisco model
	 * 
	 * @param model   The modisco model
	 * @param monitor A progress monitor
	 * @return The processed model, this is identical to the parameter model!
	 * @throws DiscoveryException If a processor fails
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private MGravityModel processFwd(MGravityModel model, IProgressMonitor monitor) throws DiscoveryException {
		final Collection<IMoDiscoProcessor> sortedPreProcessors = GravityMoDiscoProcessorUtil
				.getSortedProcessors(GravityMoDiscoActivator.PROCESS_MODISCO_FWD);
		LOGGER.log(Level.INFO, "Starting MoDisco preprocessing with " + sortedPreProcessors.size() + " pre-processors");

		HashMap<Class<?>, List<? extends EObject>> elements = getElementsForProcessing(sortedPreProcessors, model);

		for (IMoDiscoProcessor processor : sortedPreProcessors) {
			// Execute processors
			boolean success;
			if (processor instanceof AbstractTypedModiscoProcessor) {
				List<? extends EObject> elementsToProcess = elements
						.get(((AbstractTypedModiscoProcessor<?>) processor).getSupportedType());
				success = ((AbstractTypedModiscoProcessor) processor).process(model, elementsToProcess, monitor);
			} else {
				success = processor.process(model, monitor);
			}
			if (!success) {
				LOGGER.log(Level.INFO, "ERROR: Preprocessing failed");
				throw new DiscoveryException(
						new ProcessingException("Preprocessing failed for " + processor.getClass().getName()));
			}
		}
		return model;
	}

	/**
	 * Get a mapping from element types to all instances for all preprocessors
	 * 
	 * @param sortedPreProcessors The list of preprocessors to be applied
	 * @param model               The model on which they should be applied
	 * @return A mapping between the types to preprocess and their instances
	 */
	private HashMap<Class<?>, List<? extends EObject>> getElementsForProcessing(
			final Collection<IMoDiscoProcessor> sortedPreProcessors, EObject model) {
		HashMap<Class<?>, List<? extends EObject>> elements = new HashMap<>();
		for (IMoDiscoProcessor processor : sortedPreProcessors) {
			// Collect model elements
			if (processor instanceof AbstractTypedModiscoProcessor) {
				Class<?> type = ((AbstractTypedModiscoProcessor<?>) processor).getSupportedType();
				if (!elements.containsKey(type)) {
					elements.put(type, new LinkedList<>());
				}
			}
		}
		if (elements.size() > 0) {
			Set<Class<?>> keys = elements.keySet();
			TreeIterator<EObject> iterator = model.eAllContents();
			while (iterator.hasNext()) {
				EObject next = iterator.next();
				Class<? extends EObject> nextClass = next.getClass();
				keys.parallelStream().filter(c -> c.isAssignableFrom(nextClass))
						.forEach(c -> ((List<EObject>) elements.get(c)).add(next));
			}
		}
		return elements;
	}

	private Model discoverProject(IJavaProject javaProject, Collection<IPath> libs, IProgressMonitor monitor)
			throws DiscoveryException {

		Model model = null;

		if (this.discoverer.isApplicableTo(javaProject)) {

			ElementsToAnalyze analyze = new ElementsToAnalyze(javaProject);
			List<Object> discoverableElements = AbstractDiscoverJavaModelFromProject
					.computeDiscoverableElements(javaProject);

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

			this.discoverer.discoverElement(javaProject, monitor);
			Resource javaResource = this.discoverer.getTargetModel();
			if (javaResource != null) {
				if (javaResource.getURI() == null) {
					javaResource.setURI(URI.createURI(javaProject.getProject().getName() + ".xmi"));
				}
				EList<EObject> contents = javaResource.getContents();

				if (!contents.isEmpty()) {
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

	@Override
	public boolean isApplicableTo(IJavaProject source) {
		return discoverer.isApplicableTo(source);
	}

	@Override
	public void discoverElement(IJavaProject source, IProgressMonitor monitor) throws DiscoveryException {
		MGravityModel model = discoverMGravityModelFromProject(source, monitor);
		IProject project = source.getProject();
		IFile file = project.getFile(project.getName() + ".xmi");
		try (FileOutputStream outputStream = new FileOutputStream(file.getLocation().toFile())){
			model.eResource().save(outputStream, Collections.emptyMap());
			file.refreshLocal(IResource.DEPTH_ZERO, monitor);
		} catch (IOException | CoreException e) {
			throw new DiscoveryException(e);
		}
	}
}
