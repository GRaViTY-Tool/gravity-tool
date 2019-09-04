package org.gravity.testsuite;

import static org.junit.Assert.fail;

import java.io.File;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityAPI;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.tgg.modisco.MoDiscoTGGActivator;
import org.gravity.typegraph.basic.TypeGraph;

public abstract class AbstractRefactoringTestCase {

	private static final Logger LOGGER = Logger.getLogger(AbstractRefactoringTestCase.class);
	
	protected static String projectName;

	private static TypeGraph pm; 

	public static void initialize(String projectName) throws CoreException, TransformationFailedException {
		MoDiscoTGGActivator.getDefault();
		if(projectName == null) {
			fail("Project not set!");
		}
		File src = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile();
		File projectLocation = new File(src, projectName);
		if(!projectLocation.exists()) {
			fail("Project \""+projectName+"\" doesn't exist at \""+src.toString()+"\"!");
		}
		LOGGER.info("Importing project: "+projectName);
		NullProgressMonitor monitor = new NullProgressMonitor();
		IProject project = EclipseProjectUtil.importProject(projectLocation, monitor);
		IJavaProject java = JavaProjectUtil.convertToJavaProject(project);
		pm = GravityAPI.createProgramModel(java, monitor);
	}
	
	protected static TypeGraph getProgramModel() {
		return EcoreUtil.copy(pm);
	}

}
