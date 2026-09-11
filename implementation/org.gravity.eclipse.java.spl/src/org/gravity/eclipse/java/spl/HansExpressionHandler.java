package org.gravity.eclipse.java.spl;

import java.util.Set;

/**
 * @deprecated use {@link HansFeatureAnnotationParser}. This compatibility type
 *             preserves the former public API while the implementation is now
 *             a dedicated feature-annotation parser.
 */
@Deprecated
public class HansExpressionHandler<T> extends HansFeatureAnnotationParser<T> {

    public HansExpressionHandler(final CharSequence contents) {
        super(contents);
    }

    public boolean containsHansAnnotations() {
        return containsAnnotations();
    }

    public Set<String> getSurroundingHansAnnotations(final ElementPosition<? extends T> position) {
        return getSurroundingAnnotations(position);
    }
}
