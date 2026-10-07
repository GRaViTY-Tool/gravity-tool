package org.gravity.typegraph.spl.standards;

/**
 * Stable textual reference used in YAML/catalog files before it is resolved to
 * an EObject from the standards model.
 */
public record StandardControlReference(String standard, String control, MappingRelation relation, String source,
        double confidence) {

    public StandardControlReference {
        standard = standard == null ? "" : standard.trim();
        control = control == null ? "" : control.trim();
        relation = relation == null ? MappingRelation.REALIZES : relation;
        source = source == null ? "" : source.trim();
        if ((confidence < 0.0d) || (confidence > 1.0d)) {
            throw new IllegalArgumentException("confidence must be in [0,1]");
        }
        if (control.isEmpty()) {
            throw new IllegalArgumentException("A standard control identifier is required");
        }
    }

    public StandardControlReference(final String standard, final String control) {
        this(standard, control, MappingRelation.REALIZES, "", 1.0d);
    }
}
