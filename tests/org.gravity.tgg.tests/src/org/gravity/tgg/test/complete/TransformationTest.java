package org.gravity.tgg.test.complete;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

import org.apache.log4j.Level;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.tgg.uml.Transformation;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.moflon.tgg.algorithm.configuration.PGSavingConfigurator;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

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
	 * @throws DiscoveryException
	 */
	@Test
	public void test0ModiscoPreprocessing() throws DiscoveryException {
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
			final IFile outputFile = GravityModiscoProjectDiscoverer.getModiscoFile(this.project.getProject(), null);
			try (OutputStream outputStream = Files.newOutputStream(outputFile.getLocation().toFile().toPath())) {
				preprocessedModel.eResource().save(outputStream, Collections.emptyMap());
			} catch (final IOException e) {
				throw new AssertionError(e.getLocalizedMessage(), e);
			}
		}
		models.put(this.name, preprocessedModel);
	}

	/**
	 * The method in which tests on eclipse java projects can be defined
	 * @throws CoreException
	 * @throws IOException
	 * @throws DiscoveryException
	 *
	 * @throws Exception The test might throws exceptions
	 */
	//	@Test
	//	public final void test1ProgramModelTGG() throws CoreException, IOException, DiscoveryException {
	//		LOGGER.info("Test PM TGG for: " + this.project.getProject().getName());
	//		final NullProgressMonitor monitor = new NullProgressMonitor();
	//
	//		MoDiscoTGGConverter.getFolder(this.project.getProject(), monitor).delete(true, monitor);
	//
	//		MoDiscoTGGConverter conv = null;
	//		try {
	//			conv = new MoDiscoTGGConverter(this.project, new ResourceSetImpl());
	//			conv.setDebug(DEBUG);
	//			conv.disableAutosave();
	//		} catch (final IOException e) {
	//			throw new AssertionError(String.format("Unable to load '%s': %s", this.project, e.getMessage()));
	//		}
	//		final MGravityModel modiscoModel = getModiscoModel();
	//		if (!conv.convertModel(modiscoModel, monitor)) {
	//			throw new AssertionError("Trafo failed");
	//		}
	//
	//		final TypeGraph pg = conv.getPG();
	//		assertNotNull(pg);
	//		save(pg, "pm", GravityActivator.FILE_EXTENSION_XMI);
	//
	//		if (JSON_CHECKS) {
	//			final IFile expectJsonFile = this.project.getProject().getFile("expect.json");
	//			if (expectJsonFile.exists()) {
	//				checkModel(pg, expectJsonFile);
	//			}
	//		}
	//		checkModel(pg);
	//		//		 conv.discard();
	//	}

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
	public void test2UmlTGG() throws DiscoveryException {
		try {
			LOGGER.info("Test UML TGG for: " + this.project.getProject().getName());
			final NullProgressMonitor monitor = new NullProgressMonitor();
			Model model;
			try {
				final Transformation transformation = new Transformation(this.project, null, false);
				transformation.setConfigurator(new PGSavingConfigurator(transformation, this.project.getProject().getFile("pg.xmi").getLocation().toFile().getAbsolutePath()));
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
