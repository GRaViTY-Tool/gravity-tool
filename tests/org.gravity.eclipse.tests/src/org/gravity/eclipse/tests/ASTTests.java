/**
 *
 */
package org.gravity.eclipse.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.gravity.eclipse.GravityAPI;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Sven Peldszus
 *
 */
@RunWith(Parameterized.class)
public class ASTTests {

	private static final String DUMMY_CLAZZ = "dummy.Clazz";

	private static final Logger LOGGER = Logger.getLogger(ASTTests.class);

	private final IJavaProject project;
	private final TypeGraph pm;

	public ASTTests(final String name, final IJavaProject project, final TypeGraph pm) {
		LOGGER.info("Run AST test for : " + name);
		this.project = project;
		this.pm = pm;
	}

	@Parameters(name = "{0}")
	public static List<Object[]> parameters() throws CoreException {
		final var monitor = new NullProgressMonitor();
		return EclipseProjectUtil.importProjects(new File("data/java"), monitor).parallelStream().map(JavaCore::create)
				.map(p -> {
					try {
						return new Object[] { p.getProject().getName(), p, GravityAPI.createProgramModel(p, monitor) };
					} catch (final TransformationFailedException e) {
						throw new IllegalStateException(e);
					}
				}).collect(Collectors.toList());
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getTypesForProject(org.eclipse.jdt.core.IJavaProject)}.
	 *
	 * @throws JavaModelException If the testcase failed with an exception
	 */
	@Test
	public void testGetTypesForProject() throws JavaModelException {
		final var map = JavaASTUtil.getTypesForProject(this.project);
		assertEquals(2, map.size());
		assertNotNull(map.get(DUMMY_CLAZZ));
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getIMethod(org.gravity.typegraph.basic.TMethodSignature, org.eclipse.jdt.core.IType)}.
	 *
	 * @throws JavaModelException
	 */
	@Test
	public void testGetIMethod() throws JavaModelException {
		final var pmClazz = this.pm.getType(DUMMY_CLAZZ);
		final var iType = JavaASTUtil.getIType(pmClazz, this.project);

		final var pmMain = this.pm.getMethodSignature("main(String[]):void");
		final var iMain = JavaASTUtil.getIMethod(pmMain, iType);
		assertNotNull(iMain);
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getTMethodDefinition(org.eclipse.jdt.core.IMethod, org.gravity.typegraph.basic.TypeGraph)}.
	 *
	 * @throws JavaModelException
	 */
	@Test
	public void testGetTMethodDefinitionIMethodTypeGraph() throws JavaModelException {
		final var iType = this.project.findType(DUMMY_CLAZZ);
		final var iMethod = iType.getMethod("getField", new String[0]);

		final var pmMethod = JavaASTUtil.getTMethodDefinition(iMethod, this.pm);
		assertNotNull(pmMethod);
		assertEquals("getField():Clazz", pmMethod.getSignatureString());
		assertEquals(DUMMY_CLAZZ, pmMethod.getDefinedBy().getFullyQualifiedName());
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getIType(org.gravity.typegraph.basic.TAbstractType, org.eclipse.jdt.core.IJavaProject)}.
	 *
	 * @throws JavaModelException
	 */
	@Test
	public void testGetIType() throws JavaModelException {
		final var pmType = this.pm.getType(DUMMY_CLAZZ);
		final var iType = JavaASTUtil.getIType(pmType, this.project);
		assertNotNull(iType);
		assertEquals("Clazz", iType.getElementName());
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getType(org.eclipse.jdt.core.dom.AbstractTypeDeclaration, org.gravity.typegraph.basic.TypeGraph)}.
	 *
	 * @throws JavaModelException
	 */
	@Test
	public void testGetTypeAbstractTypeDeclarationTypeGraph() throws JavaModelException {
		for (final Entry<String, IType> entry : JavaASTUtil.getTypesForProject(this.project).entrySet()) {
			final var iType = entry.getValue();

			final var outerNode = createAST(iType);
			outerNode.accept(new ASTVisitor() {
				@Override
				public boolean visit(final TypeDeclaration node) {
					if (entry.getKey().endsWith(node.getName().getFullyQualifiedName())) {
						final var pmType = JavaASTUtil.getType(node, ASTTests.this.pm);
						assertNotNull(pmType);
						assertEquals(entry.getKey(), pmType.getFullyQualifiedName());
					}
					return true;
				}
			});

		}
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getType(org.eclipse.jdt.core.dom.Type, org.gravity.typegraph.basic.TypeGraph)}.
	 *
	 * @throws JavaModelException
	 */
	@Test
	public void testGetTypeTypeTypeGraph() throws JavaModelException {
		final var iType = this.project.findType(DUMMY_CLAZZ);

		createAST(iType).accept(new ASTVisitor() {
			@Override
			public boolean visit(final FieldDeclaration node) {
				final var pmType = JavaASTUtil.getType(node.getType(), ASTTests.this.pm);
				assertNotNull(pmType);
				assertEquals(DUMMY_CLAZZ, pmType.getFullyQualifiedName());
				return false;
			}
		});
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getTFieldDefinition(org.eclipse.jdt.core.dom.FieldDeclaration, org.gravity.typegraph.basic.TypeGraph)}.
	 *
	 * @throws JavaModelException
	 */
	@Test
	public void testGetTFieldDefinition() throws JavaModelException {
		final var iType = this.project.findType(DUMMY_CLAZZ);

		createAST(iType).accept(new ASTVisitor() {
			@Override
			public boolean visit(final FieldDeclaration node) {
				final var pmField = JavaASTUtil.getTFieldDefinition(node, ASTTests.this.pm);
				assertNotNull(pmField);
				assertEquals(DUMMY_CLAZZ, pmField.getDefinedBy().getFullyQualifiedName());
				return false;
			}
		});
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getTFieldSignature(org.eclipse.jdt.core.dom.FieldDeclaration, org.gravity.typegraph.basic.TypeGraph)}.
	 *
	 * @throws JavaModelException
	 */
	@Test
	public void testGetTFieldSignature() throws JavaModelException {
		final var iType = this.project.findType(DUMMY_CLAZZ);

		createAST(iType).accept(new ASTVisitor() {
			@Override
			public boolean visit(final FieldDeclaration node) {
				final var pmField = JavaASTUtil.getTFieldSignature(node, ASTTests.this.pm);
				assertNotNull(pmField);
				return false;
			}
		});
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getTMethodDefinition(org.eclipse.jdt.core.dom.MethodDeclaration, org.gravity.typegraph.basic.TypeGraph)}.
	 *
	 * @throws JavaModelException
	 */
	@Test
	public void testGetTMethodDefinitionMethodDeclarationTypeGraph() throws JavaModelException {
		final var iType = this.project.findType(DUMMY_CLAZZ);

		createAST(iType).accept(new ASTVisitor() {
			@Override
			public boolean visit(final MethodDeclaration node) {
				final var pmMethod = JavaASTUtil.getTMethodDefinition(node, ASTTests.this.pm);
				assertNotNull(pmMethod);
				assertEquals(DUMMY_CLAZZ, pmMethod.getDefinedBy().getFullyQualifiedName());
				assertEquals(node.getName().getFullyQualifiedName(), pmMethod.getSignature().getMethod().getTName());
				return false;
			}
		});
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getTMethodSignature(org.eclipse.jdt.core.dom.MethodDeclaration, org.gravity.typegraph.basic.TypeGraph)}.
	 *
	 * @throws JavaModelException
	 */
	@Test
	public void testGetTMethodSignature() throws JavaModelException {
		final var iType = this.project.findType(DUMMY_CLAZZ);

		createAST(iType).accept(new ASTVisitor() {
			@Override
			public boolean visit(final MethodDeclaration node) {
				final var pmMethod = JavaASTUtil.getTMethodSignature(node, ASTTests.this.pm);
				assertNotNull(pmMethod);
				assertEquals(node.getName().getFullyQualifiedName(), pmMethod.getMethod().getTName());
				return false;
			}
		});
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getLine(org.eclipse.jdt.core.IJavaElement)}.
	 *
	 * @throws CoreException
	 */
	@Test
	public void testGetLine() throws CoreException {
		final var iType = this.project.findType(DUMMY_CLAZZ);

		assertEquals(3, JavaASTUtil.getLine(iType));
		assertEquals(11, JavaASTUtil.getLine(iType.getMethod("main", new String[] { "[QString;" })));
		assertEquals(15, JavaASTUtil.getLine(iType.getMethod("getField", new String[0])));
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getIField(org.gravity.typegraph.basic.TFieldSignature, org.eclipse.jdt.core.IType)}.
	 *
	 * @throws JavaModelException
	 */
	@Test
	public void testGetIField() throws JavaModelException {
		final var pmClazz = this.pm.getType(DUMMY_CLAZZ);
		final var iType = this.project.findType(DUMMY_CLAZZ);

		final var pmField = pmClazz.getTFieldSignature("field:Clazz");
		final var iField = JavaASTUtil.getIField(pmField, iType);
		assertNotNull(iField);
		assertEquals("field", iField.getElementName());
	}

	/**
	 * Test method for
	 * {@link org.gravity.eclipse.util.JavaASTUtil#getIField(org.gravity.typegraph.basic.TFieldSignature, org.eclipse.jdt.core.IType)}.
	 *
	 * @throws JavaModelException
	 */
	@Test
	public void testGetInnerIType() throws JavaModelException {
		final var name = "Inner";
		final var pmClazz = this.pm.getType(DUMMY_CLAZZ + '$'+name);

		final var iType = JavaASTUtil.getIType(pmClazz, this.project);
		assertNotNull(iType);
		assertEquals(name, iType.getElementName());

		final var outerNode = createAST(iType);
		outerNode.accept(new ASTVisitor() {
			@Override
			public boolean visit(final TypeDeclaration node) {
				if (name.equals(node.getName().toString())) {
					final var pmType = JavaASTUtil.getType(node, ASTTests.this.pm);
					assertNotNull(pmType);
					assertEquals("Clazz$"+name, pmType.getTName());
					assertEquals(iType.getFullyQualifiedName(), pmType.getFullyQualifiedName());
				}
				return true;
			}
		});
	}

	/**
	 * Creates an AST for the given IType
	 *
	 * @param iType
	 * @return the AST
	 */
	private ASTNode createAST(final IType iType) {
		final var parser = ASTParser.newParser(AST.JLS20);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		final var typeRoot = iType.getTypeRoot();
		if (typeRoot.getElementType() == IJavaElement.CLASS_FILE) {
			final var icf = typeRoot.getAdapter(IClassFile.class);
			parser.setSource(icf);
		} else {
			final var icu = typeRoot.getAdapter(ICompilationUnit.class);
			parser.setSource(icu);
		}
		return parser.createAST(null);
	}

}
