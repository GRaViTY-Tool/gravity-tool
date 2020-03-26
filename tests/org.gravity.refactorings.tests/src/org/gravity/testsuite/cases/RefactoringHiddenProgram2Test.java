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

public class RefactoringHiddenProgram2Test extends AbstractRefactoringTestCase {

	@BeforeClass
	public static void initialize() throws CoreException, TransformationFailedException {
		initialize("__TestProject_hiddenProgram2");
	}

	/**
	 * description "Have a look on inheritance relations."
	 */
	@Test
	public void testCSC21() {
		TypeGraph pm = getProgramModel();

		TClass child1 = pm.getClass("hidden.program.two.ChildClass1");
		String child1Parent = child1.getParentClass().getFullyQualifiedName();
		TClass child2 = pm.getClass("hidden.program.two.ChildClass2");
		String child2Parent = child2.getParentClass() == null ? null : child2.getParentClass().getFullyQualifiedName();

		CreateSuperClassConfiguration pum = new CreateSuperClassConfiguration("hidden.program.two", "NewParent",
				Arrays.asList(child1, child2));
		RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);

			TClass parent = pm.getClass("hidden.program.one.NewParent");
			assertNull(parent);
			assertEquals(child1Parent, child1.getParentClass().getFullyQualifiedName());
			assertEquals(child2Parent, child2.getParentClass() == null ? null : child2.getParentClass().getFullyQualifiedName());
		} catch (RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}

	/**
	 * description "Have you considered all access relations?."
	 */
	@Test
	public void testPUM21() {
		TypeGraph pm = getProgramModel();

		TClass parent = pm.getClass("hidden.program.two.ParentClass");
		TMethodSignature m  = pm.getMethodSignature("method():void");

		PullUpMethodConfiguration pum = new PullUpMethodConfiguration(m, parent);
		RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			boolean applicible = tool.applyRefactoring(pum);
			assertTrue(applicible);

			TMethodSignature second = pm.getMethodSignature("second():void");
			TMethodSignature third = pm.getMethodSignature("third():java.lang.String");

			// Check child 1
			TClass child1 = pm.getClass("hidden.program.one.ChildClass1");
			assertFalse(child1.getSignature().contains(m));
			assertNull(m.getTDefinition(child1));
			assertTrue(child1.getSignature().contains(second));
			assertNotNull(second.getTDefinition(child1));
			assertFalse(child1.getSignature().contains(third));
			assertNull(third.getTDefinition(child1));

			// Check child 2
			TClass child2 = pm.getClass("hidden.program.one.ChildClass2");
			assertFalse(child2.getSignature().contains(m));
			assertNull(m.getTDefinition(child2));
			assertTrue(child2.getSignature().contains(second));
			assertNotNull(second.getTDefinition(child2));
			assertFalse(child2.getSignature().contains(third));
			assertNull(third.getTDefinition(child2));

			// Check child3
			TClass child3 = pm.getClass("hidden.program.one.ChildClass3");
			assertFalse(child3.getSignature().contains(m));
			assertNull(m.getTDefinition(child3));
			assertFalse(child3.getSignature().contains(second));
			assertNull(second.getTDefinition(child3));
			assertTrue(child3.getSignature().contains(third));
			assertNotNull(third.getTDefinition(child3));

			// Check parent
			assertTrue(parent.getSignature().contains(m));
			assertNotNull(m.getTDefinition(parent));
			assertFalse(parent.getSignature().contains(second));
			assertNull(second.getTDefinition(parent));
			assertFalse(parent.getSignature().contains(third));
			assertNull(third.getTDefinition(parent));
		} catch (RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}

	/**
	 * description "Is every element really existent?"
	 */
	@Test
	public void testPUM22() {
		TypeGraph pm = getProgramModel();

		TClass parent = pm.getClass("hidden.program.two.ParentClass");
		TMethodSignature second = pm.getMethodSignature("second():void");

		PullUpMethodConfiguration pum = new PullUpMethodConfiguration(second, parent);
		RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);

			TMethodSignature m = pm.getMethodSignature("method():void");
			TMethodSignature third = pm.getMethodSignature("third():java.lang.String");

			// Check child 1
			TClass child1 = pm.getClass("hidden.program.one.ChildClass1");
			assertTrue(child1.getSignature().contains(m));
			assertNotNull(m.getTDefinition(child1));
			assertTrue(child1.getSignature().contains(second));
			assertNotNull(second.getTDefinition(child1));
			assertFalse(child1.getSignature().contains(third));
			assertNull(third.getTDefinition(child1));

			// Check child 2
			TClass child2 = pm.getClass("hidden.program.one.ChildClass2");
			assertFalse(child2.getSignature().contains(m));
			assertNull(m.getTDefinition(child2));
			assertTrue(child2.getSignature().contains(second));
			assertNotNull(second.getTDefinition(child2));
			assertFalse(child2.getSignature().contains(third));
			assertNull(third.getTDefinition(child2));

			// Check child3
			TClass child3 = pm.getClass("hidden.program.one.ChildClass3");
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
		} catch (RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
}
