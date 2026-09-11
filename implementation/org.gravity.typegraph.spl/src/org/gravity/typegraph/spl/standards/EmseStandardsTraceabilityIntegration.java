package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
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

    public record Result(ProjectTaxonomyConformance.Result conformance, FeatureStandardsMappingResult mappings,
            StandardTraceabilityBuilder.BuildResult traceability,
            DynamicQualityModelGenerator.GenerationResult qualityModel) {
    }

    private EmseStandardsTraceabilityIntegration() {
    }

    public static Result create(final ParsedProjectFeatureModel project, final FeatureMappingCatalog emseTaxonomy,
            final Collection<? extends Resource> standardsResources, final ResourceSet outputResourceSet,
            final TypeGraph programModel, final Path traceabilityEcore, final Path traceabilityXmi,
            final Path qualityModelEcore, final Path qualityModelXmi) throws IOException {
        if (emseTaxonomy == null) {
            throw new IllegalArgumentException("The complete EMSE taxonomy/mapping catalog is required");
        }
        final var conformance = new ProjectTaxonomyConformance().requireConformant(project, emseTaxonomy);
        final Collection<? extends Resource> resources = standardsResources == null ? List.of() : standardsResources;
        final var mappings = new ProjectFeatureStandardsMapper().map(project, emseTaxonomy, resources);
        final var traceability = new StandardTraceabilityBuilder().build(outputResourceSet, traceabilityEcore,
                traceabilityXmi, project, mappings, programModel);
        final var qualityModel = new DynamicQualityModelGenerator().generate(outputResourceSet, qualityModelEcore,
                qualityModelXmi, resources);
        return new Result(conformance, mappings, traceability, qualityModel);
    }
}
