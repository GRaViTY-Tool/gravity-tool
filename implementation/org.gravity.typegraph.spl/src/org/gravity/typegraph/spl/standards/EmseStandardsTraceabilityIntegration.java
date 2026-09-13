package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.spl.features.ParsedProjectFeatureModel;

/** Orchestrates the taxonomy-dependent part of standards traceability. */
public final class EmseStandardsTraceabilityIntegration {

    public static final int EMSE_TAXONOMY_FEATURE_COUNT = EmseSecurityFeatureTaxonomy.FEATURE_COUNT;

    public record Result(ProjectTaxonomyConformance.Result conformance, FeatureStandardsMappingResult mappings,
            StandardTraceabilityBuilder.BuildResult traceability,
            DynamicQualityModelGenerator.GenerationResult qualityModel) {
    }

    public record TraceSecResult(ProjectTaxonomyConformance.Result conformance, FeatureStandardsMappingResult mappings,
            StandardTraceabilityBuilder.BuildResult provenance,
            TraceSecCorrespondenceBuilder.BuildResult correspondences,
            DynamicQualityModelGenerator.GenerationResult qualityModel) {
    }

    private EmseStandardsTraceabilityIntegration() {
    }

    public static Result create(final ParsedProjectFeatureModel project, final FeatureMappingCatalog emseCatalog,
            final Collection<? extends StandardRequirementsModel> standards, final ResourceSet outputResourceSet,
            final TypeGraph programModel, final Path traceabilityEcore, final Path traceabilityXmi,
            final Path qualityModelEcore, final Path qualityModelXmi) throws IOException {
        requireCompleteTaxonomy(emseCatalog);
        final var safe = safeStandards(standards);
        final var resources = safe.stream().map(StandardRequirementsModel::model).toList();
        final var conformance = new ProjectTaxonomyConformance().requireConformant(project, emseCatalog);
        final var mappings = new ProjectFeatureStandardsMapper().map(project, emseCatalog, resources);
        final var traceability = new StandardTraceabilityBuilder().build(outputResourceSet, traceabilityEcore,
                traceabilityXmi, project, mappings, programModel);
        final var qualityModel = new DynamicQualityModelGenerator().generate(outputResourceSet, qualityModelEcore,
                qualityModelXmi, safe);
        return new Result(conformance, mappings, traceability, qualityModel);
    }

    /** Constructs TraceSec artifacts from the pre-generated complete EMSE catalog. */
    public static TraceSecResult createTraceSec(final ParsedProjectFeatureModel project,
            final FeatureMappingCatalog emseCatalog, final Collection<? extends StandardRequirementsModel> standards,
            final ResourceSet outputResourceSet, final TypeGraph programModel, final Path traceabilityEcore,
            final Path traceabilityXmi, final Path correspondenceXmi, final Path qualityModelEcore,
            final Path qualityModelXmi) throws IOException {
        requireCompleteTaxonomy(emseCatalog);
        final FeatureMappingCatalog iso27002 = emseCatalog.filterControls(EmseStandardsTraceabilityIntegration::isIso27002);
        final var built = new TraceSecArtifactBuilder().build(project, iso27002, standards, outputResourceSet,
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

    public static void requireCompleteTaxonomy(final FeatureMappingCatalog emseTaxonomy) {
        if (emseTaxonomy == null) {
            throw new IllegalArgumentException("The complete EMSE taxonomy/mapping catalog is required");
        }
        if (emseTaxonomy.entries().size() != EMSE_TAXONOMY_FEATURE_COUNT) {
            throw new IllegalArgumentException("The EMSE taxonomy catalog must contain exactly "
                    + EMSE_TAXONOMY_FEATURE_COUNT + " canonical features but contains " + emseTaxonomy.entries().size());
        }
    }

    private static List<StandardRequirementsModel> safeStandards(
            final Collection<? extends StandardRequirementsModel> standards) {
        return standards == null ? List.of() : standards.stream().filter(java.util.Objects::nonNull).toList();
    }
}
