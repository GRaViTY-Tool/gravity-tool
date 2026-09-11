package org.gravity.eclipse.java.spl;

import java.util.Set;

/**
 * Combined view over the source-level feature annotation syntaxes supported by
 * GRaViTY's Java SPL discoverer.
 */
final class FeatureAnnotationSupport<T> {

    private final AntennaExpressionHandler<T> antenna;
    private final HansExpressionHandler<T> hans;

    FeatureAnnotationSupport(final CharSequence contents) {
        this.antenna = new AntennaExpressionHandler<>(contents);
        this.hans = new HansExpressionHandler<>(contents);
    }

    boolean containsFeatureAnnotations() {
        return this.antenna.containsAntennaAnnotations() || this.hans.containsHansAnnotations();
    }

    boolean containsAntennaAnnotations() {
        return this.antenna.containsAntennaAnnotations();
    }

    boolean containsHansAnnotations() {
        return this.hans.containsHansAnnotations();
    }

    Set<String> getSurroundingFeatureAnnotations(final ElementPosition<? extends T> position) {
        return FeatureAnnotationExpressions.surrounding(position, this.antenna, this.hans);
    }

    Set<String> getSurroundingAntennaAnnotations(final ElementPosition<? extends T> position) {
        return this.antenna.getSurroundingAntennaAnnotations(position);
    }

    Set<String> getSurroundingHansAnnotations(final ElementPosition<? extends T> position) {
        return this.hans.getSurroundingHansAnnotations(position);
    }
}
