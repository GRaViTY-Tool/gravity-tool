package org.gravity.typegraph.spl.standards;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/** Loads the pre-generated EMSE taxonomy and standards mapping catalog. */
public final class EmseStandardsArtifactLoader {

    private EmseStandardsArtifactLoader() {
    }

    public static FeatureMappingCatalog load(final ResourceSet set, final Path catalogEcore, final Path catalogXmi) {
        if (set == null || catalogEcore == null || catalogXmi == null) {
            throw new IllegalArgumentException("resource set, catalogEcore, and catalogXmi must not be null");
        }
        DynamicModelSupport.loadPackage(set, catalogEcore);
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().putIfAbsent("xmi", new XMIResourceFactoryImpl());
        final Resource resource = set.getResource(URI.createFileURI(catalogXmi.toAbsolutePath().toString()), true);
        if (resource.getContents().isEmpty()) {
            throw new IllegalArgumentException("No EMSE standards catalog in " + catalogXmi);
        }
        final EObject root = resource.getContents().get(0);
        if (!"EmseCatalog".equals(root.eClass().getName())) {
            throw new IllegalArgumentException("Expected EmseCatalog in " + catalogXmi + " but found "
                    + root.eClass().getName());
        }

        final List<FeatureMappingCatalog.Entry> entries = new ArrayList<>();
        for (final EObject entry : objects(root, "entries")) {
            final String canonical = DynamicModelSupport.string(entry, "canonicalFeature");
            final Set<String> aliases = strings(entry, "aliases");
            final List<StandardControlReference> controls = new ArrayList<>();
            for (final EObject control : objects(entry, "controls")) {
                final String relationName = DynamicModelSupport.string(control, "relation");
                final MappingRelation relation;
                try {
                    relation = relationName.isBlank() ? MappingRelation.REALIZES : MappingRelation.valueOf(relationName);
                } catch (final IllegalArgumentException e) {
                    throw new IllegalArgumentException("Unknown mapping relation '" + relationName + "' for "
                            + canonical, e);
                }
                controls.add(new StandardControlReference(DynamicModelSupport.string(control, "standard"),
                        DynamicModelSupport.string(control, "control"), relation,
                        DynamicModelSupport.string(control, "source"), doubleValue(control, "confidence", 1.0d)));
            }
            entries.add(FeatureMappingCatalog.entry(canonical, aliases, controls));
        }
        final FeatureMappingCatalog result = new FeatureMappingCatalog(entries);
        EmseStandardsTraceabilityIntegration.requireCompleteTaxonomy(result);
        return result;
    }

    @SuppressWarnings("unchecked")
    private static List<EObject> objects(final EObject object, final String featureName) {
        final EStructuralFeature feature = object.eClass().getEStructuralFeature(featureName);
        if (feature == null || !feature.isMany()) {
            throw new IllegalArgumentException("Missing multi-valued feature '" + featureName + "' on "
                    + object.eClass().getName());
        }
        return new ArrayList<>((List<EObject>) object.eGet(feature));
    }

    @SuppressWarnings("unchecked")
    private static Set<String> strings(final EObject object, final String featureName) {
        final EStructuralFeature feature = object.eClass().getEStructuralFeature(featureName);
        if (feature == null || !feature.isMany()) {
            throw new IllegalArgumentException("Missing multi-valued feature '" + featureName + "' on "
                    + object.eClass().getName());
        }
        final Set<String> values = new LinkedHashSet<>();
        for (final Object value : (List<Object>) object.eGet(feature)) {
            if (value != null && !value.toString().isBlank()) {
                values.add(value.toString());
            }
        }
        return values;
    }

    private static double doubleValue(final EObject object, final String featureName, final double fallback) {
        final EStructuralFeature feature = object.eClass().getEStructuralFeature(featureName);
        if (feature == null) {
            return fallback;
        }
        final Object value = object.eGet(feature);
        return value instanceof Number number ? number.doubleValue() : fallback;
    }
}
