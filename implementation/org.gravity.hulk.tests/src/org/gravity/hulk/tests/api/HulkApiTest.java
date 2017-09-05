package org.gravity.hulk.tests.api;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.hulk.HulkAPI;
import org.gravity.hulk.HulkAPI.AntiPatternNames;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class HulkApiTest {

	private IJavaProject javaProject;
	
	public HulkApiTest(String name, IJavaProject project) {
		this.javaProject = project;
	}

	@Parameters(name="{index}: Test HulkAPI on \"{0}\"")
	public static Collection<Object[]> collectProjects() {
		Collection<Object[]> data = new LinkedList<>();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for(IProject project : root.getProjects()){
			try {
				if(project.hasNature(JavaCore.NATURE_ID)){
					IJavaProject javaProject = JavaCore.create(project);
					data.add(new Object[]{project.getName(), javaProject});
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return data;
	}
	
	@Test
	public void detectBlobs() throws NoConverterRegisteredException{
		List<org.gravity.hulk.antipatterngraph.HAntiPattern> results = HulkAPI.detect(javaProject, new NullProgressMonitor(), AntiPatternNames.Blob);
	}
}
