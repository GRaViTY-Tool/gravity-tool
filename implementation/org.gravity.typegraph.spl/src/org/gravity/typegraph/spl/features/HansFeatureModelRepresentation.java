package org.gravity.typegraph.spl.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.gravity.typegraph.spl.features.FeatureModelLoadingOptions.HansNameStrategy;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.IFeatureModelFactory;
import de.ovgu.featureide.fm.core.base.impl.FMFactoryManager;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;

/**
 * Reader for the HAnS indentation-based {@code .feature-model} language.
 *
 * <p>HAnS represents a hierarchy only. When normalized to FeatureIDE, every
 * parent is therefore represented as an AND group and children are mandatory
 * by default. This behavior can be changed with {@link FeatureModelLoadingOptions}.</p>
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

        FMCoreLibrary.getInstance().install();
        final IFeatureModelFactory factory = FMFactoryManager.getFactory();
        final IFeatureModel model = factory.createFeatureModel();
        final Map<String, Integer> simpleNameCounts = new HashMap<>();
        countNames(roots.get(0), simpleNameCounts);
        final Map<String, String> sourceNames = new LinkedHashMap<>();
        addNode(model, factory, null, roots.get(0), new ArrayDeque<>(), simpleNameCounts, sourceNames, true);
        return new ParsedProjectFeatureModel(model, Map.of(), sourceNames, id());
    }

    private IFeature addNode(final IFeatureModel model, final IFeatureModelFactory factory, final IFeature parent,
            final Node node, final Deque<String> path, final Map<String, Integer> nameCounts,
            final Map<String, String> sourceNames, final boolean root) {
        path.addLast(node.name());
        final String modelName = featureIdeName(node.name(), path, nameCounts);
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
            addNode(model, factory, feature, child, path, nameCounts, sourceNames, false);
        }
        path.removeLast();
        return feature;
    }

    private String featureIdeName(final String simpleName, final Deque<String> path, final Map<String, Integer> counts) {
        final HansNameStrategy strategy = options.hansNameStrategy();
        return switch (strategy) {
        case SIMPLE_STRICT -> {
            if (counts.getOrDefault(simpleName, 0) > 1) {
                throw new IllegalArgumentException("HAnS feature name '" + simpleName
                        + "' occurs more than once; choose QUALIFY_ON_COLLISION or ALWAYS_QUALIFIED");
            }
            yield simpleName;
        }
        case QUALIFY_ON_COLLISION -> counts.getOrDefault(simpleName, 0) > 1 ? String.join("::", path) : simpleName;
        case ALWAYS_QUALIFIED -> String.join("::", path);
        };
    }

    private static void countNames(final Node node, final Map<String, Integer> counts) {
        counts.merge(node.name(), 1, Integer::sum);
        node.children().forEach(child -> countNames(child, counts));
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
