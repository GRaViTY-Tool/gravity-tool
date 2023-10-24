package org.gravity.security.tests;

import static org.junit.Assert.assertTrue;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.security.annotations.marker.SecurityMarkerUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.google.gson.Gson;

public class SecureDependencyEditingSupportTests {

	private static final Logger LOGGER = Logger.getLogger(SecureDependencyEditingSupportTests.class);

	@ParameterizedTest
	@MethodSource("collectProjects")
	void testSecureDependency(IJavaProject project) throws CoreException {
		project.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		project.getProject().build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
		var problems = new ArrayList<>(Stream
				.of(project.getResource().findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE)).filter(m -> {
					try {
						return SecurityMarkerUtil.MARKER_SOURCE.equals(m.getAttribute(IMarker.SOURCE_ID)) && IMarker.SEVERITY_ERROR == (Integer) m.getAttribute(IMarker.SEVERITY);
					} catch (CoreException e) {
						LOGGER.error(e);
						return false;
					}
				}).toList());

		var file = project.getProject().getFile("expect.json");
		if (!file.exists()) {
			LOGGER.warn("No exectation for project \"" + project.getProject().getName() + "\"");
			return;
		}
		Map<Object, Object> map = new Gson().fromJson(new InputStreamReader(file.getContents()), Map.class);
		for (Entry<Object, Object> entry : map.entrySet()) {
			assertTrue(problems.removeIf(m -> {
				return m.getResource().toString().equals(entry.getKey());
			}));
		}
		assertTrue(problems.isEmpty());

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
