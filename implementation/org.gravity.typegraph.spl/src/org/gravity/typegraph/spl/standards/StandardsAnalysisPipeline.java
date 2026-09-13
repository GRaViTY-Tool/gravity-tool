package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityAPI;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.spl.FeatureModelLoader;

/**
 * End-to-end project analysis pipeline for standards traceability.
 * <p>
 * It creates and persists the HAnS-enriched GRaViTY program model, loads a
 * pre-generated ISO/IEC 27002 requirements artifact, resolves project features
 * (including taxonomy descendants), then persists the TraceSec correspondence,
 * provenance, and quality models.
 */
public final class StandardsAnalysisPipeline {

    public record Request(IJavaProject javaProject, Path featureModel, Path replicationWorkbook,
            Path requirementsEcore, Path requirementsXmi, Path propertiesEcore, Path propertiesXmi,
            Path traceabilityEcore, Path qualityModelEcore, Path outputDirectory) {
    }

    public record Result(TypeGraph programModel, Resource programModelResource,
            StandardRequirementsModel standard, EmseStandardsTraceabilityIntegration.TraceSecResult traceSec) {
    }

    public Result execute(final Request request, final IProgressMonitor monitor)
            throws IOException, TransformationFailedException {
        require(request);
        Files.createDirectories(request.outputDirectory());

        final var projectFeatures = FeatureModelLoader.loadProject(request.featureModel());
        final TypeGraph discovered = GravityAPI.createProgramModel(request.javaProject(), monitor);

        final ResourceSet set = discovered.eResource() != null && discovered.eResource().getResourceSet() != null
                ? discovered.eResource().getResourceSet() : new ResourceSetImpl();
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().putIfAbsent("xmi", new XMIResourceFactoryImpl());

        final Path programXmi = request.outputDirectory().resolve("program.xmi");
        final Resource programResource;
        if (discovered.eResource() == null) {
            programResource = set.createResource(URI.createFileURI(programXmi.toAbsolutePath().toString()));
            programResource.getContents().add(discovered);
        } else {
            programResource = discovered.eResource();
            programResource.setURI(URI.createFileURI(programXmi.toAbsolutePath().toString()));
        }
        programResource.save(Map.of());

        final StandardRequirementsModel standard = StandardRequirementsModelLoader.load(set,
                request.requirementsEcore(), request.requirementsXmi(), request.propertiesEcore(),
                request.propertiesXmi());
        if (!standard.isIso27002()) {
            throw new IllegalArgumentException("Expected pre-generated ISO/IEC 27002 requirements model but loaded '"
                    + standard.identifier() + "'");
        }

        final var traceSec = EmseStandardsTraceabilityIntegration.createTraceSec(projectFeatures,
                request.replicationWorkbook(), List.of(standard), set, discovered, request.traceabilityEcore(),
                request.outputDirectory().resolve("standards-traceability.xmi"),
                request.outputDirectory().resolve("correspondence.xmi"), request.qualityModelEcore(),
                request.outputDirectory().resolve("quality-model.xmi"));
        return new Result(discovered, programResource, standard, traceSec);
    }

    private static void require(final Request request) {
        if (request == null || request.javaProject() == null || request.featureModel() == null
                || request.replicationWorkbook() == null || request.requirementsEcore() == null
                || request.requirementsXmi() == null || request.propertiesEcore() == null
                || request.propertiesXmi() == null || request.traceabilityEcore() == null
                || request.qualityModelEcore() == null || request.outputDirectory() == null) {
            throw new IllegalArgumentException("All standards-analysis request fields must be provided");
        }
    }
}
