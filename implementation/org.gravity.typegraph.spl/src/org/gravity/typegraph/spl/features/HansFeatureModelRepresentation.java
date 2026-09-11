package org.gravity.typegraph.spl.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.gravity.typegraph.spl.features.FeatureModelLoadingOptions.HansNameStrategy;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.IFeatureModelFactory;
import de.ovgu.featureide.fm.core.base.impl.DefaultFeatureModelFactory;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;

/**
 * Reader for the HAnS indentation-based {@code .feature-model} language.
 *
 * <p>HAnS represents a hierarchy only. When normalized to FeatureIDE, every
 * parent is therefore represented as an AND group and children are mandatory
 * by default. This behavior can be changed with {@link FeatureModelLoadingOptions}.</p>
 *
 * <p>For colliding simple feature names, the default naming strategy uses the
 * shortest unique HAnS location/path-qualified name (LPQ). This mirrors HAnS
 * annotations such as {@code Authentication::Logging} instead of forcing a
 * complete root-qualified path.</p>
 */
public final class HansFeatureModelRepresentation implements FeatureModelRepresentation {

    private final FeatureModelLoadingOptions options;

    public HansFeatureModelRepresentation(final FeatureModelLoadingOptions options) {
        this.options = options == null ? FeatureModelLoadingOptions.defaults() : options;
    }

    @Override
    public String id() {
        return "hans";
    }

    @Override
    public boolean supports(final Path path) {
        return path != null && path.getFileName().toString().toLowerCase(Locale.ROOT).endsWith(".feature-model");
    }

    @Override
    public ParsedProjectFeatureModel parse(final Path path) {
        final List<String> lines;
        try {
            lines = Files.readAllLines(path);
        } catch (final IOException e) {
            throw new IllegalArgumentException("Cannot read HAnS feature model: " + path, e);
        }
        final List<Node> roots = parseTree(lines);
        if (roots.size() != 1) {
            throw new IllegalArgumentException("HAnS feature model must contain exactly one root feature, found " + roots.size());
        }

        final List<List<String>> paths = new ArrayList<>();
        collectPaths(roots.get(0), new ArrayDeque<>(), paths);
        final Map<String, Integer> simpleNameCounts = new HashMap<>();
        paths.forEach(featurePath -> simpleNameCounts.merge(featurePath.get(featurePath.size() - 1), 1, Integer::sum));
        final Map<String, String> normalizedNames = normalizedNames(paths, simpleNameCounts);

        FMCoreLibrary.getInstance().install();
        final IFeatureModelFactory factory = DefaultFeatureModelFactory.getInstance();
        final IFeatureModel model = factory.create();
        final Map<String, String> sourceNames = new LinkedHashMap<>();
        addNode(model, factory, null, roots.get(0), new ArrayDeque<>(), normalizedNames, sourceNames, true);
        return new ParsedProjectFeatureModel(model, Map.of(), sourceNames, id());
    }

    private IFeature addNode(final IFeatureModel model, final IFeatureModelFactory factory, final IFeature parent,
            final Node node, final Deque<String> path, final Map<String, String> normalizedNames,
            final Map<String, String> sourceNames, final boolean root) {
        path.addLast(node.name());
        final String fullPath = String.join("::", path);
        final String modelName = normalizedNames.get(fullPath);
        if (modelName == null) {
            throw new IllegalStateException("No normalized HAnS name for '" + fullPath + "'");
        }
        if (model.getFeature(modelName) != null) {
            throw new IllegalArgumentException("Duplicate normalized feature name '" + modelName + "'");
        }
        final IFeature feature = factory.createFeature(model, modelName);
        model.addFeature(feature);
        sourceNames.put(modelName, node.name());
        feature.getStructure().setAnd();
        if (root) {
            model.getStructure().setRoot(feature.getStructure());
            feature.getStructure().setMandatory(true);
        } else {
            parent.getStructure().addChild(feature.getStructure());
            feature.getStructure().setMandatory(parent.getStructure().isAnd() && options.hansMandatory());
        }
        for (final Node child : node.children()) {
            addNode(model, factory, feature, child, path, normalizedNames, sourceNames, false);
        }
        path.removeLast();
        return feature;
    }

    private Map<String, String> normalizedNames(final List<List<String>> paths,
            final Map<String, Integer> simpleNameCounts) {
        final Map<String, String> result = new LinkedHashMap<>();
        final Set<String> used = new HashSet<>();
        for (final List<String> path : paths) {
            final String fullPath = String.join("::", path);
            final String simpleName = path.get(path.size() - 1);
            final HansNameStrategy strategy = options.hansNameStrategy();
            final String modelName = switch (strategy) {
            case SIMPLE_STRICT -> {
                if (simpleNameCounts.getOrDefault(simpleName, 0) > 1) {
                    throw new IllegalArgumentException("HAnS feature name '" + simpleName
                            + "' occurs more than once; choose QUALIFY_ON_COLLISION or ALWAYS_QUALIFIED");
                }
                yield simpleName;
            }
            case QUALIFY_ON_COLLISION -> simpleNameCounts.getOrDefault(simpleName, 0) > 1
                    ? shortestUniqueLpq(path, paths) : simpleName;
            case ALWAYS_QUALIFIED -> fullPath;
            };
            if (!used.add(modelName)) {
                throw new IllegalArgumentException("HAnS hierarchy does not provide a unique LPQ for '" + fullPath + "'");
            }
            result.put(fullPath, modelName);
        }
        return result;
    }

    private static String shortestUniqueLpq(final List<String> target, final List<List<String>> paths) {
        for (int length = 2; length <= target.size(); length++) {
            int matches = 0;
            for (final List<String> candidate : paths) {
                if (hasSameSuffix(target, candidate, length)) {
                    matches++;
                }
            }
            if (matches == 1) {
                return String.join("::", target.subList(target.size() - length, target.size()));
            }
        }
        return String.join("::", target);
    }

    private static boolean hasSameSuffix(final List<String> left, final List<String> right, final int length) {
        if (left.size() < length || right.size() < length) {
            return false;
        }
        for (int offset = 1; offset <= length; offset++) {
            if (!left.get(left.size() - offset).equals(right.get(right.size() - offset))) {
                return false;
            }
        }
        return true;
    }

    private static void collectPaths(final Node node, final Deque<String> current, final List<List<String>> paths) {
        current.addLast(node.name());
        paths.add(List.copyOf(current));
        node.children().forEach(child -> collectPaths(child, current, paths));
        current.removeLast();
    }

    static List<Node> parseTree(final List<String> lines) {
        final List<Node> roots = new ArrayList<>();
        final Deque<IndentedNode> stack = new ArrayDeque<>();
        for (int lineNumber = 0; lineNumber < lines.size(); lineNumber++) {
            final String raw = lines.get(lineNumber);
            if (raw.isBlank()) {
                continue;
            }
            final int indent = indentation(raw);
            final String name = raw.stripLeading().trim();
            if (name.isBlank()) {
                continue;
            }
            if (!name.matches("[A-Za-z0-9_']+(?:\\\\ [A-Za-z0-9_']+)*")) {
                throw new IllegalArgumentException("Invalid HAnS feature name at line " + (lineNumber + 1) + ": " + name);
            }
            final Node node = new Node(name.replace("\\\\ ", " "), new ArrayList<>());
            while (!stack.isEmpty() && indent <= stack.peekLast().indent()) {
                stack.removeLast();
            }
            if (stack.isEmpty()) {
                if (indent != 0) {
                    throw new IllegalArgumentException("Root HAnS feature must start at indentation 0 (line "
                            + (lineNumber + 1) + ")");
                }
                roots.add(node);
            } else {
                stack.peekLast().node().children().add(node);
            }
            stack.addLast(new IndentedNode(indent, node));
        }
        return roots;
    }

    private static int indentation(final String line) {
        int column = 0;
        for (int i = 0; i < line.length(); i++) {
            final char ch = line.charAt(i);
            if (ch == ' ') {
                column++;
            } else if (ch == '\t') {
                column = (column + 4) & ~3;
            } else {
                break;
            }
        }
        return column;
    }

    record Node(String name, List<Node> children) {
    }

    private record IndentedNode(int indent, Node node) {
    }
}
