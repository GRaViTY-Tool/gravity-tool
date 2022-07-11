/**
 *
 */
package org.gravity.tgg.tests.modisco.prepocessing;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.ModiscoPackage;
import org.gravity.modisco.processing.fwd.ReturnTypePreprocessing;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Sven Peldszus
 *
 */
@RunWith(Parameterized.class)
public class ReturnTypePreprocessingTests {

	private final File file;

	public ReturnTypePreprocessingTests(final File file) {
		this.file = file;
	}

	@Parameters(name = "{0}")
	public static File[] getModels() {
		return new File("models/returntypes").listFiles();
	}

	@Test
	public void testReturnTypeProcessing() throws FileNotFoundException, IOException {
		final var set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		set.getPackageRegistry().put(JavaPackage.eNS_URI, JavaPackage.eINSTANCE);
		set.getPackageRegistry().put(ModiscoPackage.eNS_URI, ModiscoPackage.eINSTANCE);
		final var resource = set.createResource(URI.createURI("modisco.xmi"));
		resource.load(new FileInputStream(this.file), null);
		assertTrue(new ReturnTypePreprocessing().process((MGravityModel) resource.getContents().get(0), null, null));
	}
}
