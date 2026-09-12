package org.gravity.typegraph.spl.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFactory;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.spl.SplFactory;
import org.gravity.typegraph.spl.features.YamlFeatureModelRepresentation;
import org.gravity.typegraph.spl.standards.FeatureMappingCatalog;
import org.gravity.typegraph.spl.standards.Iso2700xPdfImporter;
import org.gravity.typegraph.spl.standards.StandardControlReference;
import org.gravity.typegraph.spl.standards.TraceSecArtifactBuilder;
import org.gravity.typegraph.spl.standards.TraceSecExecutor;
import org.junit.Test;
import org.moflon.tgg.runtime.RuntimePackage;
import org.tracesec.prioritization.tracegraph.Graph;
import org.tracesec.prioritization.tracelinks.TracelinksPackage;
import org.tracesec.qualitymodel.QualityModel;
import org.tracesec.qualitymodel.QualityModelPackage;
import org.tracesec.requirements.RequirementsPackage;
import org.tracesec.requirements.RequirementsSet;

/**
 * Crosses the real serialization/runtime boundary: GRaViTY constructs the
 * standards artifacts, then TraceSec reloads and executes them using its generated
 * packages from the checked-out TraceSec submodule.
 */
public class TraceSecRuntimeEndToEndTest {

    @Test
    public void executesConstructedArtifactsWithRealTraceSecRuntime() throws Exception {
        final Path yaml = Files.createTempFile("gravity-tracesec-runtime", ".yaml");
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

        final Path requirementsEcore = materializeGeneratedEcore(RequirementsPackage.eINSTANCE, "requirements");
        final Path qualityEcore = materializeGeneratedEcore(QualityModelPackage.eINSTANCE, "qualitymodel");
        final Path traceabilityEcore = writeTemp("standards-traceability", ".ecore", TRACEABILITY_ECORE);
        final Path requirementsXmi = Files.createTempFile("iso-27002", ".xmi");
        final Path programXmi = Files.createTempFile("shop-program", ".xmi");
        final Path traceabilityXmi = Files.createTempFile("standards-traceability", ".xmi");
        final Path correspondenceXmi = Files.createTempFile("tracesec-correspondence", ".xmi");
        final Path qualityXmi = Files.createTempFile("tracesec-quality", ".xmi");
        final Path flowGraphXmi = Files.createTempFile("tracesec-flowgraph", ".xmi");
        final Path configuration = writeTemp("gravity", ".tracesec", TRACESEC_CONFIGURATION);

        final ResourceSetImpl constructionSet = new ResourceSetImpl();
        constructionSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",
                new XMIResourceFactoryImpl());
        constructionSet.getPackageRegistry().put(RuntimePackage.eNS_URI, RuntimePackage.eINSTANCE);
        constructionSet.getPackageRegistry().put(TracelinksPackage.eNS_URI, TracelinksPackage.eINSTANCE);
        constructionSet.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
        constructionSet.getPackageRegistry().put(SonarlintPackage.eNS_URI, SonarlintPackage.eINSTANCE);

        final var imported = Iso2700xPdfImporter.importText(constructionSet, """
                8.24 Use of cryptography
                Information security properties
                #Confidentiality #Authenticity #Availability
                Operational capabilities
                #Cryptography
                """, requirementsEcore, requirementsXmi, Iso2700xPdfImporter.StandardKind.ISO_IEC_27002_2022);

        final var catalog = new FeatureMappingCatalog(List.of(FeatureMappingCatalog.entry("encryption", List.of(),
                List.of(new StandardControlReference("ISO/IEC 27002:2022", "8.24")))));

        final var programModel = BasicFactory.eINSTANCE.createTypeGraph();
        programModel.setTName("Shop");
        final var presenceCondition = SplFactory.eINSTANCE.createTPresenceCondition();
        presenceCondition.setPc("AES256");
        programModel.getTAnnotation().add(presenceCondition);

        final SonarlintFinding finding = SonarlintFactory.eINSTANCE.createSonarlintFinding();
        finding.setRulekey("java:S9999");
        finding.setRulename("Runtime integration fixture");
        finding.setDescription("Synthetic finding used to prove the TraceSec execution path.");
        programModel.getTAnnotation().add(finding);

        final Resource programResource = constructionSet
                .createResource(URI.createFileURI(programXmi.toAbsolutePath().toString()));
        programResource.getContents().add(programModel);
        programResource.save(Map.of());

        final var artifacts = new TraceSecArtifactBuilder().build(project, catalog, List.of(imported), constructionSet,
                programModel, traceabilityEcore, traceabilityXmi, correspondenceXmi, qualityEcore, qualityXmi);

        assertTrue(artifacts.conformance().isConformant());
        assertTrue(artifacts.mappings().unresolved().isEmpty());
        assertEquals(1, artifacts.correspondences().links().size());
        assertTrue(artifacts.qualityModel().qualities().containsKey("Confidentiality"));
        assertTrue(artifacts.qualityModel().qualities().containsKey("Authenticity"));
        assertTrue(artifacts.qualityModel().qualities().containsKey("Availability"));

        final var request = new TraceSecExecutor.Request(configuration,
                List.of(BasicPackage.eNS_URI, RequirementsPackage.eNS_URI, QualityModelPackage.eNS_URI),
                List.of(programXmi, requirementsXmi), correspondenceXmi, qualityXmi, flowGraphXmi);
        final var execution = new TraceSecExecutor().execute(request);

        assertNotNull(execution.graph());
        assertTrue(execution.graph() instanceof Graph);
        final Graph graph = (Graph) execution.graph();
        assertFalse(graph.getNodes().isEmpty());
        assertFalse(graph.getEdges().isEmpty());
        assertTrue(Files.size(flowGraphXmi) > 0);

        final Resource runtimeRequirements = execution.resourceSet()
                .getResource(URI.createFileURI(requirementsXmi.toAbsolutePath().toString()), false);
        final Resource runtimeQuality = execution.resourceSet()
                .getResource(URI.createFileURI(qualityXmi.toAbsolutePath().toString()), false);
        assertNotNull(runtimeRequirements);
        assertNotNull(runtimeQuality);
        assertTrue(runtimeRequirements.getContents().get(0) instanceof RequirementsSet);
        assertTrue(runtimeQuality.getContents().get(0) instanceof QualityModel);

        final List<SonarlintFinding> prioritized = execution.prioritizedFindings().values().stream()
                .flatMap(List::stream).map(SonarlintFinding.class::cast).toList();
        assertEquals(1, prioritized.size());
        assertEquals("java:S9999", prioritized.get(0).getRulekey());
        assertFalse(execution.prioritizedFindings().isEmpty());
        assertTrue("The finding must be reachable from the quality root in the TraceSec flow graph",
                execution.prioritizedFindings().firstKey() > 0);
    }

    private static Path materializeGeneratedEcore(final EPackage ePackage, final String prefix) throws Exception {
        final Path path = Files.createTempFile(prefix, ".ecore");
        final ResourceSetImpl set = new ResourceSetImpl();
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
        final Resource resource = set.createResource(URI.createFileURI(path.toAbsolutePath().toString()));
        resource.getContents().add(EcoreUtil.copy(ePackage));
        resource.save(Map.of());
        return path;
    }

    private static Path writeTemp(final String prefix, final String suffix, final String content) throws Exception {
        final Path path = Files.createTempFile(prefix, suffix);
        Files.writeString(path, content);
        return path;
    }

    private static final String TRACESEC_CONFIGURATION = """
            namespace "http://www.gravity-tool.org/typegraph/antipatterngraph/sonarlint" {}

            namespace "http://www.gravity-tool.org/typegraph/basic" {
                default = 1
                consider = ALL
                include {
                    type TAnnotatable {
                        include {
                            reference tAnnotation -- SonarlintFinding -> 99999
                        }
                    }
                }
            }

            namespace "http://www.tracesec.org/qualitymodel" {
                consider = NONE
                include {
                    type Quality {
                        include {
                            reference aspects -- Aspect -- quality -> assoc.priority
                        }
                    }
                }
            }
            """;

    private static final String TRACEABILITY_ECORE = """
            <?xml version="1.0" encoding="UTF-8"?>
            <ecore:EPackage xmi:version="2.0"
                xmlns:xmi="http://www.omg.org/XMI"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore"
                name="standardstraceability"
                nsURI="http://www.gravity-tool.org/standards/traceability"
                nsPrefix="standardstraceability">
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
                <eStructuralFeatures xsi:type="ecore:EReference" name="programElements" upperBound="-1" unique="true" eType="ecore:EClass http://www.eclipse.org/emf/2002/Ecore#//EObject"/>
                <eStructuralFeatures xsi:type="ecore:EReference" name="presenceConditions" upperBound="-1" unique="true" eType="ecore:EClass http://www.eclipse.org/emf/2002/Ecore#//EObject"/>
              </eClassifiers>
            </ecore:EPackage>
            """;
}
