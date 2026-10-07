package org.gravity.typegraph.spl.standards;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.gravity.typegraph.spl.features.ParsedProjectFeatureModel;

import de.ovgu.featureide.fm.core.base.IFeature;

/**
 * Checks whether project features can be resolved to a supplied canonical
 * feature taxonomy. The taxonomy is represented by a {@link FeatureMappingCatalog}
 * so canonical names and aliases are shared with the standards-mapping step.
 * <p>
 * Custom project features are accepted when one of their FeatureIDE ancestors is
 * a taxonomy feature. This allows projects to refine the EMSE taxonomy with local
 * subfeatures while retaining a well-defined standards interpretation.
 * <p>
 * This check is intentionally not used by source annotation parsing or program
 * model enrichment. It is a prerequisite only for taxonomy-based standards
 * traceability.
 */
public final class ProjectTaxonomyConformance {

    public record Result(Map<String, String> canonicalFeatures, List<String> unknownFeatures) {
        public Result {
            canonicalFeatures = Map.copyOf(canonicalFeatures);
            unknownFeatures = List.copyOf(unknownFeatures);
        }

        public boolean isConformant() {
            return unknownFeatures.isEmpty();
        }
    }

    public Result check(final ParsedProjectFeatureModel project, final FeatureMappingCatalog taxonomy) {
        if (project == null) {
            throw new IllegalArgumentException("project must not be null");
        }
        if (taxonomy == null) {
            throw new IllegalArgumentException("taxonomy must not be null");
        }

        final Map<String, String> resolved = new LinkedHashMap<>();
        final List<String> unknown = new ArrayList<>();
        final IFeature root = project.featureModel().getStructure().getRoot() == null ? null
                : project.featureModel().getStructure().getRoot().getFeature();

        for (final IFeature feature : project.featureModel().getFeatures()) {
            if (feature == root) {
                continue;
            }
            final var match = ProjectFeatureTaxonomyResolver.nearest(project, feature, taxonomy);
            if (match.isPresent()) {
                resolved.put(feature.getName(), match.get().taxonomyEntry().canonicalFeature());
            } else {
                unknown.add(project.sourceName(feature));
            }
        }
        return new Result(resolved, unknown);
    }

    public Result requireConformant(final ParsedProjectFeatureModel project, final FeatureMappingCatalog taxonomy) {
        final Result result = check(project, taxonomy);
        if (!result.isConformant()) {
            throw new IllegalArgumentException(
                    "Project feature model does not conform to the supplied security-feature taxonomy. "
                            + "Every non-root feature must either be a taxonomy feature/alias or descend from one. "
                            + "Unknown features: " + result.unknownFeatures());
        }
        return result;
    }
}
