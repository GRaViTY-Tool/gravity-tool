package org.gravity.typegraph.spl.yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

import org.gravity.typegraph.spl.standards.MappingRelation;
import org.gravity.typegraph.spl.standards.StandardControlReference;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.IFeatureModelFactory;
import de.ovgu.featureide.fm.core.base.impl.DefaultFeatureModelFactory;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;

/**
 * Parses a concise YAML representation of project features into the FeatureIDE
 * model already used by {@link org.gravity.typegraph.spl.VariabilityAwareProgramModel}.
 *
 * <p>
 * The parser accepts a nested root feature, or a top-level {@code features}
 * list/map. Project-local names can optionally be related to canonical security
 * feature names using {@code securityFeature}; direct control mappings can be
 * declared using {@code standards} or {@code controls}.
 * </p>
 */
public final class YamlFeatureModelParser {

    public ParsedYamlFeatureModel parse(final Path path) {
        Objects.requireNonNull(path, "path");
        final LoaderOptions options = new LoaderOptions();
        options.setAllowDuplicateKeys(false);
        final Yaml yaml = new Yaml(new SafeConstructor(options));
        final Object raw;
        try (InputStream input = Files.newInputStream(path)) {
            raw = yaml.load(input);
        } catch (final IOException e) {
            throw new IllegalArgumentException("Cannot read feature model YAML: " + path, e);
        }
        if (!(raw instanceof Map<?, ?> rootMap)) {
            throw new IllegalArgumentException("The YAML root must be a mapping");
        }
        return parseRoot(rootMap);
    }

    ParsedYamlFeatureModel parseRoot(final Map<?, ?> rootMap) {
        FMCoreLibrary.getInstance().install();
        final IFeatureModelFactory factory = DefaultFeatureModelFactory.getInstance();
        final IFeatureModel model = factory.create();
        final Map<String, FeatureMetadata> metadata = new LinkedHashMap<>();
        final boolean defaultMandatory = booleanValue(rootMap.get("defaultMandatory"), true);

        final Object rootObject = rootMap.get("root");
        final IFeature root;
        if (rootObject != null) {
            root = parseFeature(model, factory, null, rootObject, null, true, defaultMandatory, metadata);
        } else {
            final String projectName = firstString(rootMap, "project", "name");
            final String rootName = projectName == null || projectName.isBlank() ? "Project" : projectName;
            root = createFeature(model, factory, rootName, null, true);
            root.getStructure().setAnd();
            final Object features = rootMap.get("features");
            parseChildren(model, factory, root, features, defaultMandatory, metadata);
        }

        if (model.getStructure().getRoot() == null) {
            model.getStructure().setRoot(root.getStructure());
        }

        final Object topLevelMappings = rootMap.get("mappings");
        if (topLevelMappings instanceof Map<?, ?> mappings) {
            for (final Map.Entry<?, ?> entry : mappings.entrySet()) {
                final String featureName = Objects.toString(entry.getKey(), "").trim();
                if (featureName.isEmpty()) {
                    continue;
                }
                if (model.getFeature(featureName) == null) {
                    throw new IllegalArgumentException("Mapping references unknown feature '" + featureName + "'");
                }
                final FeatureMetadata extra = new FeatureMetadata("", parseControlReferences(entry.getValue()));
                metadata.merge(featureName, extra, FeatureMetadata::merge);
            }
        }
        return new ParsedYamlFeatureModel(model, metadata);
    }

    private IFeature parseFeature(final IFeatureModel model, final IFeatureModelFactory factory, final IFeature parent,
            final Object raw, final String implicitName, final boolean root, final boolean defaultMandatory,
            final Map<String, FeatureMetadata> metadata) {
        if (raw instanceof String value) {
            return createFeature(model, factory, value, parent, root || defaultMandatory);
        }
        if (!(raw instanceof Map<?, ?> map)) {
            if (implicitName != null) {
                return createFeature(model, factory, implicitName, parent, root || defaultMandatory);
            }
            throw new IllegalArgumentException("Feature entries must be strings or mappings: " + raw);
        }

        final String explicitName = firstString(map, "name", "id");
        final String name = explicitName == null || explicitName.isBlank() ? implicitName : explicitName;
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Feature is missing a name");
        }

        boolean mandatory = booleanValue(map.get("mandatory"), defaultMandatory);
        if (booleanValue(map.get("optional"), false)) {
            mandatory = false;
        }
        final IFeature feature = createFeature(model, factory, name, parent, root || mandatory);
        feature.getStructure().setAbstract(booleanValue(map.get("abstract"), false));
        final Object groupValue = map.containsKey("group") ? map.get("group") : "and";
        applyGroup(feature, Objects.toString(groupValue, "and"));

        final String semanticFeature = firstString(map, "securityFeature", "security_feature", "canonicalFeature",
                "canonical");
        final List<StandardControlReference> direct = new ArrayList<>();
        if (map.containsKey("standards")) {
            direct.addAll(parseControlReferences(map.get("standards")));
        }
        if (map.containsKey("controls")) {
            direct.addAll(parseControlReferences(map.get("controls")));
        }
        if ((semanticFeature != null && !semanticFeature.isBlank()) || !direct.isEmpty()) {
            metadata.put(name, new FeatureMetadata(semanticFeature, direct));
        }

        parseChildren(model, factory, feature, map.get("children"), defaultMandatory, metadata);
        if (map.containsKey("features")) {
            parseChildren(model, factory, feature, map.get("features"), defaultMandatory, metadata);
        }
        return feature;
    }

    private void parseChildren(final IFeatureModel model, final IFeatureModelFactory factory, final IFeature parent,
            final Object rawChildren, final boolean defaultMandatory, final Map<String, FeatureMetadata> metadata) {
        if (rawChildren == null) {
            return;
        }
        if (rawChildren instanceof List<?> list) {
            for (final Object child : list) {
                parseFeature(model, factory, parent, child, null, false, defaultMandatory, metadata);
            }
            return;
        }
        if (rawChildren instanceof Map<?, ?> map) {
            for (final Map.Entry<?, ?> entry : map.entrySet()) {
                final String implicitName = Objects.toString(entry.getKey(), "").trim();
                parseFeature(model, factory, parent, entry.getValue(), implicitName, false, defaultMandatory, metadata);
            }
            return;
        }
        throw new IllegalArgumentException("children/features must be a list or mapping");
    }

    private IFeature createFeature(final IFeatureModel model, final IFeatureModelFactory factory, final String rawName,
            final IFeature parent, final boolean mandatory) {
        final String name = rawName.trim();
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Feature names must not be blank");
        }
        if (model.getFeature(name) != null) {
            throw new IllegalArgumentException("Duplicate feature name '" + name + "'");
        }
        final IFeature feature = factory.createFeature(model, name);
        if (!model.addFeature(feature)) {
            throw new IllegalArgumentException("Could not add feature '" + name + "'");
        }
        if (parent == null) {
            model.getStructure().setRoot(feature.getStructure());
            feature.getStructure().setMandatory(true);
        } else {
            parent.getStructure().addChild(feature.getStructure());
            feature.getStructure().setMandatory(parent.getStructure().isAnd() && mandatory);
        }
        return feature;
    }

    private void applyGroup(final IFeature feature, final String rawGroup) {
        final String group = rawGroup.trim().toLowerCase(Locale.ROOT);
        switch (group) {
        case "", "and", "all" -> feature.getStructure().setAnd();
        case "or", "any" -> feature.getStructure().setOr();
        case "alternative", "alt", "xor", "oneof", "one-of" -> feature.getStructure().setAlternative();
        default -> throw new IllegalArgumentException("Unsupported feature group '" + rawGroup + "'");
        }
    }

    static List<StandardControlReference> parseControlReferences(final Object raw) {
        if (raw == null) {
            return List.of();
        }
        final List<?> list = raw instanceof List<?> values ? values : List.of(raw);
        final List<StandardControlReference> references = new ArrayList<>();
        for (final Object value : list) {
            if (value instanceof String text) {
                final int separator = text.lastIndexOf(':');
                if (separator <= 0 || separator == text.length() - 1) {
                    references.add(new StandardControlReference("", text));
                } else {
                    references.add(new StandardControlReference(text.substring(0, separator), text.substring(separator + 1)));
                }
            } else if (value instanceof Map<?, ?> map) {
                final String standard = firstString(map, "standard", "standardId", "standard_id");
                final String control = firstString(map, "control", "controlId", "control_id", "id");
                final MappingRelation relation = MappingRelation.parse(map.get("relation"));
                final String source = firstString(map, "source", "provenance", "evidence");
                final double confidence = doubleValue(map.get("confidence"), 1.0d);
                references.add(new StandardControlReference(standard, control, relation, source, confidence));
            } else {
                throw new IllegalArgumentException("Invalid standard-control reference: " + value);
            }
        }
        return references;
    }

    private static String firstString(final Map<?, ?> map, final String... keys) {
        for (final String key : keys) {
            final Object value = map.get(key);
            if (value != null) {
                final String text = value.toString().trim();
                if (!text.isEmpty()) {
                    return text;
                }
            }
        }
        return null;
    }

    private static boolean booleanValue(final Object value, final boolean defaultValue) {
        if (value == null) {
            return defaultValue;
        }
        if (value instanceof Boolean bool) {
            return bool.booleanValue();
        }
        return Boolean.parseBoolean(value.toString());
    }

    private static double doubleValue(final Object value, final double defaultValue) {
        if (value == null) {
            return defaultValue;
        }
        if (value instanceof Number number) {
            return number.doubleValue();
        }
        return Double.parseDouble(value.toString());
    }
}
