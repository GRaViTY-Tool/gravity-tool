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
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.BeforeClass;
import org.junit.Test;

public class RefactoringPaperExample01Test extends AbstractRefactoringTestCase {

	@BeforeClass
	public static void initialize() throws CoreException, TransformationFailedException {
		initialize("__TestProject_paper-example01");
	}

	/**
	 * description "PUM-POS: (paper1) Pull-up of two classes into a parent class."
	 * program "paper-example01"
	 * 
	 */
	@Test
	public void test11() {
		TypeGraph pm = getProgramModel();

		TClass parent = pm.getClass("example01.ParentClass");
		TClass child1 = pm.getClass("example01.ChildClass1");
		TClass child2 = pm.getClass("example01.ChildClass2");
		TMethodSignature signature = pm.getMethodSignature("method(java.lang.String,int):void");
		TMethodDefinition definition1 = signature.getTDefinition(child1);
		TMethodDefinition definition2 = signature.getTDefinition(child2);

		PullUpMethodConfiguration pum = new PullUpMethodConfiguration(signature, parent);
		RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			boolean applicible = tool.applyRefactoring(pum);
			assertTrue(applicible);

			// Check if the parent implements the signature and the child not
			assertTrue(parent.getSignature().contains(signature));
			assertFalse(child1.getSignature().contains(signature));
			assertFalse(child2.getSignature().contains(signature));

			// Check if the parent implements one of the definitions
			assertTrue(parent.getDeclaredTMethodDefinitions().contains(definition1)
					|| parent.getDeclaredTMethodDefinitions().contains(definition2));
			assertFalse(child1.getDeclaredTMethodDefinitions().contains(definition1)
					|| child1.getDeclaredTMethodDefinitions().contains(definition2));
			assertFalse(child2.getDeclaredTMethodDefinitions().contains(definition1)
					|| child2.getDeclaredTMethodDefinitions().contains(definition2));
			assertTrue(definition1.eContainer() == null || definition2.eContainer() == null);

		} catch (RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}

	/**
	 * description "PUM-NEG: Pull-up from child of a not existing parent class."
	 * program "paper-example01"
	 *
	 */
	@Test
	public void test12() {
		TypeGraph pm = getProgramModel();

		TClass parent = BasicFactory.eINSTANCE.createTClass();
		parent.setTLib(false);
		parent.setTName("Foo");
		TClass child1 = pm.getClass("example01.ChildClass1");
		TClass child2 = pm.getClass("example01.ChildClass2");
		TMethodSignature signature = pm.getMethodSignature("method(java.lang.String,int):void");
		TMethodDefinition definition1 = signature.getTDefinition(child1);
		TMethodDefinition definition2 = signature.getTDefinition(child2);

		PullUpMethodConfiguration pum = new PullUpMethodConfiguration(signature, parent);
		RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);

			// Check if the parent implements the signature and the child not
			assertFalse(parent.getSignature().contains(signature));
			assertTrue(child1.getSignature().contains(signature));
			assertTrue(child2.getSignature().contains(signature));

			// Check if the parent implements one of the definitions
			assertFalse(parent.getDeclaredTMethodDefinitions().contains(definition1)
					|| parent.getDeclaredTMethodDefinitions().contains(definition2));
			assertNull(signature.getTDefinition(parent));
			assertTrue(child1.getDeclaredTMethodDefinitions().contains(definition1));
			assertTrue(child2.getDeclaredTMethodDefinitions().contains(definition2));
		} catch (RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}

}
