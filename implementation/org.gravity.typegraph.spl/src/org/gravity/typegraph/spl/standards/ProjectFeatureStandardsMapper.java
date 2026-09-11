package org.gravity.typegraph.spl.standards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gravity.typegraph.spl.features.ParsedProjectFeatureModel;
import org.gravity.typegraph.spl.yaml.ParsedYamlFeatureModel;

import de.ovgu.featureide.fm.core.base.IFeature;

/** Resolves normalized project features to actual Control EObjects. */
public final class ProjectFeatureStandardsMapper {

    public FeatureStandardsMappingResult map(final ParsedProjectFeatureModel project, final FeatureMappingCatalog catalog,
            final Collection<? extends Resource> standardsResources) {
        final StandardControlIndex index = new StandardControlIndex(standardsResources);
        final List<FeatureControlMapping> resolved = new ArrayList<>();
        final List<UnresolvedFeatureControlMapping> unresolved = new ArrayList<>();
        final List<String> unmapped = new ArrayList<>();

        for (final IFeature feature : project.featureModel().getFeatures()) {
            final var metadata = project.metadata(feature);
            final Set<StandardControlReference> references = new LinkedHashSet<>(metadata.directMappings());
            String canonicalFeature = metadata.semanticFeature();
            if (catalog != null) {
                final var entry = catalog.resolve(project.sourceName(feature), metadata.semanticFeature());
                if (entry.isPresent()) {
                    canonicalFeature = entry.get().canonicalFeature();
                    references.addAll(entry.get().controls());
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
                            "No unique Control EObject found for standard='" + reference.standard() + "', control='"
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
