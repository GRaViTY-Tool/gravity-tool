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

public class RefactoringHiddenProgram2Test extends AbstractRefactoringTestCase {

	@BeforeClass
	public static void initialize() throws CoreException, TransformationFailedException {
		initialize("__TestProject_hiddenProgram2");
	}

	/**
	 * description "Have a look on inheritance relations."
	 * @throws InitializationError
	 */
	@Test
	public void testCSC21_Forbid_OnClassObjectParent() throws InitializationError {
		final TypeGraph pm = getProgramModel();

		final TClass child1 = pm.getClass("hidden.program.two.ChildClass1");
		final TClass child2 = pm.getClass("hidden.program.two.ChildClass2");

		if((child1 == null) || (child2== null)) {
			throw new InitializationError("Couldn't find all elements in program model.");
		}

		final String child1Parent = getNameOfParentClass(child1);
		final String child2Parent = getNameOfParentClass(child2);

		final CreateSuperClassConfiguration create = new CreateSuperClassConfiguration("hidden.program.two", "NewParent",
				Arrays.asList(child1, child2));
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(create);
			assertFalse(applicible);

			final TClass parent = pm.getClass("hidden.program.one.NewParent");
			assertNull(parent);

			assertEquals(child1Parent, getNameOfParentClass(child1));
			assertEquals(child2Parent, getNameOfParentClass(child2));
		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}

	private String getNameOfParentClass(final TClass child) {
		return child.getParentClasses().isEmpty() ? "java.lang.Object" : child.getParentClasses().get(0).getFullyQualifiedName();
	}

	/**
	 * description "Have you considered all access relations?."
	 * @throws InitializationError
	 */
	@Test
	public void testPUM21_Success_RedirectAccesses() throws InitializationError {
		final TypeGraph pm = getProgramModel();

		final TClass parent = pm.getClass("hidden.program.two.ParentClass");
		final TMethodSignature signature  = pm.getMethodSignature("method():void");

		if((parent == null) || (signature== null)) {
			throw new InitializationError("Couldn't find all elements in program model.");
		}

		final PullUpMethodConfiguration pum = new PullUpMethodConfiguration(signature, parent);
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(pum);
			assertTrue(applicible);

			final TMethodSignature second = pm.getMethodSignature("second():void");
			final TMethodSignature third = pm.getMethodSignature("third():java.lang.String");

			// Check child 1
			final TClass child1 = pm.getClass("hidden.program.one.ChildClass1");
			assertFalse(child1.getSignature().contains(signature));
			assertNull(signature.getTDefinition(child1));
			assertTrue(child1.getSignature().contains(second));
			assertNotNull(second.getTDefinition(child1));
			assertFalse(child1.getSignature().contains(third));
			assertNull(third.getTDefinition(child1));

			// Check child 2
			final TClass child2 = pm.getClass("hidden.program.one.ChildClass2");
			assertFalse(child2.getSignature().contains(signature));
			assertNull(signature.getTDefinition(child2));
			assertTrue(child2.getSignature().contains(second));
			assertNotNull(second.getTDefinition(child2));
			assertFalse(child2.getSignature().contains(third));
			assertNull(third.getTDefinition(child2));

			// Check child3
			final TClass child3 = pm.getClass("hidden.program.one.ChildClass3");
			assertFalse(child3.getSignature().contains(signature));
			assertNull(signature.getTDefinition(child3));
			assertFalse(child3.getSignature().contains(second));
			assertNull(second.getTDefinition(child3));
			assertTrue(child3.getSignature().contains(third));
			assertNotNull(third.getTDefinition(child3));

			// Check parent
			assertTrue(parent.getSignature().contains(signature));
			assertNotNull(signature.getTDefinition(parent));
			assertFalse(parent.getSignature().contains(second));
			assertNull(second.getTDefinition(parent));
			assertFalse(parent.getSignature().contains(third));
			assertNull(third.getTDefinition(parent));
		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}

	/**
	 * description "Is every element really existent?"
	 * @throws InitializationError
	 */
	@Test
	public void testPUM22_Forbid_MethodNotInAllChildClasses() throws InitializationError {
		final TypeGraph pm = getProgramModel();

		final TClass parent = pm.getClass("hidden.program.two.ParentClass");
		final TMethodSignature second = pm.getMethodSignature("second():void");

		if((parent == null) || (second== null)) {
			throw new InitializationError("Couldn't find all elements in program model.");
		}

		final PullUpMethodConfiguration pum = new PullUpMethodConfiguration(second, parent);
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);

			final TMethodSignature m = pm.getMethodSignature("method():void");
			final TMethodSignature third = pm.getMethodSignature("third():java.lang.String");

			// Check child 1
			final TClass child1 = pm.getClass("hidden.program.one.ChildClass1");
			assertTrue(child1.getSignature().contains(m));
			assertNotNull(m.getTDefinition(child1));
			assertTrue(child1.getSignature().contains(second));
			assertNotNull(second.getTDefinition(child1));
			assertFalse(child1.getSignature().contains(third));
			assertNull(third.getTDefinition(child1));

			// Check child 2
			final TClass child2 = pm.getClass("hidden.program.one.ChildClass2");
			assertFalse(child2.getSignature().contains(m));
			assertNull(m.getTDefinition(child2));
			assertTrue(child2.getSignature().contains(second));
			assertNotNull(second.getTDefinition(child2));
			assertFalse(child2.getSignature().contains(third));
			assertNull(third.getTDefinition(child2));

			// Check child3
			final TClass child3 = pm.getClass("hidden.program.one.ChildClass3");
			assertTrue(child3.getSignature().contains(m));
			assertNotNull(m.getTDefinition(child3));
			assertFalse(child3.getSignature().contains(second));
			assertNull(second.getTDefinition(child3));
			assertTrue(child3.getSignature().contains(third));
			assertNotNull(third.getTDefinition(child3));

			// Check parent
			assertFalse(parent.getSignature().contains(m));
			assertNull(m.getTDefinition(parent));
			assertFalse(parent.getSignature().contains(second));
			assertNull(second.getTDefinition(parent));
			assertFalse(parent.getSignature().contains(third));
			assertNull(third.getTDefinition(parent));
		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
}
