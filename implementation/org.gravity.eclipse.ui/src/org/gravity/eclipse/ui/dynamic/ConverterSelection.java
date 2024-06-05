package org.gravity.eclipse.ui.dynamic;

import java.util.Objects;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverterFactory;
import org.gravity.eclipse.ui.handler.SelectionHelper;

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
	public void fill(final Menu menu, final int index) {

		final var projects = SelectionHelper.getSelectedProjects();
		final var extensionRegistry = Platform.getExtensionRegistry();

		final var configurationElements = extensionRegistry
				.getConfigurationElementsFor(GravityActivator.GRAVITY_CONVERTER_EXTENSION_POINT_ID);

		final var selectedConverters = projects.stream()
				.map(project -> GravityActivator.getDefault().getSelectedConverterFactory(project))
				.filter(Objects::nonNull).map(Object::getClass).toList();

		for (final IConfigurationElement element : configurationElements) {
			try {
				final var converter = (IPGConverterFactory) element.createExecutableExtension("class"); //$NON-NLS-1$
				if (projects.stream().allMatch(converter::supported)) {
					final var item = new MenuItem(menu, SWT.RADIO, index);
					if (selectedConverters.stream().anyMatch(selected -> selected.equals(converter.getClass()))) {
						item.setText("> " + converter.getName());
					} else {
						item.setText(converter.getName());
					}
					item.setToolTipText(converter.getDescription());
					item.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(final SelectionEvent e) {
							item.setSelection(true);
							for (final var project : projects) {
								GravityActivator.getDefault().setSelectedConverterFactory(project, converter);
							}
						}
					});
				}
			} catch (final CoreException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
		}
	}
}
