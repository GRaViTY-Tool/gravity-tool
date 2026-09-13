package org.gravity.typegraph.spl.standards;

import java.nio.file.Path;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.gravity.typegraph.spl.FeatureModelLoader;
import org.gravity.typegraph.spl.features.FeatureModelLoadingOptions;
import org.gravity.typegraph.spl.features.ParsedProjectFeatureModel;
import org.gravity.typegraph.spl.yaml.YamlFeatureMappingCatalogParser;

/** Facade for loading any configured project feature representation and mapping it to standards. */
public final class ProjectStandardsIntegration {

    public record Result(ParsedProjectFeatureModel project, FeatureStandardsMappingResult mappings) {
    }

    private ProjectStandardsIntegration() {
    }

    public static Result load(final Path projectFeatures, final Path mappingCatalog,
            final Collection<? extends Resource> standardsResources) {
        return load(projectFeatures, FeatureModelLoadingOptions.defaults(), mappingCatalog, standardsResources);
    }

    public static Result load(final Path projectFeatures, final FeatureModelLoadingOptions options,
            final Path mappingCatalog, final Collection<? extends Resource> standardsResources) {
        final ParsedProjectFeatureModel project = FeatureModelLoader.loadProject(projectFeatures, options);
        final FeatureMappingCatalog catalog = mappingCatalog == null ? null
                : new YamlFeatureMappingCatalogParser().parse(mappingCatalog);
        final FeatureStandardsMappingResult mappings = new ProjectFeatureStandardsMapper().map(project, catalog,
                standardsResources == null ? List.of() : standardsResources);
        return new Result(project, mappings);
    }
}
