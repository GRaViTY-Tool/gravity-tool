package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/** Creates a TraceSec quality model from pre-generated standard artifacts. */
public final class DynamicQualityModelGenerator {

    public record GenerationResult(Resource model, EObject qualityModel, Map<String, EObject> qualities) {
        public GenerationResult {
            qualities = Map.copyOf(qualities);
        }
    }

    private static final String ROOT = "Information Security";

    public GenerationResult generate(final ResourceSet set, final Path qualityModelEcore, final Path outputXmi,
            final Collection<? extends StandardRequirementsModel> standards) throws IOException {
        final Map<EObject, Collection<String>> propertiesByRequirement = new LinkedHashMap<>();
        if (standards != null) {
            for (final StandardRequirementsModel standard : standards) {
                if (standard == null || !standard.isIso27002()) {
                    continue;
                }
                standard.securityPropertiesByControl().forEach((requirement, properties) -> propertiesByRequirement
                        .computeIfAbsent(requirement, ignored -> new LinkedHashSet<>()).addAll(properties));
            }
        }
        return generateFromProperties(set, qualityModelEcore, outputXmi, propertiesByRequirement);
    }

    public GenerationResult generateFromProperties(final ResourceSet set, final Path qualityModelEcore,
            final Path outputXmi, final Map<? extends EObject, ? extends Collection<String>> propertiesByRequirement)
            throws IOException {
        if (set == null) {
            throw new IllegalArgumentException("set must not be null");
        }
        final EPackage qualityPackage = DynamicModelSupport.loadPackage(set, qualityModelEcore);
        final Resource resultResource = set.createResource(URI.createFileURI(outputXmi.toAbsolutePath().toString()));
        final EObject qualityModel = DynamicModelSupport.create(qualityPackage, "QualityModel");
        resultResource.getContents().add(qualityModel);

        final Map<String, Set<EObject>> requirementsByProperty = invert(propertiesByRequirement);
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

    private Map<String, Set<EObject>> invert(final Map<? extends EObject, ? extends Collection<String>> source) {
        final Map<String, Set<EObject>> result = new LinkedHashMap<>();
        if (source != null) {
            source.forEach((requirement, properties) -> {
                if (requirement != null && properties != null) {
                    properties.stream().filter(p -> p != null && !p.isBlank())
                            .forEach(p -> result.computeIfAbsent(p, ignored -> new LinkedHashSet<>()).add(requirement));
                }
            });
        }
        return result;
    }

    private EObject quality(final EPackage qualityPackage, final String title, final String description) {
        final EObject quality = DynamicModelSupport.create(qualityPackage, "Quality");
        DynamicModelSupport.set(quality, "title", title);
        DynamicModelSupport.set(quality, "description", description);
        return quality;
    }

    private void setEnumLiteral(final EObject object, final String featureName, final String literal) {
        final var feature = object.eClass().getEStructuralFeature(featureName);
        if (feature != null && feature.getEType() instanceof EDataType dataType) {
            object.eSet(feature, dataType.getEPackage().getEFactoryInstance().createFromString(dataType, literal));
        }
    }
}
