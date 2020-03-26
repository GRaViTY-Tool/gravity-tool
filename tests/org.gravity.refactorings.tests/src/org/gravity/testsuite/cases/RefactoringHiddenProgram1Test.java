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
		TypeGraph pm = getProgramModel();

		TClass child1 = pm.getClass("hidden.program.one.ChildClass1");
		TClass child2 = pm.getClass("hidden.program.one.ChildClass2");
		TClass oldParent = pm.getClass("hidden.program.one.ParentClass");

		CreateSuperClassConfiguration pum = new CreateSuperClassConfiguration("hidden.program.one", "NewParent",
				Arrays.asList(child1, child2));
		RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			boolean applicible = tool.applyRefactoring(pum);
			assertTrue(applicible);

			// Check if the parent implements the signature and the child not
			TClass parent = pm.getClass("hidden.program.one.NewParent");
			assertNotNull(parent);
			assertTrue(oldParent.equals(parent.getParentClass()));
			assertTrue(parent.equals(child1.getParentClass()));
			assertTrue(parent.equals(child2.getParentClass()));
			assertFalse(oldParent.getChildClasses().contains(child1));
			assertFalse(oldParent.getChildClasses().contains(child2));
		} catch (RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
	
	/**
	 * description "Check which elements already exist."
	 */
	@Test
	public void testCSC12() {
		TypeGraph pm = getProgramModel();

		TClass child1 = pm.getClass("hidden.program.one.ChildClass1");
		TClass child2 = pm.getClass("hidden.program.one.ChildClass2");
		
		CreateSuperClassConfiguration pum = new CreateSuperClassConfiguration("hidden.program.one", "ExistingClass",
				Arrays.asList(child1, child2));
		RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);

			TClass existing = pm.getClass("hidden.program.one.ExistingClass");
			// Check if the parent implements the signature and the child not
			assertFalse(existing.equals(child1.getParentClass()));
			assertFalse(existing.equals(child2.getParentClass()));
		} catch (RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
	
	/**
	 * description "Have you considered all access relations?."
	 */
	@Test
	public void testPUM11() {
		TypeGraph pm = getProgramModel();

		TClass parent = pm.getClass("hidden.program.one.ParentClass");
		TMethodSignature signature = pm.getMethodSignature("method():void");
		
		PullUpMethodConfiguration pum = new PullUpMethodConfiguration(signature, parent);
		RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);

			// Check if the parent implements the signature and the child not
			assertNull(signature.getTDefinition(parent));
			
			TClass child1 = pm.getClass("hidden.program.one.ChildClass1");
			TClass child2 = pm.getClass("hidden.program.one.ChildClass2");
			assertNotNull(signature.getTDefinition(child1));
			assertNotNull(signature.getTDefinition(child2));
		} catch (RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
	
	/**
	 * description "Is every element really existent?"
	 */
	@Test
	public void testPUM12() {
		TypeGraph pm = getProgramModel();

		TClass parent = pm.getClass("hidden.program.one.ParentClass");
		TMethod name = BasicFactory.eINSTANCE.createTMethod(); 
		name.setTName("iDontExist");
		TMethodSignature signature = BasicFactory.eINSTANCE.createTMethodSignature();
		signature.setMethod(name);
		signature.getDefinitions().add(BasicFactory.eINSTANCE.createTMethodDefinition());
		
		PullUpMethodConfiguration pum = new PullUpMethodConfiguration(signature, parent);
		RefactoringTool tool = new RefactoringTool(pm, false);
		try {
			boolean applicible = tool.applyRefactoring(pum);
			assertFalse(applicible);
		} catch (RefactoringFailedException e) {
			throw new AssertionError(e.getMessage(), e);
		}
	}
}
