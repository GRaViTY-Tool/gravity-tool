package org.gravity.pm.multimodule.link;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * Reversible replacement of a builder-local surrogate reference by a canonical
 * target in another program-model resource.
 */
public record ProgramModelLink(String builderId, EObject owner, EReference reference, int index,
        EObject surrogate, EObject target) {}
