package org.gravity.testsuite.cases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.eclipse.core.runtime.CoreException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.application.RefactoringTool;
import org.gravity.refactorings.configuration.impl.CreateSuperClassConfiguration;
import org.gravity.testsuite.AbstractRefactoringTestCase;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.model.InitializationError;

public class RefactoringPaperExample04Test extends AbstractRefactoringTestCase {

	@BeforeClass
	public static void initialize() throws CoreException, TransformationFailedException {
		initialize("__TestProject_paper-example04");
	}

	/**
	 * description "EXS-POS: Create a superclass for two child classes not
	 * explicitly extending an other class.
	 *
	 * @throws InitializationError
	 */
	@Test
	public void testCSC41_Success_ObjectParent() throws InitializationError {
		final TypeGraph pm = getProgramModel();

		final TClass child1 = pm.getClass("example04.ChildClass1");
		final TClass child2 = pm.getClass("example04.ChildClass2");

		if ((child1 == null) || (child2 == null)) {
			throw new InitializationError("Couldn't find all elements in the program model!");
		}

		final CreateSuperClassConfiguration pum = new CreateSuperClassConfiguration("example04", "Parent",
				Arrays.asList(child1, child2));
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(pum);
			assertTrue(applicible);

			// Check if the parent implements the signature and the child not
			final TAbstractType parent = pm.getType("example04.Parent");
			assertNotNull(parent);
			assertEquals(parent, (child1.getParentClasses().get(0)));
			assertEquals(parent, (child2.getParentClasses().get(0)));
		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}

	/**
	 * description "EXS-POS: Create a superclass in a new package.
	 *
	 * @throws InitializationError
	 */
	@Test
	public void testCSC42_Success_ParentInNewPackage() throws InitializationError {
		final TypeGraph pm = getProgramModel();

		final TClass child1 = pm.getClass("example04.ChildClass1");
		final TClass child2 = pm.getClass("example04.ChildClass2");

		if ((child1 == null) || (child2 == null)) {
			throw new InitializationError("Couldn't find all elements in the program model!");
		}

		final CreateSuperClassConfiguration pum = new CreateSuperClassConfiguration("foo", "Foo",
				Arrays.asList(child1, child2));
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(pum);
			assertTrue(applicible);

			// Check if the parent implements the signature and the child not
			final TAbstractType parent = pm.getType("foo.Foo");
			assertNotNull(parent);
			assertEquals(parent, (child1.getParentClasses().get(0)));
			assertEquals(parent, (child2.getParentClasses().get(0)));
		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
}
