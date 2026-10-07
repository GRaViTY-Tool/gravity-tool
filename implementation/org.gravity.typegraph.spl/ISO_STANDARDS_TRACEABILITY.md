# ISO/IEC 27002 and TraceSec feature traceability

This integration separates reusable standards reference data from normal project analysis.

## Runtime data flow

The intended TraceSec path is:

`Information Security -> security-property Quality -> ISO/IEC 27002 Requirement -> program element -> findings`

The same ISO/IEC 27002 `Requirement` EObject is referenced by both the generated quality model and the TraceSec correspondence model. The correspondence model provides the `Requirement -> program element` edge, while `Quality.relevantElements` provides the `Quality -> Requirement` edge.

## Program-model enrichment

`ProgramGraphProcessor` discovers HAnS and Antenna source annotations and creates `TPresenceCondition` annotations on the GRaViTY program model. This is independent of the standards taxonomy.

Project-specific feature refinements are supported. During standards analysis, `ProjectFeatureTaxonomyResolver` walks the project feature's parent chain until it reaches the nearest Herrmann/EMSE taxonomy feature. A project structure such as `encryption -> AES -> AES256` therefore keeps `AES256` as the concrete implementation feature while inheriting the standards meaning and mapping of `encryption`.

## ISO/IEC 27002 reference-artifact generation

ISO PDF parsing is not required during project analysis. The ISO generator code lives in the separate `generator-src` Maven module and is not part of the assembled Eclipse bundle.

`Iso27002ModelGenerator.generate(...)` consumes a legitimately obtained ISO/IEC 27002:2022 PDF and produces two reusable files:

- a TraceSec requirements XMI containing `RequirementsSet`/`Requirement` instances;
- a security-property sidecar XMI mapping requirement IDs to ISO/IEC 27002 information-security properties.

The command-line wrapper `GenerateIso27002` invokes the same generator for ad-hoc experimental generation. The sidecar conforms to `model/standard-properties.ecore`; the requirements model conforms to TraceSec's `requirements.ecore`.

Once generated, project analysis loads these artifacts and does not reparse the ISO PDF.

## Manually maintained EMSE standards catalog

The Herrmann/EMSE taxonomy and its feature-to-standard mappings are stored as a small XMI artifact conforming to `model/emse-standards.ecore`.

The EMSE catalog XMI is maintained manually for experiments. There is deliberately no EMSE workbook/XLSX parser or generator in either the runtime plugin or `generator-src`.

The catalog contains the canonical taxonomy feature names, aliases, and `ControlReference` entries with standard identifier, control identifier, relation, provenance source, and confidence. `EmseStandardsArtifactLoader` loads the XMI and converts it to the runtime `FeatureMappingCatalog`. It also validates that the loaded catalog contains the complete 68-feature taxonomy.

For TraceSec construction the loaded catalog is filtered to ISO/IEC 27002 references. Custom project descendants inherit the nearest mapped taxonomy ancestor.

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
5. loads the manually maintained EMSE taxonomy/mapping XMI;
6. resolves concrete project features, including custom descendants, to ISO requirements;
7. creates and persists provenance, TraceSec correspondences, and the quality model.

The ISO and EMSE reference artifacts are project-independent and can be reused across experiments.
