package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.spl.features.ParsedProjectFeatureModel;

/** Constructs the standards-derived artifacts consumed by TraceSec. */
public final class TraceSecArtifactBuilder {

    public record BuildResult(ProjectTaxonomyConformance.Result conformance, FeatureStandardsMappingResult mappings,
            StandardTraceabilityBuilder.BuildResult provenance,
            TraceSecCorrespondenceBuilder.BuildResult correspondences,
            DynamicQualityModelGenerator.GenerationResult qualityModel) {
    }

    public BuildResult build(final ParsedProjectFeatureModel project, final FeatureMappingCatalog taxonomyAndMappings,
            final Collection<StandardRequirementsModel> standards, final ResourceSet outputResourceSet,
            final TypeGraph programModel, final Path traceabilityEcore, final Path traceabilityXmi,
            final Path correspondenceXmi, final Path qualityModelEcore, final Path qualityModelXmi) throws IOException {
        if (project == null || taxonomyAndMappings == null || outputResourceSet == null || programModel == null) {
            throw new IllegalArgumentException(
                    "project, taxonomyAndMappings, outputResourceSet, and programModel must not be null");
        }
        final List<StandardRequirementsModel> iso27002 = standards == null ? List.of()
                : standards.stream().filter(model -> model != null && model.isIso27002()).toList();
        final List<Resource> requirementsResources = iso27002.stream().map(StandardRequirementsModel::model).toList();

        final var conformance = new ProjectTaxonomyConformance().requireConformant(project, taxonomyAndMappings);
        final var mappings = new ProjectFeatureStandardsMapper().map(project, taxonomyAndMappings, requirementsResources,
                EmseStandardsTraceabilityIntegration::isIso27002);
        final var provenance = new StandardTraceabilityBuilder().build(outputResourceSet, traceabilityEcore,
                traceabilityXmi, project, mappings, programModel);
        final var correspondences = new TraceSecCorrespondenceBuilder().build(outputResourceSet, correspondenceXmi,
                project, mappings, programModel);
        final var qualityModel = new DynamicQualityModelGenerator().generate(outputResourceSet, qualityModelEcore,
                qualityModelXmi, iso27002);
        return new BuildResult(conformance, mappings, provenance, correspondences, qualityModel);
    }
}
