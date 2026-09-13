package org.gravity.typegraph.spl.standards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Indexes TraceSec {@code Requirement} EObjects that represent standard
 * controls. The index intentionally has no compile-time dependency on generated
 * TraceSec classes.
 */
public final class StandardControlIndex {

    private record Key(String standard, String control) {
    }

    private final Map<Key, List<EObject>> byStandardAndControl = new LinkedHashMap<>();
    private final Map<String, List<EObject>> byControl = new HashMap<>();
    private final Set<EObject> indexedControls = new LinkedHashSet<>();

    public StandardControlIndex(final Collection<? extends Resource> resources) {
        if (resources != null) {
            resources.forEach(this::index);
        }
    }

    /**
     * Resolves a textual control reference. A standard-qualified lookup must be
     * unique. If no standard is supplied (or the supplied standard has no match),
     * the control identifier is accepted only when unique across all indexed
     * standards.
     */
    public Optional<EObject> resolve(final StandardControlReference reference) {
        final String control = normalizeControl(reference.control());
        if (!reference.standard().isBlank()) {
            final List<EObject> exact = byStandardAndControl
                    .getOrDefault(new Key(normalizeStandard(reference.standard()), control), List.of());
            if (exact.size() == 1) {
                return Optional.of(exact.get(0));
            }
            if (exact.size() > 1) {
                return Optional.empty();
            }
        }
        final List<EObject> candidates = byControl.getOrDefault(control, List.of());
        return candidates.size() == 1 ? Optional.of(candidates.get(0)) : Optional.empty();
    }

    public int size() {
        return indexedControls.size();
    }

    private void index(final Resource resource) {
        if (resource == null) {
            return;
        }
        for (final EObject root : resource.getContents()) {
            indexObject(root);
        }
        final TreeIterator<EObject> iterator = resource.getAllContents();
        while (iterator.hasNext()) {
            indexObject(iterator.next());
        }
    }

    private void indexObject(final EObject object) {
        if ((object == null) || !"Requirement".equals(object.eClass().getName()) || !indexedControls.add(object)) {
            return;
        }
        final String control = firstAttribute(object, "id", "identifier", "controlId", "number");
        if ((control == null) || control.isBlank()) {
            indexedControls.remove(object);
            return;
        }
        final String normalizedControl = normalizeControl(control);
        byControl.computeIfAbsent(normalizedControl, ignored -> new ArrayList<>()).add(object);

        final Set<String> aliases = findStandardAliases(object);
        if (aliases.isEmpty()) {
            aliases.add("");
        }
        for (final String alias : aliases) {
            final Key key = new Key(normalizeStandard(alias), normalizedControl);
            byStandardAndControl.computeIfAbsent(key, ignored -> new ArrayList<>()).add(object);
        }
    }

    /** Returns aliases from the outermost enclosing RequirementsSet. */
    private Set<String> findStandardAliases(final EObject control) {
        EObject current = control.eContainer();
        EObject standard = null;
        while (current != null) {
            if ("RequirementsSet".equals(current.eClass().getName())) {
                standard = current;
            }
            current = current.eContainer();
        }
        final Set<String> aliases = new LinkedHashSet<>();
        if (standard != null) {
            addAttribute(aliases, standard, "id");
            addAttribute(aliases, standard, "title");
        }
        return aliases;
    }

    private void addAttribute(final Set<String> values, final EObject object, final String name) {
        final String value = attribute(object, name);
        if ((value != null) && !value.isBlank()) {
            values.add(value);
        }
    }

    private String firstAttribute(final EObject object, final String... names) {
        for (final String name : names) {
            final String value = attribute(object, name);
            if ((value != null) && !value.isBlank()) {
                return value;
            }
        }
        return null;
    }

    private String attribute(final EObject object, final String name) {
        final EStructuralFeature feature = object.eClass().getEStructuralFeature(name);
        if ((feature == null) || feature.isMany()) {
            return null;
        }
        final Object value = object.eGet(feature, false);
        return value == null ? null : value.toString().trim();
    }

    private static String normalizeControl(final String value) {
        if (value == null) {
            return "";
        }
        String normalized = value.trim().toUpperCase(Locale.ROOT).replaceAll("\\s+", "");
        if (normalized.matches("A\\.[5-8]\\.\\d+")) {
            normalized = normalized.substring(2);
        }
        return normalized;
    }

    private static String normalizeStandard(final String value) {
        if (value == null) {
            return "";
        }
        String normalized = value.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", "");
        normalized = normalized.replace("isoiec", "iso");
        normalized = normalized.replace("2022", "");
        return normalized;
    }
}
