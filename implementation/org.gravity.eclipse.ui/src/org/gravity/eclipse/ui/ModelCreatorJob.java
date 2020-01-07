package org.gravity.eclipse.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.eclipse.ui.exceptions.UnsupportedSelectionException;
import org.gravity.eclipse.util.EclipseProjectUtil;

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
	private final String fileExtension;

	/**
	 * Creates a new instance of a model creator job
	 *
	 * @param selection     The selected elements in the workspace
	 * @param modelKind     The name of the model kind
	 * @param fileExtension The file extension of the file into which the model will
	 *                      be stored
	 */
	protected ModelCreatorJob(List<?> selection, String modelKind, String fileExtension) {
		super("GRaViTY Create " + modelKind);
		this.fileExtension = fileExtension;
		this.modelKind = modelKind;
		this.selection = selection;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		final ArrayList<String> fails = new ArrayList<>();
		for (final Object entry : this.selection) {
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			if (entry instanceof IJavaProject) {
				final IJavaProject iJavaProject = (IJavaProject) entry;
				if (!process(iJavaProject, monitor)) {
					fails.add(iJavaProject.getProject().getName());
				}
			} else {
				final UnsupportedSelectionException exception = new UnsupportedSelectionException(entry.getClass());
				LOGGER.log(Level.ERROR, exception.getMessage());
				return new Status(IStatus.ERROR, GravityActivator.PLUGIN_ID, exception.getMessage(), exception);
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
	protected abstract boolean process(IJavaProject iJavaProject, IProgressMonitor monitor);

	/**
	 * Saves a model into the project
	 *
	 * @param iProject The project
	 * @param model    The model
	 * @param monitor  A progress monitor
	 * @return true, iff the model has been saved successfully
	 */
	protected boolean save(IProject iProject, EObject model, IProgressMonitor monitor) {
		IFolder folder;
		try {
			folder = EclipseProjectUtil.getGravityFolder(iProject, monitor);
		} catch (final IOException e) {
			LOGGER.error(e.getLocalizedMessage(), e);
			return false;
		}
		final IFile file = folder.getFile(iProject.getName() + '.' + this.fileExtension);
		return ModelSaver.saveModel(model, file, monitor);
	}
}