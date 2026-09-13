package org.gravity.typegraph.spl.standards.generator;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gravity.typegraph.spl.standards.EmseSecurityFeatureTaxonomy;
import org.gravity.typegraph.spl.standards.FeatureMappingCatalog;
import org.gravity.typegraph.spl.standards.StandardControlReference;

/** One-time generator for the reusable EMSE taxonomy/standards catalog. */
public final class EmseStandardsArtifactGenerator {

    private EmseStandardsArtifactGenerator() {
    }

    public static void generate(final Path workbook, final Path catalogEcore, final Path outputXmi) throws IOException {
        if (workbook == null || catalogEcore == null || outputXmi == null) {
            throw new IllegalArgumentException("workbook, catalogEcore, and outputXmi must not be null");
        }
        final FeatureMappingCatalog mappings = EmseStandardsWorkbookParser.parse(workbook);
        final FeatureMappingCatalog combined = merge(EmseSecurityFeatureTaxonomy.catalog(), mappings);

        final ResourceSetImpl set = new ResourceSetImpl();
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        final EPackage model = loadPackage(set, catalogEcore);
        final Resource resource = set.createResource(URI.createFileURI(outputXmi.toAbsolutePath().toString()));
        final EObject root = create(model, "EmseCatalog");
        set(root, "articleDoi", EmseSecurityFeatureTaxonomy.ARTICLE_DOI);
        set(root, "replicationPackageDoi", EmseStandardsWorkbookParser.REPLICATION_PACKAGE_DOI);
        set(root, "workbookName", EmseStandardsWorkbookParser.WORKBOOK_NAME);
        set(root, "workbookMd5", EmseStandardsWorkbookParser.WORKBOOK_MD5);
        resource.getContents().add(root);

        for (final FeatureMappingCatalog.Entry catalogEntry : combined.entries()) {
            final EObject entry = create(model, "FeatureEntry");
            set(entry, "canonicalFeature", catalogEntry.canonicalFeature());
            catalogEntry.aliases().forEach(alias -> add(entry, "aliases", alias));
            for (final StandardControlReference reference : catalogEntry.controls()) {
                final EObject control = create(model, "ControlReference");
                set(control, "standard", reference.standard());
                set(control, "control", reference.control());
                set(control, "relation", reference.relation().name());
                set(control, "source", reference.source());
                set(control, "confidence", reference.confidence());
                add(entry, "controls", control);
            }
            add(root, "entries", entry);
        }
        resource.save(Map.of());
    }

    private static FeatureMappingCatalog merge(final FeatureMappingCatalog taxonomy,
            final FeatureMappingCatalog standardsMappings) {
        final List<FeatureMappingCatalog.Entry> merged = new ArrayList<>();
        final LinkedHashSet<FeatureMappingCatalog.Entry> consumedMappings = new LinkedHashSet<>();
        for (final FeatureMappingCatalog.Entry taxonomyEntry : taxonomy.entries()) {
            final LinkedHashSet<StandardControlReference> controls = new LinkedHashSet<>(taxonomyEntry.controls());
            standardsMappings.resolve(taxonomyEntry.canonicalFeature(), taxonomyEntry.canonicalFeature()).ifPresent(mapping -> {
                controls.addAll(mapping.controls());
                consumedMappings.add(mapping);
            });
            for (final String alias : taxonomyEntry.aliases()) {
                standardsMappings.resolve(alias, alias).ifPresent(mapping -> {
                    controls.addAll(mapping.controls());
                    consumedMappings.add(mapping);
                });
            }
            merged.add(FeatureMappingCatalog.entry(taxonomyEntry.canonicalFeature(), taxonomyEntry.aliases(),
                    List.copyOf(controls)));
        }
        final List<String> unknown = standardsMappings.entries().stream()
                .filter(entry -> !consumedMappings.contains(entry))
                .map(FeatureMappingCatalog.Entry::canonicalFeature).toList();
        if (!unknown.isEmpty()) {
            throw new IllegalArgumentException("Workbook mappings contain unknown EMSE features: " + unknown);
        }
        if (merged.size() != EmseSecurityFeatureTaxonomy.FEATURE_COUNT) {
            throw new IllegalStateException("Expected " + EmseSecurityFeatureTaxonomy.FEATURE_COUNT
                    + " EMSE features but generated " + merged.size());
        }
        return new FeatureMappingCatalog(merged);
    }

    private static EPackage loadPackage(final ResourceSetImpl set, final Path path) {
        final EPackage ePackage = (EPackage) set.getResource(URI.createFileURI(path.toAbsolutePath().toString()), true)
                .getContents().get(0);
        set.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
        return ePackage;
    }

    private static EObject create(final EPackage ePackage, final String className) {
        return ePackage.getEFactoryInstance().create((EClass) ePackage.getEClassifier(className));
    }

    private static void set(final EObject object, final String featureName, final Object value) {
        object.eSet(object.eClass().getEStructuralFeature(featureName), value);
    }

    @SuppressWarnings("unchecked")
    private static void add(final EObject object, final String featureName, final Object value) {
        ((List<Object>) object.eGet(object.eClass().getEStructuralFeature(featureName))).add(value);
    }
}
