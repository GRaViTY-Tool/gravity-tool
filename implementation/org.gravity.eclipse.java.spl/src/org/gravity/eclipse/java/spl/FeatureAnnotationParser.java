package org.gravity.eclipse.java.spl;

import java.util.Set;

/**
 * Common interface for source-level feature annotation parsers.
 *
 * @param <T> type of represented program-model elements
 */
public interface FeatureAnnotationParser<T> {

    /**
     * Stable identifier of the supported annotation syntax.
     *
     * @return parser identifier
     */
    String id();

    /**
     * @return {@code true} if at least one annotation of this syntax occurs in
     *         the parsed source
     */
    boolean containsAnnotations();

    /**
     * Returns all feature expressions of this syntax that apply to the given
     * program element.
     *
     * @param position source position of the program element
     * @return applicable feature expressions
     */
    Set<String> getSurroundingAnnotations(ElementPosition<? extends T> position);
}
