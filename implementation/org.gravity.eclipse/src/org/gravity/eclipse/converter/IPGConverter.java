package org.gravity.eclipse.converter;

import java.util.Collection;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * The Interface IPGConverter for specifying converters from java source code
 * into a GRaViTY Program Model.
 */
public interface IPGConverter {

	/**
	 * Discards the converter
	 *
	 * @return true, if the converter has been discarded successfully
	 */
	boolean discard();

	/**
	 * Converts the given java project into an PG. The PG has to be stored local and
	 * is accessible through the method <code>getPG():TypeGraph</code>
	 *
	 * @param monitor a monitor for the progress, this might be <code>null</code>
	 * @return true, if the conversion was successful
	 */
	boolean convertProject(IProgressMonitor monitor);

	/**
	 * Converts the given java project into an PG taking a collection of libraries
	 * detailed into account. The PG has to be stored local and is accessible
	 * through the method <code>getPG():TypeGraph</code>
	 *
	 * @param libs The locations of the libraries
	 * @param monitor a monitor for the progress, this might be <code>null</code>
	 * @return true, if the conversion was successful
	 */
	boolean convertProject(Collection<IPath> libs, IProgressMonitor monitor);

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
	 * Saves the state of the converter
	 *
	 * @param monitor a progress monitor
	 * @return true, if successful
	 */
	boolean save(IProgressMonitor monitor);

	/**
	 * Returns the PG of the translated java project.
	 *
	 * @return the PG
	 */
	TypeGraph getPG();

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
