package org.gravity.eclipse.programmodel;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.typegraph.basic.TypeGraph;

/** Optional capability for synchronizing project changes into an existing program model. */
public interface IForwardSynchronizer {
	boolean synchronizeForward(IProject project, TypeGraph model, IProgressMonitor monitor);
}
