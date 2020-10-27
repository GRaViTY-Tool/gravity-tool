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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.java.Model;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromLibrary;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
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

	class MyDiscoverJavaModelFromJavaProject extends DiscoverJavaModelFromJavaProject {

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
		final IProject iproject = javaProject.getProject();
		try {
			iproject.refreshLocal(IResource.DEPTH_INFINITE, progressMonitor);
		} catch (final CoreException e) {
			if (LOGGER.isEnabledFor(Level.WARN)) {
				LOGGER.warn("The project couldn't be refreshed before discovery: " + e.getMessage(), e);
			}
		}

		IFolder gravityFolder = null;
		IFile file = null;
		try {
			gravityFolder = EclipseProjectUtil.getGravityFolder(iproject, progressMonitor);
			file = gravityFolder.getFile(GravityMoDiscoActivator.FILE_NAME);
		} catch (IOException e) {
			LOGGER.error(e.getLocalizedMessage(), e);
		}
		URI uri = getPlatformResourceURI(file);

		if (file != null && file.exists()) {
			long javaTimestamp = getTimestampOfSourceFiles(javaProject);
			if (file.getLocalTimeStamp() >= javaTimestamp) {
				try {
					Resource resource = discoverer.getRS().getResource(uri, true);
					Optional<EObject> model = resource.getContents().stream().filter(MGravityModel.class::isInstance)
							.findAny();
					if (model.isPresent()) {
						return (MGravityModel) model.get();
					}
					resource.unload();
				} catch (Exception e) {
					LOGGER.error(e);
				}
			}
		}

		long t0 = 0;
		if (LOGGER.isInfoEnabled()) {
			t0 = System.currentTimeMillis();
			LOGGER.info(t0 + " MoDisco discover project: " + javaProject.getProject().getName());
		}

		final Model eobject = discoverProject(javaProject, libs, progressMonitor);

		if (LOGGER.isInfoEnabled()) {
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
		if (LOGGER.isInfoEnabled()) {
			t2 = System.currentTimeMillis();
			LOGGER.info(t2 + " MoDisco preprocessing");
		}

		MGravityModel model;
		if (eobject instanceof MGravityModel) {
			model = (MGravityModel) eobject;

			processFwd(model, gravityFolder, progressMonitor);

			try {
				Resource resource = model.eResource();
				resource.setURI(uri);
				resource.save(Collections.emptyMap());
			} catch (IOException e) {
				LOGGER.error(e);
			}
		} else {
			throw new DiscoveryException("Discovered modisco model is not of type MGravityModel");
		}

		if (LOGGER.isInfoEnabled()) {
			final long t3 = System.currentTimeMillis();
			LOGGER.info(t3 + " MoDisco preprocessing - done " + (t3 - t2) + "ms");
		}

		return model;
	}

	private long getTimestampOfSourceFiles(IJavaProject javaProject) {
		long javaTimestamp = 0;
		try {
			for (IPackageFragmentRoot root : javaProject.getPackageFragmentRoots()) {
				IResource resource = root.getCorrespondingResource();
				if (resource != null) {
					long timestamp = resource.getModificationStamp();
					if (timestamp > javaTimestamp) {
						javaTimestamp = timestamp;
					}
				}
			}
		} catch (JavaModelException e) {
			LOGGER.error(e);
		}
		return javaTimestamp;
	}

	private URI getPlatformResourceURI(IFile file) {
		File workspaceRelativeFile = new File(new File(file.getProject().getName()),
				file.getProjectRelativePath().toString());
		URI uri = URI.createPlatformResourceURI(workspaceRelativeFile.toString(), true);
		return uri;
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
	private MGravityModel processFwd(MGravityModel model, IFolder debug, IProgressMonitor monitor)
			throws DiscoveryException {
		final Collection<IMoDiscoProcessor> sortedPreProcessors = GravityMoDiscoProcessorUtil
				.getSortedProcessors(GravityMoDiscoActivator.PROCESS_MODISCO_FWD);
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Starting MoDisco preprocessing with " + sortedPreProcessors.size() + " pre-processors");
		}

		final Map<Class<?>, List<? extends EObject>> elements = getElementsForProcessing(sortedPreProcessors, model);

		for (final IMoDiscoProcessor processor : sortedPreProcessors) {
			IFolder processorDebugFolder = debug.getFolder(processor.getClass().getSimpleName());
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
			final Collection<IMoDiscoProcessor> sortedPreProcessors, EObject model) {
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

	private Model discoverProject(IJavaProject javaProject, Collection<IPath> libs, IProgressMonitor monitor)
			throws DiscoveryException {

		if (this.discoverer.isApplicableTo(javaProject)) {

			final ElementsToAnalyze analyze = new ElementsToAnalyze(javaProject);
			final List<Object> discoverableElements = AbstractDiscoverJavaModelFromProject
					.computeDiscoverableElements(javaProject);

			for (final Object discoverableObject : discoverableElements) {
				IPath path;
				if (discoverableObject instanceof IJavaProject) {
					final IJavaProject proj = (IJavaProject) discoverableObject;
					path = proj.getProject().getLocation();
				} else if (discoverableObject instanceof IPackageFragmentRoot) {
					final IPackageFragmentRoot root = (IPackageFragmentRoot) discoverableObject;
					path = root.getPath();
				} else {
					continue;
				}

				for (final IPath libPath : libs) {
					if (libPath.isPrefixOf(path)) {
						analyze.addElementToDiscover(discoverableObject);
					}
				}
			}

			this.discoverer.setElementsToAnalyze(analyze);

			this.discoverer.discoverElement(javaProject, monitor);
			final Resource javaResource = this.discoverer.getTargetModel();
			if (javaResource != null) {
				if (javaResource.getURI() == null) {
					javaResource.setURI(URI.createURI(javaProject.getProject().getName() + ".xmi"));
				}
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

	@Override
	public boolean isApplicableTo(IJavaProject source) {
		return this.discoverer.isApplicableTo(source);
	}

	@Override
	public void discoverElement(IJavaProject source, IProgressMonitor monitor) throws DiscoveryException {
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
