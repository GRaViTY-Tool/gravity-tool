# HAnS source annotations

`org.gravity.eclipse.java.spl` recognizes HAnS embedded feature annotations in addition to Antenna preprocessor annotations.

Supported HAnS markers are the syntax used by HAnS:

```java
// &begin[Authentication]
void login() { ... }
// &end[Authentication]

int auditLevel; // &line[Logging]
```

Location/path-qualified feature references such as `Security::Authentication` and multiple references in one marker are supported.

The source parser maps annotations at the granularity already used by `JavaProjectSplDiscoverer`:

* `&begin[...]` / `&end[...]` applies when the complete discovered program element lies inside the block.
* `&line[...]` applies to a discovered program element whose start is on the annotated line.
* nested HAnS blocks yield multiple feature expressions; downstream presence-condition handling combines multiple annotations in the same way as existing annotations.

For compatibility with existing callers, the legacy `getSurroundingAntennaAnnotations` and `hasAntennaAnnotations` methods now delegate to the combined feature-annotation view. Code that specifically needs Antenna-only results can use `getSurroundingOnlyAntennaAnnotations` and `containsAntennaAnnotations`.

HAnS `.feature-model` files are loaded by the configurable feature-representation support in `org.gravity.typegraph.spl`, so the embedded annotation names and the loaded feature model can be used in the existing variability pipeline.
