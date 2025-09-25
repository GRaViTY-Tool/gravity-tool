package org.gravity.testsuite.cases;

import static org.junit.Assert.assertFalse;
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

public class RefactoringPaperExample02Test extends AbstractRefactoringTestCase {

	@BeforeClass
	public static void initialize() throws CoreException, TransformationFailedException {
		initialize("__TestProject_paper-example02");
	}

	/**
	 * description "PUM-NEG: (paper2) Pull-up of two classes into a parent class, which already has a method with the signature."
	 * program "paper-example02"
	 * @throws InitializationError
	 */
	@Test
	public void test21_Forbid_ParentImplementsSignature() throws InitializationError {
		final TypeGraph pm = getProgramModel();

		final TClass parent = pm.getClass("example01.ParentClass");
		final TClass child1 = pm.getClass("example01.ChildClass1");
		final TClass child2 = pm.getClass("example01.ChildClass2");
		final TMethodSignature signature = pm.getMethodSignature("method():void");

		if((child1 == null) || (child2== null) || (signature == null)) {
			throw new InitializationError("Couldn't find all elements in program model.");
		}

		final TMethodDefinition definition0 = signature.getTDefinition(parent);
		final TMethodDefinition definition1 = signature.getTDefinition(child1);
		final TMethodDefinition definition2 = signature.getTDefinition(child2);

		if((definition0 == null) || (definition1== null) || (definition2 == null)) {
			throw new InitializationError("Couldn't find all elements in program model.");
		}

		final PullUpMethodConfiguration pum = new PullUpMethodConfiguration(signature, parent);
		final RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			final boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);

			// Check if the parent implements the signature and the child not
			assertTrue(parent.getSignature().contains(signature));
			assertTrue(child1.getSignature().contains(signature));
			assertTrue(child2.getSignature().contains(signature));

			// Check if the parent implements one of the definitions
			assertTrue(parent.getDeclaredTMethodDefinitions().contains(definition0));
			assertTrue(child1.getDeclaredTMethodDefinitions().contains(definition1));
			assertTrue(child2.getDeclaredTMethodDefinitions().contains(definition2));
		} catch (final RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
}
