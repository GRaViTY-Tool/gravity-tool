package org.gravity.typegraph.spl.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.spl.SplFactory;
import org.gravity.typegraph.spl.features.YamlFeatureModelRepresentation;
import org.gravity.typegraph.spl.standards.FeatureMappingCatalog;
import org.gravity.typegraph.spl.standards.Iso2700xPdfImporter;
import org.gravity.typegraph.spl.standards.StandardControlReference;
import org.gravity.typegraph.spl.standards.TraceSecArtifactBuilder;
import org.junit.Test;

public class TraceSecArtifactsEndToEndTest {

    @Test
    public void buildsRequirementsQualityAndTraceSecCorrespondenceForCustomSubfeature() throws Exception {
        final Path yaml = Files.createTempFile("gravity-e2e-features", ".yaml");
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

        final ResourceSetImpl set = new ResourceSetImpl();
        final Path requirementsEcore = writeTemp("requirements", ".ecore", REQUIREMENTS_ECORE);
        final Path requirementsXmi = Files.createTempFile("iso-27002", ".xmi");
        final var imported = Iso2700xPdfImporter.importText(set, """
                8.24 Use of cryptography
                Information security properties
                #Confidentiality #Authenticity #Availability
                Operational capabilities
                #Cryptography
                """, requirementsEcore, requirementsXmi, Iso2700xPdfImporter.StandardKind.ISO_IEC_27002_2022);

        assertEquals(Set.of("Confidentiality", "Authenticity", "Availability"),
                imported.securityPropertiesByControl().get(imported.controls().get(0)));

        // Prove downstream quality generation uses the structured import result rather
        // than parsing Requirement.wording again.
        final EObject requirement = imported.controls().get(0);
        requirement.eSet(requirement.eClass().getEStructuralFeature("wording"), "Structured properties already extracted");

        final var catalog = new FeatureMappingCatalog(List.of(FeatureMappingCatalog.entry("encryption", List.of(),
                List.of(new StandardControlReference("ISO/IEC 27002:2022", "8.24")))));

        final var programModel = BasicFactory.eINSTANCE.createTypeGraph();
        programModel.setTName("Shop");
        final var presenceCondition = SplFactory.eINSTANCE.createTPresenceCondition();
        presenceCondition.setPc("AES256");
        programModel.getTAnnotation().add(presenceCondition);
        final Resource programResource = new ResourceImpl(URI.createURI("memory:/shop-program.xmi"));
        set.getResources().add(programResource);
        programResource.getContents().add(programModel);

        final Path traceabilityEcore = writeTemp("traceability", ".ecore", TRACEABILITY_ECORE);
        final Path qualityEcore = writeTemp("qualitymodel", ".ecore", QUALITY_ECORE);
        final Path traceabilityXmi = Files.createTempFile("traceability", ".xmi");
        final Path correspondenceXmi = Files.createTempFile("correspondence", ".xmi");
        final Path qualityXmi = Files.createTempFile("quality", ".xmi");

        final var result = new TraceSecArtifactBuilder().build(project, catalog, List.of(imported), set, programModel,
                traceabilityEcore, traceabilityXmi, correspondenceXmi, qualityEcore, qualityXmi);

        assertTrue(result.conformance().isConformant());
        assertEquals("encryption", result.conformance().canonicalFeatures().get("AES256"));
        assertTrue(result.mappings().unresolved().isEmpty());

        final var aesMapping = result.mappings().mappings().stream()
                .filter(mapping -> "AES256".equals(project.sourceName(mapping.feature())))
                .findFirst().orElseThrow();
        assertEquals("encryption", aesMapping.canonicalFeature());
        assertSame(requirement, aesMapping.control());

        assertEquals(1, result.correspondences().links().size());
        final EObject traceLink = result.correspondences().links().get(0);
        assertSame(requirement, traceLink.eGet(traceLink.eClass().getEStructuralFeature("source")));
        assertSame(programModel, traceLink.eGet(traceLink.eClass().getEStructuralFeature("target")));
        assertFalse(result.provenance().traces().isEmpty());

        assertTrue(result.qualityModel().qualities().containsKey("Confidentiality"));
        assertTrue(result.qualityModel().qualities().containsKey("Authenticity"));
        assertTrue(result.qualityModel().qualities().containsKey("Availability"));
        assertRelevant(result.qualityModel().qualities().get("Confidentiality"), requirement);
        assertRelevant(result.qualityModel().qualities().get("Authenticity"), requirement);
        assertRelevant(result.qualityModel().qualities().get("Availability"), requirement);
    }

    @SuppressWarnings("unchecked")
    private void assertRelevant(final EObject quality, final EObject requirement) {
        final List<EObject> relevant = (List<EObject>) quality
                .eGet(quality.eClass().getEStructuralFeature("relevantElements"));
        assertTrue(relevant.contains(requirement));
    }

    private Path writeTemp(final String prefix, final String suffix, final String content) throws Exception {
        final Path path = Files.createTempFile(prefix, suffix);
        Files.writeString(path, content);
        return path;
    }

    private static final String REQUIREMENTS_ECORE = """
            <?xml version="1.0" encoding="UTF-8"?>
            <ecore:EPackage xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" name="requirements" nsURI="http://www.tracesec.org/requirements" nsPrefix="requirements">
              <eClassifiers xsi:type="ecore:EClass" name="RequirementsSet" eSuperTypes="#//AbstractRequirement">
                <eStructuralFeatures xsi:type="ecore:EReference" name="requirements" upperBound="-1" eType="#//AbstractRequirement" containment="true"/>
              </eClassifiers>
              <eClassifiers xsi:type="ecore:EClass" name="Requirement" eSuperTypes="#//AbstractRequirement"/>
              <eClassifiers xsi:type="ecore:EClass" name="AbstractRequirement" abstract="true">
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="wording" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="id" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="title" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
              </eClassifiers>
            </ecore:EPackage>
            """;

    private static final String QUALITY_ECORE = """
            <?xml version="1.0" encoding="UTF-8"?>
            <ecore:EPackage xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" name="qualitymodel" nsURI="http://www.tracesec.org/qualitymodel" nsPrefix="org.tracesec.qualitymodel">
              <eClassifiers xsi:type="ecore:EClass" name="QualityModel">
                <eStructuralFeatures xsi:type="ecore:EReference" name="qualities" upperBound="-1" eType="#//Quality" containment="true"/>
                <eStructuralFeatures xsi:type="ecore:EReference" name="root" eType="#//Quality"/>
              </eClassifiers>
              <eClassifiers xsi:type="ecore:EClass" name="Quality">
                <eStructuralFeatures xsi:type="ecore:EReference" name="aspects" upperBound="-1" eType="#//Aspect" containment="true"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="title" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="description" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EReference" name="relevantElements" upperBound="-1" eType="ecore:EClass http://www.eclipse.org/emf/2002/Ecore#//EObject"/>
              </eClassifiers>
              <eClassifiers xsi:type="ecore:EClass" name="Aspect">
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="priority" eType="#//Priority"/>
                <eStructuralFeatures xsi:type="ecore:EReference" name="quality" eType="#//Quality"/>
              </eClassifiers>
              <eClassifiers xsi:type="ecore:EEnum" name="Priority">
                <eLiterals name="LOW" value="25"/>
                <eLiterals name="MEDIUM" value="50"/>
                <eLiterals name="HIGH" value="75"/>
                <eLiterals name="ESSENTIAL" value="100"/>
              </eClassifiers>
            </ecore:EPackage>
            """;

    private static final String TRACEABILITY_ECORE = """
            <?xml version="1.0" encoding="UTF-8"?>
            <ecore:EPackage xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" name="standardstraceability" nsURI="http://www.gravity-tool.org/standards/traceability" nsPrefix="standardstraceability">
              <eClassifiers xsi:type="ecore:EClass" name="TraceModel">
                <eStructuralFeatures xsi:type="ecore:EReference" name="featureTraces" upperBound="-1" containment="true" eType="#//FeatureStandardTrace"/>
              </eClassifiers>
              <eClassifiers xsi:type="ecore:EClass" name="FeatureStandardTrace">
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="canonicalFeature" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="projectFeature" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="relation" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="source" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
                <eStructuralFeatures xsi:type="ecore:EAttribute" name="confidence" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDouble" defaultValueLiteral="1.0"/>
                <eStructuralFeatures xsi:type="ecore:EReference" name="requirementsSet" eType="ecore:EClass http://www.eclipse.org/emf/2002/Ecore#//EObject"/>
                <eStructuralFeatures xsi:type="ecore:EReference" name="requirement" eType="ecore:EClass http://www.eclipse.org/emf/2002/Ecore#//EObject"/>
                <eStructuralFeatures xsi:type="ecore:EReference" name="programElements" upperBound="-1" eType="ecore:EClass http://www.eclipse.org/emf/2002/Ecore#//EObject"/>
                <eStructuralFeatures xsi:type="ecore:EReference" name="presenceConditions" upperBound="-1" eType="ecore:EClass http://www.eclipse.org/emf/2002/Ecore#//EObject"/>
              </eClassifiers>
            </ecore:EPackage>
            """;
}
