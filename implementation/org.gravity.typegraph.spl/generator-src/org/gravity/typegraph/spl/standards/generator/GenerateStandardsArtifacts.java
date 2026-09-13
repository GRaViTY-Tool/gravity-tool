package org.gravity.typegraph.spl.standards.generator;

import java.nio.file.Path;

/** Command-line wrapper around {@link StandardsReferenceArtifactGenerator}. */
public final class GenerateStandardsArtifacts {

    private GenerateStandardsArtifacts() {
    }

    public static void main(final String[] args) throws Exception {
        if (args.length != 6) {
            System.err.println("Usage: GenerateStandardsArtifacts <iso27002.pdf> <emse-workbook.xlsx> "
                    + "<requirements.ecore> <standard-properties.ecore> <emse-standards.ecore> <output-directory>");
            System.exit(2);
        }
        final var result = StandardsReferenceArtifactGenerator.generate(Path.of(args[0]), Path.of(args[1]),
                Path.of(args[2]), Path.of(args[3]), Path.of(args[4]), Path.of(args[5]));
        System.out.println("Generated:");
        System.out.println("  " + result.requirementsXmi());
        System.out.println("  " + result.propertiesXmi());
        System.out.println("  " + result.emseCatalogXmi());
    }
}
