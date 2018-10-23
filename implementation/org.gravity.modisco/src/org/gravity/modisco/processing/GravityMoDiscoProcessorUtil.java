package org.gravity.modisco.processing;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;

/**
 * Functionality to get processors from an extension point
 * 
 * @author speldszus
 *
 */
public class GravityMoDiscoProcessorUtil {

	private static final Logger LOGGER = Logger.getLogger(GravityMoDiscoProcessorUtil.class);

	private GravityMoDiscoProcessorUtil() {
		// As this class only holds static methods we don't want instances
	}
	
	/**
	 * Created a sorted collection of processors regitstered at the given extension point
	 * 
	 * @param extensionPoint The id of the extension point
	 * @return The soreted collection
	 */
	public static Collection<IMoDiscoProcessor> getSortedProcessors(String extensionPoint) {
		IExtensionPoint pointPgFwd = Platform.getExtensionRegistry()
				.getExtensionPoint(extensionPoint);
		IExtension[] extensionsPgFwd = pointPgFwd.getExtensions();
	
		SortedMap<Integer, IMoDiscoProcessor> modiscoProcessorsFwd = new TreeMap<>();
		for (IExtension extension : extensionsPgFwd) {
			try {
				IConfigurationElement[] configurationElements = extension.getConfigurationElements();
				for (IConfigurationElement configurationElement : configurationElements) {
					IMoDiscoProcessor processor = (IMoDiscoProcessor) configurationElement
							.createExecutableExtension("processor");
					String priority = configurationElement.getAttribute("priority");
					if (priority != null) {
						modiscoProcessorsFwd.put(-1*Integer.valueOf(priority), processor);
					} else {
						modiscoProcessorsFwd.put(1, processor);
					}
				}
			} catch (InvalidRegistryObjectException | CoreException e) {
				LOGGER.log(Level.ERROR, e.getMessage(), e);
			}
		}
		Collection<IMoDiscoProcessor> values = modiscoProcessorsFwd.values();
		return values;
	}

}
