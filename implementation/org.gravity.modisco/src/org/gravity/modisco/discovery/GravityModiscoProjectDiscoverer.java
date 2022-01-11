package org.gravity.modisco.discovery;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.stream.Collectors;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromLibrary;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.eclipse.util.EclipseProjectUtil;
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

	/**
	 * The MoDisco Discoverer of this class
	 */
	private final MyDiscoverJavaModelFromJavaProject discoverer;

	private boolean load;

	class MyDiscoverJavaModelFromJavaProject extends DiscoverJavaModelFromJavaProject {

		public MyDiscoverJavaModelFromJavaProject() {
		}

		public MyDiscoverJavaModelFromJavaProject(final ResourceSet set) {
			setResourceSet(set);
		}

		public ResourceSet getRS() {
			return getResourceSet();
		}

		public ElementsToAnalyze getElemetstoAnalyze() {
			return getElementsToAnalyze();
		}
	}

	/**
	 * The default constructor
	 */
	public GravityModiscoProjectDiscoverer() {
		this.discoverer = new MyDiscoverJavaModelFromJavaProject();
	}

	public GravityModiscoProjectDiscoverer(final ResourceSet set) {
		this.discoverer = new MyDiscoverJavaModelFromJavaProject(set);
	}

	public GravityModiscoProjectDiscoverer(final ResourceSet set, final boolean load) {
		this.discoverer = new MyDiscoverJavaModelFromJavaProject(set);
		this.load = load;
	}

	/**
	 * Discovers a java library
	 *
	 * @param jar             The java library
	 * @param progressMonitor A progress monitor
	 * @return The discovered MoDisco model with GRaViTY extensions
	 * @throws DiscoveryException If the discovery fails
	 */
	public MGravityModel discoverMGravityModelFromLibrary(final File jar, final IProgressMonitor progressMonitor)
			throws DiscoveryException {
		IFile file;
		try {
			final IJavaProject project = JavaProjectUtil.createJavaProject("_tmp" + System.currentTimeMillis(),
					Collections.emptySet(), progressMonitor);

			final IPath location = new Path(jar.getAbsolutePath());
			file = project.getProject().getFile(location.lastSegment());
			file.createLink(location, IResource.REPLACE, progressMonitor);

			final IPath filePath = project.getProject().getWorkspace().getRoot().getLocation()
					.append(file.getFullPath());

			final IClasspathEntry cpe = JavaCore.newLibraryEntry(filePath, null, null);
			JavaProjectUtil.addToClassPath(project, Arrays.asList(cpe), progressMonitor);
		} catch (DuplicateProjectNameException | CoreException e) {
			throw new DiscoveryException(e);
		}

		final IPackageFragmentRoot fragment = JavaCore.createJarPackageFragmentRootFrom(file);
		final DiscoverJavaModelFromLibrary libDiscoverer = new DiscoverJavaModelFromLibrary();
		if (!libDiscoverer.isApplicableTo(fragment)) {
			throw new DiscoveryException("The discoverer cannot be applied to the file: " + jar.getName());
		}
		libDiscoverer.discoverElement(fragment, progressMonitor);
		final MGravityModel model = (MGravityModel) libDiscoverer.getTargetModel().getContents().get(0);

		if (model == null) {
			throw new DiscoveryException("An error occurred at discovery, no model has been created!");
		}
		model.eResource().setURI(URI.createURI(jar.getName() + ".xmi"));
		return processFwd(model, null, progressMonitor);
	}

	/**
	 * Discovers a java project
	 *
	 * @param javaProject     The java project
	 * @param progressMonitor A progress monitor
	 * @return The discovered MoDisco model with GRaViTY extensions
	 * @throws DiscoveryException If the discovery fails
	 */
	public MGravityModel discoverMGravityModelFromProject(final IJavaProject javaProject,
			final IProgressMonitor progressMonitor) throws DiscoveryException {
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
	public MGravityModel discoverMGravityModelFromProject(final IJavaProject javaProject, final Collection<IPath> libs,
			final IProgressMonitor progressMonitor) throws DiscoveryException {
		final IProject iproject = javaProject.getProject();
		try {
			iproject.refreshLocal(IResource.DEPTH_INFINITE, progressMonitor);
		} catch (final CoreException e) {
			if (LOGGER.isEnabledFor(Level.WARN)) {
				LOGGER.warn("The project couldn't be refreshed before discovery: " + e.getMessage(), e);
			}
		}

		final IFile file = getModiscoFile(iproject, progressMonitor);

		final URI uri = EMFUtil.getPlatformResourceURI(file);

		if (canLoadModel(javaProject, file)) {
			try {
				final Resource resource = this.discoverer.getRS().getResource(uri, true);
				final Optional<EObject> model = resource.getContents().stream().filter(MGravityModel.class::isInstance)
						.findAny();
				if (model.isPresent()) {
					return (MGravityModel) model.get();
				}
				resource.unload();
			} catch (final Exception e) {
				LOGGER.error(e);
			}
		}

		long t0 = 0;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			t0 = System.currentTimeMillis();
		} else if (LOGGER.isInfoEnabled()) {
			t0 = System.currentTimeMillis();
			LOGGER.info(t0 + " MoDisco discover project: " + javaProject.getProject().getName());
		}

		final Model eobject = discoverProject(javaProject, uri, libs, progressMonitor);

		if (GravityActivator.MEASURE_PERFORMANCE) {
			GravityActivator.record("Discovery:" + (System.currentTimeMillis() - t0) + "ms");
		} else if (LOGGER.isInfoEnabled()) {
			final long t1 = System.currentTimeMillis();
			LOGGER.info(t1 + " MoDisco discover project - done " + (t1 - t0) + "ms");
		}
		if (eobject == null) {
			throw new DiscoveryException("Discovered modisco model is null");
		}

		if (progressMonitor.isCanceled()) {
			throw new CancellationException();
		}

		long t2 = 0;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			t2 = System.currentTimeMillis();
		} else if (LOGGER.isInfoEnabled()) {
			t2 = System.currentTimeMillis();
			LOGGER.info(t2 + " MoDisco preprocessing");
		}

		MGravityModel model;
		if (eobject instanceof MGravityModel) {
			model = (MGravityModel) eobject;

			processFwd(model, (IFolder) file.getParent(), progressMonitor);

			Job.create("Save MoDisco model", runner -> {
				try {
					final Resource resource = model.eResource();
					resource.setURI(uri);
					resource.save(Collections.emptyMap());
				} catch (final IOException e) {
					LOGGER.error(e);
				}
			}).schedule();
		} else {
			throw new DiscoveryException("Discovered modisco model is not of type MGravityModel");
		}
		if (GravityActivator.MEASURE_PERFORMANCE) {
			GravityActivator.record("preprocessing:" + (System.currentTimeMillis() - t2) + "ms");
		} else if (LOGGER.isInfoEnabled()) {
			final long t3 = System.currentTimeMillis();
			LOGGER.info(t3 + " MoDisco preprocessing - done " + (t3 - t2) + "ms");
		}

		return model;
	}

	/**
	 * @param project
	 * @param monitor
	 * @return
	 * @throws DiscoveryException
	 */
	public static IFile getModiscoFile(final IProject project, final IProgressMonitor monitor)
			throws DiscoveryException {
		IFile file = null;
		try {
			final IFolder gravityFolder = EclipseProjectUtil.getGravityFolder(project, monitor);
			file = gravityFolder.getFile(GravityMoDiscoActivator.FILE_NAME);
		} catch (final IOException e) {
			LOGGER.error(e.getLocalizedMessage(), e);
		}
		if (file == null) {
			throw new DiscoveryException("Couldn't initialize file structure");
		}
		return file;
	}

	/**
	 * @param project
	 * @param file
	 * @return
	 */
	private boolean canLoadModel(final IJavaProject project, final IFile file) {
		if (!this.load) {
			return false;
		}
		boolean present = false;
		if (file.exists()) {
			final long javaTimestamp = getTimestampOfSourceFiles(project);
			if (file.getLocalTimeStamp() >= javaTimestamp) {
				present = true;
			}
		}
		return present;
	}

	private long getTimestampOfSourceFiles(final IJavaProject javaProject) {
		long javaTimestamp = 0;
		try {
			for (final IPackageFragmentRoot root : javaProject.getPackageFragmentRoots()) {
				final IResource resource = root.getCorrespondingResource();
				if (resource != null) {
					final long timestamp = resource.getModificationStamp();
					if (timestamp > javaTimestamp) {
						javaTimestamp = timestamp;
					}
				}
			}
		} catch (final JavaModelException e) {
			LOGGER.error(e);
		}
		return javaTimestamp;
	}

	/**
	 * Applies all processors to the discovered modisco model
	 *
	 * @param model   The modisco model
	 * @param debug   aA folder to which debug output can be written
	 * @param monitor A progress monitor
	 * @return The processed model, this is identical to the parameter model!
	 * @throws DiscoveryException If a processor fails
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private MGravityModel processFwd(final MGravityModel model, final IFolder debug, final IProgressMonitor monitor)
			throws DiscoveryException {
		final Collection<IMoDiscoProcessor> sortedPreProcessors = GravityMoDiscoProcessorUtil
				.getSortedProcessors(GravityMoDiscoActivator.PROCESS_MODISCO_FWD);
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Starting MoDisco preprocessing with " + sortedPreProcessors.size() + " pre-processors");
		}

		final Map<Class<?>, List<? extends EObject>> elements = getElementsForProcessing(sortedPreProcessors, model);

		for (final IMoDiscoProcessor processor : sortedPreProcessors) {
			final IFolder processorDebugFolder = debug.getFolder(processor.getClass().getSimpleName());
			// Execute processors
			boolean success;
			if (processor instanceof AbstractTypedModiscoProcessor) {
				final List<? extends EObject> elementsToProcess = elements
						.get(((AbstractTypedModiscoProcessor<?>) processor).getSupportedType());
				success = ((AbstractTypedModiscoProcessor) processor).process(model, elementsToProcess,
						processorDebugFolder, monitor);
			} else {
				success = processor.process(model, processorDebugFolder, monitor);
			}
			if (!success) {
				if (LOGGER.isInfoEnabled()) {
					LOGGER.info("ERROR: Preprocessing failed");
				}
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
	private Map<Class<?>, List<? extends EObject>> getElementsForProcessing(
			final Collection<IMoDiscoProcessor> sortedPreProcessors, final EObject model) {
		final Map<Class<?>, List<? extends EObject>> elements = sortedPreProcessors.parallelStream()
				.filter(processor -> processor instanceof AbstractTypedModiscoProcessor)
				.map(processor -> ((AbstractTypedModiscoProcessor<?>) processor).getSupportedType()).distinct()
				.collect(Collectors.toMap(processor -> processor, processor -> new LinkedList<>()));

		if (!elements.isEmpty()) {
			final Set<Class<?>> keys = elements.keySet();
			final TreeIterator<EObject> iterator = model.eAllContents();
			while (iterator.hasNext()) {
				final EObject next = iterator.next();
				final Class<? extends EObject> nextClass = next.getClass();
				keys.parallelStream().filter(c -> c.isAssignableFrom(nextClass))
				.forEach(c -> ((List<EObject>) elements.get(c)).add(next));
			}
		}
		return elements;
	}

	private Model discoverProject(final IJavaProject javaProject, final URI uri, final Collection<IPath> libs,
			final IProgressMonitor monitor) throws DiscoveryException {

		if (this.discoverer.isApplicableTo(javaProject)) {

			ElementsToAnalyze analyze;
			try {
				analyze = getElementsToAnalyze(javaProject, libs);
			} catch (final JavaModelException e) {
				throw new DiscoveryException(e);
			}
			this.discoverer.setDeepAnalysis(true);
			this.discoverer.setElementsToAnalyze(analyze);

			this.discoverer.discoverElement(javaProject, monitor);
			final Resource javaResource = this.discoverer.getTargetModel();
			if (javaResource != null) {
				javaResource.setURI(uri);
				final EList<EObject> contents = javaResource.getContents();

				if (!contents.isEmpty()) {
					final EObject eobject = contents.get(0);

					if (eobject instanceof Model) {
						return (Model) eobject;

					}
				}
			}

		}
		return null;
	}

	/**
	 * Calculates the elements to analyze
	 *
	 * @param project The project to analyze
	 * @param libs    Additional libraries to consider
	 * @return The elements to analyze
	 * @throws JavaModelException
	 */
	private ElementsToAnalyze getElementsToAnalyze(final IJavaProject project, final Collection<IPath> libs) throws JavaModelException {
		final ElementsToAnalyze analyze = new ElementsToAnalyze(project);
		final List<Object> discoverableElements = AbstractDiscoverJavaModelFromProject
				.computeDiscoverableElements(project);

		for (final Object discoverableObject : discoverableElements) {
			IPackageFragmentRoot root;
			IResource resource;
			if (discoverableObject instanceof IPackageFragmentRoot) {
				root = (IPackageFragmentRoot) discoverableObject;
			} else {
				continue;
			}
			resource = root.getResource();
			if (resource != null) {
				for (final IPath libPath : libs) {
					if (libPath.isAbsolute() ? libPath.equals(resource.getLocation()) : libPath.equals(resource.getProjectRelativePath())) {
						analyze.addElementToDiscover(discoverableObject);
						if(root.getSourceAttachmentPath() != null) {
							analyze.getDiscoveryOptions(discoverableObject).put("USE_SOURCES", true);
						}
					}
				}
			}
		}
		return analyze;
	}

	@Override
	public boolean isApplicableTo(final IJavaProject source) {
		return this.discoverer.isApplicableTo(source);
	}

	@Override
	public void discoverElement(final IJavaProject source, final IProgressMonitor monitor) throws DiscoveryException {
		final MGravityModel model = discoverMGravityModelFromProject(source, monitor);
		final IProject project = source.getProject();
		final IFile file = project.getFile(project.getName() + ".xmi");
		try (OutputStream outputStream = Files.newOutputStream(file.getLocation().toFile().toPath())) {
			model.eResource().save(outputStream, Collections.emptyMap());
			file.refreshLocal(IResource.DEPTH_ZERO, monitor);
		} catch (IOException | CoreException e) {
			throw new DiscoveryException(e);
		}
	}

	public ResourceSet getResourceSet() {
		return this.discoverer.getRS();
	}
}
