package org.gravity.tgg.tests.codegen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.tgg.uml.GravityUmlActivator;
import org.gravity.tgg.uml.Transformation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.model.InitializationError;

/**
 * Tests for the code generation from UML models
 *
 * @author speldszus
 *
 */
@RunWith(Parameterized.class)
public class UMLCodeGenTest {

	private static final Logger LOGGER = Logger.getLogger(UMLCodeGenTest.class);

	private final String packageName;
	private final String typeName;

	private IProject project;
	private IFile umlFile;

	/**
	 * Generates a test project and UML model
	 *
	 * @param description A description of the test for logging
	 * @param packageName The package name that should be used or <code>null</code>
	 *                    if no package should be generated
	 * @param typeName    The name of the class that should be added to the UML
	 *                    model
	 * @throws InitializationError If the project cannot be generated
	 * @throws CoreException       If the cleanup failed in case of an error
	 */
	public UMLCodeGenTest(final String descrition, final String packageName, final String typeName)
			throws InitializationError, CoreException {
		this.packageName = packageName;
		this.typeName = typeName;

		BasicConfigurator.configure();
		LOGGER.info("Running UML code generation test: " + descrition);

		final var monitor = new NullProgressMonitor();
		try {
			this.project = EclipseProjectUtil.createProject("CodeGenTest", true, monitor);
			this.umlFile = Transformation.getUMLFile(this.project, monitor);
			generateUMLModel(this.umlFile, packageName, typeName);
		} catch (IOException | DuplicateProjectNameException | CoreException e) {
			if (this.project != null) {
				this.project.delete(true, monitor);
			}
			throw new InitializationError(e);
		}
	}

	@Parameters(name = "{0}")
	public static String[][] testcases() {
		return new String[][] { new String[] { "Simple Class", "namespace", "Type" },
			new String[] { "No Package", null, "Type" } };
	}

	@Test
	public void testGenerateCode() throws CoreException {
		final var monitor = new NullProgressMonitor();
		try {
			final var status = Transformation.generateCode(this.project, this.umlFile, monitor);
			assertEquals(Status.OK_STATUS, status);

			this.project.refreshLocal(IResource.DEPTH_INFINITE, monitor);

			checkGeneratedJavaFile(this.project);

			final var java = JavaProjectUtil.getJavaProject(this.project);
			final var types = JavaASTUtil.getTypesForProject(java);
			assertTrue(types.containsKey(getQualifiedName()));
		} finally {
			GravityUmlActivator.getTransformationFactory().drop(this.project);
			this.project.delete(true, monitor);
		}
	}

	/**
	 * Builds the qualified name of the class expected to be generated
	 *
	 * @return The qualified name
	 */
	private String getQualifiedName() {
		if (this.packageName != null) {
			return this.packageName + '.' + this.typeName;
		}
		return this.typeName;
	}

	/**
	 * Checks if the source file has been generated as expected
	 *
	 */
	private void checkGeneratedJavaFile(final IProject project) {
		var path = new File("src");
		if (this.packageName != null) {
			path = new File(path, this.packageName);
		}
		final var srcFile = project.getFile(new File(path, this.typeName + ".java").toString());
		assertTrue(srcFile.exists());
	}

	/**
	 * Generates a simple UML model with one class
	 *
	 * @param umlFile   The file to which the model should be written
	 * @param namespace The name of the package that should contain the generated
	 *                  type or <code>null</code>
	 * @param type      The name of the type
	 * @return The generated model
	 * @throws IOException
	 */
	private Model generateUMLModel(final IFile umlFile, final String namespace, final String type) throws IOException {
		final var resource = new ResourceSetImpl().createResource(EMFUtil.getPlatformResourceURI(umlFile));
		final var root = UMLFactory.eINSTANCE.createModel();
		root.setName(umlFile.getProject().getName());
		final var container = namespace == null ? root : root.createNestedPackage(namespace);
		container.createOwnedClass(type, false);
		resource.getContents().add(root);
		resource.save(Collections.emptyMap());
		return root;
	}
}
