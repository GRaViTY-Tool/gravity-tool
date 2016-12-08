package org.gravity.tgg.modisco.ui.selection;


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

public class PatcherSelection extends ContributionItem {

	@Override
	public void fill(Menu menu, int index) {
		MoDiscoTGGActivator modiscoUI = MoDiscoTGGActivator.getDefault();
		GravityMoDiscoModelPatcher selected_patcher = modiscoUI.getSelectedPatcher();
		
		IExtensionRegistry extension_registry = Platform.getExtensionRegistry();

		IConfigurationElement[] configuration_elements = extension_registry
				.getConfigurationElementsFor("org.gravity.modisco.patcher"); //$NON-NLS-1$

		for (IConfigurationElement element : configuration_elements) {
			try {
				GravityMoDiscoModelPatcher patcher = (GravityMoDiscoModelPatcher) element.createExecutableExtension("class"); //$NON-NLS-1$
				
				MenuItem item = new MenuItem(menu, SWT.RADIO, index);
				item.setText(patcher.getName());
				item.setToolTipText(patcher.getDescription());
				if (selected_patcher.getClass().equals(patcher.getClass())) {
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
				e.printStackTrace();
			}
		}
	}
}
