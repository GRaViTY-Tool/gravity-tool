package org.gravity.modisco.processing;

import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.modisco.MGravityModel;

public interface IMoDiscoProcessor {
	
	public boolean process(MGravityModel model, IProgressMonitor monitor);
}
