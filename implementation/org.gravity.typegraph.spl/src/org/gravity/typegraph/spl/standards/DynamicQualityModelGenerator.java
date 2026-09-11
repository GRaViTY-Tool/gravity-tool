package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * Creates a TraceSec-compatible quality-model instance from the information
 * security properties attached to parsed standard controls.
 * <p>
 * This class loads the TraceSec quality metamodel dynamically. Consequently the
 * standards integration has no compile-time dependency on TraceSec generated
 * classes. The generated qualities reference the actual Control EObjects through
 * Quality.relevantElements.
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
                "Information-security qualities derived from standard control security properties.");
        DynamicModelSupport.add(qualityModel, "qualities", root);
        DynamicModelSupport.set(qualityModel, "root", root);
        qualities.put(ROOT, root);

        for (final String property : PROPERTIES) {
            final EObject child = quality(qualityPackage, property,
                    property + " controls derived from the imported security standard.");
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
                    attachControls(rootObject, qualities);
                    final var iterator = rootObject.eAllContents();
                    while (iterator.hasNext()) {
                        attachControls(iterator.next(), qualities);
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

    private void attachControls(final EObject object, final Map<String, EObject> qualities) {
        if (!"Control".equals(object.eClass().getName())) {
            return;
        }
        final var propertyFeature = object.eClass().getEStructuralFeature("securityProperties");
        if (propertyFeature == null || !propertyFeature.isMany()) {
            return;
        }
        final Object value = object.eGet(propertyFeature, false);
        if (!(value instanceof Collection<?> properties)) {
            return;
        }
        for (final Object propertyValue : properties) {
            final String property = propertyValue == null ? "" : propertyValue.toString().trim();
            for (final String known : PROPERTIES) {
                if (known.toLowerCase(Locale.ROOT).equals(property.toLowerCase(Locale.ROOT))) {
                    DynamicModelSupport.add(qualities.get(known), "relevantElements", object);
                }
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
