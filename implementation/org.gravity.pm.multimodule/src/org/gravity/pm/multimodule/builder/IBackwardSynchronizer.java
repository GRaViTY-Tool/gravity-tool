package org.gravity.pm.multimodule.builder;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.typegraph.basic.TypeGraph;

public interface IBackwardSynchronizer {
    boolean synchronizeBackward(IProject project, TypeGraph model, IProgressMonitor monitor);
}
