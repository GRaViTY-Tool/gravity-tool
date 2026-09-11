package org.gravity.typegraph.spl.standards;

import java.util.Locale;

/** Semantic relation between a project feature and a standard control. */
public enum MappingRelation {
    REALIZES,
    SUPPORTS,
    EQUIVALENT,
    RELATED;

    public static MappingRelation parse(final Object value) {
        if (value == null) {
            return REALIZES;
        }
        final String normalized = value.toString().trim().replace('-', '_').replace(' ', '_')
                .toUpperCase(Locale.ROOT);
        if (normalized.isEmpty()) {
            return REALIZES;
        }
        return switch (normalized) {
        case "IMPLEMENTS", "IMPLEMENTATION", "REALISES" -> REALIZES;
        case "MAPS_TO", "MAPPED_TO" -> RELATED;
        default -> MappingRelation.valueOf(normalized);
        };
    }
}
