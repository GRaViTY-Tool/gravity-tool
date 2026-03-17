package org.gravity.eclipse.ui;

import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;

/**
 * An implementation of java.lang.Job for creating a PG from a selection in an
 * eclipse workspace
 *
 * @author speldszus
 *
 */
public final class PMCreatorJob extends ModelCreatorJob {

	private static final Logger LOGGER = Logger.getLogger(PMCreatorJob.class);

	/**
	 * Creates a new job for the creation of program models from the selection
	 *
	 * @param selection A selection from the workspace
	 */
	public PMCreatorJob(final List<?> selection) {
		super(selection, "program model");
	}

	@Override
	public boolean process(final IProject project, final IProgressMonitor monitor) {
		final var gravityActivator = GravityActivator.getDefault();
		IPGConverter converter;
		try {
			converter = gravityActivator.getNewConverter(project);
		} catch (CoreException | NoConverterRegisteredException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return false;
		}

		final var success = converter.convertProject(monitor);
		if (!success) {
			LOGGER.log(Level.ERROR, "No program model has been created for " + project.getName());
			return false;
		}
		return true;
	}
}