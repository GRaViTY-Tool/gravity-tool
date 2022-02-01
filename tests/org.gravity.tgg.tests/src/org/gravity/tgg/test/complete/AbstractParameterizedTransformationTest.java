package org.gravity.tgg.test.complete;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.tests.TestHelper;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.security.annotations.AnnotationsPackage;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.moflon.tgg.language.LanguagePackage;
import org.moflon.tgg.runtime.RuntimePackage;

//@RunWith(ParallelParameterized.class)
@RunWith(Parameterized.class)
public abstract class AbstractParameterizedTransformationTest {

	/**
	 * If the test should be executed in debug mode
	 */
	protected static final boolean DEBUG = true;
	private static final List<String> SKIP = Arrays.asList("DF-AssignmentArgument", "ParamToParam");
	/**
	 * The logger of this class
	 */
	protected static final Logger LOGGER = Logger.getLogger(AbstractParameterizedTransformationTest.class);
	protected final IJavaProject project;
	protected final String name;
	protected static Map<String, MGravityModel> models = new ConcurrentHashMap<>();



	/**
	 * The constructor taking the collected projects
	 *
	 * This constructor should be only called by junit!
	 *
	 * @param name    The name of the project
	 * @param project The project
	 */
	public AbstractParameterizedTransformationTest(final String name, final IJavaProject project) {
		this.project = project;
		this.name = name;
		// Add dependency to security annotations
		LanguagePackage.eINSTANCE.getNsURI();
		RuntimePackage.eINSTANCE.getNsURI();
		AnnotationsPackage.eINSTANCE.getNsURI();
	}


	@BeforeClass
	public static void initLogging() {
		// Set up logging
		BasicConfigurator.configure();
		final var rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(Level.WARN);
		GravityActivator.getDefault().setVerbose(DEBUG);
		LOGGER.setLevel(Level.ALL);
	}

	/**
	 * The method for collecting the java projects from the workspace.
	 *
	 * This constructor should be only called by junit!
	 *
	 * @return The test parameters as needed by junit paramterized tests
	 * @throws CoreException
	 */
	@Parameters(name = "{index}: Forward Transformation From Src: {0}")
	public static final Collection<Object[]> data() throws CoreException {
		LOGGER.info("Collect test data");
		final List<IProject> projects = EclipseProjectUtil
				.importProjectsFromWorkspaceLocation(new NullProgressMonitor()).parallelStream()
				.filter(project -> !SKIP.contains(project.getName())).collect(Collectors.toList());
		LOGGER.info("Imported " + projects.size() + "projects into workspace.");
		return TestHelper.prepareTestData(projects);
	}

	/**
	 * Loads a previously discovered modisco model
	 *
	 * @return The model or null
	 * @throws DiscoveryException
	 * @throws IOException
	 */
	protected MGravityModel getModiscoModel() throws IOException {
		var model = models.get(this.name);
		if (model != null) {
			return model;
		}

		final var src = GravityModiscoProjectDiscoverer.getModiscoFile(this.project.getProject(), null);
		final var uri = EMFUtil.getPlatformResourceURI(src);
		final var resource = new ResourceSetImpl().getResource(uri, true);
		if (resource == null) {
			return null;
		}
		model = (MGravityModel) resource.getContents().get(0);
		models.put(this.name, model);
		return model;
	}

	/**
	 * Cleans up the changes of the UML test
	 *
	 * @param monitor A progress monitor
	 * @throws IOException   If the gravity folder of the project doesn't exists and
	 *                       cannot be created
	 * @throws CoreException If the gravity folder cannot be deleted
	 */
	protected void cleanClassPath() throws IOException, CoreException {
		final var monitor = new NullProgressMonitor();
		final var file = EclipseProjectUtil.getGravityFolder(this.project.getProject(), monitor)
				.getFile("org.gravity.annotations.jar");
		final var cpe = this.project.getClasspathEntryFor(file.getLocation());
		if (cpe != null) {
			final var oldCp = this.project.getRawClasspath();
			final var newCp = new IClasspathEntry[oldCp.length - 1];
			var i = 0;
			for (final IClasspathEntry e : oldCp) {
				if (!e.getPath().equals(file.getLocation())) {
					newCp[i++] = e;
				}
			}
			this.project.setRawClasspath(newCp, monitor);
		}
		file.delete(true, monitor);
	}

	protected void save(final EObject eObject, final String prefix, final String fileExtension) {
		final var fileName = prefix + '_' + this.project.getProject().getName() + "." + fileExtension;
		final var file = this.project.getProject().getFile(fileName);
		try (var stream = Files.newOutputStream(file.getLocation().toFile().toPath())) {
			eObject.eResource().save(stream, Collections.emptyMap());
		} catch (final IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

}