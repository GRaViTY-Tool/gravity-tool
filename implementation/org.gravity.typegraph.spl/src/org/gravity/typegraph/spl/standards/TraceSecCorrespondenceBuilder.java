package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.spl.features.ParsedProjectFeatureModel;

/**
 * Builds the native correspondence model consumed by TraceSec's
 * {@code GraphBuilder}. Each resolved standard requirement is linked directly to
 * every program element carrying the corresponding project feature.
 * <p>
 * The TraceSec and Moflon packages are resolved from the supplied resource set
 * when available. Compatible dynamic package definitions are created only as a
 * serialization fallback, keeping this GRaViTY bundle free of a compile-time
 * dependency on the TraceSec repository.
 */
public final class TraceSecCorrespondenceBuilder {

    public static final String RUNTIME_NS_URI = "platform:/plugin/org.moflon.tgg.runtime/model/Runtime.ecore";
    public static final String TRACELINKS_NS_URI = "http://www.tracesec.org/tracelinks";

    public record BuildResult(Resource model, EObject correspondenceModel, List<EObject> links,
            List<FeatureControlMapping> untracedMappings) {
        public BuildResult {
            links = List.copyOf(links);
            untracedMappings = List.copyOf(untracedMappings);
        }
    }

    private record RequirementProgramPair(EObject requirement, EObject programElement) {
    }

    public BuildResult build(final ResourceSet set, final Path outputXmi, final ParsedProjectFeatureModel project,
            final FeatureStandardsMappingResult mappings, final TypeGraph programModel) throws IOException {
        if (set == null || outputXmi == null || project == null || mappings == null || programModel == null) {
            throw new IllegalArgumentException("set, outputXmi, project, mappings, and programModel must not be null");
        }
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().putIfAbsent("xmi", new XMIResourceFactoryImpl());
        final EPackage runtimePackage = runtimePackage(set);
        final EPackage tracePackage = tracePackage(set, runtimePackage);

        final EObject correspondenceModel = DynamicModelSupport.create(runtimePackage, "CorrespondenceModel");
        setIfPresent(correspondenceModel, "source", enclosingStandard(firstRequirement(mappings)));
        setIfPresent(correspondenceModel, "target", programModel);

        final Resource resource = set.createResource(URI.createFileURI(outputXmi.toAbsolutePath().toString()));
        resource.getContents().add(correspondenceModel);

        final ProgramFeatureLocationIndex locationIndex = new ProgramFeatureLocationIndex(programModel);
        final Set<RequirementProgramPair> createdPairs = new LinkedHashSet<>();
        final List<EObject> links = new ArrayList<>();
        final List<FeatureControlMapping> untraced = new ArrayList<>();

        for (final FeatureControlMapping mapping : mappings.mappings()) {
            final String projectFeature = project.sourceName(mapping.feature());
            final var locations = locationIndex.locations(mapping.feature().getName(), projectFeature,
                    mapping.canonicalFeature());
            if (locations.isEmpty()) {
                untraced.add(mapping);
                continue;
            }
            for (final ProgramFeatureLocationIndex.Location location : locations) {
                final var pair = new RequirementProgramPair(mapping.control(), location.programElement());
                if (!createdPairs.add(pair)) {
                    continue;
                }
                final EObject link = DynamicModelSupport.create(tracePackage, "TraceLink");
                DynamicModelSupport.set(link, "source", mapping.control());
                DynamicModelSupport.set(link, "target", location.programElement());
                DynamicModelSupport.add(correspondenceModel, "correspondences", link);
                links.add(link);
            }
        }
        resource.save(Map.of());
        return new BuildResult(resource, correspondenceModel, links, untraced);
    }

    private EObject firstRequirement(final FeatureStandardsMappingResult mappings) {
        return mappings.mappings().isEmpty() ? null : mappings.mappings().get(0).control();
    }

    private EObject enclosingStandard(final EObject requirement) {
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

    private void setIfPresent(final EObject object, final String featureName, final EObject value) {
        if (value != null && object.eClass().getEStructuralFeature(featureName) != null) {
            object.eSet(object.eClass().getEStructuralFeature(featureName), value);
        }
    }

    private EPackage runtimePackage(final ResourceSet set) {
        final EPackage existing = registeredPackage(set, RUNTIME_NS_URI);
        if (existing != null && existing.getEClassifier("CorrespondenceModel") instanceof EClass
                && existing.getEClassifier("AbstractCorrespondence") instanceof EClass) {
            return existing;
        }

        final EcoreFactory factory = EcoreFactory.eINSTANCE;
        final EPackage runtime = factory.createEPackage();
        runtime.setName("org.moflon.tgg.runtime");
        runtime.setNsPrefix("org.moflon.tgg.runtime");
        runtime.setNsURI(RUNTIME_NS_URI);

        final EClass correspondence = factory.createEClass();
        correspondence.setName("AbstractCorrespondence");
        correspondence.setAbstract(true);

        final EClass model = factory.createEClass();
        model.setName("CorrespondenceModel");
        model.getEStructuralFeatures().add(reference("source", EcorePackage.Literals.EOBJECT, false, false));
        model.getEStructuralFeatures().add(reference("target", EcorePackage.Literals.EOBJECT, false, false));
        model.getEStructuralFeatures().add(reference("correspondences", correspondence, true, true));

        runtime.getEClassifiers().add(correspondence);
        runtime.getEClassifiers().add(model);
        set.getPackageRegistry().put(RUNTIME_NS_URI, runtime);
        return runtime;
    }

    private EPackage tracePackage(final ResourceSet set, final EPackage runtimePackage) {
        final EPackage existing = registeredPackage(set, TRACELINKS_NS_URI);
        if (existing != null && existing.getEClassifier("TraceLink") instanceof EClass) {
            return existing;
        }

        final EClass abstractCorrespondence = (EClass) runtimePackage.getEClassifier("AbstractCorrespondence");
        final EcoreFactory factory = EcoreFactory.eINSTANCE;
        final EPackage traces = factory.createEPackage();
        traces.setName("tracelinks");
        traces.setNsPrefix("tracelinks");
        traces.setNsURI(TRACELINKS_NS_URI);

        final EClass traceLink = factory.createEClass();
        traceLink.setName("TraceLink");
        traceLink.getESuperTypes().add(abstractCorrespondence);
        traceLink.getEStructuralFeatures().add(reference("source", EcorePackage.Literals.EOBJECT, false, false));
        traceLink.getEStructuralFeatures().add(reference("target", EcorePackage.Literals.EOBJECT, false, false));
        traces.getEClassifiers().add(traceLink);

        set.getPackageRegistry().put(TRACELINKS_NS_URI, traces);
        return traces;
    }

    private EPackage registeredPackage(final ResourceSet set, final String nsUri) {
        try {
            return set.getPackageRegistry().getEPackage(nsUri);
        } catch (final RuntimeException e) {
            return null;
        }
    }

    private EReference reference(final String name, final EClass type, final boolean many, final boolean containment) {
        final EReference reference = EcoreFactory.eINSTANCE.createEReference();
        reference.setName(name);
        reference.setEType(type);
        reference.setContainment(containment);
        if (many) {
            reference.setUpperBound(-1);
        }
        return reference;
    }
}
