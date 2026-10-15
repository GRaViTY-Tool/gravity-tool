package org.gravity.pm.multimodule.project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.IMavenProjectFacade;

/**
 * Discovers imported Maven modules through m2e and resolves project-to-project
 * dependencies using JDT's resolved classpath. Never parses pom.xml directly.
 */
public final class MavenProjectSystemProvider implements IProjectSystemProvider {

    @Override
    public String id() {
        return "org.gravity.maven.m2e";
    }

    @Override
    public boolean supports(final IProject project) throws CoreException {
        return project != null && project.isAccessible()
                && project.hasNature("org.eclipse.m2e.core.maven2Nature")
                && MavenPlugin.getMavenProjectRegistry().getProject(project.getFile("pom.xml")) != null;
    }

    @Override
    public ProjectSystem resolve(final IProject root, final IProgressMonitor monitor) throws CoreException {
        if (!supports(root)) {
            throw new IllegalArgumentException("Not an imported m2e Maven project: " + root);
        }
        final Map<File, IProject> imported = new LinkedHashMap<>();
        for (final IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
            if (supports(project) && project.getLocation() != null) {
                imported.put(canonical(project.getLocation().toFile()), project);
            }
        }
        final Set<IProject> modules = new LinkedHashSet<>();
        collect(root, imported, modules);
        final List<ProjectDependency> dependencies = new ArrayList<>();
        for (final IProject project : modules) {
            if (!project.hasNature(JavaCore.NATURE_ID)) {
                continue;
            }
            for (final IClasspathEntry entry : JavaCore.create(project).getResolvedClasspath(true)) {
                if (entry.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
                    final IProject target = ResourcesPlugin.getWorkspace().getRoot()
                            .getProject(entry.getPath().lastSegment());
                    if (modules.contains(target)) {
                        dependencies.add(new ProjectDependency(project, target));
                    }
                }
            }
        }
        return new ProjectSystem(root, List.copyOf(modules), dependencies);
    }

    private static void collect(final IProject project, final Map<File, IProject> imported,
            final Set<IProject> modules) throws CoreException {
        if (!modules.add(project)) {
            return;
        }
        final IMavenProjectFacade facade = MavenPlugin.getMavenProjectRegistry()
                .getProject(project.getFile("pom.xml"));
        if (facade == null) {
            throw new IllegalStateException("Missing m2e project facade: " + project.getName());
        }
        final File base = facade.getMavenProject().getBasedir();
        for (final String module : facade.getMavenProject().getModules()) {
            final IProject child = imported.get(canonical(new File(base, module)));
            if (child == null) {
                throw new IllegalStateException("Maven module is not imported into the workspace: "
                        + new File(base, module));
            }
            collect(child, imported, modules);
        }
    }

    private static File canonical(final File file) {
        try {
            return file.getCanonicalFile();
        } catch (final IOException e) {
            throw new IllegalStateException("Cannot resolve project location: " + file, e);
        }
    }
}
