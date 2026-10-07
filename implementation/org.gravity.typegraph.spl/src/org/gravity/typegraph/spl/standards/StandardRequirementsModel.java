package org.gravity.typegraph.spl.standards;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Loaded, reusable requirements artifact for a security standard.
 * <p>
 * The requirements model itself is persisted XMI. Information-security
 * properties that are needed for quality-model derivation are loaded from a
 * separate generated sidecar so normal project analysis never has to parse the
 * source standard again.
 */
public class StandardRequirementsModel {

    private final String identifier;
    private final Resource model;
    private final EObject standard;
    private final List<EObject> controls;
    private final Map<EObject, Set<String>> securityPropertiesByControl;

    public StandardRequirementsModel(final String identifier, final Resource model, final EObject standard,
            final List<EObject> controls, final Map<EObject, Set<String>> securityPropertiesByControl) {
        this.identifier = identifier == null ? "" : identifier;
        this.model = model;
        this.standard = standard;
        this.controls = controls == null ? List.of() : List.copyOf(controls);
        final Map<EObject, Set<String>> properties = new LinkedHashMap<>();
        if (securityPropertiesByControl != null) {
            securityPropertiesByControl.forEach((control, values) -> properties.put(control,
                    values == null ? Set.of() : Set.copyOf(values)));
        }
        this.securityPropertiesByControl = Map.copyOf(properties);
    }

    public String identifier() {
        return this.identifier;
    }

    public Resource model() {
        return this.model;
    }

    public EObject standard() {
        return this.standard;
    }

    public List<EObject> controls() {
        return this.controls;
    }

    public Map<EObject, Set<String>> securityPropertiesByControl() {
        return this.securityPropertiesByControl;
    }

    public boolean isIso27002() {
        return normalize(this.identifier).contains("27002");
    }

    private static String normalize(final String value) {
        return value == null ? "" : value.toLowerCase(java.util.Locale.ROOT).replaceAll("[^a-z0-9]+", "");
    }
}
