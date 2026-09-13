# ISO/IEC 27002 and TraceSec feature traceability

This integration separates immutable reference-artifact generation from normal project analysis.

## Runtime data flow

The intended TraceSec path is:

`Information Security -> security-property Quality -> ISO/IEC 27002 Requirement -> program element -> findings`

The same ISO/IEC 27002 `Requirement` EObject is referenced by both the generated quality model and the TraceSec correspondence model. The correspondence model provides the `Requirement -> program element` edge, while `Quality.relevantElements` provides the `Quality -> Requirement` edge.

## Program-model enrichment

`ProgramGraphProcessor` discovers HAnS and Antenna source annotations and creates `TPresenceCondition` annotations on the GRaViTY program model. This is independent of the standards taxonomy.

Project-specific feature refinements are supported. During standards analysis, `ProjectFeatureTaxonomyResolver` walks the project feature's parent chain until it reaches the nearest Herrmann/EMSE taxonomy feature. A project structure such as `encryption -> AES -> AES256` therefore keeps `AES256` as the concrete implementation feature while inheriting the standards meaning and mapping of `encryption`.

## One-time reference-artifact generation

Neither ISO PDF parsing nor EMSE workbook parsing is required during project analysis. The generator code lives in the separate `generator-src` Maven module and is not part of the assembled Eclipse bundle.

The simple API is:

```java
StandardsReferenceArtifactGenerator.generate(
    iso27002Pdf,
    emseWorkbook,
    requirementsEcore,
    standardPropertiesEcore,
    emseStandardsEcore,
    outputDirectory);
```

It produces three reusable files:

- `iso27002.requirements.xmi` — TraceSec `RequirementsSet`/`Requirement` instances;
- `iso27002.properties.xmi` — requirement IDs mapped to ISO/IEC 27002 information-security properties;
- `emse-standards.xmi` — the complete 68-feature Herrmann/EMSE taxonomy, aliases, and replication-workbook-derived standard-control mappings.

The sidecar metamodels are `model/standard-properties.ecore` and `model/emse-standards.ecore`. The requirements model conforms to TraceSec's `requirements.ecore`.

A command-line wrapper, `GenerateStandardsArtifacts`, invokes the same API for ad-hoc experimental generation.

## Loading reusable reference data

`StandardRequirementsModelLoader` loads the persisted requirements model and property sidecar into the shared EMF `ResourceSet`. Property entries are resolved back to the actual `Requirement` EObjects by requirement ID.

`EmseStandardsArtifactLoader` loads the persisted 68-feature taxonomy/mapping catalog. Normal analysis therefore does not read the replication XLSX and does not rebuild the catalog for each project.

For TraceSec construction the loaded EMSE catalog is filtered to ISO/IEC 27002 references. Custom project descendants inherit the nearest mapped taxonomy ancestor.

## Generated project artifacts

`TraceSecArtifactBuilder` consumes the parsed project feature model, loaded EMSE catalog, pre-generated standard model, and HAnS-enriched GRaViTY `TypeGraph`. It persists:

- `standards-traceability.xmi`: provenance explaining the taxonomy/mapping decision and matching presence conditions;
- `correspondence.xmi`: native TraceSec `TraceLink`s from ISO requirements to program elements;
- `quality-model.xmi`: `Information Security` plus security-property qualities whose `relevantElements` reference the corresponding ISO requirements.

`TraceSecExecutor` remains a subsequent, separate execution phase.

## Complete project pipeline

`StandardsAnalysisPipeline` is the application-level orchestration entry point. It:

1. loads the project feature model;
2. creates the GRaViTY program model through `GravityAPI`, including HAnS/Antenna enrichment;
3. persists the program model as `program.xmi`;
4. loads the pre-generated ISO/IEC 27002 requirements/property artifacts;
5. loads the pre-generated EMSE taxonomy/mapping artifact;
6. resolves concrete project features, including custom descendants, to ISO requirements;
7. creates and persists provenance, TraceSec correspondences, and the quality model.

The ISO and EMSE reference artifacts are project-independent and can be reused across experiments without regeneration.
