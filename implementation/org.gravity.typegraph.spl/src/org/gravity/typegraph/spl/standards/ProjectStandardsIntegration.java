package org.gravity.typegraph.spl.standards;

import java.nio.file.Path;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.gravity.typegraph.spl.yaml.ParsedYamlFeatureModel;
import org.gravity.typegraph.spl.yaml.YamlFeatureMappingCatalogParser;
import org.gravity.typegraph.spl.yaml.YamlFeatureModelParser;

/**
 * Facade for the common workflow: parse a project's YAML feature model and
 * resolve its feature-to-control mappings against already loaded standard
 * resources.
 */
public final class ProjectStandardsIntegration {

    public record Result(ParsedYamlFeatureModel project, FeatureStandardsMappingResult mappings) {
    }

    private ProjectStandardsIntegration() {
    }

    public static Result load(final Path projectYaml, final Path mappingCatalog,
            final Collection<? extends Resource> standardsResources) {
        final ParsedYamlFeatureModel project = new YamlFeatureModelParser().parse(projectYaml);
        final FeatureMappingCatalog catalog = mappingCatalog == null ? null
                : new YamlFeatureMappingCatalogParser().parse(mappingCatalog);
        final FeatureStandardsMappingResult mappings = new ProjectFeatureStandardsMapper().map(project, catalog,
                standardsResources == null ? List.of() : standardsResources);
        return new Result(project, mappings);
    }
}
