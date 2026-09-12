# ISO standards and feature traceability

This integration keeps source-level feature discovery separate from the security-feature taxonomy.

## Independent program-model enrichment

`ProgramGraphProcessor` and `TypeProcessor` discover HAnS and Antenna annotations and create `TPresenceCondition` annotations on GRaViTY program elements. This step neither loads nor validates the EMSE security-feature taxonomy. A project may therefore use any project-specific feature model when only variability-aware program discovery is required.

## Standards are TraceSec requirements models

Standards are represented with TraceSec's existing `org.tracesec.requirements/model/requirements.ecore`; GRaViTY no longer defines a parallel `standards.ecore`.

`Iso2700xPdfImporter` accepts a locally available, legitimately obtained ISO/IEC 27001:2022 or ISO/IEC 27002:2022 PDF and a path to TraceSec's `requirements.ecore`. PDFBox is used only to extract text. The importer creates an XMI model with:

- a root `RequirementsSet` for the standard,
- nested `RequirementsSet`s for control groups,
- a `Requirement` for each parsed control.

For ISO/IEC 27001, only Annex-A control headings (`A.5.x` through `A.8.x`) are interpreted as controls; similarly numbered management-system clauses are ignored. For ISO/IEC 27002, control headings `5.x` through `8.x` are parsed. The ISO/IEC 27002 information-security-property attribute block remains in each requirement's `wording` and is used when generating the TraceSec quality model.

The repository does not contain ISO standard text. Tests use synthetic text fragments.

## EMSE taxonomy and authoritative standards mapping

The EMSE taxonomy contains 68 implementation-level security features. A project only has to conform to this taxonomy when the EMSE standards workflow is requested; taxonomy conformance is not a prerequisite for HAnS parsing or program-model enrichment.

The standards-to-feature mapping is not reconstructed from ISO prose and is not hard-coded from the article summary. It is read from the article replication package:

- DOI: `https://doi.org/10.5281/zenodo.11091429`
- workbook: `2) Systematic Review - Security Standards.xlsx`
- Zenodo MD5 published for that workbook: `61849150ceb83e38d704348d7dd7d972`

Zenodo describes this workbook as the review of the security standards with the mapping to the paper taxonomy, with one sheet per security standard.

`EmseSecurityStandardsWorkbookParser` reads the XLSX directly with JDK ZIP/XML APIs and creates the `StandardControlReference`s. `EmseStandardsTraceabilityIntegration` then merges those references into the separately supplied complete 68-feature taxonomy. Any workbook feature that cannot be resolved to the taxonomy causes the standards workflow to fail rather than silently changing the taxonomy.

This separation is intentional:

- taxonomy catalog: canonical 68 features plus project aliases,
- replication workbook: standard/control -> taxonomy-feature mappings.

## Quality model

`DynamicQualityModelGenerator` loads TraceSec's `qualitymodel.ecore` dynamically and creates an Information Security root with Confidentiality, Integrity, and Availability qualities. It scans imported standard `Requirement`s for the ISO/IEC 27002 `Information security properties` attribute block and links the corresponding requirements through `Quality.relevantElements`.

Thus both the standards side and the quality side reuse TraceSec metamodels.

## Trace chain

`StandardTraceabilityBuilder` creates an instance of `model/standards-traceability.ecore`. Each `FeatureStandardTrace` references:

- the root TraceSec `RequirementsSet` representing the standard,
- the TraceSec `Requirement` representing the mapped control,
- the canonical EMSE taxonomy feature and corresponding project feature name,
- mapping relation, replication-package source, and confidence,
- GRaViTY program elements carrying that feature in a presence condition,
- the corresponding `TPresenceCondition` objects.

The resulting trace chain is:

`Quality -> Requirement (standard control) -> FeatureStandardTrace -> program element / TPresenceCondition`

The join from the standard requirement to `FeatureStandardTrace` is represented by the trace model. No generated TraceSec Java classes are required by the integration plugin; both TraceSec Ecore packages are loaded dynamically.
