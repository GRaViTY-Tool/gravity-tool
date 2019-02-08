/**
 * 
 */
package org.gravity.eclipse;

import java.util.Collections;

import org.eclipse.core.resources.IProject;
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

	/**
	 * Discovers the Java project and creates a program model
	 * 
	 * @param project A Java project
	 * @param monitor A progress monitor
	 * @return The program model
	 * @throws TransformationFailedException If the program model cannot be created
	 */
	public static TypeGraph createProgramModel(IJavaProject project, IProgressMonitor monitor) throws TransformationFailedException {
		IProject iproject = project.getProject();
		IPGConverter converter;
		try {
			converter = GravityActivator.getDefault().getNewConverter(iproject);
		} catch (CoreException | NoConverterRegisteredException e) {
			throw new TransformationFailedException(e);
		}
	
		boolean success = converter.convertProject(project, Collections.emptySet(), monitor);
		if (!success || converter.getPG() == null) {
			throw new TransformationFailedException(
					"Creating PG from project failed: " + project.getProject().getName());
		}
		TypeGraph pg = converter.getPG();
		return pg;
	}

}
