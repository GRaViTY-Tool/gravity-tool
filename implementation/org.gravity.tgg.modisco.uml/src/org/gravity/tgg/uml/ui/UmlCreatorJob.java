package org.gravity.tgg.uml.ui;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Level;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.uml2.uml.Model;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.ui.ModelCreatorJob;
import org.gravity.tgg.uml.Transformation;

/**
 * An implementation of java.lang.Job for creating a PG from a selection in an
 * eclipse workspace
 * 
 * @author speldszus
 *
 */
final class UmlCreatorJob extends ModelCreatorJob {

	/**
	 * Creates a new job for discovering UML models from a project selection
	 * 
	 * @param selection
	 */
	UmlCreatorJob(List<Object> selection) {
		super(selection, "UML Model", "uml");
	}

	@Override
	public boolean process(IJavaProject iJavaProject, IProgressMonitor monitor) {
		IProject iProject = iJavaProject.getProject();
		Model model;
		try {
			model = Transformation.projectToModel(iJavaProject, false, monitor);
		} catch (TransformationFailedException | IOException e) {
			UmlParseHandler.LOGGER.log(Level.ERROR, e);
			return false;
		}
		return save(iProject, model, monitor);
	}

}