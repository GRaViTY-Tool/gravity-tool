package org.gravity.tgg.uml.ui;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.uml2.uml.Model;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.ui.ModelCreatorJob;
import org.gravity.tgg.uml.GravityUmlActivator;

/**
 * An implementation of java.lang.Job for creating a PG from a selection in an
 * eclipse workspace
 *
 * @author speldszus
 *
 */
final class UmlCreatorJob extends ModelCreatorJob {

	private static final Logger LOGGER = Logger.getLogger(UmlCreatorJob.class);

	private final boolean addUmlSec;

	/**
	 * Creates a new job for discovering UML models from a project selection
	 *
	 * @param selection The selection from the workspace
	 */
	UmlCreatorJob(final List<?> selection, final boolean addUmlSec) {
		super(selection, "UML Model");
		this.addUmlSec = addUmlSec;
	}

	@Override
	public boolean process(final IProject project, final IProgressMonitor monitor) {
		Model model;
		final var factory = GravityUmlActivator.getTransformationFactory();
		try {
			final var transformation = factory.getTransformation(project);
			model = transformation.projectToModel(this.addUmlSec, monitor);
		} catch (TransformationFailedException | IOException | CoreException e) {
			factory.drop(project);
			LOGGER.log(Level.ERROR, e);
			return false;
		}
		return model != null;
	}

}