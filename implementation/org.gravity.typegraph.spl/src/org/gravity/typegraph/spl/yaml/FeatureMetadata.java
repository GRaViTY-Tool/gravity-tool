package org.gravity.typegraph.spl.yaml;

import java.util.List;

import org.gravity.typegraph.spl.standards.StandardControlReference;

/** Additional semantic information attached to a project-local feature. */
public record FeatureMetadata(String semanticFeature, List<StandardControlReference> directMappings) {

    public FeatureMetadata {
        semanticFeature = semanticFeature == null ? "" : semanticFeature.trim();
        directMappings = directMappings == null ? List.of() : List.copyOf(directMappings);
    }

    public static FeatureMetadata empty() {
        return new FeatureMetadata("", List.of());
    }

    public FeatureMetadata merge(final FeatureMetadata other) {
        if (other == null) {
            return this;
        }
        final String semantic = other.semanticFeature().isBlank() ? semanticFeature : other.semanticFeature();
        final var mappings = new java.util.ArrayList<StandardControlReference>(directMappings);
        mappings.addAll(other.directMappings());
        return new FeatureMetadata(semantic, mappings);
    }
}
