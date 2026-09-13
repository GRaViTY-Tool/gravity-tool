package org.gravity.typegraph.spl.standards.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Small API for generating the reusable standards artifacts used by experiments.
 * <p>
 * The generated files are independent of any analyzed project and can be reused
 * across runs until the source standard/workbook changes.
 */
public final class StandardsReferenceArtifactGenerator {

    public record Result(Path requirementsXmi, Path propertiesXmi, Path emseCatalogXmi) {
    }

    private StandardsReferenceArtifactGenerator() {
    }

    public static Result generate(final Path iso27002Pdf, final Path emseWorkbook, final Path requirementsEcore,
            final Path propertiesEcore, final Path emseCatalogEcore, final Path outputDirectory) throws IOException {
        if (iso27002Pdf == null || emseWorkbook == null || requirementsEcore == null || propertiesEcore == null
                || emseCatalogEcore == null || outputDirectory == null) {
            throw new IllegalArgumentException("All generator input paths must be provided");
        }
        Files.createDirectories(outputDirectory);
        final Path requirementsXmi = outputDirectory.resolve("iso27002.requirements.xmi");
        final Path propertiesXmi = outputDirectory.resolve("iso27002.properties.xmi");
        final Path emseCatalogXmi = outputDirectory.resolve("emse-standards.xmi");

        Iso27002ModelGenerator.generate(iso27002Pdf, requirementsEcore, propertiesEcore,
                requirementsXmi, propertiesXmi);
        EmseStandardsArtifactGenerator.generate(emseWorkbook, emseCatalogEcore, emseCatalogXmi);
        return new Result(requirementsXmi, propertiesXmi, emseCatalogXmi);
    }
}
