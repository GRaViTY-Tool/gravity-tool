package org.gravity.typegraph.spl.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
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
import org.gravity.typegraph.spl.standards.EmseStandardsArtifactLoader;
import org.junit.Test;

public class EmseStandardsArtifactLoaderTest {

    @Test
    public void loadsCompleteReusableCatalog() throws Exception {
        final Path ecore = Files.createTempFile("emse-standards", ".ecore");
        final Path xmi = Files.createTempFile("emse-standards", ".xmi");
        Files.writeString(ecore, EMSE_ECORE);

        final ResourceSetImpl set = new ResourceSetImpl();
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        final EPackage model = (EPackage) set.getResource(URI.createFileURI(ecore.toAbsolutePath().toString()), true)
                .getContents().get(0);
        set.getPackageRegistry().put(model.getNsURI(), model);
        final Resource resource = set.createResource(URI.createFileURI(xmi.toAbsolutePath().toString()));
        final EObject root = create(model, "EmseCatalog");
        resource.getContents().add(root);

        for (final var catalogEntry : EmseSecurityFeatureTaxonomy.catalog().entries()) {
            final EObject entry = create(model, "FeatureEntry");
            set(entry, "canonicalFeature", catalogEntry.canonicalFeature());
            catalogEntry.aliases().forEach(alias -> add(entry, "aliases", alias));
            if ("encryption".equals(catalogEntry.canonicalFeature())) {
                final EObject control = create(model, "ControlReference");
                set(control, "standard", "ISO/IEC 27002:2022");
                set(control, "control", "8.24");
                set(control, "relation", "REALIZES");
                set(control, "source", "test");
                set(control, "confidence", 1.0d);
                add(entry, "controls", control);
            }
            add(root, "entries", entry);
        }
        resource.save(Map.of());

        final var loaded = EmseStandardsArtifactLoader.load(new ResourceSetImpl(), ecore, xmi);
        assertEquals(EmseSecurityFeatureTaxonomy.FEATURE_COUNT, loaded.entries().size());
        assertEquals("cryptography", loaded.resolve("secure communication", "secure communication")
                .orElseThrow().canonicalFeature());
        final var encryption = loaded.resolve("encryption", "encryption").orElseThrow();
        assertEquals(1, encryption.controls().size());
        assertEquals("ISO/IEC 27002:2022", encryption.controls().get(0).standard());
        assertEquals("8.24", encryption.controls().get(0).control());
        assertTrue(encryption.controls().get(0).source().contains("test"));
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

    private static final String EMSE_ECORE = """
            <?xml version="1.0" encoding="UTF-8"?>
            <ecore:EPackage xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore"
                name="emsestandards" nsURI="http://www.gravity-tool.org/standards/emse" nsPrefix="emsestandards">
              <eClassifiers xsi:type="ecore:EClass" name="EmseCatalog">
                <eStructuralFeatures xsi:type="ecore:EReference" name="entries" upperBound="-1" containment="true" eType="#//FeatureEntry"/>
              </eClassifiers>
              <eClassifiers xsi:type="ecore:EClass" name="FeatureEntry">
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="canonicalFeature" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="aliases" upperBound="-1" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EReference" name="controls" upperBound="-1" containment="true" eType="#//ControlReference"/>
              </eClassifiers>
              <eClassifiers xsi:type="ecore:EClass" name="ControlReference">
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="standard" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="control" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="relation" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="source" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="confidence" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDouble" defaultValueLiteral="1.0"/>
              </eClassifiers>
            </ecore:EPackage>
            """;
}
