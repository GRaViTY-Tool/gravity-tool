package org.gravity.tgg.modisco.uml.tests;

import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
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
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.tgg.uml.Transformation;
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
	 * Discovers a UML model, adds a UMLsec annotation and synchronizes it to the
	 * code
	 *
	 * @throws TransformationFailedException If the trafo failed
	 * @throws FileNotFoundException         If there is a problem with loading
	 *                                       models
	 * @throws IOException                   If there is a problem with loading
	 *                                       models
	 * @throws CoreException                 If there is a problem with refreshing
	 *                                       the workspace after changes
	 */
	@Test
	public void test() throws TransformationFailedException, FileNotFoundException, IOException, CoreException {
		GravityActivator.getDefault().setDebugging(true);

		final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		final IProject project = root.getProject("SecureDependency");
		final IJavaProject jp = JavaCore.create(project);
		final IJavaProject iJjavaProject = JavaProjectUtil.copyJavaProject(jp,
				"SecureDependency" + System.currentTimeMillis());

		final Model model = new Transformation(iJjavaProject, null).projectToModel(true, new NullProgressMonitor());

		assertNotNull(model);
		final IFolder folder = EclipseProjectUtil.getGravityFolder(project, new NullProgressMonitor());
		try (OutputStream outputStream = Files
				.newOutputStream(folder.getFile(project.getName() + ".uml").getLocation().toFile().toPath())) {
			model.eResource().save(outputStream, Collections.emptyMap());
		}

		final LinkedList<EObject> add = new LinkedList<>();
		final ProfileApplication profileApplication = UMLFactory.eINSTANCE.createProfileApplication();
		model.getProfileApplications().add(profileApplication);
		final TreeIterator<EObject> iterator = model.eResource().getAllContents();
		while (iterator.hasNext()) {
			final EObject next = iterator.next();
			if (next instanceof org.eclipse.uml2.uml.Class) {
				final Class clazz = (org.eclipse.uml2.uml.Class) next;
				if (clazz.getName().equals("KeyGenerator") || clazz.getName().equals("RandomGenerator")) {
					final critical critical = UmlsecFactory.eINSTANCE.createcritical();
					critical.setBase_Classifier((Classifier) next);
					critical.getHigh().add("random():float");
					add.add(critical);
				}
			}
		}
		model.eResource().getContents().addAll(add);
		model.eResource().save(Collections.emptyMap());

		iJjavaProject.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

		new Transformation(iJjavaProject, null).umlToProject(new NullProgressMonitor());
	}

}
