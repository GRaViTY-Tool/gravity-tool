package org.gravity.testsuite.cases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.runtime.CoreException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.application.RefactoringTool;
import org.gravity.refactorings.configuration.impl.PullUpMethodConfiguration;
import org.gravity.testsuite.AbstractRefactoringTestCase;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.model.InitializationError;

public class RefactoringPaperExample03Test extends AbstractRefactoringTestCase {

	@BeforeClass
	public static void initialize() throws CoreException, TransformationFailedException {
		initialize("__TestProject_paper-example03");
	}

	/**
	 * description "PUM-NEG: (paper3) Pull-up of a method from two child classes
	 * into a parent class, a third sibling does not have the method." program
	 * "paper-example02"
	 * @throws InitializationError
	 */
	@Test
	public void test31_Forbid_NotAllChildHaveMethod() throws InitializationError {
		final TypeGraph pm = getProgramModel();

		final TClass parent = pm.getClass("example03.ParentClass");
		final TClass child1 = pm.getClass("example03.ChildClass1");
		final TClass child2 = pm.getClass("example03.ChildClass2");
		final TClass child3 = pm.getClass("example03.ChildClass3");
		final TMethodSignature signature = pm.getMethodSignature("method():void");


		if((child1 == null) || (child2 == null) || (child3 == null) || (parent == null) || (signature == null)) {
			throw new InitializationError("Couldn't find all elements in the program model!");
		}

		final TMethodDefinition definition1 = signature.getTDefinition(child1);
		final TMethodDefinition definition2 = signature.getTDefinition(child2);

		final PullUpMethodConfiguration pum = new PullUpMethodConfiguration(signature, parent);
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);

			// Check if the parent implements the signature and the child not
			assertFalse(parent.getSignature().contains(signature));
			assertTrue(child1.getSignature().contains(signature));
			assertTrue(child2.getSignature().contains(signature));
			assertFalse(child3.getSignature().contains(signature));

			assertFalse(parent.getDeclaredTMethodDefinitions().contains(definition1)
					|| parent.getDeclaredTMethodDefinitions().contains(definition2));
			assertNull(signature.getTDefinition(parent));
			assertTrue(child1.getDeclaredTMethodDefinitions().contains(definition1));
			assertTrue(child2.getDeclaredTMethodDefinitions().contains(definition2));
			assertFalse(child3.getDeclaredTMethodDefinitions().contains(definition1)
					|| child3.getDeclaredTMethodDefinitions().contains(definition2));
			assertNull(signature.getTDefinition(child3));
		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
}
