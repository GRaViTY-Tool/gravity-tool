package org.gravity.eclipse.java.spl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class HansExpressionHandlerTest {

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
        final Object operation = new Object();
        final var positions = discoverer.getOperationPosition("login", List.of(), List.of(), List.of(), "void",
                operation);

        assertEquals(1, positions.size());
        final var position = positions.iterator().next();
        assertEquals(Set.of("Security::Authentication"), discoverer.getSurroundingHansAnnotations(position));
        // Existing clients use this legacy method; it intentionally exposes the
        // combined annotation view so no converter change is required.
        assertEquals(Set.of("Security::Authentication"), discoverer.getSurroundingAntennaAnnotations(position));
        assertTrue(discoverer.hasFeatureAnnotations());
        assertTrue(discoverer.hasHansAnnotations());
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
        final var handler = new HansExpressionHandler<Object>(source);
        final int start = source.indexOf("void login");
        final int end = source.indexOf('}', start) + 1;
        final var position = new ElementPosition<>(new Object(), "login", start, end);

        assertEquals(Set.of("Authentication", "Logging"), handler.getSurroundingHansAnnotations(position));
    }

    @Test
    public void discoversHansLineAnnotationOnElementStartLine() {
        final String source = """
                class Audit {
                    int level; // &line[Logging]
                }
                """;
        final var handler = new HansExpressionHandler<Object>(source);
        final int start = source.indexOf("int level");
        final int end = source.indexOf(';', start) + 1;
        final var position = new ElementPosition<>(new Object(), "level", start, end);

        assertEquals(Set.of("Logging"), handler.getSurroundingHansAnnotations(position));
    }

    @Test
    public void combinesAntennaAndHansWithoutChangingExistingEntryPoint() throws Exception {
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

        assertEquals(Set.of("ProductA", "Authentication"), discoverer.getSurroundingFeatureAnnotations(position));
        assertEquals(Set.of("ProductA", "Authentication"), discoverer.getSurroundingAntennaAnnotations(position));
        assertTrue(discoverer.containsAntennaAnnotations());
        assertTrue(discoverer.hasHansAnnotations());
    }

    @Test(expected = IllegalStateException.class)
    public void rejectsMismatchedHansBlocks() {
        new HansExpressionHandler<>("// &begin[A]\nint x;\n// &end[B]\n");
    }

    private static JavaProjectSplDiscoverer<Object> discoverer(final String source) throws Exception {
        return new JavaProjectSplDiscoverer<>(
                new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8)), "HansExpressionHandlerTest.java");
    }
}
