package org.gravity.tgg.uml.ui;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.gravity.tgg.uml.GravityUmlActivator;
import org.gravity.tgg.uml.Transformation;

/**
 * An implementation of java.lang.Job for creating a PG from a selection in an
 * eclipse workspace
 *
 * @author speldszus
 *
 */
final class UmlCodeGenJob extends Job {

	private final List<?> selection;

	/**
	 * Creates a new job for generating code from UML models from a project
	 * selection
	 *
	 * @param selection The selection from the workspace
	 */
	UmlCodeGenJob(final List<?> selection) {
		super("UML Code Gen");
		this.selection = selection;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		final Set<?> umlFiles = this.selection.parallelStream().filter(object -> (object instanceof IFile))
				.filter(file -> "uml".equalsIgnoreCase(((IFile) file).getFileExtension())).collect(Collectors.toSet());
		if (umlFiles.size() != 1) {
			return new Status(IStatus.ERROR, GravityUmlActivator.PLUGIN_ID, "Please select exactly one UML file!");
		}
		final var umlFile = (IFile) umlFiles.iterator().next();
		final var project = umlFile.getProject();
		return Transformation.generateCode(project, umlFile, monitor);
	}
}