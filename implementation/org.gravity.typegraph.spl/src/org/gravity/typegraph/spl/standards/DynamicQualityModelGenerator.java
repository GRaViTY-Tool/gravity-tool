package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

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
 * ISO/IEC 27002 explicitly associates controls with information-security
 * properties derived from the ISO/IEC 25010 quality vocabulary. The generator
 * therefore discovers all properties present in the supplied standard model
 * (for example confidentiality, integrity, availability, authenticity,
 * accountability, or non-repudiation) instead of fixing the model to CIA.
 * Every discovered property is represented as a direct child quality of the
 * Information Security root and receives ESSENTIAL priority.
 */
public final class DynamicQualityModelGenerator {

    public record GenerationResult(Resource model, EObject qualityModel, Map<String, EObject> qualities) {
        public GenerationResult {
            qualities = Map.copyOf(qualities);
        }
    }

    private static final String ROOT = "Information Security";

    public GenerationResult generate(final ResourceSet set, final Path qualityModelEcore, final Path outputXmi,
            final Collection<? extends Resource> standardsResources) throws IOException {
        if (set == null) {
            throw new IllegalArgumentException("set must not be null");
        }
        final EPackage qualityPackage = DynamicModelSupport.loadPackage(set, qualityModelEcore);
        final Resource resultResource = set.createResource(URI.createFileURI(outputXmi.toAbsolutePath().toString()));
        final EObject qualityModel = DynamicModelSupport.create(qualityPackage, "QualityModel");
        resultResource.getContents().add(qualityModel);

        final Map<String, Set<EObject>> requirementsByProperty = discoverProperties(standardsResources);
        final Map<String, EObject> qualities = new LinkedHashMap<>();
        final EObject root = quality(qualityPackage, ROOT,
                "Information-security qualities derived from ISO/IEC 27002 Information security properties.");
        DynamicModelSupport.add(qualityModel, "qualities", root);
        DynamicModelSupport.set(qualityModel, "root", root);
        qualities.put(ROOT, root);

        final List<String> properties = new ArrayList<>(requirementsByProperty.keySet());
        properties.sort(String.CASE_INSENSITIVE_ORDER);
        for (final String property : properties) {
            final EObject child = quality(qualityPackage, property,
                    property + " requirements derived from ISO/IEC 27002 Information security properties.");
            DynamicModelSupport.addAll(child, "relevantElements", requirementsByProperty.get(property));
            DynamicModelSupport.add(qualityModel, "qualities", child);

            final EObject aspect = DynamicModelSupport.create(qualityPackage, "Aspect");
            DynamicModelSupport.set(aspect, "quality", child);
            setEnumLiteral(aspect, "priority", "ESSENTIAL");
            DynamicModelSupport.add(root, "aspects", aspect);
            qualities.put(property, child);
        }

        resultResource.save(Map.of());
        return new GenerationResult(resultResource, qualityModel, qualities);
    }

    private Map<String, Set<EObject>> discoverProperties(final Collection<? extends Resource> standardsResources) {
        final Map<String, Set<EObject>> requirementsByProperty = new LinkedHashMap<>();
        if (standardsResources == null) {
            return requirementsByProperty;
        }
        for (final Resource standardResource : standardsResources) {
            if (standardResource == null) {
                continue;
            }
            for (final EObject rootObject : standardResource.getContents()) {
                collectRequirement(rootObject, requirementsByProperty);
                final var iterator = rootObject.eAllContents();
                while (iterator.hasNext()) {
                    collectRequirement(iterator.next(), requirementsByProperty);
                }
            }
        }
        return requirementsByProperty;
    }

    private void collectRequirement(final EObject object, final Map<String, Set<EObject>> requirementsByProperty) {
        if (!"Requirement".equals(object.eClass().getName()) || !belongsToIso27002(object)) {
            return;
        }
        final String wording = DynamicModelSupport.string(object, "wording");
        for (final String property : Iso2700xPdfImporter.extractSecurityProperties(wording)) {
            requirementsByProperty.computeIfAbsent(property, ignored -> new LinkedHashSet<>()).add(object);
        }
    }

    private boolean belongsToIso27002(final EObject requirement) {
        EObject current = requirement.eContainer();
        EObject standard = null;
        while (current != null) {
            if ("RequirementsSet".equals(current.eClass().getName())) {
                standard = current;
            }
            current = current.eContainer();
        }
        if (standard == null) {
            return false;
        }
        final String identity = DynamicModelSupport.string(standard, "id") + " "
                + DynamicModelSupport.string(standard, "title");
        return identity.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", "").contains("27002");
    }

    private EObject quality(final EPackage qualityPackage, final String title, final String description) {
        final EObject quality = DynamicModelSupport.create(qualityPackage, "Quality");
        DynamicModelSupport.set(quality, "title", title);
        DynamicModelSupport.set(quality, "description", description);
        return quality;
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
