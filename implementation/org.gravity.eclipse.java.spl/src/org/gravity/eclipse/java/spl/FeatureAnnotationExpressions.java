package org.gravity.eclipse.java.spl;

import java.util.LinkedHashSet;
import java.util.Set;

/** Utility for combining feature expressions from the supported source annotation syntaxes. */
final class FeatureAnnotationExpressions {

    private FeatureAnnotationExpressions() {
    }

    static <T> Set<String> surrounding(final ElementPosition<? extends T> position,
            final AntennaExpressionHandler<T> antenna, final HansExpressionHandler<T> hans) {
        final Set<String> result = new LinkedHashSet<>();
        if (antenna != null) {
            result.addAll(antenna.getSurroundingAntennaAnnotations(position));
        }
        if (hans != null) {
            result.addAll(hans.getSurroundingHansAnnotations(position));
        }
        return result;
    }
}
