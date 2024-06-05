package org.gravity.tgg.tests.complete;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

import org.apache.log4j.Level;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Model;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.tgg.modisco.pm.MoDiscoTGGConverter;
import org.gravity.tgg.uml.Transformation;
import org.gravity.typegraph.basic.BasicPackage;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

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
public class TransformationTest extends AbstractParameterizedTransformationTest {

	/**
	 * If the test should serialize the modisco model
	 */
	private static final boolean SERIALIZE = true;
	private static final boolean JSON_CHECKS = false;

	public TransformationTest(final String name, final IJavaProject project) {
		super(name, project);
	}

	/**
	 * Transforms every input project and checks the created model
	 *
	 * @throws DiscoveryException
	 * @throws IOException
	 */
	@Test
	public void test0ModiscoPreprocessing() throws DiscoveryException, IOException {
		final var preprocessedModel = new GravityModiscoProjectDiscoverer(this.project, false)
				.discoverModel(new NullProgressMonitor());
		assertNotNull(preprocessedModel);

		if (JSON_CHECKS) {
			// Check, if element counts (e. g. number of TFlows) are as expected
			final var file = this.project.getProject().getFile("expectModisco.json");
			if (file.exists()) {
				this.checkModel(preprocessedModel, file);
			}
		}
		// Store the model
		if (SERIALIZE) {
			final var outputFile = GravityModiscoProjectDiscoverer.getModiscoFile(this.project.getProject(), null);
			try (var outputStream = Files.newOutputStream(outputFile.getLocation().toFile().toPath())) {
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
	 * @throws CoreException
	 * @throws IOException
	 */
	@Test
	public final void test1ProgramModelTGG() throws CoreException, IOException {
		LOGGER.info("Test PM TGG for: " + this.project.getProject().getName());
		final var monitor = new NullProgressMonitor();

		GravityActivator.getProgramModelFolder(this.project.getProject(), monitor).delete(true, monitor);

		MoDiscoTGGConverter conv = null;
		try {
			conv = new MoDiscoTGGConverter(this.project);
			conv.setDebug(DEBUG);
			conv.disableAutosave();
		} catch (final IOException e) {
			throw new AssertionError(String.format("Unable to load '%s': %s", this.project, e.getMessage()));
		}
		final var modiscoModel = this.getModiscoModel();
		if (!conv.convertModel(modiscoModel, monitor)) {
			throw new AssertionError("Trafo failed");
		}

		final var pg = conv.getPG();
		assertNotNull(pg);

		if (JSON_CHECKS) {
			final var expectJsonFile = this.project.getProject().getFile("expect.json");
			if (expectJsonFile.exists()) {
				this.checkModel(pg, expectJsonFile);
			}
		}
		this.checkModel(pg);
	}

	/**
	 * Checks the model against the expected result specified in henshin rules
	 *
	 * @param pm The model to ckeck
	 */
	private void checkModel(final EObject root) {
		final var visitor = new ExtensionFileVisitor("henshin");
		try {
			this.project.getProject().accept(visitor);
		} catch (final CoreException e) {
			LOGGER.error(e.getLocalizedMessage(), e);
		}
		final var projectLocation = this.project.getProject().getLocation().toFile().toPath();

		final var graph = new EGraphImpl(root.eResource());
		final var resourceSet = new HenshinResourceSet();
		resourceSet.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		resourceSet.getResources().add(root.eResource());
		final Engine engine = new EngineImpl();

		for (final Path file : visitor.getFiles()) {
			if (file.getParent().equals(projectLocation)) {
				final var module = resourceSet.getModule(file.toAbsolutePath().toString(), false);
				if (module.getImports().contains(root.eClass().getEPackage())) {
					for (final org.eclipse.emf.henshin.model.Rule rule : module.getAllRules()) {
						final var matches = engine.findMatches(rule, graph, null);
						assertTrue(matches.iterator().hasNext());
					}
				}
			}
		}
	}

	private static final boolean ADD_UMLSEC = false;

	/**
	 * The constructor taking the collected projects
	 *
	 * This constructor should be only called by junit!
	 *
	 * @see org.gravity.tgg.tests.complete.TransformationTest#testProgramModelTGG()
	 *
	 * @param name    The project name
	 * @param project The java project
	 * @throws DiscoveryException
	 */
	@Test
	public void test2UmlTGG() throws DiscoveryException {
		try {
			LOGGER.info("Test UML TGG for: " + this.project.getProject().getName());
			final var monitor = new NullProgressMonitor();
			Model model;
			try {
				final var transformation = new Transformation(this.project, false);
				transformation.disableAutosave();
				if (ADD_UMLSEC) {
					model = transformation.projectToModel(ADD_UMLSEC, monitor);
				} else {
					final var preprocessedModel = this.getModiscoModel();
					model = transformation.modiscoToModel(preprocessedModel, monitor);
				}
				assertNotNull(model);
			} catch (TransformationFailedException | IOException | CoreException e) {
				LOGGER.log(Level.ERROR, e.getMessage(), e);
				throw new AssertionError(e.getMessage(), e);
			}
			this.checkModel(model);
		} finally {
			models.remove(this.name);
			try {
				this.cleanClassPath();
			} catch (IOException | CoreException e) {
				LOGGER.error(e.getLocalizedMessage(), e);
			}
		}
	}

	/**
	 * Check, if element counts (e. g. number of TFlows) are as expected
	 *
	 * @param model          the model to check
	 * @param expectJsonFile The JSON file containing the expectations
	 */
	private void checkModel(final EObject model, final IFile expectJsonFile) {
		JsonObject object;
		try (Reader reader = new InputStreamReader(expectJsonFile.getContents())) {
			object = JsonParser.parseReader(reader).getAsJsonObject();
		} catch (IOException | JsonIOException | CoreException e) {
			LOGGER.error(e.getMessage(), e);
			throw new AssertionError(e.getMessage(), e);
		}
		final var it = model.eResource().getAllContents();
		while (it.hasNext()) {
			final var eObject = it.next();
			final var typeName = eObject.eClass().getName();
			if (object.has(typeName)) {
				final var count = object.get(typeName).getAsBigDecimal();
				object.addProperty(typeName, count.subtract(BigDecimal.ONE));
			}
		}
		object.entrySet().parallelStream().forEach(entry -> {
			final Object value = entry.getValue();
			assertEquals(value + " elements of type " + entry.getKey() + " could not be transformed.", 0,
					((BigDecimal) value).intValue());
		});
	}
}
