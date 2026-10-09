package org.gravity.eclipse.java.spl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class FeatureAnnotationParserTest {

    @Test
    public void antennaAndHansAreIndependentParserSubclasses() {
        final String source = """
                //#if ProductA
                // &begin[Security::Authentication]
                void login() {}
                // &end[Security::Authentication]
                //#endif
                """;

        final FeatureAnnotationParser<Object> antenna = new AntennaFeatureAnnotationParser<>(source);
        final FeatureAnnotationParser<Object> hans = new HansFeatureAnnotationParser<>(source);

        assertTrue(antenna instanceof AbstractFeatureAnnotationParser<?>);
        assertTrue(hans instanceof AbstractFeatureAnnotationParser<?>);
        assertEquals("antenna", antenna.id());
        assertEquals("hans", hans.id());
        assertTrue(antenna.containsAnnotations());
        assertTrue(hans.containsAnnotations());

        final int start = source.indexOf("void login");
        final int end = source.indexOf('}', start) + 1;
        final var position = new ElementPosition<>(new Object(), "login", start, end);
        assertEquals(Set.of("ProductA"), antenna.getSurroundingAnnotations(position));
        assertEquals(Set.of("Security::Authentication"), hans.getSurroundingAnnotations(position));
    }

    @Test
    public void discoversHansBlockAroundOperation() throws Exception {
        final String source = """
                class LoginService {
                    // &begin[Security::Authentication]
                    void login() {
                    }
                    // &end[Security::Authentication]
                }
                """;

        final var discoverer = discoverer(source);
        final var positions = discoverer.getOperationPosition("login", List.of(), List.of(), List.of(), "void",
                new Object());

        assertEquals(1, positions.size());
        final var position = positions.iterator().next();
        assertEquals(Set.of("Security::Authentication"), discoverer.getSurroundingHansAnnotations(position));
        assertTrue(discoverer.hasHansAnnotations());
        assertFalse(discoverer.containsAntennaAnnotations());
    }

    @Test
    public void discoversNestedHansBlocks() {
        final String source = """
                // &begin[Authentication]
                // &begin[Logging]
                void login() {}
                // &end[Logging]
                // &end[Authentication]
                """;
        final FeatureAnnotationParser<Object> parser = new HansFeatureAnnotationParser<>(source);
        final int start = source.indexOf("void login");
        final int end = source.indexOf('}', start) + 1;
        final var position = new ElementPosition<>(new Object(), "login", start, end);

        assertEquals(Set.of("Authentication", "Logging"), parser.getSurroundingAnnotations(position));
    }

    @Test
    public void discoversHansLineAnnotationOnElementStartLine() {
        final String source = """
                class Audit {
                    int level; // &line[Logging]
                }
                """;
        final FeatureAnnotationParser<Object> parser = new HansFeatureAnnotationParser<>(source);
        final int start = source.indexOf("int level");
        final int end = source.indexOf(';', start) + 1;
        final var position = new ElementPosition<>(new Object(), "level", start, end);

        assertEquals(Set.of("Logging"), parser.getSurroundingAnnotations(position));
    }

    @Test
    public void discovererCombinesParsersButKeepsSyntaxSpecificAccess() throws Exception {
        final String source = """
                class LoginService {
                    //#if ProductA
                    // &begin[Authentication]
                    void login() {
                    }
                    // &end[Authentication]
                    //#endif
                }
                """;

        final var discoverer = discoverer(source);
        final var positions = discoverer.getOperationPosition("login", List.of(), List.of(), List.of(), "void",
                new Object());
        final var position = positions.iterator().next();

        assertEquals(2, discoverer.getAnnotationParsers().size());
        assertTrue(discoverer.getAnnotationParsers().get(0) instanceof AntennaFeatureAnnotationParser<?>);
        assertTrue(discoverer.getAnnotationParsers().get(1) instanceof HansFeatureAnnotationParser<?>);
        assertEquals(Set.of("ProductA"), discoverer.getSurroundingOnlyAntennaAnnotations(position));
        assertEquals(Set.of("Authentication"), discoverer.getSurroundingHansAnnotations(position));
        assertEquals(Set.of("ProductA", "Authentication"), discoverer.getSurroundingFeatureAnnotations(position));
    }

    @Test(expected = IllegalStateException.class)
    public void hansParserRejectsMismatchedBlocks() {
        new HansFeatureAnnotationParser<>("// &begin[A]\nint x;\n// &end[B]\n");
    }

    private static JavaProjectSplDiscoverer<Object> discoverer(final String source) throws Exception {
        return new JavaProjectSplDiscoverer<>(
                new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8)), "FeatureAnnotationParserTest.java");
    }
}
