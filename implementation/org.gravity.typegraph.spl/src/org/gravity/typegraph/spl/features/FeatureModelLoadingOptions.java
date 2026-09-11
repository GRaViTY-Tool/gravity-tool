package org.gravity.typegraph.spl.features;

/** Options controlling project feature representation loading. */
public record FeatureModelLoadingOptions(String representationId, HansNameStrategy hansNameStrategy,
        boolean hansMandatory) {

    public enum HansNameStrategy {
        /** Require HAnS leaf names to be globally unique. */
        SIMPLE_STRICT,
        /** Use the HAnS LPQ (Parent::Child) only when a simple name collides. */
        QUALIFY_ON_COLLISION,
        /** Always use the complete HAnS LPQ as the FeatureIDE feature name. */
        ALWAYS_QUALIFIED
    }

    public FeatureModelLoadingOptions {
        representationId = representationId == null ? "auto" : representationId.trim().toLowerCase();
        hansNameStrategy = hansNameStrategy == null ? HansNameStrategy.QUALIFY_ON_COLLISION : hansNameStrategy;
    }

    public static FeatureModelLoadingOptions defaults() {
        return new FeatureModelLoadingOptions("auto", HansNameStrategy.QUALIFY_ON_COLLISION, true);
    }

    public static FeatureModelLoadingOptions representation(final String id) {
        final var defaults = defaults();
        return new FeatureModelLoadingOptions(id, defaults.hansNameStrategy(), defaults.hansMandatory());
    }
}
