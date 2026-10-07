package org.gravity.typegraph.spl.standards;

import java.util.Optional;
import java.util.function.Predicate;

import org.gravity.typegraph.spl.features.ParsedProjectFeatureModel;

import de.ovgu.featureide.fm.core.base.IFeature;

/** Resolves a project feature against the EMSE taxonomy along its parent chain. */
final class ProjectFeatureTaxonomyResolver {

    record Match(IFeature projectFeature, FeatureMappingCatalog.Entry taxonomyEntry) {
    }

    private ProjectFeatureTaxonomyResolver() {
    }

    static Optional<Match> nearest(final ParsedProjectFeatureModel project, final IFeature feature,
            final FeatureMappingCatalog taxonomy) {
        return nearest(project, feature, taxonomy, entry -> true);
    }

    static Optional<Match> nearest(final ParsedProjectFeatureModel project, final IFeature feature,
            final FeatureMappingCatalog taxonomy, final Predicate<FeatureMappingCatalog.Entry> predicate) {
        if (project == null || feature == null || taxonomy == null) {
            return Optional.empty();
        }
        IFeature current = feature;
        while (current != null) {
            final var metadata = project.metadata(current);
            final var entry = taxonomy.resolve(project.sourceName(current), metadata.semanticFeature());
            if (entry.isPresent() && (predicate == null || predicate.test(entry.get()))) {
                return Optional.of(new Match(current, entry.get()));
            }
            final var parent = current.getStructure().getParent();
            current = parent == null ? null : parent.getFeature();
        }
        return Optional.empty();
    }
}
