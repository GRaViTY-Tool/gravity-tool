package org.gravity.modisco.processing;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;

public class GravityMoDiscoProcessorUtil {

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
				e.printStackTrace();
			}
		}
		Collection<IMoDiscoProcessor> values = modiscoProcessorsFwd.values();
		return values;
	}

}
