# Configurable project feature representations

GRaViTY normalizes external project feature descriptions to FeatureIDE's `IFeatureModel` through the `FeatureModelRepresentation` SPI.

Built-in representations:

- `yaml`: GRaViTY's structured YAML format (`.yaml`, `.yml`)
- `hans`: HAnS indentation-based feature model (`.feature-model`)
- `featureide`: any format natively supported by FeatureIDE

Automatic mode selects YAML or HAnS by extension and otherwise delegates to FeatureIDE.

```java
var project = FeatureModelLoader.loadProject(Path.of(".feature-model"));
```

A representation can be forced explicitly:

```java
var options = FeatureModelLoadingOptions.representation("hans");
var project = FeatureModelLoader.loadProject(Path.of("features.txt"), options);
```

HAnS only encodes a hierarchy. During normalization, each parent is represented as an AND group and children are mandatory by default. This matches the use case of a model describing features contained in a concrete software project. The behavior can be changed with `FeatureModelLoadingOptions`.

HAnS permits references to identically named features by location/path (LPQ). FeatureIDE requires globally unique feature names. Three normalization strategies are available:

```java
new FeatureModelLoadingOptions(
    "hans",
    HansNameStrategy.QUALIFY_ON_COLLISION,
    true);
```

- `SIMPLE_STRICT`: reject duplicate simple names.
- `QUALIFY_ON_COLLISION`: keep simple names unless duplicated; duplicated features become `Parent::Child` LPQs.
- `ALWAYS_QUALIFIED`: every FeatureIDE feature uses its complete HAnS LPQ.

For standards mapping, the adapter preserves the original HAnS simple name separately from the normalized FeatureIDE identifier. Therefore a mapping catalog can still use `Logging` even when the FeatureIDE model contains `Shop::Audit::Logging`.

The registry is extensible:

```java
var registry = new FeatureModelRepresentationRegistry(options)
    .register(new MyProjectFeatureRepresentation());

var project = FeatureModelLoader.loadProject(path, options, registry);
```

## Scope of HAnS support

This adapter reads HAnS's `.feature-model` hierarchy. HAnS's embedded annotations (`&begin[...]`, `&end[...]`, `&line[...]`) and `.feature-to-file` / `.feature-to-folder` files describe *feature locations in implementation artifacts*, not the feature model itself. They should be handled by a separate feature-location adapter and can later be connected to GRaViTY `TAnnotatable` elements.
