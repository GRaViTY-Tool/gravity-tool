package org.gravity.testsuite.cases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicEList;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.application.RefactoringTool;
import org.gravity.refactorings.configuration.impl.PullUpMethodConfiguration;
import org.gravity.testsuite.AbstractRefactoringTestCase;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.BeforeClass;
import org.junit.Test;

public class RefactoringPaperExample03Test extends AbstractRefactoringTestCase {

	@BeforeClass
	public static void initialize() throws CoreException, TransformationFailedException {
		initialize("__TestProject_paper-example03");
	}

	/**
	 * description "PUM-NEG: (paper3) Pull-up of a method from two child classes
	 * into a parent class, a third sibling does not have the method." program
	 * "paper-example02"
	 */
	@Test
	public void test31() {
		TypeGraph pm = getProgramModel();

		TClass parent = pm.getClass("example03.ParentClass");
		TClass child1 = pm.getClass("example03.ChildClass1");
		TClass child2 = pm.getClass("example03.ChildClass2");
		TClass child3 = pm.getClass("example03.ChildClass3");
		TMethod methodName = pm.getMethod("method");
		TMethodSignature signature = methodName.getSignature(null, new BasicEList<>());
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
			assertFalse(child3.getSignature().contains(signature));

			// Check if the parent implements one of the definitions
			assertFalse(parent.getDeclaredTMethodDefinitions().contains(definition1)
					|| parent.getDeclaredTMethodDefinitions().contains(definition1));
			assertNull(signature.getTDefinition(parent));
			assertTrue(child1.getDeclaredTMethodDefinitions().contains(definition1));
			assertTrue(child2.getDeclaredTMethodDefinitions().contains(definition2));
			assertFalse(child3.getDeclaredTMethodDefinitions().contains(definition1)
					|| child3.getDeclaredTMethodDefinitions().contains(definition1));
			assertNull(signature.getTDefinition(child3));
		} catch (RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
}
