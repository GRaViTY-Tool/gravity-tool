package org.gravity.modisco.processing;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

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
	
		SortedMap<Integer, Set<IMoDiscoProcessor>> modiscoProcessorsFwd = new TreeMap<>();
		for (IExtension extension : extensionsPgFwd) {
			try {
				IConfigurationElement[] configurationElements = extension.getConfigurationElements();
				for (IConfigurationElement configurationElement : configurationElements) {
					addProcessor(modiscoProcessorsFwd, configurationElement);
				}
			} catch (InvalidRegistryObjectException | CoreException e) {
				LOGGER.log(Level.ERROR, e.getMessage(), e);
			}
		}
		Collection<IMoDiscoProcessor> values = modiscoProcessorsFwd.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
		return values;
	}

	/**
	 * Adds a new processor instance for the element to the map of processors 
	 * 
	 * @param processors The map of processors
	 * @param element The configuration element describing the processor
	 * @throws CoreException If an instance of the executable extension could not be created for any reason
	 */
	private static void addProcessor(SortedMap<Integer, Set<IMoDiscoProcessor>> processors,
			IConfigurationElement element) throws CoreException {
		IMoDiscoProcessor processor = (IMoDiscoProcessor) element
				.createExecutableExtension("processor");
		int key;
		String priority = element.getAttribute("priority");
		if (priority != null) {
			key = -1*Integer.valueOf(priority);
		} else {
			key = 1;
		}
		Set<IMoDiscoProcessor> values;
		if(processors.containsKey(key)) {
			values = processors.get(key);
		}
		else {
			values = new HashSet<>();
			processors.put(key, values);
		}
		values.add(processor);
	}

}
