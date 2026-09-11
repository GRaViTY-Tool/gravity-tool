package org.gravity.typegraph.spl.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.nio.file.Files;

import org.gravity.typegraph.spl.features.FeatureModelLoadingOptions;
import org.gravity.typegraph.spl.features.HansFeatureModelRepresentation;
import org.junit.Test;

public class HansFeatureModelRepresentationTest {

    @Test
    public void usesShortestUniqueLpqForCollidingHansFeatureNames() throws Exception {
        final var file = Files.createTempFile("gravity-hans", ".feature-model");
        Files.writeString(file, """
                Root
                    Authentication
                        Logging
                    Diagnostics
                        Logging
                    Encryption
                """);

        final var parsed = new HansFeatureModelRepresentation(FeatureModelLoadingOptions.defaults()).parse(file);
        final var model = parsed.featureModel();

        assertNotNull(model.getFeature("Authentication::Logging"));
        assertNotNull(model.getFeature("Diagnostics::Logging"));
        assertNull(model.getFeature("Root::Authentication::Logging"));
        assertNotNull(model.getFeature("Encryption"));
    }
}
