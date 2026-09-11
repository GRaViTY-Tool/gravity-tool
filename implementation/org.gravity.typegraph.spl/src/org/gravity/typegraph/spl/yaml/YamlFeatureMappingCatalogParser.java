package org.gravity.typegraph.spl.yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.gravity.typegraph.spl.standards.FeatureMappingCatalog;
import org.gravity.typegraph.spl.standards.StandardControlReference;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

/** Parses a curated security-feature to standard-control mapping catalog. */
public final class YamlFeatureMappingCatalogParser {

    public FeatureMappingCatalog parse(final Path path) {
        Objects.requireNonNull(path, "path");
        final LoaderOptions options = new LoaderOptions();
        options.setAllowDuplicateKeys(false);
        final Yaml yaml = new Yaml(new SafeConstructor(options));
        final Object raw;
        try (InputStream input = Files.newInputStream(path)) {
            raw = yaml.load(input);
        } catch (final IOException e) {
            throw new IllegalArgumentException("Cannot read feature mapping catalog: " + path, e);
        }
        if (!(raw instanceof Map<?, ?> root)) {
            throw new IllegalArgumentException("The mapping catalog root must be a mapping");
        }
        final Object rawFeatures = root.containsKey("features") ? root.get("features") : root;
        if (!(rawFeatures instanceof Map<?, ?> featureMap)) {
            throw new IllegalArgumentException("The mapping catalog must contain a 'features' mapping");
        }
        final List<FeatureMappingCatalog.Entry> entries = new ArrayList<>();
        for (final Map.Entry<?, ?> rawEntry : featureMap.entrySet()) {
            final String canonicalName = Objects.toString(rawEntry.getKey(), "").trim();
            if (canonicalName.isBlank()) {
                continue;
            }
            if (!(rawEntry.getValue() instanceof Map<?, ?> definition)) {
                throw new IllegalArgumentException("Catalog entry '" + canonicalName + "' must be a mapping");
            }
            final Set<String> aliases = parseStrings(definition.get("aliases"));
            final Object controlsObject = definition.containsKey("controls") ? definition.get("controls")
                    : definition.get("standards");
            final List<StandardControlReference> controls = YamlFeatureModelParser.parseControlReferences(controlsObject);
            entries.add(new FeatureMappingCatalog.Entry(canonicalName, aliases, controls));
        }
        return new FeatureMappingCatalog(entries);
    }

    private static Set<String> parseStrings(final Object raw) {
        if (raw == null) {
            return Set.of();
        }
        final List<?> values = raw instanceof List<?> list ? list : List.of(raw);
        final Set<String> result = new LinkedHashSet<>();
        for (final Object value : values) {
            if (value != null && !value.toString().isBlank()) {
                result.add(value.toString().trim());
            }
        }
        return result;
    }
}
