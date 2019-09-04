package org.gravity.testsuite.cases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
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
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.BeforeClass;
import org.junit.Test;

public class RefactoringFinalProgram3Test extends AbstractRefactoringTestCase {

	@BeforeClass
	public static void initialize() throws CoreException, TransformationFailedException {
		initialize("__TestProject_FinalProgram3");
	}

	/**
	 * description "Pull up to lib"
	 */
	@Test
	public void test31() {
		TypeGraph pm = getProgramModel();

		TClass child1 = pm.getClass("hidden.program.three.ChildClass1");
		TClass child2 = pm.getClass("hidden.program.three.ChildClass2");
		TClass parent = pm.getClass("java.lang.SecurityManager");
		
		TMethodSignature m = pm.getMethod("method").getSignature(null, new BasicEList<>());
		
		PullUpMethodConfiguration pum = new PullUpMethodConfiguration(m, parent);
		RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);

			assertFalse(parent.getSignature().contains(m));
			assertNull(m.getTDefinition(parent));
			
			assertTrue(child1.getSignature().contains(m));
			assertNotNull(m.getTDefinition(child1));
			
			assertTrue(child2.getSignature().contains(m));
			assertNotNull(m.getTDefinition(child2));
		} catch (RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
}
