package org.gravity.typegraph.spl.standards;

/** Diagnostic for a mapping declaration whose standard control was not found. */
public record UnresolvedFeatureControlMapping(String feature, StandardControlReference reference, String message) {
}
