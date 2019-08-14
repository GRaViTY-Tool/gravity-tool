package org.gravity.eclipse.converter;

import java.util.Collection;
import java.util.function.Consumer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * The Interface IPGConverter for specifying converters from java source code
 * into an PG.
 */
public interface IPGConverter {

	/**
	 * Discards the converter
	 * 
	 * @return true, if the converter has been discarded successfully
	 */
	public boolean discard();
	
	/**
	 * Converts the given java project into an PG. The PG has to be stored local and
	 * is accessible through the method <code>getPG():TypeGraph</code>
	 *
	 * @param project the java project
	 * @param monitor a monitor for the progress, this might be <code>null</code>
	 * @return true, if the conversion was successful
	 */
	boolean convertProject(IJavaProject project, IProgressMonitor monitor);

	/**
	 * Converts the given java project into an PG taking a collection of libraries
	 * detailed into account. The PG has to be stored local and is accessible
	 * through the method <code>getPG():TypeGraph</code>
	 *
	 * @param project the java project
	 * @param libs The locations of the libraries
	 * @param monitor a monitor for the progress, this might be <code>null</code>
	 * @return true, if the conversion was successful
	 */
	boolean convertProject(IJavaProject project, Collection<IPath> libs, IProgressMonitor monitor);

	/**
	 * Synchronizes changes made on the PG and described in the consumer into the
	 * java source code of the previous converted java project.
	 *
	 * @param consumer the consumer with the changes
	 * @param monitor  a monitor for monitoring the progress. This might be
	 *                 <code>null</code>
	 * @return true, if the synchronization was successful
	 */
	boolean syncProjectBwd(Consumer<EObject> consumer, IProgressMonitor monitor);

	/**
	 * Synchronizes changes made on the java source code and described in the
	 * consumer into the PG.
	 *
	 * @param monitor  a monitor for monitoring the progress. This might be
	 *                 <code>null</code>
	 * @return true, if the synchronization was successful
	 */
	boolean syncProjectFwd(IProgressMonitor monitor);

	/**
	 * Synchronizes changes described in the consumer into the java source code of
	 * the previous converted java project.
	 *
	 * @param consumer the consumer with the changes
	 * @param monitor  a monitor for monitoring the progress. This might be
	 *                 <code>null</code>
	 * @return true, if the synchronization was successful
	 */
	boolean syncProjectFwd(Consumer<EObject> consumer, IProgressMonitor monitor);

	/**
	 * Saves the PG into the give file.
	 *
	 * @param file    the file
	 * @param monitor a progress monitor
	 * @return true, if successful
	 */
	boolean savePG(IFile file, IProgressMonitor monitor);

	/**
	 * Returns the PG of the translated java project.
	 *
	 * @return the PG
	 */
	TypeGraph getPG();

	/**
	 * Returns the resource set used for conversion.
	 *
	 * @return the resource set
	 */
	ResourceSet getResourceSet();

	/**
	 * Checks if is debug is enabled.
	 *
	 * @return true, if debug is enabled
	 */
	boolean isDebug();

	/**
	 * Sets the debug state.
	 *
	 * @param debug the new debug state
	 */
	void setDebug(boolean debug);

}
