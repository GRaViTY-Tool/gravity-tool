package org.gravity.typegraph.spl.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.nio.file.Files;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.gravity.typegraph.spl.features.YamlFeatureModelRepresentation;
import org.gravity.typegraph.spl.standards.FeatureMappingCatalog;
import org.gravity.typegraph.spl.standards.ProjectFeatureStandardsMapper;
import org.gravity.typegraph.spl.standards.StandardControlReference;
import org.junit.Test;

public class YamlFeatureModelParserTest {

    @Test
    public void parsesNestedYamlIntoFeatureIdeModel() throws Exception {
        final var yaml = Files.createTempFile("gravity-features", ".yaml");
        Files.writeString(yaml, """
                project: Shop
                root:
                  name: Shop
                  group: and
                  children:
                    - name: Authentication
                      mandatory: true
                      securityFeature: authentication
                      controls:
                        - standard: ISO/IEC 27002:2022
                          control: '5.17'
                    - name: Audit
                      optional: true
                """);

        final var parsed = new YamlFeatureModelRepresentation().parse(yaml);

        assertEquals("Shop", parsed.rootFeatureName());
        assertTrue(parsed.isMandatory("Authentication"));
        assertFalse(parsed.isMandatory("Audit"));
        assertEquals("authentication", parsed.metadata("Authentication").semanticFeature());
        assertEquals("5.17", parsed.metadata("Authentication").directMappings().get(0).control());
    }

    @Test
    public void resolvesProjectFeaturesToActualControlEObjects() throws Exception {
        final var yaml = Files.createTempFile("gravity-features", ".yaml");
        Files.writeString(yaml, """
                project: Shop
                features:
                  Sign In: {}
                """);
        final var parsed = new YamlFeatureModelRepresentation().parse(yaml);

        final Resource standards = createStandardsResource();
        final EObject standard = standards.getContents().get(0);
        @SuppressWarnings("unchecked")
        final List<EObject> controls = (List<EObject>) standard.eGet(standard.eClass().getEStructuralFeature("controls"));
        final EObject expectedControl = controls.get(0);

        final var catalog = new FeatureMappingCatalog(List.of(FeatureMappingCatalog.entry("authentication",
                List.of("Sign In"), List.of(new StandardControlReference("ISO/IEC 27002:2022", "5.17")))));

        final var result = new ProjectFeatureStandardsMapper().map(parsed, catalog, List.of(standards));

        assertTrue(result.unresolved().isEmpty());
        assertTrue(result.unmappedFeatures().isEmpty());
        assertEquals(1, result.mappings().size());
        assertEquals("authentication", result.mappings().get(0).canonicalFeature());
        assertSame(expectedControl, result.mappings().get(0).control());
    }

    private Resource createStandardsResource() {
        final var factory = EcoreFactory.eINSTANCE;
        final var pkg = factory.createEPackage();
        pkg.setName("standards");
        pkg.setNsPrefix("standards");
        pkg.setNsURI("urn:test:standards");

        final EClass standardClass = factory.createEClass();
        standardClass.setName("Standard");
        final var standardIdentifier = factory.createEAttribute();
        standardIdentifier.setName("identifier");
        standardIdentifier.setEType(EcorePackage.Literals.ESTRING);
        standardClass.getEStructuralFeatures().add(standardIdentifier);

        final EClass controlClass = factory.createEClass();
        controlClass.setName("Control");
        final var controlIdentifier = factory.createEAttribute();
        controlIdentifier.setName("identifier");
        controlIdentifier.setEType(EcorePackage.Literals.ESTRING);
        controlClass.getEStructuralFeatures().add(controlIdentifier);

        final var controlsReference = factory.createEReference();
        controlsReference.setName("controls");
        controlsReference.setEType(controlClass);
        controlsReference.setContainment(true);
        controlsReference.setUpperBound(-1);
        standardClass.getEStructuralFeatures().add(controlsReference);

        pkg.getEClassifiers().add(standardClass);
        pkg.getEClassifiers().add(controlClass);

        final EObject standard = pkg.getEFactoryInstance().create(standardClass);
        standard.eSet(standardIdentifier, "ISO/IEC 27002:2022");
        final EObject control = pkg.getEFactoryInstance().create(controlClass);
        control.eSet(controlIdentifier, "5.17");
        @SuppressWarnings("unchecked")
        final List<EObject> controls = (List<EObject>) standard.eGet(controlsReference);
        controls.add(control);

        final Resource resource = new ResourceImpl(URI.createURI("memory:/standards.xmi"));
        resource.getContents().add(standard);
        return resource;
    }
}
