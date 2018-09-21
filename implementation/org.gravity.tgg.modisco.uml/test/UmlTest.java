import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLFactory;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.tgg.uml.Transformation;
import org.junit.Test;

import carisma.profile.umlsec.UmlsecFactory;
import carisma.profile.umlsec.critical;

public class UmlTest {

	@Test
	public void test() throws FileNotFoundException, DiscoveryException, CoreException, IOException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject("SecureDependency");
		IJavaProject jp = JavaCore.create(project);
		IJavaProject iJjavaProject = JavaProjectUtil.copyJavaProject(jp, "SecureDependency"+System.currentTimeMillis());

		Model model = Transformation.projectToModel(iJjavaProject, true, new NullProgressMonitor());

		assertNotNull(model);
		IFolder folder = iJjavaProject.getProject().getFolder(".gravity");
		File srcFile = folder.getFile("src.xmi").getLocation().toFile();
		Files.copy(new FileInputStream(srcFile), folder.getFile("fwd.src.xmi").getLocation().toFile().toPath());

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
