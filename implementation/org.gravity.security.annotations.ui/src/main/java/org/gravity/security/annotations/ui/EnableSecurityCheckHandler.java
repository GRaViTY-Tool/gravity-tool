package org.gravity.security.annotations.ui;

import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.menus.UIElement;
import org.gravity.security.annotations.SecurityAnnoationsCheckActivator;

public class EnableSecurityCheckHandler implements IHandler, IElementUpdater {

	@Override
	public void addHandlerListener(final IHandlerListener handlerListener) {
		// Nothing to do
	}

	@Override
	public void dispose() {
		// Nothing to do
	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		SecurityAnnoationsCheckActivator.setChecksEnabled(!SecurityAnnoationsCheckActivator.checksEnabled());
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(final IHandlerListener handlerListener) {
		// Nothing to do
	}

	@Override
	public void updateElement(final UIElement element, final Map parameters) {
		if (SecurityAnnoationsCheckActivator.checksEnabled()) {
			element.setText("Disable Secure Dependency Check");
		} else {
			element.setText("Enable  Secure Dependency Check");
		}
	}

}
