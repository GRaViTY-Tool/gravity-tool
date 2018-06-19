package org.gravity.tgg.modisco.processing.pg;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;

public class ProgramGraphProcesorUtil {

	public static Collection<IProgramGraphProcessor> getSortedProcessors(String extensionPoint) {
		IExtensionPoint pointPgFwd = Platform.getExtensionRegistry()
				.getExtensionPoint(extensionPoint);
		IExtension[] extensionsPgFwd = pointPgFwd.getExtensions();
	
		SortedMap<Integer, IProgramGraphProcessor> pgProcessorsFwd = new TreeMap<>();
		for (IExtension extension : extensionsPgFwd) {
			try {
				IConfigurationElement[] configurationElements = extension.getConfigurationElements();
				for (IConfigurationElement configurationElement : configurationElements) {
					IProgramGraphProcessor processor = (IProgramGraphProcessor) configurationElement
							.createExecutableExtension("processor");
					String priority = configurationElement.getAttribute("priority");
					if (priority != null) {
						pgProcessorsFwd.put(-1*Integer.valueOf(priority), processor);
					} else {
						pgProcessorsFwd.put(1, processor);
					}
				}
			} catch (InvalidRegistryObjectException | CoreException e) {
				e.printStackTrace();
			}
		}
		Collection<IProgramGraphProcessor> values = pgProcessorsFwd.values();
		return values;
	}

}
