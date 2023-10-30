package org.gravity.modisco.discovery;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import org.gravity.eclipse.util.UptodateVisitor;
import org.gravity.modisco.GravityMoDiscoActivator;
import org.gravity.modisco.IGravityModiscoProjectDiscoverer;
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
public class GravityModiscoProjectDiscoverer implements IGravityModiscoProjectDiscoverer, IDiscoverer<IJavaProject> {

	private static final Logger LOGGER = Logger.getLogger(GravityModiscoProjectDiscoverer.class.getName());

	/**
	 * The MoDisco Discoverer of this class
	 */
	private final MyDiscoverJavaModelFromJavaProject discoverer;

	private final IFile modiscoFile;

	private final URI uri;

	private final IJavaProject project;

	private MGravityModel model;

	private boolean load;

	private Set<IPath> discoveredLibs = new HashSet<>();

	private Job asyncSave;

	private class MyDiscoverJavaModelFromJavaProject extends DiscoverJavaModelFromJavaProject {

		@Override
		protected ResourceSet getResourceSet() {
			// Required to make the method accessible to the outer class
			return super.getResourceSet();
		}
	}

	/**
	 * This constructor is only for use by the MoDisco framework!
	 *
	 * @throws IOException
	 */
	public GravityModiscoProjectDiscoverer() throws IOException {
		this.discoverer = new MyDiscoverJavaModelFromJavaProject();
		this.project = null;
		this.load = false;
		this.modiscoFile = null;
		this.uri = null;
	}

	/**
	 * Creates a new GRaViTY Java discoverer for the given Java project
	 *
	 * @param project The java project to be discovered
	 * @throws DiscoveryException
	 */
	public GravityModiscoProjectDiscoverer(final IJavaProject project) throws IOException {
		this(project, true);
	}

	/**
	 * Creates a new GRaViTY Java discoverer for the given Java project
	 *
	 * @param project The java project to be discovered
	 * @param load    Wheter existing models should be loaded if up to date
	 * @throws DiscoveryException
	 */
	public GravityModiscoProjectDiscoverer(final IJavaProject project, final boolean load) throws IOException {
		this.discoverer = new MyDiscoverJavaModelFromJavaProject();
		this.project = project;
		this.load = load;
		this.modiscoFile = getModiscoFile(project.getProject(), null);
		this.uri = EMFUtil.getPlatformResourceURI(this.modiscoFile);
	}

	/**
	 * Discovers a java library
	 *
	 * @param jar             The java library
	 * @param progressMonitor A progress monitor
	 * @return The discovered MoDisco model with GRaViTY extensions
	 * @throws DiscoveryException If the discovery fails
	 */
	public static MGravityModel discoverMGravityModelFromLibrary(final File jar, final IProgressMonitor progressMonitor)
			throws DiscoveryException {
		IFile file;
		try {
			final var project = JavaProjectUtil.createJavaProject("_tmp" + System.currentTimeMillis(),
					Collections.emptySet(), progressMonitor);

			final IPath location = new Path(jar.getAbsolutePath());
			file = project.getProject().getFile(location.lastSegment());
			file.createLink(location, IResource.REPLACE, progressMonitor);

			final var filePath = project.getProject().getWorkspace().getRoot().getLocation().append(file.getFullPath());

			final var cpe = JavaCore.newLibraryEntry(filePath, null, null);
			JavaProjectUtil.addToClassPath(project, Arrays.asList(cpe), progressMonitor);
		} catch (DuplicateProjectNameException | CoreException e) {
			throw new DiscoveryException(e);
		}

		final var fragment = JavaCore.createJarPackageFragmentRootFrom(file);
		final var libDiscoverer = new DiscoverJavaModelFromLibrary();
		if (!libDiscoverer.isApplicableTo(fragment)) {
			throw new DiscoveryException("The discoverer cannot be applied to the file: " + jar.getName());
		}
		libDiscoverer.discoverElement(fragment, progressMonitor);
		final var model = (MGravityModel) libDiscoverer.getTargetModel().getContents().get(0);

		if (model == null) {
			throw new DiscoveryException("An error occurred at discovery, no model has been created!");
		}
		model.eResource().setURI(URI.createURI(jar.getName() + ".xmi"));
		return processFwd(model, null, progressMonitor);
	}

	/**
	 * Discovers a java project
	 *
	 * @param monitor A progress monitor
	 * @return The discovered MoDisco model with GRaViTY extensions
	 * @throws DiscoveryException If the discovery fails
	 */
	@Override
	public MGravityModel discoverModel(final IProgressMonitor monitor) throws DiscoveryException {
		return discoverModel(Collections.emptySet(), monitor);
	}

	/**
	 * Discovers a java project taking additional libs into account
	 *
	 * @param libs    The locations of the additional libs
	 * @param monitor A progress monitor
	 * @return The discovered MoDisco model with GRaViTY extensions
	 * @throws DiscoveryException If the discovery fails
	 */
	@Override
	public MGravityModel discoverModel(final Collection<IPath> libs, final IProgressMonitor monitor)
			throws DiscoveryException {
		if(this.model != null && this.model.eResource() != null) {
			this.model.eResource().unload();
			this.model = null;
		}
		if (this.load && this.discoveredLibs.containsAll(libs)) {
			try {
				this.model = loadModel();
				if ((this.model != null) && !this.model.eIsProxy()) {
					return this.model;
				} else {
					this.model = null;
				}
			} catch (final IOException e) {
				LOGGER.error(e);
			}
		}
		return discoverModelNoLoad(libs, monitor);
	}

	private MGravityModel discoverModelNoLoad(final Collection<IPath> libs, final IProgressMonitor monitor)
			throws DiscoveryException {
		refreshProject(monitor);
		this.discoveredLibs = new HashSet<>(libs);

		var t0 = 0L;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			t0 = System.currentTimeMillis();
		} else if (LOGGER.isInfoEnabled()) {
			t0 = System.currentTimeMillis();
			LOGGER.info(t0 + " MoDisco discover project: " + this.project.getProject().getName());
		}

		final var eObject = discoverProject(this.project, this.uri, libs, monitor);

		if (GravityActivator.MEASURE_PERFORMANCE) {
			GravityActivator.recordMessage("Discovery:" + (System.currentTimeMillis() - t0) + "ms");
		} else if (LOGGER.isInfoEnabled()) {
			final var t1 = System.currentTimeMillis();
			LOGGER.info(t1 + " MoDisco discover project - done " + (t1 - t0) + "ms");
		}
		if (eObject == null) {
			throw new DiscoveryException("Discovered modisco model is null");
		}

		if (monitor.isCanceled()) {
			throw new CancellationException();
		}

		var t2 = 0L;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			t2 = System.currentTimeMillis();
		} else if (LOGGER.isInfoEnabled()) {
			t2 = System.currentTimeMillis();
			LOGGER.info(t2 + " MoDisco preprocessing");
		}

		if (eObject instanceof MGravityModel) {
			this.model = (MGravityModel) eObject;
			processFwd(this.model, (IFolder) this.modiscoFile.getParent(), monitor);
		} else {
			throw new DiscoveryException("Discovered modisco model is not of type MGravityModel");
		}
		asyncSave();

		if (GravityActivator.MEASURE_PERFORMANCE) {
			GravityActivator.recordMessage("preprocessing:" + (System.currentTimeMillis() - t2) + "ms");
		} else if (LOGGER.isInfoEnabled()) {
			final var t3 = System.currentTimeMillis();
			LOGGER.info(t3 + " MoDisco preprocessing - done " + (t3 - t2) + "ms");
		}

		return this.model;
	}

	/**
	 * Saves the model
	 */
	private void asyncSave() {
		if (this.asyncSave == null) {
			this.asyncSave = Job.create("Save MoDisco model", monitor -> {
				try (var stream = new FileOutputStream(this.modiscoFile.getLocation().toFile())) {
					final var resource = this.model.eResource();
					resource.setURI(this.uri);
					resource.save(stream, Collections.emptyMap());
					this.modiscoFile.refreshLocal(IResource.DEPTH_ZERO, monitor);
				} catch (final IOException e) {
					LOGGER.error(e);
				}
			});
		} else {
			this.asyncSave.cancel();
		}
		this.asyncSave.schedule();
	}

	/**
	 * Refreshes the underlying project
	 *
	 * @param monitor A progress monitor
	 */
	private void refreshProject(final IProgressMonitor monitor) {
		final var iproject = this.project.getProject();
		try {
			iproject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (final CoreException e) {
			if (LOGGER.isEnabledFor(Level.WARN)) {
				LOGGER.warn("The project couldn't be refreshed before discovery: " + e.getMessage(), e);
			}
		}
	}

	/**
	 * Loads the model if possible
	 *
	 * @return the model or <code>null</code>
	 * @throws IOException If there is an error at loading an existing model file
	 */
	@Override
	public MGravityModel loadModel() throws IOException {
		if (this.asyncSave != null) {
			final var state = this.asyncSave.getState();
			if (((state == Job.RUNNING) || (state == Job.WAITING)) && (this.model != null)) {
				return this.model;
			}
			try {
				this.asyncSave.join();
			} catch (final InterruptedException e) {
				LOGGER.error(e);
				Thread.currentThread().interrupt();
			}
		}
		if (canLoadModel(this.modiscoFile)) {
			Resource resource;
			if (this.model == null) {
				resource = this.discoverer.getResourceSet().getResource(this.uri, true);
			} else {
				resource = this.model.eResource();
				if (resource.getTimeStamp() >= this.modiscoFile.getModificationStamp()) {
					return this.model;
				}
				resource.load(Collections.emptyMap());
			}
			this.model = resource.getContents().stream().filter(MGravityModel.class::isInstance)
					.map(MGravityModel.class::cast).findAny().orElse(null);
			return this.model;
		} else if (this.model != null) {
			LOGGER.info("Model is not upto date.");
			this.model.eResource().unload();
			this.model = null;
		}
		return null;
	}

	/**
	 * Calculates GRaViTY's standard modisco folder
	 *
	 * @param project A Java project
	 * @param monitor A progress monitor
	 * @return The standard modisco file of the project
	 * @throws IOException
	 */
	public static IFile getModiscoFile(final IProject project, final IProgressMonitor monitor) throws IOException {
		final var gravityFolder = EclipseProjectUtil.getGravityFolder(project, monitor);
		final var file = gravityFolder.getFile(GravityMoDiscoActivator.FILE_NAME);
		if (file == null) {
			throw new IOException("Couldn't initialize file structure");
		}
		return file;
	}

	/**
	 * @param file The file containing the model
	 * @return true, if there are no newer modifications in the source code
	 */
	private boolean canLoadModel(final IFile file) {
		if (!this.load) {
			return false;
		}
		return file.exists() && UptodateVisitor.isUptoDate(file);
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
	private static MGravityModel processFwd(final MGravityModel model, final IFolder debug,
			final IProgressMonitor monitor) throws DiscoveryException {
		final var sortedPreProcessors = GravityMoDiscoProcessorUtil
				.getSortedProcessors(GravityMoDiscoActivator.PROCESS_MODISCO_FWD);
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Starting MoDisco preprocessing with " + sortedPreProcessors.size() + " pre-processors");
		}

		final var elements = getElementsForProcessing(sortedPreProcessors, model);

		for (final IMoDiscoProcessor processor : sortedPreProcessors) {
			IFolder processorDebugFolder = null;
			if (debug != null) {
				processorDebugFolder = debug.getFolder(processor.getClass().getSimpleName());
			}
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
	private static Map<Class<?>, List<? extends EObject>> getElementsForProcessing(
			final Collection<IMoDiscoProcessor> sortedPreProcessors, final EObject model) {
		final Map<Class<?>, List<? extends EObject>> elements = sortedPreProcessors.parallelStream()
				.filter(AbstractTypedModiscoProcessor.class::isInstance)
				.map(processor -> ((AbstractTypedModiscoProcessor<?>) processor).getSupportedType()).distinct()
				.collect(Collectors.toMap(processor -> processor, processor -> new LinkedList<>()));

		if (!elements.isEmpty()) {
			final var keys = elements.keySet();
			final Set<EObject> seen = new HashSet<>();
			final Deque<EObject> stack = new LinkedList<>();
			stack.add(model);
			while (!stack.isEmpty()) {
				final var next = stack.pop();
				if (seen.add(next)) {
					final Class<? extends EObject> nextClass = next.getClass();
					keys.parallelStream().filter(c -> c.isAssignableFrom(nextClass))
					.forEach(c -> ((List<EObject>) elements.get(c)).add(next));

					addReferencedObjectsToStack(stack, next);
				}
			}
		}
		return elements;
	}

	/**
	 * Adds all referenced objects to the stack
	 *
	 * @param stack The stack
	 * @param eobject an object
	 */
	private static void addReferencedObjectsToStack(final Deque<EObject> stack, final EObject eobject) {
		for (final EReference reference : eobject.eClass().getEAllReferences()) {
			final var result = eobject.eGet(reference);
			if (result instanceof Collection) {
				stack.addAll((Collection<? extends EObject>) result);
			} else if (result instanceof EObject) {
				stack.add((EObject) result);
			}
		}
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
			final var javaResource = this.discoverer.getTargetModel();
			if (javaResource != null) {
				javaResource.setURI(uri);
				final var contents = javaResource.getContents();

				if (!contents.isEmpty()) {
					final var eobject = contents.get(0);

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
	private ElementsToAnalyze getElementsToAnalyze(final IJavaProject project, final Collection<IPath> libs)
			throws JavaModelException {
		final var analyze = new ElementsToAnalyze(project);
		final var discoverableElements = AbstractDiscoverJavaModelFromProject.computeDiscoverableElements(project);

		for (final Object discoverableObject : discoverableElements) {
			IPackageFragmentRoot root;
			if (discoverableObject instanceof IPackageFragmentRoot) {
				root = (IPackageFragmentRoot) discoverableObject;
			} else {
				continue;
			}
			addToAnalyzeIfConsideredLib(root, libs, analyze);
		}
		return analyze;
	}

	private void addToAnalyzeIfConsideredLib(final IPackageFragmentRoot fragment, final Collection<IPath> consider,
			final ElementsToAnalyze analyze) throws JavaModelException {
		final var resource = fragment.getResource();
		if (resource != null) {
			for (final IPath libPath : consider) {
				if (libPath.isAbsolute() ? libPath.equals(resource.getLocation())
						: libPath.equals(resource.getProjectRelativePath())) {
					analyze.addElementToDiscover(fragment);
					if (fragment.getSourceAttachmentPath() != null) {
						analyze.getDiscoveryOptions(fragment).put("USE_SOURCES", true);
					}
				}
			}
		}
	}

	@Override
	public boolean isApplicableTo(final IJavaProject source) {
		return this.discoverer.isApplicableTo(source);
	}

	@Override
	public ResourceSet getResourceSet() {
		return this.discoverer.getResourceSet();
	}

	@Override
	public void discoverElement(final IJavaProject source, final IProgressMonitor monitor) throws DiscoveryException {
		try {
			new GravityModiscoProjectDiscoverer(source).discoverModel(monitor);
		} catch (final IOException e) {
			throw new DiscoveryException(e);
		}
	}

	public void setLoad(final boolean load) {
		this.load = load;
	}
}
