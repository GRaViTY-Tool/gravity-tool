package org.gravity.pm.multimodule.project;

import java.util.LinkedHashMap;
import java.util.List;
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
    private final List<IProgramModelBuilder> builders;

    public ProgramModelSystemBuilder(final IProgramModelBuilder builder) {
        this(List.of(Objects.requireNonNull(builder)));
    }

    public ProgramModelSystemBuilder(final List<IProgramModelBuilder> builders) {
        this.builders = List.copyOf(builders);
        if (this.builders.isEmpty()) {
            throw new IllegalArgumentException("At least one builder is required");
        }
    }

    public Map<IProject, TypeGraph> build(final ProjectSystem system, final IProgressMonitor monitor)
            throws ProgramModelBuildException {
        Objects.requireNonNull(system);
        final Map<IProject, TypeGraph> models = new LinkedHashMap<>();
        for (final IProject project : system.projects()) {
            if (monitor != null && monitor.isCanceled()) {
                throw new ProgramModelBuildException("Program model construction cancelled");
            }
            IProgramModelBuilder selected = null;
            for (final IProgramModelBuilder candidate : builders) {
                if (candidate.supports(project)) {
                    selected = candidate;
                    break;
                }
            }
            if (selected == null) {
                continue;
            }
            final TypeGraph model = selected.build(project, monitor);
            if (model == null) {
                throw new ProgramModelBuildException("Builder " + selected.id()
                        + " returned no model for " + project.getName());
            }
            models.put(project, model);
        }
        return Map.copyOf(models);
    }
}
