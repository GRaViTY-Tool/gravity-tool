package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * Creates a TraceSec-compatible quality-model instance from the information
 * security properties stated in imported ISO/IEC 27002 requirements.
 * <p>
 * Standards are represented with TraceSec's requirements metamodel. Therefore
 * generated qualities reference the actual {@code Requirement} EObjects through
 * {@code Quality.relevantElements}; no parallel standards metamodel is needed.
 */
public final class DynamicQualityModelGenerator {

    public record GenerationResult(Resource model, EObject qualityModel, Map<String, EObject> qualities) {
        public GenerationResult {
            qualities = Map.copyOf(qualities);
        }
    }

    private static final String ROOT = "Information Security";
    private static final String[] PROPERTIES = { "Confidentiality", "Integrity", "Availability" };

    public GenerationResult generate(final ResourceSet set, final Path qualityModelEcore, final Path outputXmi,
            final Collection<? extends Resource> standardsResources) throws IOException {
        if (set == null) {
            throw new IllegalArgumentException("set must not be null");
        }
        final EPackage qualityPackage = DynamicModelSupport.loadPackage(set, qualityModelEcore);
        final Resource resultResource = set.createResource(URI.createFileURI(outputXmi.toAbsolutePath().toString()));
        final EObject qualityModel = DynamicModelSupport.create(qualityPackage, "QualityModel");
        resultResource.getContents().add(qualityModel);

        final Map<String, EObject> qualities = new LinkedHashMap<>();
        final EObject root = quality(qualityPackage, ROOT,
                "Information-security qualities derived from standard requirement security properties.");
        DynamicModelSupport.add(qualityModel, "qualities", root);
        DynamicModelSupport.set(qualityModel, "root", root);
        qualities.put(ROOT, root);

        for (final String property : PROPERTIES) {
            final EObject child = quality(qualityPackage, property,
                    property + " requirements derived from the imported security standard.");
            DynamicModelSupport.add(qualityModel, "qualities", child);
            final EObject aspect = DynamicModelSupport.create(qualityPackage, "Aspect");
            DynamicModelSupport.set(aspect, "quality", child);
            setEnumLiteral(aspect, "priority", "ESSENTIAL");
            DynamicModelSupport.add(root, "aspects", aspect);
            qualities.put(property, child);
        }

        if (standardsResources != null) {
            for (final Resource standardResource : standardsResources) {
                if (standardResource == null) {
                    continue;
                }
                for (final EObject rootObject : standardResource.getContents()) {
                    attachRequirement(rootObject, qualities);
                    final var iterator = rootObject.eAllContents();
                    while (iterator.hasNext()) {
                        attachRequirement(iterator.next(), qualities);
                    }
                }
            }
        }

        resultResource.save(Map.of());
        return new GenerationResult(resultResource, qualityModel, qualities);
    }

    private EObject quality(final EPackage qualityPackage, final String title, final String description) {
        final EObject quality = DynamicModelSupport.create(qualityPackage, "Quality");
        DynamicModelSupport.set(quality, "title", title);
        DynamicModelSupport.set(quality, "description", description);
        return quality;
    }

    private void attachRequirement(final EObject object, final Map<String, EObject> qualities) {
        if (!"Requirement".equals(object.eClass().getName())) {
            return;
        }
        final String wording = DynamicModelSupport.string(object, "wording");
        for (final String property : Iso2700xPdfImporter.extractSecurityProperties(wording)) {
            final EObject quality = qualities.get(property);
            if (quality != null) {
                DynamicModelSupport.add(quality, "relevantElements", object);
            }
        }
    }

    private void setEnumLiteral(final EObject object, final String featureName, final String literal) {
        final var feature = object.eClass().getEStructuralFeature(featureName);
        if (feature == null || !(feature.getEType() instanceof EDataType dataType)) {
            return;
        }
        final Object value = dataType.getEPackage().getEFactoryInstance().createFromString(dataType, literal);
        object.eSet(feature, value);
    }
}
