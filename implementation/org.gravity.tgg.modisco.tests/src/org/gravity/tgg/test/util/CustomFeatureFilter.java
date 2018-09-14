package org.gravity.tgg.test.util;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;

public class CustomFeatureFilter extends FeatureFilter {

	private final Set<String> ignoredAttributesByName = new HashSet<>();
	private final boolean checkForOrdering;

	public CustomFeatureFilter(final boolean checkForOrdering) {
		this.checkForOrdering = checkForOrdering;
	}

	public CustomFeatureFilter addIgnoredAttribute(final String name) {
		if (name != null) {
			this.ignoredAttributesByName.add(name	.toLowerCase()
													.trim());
		}
		return this;
	}

	protected boolean checkAttributeName(final String name) {
		if (name == null) {
			return false;
		}

		return this.ignoredAttributesByName.contains(name	.toLowerCase()
															.trim());
	}

	@Override
	protected boolean isIgnoredAttribute(final EAttribute attribute) {
		final boolean ignore = super.isIgnoredAttribute(attribute) || this.checkAttributeName(attribute.getName());
		return ignore;
	}

	@Override
	public boolean checkForOrderingChanges(final EStructuralFeature feature) {
		return this.checkForOrdering;
	}
}