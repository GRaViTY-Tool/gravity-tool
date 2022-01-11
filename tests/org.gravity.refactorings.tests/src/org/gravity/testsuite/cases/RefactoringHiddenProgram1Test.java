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
import org.junit.runners.model.InitializationError;

public class RefactoringHiddenProgram1Test extends AbstractRefactoringTestCase {

	@BeforeClass
	public static void initialize() throws CoreException, TransformationFailedException {
		initialize("__TestProject_hiddenProgram1");
	}

	/**
	 * description "Have a look on inheritance relations."
	 * @throws InitializationError
	 */
	@Test
	public void testCSC11_Success_ExistingParent() throws InitializationError {
		final TypeGraph pm = getProgramModel();

		final TClass child1 = pm.getClass("hidden.program.one.ChildClass1");
		final TClass child2 = pm.getClass("hidden.program.one.ChildClass2");
		final TClass oldParent = pm.getClass("hidden.program.one.ParentClass");

		if((child1 == null) || (child2 == null) || (oldParent == null)) {
			throw new InitializationError("Didn't find all classes:\n child1="+child1
					+ "\nchild2="+child2
					+ "\noldPArent="+oldParent);
		}

		final CreateSuperClassConfiguration create = new CreateSuperClassConfiguration("hidden.program.one", "NewParent",
				Arrays.asList(child1, child2));
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(create);
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
	 * @throws InitializationError
	 */
	@Test
	public void testCSC12_Forbid_ParentAlreadyExists() throws InitializationError {
		final TypeGraph pm = getProgramModel();

		final TClass child1 = pm.getClass("hidden.program.one.ChildClass1");
		final TClass child2 = pm.getClass("hidden.program.one.ChildClass2");
		final TClass existing = pm.getClass("hidden.program.one.ExistingClass");

		if((child1 == null) || (child2 == null) || (existing == null)) {
			throw new InitializationError("Didn't find all child classes:\nchild1="+child1+"\nchild2="+child2);
		}

		final CreateSuperClassConfiguration pum = new CreateSuperClassConfiguration("hidden.program.one", "ExistingClass",
				Arrays.asList(child1, child2));
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);

			// Check if the parent implements the signature and the child not
			assertFalse(child1.getParentClasses().contains(existing));
			assertFalse(child2.getParentClasses().contains(existing));
		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}

	/**
	 * description "Have you considered all access relations?."
	 * @throws InitializationError
	 */
	@Test
	public void testPUM11_Forbid_PreventingAccess() throws InitializationError {
		final TypeGraph pm = getProgramModel();

		final TClass parent = pm.getClass("hidden.program.one.ParentClass");
		final TMethodSignature signature = pm.getMethodSignature("method():void");

		if((parent == null) || (signature == null)) {
			throw new InitializationError("Didn't find all child classes:\nparent="+parent+"\nsignature="+signature);
		}

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
	 * @throws InitializationError
	 */
	@Test
	public void testPUM12_Forbid_MethodNotExistent() throws InitializationError {
		final TypeGraph pm = getProgramModel();

		final TClass parent = pm.getClass("hidden.program.one.ParentClass");

		if(parent == null) {
			throw new InitializationError("Parent class not found in program model!");
		}

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
