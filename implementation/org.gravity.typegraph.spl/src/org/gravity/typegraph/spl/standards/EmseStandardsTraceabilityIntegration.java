package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

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

    /** Complete artifact set needed by TraceSec's flow-network construction. */
    public record TraceSecResult(ProjectTaxonomyConformance.Result conformance, FeatureStandardsMappingResult mappings,
            StandardTraceabilityBuilder.BuildResult provenance,
            TraceSecCorrespondenceBuilder.BuildResult correspondences,
            DynamicQualityModelGenerator.GenerationResult qualityModel) {
    }

    private EmseStandardsTraceabilityIntegration() {
    }

    /** Creates the integration using an already combined taxonomy/mapping catalog. */
    public static Result create(final ParsedProjectFeatureModel project, final FeatureMappingCatalog emseTaxonomy,
            final Collection<Iso2700xPdfImporter.ImportResult> standardsImports,
            final ResourceSet outputResourceSet, final TypeGraph programModel, final Path traceabilityEcore,
            final Path traceabilityXmi, final Path qualityModelEcore, final Path qualityModelXmi) throws IOException {
        requireCompleteTaxonomy(emseTaxonomy);
        final var imports = safeImports(standardsImports);
        final var resources = imports.stream().map(Iso2700xPdfImporter.ImportResult::model).toList();
        final var conformance = new ProjectTaxonomyConformance().requireConformant(project, emseTaxonomy);
        final var mappings = new ProjectFeatureStandardsMapper().map(project, emseTaxonomy, resources);
        final var traceability = new StandardTraceabilityBuilder().build(outputResourceSet, traceabilityEcore,
                traceabilityXmi, project, mappings, programModel);
        final var qualityModel = new DynamicQualityModelGenerator().generate(outputResourceSet, qualityModelEcore,
                qualityModelXmi, imports);
        return new Result(conformance, mappings, traceability, qualityModel);
    }

    /**
     * Creates the integration using the built-in final 68-feature EMSE taxonomy and
     * the authoritative standards mapping from the replication-package workbook.
     */
    public static Result create(final ParsedProjectFeatureModel project, final Path replicationPackageStandardsWorkbook,
            final Collection<Iso2700xPdfImporter.ImportResult> standardsImports,
            final ResourceSet outputResourceSet, final TypeGraph programModel, final Path traceabilityEcore,
            final Path traceabilityXmi, final Path qualityModelEcore, final Path qualityModelXmi) throws IOException {
        return create(project, EmseSecurityFeatureTaxonomy.catalog(), replicationPackageStandardsWorkbook,
                standardsImports, outputResourceSet, programModel, traceabilityEcore, traceabilityXmi,
                qualityModelEcore, qualityModelXmi);
    }

    /**
     * Creates the integration using a caller-supplied complete taxonomy plus the
     * authoritative standards-to-feature mapping from the replication workbook.
     */
    public static Result create(final ParsedProjectFeatureModel project, final FeatureMappingCatalog emseTaxonomy,
            final Path replicationPackageStandardsWorkbook,
            final Collection<Iso2700xPdfImporter.ImportResult> standardsImports,
            final ResourceSet outputResourceSet, final TypeGraph programModel, final Path traceabilityEcore,
            final Path traceabilityXmi, final Path qualityModelEcore, final Path qualityModelXmi) throws IOException {
        requireCompleteTaxonomy(emseTaxonomy);
        final FeatureMappingCatalog workbookMappings = EmseSecurityStandardsWorkbookParser
                .parse(replicationPackageStandardsWorkbook);
        final FeatureMappingCatalog combined = mergeTaxonomyAndMappings(emseTaxonomy, workbookMappings);
        return create(project, combined, standardsImports, outputResourceSet, programModel, traceabilityEcore,
                traceabilityXmi, qualityModelEcore, qualityModelXmi);
    }

    /**
     * Constructs the TraceSec input artifacts using the built-in taxonomy and the
     * authoritative ISO/IEC 27002 mappings. Execution of TraceSec is intentionally
     * separate; use {@link TraceSecExecutor} after these artifacts are serialized.
     */
    public static TraceSecResult createTraceSec(final ParsedProjectFeatureModel project,
            final Path replicationPackageStandardsWorkbook,
            final Collection<Iso2700xPdfImporter.ImportResult> iso27002Imports,
            final ResourceSet outputResourceSet, final TypeGraph programModel, final Path traceabilityEcore,
            final Path traceabilityXmi, final Path correspondenceXmi, final Path qualityModelEcore,
            final Path qualityModelXmi) throws IOException {
        final FeatureMappingCatalog taxonomy = EmseSecurityFeatureTaxonomy.catalog();
        requireCompleteTaxonomy(taxonomy);
        final FeatureMappingCatalog workbookMappings = EmseSecurityStandardsWorkbookParser
                .parse(replicationPackageStandardsWorkbook);
        final FeatureMappingCatalog combined = mergeTaxonomyAndMappings(taxonomy, workbookMappings)
                .filterControls(EmseStandardsTraceabilityIntegration::isIso27002);

        final var built = new TraceSecArtifactBuilder().build(project, combined, iso27002Imports, outputResourceSet,
                programModel, traceabilityEcore, traceabilityXmi, correspondenceXmi, qualityModelEcore, qualityModelXmi);
        return new TraceSecResult(built.conformance(), built.mappings(), built.provenance(), built.correspondences(),
                built.qualityModel());
    }

    public static boolean isIso27002(final StandardControlReference reference) {
        if (reference == null) {
            return false;
        }
        final String normalized = reference.standard().toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", "");
        return normalized.contains("27002");
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

    private static List<Iso2700xPdfImporter.ImportResult> safeImports(
            final Collection<Iso2700xPdfImporter.ImportResult> imports) {
        return imports == null ? List.of() : imports.stream().filter(java.util.Objects::nonNull).toList();
    }
}
