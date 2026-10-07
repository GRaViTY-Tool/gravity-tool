package org.gravity.typegraph.spl.standards;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Curated mapping from canonical implementation-level security features (plus
 * aliases) to references in one or more standards.
 */
public final class FeatureMappingCatalog {

    public record Entry(String canonicalFeature, Set<String> aliases, List<StandardControlReference> controls) {
        public Entry {
            canonicalFeature = canonicalFeature == null ? "" : canonicalFeature.trim();
            aliases = aliases == null ? Set.of() : Set.copyOf(aliases);
            controls = controls == null ? List.of() : List.copyOf(controls);
            if (canonicalFeature.isBlank()) {
                throw new IllegalArgumentException("canonicalFeature must not be blank");
            }
        }
    }

    private final Map<String, Entry> byName = new LinkedHashMap<>();
    private final List<Entry> entries = new ArrayList<>();

    public FeatureMappingCatalog(final Iterable<Entry> entries) {
        if (entries != null) {
            for (final Entry entry : entries) {
                add(entry);
            }
        }
    }

    private void add(final Entry entry) {
        entries.add(entry);
        register(entry.canonicalFeature(), entry);
        for (final String alias : entry.aliases()) {
            register(alias, entry);
        }
    }

    private void register(final String name, final Entry entry) {
        final String normalized = normalize(name);
        if (normalized.isEmpty()) {
            return;
        }
        final Entry previous = byName.putIfAbsent(normalized, entry);
        if ((previous != null) && (previous != entry)) {
            throw new IllegalArgumentException("Duplicate mapping-catalog alias '" + name + "'");
        }
    }

    public Optional<Entry> resolve(final String projectFeature, final String semanticFeature) {
        final String preferred = semanticFeature == null || semanticFeature.isBlank() ? projectFeature : semanticFeature;
        final Entry preferredEntry = byName.get(normalize(preferred));
        if (preferredEntry != null) {
            return Optional.of(preferredEntry);
        }
        if (semanticFeature != null && !semanticFeature.isBlank()) {
            return Optional.ofNullable(byName.get(normalize(projectFeature)));
        }
        return Optional.empty();
    }

    /**
     * Returns an equivalent feature catalog with only control references accepted by
     * the supplied predicate. Canonical features and aliases are retained even when
     * no control reference remains. This is useful for keeping taxonomy conformance
     * independent of a standard-specific mapping workflow.
     */
    public FeatureMappingCatalog filterControls(final Predicate<StandardControlReference> predicate) {
        if (predicate == null) {
            return this;
        }
        final List<Entry> filtered = entries.stream()
                .map(entry -> new Entry(entry.canonicalFeature(), entry.aliases(),
                        entry.controls().stream().filter(predicate).toList()))
                .toList();
        return new FeatureMappingCatalog(filtered);
    }

    public List<Entry> entries() {
        return List.copyOf(entries);
    }

    static String normalize(final String value) {
        if (value == null) {
            return "";
        }
        return value.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", " ").trim().replaceAll("\\s+", " ");
    }

    public static Entry entry(final String canonicalFeature, final Iterable<String> aliases,
            final List<StandardControlReference> controls) {
        final Set<String> copiedAliases = new LinkedHashSet<>();
        if (aliases != null) {
            aliases.forEach(copiedAliases::add);
        }
        return new Entry(canonicalFeature, copiedAliases, controls);
    }
}
