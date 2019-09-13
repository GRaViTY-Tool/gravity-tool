package org.gravity.tgg.test.complete;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import org.gravity.tgg.modisco.MoDiscoTGGConverter;
import org.gravity.tgg.test.util.ToFileLogger;
import org.gravity.tgg.uml.Transformation;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized.Parameters;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import com.googlecode.junittoolbox.ParallelParameterized;

import language.LanguagePackage;
import runtime.RuntimePackage;

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
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(TransformationTest.class);

	@Rule
	public ToFileLogger logToFile = new ToFileLogger(Paths.get(new File("testlogs").toURI()));

	protected final IJavaProject project;
	protected final String name;

	/**
	 * The constructor taking the collected projects
	 * 
	 * This constructor should be only called by junit!
	 * 
	 * @param name    The name of the project
	 * @param project The project
	 */
	public TransformationTest(String name, IJavaProject project) {
		this.project = project;
		this.name = name;
		LanguagePackage.eINSTANCE.eResource();
		RuntimePackage.eINSTANCE.eResource();
	}

	@BeforeClass
	public static void initLogging() {
		// Set up logging
		BasicConfigurator.configure();
		Logger rootLogger = Logger.getRootLogger();
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
		List<IProject> projects = EclipseProjectUtil.importProjectsFromWorkspaceLocation(new NullProgressMonitor());
		LOGGER.info("Imported " + projects.size() + "projects into workspace.");
		return TestHelper.prepareTestData(projects);
	}

	/**
	 * Transforms every input project and checks the created model
	 */
	@Test(timeout = 20 * 60 * 1000)
	public void test0ModiscoPreprocessing() {
		MGravityModel preprocessedModel;
		try {
			preprocessedModel = new GravityModiscoProjectDiscoverer().discoverMGravityModelFromProject(project,
					new NullProgressMonitor());
		} catch (DiscoveryException e) {
			throw new AssertionError(e.getLocalizedMessage(), e);
		}

		File outputFile = getModiscoFile(project.getProject());
		try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
			preprocessedModel.eResource().save(outputStream, Collections.emptyMap());
		} catch (IOException e) {
			throw new AssertionError(e.getLocalizedMessage(), e);
		}

		assertNotNull(preprocessedModel);

		// Check, if element counts (e. g. number of TFlows) are as expected
		IFile path = project.getProject().getFile("expectModisco.json");
		File file = new File(path.toString());
		if (file.exists()) {
			checkModel(preprocessedModel, path);
		}
	}

	/**
	 * The method in which tests on eclipse java projects can be defined
	 * 
	 * @throws Exception The test might throws exceptions
	 */
	@Test(timeout = 20 * 60 * 1000)
	public final void test1ProgramModelTGG() {
		LOGGER.info("Test PM TGG for: " + project.getProject().getName());

		MoDiscoTGGConverter conv = null;
		try {
			conv = new MoDiscoTGGConverter();
			conv.setDebug(DEBUG);
		} catch (final IOException e) {
			throw new AssertionError(String.format("Unable to load '%s': %s", project, e.getMessage()));
		}
		MGravityModel modiscoModel = getModiscoModel(conv.getResourceSet());
		if (!conv.convertModel(project, modiscoModel, new NullProgressMonitor())) {
			throw new AssertionError("Trafo failed");
		}

		TypeGraph pg = conv.getPG();
		assertNotNull(pg);
		save(pg, "pm", GravityActivator.FILE_EXTENSION_XMI);
		conv.discard();

		IFile expectJsonFile = project.getProject().getFile("expect.json");
		if (expectJsonFile.exists()) {
			checkModel(pg, expectJsonFile);
		}
		checkModel(pg);
	}

	/**
	 * Checks the model against the expected result specified in henshin rules
	 * 
	 * @param pm The model to ckeck
	 */
	private void checkModel(TypeGraph pm) {
		ExtensionFileVisitor visitor = new ExtensionFileVisitor("henshin");
		try {
			project.getProject().accept(visitor);
		} catch (CoreException e) {
			LOGGER.error(e.getLocalizedMessage(), e);
		}
		EGraphImpl graph = new EGraphImpl(pm);
		HenshinResourceSet resourceSet = new HenshinResourceSet();
		resourceSet.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		resourceSet.getResources().add(pm.eResource());
		Engine engine = new EngineImpl();
		for (Path file : visitor.getFiles()) {
			Module module = resourceSet.getModule(file.toAbsolutePath().toString(), false);
			for (org.eclipse.emf.henshin.model.Rule rule : module.getAllRules()) {
				Iterable<Match> matches = engine.findMatches(rule, graph, null);
				assertTrue(matches.iterator().hasNext());
			}
		}
	}

	/**
	 * A getter for the location of the preprocessed modisco model
	 * 
	 * @return the location
	 */
	private static File getModiscoFile(IProject project) {
		return new File(project.getLocation().toFile(), "modisco.xmi");
	}

	/**
	 * Loads a previously discovered modisco model
	 * 
	 * @param rs The resource set the model should be loaded into
	 * @return The model or null
	 */
	private MGravityModel getModiscoModel(ResourceSet rs) {
		File src = getModiscoFile(project.getProject());
		Resource resource = rs.getResource(URI.createFileURI(src.getAbsolutePath()), true);
		if (resource == null) {
			return null;
		}
		MGravityModel modiscoModel = (MGravityModel) resource.getContents().get(0);
		return modiscoModel;
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
	@Test(timeout = 20 * 60 * 1000)
	public void test2UmlTGG() {
		try {
			LOGGER.info("Test UML TGG for: " + project.getProject().getName());
			NullProgressMonitor monitor = new NullProgressMonitor();
			Model model;
			try {
				if (ADD_UMLSEC) {
					model = Transformation.projectToModel(project, ADD_UMLSEC, monitor);
				} else {
					MGravityModel preprocessedModel = getModiscoModel(new ResourceSetImpl());
					model = Transformation.modiscoToModel(preprocessedModel, project, monitor);
				}
				assertNotNull(model);
			} catch (TransformationFailedException | IOException e) {
				LOGGER.log(Level.ERROR, e.getMessage(), e);
				throw new AssertionError(e.getMessage(), e);
			}

			if (DEBUG) {
				save(model, "uml", UMLResource.FILE_EXTENSION);
			}

		} finally {
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
		NullProgressMonitor monitor = new NullProgressMonitor();
		IFile file = EclipseProjectUtil.getGravityFolder(project.getProject(), monitor)
				.getFile("org.gravity.annotations.jar");
		IClasspathEntry cpe = project.getClasspathEntryFor(file.getLocation());
		if (cpe != null) {
			IClasspathEntry[] oldCp = project.getRawClasspath();
			IClasspathEntry[] newCp = new IClasspathEntry[oldCp.length - 1];
			int i = 0;
			for (IClasspathEntry e : oldCp) {
				if (!e.getPath().equals(file.getLocation())) {
					newCp[i++] = e;
				}
			}
			project.setRawClasspath(newCp, monitor);
		}
		file.delete(true, monitor);
	}

	private void save(EObject eObject, String prefix, String fileExtension) {
		String fileName = prefix + '_' + project.getProject().getName() + "." + fileExtension;
		IFile file = project.getProject().getFile(fileName);
		try (OutputStream stream = new FileOutputStream(file.getLocation().toFile())) {
			eObject.eResource().save(stream, Collections.emptyMap());
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

	/**
	 * Check, if element counts (e. g. number of TFlows) are as expected
	 * 
	 * @param model          the model to check
	 * @param expectJsonFile The JSON file containing the expectations
	 */
	private void checkModel(EObject model, IFile expectJsonFile) {
		JsonObject map;
		try (Reader fileReader = new InputStreamReader(expectJsonFile.getContents())) {
			map = (JsonObject) Jsoner.deserialize(fileReader);
		} catch (IOException | JsonException | CoreException e) {
			LOGGER.error(e.getMessage(), e);
			throw new AssertionError(e.getMessage(), e);
		}
		TreeIterator<EObject> it = model.eResource().getAllContents();
		BigDecimal one = new BigDecimal(1);
		while (it.hasNext()) {
			EObject eObject = it.next();
			String typeName = eObject.eClass().getName();
			if (map.containsKey(typeName)) {
				BigDecimal count = (BigDecimal) map.get(typeName);
				map.put(typeName, count.subtract(one));
			}
		}
		for (Entry<String, Object> entry : map.entrySet()) {
			Object value = entry.getValue();
			assertEquals(value + " elements of type " + entry.getKey() + " could not be transformed.", 0,
					((BigDecimal) value).intValue());
		}
	}
}
