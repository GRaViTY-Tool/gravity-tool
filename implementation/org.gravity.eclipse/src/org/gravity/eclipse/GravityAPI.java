/**
 *
 */
package org.gravity.eclipse;

import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * A simple class for generating program models from Java projects
 *
 * @author speldszus
 *
 */
public class GravityAPI {

	private GravityAPI() {
		// This class shouldn't be instantiated
	}

	/**
	 * Discovers the Java project and creates a program model
	 *
	 * @param project A Java project
	 * @param debug Enables more verbose output
	 * @param monitor A progress monitor
	 * @return The program model
	 * @throws TransformationFailedException If the program model cannot be created
	 */
	public static TypeGraph createProgramModel(final IJavaProject project, boolean debug, final IProgressMonitor monitor)
			throws TransformationFailedException {
		final var iproject = project.getProject();
		IPGConverter converter;
		try {
			converter = GravityActivator.getDefault().getNewConverter(iproject);
		} catch (CoreException | NoConverterRegisteredException e) {
			throw new TransformationFailedException(e);
		}
		converter.setDebug(debug);
		
		final var success = converter.convertProject(Collections.emptySet(), monitor);
		if (!success || (converter.getPG() == null)) {
			throw new TransformationFailedException(
					Messages.createPMFailed + project.getProject().getName());
		}
		return converter.getPG();
	}
	
	/**
	 * Discovers the Java project and creates a program model
	 *
	 * @param project A Java project
	 * @param monitor A progress monitor
	 * @return The program model
	 * @throws TransformationFailedException If the program model cannot be created
	 */
	public static TypeGraph createProgramModel(final IJavaProject project, final IProgressMonitor monitor)
			throws TransformationFailedException {
		return createProgramModel(project, false, monitor);
	}
}
