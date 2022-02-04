package org.gravity.securtity.violation.patterns.tests;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.junit.Test;

/**
 * Executes test implementations on a Java project with all existing models that
 * contains a violation of the security violation pattern
 *
 * @author speldszus
 *
 */
public abstract class AbstractExisitingModelsTest {

	/**
	 * Loads the the test project, backups the existing models, executes the test
	 * implementation and then restores the original state
	 *
	 * @throws CoreException
	 * @throws IOException
	 */
	@Test
	public void testIntegration() throws CoreException, IOException {
		BasicConfigurator.configure();

		final var monitor = new NullProgressMonitor();
		final var location = new File("instances/SecureViolationPatternsViolation");
		final var project = EclipseProjectUtil.importProject(location, monitor);
		assertNotNull("Couldn't load the test project", project);

		final var gravity = EclipseProjectUtil.getGravityFolder(project, monitor);
		final var backup = project.getFolder(".gravity-backup");
		gravity.copy(backup.getProjectRelativePath(), IResource.DEPTH_INFINITE, monitor);
		updateTimeStamps(project, monitor);

		try {
			run(project, monitor);
		} finally {
			if (backup.exists()) {
				gravity.delete(true, monitor);
				backup.copy(gravity.getProjectRelativePath(), IResource.DEPTH_INFINITE, monitor);
				backup.delete(true, monitor);
			}
		}
	}

	/**
	 * Updates the time stamps of the .gravity folder
	 *
	 * @param project The project whose .gravity time stamps should be updated
	 * @param monitor A progress monitor
	 * @throws IOException If updating the time stamps failed
	 */
	private void updateTimeStamps(final IProject project, final IProgressMonitor monitor)
			throws IOException, CoreException {
		final var now = System.currentTimeMillis();
		final var gravity = EclipseProjectUtil.getGravityFolder(project, monitor);
		try {
			gravity.accept(resource -> {
				resource.setLocalTimeStamp(now);
				return true;
			});
		} catch (final CoreException e) {
			throw new IOException(e);
		}
	}

	/**
	 * An implementation of the test
	 *
	 * @param project A project that contains all models and a security violation
	 * @param monitor A progress monitor
	 */
	protected abstract void run(IProject project, NullProgressMonitor monitor);

}
