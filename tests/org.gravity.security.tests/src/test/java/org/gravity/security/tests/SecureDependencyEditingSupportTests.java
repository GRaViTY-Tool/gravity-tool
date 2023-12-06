package org.gravity.security.tests;

import static org.junit.Assert.assertTrue;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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
	void testSecureDependency(final IJavaProject project) throws CoreException {
		project.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		project.getProject().build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
		final var problems = new ArrayList<>(Stream
				.of(project.getResource().findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE)).filter(m -> {
					try {
						return SecurityMarkerUtil.MARKER_SOURCE.equals(m.getAttribute(IMarker.SOURCE_ID))
								&& IMarker.SEVERITY_ERROR == (Integer) m.getAttribute(IMarker.SEVERITY);
					} catch (final CoreException e) {
						LOGGER.error(e);
						return false;
					}
				}).toList());

		final var file = project.getProject().getFile("expect.json");
		if (!file.exists()) {
			LOGGER.warn("No exectation for project \"" + project.getProject().getName() + "\"");
			return;
		}
		final Map<?, List<?>> map = new Gson().fromJson(new InputStreamReader(file.getContents()), Map.class);
		for (final Entry<?, ?> entry : map.entrySet()) {
			assertTrue(
					"Expected marker not found on resource \"" + entry.getKey() + "\" concerning the sigantures "
							+ entry.getValue(),
					problems.removeIf(m -> SecureDependencyEditingSupportTests.isExpectedMarker(entry, m)));
		}
		assertTrue("Unexpected markers have been found: " + problems, problems.isEmpty());

	}

	private static boolean isExpectedMarker(final Entry<?, ?> expectations, final IMarker marker) {
		if (marker.getResource().getProjectRelativePath().toString().equals(expectations.getKey())) {
			try {
				final var analyzed = marker.getAttribute(SecurityMarkerUtil.MARKER_ATTR_ANALYZED);
				if (analyzed instanceof final String value) {
					final var foundSignatures = value.split(";");
					for (final var expextedSignatures : getExpectedMarkers(expectations)) {
						if (foundSignatures.length == expextedSignatures.size()
								&& Stream.of(foundSignatures).allMatch(expextedSignatures::contains)) {
							return true;
						}
					}
					return false;
				}
			} catch (final CoreException e) {
				LOGGER.error(e);
			}
		}
		return false;
	}

	private static List<List<String>> getExpectedMarkers(final Entry<?, ?> expectations) {
		final var value = (List<?>) expectations.getValue();
		if (!(value.get(0) instanceof List<?>)) {
			return Arrays.asList((List<String>) value);
		}
		return (List<List<String>>) value;
	}

	public static List<IJavaProject> collectProjects() throws CoreException {
		return EclipseProjectUtil.importProjectsFromWorkspaceLocation(new NullProgressMonitor()).stream().filter(p -> {
			try {
				return p.hasNature(JavaCore.NATURE_ID);
			} catch (final CoreException e) {
				LOGGER.error(e);
			}
			return false;
		}).map(JavaCore::create).toList();
	}
}
