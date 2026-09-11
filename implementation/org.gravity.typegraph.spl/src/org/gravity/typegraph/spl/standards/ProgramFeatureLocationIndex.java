package org.gravity.typegraph.spl.standards;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.spl.TPresenceCondition;

/**
 * Indexes feature identifiers occurring in presence conditions and resolves
 * them back to the annotated program-model elements.
 * <p>
 * The index does not know or require the EMSE taxonomy. It works with whatever
 * feature names occur in HAnS/Antenna-derived presence conditions.
 */
public final class ProgramFeatureLocationIndex {

    public record Location(EObject programElement, TPresenceCondition presenceCondition) {
    }

    private static final Pattern FEATURE_REFERENCE = Pattern
            .compile("[A-Za-z0-9_']+(?:::[A-Za-z0-9_']+)*");
    private static final Set<String> RESERVED = Set.of("and", "or", "not", "true", "false", "defined", "ifdef",
            "ifndef");

    private final Map<String, LinkedHashSet<Location>> byName = new LinkedHashMap<>();

    public ProgramFeatureLocationIndex(final TypeGraph programModel) {
        if (programModel == null) {
            throw new IllegalArgumentException("programModel must not be null");
        }
        if (programModel instanceof EObject root) {
            index(root);
            final var iterator = root.eAllContents();
            while (iterator.hasNext()) {
                index(iterator.next());
            }
        }
    }

    public List<Location> locations(final String... names) {
        final LinkedHashSet<Location> result = new LinkedHashSet<>();
        if (names != null) {
            for (final String name : names) {
                if (name == null || name.isBlank()) {
                    continue;
                }
                addMatches(result, name);
                final int separator = name.lastIndexOf("::");
                if (separator >= 0 && separator + 2 < name.length()) {
                    addMatches(result, name.substring(separator + 2));
                }
            }
        }
        return List.copyOf(result);
    }

    private void index(final EObject object) {
        if (!(object instanceof TPresenceCondition presenceCondition)) {
            return;
        }
        final EObject programElement = presenceCondition.getTAnnotated();
        if (programElement == null) {
            return;
        }
        final Matcher matcher = FEATURE_REFERENCE.matcher(presenceCondition.getPc() == null ? "" : presenceCondition.getPc());
        while (matcher.find()) {
            final String reference = matcher.group();
            if (RESERVED.contains(reference.toLowerCase(Locale.ROOT))) {
                continue;
            }
            register(reference, new Location(programElement, presenceCondition));
            final int separator = reference.lastIndexOf("::");
            if (separator >= 0 && separator + 2 < reference.length()) {
                register(reference.substring(separator + 2), new Location(programElement, presenceCondition));
            }
        }
    }

    private void register(final String name, final Location location) {
        byName.computeIfAbsent(normalize(name), ignored -> new LinkedHashSet<>()).add(location);
    }

    private void addMatches(final LinkedHashSet<Location> result, final String name) {
        result.addAll(byName.getOrDefault(normalize(name), new LinkedHashSet<>()));
    }

    private static String normalize(final String value) {
        return FeatureMappingCatalog.normalize(value).replace(" ", "");
    }

    public Map<String, List<Location>> snapshot() {
        final Map<String, List<Location>> result = new LinkedHashMap<>();
        byName.forEach((name, locations) -> result.put(name, new ArrayList<>(locations)));
        return Map.copyOf(result);
    }
}
