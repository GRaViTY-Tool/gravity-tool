package org.gravity.typegraph.spl.features;

import java.nio.file.Path;
import java.util.Locale;

import org.gravity.typegraph.spl.yaml.YamlFeatureModelParser;

/** Adapter for the GRaViTY YAML project feature format. */
public final class YamlFeatureModelRepresentation implements FeatureModelRepresentation {

    @Override
    public String id() {
        return "yaml";
    }

    @Override
    public boolean supports(final Path path) {
        if (path == null) {
            return false;
        }
        final String fileName = path.getFileName().toString().toLowerCase(Locale.ROOT);
        return fileName.endsWith(".yaml") || fileName.endsWith(".yml");
    }

    @Override
    public ParsedProjectFeatureModel parse(final Path path) {
        final var parsed = new YamlFeatureModelParser().parse(path);
        final var sourceNames = new java.util.LinkedHashMap<String, String>();
        parsed.featureModel().getFeatures().forEach(feature -> sourceNames.put(feature.getName(), feature.getName()));
        return new ParsedProjectFeatureModel(parsed.featureModel(), parsed.metadataByFeature(), sourceNames, id());
    }
}
