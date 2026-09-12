package org.gravity.typegraph.spl.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.nio.file.Files;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.spl.SplFactory;
import org.gravity.typegraph.spl.features.YamlFeatureModelRepresentation;
import org.gravity.typegraph.spl.standards.FeatureMappingCatalog;
import org.gravity.typegraph.spl.standards.ProjectFeatureStandardsMapper;
import org.gravity.typegraph.spl.standards.StandardControlReference;
import org.gravity.typegraph.spl.standards.TraceSecCorrespondenceBuilder;
import org.junit.Test;

public class TraceSecCorrespondenceBuilderTest {

    @Test
    public void createsRequirementToAnnotatedProgramElementCorrespondenceForCustomSubfeature() throws Exception {
        final var yaml = Files.createTempFile("gravity-tracesec-features", ".yaml");
        Files.writeString(yaml, """
                project: Shop
                root:
                  name: Shop
                  group: and
                  children:
                    - name: encryption
                      optional: true
                      children:
                        - name: AES256
                          optional: true
                """);
        final var project = new YamlFeatureModelRepresentation().parse(yaml);

        final var set = new ResourceSetImpl();
        final Resource requirements = createRequirementsResource(set, "8.24");
        final EObject expectedRequirement = requirement(requirements);
        final var catalog = new FeatureMappingCatalog(List.of(FeatureMappingCatalog.entry("encryption", List.of(),
                List.of(new StandardControlReference("ISO/IEC 27002:2022", "8.24")))));
        final var mappings = new ProjectFeatureStandardsMapper().map(project, catalog, List.of(requirements),
                reference -> reference.standard().contains("27002"));

        final var programModel = BasicFactory.eINSTANCE.createTypeGraph();
        programModel.setTName("Shop");
        final var presenceCondition = SplFactory.eINSTANCE.createTPresenceCondition();
        presenceCondition.setPc("AES256");
        programModel.getTAnnotation().add(presenceCondition);
        final Resource programResource = new ResourceImpl(URI.createURI("memory:/program-model.xmi"));
        set.getResources().add(programResource);
        programResource.getContents().add(programModel);

        final var output = Files.createTempFile("gravity-tracesec-correspondences", ".xmi");
        final var result = new TraceSecCorrespondenceBuilder().build(set, output, project, mappings, programModel);

        assertEquals(1, result.links().size());
        final EObject link = result.links().get(0);
        assertSame(expectedRequirement, link.eGet(link.eClass().getEStructuralFeature("source")));
        assertSame(programModel, link.eGet(link.eClass().getEStructuralFeature("target")));
    }

    private Resource createRequirementsResource(final ResourceSetImpl set, final String controlId) {
        final var factory = EcoreFactory.eINSTANCE;
        final var pkg = factory.createEPackage();
        pkg.setName("requirements");
        pkg.setNsPrefix("requirements");
        pkg.setNsURI("urn:test:tracesec:requirements");

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
        set.getPackageRegistry().put(pkg.getNsURI(), pkg);

        final EObject requirementsSet = pkg.getEFactoryInstance().create(requirementsSetClass);
        requirementsSet.eSet(setId, "ISO/IEC 27002:2022");
        requirementsSet.eSet(setTitle, "ISO/IEC 27002:2022");
        final EObject requirement = pkg.getEFactoryInstance().create(requirementClass);
        requirement.eSet(requirementId, controlId);
        @SuppressWarnings("unchecked")
        final List<EObject> requirements = (List<EObject>) requirementsSet.eGet(requirementsReference);
        requirements.add(requirement);

        final Resource resource = new ResourceImpl(URI.createURI("memory:/requirements.xmi"));
        set.getResources().add(resource);
        resource.getContents().add(requirementsSet);
        return resource;
    }

    @SuppressWarnings("unchecked")
    private EObject requirement(final Resource resource) {
        final EObject root = resource.getContents().get(0);
        return ((List<EObject>) root.eGet(root.eClass().getEStructuralFeature("requirements"))).get(0);
    }
}
