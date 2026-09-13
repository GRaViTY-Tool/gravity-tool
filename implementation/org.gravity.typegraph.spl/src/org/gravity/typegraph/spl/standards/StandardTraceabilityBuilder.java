package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.spl.features.ParsedProjectFeatureModel;

/**
 * Persists provenance for the join between EMSE taxonomy features, TraceSec
 * standard requirements, and program-model locations. This sidecar records the
 * canonical/project feature names, workbook evidence, presence conditions, and
 * resolved EObjects. TraceSec itself consumes the native requirement-to-code
 * correspondence model produced by {@link TraceSecCorrespondenceBuilder}.
 */
public final class StandardTraceabilityBuilder {

    public record BuildResult(Resource model, List<EObject> traces) {
        public BuildResult {
            traces = List.copyOf(traces);
        }
    }

    public BuildResult build(final ResourceSet set, final Path traceabilityEcore, final Path outputXmi,
            final ParsedProjectFeatureModel project, final FeatureStandardsMappingResult mappings,
            final TypeGraph programModel) throws IOException {
        if (set == null || project == null || mappings == null || programModel == null) {
            throw new IllegalArgumentException("set, project, mappings, and programModel must not be null");
        }
        final EPackage tracePackage = DynamicModelSupport.loadPackage(set, traceabilityEcore);
        final Resource resource = set.createResource(URI.createFileURI(outputXmi.toAbsolutePath().toString()));
        final EObject traceModel = DynamicModelSupport.create(tracePackage, "TraceModel");
        resource.getContents().add(traceModel);

        final ProgramFeatureLocationIndex locationIndex = new ProgramFeatureLocationIndex(programModel);
        final List<EObject> traces = new ArrayList<>();
        for (final FeatureControlMapping mapping : mappings.mappings()) {
            final EObject trace = DynamicModelSupport.create(tracePackage, "FeatureStandardTrace");
            final String projectFeature = project.sourceName(mapping.feature());
            DynamicModelSupport.set(trace, "canonicalFeature", safe(mapping.canonicalFeature()));
            DynamicModelSupport.set(trace, "projectFeature", projectFeature);
            DynamicModelSupport.set(trace, "relation", mapping.reference().relation().name());
            DynamicModelSupport.set(trace, "source", mapping.reference().source());
            DynamicModelSupport.set(trace, "confidence", mapping.reference().confidence());
            DynamicModelSupport.set(trace, "requirement", mapping.control());
            final EObject standard = enclosingStandard(mapping.control());
            if (standard != null) {
                DynamicModelSupport.set(trace, "requirementsSet", standard);
            }

            final LinkedHashSet<ProgramFeatureLocationIndex.Location> locations = new LinkedHashSet<>(locationIndex.locations(
                    mapping.feature().getName(), projectFeature, mapping.canonicalFeature()));
            for (final ProgramFeatureLocationIndex.Location location : locations) {
                DynamicModelSupport.add(trace, "programElements", location.programElement());
                DynamicModelSupport.add(trace, "presenceConditions", location.presenceCondition());
            }
            DynamicModelSupport.add(traceModel, "featureTraces", trace);
            traces.add(trace);
        }
        resource.save(Map.of());
        return new BuildResult(resource, traces);
    }

    private static EObject enclosingStandard(final EObject requirement) {
        EObject current = requirement == null ? null : requirement.eContainer();
        EObject standard = null;
        while (current != null) {
            if ("RequirementsSet".equals(current.eClass().getName())) {
                standard = current;
            }
            current = current.eContainer();
        }
        return standard;
    }

    private static String safe(final String value) {
        return value == null ? "" : value;
    }
}
