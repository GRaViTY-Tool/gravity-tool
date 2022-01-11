package org.gravity.testsuite.cases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.eclipse.core.runtime.CoreException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.application.RefactoringTool;
import org.gravity.refactorings.configuration.impl.CreateSuperClassConfiguration;
import org.gravity.refactorings.configuration.impl.PullUpMethodConfiguration;
import org.gravity.testsuite.AbstractRefactoringTestCase;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.model.InitializationError;

public class RefactoringHiddenProgram3Test extends AbstractRefactoringTestCase {

	@BeforeClass
	public static void initialize() throws CoreException, TransformationFailedException {
		initialize("__TestProject_hiddenProgram3");
	}

	/**
	 * description "Is the PG after a refactoring still consistent?."
	 * @throws InitializationError
	 */
	@Test
	public void testCSC31a_Success_UntouchedElements() throws InitializationError {
		final TypeGraph pm = getProgramModel();

		final TClass child1 = pm.getClass("hidden.program.three.ChildClass1");
		final TClass child2 = pm.getClass("hidden.program.three.ChildClass2");

		if((child1 == null) || (child2== null)) {
			throw new InitializationError("Couldn't find all elements in program model.");
		}

		final CreateSuperClassConfiguration pum = new CreateSuperClassConfiguration("hidden.program.three", "NewParent",
				Arrays.asList(child1, child2));
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			boolean applicible = tool.applyRefactoring(pum);
			assertTrue(applicible);

			final TClass parent = pm.getClass("hidden.program.one.NewParent");
			assertNotNull(parent);
			assertEquals(parent, child1.getParentClasses().get(0));
			assertEquals(parent, child2.getParentClasses().get(0));

			final TMethodSignature m = pm.getMethodSignature("method():void");

			assertTrue(child1.getSignature().contains(m));
			assertNotNull(m.getTDefinition(child1));
			assertTrue(child2.getSignature().contains(m));
			assertNotNull(m.getTDefinition(child2));
			assertFalse(parent.getSignature().contains(m));
			assertNull(m.getTDefinition(parent));

			applicible = tool.applyRefactoring(new PullUpMethodConfiguration(m, parent));
			assertTrue(applicible);

			assertEquals(parent, child1.getParentClasses().get(0));
			assertEquals(parent, child2.getParentClasses().get(0));


			assertFalse(child1.getSignature().contains(m));
			assertNull(m.getTDefinition(child1));
			assertFalse(child2.getSignature().contains(m));
			assertNull(m.getTDefinition(child2));
			assertTrue(parent.getSignature().contains(m));
			assertNotNull(m.getTDefinition(parent));

		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
}
