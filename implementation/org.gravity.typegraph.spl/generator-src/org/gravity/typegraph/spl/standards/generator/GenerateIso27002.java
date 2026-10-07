package org.gravity.typegraph.spl.standards.generator;

import java.nio.file.Path;

/** Command-line entry point for the one-time ISO/IEC 27002 artifact generation. */
public final class GenerateIso27002 {
    private GenerateIso27002() {
    }

    public static void main(final String[] args) throws Exception {
        if (args.length != 5) {
            System.err.println("Usage: GenerateIso27002 <iso27002.pdf> <requirements.ecore> <standard-properties.ecore> <requirements.xmi> <properties.xmi>");
            System.exit(2);
        }
        Iso27002ModelGenerator.generate(Path.of(args[0]), Path.of(args[1]), Path.of(args[2]), Path.of(args[3]),
                Path.of(args[4]));
    }
}
