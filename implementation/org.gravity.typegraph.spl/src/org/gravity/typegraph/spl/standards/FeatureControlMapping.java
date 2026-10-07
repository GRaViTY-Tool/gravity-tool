package org.gravity.typegraph.spl.standards;

import org.eclipse.emf.ecore.EObject;

import de.ovgu.featureide.fm.core.base.IFeature;

/** Resolved mapping from a concrete FeatureIDE feature to a standards EObject. */
public record FeatureControlMapping(IFeature feature, EObject control, StandardControlReference reference,
        String canonicalFeature) {
}
