package org.gravity.tgg.uml.ui;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.uml2.uml.Model;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.eclipse.ui.exceptions.UnsupportedSelectionException;
import org.gravity.eclipse.ui.handler.AbstractTransformationHandler;
import org.gravity.tgg.uml.GravityUmlActivator;
import org.gravity.tgg.uml.Transformation;

/**
 * A handler for triggering the initial creation of a new UML models for the selected projects
 * 
 * @author speldszus
 *
 */
public class UmlParseHandler extends AbstractTransformationHandler {

	private static final Logger LOGGER = Logger.getLogger(UmlParseHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		List<Object> selection = getSelection(event);

		Job job = new UmlCreatorJob(selection);
		job.setUser(true);
		job.schedule();

		return null;
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	/**
	 * An implementation of java.lang.Job for creating a PG from  a selection in an eclipse workspace
	 * 
	 * @author speldszus
	 *
	 */
	private final class UmlCreatorJob extends Job {
			private final List<Object> selection;
	
			private UmlCreatorJob(List<Object> selection) {
				super("GRaViTY Create UML Model");
				this.selection = selection;
			}
	
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				ArrayList<String> fails = new ArrayList<>();
				for (Object entry : selection) {
					if (monitor.isCanceled()) {
						return Status.CANCEL_STATUS;
					}
					if (entry instanceof IJavaProject) {
						IJavaProject iJavaProject = (IJavaProject) entry;
						if (!process(iJavaProject, monitor)) {
							fails.add(iJavaProject.getProject().getName());
						}
					} else {
						UnsupportedSelectionException exception = new UnsupportedSelectionException(entry.getClass());
						LOGGER.log(Level.ERROR, exception.getMessage());
						return new Status(Status.ERROR, GravityUmlActivator.PLUGIN_ID, exception.getMessage(), exception);
					}
				}
				return fails.size() == 0 ? Status.OK_STATUS
						: new Status(Status.ERROR, GravityUmlActivator.PLUGIN_ID,
								"Creating a UML model failed on the follwoing Java projects: " + fails.toString());
			}
	
			private boolean process(IJavaProject iJavaProject, IProgressMonitor monitor) {
				IProject iProject = iJavaProject.getProject();
				Model model;
				try {
					model = Transformation.projectToModel(iJavaProject, false, monitor);
				} catch (TransformationFailedException | IOException e) {
					LOGGER.log(Level.ERROR, e);
					return false;
				}
				
				IFolder folder = iProject.getFolder("gravity");
				if (!folder.exists()) {
					try {
						folder.create(true, true, monitor);
					} catch (CoreException e) {
						LOGGER.log(Level.ERROR, "Couldn't create output location: " + folder.getLocation().toString());
					}
				}
				IFile file = folder.getFile(iProject.getName() + ".uml");
				URI out = URI.createFileURI(file.getLocation().toString());
				Resource original = model.eResource();
				original.setURI(out);
				
				return ModelSaver.saveModel(model, file, monitor);
			}
		}
}
