package org.gravity.typegraph.spl;

import java.nio.file.Path;
import java.util.Locale;

import org.gravity.typegraph.spl.yaml.YamlFeatureModelParser;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;
import de.ovgu.featureide.fm.core.io.manager.FeatureModelManager;

/**
 * Loads FeatureIDE feature models and additionally supports YAML project feature
 * descriptions used by GRaViTY.
 */
public final class FeatureModelLoader {

    private FeatureModelLoader() {
        // Utility class.
    }

    /**
     * Loads a feature model from a FeatureIDE-supported format or YAML.
     *
     * @param path the feature-model path
     * @return the loaded in-memory FeatureIDE model
     */
    public static IFeatureModel load(final Path path) {
        FMCoreLibrary.getInstance().install();
        final String fileName = path.getFileName().toString().toLowerCase(Locale.ROOT);
        if (fileName.endsWith(".yaml") || fileName.endsWith(".yml")) {
            return new YamlFeatureModelParser().parse(path).featureModel();
        }
        return FeatureModelManager.load(path);
    }
}
