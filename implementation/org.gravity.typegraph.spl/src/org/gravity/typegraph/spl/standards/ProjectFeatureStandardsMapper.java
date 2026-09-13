package org.gravity.typegraph.spl.standards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gravity.typegraph.spl.features.ParsedProjectFeatureModel;
import org.gravity.typegraph.spl.yaml.ParsedYamlFeatureModel;

import de.ovgu.featureide.fm.core.base.IFeature;

/** Resolves normalized project features to TraceSec Requirement EObjects. */
public final class ProjectFeatureStandardsMapper {

    public FeatureStandardsMappingResult map(final ParsedProjectFeatureModel project, final FeatureMappingCatalog catalog,
            final Collection<? extends Resource> standardsResources) {
        return map(project, catalog, standardsResources, reference -> true);
    }

    /**
     * Resolves project features using direct mappings plus the nearest feature-model
     * ancestor whose taxonomy entry has a control accepted by {@code controlFilter}.
     * This lets custom project subfeatures inherit the standard semantics of their
     * EMSE ancestor without adding project-specific names to the taxonomy itself.
     */
    public FeatureStandardsMappingResult map(final ParsedProjectFeatureModel project, final FeatureMappingCatalog catalog,
            final Collection<? extends Resource> standardsResources,
            final Predicate<StandardControlReference> controlFilter) {
        final Predicate<StandardControlReference> accepted = controlFilter == null ? reference -> true : controlFilter;
        final StandardControlIndex index = new StandardControlIndex(standardsResources);
        final List<FeatureControlMapping> resolved = new ArrayList<>();
        final List<UnresolvedFeatureControlMapping> unresolved = new ArrayList<>();
        final List<String> unmapped = new ArrayList<>();

        for (final IFeature feature : project.featureModel().getFeatures()) {
            final var metadata = project.metadata(feature);
            final Set<StandardControlReference> references = new LinkedHashSet<>();
            metadata.directMappings().stream().filter(accepted).forEach(references::add);

            String canonicalFeature = metadata.semanticFeature();
            if (catalog != null) {
                final var taxonomyMatch = ProjectFeatureTaxonomyResolver.nearest(project, feature, catalog);
                if (taxonomyMatch.isPresent()) {
                    canonicalFeature = taxonomyMatch.get().taxonomyEntry().canonicalFeature();
                }

                final var mappedAncestor = ProjectFeatureTaxonomyResolver.nearest(project, feature, catalog,
                        entry -> entry.controls().stream().anyMatch(accepted));
                if (mappedAncestor.isPresent()) {
                    canonicalFeature = mappedAncestor.get().taxonomyEntry().canonicalFeature();
                    mappedAncestor.get().taxonomyEntry().controls().stream().filter(accepted).forEach(references::add);
                }
            }

            if (references.isEmpty()) {
                if (feature.getStructure().getParent() != null) {
                    unmapped.add(project.sourceName(feature));
                }
                continue;
            }

            for (final StandardControlReference reference : references) {
                final var control = index.resolve(reference);
                if (control.isPresent()) {
                    resolved.add(new FeatureControlMapping(feature, control.get(), reference, canonicalFeature));
                } else {
                    unresolved.add(new UnresolvedFeatureControlMapping(project.sourceName(feature), reference,
                            "No unique Requirement EObject found for standard='" + reference.standard() + "', control='"
                                    + reference.control() + "'"));
                }
            }
        }
        return new FeatureStandardsMappingResult(resolved, unresolved, unmapped);
    }

    /** Backwards-compatible adapter for the original YAML-specific API. */
    public FeatureStandardsMappingResult map(final ParsedYamlFeatureModel project, final FeatureMappingCatalog catalog,
            final Collection<? extends Resource> standardsResources) {
        final var names = new java.util.LinkedHashMap<String, String>();
        project.featureModel().getFeatures().forEach(feature -> names.put(feature.getName(), feature.getName()));
        return map(new ParsedProjectFeatureModel(project.featureModel(), project.metadataByFeature(), names, "yaml"), catalog,
                standardsResources);
    }

    public static EObject control(final FeatureControlMapping mapping) {
        return mapping.control();
    }
}
