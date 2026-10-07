package org.gravity.eclipse.ui.handler;

import java.util.function.Predicate;

import org.eclipse.core.commands.AbstractHandler;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverterFactory;

/**
 * This abstract handler provides basic functionality for transformations using
 * converters registered at "org.gravity.eclipse.converters"
 *
 * @author speldszus
 *
 */
public abstract class AbstractTransformationHandler extends AbstractHandler {

	protected boolean isEnabled(final Predicate<IPGConverterFactory> constraint) {
		final var activator = GravityActivator.getDefault();
		for (final var project : UISelectionHelper.getSelectedProjects()) {
			final var selection = activator.getSelectedConverterFactory(project);
			if (selection == null) {
				final var factory = activator.getSuitableConverterFactory(project, constraint);
				if (factory != null) {
					activator.setSelectedConverterFactory(project, factory);
				}
			} else if (!selection.supportsFWDTrafo()) {
				return false;
			}
		}
		return true;
	}
}
