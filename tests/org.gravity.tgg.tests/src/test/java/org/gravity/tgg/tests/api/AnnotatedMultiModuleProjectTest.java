package org.gravity.tgg.tests.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityAPI;
import org.gravity.eclipse.importer.maven.MavenImport;
import org.gravity.typegraph.spl.ProgramGraphProcessor;
import org.gravity.typegraph.spl.standards.ProgramFeatureLocationIndex;
import org.junit.Test;

/**
 * Regression test for combining Maven multi-module import with SPL presence
 * conditions. Every module contributes a feature-annotated Java type.
 */
public class AnnotatedMultiModuleProjectTest {

    @Test
    public void buildsAnnotatedProgramModelFromAllMavenModules() throws Exception {
        final Path root = Files.createTempDirectory("gravity-annotated-multimodule-");
        IJavaProject imported = null;
        try {
            write(root.resolve("pom.xml"), pom("annotated-reactor", "pom",
                    "<modules><module>first</module><module>second</module></modules>"));
            write(root.resolve("first/pom.xml"), modulePom("first"));
            write(root.resolve("second/pom.xml"), modulePom("second"));
            write(root.resolve("first/src/main/java/study/first/First.java"), """
                    package study.first;
                    //#if FeatureOne
                    public class First {
                        public void first() {}
                    }
                    //#endif
                    """);
            write(root.resolve("second/src/main/java/study/second/Second.java"), """
                    package study.second;
                    // &begin[FeatureTwo]
                    public class Second {
                        public void second() {}
                    }
                    // &end[FeatureTwo]
                    """);

            final var monitor = new NullProgressMonitor();
            imported = new MavenImport(root.toFile(), false).importProject(monitor);
            assertNotNull(imported.findType("study.first.First"));
            assertNotNull(imported.findType("study.second.Second"));

            final var model = GravityAPI.createProgramModel(imported, monitor);
            assertNotNull(model);
            assertNotNull(model.getClass("study.first.First"));
            assertNotNull(model.getClass("study.second.Second"));

            assertTrue("SPL processing failed", new ProgramGraphProcessor().process(model, monitor));
            final var index = new ProgramFeatureLocationIndex(model);
            assertTrue("First module lost its Antenna annotation", index.locations("FeatureOne").stream()
                    .anyMatch(location -> location.programElement() == model.getClass("study.first.First")));
            assertTrue("Second module lost its HAnS annotation", index.locations("FeatureTwo").stream()
                    .anyMatch(location -> location.programElement() == model.getClass("study.second.Second")));
        } finally {
            if (imported != null && imported.getProject().exists()) {
                imported.getProject().delete(true, new NullProgressMonitor());
            }
            try (var paths = Files.walk(root)) {
                for (final Path path : paths.sorted(Comparator.reverseOrder()).toList()) {
                    Files.deleteIfExists(path);
                }
            }
        }
    }

    private static String modulePom(final String artifact) {
        return pom(artifact, "jar", "");
    }

    private static String pom(final String artifact, final String packaging, final String extra) {
        return """
                <project xmlns="http://maven.apache.org/POM/4.0.0">
                  <modelVersion>4.0.0</modelVersion>
                  <groupId>org.gravity.study</groupId>
                  <artifactId>%s</artifactId>
                  <version>1.0.0</version>
                  <packaging>%s</packaging>
                  <properties><maven.compiler.release>21</maven.compiler.release></properties>
                  %s
                </project>
                """.formatted(artifact, packaging, extra);
    }

    private static void write(final Path path, final String contents) throws IOException {
        Files.createDirectories(path.getParent());
        Files.writeString(path, contents);
    }
}
