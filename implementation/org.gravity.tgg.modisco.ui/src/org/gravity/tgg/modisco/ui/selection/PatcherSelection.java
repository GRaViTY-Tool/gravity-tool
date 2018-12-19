package org.gravity.tgg.modisco.ui.selection;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
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
import org.gravity.modisco.GravityMoDiscoModelPatcher;
import org.gravity.tgg.modisco.MoDiscoTGGActivator;

/**
 * This class provides the functionality for listing all modisco model patcher
 * and selecting the active one
 * 
 * @author speldszus
 *
 */
public class PatcherSelection extends ContributionItem {

	private static final Logger LOGGER = Logger.getLogger(PatcherSelection.class);

	@Override
	public void fill(Menu menu, int index) {
		MoDiscoTGGActivator modiscoUI = MoDiscoTGGActivator.getDefault();
		GravityMoDiscoModelPatcher selectedPatcher = modiscoUI.getSelectedPatcher();

		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();

		IConfigurationElement[] configurationElements = extensionRegistry
				.getConfigurationElementsFor("org.gravity.modisco.patcher"); //$NON-NLS-1$

		for (IConfigurationElement element : configurationElements) {
			try {
				GravityMoDiscoModelPatcher patcher = (GravityMoDiscoModelPatcher) element
						.createExecutableExtension("class"); //$NON-NLS-1$

				MenuItem item = new MenuItem(menu, SWT.RADIO, index);
				item.setText(patcher.getName());
				item.setToolTipText(patcher.getDescription());
				if (selectedPatcher.getClass().equals(patcher.getClass())) {
					item.setSelection(true);
				}
				item.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						item.setSelection(true);
						MoDiscoTGGActivator.getDefault().setSelectedPatcher(patcher);
					}
				});
			} catch (CoreException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
		}
	}
}
