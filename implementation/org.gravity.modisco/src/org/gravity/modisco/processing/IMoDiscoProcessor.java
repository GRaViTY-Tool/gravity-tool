package org.gravity.modisco.processing;

import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.modisco.MGravityModel;

/**
 * The interface which has to be implemented by processors registered at the
 * processing fwd extension point
 * 
 * @author speldszus
 *
 */
public interface IMoDiscoProcessor {

	/**
	 * Pre- or post-processes a MoDiscio model, depending on at which extension
	 * point the processor is registered
	 * 
	 * @param model   The MoDiscio model
	 * @param monitor A progress monitor
	 * @return true, if the processing has been successful
	 */
	public boolean process(MGravityModel model, IProgressMonitor monitor);
}
