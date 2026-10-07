# YAML project feature models and standards mappings

`org.gravity.typegraph.spl` accepts `.yaml` and `.yml` wherever
`VariabilityAwareProgramModel` accepts a FeatureIDE feature-model path. YAML is
converted into the same `IFeatureModel` used by the existing SPL analysis.

## Project YAML

```yaml
project: Shop
defaultMandatory: true
root:
  name: Shop
  group: and
  children:
    - name: Authentication
      securityFeature: authentication
      standards:
        - standard: ISO/IEC 27002:2022
          control: "5.17"
          relation: REALIZES
          source: project-features.yaml
    - name: Encryption
      optional: true
      securityFeature: encryption
```

Supported groups are `and`, `or`, and `alternative`/`xor`. Children may be a
list or a keyed map. A top-level `features:` block can be used instead of an
explicit `root:`; in that case `project:` becomes the synthetic root.

`defaultMandatory` defaults to `true`, because this format is intended to also
represent a concrete project's contained features. Set it to `false` for a
variability model and override individual features using `mandatory: true`.

## Curated mapping catalog

Project feature names should not be matched to controls by fuzzy text. A
catalog provides stable aliases from project-local names to canonical security
features and then to control identifiers:

```yaml
features:
  authentication:
    aliases:
      - Login
      - Sign In
    controls:
      - standard: ISO/IEC 27002:2022
        control: "5.17"
        relation: REALIZES
        source: curated
        confidence: 1.0
```

Direct mappings in the project YAML and catalog mappings are combined.
Mappings are resolved to the actual EMF `Control` `EObject`; the standards
metamodel is loaded dynamically and is therefore not a compile-time dependency
of the SPL plugin.

## Java API

```java
var standards = DynamicStandardsModelLoader.load(
    Path.of("standards.ecore"), Path.of("iso27002.xmi"));

var result = ProjectStandardsIntegration.load(
    Path.of("features.yaml"),
    Path.of("feature-control-mappings.yaml"),
    List.of(standards.model()));

IFeatureModel featureModel = result.project().featureModel();
for (var mapping : result.mappings().mappings()) {
    IFeature feature = mapping.feature();
    EObject control = mapping.control();
}
```

`FeatureModelLoader.load(path)` is the compatibility entry point used by
`VariabilityAwareProgramModel`: FeatureIDE formats keep using
`FeatureModelManager`, while `.yaml`/`.yml` files use `YamlFeatureModelParser`.
