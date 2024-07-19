package org.gravity.security.annotations;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.security.annotations.check.SecureDependencyCheck;

/**
 * The Activator of the org.gravity.security.annotations plugin
 *
 * @author speldszus
 *
 */
public class SecurityAnnoationsCheckActivator extends Plugin {

	private static final String CHECK_NAME = SecureDependencyCheck.class.getName();

	private static final String DISABLED_CHECKS = ".disabledchecks";

	/**
	 * The id of this plugin
	 */
	public static final String PLUGIN_ID = "org.gravity.security.annotations.check";

	/**
	 * The name of the security annotations file
	 */
	private static final String ANNOTATIONS_JAR = "org.gravity.security.annotations.jar";

	private static final Logger LOGGER = Logger.getLogger(SecurityAnnoationsCheckActivator.class);

	private static State enabled;

	/**
	 * Stores the GRaViTY UMLsec security annotations to a file
	 *
	 * @param file    The file
	 * @param monitor A progress monitor
	 * @throws IOException If the annotations can not be saved
	 */
	public static void storeAnnotationsToFile(final IFile file, final IProgressMonitor monitor) throws IOException {
		try (var annotations = new URL("platform:/plugin/" + PLUGIN_ID + "/target/dependency/" + ANNOTATIONS_JAR)
				.openConnection().getInputStream()) {
			file.create(annotations, true, monitor);
		} catch (final CoreException e) {
			throw new IOException(e);
		}
	}

	/**
	 * Adds the UMLsec Java-Annotations library to the project
	 *
	 * @param project The Java project
	 * @param monitor A progress monitor
	 * @return The libs of the project
	 * @throws CoreException
	 * @throws IOException
	 */
	public static IPath applyUMLsecLib(final IJavaProject project, final IProgressMonitor monitor)
			throws CoreException, IOException {
		monitor.setTaskName("Prepare Java Project");

		final var annotationsFile = EclipseProjectUtil.getGravityFolder(project.getProject(), monitor)
				.getFile(ANNOTATIONS_JAR);
		if (!annotationsFile.exists()) {
			storeAnnotationsToFile(annotationsFile, monitor);
			return EclipseProjectUtil.addLibToClasspath(project, annotationsFile).getPath();
		}

		// If the file exists already, check if it is on the classpath
		final var ws = project.getProject().getWorkspace().getRoot();
		for (final IClasspathEntry entry : project.getRawClasspath()) {
			if (entry.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
				var path = entry.getPath();
				if (path.isAbsolute()) {
					final var containingProject = ws.getProject(path.segment(0));
					if (containingProject.getLocation() != null) {
						path = containingProject.getLocation().append(path.removeFirstSegments(1));
					}
				} else {
					path = project.getProject().getFile(path).getLocation();
				}
				if (path.equals(annotationsFile.getLocation())) {
					return entry.getPath().makeRelativeTo(project.getPath());
				}
			}
		}
		return EclipseProjectUtil.addLibToClasspath(project, annotationsFile).getPath();
	}

	/**
	 * Returns whether the secure dependency check is enabled or disabled for the
	 * given project
	 *
	 * @param project The project for which the status should be retrieved
	 * @return true if the check is enabled
	 */
	public static boolean checksEnabled(final IProject project) {
		if (enabled == null) {
			try {
				enabled = readCheckEnabled(project);
			} catch (final IOException | CoreException e) {
				LOGGER.error(e);
				enabled = State.ENABLED;
			}
		}
		return enabled.value;
	}

	private static State readCheckEnabled(final IProject project) throws IOException, CoreException {
		final var file = getChecksDisabledFile(project);
		if (file.exists()) {
			try (var reader = new BufferedReader(new InputStreamReader(file.getContents()))) {
				String line;
				while ((line = reader.readLine()) != null) {
					if (line.equals(CHECK_NAME)) {
						return State.DISABLED;
					}
				}
			}
		}
		return State.ENABLED;
	}

	private static IFile getChecksDisabledFile(final IProject project) throws IOException {
		return EclipseProjectUtil.getGravityFolder(project, new NullProgressMonitor())
				.getFile(DISABLED_CHECKS);
	}

	/**
	 * Enables or disables the secure dependency check
	 *
	 * @param status Whether the check should be enabled or disabled
	 */
	public static void setChecksEnabled(final IProject project, final boolean status) {
		try {
			final var file = getChecksDisabledFile(project);
			if (status) {
				// Enable check
				enabled = State.ENABLED;
				enable(file, CHECK_NAME);
			} else {
				// Disable check
				enabled = State.DISABLED;
				disable(file, CHECK_NAME);
			}
		} catch (CoreException | IOException e) {
			LOGGER.error(e);
		}
	}

	private static void enable(final IFile file, final String id) {
		try {
			if (file.exists()) {
				try (var reader = new BufferedReader(new InputStreamReader(file.getContents()))) {
					final var lines = new LinkedList<String>();
					String line;
					while ((line = reader.readLine()) != null) {
						if (!line.equals(id)) {
							lines.add(line);
						}
					}
					file.setContents(new ByteArrayInputStream(String.join("\n", lines).getBytes()), 0, null);
				}
			}
		} catch (CoreException | IOException e) {
			LOGGER.error(e);
		}
	}

	private static void disable(final IFile file, final String id) throws IOException, CoreException {
		if (file.exists()) {
			try (var reader = new BufferedReader(new InputStreamReader(file.getContents()))) {
				final var lines = new LinkedList<String>();
				String line;
				while ((line = reader.readLine()) != null) {
					if (line.equals(id)) {
						return;
					}
				}
				file.setContents(new ByteArrayInputStream(String.join("\n", lines).getBytes()), 0, null);
			}
		} else {
			file.create(new ByteArrayInputStream(id.getBytes()), true,
					new NullProgressMonitor());
		}
	}

	private enum State {
		ENABLED(true),
		DISABLED(false);

		boolean value;

		private State(final boolean value) {
			this.value = value;
		}

	}
}
