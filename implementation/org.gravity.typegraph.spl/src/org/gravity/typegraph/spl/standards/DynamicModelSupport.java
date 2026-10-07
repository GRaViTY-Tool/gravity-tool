package org.gravity.typegraph.spl.standards;

import java.nio.file.Path;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/** Small helpers for integrations that deliberately use dynamically loaded Ecore models. */
final class DynamicModelSupport {

    private DynamicModelSupport() {
    }

    static EPackage loadPackage(final ResourceSet set, final Path ecore) {
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().putIfAbsent("ecore", new EcoreResourceFactoryImpl());
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().putIfAbsent("xmi", new XMIResourceFactoryImpl());
        final Resource resource = set.getResource(URI.createFileURI(ecore.toAbsolutePath().toString()), true);
        final EPackage ePackage = resource.getContents().stream().filter(EPackage.class::isInstance).map(EPackage.class::cast)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("No EPackage in " + ecore));
        set.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
        return ePackage;
    }

    static EObject create(final EPackage ePackage, final String className) {
        final var classifier = ePackage.getEClassifier(className);
        if (!(classifier instanceof EClass eClass)) {
            throw new IllegalArgumentException("No EClass '" + className + "' in " + ePackage.getNsURI());
        }
        return ePackage.getEFactoryInstance().create(eClass);
    }

    static void set(final EObject object, final String featureName, final Object value) {
        final EStructuralFeature feature = requiredFeature(object, featureName);
        object.eSet(feature, value);
    }

    @SuppressWarnings("unchecked")
    static void add(final EObject object, final String featureName, final Object value) {
        final EStructuralFeature feature = requiredFeature(object, featureName);
        if (!feature.isMany()) {
            throw new IllegalArgumentException(featureName + " is not multi-valued on " + object.eClass().getName());
        }
        ((EList<Object>) object.eGet(feature)).add(value);
    }

    static void addAll(final EObject object, final String featureName, final Collection<?> values) {
        if (values != null) {
            values.forEach(value -> add(object, featureName, value));
        }
    }

    static String string(final EObject object, final String featureName) {
        final EStructuralFeature feature = object.eClass().getEStructuralFeature(featureName);
        if (feature == null || feature.isMany()) {
            return "";
        }
        final Object value = object.eGet(feature, false);
        return value == null ? "" : value.toString();
    }

    private static EStructuralFeature requiredFeature(final EObject object, final String featureName) {
        final EStructuralFeature feature = object.eClass().getEStructuralFeature(featureName);
        if (feature == null) {
            throw new IllegalArgumentException("No feature '" + featureName + "' on " + object.eClass().getName());
        }
        return feature;
    }
}
