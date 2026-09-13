package org.gravity.typegraph.spl.standards;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/** Loads pre-generated standard requirements and their property sidecar. */
public final class StandardRequirementsModelLoader {

    private StandardRequirementsModelLoader() {
    }

    public static StandardRequirementsModel load(final ResourceSet set, final Path requirementsEcore,
            final Path requirementsXmi, final Path propertiesEcore, final Path propertiesXmi) {
        if (set == null || requirementsEcore == null || requirementsXmi == null || propertiesEcore == null
                || propertiesXmi == null) {
            throw new IllegalArgumentException("resource set and standard artifact paths must not be null");
        }

        final EPackage requirementsPackage = DynamicModelSupport.loadPackage(set, requirementsEcore);
        final EPackage propertiesPackage = DynamicModelSupport.loadPackage(set, propertiesEcore);
        set.getPackageRegistry().put(requirementsPackage.getNsURI(), requirementsPackage);
        set.getPackageRegistry().put(propertiesPackage.getNsURI(), propertiesPackage);
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().putIfAbsent("xmi", new XMIResourceFactoryImpl());

        final Resource requirements = set.getResource(URI.createFileURI(requirementsXmi.toAbsolutePath().toString()), true);
        final Resource properties = set.getResource(URI.createFileURI(propertiesXmi.toAbsolutePath().toString()), true);
        if (requirements.getContents().isEmpty()) {
            throw new IllegalArgumentException("No requirements model in " + requirementsXmi);
        }
        if (properties.getContents().isEmpty()) {
            throw new IllegalArgumentException("No security-property index in " + propertiesXmi);
        }

        final EObject standard = requirements.getContents().get(0);
        final String identifier = DynamicModelSupport.string(standard, "id");
        final List<EObject> controls = all(requirements, "Requirement");
        final Map<String, EObject> controlsById = new LinkedHashMap<>();
        for (final EObject control : controls) {
            final String id = DynamicModelSupport.string(control, "id");
            if (id.isBlank()) {
                throw new IllegalArgumentException("Requirement without id in " + requirementsXmi);
            }
            if (controlsById.put(id, control) != null) {
                throw new IllegalArgumentException("Duplicate requirement id '" + id + "' in " + requirementsXmi);
            }
        }

        final Map<EObject, Set<String>> propertyIndex = new LinkedHashMap<>();
        for (final EObject entry : all(properties, "SecurityPropertyEntry")) {
            final String requirementId = DynamicModelSupport.string(entry, "requirementId");
            final EObject control = controlsById.get(requirementId);
            if (control == null) {
                throw new IllegalArgumentException("Security-property entry references unknown requirement '"
                        + requirementId + "'");
            }
            final Set<String> values = strings(entry, "properties");
            propertyIndex.computeIfAbsent(control, ignored -> new LinkedHashSet<>()).addAll(values);
        }

        return new StandardRequirementsModel(identifier, requirements, standard, controls, propertyIndex);
    }

    private static List<EObject> all(final Resource resource, final String className) {
        final List<EObject> result = new ArrayList<>();
        resource.getContents().forEach(root -> {
            if (className.equals(root.eClass().getName())) {
                result.add(root);
            }
            root.eAllContents().forEachRemaining(object -> {
                if (className.equals(object.eClass().getName())) {
                    result.add(object);
                }
            });
        });
        return result;
    }

    @SuppressWarnings("unchecked")
    private static Set<String> strings(final EObject object, final String featureName) {
        final EStructuralFeature feature = object.eClass().getEStructuralFeature(featureName);
        if (feature == null || !feature.isMany()) {
            throw new IllegalArgumentException("Missing multi-valued feature '" + featureName + "' on "
                    + object.eClass().getName());
        }
        final Set<String> result = new LinkedHashSet<>();
        for (final Object value : (List<Object>) object.eGet(feature)) {
            if (value != null && !value.toString().isBlank()) {
                result.add(value.toString());
            }
        }
        return result;
    }
}
