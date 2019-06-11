package org.gravity.tgg.modisco.uml.tests;

import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLFactory;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.tgg.uml.Transformation;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.junit.Test;

import carisma.profile.umlsec.UmlsecFactory;
import carisma.profile.umlsec.critical;

/**
 * This class contains tests for the synchronization of UMLsec annotations
 * 
 * @author speldszus
 *
 */
public class UMLsecTest {

	/**
	 * 
	 * Discovers a UML model, adds a UMLsec annotation and synchronizes it to the code
	 * 
	 * @throws TransformationFailedException If the trafo failed
	 * @throws FileNotFoundException If there is a problem with loading models
	 * @throws IOException If there is a problem with loading models
	 * @throws CoreException If there is a problem with refreshing the workspace after changes
	 */
	@Test
	public void test() throws TransformationFailedException, FileNotFoundException, IOException, CoreException {
		GravityActivator.getDefault().setDebugging(true);
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject("SecureDependency");
		IJavaProject jp = JavaCore.create(project);
		IJavaProject iJjavaProject = JavaProjectUtil.copyJavaProject(jp, "SecureDependency"+System.currentTimeMillis());

		Model model = Transformation.projectToModel(iJjavaProject, true, new NullProgressMonitor());

		assertNotNull(model);
		IFolder folder = EclipseProjectUtil.getGravityFolder(project, new NullProgressMonitor());
		model.eResource().save(new FileOutputStream(folder.getFile(project.getName()+".uml").getLocation().toFile()), Collections.EMPTY_MAP);
//		File srcFile = folder.getFile("src.xmi").getLocation().toFile();
//		Files.copy(new FileInputStream(srcFile), folder.getFile("fwd.src.xmi").getLocation().toFile().toPath());

		LinkedList<EObject> add = new LinkedList<EObject>();
		ProfileApplication profileApplication = UMLFactory.eINSTANCE.createProfileApplication();
		model.getProfileApplications().add(profileApplication);
		TreeIterator<EObject> iterator = model.eResource().getAllContents();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if (next instanceof org.eclipse.uml2.uml.Class) {
				Class clazz = (org.eclipse.uml2.uml.Class) next;
				if (clazz.getName().equals("KeyGenerator") || clazz.getName().equals("RandomGenerator")) {
					critical critical = UmlsecFactory.eINSTANCE.createcritical();
					critical.setBase_Classifier((Classifier) next);
					critical.getHigh().add("random():float");
					add.add(critical);
				}
			}
		}
		model.eResource().getContents().addAll(add);
		model.eResource().save(Collections.EMPTY_MAP);

		iJjavaProject.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

		Transformation.umlToProject(iJjavaProject, new NullProgressMonitor());
	}

}
