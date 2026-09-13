package org.gravity.typegraph.spl.standards;

import java.util.List;

/** Result of resolving project features against one or more standards models. */
public record FeatureStandardsMappingResult(List<FeatureControlMapping> mappings,
        List<UnresolvedFeatureControlMapping> unresolved, List<String> unmappedFeatures) {

    public FeatureStandardsMappingResult {
        mappings = mappings == null ? List.of() : List.copyOf(mappings);
        unresolved = unresolved == null ? List.of() : List.copyOf(unresolved);
        unmappedFeatures = unmappedFeatures == null ? List.of() : List.copyOf(unmappedFeatures);
    }

    public boolean isComplete() {
        return unresolved.isEmpty() && unmappedFeatures.isEmpty();
    }
}
