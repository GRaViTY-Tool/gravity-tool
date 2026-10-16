package org.gravity.pm.multimodule.link;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/** Reversibly substitutes a local library surrogate with a canonical model element. */
public final class ProgramModelLinker {
    private final List<ProgramModelLink> links = new ArrayList<>();

    public void link(String builderId, EObject owner, EReference reference, EObject surrogate, EObject target) {
        Objects.requireNonNull(owner);
        Objects.requireNonNull(reference);
        Objects.requireNonNull(surrogate);
        Objects.requireNonNull(target);
        if (reference.isContainment() || reference.isContainer() || reference.isDerived() || !reference.isChangeable()) {
            throw new IllegalArgumentException("Containment references cannot be linked across program models");
        }
        if (!reference.getEReferenceType().isInstance(target)) {
            throw new IllegalArgumentException("Target does not conform to reference type");
        }
        Object value = owner.eGet(reference);
        if (reference.isMany()) {
            @SuppressWarnings("unchecked")
            List<EObject> values = (List<EObject>) value;
            int index = values.indexOf(surrogate);
            if (index < 0) throw new IllegalArgumentException("Surrogate not referenced");
            if (values.indexOf(surrogate, index + 1) >= 0) throw new IllegalArgumentException("Ambiguous repeated surrogate reference");
            values.set(index, target);
            links.add(new ProgramModelLink(builderId, owner, reference, index, surrogate, target));
        } else {
            if (value != surrogate) throw new IllegalArgumentException("Surrogate not referenced");
            owner.eSet(reference, target);
            links.add(new ProgramModelLink(builderId, owner, reference, -1, surrogate, target));
        }
    }

    public List<ProgramModelLink> links() { return List.copyOf(links); }

    /** Restore only unchanged linker substitutions; never overwrite user edits. */
    public void unlink() {
        for (int i = links.size() - 1; i >= 0; i--) {
            ProgramModelLink link = links.get(i);
            if (link.reference().isMany()) {
                @SuppressWarnings("unchecked")
                List<EObject> values = (List<EObject>) link.owner().eGet(link.reference());
                if (link.index() < values.size() && values.get(link.index()) == link.target()) {
                    values.set(link.index(), link.surrogate());
                } else if (values.contains(link.target())) {
                    throw new IllegalStateException("Reference order changed after linking; cannot safely restore");
                }
            } else if (link.owner().eGet(link.reference()) == link.target()) {
                link.owner().eSet(link.reference(), link.surrogate());
            }
        }
        links.clear();
    }
}
