package org.gravity.tgg.tests.sync;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.StringLiteral;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Type;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.util.MoDiscoUtil;
import org.gravity.tgg.uml.GravityUmlActivator;
import org.junit.After;
import org.junit.Test;

import carisma.profile.umlsec.UmlsecFactory;

public class SyncBwdTest {

	// Source folders
	private static final String TEST = "test";
	private static final String SRC = "src";

	// General information
	private static final String PROJECT_NAME = "IncrementalChangeTestProject";
	private static final String CREATE_METHOD_NAME = "test";
	private static final String SIGNATURE = "method():void";
	private static final String PACKAGE_NAME = "dummy";
	private static final String JAVA_EXTENSION = ".java";

	// Type information
	private static final String A_NAME = "A";
	private static final String A_JAVA_FILE = A_NAME + JAVA_EXTENSION;
	private static final String A_QUALIFIED_NAME = PACKAGE_NAME + '.' + A_NAME;

	private static final String B_NAME = "B";
	private static final String B_JAVA_FILE = B_NAME + JAVA_EXTENSION;
	private static final String B_QUALIFIED_NAME = PACKAGE_NAME + '.' + B_NAME;

	private static final String C_NAME = "C";
	private static final String C_JAVA_FILE = C_NAME + JAVA_EXTENSION;
	private static final String C_QUALIFIED_NAME = PACKAGE_NAME + '.' + C_NAME;

	private static final String T_NAME = "Test";
	private static final String T_JAVA_FILE = T_NAME + JAVA_EXTENSION;
	private static final String T_QUALIFIED_NAME = PACKAGE_NAME + '.' + T_NAME;

	private final IProgressMonitor monitor;

	private final IProject project;

	public SyncBwdTest() throws CoreException, DuplicateProjectNameException {
		this.monitor = new NullProgressMonitor();
		final var old = EclipseProjectUtil.getProjectByName(PROJECT_NAME);
		if (old.exists()) {
			old.delete(true, this.monitor);
		}
		this.project = createProject(PROJECT_NAME, this.monitor);
	}

	private static IProject createProject(final String name, final IProgressMonitor monitor)
			throws CoreException, DuplicateProjectNameException {
		final var javaProject = JavaProjectUtil.createJavaProject(name, Arrays.asList(SRC, TEST), monitor);
		final var project = javaProject.getProject();

		final var srcDummy = project.getFolder(SRC).getFolder(PACKAGE_NAME);
		srcDummy.create(true, true, monitor);

		final var classAFile = srcDummy.getFile(A_JAVA_FILE);
		if (!classAFile.exists()) {
			classAFile.create(new ByteArrayInputStream(createEmptyClass(PACKAGE_NAME, A_NAME)), true, monitor);
		}

		final var classBFile = srcDummy.getFile(B_JAVA_FILE);
		if (!classBFile.exists()) {
			classBFile.create(new ByteArrayInputStream(createEmptyClass(PACKAGE_NAME, B_NAME)), true, monitor);
		}

		final var classCFile = srcDummy.getFile(C_JAVA_FILE);
		if (!classCFile.exists()) {
			classCFile.create(new ByteArrayInputStream(createEmptyClass(PACKAGE_NAME, C_NAME)), true, monitor);
		}

		final var testDummy = project.getFolder(TEST).getFolder(PACKAGE_NAME);
		testDummy.create(true, true, monitor);

		final var classTestFile = srcDummy.getFile(T_JAVA_FILE);
		if (!classTestFile.exists()) {
			classTestFile.create(new ByteArrayInputStream(createEmptyClass(PACKAGE_NAME, T_NAME)), true, monitor);
		}

		return project;
	}

	private static byte[] createEmptyClass(final String namespace, final String name) {
		return ("package " + namespace + ";\n" + "\n" + "public class " + name + " {\n" + "\n" + "}").getBytes();
	}

	@Test
	public void simpleSyncTest()
			throws IOException, CoreException, TransformationFailedException, DuplicateProjectNameException {
		final var factory = GravityUmlActivator.getTransformationFactory();
		final var transformation = factory.getTransformation(this.project);

		final var trg = transformation.projectToModel(true, this.monitor);
		final var src = ((MGravityModel) transformation.getSrc());

		assertCorrectTrafo(src);

		final Consumer<EObject> changeTrg = a -> {
			try {
				performChange(trg, this.monitor);
			} catch (TransformationFailedException | IOException e) {
				e.printStackTrace();
			}
		};

		transformation.applyChangeAndGenerateCode(changeTrg, this.monitor);

		assertOutcome(src);
	}

	@After
	public void cleanup() throws CoreException {
		if(this.project != null) {
			this.project.delete(true, this.monitor);
		}
	}

	private void assertOutcome(final MGravityModel src) throws JavaModelException {
		try {
			this.project.refreshLocal(IResource.DEPTH_INFINITE, this.monitor);
		} catch (final CoreException e) {
			e.printStackTrace();
		}
		final var javaProject = JavaCore.create(this.project);
		final var typeA = MoDiscoUtil.getType(src, A_QUALIFIED_NAME);
		assertTrue("Added method is not contained in MoDisco model.",
				typeA.getBodyDeclarations().stream().filter(MethodDeclaration.class::isInstance)
				.map(MethodDeclaration.class::cast)
				.anyMatch(m -> CREATE_METHOD_NAME.equals(m.getName()) && m.getParameters().isEmpty()));
		assertNotNull("Added method is not contained in Eclipse's Java AST",
				javaProject.findType(A_QUALIFIED_NAME).getMethod(CREATE_METHOD_NAME, new String[0]));

		final var typeB = MoDiscoUtil.getType(src, B_QUALIFIED_NAME);
		assertNull("Deleted type is still contained in MoDisco model.", typeB);
		final var astType = javaProject.findType(B_QUALIFIED_NAME);
		if (astType != null) {
			assertFalse("Deleted type is still contained Eclipse's Java AST.", astType.exists());
		}
		assertFalse("Deleted type's file still exists on file system.", this.project.getFolder(SRC)
				.getFolder(PACKAGE_NAME).getFile(B_JAVA_FILE).getLocation().toFile().exists());

		final var typeTest = MoDiscoUtil.getType(src, T_QUALIFIED_NAME);
		final List<Annotation> annotations = typeTest.getAnnotations();
		assertEquals("There are too many annotations on the Test class", 1, annotations.size());
		final var annotation = annotations.get(0);
		assertEquals("The added annotation has a wrong type", "Critical", annotation.getType().getType().getName());
		String secrecy = null;
		for (final AnnotationMemberValuePair value : annotation.getValues()) {
			if ("secrecy".equals(value.getName())) {
				final List<Expression> expressions = ((ArrayInitializer) value.getValue()).getExpressions();
				assertEquals("There are too many security requirements on the secrecy level", 1, expressions.size());
				secrecy = (((StringLiteral) expressions.get(0)).getEscapedValue());
			} else {
				assertTrue(
						(value.getValue() == null) || ((ArrayInitializer) value.getValue()).getExpressions().isEmpty());
			}
		}
		assertEquals("The secrecy level doesn't contain the expected signature", '\"' + SIGNATURE + '\"', secrecy);

		final var critical = javaProject.findType(T_QUALIFIED_NAME).getAnnotation("Critical");
		assertNotNull(critical);
	}

	private void assertCorrectTrafo(final MGravityModel model) {
		final var typeA = MoDiscoUtil.getType(model, A_QUALIFIED_NAME);
		assertNotNull(typeA);
		final var typeB = MoDiscoUtil.getType(model, B_QUALIFIED_NAME);
		assertNotNull(typeB);
		final var typeC = MoDiscoUtil.getType(model, C_QUALIFIED_NAME);
		assertNotNull(typeC);
		final var typeTest = MoDiscoUtil.getType(model, T_QUALIFIED_NAME);
		assertNotNull(typeTest);
	}

	/**
	 * @param transformation
	 * @param monitor
	 * @throws TransformationFailedException
	 * @throws IOException
	 */
	private void performChange(final Model model, final IProgressMonitor monitor)
			throws TransformationFailedException, IOException {
		final var submodel = (Model) model.getPackagedElement(PROJECT_NAME);
		final var pack = (Package) submodel.getPackagedElement(PACKAGE_NAME);
		final var type = (Type) ((Package) submodel.getPackagedElement("Common Java datatypes")).getOwnedMember("void");

		// Add method to class
		((Class) pack.getOwnedMember(A_NAME))
		.createOwnedOperation(CREATE_METHOD_NAME, new BasicEList<>(), new BasicEList<>())
		.createOwnedParameter(null, type).setDirection(ParameterDirectionKind.RETURN_LITERAL);

		// Add security annotation to class
		final var c = UmlsecFactory.eINSTANCE.createcritical();
		c.getSecrecy().add(SIGNATURE);
		c.setBase_Class((Class) pack.getOwnedMember(T_NAME));
		pack.eResource().getContents().add(c);

		// Delete class
		EcoreUtil.delete((pack.getOwnedMember(B_NAME)));
	}
}
