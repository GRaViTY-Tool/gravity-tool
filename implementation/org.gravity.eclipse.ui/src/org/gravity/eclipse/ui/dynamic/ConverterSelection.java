package org.gravity.eclipse.ui.dynamic;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverterFactory;

public class ConverterSelection extends ContributionItem {

	@Override
	public void fill(Menu menu, int index) {
		IExtensionRegistry extension_registry = Platform.getExtensionRegistry();

		IConfigurationElement[] configuration_elements = extension_registry
				.getConfigurationElementsFor("org.gravity.eclipse.converters"); //$NON-NLS-1$

		IPGConverterFactory selected_converter = GravityActivator.getDefault().getSelectedConverterFactory();

		for (IConfigurationElement element : configuration_elements) {
			try {
				IPGConverterFactory converter = (IPGConverterFactory) element.createExecutableExtension("class"); //$NON-NLS-1$

				MenuItem item = new MenuItem(menu, SWT.RADIO, index);
				item.setText(converter.getName());
				item.setToolTipText(converter.getDescription());
				if (selected_converter.getClass().equals(converter.getClass())) {
					item.setSelection(true);
				}
				item.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						item.setSelection(true);
						GravityActivator.getDefault().setSelectedConverterFactory(converter);
					}
				});
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
}
