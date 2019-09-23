package org.gravity.eclipse.ui;

import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;

/**
 * An implementation of java.lang.Job for creating a PG from  a selection in an eclipse workspace
 *
 * @author speldszus
 *
 */
public final class PGCreatorJob extends ModelCreatorJob {

	private static final Logger LOGGER = Logger.getLogger(PGCreatorJob.class);

	/**
	 * Creates a new job for the creation of program models from the selection
	 *
	 * @param selection A selection from the workspace
	 */
	public PGCreatorJob(List<?> selection) {
		super(selection, "program model", "xmi");
	}

	@Override
	public boolean process(IJavaProject iJavaProject, IProgressMonitor monitor) {
		final IProject iProject = iJavaProject.getProject();

		final GravityActivator gravityActivator = GravityActivator.getDefault();
		IPGConverter converter;
		try {
			converter = gravityActivator.getNewConverter(iProject);
		} catch (CoreException | NoConverterRegisteredException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return false;
		}

		final boolean success = converter.convertProject(iJavaProject, monitor);
		if (!success) {
			LOGGER.log(Level.ERROR, "No program model has been created for " + iProject.getName());
			return false;
		}
		return save(iProject, converter.getPG(), monitor);
	}
}