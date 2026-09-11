package org.gravity.typegraph.spl.features;

import java.util.LinkedHashMap;
import java.util.Map;

import org.gravity.typegraph.spl.yaml.FeatureMetadata;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;

/** Normalized project feature model independent of the source representation. */
public record ParsedProjectFeatureModel(IFeatureModel featureModel,
        Map<String, FeatureMetadata> metadataByFeature,
        Map<String, String> sourceNamesByFeature,
        String representation) {

    public ParsedProjectFeatureModel {
        if (featureModel == null) {
            throw new IllegalArgumentException("featureModel must not be null");
        }
        metadataByFeature = metadataByFeature == null ? Map.of()
                : java.util.Collections.unmodifiableMap(new LinkedHashMap<>(metadataByFeature));
        sourceNamesByFeature = sourceNamesByFeature == null ? Map.of()
                : java.util.Collections.unmodifiableMap(new LinkedHashMap<>(sourceNamesByFeature));
        representation = representation == null ? "" : representation.trim();
    }

    public FeatureMetadata metadata(final IFeature feature) {
        return feature == null ? FeatureMetadata.empty()
                : metadataByFeature.getOrDefault(feature.getName(), FeatureMetadata.empty());
    }

    /** Returns the feature name as it appeared in the source representation. */
    public String sourceName(final IFeature feature) {
        if (feature == null) {
            return "";
        }
        return sourceNamesByFeature.getOrDefault(feature.getName(), feature.getName());
    }
}
