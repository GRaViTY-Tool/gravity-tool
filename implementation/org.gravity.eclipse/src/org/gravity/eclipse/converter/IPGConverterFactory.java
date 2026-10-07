package org.gravity.eclipse.converter;

import org.eclipse.core.resources.IProject;

/**
 * A factory for creating IPGConverter instances.
 *
 * Implementations can be registered at the extension point
 * "org.gravity.eclipse.converters" for usage in the GRaViTY plugin.
 */
public interface IPGConverterFactory {

	/**
	 * Returns whether the project is supported by the converter factory
	 *
	 * @param project the project
	 * @return true, if a converter can be grated for this project
	 */
	boolean supported(IProject project);

	/**
	 * Creates a new IPGConverter instance for an eclipse project.
	 *
	 * @param project the project
	 * @return the IPG converter
	 */
	IPGConverter createConverter(IProject project);

	/**
	 * Checks whether the given converter can be created by this factory
	 *
	 * @param converter the converter
	 * @return true, if the converter can be created by this factory
	 */
	boolean belongsToFactory(IPGConverter converter);

	/**
	 * Returns a name for usage in the UI
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Returns a description for an tool tip of the converters this factory will
	 * create
	 *
	 * @return the description
	 */
	String getDescription();

	boolean supportsFWDTrafo();

	boolean supportsBWDTrafo();

	boolean supportsFWDSync();

	boolean supportsBWDSync();

}
