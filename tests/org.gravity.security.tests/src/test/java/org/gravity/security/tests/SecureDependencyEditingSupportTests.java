package org.gravity.security.tests;

import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SecureDependencyEditingSupportTests {

	private static final Logger LOGGER = Logger.getLogger(SecureDependencyEditingSupportTests.class);

	@ParameterizedTest
	@MethodSource("collectProjects")
	void testSecureDependency(IJavaProject project) throws CoreException {
		project.getProject().build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
		project.getProject().getFile("expect.json");
		IMarker[] problems = project.getResource().findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
	}

	public static List<IJavaProject> collectProjects() throws CoreException {
		return EclipseProjectUtil.importProjectsFromWorkspaceLocation(new NullProgressMonitor()).stream().filter(p -> {
			try {
				return p.hasNature(JavaCore.NATURE_ID);
			} catch (CoreException e) {
				LOGGER.error(e);
			}
			return false;
		}).map(JavaCore::create).toList();
	}
}
