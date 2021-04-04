package org.gravity.testsuite.cases;

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
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.BeforeClass;
import org.junit.Test;

public class RefactoringHiddenProgram1Test extends AbstractRefactoringTestCase {

	@BeforeClass
	public static void initialize() throws CoreException, TransformationFailedException {
		initialize("__TestProject_hiddenProgram1");
	}

	/**
	 * description "Have a look on inheritance relations."
	 */
	@Test
	public void testCSC11() {
		final TypeGraph pm = getProgramModel();

		final TClass child1 = pm.getClass("hidden.program.one.ChildClass1");
		final TClass child2 = pm.getClass("hidden.program.one.ChildClass2");
		final TClass oldParent = pm.getClass("hidden.program.one.ParentClass");

		final CreateSuperClassConfiguration pum = new CreateSuperClassConfiguration("hidden.program.one", "NewParent",
				Arrays.asList(child1, child2));
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(pum);
			assertTrue(applicible);

			// Check if the parent implements the signature and the child not
			final TClass parent = pm.getClass("hidden.program.one.NewParent");
			assertNotNull(parent);
			assertTrue(parent.getParentClasses().contains(oldParent) && (parent.getParentClasses().size() == 1));
			assertTrue(child1.getParentClasses().contains(parent) && (parent.getParentClasses().size() == 1));
			assertTrue(child2.getParentClasses().contains(parent) && (parent.getParentClasses().size() == 1));
			assertFalse(oldParent.getChildClasses().contains(child1));
			assertFalse(oldParent.getChildClasses().contains(child2));
		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}

	/**
	 * description "Check which elements already exist."
	 */
	@Test
	public void testCSC12() {
		final TypeGraph pm = getProgramModel();

		final TClass child1 = pm.getClass("hidden.program.one.ChildClass1");
		final TClass child2 = pm.getClass("hidden.program.one.ChildClass2");

		final CreateSuperClassConfiguration pum = new CreateSuperClassConfiguration("hidden.program.one", "ExistingClass",
				Arrays.asList(child1, child2));
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);

			final TClass existing = pm.getClass("hidden.program.one.ExistingClass");
			// Check if the parent implements the signature and the child not
			assertFalse(existing.equals(child1.getParentClasses()));
			assertFalse(existing.equals(child2.getParentClasses()));
		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}

	/**
	 * description "Have you considered all access relations?."
	 */
	@Test
	public void testPUM11() {
		final TypeGraph pm = getProgramModel();

		final TClass parent = pm.getClass("hidden.program.one.ParentClass");
		final TMethodSignature signature = pm.getMethodSignature("method():void");

		final PullUpMethodConfiguration pum = new PullUpMethodConfiguration(signature, parent);
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);

			// Check if the parent implements the signature and the child not
			assertNull(signature.getTDefinition(parent));

			final TClass child1 = pm.getClass("hidden.program.one.ChildClass1");
			final TClass child2 = pm.getClass("hidden.program.one.ChildClass2");
			assertNotNull(signature.getTDefinition(child1));
			assertNotNull(signature.getTDefinition(child2));
		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}

	/**
	 * description "Is every element really existent?"
	 */
	@Test
	public void testPUM12() {
		final TypeGraph pm = getProgramModel();

		final TClass parent = pm.getClass("hidden.program.one.ParentClass");
		final TMethod name = BasicFactory.eINSTANCE.createTMethod();
		name.setTName("iDontExist");
		final TMethodSignature signature = BasicFactory.eINSTANCE.createTMethodSignature();
		signature.setMethod(name);
		signature.getDefinitions().add(BasicFactory.eINSTANCE.createTMethodDefinition());

		final PullUpMethodConfiguration pum = new PullUpMethodConfiguration(signature, parent);
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);
		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
}
