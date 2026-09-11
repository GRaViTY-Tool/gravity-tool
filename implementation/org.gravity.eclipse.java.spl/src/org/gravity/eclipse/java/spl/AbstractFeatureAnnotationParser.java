package org.gravity.eclipse.java.spl;

/**
 * Base class for feature annotation parsers operating on one source file.
 *
 * @param <T> type of represented program-model elements
 */
public abstract class AbstractFeatureAnnotationParser<T> implements FeatureAnnotationParser<T> {

    private final CharSequence contents;

    protected AbstractFeatureAnnotationParser(final CharSequence contents) {
        this.contents = contents == null ? "" : contents;
    }

    protected final CharSequence contents() {
        return this.contents;
    }
}
