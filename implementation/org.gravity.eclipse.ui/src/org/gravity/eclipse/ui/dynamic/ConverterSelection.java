package org.gravity.eclipse.ui.dynamic;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverterFactory;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.ui.GravityUiActivator;

/**
 * This class fills an menu with all available modisco to pm converters and
 * allows the selection of the active converter
 * 
 * @author speldszus
 *
 */
public class ConverterSelection extends ContributionItem {

	private static final Logger LOGGER = Logger.getLogger(ConverterSelection.class);

	@Override
	public void fill(Menu menu, int index) {
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();

		IConfigurationElement[] configurationElements = extensionRegistry
				.getConfigurationElementsFor("org.gravity.eclipse.converters"); //$NON-NLS-1$

		IPGConverterFactory selectedConverter;
		try {
			selectedConverter = GravityActivator.getDefault().getSelectedConverterFactory();
		} catch (NoConverterRegisteredException e1) {
			MessageDialog.openError(GravityUiActivator.getShell(), "No Converter installed",
					"Please install a converter from the GRaViTY updatesite.");
			return;
		} catch (CoreException e) {
			MessageDialog.openError(GravityUiActivator.getShell(), "Critical ERROR",
					"The converter extensionpoint cannot be accessed, pleade contact the GRaViTY developers.");
			return;
		}

		for (IConfigurationElement element : configurationElements) {
			try {
				IPGConverterFactory converter = (IPGConverterFactory) element.createExecutableExtension("class"); //$NON-NLS-1$

				MenuItem item = new MenuItem(menu, SWT.RADIO, index);
				item.setText(converter.getName());
				item.setToolTipText(converter.getDescription());
				if (selectedConverter.getClass().equals(converter.getClass())) {
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
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
		}
	}
}
