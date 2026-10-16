package org.gravity.pm.multimodule.project;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.eclipse.programmodel.IProgramModelBuilder;
import org.gravity.eclipse.programmodel.ProgramModelBuildException;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * Constructs a separate program model for each source project. Reactor
 * aggregators without a supported language nature are not transformed.
 * Linking and enrichment are separate phases.
 */
public final class ProgramModelSystemBuilder {
    private final IProgramModelBuilder builder;

    public ProgramModelSystemBuilder(final IProgramModelBuilder builder) {
        this.builder = Objects.requireNonNull(builder);
    }

    public Map<IProject, TypeGraph> build(final ProjectSystem system, final IProgressMonitor monitor)
            throws ProgramModelBuildException {
        Objects.requireNonNull(system);
        final Map<IProject, TypeGraph> models = new LinkedHashMap<>();
        for (final IProject project : system.projects()) {
            if (monitor != null && monitor.isCanceled()) {
                throw new ProgramModelBuildException("Program model construction cancelled");
            }
            if (!builder.supports(project)) {
                continue;
            }
            final TypeGraph model = builder.build(project, monitor);
            if (model == null) {
                throw new ProgramModelBuildException("Builder " + builder.id()
                        + " returned no model for " + project.getName());
            }
            models.put(project, model);
        }
        return Map.copyOf(models);
    }
}
