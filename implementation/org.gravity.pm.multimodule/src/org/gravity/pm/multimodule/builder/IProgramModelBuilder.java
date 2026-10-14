package org.gravity.pm.multimodule.builder;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.typegraph.basic.TypeGraph;

/** Builds one program model for one Eclipse project. */
public interface IProgramModelBuilder {
    String id();
    boolean supports(IProject project);
    TypeGraph build(IProject project, IProgressMonitor monitor) throws ProgramModelBuildException;
}
