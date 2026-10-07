package org.gravity.eclipse.java.spl;

import java.util.Set;

/**
 * @deprecated use {@link AntennaFeatureAnnotationParser}. This compatibility
 *             type preserves the former public API while the implementation is
 *             now a dedicated feature-annotation parser.
 */
@Deprecated
public class AntennaExpressionHandler<T> extends AntennaFeatureAnnotationParser<T> {

    public AntennaExpressionHandler(final CharSequence contents) {
        super(contents);
    }

    public boolean containsAntennaAnnotations() {
        return containsAnnotations();
    }

    public Set<String> getSurroundingAntennaAnnotations(final ElementPosition<? extends T> position) {
        return getSurroundingAnnotations(position);
    }
}
