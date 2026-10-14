package org.gravity.pm.multimodule.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public interface IProjectSystemProvider {
    String id();
    boolean supports(IProject project) throws CoreException;
    ProjectSystem resolve(IProject project, IProgressMonitor monitor) throws CoreException;
}
