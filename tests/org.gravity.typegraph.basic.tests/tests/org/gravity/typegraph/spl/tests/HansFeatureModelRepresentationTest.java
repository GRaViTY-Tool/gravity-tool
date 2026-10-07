package org.gravity.typegraph.spl.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

        assertTrue(parsed.hasFeature("Authentication::Logging"));
        assertTrue(parsed.hasFeature("Diagnostics::Logging"));
        assertFalse(parsed.hasFeature("Root::Authentication::Logging"));
        assertTrue(parsed.hasFeature("Encryption"));
    }
}
