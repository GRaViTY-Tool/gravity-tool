# ISO standards and feature traceability

This integration keeps source-level feature discovery separate from the security-feature taxonomy.

## Independent program-model enrichment

`ProgramGraphProcessor` and `TypeProcessor` discover HAnS and Antenna annotations and create `TPresenceCondition` annotations on GRaViTY program elements. This step neither loads nor validates the EMSE security-feature taxonomy. A project may therefore use any project-specific feature model when only variability-aware program discovery is required.

## ISO/IEC 27001 and 27002 import

`Iso2700xPdfImporter` accepts a locally available, legitimately obtained ISO/IEC 27001:2022 or ISO/IEC 27002:2022 PDF. PDFBox is used only to extract text. The importer then creates an XMI instance of `model/standards.ecore`.

For ISO/IEC 27001, only Annex-A control headings (`A.5.x` through `A.8.x`) are interpreted as controls; similarly numbered management-system clauses are ignored. For ISO/IEC 27002, control headings `5.x` through `8.x` are parsed. ISO/IEC 27002 information-security properties are extracted from the control attribute block and stored as `Confidentiality`, `Integrity`, and/or `Availability` on the control.

The repository does not contain ISO standard text. Tests use synthetic text fragments.

## EMSE taxonomy prerequisite

The taxonomy and the standards mapping from the EMSE paper are represented by the existing `FeatureMappingCatalog`. A complete catalog should contain all canonical taxonomy features and aliases; features without a mapping to a selected standard may have an empty `controls` list.

`ProjectTaxonomyConformance` is invoked only by `EmseStandardsTraceabilityIntegration`. If a project feature cannot be resolved to the supplied taxonomy, the standards workflow fails before creating taxonomy-based trace links. This constraint does not apply to HAnS parsing or program-model enrichment.

The complete paper-derived control-to-feature mapping should be supplied from the paper replication package rather than reconstructed from ISO prose or hard-coded into the parser.

## Trace chain

`DynamicQualityModelGenerator` loads the TraceSec quality metamodel dynamically and creates an Information Security root with Confidentiality, Integrity, and Availability qualities. Each quality references the parsed `Control` EObjects through TraceSec's `Quality.relevantElements` reference.

`StandardTraceabilityBuilder` creates an instance of `model/standards-traceability.ecore`. Each `FeatureStandardTrace` references:

- the parsed `Standard` and `Control`,
- the canonical EMSE taxonomy feature and the corresponding project feature name,
- the mapping relation, source, and confidence,
- the GRaViTY program elements carrying that feature in a presence condition,
- the corresponding `TPresenceCondition` objects.

The resulting navigable trace chain is therefore:

`Quality -> Control -> FeatureStandardTrace -> program element / TPresenceCondition`

The join from `Control` to `FeatureStandardTrace` is explicit in the trace model; no generated standards or TraceSec Java classes are required by the integration plugin.
