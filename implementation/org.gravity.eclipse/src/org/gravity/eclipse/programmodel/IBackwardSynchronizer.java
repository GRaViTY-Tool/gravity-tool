package org.gravity.eclipse.programmodel;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.typegraph.basic.TypeGraph;

/** Optional capability for synchronizing program-model changes back into a project. */
public interface IBackwardSynchronizer {
	boolean synchronizeBackward(IProject project, TypeGraph model, IProgressMonitor monitor);
}
