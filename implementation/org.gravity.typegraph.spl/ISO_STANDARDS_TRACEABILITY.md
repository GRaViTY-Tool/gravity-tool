# ISO/IEC 27002 and TraceSec feature traceability

This integration separates immutable standard-artifact generation from normal project analysis.

## Runtime data flow

The intended TraceSec path is:

`Information Security -> security-property Quality -> ISO/IEC 27002 Requirement -> program element -> findings`

The same ISO/IEC 27002 `Requirement` EObject is referenced by both the generated quality model and the TraceSec correspondence model. The correspondence model therefore provides the `Requirement -> program element` edge, while `Quality.relevantElements` provides the `Quality -> Requirement` edge.

## Program-model enrichment

`ProgramGraphProcessor` discovers HAnS and Antenna source annotations and creates `TPresenceCondition` annotations on the GRaViTY program model. This is independent of the standards taxonomy.

Project-specific feature refinements are supported. During standards analysis, `ProjectFeatureTaxonomyResolver` walks the project feature's parent chain until it reaches the nearest Herrmann/EMSE taxonomy feature. A project structure such as `encryption -> AES -> AES256` therefore keeps `AES256` as the concrete implementation feature while inheriting the standards meaning and mapping of `encryption`.

## One-time ISO/IEC 27002 artifact generation

ISO/IEC 27002 PDF parsing is not part of the assembled Eclipse plugin.

The generator source is under:

`generator-src/org/gravity/typegraph/spl/standards/generator/Iso27002ModelGenerator.java`

`generator-src` is intentionally absent from `source..` in `build.properties`, and PDFBox is not on the runtime bundle classpath. Consequently the ISO parser and PDFBox are not shipped with the plugin/product.

The one-time generator consumes a legitimately obtained ISO/IEC 27002:2022 PDF and produces two reusable artifacts:

- a TraceSec requirements XMI containing `RequirementsSet`/`Requirement` instances;
- a security-property sidecar XMI mapping requirement IDs to the extracted ISO/IEC 27002 information-security properties.

The sidecar conforms to `model/standard-properties.ecore`. It exists because the TraceSec requirements metamodel intentionally remains unchanged and does not contain the ISO information-security-property attribute.

Once these two files have been generated, project analysis never reparses the ISO PDF.

## Loading the generated standard

`StandardRequirementsModelLoader` loads the persisted requirements model and property sidecar into a shared EMF `ResourceSet` and returns a `StandardRequirementsModel`. Property entries are resolved back to the actual `Requirement` EObjects by requirement ID.

Downstream code depends on `StandardRequirementsModel`, not on the ISO importer/generator.

## Standards mappings

The 68-feature Herrmann/EMSE taxonomy remains the standards-level feature vocabulary. The authoritative feature-to-standard mappings are read from the replication-package workbook. Custom project descendants inherit the nearest mapped taxonomy ancestor.

For TraceSec construction the mapping set is filtered to ISO/IEC 27002 references.

## Generated project artifacts

`TraceSecArtifactBuilder` consumes:

- the parsed project feature model;
- the Herrmann/EMSE taxonomy and standards mappings;
- one or more pre-generated `StandardRequirementsModel`s;
- the HAnS-enriched GRaViTY `TypeGraph`.

It persists:

- `standards-traceability.xmi`: provenance explaining the taxonomy/mapping decision and matching presence conditions;
- `correspondence.xmi`: native TraceSec `TraceLink`s from ISO requirements to program elements;
- `quality-model.xmi`: `Information Security` plus security-property qualities whose `relevantElements` reference the corresponding ISO requirements.

`TraceSecExecutor` remains a subsequent, separate execution phase.

## Complete project pipeline

`StandardsAnalysisPipeline` is the application-level orchestration entry point. It:

1. loads the project feature model;
2. creates the GRaViTY program model through `GravityAPI` (therefore executing the registered HAnS/Antenna program-graph processor);
3. persists the resulting program model as `program.xmi`;
4. loads the pre-generated ISO/IEC 27002 requirements and property artifacts;
5. resolves concrete project features, including custom descendants, to taxonomy mappings and ISO requirements;
6. creates and persists provenance, TraceSec correspondences, and the quality model.

The ISO requirements model is an already-persisted input artifact and is reused rather than regenerated or copied for each project.
