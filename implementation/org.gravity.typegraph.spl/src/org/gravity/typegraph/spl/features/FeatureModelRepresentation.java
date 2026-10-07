package org.gravity.typegraph.spl.features;

import java.nio.file.Path;

/**
 * Adapter for a concrete project feature-model representation.
 *
 * <p>Implementations normalize their source format to the FeatureIDE
 * {@code IFeatureModel} used by GRaViTY and may provide additional names used
 * when mapping project features to canonical security features.</p>
 */
public interface FeatureModelRepresentation {

    /** Stable identifier used for explicit representation selection. */
    String id();

    /**
     * Returns whether this adapter can load the given path during automatic
     * format detection.
     */
    boolean supports(Path path);

    /** Loads and normalizes the feature model. */
    ParsedProjectFeatureModel parse(Path path);
}
