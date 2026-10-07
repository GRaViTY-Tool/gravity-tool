package org.gravity.typegraph.spl.features;

import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Registry and selection logic for supported project feature representations.
 */
public final class FeatureModelRepresentationRegistry {

    private final Map<String, FeatureModelRepresentation> representations = new LinkedHashMap<>();

    public FeatureModelRepresentationRegistry(final FeatureModelLoadingOptions options) {
        register(new YamlFeatureModelRepresentation());
        register(new HansFeatureModelRepresentation(options));
        register(new FeatureIdeModelRepresentation());
    }

    public FeatureModelRepresentationRegistry register(final FeatureModelRepresentation representation) {
        final var previous = representations.putIfAbsent(representation.id().toLowerCase(), representation);
        if (previous != null) {
            throw new IllegalArgumentException("Feature representation already registered: " + representation.id());
        }
        return this;
    }

    public FeatureModelRepresentation select(final Path path, final FeatureModelLoadingOptions options) {
        final String requested = options == null ? "auto" : options.representationId();
        if (requested != null && !requested.isBlank() && !"auto".equalsIgnoreCase(requested)) {
            final var representation = representations.get(requested.toLowerCase());
            if (representation == null) {
                throw new IllegalArgumentException("Unknown feature representation '" + requested
                        + "'. Registered representations: " + representations.keySet());
            }
            return representation;
        }
        for (final var representation : representations.values()) {
            if (!"featureide".equals(representation.id()) && representation.supports(path)) {
                return representation;
            }
        }
        return representations.get("featureide");
    }

    public ParsedProjectFeatureModel parse(final Path path, final FeatureModelLoadingOptions options) {
        return select(path, options).parse(path);
    }
}
