package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.spl.features.ParsedProjectFeatureModel;

/**
 * Orchestrates the taxonomy-dependent part of standards traceability.
 * <p>
 * Source annotations and program-model enrichment are intentionally outside of
 * this class. A project only needs to conform to the EMSE taxonomy when this
 * standards-mapping workflow is requested.
 */
public final class EmseStandardsTraceabilityIntegration {

    public static final int EMSE_TAXONOMY_FEATURE_COUNT = EmseSecurityFeatureTaxonomy.FEATURE_COUNT;

    public record Result(ProjectTaxonomyConformance.Result conformance, FeatureStandardsMappingResult mappings,
            StandardTraceabilityBuilder.BuildResult traceability,
            DynamicQualityModelGenerator.GenerationResult qualityModel) {
    }

    private EmseStandardsTraceabilityIntegration() {
    }

    /** Creates the integration using an already combined taxonomy/mapping catalog. */
    public static Result create(final ParsedProjectFeatureModel project, final FeatureMappingCatalog emseTaxonomy,
            final Collection<? extends Resource> standardsResources, final ResourceSet outputResourceSet,
            final TypeGraph programModel, final Path traceabilityEcore, final Path traceabilityXmi,
            final Path qualityModelEcore, final Path qualityModelXmi) throws IOException {
        requireCompleteTaxonomy(emseTaxonomy);
        final var conformance = new ProjectTaxonomyConformance().requireConformant(project, emseTaxonomy);
        final Collection<? extends Resource> resources = standardsResources == null ? List.of() : standardsResources;
        final var mappings = new ProjectFeatureStandardsMapper().map(project, emseTaxonomy, resources);
        final var traceability = new StandardTraceabilityBuilder().build(outputResourceSet, traceabilityEcore,
                traceabilityXmi, project, mappings, programModel);
        final var qualityModel = new DynamicQualityModelGenerator().generate(outputResourceSet, qualityModelEcore,
                qualityModelXmi, resources);
        return new Result(conformance, mappings, traceability, qualityModel);
    }

    /**
     * Creates the integration using the built-in final 68-feature EMSE taxonomy and
     * the authoritative standards mapping from the replication-package workbook.
     */
    public static Result create(final ParsedProjectFeatureModel project, final Path replicationPackageStandardsWorkbook,
            final Collection<? extends Resource> standardsResources, final ResourceSet outputResourceSet,
            final TypeGraph programModel, final Path traceabilityEcore, final Path traceabilityXmi,
            final Path qualityModelEcore, final Path qualityModelXmi) throws IOException {
        return create(project, EmseSecurityFeatureTaxonomy.catalog(), replicationPackageStandardsWorkbook,
                standardsResources, outputResourceSet, programModel, traceabilityEcore, traceabilityXmi,
                qualityModelEcore, qualityModelXmi);
    }

    /**
     * Creates the integration using a caller-supplied complete taxonomy plus the
     * authoritative standards-to-feature mapping from the replication workbook.
     */
    public static Result create(final ParsedProjectFeatureModel project, final FeatureMappingCatalog emseTaxonomy,
            final Path replicationPackageStandardsWorkbook,
            final Collection<? extends Resource> standardsResources, final ResourceSet outputResourceSet,
            final TypeGraph programModel, final Path traceabilityEcore, final Path traceabilityXmi,
            final Path qualityModelEcore, final Path qualityModelXmi) throws IOException {
        requireCompleteTaxonomy(emseTaxonomy);
        final FeatureMappingCatalog workbookMappings = EmseSecurityStandardsWorkbookParser
                .parse(replicationPackageStandardsWorkbook);
        final FeatureMappingCatalog combined = mergeTaxonomyAndMappings(emseTaxonomy, workbookMappings);
        return create(project, combined, standardsResources, outputResourceSet, programModel, traceabilityEcore,
                traceabilityXmi, qualityModelEcore, qualityModelXmi);
    }

    /**
     * Adds workbook-derived control references to the complete 68-feature taxonomy
     * while preserving project aliases. A workbook mapping that cannot be resolved
     * to a taxonomy entry is rejected instead of silently extending the taxonomy.
     */
    public static FeatureMappingCatalog mergeTaxonomyAndMappings(final FeatureMappingCatalog taxonomy,
            final FeatureMappingCatalog standardsMappings) {
        requireCompleteTaxonomy(taxonomy);
        if (standardsMappings == null) {
            return taxonomy;
        }

        final List<FeatureMappingCatalog.Entry> merged = new ArrayList<>();
        final LinkedHashSet<FeatureMappingCatalog.Entry> consumedMappings = new LinkedHashSet<>();
        for (final FeatureMappingCatalog.Entry taxonomyEntry : taxonomy.entries()) {
            final LinkedHashSet<StandardControlReference> controls = new LinkedHashSet<>(taxonomyEntry.controls());
            final var mapping = standardsMappings.resolve(taxonomyEntry.canonicalFeature(), taxonomyEntry.canonicalFeature());
            if (mapping.isPresent()) {
                controls.addAll(mapping.get().controls());
                consumedMappings.add(mapping.get());
            }
            for (final String alias : taxonomyEntry.aliases()) {
                standardsMappings.resolve(alias, alias).ifPresent(aliasMapping -> {
                    controls.addAll(aliasMapping.controls());
                    consumedMappings.add(aliasMapping);
                });
            }
            merged.add(FeatureMappingCatalog.entry(taxonomyEntry.canonicalFeature(), taxonomyEntry.aliases(),
                    List.copyOf(controls)));
        }

        final List<String> unknown = standardsMappings.entries().stream().filter(entry -> !consumedMappings.contains(entry))
                .map(FeatureMappingCatalog.Entry::canonicalFeature).toList();
        if (!unknown.isEmpty()) {
            throw new IllegalArgumentException("Replication-package mappings contain features not present in the "
                    + "supplied 68-feature EMSE taxonomy: " + unknown);
        }
        return new FeatureMappingCatalog(merged);
    }

    public static void requireCompleteTaxonomy(final FeatureMappingCatalog emseTaxonomy) {
        if (emseTaxonomy == null) {
            throw new IllegalArgumentException("The complete EMSE taxonomy/mapping catalog is required");
        }
        if (emseTaxonomy.entries().size() != EMSE_TAXONOMY_FEATURE_COUNT) {
            throw new IllegalArgumentException("The EMSE taxonomy catalog must contain exactly "
                    + EMSE_TAXONOMY_FEATURE_COUNT + " canonical features but contains "
                    + emseTaxonomy.entries().size());
        }
    }
}
