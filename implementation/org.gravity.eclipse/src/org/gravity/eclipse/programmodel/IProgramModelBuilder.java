package org.gravity.eclipse.programmodel;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.typegraph.basic.TypeGraph;

/** Technology-independent construction of one program model for one Eclipse project. */
public interface IProgramModelBuilder {
	String id();
	boolean supports(IProject project);
	TypeGraph build(IProject project, IProgressMonitor monitor) throws ProgramModelBuildException;
}
