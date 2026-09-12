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
 * this class. A project only needs to conform to the supplied EMSE taxonomy when
 * this standards-mapping workflow is requested.
 */
public final class EmseStandardsTraceabilityIntegration {

    /** Number of functional security features in the published EMSE taxonomy. */
    public static final int EMSE_TAXONOMY_FEATURE_COUNT = 68;

    public record Result(ProjectTaxonomyConformance.Result conformance, FeatureStandardsMappingResult mappings,
            StandardTraceabilityBuilder.BuildResult traceability,
            DynamicQualityModelGenerator.GenerationResult qualityModel) {
    }

    private EmseStandardsTraceabilityIntegration() {
    }

    /**
     * Creates the integration using an already combined taxonomy/mapping catalog.
     */
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
     * Creates the integration using the authoritative standards-to-feature mapping
     * from the EMSE replication-package workbook.
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
     * while preserving taxonomy aliases. A mapping to an unknown feature is treated
     * as a data/schema mismatch rather than silently extending the taxonomy.
     */
    public static FeatureMappingCatalog mergeTaxonomyAndMappings(final FeatureMappingCatalog taxonomy,
            final FeatureMappingCatalog standardsMappings) {
        requireCompleteTaxonomy(taxonomy);
        if (standardsMappings == null) {
            return taxonomy;
        }

        final List<FeatureMappingCatalog.Entry> merged = new ArrayList<>();
        for (final FeatureMappingCatalog.Entry taxonomyEntry : taxonomy.entries()) {
            final LinkedHashSet<StandardControlReference> controls = new LinkedHashSet<>(taxonomyEntry.controls());
            standardsMappings.resolve(taxonomyEntry.canonicalFeature(), taxonomyEntry.canonicalFeature())
                    .ifPresent(mapping -> controls.addAll(mapping.controls()));
            merged.add(FeatureMappingCatalog.entry(taxonomyEntry.canonicalFeature(), taxonomyEntry.aliases(),
                    List.copyOf(controls)));
        }

        final List<String> unknown = new ArrayList<>();
        for (final FeatureMappingCatalog.Entry mapping : standardsMappings.entries()) {
            if (taxonomy.resolve(mapping.canonicalFeature(), mapping.canonicalFeature()).isEmpty()) {
                unknown.add(mapping.canonicalFeature());
            }
        }
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
