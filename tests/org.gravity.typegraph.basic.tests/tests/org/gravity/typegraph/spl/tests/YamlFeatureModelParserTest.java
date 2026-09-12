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

        final Resource requirements = createRequirementsResource();
        final EObject requirementsSet = requirements.getContents().get(0);
        @SuppressWarnings("unchecked")
        final List<EObject> controls = (List<EObject>) requirementsSet
                .eGet(requirementsSet.eClass().getEStructuralFeature("requirements"));
        final EObject expectedControl = controls.get(0);

        final var catalog = new FeatureMappingCatalog(List.of(FeatureMappingCatalog.entry("authentication",
                List.of("Sign In"), List.of(new StandardControlReference("ISO/IEC 27002:2022", "5.17")))));

        final var result = new ProjectFeatureStandardsMapper().map(parsed, catalog, List.of(requirements));

        assertTrue(result.unresolved().isEmpty());
        assertTrue(result.unmappedFeatures().isEmpty());
        assertEquals(1, result.mappings().size());
        assertEquals("authentication", result.mappings().get(0).canonicalFeature());
        assertSame(expectedControl, result.mappings().get(0).control());
    }

    private Resource createRequirementsResource() {
        final var factory = EcoreFactory.eINSTANCE;
        final var pkg = factory.createEPackage();
        pkg.setName("requirements");
        pkg.setNsPrefix("requirements");
        pkg.setNsURI("urn:test:requirements");

        final EClass requirementsSetClass = factory.createEClass();
        requirementsSetClass.setName("RequirementsSet");
        final var setId = factory.createEAttribute();
        setId.setName("id");
        setId.setEType(EcorePackage.Literals.ESTRING);
        requirementsSetClass.getEStructuralFeatures().add(setId);
        final var setTitle = factory.createEAttribute();
        setTitle.setName("title");
        setTitle.setEType(EcorePackage.Literals.ESTRING);
        requirementsSetClass.getEStructuralFeatures().add(setTitle);

        final EClass requirementClass = factory.createEClass();
        requirementClass.setName("Requirement");
        final var requirementId = factory.createEAttribute();
        requirementId.setName("id");
        requirementId.setEType(EcorePackage.Literals.ESTRING);
        requirementClass.getEStructuralFeatures().add(requirementId);

        final var requirementsReference = factory.createEReference();
        requirementsReference.setName("requirements");
        requirementsReference.setEType(requirementClass);
        requirementsReference.setContainment(true);
        requirementsReference.setUpperBound(-1);
        requirementsSetClass.getEStructuralFeatures().add(requirementsReference);

        pkg.getEClassifiers().add(requirementsSetClass);
        pkg.getEClassifiers().add(requirementClass);

        final EObject requirementsSet = pkg.getEFactoryInstance().create(requirementsSetClass);
        requirementsSet.eSet(setId, "ISO/IEC 27002:2022");
        requirementsSet.eSet(setTitle, "ISO/IEC 27002:2022");
        final EObject requirement = pkg.getEFactoryInstance().create(requirementClass);
        requirement.eSet(requirementId, "5.17");
        @SuppressWarnings("unchecked")
        final List<EObject> requirements = (List<EObject>) requirementsSet.eGet(requirementsReference);
        requirements.add(requirement);

        final Resource resource = new ResourceImpl(URI.createURI("memory:/requirements.xmi"));
        resource.getContents().add(requirementsSet);
        return resource;
    }
}
