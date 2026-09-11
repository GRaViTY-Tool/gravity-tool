package org.gravity.typegraph.spl.features;

import java.nio.file.Path;
import java.util.LinkedHashMap;

import de.ovgu.featureide.fm.core.init.FMCoreLibrary;
import de.ovgu.featureide.fm.core.io.manager.FeatureModelManager;

/** Fallback adapter for formats natively supported by FeatureIDE. */
public final class FeatureIdeModelRepresentation implements FeatureModelRepresentation {

    @Override
    public String id() {
        return "featureide";
    }

    @Override
    public boolean supports(final Path path) {
        return path != null;
    }

    @Override
    public ParsedProjectFeatureModel parse(final Path path) {
        FMCoreLibrary.getInstance().install();
        final var model = FeatureModelManager.load(path);
        if (model == null) {
            throw new IllegalArgumentException("FeatureIDE could not load feature model: " + path);
        }
        final var sourceNames = new LinkedHashMap<String, String>();
        model.getFeatures().forEach(feature -> sourceNames.put(feature.getName(), feature.getName()));
        return new ParsedProjectFeatureModel(model, java.util.Map.of(), sourceNames, id());
    }
}
