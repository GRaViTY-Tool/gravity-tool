package org.gravity.typegraph.spl.yaml;

import java.util.LinkedHashMap;
import java.util.Map;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;

/** Result of parsing a project feature YAML file. */
public record ParsedYamlFeatureModel(IFeatureModel featureModel, Map<String, FeatureMetadata> metadataByFeature) {

    public ParsedYamlFeatureModel {
        if (featureModel == null) {
            throw new IllegalArgumentException("featureModel must not be null");
        }
        metadataByFeature = metadataByFeature == null ? Map.of()
                : java.util.Collections.unmodifiableMap(new LinkedHashMap<>(metadataByFeature));
    }

    public FeatureMetadata metadata(final IFeature feature) {
        return feature == null ? FeatureMetadata.empty()
                : metadataByFeature.getOrDefault(feature.getName(), FeatureMetadata.empty());
    }
}
