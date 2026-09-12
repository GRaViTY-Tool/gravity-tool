# ISO standards and TraceSec feature traceability

This integration keeps source-level feature discovery separate from the security-feature taxonomy and only introduces the EMSE/standards assumptions when TraceSec standards traceability is requested.

## Independent program-model enrichment

`ProgramGraphProcessor` and `TypeProcessor` discover HAnS and Antenna annotations and create `TPresenceCondition` annotations on GRaViTY program elements. This step neither loads nor validates the EMSE security-feature taxonomy. A project may therefore use any project-specific feature model when only variability-aware program discovery is required.

## EMSE taxonomy with project-specific descendants

The EMSE taxonomy contains 68 implementation-level security features. The built-in catalog contains those canonical names and aliases. For the standards workflow a project feature does not have to be one of the 68 names itself: it is also conformant when walking its FeatureIDE parent chain reaches an EMSE feature. This supports project-specific refinements such as `encryption -> AES -> AES256` while keeping `encryption` as the standards-level meaning.

For standards mapping, the same parent walk continues until the nearest EMSE feature with a mapping for the selected standard is found. Consequently a custom descendant, and also an EMSE feature without its own ISO/IEC 27002 mapping, can inherit the nearest applicable mapping from its taxonomy ancestors.

## Standards are TraceSec requirements models

Standards are represented with TraceSec's existing `org.tracesec.requirements/model/requirements.ecore`; GRaViTY does not define a parallel standards metamodel.

`Iso2700xPdfImporter` accepts a locally available, legitimately obtained ISO/IEC 27001:2022 or ISO/IEC 27002:2022 PDF and a path to TraceSec's `requirements.ecore`. The importer creates:

- a root `RequirementsSet` for the standard,
- nested `RequirementsSet`s for control groups,
- a `Requirement` for each parsed control.

The repository does not contain ISO standard text. Tests use synthetic text fragments.

## Authoritative EMSE standards mapping

The standards-to-feature mapping is read from the article replication package rather than reconstructed from standard prose:

- DOI: `https://doi.org/10.5281/zenodo.11091429`
- workbook: `2) Systematic Review - Security Standards.xlsx`
- published MD5: `61849150ceb83e38d704348d7dd7d972`

`EmseSecurityStandardsWorkbookParser` reads the XLSX directly with JDK ZIP/XML APIs and creates `StandardControlReference`s. `EmseStandardsTraceabilityIntegration` merges those references into the complete 68-feature taxonomy. The TraceSec-specific workflow filters the resulting references to ISO/IEC 27002; mappings to the other standards reviewed in the workbook are not introduced into that flow network.

## ISO/IEC 27002-derived quality model

`DynamicQualityModelGenerator` loads TraceSec's `qualitymodel.ecore` dynamically. It creates an `Information Security` root and discovers every value in the ISO/IEC 27002 `Information security properties` attribute of the imported requirements. Each discovered property becomes a direct child `Quality`, and the corresponding ISO/IEC 27002 `Requirement` objects are added to `Quality.relevantElements`.

The importer does not hard-code CIA. It parses the hashtag-labelled values generically, so properties such as `Authenticity`, `Accountability`, and `Non-repudiation` are represented when present, together with Confidentiality, Integrity, Availability, or other properties found in the standard. Every generated aspect currently receives TraceSec priority `ESSENTIAL`.

## TraceSec-native requirement-to-code links

`TraceSecCorrespondenceBuilder` creates the inter-model links used by TraceSec's `GraphBuilder`. The output is a Moflon `CorrespondenceModel` containing TraceSec `TraceLink` objects with:

- `source` = the ISO/IEC 27002 `Requirement`,
- `target` = the GRaViTY program element whose presence condition contains the mapped project feature.

Duplicate requirement/program-element pairs are removed. The build result also reports mappings for which no annotated program location was found.

The builder uses the exact TraceSec/Moflon namespace URIs. If those generated packages are already registered in the supplied `ResourceSet`, they are reused; otherwise compatible dynamic package definitions are used for serialization. This avoids a compile-time dependency from GRaViTY to the TraceSec repository while producing an XMI model that TraceSec can load with its generated packages.

## Provenance sidecar

`StandardTraceabilityBuilder` still creates `model/standards-traceability.ecore` instances, but this model is provenance rather than the flow-network link. It records:

- root `RequirementsSet` and mapped `Requirement`,
- canonical EMSE feature and concrete project feature,
- mapping relation, replication-workbook source, and confidence,
- matching GRaViTY program elements and `TPresenceCondition`s.

TraceSec consumes the native correspondence model, while this sidecar retains the evidence explaining why each correspondence exists.

## End-to-end TraceSec path

`EmseStandardsTraceabilityIntegration.createTraceSec(...)` creates the standards-derived artifacts for the prioritization workflow:

1. validate each project feature against itself or an EMSE ancestor,
2. read the authoritative replication workbook,
3. retain ISO/IEC 27002 control mappings,
4. resolve project features/custom descendants to ISO/IEC 27002 `Requirement`s,
5. create provenance traces,
6. create native TraceSec `Requirement -> program element` correspondences,
7. create the quality model from all ISO/IEC 27002 information-security properties.

With TraceSec's SonarLint enrichment on the same GRaViTY `TypeGraph`, the flow network can follow:

`Information Security -> security property Quality -> ISO/IEC 27002 Requirement -> program element -> SonarLintFinding`
