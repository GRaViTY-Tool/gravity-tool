package org.gravity.pm.multimodule.project;

import java.util.List;
import org.eclipse.core.resources.IProject;

public record ProjectSystem(IProject root, List<IProject> projects, List<ProjectDependency> dependencies) {
    public ProjectSystem {
        projects = List.copyOf(projects);
        dependencies = List.copyOf(dependencies);
    }
}
