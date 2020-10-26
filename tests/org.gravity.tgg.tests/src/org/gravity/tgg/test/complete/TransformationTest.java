package org.gravity.tgg.test.complete;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.gravity.eclipse.tests.TestHelper;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.security.annotations.AnnotationsActivator;
import org.gravity.tgg.modisco.pm.MoDiscoTGGConverter;
import org.gravity.tgg.uml.Transformation;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized.Parameters;
import org.moflon.tgg.language.LanguagePackage;
import org.moflon.tgg.runtime.RuntimePackage;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.googlecode.junittoolbox.ParallelParameterized;

/**
 * An abstract test template collecting test java projects and allows to test
 * transformations on them.
 *
 * The test has to be launched as junit plugin test
 *
 * @author speldszus
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(ParallelParameterized.class)
public class TransformationTest {

	/**
	 * If the test should be executed in debug mode
	 */
	private static final boolean DEBUG = false;

	/**
	 * If the test should serialize the modisco model
	 */
	private static final boolean SERIALIZE = true;
	private static final boolean JSON_CHECKS = false;

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(TransformationTest.class);

	protected final IJavaProject project;
	protected final String name;

	private static Map<String, MGravityModel> models = new ConcurrentHashMap<>();

	/**
	 * The constructor taking the collected projects
	 *
	 * This constructor should be only called by junit!
	 *
	 * @param name    The name of the project
	 * @param project The project
	 */
	public TransformationTest(final String name, final IJavaProject project) {
		this.project = project;
		this.name = name;
		// Add dependency to security annotations
		LanguagePackage.eINSTANCE.getNsURI();
		RuntimePackage.eINSTANCE.getNsURI();
		final String id = AnnotationsActivator.PLUGIN_ID;
	}

	@BeforeClass
	public static void initLogging() {
		// Set up logging
		BasicConfigurator.configure();
		final Logger rootLogger = Logger.getRootLogger();
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
				.importProjectsFromWorkspaceLocation(new NullProgressMonitor());
		LOGGER.info("Imported " + projects.size() + "projects into workspace.");
		return TestHelper.prepareTestData(projects);
	}

	/**
	 * Transforms every input project and checks the created model
	 */
	@Test
	public void test0ModiscoPreprocessing() {
		MGravityModel preprocessedModel;
		try {
			preprocessedModel = new GravityModiscoProjectDiscoverer().discoverMGravityModelFromProject(this.project,
					new NullProgressMonitor());
		} catch (final DiscoveryException e) {
			throw new AssertionError(e.getLocalizedMessage(), e);
		}
		assertNotNull(preprocessedModel);

		if (JSON_CHECKS) {
			// Check, if element counts (e. g. number of TFlows) are as expected
			final IFile file = this.project.getProject().getFile("expectModisco.json");
			if (file.exists()) {
				checkModel(preprocessedModel, file);
			}
		}
		// Store the model
		if (SERIALIZE) {
			final File outputFile = getModiscoFile(this.project.getProject());
			try (OutputStream outputStream = Files.newOutputStream(outputFile.toPath())) {
				preprocessedModel.eResource().save(outputStream, Collections.emptyMap());
			} catch (final IOException e) {
				throw new AssertionError(e.getLocalizedMessage(), e);
			}
		}
		models.put(this.name, preprocessedModel);
	}

	/**
	 * The method in which tests on eclipse java projects can be defined
	 *
	 * @throws Exception The test might throws exceptions
	 */
	@Test
	public final void test1ProgramModelTGG() {
		LOGGER.info("Test PM TGG for: " + this.project.getProject().getName());

		MoDiscoTGGConverter conv = null;
		try {
			conv = new MoDiscoTGGConverter(this.project);
			conv.setDebug(DEBUG);
		} catch (final IOException e) {
			throw new AssertionError(String.format("Unable to load '%s': %s", this.project, e.getMessage()));
		}
		final MGravityModel modiscoModel = getModiscoModel();
		if (!conv.convertModel(modiscoModel, new NullProgressMonitor())) {
			throw new AssertionError("Trafo failed");
		}

		final TypeGraph pg = conv.getPG();
		assertNotNull(pg);
		save(pg, "pm", GravityActivator.FILE_EXTENSION_XMI);

		if (JSON_CHECKS) {
			final IFile expectJsonFile = this.project.getProject().getFile("expect.json");
			if (expectJsonFile.exists()) {
				checkModel(pg, expectJsonFile);
			}
		}
		checkModel(pg);
//		 conv.discard();
	}

	/**
	 * Checks the model against the expected result specified in henshin rules
	 *
	 * @param pm The model to ckeck
	 */
	private void checkModel(final TypeGraph pm) {
		final ExtensionFileVisitor visitor = new ExtensionFileVisitor("henshin");
		try {
			this.project.getProject().accept(visitor);
		} catch (final CoreException e) {
			LOGGER.error(e.getLocalizedMessage(), e);
		}
		final EGraphImpl graph = new EGraphImpl(pm);
		final HenshinResourceSet resourceSet = new HenshinResourceSet();
		resourceSet.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		resourceSet.getResources().add(pm.eResource());
		final Engine engine = new EngineImpl();
		for (final Path file : visitor.getFiles()) {
			final Module module = resourceSet.getModule(file.toAbsolutePath().toString(), false);
			for (final org.eclipse.emf.henshin.model.Rule rule : module.getAllRules()) {
				final Iterable<Match> matches = engine.findMatches(rule, graph, null);
				assertTrue(matches.iterator().hasNext());
			}
		}
	}

	/**
	 * A getter for the location of the preprocessed modisco model
	 *
	 * @return the location
	 */
	private static File getModiscoFile(final IProject project) {
		return new File(project.getLocation().toFile(), "modisco.xmi");
	}

	/**
	 * Loads a previously discovered modisco model
	 *
	 * @return The model or null
	 */
	private MGravityModel getModiscoModel() {
		MGravityModel model = models.get(this.name);
		if (model != null) {
			return model;
		}

		final File src = getModiscoFile(this.project.getProject());
		final Resource resource = new ResourceSetImpl().getResource(URI.createFileURI(src.getAbsolutePath()), true);
		if (resource == null) {
			return null;
		}
		model = (MGravityModel) resource.getContents().get(0);
		models.put(this.name, model);
		return model;
	}

	private static final boolean ADD_UMLSEC = false;

	/**
	 * The constructor taking the collected projects
	 *
	 * This constructor should be only called by junit!
	 *
	 * @see org.gravity.tgg.test.complete.TransformationTest#testProgramModelTGG()
	 *
	 * @param name    The project name
	 * @param project The java project
	 * @throws IOException           If reading or writing files failed
	 * @throws CoreException
	 * @throws DiscoveryException
	 * @throws FileNotFoundException
	 */
	@Test
	public void test2UmlTGG() {
		try {
			LOGGER.info("Test UML TGG for: " + this.project.getProject().getName());
			final NullProgressMonitor monitor = new NullProgressMonitor();
			Model model;
			try {
				Transformation transformation = new Transformation(this.project, null);
				if (ADD_UMLSEC) {
					model = transformation.projectToModel(ADD_UMLSEC, monitor);
				} else {
					final MGravityModel preprocessedModel = getModiscoModel();
					model = transformation.modiscoToModel(preprocessedModel, monitor);
				}
				assertNotNull(model);
			} catch (TransformationFailedException | IOException | CoreException e) {
				LOGGER.log(Level.ERROR, e.getMessage(), e);
				throw new AssertionError(e.getMessage(), e);
			}

			if (DEBUG) {
				save(model, "uml", UMLResource.FILE_EXTENSION);
			}

		} finally {
			models.remove(this.name);
			try {
				cleanClassPath();
			} catch (IOException | CoreException e) {
				LOGGER.error(e.getLocalizedMessage(), e);
			}
		}
	}

	/**
	 * Cleans up the changes of the UML test
	 *
	 * @param monitor A progress monitor
	 * @throws IOException   If the gravity folder of the project doesn't exists and
	 *                       cannot be created
	 * @throws CoreException If the gravity folder cannot be deleted
	 */
	private void cleanClassPath() throws IOException, CoreException {
		final NullProgressMonitor monitor = new NullProgressMonitor();
		final IFile file = EclipseProjectUtil.getGravityFolder(this.project.getProject(), monitor)
				.getFile("org.gravity.annotations.jar");
		final IClasspathEntry cpe = this.project.getClasspathEntryFor(file.getLocation());
		if (cpe != null) {
			final IClasspathEntry[] oldCp = this.project.getRawClasspath();
			final IClasspathEntry[] newCp = new IClasspathEntry[oldCp.length - 1];
			int i = 0;
			for (final IClasspathEntry e : oldCp) {
				if (!e.getPath().equals(file.getLocation())) {
					newCp[i++] = e;
				}
			}
			this.project.setRawClasspath(newCp, monitor);
		}
		file.delete(true, monitor);
	}

	private void save(final EObject eObject, final String prefix, final String fileExtension) {
		final String fileName = prefix + '_' + this.project.getProject().getName() + "." + fileExtension;
		final IFile file = this.project.getProject().getFile(fileName);
		try (OutputStream stream = Files.newOutputStream(file.getLocation().toFile().toPath())) {
			eObject.eResource().save(stream, Collections.emptyMap());
		} catch (final IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

	/**
	 * Check, if element counts (e. g. number of TFlows) are as expected
	 *
	 * @param model          the model to check
	 * @param expectJsonFile The JSON file containing the expectations
	 */
	private void checkModel(final EObject model, final IFile expectJsonFile) {
		JsonObject map;
		try (Reader fileReader = new InputStreamReader(expectJsonFile.getContents())) {
			map = (JsonObject) Jsoner.deserialize(fileReader);
		} catch (IOException | JsonException | CoreException e) {
			LOGGER.error(e.getMessage(), e);
			throw new AssertionError(e.getMessage(), e);
		}
		final TreeIterator<EObject> it = model.eResource().getAllContents();
		while (it.hasNext()) {
			final EObject eObject = it.next();
			final String typeName = eObject.eClass().getName();
			if (map.containsKey(typeName)) {
				final BigDecimal count = (BigDecimal) map.get(typeName);
				map.put(typeName, count.subtract(BigDecimal.ONE));
			}
		}
		map.entrySet().parallelStream().forEach(entry -> {
			final Object value = entry.getValue();
			assertEquals(value + " elements of type " + entry.getKey() + " could not be transformed.", 0,
					((BigDecimal) value).intValue());
		});
	}
}
