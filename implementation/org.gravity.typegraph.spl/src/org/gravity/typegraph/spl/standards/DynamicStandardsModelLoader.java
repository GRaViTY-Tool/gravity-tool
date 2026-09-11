package org.gravity.typegraph.spl.standards;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/** Convenience loader for a dynamically loaded standards.ecore + standards XMI. */
public final class DynamicStandardsModelLoader {

    public record LoadedStandardsModel(ResourceSet resourceSet, EPackage metamodel, Resource model) {
    }

    private DynamicStandardsModelLoader() {
    }

    public static LoadedStandardsModel load(final Path standardsEcore, final Path standardsXmi) {
        final ResourceSet set = new ResourceSetImpl();
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        final Resource ecoreResource = set.getResource(URI.createFileURI(standardsEcore.toAbsolutePath().toString()), true);
        final EPackage ePackage = ecoreResource.getContents().stream().filter(EPackage.class::isInstance).map(EPackage.class::cast)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("No EPackage in " + standardsEcore));
        set.getPackageRegistry().put(ePackage.getNsURI(), ePackage);

        final Resource model = set.getResource(URI.createFileURI(standardsXmi.toAbsolutePath().toString()), true);
        try {
            if (!model.isLoaded()) {
                model.load(Map.of());
            }
        } catch (final IOException e) {
            throw new IllegalArgumentException("Cannot load standards model " + standardsXmi, e);
        }
        return new LoadedStandardsModel(set, ePackage, model);
    }
}
