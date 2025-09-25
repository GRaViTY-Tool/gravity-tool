package org.gravity.eclipse.ui;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.ui.exceptions.UnsupportedSelectionException;

/**
 * An implementation of java.lang.Job for creating a model from a selection in
 * an eclipse workspace
 *
 * @author speldszus
 *
 */
public abstract class ModelCreatorJob extends Job {

	private static final Logger LOGGER = Logger.getLogger(ModelCreatorJob.class);

	private final List<?> selection;
	private final String modelKind;

	/**
	 * Creates a new instance of a model creator job
	 *
	 * @param selection     The selected elements in the workspace
	 * @param modelKind     The name of the model kind
	 * @param fileExtension The file extension of the file into which the model will
	 *                      be stored
	 */
	protected ModelCreatorJob(final List<?> selection, final String modelKind) {
		super("GRaViTY Create " + modelKind);
		this.modelKind = modelKind;
		this.selection = selection;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		final var fails = new ArrayList<String>();
		for (final Object entry : this.selection) {
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			IProject project;
			if (entry instanceof final IProject iproject) {
				project = iproject;
			} else if (entry instanceof final IJavaProject ijavaproject) {
				project = ijavaproject.getProject();
			} else {
				final var exception = new UnsupportedSelectionException(entry.getClass());
				LOGGER.log(Level.ERROR, exception.getMessage());
				return new Status(IStatus.ERROR, GravityActivator.PLUGIN_ID, exception.getMessage(), exception);
			}
			if (!this.process(project, monitor)) {
				fails.add(project.getName());
			}
		}
		return fails.isEmpty() ? Status.OK_STATUS
				: new Status(IStatus.ERROR, GravityActivator.PLUGIN_ID, "Creation of a" + this.modelKind
						+ " failed on the follwoing Java projects: " + fails.toString());
	}

	/**
	 * This method is called with all Java projects for which a model should be
	 * created.
	 *
	 * @param iJavaProject The Java project for which a model should be created
	 * @param monitor      A progress monitor
	 * @return true, iff the model has been created successfully
	 */
	protected abstract boolean process(IProject iJavaProject, IProgressMonitor monitor);

}