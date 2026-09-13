package org.gravity.typegraph.spl;

import java.nio.file.Path;

import org.gravity.typegraph.spl.features.FeatureModelLoadingOptions;
import org.gravity.typegraph.spl.features.FeatureModelRepresentationRegistry;
import org.gravity.typegraph.spl.features.ParsedProjectFeatureModel;

import de.ovgu.featureide.fm.core.base.IFeatureModel;

/** Loads project feature models through configurable representation adapters. */
public final class FeatureModelLoader {

    private FeatureModelLoader() {
    }

    public static IFeatureModel load(final Path path) {
        return loadProject(path, FeatureModelLoadingOptions.defaults()).featureModel();
    }

    public static IFeatureModel load(final Path path, final FeatureModelLoadingOptions options) {
        return loadProject(path, options).featureModel();
    }

    public static ParsedProjectFeatureModel loadProject(final Path path) {
        return loadProject(path, FeatureModelLoadingOptions.defaults());
    }

    public static ParsedProjectFeatureModel loadProject(final Path path, final FeatureModelLoadingOptions options) {
        final var effectiveOptions = options == null ? FeatureModelLoadingOptions.defaults() : options;
        return new FeatureModelRepresentationRegistry(effectiveOptions).parse(path, effectiveOptions);
    }

    public static ParsedProjectFeatureModel loadProject(final Path path, final FeatureModelLoadingOptions options,
            final FeatureModelRepresentationRegistry registry) {
        final var effectiveOptions = options == null ? FeatureModelLoadingOptions.defaults() : options;
        return registry.parse(path, effectiveOptions);
    }
}
